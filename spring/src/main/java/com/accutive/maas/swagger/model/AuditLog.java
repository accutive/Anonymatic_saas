package com.accutive.maas.swagger.model;

import java.util.Objects;
import com.accutive.maas.swagger.model.AuditLogLog;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuditLog
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-22T20:42:24.204Z[GMT]")
public class AuditLog   {
  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("isValid")
  private Boolean isValid = null;

  @JsonProperty("log")
  @Valid
  private List<AuditLogLog> log = null;

  public AuditLog filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * Get filename
   * @return filename
  **/
  @ApiModelProperty(value = "")
  
    public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public AuditLog isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

  /**
   * Get isValid
   * @return isValid
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public AuditLog log(List<AuditLogLog> log) {
    this.log = log;
    return this;
  }

  public AuditLog addLogItem(AuditLogLog logItem) {
    if (this.log == null) {
      this.log = new ArrayList<AuditLogLog>();
    }
    this.log.add(logItem);
    return this;
  }

  /**
   * Get log
   * @return log
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<AuditLogLog> getLog() {
    return log;
  }

  public void setLog(List<AuditLogLog> log) {
    this.log = log;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLog auditLog = (AuditLog) o;
    return Objects.equals(this.filename, auditLog.filename) &&
        Objects.equals(this.isValid, auditLog.isValid) &&
        Objects.equals(this.log, auditLog.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, isValid, log);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLog {\n");
    
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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
