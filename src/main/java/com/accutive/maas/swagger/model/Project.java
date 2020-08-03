package com.accutive.maas.swagger.model;

import java.util.Objects;
import com.accutive.maas.swagger.model.DiscoveryConfig;
import com.accutive.maas.swagger.model.MaskingConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Project
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-31T14:49:46.647Z[GMT]")
public class Project   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("lastRunDate")
  private OffsetDateTime lastRunDate = null;

  @JsonProperty("latestReport")
  private UUID latestReport = null;

  @JsonProperty("maskingConfigs")
  @Valid
  private List<MaskingConfiguration> maskingConfigs = null;

  @JsonProperty("discoverConfigs")
  @Valid
  private List<DiscoveryConfig> discoverConfigs = null;

  public Project id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "5", value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Demo Project", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Demonstrates project setup", value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Project lastRunDate(OffsetDateTime lastRunDate) {
    this.lastRunDate = lastRunDate;
    return this;
  }

  /**
   * Get lastRunDate
   * @return lastRunDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getLastRunDate() {
    return lastRunDate;
  }

  public void setLastRunDate(OffsetDateTime lastRunDate) {
    this.lastRunDate = lastRunDate;
  }

  public Project latestReport(UUID latestReport) {
    this.latestReport = latestReport;
    return this;
  }

  /**
   * Get latestReport
   * @return latestReport
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UUID getLatestReport() {
    return latestReport;
  }

  public void setLatestReport(UUID latestReport) {
    this.latestReport = latestReport;
  }

  public Project maskingConfigs(List<MaskingConfiguration> maskingConfigs) {
    this.maskingConfigs = maskingConfigs;
    return this;
  }

  public Project addMaskingConfigsItem(MaskingConfiguration maskingConfigsItem) {
    if (this.maskingConfigs == null) {
      this.maskingConfigs = new ArrayList<MaskingConfiguration>();
    }
    this.maskingConfigs.add(maskingConfigsItem);
    return this;
  }

  /**
   * Get maskingConfigs
   * @return maskingConfigs
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<MaskingConfiguration> getMaskingConfigs() {
    return maskingConfigs;
  }

  public void setMaskingConfigs(List<MaskingConfiguration> maskingConfigs) {
    this.maskingConfigs = maskingConfigs;
  }

  public Project discoverConfigs(List<DiscoveryConfig> discoverConfigs) {
    this.discoverConfigs = discoverConfigs;
    return this;
  }

  public Project addDiscoverConfigsItem(DiscoveryConfig discoverConfigsItem) {
    if (this.discoverConfigs == null) {
      this.discoverConfigs = new ArrayList<DiscoveryConfig>();
    }
    this.discoverConfigs.add(discoverConfigsItem);
    return this;
  }

  /**
   * Get discoverConfigs
   * @return discoverConfigs
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<DiscoveryConfig> getDiscoverConfigs() {
    return discoverConfigs;
  }

  public void setDiscoverConfigs(List<DiscoveryConfig> discoverConfigs) {
    this.discoverConfigs = discoverConfigs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.lastRunDate, project.lastRunDate) &&
        Objects.equals(this.latestReport, project.latestReport) &&
        Objects.equals(this.maskingConfigs, project.maskingConfigs) &&
        Objects.equals(this.discoverConfigs, project.discoverConfigs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, lastRunDate, latestReport, maskingConfigs, discoverConfigs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastRunDate: ").append(toIndentedString(lastRunDate)).append("\n");
    sb.append("    latestReport: ").append(toIndentedString(latestReport)).append("\n");
    sb.append("    maskingConfigs: ").append(toIndentedString(maskingConfigs)).append("\n");
    sb.append("    discoverConfigs: ").append(toIndentedString(discoverConfigs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
