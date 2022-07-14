package dz7.project.classForFiveDay;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Headline {
    @JsonProperty("EffectiveDate")
    public Date effectiveDate;
    @JsonProperty("EffectiveEpochDate")
    public int effectiveEpochDate;
    @JsonProperty("Severity")
    public int severity;
    @JsonProperty("Text")
    public String text;
    @JsonProperty("Category")
    public String category;
    @JsonProperty("EndDate")
    public Object endDate;
    @JsonProperty("EndEpochDate")
    public Object endEpochDate;
    @JsonProperty("MobileLink")
    public String mobileLink;
    @JsonProperty("Link")
    public String link;

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public int getEffectiveEpochDate() {
        return effectiveEpochDate;
    }

    public void setEffectiveEpochDate(int effectiveEpochDate) {
        this.effectiveEpochDate = effectiveEpochDate;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Object getEndDate() {
        return endDate;
    }

    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    public Object getEndEpochDate() {
        return endEpochDate;
    }

    public void setEndEpochDate(Object endEpochDate) {
        this.endEpochDate = endEpochDate;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    public void setMobileLink(String mobileLink) {
        this.mobileLink = mobileLink;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
