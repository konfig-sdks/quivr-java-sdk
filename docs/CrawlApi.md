# CrawlApi

All URIs are relative to *https://api.quivr.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**websiteDataProcessor**](CrawlApi.md#websiteDataProcessor) | **POST** /crawl | Crawl Endpoint |


<a name="websiteDataProcessor"></a>
# **websiteDataProcessor**
> Object websiteDataProcessor(brainId, crawlWebsite).chatId(chatId).execute();

Crawl Endpoint

Crawl a website and process the crawled data.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CrawlApi;
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
    String url = "url_example";
    UUID brainId = UUID.randomUUID(); // The ID of the brain
    Boolean js = false;
    Integer depth = 1;
    Integer maxPages = 100;
    Integer maxTime = 60;
    UUID chatId = UUID.randomUUID(); // The ID of the chat
    try {
      Object result = client
              .crawl
              .websiteDataProcessor(url, brainId)
              .js(js)
              .depth(depth)
              .maxPages(maxPages)
              .maxTime(maxTime)
              .chatId(chatId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlApi#websiteDataProcessor");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .crawl
              .websiteDataProcessor(url, brainId)
              .js(js)
              .depth(depth)
              .maxPages(maxPages)
              .maxTime(maxTime)
              .chatId(chatId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CrawlApi#websiteDataProcessor");
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
| **crawlWebsite** | [**CrawlWebsite**](CrawlWebsite.md)|  | |
| **chatId** | **UUID**| The ID of the chat | [optional] |

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

