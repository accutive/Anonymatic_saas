package com.accutive.maas.swagger.model;

import java.util.Objects;
import com.accutive.maas.swagger.model.DiscoveryReportResults;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DiscoveryReport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-29T22:58:26.886Z[GMT]")
public class DiscoveryReport   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("dateRun")
  private OffsetDateTime dateRun = null;

  @JsonProperty("results")
  @Valid
  private List<DiscoveryReportResults> results = null;

  public DiscoveryReport id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "8", value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DiscoveryReport dateRun(OffsetDateTime dateRun) {
    this.dateRun = dateRun;
    return this;
  }

  /**
   * Get dateRun
   * @return dateRun
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getDateRun() {
    return dateRun;
  }

  public void setDateRun(OffsetDateTime dateRun) {
    this.dateRun = dateRun;
  }

  public DiscoveryReport results(List<DiscoveryReportResults> results) {
    this.results = results;
    return this;
  }

  public DiscoveryReport addResultsItem(DiscoveryReportResults resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<DiscoveryReportResults>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<DiscoveryReportResults> getResults() {
    return results;
  }

  public void setResults(List<DiscoveryReportResults> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveryReport discoveryReport = (DiscoveryReport) o;
    return Objects.equals(this.id, discoveryReport.id) &&
        Objects.equals(this.dateRun, discoveryReport.dateRun) &&
        Objects.equals(this.results, discoveryReport.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateRun, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveryReport {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateRun: ").append(toIndentedString(dateRun)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
