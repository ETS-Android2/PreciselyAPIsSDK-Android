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
import com.precisely.apis.model.FloodRiskPreferences;
import com.precisely.apis.model.GeoRiskLocations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * FloodRiskByLocationRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-01T17:44:57.969+05:30")
public class FloodRiskByLocationRequest   {
  @SerializedName("locations")
  private List<GeoRiskLocations> locations = new ArrayList<GeoRiskLocations>();

  @SerializedName("preferences")
  private FloodRiskPreferences preferences = null;

  public FloodRiskByLocationRequest locations(List<GeoRiskLocations> locations) {
    this.locations = locations;
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<GeoRiskLocations> getLocations() {
    return locations;
  }

  public void setLocations(List<GeoRiskLocations> locations) {
    this.locations = locations;
  }

  public FloodRiskByLocationRequest preferences(FloodRiskPreferences preferences) {
    this.preferences = preferences;
    return this;
  }

   /**
   * Get preferences
   * @return preferences
  **/
  @ApiModelProperty(example = "null", value = "")
  public FloodRiskPreferences getPreferences() {
    return preferences;
  }

  public void setPreferences(FloodRiskPreferences preferences) {
    this.preferences = preferences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloodRiskByLocationRequest floodRiskByLocationRequest = (FloodRiskByLocationRequest) o;
    return Objects.equals(this.locations, floodRiskByLocationRequest.locations) &&
        Objects.equals(this.preferences, floodRiskByLocationRequest.preferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locations, preferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloodRiskByLocationRequest {\n");
    
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
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

