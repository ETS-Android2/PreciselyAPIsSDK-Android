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


package com.precisely.apis.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.precisely.apis.model.ValidateMailingAddressInputRowUserFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * GetPostalCodesAPIInputRow
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-01T17:44:57.969+05:30")
public class GetPostalCodesAPIInputRow   {
  @SerializedName("user_fields")
  private List<ValidateMailingAddressInputRowUserFields> userFields = new ArrayList<ValidateMailingAddressInputRowUserFields>();

  @SerializedName("City")
  private String city = null;

  @SerializedName("StateProvince")
  private String stateProvince = null;

  public GetPostalCodesAPIInputRow userFields(List<ValidateMailingAddressInputRowUserFields> userFields) {
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

  public GetPostalCodesAPIInputRow city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city name.
   * @return city
  **/
  @ApiModelProperty(example = "null", value = "The city name.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public GetPostalCodesAPIInputRow stateProvince(String stateProvince) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPostalCodesAPIInputRow getPostalCodesAPIInputRow = (GetPostalCodesAPIInputRow) o;
    return Objects.equals(this.userFields, getPostalCodesAPIInputRow.userFields) &&
        Objects.equals(this.city, getPostalCodesAPIInputRow.city) &&
        Objects.equals(this.stateProvince, getPostalCodesAPIInputRow.stateProvince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFields, city, stateProvince);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPostalCodesAPIInputRow {\n");
    
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
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

