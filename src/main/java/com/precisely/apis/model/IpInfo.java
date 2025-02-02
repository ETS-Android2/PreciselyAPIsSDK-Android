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
import com.precisely.apis.model.GeoLocationPlace;
import com.precisely.apis.model.Network;
import com.precisely.apis.model.Proxy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IpInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class IpInfo {
  public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_PROXY = "proxy";
  @SerializedName(SERIALIZED_NAME_PROXY)
  private Proxy proxy;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private Network network;

  public static final String SERIALIZED_NAME_PLACE = "place";
  @SerializedName(SERIALIZED_NAME_PLACE)
  private GeoLocationPlace place;

  public IpInfo() { 
  }

  public IpInfo ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public IpInfo proxy(Proxy proxy) {
    
    this.proxy = proxy;
    return this;
  }

   /**
   * Get proxy
   * @return proxy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Proxy getProxy() {
    return proxy;
  }


  public void setProxy(Proxy proxy) {
    this.proxy = proxy;
  }


  public IpInfo network(Network network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Network getNetwork() {
    return network;
  }


  public void setNetwork(Network network) {
    this.network = network;
  }


  public IpInfo place(GeoLocationPlace place) {
    
    this.place = place;
    return this;
  }

   /**
   * Get place
   * @return place
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeoLocationPlace getPlace() {
    return place;
  }


  public void setPlace(GeoLocationPlace place) {
    this.place = place;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IpInfo ipInfo = (IpInfo) o;
    return Objects.equals(this.ipAddress, ipInfo.ipAddress) &&
        Objects.equals(this.proxy, ipInfo.proxy) &&
        Objects.equals(this.network, ipInfo.network) &&
        Objects.equals(this.place, ipInfo.place);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddress, proxy, network, place);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IpInfo {\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
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

