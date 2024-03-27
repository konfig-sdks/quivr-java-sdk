# OnboardingApi

All URIs are relative to *https://api.quivr.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserInfo**](OnboardingApi.md#getUserInfo) | **GET** /onboarding | Get User Onboarding Handler |
| [**updateUserOnboarding**](OnboardingApi.md#updateUserOnboarding) | **PUT** /onboarding | Update User Onboarding Handler |


<a name="getUserInfo"></a>
# **getUserInfo**
> OnboardingStatesNullable getUserInfo().execute();

Get User Onboarding Handler

Get user onboarding information for the current user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnboardingApi;
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
      OnboardingStatesNullable result = client
              .onboarding
              .getUserInfo()
              .execute();
      System.out.println(result);
      System.out.println(result.getOnboardingA());
      System.out.println(result.getOnboardingB1());
      System.out.println(result.getOnboardingB2());
      System.out.println(result.getOnboardingB3());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#getUserInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnboardingStatesNullable> response = client
              .onboarding
              .getUserInfo()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#getUserInfo");
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

[**OnboardingStatesNullable**](OnboardingStatesNullable.md)

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="updateUserOnboarding"></a>
# **updateUserOnboarding**
> OnboardingStates updateUserOnboarding(onboardingUpdatableProperties).execute();

Update User Onboarding Handler

Update user onboarding information for the current user

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnboardingApi;
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
    Boolean onboardingA = true;
    Boolean onboardingB1 = true;
    Boolean onboardingB2 = true;
    Boolean onboardingB3 = true;
    try {
      OnboardingStates result = client
              .onboarding
              .updateUserOnboarding()
              .onboardingA(onboardingA)
              .onboardingB1(onboardingB1)
              .onboardingB2(onboardingB2)
              .onboardingB3(onboardingB3)
              .execute();
      System.out.println(result);
      System.out.println(result.getOnboardingA());
      System.out.println(result.getOnboardingB1());
      System.out.println(result.getOnboardingB2());
      System.out.println(result.getOnboardingB3());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#updateUserOnboarding");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OnboardingStates> response = client
              .onboarding
              .updateUserOnboarding()
              .onboardingA(onboardingA)
              .onboardingB1(onboardingB1)
              .onboardingB2(onboardingB2)
              .onboardingB3(onboardingB3)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#updateUserOnboarding");
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
| **onboardingUpdatableProperties** | [**OnboardingUpdatableProperties**](OnboardingUpdatableProperties.md)|  | |

### Return type

[**OnboardingStates**](OnboardingStates.md)

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

