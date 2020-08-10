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
 * MatchFieldValuesInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-10T22:55:17.351Z[GMT]")
public class MatchFieldValuesInner   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("suggestedOperator")
  private String suggestedOperator = null;

  @JsonProperty("totalMatches")
  private Integer totalMatches = null;

  @JsonProperty("threshold")
  private Integer threshold = null;

  public MatchFieldValuesInner name(String name) {
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

  public MatchFieldValuesInner suggestedOperator(String suggestedOperator) {
    this.suggestedOperator = suggestedOperator;
    return this;
  }

  /**
   * Get suggestedOperator
   * @return suggestedOperator
  **/
  @ApiModelProperty(value = "")
  
    public String getSuggestedOperator() {
    return suggestedOperator;
  }

  public void setSuggestedOperator(String suggestedOperator) {
    this.suggestedOperator = suggestedOperator;
  }

  public MatchFieldValuesInner totalMatches(Integer totalMatches) {
    this.totalMatches = totalMatches;
    return this;
  }

  /**
   * Get totalMatches
   * @return totalMatches
  **/
  @ApiModelProperty(value = "")
  
    public Integer getTotalMatches() {
    return totalMatches;
  }

  public void setTotalMatches(Integer totalMatches) {
    this.totalMatches = totalMatches;
  }

  public MatchFieldValuesInner threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Get threshold
   * @return threshold
  **/
  @ApiModelProperty(value = "")
  
    public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchFieldValuesInner matchFieldValuesInner = (MatchFieldValuesInner) o;
    return Objects.equals(this.name, matchFieldValuesInner.name) &&
        Objects.equals(this.suggestedOperator, matchFieldValuesInner.suggestedOperator) &&
        Objects.equals(this.totalMatches, matchFieldValuesInner.totalMatches) &&
        Objects.equals(this.threshold, matchFieldValuesInner.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, suggestedOperator, totalMatches, threshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchFieldValuesInner {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    suggestedOperator: ").append(toIndentedString(suggestedOperator)).append("\n");
    sb.append("    totalMatches: ").append(toIndentedString(totalMatches)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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
