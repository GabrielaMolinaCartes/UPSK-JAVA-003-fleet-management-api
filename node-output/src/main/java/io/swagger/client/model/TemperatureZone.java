/*
 * home-iot-api
 * The API for the EatBacon IOT project
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

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
 * a single temperature zone
 */
@ApiModel(description = "a single temperature zone")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-12T15:25:46.864Z")
public class TemperatureZone {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("inputPosition")
  private Integer inputPosition = null;

  @SerializedName("outputPosition")
  private Integer outputPosition = null;

  @SerializedName("zone")
  private String zone = null;

  public TemperatureZone id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * the unique identifier for the zone
   * @return id
  **/
  @ApiModelProperty(required = true, value = "the unique identifier for the zone")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TemperatureZone name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TemperatureZone inputPosition(Integer inputPosition) {
    this.inputPosition = inputPosition;
    return this;
  }

   /**
   * Get inputPosition
   * @return inputPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getInputPosition() {
    return inputPosition;
  }

  public void setInputPosition(Integer inputPosition) {
    this.inputPosition = inputPosition;
  }

  public TemperatureZone outputPosition(Integer outputPosition) {
    this.outputPosition = outputPosition;
    return this;
  }

   /**
   * Get outputPosition
   * @return outputPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getOutputPosition() {
    return outputPosition;
  }

  public void setOutputPosition(Integer outputPosition) {
    this.outputPosition = outputPosition;
  }

  public TemperatureZone zone(String zone) {
    this.zone = zone;
    return this;
  }

   /**
   * Get zone
   * @return zone
  **/
  @ApiModelProperty(value = "")
  public String getZone() {
    return zone;
  }

  public void setZone(String zone) {
    this.zone = zone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemperatureZone temperatureZone = (TemperatureZone) o;
    return Objects.equals(this.id, temperatureZone.id) &&
        Objects.equals(this.name, temperatureZone.name) &&
        Objects.equals(this.inputPosition, temperatureZone.inputPosition) &&
        Objects.equals(this.outputPosition, temperatureZone.outputPosition) &&
        Objects.equals(this.zone, temperatureZone.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, inputPosition, outputPosition, zone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemperatureZone {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    inputPosition: ").append(toIndentedString(inputPosition)).append("\n");
    sb.append("    outputPosition: ").append(toIndentedString(outputPosition)).append("\n");
    sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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

