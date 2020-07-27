package com.accutive.maas.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body2
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-22T18:25:26.083Z[GMT]")
public class Body2   {
  @JsonProperty("completedUrl")
  private String completedUrl = null;

  @JsonProperty("failedUrl")
  private String failedUrl = null;

  public Body2 completedUrl(String completedUrl) {
    this.completedUrl = completedUrl;
    return this;
  }

  /**
   * Get completedUrl
   * @return completedUrl
  **/
  @ApiModelProperty(example = "https://myserver.com/send/callback/here", value = "")
  
    public String getCompletedUrl() {
    return completedUrl;
  }

  public void setCompletedUrl(String completedUrl) {
    this.completedUrl = completedUrl;
  }

  public Body2 failedUrl(String failedUrl) {
    this.failedUrl = failedUrl;
    return this;
  }

  /**
   * Get failedUrl
   * @return failedUrl
  **/
  @ApiModelProperty(example = "https://myserver.com/call/if/project/failed", value = "")
  
    public String getFailedUrl() {
    return failedUrl;
  }

  public void setFailedUrl(String failedUrl) {
    this.failedUrl = failedUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body2 body2 = (Body2) o;
    return Objects.equals(this.completedUrl, body2.completedUrl) &&
        Objects.equals(this.failedUrl, body2.failedUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedUrl, failedUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body2 {\n");
    
    sb.append("    completedUrl: ").append(toIndentedString(completedUrl)).append("\n");
    sb.append("    failedUrl: ").append(toIndentedString(failedUrl)).append("\n");
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
