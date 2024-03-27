# ChatApi

All URIs are relative to *https://api.quivr.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addQuestionAndAnswer**](ChatApi.md#addQuestionAndAnswer) | **POST** /chat/{chat_id}/question/answer | Add Question And Answer Handler |
| [**createHandler**](ChatApi.md#createHandler) | **POST** /chat | Create Chat Handler |
| [**createStreamQuestionHandler**](ChatApi.md#createStreamQuestionHandler) | **POST** /chat/{chat_id}/question/stream | Create Stream Question Handler |
| [**deleteChatById**](ChatApi.md#deleteChatById) | **DELETE** /chat/{chat_id} | Delete Chat |
| [**getAllChats**](ChatApi.md#getAllChats) | **GET** /chat | Get Chats |
| [**getHistory**](ChatApi.md#getHistory) | **GET** /chat/{chat_id}/history | Get Chat History Handler |
| [**handleQuestion**](ChatApi.md#handleQuestion) | **POST** /chat/{chat_id}/question | Create Question Handler |
| [**updateMessage**](ChatApi.md#updateMessage) | **PUT** /chat/{chat_id}/{message_id} | Update Chat Message |
| [**updateMetadataHandler**](ChatApi.md#updateMetadataHandler) | **PUT** /chat/{chat_id}/metadata | Update Chat Metadata Handler |


<a name="addQuestionAndAnswer"></a>
# **addQuestionAndAnswer**
> ChatNullable addQuestionAndAnswer(chatId, questionAndAnswer).execute();

Add Question And Answer Handler

Add a new question and anwser to the chat.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.quivr.app";
    
    // Configure HTTP bearer authorization: AuthBearer
    configuration.token = "BEARER TOKEN";
    Quivr client = new Quivr(configuration);
    String question = "question_example";
    String answer = "answer_example";
    UUID chatId = UUID.randomUUID();
    try {
      ChatNullable result = client
              .chat
              .addQuestionAndAnswer(question, answer, chatId)
              .execute();
      System.out.println(result);
      System.out.println(result.getChatId());
      System.out.println(result.getUserId());
      System.out.println(result.getCreationTime());
      System.out.println(result.getChatName());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#addQuestionAndAnswer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChatNullable> response = client
              .chat
              .addQuestionAndAnswer(question, answer, chatId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#addQuestionAndAnswer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID**|  | |
| **questionAndAnswer** | [**QuestionAndAnswer**](QuestionAndAnswer.md)|  | |

### Return type

[**ChatNullable**](ChatNullable.md)

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="createHandler"></a>
# **createHandler**
> Object createHandler(createChatProperties).execute();

Create Chat Handler

Create a new chat with initial chat messages.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.quivr.app";
    
    // Configure HTTP bearer authorization: AuthBearer
    configuration.token = "BEARER TOKEN";
    Quivr client = new Quivr(configuration);
    String name = "name_example";
    try {
      Object result = client
              .chat
              .createHandler(name)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#createHandler");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .chat
              .createHandler(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#createHandler");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createChatProperties** | [**CreateChatProperties**](CreateChatProperties.md)|  | |

### Return type

**Object**

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="createStreamQuestionHandler"></a>
# **createStreamQuestionHandler**
> Object createStreamQuestionHandler(chatId, chatQuestion).brainId(brainId).execute();

Create Stream Question Handler

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.quivr.app";
    
    // Configure HTTP bearer authorization: AuthBearer
    configuration.token = "BEARER TOKEN";
    Quivr client = new Quivr(configuration);
    String question = "question_example";
    UUID chatId = UUID.randomUUID();
    String model = "model_example";
    Double temperature = 3.4D;
    Integer maxTokens = 56;
    UUID brainId = UUID.randomUUID();
    UUID promptId = UUID.randomUUID();
    UUID brainId = UUID.randomUUID();
    try {
      Object result = client
              .chat
              .createStreamQuestionHandler(question, chatId)
              .model(model)
              .temperature(temperature)
              .maxTokens(maxTokens)
              .brainId(brainId)
              .promptId(promptId)
              .brainId(brainId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#createStreamQuestionHandler");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .chat
              .createStreamQuestionHandler(question, chatId)
              .model(model)
              .temperature(temperature)
              .maxTokens(maxTokens)
              .brainId(brainId)
              .promptId(promptId)
              .brainId(brainId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#createStreamQuestionHandler");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID**|  | |
| **chatQuestion** | [**ChatQuestion**](ChatQuestion.md)|  | |
| **brainId** | **UUID**|  | [optional] |

### Return type

**Object**

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="deleteChatById"></a>
# **deleteChatById**
> Object deleteChatById(chatId).execute();

Delete Chat

Delete a specific chat by chat ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.quivr.app";
    
    // Configure HTTP bearer authorization: AuthBearer
    configuration.token = "BEARER TOKEN";
    Quivr client = new Quivr(configuration);
    UUID chatId = UUID.randomUUID();
    try {
      Object result = client
              .chat
              .deleteChatById(chatId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#deleteChatById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .chat
              .deleteChatById(chatId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#deleteChatById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID**|  | |

### Return type

**Object**

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getAllChats"></a>
# **getAllChats**
> Object getAllChats().execute();

Get Chats

Retrieve all chats for the current user.  - &#x60;current_user&#x60;: The current authenticated user. - Returns a list of all chats for the user.  This endpoint retrieves all the chats associated with the current authenticated user. It returns a list of chat objects containing the chat ID and chat name for each chat.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.quivr.app";
    
    // Configure HTTP bearer authorization: AuthBearer
    configuration.token = "BEARER TOKEN";
    Quivr client = new Quivr(configuration);
    try {
      Object result = client
              .chat
              .getAllChats()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#getAllChats");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .chat
              .getAllChats()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#getAllChats");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getHistory"></a>
# **getHistory**
> List&lt;ChatItem&gt; getHistory(chatId).execute();

Get Chat History Handler

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.quivr.app";
    
    // Configure HTTP bearer authorization: AuthBearer
    configuration.token = "BEARER TOKEN";
    Quivr client = new Quivr(configuration);
    UUID chatId = UUID.randomUUID();
    try {
      List<ChatItem> result = client
              .chat
              .getHistory(chatId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#getHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ChatItem>> response = client
              .chat
              .getHistory(chatId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#getHistory");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID**|  | |

### Return type

[**List&lt;ChatItem&gt;**](ChatItem.md)

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="handleQuestion"></a>
# **handleQuestion**
> Object handleQuestion(chatId, chatQuestion).brainId(brainId).execute();

Create Question Handler

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.quivr.app";
    
    // Configure HTTP bearer authorization: AuthBearer
    configuration.token = "BEARER TOKEN";
    Quivr client = new Quivr(configuration);
    String question = "question_example";
    UUID chatId = UUID.randomUUID();
    String model = "model_example";
    Double temperature = 3.4D;
    Integer maxTokens = 56;
    UUID brainId = UUID.randomUUID();
    UUID promptId = UUID.randomUUID();
    UUID brainId = UUID.randomUUID();
    try {
      Object result = client
              .chat
              .handleQuestion(question, chatId)
              .model(model)
              .temperature(temperature)
              .maxTokens(maxTokens)
              .brainId(brainId)
              .promptId(promptId)
              .brainId(brainId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#handleQuestion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .chat
              .handleQuestion(question, chatId)
              .model(model)
              .temperature(temperature)
              .maxTokens(maxTokens)
              .brainId(brainId)
              .promptId(promptId)
              .brainId(brainId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#handleQuestion");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID**|  | |
| **chatQuestion** | [**ChatQuestion**](ChatQuestion.md)|  | |
| **brainId** | **UUID**|  | [optional] |

### Return type

**Object**

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="updateMessage"></a>
# **updateMessage**
> Object updateMessage(chatId, messageId, chatMessageProperties).execute();

Update Chat Message

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.quivr.app";
    
    // Configure HTTP bearer authorization: AuthBearer
    configuration.token = "BEARER TOKEN";
    Quivr client = new Quivr(configuration);
    Boolean thumbs = true;
    UUID chatId = UUID.randomUUID();
    UUID messageId = UUID.randomUUID();
    try {
      Object result = client
              .chat
              .updateMessage(thumbs, chatId, messageId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#updateMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .chat
              .updateMessage(thumbs, chatId, messageId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#updateMessage");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID**|  | |
| **messageId** | **UUID**|  | |
| **chatMessageProperties** | [**ChatMessageProperties**](ChatMessageProperties.md)|  | |

### Return type

**Object**

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="updateMetadataHandler"></a>
# **updateMetadataHandler**
> Object updateMetadataHandler(chatId, chatUpdatableProperties).execute();

Update Chat Metadata Handler

Update chat attributes

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ChatApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.quivr.app";
    
    // Configure HTTP bearer authorization: AuthBearer
    configuration.token = "BEARER TOKEN";
    Quivr client = new Quivr(configuration);
    UUID chatId = UUID.randomUUID();
    String chatName = "chatName_example";
    try {
      Object result = client
              .chat
              .updateMetadataHandler(chatId)
              .chatName(chatName)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#updateMetadataHandler");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .chat
              .updateMetadataHandler(chatId)
              .chatName(chatName)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ChatApi#updateMetadataHandler");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **chatId** | **UUID**|  | |
| **chatUpdatableProperties** | [**ChatUpdatableProperties**](ChatUpdatableProperties.md)|  | |

### Return type

**Object**

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

