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
 * ForecastTemperature
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-12T15:25:46.864Z")
public class ForecastTemperature {
  @SerializedName("low")
  private Double low = null;

  @SerializedName("high")
  private Double high = null;

  @SerializedName("morning")
  private Double morning = null;

  @SerializedName("day")
  private Double day = null;

  @SerializedName("evening")
  private Double evening = null;

  @SerializedName("night")
  private Double night = null;

  public ForecastTemperature low(Double low) {
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @ApiModelProperty(value = "")
  public Double getLow() {
    return low;
  }

  public void setLow(Double low) {
    this.low = low;
  }

  public ForecastTemperature high(Double high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @ApiModelProperty(value = "")
  public Double getHigh() {
    return high;
  }

  public void setHigh(Double high) {
    this.high = high;
  }

  public ForecastTemperature morning(Double morning) {
    this.morning = morning;
    return this;
  }

   /**
   * Get morning
   * @return morning
  **/
  @ApiModelProperty(value = "")
  public Double getMorning() {
    return morning;
  }

  public void setMorning(Double morning) {
    this.morning = morning;
  }

  public ForecastTemperature day(Double day) {
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @ApiModelProperty(value = "")
  public Double getDay() {
    return day;
  }

  public void setDay(Double day) {
    this.day = day;
  }

  public ForecastTemperature evening(Double evening) {
    this.evening = evening;
    return this;
  }

   /**
   * Get evening
   * @return evening
  **/
  @ApiModelProperty(value = "")
  public Double getEvening() {
    return evening;
  }

  public void setEvening(Double evening) {
    this.evening = evening;
  }

  public ForecastTemperature night(Double night) {
    this.night = night;
    return this;
  }

   /**
   * Get night
   * @return night
  **/
  @ApiModelProperty(value = "")
  public Double getNight() {
    return night;
  }

  public void setNight(Double night) {
    this.night = night;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastTemperature forecastTemperature = (ForecastTemperature) o;
    return Objects.equals(this.low, forecastTemperature.low) &&
        Objects.equals(this.high, forecastTemperature.high) &&
        Objects.equals(this.morning, forecastTemperature.morning) &&
        Objects.equals(this.day, forecastTemperature.day) &&
        Objects.equals(this.evening, forecastTemperature.evening) &&
        Objects.equals(this.night, forecastTemperature.night);
  }

  @Override
  public int hashCode() {
    return Objects.hash(low, high, morning, day, evening, night);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastTemperature {\n");
    
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    morning: ").append(toIndentedString(morning)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    evening: ").append(toIndentedString(evening)).append("\n");
    sb.append("    night: ").append(toIndentedString(night)).append("\n");
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
