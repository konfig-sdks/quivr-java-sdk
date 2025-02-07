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
import com.konfigthis.client.model.ApiKey;
import com.konfigthis.client.model.ApiKeyInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiKeyApi
 */
@Disabled
public class ApiKeyApiTest {

    private static ApiKeyApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ApiKeyApi(apiClient);
    }

    /**
     * Create Api Key
     *
     * Create new API key for the current user.  - &#x60;current_user&#x60;: The current authenticated user. - Returns the newly created API key.  This endpoint generates a new API key for the current user. The API key is stored in the database and associated with the user. It returns the newly created API key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewKeyTest() throws ApiException {
        ApiKey response = api.createNewKey()
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Api Key
     *
     * Delete (deactivate) an API key for the current user.  - &#x60;key_id&#x60;: The ID of the API key to delete.  This endpoint deactivates and deletes the specified API key associated with the current user. The API key is marked as inactive in the database.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteKeyTest() throws ApiException {
        String keyId = null;
        Object response = api.deleteKey(keyId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Api Keys
     *
     * Get all active API keys for the current user.  - &#x60;current_user&#x60;: The current authenticated user. - Returns a list of active API keys with their IDs and creation times.  This endpoint retrieves all the active API keys associated with the current user. It returns a list of API key objects containing the key ID and creation time for each API key.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        List<ApiKeyInfo> response = api.getList()
                .execute();
        // TODO: test validations
    }

}
