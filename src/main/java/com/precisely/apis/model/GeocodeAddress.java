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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GeocodeAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class GeocodeAddress {
  public static final String SERIALIZED_NAME_OBJECT_ID = "objectId";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private String objectId;

  public static final String SERIALIZED_NAME_MAIN_ADDRESS_LINE = "mainAddressLine";
  @SerializedName(SERIALIZED_NAME_MAIN_ADDRESS_LINE)
  private String mainAddressLine;

  public static final String SERIALIZED_NAME_ADDRESS_LAST_LINE = "addressLastLine";
  @SerializedName(SERIALIZED_NAME_ADDRESS_LAST_LINE)
  private String addressLastLine;

  public static final String SERIALIZED_NAME_PLACE_NAME = "placeName";
  @SerializedName(SERIALIZED_NAME_PLACE_NAME)
  private String placeName;

  public static final String SERIALIZED_NAME_AREA_NAME1 = "areaName1";
  @SerializedName(SERIALIZED_NAME_AREA_NAME1)
  private String areaName1;

  public static final String SERIALIZED_NAME_AREA_NAME2 = "areaName2";
  @SerializedName(SERIALIZED_NAME_AREA_NAME2)
  private String areaName2;

  public static final String SERIALIZED_NAME_AREA_NAME3 = "areaName3";
  @SerializedName(SERIALIZED_NAME_AREA_NAME3)
  private String areaName3;

  public static final String SERIALIZED_NAME_AREA_NAME4 = "areaName4";
  @SerializedName(SERIALIZED_NAME_AREA_NAME4)
  private String areaName4;

  public static final String SERIALIZED_NAME_POST_CODE1 = "postCode1";
  @SerializedName(SERIALIZED_NAME_POST_CODE1)
  private String postCode1;

  public static final String SERIALIZED_NAME_POST_CODE2 = "postCode2";
  @SerializedName(SERIALIZED_NAME_POST_CODE2)
  private String postCode2;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_ADDRESS_NUMBER = "addressNumber";
  @SerializedName(SERIALIZED_NAME_ADDRESS_NUMBER)
  private String addressNumber;

  public static final String SERIALIZED_NAME_STREET_NAME = "streetName";
  @SerializedName(SERIALIZED_NAME_STREET_NAME)
  private String streetName;

  public static final String SERIALIZED_NAME_UNIT_TYPE = "unitType";
  @SerializedName(SERIALIZED_NAME_UNIT_TYPE)
  private String unitType;

  public static final String SERIALIZED_NAME_UNIT_VALUE = "unitValue";
  @SerializedName(SERIALIZED_NAME_UNIT_VALUE)
  private String unitValue;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Map<String, Object> customFields = null;

  public GeocodeAddress() { 
  }

  public GeocodeAddress objectId(String objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectId() {
    return objectId;
  }


  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public GeocodeAddress mainAddressLine(String mainAddressLine) {
    
    this.mainAddressLine = mainAddressLine;
    return this;
  }

   /**
   * Get mainAddressLine
   * @return mainAddressLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMainAddressLine() {
    return mainAddressLine;
  }


  public void setMainAddressLine(String mainAddressLine) {
    this.mainAddressLine = mainAddressLine;
  }


  public GeocodeAddress addressLastLine(String addressLastLine) {
    
    this.addressLastLine = addressLastLine;
    return this;
  }

   /**
   * Get addressLastLine
   * @return addressLastLine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressLastLine() {
    return addressLastLine;
  }


  public void setAddressLastLine(String addressLastLine) {
    this.addressLastLine = addressLastLine;
  }


  public GeocodeAddress placeName(String placeName) {
    
    this.placeName = placeName;
    return this;
  }

   /**
   * Get placeName
   * @return placeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaceName() {
    return placeName;
  }


  public void setPlaceName(String placeName) {
    this.placeName = placeName;
  }


  public GeocodeAddress areaName1(String areaName1) {
    
    this.areaName1 = areaName1;
    return this;
  }

   /**
   * Get areaName1
   * @return areaName1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName1() {
    return areaName1;
  }


  public void setAreaName1(String areaName1) {
    this.areaName1 = areaName1;
  }


  public GeocodeAddress areaName2(String areaName2) {
    
    this.areaName2 = areaName2;
    return this;
  }

   /**
   * Get areaName2
   * @return areaName2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName2() {
    return areaName2;
  }


  public void setAreaName2(String areaName2) {
    this.areaName2 = areaName2;
  }


  public GeocodeAddress areaName3(String areaName3) {
    
    this.areaName3 = areaName3;
    return this;
  }

   /**
   * Get areaName3
   * @return areaName3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName3() {
    return areaName3;
  }


  public void setAreaName3(String areaName3) {
    this.areaName3 = areaName3;
  }


  public GeocodeAddress areaName4(String areaName4) {
    
    this.areaName4 = areaName4;
    return this;
  }

   /**
   * Get areaName4
   * @return areaName4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAreaName4() {
    return areaName4;
  }


  public void setAreaName4(String areaName4) {
    this.areaName4 = areaName4;
  }


  public GeocodeAddress postCode1(String postCode1) {
    
    this.postCode1 = postCode1;
    return this;
  }

   /**
   * Get postCode1
   * @return postCode1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostCode1() {
    return postCode1;
  }


  public void setPostCode1(String postCode1) {
    this.postCode1 = postCode1;
  }


  public GeocodeAddress postCode2(String postCode2) {
    
    this.postCode2 = postCode2;
    return this;
  }

   /**
   * Get postCode2
   * @return postCode2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostCode2() {
    return postCode2;
  }


  public void setPostCode2(String postCode2) {
    this.postCode2 = postCode2;
  }


  public GeocodeAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public GeocodeAddress addressNumber(String addressNumber) {
    
    this.addressNumber = addressNumber;
    return this;
  }

   /**
   * Get addressNumber
   * @return addressNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAddressNumber() {
    return addressNumber;
  }


  public void setAddressNumber(String addressNumber) {
    this.addressNumber = addressNumber;
  }


  public GeocodeAddress streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Get streetName
   * @return streetName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreetName() {
    return streetName;
  }


  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public GeocodeAddress unitType(String unitType) {
    
    this.unitType = unitType;
    return this;
  }

   /**
   * Get unitType
   * @return unitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnitType() {
    return unitType;
  }


  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }


  public GeocodeAddress unitValue(String unitValue) {
    
    this.unitValue = unitValue;
    return this;
  }

   /**
   * Get unitValue
   * @return unitValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUnitValue() {
    return unitValue;
  }


  public void setUnitValue(String unitValue) {
    this.unitValue = unitValue;
  }


  public GeocodeAddress customFields(Map<String, Object> customFields) {
    
    this.customFields = customFields;
    return this;
  }

  public GeocodeAddress putCustomFieldsItem(String key, Object customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<String, Object>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getCustomFields() {
    return customFields;
  }


  public void setCustomFields(Map<String, Object> customFields) {
    this.customFields = customFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeocodeAddress geocodeAddress = (GeocodeAddress) o;
    return Objects.equals(this.objectId, geocodeAddress.objectId) &&
        Objects.equals(this.mainAddressLine, geocodeAddress.mainAddressLine) &&
        Objects.equals(this.addressLastLine, geocodeAddress.addressLastLine) &&
        Objects.equals(this.placeName, geocodeAddress.placeName) &&
        Objects.equals(this.areaName1, geocodeAddress.areaName1) &&
        Objects.equals(this.areaName2, geocodeAddress.areaName2) &&
        Objects.equals(this.areaName3, geocodeAddress.areaName3) &&
        Objects.equals(this.areaName4, geocodeAddress.areaName4) &&
        Objects.equals(this.postCode1, geocodeAddress.postCode1) &&
        Objects.equals(this.postCode2, geocodeAddress.postCode2) &&
        Objects.equals(this.country, geocodeAddress.country) &&
        Objects.equals(this.addressNumber, geocodeAddress.addressNumber) &&
        Objects.equals(this.streetName, geocodeAddress.streetName) &&
        Objects.equals(this.unitType, geocodeAddress.unitType) &&
        Objects.equals(this.unitValue, geocodeAddress.unitValue) &&
        Objects.equals(this.customFields, geocodeAddress.customFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, mainAddressLine, addressLastLine, placeName, areaName1, areaName2, areaName3, areaName4, postCode1, postCode2, country, addressNumber, streetName, unitType, unitValue, customFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeocodeAddress {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    mainAddressLine: ").append(toIndentedString(mainAddressLine)).append("\n");
    sb.append("    addressLastLine: ").append(toIndentedString(addressLastLine)).append("\n");
    sb.append("    placeName: ").append(toIndentedString(placeName)).append("\n");
    sb.append("    areaName1: ").append(toIndentedString(areaName1)).append("\n");
    sb.append("    areaName2: ").append(toIndentedString(areaName2)).append("\n");
    sb.append("    areaName3: ").append(toIndentedString(areaName3)).append("\n");
    sb.append("    areaName4: ").append(toIndentedString(areaName4)).append("\n");
    sb.append("    postCode1: ").append(toIndentedString(postCode1)).append("\n");
    sb.append("    postCode2: ").append(toIndentedString(postCode2)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    addressNumber: ").append(toIndentedString(addressNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    unitValue: ").append(toIndentedString(unitValue)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

