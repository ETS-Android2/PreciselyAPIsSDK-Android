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
import com.precisely.apis.model.MatchedAddress;
import com.precisely.apis.model.RouteBoundary;
import com.precisely.apis.model.RouteDelivery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * CarrierRouteResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-17T18:45:55.748+05:30")
public class CarrierRouteResponse   {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("matchedAddress")
  private MatchedAddress matchedAddress = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("state")
  private CommonState state = null;

  @SerializedName("countyFips")
  private String countyFips = null;

  @SerializedName("postalTown")
  private String postalTown = null;

  @SerializedName("postCode")
  private String postCode = null;

  @SerializedName("routeDelivery")
  private RouteDelivery routeDelivery = null;

  @SerializedName("boundary")
  private RouteBoundary boundary = null;

  @SerializedName("boundaryRef")
  private String boundaryRef = null;

  public CarrierRouteResponse objectId(String objectId) {
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

  public CarrierRouteResponse matchedAddress(MatchedAddress matchedAddress) {
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

  public CarrierRouteResponse code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public CarrierRouteResponse state(CommonState state) {
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

  public CarrierRouteResponse countyFips(String countyFips) {
    this.countyFips = countyFips;
    return this;
  }

   /**
   * Get countyFips
   * @return countyFips
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountyFips() {
    return countyFips;
  }

  public void setCountyFips(String countyFips) {
    this.countyFips = countyFips;
  }

  public CarrierRouteResponse postalTown(String postalTown) {
    this.postalTown = postalTown;
    return this;
  }

   /**
   * Get postalTown
   * @return postalTown
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostalTown() {
    return postalTown;
  }

  public void setPostalTown(String postalTown) {
    this.postalTown = postalTown;
  }

  public CarrierRouteResponse postCode(String postCode) {
    this.postCode = postCode;
    return this;
  }

   /**
   * Get postCode
   * @return postCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public CarrierRouteResponse routeDelivery(RouteDelivery routeDelivery) {
    this.routeDelivery = routeDelivery;
    return this;
  }

   /**
   * Get routeDelivery
   * @return routeDelivery
  **/
  @ApiModelProperty(example = "null", value = "")
  public RouteDelivery getRouteDelivery() {
    return routeDelivery;
  }

  public void setRouteDelivery(RouteDelivery routeDelivery) {
    this.routeDelivery = routeDelivery;
  }

  public CarrierRouteResponse boundary(RouteBoundary boundary) {
    this.boundary = boundary;
    return this;
  }

   /**
   * Get boundary
   * @return boundary
  **/
  @ApiModelProperty(example = "null", value = "")
  public RouteBoundary getBoundary() {
    return boundary;
  }

  public void setBoundary(RouteBoundary boundary) {
    this.boundary = boundary;
  }

  public CarrierRouteResponse boundaryRef(String boundaryRef) {
    this.boundaryRef = boundaryRef;
    return this;
  }

   /**
   * Get boundaryRef
   * @return boundaryRef
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBoundaryRef() {
    return boundaryRef;
  }

  public void setBoundaryRef(String boundaryRef) {
    this.boundaryRef = boundaryRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarrierRouteResponse carrierRouteResponse = (CarrierRouteResponse) o;
    return Objects.equals(this.objectId, carrierRouteResponse.objectId) &&
        Objects.equals(this.matchedAddress, carrierRouteResponse.matchedAddress) &&
        Objects.equals(this.code, carrierRouteResponse.code) &&
        Objects.equals(this.state, carrierRouteResponse.state) &&
        Objects.equals(this.countyFips, carrierRouteResponse.countyFips) &&
        Objects.equals(this.postalTown, carrierRouteResponse.postalTown) &&
        Objects.equals(this.postCode, carrierRouteResponse.postCode) &&
        Objects.equals(this.routeDelivery, carrierRouteResponse.routeDelivery) &&
        Objects.equals(this.boundary, carrierRouteResponse.boundary) &&
        Objects.equals(this.boundaryRef, carrierRouteResponse.boundaryRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, matchedAddress, code, state, countyFips, postalTown, postCode, routeDelivery, boundary, boundaryRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarrierRouteResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    matchedAddress: ").append(toIndentedString(matchedAddress)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    countyFips: ").append(toIndentedString(countyFips)).append("\n");
    sb.append("    postalTown: ").append(toIndentedString(postalTown)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    routeDelivery: ").append(toIndentedString(routeDelivery)).append("\n");
    sb.append("    boundary: ").append(toIndentedString(boundary)).append("\n");
    sb.append("    boundaryRef: ").append(toIndentedString(boundaryRef)).append("\n");
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

