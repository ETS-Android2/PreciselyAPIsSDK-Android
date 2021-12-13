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
import com.precisely.apis.model.Address;
import com.precisely.apis.model.Distance;
import com.precisely.apis.model.Geometry;
import com.precisely.apis.model.GradeLevelsTaught;
import com.precisely.apis.model.Greatschools;
import com.precisely.apis.model.SchoolDistrict;
import com.precisely.apis.model.SchoolProfile;
import com.precisely.apis.model.SchoolRanking;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * School
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-12-08T14:42:40.451+05:30")
public class School   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("assigned")
  private String assigned = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("website")
  private String website = null;

  @SerializedName("addressType")
  private String addressType = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("lowestGrade")
  private String lowestGrade = null;

  @SerializedName("highestGrade")
  private String highestGrade = null;

  @SerializedName("schoolType")
  private String schoolType = null;

  @SerializedName("schoolTypeDesc")
  private String schoolTypeDesc = null;

  @SerializedName("schoolSubType")
  private String schoolSubType = null;

  @SerializedName("schoolSubTypeDesc")
  private String schoolSubTypeDesc = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("genderDesc")
  private String genderDesc = null;

  @SerializedName("educationLevel")
  private String educationLevel = null;

  @SerializedName("educationLevelDesc")
  private String educationLevelDesc = null;

  @SerializedName("greatschools")
  private Greatschools greatschools = null;

  @SerializedName("ncesSchoolId")
  private String ncesSchoolId = null;

  @SerializedName("ncesDistrictId")
  private String ncesDistrictId = null;

  @SerializedName("ncesDataYear")
  private String ncesDataYear = null;

  @SerializedName("schoolRanking")
  private List<SchoolRanking> schoolRanking = new ArrayList<SchoolRanking>();

  @SerializedName("students")
  private String students = null;

  @SerializedName("teachers")
  private String teachers = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("studentTeacherRatio")
  private String studentTeacherRatio = null;

  @SerializedName("choice")
  private String choice = null;

  @SerializedName("coextensiv")
  private String coextensiv = null;

  @SerializedName("schoolDistricts")
  private SchoolDistrict schoolDistricts = null;

  @SerializedName("schoolProfile")
  private SchoolProfile schoolProfile = null;

  @SerializedName("gradeLevelsTaught")
  private GradeLevelsTaught gradeLevelsTaught = null;

  @SerializedName("distance")
  private Distance distance = null;

  @SerializedName("geometry")
  private Geometry geometry = null;

  public School id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public School name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public School assigned(String assigned) {
    this.assigned = assigned;
    return this;
  }

   /**
   * Get assigned
   * @return assigned
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssigned() {
    return assigned;
  }

  public void setAssigned(String assigned) {
    this.assigned = assigned;
  }

  public School phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public School website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Get website
   * @return website
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public School addressType(String addressType) {
    this.addressType = addressType;
    return this;
  }

   /**
   * Get addressType
   * @return addressType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAddressType() {
    return addressType;
  }

  public void setAddressType(String addressType) {
    this.addressType = addressType;
  }

  public School address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "null", value = "")
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public School lowestGrade(String lowestGrade) {
    this.lowestGrade = lowestGrade;
    return this;
  }

   /**
   * Get lowestGrade
   * @return lowestGrade
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLowestGrade() {
    return lowestGrade;
  }

  public void setLowestGrade(String lowestGrade) {
    this.lowestGrade = lowestGrade;
  }

  public School highestGrade(String highestGrade) {
    this.highestGrade = highestGrade;
    return this;
  }

   /**
   * Get highestGrade
   * @return highestGrade
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHighestGrade() {
    return highestGrade;
  }

  public void setHighestGrade(String highestGrade) {
    this.highestGrade = highestGrade;
  }

  public School schoolType(String schoolType) {
    this.schoolType = schoolType;
    return this;
  }

   /**
   * Get schoolType
   * @return schoolType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSchoolType() {
    return schoolType;
  }

  public void setSchoolType(String schoolType) {
    this.schoolType = schoolType;
  }

  public School schoolTypeDesc(String schoolTypeDesc) {
    this.schoolTypeDesc = schoolTypeDesc;
    return this;
  }

   /**
   * Get schoolTypeDesc
   * @return schoolTypeDesc
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSchoolTypeDesc() {
    return schoolTypeDesc;
  }

  public void setSchoolTypeDesc(String schoolTypeDesc) {
    this.schoolTypeDesc = schoolTypeDesc;
  }

  public School schoolSubType(String schoolSubType) {
    this.schoolSubType = schoolSubType;
    return this;
  }

   /**
   * Get schoolSubType
   * @return schoolSubType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSchoolSubType() {
    return schoolSubType;
  }

  public void setSchoolSubType(String schoolSubType) {
    this.schoolSubType = schoolSubType;
  }

  public School schoolSubTypeDesc(String schoolSubTypeDesc) {
    this.schoolSubTypeDesc = schoolSubTypeDesc;
    return this;
  }

   /**
   * Get schoolSubTypeDesc
   * @return schoolSubTypeDesc
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSchoolSubTypeDesc() {
    return schoolSubTypeDesc;
  }

  public void setSchoolSubTypeDesc(String schoolSubTypeDesc) {
    this.schoolSubTypeDesc = schoolSubTypeDesc;
  }

  public School gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public School genderDesc(String genderDesc) {
    this.genderDesc = genderDesc;
    return this;
  }

   /**
   * Get genderDesc
   * @return genderDesc
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGenderDesc() {
    return genderDesc;
  }

  public void setGenderDesc(String genderDesc) {
    this.genderDesc = genderDesc;
  }

  public School educationLevel(String educationLevel) {
    this.educationLevel = educationLevel;
    return this;
  }

   /**
   * Get educationLevel
   * @return educationLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEducationLevel() {
    return educationLevel;
  }

  public void setEducationLevel(String educationLevel) {
    this.educationLevel = educationLevel;
  }

  public School educationLevelDesc(String educationLevelDesc) {
    this.educationLevelDesc = educationLevelDesc;
    return this;
  }

   /**
   * Get educationLevelDesc
   * @return educationLevelDesc
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEducationLevelDesc() {
    return educationLevelDesc;
  }

  public void setEducationLevelDesc(String educationLevelDesc) {
    this.educationLevelDesc = educationLevelDesc;
  }

  public School greatschools(Greatschools greatschools) {
    this.greatschools = greatschools;
    return this;
  }

   /**
   * Get greatschools
   * @return greatschools
  **/
  @ApiModelProperty(example = "null", value = "")
  public Greatschools getGreatschools() {
    return greatschools;
  }

  public void setGreatschools(Greatschools greatschools) {
    this.greatschools = greatschools;
  }

  public School ncesSchoolId(String ncesSchoolId) {
    this.ncesSchoolId = ncesSchoolId;
    return this;
  }

   /**
   * Get ncesSchoolId
   * @return ncesSchoolId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNcesSchoolId() {
    return ncesSchoolId;
  }

  public void setNcesSchoolId(String ncesSchoolId) {
    this.ncesSchoolId = ncesSchoolId;
  }

  public School ncesDistrictId(String ncesDistrictId) {
    this.ncesDistrictId = ncesDistrictId;
    return this;
  }

   /**
   * Get ncesDistrictId
   * @return ncesDistrictId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNcesDistrictId() {
    return ncesDistrictId;
  }

  public void setNcesDistrictId(String ncesDistrictId) {
    this.ncesDistrictId = ncesDistrictId;
  }

  public School ncesDataYear(String ncesDataYear) {
    this.ncesDataYear = ncesDataYear;
    return this;
  }

   /**
   * Get ncesDataYear
   * @return ncesDataYear
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNcesDataYear() {
    return ncesDataYear;
  }

  public void setNcesDataYear(String ncesDataYear) {
    this.ncesDataYear = ncesDataYear;
  }

  public School schoolRanking(List<SchoolRanking> schoolRanking) {
    this.schoolRanking = schoolRanking;
    return this;
  }

   /**
   * Get schoolRanking
   * @return schoolRanking
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SchoolRanking> getSchoolRanking() {
    return schoolRanking;
  }

  public void setSchoolRanking(List<SchoolRanking> schoolRanking) {
    this.schoolRanking = schoolRanking;
  }

  public School students(String students) {
    this.students = students;
    return this;
  }

   /**
   * Get students
   * @return students
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStudents() {
    return students;
  }

  public void setStudents(String students) {
    this.students = students;
  }

  public School teachers(String teachers) {
    this.teachers = teachers;
    return this;
  }

   /**
   * Get teachers
   * @return teachers
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTeachers() {
    return teachers;
  }

  public void setTeachers(String teachers) {
    this.teachers = teachers;
  }

  public School status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public School studentTeacherRatio(String studentTeacherRatio) {
    this.studentTeacherRatio = studentTeacherRatio;
    return this;
  }

   /**
   * Get studentTeacherRatio
   * @return studentTeacherRatio
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStudentTeacherRatio() {
    return studentTeacherRatio;
  }

  public void setStudentTeacherRatio(String studentTeacherRatio) {
    this.studentTeacherRatio = studentTeacherRatio;
  }

  public School choice(String choice) {
    this.choice = choice;
    return this;
  }

   /**
   * Get choice
   * @return choice
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChoice() {
    return choice;
  }

  public void setChoice(String choice) {
    this.choice = choice;
  }

  public School coextensiv(String coextensiv) {
    this.coextensiv = coextensiv;
    return this;
  }

   /**
   * Get coextensiv
   * @return coextensiv
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCoextensiv() {
    return coextensiv;
  }

  public void setCoextensiv(String coextensiv) {
    this.coextensiv = coextensiv;
  }

  public School schoolDistricts(SchoolDistrict schoolDistricts) {
    this.schoolDistricts = schoolDistricts;
    return this;
  }

   /**
   * Get schoolDistricts
   * @return schoolDistricts
  **/
  @ApiModelProperty(example = "null", value = "")
  public SchoolDistrict getSchoolDistricts() {
    return schoolDistricts;
  }

  public void setSchoolDistricts(SchoolDistrict schoolDistricts) {
    this.schoolDistricts = schoolDistricts;
  }

  public School schoolProfile(SchoolProfile schoolProfile) {
    this.schoolProfile = schoolProfile;
    return this;
  }

   /**
   * Get schoolProfile
   * @return schoolProfile
  **/
  @ApiModelProperty(example = "null", value = "")
  public SchoolProfile getSchoolProfile() {
    return schoolProfile;
  }

  public void setSchoolProfile(SchoolProfile schoolProfile) {
    this.schoolProfile = schoolProfile;
  }

  public School gradeLevelsTaught(GradeLevelsTaught gradeLevelsTaught) {
    this.gradeLevelsTaught = gradeLevelsTaught;
    return this;
  }

   /**
   * Get gradeLevelsTaught
   * @return gradeLevelsTaught
  **/
  @ApiModelProperty(example = "null", value = "")
  public GradeLevelsTaught getGradeLevelsTaught() {
    return gradeLevelsTaught;
  }

  public void setGradeLevelsTaught(GradeLevelsTaught gradeLevelsTaught) {
    this.gradeLevelsTaught = gradeLevelsTaught;
  }

  public School distance(Distance distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @ApiModelProperty(example = "null", value = "")
  public Distance getDistance() {
    return distance;
  }

  public void setDistance(Distance distance) {
    this.distance = distance;
  }

  public School geometry(Geometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  @ApiModelProperty(example = "null", value = "")
  public Geometry getGeometry() {
    return geometry;
  }

  public void setGeometry(Geometry geometry) {
    this.geometry = geometry;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    School school = (School) o;
    return Objects.equals(this.id, school.id) &&
        Objects.equals(this.name, school.name) &&
        Objects.equals(this.assigned, school.assigned) &&
        Objects.equals(this.phone, school.phone) &&
        Objects.equals(this.website, school.website) &&
        Objects.equals(this.addressType, school.addressType) &&
        Objects.equals(this.address, school.address) &&
        Objects.equals(this.lowestGrade, school.lowestGrade) &&
        Objects.equals(this.highestGrade, school.highestGrade) &&
        Objects.equals(this.schoolType, school.schoolType) &&
        Objects.equals(this.schoolTypeDesc, school.schoolTypeDesc) &&
        Objects.equals(this.schoolSubType, school.schoolSubType) &&
        Objects.equals(this.schoolSubTypeDesc, school.schoolSubTypeDesc) &&
        Objects.equals(this.gender, school.gender) &&
        Objects.equals(this.genderDesc, school.genderDesc) &&
        Objects.equals(this.educationLevel, school.educationLevel) &&
        Objects.equals(this.educationLevelDesc, school.educationLevelDesc) &&
        Objects.equals(this.greatschools, school.greatschools) &&
        Objects.equals(this.ncesSchoolId, school.ncesSchoolId) &&
        Objects.equals(this.ncesDistrictId, school.ncesDistrictId) &&
        Objects.equals(this.ncesDataYear, school.ncesDataYear) &&
        Objects.equals(this.schoolRanking, school.schoolRanking) &&
        Objects.equals(this.students, school.students) &&
        Objects.equals(this.teachers, school.teachers) &&
        Objects.equals(this.status, school.status) &&
        Objects.equals(this.studentTeacherRatio, school.studentTeacherRatio) &&
        Objects.equals(this.choice, school.choice) &&
        Objects.equals(this.coextensiv, school.coextensiv) &&
        Objects.equals(this.schoolDistricts, school.schoolDistricts) &&
        Objects.equals(this.schoolProfile, school.schoolProfile) &&
        Objects.equals(this.gradeLevelsTaught, school.gradeLevelsTaught) &&
        Objects.equals(this.distance, school.distance) &&
        Objects.equals(this.geometry, school.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, assigned, phone, website, addressType, address, lowestGrade, highestGrade, schoolType, schoolTypeDesc, schoolSubType, schoolSubTypeDesc, gender, genderDesc, educationLevel, educationLevelDesc, greatschools, ncesSchoolId, ncesDistrictId, ncesDataYear, schoolRanking, students, teachers, status, studentTeacherRatio, choice, coextensiv, schoolDistricts, schoolProfile, gradeLevelsTaught, distance, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class School {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    lowestGrade: ").append(toIndentedString(lowestGrade)).append("\n");
    sb.append("    highestGrade: ").append(toIndentedString(highestGrade)).append("\n");
    sb.append("    schoolType: ").append(toIndentedString(schoolType)).append("\n");
    sb.append("    schoolTypeDesc: ").append(toIndentedString(schoolTypeDesc)).append("\n");
    sb.append("    schoolSubType: ").append(toIndentedString(schoolSubType)).append("\n");
    sb.append("    schoolSubTypeDesc: ").append(toIndentedString(schoolSubTypeDesc)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    genderDesc: ").append(toIndentedString(genderDesc)).append("\n");
    sb.append("    educationLevel: ").append(toIndentedString(educationLevel)).append("\n");
    sb.append("    educationLevelDesc: ").append(toIndentedString(educationLevelDesc)).append("\n");
    sb.append("    greatschools: ").append(toIndentedString(greatschools)).append("\n");
    sb.append("    ncesSchoolId: ").append(toIndentedString(ncesSchoolId)).append("\n");
    sb.append("    ncesDistrictId: ").append(toIndentedString(ncesDistrictId)).append("\n");
    sb.append("    ncesDataYear: ").append(toIndentedString(ncesDataYear)).append("\n");
    sb.append("    schoolRanking: ").append(toIndentedString(schoolRanking)).append("\n");
    sb.append("    students: ").append(toIndentedString(students)).append("\n");
    sb.append("    teachers: ").append(toIndentedString(teachers)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    studentTeacherRatio: ").append(toIndentedString(studentTeacherRatio)).append("\n");
    sb.append("    choice: ").append(toIndentedString(choice)).append("\n");
    sb.append("    coextensiv: ").append(toIndentedString(coextensiv)).append("\n");
    sb.append("    schoolDistricts: ").append(toIndentedString(schoolDistricts)).append("\n");
    sb.append("    schoolProfile: ").append(toIndentedString(schoolProfile)).append("\n");
    sb.append("    gradeLevelsTaught: ").append(toIndentedString(gradeLevelsTaught)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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

