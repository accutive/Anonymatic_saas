package com.accutive.maas.swagger.model;

import java.util.Objects;
import com.accutive.maas.swagger.model.MaskValuesInputOperation;
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
 * MaskValuesInput
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-29T23:00:54.754Z[GMT]")
public class MaskValuesInput   {
  @JsonProperty("operation")
  private MaskValuesInputOperation operation = null;

  @JsonProperty("inputData")
  @Valid
  private List<String> inputData = null;

  public MaskValuesInput operation(MaskValuesInputOperation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public MaskValuesInputOperation getOperation() {
    return operation;
  }

  public void setOperation(MaskValuesInputOperation operation) {
    this.operation = operation;
  }

  public MaskValuesInput inputData(List<String> inputData) {
    this.inputData = inputData;
    return this;
  }

  public MaskValuesInput addInputDataItem(String inputDataItem) {
    if (this.inputData == null) {
      this.inputData = new ArrayList<String>();
    }
    this.inputData.add(inputDataItem);
    return this;
  }

  /**
   * Get inputData
   * @return inputData
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getInputData() {
    return inputData;
  }

  public void setInputData(List<String> inputData) {
    this.inputData = inputData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskValuesInput maskValuesInput = (MaskValuesInput) o;
    return Objects.equals(this.operation, maskValuesInput.operation) &&
        Objects.equals(this.inputData, maskValuesInput.inputData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, inputData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskValuesInput {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    inputData: ").append(toIndentedString(inputData)).append("\n");
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
