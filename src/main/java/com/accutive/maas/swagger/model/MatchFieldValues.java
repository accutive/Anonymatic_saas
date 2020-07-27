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
 * MatchFieldValues
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-22T18:25:26.083Z[GMT]")
public class MatchFieldValues   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("suggestedOperator")
  private String suggestedOperator = null;

  public MatchFieldValues name(String name) {
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

  public MatchFieldValues suggestedOperator(String suggestedOperator) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchFieldValues matchFieldValues = (MatchFieldValues) o;
    return Objects.equals(this.name, matchFieldValues.name) &&
        Objects.equals(this.suggestedOperator, matchFieldValues.suggestedOperator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, suggestedOperator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchFieldValues {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    suggestedOperator: ").append(toIndentedString(suggestedOperator)).append("\n");
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
