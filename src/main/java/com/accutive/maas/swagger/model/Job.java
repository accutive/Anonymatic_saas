package com.accutive.maas.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Job
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-22T18:25:26.083Z[GMT]")
public class Job   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("cron")
  private String cron = null;

  @JsonProperty("nextRuntime")
  private OffsetDateTime nextRuntime = null;

  @JsonProperty("endsOnDate")
  private OffsetDateTime endsOnDate = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  public Job id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "9", value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Job name(String name) {
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

  public Job description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Job cron(String cron) {
    this.cron = cron;
    return this;
  }

  /**
   * Get cron
   * @return cron
  **/
  @ApiModelProperty(value = "")
  
    public String getCron() {
    return cron;
  }

  public void setCron(String cron) {
    this.cron = cron;
  }

  public Job nextRuntime(OffsetDateTime nextRuntime) {
    this.nextRuntime = nextRuntime;
    return this;
  }

  /**
   * Get nextRuntime
   * @return nextRuntime
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getNextRuntime() {
    return nextRuntime;
  }

  public void setNextRuntime(OffsetDateTime nextRuntime) {
    this.nextRuntime = nextRuntime;
  }

  public Job endsOnDate(OffsetDateTime endsOnDate) {
    this.endsOnDate = endsOnDate;
    return this;
  }

  /**
   * Get endsOnDate
   * @return endsOnDate
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getEndsOnDate() {
    return endsOnDate;
  }

  public void setEndsOnDate(OffsetDateTime endsOnDate) {
    this.endsOnDate = endsOnDate;
  }

  public Job status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.id, job.id) &&
        Objects.equals(this.name, job.name) &&
        Objects.equals(this.description, job.description) &&
        Objects.equals(this.cron, job.cron) &&
        Objects.equals(this.nextRuntime, job.nextRuntime) &&
        Objects.equals(this.endsOnDate, job.endsOnDate) &&
        Objects.equals(this.status, job.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, cron, nextRuntime, endsOnDate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cron: ").append(toIndentedString(cron)).append("\n");
    sb.append("    nextRuntime: ").append(toIndentedString(nextRuntime)).append("\n");
    sb.append("    endsOnDate: ").append(toIndentedString(endsOnDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
