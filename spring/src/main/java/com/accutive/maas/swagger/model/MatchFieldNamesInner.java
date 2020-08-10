package com.accutive.maas.swagger.model;

import java.util.Objects;
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
 * MatchFieldNamesInner
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-10T22:55:17.351Z[GMT]")
public class MatchFieldNamesInner   {
  @JsonProperty("inputValue")
  private String inputValue = null;

  @JsonProperty("matches")
  @Valid
  private List<Object> matches = null;

  public MatchFieldNamesInner inputValue(String inputValue) {
    this.inputValue = inputValue;
    return this;
  }

  /**
   * Get inputValue
   * @return inputValue
  **/
  @ApiModelProperty(value = "")
  
    public String getInputValue() {
    return inputValue;
  }

  public void setInputValue(String inputValue) {
    this.inputValue = inputValue;
  }

  public MatchFieldNamesInner matches(List<Object> matches) {
    this.matches = matches;
    return this;
  }

  public MatchFieldNamesInner addMatchesItem(Object matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<Object>();
    }
    this.matches.add(matchesItem);
    return this;
  }

  /**
   * Get matches
   * @return matches
  **/
  @ApiModelProperty(value = "")
  
    public List<Object> getMatches() {
    return matches;
  }

  public void setMatches(List<Object> matches) {
    this.matches = matches;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchFieldNamesInner matchFieldNamesInner = (MatchFieldNamesInner) o;
    return Objects.equals(this.inputValue, matchFieldNamesInner.inputValue) &&
        Objects.equals(this.matches, matchFieldNamesInner.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputValue, matches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchFieldNamesInner {\n");
    
    sb.append("    inputValue: ").append(toIndentedString(inputValue)).append("\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
