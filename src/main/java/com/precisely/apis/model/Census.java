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
import com.precisely.apis.model.Cbsa;
import com.precisely.apis.model.Mcd;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Census
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class Census {
  public static final String SERIALIZED_NAME_CBSA = "cbsa";
  @SerializedName(SERIALIZED_NAME_CBSA)
  private Cbsa cbsa;

  public static final String SERIALIZED_NAME_MATCH_LEVEL = "matchLevel";
  @SerializedName(SERIALIZED_NAME_MATCH_LEVEL)
  private String matchLevel;

  public static final String SERIALIZED_NAME_MATCH_CODE = "matchCode";
  @SerializedName(SERIALIZED_NAME_MATCH_CODE)
  private String matchCode;

  public static final String SERIALIZED_NAME_TRACT = "tract";
  @SerializedName(SERIALIZED_NAME_TRACT)
  private String tract;

  public static final String SERIALIZED_NAME_MCD = "mcd";
  @SerializedName(SERIALIZED_NAME_MCD)
  private Mcd mcd;

  public Census() { 
  }

  public Census cbsa(Cbsa cbsa) {
    
    this.cbsa = cbsa;
    return this;
  }

   /**
   * Get cbsa
   * @return cbsa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Cbsa getCbsa() {
    return cbsa;
  }


  public void setCbsa(Cbsa cbsa) {
    this.cbsa = cbsa;
  }


  public Census matchLevel(String matchLevel) {
    
    this.matchLevel = matchLevel;
    return this;
  }

   /**
   * Get matchLevel
   * @return matchLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchLevel() {
    return matchLevel;
  }


  public void setMatchLevel(String matchLevel) {
    this.matchLevel = matchLevel;
  }


  public Census matchCode(String matchCode) {
    
    this.matchCode = matchCode;
    return this;
  }

   /**
   * Get matchCode
   * @return matchCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMatchCode() {
    return matchCode;
  }


  public void setMatchCode(String matchCode) {
    this.matchCode = matchCode;
  }


  public Census tract(String tract) {
    
    this.tract = tract;
    return this;
  }

   /**
   * Get tract
   * @return tract
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTract() {
    return tract;
  }


  public void setTract(String tract) {
    this.tract = tract;
  }


  public Census mcd(Mcd mcd) {
    
    this.mcd = mcd;
    return this;
  }

   /**
   * Get mcd
   * @return mcd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Mcd getMcd() {
    return mcd;
  }


  public void setMcd(Mcd mcd) {
    this.mcd = mcd;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Census census = (Census) o;
    return Objects.equals(this.cbsa, census.cbsa) &&
        Objects.equals(this.matchLevel, census.matchLevel) &&
        Objects.equals(this.matchCode, census.matchCode) &&
        Objects.equals(this.tract, census.tract) &&
        Objects.equals(this.mcd, census.mcd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cbsa, matchLevel, matchCode, tract, mcd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Census {\n");
    sb.append("    cbsa: ").append(toIndentedString(cbsa)).append("\n");
    sb.append("    matchLevel: ").append(toIndentedString(matchLevel)).append("\n");
    sb.append("    matchCode: ").append(toIndentedString(matchCode)).append("\n");
    sb.append("    tract: ").append(toIndentedString(tract)).append("\n");
    sb.append("    mcd: ").append(toIndentedString(mcd)).append("\n");
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

