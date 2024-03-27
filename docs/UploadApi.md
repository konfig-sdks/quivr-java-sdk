# UploadApi

All URIs are relative to *https://api.quivr.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**filePost**](UploadApi.md#filePost) | **POST** /upload | Upload File |


<a name="filePost"></a>
# **filePost**
> Object filePost(brainId, uploadFile, bodyUploadFileUploadPost).chatId(chatId).execute();

Upload File

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UploadApi;
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
    UUID brainId = UUID.randomUUID(); // The ID of the brain
    File uploadFile = new File("/path/to/file");
    UUID chatId = UUID.randomUUID(); // The ID of the chat
    try {
      Object result = client
              .upload
              .filePost(brainId, uploadFile)
              .chatId(chatId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadApi#filePost");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .upload
              .filePost(brainId, uploadFile)
              .chatId(chatId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UploadApi#filePost");
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
| **brainId** | **UUID**| The ID of the brain | |
| **uploadFile** | **File**|  | |
| **bodyUploadFileUploadPost** | [**BodyUploadFileUploadPost**](BodyUploadFileUploadPost.md)|  | |
| **chatId** | **UUID**| The ID of the chat | [optional] |

### Return type

**Object**

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

