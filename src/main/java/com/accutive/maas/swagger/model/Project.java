package com.accutive.maas.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Project
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-28T23:16:06.253Z[GMT]")
public class Project   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("lastRunDate")
  private OffsetDateTime lastRunDate = null;

  @JsonProperty("latestReport")
  private UUID latestReport = null;

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
  @ApiModelProperty(value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
        Objects.equals(this.lastRunDate, project.lastRunDate) &&
        Objects.equals(this.latestReport, project.latestReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastRunDate, latestReport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastRunDate: ").append(toIndentedString(lastRunDate)).append("\n");
    sb.append("    latestReport: ").append(toIndentedString(latestReport)).append("\n");
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
