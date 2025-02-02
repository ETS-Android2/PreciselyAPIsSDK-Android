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
import com.precisely.apis.model.Depth;
import com.precisely.apis.model.EarthquakeDateTime;
import com.precisely.apis.model.EarthquakeLocation;
import com.precisely.apis.model.Magnitude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EarthquakeEvent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class EarthquakeEvent {
  public static final String SERIALIZED_NAME_DATE_TIME = "dateTime";
  @SerializedName(SERIALIZED_NAME_DATE_TIME)
  private EarthquakeDateTime dateTime;

  public static final String SERIALIZED_NAME_SEISMIC_REGION_NUMBER = "seismicRegionNumber";
  @SerializedName(SERIALIZED_NAME_SEISMIC_REGION_NUMBER)
  private Integer seismicRegionNumber;

  public static final String SERIALIZED_NAME_DEPTH = "depth";
  @SerializedName(SERIALIZED_NAME_DEPTH)
  private Depth depth;

  public static final String SERIALIZED_NAME_MAGNITUDE = "magnitude";
  @SerializedName(SERIALIZED_NAME_MAGNITUDE)
  private Magnitude magnitude;

  public static final String SERIALIZED_NAME_CAUSE = "cause";
  @SerializedName(SERIALIZED_NAME_CAUSE)
  private String cause;

  public static final String SERIALIZED_NAME_CULTURAL_EFFECT = "culturalEffect";
  @SerializedName(SERIALIZED_NAME_CULTURAL_EFFECT)
  private String culturalEffect;

  public static final String SERIALIZED_NAME_INTENSITY = "intensity";
  @SerializedName(SERIALIZED_NAME_INTENSITY)
  private Integer intensity;

  public static final String SERIALIZED_NAME_DIASTROPHISM = "diastrophism";
  @SerializedName(SERIALIZED_NAME_DIASTROPHISM)
  private String diastrophism;

  public static final String SERIALIZED_NAME_MISC_PHENOMENA = "miscPhenomena";
  @SerializedName(SERIALIZED_NAME_MISC_PHENOMENA)
  private String miscPhenomena;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private EarthquakeLocation location;

  public EarthquakeEvent() { 
  }

  public EarthquakeEvent dateTime(EarthquakeDateTime dateTime) {
    
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EarthquakeDateTime getDateTime() {
    return dateTime;
  }


  public void setDateTime(EarthquakeDateTime dateTime) {
    this.dateTime = dateTime;
  }


  public EarthquakeEvent seismicRegionNumber(Integer seismicRegionNumber) {
    
    this.seismicRegionNumber = seismicRegionNumber;
    return this;
  }

   /**
   * Get seismicRegionNumber
   * @return seismicRegionNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeismicRegionNumber() {
    return seismicRegionNumber;
  }


  public void setSeismicRegionNumber(Integer seismicRegionNumber) {
    this.seismicRegionNumber = seismicRegionNumber;
  }


  public EarthquakeEvent depth(Depth depth) {
    
    this.depth = depth;
    return this;
  }

   /**
   * Get depth
   * @return depth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Depth getDepth() {
    return depth;
  }


  public void setDepth(Depth depth) {
    this.depth = depth;
  }


  public EarthquakeEvent magnitude(Magnitude magnitude) {
    
    this.magnitude = magnitude;
    return this;
  }

   /**
   * Get magnitude
   * @return magnitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Magnitude getMagnitude() {
    return magnitude;
  }


  public void setMagnitude(Magnitude magnitude) {
    this.magnitude = magnitude;
  }


  public EarthquakeEvent cause(String cause) {
    
    this.cause = cause;
    return this;
  }

   /**
   * Get cause
   * @return cause
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCause() {
    return cause;
  }


  public void setCause(String cause) {
    this.cause = cause;
  }


  public EarthquakeEvent culturalEffect(String culturalEffect) {
    
    this.culturalEffect = culturalEffect;
    return this;
  }

   /**
   * Get culturalEffect
   * @return culturalEffect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCulturalEffect() {
    return culturalEffect;
  }


  public void setCulturalEffect(String culturalEffect) {
    this.culturalEffect = culturalEffect;
  }


  public EarthquakeEvent intensity(Integer intensity) {
    
    this.intensity = intensity;
    return this;
  }

   /**
   * Get intensity
   * @return intensity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIntensity() {
    return intensity;
  }


  public void setIntensity(Integer intensity) {
    this.intensity = intensity;
  }


  public EarthquakeEvent diastrophism(String diastrophism) {
    
    this.diastrophism = diastrophism;
    return this;
  }

   /**
   * Get diastrophism
   * @return diastrophism
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDiastrophism() {
    return diastrophism;
  }


  public void setDiastrophism(String diastrophism) {
    this.diastrophism = diastrophism;
  }


  public EarthquakeEvent miscPhenomena(String miscPhenomena) {
    
    this.miscPhenomena = miscPhenomena;
    return this;
  }

   /**
   * Get miscPhenomena
   * @return miscPhenomena
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMiscPhenomena() {
    return miscPhenomena;
  }


  public void setMiscPhenomena(String miscPhenomena) {
    this.miscPhenomena = miscPhenomena;
  }


  public EarthquakeEvent location(EarthquakeLocation location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EarthquakeLocation getLocation() {
    return location;
  }


  public void setLocation(EarthquakeLocation location) {
    this.location = location;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EarthquakeEvent earthquakeEvent = (EarthquakeEvent) o;
    return Objects.equals(this.dateTime, earthquakeEvent.dateTime) &&
        Objects.equals(this.seismicRegionNumber, earthquakeEvent.seismicRegionNumber) &&
        Objects.equals(this.depth, earthquakeEvent.depth) &&
        Objects.equals(this.magnitude, earthquakeEvent.magnitude) &&
        Objects.equals(this.cause, earthquakeEvent.cause) &&
        Objects.equals(this.culturalEffect, earthquakeEvent.culturalEffect) &&
        Objects.equals(this.intensity, earthquakeEvent.intensity) &&
        Objects.equals(this.diastrophism, earthquakeEvent.diastrophism) &&
        Objects.equals(this.miscPhenomena, earthquakeEvent.miscPhenomena) &&
        Objects.equals(this.location, earthquakeEvent.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, seismicRegionNumber, depth, magnitude, cause, culturalEffect, intensity, diastrophism, miscPhenomena, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EarthquakeEvent {\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    seismicRegionNumber: ").append(toIndentedString(seismicRegionNumber)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
    sb.append("    magnitude: ").append(toIndentedString(magnitude)).append("\n");
    sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
    sb.append("    culturalEffect: ").append(toIndentedString(culturalEffect)).append("\n");
    sb.append("    intensity: ").append(toIndentedString(intensity)).append("\n");
    sb.append("    diastrophism: ").append(toIndentedString(diastrophism)).append("\n");
    sb.append("    miscPhenomena: ").append(toIndentedString(miscPhenomena)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

