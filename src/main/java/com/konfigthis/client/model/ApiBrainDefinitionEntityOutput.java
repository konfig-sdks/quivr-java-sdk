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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ApiBrainAllowedMethods;
import com.konfigthis.client.model.ApiBrainDefinitionSchema;
import com.konfigthis.client.model.ApiBrainDefinitionSecret;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ApiBrainDefinitionEntityOutput
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ApiBrainDefinitionEntityOutput {
  public static final String SERIALIZED_NAME_BRAIN_ID = "brain_id";
  @SerializedName(SERIALIZED_NAME_BRAIN_ID)
  private UUID brainId;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private ApiBrainAllowedMethods method;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private ApiBrainDefinitionSchema params;

  public static final String SERIALIZED_NAME_SEARCH_PARAMS = "search_params";
  @SerializedName(SERIALIZED_NAME_SEARCH_PARAMS)
  private ApiBrainDefinitionSchema searchParams;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<ApiBrainDefinitionSecret> secrets = new ArrayList<>();

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private Boolean raw = false;

  public static final String SERIALIZED_NAME_JQ_INSTRUCTIONS = "jq_instructions";
  @SerializedName(SERIALIZED_NAME_JQ_INSTRUCTIONS)
  private String jqInstructions;

  public ApiBrainDefinitionEntityOutput() {
  }

  public ApiBrainDefinitionEntityOutput brainId(UUID brainId) {
    
    
    
    
    this.brainId = brainId;
    return this;
  }

   /**
   * Get brainId
   * @return brainId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UUID getBrainId() {
    return brainId;
  }


  public void setBrainId(UUID brainId) {
    
    
    
    this.brainId = brainId;
  }


  public ApiBrainDefinitionEntityOutput method(ApiBrainAllowedMethods method) {
    
    
    
    
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ApiBrainAllowedMethods getMethod() {
    return method;
  }


  public void setMethod(ApiBrainAllowedMethods method) {
    
    
    
    this.method = method;
  }


  public ApiBrainDefinitionEntityOutput url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public ApiBrainDefinitionEntityOutput params(ApiBrainDefinitionSchema params) {
    
    
    
    
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ApiBrainDefinitionSchema getParams() {
    return params;
  }


  public void setParams(ApiBrainDefinitionSchema params) {
    
    
    
    this.params = params;
  }


  public ApiBrainDefinitionEntityOutput searchParams(ApiBrainDefinitionSchema searchParams) {
    
    
    
    
    this.searchParams = searchParams;
    return this;
  }

   /**
   * Get searchParams
   * @return searchParams
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ApiBrainDefinitionSchema getSearchParams() {
    return searchParams;
  }


  public void setSearchParams(ApiBrainDefinitionSchema searchParams) {
    
    
    
    this.searchParams = searchParams;
  }


  public ApiBrainDefinitionEntityOutput secrets(List<ApiBrainDefinitionSecret> secrets) {
    
    
    
    
    this.secrets = secrets;
    return this;
  }

  public ApiBrainDefinitionEntityOutput addSecretsItem(ApiBrainDefinitionSecret secretsItem) {
    this.secrets.add(secretsItem);
    return this;
  }

   /**
   * Get secrets
   * @return secrets
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<ApiBrainDefinitionSecret> getSecrets() {
    return secrets;
  }


  public void setSecrets(List<ApiBrainDefinitionSecret> secrets) {
    
    
    
    this.secrets = secrets;
  }


  public ApiBrainDefinitionEntityOutput raw(Boolean raw) {
    
    
    
    
    this.raw = raw;
    return this;
  }

   /**
   * Get raw
   * @return raw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getRaw() {
    return raw;
  }


  public void setRaw(Boolean raw) {
    
    
    
    this.raw = raw;
  }


  public ApiBrainDefinitionEntityOutput jqInstructions(String jqInstructions) {
    
    
    
    
    this.jqInstructions = jqInstructions;
    return this;
  }

   /**
   * Get jqInstructions
   * @return jqInstructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJqInstructions() {
    return jqInstructions;
  }


  public void setJqInstructions(String jqInstructions) {
    
    
    
    this.jqInstructions = jqInstructions;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ApiBrainDefinitionEntityOutput instance itself
   */
  public ApiBrainDefinitionEntityOutput putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiBrainDefinitionEntityOutput apiBrainDefinitionEntityOutput = (ApiBrainDefinitionEntityOutput) o;
    return Objects.equals(this.brainId, apiBrainDefinitionEntityOutput.brainId) &&
        Objects.equals(this.method, apiBrainDefinitionEntityOutput.method) &&
        Objects.equals(this.url, apiBrainDefinitionEntityOutput.url) &&
        Objects.equals(this.params, apiBrainDefinitionEntityOutput.params) &&
        Objects.equals(this.searchParams, apiBrainDefinitionEntityOutput.searchParams) &&
        Objects.equals(this.secrets, apiBrainDefinitionEntityOutput.secrets) &&
        Objects.equals(this.raw, apiBrainDefinitionEntityOutput.raw) &&
        Objects.equals(this.jqInstructions, apiBrainDefinitionEntityOutput.jqInstructions)&&
        Objects.equals(this.additionalProperties, apiBrainDefinitionEntityOutput.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brainId, method, url, params, searchParams, secrets, raw, jqInstructions, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiBrainDefinitionEntityOutput {\n");
    sb.append("    brainId: ").append(toIndentedString(brainId)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    jqInstructions: ").append(toIndentedString(jqInstructions)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("brain_id");
    openapiFields.add("method");
    openapiFields.add("url");
    openapiFields.add("params");
    openapiFields.add("search_params");
    openapiFields.add("secrets");
    openapiFields.add("raw");
    openapiFields.add("jq_instructions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("brain_id");
    openapiRequiredFields.add("method");
    openapiRequiredFields.add("url");
    openapiRequiredFields.add("params");
    openapiRequiredFields.add("search_params");
    openapiRequiredFields.add("secrets");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiBrainDefinitionEntityOutput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ApiBrainDefinitionEntityOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiBrainDefinitionEntityOutput is not found in the empty JSON string", ApiBrainDefinitionEntityOutput.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiBrainDefinitionEntityOutput.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("brain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brain_id").toString()));
      }
      if (!jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      // validate the required field `params`
      ApiBrainDefinitionSchema.validateJsonObject(jsonObj.getAsJsonObject("params"));
      // validate the required field `search_params`
      ApiBrainDefinitionSchema.validateJsonObject(jsonObj.getAsJsonObject("search_params"));
      // ensure the json data is an array
      if (!jsonObj.get("secrets").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `secrets` to be an array in the JSON string but got `%s`", jsonObj.get("secrets").toString()));
      }

      JsonArray jsonArraysecrets = jsonObj.getAsJsonArray("secrets");
      // validate the required field `secrets` (array)
      for (int i = 0; i < jsonArraysecrets.size(); i++) {
        ApiBrainDefinitionSecret.validateJsonObject(jsonArraysecrets.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("jq_instructions").isJsonNull() && (jsonObj.get("jq_instructions") != null && !jsonObj.get("jq_instructions").isJsonNull()) && !jsonObj.get("jq_instructions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jq_instructions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jq_instructions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiBrainDefinitionEntityOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiBrainDefinitionEntityOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiBrainDefinitionEntityOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiBrainDefinitionEntityOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiBrainDefinitionEntityOutput>() {
           @Override
           public void write(JsonWriter out, ApiBrainDefinitionEntityOutput value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiBrainDefinitionEntityOutput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ApiBrainDefinitionEntityOutput instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiBrainDefinitionEntityOutput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiBrainDefinitionEntityOutput
  * @throws IOException if the JSON string is invalid with respect to ApiBrainDefinitionEntityOutput
  */
  public static ApiBrainDefinitionEntityOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiBrainDefinitionEntityOutput.class);
  }

 /**
  * Convert an instance of ApiBrainDefinitionEntityOutput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

