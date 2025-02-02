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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SpecialPurposeDistrictTax
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class SpecialPurposeDistrictTax {
  public static final String SERIALIZED_NAME_DISTRICT_NUMBER = "districtNumber";
  @SerializedName(SERIALIZED_NAME_DISTRICT_NUMBER)
  private String districtNumber;

  public static final String SERIALIZED_NAME_TAX_RATE = "taxRate";
  @SerializedName(SERIALIZED_NAME_TAX_RATE)
  private Double taxRate;

  public static final String SERIALIZED_NAME_TAX_AMOUNT = "taxAmount";
  @SerializedName(SERIALIZED_NAME_TAX_AMOUNT)
  private Double taxAmount;

  public SpecialPurposeDistrictTax() { 
  }

  public SpecialPurposeDistrictTax districtNumber(String districtNumber) {
    
    this.districtNumber = districtNumber;
    return this;
  }

   /**
   * Get districtNumber
   * @return districtNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDistrictNumber() {
    return districtNumber;
  }


  public void setDistrictNumber(String districtNumber) {
    this.districtNumber = districtNumber;
  }


  public SpecialPurposeDistrictTax taxRate(Double taxRate) {
    
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Get taxRate
   * @return taxRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTaxRate() {
    return taxRate;
  }


  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }


  public SpecialPurposeDistrictTax taxAmount(Double taxAmount) {
    
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getTaxAmount() {
    return taxAmount;
  }


  public void setTaxAmount(Double taxAmount) {
    this.taxAmount = taxAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpecialPurposeDistrictTax specialPurposeDistrictTax = (SpecialPurposeDistrictTax) o;
    return Objects.equals(this.districtNumber, specialPurposeDistrictTax.districtNumber) &&
        Objects.equals(this.taxRate, specialPurposeDistrictTax.taxRate) &&
        Objects.equals(this.taxAmount, specialPurposeDistrictTax.taxAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(districtNumber, taxRate, taxAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpecialPurposeDistrictTax {\n");
    sb.append("    districtNumber: ").append(toIndentedString(districtNumber)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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

