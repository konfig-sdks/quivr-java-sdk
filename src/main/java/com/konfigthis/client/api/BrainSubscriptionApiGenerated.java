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


import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class BrainSubscriptionApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BrainSubscriptionApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public BrainSubscriptionApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getUserInvitationCall(UUID brainId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/brains/{brain_id}/subscription"
            .replace("{" + "brain_id" + "}", localVarApiClient.escapeString(brainId.toString()));

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
    private okhttp3.Call getUserInvitationValidateBeforeCall(UUID brainId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'brainId' is set
        if (brainId == null) {
            throw new ApiException("Missing the required parameter 'brainId' when calling getUserInvitation(Async)");
        }

        return getUserInvitationCall(brainId, _callback);

    }


    private ApiResponse<Object> getUserInvitationWithHttpInfo(UUID brainId) throws ApiException {
        okhttp3.Call localVarCall = getUserInvitationValidateBeforeCall(brainId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getUserInvitationAsync(UUID brainId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserInvitationValidateBeforeCall(brainId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetUserInvitationRequestBuilder {
        private final UUID brainId;

        private GetUserInvitationRequestBuilder(UUID brainId) {
            this.brainId = brainId;
        }

        /**
         * Build call for getUserInvitation
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
            return getUserInvitationCall(brainId, _callback);
        }


        /**
         * Execute getUserInvitation request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = getUserInvitationWithHttpInfo(brainId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getUserInvitation request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return getUserInvitationWithHttpInfo(brainId);
        }

        /**
         * Execute getUserInvitation request (asynchronously)
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
            return getUserInvitationAsync(brainId, _callback);
        }
    }

    /**
     * Get User Invitation
     * Get an invitation to a brain for a user. This function checks if the user has been invited to the brain and returns the invitation status.
     * @param brainId  (required)
     * @return GetUserInvitationRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public GetUserInvitationRequestBuilder getUserInvitation(UUID brainId) throws IllegalArgumentException {
        if (brainId == null) throw new IllegalArgumentException("\"brainId\" is required but got null");
            

        return new GetUserInvitationRequestBuilder(brainId);
    }
    private okhttp3.Call inviteUsersToBrainCall(UUID brainId, List<Object> requestBody, String origin, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = "/brains/{brain_id}/subscription"
            .replace("{" + "brain_id" + "}", localVarApiClient.escapeString(brainId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (origin != null) {
            localVarHeaderParams.put("origin", localVarApiClient.parameterToString(origin));
        }

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call inviteUsersToBrainValidateBeforeCall(UUID brainId, List<Object> requestBody, String origin, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'brainId' is set
        if (brainId == null) {
            throw new ApiException("Missing the required parameter 'brainId' when calling inviteUsersToBrain(Async)");
        }

        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new ApiException("Missing the required parameter 'requestBody' when calling inviteUsersToBrain(Async)");
        }

        return inviteUsersToBrainCall(brainId, requestBody, origin, _callback);

    }


    private ApiResponse<Object> inviteUsersToBrainWithHttpInfo(UUID brainId, List<Object> requestBody, String origin) throws ApiException {
        okhttp3.Call localVarCall = inviteUsersToBrainValidateBeforeCall(brainId, requestBody, origin, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call inviteUsersToBrainAsync(UUID brainId, List<Object> requestBody, String origin, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = inviteUsersToBrainValidateBeforeCall(brainId, requestBody, origin, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class InviteUsersToBrainRequestBuilder {
        private final UUID brainId;
        private String origin;
        private List<Object> requestBody;

        private InviteUsersToBrainRequestBuilder(UUID brainId) {
            this.brainId = brainId;
        }

        /**
         * Set requestBody
         * @param requestBody  (optional)
         * @return InviteUsersToBrainRequestBuilder
         */
        public InviteUsersToBrainRequestBuilder requestBody(List<Object> requestBody) {
            this.requestBody = requestBody;
            return this;
        }

        /**
         * Set origin
         * @param origin  (optional)
         * @return InviteUsersToBrainRequestBuilder
         */
        public InviteUsersToBrainRequestBuilder origin(String origin) {
            this.origin = origin;
            return this;
        }
        
        /**
         * Build call for inviteUsersToBrain
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
            List<Object> requestBody = buildBodyParams();
            return inviteUsersToBrainCall(brainId, requestBody, origin, _callback);
        }

        private List<Object> buildBodyParams() {
            return this.requestBody;
        }

        /**
         * Execute inviteUsersToBrain request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            List<Object> requestBody = buildBodyParams();
            ApiResponse<Object> localVarResp = inviteUsersToBrainWithHttpInfo(brainId, requestBody, origin);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute inviteUsersToBrain request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            List<Object> requestBody = buildBodyParams();
            return inviteUsersToBrainWithHttpInfo(brainId, requestBody, origin);
        }

        /**
         * Execute inviteUsersToBrain request (asynchronously)
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
            List<Object> requestBody = buildBodyParams();
            return inviteUsersToBrainAsync(brainId, requestBody, origin, _callback);
        }
    }

    /**
     * Invite Users To Brain
     * Invite multiple users to a brain by their emails. This function creates or updates a brain subscription invitation for each user and sends an invitation email to each user.
     * @param brainId  (required)
     * @param requestBody  (required)
     * @return InviteUsersToBrainRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public InviteUsersToBrainRequestBuilder inviteUsersToBrain(UUID brainId) throws IllegalArgumentException {
        if (brainId == null) throw new IllegalArgumentException("\"brainId\" is required but got null");
            

        return new InviteUsersToBrainRequestBuilder(brainId);
    }
}
