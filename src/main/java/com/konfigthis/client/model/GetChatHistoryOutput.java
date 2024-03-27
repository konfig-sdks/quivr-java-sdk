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
import com.konfigthis.client.model.NotificationsStatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * GetChatHistoryOutput
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetChatHistoryOutput {
  public static final String SERIALIZED_NAME_CHAT_ID = "chat_id";
  @SerializedName(SERIALIZED_NAME_CHAT_ID)
  private UUID chatId;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "message_id";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private UUID messageId;

  public static final String SERIALIZED_NAME_USER_MESSAGE = "user_message";
  @SerializedName(SERIALIZED_NAME_USER_MESSAGE)
  private String userMessage;

  public static final String SERIALIZED_NAME_ASSISTANT = "assistant";
  @SerializedName(SERIALIZED_NAME_ASSISTANT)
  private String assistant;

  public static final String SERIALIZED_NAME_MESSAGE_TIME = "message_time";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TIME)
  private String messageTime;

  public static final String SERIALIZED_NAME_PROMPT_TITLE = "prompt_title";
  @SerializedName(SERIALIZED_NAME_PROMPT_TITLE)
  private String promptTitle;

  public static final String SERIALIZED_NAME_BRAIN_NAME = "brain_name";
  @SerializedName(SERIALIZED_NAME_BRAIN_NAME)
  private String brainName;

  public static final String SERIALIZED_NAME_BRAIN_ID = "brain_id";
  @SerializedName(SERIALIZED_NAME_BRAIN_ID)
  private String brainId;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_THUMBS = "thumbs";
  @SerializedName(SERIALIZED_NAME_THUMBS)
  private Boolean thumbs;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DATETIME = "datetime";
  @SerializedName(SERIALIZED_NAME_DATETIME)
  private String datetime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private NotificationsStatusEnum status;

  public GetChatHistoryOutput() {
  }

  public GetChatHistoryOutput chatId(UUID chatId) {
    
    
    
    
    this.chatId = chatId;
    return this;
  }

   /**
   * Get chatId
   * @return chatId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getChatId() {
    return chatId;
  }


  public void setChatId(UUID chatId) {
    
    
    
    this.chatId = chatId;
  }


  public GetChatHistoryOutput messageId(UUID messageId) {
    
    
    
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getMessageId() {
    return messageId;
  }


  public void setMessageId(UUID messageId) {
    
    
    
    this.messageId = messageId;
  }


  public GetChatHistoryOutput userMessage(String userMessage) {
    
    
    
    
    this.userMessage = userMessage;
    return this;
  }

   /**
   * Get userMessage
   * @return userMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserMessage() {
    return userMessage;
  }


  public void setUserMessage(String userMessage) {
    
    
    
    this.userMessage = userMessage;
  }


  public GetChatHistoryOutput assistant(String assistant) {
    
    
    
    
    this.assistant = assistant;
    return this;
  }

   /**
   * Get assistant
   * @return assistant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssistant() {
    return assistant;
  }


  public void setAssistant(String assistant) {
    
    
    
    this.assistant = assistant;
  }


  public GetChatHistoryOutput messageTime(String messageTime) {
    
    
    
    
    this.messageTime = messageTime;
    return this;
  }

   /**
   * Get messageTime
   * @return messageTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessageTime() {
    return messageTime;
  }


  public void setMessageTime(String messageTime) {
    
    
    
    this.messageTime = messageTime;
  }


  public GetChatHistoryOutput promptTitle(String promptTitle) {
    
    
    
    
    this.promptTitle = promptTitle;
    return this;
  }

   /**
   * Get promptTitle
   * @return promptTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPromptTitle() {
    return promptTitle;
  }


  public void setPromptTitle(String promptTitle) {
    
    
    
    this.promptTitle = promptTitle;
  }


  public GetChatHistoryOutput brainName(String brainName) {
    
    
    
    
    this.brainName = brainName;
    return this;
  }

   /**
   * Get brainName
   * @return brainName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrainName() {
    return brainName;
  }


  public void setBrainName(String brainName) {
    
    
    
    this.brainName = brainName;
  }


  public GetChatHistoryOutput brainId(String brainId) {
    
    
    
    
    this.brainId = brainId;
    return this;
  }

   /**
   * Get brainId
   * @return brainId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBrainId() {
    return brainId;
  }


  public void setBrainId(String brainId) {
    
    
    
    this.brainId = brainId;
  }


  public GetChatHistoryOutput metadata(Object metadata) {
    
    
    
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    
    
    
    this.metadata = metadata;
  }


  public GetChatHistoryOutput thumbs(Boolean thumbs) {
    
    
    
    
    this.thumbs = thumbs;
    return this;
  }

   /**
   * Get thumbs
   * @return thumbs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getThumbs() {
    return thumbs;
  }


  public void setThumbs(Boolean thumbs) {
    
    
    
    this.thumbs = thumbs;
  }


  public GetChatHistoryOutput id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public GetChatHistoryOutput datetime(String datetime) {
    
    
    
    
    this.datetime = datetime;
    return this;
  }

   /**
   * Get datetime
   * @return datetime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatetime() {
    return datetime;
  }


  public void setDatetime(String datetime) {
    
    
    
    this.datetime = datetime;
  }


  public GetChatHistoryOutput message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
  }


  public GetChatHistoryOutput action(String action) {
    
    
    
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    
    
    
    this.action = action;
  }


  public GetChatHistoryOutput status(NotificationsStatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NotificationsStatusEnum getStatus() {
    return status;
  }


  public void setStatus(NotificationsStatusEnum status) {
    
    
    
    this.status = status;
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
   * @return the GetChatHistoryOutput instance itself
   */
  public GetChatHistoryOutput putAdditionalProperty(String key, Object value) {
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
    GetChatHistoryOutput getChatHistoryOutput = (GetChatHistoryOutput) o;
    return Objects.equals(this.chatId, getChatHistoryOutput.chatId) &&
        Objects.equals(this.messageId, getChatHistoryOutput.messageId) &&
        Objects.equals(this.userMessage, getChatHistoryOutput.userMessage) &&
        Objects.equals(this.assistant, getChatHistoryOutput.assistant) &&
        Objects.equals(this.messageTime, getChatHistoryOutput.messageTime) &&
        Objects.equals(this.promptTitle, getChatHistoryOutput.promptTitle) &&
        Objects.equals(this.brainName, getChatHistoryOutput.brainName) &&
        Objects.equals(this.brainId, getChatHistoryOutput.brainId) &&
        Objects.equals(this.metadata, getChatHistoryOutput.metadata) &&
        Objects.equals(this.thumbs, getChatHistoryOutput.thumbs) &&
        Objects.equals(this.id, getChatHistoryOutput.id) &&
        Objects.equals(this.datetime, getChatHistoryOutput.datetime) &&
        Objects.equals(this.message, getChatHistoryOutput.message) &&
        Objects.equals(this.action, getChatHistoryOutput.action) &&
        Objects.equals(this.status, getChatHistoryOutput.status)&&
        Objects.equals(this.additionalProperties, getChatHistoryOutput.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(chatId, messageId, userMessage, assistant, messageTime, promptTitle, brainName, brainId, metadata, thumbs, id, datetime, message, action, status, additionalProperties);
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
    sb.append("class GetChatHistoryOutput {\n");
    sb.append("    chatId: ").append(toIndentedString(chatId)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    userMessage: ").append(toIndentedString(userMessage)).append("\n");
    sb.append("    assistant: ").append(toIndentedString(assistant)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    promptTitle: ").append(toIndentedString(promptTitle)).append("\n");
    sb.append("    brainName: ").append(toIndentedString(brainName)).append("\n");
    sb.append("    brainId: ").append(toIndentedString(brainId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    thumbs: ").append(toIndentedString(thumbs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("chat_id");
    openapiFields.add("message_id");
    openapiFields.add("user_message");
    openapiFields.add("assistant");
    openapiFields.add("message_time");
    openapiFields.add("prompt_title");
    openapiFields.add("brain_name");
    openapiFields.add("brain_id");
    openapiFields.add("metadata");
    openapiFields.add("thumbs");
    openapiFields.add("id");
    openapiFields.add("datetime");
    openapiFields.add("message");
    openapiFields.add("action");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetChatHistoryOutput
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetChatHistoryOutput.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetChatHistoryOutput is not found in the empty JSON string", GetChatHistoryOutput.openapiRequiredFields.toString()));
        }
      }
      if (!jsonObj.get("chat_id").isJsonNull() && (jsonObj.get("chat_id") != null && !jsonObj.get("chat_id").isJsonNull()) && !jsonObj.get("chat_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chat_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chat_id").toString()));
      }
      if ((jsonObj.get("message_id") != null && !jsonObj.get("message_id").isJsonNull()) && !jsonObj.get("message_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_id").toString()));
      }
      if ((jsonObj.get("user_message") != null && !jsonObj.get("user_message").isJsonNull()) && !jsonObj.get("user_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_message").toString()));
      }
      if ((jsonObj.get("assistant") != null && !jsonObj.get("assistant").isJsonNull()) && !jsonObj.get("assistant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assistant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assistant").toString()));
      }
      if (!jsonObj.get("message_time").isJsonNull() && (jsonObj.get("message_time") != null && !jsonObj.get("message_time").isJsonNull()) && !jsonObj.get("message_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message_time").toString()));
      }
      if (!jsonObj.get("prompt_title").isJsonNull() && (jsonObj.get("prompt_title") != null && !jsonObj.get("prompt_title").isJsonNull()) && !jsonObj.get("prompt_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prompt_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prompt_title").toString()));
      }
      if (!jsonObj.get("brain_name").isJsonNull() && (jsonObj.get("brain_name") != null && !jsonObj.get("brain_name").isJsonNull()) && !jsonObj.get("brain_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brain_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brain_name").toString()));
      }
      if (!jsonObj.get("brain_id").isJsonNull() && (jsonObj.get("brain_id") != null && !jsonObj.get("brain_id").isJsonNull()) && !jsonObj.get("brain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brain_id").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("datetime") != null && !jsonObj.get("datetime").isJsonNull()) && !jsonObj.get("datetime").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datetime` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datetime").toString()));
      }
      if (!jsonObj.get("message").isJsonNull() && (jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetChatHistoryOutput.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetChatHistoryOutput' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetChatHistoryOutput> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetChatHistoryOutput.class));

       return (TypeAdapter<T>) new TypeAdapter<GetChatHistoryOutput>() {
           @Override
           public void write(JsonWriter out, GetChatHistoryOutput value) throws IOException {
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
           public GetChatHistoryOutput read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetChatHistoryOutput instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetChatHistoryOutput given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetChatHistoryOutput
  * @throws IOException if the JSON string is invalid with respect to GetChatHistoryOutput
  */
  public static GetChatHistoryOutput fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetChatHistoryOutput.class);
  }

 /**
  * Convert an instance of GetChatHistoryOutput to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

