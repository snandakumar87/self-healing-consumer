
package datamodels.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sngroup",
    "snseverity",
    "sensu.io/managed_by"
})
public class Labels {

    @JsonProperty("sngroup")
    private String sngroup;
    @JsonProperty("snseverity")
    private String snseverity;
    @JsonProperty("sensu.io/managed_by")
    private String sensuIoManagedBy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("sngroup")
    public String getSngroup() {
        return sngroup;
    }

    @JsonProperty("sngroup")
    public void setSngroup(String sngroup) {
        this.sngroup = sngroup;
    }

    @JsonProperty("snseverity")
    public String getSnseverity() {
        return snseverity;
    }

    @JsonProperty("snseverity")
    public void setSnseverity(String snseverity) {
        this.snseverity = snseverity;
    }

    @JsonProperty("sensu.io/managed_by")
    public String getSensuIoManagedBy() {
        return sensuIoManagedBy;
    }

    @JsonProperty("sensu.io/managed_by")
    public void setSensuIoManagedBy(String sensuIoManagedBy) {
        this.sensuIoManagedBy = sensuIoManagedBy;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
