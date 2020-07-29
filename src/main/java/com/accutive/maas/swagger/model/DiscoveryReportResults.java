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
 * DiscoveryReportResults
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-28T23:16:06.253Z[GMT]")
public class DiscoveryReportResults   {
  @JsonProperty("schema")
  private String schema = null;

  @JsonProperty("table")
  private String table = null;

  @JsonProperty("column")
  private String column = null;

  @JsonProperty("scanFieldMatch")
  private Boolean scanFieldMatch = null;

  @JsonProperty("scanValueMatch")
  private Boolean scanValueMatch = null;

  public DiscoveryReportResults schema(String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
  **/
  @ApiModelProperty(value = "")
  
    public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }

  public DiscoveryReportResults table(String table) {
    this.table = table;
    return this;
  }

  /**
   * Get table
   * @return table
  **/
  @ApiModelProperty(value = "")
  
    public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public DiscoveryReportResults column(String column) {
    this.column = column;
    return this;
  }

  /**
   * Get column
   * @return column
  **/
  @ApiModelProperty(value = "")
  
    public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public DiscoveryReportResults scanFieldMatch(Boolean scanFieldMatch) {
    this.scanFieldMatch = scanFieldMatch;
    return this;
  }

  /**
   * Get scanFieldMatch
   * @return scanFieldMatch
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isScanFieldMatch() {
    return scanFieldMatch;
  }

  public void setScanFieldMatch(Boolean scanFieldMatch) {
    this.scanFieldMatch = scanFieldMatch;
  }

  public DiscoveryReportResults scanValueMatch(Boolean scanValueMatch) {
    this.scanValueMatch = scanValueMatch;
    return this;
  }

  /**
   * Get scanValueMatch
   * @return scanValueMatch
  **/
  @ApiModelProperty(value = "")
  
    public Boolean isScanValueMatch() {
    return scanValueMatch;
  }

  public void setScanValueMatch(Boolean scanValueMatch) {
    this.scanValueMatch = scanValueMatch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveryReportResults discoveryReportResults = (DiscoveryReportResults) o;
    return Objects.equals(this.schema, discoveryReportResults.schema) &&
        Objects.equals(this.table, discoveryReportResults.table) &&
        Objects.equals(this.column, discoveryReportResults.column) &&
        Objects.equals(this.scanFieldMatch, discoveryReportResults.scanFieldMatch) &&
        Objects.equals(this.scanValueMatch, discoveryReportResults.scanValueMatch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schema, table, column, scanFieldMatch, scanValueMatch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveryReportResults {\n");
    
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    scanFieldMatch: ").append(toIndentedString(scanFieldMatch)).append("\n");
    sb.append("    scanValueMatch: ").append(toIndentedString(scanValueMatch)).append("\n");
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
