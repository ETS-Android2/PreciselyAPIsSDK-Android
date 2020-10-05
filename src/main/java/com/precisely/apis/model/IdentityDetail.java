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
import com.precisely.apis.model.Age;
import com.precisely.apis.model.Education;
import com.precisely.apis.model.Employment;
import com.precisely.apis.model.IdentityDemographics;
import com.precisely.apis.model.IdentityName;
import com.precisely.apis.model.Photo;
import com.precisely.apis.model.Profiles;
import com.precisely.apis.model.Url;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * IdentityDetail
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-01T17:44:57.969+05:30")
public class IdentityDetail   {
  @SerializedName("name")
  private IdentityName name = null;

  @SerializedName("age")
  private Age age = null;

  @SerializedName("demographics")
  private IdentityDemographics demographics = null;

  @SerializedName("photos")
  private List<Photo> photos = new ArrayList<Photo>();

  @SerializedName("profiles")
  private Profiles profiles = null;

  @SerializedName("urls")
  private List<Url> urls = new ArrayList<Url>();

  @SerializedName("education")
  private List<Education> education = new ArrayList<Education>();

  @SerializedName("employment")
  private List<Employment> employment = new ArrayList<Employment>();

  public IdentityDetail name(IdentityName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public IdentityName getName() {
    return name;
  }

  public void setName(IdentityName name) {
    this.name = name;
  }

  public IdentityDetail age(Age age) {
    this.age = age;
    return this;
  }

   /**
   * Get age
   * @return age
  **/
  @ApiModelProperty(example = "null", value = "")
  public Age getAge() {
    return age;
  }

  public void setAge(Age age) {
    this.age = age;
  }

  public IdentityDetail demographics(IdentityDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

   /**
   * Get demographics
   * @return demographics
  **/
  @ApiModelProperty(example = "null", value = "")
  public IdentityDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(IdentityDemographics demographics) {
    this.demographics = demographics;
  }

  public IdentityDetail photos(List<Photo> photos) {
    this.photos = photos;
    return this;
  }

   /**
   * Get photos
   * @return photos
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Photo> getPhotos() {
    return photos;
  }

  public void setPhotos(List<Photo> photos) {
    this.photos = photos;
  }

  public IdentityDetail profiles(Profiles profiles) {
    this.profiles = profiles;
    return this;
  }

   /**
   * Get profiles
   * @return profiles
  **/
  @ApiModelProperty(example = "null", value = "")
  public Profiles getProfiles() {
    return profiles;
  }

  public void setProfiles(Profiles profiles) {
    this.profiles = profiles;
  }

  public IdentityDetail urls(List<Url> urls) {
    this.urls = urls;
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Url> getUrls() {
    return urls;
  }

  public void setUrls(List<Url> urls) {
    this.urls = urls;
  }

  public IdentityDetail education(List<Education> education) {
    this.education = education;
    return this;
  }

   /**
   * Get education
   * @return education
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Education> getEducation() {
    return education;
  }

  public void setEducation(List<Education> education) {
    this.education = education;
  }

  public IdentityDetail employment(List<Employment> employment) {
    this.employment = employment;
    return this;
  }

   /**
   * Get employment
   * @return employment
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Employment> getEmployment() {
    return employment;
  }

  public void setEmployment(List<Employment> employment) {
    this.employment = employment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityDetail identityDetail = (IdentityDetail) o;
    return Objects.equals(this.name, identityDetail.name) &&
        Objects.equals(this.age, identityDetail.age) &&
        Objects.equals(this.demographics, identityDetail.demographics) &&
        Objects.equals(this.photos, identityDetail.photos) &&
        Objects.equals(this.profiles, identityDetail.profiles) &&
        Objects.equals(this.urls, identityDetail.urls) &&
        Objects.equals(this.education, identityDetail.education) &&
        Objects.equals(this.employment, identityDetail.employment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, demographics, photos, profiles, urls, education, employment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityDetail {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    profiles: ").append(toIndentedString(profiles)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    education: ").append(toIndentedString(education)).append("\n");
    sb.append("    employment: ").append(toIndentedString(employment)).append("\n");
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

