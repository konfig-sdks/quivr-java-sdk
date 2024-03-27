# ContactApi

All URIs are relative to *https://api.quivr.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewContact**](ContactApi.md#createNewContact) | **POST** /contact | Post Contact |


<a name="createNewContact"></a>
# **createNewContact**
> Object createNewContact(contactMessage).execute();

Post Contact

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.quivr.app";
    Quivr client = new Quivr(configuration);
    String customerEmail = "customerEmail_example";
    String content = "content_example";
    try {
      Object result = client
              .contact
              .createNewContact(customerEmail, content)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactApi#createNewContact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .contact
              .createNewContact(customerEmail, content)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactApi#createNewContact");
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
| **contactMessage** | [**ContactMessage**](ContactMessage.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

