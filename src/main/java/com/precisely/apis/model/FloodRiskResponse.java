/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.8.0
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
import com.precisely.apis.model.CommonState;
import com.precisely.apis.model.Community;
import com.precisely.apis.model.FloodBoundary;
import com.precisely.apis.model.FloodZone;
import com.precisely.apis.model.MatchedAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * FloodRiskResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-17T18:45:55.748+05:30")
public class FloodRiskResponse   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("state")
  private CommonState state = null;

  @SerializedName("floodZone")
  private FloodZone floodZone = null;

  @SerializedName("community")
  private Community community = null;

  @SerializedName("boundary")
  private FloodBoundary boundary = null;

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  public FloodRiskResponse objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public FloodRiskResponse state(CommonState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "")
  public CommonState getState() {
    return state;
  }

  public void setState(CommonState state) {
    this.state = state;
  }

  public FloodRiskResponse floodZone(FloodZone floodZone) {
    this.floodZone = floodZone;
    return this;
  }

   /**
   * Get floodZone
   * @return floodZone
  **/
  @ApiModelProperty(example = "null", value = "")
  public FloodZone getFloodZone() {
    return floodZone;
  }

  public void setFloodZone(FloodZone floodZone) {
    this.floodZone = floodZone;
  }

  public FloodRiskResponse community(Community community) {
    this.community = community;
    return this;
  }

   /**
   * Get community
   * @return community
  **/
  @ApiModelProperty(example = "null", value = "")
  public Community getCommunity() {
    return community;
  }

  public void setCommunity(Community community) {
    this.community = community;
  }

  public FloodRiskResponse boundary(FloodBoundary boundary) {
    this.boundary = boundary;
    return this;
  }

   /**
   * Get boundary
   * @return boundary
  **/
  @ApiModelProperty(example = "null", value = "")
  public FloodBoundary getBoundary() {
    return boundary;
  }

  public void setBoundary(FloodBoundary boundary) {
    this.boundary = boundary;
  }

  public FloodRiskResponse matchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
    return this;
  }

   /**
   * Get matchedAddress
   * @return matchedAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public MatchedAddress getMatchedAddress() {
    return matchedAddress;
  }

  public void setMatchedAddress(MatchedAddress matchedAddress) {
    this.matchedAddress = matchedAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FloodRiskResponse floodRiskResponse = (FloodRiskResponse) o;
    return Objects.equals(this.objectId, floodRiskResponse.objectId) &&
        Objects.equals(this.state, floodRiskResponse.state) &&
        Objects.equals(this.floodZone, floodRiskResponse.floodZone) &&
        Objects.equals(this.community, floodRiskResponse.community) &&
        Objects.equals(this.boundary, floodRiskResponse.boundary) &&
        Objects.equals(this.matchedAddress, floodRiskResponse.matchedAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, state, floodZone, community, boundary, matchedAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FloodRiskResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    floodZone: ").append(toIndentedString(floodZone)).append("\n");
    sb.append("    community: ").append(toIndentedString(community)).append("\n");
    sb.append("    boundary: ").append(toIndentedString(boundary)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
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

