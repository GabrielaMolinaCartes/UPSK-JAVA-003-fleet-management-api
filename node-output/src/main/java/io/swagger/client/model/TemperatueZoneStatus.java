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
import org.threeten.bp.OffsetDateTime;

/**
 * status of a single zone
 */
@ApiModel(description = "status of a single zone")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-12T15:25:46.864Z")
public class TemperatueZoneStatus {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("value")
  private Double value = null;

  /**
   * the temperature units
   */
  @JsonAdapter(UnitsEnum.Adapter.class)
  public enum UnitsEnum {
    CELSIUS("celsius"),
    
    FAHRENHEIT("fahrenheit");

    private String value;

    UnitsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitsEnum fromValue(String text) {
      for (UnitsEnum b : UnitsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<UnitsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UnitsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("units")
  private UnitsEnum units = UnitsEnum.FAHRENHEIT;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  public TemperatueZoneStatus id(String id) {
    this.id = id;
    return this;
  }

   /**
   * the unique identifier for the zone
   * @return id
  **/
  @ApiModelProperty(required = true, value = "the unique identifier for the zone")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TemperatueZoneStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * the name of the zone
   * @return name
  **/
  @ApiModelProperty(value = "the name of the zone")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TemperatueZoneStatus value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * the temperature in the zone
   * @return value
  **/
  @ApiModelProperty(required = true, value = "the temperature in the zone")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public TemperatueZoneStatus units(UnitsEnum units) {
    this.units = units;
    return this;
  }

   /**
   * the temperature units
   * @return units
  **/
  @ApiModelProperty(value = "the temperature units")
  public UnitsEnum getUnits() {
    return units;
  }

  public void setUnits(UnitsEnum units) {
    this.units = units;
  }

  public TemperatueZoneStatus timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * the timestamp when the temperature was measured
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "the timestamp when the temperature was measured")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemperatueZoneStatus temperatueZoneStatus = (TemperatueZoneStatus) o;
    return Objects.equals(this.id, temperatueZoneStatus.id) &&
        Objects.equals(this.name, temperatueZoneStatus.name) &&
        Objects.equals(this.value, temperatueZoneStatus.value) &&
        Objects.equals(this.units, temperatueZoneStatus.units) &&
        Objects.equals(this.timestamp, temperatueZoneStatus.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, value, units, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemperatueZoneStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

