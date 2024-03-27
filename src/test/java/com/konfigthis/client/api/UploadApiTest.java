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
import com.konfigthis.client.model.BodyUploadFileUploadPost;
import java.io.File;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UploadApi
 */
@Disabled
public class UploadApiTest {

    private static UploadApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UploadApi(apiClient);
    }

    /**
     * Upload File
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void filePostTest() throws ApiException {
        UUID brainId = null;
        File uploadFile = null;
        UUID chatId = null;
        Object response = api.filePost(brainId, uploadFile)
                .chatId(chatId)
                .execute();
        // TODO: test validations
    }

}
