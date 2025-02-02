/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis;

import com.precisely.ApiException;
import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.SchoolsNearByResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SchoolsServiceApi
 */
@Ignore
public class SchoolsServiceApiTest {

    private final SchoolsServiceApi api = new SchoolsServiceApi();

    
    /**
     * Search Nearby Schools by Address
     *
     * Search Nearby Schools by Address
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchoolsByAddressTest() throws ApiException {
        String address = null;
        String edLevel = null;
        String schoolType = null;
        String schoolSubType = null;
        String gender = null;
        String assignedSchoolsOnly = null;
        String districtSchoolsOnly = null;
        String searchRadius = null;
        String searchRadiusUnit = null;
        String travelTime = null;
        String travelTimeUnit = null;
        String travelDistance = null;
        String travelDistanceUnit = null;
        String travelMode = null;
        String maxCandidates = null;
                SchoolsNearByResponse response = api.getSchoolsByAddress(address, edLevel, schoolType, schoolSubType, gender, assignedSchoolsOnly, districtSchoolsOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, maxCandidates);
        // TODO: test validations
    }
    
}
