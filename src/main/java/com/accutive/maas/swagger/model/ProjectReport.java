package com.accutive.maas.swagger.model;

import java.util.Objects;
import com.accutive.maas.swagger.model.ProjectReportErrors;
import com.accutive.maas.swagger.model.ProjectReportMarks;
import com.accutive.maas.swagger.model.ProjectReportMessages;
import com.accutive.maas.swagger.model.ProjectReportSql;
import com.accutive.maas.swagger.model.ProjectReportSqlFailures;
import com.accutive.maas.swagger.model.ProjectReportStats;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProjectReport
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-22T18:25:26.083Z[GMT]")
public class ProjectReport   {
  @JsonProperty("uuid")
  private UUID uuid = null;

  @JsonProperty("dateRun")
  private OffsetDateTime dateRun = null;

  @JsonProperty("messages")
  @Valid
  private List<ProjectReportMessages> messages = null;

  @JsonProperty("marks")
  @Valid
  private List<ProjectReportMarks> marks = null;

  @JsonProperty("logs")
  @Valid
  private List<ProjectReportMarks> logs = null;

  @JsonProperty("sql")
  @Valid
  private List<ProjectReportSql> sql = null;

  @JsonProperty("errors")
  @Valid
  private List<ProjectReportErrors> errors = null;

  @JsonProperty("sqlFailures")
  @Valid
  private List<ProjectReportSqlFailures> sqlFailures = null;

  @JsonProperty("stats")
  @Valid
  private List<ProjectReportStats> stats = null;

  public ProjectReport uuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * Get uuid
   * @return uuid
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public ProjectReport dateRun(OffsetDateTime dateRun) {
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

  public ProjectReport messages(List<ProjectReportMessages> messages) {
    this.messages = messages;
    return this;
  }

  public ProjectReport addMessagesItem(ProjectReportMessages messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<ProjectReportMessages>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Get messages
   * @return messages
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ProjectReportMessages> getMessages() {
    return messages;
  }

  public void setMessages(List<ProjectReportMessages> messages) {
    this.messages = messages;
  }

  public ProjectReport marks(List<ProjectReportMarks> marks) {
    this.marks = marks;
    return this;
  }

  public ProjectReport addMarksItem(ProjectReportMarks marksItem) {
    if (this.marks == null) {
      this.marks = new ArrayList<ProjectReportMarks>();
    }
    this.marks.add(marksItem);
    return this;
  }

  /**
   * Get marks
   * @return marks
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ProjectReportMarks> getMarks() {
    return marks;
  }

  public void setMarks(List<ProjectReportMarks> marks) {
    this.marks = marks;
  }

  public ProjectReport logs(List<ProjectReportMarks> logs) {
    this.logs = logs;
    return this;
  }

  public ProjectReport addLogsItem(ProjectReportMarks logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<ProjectReportMarks>();
    }
    this.logs.add(logsItem);
    return this;
  }

  /**
   * Get logs
   * @return logs
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ProjectReportMarks> getLogs() {
    return logs;
  }

  public void setLogs(List<ProjectReportMarks> logs) {
    this.logs = logs;
  }

  public ProjectReport sql(List<ProjectReportSql> sql) {
    this.sql = sql;
    return this;
  }

  public ProjectReport addSqlItem(ProjectReportSql sqlItem) {
    if (this.sql == null) {
      this.sql = new ArrayList<ProjectReportSql>();
    }
    this.sql.add(sqlItem);
    return this;
  }

  /**
   * Get sql
   * @return sql
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ProjectReportSql> getSql() {
    return sql;
  }

  public void setSql(List<ProjectReportSql> sql) {
    this.sql = sql;
  }

  public ProjectReport errors(List<ProjectReportErrors> errors) {
    this.errors = errors;
    return this;
  }

  public ProjectReport addErrorsItem(ProjectReportErrors errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ProjectReportErrors>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ProjectReportErrors> getErrors() {
    return errors;
  }

  public void setErrors(List<ProjectReportErrors> errors) {
    this.errors = errors;
  }

  public ProjectReport sqlFailures(List<ProjectReportSqlFailures> sqlFailures) {
    this.sqlFailures = sqlFailures;
    return this;
  }

  public ProjectReport addSqlFailuresItem(ProjectReportSqlFailures sqlFailuresItem) {
    if (this.sqlFailures == null) {
      this.sqlFailures = new ArrayList<ProjectReportSqlFailures>();
    }
    this.sqlFailures.add(sqlFailuresItem);
    return this;
  }

  /**
   * Get sqlFailures
   * @return sqlFailures
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ProjectReportSqlFailures> getSqlFailures() {
    return sqlFailures;
  }

  public void setSqlFailures(List<ProjectReportSqlFailures> sqlFailures) {
    this.sqlFailures = sqlFailures;
  }

  public ProjectReport stats(List<ProjectReportStats> stats) {
    this.stats = stats;
    return this;
  }

  public ProjectReport addStatsItem(ProjectReportStats statsItem) {
    if (this.stats == null) {
      this.stats = new ArrayList<ProjectReportStats>();
    }
    this.stats.add(statsItem);
    return this;
  }

  /**
   * Get stats
   * @return stats
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<ProjectReportStats> getStats() {
    return stats;
  }

  public void setStats(List<ProjectReportStats> stats) {
    this.stats = stats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectReport projectReport = (ProjectReport) o;
    return Objects.equals(this.uuid, projectReport.uuid) &&
        Objects.equals(this.dateRun, projectReport.dateRun) &&
        Objects.equals(this.messages, projectReport.messages) &&
        Objects.equals(this.marks, projectReport.marks) &&
        Objects.equals(this.logs, projectReport.logs) &&
        Objects.equals(this.sql, projectReport.sql) &&
        Objects.equals(this.errors, projectReport.errors) &&
        Objects.equals(this.sqlFailures, projectReport.sqlFailures) &&
        Objects.equals(this.stats, projectReport.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uuid, dateRun, messages, marks, logs, sql, errors, sqlFailures, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectReport {\n");
    
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    dateRun: ").append(toIndentedString(dateRun)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    marks: ").append(toIndentedString(marks)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    sqlFailures: ").append(toIndentedString(sqlFailures)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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
