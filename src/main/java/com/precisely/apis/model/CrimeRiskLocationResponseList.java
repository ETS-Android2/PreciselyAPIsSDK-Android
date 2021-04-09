/**
 * Precisely APIs
 * Enhance & enrich your data, applications, business processes, and workflows with rich location, information, and identify APIs.
 *
 * OpenAPI spec version: 10.5.0
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
import com.precisely.apis.model.CrimeRiskLocationResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * CrimeRiskLocationResponseList
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-04-08T13:38:51.844+05:30")
public class CrimeRiskLocationResponseList   {
  @SerializedName("crimeRisk")
  private List<CrimeRiskLocationResponse> crimeRisk = new ArrayList<CrimeRiskLocationResponse>();

  public CrimeRiskLocationResponseList crimeRisk(List<CrimeRiskLocationResponse> crimeRisk) {
    this.crimeRisk = crimeRisk;
    return this;
  }

   /**
   * Get crimeRisk
   * @return crimeRisk
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CrimeRiskLocationResponse> getCrimeRisk() {
    return crimeRisk;
  }

  public void setCrimeRisk(List<CrimeRiskLocationResponse> crimeRisk) {
    this.crimeRisk = crimeRisk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrimeRiskLocationResponseList crimeRiskLocationResponseList = (CrimeRiskLocationResponseList) o;
    return Objects.equals(this.crimeRisk, crimeRiskLocationResponseList.crimeRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(crimeRisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrimeRiskLocationResponseList {\n");
    
    sb.append("    crimeRisk: ").append(toIndentedString(crimeRisk)).append("\n");
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

