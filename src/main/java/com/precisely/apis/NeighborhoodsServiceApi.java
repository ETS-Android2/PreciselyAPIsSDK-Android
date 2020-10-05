/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 9.5.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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

import com.precisely.apis.model.PlaceByLocations;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NeighborhoodsServiceApi {
    private ApiClient apiClient;

    public NeighborhoodsServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NeighborhoodsServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getPlaceByLocation */
    private com.squareup.okhttp.Call getPlaceByLocationCall(String longitude, String latitude, String levelHint, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'longitude' is set
        if (longitude == null) {
            throw new ApiException("Missing the required parameter 'longitude' when calling getPlaceByLocation(Async)");
        }
        
        // verify the required parameter 'latitude' is set
        if (latitude == null) {
            throw new ApiException("Missing the required parameter 'latitude' when calling getPlaceByLocation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/neighborhoods/v1/place/bylocation".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (longitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "longitude", longitude));
        if (latitude != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "latitude", latitude));
        if (levelHint != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "levelHint", levelHint));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oAuth2Password" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Place By Location.
     * Identifies and retrieves the nearest neighborhood around a specific location. This Places service accepts latitude &amp; longitude as input and returns a place name.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param levelHint Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6 (optional)
     * @return PlaceByLocations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PlaceByLocations getPlaceByLocation(String longitude, String latitude, String levelHint) throws ApiException {
        ApiResponse<PlaceByLocations> resp = getPlaceByLocationWithHttpInfo(longitude, latitude, levelHint);
        return resp.getData();
    }

    /**
     * Place By Location.
     * Identifies and retrieves the nearest neighborhood around a specific location. This Places service accepts latitude &amp; longitude as input and returns a place name.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param levelHint Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6 (optional)
     * @return ApiResponse&lt;PlaceByLocations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PlaceByLocations> getPlaceByLocationWithHttpInfo(String longitude, String latitude, String levelHint) throws ApiException {
        com.squareup.okhttp.Call call = getPlaceByLocationCall(longitude, latitude, levelHint, null, null);
        Type localVarReturnType = new TypeToken<PlaceByLocations>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Place By Location. (asynchronously)
     * Identifies and retrieves the nearest neighborhood around a specific location. This Places service accepts latitude &amp; longitude as input and returns a place name.
     * @param longitude Longitude of the location. (required)
     * @param latitude Latitude of the location. (required)
     * @param levelHint Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getPlaceByLocationAsync(String longitude, String latitude, String levelHint, final ApiCallback<PlaceByLocations> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getPlaceByLocationCall(longitude, latitude, levelHint, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PlaceByLocations>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
