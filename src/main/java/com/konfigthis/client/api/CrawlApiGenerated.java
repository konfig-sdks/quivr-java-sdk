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


import com.konfigthis.client.model.CrawlWebsite;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CrawlApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CrawlApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CrawlApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call websiteDataProcessorCall(UUID brainId, CrawlWebsite crawlWebsite, UUID chatId, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = crawlWebsite;

        // create path and map variables
        String localVarPath = "/crawl";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (brainId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("brain_id", brainId));
        }

        if (chatId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("chat_id", chatId));
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
    private okhttp3.Call websiteDataProcessorValidateBeforeCall(UUID brainId, CrawlWebsite crawlWebsite, UUID chatId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'brainId' is set
        if (brainId == null) {
            throw new ApiException("Missing the required parameter 'brainId' when calling websiteDataProcessor(Async)");
        }

        // verify the required parameter 'crawlWebsite' is set
        if (crawlWebsite == null) {
            throw new ApiException("Missing the required parameter 'crawlWebsite' when calling websiteDataProcessor(Async)");
        }

        return websiteDataProcessorCall(brainId, crawlWebsite, chatId, _callback);

    }


    private ApiResponse<Object> websiteDataProcessorWithHttpInfo(UUID brainId, CrawlWebsite crawlWebsite, UUID chatId) throws ApiException {
        okhttp3.Call localVarCall = websiteDataProcessorValidateBeforeCall(brainId, crawlWebsite, chatId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call websiteDataProcessorAsync(UUID brainId, CrawlWebsite crawlWebsite, UUID chatId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = websiteDataProcessorValidateBeforeCall(brainId, crawlWebsite, chatId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class WebsiteDataProcessorRequestBuilder {
        private final String url;
        private final UUID brainId;
        private Boolean js;
        private Integer depth;
        private Integer maxPages;
        private Integer maxTime;
        private UUID chatId;

        private WebsiteDataProcessorRequestBuilder(String url, UUID brainId) {
            this.url = url;
            this.brainId = brainId;
        }

        /**
         * Set js
         * @param js  (optional, default to false)
         * @return WebsiteDataProcessorRequestBuilder
         */
        public WebsiteDataProcessorRequestBuilder js(Boolean js) {
            this.js = js;
            return this;
        }
        
        /**
         * Set depth
         * @param depth  (optional, default to 1)
         * @return WebsiteDataProcessorRequestBuilder
         */
        public WebsiteDataProcessorRequestBuilder depth(Integer depth) {
            this.depth = depth;
            return this;
        }
        
        /**
         * Set maxPages
         * @param maxPages  (optional, default to 100)
         * @return WebsiteDataProcessorRequestBuilder
         */
        public WebsiteDataProcessorRequestBuilder maxPages(Integer maxPages) {
            this.maxPages = maxPages;
            return this;
        }
        
        /**
         * Set maxTime
         * @param maxTime  (optional, default to 60)
         * @return WebsiteDataProcessorRequestBuilder
         */
        public WebsiteDataProcessorRequestBuilder maxTime(Integer maxTime) {
            this.maxTime = maxTime;
            return this;
        }
        
        /**
         * Set chatId
         * @param chatId The ID of the chat (optional)
         * @return WebsiteDataProcessorRequestBuilder
         */
        public WebsiteDataProcessorRequestBuilder chatId(UUID chatId) {
            this.chatId = chatId;
            return this;
        }
        
        /**
         * Build call for websiteDataProcessor
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
            CrawlWebsite crawlWebsite = buildBodyParams();
            return websiteDataProcessorCall(brainId, crawlWebsite, chatId, _callback);
        }

        private CrawlWebsite buildBodyParams() {
            CrawlWebsite crawlWebsite = new CrawlWebsite();
            crawlWebsite.url(this.url);
            crawlWebsite.js(this.js);
            crawlWebsite.depth(this.depth);
            crawlWebsite.maxPages(this.maxPages);
            crawlWebsite.maxTime(this.maxTime);
            return crawlWebsite;
        }

        /**
         * Execute websiteDataProcessor request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            CrawlWebsite crawlWebsite = buildBodyParams();
            ApiResponse<Object> localVarResp = websiteDataProcessorWithHttpInfo(brainId, crawlWebsite, chatId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute websiteDataProcessor request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            CrawlWebsite crawlWebsite = buildBodyParams();
            return websiteDataProcessorWithHttpInfo(brainId, crawlWebsite, chatId);
        }

        /**
         * Execute websiteDataProcessor request (asynchronously)
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
            CrawlWebsite crawlWebsite = buildBodyParams();
            return websiteDataProcessorAsync(brainId, crawlWebsite, chatId, _callback);
        }
    }

    /**
     * Crawl Endpoint
     * Crawl a website and process the crawled data.
     * @param brainId The ID of the brain (required)
     * @param crawlWebsite  (required)
     * @return WebsiteDataProcessorRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public WebsiteDataProcessorRequestBuilder websiteDataProcessor(String url, UUID brainId) throws IllegalArgumentException {
        if (url == null) throw new IllegalArgumentException("\"url\" is required but got null");
            

        if (brainId == null) throw new IllegalArgumentException("\"brainId\" is required but got null");
            

        return new WebsiteDataProcessorRequestBuilder(url, brainId);
    }
}
