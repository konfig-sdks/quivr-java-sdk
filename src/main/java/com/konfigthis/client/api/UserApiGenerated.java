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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.UserIdentity;
import com.konfigthis.client.model.UserUpdatableProperties;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class UserApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public UserApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public UserApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getIdentityRouteCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user/identity";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AuthBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getIdentityRouteValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getIdentityRouteCall(_callback);

    }


    private ApiResponse<UserIdentity> getIdentityRouteWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getIdentityRouteValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<UserIdentity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getIdentityRouteAsync(final ApiCallback<UserIdentity> _callback) throws ApiException {

        okhttp3.Call localVarCall = getIdentityRouteValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<UserIdentity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetIdentityRouteRequestBuilder {

        private GetIdentityRouteRequestBuilder() {
        }

        /**
         * Build call for getIdentityRoute
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getIdentityRouteCall(_callback);
        }


        /**
         * Execute getIdentityRoute request
         * @return UserIdentity
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public UserIdentity execute() throws ApiException {
            ApiResponse<UserIdentity> localVarResp = getIdentityRouteWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getIdentityRoute request with HTTP info returned
         * @return ApiResponse&lt;UserIdentity&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<UserIdentity> executeWithHttpInfo() throws ApiException {
            return getIdentityRouteWithHttpInfo();
        }

        /**
         * Execute getIdentityRoute request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<UserIdentity> _callback) throws ApiException {
            return getIdentityRouteAsync(_callback);
        }
    }

    /**
     * Get User Identity Route
     * Get user identity.
     * @return GetIdentityRouteRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public GetIdentityRouteRequestBuilder getIdentityRoute() throws IllegalArgumentException {
        return new GetIdentityRouteRequestBuilder();
    }
    private okhttp3.Call getUserInformationCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/user";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AuthBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserInformationValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getUserInformationCall(_callback);

    }


    private ApiResponse<Object> getUserInformationWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getUserInformationValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getUserInformationAsync(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserInformationValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetUserInformationRequestBuilder {

        private GetUserInformationRequestBuilder() {
        }

        /**
         * Build call for getUserInformation
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getUserInformationCall(_callback);
        }


        /**
         * Execute getUserInformation request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getUserInformationWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getUserInformation request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getUserInformationWithHttpInfo();
        }

        /**
         * Execute getUserInformation request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return getUserInformationAsync(_callback);
        }
    }

    /**
     * Get User Endpoint
     * Get user information and statistics.  - &#x60;current_user&#x60;: The current authenticated user. - Returns the user&#39;s email, maximum brain size, current brain size, maximum requests number, requests statistics, and the current date.  This endpoint retrieves information and statistics about the authenticated user. It includes the user&#39;s email, maximum brain size, current brain size, maximum requests number, requests statistics, and the current date. The brain size is calculated based on the user&#39;s uploaded vectors, and the maximum brain size is obtained from the environment variables. The requests statistics provide information about the user&#39;s API usage.
     * @return GetUserInformationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public GetUserInformationRequestBuilder getUserInformation() throws IllegalArgumentException {
        return new GetUserInformationRequestBuilder();
    }
    private okhttp3.Call updateIdentityRouteCall(UserUpdatableProperties userUpdatableProperties, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = userUpdatableProperties;

        // create path and map variables
        String localVarPath = "/user/identity";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AuthBearer" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateIdentityRouteValidateBeforeCall(UserUpdatableProperties userUpdatableProperties, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userUpdatableProperties' is set
        if (userUpdatableProperties == null) {
            throw new ApiException("Missing the required parameter 'userUpdatableProperties' when calling updateIdentityRoute(Async)");
        }

        return updateIdentityRouteCall(userUpdatableProperties, _callback);

    }


    private ApiResponse<UserIdentity> updateIdentityRouteWithHttpInfo(UserUpdatableProperties userUpdatableProperties) throws ApiException {
        okhttp3.Call localVarCall = updateIdentityRouteValidateBeforeCall(userUpdatableProperties, null);
        Type localVarReturnType = new TypeToken<UserIdentity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateIdentityRouteAsync(UserUpdatableProperties userUpdatableProperties, final ApiCallback<UserIdentity> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateIdentityRouteValidateBeforeCall(userUpdatableProperties, _callback);
        Type localVarReturnType = new TypeToken<UserIdentity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateIdentityRouteRequestBuilder {
        private String username;
        private String company;
        private Boolean onboarded;
        private String companySize;
        private String usagePurpose;

        private UpdateIdentityRouteRequestBuilder() {
        }

        /**
         * Set username
         * @param username  (optional)
         * @return UpdateIdentityRouteRequestBuilder
         */
        public UpdateIdentityRouteRequestBuilder username(String username) {
            this.username = username;
            return this;
        }
        
        /**
         * Set company
         * @param company  (optional)
         * @return UpdateIdentityRouteRequestBuilder
         */
        public UpdateIdentityRouteRequestBuilder company(String company) {
            this.company = company;
            return this;
        }
        
        /**
         * Set onboarded
         * @param onboarded  (optional)
         * @return UpdateIdentityRouteRequestBuilder
         */
        public UpdateIdentityRouteRequestBuilder onboarded(Boolean onboarded) {
            this.onboarded = onboarded;
            return this;
        }
        
        /**
         * Set companySize
         * @param companySize  (optional)
         * @return UpdateIdentityRouteRequestBuilder
         */
        public UpdateIdentityRouteRequestBuilder companySize(String companySize) {
            this.companySize = companySize;
            return this;
        }
        
        /**
         * Set usagePurpose
         * @param usagePurpose  (optional)
         * @return UpdateIdentityRouteRequestBuilder
         */
        public UpdateIdentityRouteRequestBuilder usagePurpose(String usagePurpose) {
            this.usagePurpose = usagePurpose;
            return this;
        }
        
        /**
         * Build call for updateIdentityRoute
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            UserUpdatableProperties userUpdatableProperties = buildBodyParams();
            return updateIdentityRouteCall(userUpdatableProperties, _callback);
        }

        private UserUpdatableProperties buildBodyParams() {
            UserUpdatableProperties userUpdatableProperties = new UserUpdatableProperties();
            userUpdatableProperties.username(this.username);
            userUpdatableProperties.company(this.company);
            userUpdatableProperties.onboarded(this.onboarded);
            userUpdatableProperties.companySize(this.companySize);
            userUpdatableProperties.usagePurpose(this.usagePurpose);
            return userUpdatableProperties;
        }

        /**
         * Execute updateIdentityRoute request
         * @return UserIdentity
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public UserIdentity execute() throws ApiException {
            UserUpdatableProperties userUpdatableProperties = buildBodyParams();
            ApiResponse<UserIdentity> localVarResp = updateIdentityRouteWithHttpInfo(userUpdatableProperties);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute updateIdentityRoute request with HTTP info returned
         * @return ApiResponse&lt;UserIdentity&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<UserIdentity> executeWithHttpInfo() throws ApiException {
            UserUpdatableProperties userUpdatableProperties = buildBodyParams();
            return updateIdentityRouteWithHttpInfo(userUpdatableProperties);
        }

        /**
         * Execute updateIdentityRoute request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<UserIdentity> _callback) throws ApiException {
            UserUpdatableProperties userUpdatableProperties = buildBodyParams();
            return updateIdentityRouteAsync(userUpdatableProperties, _callback);
        }
    }

    /**
     * Update User Identity Route
     * Update user identity.
     * @param userUpdatableProperties  (required)
     * @return UpdateIdentityRouteRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public UpdateIdentityRouteRequestBuilder updateIdentityRoute() throws IllegalArgumentException {
        return new UpdateIdentityRouteRequestBuilder();
    }
}
