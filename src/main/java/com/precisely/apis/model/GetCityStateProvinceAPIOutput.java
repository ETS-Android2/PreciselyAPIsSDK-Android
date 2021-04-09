/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 10.5.0
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


package com.precisely.apis.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.precisely.apis.model.ValidateMailingAddressInputRowUserFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * GetCityStateProvinceAPIOutput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-08T13:38:51.844+05:30")
public class GetCityStateProvinceAPIOutput   {
  @SerializedName("user_fields")
  private List<ValidateMailingAddressInputRowUserFields> userFields = new ArrayList<ValidateMailingAddressInputRowUserFields>();

  @SerializedName("PostalCode")
  private String postalCode = null;

  @SerializedName("City")
  private String city = null;

  @SerializedName("City.Type")
  private String cityType = null;

  @SerializedName("StateProvince")
  private String stateProvince = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Status.Code")
  private String statusCode = null;

  @SerializedName("Status.Description")
  private String statusDescription = null;

  public GetCityStateProvinceAPIOutput userFields(List<ValidateMailingAddressInputRowUserFields> userFields) {
    this.userFields = userFields;
    return this;
  }

   /**
   * These fields are returned, unmodified, in the user_fields section of the response.
   * @return userFields
  **/
  @ApiModelProperty(example = "null", value = "These fields are returned, unmodified, in the user_fields section of the response.")
  public List<ValidateMailingAddressInputRowUserFields> getUserFields() {
    return userFields;
  }

  public void setUserFields(List<ValidateMailingAddressInputRowUserFields> userFields) {
    this.userFields = userFields;
  }

  public GetCityStateProvinceAPIOutput postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The validated ZIP Code or postal code.
   * @return postalCode
  **/
  @ApiModelProperty(example = "null", value = "The validated ZIP Code or postal code.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public GetCityStateProvinceAPIOutput city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "City")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public GetCityStateProvinceAPIOutput cityType(String cityType) {
    this.cityType = cityType;
    return this;
  }

   /**
   * City.Type
   * @return cityType
  **/
  @ApiModelProperty(example = "null", value = "City.Type")
  public String getCityType() {
    return cityType;
  }

  public void setCityType(String cityType) {
    this.cityType = cityType;
  }

  public GetCityStateProvinceAPIOutput stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * The state or province.
   * @return stateProvince
  **/
  @ApiModelProperty(example = "null", value = "The state or province.")
  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  public GetCityStateProvinceAPIOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Reports the success or failure of the match attempt.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "Reports the success or failure of the match attempt.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public GetCityStateProvinceAPIOutput statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Reason for failure, if there is one.
   * @return statusCode
  **/
  @ApiModelProperty(example = "null", value = "Reason for failure, if there is one.")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public GetCityStateProvinceAPIOutput statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Description of the problem, if there is one.
   * @return statusDescription
  **/
  @ApiModelProperty(example = "null", value = "Description of the problem, if there is one.")
  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCityStateProvinceAPIOutput getCityStateProvinceAPIOutput = (GetCityStateProvinceAPIOutput) o;
    return Objects.equals(this.userFields, getCityStateProvinceAPIOutput.userFields) &&
        Objects.equals(this.postalCode, getCityStateProvinceAPIOutput.postalCode) &&
        Objects.equals(this.city, getCityStateProvinceAPIOutput.city) &&
        Objects.equals(this.cityType, getCityStateProvinceAPIOutput.cityType) &&
        Objects.equals(this.stateProvince, getCityStateProvinceAPIOutput.stateProvince) &&
        Objects.equals(this.status, getCityStateProvinceAPIOutput.status) &&
        Objects.equals(this.statusCode, getCityStateProvinceAPIOutput.statusCode) &&
        Objects.equals(this.statusDescription, getCityStateProvinceAPIOutput.statusDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFields, postalCode, city, cityType, stateProvince, status, statusCode, statusDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCityStateProvinceAPIOutput {\n");
    
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    cityType: ").append(toIndentedString(cityType)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
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

