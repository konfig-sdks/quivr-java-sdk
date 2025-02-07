/*
 * FastAPI
 * Open-source RAG Framework
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ApiBrainAllowedMethods
 */
@JsonAdapter(ApiBrainAllowedMethods.Adapter.class)public enum ApiBrainAllowedMethods {
  
  GET("GET"),
  
  POST("POST"),
  
  PUT("PUT"),
  
  DELETE("DELETE");

  private String value;

  ApiBrainAllowedMethods(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ApiBrainAllowedMethods fromValue(String value) {
    for (ApiBrainAllowedMethods b : ApiBrainAllowedMethods.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ApiBrainAllowedMethods> {
    @Override
    public void write(final JsonWriter jsonWriter, final ApiBrainAllowedMethods enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ApiBrainAllowedMethods read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ApiBrainAllowedMethods.fromValue(value);
    }
  }
}

