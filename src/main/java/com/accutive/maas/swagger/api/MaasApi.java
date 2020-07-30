/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.20).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.accutive.maas.swagger.api;

import com.accutive.maas.swagger.model.AuditLog;
import com.accutive.maas.swagger.model.AuditLogList;
import com.accutive.maas.swagger.model.Body;
import com.accutive.maas.swagger.model.Body1;
import com.accutive.maas.swagger.model.Body2;
import com.accutive.maas.swagger.model.Discovery;
import com.accutive.maas.swagger.model.DiscoveryReport;
import com.accutive.maas.swagger.model.InputData;
import com.accutive.maas.swagger.model.Job;
import com.accutive.maas.swagger.model.MaskFile;
import com.accutive.maas.swagger.model.MaskValuesInput;
import com.accutive.maas.swagger.model.MaskedData;
import com.accutive.maas.swagger.model.MaskingConfiguration;
import com.accutive.maas.swagger.model.MaskingOperation;
import com.accutive.maas.swagger.model.Masklink;
import com.accutive.maas.swagger.model.MatchFieldNames;
import com.accutive.maas.swagger.model.MatchFieldValues;
import com.accutive.maas.swagger.model.Project;
import com.accutive.maas.swagger.model.ProjectReport;
import com.accutive.maas.swagger.model.ProjectReportList;
import org.springframework.core.io.Resource;
import com.accutive.maas.swagger.model.RunJob;
import com.accutive.maas.swagger.model.ScanGroup;
import com.accutive.maas.swagger.model.ServerRestart;
import com.accutive.maas.swagger.model.ServerStop;
import com.accutive.maas.swagger.model.StopProject;
import java.util.UUID;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-30T22:52:38.660Z[GMT]")
@Api(value = "maas", description = "the maas API")
public interface MaasApi {

