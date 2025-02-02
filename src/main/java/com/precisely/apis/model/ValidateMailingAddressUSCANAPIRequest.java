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
import com.precisely.apis.model.ValidateMailingAddressUSCANAPIInput;
import com.precisely.apis.model.ValidateMailingAddressUSCANAPIOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ValidateMailingAddressUSCANAPIRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-11T15:09:06.689+05:30[Asia/Calcutta]")
public class ValidateMailingAddressUSCANAPIRequest {
  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private ValidateMailingAddressUSCANAPIOptions options;

  public static final String SERIALIZED_NAME_INPUT = "Input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private ValidateMailingAddressUSCANAPIInput input;

  public ValidateMailingAddressUSCANAPIRequest() { 
  }

  public ValidateMailingAddressUSCANAPIRequest options(ValidateMailingAddressUSCANAPIOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ValidateMailingAddressUSCANAPIOptions getOptions() {
    return options;
  }


  public void setOptions(ValidateMailingAddressUSCANAPIOptions options) {
    this.options = options;
  }


  public ValidateMailingAddressUSCANAPIRequest input(ValidateMailingAddressUSCANAPIInput input) {
    
    this.input = input;
    return this;
  }

   /**
   * Get input
   * @return input
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ValidateMailingAddressUSCANAPIInput getInput() {
    return input;
  }


  public void setInput(ValidateMailingAddressUSCANAPIInput input) {
    this.input = input;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidateMailingAddressUSCANAPIRequest validateMailingAddressUSCANAPIRequest = (ValidateMailingAddressUSCANAPIRequest) o;
    return Objects.equals(this.options, validateMailingAddressUSCANAPIRequest.options) &&
        Objects.equals(this.input, validateMailingAddressUSCANAPIRequest.input);
  }

  @Override
  public int hashCode() {
    return Objects.hash(options, input);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidateMailingAddressUSCANAPIRequest {\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

