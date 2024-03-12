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


package io.swagger.client.api;

import io.swagger.client.model.ForecastResponse;
import io.swagger.client.model.HeaterState;
import io.swagger.client.model.ModelApiResponse;
import io.swagger.client.model.TemperatueZoneStatus;
import io.swagger.client.model.TemperatureSummary;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnvironmentApi
 */
@Ignore
public class EnvironmentApiTest {

    private final EnvironmentApi api = new EnvironmentApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getForecastTest() throws Exception {
        Integer days = null;
        ForecastResponse response = api.getForecast(days);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * gets the state of the heater
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getHeaterStateTest() throws Exception {
        String zoneId = null;
        HeaterState response = api.getHeaterState(zoneId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getZoneTemperatureTest() throws Exception {
        String zoneId = null;
        TemperatueZoneStatus response = api.getZoneTemperature(zoneId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * turns the heater on or off
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setHeaterStateTest() throws Exception {
        String zoneId = null;
        String state = null;
        ModelApiResponse response = api.setHeaterState(zoneId, state);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void temperatureSummaryTest() throws Exception {
        TemperatureSummary response = api.temperatureSummary();

        // TODO: test validations
    }
    
}