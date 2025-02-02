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
import com.precisely.apis.model.BasicBoundary;
import com.precisely.apis.model.ErrorInfo;
import com.precisely.apis.model.POIBoundaryAddressRequest;
import com.precisely.apis.model.POIBoundaryLocationRequest;
import com.precisely.apis.model.POIBoundaryResponse;
import com.precisely.apis.model.PoiBoundary;
import com.precisely.apis.model.TravelBoundaries;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ZonesServiceApi
 */
@Ignore
public class ZonesServiceApiTest {

    private final ZonesServiceApi api = new ZonesServiceApi();

    
    /**
     * Gets Basic Boundary by Address.
     *
     * Gets Basic Boundary by Address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBasicBoundaryByAddressTest() throws ApiException {
        String address = null;
        String country = null;
        String distance = null;
        String distanceUnit = null;
        String resolution = null;
        String responseSrs = null;
                BasicBoundary response = api.getBasicBoundaryByAddress(address, country, distance, distanceUnit, resolution, responseSrs);
        // TODO: test validations
    }
    
    /**
     * Gets Basic Boundary by Location.
     *
     * Gets Basic Boundary by Location.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBasicBoundaryByLocationTest() throws ApiException {
        String latitude = null;
        String longitude = null;
        String distance = null;
        String distanceUnit = null;
        String resolution = null;
        String responseSrs = null;
        String srsName = null;
                BasicBoundary response = api.getBasicBoundaryByLocation(latitude, longitude, distance, distanceUnit, resolution, responseSrs, srsName);
        // TODO: test validations
    }
    
    /**
     * Gets Point of Interests Boundary by Address.
     *
     * Gets Point of Interests Boundary by Address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIBoundaryByAddressTest() throws ApiException {
        String address = null;
        String categoryCode = null;
        String sicCode = null;
        String naicsCode = null;
                PoiBoundary response = api.getPOIBoundaryByAddress(address, categoryCode, sicCode, naicsCode);
        // TODO: test validations
    }
    
    /**
     * Batch method for getting Point of Interests Boundary by Address.
     *
     * Batch method for getting Point of Interests Boundary by Address.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIBoundaryByAddressBatchTest() throws ApiException {
        POIBoundaryAddressRequest poIBoundaryAddressRequest = null;
                POIBoundaryResponse response = api.getPOIBoundaryByAddressBatch(poIBoundaryAddressRequest);
        // TODO: test validations
    }
    
    /**
     * Get Point of Interests Boundary by Location.
     *
     * Get Point of Interests Boundary by Location.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIBoundaryByLocationTest() throws ApiException {
        String latitude = null;
        String longitude = null;
        String categoryCode = null;
        String sicCode = null;
        String naicsCode = null;
                PoiBoundary response = api.getPOIBoundaryByLocation(latitude, longitude, categoryCode, sicCode, naicsCode);
        // TODO: test validations
    }
    
    /**
     * Batch method for getting Point of Interests Boundary by Location.
     *
     * Batch method for getting Point of Interests Boundary by Location.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPOIBoundaryByLocationBatchTest() throws ApiException {
        POIBoundaryLocationRequest poIBoundaryLocationRequest = null;
                POIBoundaryResponse response = api.getPOIBoundaryByLocationBatch(poIBoundaryLocationRequest);
        // TODO: test validations
    }
    
    /**
     * Get TravelBoundary By Distance.
     *
     * Returns the travel boundary based on travel distance.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTravelBoundaryByDistanceTest() throws ApiException {
        String point = null;
        String address = null;
        String costs = null;
        String costUnit = null;
        String db = null;
        String country = null;
        String maxOffroadDistance = null;
        String maxOffroadDistanceUnit = null;
        String destinationSrs = null;
        String majorRoads = null;
        String returnHoles = null;
        String returnIslands = null;
        String simplificationFactor = null;
        String bandingStyle = null;
        String historicTrafficTimeBucket = null;
        String defaultAmbientSpeed = null;
        String ambientSpeedUnit = null;
                TravelBoundaries response = api.getTravelBoundaryByDistance(point, address, costs, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, defaultAmbientSpeed, ambientSpeedUnit);
        // TODO: test validations
    }
    
    /**
     * Get TravelBoundary By Time.
     *
     * Travel boundary based on travel time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTravelBoundaryByTimeTest() throws ApiException {
        String point = null;
        String address = null;
        String costs = null;
        String costUnit = null;
        String db = null;
        String country = null;
        String maxOffroadDistance = null;
        String maxOffroadDistanceUnit = null;
        String destinationSrs = null;
        String majorRoads = null;
        String returnHoles = null;
        String returnIslands = null;
        String simplificationFactor = null;
        String bandingStyle = null;
        String historicTrafficTimeBucket = null;
        String defaultAmbientSpeed = null;
        String ambientSpeedUnit = null;
                TravelBoundaries response = api.getTravelBoundaryByTime(point, address, costs, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket, defaultAmbientSpeed, ambientSpeedUnit);
        // TODO: test validations
    }
    
}
