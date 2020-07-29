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
 * AuditLogLog
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-28T23:16:06.253Z[GMT]")
public class AuditLogLog   {
  @JsonProperty("timestamp")
  private OffsetDateTime timestamp = null;

  @JsonProperty("logMessage")
  private String logMessage = null;

  @JsonProperty("user")
  private String user = null;

  @JsonProperty("remoteIpAddress")
  private String remoteIpAddress = null;

  public AuditLogLog timestamp(OffsetDateTime timestamp) {
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

  public AuditLogLog logMessage(String logMessage) {
    this.logMessage = logMessage;
    return this;
  }

  /**
   * Get logMessage
   * @return logMessage
  **/
  @ApiModelProperty(value = "")
  
    public String getLogMessage() {
    return logMessage;
  }

  public void setLogMessage(String logMessage) {
    this.logMessage = logMessage;
  }

  public AuditLogLog user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  
    public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public AuditLogLog remoteIpAddress(String remoteIpAddress) {
    this.remoteIpAddress = remoteIpAddress;
    return this;
  }

  /**
   * Get remoteIpAddress
   * @return remoteIpAddress
  **/
  @ApiModelProperty(value = "")
  
    public String getRemoteIpAddress() {
    return remoteIpAddress;
  }

  public void setRemoteIpAddress(String remoteIpAddress) {
    this.remoteIpAddress = remoteIpAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogLog auditLogLog = (AuditLogLog) o;
    return Objects.equals(this.timestamp, auditLogLog.timestamp) &&
        Objects.equals(this.logMessage, auditLogLog.logMessage) &&
        Objects.equals(this.user, auditLogLog.user) &&
        Objects.equals(this.remoteIpAddress, auditLogLog.remoteIpAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, logMessage, user, remoteIpAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogLog {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    logMessage: ").append(toIndentedString(logMessage)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    remoteIpAddress: ").append(toIndentedString(remoteIpAddress)).append("\n");
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
