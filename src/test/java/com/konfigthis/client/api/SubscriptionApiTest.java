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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionApi
 */
@Disabled
public class SubscriptionApiTest {

    private static SubscriptionApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SubscriptionApi(apiClient);
    }

    /**
     * Subscribe To Brain Handler
     *
     * Subscribe to a public brain
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void brainHandlerTest() throws ApiException {
        UUID brainId = null;
        Object response = api.brainHandler(brainId)
                .execute();
        // TODO: test validations
    }

    /**
     * Unsubscribe From Brain Handler
     *
     * Unsubscribe from a brain
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unregisterHandlerTest() throws ApiException {
        UUID brainId = null;
        Object response = api.unregisterHandler(brainId)
                .execute();
        // TODO: test validations
    }

}
