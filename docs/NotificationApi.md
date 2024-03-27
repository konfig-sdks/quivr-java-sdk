# NotificationApi

All URIs are relative to *https://api.quivr.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getByChatId**](NotificationApi.md#getByChatId) | **GET** /notifications/{chat_id} | Get Notifications |


<a name="getByChatId"></a>
# **getByChatId**
> Object getByChatId(chatId).execute();

Get Notifications

Get notifications by chat_id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationApi;
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
              .notification
              .getByChatId(chatId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#getByChatId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .notification
              .getByChatId(chatId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationApi#getByChatId");
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

