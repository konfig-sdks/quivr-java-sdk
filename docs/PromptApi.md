# PromptApi

All URIs are relative to *https://api.quivr.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPromptById**](PromptApi.md#createPromptById) | **POST** /prompts | Create Prompt Route |
| [**getAllPublicPrompts**](PromptApi.md#getAllPublicPrompts) | **GET** /prompts | Get Prompts |
| [**getById**](PromptApi.md#getById) | **GET** /prompts/{prompt_id} | Get Prompt |
| [**updateById**](PromptApi.md#updateById) | **PUT** /prompts/{prompt_id} | Update Prompt |


<a name="createPromptById"></a>
# **createPromptById**
> PromptNullable createPromptById(createPromptProperties).execute();

Create Prompt Route

Create a prompt by its id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptApi;
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
    String title = "title_example";
    String content = "content_example";
    PromptStatusEnum status = PromptStatusEnum.fromValue("private");
    try {
      PromptNullable result = client
              .prompt
              .createPromptById(title, content)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getContent());
      System.out.println(result.getStatus());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptApi#createPromptById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PromptNullable> response = client
              .prompt
              .createPromptById(title, content)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptApi#createPromptById");
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
| **createPromptProperties** | [**CreatePromptProperties**](CreatePromptProperties.md)|  | |

### Return type

[**PromptNullable**](PromptNullable.md)

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getAllPublicPrompts"></a>
# **getAllPublicPrompts**
> List&lt;Prompt&gt; getAllPublicPrompts().execute();

Get Prompts

Retrieve all public prompt

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptApi;
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
      List<Prompt> result = client
              .prompt
              .getAllPublicPrompts()
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptApi#getAllPublicPrompts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Prompt>> response = client
              .prompt
              .getAllPublicPrompts()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptApi#getAllPublicPrompts");
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

[**List&lt;Prompt&gt;**](Prompt.md)

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getById"></a>
# **getById**
> PromptNullable getById(promptId).execute();

Get Prompt

Retrieve a prompt by its id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptApi;
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
    UUID promptId = UUID.randomUUID();
    try {
      PromptNullable result = client
              .prompt
              .getById(promptId)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getContent());
      System.out.println(result.getStatus());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PromptNullable> response = client
              .prompt
              .getById(promptId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptApi#getById");
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
| **promptId** | **UUID**|  | |

### Return type

[**PromptNullable**](PromptNullable.md)

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="updateById"></a>
# **updateById**
> PromptNullable updateById(promptId, promptUpdatableProperties).execute();

Update Prompt

Update a prompt by its id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PromptApi;
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
    UUID promptId = UUID.randomUUID();
    String title = "title_example";
    String content = "content_example";
    PromptStatusEnumNullable status = PromptStatusEnumNullable.fromValue("private");
    try {
      PromptNullable result = client
              .prompt
              .updateById(promptId)
              .title(title)
              .content(content)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getContent());
      System.out.println(result.getStatus());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptApi#updateById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PromptNullable> response = client
              .prompt
              .updateById(promptId)
              .title(title)
              .content(content)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PromptApi#updateById");
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
| **promptId** | **UUID**|  | |
| **promptUpdatableProperties** | [**PromptUpdatableProperties**](PromptUpdatableProperties.md)|  | |

### Return type

[**PromptNullable**](PromptNullable.md)

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

