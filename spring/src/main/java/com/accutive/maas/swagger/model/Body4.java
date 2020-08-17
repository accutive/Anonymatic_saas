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
 * Body4
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-08-17T22:19:27.764Z[GMT]")


public class Body4   {
  @JsonProperty("projectID")
  private Integer projectID = null;

  @JsonProperty("maskingConfigID")
  private Integer maskingConfigID = null;

  @JsonProperty("fileName")
  private Resource fileName = null;

  public Body4 projectID(Integer projectID) {
    this.projectID = projectID;
    return this;
  }

  /**
   * ID of the project to run to process the input file
   * @return projectID
  **/
  @ApiModelProperty(example = "3", required = true, value = "ID of the project to run to process the input file")
      @NotNull

    public Integer getProjectID() {
    return projectID;
  }

  public void setProjectID(Integer projectID) {
    this.projectID = projectID;
  }

  public Body4 maskingConfigID(Integer maskingConfigID) {
    this.maskingConfigID = maskingConfigID;
    return this;
  }

  /**
   * ID of the masking configuration matching this file structure (optional).
   * @return maskingConfigID
  **/
  @ApiModelProperty(value = "ID of the masking configuration matching this file structure (optional).")
  
    public Integer getMaskingConfigID() {
    return maskingConfigID;
  }

  public void setMaskingConfigID(Integer maskingConfigID) {
    this.maskingConfigID = maskingConfigID;
  }

  public Body4 fileName(Resource fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Content of file to mask
   * @return fileName
  **/
  @ApiModelProperty(required = true, value = "Content of file to mask")
      @NotNull

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
    Body4 body4 = (Body4) o;
    return Objects.equals(this.projectID, body4.projectID) &&
        Objects.equals(this.maskingConfigID, body4.maskingConfigID) &&
        Objects.equals(this.fileName, body4.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectID, maskingConfigID, fileName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body4 {\n");
    
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
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
