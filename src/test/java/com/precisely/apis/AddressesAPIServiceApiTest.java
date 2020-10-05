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

import com.precisely.ApiException;
import com.precisely.apis.model.AddressesResponse;
import com.precisely.apis.model.AddressesByBoundaryRequest;
import com.precisely.apis.model.AddressesCount;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AddressesAPIServiceApi
 */
public class AddressesAPIServiceApiTest {

    private final AddressesAPIServiceApi api = new AddressesAPIServiceApi();

    
    /**
     * Addresses By Boundary Area.
     *
     * This service accepts zip code, neighborhood, county, or city names, and returns all known &amp; valid addresses associated with these names.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddressesByBoundaryNameTest() throws ApiException {
        String country = null;
        String areaName1 = null;
        String areaName2 = null;
        String areaName3 = null;
        String areaName4 = null;
        String postCode = null;
        String maxCandidates = null;
        String page = null;
        // AddressesResponse response = api.getAddressesByBoundaryName(country, areaName1, areaName2, areaName3, areaName4, postCode, maxCandidates, page);

        // TODO: test validations
    }
    
    /**
     * Address Counts by Boundary.
     *
     * This service accepts custom geographic boundaries or drivetimes &amp; drive distances, returns the total number of addresses within these boundaries.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddressesCountByBoundaryTest() throws ApiException {
        AddressesByBoundaryRequest body = null;
        // AddressesCount response = api.getAddressesCountByBoundary(body);

        // TODO: test validations
    }
    
    /**
     * Address Counts by Boundary Name.
     *
     * This service accepts zip code, neighborhood, county, or city names, and returns the total number of addresses associated with these names. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddressesCountByBoundaryNameTest() throws ApiException {
        String country = null;
        String areaName1 = null;
        String areaName2 = null;
        String areaName3 = null;
        String areaName4 = null;
        String postCode = null;
        // AddressesCount response = api.getAddressesCountByBoundaryName(country, areaName1, areaName2, areaName3, areaName4, postCode);

        // TODO: test validations
    }
    
    /**
     * Addresses by Boundary.
     *
     * This service accepts custom geographic boundaries or drivetimes &amp; drive distances, returns all known &amp; valid addresses within these boundaries.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAddressesbyBoundaryTest() throws ApiException {
        AddressesByBoundaryRequest body = null;
        // AddressesResponse response = api.getAddressesbyBoundary(body);

        // TODO: test validations
    }
    
}
