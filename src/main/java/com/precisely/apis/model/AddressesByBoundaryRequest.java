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
import com.precisely.apis.model.AddressesPreferences;
import com.precisely.apis.model.CommonGeometry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * AddressesByBoundaryRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-22T15:11:18.794+05:30")
public class AddressesByBoundaryRequest   {
  @SerializedName("preferences")
  private AddressesPreferences preferences = null;

  @SerializedName("geometry")
  private CommonGeometry geometry = null;

  @SerializedName("geometryAsText")
  private String geometryAsText = null;

  @SerializedName("latitude")
  private Double latitude = null;

  @SerializedName("longitude")
  private Double longitude = null;

  @SerializedName("travelTime")
  private String travelTime = null;

  @SerializedName("travelTimeUnit")
  private String travelTimeUnit = null;

  @SerializedName("travelDistance")
  private String travelDistance = null;

  @SerializedName("travelDistanceUnit")
  private String travelDistanceUnit = null;

  @SerializedName("travelMode")
  private String travelMode = null;

  public AddressesByBoundaryRequest preferences(AddressesPreferences preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @ApiModelProperty(example = "null", value = "")
  public AddressesPreferences getPreferences() {
    return preferences;
  }

  public void setPreferences(AddressesPreferences preferences) {
    this.preferences = preferences;
  }

  public AddressesByBoundaryRequest geometry(CommonGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommonGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(CommonGeometry geometry) {
    this.geometry = geometry;
  }

  public AddressesByBoundaryRequest geometryAsText(String geometryAsText) {
    this.geometryAsText = geometryAsText;
    return this;
  }

   /**
   * Get geometryAsText
   * @return geometryAsText
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGeometryAsText() {
    return geometryAsText;
  }

  public void setGeometryAsText(String geometryAsText) {
    this.geometryAsText = geometryAsText;
  }

  public AddressesByBoundaryRequest latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public AddressesByBoundaryRequest longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public AddressesByBoundaryRequest travelTime(String travelTime) {
    this.travelTime = travelTime;
    return this;
  }

   /**
   * Get travelTime
   * @return travelTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTravelTime() {
    return travelTime;
  }

  public void setTravelTime(String travelTime) {
    this.travelTime = travelTime;
  }

  public AddressesByBoundaryRequest travelTimeUnit(String travelTimeUnit) {
    this.travelTimeUnit = travelTimeUnit;
    return this;
  }

   /**
   * Get travelTimeUnit
   * @return travelTimeUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTravelTimeUnit() {
    return travelTimeUnit;
  }

  public void setTravelTimeUnit(String travelTimeUnit) {
    this.travelTimeUnit = travelTimeUnit;
  }

  public AddressesByBoundaryRequest travelDistance(String travelDistance) {
    this.travelDistance = travelDistance;
    return this;
  }

   /**
   * Get travelDistance
   * @return travelDistance
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTravelDistance() {
    return travelDistance;
  }

  public void setTravelDistance(String travelDistance) {
    this.travelDistance = travelDistance;
  }

  public AddressesByBoundaryRequest travelDistanceUnit(String travelDistanceUnit) {
    this.travelDistanceUnit = travelDistanceUnit;
    return this;
  }

   /**
   * Get travelDistanceUnit
   * @return travelDistanceUnit
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTravelDistanceUnit() {
    return travelDistanceUnit;
  }

  public void setTravelDistanceUnit(String travelDistanceUnit) {
    this.travelDistanceUnit = travelDistanceUnit;
  }

  public AddressesByBoundaryRequest travelMode(String travelMode) {
    this.travelMode = travelMode;
    return this;
  }

   /**
   * Get travelMode
   * @return travelMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTravelMode() {
    return travelMode;
  }

  public void setTravelMode(String travelMode) {
    this.travelMode = travelMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressesByBoundaryRequest addressesByBoundaryRequest = (AddressesByBoundaryRequest) o;
    return Objects.equals(this.preferences, addressesByBoundaryRequest.preferences) &&
        Objects.equals(this.geometry, addressesByBoundaryRequest.geometry) &&
        Objects.equals(this.geometryAsText, addressesByBoundaryRequest.geometryAsText) &&
        Objects.equals(this.latitude, addressesByBoundaryRequest.latitude) &&
        Objects.equals(this.longitude, addressesByBoundaryRequest.longitude) &&
        Objects.equals(this.travelTime, addressesByBoundaryRequest.travelTime) &&
        Objects.equals(this.travelTimeUnit, addressesByBoundaryRequest.travelTimeUnit) &&
        Objects.equals(this.travelDistance, addressesByBoundaryRequest.travelDistance) &&
        Objects.equals(this.travelDistanceUnit, addressesByBoundaryRequest.travelDistanceUnit) &&
        Objects.equals(this.travelMode, addressesByBoundaryRequest.travelMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preferences, geometry, geometryAsText, latitude, longitude, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressesByBoundaryRequest {\n");
    
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    geometryAsText: ").append(toIndentedString(geometryAsText)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    travelTimeUnit: ").append(toIndentedString(travelTimeUnit)).append("\n");
    sb.append("    travelDistance: ").append(toIndentedString(travelDistance)).append("\n");
    sb.append("    travelDistanceUnit: ").append(toIndentedString(travelDistanceUnit)).append("\n");
    sb.append("    travelMode: ").append(toIndentedString(travelMode)).append("\n");
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