    @ApiOperation(value = "Get an audit log by file name. Demo server will return status 451 if log file name is 'tampered'", nickname = "getAuditLogByFileName", notes = "", response = AuditLog.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "admin", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AuditLog.class),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "File not found."),
        @ApiResponse(code = 451, message = "Audit log has been tampered with."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/admin/auditlog/get/{filename}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<AuditLog> getAuditLogByFileName(@ApiParam(value = "Filename of the audit file to return.",required=true) @PathVariable("filename") String filename
);


    @ApiOperation(value = "Return a list of audit log filenames.", nickname = "getAuditLogList", notes = "", response = AuditLogList.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "admin", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AuditLogList.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "No Audit logs found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/admin/auditlog/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<AuditLogList>> getAuditLogList();


    @ApiOperation(value = "Get current audit log", nickname = "getCurrentAuditLog", notes = "", response = AuditLog.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "admin", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AuditLog.class),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "File not found."),
        @ApiResponse(code = 451, message = "Audit log has been tampered with."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/admin/auditlog/getcurrent",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<AuditLog> getCurrentAuditLog();


    @ApiOperation(value = "Get a list of discovery configurations", nickname = "getDiscoveries", notes = "", response = Discovery.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "discovery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Discovery.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "No Discoveries found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/discovery/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Discovery>> getDiscoveries();


    @ApiOperation(value = "Return latest discovery report", nickname = "getDiscoveryReport", notes = "", response = DiscoveryReport.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "discovery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = DiscoveryReport.class),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 404, message = "No report found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/discovery/getreport/{discoveryID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<DiscoveryReport> getDiscoveryReport(@ApiParam(value = "ID of the discovery config",required=true) @PathVariable("discoveryID") Integer discoveryID
);


    @ApiOperation(value = "Match an array of field names against discovery field name matcher.", nickname = "getFieldNameMatches", notes = "", response = MatchFieldNames.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "discovery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MatchFieldNames.class),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "Scan group not found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/discovery/matchfieldname",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<MatchFieldNames> getFieldNameMatches(@ApiParam(value = "Field names to check for sensitive strings" ,required=true )  @Valid @RequestBody List<InputData> body
,@NotNull @ApiParam(value = "One or more scan group name(s) to use (NOTE: Only scan field matchers will be used. Scan value matchers will be ignored)", required = true) @Valid @RequestParam(value = "group", required = true) List<String> group
);


    @ApiOperation(value = "One or more scan group name(s) to use (NOTE: Only scan value matchers will be used. Scan field matchers will be ignored)", nickname = "getFieldValueMatches", notes = "", response = MatchFieldValues.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "discovery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MatchFieldValues.class),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "No matches were found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/discovery/matchfieldvalue",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<MatchFieldValues> getFieldValueMatches(@ApiParam(value = "Data values to check for sensitive data matches" ,required=true )  @Valid @RequestBody List<InputData> body
,@NotNull @ApiParam(value = "Array of scan group names to use.", required = true) @Valid @RequestParam(value = "group", required = true) List<String> group
);


    @ApiOperation(value = "Return a list of scheduled jobs.", nickname = "getJobs", notes = "", response = Job.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Job.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/jobs/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Job>> getJobs();


    @ApiOperation(value = "Return a list of masking configurations.", nickname = "getMaskingConfigurationsList", notes = "", response = MaskingConfiguration.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "masking", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MaskingConfiguration.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 404, message = "No Configurations found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/masking/configurations/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<MaskingConfiguration>> getMaskingConfigurationsList();


    @ApiOperation(value = "Return a list of masking operations.  Optionally includes required and optional parameters.", nickname = "getMaskingOperationsList", notes = "", response = MaskingOperation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "masking", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MaskingOperation.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "No Operations found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/masking/operations/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<MaskingOperation>> getMaskingOperationsList();


    @ApiOperation(value = "Return a list of masklink names.", nickname = "getMasklinkList", notes = "", response = Masklink.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "masking", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Masklink.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "No Masklinks found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/masking/masklink/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Masklink>> getMasklinkList();


    @ApiOperation(value = "Get a list of projects", nickname = "getProjects", notes = "", response = Project.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "project", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Project.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "No Projects found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/projects/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Project>> getProjects();


    @ApiOperation(value = "Get a report by projectReportID", nickname = "getReportByProjectReportID", notes = "", response = ProjectReport.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "project", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProjectReport.class),
        @ApiResponse(code = 400, message = "Bad request. Project report ID must be in UUID format."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "A Project report with the specified UUID was not found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/projects/getreport/{projectReportID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ProjectReport> getReportByProjectReportID(@ApiParam(value = "ID of the project report to retrieve.",required=true) @PathVariable("projectReportID") UUID projectReportID
);


    @ApiOperation(value = "Return a list of scan group names.", nickname = "getScanGroupNames", notes = "", response = ScanGroup.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "discovery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ScanGroup.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 404, message = "No Groups found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/discovery/getscangroups",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ScanGroup>> getScanGroupNames();


    @ApiOperation(value = "Return a list of reports for a given project.", nickname = "listReportByProjectID", notes = "", response = ProjectReportList.class, responseContainer = "List", authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "project", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ProjectReportList.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad request. Project ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "A Project with the specified ID was not found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/projects/listreports/{projectID}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<ProjectReportList>> listReportByProjectID(@ApiParam(value = "ID of the project to query for reports.",required=true) @PathVariable("projectID") Integer projectID
);


    @ApiOperation(value = "Masks values in passed array using a given masking operator.", nickname = "maskData", notes = "", response = MaskedData.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "masking", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MaskedData.class),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "Masking operator or mask link not found."),
        @ApiResponse(code = 409, message = "Unable to generate unique replacement data"),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/masking/maskvalues",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<MaskedData> maskData(@ApiParam(value = "Masking operation with parameters and data to be masked" ,required=true )  @Valid @RequestBody MaskValuesInput body
);


    @ApiOperation(value = "Upload and mask a file given the masking config id, and filename.", nickname = "maskFile", notes = "", response = MaskFile.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "masking", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = MaskFile.class),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "File not found."),
        @ApiResponse(code = 429, message = "Too Many Requests"),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/masking/maskfile",
        produces = { "application/text" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    ResponseEntity<MaskFile> maskFile(@ApiParam(value = "") @RequestParam(value="projectID", required=false)  Integer projectID
,@ApiParam(value = "") @RequestParam(value="maskingConfigID", required=false)  Integer maskingConfigID
,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile fileName
);


    @ApiOperation(value = "Run a Discovery Job", nickname = "runDiscoveryJob", notes = "", response = RunJob.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "discovery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "discovery operation submitted to queue", response = RunJob.class),
        @ApiResponse(code = 400, message = "Bad request. discoveryID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "A Discover Config with the specified ID was not found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/discovery/run/{discoveryID}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<RunJob> runDiscoveryJob(@ApiParam(value = "ID of the discovery config",required=true) @PathVariable("discoveryID") Integer discoveryID
,@ApiParam(value = ""  )  @Valid @RequestBody Body2 body
);


    @ApiOperation(value = "Run a job by jobID", nickname = "runJobByJobID", notes = "Run a job immediately instead of waiting for next scheduled execution", response = RunJob.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "job submitted for processing", response = RunJob.class),
        @ApiResponse(code = 400, message = "Bad request. Job ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "A Job with the specified ID was not found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/jobs/run/{jobID}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<RunJob> runJobByJobID(@ApiParam(value = "ID of the job to run.",required=true) @PathVariable("jobID") Integer jobID
,@ApiParam(value = "A JSON object containing optional callback URL information"  )  @Valid @RequestBody Object body
);


    @ApiOperation(value = "Run a project by projectID", nickname = "runProjectByProjectID", notes = "", authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "project", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "project queued for execution"),
        @ApiResponse(code = 400, message = "Bad request. Project ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 404, message = "A Project with the specified ID was not found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/projects/run/{projectID}",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> runProjectByProjectID(@ApiParam(value = "ID of the project to run.",required=true) @PathVariable("projectID") Integer projectID
,@ApiParam(value = ""  )  @Valid @RequestBody Body body
);


    @ApiOperation(value = "Restarts the ADM server.", nickname = "serverRestart", notes = "", response = ServerRestart.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "admin", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ServerRestart.class),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "Service not found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/admin/server/restart",
        produces = { "application/text" }, 
        method = RequestMethod.GET)
    ResponseEntity<ServerRestart> serverRestart();


    @ApiOperation(value = "Stops the ADM server.", nickname = "serverStop", notes = "", response = ServerStop.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "admin", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ServerStop.class),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "Service not found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/admin/server/stop",
        produces = { "application/text" }, 
        method = RequestMethod.GET)
    ResponseEntity<ServerStop> serverStop();


    @ApiOperation(value = "Stop a project by projectID. If project ID is not supplied, stops currently active project.", nickname = "stopProjectByProjectID", notes = "", response = StopProject.class, authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "project", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = StopProject.class),
        @ApiResponse(code = 400, message = "Bad request."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 403, message = "Forbidden by license or access control."),
        @ApiResponse(code = 404, message = "A Project with the specified ID was not found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/projects/stop",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<StopProject> stopProjectByProjectID(@ApiParam(value = "ID of the project to stop.") @Valid @RequestParam(value = "projectID", required = false) Optional<Integer> projectID
);


    @ApiOperation(value = "Validate a project by projectID", nickname = "validateProjectByProjectID", notes = "", authorizations = {
        @Authorization(value = "OAuth2", scopes = { 
            @AuthorizationScope(scope = "read", description = "Grants read access"),
            @AuthorizationScope(scope = "write", description = "Grants write access"),
            @AuthorizationScope(scope = "admin", description = "Grants access to admin operations")
            }),
@Authorization(value = "OpenID"),
@Authorization(value = "api_key")    }, tags={ "project", })
    @ApiResponses(value = { 
        @ApiResponse(code = 202, message = "project queued for validation"),
        @ApiResponse(code = 400, message = "Bad request. Project ID must be an integer and larger than 0."),
        @ApiResponse(code = 401, message = "Authorization information is missing or invalid."),
        @ApiResponse(code = 404, message = "A Project with the specified ID was not found."),
        @ApiResponse(code = 500, message = "Unexpected server error.") })
    @RequestMapping(value = "/maas/projects/validate/{projectID}",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> validateProjectByProjectID(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body1 body
,@ApiParam(value = "ID of the project to validate.",required=true) @PathVariable("projectID") Integer projectID
);

}
