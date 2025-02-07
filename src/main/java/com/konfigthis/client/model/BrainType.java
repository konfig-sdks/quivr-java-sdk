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
 * Gets or Sets BrainType
 */
@JsonAdapter(BrainType.Adapter.class)public enum BrainType {
  
  DOC("doc"),
  
  API("api"),
  
  COMPOSITE("composite"),
  
  INTEGRATION("integration");

  private String value;

  BrainType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BrainType fromValue(String value) {
    for (BrainType b : BrainType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<BrainType> {
    @Override
    public void write(final JsonWriter jsonWriter, final BrainType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BrainType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BrainType.fromValue(value);
    }
  }
}

