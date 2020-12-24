/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 10.0.0
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
import com.precisely.apis.model.AHJmailingAddress;
import com.precisely.apis.model.ContactPerson;
import com.precisely.apis.model.Coverage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * AHJ
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-22T15:11:18.794+05:30")
public class AHJ   {
  @SerializedName("ahjType")
  private String ahjType = null;

  @SerializedName("ahjId")
  private String ahjId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("fccId")
  private String fccId = null;

  @SerializedName("agency")
  private String agency = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("comments")
  private String comments = null;

  @SerializedName("coverage")
  private Coverage coverage = null;

  @SerializedName("contactPerson")
  private ContactPerson contactPerson = null;

  @SerializedName("mailingAddress")
  private AHJmailingAddress mailingAddress = null;

  public AHJ ahjType(String ahjType) {
    this.ahjType = ahjType;
    return this;
  }

   /**
   * Get ahjType
   * @return ahjType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAhjType() {
    return ahjType;
  }

  public void setAhjType(String ahjType) {
    this.ahjType = ahjType;
  }

  public AHJ ahjId(String ahjId) {
    this.ahjId = ahjId;
    return this;
  }

   /**
   * Get ahjId
   * @return ahjId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAhjId() {
    return ahjId;
  }

  public void setAhjId(String ahjId) {
    this.ahjId = ahjId;
  }

  public AHJ type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AHJ fccId(String fccId) {
    this.fccId = fccId;
    return this;
  }

   /**
   * Get fccId
   * @return fccId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFccId() {
    return fccId;
  }

  public void setFccId(String fccId) {
    this.fccId = fccId;
  }

  public AHJ agency(String agency) {
    this.agency = agency;
    return this;
  }

   /**
   * Get agency
   * @return agency
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAgency() {
    return agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  public AHJ phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public AHJ comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public AHJ coverage(Coverage coverage) {
    this.coverage = coverage;
    return this;
  }

   /**
   * Get coverage
   * @return coverage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Coverage getCoverage() {
    return coverage;
  }

  public void setCoverage(Coverage coverage) {
    this.coverage = coverage;
  }

  public AHJ contactPerson(ContactPerson contactPerson) {
    this.contactPerson = contactPerson;
    return this;
  }

   /**
   * Get contactPerson
   * @return contactPerson
  **/
  @ApiModelProperty(example = "null", value = "")
  public ContactPerson getContactPerson() {
    return contactPerson;
  }

  public void setContactPerson(ContactPerson contactPerson) {
    this.contactPerson = contactPerson;
  }

  public AHJ mailingAddress(AHJmailingAddress mailingAddress) {
    this.mailingAddress = mailingAddress;
    return this;
  }

   /**
   * Get mailingAddress
   * @return mailingAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public AHJmailingAddress getMailingAddress() {
    return mailingAddress;
  }

  public void setMailingAddress(AHJmailingAddress mailingAddress) {
    this.mailingAddress = mailingAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AHJ AHJ = (AHJ) o;
    return Objects.equals(this.ahjType, AHJ.ahjType) &&
        Objects.equals(this.ahjId, AHJ.ahjId) &&
        Objects.equals(this.type, AHJ.type) &&
        Objects.equals(this.fccId, AHJ.fccId) &&
        Objects.equals(this.agency, AHJ.agency) &&
        Objects.equals(this.phone, AHJ.phone) &&
        Objects.equals(this.comments, AHJ.comments) &&
        Objects.equals(this.coverage, AHJ.coverage) &&
        Objects.equals(this.contactPerson, AHJ.contactPerson) &&
        Objects.equals(this.mailingAddress, AHJ.mailingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ahjType, ahjId, type, fccId, agency, phone, comments, coverage, contactPerson, mailingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AHJ {\n");
    
    sb.append("    ahjType: ").append(toIndentedString(ahjType)).append("\n");
    sb.append("    ahjId: ").append(toIndentedString(ahjId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fccId: ").append(toIndentedString(fccId)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    contactPerson: ").append(toIndentedString(contactPerson)).append("\n");
    sb.append("    mailingAddress: ").append(toIndentedString(mailingAddress)).append("\n");
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

