package uz.ehealth.ritme.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * Created by bdcuyp0 on 14-11-2016.
 */
public class MedicatieSchema {
    private Integer nodeVersion;

    public Date getLastUpdated() {
        return lastUpdated;
    }

    private final Date lastUpdated;

    public int getVersion() {
        return version;
    }

    private final int version;

    public List<MedicatieSchemaItem> getItems() {
        return items;
    }

    public Integer getNodeVersion() {
        return nodeVersion;
    }

    private final List<MedicatieSchemaItem> items;

    public MedicatieSchema(@JsonProperty("version") int version, @JsonProperty("nodeVersion") Integer nodeVersion, @JsonProperty("lastUpdated") Date lastUpdated, @JsonProperty("items") List<MedicatieSchemaItem> items) {
        this.items = items;
        this.lastUpdated = lastUpdated;
        this.version = version;
        this.nodeVersion = nodeVersion;
    }
}
