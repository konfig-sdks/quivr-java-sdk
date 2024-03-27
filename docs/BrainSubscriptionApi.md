# BrainSubscriptionApi

All URIs are relative to *https://api.quivr.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserInvitation**](BrainSubscriptionApi.md#getUserInvitation) | **GET** /brains/{brain_id}/subscription | Get User Invitation |
| [**inviteUsersToBrain**](BrainSubscriptionApi.md#inviteUsersToBrain) | **POST** /brains/{brain_id}/subscription | Invite Users To Brain |


<a name="getUserInvitation"></a>
# **getUserInvitation**
> Object getUserInvitation(brainId).execute();

Get User Invitation

Get an invitation to a brain for a user. This function checks if the user has been invited to the brain and returns the invitation status.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrainSubscriptionApi;
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
    UUID brainId = UUID.randomUUID();
    try {
      Object result = client
              .brainSubscription
              .getUserInvitation(brainId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrainSubscriptionApi#getUserInvitation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .brainSubscription
              .getUserInvitation(brainId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrainSubscriptionApi#getUserInvitation");
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
| **brainId** | **UUID**|  | |

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

<a name="inviteUsersToBrain"></a>
# **inviteUsersToBrain**
> Object inviteUsersToBrain(brainId, requestBody).origin(origin).execute();

Invite Users To Brain

Invite multiple users to a brain by their emails. This function creates or updates a brain subscription invitation for each user and sends an invitation email to each user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BrainSubscriptionApi;
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
    UUID brainId = UUID.randomUUID();
    String origin = "origin_example";
    try {
      Object result = client
              .brainSubscription
              .inviteUsersToBrain(brainId)
              .origin(origin)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling BrainSubscriptionApi#inviteUsersToBrain");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .brainSubscription
              .inviteUsersToBrain(brainId)
              .origin(origin)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BrainSubscriptionApi#inviteUsersToBrain");
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
| **brainId** | **UUID**|  | |
| **requestBody** | [**List&lt;Object&gt;**](Object.md)|  | |
| **origin** | **String**|  | [optional] |

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

