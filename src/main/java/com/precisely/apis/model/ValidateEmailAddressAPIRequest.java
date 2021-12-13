/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.7.0
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
import com.precisely.apis.model.ValidateEmailAddressInput;
import com.precisely.apis.model.ValidateEmailAddressOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ValidateEmailAddressAPIRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-08T14:42:40.451+05:30")
public class ValidateEmailAddressAPIRequest   {
  @SerializedName("options")
  private ValidateEmailAddressOptions options = null;

  @SerializedName("Input")
  private ValidateEmailAddressInput input = null;

  public ValidateEmailAddressAPIRequest options(ValidateEmailAddressOptions options) {
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(example = "null", value = "")
  public ValidateEmailAddressOptions getOptions() {
    return options;
  }

  public void setOptions(ValidateEmailAddressOptions options) {
    this.options = options;
  }

  public ValidateEmailAddressAPIRequest input(ValidateEmailAddressInput input) {
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @ApiModelProperty(example = "null", value = "")
  public ValidateEmailAddressInput getInput() {
    return input;
  }

  public void setInput(ValidateEmailAddressInput input) {
    this.input = input;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateEmailAddressAPIRequest validateEmailAddressAPIRequest = (ValidateEmailAddressAPIRequest) o;
    return Objects.equals(this.options, validateEmailAddressAPIRequest.options) &&
        Objects.equals(this.input, validateEmailAddressAPIRequest.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, input);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateEmailAddressAPIRequest {\n");
    
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

