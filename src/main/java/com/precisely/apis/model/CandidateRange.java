/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 11.7.0
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
import com.precisely.apis.model.CandidateRangeUnit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * CandidateRange
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-08T14:42:40.451+05:30")
public class CandidateRange   {
  @SerializedName("placeName")
  private String placeName = null;

  @SerializedName("lowHouse")
  private String lowHouse = null;

  @SerializedName("highHouse")
  private String highHouse = null;

  /**
   * Gets or Sets side
   */
  public enum SideEnum {
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN"),
    
    @SerializedName("LEFT")
    LEFT("LEFT"),
    
    @SerializedName("RIGHT")
    RIGHT("RIGHT"),
    
    @SerializedName("BOTH")
    BOTH("BOTH");

    private String value;

    SideEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("side")
  private SideEnum side = null;

  /**
   * Gets or Sets oddEvenIndicator
   */
  public enum OddEvenIndicatorEnum {
    @SerializedName("UNKNOWN")
    UNKNOWN("UNKNOWN"),
    
    @SerializedName("BOTH")
    BOTH("BOTH"),
    
    @SerializedName("ODD")
    ODD("ODD"),
    
    @SerializedName("EVEN")
    EVEN("EVEN"),
    
    @SerializedName("IRREGULAR")
    IRREGULAR("IRREGULAR");

    private String value;

    OddEvenIndicatorEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("oddEvenIndicator")
  private OddEvenIndicatorEnum oddEvenIndicator = null;

  @SerializedName("units")
  private List<CandidateRangeUnit> units = new ArrayList<CandidateRangeUnit>();

  @SerializedName("customValues")
  private Map<String, Object> customValues = new HashMap<String, Object>();

  public CandidateRange placeName(String placeName) {
    this.placeName = placeName;
    return this;
  }

   /**
   * Get placeName
   * @return placeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlaceName() {
    return placeName;
  }

  public void setPlaceName(String placeName) {
    this.placeName = placeName;
  }

  public CandidateRange lowHouse(String lowHouse) {
    this.lowHouse = lowHouse;
    return this;
  }

   /**
   * Get lowHouse
   * @return lowHouse
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLowHouse() {
    return lowHouse;
  }

  public void setLowHouse(String lowHouse) {
    this.lowHouse = lowHouse;
  }

  public CandidateRange highHouse(String highHouse) {
    this.highHouse = highHouse;
    return this;
  }

   /**
   * Get highHouse
   * @return highHouse
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHighHouse() {
    return highHouse;
  }

  public void setHighHouse(String highHouse) {
    this.highHouse = highHouse;
  }

  public CandidateRange side(SideEnum side) {
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @ApiModelProperty(example = "null", value = "")
  public SideEnum getSide() {
    return side;
  }

  public void setSide(SideEnum side) {
    this.side = side;
  }

  public CandidateRange oddEvenIndicator(OddEvenIndicatorEnum oddEvenIndicator) {
    this.oddEvenIndicator = oddEvenIndicator;
    return this;
  }

   /**
   * Get oddEvenIndicator
   * @return oddEvenIndicator
  **/
  @ApiModelProperty(example = "null", value = "")
  public OddEvenIndicatorEnum getOddEvenIndicator() {
    return oddEvenIndicator;
  }

  public void setOddEvenIndicator(OddEvenIndicatorEnum oddEvenIndicator) {
    this.oddEvenIndicator = oddEvenIndicator;
  }

  public CandidateRange units(List<CandidateRangeUnit> units) {
    this.units = units;
    return this;
  }

   /**
   * Get units
   * @return units
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CandidateRangeUnit> getUnits() {
    return units;
  }

  public void setUnits(List<CandidateRangeUnit> units) {
    this.units = units;
  }

  public CandidateRange customValues(Map<String, Object> customValues) {
    this.customValues = customValues;
    return this;
  }

   /**
   * Get customValues
   * @return customValues
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getCustomValues() {
    return customValues;
  }

  public void setCustomValues(Map<String, Object> customValues) {
    this.customValues = customValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CandidateRange candidateRange = (CandidateRange) o;
    return Objects.equals(this.placeName, candidateRange.placeName) &&
        Objects.equals(this.lowHouse, candidateRange.lowHouse) &&
        Objects.equals(this.highHouse, candidateRange.highHouse) &&
        Objects.equals(this.side, candidateRange.side) &&
        Objects.equals(this.oddEvenIndicator, candidateRange.oddEvenIndicator) &&
        Objects.equals(this.units, candidateRange.units) &&
        Objects.equals(this.customValues, candidateRange.customValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeName, lowHouse, highHouse, side, oddEvenIndicator, units, customValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateRange {\n");
    
    sb.append("    placeName: ").append(toIndentedString(placeName)).append("\n");
    sb.append("    lowHouse: ").append(toIndentedString(lowHouse)).append("\n");
    sb.append("    highHouse: ").append(toIndentedString(highHouse)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    oddEvenIndicator: ").append(toIndentedString(oddEvenIndicator)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    customValues: ").append(toIndentedString(customValues)).append("\n");
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

