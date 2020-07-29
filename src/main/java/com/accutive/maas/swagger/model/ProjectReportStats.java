package com.accutive.maas.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProjectReportStats
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-29T22:58:26.886Z[GMT]")
public class ProjectReportStats   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("totalTasks")
  private Integer totalTasks = null;

  @JsonProperty("completedTasks")
  private Integer completedTasks = null;

  @JsonProperty("startTime")
  private OffsetDateTime startTime = null;

  @JsonProperty("endTime")
  private OffsetDateTime endTime = null;

  public ProjectReportStats name(String name) {
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

  public ProjectReportStats type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProjectReportStats totalTasks(Integer totalTasks) {
    this.totalTasks = totalTasks;
    return this;
  }

  /**
   * Get totalTasks
   * @return totalTasks
  **/
  @ApiModelProperty(example = "42", value = "")
  
    public Integer getTotalTasks() {
    return totalTasks;
  }

  public void setTotalTasks(Integer totalTasks) {
    this.totalTasks = totalTasks;
  }

  public ProjectReportStats completedTasks(Integer completedTasks) {
    this.completedTasks = completedTasks;
    return this;
  }

  /**
   * Get completedTasks
   * @return completedTasks
  **/
  @ApiModelProperty(example = "42", value = "")
  
    public Integer getCompletedTasks() {
    return completedTasks;
  }

  public void setCompletedTasks(Integer completedTasks) {
    this.completedTasks = completedTasks;
  }

  public ProjectReportStats startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public ProjectReportStats endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectReportStats projectReportStats = (ProjectReportStats) o;
    return Objects.equals(this.name, projectReportStats.name) &&
        Objects.equals(this.type, projectReportStats.type) &&
        Objects.equals(this.totalTasks, projectReportStats.totalTasks) &&
        Objects.equals(this.completedTasks, projectReportStats.completedTasks) &&
        Objects.equals(this.startTime, projectReportStats.startTime) &&
        Objects.equals(this.endTime, projectReportStats.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, totalTasks, completedTasks, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectReportStats {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
    sb.append("    completedTasks: ").append(toIndentedString(completedTasks)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
