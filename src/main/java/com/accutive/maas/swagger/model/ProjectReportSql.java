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
 * ProjectReportSql
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-22T18:25:26.083Z[GMT]")
public class ProjectReportSql   {
  @JsonProperty("command")
  private String command = null;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  public ProjectReportSql command(String command) {
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

  public ProjectReportSql timestamp(OffsetDateTime timestamp) {
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
    ProjectReportSql projectReportSql = (ProjectReportSql) o;
    return Objects.equals(this.command, projectReportSql.command) &&
        Objects.equals(this.timestamp, projectReportSql.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectReportSql {\n");
    
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
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
