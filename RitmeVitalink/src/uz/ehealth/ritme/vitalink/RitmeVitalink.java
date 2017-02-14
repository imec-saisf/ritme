package uz.ehealth.ritme.vitalink;

import be.ehealth.technicalconnector.exception.TechnicalConnectorException;
import be.ehealth.technicalconnector.session.SessionItem;
import be.ehealth.technicalconnector.session.SessionManager;
import be.smals.safe.connector.IVitalinkServiceConcurrency;
import be.smals.safe.connector.VitalinkServiceConcurrency;
import uz.ehealth.ritme.outbound.hospital.SessionService;
import uz.ehealth.ritme.plugins.PluginManager;

public class RitmeVitalink {
    //private VitalinkServiceConcurrency vitalink = new VitalinkServiceConcurrency();
    //static because this is a cache


    /**
     * <p>
     * Initializes the Session Management component with a valid eHealth STS Token
     * </p>
     * <p>
     * This example uses a standard Doctor profile (with EID) for demonstration purposes.
     * </p>
     *
     * @throws TechnicalConnectorException
     */
    public SessionItem initializeSessionManagementForOrganisation(String nihiiOrg) throws TechnicalConnectorException {


        SessionManager sessionManager = PluginManager.get("ritme.outbound.hospital.sessionmanager", SessionService.class).getSessionManager(nihiiOrg);


        if (!sessionManager.hasValidSession()) {
            /*******************************
             * Request eHealth STS Token
             * In case only eID is available use the "createSessionEidOnly()" method
             *******************************/

            //Session.getInstance().createSessionEidOnly();
            return sessionManager.createFallbackSession(null);
        } else {
            return sessionManager.getSession();
        }
    }


    public IVitalinkServiceConcurrency getVitalink() {
        return new VitalinkServiceConcurrency();
    }

}
