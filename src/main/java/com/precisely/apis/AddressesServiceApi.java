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

import com.precisely.ApiCallback;
import com.precisely.ApiClient;
import com.precisely.ApiException;
import com.precisely.ApiResponse;
import com.precisely.Configuration;
import com.precisely.Pair;
import com.precisely.ProgressRequestBody;
import com.precisely.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.precisely.apis.model.AddressesByBoundaryRequest;
import com.precisely.apis.model.AddressesCount;
import com.precisely.apis.model.AddressesResponse;
import com.precisely.apis.model.ErrorInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressesServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AddressesServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AddressesServiceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getAddressesCountByBoundaryName
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAddressesCountByBoundaryNameCall(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/addresses/v1/addresscount/byboundaryname";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (areaName1 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("areaName1", areaName1));
        }

        if (areaName2 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("areaName2", areaName2));
        }

        if (areaName3 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("areaName3", areaName3));
        }

        if (areaName4 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("areaName4", areaName4));
        }

        if (postCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("postCode", postCode));
        }

        if (country != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country", country));
        }

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAddressesCountByBoundaryNameValidateBeforeCall(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'country' is set
        if (country == null) {
            throw new ApiException("Missing the required parameter 'country' when calling getAddressesCountByBoundaryName(Async)");
        }
        

        okhttp3.Call localVarCall = getAddressesCountByBoundaryNameCall(country, areaName1, areaName2, areaName3, areaName4, postCode, _callback);
        return localVarCall;

    }

    /**
     * Addresses Count by Boundary Name.
     * This service accepts zip code, neighborhood, county, or city names, and returns the total number of addresses associated with these names.
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @return AddressesCount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public AddressesCount getAddressesCountByBoundaryName(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode) throws ApiException {
        ApiResponse<AddressesCount> localVarResp = getAddressesCountByBoundaryNameWithHttpInfo(country, areaName1, areaName2, areaName3, areaName4, postCode);
        return localVarResp.getData();
    }

    /**
     * Addresses Count by Boundary Name.
     * This service accepts zip code, neighborhood, county, or city names, and returns the total number of addresses associated with these names.
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @return ApiResponse&lt;AddressesCount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AddressesCount> getAddressesCountByBoundaryNameWithHttpInfo(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode) throws ApiException {
        okhttp3.Call localVarCall = getAddressesCountByBoundaryNameValidateBeforeCall(country, areaName1, areaName2, areaName3, areaName4, postCode, null);
        Type localVarReturnType = new TypeToken<AddressesCount>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Addresses Count by Boundary Name. (asynchronously)
     * This service accepts zip code, neighborhood, county, or city names, and returns the total number of addresses associated with these names.
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAddressesCountByBoundaryNameAsync(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, final ApiCallback<AddressesCount> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAddressesCountByBoundaryNameValidateBeforeCall(country, areaName1, areaName2, areaName3, areaName4, postCode, _callback);
        Type localVarReturnType = new TypeToken<AddressesCount>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAddressesCountbyBoundary
     * @param addressesByBoundaryRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAddressesCountbyBoundaryCall(AddressesByBoundaryRequest addressesByBoundaryRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = addressesByBoundaryRequest;

        // create path and map variables
        String localVarPath = "/addresses/v1/addresscount/byboundary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAddressesCountbyBoundaryValidateBeforeCall(AddressesByBoundaryRequest addressesByBoundaryRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addressesByBoundaryRequest' is set
        if (addressesByBoundaryRequest == null) {
            throw new ApiException("Missing the required parameter 'addressesByBoundaryRequest' when calling getAddressesCountbyBoundary(Async)");
        }
        

        okhttp3.Call localVarCall = getAddressesCountbyBoundaryCall(addressesByBoundaryRequest, _callback);
        return localVarCall;

    }

    /**
     * Addresses count by Boundary.
     * This service accepts custom geographic boundaries or drive time &amp; drive distance, returns the total number of addresses within these boundaries.
     * @param addressesByBoundaryRequest  (required)
     * @return AddressesCount
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public AddressesCount getAddressesCountbyBoundary(AddressesByBoundaryRequest addressesByBoundaryRequest) throws ApiException {
        ApiResponse<AddressesCount> localVarResp = getAddressesCountbyBoundaryWithHttpInfo(addressesByBoundaryRequest);
        return localVarResp.getData();
    }

    /**
     * Addresses count by Boundary.
     * This service accepts custom geographic boundaries or drive time &amp; drive distance, returns the total number of addresses within these boundaries.
     * @param addressesByBoundaryRequest  (required)
     * @return ApiResponse&lt;AddressesCount&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AddressesCount> getAddressesCountbyBoundaryWithHttpInfo(AddressesByBoundaryRequest addressesByBoundaryRequest) throws ApiException {
        okhttp3.Call localVarCall = getAddressesCountbyBoundaryValidateBeforeCall(addressesByBoundaryRequest, null);
        Type localVarReturnType = new TypeToken<AddressesCount>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Addresses count by Boundary. (asynchronously)
     * This service accepts custom geographic boundaries or drive time &amp; drive distance, returns the total number of addresses within these boundaries.
     * @param addressesByBoundaryRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAddressesCountbyBoundaryAsync(AddressesByBoundaryRequest addressesByBoundaryRequest, final ApiCallback<AddressesCount> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAddressesCountbyBoundaryValidateBeforeCall(addressesByBoundaryRequest, _callback);
        Type localVarReturnType = new TypeToken<AddressesCount>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAddressesbyBoundary
     * @param addressesByBoundaryRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAddressesbyBoundaryCall(AddressesByBoundaryRequest addressesByBoundaryRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = addressesByBoundaryRequest;

        // create path and map variables
        String localVarPath = "/addresses/v1/address/byboundary";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml", "text/csv"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAddressesbyBoundaryValidateBeforeCall(AddressesByBoundaryRequest addressesByBoundaryRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addressesByBoundaryRequest' is set
        if (addressesByBoundaryRequest == null) {
            throw new ApiException("Missing the required parameter 'addressesByBoundaryRequest' when calling getAddressesbyBoundary(Async)");
        }
        

        okhttp3.Call localVarCall = getAddressesbyBoundaryCall(addressesByBoundaryRequest, _callback);
        return localVarCall;

    }

    /**
     * Addresses by Boundary.
     * This service accepts custom geographic boundaries or drive time &amp; drive distance, returns all known &amp; valid addresses within these boundaries.
     * @param addressesByBoundaryRequest  (required)
     * @return AddressesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public AddressesResponse getAddressesbyBoundary(AddressesByBoundaryRequest addressesByBoundaryRequest) throws ApiException {
        ApiResponse<AddressesResponse> localVarResp = getAddressesbyBoundaryWithHttpInfo(addressesByBoundaryRequest);
        return localVarResp.getData();
    }

    /**
     * Addresses by Boundary.
     * This service accepts custom geographic boundaries or drive time &amp; drive distance, returns all known &amp; valid addresses within these boundaries.
     * @param addressesByBoundaryRequest  (required)
     * @return ApiResponse&lt;AddressesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AddressesResponse> getAddressesbyBoundaryWithHttpInfo(AddressesByBoundaryRequest addressesByBoundaryRequest) throws ApiException {
        okhttp3.Call localVarCall = getAddressesbyBoundaryValidateBeforeCall(addressesByBoundaryRequest, null);
        Type localVarReturnType = new TypeToken<AddressesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Addresses by Boundary. (asynchronously)
     * This service accepts custom geographic boundaries or drive time &amp; drive distance, returns all known &amp; valid addresses within these boundaries.
     * @param addressesByBoundaryRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAddressesbyBoundaryAsync(AddressesByBoundaryRequest addressesByBoundaryRequest, final ApiCallback<AddressesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAddressesbyBoundaryValidateBeforeCall(addressesByBoundaryRequest, _callback);
        Type localVarReturnType = new TypeToken<AddressesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAddressesbyBoundaryName
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @param maxCandidates Maximum number of addresses to be returned in response. Max. value is 100 for XML/JSON, and 2000 for CSV. (optional)
     * @param page Response will indicate the page number. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAddressesbyBoundaryNameCall(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, String maxCandidates, String page, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/addresses/v1/address/byboundaryname";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (areaName1 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("areaName1", areaName1));
        }

        if (areaName2 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("areaName2", areaName2));
        }

        if (areaName3 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("areaName3", areaName3));
        }

        if (areaName4 != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("areaName4", areaName4));
        }

        if (postCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("postCode", postCode));
        }

        if (country != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country", country));
        }

        if (maxCandidates != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxCandidates", maxCandidates));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        final String[] localVarAccepts = {
            "application/json", "application/xml", "text/csv"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAddressesbyBoundaryNameValidateBeforeCall(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, String maxCandidates, String page, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'country' is set
        if (country == null) {
            throw new ApiException("Missing the required parameter 'country' when calling getAddressesbyBoundaryName(Async)");
        }
        

        okhttp3.Call localVarCall = getAddressesbyBoundaryNameCall(country, areaName1, areaName2, areaName3, areaName4, postCode, maxCandidates, page, _callback);
        return localVarCall;

    }

    /**
     * Addresses by Boundary Name.
     * This service accepts zip code, neighborhood, county, or city names, and returns all known &amp; valid addresses associated with these names.
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @param maxCandidates Maximum number of addresses to be returned in response. Max. value is 100 for XML/JSON, and 2000 for CSV. (optional)
     * @param page Response will indicate the page number. (optional)
     * @return AddressesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public AddressesResponse getAddressesbyBoundaryName(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, String maxCandidates, String page) throws ApiException {
        ApiResponse<AddressesResponse> localVarResp = getAddressesbyBoundaryNameWithHttpInfo(country, areaName1, areaName2, areaName3, areaName4, postCode, maxCandidates, page);
        return localVarResp.getData();
    }

    /**
     * Addresses by Boundary Name.
     * This service accepts zip code, neighborhood, county, or city names, and returns all known &amp; valid addresses associated with these names.
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @param maxCandidates Maximum number of addresses to be returned in response. Max. value is 100 for XML/JSON, and 2000 for CSV. (optional)
     * @param page Response will indicate the page number. (optional)
     * @return ApiResponse&lt;AddressesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AddressesResponse> getAddressesbyBoundaryNameWithHttpInfo(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, String maxCandidates, String page) throws ApiException {
        okhttp3.Call localVarCall = getAddressesbyBoundaryNameValidateBeforeCall(country, areaName1, areaName2, areaName3, areaName4, postCode, maxCandidates, page, null);
        Type localVarReturnType = new TypeToken<AddressesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Addresses by Boundary Name. (asynchronously)
     * This service accepts zip code, neighborhood, county, or city names, and returns all known &amp; valid addresses associated with these names.
     * @param country Name of country. Acceptable values are CAN, USA. (required)
     * @param areaName1 Specifies the largest geographical area, typically a state or province. (optional)
     * @param areaName2 Specifies the secondary geographic area, typically a county or district. (optional)
     * @param areaName3 Specifies a city or town name. (optional)
     * @param areaName4 Specifies a city subdivision or locality/neighborhood. (optional)
     * @param postCode Specifies the postcode (ZIP code) in the appropriate format for the country. (optional)
     * @param maxCandidates Maximum number of addresses to be returned in response. Max. value is 100 for XML/JSON, and 2000 for CSV. (optional)
     * @param page Response will indicate the page number. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAddressesbyBoundaryNameAsync(String country, String areaName1, String areaName2, String areaName3, String areaName4, String postCode, String maxCandidates, String page, final ApiCallback<AddressesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAddressesbyBoundaryNameValidateBeforeCall(country, areaName1, areaName2, areaName3, areaName4, postCode, maxCandidates, page, _callback);
        Type localVarReturnType = new TypeToken<AddressesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
