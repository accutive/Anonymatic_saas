package com.accutive.maas.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.core.io.Resource;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Body3
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-29T22:58:26.886Z[GMT]")
public class Body3   {
  @JsonProperty("maskingConfigID")
  private Integer maskingConfigID = null;

  @JsonProperty("fileName")
  private Resource fileName = null;

  public Body3 maskingConfigID(Integer maskingConfigID) {
    this.maskingConfigID = maskingConfigID;
    return this;
  }

  /**
   * ID of the masking configuration to use.
   * @return maskingConfigID
  **/
  @ApiModelProperty(example = "3", value = "ID of the masking configuration to use.")
  
    public Integer getMaskingConfigID() {
    return maskingConfigID;
  }

  public void setMaskingConfigID(Integer maskingConfigID) {
    this.maskingConfigID = maskingConfigID;
  }

  public Body3 fileName(Resource fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Content of file to mask
   * @return fileName
  **/
  @ApiModelProperty(value = "Content of file to mask")
  
    @Valid
    public Resource getFileName() {
    return fileName;
  }

  public void setFileName(Resource fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Body3 body3 = (Body3) o;
    return Objects.equals(this.maskingConfigID, body3.maskingConfigID) &&
        Objects.equals(this.fileName, body3.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maskingConfigID, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body3 {\n");
    
    sb.append("    maskingConfigID: ").append(toIndentedString(maskingConfigID)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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
