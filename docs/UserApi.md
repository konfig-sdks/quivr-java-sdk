# UserApi

All URIs are relative to *https://api.quivr.app*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getIdentityRoute**](UserApi.md#getIdentityRoute) | **GET** /user/identity | Get User Identity Route |
| [**getUserInformation**](UserApi.md#getUserInformation) | **GET** /user | Get User Endpoint |
| [**updateIdentityRoute**](UserApi.md#updateIdentityRoute) | **PUT** /user/identity | Update User Identity Route |


<a name="getIdentityRoute"></a>
# **getIdentityRoute**
> UserIdentity getIdentityRoute().execute();

Get User Identity Route

Get user identity.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
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
      UserIdentity result = client
              .user
              .getIdentityRoute()
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmail());
      System.out.println(result.getUsername());
      System.out.println(result.getCompany());
      System.out.println(result.getOnboarded());
      System.out.println(result.getCompanySize());
      System.out.println(result.getUsagePurpose());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getIdentityRoute");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserIdentity> response = client
              .user
              .getIdentityRoute()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getIdentityRoute");
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

[**UserIdentity**](UserIdentity.md)

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getUserInformation"></a>
# **getUserInformation**
> Object getUserInformation().execute();

Get User Endpoint

Get user information and statistics.  - &#x60;current_user&#x60;: The current authenticated user. - Returns the user&#39;s email, maximum brain size, current brain size, maximum requests number, requests statistics, and the current date.  This endpoint retrieves information and statistics about the authenticated user. It includes the user&#39;s email, maximum brain size, current brain size, maximum requests number, requests statistics, and the current date. The brain size is calculated based on the user&#39;s uploaded vectors, and the maximum brain size is obtained from the environment variables. The requests statistics provide information about the user&#39;s API usage.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
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
              .user
              .getUserInformation()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUserInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .user
              .getUserInformation()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#getUserInformation");
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

<a name="updateIdentityRoute"></a>
# **updateIdentityRoute**
> UserIdentity updateIdentityRoute(userUpdatableProperties).execute();

Update User Identity Route

Update user identity.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Quivr;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserApi;
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
    String username = "username_example";
    String company = "company_example";
    Boolean onboarded = true;
    String companySize = "companySize_example";
    String usagePurpose = "usagePurpose_example";
    try {
      UserIdentity result = client
              .user
              .updateIdentityRoute()
              .username(username)
              .company(company)
              .onboarded(onboarded)
              .companySize(companySize)
              .usagePurpose(usagePurpose)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmail());
      System.out.println(result.getUsername());
      System.out.println(result.getCompany());
      System.out.println(result.getOnboarded());
      System.out.println(result.getCompanySize());
      System.out.println(result.getUsagePurpose());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateIdentityRoute");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserIdentity> response = client
              .user
              .updateIdentityRoute()
              .username(username)
              .company(company)
              .onboarded(onboarded)
              .companySize(companySize)
              .usagePurpose(usagePurpose)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateIdentityRoute");
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
| **userUpdatableProperties** | [**UserUpdatableProperties**](UserUpdatableProperties.md)|  | |

### Return type

[**UserIdentity**](UserIdentity.md)

### Authorization

[AuthBearer](../README.md#AuthBearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

