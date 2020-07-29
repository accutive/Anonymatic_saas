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
 * MaskedData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-29T22:58:26.886Z[GMT]")
public class MaskedData   {
  @JsonProperty("maskedData")
  @Valid
  private List<String> maskedData = null;

  public MaskedData maskedData(List<String> maskedData) {
    this.maskedData = maskedData;
    return this;
  }

  public MaskedData addMaskedDataItem(String maskedDataItem) {
    if (this.maskedData == null) {
      this.maskedData = new ArrayList<String>();
    }
    this.maskedData.add(maskedDataItem);
    return this;
  }

  /**
   * Get maskedData
   * @return maskedData
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getMaskedData() {
    return maskedData;
  }

  public void setMaskedData(List<String> maskedData) {
    this.maskedData = maskedData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskedData maskedData = (MaskedData) o;
    return Objects.equals(this.maskedData, maskedData.maskedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maskedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskedData {\n");
    
    sb.append("    maskedData: ").append(toIndentedString(maskedData)).append("\n");
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
