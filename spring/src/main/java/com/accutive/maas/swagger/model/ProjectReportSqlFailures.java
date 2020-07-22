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
 * ProjectReportSqlFailures
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-22T20:42:24.204Z[GMT]")
public class ProjectReportSqlFailures   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("command")
  private String command = null;

  @JsonProperty("fieldId")
  private String fieldId = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  public ProjectReportSqlFailures id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectReportSqlFailures message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  
    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ProjectReportSqlFailures command(String command) {
    this.command = command;
    return this;
  }

  /**
   * Get command
   * @return command
  **/
  @ApiModelProperty(value = "")
  
    public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }

  public ProjectReportSqlFailures fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * Get fieldId
   * @return fieldId
  **/
  @ApiModelProperty(value = "")
  
    public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public ProjectReportSqlFailures timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectReportSqlFailures projectReportSqlFailures = (ProjectReportSqlFailures) o;
    return Objects.equals(this.id, projectReportSqlFailures.id) &&
        Objects.equals(this.message, projectReportSqlFailures.message) &&
        Objects.equals(this.command, projectReportSqlFailures.command) &&
        Objects.equals(this.fieldId, projectReportSqlFailures.fieldId) &&
        Objects.equals(this.timestamp, projectReportSqlFailures.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message, command, fieldId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectReportSqlFailures {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
