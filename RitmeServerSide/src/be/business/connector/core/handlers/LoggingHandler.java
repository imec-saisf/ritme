/**
 * Copyright (C) 2010 Recip-e
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package be.business.connector.core.handlers;

import be.business.connector.core.utils.MessageDumper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.ByteArrayOutputStream;
import java.util.Set;

/**
 * The Class LoggingHandler.
 */
public class LoggingHandler  implements SOAPHandler<SOAPMessageContext> {

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(LoggingHandler.class);

	/** {@inheritDoc} */
	@Override
	public Set<QName> getHeaders() {
		return null;
	}

	/** {@inheritDoc} */
	@Override
	public void close(MessageContext arg0) {
	}

	/** {@inheritDoc} */
	@Override
	public boolean handleFault(SOAPMessageContext c) {
		handleMessage(c);
		return true;
	}

	/** {@inheritDoc} */
	@Override
	public boolean handleMessage(SOAPMessageContext c) {
	
		SOAPMessage msg = c.getMessage();
		try {

			ByteArrayOutputStream out = new ByteArrayOutputStream();			
			msg.writeTo(out);			
			LOG.debug(out.size() + " bytes - " + out.toString());


			if( MessageDumper.getInstance().isDumpEnabled() ){
				final Boolean outboundProperty = (Boolean) c.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
				if (outboundProperty) {
					MessageDumper.getInstance().dump(out, MessageDumper.getOperationName(c), MessageDumper.OUT);
				} else {
					MessageDumper.getInstance().dump(out, MessageDumper.getOperationName(c), MessageDumper.IN);
				}
			}
			out.close();
		} catch (Throwable t) {
			LOG.warn("SOAPException when logging the message: ",t);
		}
		return true;
	}

}
