/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 9.0.0
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
 * ValidateEmailAddressOutput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-05-27T18:29:18.933+05:30")
public class ValidateEmailAddressOutput   {
  @SerializedName("user_fields")
  private List<ValidateMailingAddressInputRowUserFields> userFields = new ArrayList<ValidateMailingAddressInputRowUserFields>();

  @SerializedName("EMAIL")
  private String EMAIL = null;

  @SerializedName("FINDING")
  private String FINDING = null;

  @SerializedName("COMMENT")
  private String COMMENT = null;

  @SerializedName("COMMENT_CODE")
  private String COMMENT_CODE = null;

  @SerializedName("SUGG_EMAIL")
  private String SUGG_EMAIL = null;

  @SerializedName("SUGG_COMMENT")
  private String SUGG_COMMENT = null;

  @SerializedName("ERROR_RESPONSE")
  private String ERROR_RESPONSE = null;

  @SerializedName("ERROR")
  private String ERROR = null;

  @SerializedName("Status")
  private String status = null;

  @SerializedName("Status.Code")
  private String statusCode = null;

  @SerializedName("Status.Description")
  private String statusDescription = null;

  public ValidateEmailAddressOutput userFields(List<ValidateMailingAddressInputRowUserFields> userFields) {
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

  public ValidateEmailAddressOutput EMAIL(String EMAIL) {
    this.EMAIL = EMAIL;
    return this;
  }

   /**
   * The email address submitted for verification.
   * @return EMAIL
  **/
  @ApiModelProperty(example = "null", value = "The email address submitted for verification.")
  public String getEMAIL() {
    return EMAIL;
  }

  public void setEMAIL(String EMAIL) {
    this.EMAIL = EMAIL;
  }

  public ValidateEmailAddressOutput FINDING(String FINDING) {
    this.FINDING = FINDING;
    return this;
  }

   /**
   * One character code indicating the validity of the submitted email address.
   * @return FINDING
  **/
  @ApiModelProperty(example = "null", value = "One character code indicating the validity of the submitted email address.")
  public String getFINDING() {
    return FINDING;
  }

  public void setFINDING(String FINDING) {
    this.FINDING = FINDING;
  }

  public ValidateEmailAddressOutput COMMENT(String COMMENT) {
    this.COMMENT = COMMENT;
    return this;
  }

   /**
   * The comment string pertaining to the result of the submitted email address.
   * @return COMMENT
  **/
  @ApiModelProperty(example = "null", value = "The comment string pertaining to the result of the submitted email address.")
  public String getCOMMENT() {
    return COMMENT;
  }

  public void setCOMMENT(String COMMENT) {
    this.COMMENT = COMMENT;
  }

  public ValidateEmailAddressOutput COMMENT_CODE(String COMMENT_CODE) {
    this.COMMENT_CODE = COMMENT_CODE;
    return this;
  }

   /**
   * A short code which maps to each returned COMMENT field value.
   * @return COMMENT_CODE
  **/
  @ApiModelProperty(example = "null", value = "A short code which maps to each returned COMMENT field value.")
  public String getCOMMENTCODE() {
    return COMMENT_CODE;
  }

  public void setCOMMENTCODE(String COMMENT_CODE) {
    this.COMMENT_CODE = COMMENT_CODE;
  }

  public ValidateEmailAddressOutput SUGG_EMAIL(String SUGG_EMAIL) {
    this.SUGG_EMAIL = SUGG_EMAIL;
    return this;
  }

   /**
   * Suggested correction for submitted email address, if found. A suggestion will only be provided if it is valid and SafeToDeliver.
   * @return SUGG_EMAIL
  **/
  @ApiModelProperty(example = "null", value = "Suggested correction for submitted email address, if found. A suggestion will only be provided if it is valid and SafeToDeliver.")
  public String getSUGGEMAIL() {
    return SUGG_EMAIL;
  }

  public void setSUGGEMAIL(String SUGG_EMAIL) {
    this.SUGG_EMAIL = SUGG_EMAIL;
  }

  public ValidateEmailAddressOutput SUGG_COMMENT(String SUGG_COMMENT) {
    this.SUGG_COMMENT = SUGG_COMMENT;
    return this;
  }

   /**
   * This field contains suggestion not SafeToDeliver when ValidateEmailAddress corrected the address and the corrected version of the email address failed one or more SafeToDeliver process checks.
   * @return SUGG_COMMENT
  **/
  @ApiModelProperty(example = "null", value = "This field contains suggestion not SafeToDeliver when ValidateEmailAddress corrected the address and the corrected version of the email address failed one or more SafeToDeliver process checks.")
  public String getSUGGCOMMENT() {
    return SUGG_COMMENT;
  }

  public void setSUGGCOMMENT(String SUGG_COMMENT) {
    this.SUGG_COMMENT = SUGG_COMMENT;
  }

  public ValidateEmailAddressOutput ERROR_RESPONSE(String ERROR_RESPONSE) {
    this.ERROR_RESPONSE = ERROR_RESPONSE;
    return this;
  }

   /**
   * Pre-formatted response intended to be provided to user.
   * @return ERROR_RESPONSE
  **/
  @ApiModelProperty(example = "null", value = "Pre-formatted response intended to be provided to user.")
  public String getERRORRESPONSE() {
    return ERROR_RESPONSE;
  }

  public void setERRORRESPONSE(String ERROR_RESPONSE) {
    this.ERROR_RESPONSE = ERROR_RESPONSE;
  }

  public ValidateEmailAddressOutput ERROR(String ERROR) {
    this.ERROR = ERROR;
    return this;
  }

   /**
   * Field reserved for special features only.
   * @return ERROR
  **/
  @ApiModelProperty(example = "null", value = "Field reserved for special features only.")
  public String getERROR() {
    return ERROR;
  }

  public void setERROR(String ERROR) {
    this.ERROR = ERROR;
  }

  public ValidateEmailAddressOutput status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ValidateEmailAddressOutput statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * 
   * @return statusCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public ValidateEmailAddressOutput statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * 
   * @return statusDescription
  **/
  @ApiModelProperty(example = "null", value = "")
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
    ValidateEmailAddressOutput validateEmailAddressOutput = (ValidateEmailAddressOutput) o;
    return Objects.equals(this.userFields, validateEmailAddressOutput.userFields) &&
        Objects.equals(this.EMAIL, validateEmailAddressOutput.EMAIL) &&
        Objects.equals(this.FINDING, validateEmailAddressOutput.FINDING) &&
        Objects.equals(this.COMMENT, validateEmailAddressOutput.COMMENT) &&
        Objects.equals(this.COMMENT_CODE, validateEmailAddressOutput.COMMENT_CODE) &&
        Objects.equals(this.SUGG_EMAIL, validateEmailAddressOutput.SUGG_EMAIL) &&
        Objects.equals(this.SUGG_COMMENT, validateEmailAddressOutput.SUGG_COMMENT) &&
        Objects.equals(this.ERROR_RESPONSE, validateEmailAddressOutput.ERROR_RESPONSE) &&
        Objects.equals(this.ERROR, validateEmailAddressOutput.ERROR) &&
        Objects.equals(this.status, validateEmailAddressOutput.status) &&
        Objects.equals(this.statusCode, validateEmailAddressOutput.statusCode) &&
        Objects.equals(this.statusDescription, validateEmailAddressOutput.statusDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userFields, EMAIL, FINDING, COMMENT, COMMENT_CODE, SUGG_EMAIL, SUGG_COMMENT, ERROR_RESPONSE, ERROR, status, statusCode, statusDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateEmailAddressOutput {\n");
    
    sb.append("    userFields: ").append(toIndentedString(userFields)).append("\n");
    sb.append("    EMAIL: ").append(toIndentedString(EMAIL)).append("\n");
    sb.append("    FINDING: ").append(toIndentedString(FINDING)).append("\n");
    sb.append("    COMMENT: ").append(toIndentedString(COMMENT)).append("\n");
    sb.append("    COMMENT_CODE: ").append(toIndentedString(COMMENT_CODE)).append("\n");
    sb.append("    SUGG_EMAIL: ").append(toIndentedString(SUGG_EMAIL)).append("\n");
    sb.append("    SUGG_COMMENT: ").append(toIndentedString(SUGG_COMMENT)).append("\n");
    sb.append("    ERROR_RESPONSE: ").append(toIndentedString(ERROR_RESPONSE)).append("\n");
    sb.append("    ERROR: ").append(toIndentedString(ERROR)).append("\n");
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
