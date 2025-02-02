/*
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * The version of the OpenAPI document: 11.9.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.precisely.apis.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.precisely.apis.model.Cost;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TravelBoundary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class TravelBoundary {
  public static final String SERIALIZED_NAME_COSTS = "costs";
  @SerializedName(SERIALIZED_NAME_COSTS)
  private List<Cost> costs = null;

  public TravelBoundary() { 
  }

  public TravelBoundary costs(List<Cost> costs) {
    
    this.costs = costs;
    return this;
  }

  public TravelBoundary addCostsItem(Cost costsItem) {
    if (this.costs == null) {
      this.costs = new ArrayList<Cost>();
    }
    this.costs.add(costsItem);
    return this;
  }

   /**
   * Get costs
   * @return costs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Cost> getCosts() {
    return costs;
  }


  public void setCosts(List<Cost> costs) {
    this.costs = costs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelBoundary travelBoundary = (TravelBoundary) o;
    return Objects.equals(this.costs, travelBoundary.costs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(costs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelBoundary {\n");
    sb.append("    costs: ").append(toIndentedString(costs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

