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
 * MaskingConfiguration
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-28T22:30:40.640Z[GMT]")
public class MaskingConfiguration   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("descriptino")
  private String descriptino = null;

  @JsonProperty("properties")
  @Valid
  private List<String> properties = null;

  public MaskingConfiguration id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "4", value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MaskingConfiguration name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "My Masking Config", value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MaskingConfiguration descriptino(String descriptino) {
    this.descriptino = descriptino;
    return this;
  }

  /**
   * Get descriptino
   * @return descriptino
  **/
  @ApiModelProperty(example = "First atttempt at building a masking config", value = "")
  
    public String getDescriptino() {
    return descriptino;
  }

  public void setDescriptino(String descriptino) {
    this.descriptino = descriptino;
  }

  public MaskingConfiguration properties(List<String> properties) {
    this.properties = properties;
    return this;
  }

  public MaskingConfiguration addPropertiesItem(String propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<String>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  
    public List<String> getProperties() {
    return properties;
  }

  public void setProperties(List<String> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskingConfiguration maskingConfiguration = (MaskingConfiguration) o;
    return Objects.equals(this.id, maskingConfiguration.id) &&
        Objects.equals(this.name, maskingConfiguration.name) &&
        Objects.equals(this.descriptino, maskingConfiguration.descriptino) &&
        Objects.equals(this.properties, maskingConfiguration.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, descriptino, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskingConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    descriptino: ").append(toIndentedString(descriptino)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
