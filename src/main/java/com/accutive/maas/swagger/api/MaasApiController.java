package com.accutive.maas.swagger.api;

import com.accutive.maas.swagger.model.*;
import org.springframework.core.io.Resource;

import java.util.UUID;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.Optional;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-07-22T18:25:26.083Z[GMT]")
@Controller
public class MaasApiController implements MaasApi {

    private static final Logger log = LoggerFactory.getLogger(MaasApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MaasApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<AuditLog> getAuditLogByFileName(@ApiParam(value = "Filename of the audit file to return.",required=true) @PathVariable("filename") String filename
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json") && "tampered".equalsIgnoreCase(filename)) {
            try {
                return new ResponseEntity<AuditLog>(objectMapper.readValue("{\n  \"filename\" : \"" + filename + "\",\n  \"log\" : [ {\n    \"logMessage\" : \"bogus log message\",\n    \"user\" : \"ev1lha><0r\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"remoteIpAddress\" : \"bad.guy.vpn.IP\"\n  }, {\n    \"logMessage\" : \"logMessage2\",\n    \"user\" : \"user2\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"remoteIpAddress\" : \"4.3.2.1\"\n  } ],\n  \"isValid\" : false\n}", AuditLog.class), HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditLog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
        if (accept != null && accept.contains("application/json")) {
            try {
                if("system_audit_2020-05-28_04-24-32".equalsIgnoreCase(filename)) {
                    String retVal = "{\n"
                            + "  \"filename\" : \"system_audit_2020-05-28_04-24-32.log\",\n"
                            + "  \"log\" : ["
                            + "  {\n"
                            + "    \"logMessage\" : \"No license installed\",\n"
                            + "    \"user\" : \"system-process\",\n"
                            + "    \"timestamp\" : \"2020-05-28T04:25:18.000+00:00\",\n"
                            + "    \"remoteIpAddress\" : \"192.168.0.3\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"logMessage\" : \"EDM Server startup\",\n"
                            + "    \"user\" : \"system-process\",\n"
                            + "    \"timestamp\" : \"2020-05-28T04:25:18.000+00:00\",\n"
                            + "    \"remoteIpAddress\" : \"192.168.0.3\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"logMessage\" : \"DATABASE OBJECT : UPDATED: admin\",\n"
                            + "    \"user\" : \"system-process\",\n"
                            + "    \"timestamp\" : \"2020-05-28T04:25:49.000+00:00\",\n"
                            + "    \"remoteIpAddress\" : \"192.168.0.3\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"logMessage\" : \"AUTHENTICATION_SUCCESS\",\n"
                            + "    \"user\" : \"admin\",\n"
                            + "    \"timestamp\" : \"2020-05-28T04:25:49.000+00:00\",\n"
                            + "    \"remoteIpAddress\" : \"{details=com.accutive.edm.server.app.security.CustomWebAuthenticationDetails@43458: RemoteIpAddress: 0:0:0:0:0:0:0:1; SessionId: 6435FD03C5AE95A870293FB92F619909: ServerUrls: localhost; }\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"logMessage\" : \"DATABASE OBJECT : UPDATED: admin\",\n"
                            + "    \"user\" : \"system-process\",\n"
                            + "    \"timestamp\" : \"2020-05-28T04:26:02.000+00:00\",\n"
                            + "    \"remoteIpAddress\" : \"0:0:0:0:0:0:0:1\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"logMessage\" : \"Accutive License Declaration  Product licensed: ADM Licensed to: Accutive (accutive@accutive.com)  Server URL(s): [localhost, 127.0.0.1, ::1] License type: LIMITED Valid from: 11-Dec-2019 Valid through: 08-Dec-2020 Entitlements for this license:  Type: Annual Subtype: License Feature: Accutive Data Discovery Count: 1000 Valid from: 09-Dec-2019 Valid through: 08-Dec-2020 Type: Annual Subtype: License Feature: Accutive Data Masking Count: 1000 Valid from: 09-Dec-2019 Valid through: 08-Dec-2020 Type: Any Database Subtype: Database Feature: Accutive Data Discovery Count: 1000 Valid from: 09-Dec-2019 Valid through: 08-Dec-2020 Type: Any Database Subtype: Database Feature: Accutive Data Masking Count: 1000 Valid from: 09-Dec-2019 Valid through: 08-Dec-2020\",\n"
                            + "    \"user\" : \"admin\",\n"
                            + "    \"timestamp\" : \"2020-05-28T04:26:19.000+00:00\",\n"
                            + "    \"remoteIpAddress\" : \"0:0:0:0:0:0:0:1\"\n"
                            + "  },"
//                        + "  {\n"
//                        + "    \"logMessage\" : \"DATABASE OBJECT : UPDATED: ApplicationSettings(id=1, version=2, licenseUseage={\"featureUseCounts\":{\"AccutiveDataMasking:AnyDatabase:Database\":0,\"AccutiveDataDiscovery:AnyDatabase:Database\":0,\"AccutiveDataDiscovery:Annual:License\":0,\"AccutiveDataMasking:Annual:License\":0}}, keyName=DEFAULT_AES, forgotpasswordSubject=Password reset request, forgotpasswordSignature=https://accutive.com, maxQueuedProjects=6, submitTimeoutSeconds=10, maxParallelThreads=4, maxConcurrentSize=10, maxConcurrentBatches=4, batchSizeRows=1000, tablesPerProcessor=4, idleSaveDelay=15s, idleCloseDelay=10m, accountLockType=delay, maxFailedLogins=3, delayTimeSeconds=60, installVersion=2019-07, dbVersion=2020/2 GA)\",\n"
//                        + "    \"user\" : \"admin\",\n"
//                        + "    \"timestamp\" : \"2020-05-28T04:26:19.000+00:00\",\n"
//                        + "    \"remoteIpAddress\" : \"0:0:0:0:0:0:0:1\"\n"
//                        + "  },"
                            + "  {\n"
                            + "    \"logMessage\" : \"DATABASE OBJECT : UPDATED: admin\",\n"
                            + "    \"user\" : \"admin\",\n"
                            + "    \"timestamp\" : \"2020-05-28T04:26:37.000+00:00\",\n"
                            + "    \"remoteIpAddress\" : \"192.168.0.3\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"logMessage\" : \"AUTHENTICATION_SUCCESS\",\n"
                            + "    \"user\" : \"admin\",\n"
                            + "    \"timestamp\" : \"2020-05-28T04:26:37.000+00:00\",\n"
                            + "    \"remoteIpAddress\" : \"{details=com.accutive.edm.server.app.security.CustomWebAuthenticationDetails@64e84: RemoteIpAddress: 0:0:0:0:0:0:0:1; SessionId: 9EA0D6E0CD6DE2AFD674A37B12181E31: ServerUrls: localhost; }\"\n"
                            + "  }"
                            + " ],\n"
                            + " \"isValid\" : true\n"
                            + "}";

                    return new ResponseEntity<AuditLog>(objectMapper.readValue(retVal, AuditLog.class), HttpStatus.OK);
                } else {
                    return new ResponseEntity<AuditLog>(HttpStatus.NOT_FOUND);
                }
                //return new ResponseEntity<AuditLog>(objectMapper.readValue("{\n  \"filename\" : \"" + filename + "\",\n  \"log\" : [ {\n    \"logMessage\" : \"logMessage1\",\n    \"user\" : \"user\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"remoteIpAddress\" : \"1.2.3.4\"\n  }, {\n    \"logMessage\" : \"logMessage2\",\n    \"user\" : \"user2\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"remoteIpAddress\" : \"4.3.2.1\"\n  } ],\n  \"isValid\" : true\n}", AuditLog.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditLog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditLog>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuditLog> getCurrentAuditLog() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                String retVal = "{\n"
                        + "  \"filename\" : \"system_audit_2020-05-28_04-24-32.log\",\n"
                        + "  \"log\" : ["
                        + "  {\n"
                        + "    \"logMessage\" : \"No license installed\",\n"
                        + "    \"user\" : \"system-process\",\n"
                        + "    \"timestamp\" : \"2020-05-28T04:25:18.000+00:00\",\n"
                        + "    \"remoteIpAddress\" : \"192.168.0.3\"\n"
                        + "  },"
                        + "  {\n"
                        + "    \"logMessage\" : \"EDM Server startup\",\n"
                        + "    \"user\" : \"system-process\",\n"
                        + "    \"timestamp\" : \"2020-05-28T04:25:18.000+00:00\",\n"
                        + "    \"remoteIpAddress\" : \"192.168.0.3\"\n"
                        + "  },"
                        + "  {\n"
                        + "    \"logMessage\" : \"DATABASE OBJECT : UPDATED: admin\",\n"
                        + "    \"user\" : \"system-process\",\n"
                        + "    \"timestamp\" : \"2020-05-28T04:25:49.000+00:00\",\n"
                        + "    \"remoteIpAddress\" : \"192.168.0.3\"\n"
                        + "  },"
                        + "  {\n"
                        + "    \"logMessage\" : \"AUTHENTICATION_SUCCESS\",\n"
                        + "    \"user\" : \"admin\",\n"
                        + "    \"timestamp\" : \"2020-05-28T04:25:49.000+00:00\",\n"
                        + "    \"remoteIpAddress\" : \"{details=com.accutive.edm.server.app.security.CustomWebAuthenticationDetails@43458: RemoteIpAddress: 0:0:0:0:0:0:0:1; SessionId: 6435FD03C5AE95A870293FB92F619909: ServerUrls: localhost; }\"\n"
                        + "  },"
                        + "  {\n"
                        + "    \"logMessage\" : \"DATABASE OBJECT : UPDATED: admin\",\n"
                        + "    \"user\" : \"system-process\",\n"
                        + "    \"timestamp\" : \"2020-05-28T04:26:02.000+00:00\",\n"
                        + "    \"remoteIpAddress\" : \"0:0:0:0:0:0:0:1\"\n"
                        + "  },"
                        + "  {\n"
                        + "    \"logMessage\" : \"Accutive License Declaration  Product licensed: ADM Licensed to: Accutive (accutive@accutive.com)  Server URL(s): [localhost, 127.0.0.1, ::1] License type: LIMITED Valid from: 11-Dec-2019 Valid through: 08-Dec-2020 Entitlements for this license:  Type: Annual Subtype: License Feature: Accutive Data Discovery Count: 1000 Valid from: 09-Dec-2019 Valid through: 08-Dec-2020 Type: Annual Subtype: License Feature: Accutive Data Masking Count: 1000 Valid from: 09-Dec-2019 Valid through: 08-Dec-2020 Type: Any Database Subtype: Database Feature: Accutive Data Discovery Count: 1000 Valid from: 09-Dec-2019 Valid through: 08-Dec-2020 Type: Any Database Subtype: Database Feature: Accutive Data Masking Count: 1000 Valid from: 09-Dec-2019 Valid through: 08-Dec-2020\",\n"
                        + "    \"user\" : \"admin\",\n"
                        + "    \"timestamp\" : \"2020-05-28T04:26:19.000+00:00\",\n"
                        + "    \"remoteIpAddress\" : \"0:0:0:0:0:0:0:1\"\n"
                        + "  },"
//                        + "  {\n"
//                        + "    \"logMessage\" : \"DATABASE OBJECT : UPDATED: ApplicationSettings(id=1, version=2, licenseUseage={\"featureUseCounts\":{\"AccutiveDataMasking:AnyDatabase:Database\":0,\"AccutiveDataDiscovery:AnyDatabase:Database\":0,\"AccutiveDataDiscovery:Annual:License\":0,\"AccutiveDataMasking:Annual:License\":0}}, keyName=DEFAULT_AES, forgotpasswordSubject=Password reset request, forgotpasswordSignature=https://accutive.com, maxQueuedProjects=6, submitTimeoutSeconds=10, maxParallelThreads=4, maxConcurrentSize=10, maxConcurrentBatches=4, batchSizeRows=1000, tablesPerProcessor=4, idleSaveDelay=15s, idleCloseDelay=10m, accountLockType=delay, maxFailedLogins=3, delayTimeSeconds=60, installVersion=2019-07, dbVersion=2020/2 GA)\",\n"
//                        + "    \"user\" : \"admin\",\n"
//                        + "    \"timestamp\" : \"2020-05-28T04:26:19.000+00:00\",\n"
//                        + "    \"remoteIpAddress\" : \"0:0:0:0:0:0:0:1\"\n"
//                        + "  },"
                        + "  {\n"
                        + "    \"logMessage\" : \"DATABASE OBJECT : UPDATED: admin\",\n"
                        + "    \"user\" : \"admin\",\n"
                        + "    \"timestamp\" : \"2020-05-28T04:26:37.000+00:00\",\n"
                        + "    \"remoteIpAddress\" : \"192.168.0.3\"\n"
                        + "  },"
                        + "  {\n"
                        + "    \"logMessage\" : \"AUTHENTICATION_SUCCESS\",\n"
                        + "    \"user\" : \"admin\",\n"
                        + "    \"timestamp\" : \"2020-05-28T04:26:37.000+00:00\",\n"
                        + "    \"remoteIpAddress\" : \"{details=com.accutive.edm.server.app.security.CustomWebAuthenticationDetails@64e84: RemoteIpAddress: 0:0:0:0:0:0:0:1; SessionId: 9EA0D6E0CD6DE2AFD674A37B12181E31: ServerUrls: localhost; }\"\n"
                        + "  }"
                        + " ],\n"
                        + " \"isValid\" : true\n"
                        + "}";

                return new ResponseEntity<AuditLog>(objectMapper.readValue(retVal, AuditLog.class), HttpStatus.OK);

                //return new ResponseEntity<AuditLog>(objectMapper.readValue("{\n  \"filename\" : \"currentlog\",\n  \"log\" : [ {\n    \"logMessage\" : \"logMessage1\",\n    \"user\" : \"user\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"remoteIpAddress\" : \"1.2.3.4\"\n  }, {\n    \"logMessage\" : \"logMessage2\",\n    \"user\" : \"user2\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"remoteIpAddress\" : \"4.3.2.1\"\n  } ],\n  \"isValid\" : true\n}", AuditLog.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuditLog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuditLog>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<DiscoveryConfig>> getDiscoveries() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                String retVal = "[ {\n"
                        + "  \"name\" : \"Test Discovery Config\",\n"
                        + "  \"description\" : \"Testing the discovery process\",\n"
                        + "  \"id\" : 1\n"
                        + "} ]";
                return new ResponseEntity<List<DiscoveryConfig>>(objectMapper.readValue(retVal, List.class), HttpStatus.OK);

                //return new ResponseEntity<List<DiscoveryConfig>>(objectMapper.readValue("[ {\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : 7\n}, {\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : 7\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<DiscoveryConfig>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<DiscoveryConfig>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<DiscoveryReport> getDiscoveryReport(@ApiParam(value = "ID of the discovery config",required=true) @PathVariable("discoveryID") Integer discoveryID
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                if(discoveryID == 1) {
                    String retVal = "{\n"
                            + "  \"dateRun\" : \"2020-07-06T14:02:45.000+00:00\",\n"
                            + "  \"id\" : 1,\n"
                            + "  \"results\" : [ {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : false,\n"
                            + "    \"column\" : \"id\",\n"
                            + "    \"scanValueMatch\" : false,\n"
                            + "    \"table\" : \"data\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : false,\n"
                            + "    \"column\" : \"name\",\n"
                            + "    \"scanValueMatch\" : false,\n"
                            + "    \"table\" : \"data\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : false,\n"
                            + "    \"column\" : \"value\",\n"
                            + "    \"scanValueMatch\" : false,\n"
                            + "    \"table\" : \"data\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : false,\n"
                            + "    \"column\" : \"id\",\n"
                            + "    \"scanValueMatch\" : false,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"customer_number\",\n"
                            + "    \"scanValueMatch\" : false,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"first_name\",\n"
                            + "    \"scanValueMatch\" : true,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"middle_name\",\n"
                            + "    \"scanValueMatch\" : false,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"last_name\",\n"
                            + "    \"scanValueMatch\" : true,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"gender\",\n"
                            + "    \"scanValueMatch\" : false,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"company\",\n"
                            + "    \"scanValueMatch\" : false,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"email\",\n"
                            + "    \"scanValueMatch\" : true,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"dob\",\n"
                            + "    \"scanValueMatch\" : false,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"phone\",\n"
                            + "    \"scanValueMatch\" : true,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"ssn\",\n"
                            + "    \"scanValueMatch\" : true,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"cc_num\",\n"
                            + "    \"scanValueMatch\" : true,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"addr1\",\n"
                            + "    \"scanValueMatch\" : true,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"addr2\",\n"
                            + "    \"scanValueMatch\" : false,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"city\",\n"
                            + "    \"scanValueMatch\" : true,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"state\",\n"
                            + "    \"scanValueMatch\" : true,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"county\",\n"
                            + "    \"scanValueMatch\" : true,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"state_abbr\",\n"
                            + "    \"scanValueMatch\" : false,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"schema\" : \"test\",\n"
                            + "    \"scanFieldMatch\" : true,\n"
                            + "    \"column\" : \"postal_code\",\n"
                            + "    \"scanValueMatch\" : true,\n"
                            + "    \"table\" : \"customer\"\n"
                            + "  }"
                            + " ]\n}";

                    return new ResponseEntity<DiscoveryReport>(objectMapper.readValue(retVal, DiscoveryReport.class), HttpStatus.OK);
                    //return new ResponseEntity<DiscoveryReport>(objectMapper.readValue("{\n  \"dateRun\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"id\" : 8,\n  \"results\" : [ {\n    \"schema\" : \"schema\",\n    \"scanFieldMatch\" : true,\n    \"column\" : \"column\",\n    \"scanValueMatch\" : true,\n    \"table\" : \"table\"\n  }, {\n    \"schema\" : \"schema\",\n    \"scanFieldMatch\" : true,\n    \"column\" : \"column\",\n    \"scanValueMatch\" : true,\n    \"table\" : \"table\"\n  } ]\n}", DiscoveryReport.class), HttpStatus.NOT_IMPLEMENTED);
                } else {
                    return new ResponseEntity<DiscoveryReport>(HttpStatus.NOT_FOUND);
                }
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<DiscoveryReport>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<DiscoveryReport>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MatchFieldNames> getFieldNameMatches(@ApiParam(value = "Field names to check for sensitive strings" ,required=true )  @Valid @RequestBody List<InputData> body
,@NotNull @ApiParam(value = "One or more scan group name(s) to use (NOTE: Only scan field matchers will be used. Scan value matchers will be ignored)", required = true) @Valid @RequestParam(value = "group", required = true) List<String> group
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MatchFieldNames>(objectMapper.readValue("{\n  \"suggestedOperator\" : \"suggestedOperator\",\n  \"name\" : \"name\"\n}", MatchFieldNames.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MatchFieldNames>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MatchFieldNames>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MatchFieldValues> getFieldValueMatches(@ApiParam(value = "Data values to check for sensitive data matches" ,required=true )  @Valid @RequestBody List<InputData> body
,@NotNull @ApiParam(value = "Array of scan group names to use.", required = true) @Valid @RequestParam(value = "group", required = true) List<String> group
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MatchFieldValues>(objectMapper.readValue("{\n  \"suggestedOperator\" : \"suggestedOperator\",\n  \"name\" : \"name\"\n}", MatchFieldValues.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MatchFieldValues>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MatchFieldValues>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Job>> getJobs() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                String retVal = "[ {\n"
                        + "  \"cron\" : \"0 0 * * 5\",\n"
                        + "  \"nextRuntime\" : \"2020-07-03T00:00:00.000+00:00\",\n"
                        + "  \"endsOnDate\" : \"2020-10-30T00:00:00.000+00:00\",\n"
                        + "  \"name\" : \"Test Schedule\",\n"
                        + "  \"description\" : \"Testing weekly schedule\",\n"
                        + "  \"id\" : 1,\n  \"status\" : \"ACTIVE\"\n"
                        + "} ]";
                return new ResponseEntity<List<Job>>(objectMapper.readValue(retVal, List.class), HttpStatus.OK);
                //return new ResponseEntity<List<Job>>(objectMapper.readValue("[ {\n  \"cron\" : \"cron\",\n  \"nextRuntime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"endsOnDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : 9,\n  \"status\" : \"ACTIVE\"\n}, {\n  \"cron\" : \"cron\",\n  \"nextRuntime\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"endsOnDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : 9,\n  \"status\" : \"ACTIVE\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Job>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Job>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<AuditLogList>> getAuditLogList() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                String retVal = "[ {\n"
                        + "  \"filename\" : \"system_audit_2020-05-28_04-24-32.log\",\n"
                        + "  \"timestamp\" : \"2020-05-06T04:24:32.000+00:00\"\n"
                        + "} ]";
                return new ResponseEntity<List<AuditLogList>>(objectMapper.readValue(retVal, List.class), HttpStatus.OK);

                //return new ResponseEntity<List<AuditLogList>>(objectMapper.readValue("[ {\n  \"filename\" : \"filename\",\n  \"timestamp\" : \"timestamp\"\n}, {\n  \"filename\" : \"filename\",\n  \"timestamp\" : \"timestamp\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<AuditLogList>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<AuditLogList>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<MaskingConfiguration>> getMaskingConfigurationsList() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                String retVal = "[ {\n"
                        + "  \"name\" : \"Test Masking\",\n"
                        + "  \"description\" : \"Test of the masking config\",\n"
                        + "  \"id\" : \"1\",\n"
                        + "  \"parameters\" : [\n"
                        + " {\"sourceid\" : \"1\" },\n"
                        + " {\"destinationid\" : \"2\" },\n"
                        + " {\"tableoperation\" : \"COPY\" },\n"
                        + " {\"disableconstraints\" : \"true\" }\n"
                        + " ]\n} ]";
                return new ResponseEntity<List<MaskingConfiguration>>(objectMapper.readValue(retVal, List.class), HttpStatus.OK);
                //return new ResponseEntity<List<MaskingConfiguration>>(objectMapper.readValue("[ {\n  \"name\" : \"name\",\n  \"id\" : 4,\n  \"properties\" : [ \"properties\", \"properties\" ]\n}, {\n  \"name\" : \"name\",\n  \"id\" : 4,\n  \"properties\" : [ \"properties\", \"properties\" ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<MaskingConfiguration>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<MaskingConfiguration>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<MaskingOperation>> getMaskingOperationsList() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<MaskingOperation>>(objectMapper.readValue("[ {\n  \"name\" : \"name\",\n  \"id\" : 23,\n  \"parameters\" : [ \"parameters\", \"parameters\" ]\n}, {\n  \"name\" : \"name\",\n  \"id\" : 23,\n  \"parameters\" : [ \"parameters\", \"parameters\" ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<MaskingOperation>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<MaskingOperation>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Masklink>> getMasklinkList() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Masklink>>(objectMapper.readValue("[ {\n  \"name\" : \"name\",\n  \"id\" : 2\n}, {\n  \"name\" : \"name\",\n  \"id\" : 2\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Masklink>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Masklink>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Project>> getProjects() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                String retVal = "[{\n"
                        + "  \"latestReport\" : \"a26d3370-d4e0-11ea-87d0-0242ac130003\",\n"
                        + "  \"discoverConfigs\" : ["
                        + " {\n"
                        + "    \"name\" : \"Discovery1\",\n"
                        + "    \"description\" : \"Testing Discovery\",\n"
                        + "    \"id\" : 1\n"
                        + "  }"
                        + " ],\n"
                        + "  \"id\" : 1,\n"
                        + "  \"name\" : \"Test UAT Masking\",\n"
                        + "  \"description\" : \"Testing masking on UAT\",\n"
                        + "  \"lastRunDate\" : \"2020-07-06T14:02:45.000+00:00\",\n"
                        + "  \"maskingConfigs\" : ["
                        + "  {\n"
                        + "    \"name\" : \"My Masking Config\",\n"
                        + "    \"description\" : \"First atttempt at building a masking config\",\n"
                        + "    \"id\" : 1,\n"
                        + "    \"properties\" : ["
                        + "      {\"sourceid\" : \"1\"},\n"
                        + "      {\"destinationid\" : \"2\"},\n"
                        + "      {\"tableoperation\" : \"COPY\"},\n"
                        + "      {\"disableconstraints\" : \"true\"}\n"
                        + "    ]\n"
                        + "	 }]\n"
                        + "}]";
                return new ResponseEntity<List<Project>>(objectMapper.readValue(retVal, List.class), HttpStatus.OK);                //return new ResponseEntity<List<Project>>(objectMapper.readValue("[ {\n  \"latestReport\" : \"a26d3370-d4e0-11ea-87d0-0242ac130003\",\n  \"discoverConfigs\" : [ {\n    \"name\" : \"Discovery1\",\n    \"description\" : \"Testing Discovery\",\n    \"id\" : 1\n  }, {\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : 7\n  } ],\n  \"name\" : \"Test UAT Masking\",\n  \"description\" : \"Testing masking on UAT\",\n  \"lastRunDate\" : \"2020-07-06T14:02:45.000+00:00\",\n  \"maskingConfigs\" : [ {\n    \"name\" : \"My Masking Config\",\n    \"description\" : \"First atttempt at building a masking config\",\n    \"id\" : 4,\n    \"properties\" : [ \"properties\", \"properties\" ]\n  }, {\n    \"name\" : \"My Masking Config\",\n    \"description\" : \"First atttempt at building a masking config\",\n    \"id\" : 4,\n    \"properties\" : [ \"properties\", \"properties\" ]\n  } ],\n  \"id\" : 5\n}, {\n  \"latestReport\" : \"a26d3370-d4e0-11ea-87d0-0242ac130003\",\n  \"discoverConfigs\" : [ {\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : 7\n  }, {\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : 7\n  } ],\n  \"name\" : \"Demo Project\",\n  \"description\" : \"Demonstrates project setup\",\n  \"lastRunDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"maskingConfigs\" : [ {\n    \"name\" : \"My Masking Config\",\n    \"description\" : \"First atttempt at building a masking config\",\n    \"id\" : 4,\n    \"properties\" : [ \"properties\", \"properties\" ]\n  }, {\n    \"name\" : \"My Masking Config\",\n    \"description\" : \"First atttempt at building a masking config\",\n    \"id\" : 4,\n    \"properties\" : [ \"properties\", \"properties\" ]\n  } ],\n  \"id\" : 5\n} ]", List.class), HttpStatus.OK);

                //return new ResponseEntity<List<Project>>(objectMapper.readValue("[ {\n  \"latestReport\" : \"a26d3370-d4e0-11ea-87d0-0242ac130003\",\n  \"name\" : \"Test UAT Masking\",\n  \"lastRunDate\" : \"2020-06-21T09:56:07.000+00:00\",\n  \"id\" : 1\n}, {\n  \"latestReport\" : \"08f2ab91-43c8-41a4-a2f0-80a8698a7bc3\",\n  \"name\" : \"Production Masking\",\n  \"lastRunDate\" : \"2020-07-02T10:26:14.000+00:00\",\n  \"id\" : 2\n} ]", List.class), HttpStatus.OK);
                //return new ResponseEntity<List<Project>>(objectMapper.readValue("[ {\n  \"latestReport\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"discoverConfigs\" : [ {\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : 7\n  }, {\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : 7\n  } ],\n  \"name\" : \"Demo Project\",\n  \"description\" : \"Demonstrates project setup\",\n  \"lastRunDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"maskingConfigs\" : [ {\n    \"name\" : \"My Masking Config\",\n    \"description\" : \"First atttempt at building a masking config\",\n    \"id\" : 4,\n    \"properties\" : [ \"properties\", \"properties\" ]\n  }, {\n    \"name\" : \"My Masking Config\",\n    \"description\" : \"First atttempt at building a masking config\",\n    \"id\" : 4,\n    \"properties\" : [ \"properties\", \"properties\" ]\n  } ],\n  \"id\" : 5\n}, {\n  \"latestReport\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"discoverConfigs\" : [ {\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : 7\n  }, {\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : 7\n  } ],\n  \"name\" : \"Demo Project\",\n  \"description\" : \"Demonstrates project setup\",\n  \"lastRunDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"maskingConfigs\" : [ {\n    \"name\" : \"My Masking Config\",\n    \"description\" : \"First atttempt at building a masking config\",\n    \"id\" : 4,\n    \"properties\" : [ \"properties\", \"properties\" ]\n  }, {\n    \"name\" : \"My Masking Config\",\n    \"description\" : \"First atttempt at building a masking config\",\n    \"id\" : 4,\n    \"properties\" : [ \"properties\", \"properties\" ]\n  } ],\n  \"id\" : 5\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Project>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Project>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProjectReport> getReportByProjectReportID(@ApiParam(value = "ID of the project report to retrieve.",required=true) @PathVariable("projectReportID") UUID projectReportID
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                UUID report1UUID = UUID.fromString("a26d3370-d4e0-11ea-87d0-0242ac130003");
                UUID report2UUID = UUID.fromString("08f2ab91-43c8-41a4-a2f0-80a8698a7bc3");
                if(projectReportID.equals(report1UUID)) {
                    String retVal = "{\n  \"stats\" : "
                            + "[ {\n"
                            + "    \"completedTasks\" : 1,\n"
                            + "    \"name\" : \"Test UAT Masking\",\n"
                            + "    \"startTime\" : \"2020-07-06T16:02:45.000+00:00\",\n"
                            + "    \"totalTasks\" : 1,\n"
                            + "    \"endTime\" : \"2020-07-06T16:02:03.000+00:00\",\n"
                            + "    \"type\" : \"MaskingConfig\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"completedTasks\" : 2,\n"
                            + "    \"name\" : \"UATDB\",\n"
                            + "    \"startTime\" : \"2020-07-06T16:02:45.000+00:00\",\n"
                            + "    \"totalTasks\" : 2,\n"
                            + "    \"endTime\" : \"2020-07-06T16:03:03.000+00:00\",\n"
                            + "    \"type\" : \"SchemaOperatorConfig\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"completedTasks\" : 1000000,\n"
                            + "    \"name\" : \"Customer\",\n"
                            + "    \"startTime\" : \"2020-07-06T16:02:46.000+00:00\",\n"
                            + "    \"totalTasks\" : 1000000,\n"
                            + "    \"endTime\" : \"2020-07-06T16:03:03.000+00:00\",\n"
                            + "    \"type\" : \"Table\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"completedTasks\" : 56,\n"
                            + "    \"name\" : \"Data\",\n"
                            + "    \"startTime\" : \"2020-07-06T16:02:46.000+00:00\",\n"
                            + "    \"totalTasks\" : 56,\n"
                            + "    \"endTime\" : \"2020-07-06T16:02:46.000+00:00\",\n"
                            + "    \"type\" : \"Table\"\n"
                            + "  }"
                            + "],\n"
                            + "  \"messages\" : [ {\n"
                            + "    \"id\" : 1,\n"
                            + "    \"message\" : \"Starting masking for project Test UAT Masking\",\n"
                            + "    \"type\" : \"MARK\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:32.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"id\" : 2,\n"
                            + "    \"message\" : \"Preparing Connections\",\n"
                            + "    \"type\" : \"LOG\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:45.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"id\" : 3,\n"
                            + "    \"message\" : \"Source Connection UATDB registered\",\n"
                            + "    \"type\" : \"LOG\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:45.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"id\" : 4,\n"
                            + "    \"message\" : \"Masking process is set for inplace schema.  Current schema will be masked\",\n"
                            + "    \"type\" : \"LOG\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:45.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"id\" : 5,\n"
                            + "    \"message\" : \"Starting masking for position 0: Test UAT Masking\",\n"
                            + "    \"type\" : \"MARK\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:45.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"id\" : 6,\n"
                            + "    \"message\" : \"Completed masking for position 0: Test UAT Masking\",\n"
                            + "    \"type\" : \"MARK\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"id\" : 7,\n"
                            + "    \"message\" : \"Completed masking for project Test UAT Masking\",\n"
                            + "    \"type\" : \"MARK\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  }"
                            + " ],\n"
                            + "  \"dateRun\" : \"2020-07-06T16:02:32.000+00:00\",\n"
                            + "  \"marks\" : [ {\n"
                            + "    \"message\" : \"Starting masking for project Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:32.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Starting masking for position 0: Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:45.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Completed masking for position 0: Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Completed masking for position 0: Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Completed masking for project Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Processing schema UATDB\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Processing Test UAT Masking interrupted by cancel message\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Starting query on source table\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Strting records processor(s) for table customer\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  }"
                            + " ],\n"
                            + "  \"uuid\" : \"a26d3370-d4e0-11ea-87d0-0242ac130003\",\n"
                            + "  \"logs\" : [ \n"
                            + "  {\n"
                            + "    \"message\" : \"Masking process is set for inplace schema.  Current schema will be masked\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Processing tables for level 1\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Opening new data context for Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Opening new data context for Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Closing data context\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Closing data context\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Enabling constraints\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Table data has no executable table-level operator configured\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"No field-level configuration found for table. No masking will be performed.\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Table demo.customer has 1000000 total rows to be processed\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Table customer has no executable table-level operator configured\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Opening new data context for Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Masking Config Test UAT Masking - processing table customer\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Opening new data context for Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Opening new data context for Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Opening new data context for Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Processed a total of 1000000 records\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Closing data context\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Closing data context\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Closing data context\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Closing data context\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  }"
                            + " ],\n"
                            + "  \"sqlFailures\" : [ null, null ],\n"
                            + "  \"errors\" : [ null, null ],\n"
                            + "  \"sql\" : [ {\n"
                            + "    \"command\" : \"SELECT `customer`.`id`, `customer`.`customer_number`, `customer`.`first_name`, `customer`.`middle_name`, `customer`.`last_name`, `customer`.`gender`, `customer`.`company`, `customer`.`email`, `customer`.`dob`, `customer`.`phone`, `customer`.`sin`, `customer`.`cc_num`, `customer`.`addr1`, `customer`.`addr2`, `customer`.`city`, `customer`.`province`, `customer`.`county`, `customer`.`state_abbr`, `customer`.`postal_code` FROM demo.`customer`\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  } ]\n}";
                    return new ResponseEntity<ProjectReport>(objectMapper.readValue(retVal, ProjectReport.class), HttpStatus.OK);


                } else if (accept.equals("08f2ab91-43c8-41a4-a2f0-80a8698a7bc3")) {
                    String retVal = "{\n  \"stats\" : "
                            + "[ {\n"
                            + "    \"completedTasks\" : 1,\n"
                            + "    \"name\" : \"Test UAT Masking\",\n"
                            + "    \"startTime\" : \"2020-07-06T16:02:45.000+00:00\",\n"
                            + "    \"totalTasks\" : 1,\n"
                            + "    \"endTime\" : \"2020-07-06T16:02:03.000+00:00\",\n"
                            + "    \"type\" : \"MaskingConfig\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"completedTasks\" : 2,\n"
                            + "    \"name\" : \"UATDB\",\n"
                            + "    \"startTime\" : \"2020-07-06T16:02:45.000+00:00\",\n"
                            + "    \"totalTasks\" : 2,\n"
                            + "    \"endTime\" : \"2020-07-06T16:03:03.000+00:00\",\n"
                            + "    \"type\" : \"SchemaOperatorConfig\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"completedTasks\" : 1000000,\n"
                            + "    \"name\" : \"Customer\",\n"
                            + "    \"startTime\" : \"2020-07-06T16:02:46.000+00:00\",\n"
                            + "    \"totalTasks\" : 1000000,\n"
                            + "    \"endTime\" : \"2020-07-06T16:03:03.000+00:00\",\n"
                            + "    \"type\" : \"Table\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"completedTasks\" : 56,\n"
                            + "    \"name\" : \"Data\",\n"
                            + "    \"startTime\" : \"2020-07-06T16:02:46.000+00:00\",\n"
                            + "    \"totalTasks\" : 56,\n"
                            + "    \"endTime\" : \"2020-07-06T16:02:46.000+00:00\",\n"
                            + "    \"type\" : \"Table\"\n"
                            + "  }"
                            + "],\n"
                            + "  \"messages\" : [ {\n"
                            + "    \"id\" : 1,\n"
                            + "    \"message\" : \"Starting masking for project Test UAT Masking\",\n"
                            + "    \"type\" : \"MARK\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:32.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"id\" : 2,\n"
                            + "    \"message\" : \"Preparing Connections\",\n"
                            + "    \"type\" : \"LOG\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:45.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"id\" : 3,\n"
                            + "    \"message\" : \"Source Connection UATDB registered\",\n"
                            + "    \"type\" : \"LOG\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:45.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"id\" : 4,\n"
                            + "    \"message\" : \"Masking process is set for inplace schema.  Current schema will be masked\",\n"
                            + "    \"type\" : \"LOG\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:45.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"id\" : 5,\n"
                            + "    \"message\" : \"Starting masking for position 0: Test UAT Masking\",\n"
                            + "    \"type\" : \"MARK\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:45.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"id\" : 6,\n"
                            + "    \"message\" : \"Completed masking for position 0: Test UAT Masking\",\n"
                            + "    \"type\" : \"MARK\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"id\" : 7,\n"
                            + "    \"message\" : \"Completed masking for project Test UAT Masking\",\n"
                            + "    \"type\" : \"MARK\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  }"
                            + " ],\n"
                            + "  \"dateRun\" : \"2020-07-06T16:02:32.000+00:00\",\n"
                            + "  \"marks\" : [ {\n"
                            + "    \"message\" : \"Starting masking for project Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:32.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Starting masking for position 0: Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:45.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Completed masking for position 0: Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Completed masking for position 0: Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Completed masking for project Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Processing schema UATDB\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Processing Test UAT Masking interrupted by cancel message\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Starting query on source table\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + " {\n"
                            + "    \"message\" : \"Strting records processor(s) for table customer\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  }"
                            + " ],\n"
                            + "  \"uuid\" : \"a26d3370-d4e0-11ea-87d0-0242ac130003\",\n"
                            + "  \"logs\" : [ \n"
                            + "  {\n"
                            + "    \"message\" : \"Masking process is set for inplace schema.  Current schema will be masked\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Processing tables for level 1\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Opening new data context for Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Opening new data context for Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Closing data context\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Closing data context\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Enabling constraints\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Table data has no executable table-level operator configured\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"No field-level configuration found for table. No masking will be performed.\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Table demo.customer has 1000000 total rows to be processed\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Table customer has no executable table-level operator configured\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Opening new data context for Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Masking Config Test UAT Masking - processing table customer\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Opening new data context for Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Opening new data context for Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Opening new data context for Test UAT Masking\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:02:49.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Processed a total of 1000000 records\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Closing data context\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Closing data context\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Closing data context\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  },"
                            + "  {\n"
                            + "    \"message\" : \"Closing data context\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  }"
                            + " ],\n"
                            + "  \"sqlFailures\" : [ null, null ],\n"
                            + "  \"errors\" : [ null, null ],\n"
                            + "  \"sql\" : [ {\n"
                            + "    \"command\" : \"SELECT `customer`.`id`, `customer`.`customer_number`, `customer`.`first_name`, `customer`.`middle_name`, `customer`.`last_name`, `customer`.`gender`, `customer`.`company`, `customer`.`email`, `customer`.`dob`, `customer`.`phone`, `customer`.`sin`, `customer`.`cc_num`, `customer`.`addr1`, `customer`.`addr2`, `customer`.`city`, `customer`.`province`, `customer`.`county`, `customer`.`state_abbr`, `customer`.`postal_code` FROM demo.`customer`\",\n"
                            + "    \"timestamp\" : \"2020-07-06T16:03:03.000+00:00\"\n"
                            + "  } ]\n}";
                    return new ResponseEntity<ProjectReport>(objectMapper.readValue(retVal, ProjectReport.class), HttpStatus.OK);

                } else {
                    return new ResponseEntity<ProjectReport>(HttpStatus.NOT_FOUND);
                }
                //return new ResponseEntity<ProjectReport>(objectMapper.readValue("{\n  \"stats\" : [ {\n    \"completedTasks\" : 42,\n    \"name\" : \"name\",\n    \"startTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"totalTasks\" : 42,\n    \"endTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"type\" : \"type\"\n  }, {\n    \"completedTasks\" : 42,\n    \"name\" : \"name\",\n    \"startTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"totalTasks\" : 42,\n    \"endTime\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"type\" : \"type\"\n  } ],\n  \"messages\" : [ {\n    \"id\" : 1,\n    \"message\" : \"message\",\n    \"type\" : \"MARK\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"id\" : 1,\n    \"message\" : \"message\",\n    \"type\" : \"MARK\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ],\n  \"dateRun\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"marks\" : [ {\n    \"message\" : \"message\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"message\" : \"message\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ],\n  \"uuid\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"logs\" : [ null, null ],\n  \"sqlFailures\" : [ {\n    \"id\" : \"id\",\n    \"message\" : \"message\",\n    \"command\" : \"command\",\n    \"fieldId\" : \"fieldId\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"id\" : \"id\",\n    \"message\" : \"message\",\n    \"command\" : \"command\",\n    \"fieldId\" : \"fieldId\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ],\n  \"errors\" : [ {\n    \"taskType\" : \"taskType\",\n    \"taskName\" : \"taskName\",\n    \"id\" : 1,\n    \"message\" : \"message\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"taskType\" : \"taskType\",\n    \"taskName\" : \"taskName\",\n    \"id\" : 1,\n    \"message\" : \"message\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ],\n  \"sql\" : [ {\n    \"command\" : \"command\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"command\" : \"command\",\n    \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ]\n}", ProjectReport.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProjectReport>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProjectReport>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ScanGroup>> getScanGroupNames() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                String retVal = "["
                        + " {\n"
                        + "  \"name\" : \"PII\",\n"
                        + "  \"id\" : 1\n"
                        + " },"
                        + " {\n"
                        + "  \"name\" : \"PCI\",\n"
                        + "  \"id\" : 2\n"
                        + " },"
                        + " {\n"
                        + "  \"name\" : \"HIPAA\",\n"
                        + "  \"id\" : 3\n"
                        + " },"
                        + " {\n"
                        + "  \"name\" : \"GDPR\",\n"
                        + "  \"id\" : 4\n"
                        + " },"
                        + " {\n"
                        + "  \"name\" : \"FERPA/COPPA\",\n"
                        + "  \"id\" : 5\n"
                        + " },"
                        + " {\n"
                        + "  \"name\" : \"CCPA\",\n"
                        + "  \"id\" : 6\n"
                        + " }"
                        + "]";
                return new ResponseEntity<List<ScanGroup>>(objectMapper.readValue(retVal, List.class), HttpStatus.OK);
                //return new ResponseEntity<List<ScanGroup>>(objectMapper.readValue("[ {\n  \"name\" : \"name\",\n  \"id\" : 6\n}, {\n  \"name\" : \"name\",\n  \"id\" : 6\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ScanGroup>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ScanGroup>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProjectReportList>> listReportByProjectID(@ApiParam(value = "ID of the project to query for reports.",required=true) @PathVariable("projectID") Integer projectID
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProjectReportList>>(objectMapper.readValue("[ {\n  \"date\" : \"2020-07-06T14:02:45.000+00:00\",\n  \"result\" : \"ok\",\n  \"id\" : \"a26d3370-d4e0-11ea-87d0-0242ac130003\"\n} ]", List.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProjectReportList>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProjectReportList>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MaskedData> maskData(@ApiParam(value = "Masking operation with parameters and data to be masked" ,required=true )  @Valid @RequestBody MaskValuesInput body
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<MaskedData>(objectMapper.readValue("{\n  \"maskedData\" : [ \"masked\", \"values\" ]\n}", MaskedData.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MaskedData>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MaskedData>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Resource> maskFile(@ApiParam(value = "") @RequestParam(value="projectID", required=false)  Integer projectID
,@ApiParam(value = "") @RequestParam(value="maskingConfigID", required=false)  Integer maskingConfigID
,@ApiParam(value = "file detail") @Valid @RequestPart("file") MultipartFile fileName
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Resource>(objectMapper.readValue("\"\"", Resource.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Resource>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Resource>(HttpStatus.NOT_IMPLEMENTED);
    }


    public ResponseEntity<RunJob> runDiscoveryJob(@ApiParam(value = "ID of the discovery config",required=true) @PathVariable("discoveryID") Integer discoveryID
,@ApiParam(value = "A JSON object containing optional callback URL information"  )  @Valid @RequestBody Body body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                if(discoveryID == 1) {
                    return new ResponseEntity<RunJob>(objectMapper.readValue("{\n  \"result\" : \"discovery operation submitted to queue\",\n  \"id\" : 1\n}", RunJob.class), HttpStatus.OK);
                } else {
                    return new ResponseEntity<RunJob>(HttpStatus.NOT_FOUND);
                }
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RunJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RunJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RunJob> runJobByJobID(@ApiParam(value = "ID of the job to run.",required=true) @PathVariable("jobID") Integer jobID
,@ApiParam(value = "A JSON object containing optional callback URL information"  )  @Valid @RequestBody Body body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                if(jobID == 1) {
                    return new ResponseEntity<RunJob>(objectMapper.readValue("{\n  \"result\" : \"job submitted for processing\",\n  \"id\" : 1\n}", RunJob.class), HttpStatus.OK);
                } else {
                    return new ResponseEntity<RunJob>(HttpStatus.NOT_FOUND);
                }
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RunJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RunJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RunJob> runProjectByProjectID(@ApiParam(value = "ID of the project to run.",required=true) @PathVariable("projectID") Integer projectID
,@ApiParam(value = ""  )  @Valid @RequestBody Body body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                if(projectID == 1) {
                    return new ResponseEntity<RunJob>(objectMapper.readValue("{\n  \"result\" : \"project queued for execution\",\n  \"id\" : 1\n}", RunJob.class), HttpStatus.OK);
                } else {
                    return new ResponseEntity<RunJob>(HttpStatus.NOT_FOUND);
                }
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RunJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RunJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServerRestart> serverRestart() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServerRestart>(objectMapper.readValue("{\n  \"result\" : \"Server restart initiated. All running and pending projects will be removed from queue.\"\n}", ServerRestart.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServerRestart>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServerRestart>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ServerStop> serverStop() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ServerStop>(objectMapper.readValue("{\n  \"result\" : \"Server shutdown initiated\"\n}", ServerStop.class), HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ServerStop>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ServerStop>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<StopProject> stopProjectByProjectID(@ApiParam(value = "ID of the project to stop.") @Valid @RequestParam(value = "projectID", required = false) Optional<Integer> projectID
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                Optional <Integer> op1 = Optional.of(1);
                if(projectID.equals(op1)) {
                    return new ResponseEntity<StopProject>(objectMapper.readValue("{\n  \"result\" : \"successful operation\",\n  \"id\" : 1\n}", StopProject.class), HttpStatus.OK);
                } else {
                    return new ResponseEntity<StopProject>(HttpStatus.NOT_FOUND);
                }
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<StopProject>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<StopProject>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RunJob> validateProjectByProjectID(@ApiParam(value = "ID of the project to validate.",required=true) @PathVariable("projectID") Integer projectID
,@ApiParam(value = ""  )  @Valid @RequestBody Body body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                if(projectID == 1) {
                    return new ResponseEntity<RunJob>(objectMapper.readValue("{\n  \"result\" : \"project queued for validation\",\n  \"id\" : 4\n}", RunJob.class), HttpStatus.OK);
                } else {
                    return new ResponseEntity<RunJob>(HttpStatus.NOT_FOUND);
                }
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RunJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RunJob>(HttpStatus.NOT_IMPLEMENTED);
    }

}
