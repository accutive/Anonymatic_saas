package com.accutive.maas.swagger.model;

import java.util.Objects;
import com.accutive.maas.swagger.model.MaskValuesInputOperationParameters;
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
 * MaskValuesInputOperation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-29T22:58:26.886Z[GMT]")
public class MaskValuesInputOperation   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("parameters")
  @Valid
  private List<MaskValuesInputOperationParameters> parameters = null;

  public MaskValuesInputOperation id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "23", value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MaskValuesInputOperation parameters(List<MaskValuesInputOperationParameters> parameters) {
    this.parameters = parameters;
    return this;
  }

  public MaskValuesInputOperation addParametersItem(MaskValuesInputOperationParameters parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<MaskValuesInputOperationParameters>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

  /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<MaskValuesInputOperationParameters> getParameters() {
    return parameters;
  }

  public void setParameters(List<MaskValuesInputOperationParameters> parameters) {
    this.parameters = parameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskValuesInputOperation maskValuesInputOperation = (MaskValuesInputOperation) o;
    return Objects.equals(this.id, maskValuesInputOperation.id) &&
        Objects.equals(this.parameters, maskValuesInputOperation.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskValuesInputOperation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
