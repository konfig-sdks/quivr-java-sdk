package com.konfigthis.client;

import com.konfigthis.client.api.ApiKeyApi;
import com.konfigthis.client.api.BrainApi;
import com.konfigthis.client.api.BrainSubscriptionApi;
import com.konfigthis.client.api.ChatApi;
import com.konfigthis.client.api.ContactApi;
import com.konfigthis.client.api.CrawlApi;
import com.konfigthis.client.api.HealthApi;
import com.konfigthis.client.api.KnowledgeApi;
import com.konfigthis.client.api.NotificationApi;
import com.konfigthis.client.api.OnboardingApi;
import com.konfigthis.client.api.PromptApi;
import com.konfigthis.client.api.RootApi;
import com.konfigthis.client.api.SubscriptionApi;
import com.konfigthis.client.api.UploadApi;
import com.konfigthis.client.api.UserApi;

public class Quivr {
    private ApiClient apiClient;
    public final ApiKeyApi apiKey;
    public final BrainApi brain;
    public final BrainSubscriptionApi brainSubscription;
    public final ChatApi chat;
    public final ContactApi contact;
    public final CrawlApi crawl;
    public final HealthApi health;
    public final KnowledgeApi knowledge;
    public final NotificationApi notification;
    public final OnboardingApi onboarding;
    public final PromptApi prompt;
    public final RootApi root;
    public final SubscriptionApi subscription;
    public final UploadApi upload;
    public final UserApi user;

    public Quivr() {
        this(null);
    }

    public Quivr(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.apiKey = new ApiKeyApi(this.apiClient);
        this.brain = new BrainApi(this.apiClient);
        this.brainSubscription = new BrainSubscriptionApi(this.apiClient);
        this.chat = new ChatApi(this.apiClient);
        this.contact = new ContactApi(this.apiClient);
        this.crawl = new CrawlApi(this.apiClient);
        this.health = new HealthApi(this.apiClient);
        this.knowledge = new KnowledgeApi(this.apiClient);
        this.notification = new NotificationApi(this.apiClient);
        this.onboarding = new OnboardingApi(this.apiClient);
        this.prompt = new PromptApi(this.apiClient);
        this.root = new RootApi(this.apiClient);
        this.subscription = new SubscriptionApi(this.apiClient);
        this.upload = new UploadApi(this.apiClient);
        this.user = new UserApi(this.apiClient);
    }

}
