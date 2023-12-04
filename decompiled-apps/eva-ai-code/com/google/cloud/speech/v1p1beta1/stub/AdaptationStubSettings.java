package com.google.cloud.speech.v1p1beta1.stub;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.speech.v1p1beta1.AdaptationClient;
import com.google.cloud.speech.v1p1beta1.CreateCustomClassRequest;
import com.google.cloud.speech.v1p1beta1.CreatePhraseSetRequest;
import com.google.cloud.speech.v1p1beta1.CustomClass;
import com.google.cloud.speech.v1p1beta1.DeleteCustomClassRequest;
import com.google.cloud.speech.v1p1beta1.DeletePhraseSetRequest;
import com.google.cloud.speech.v1p1beta1.GetCustomClassRequest;
import com.google.cloud.speech.v1p1beta1.GetPhraseSetRequest;
import com.google.cloud.speech.v1p1beta1.ListCustomClassesRequest;
import com.google.cloud.speech.v1p1beta1.ListCustomClassesResponse;
import com.google.cloud.speech.v1p1beta1.ListPhraseSetRequest;
import com.google.cloud.speech.v1p1beta1.ListPhraseSetResponse;
import com.google.cloud.speech.v1p1beta1.PhraseSet;
import com.google.cloud.speech.v1p1beta1.UpdateCustomClassRequest;
import com.google.cloud.speech.v1p1beta1.UpdatePhraseSetRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
@BetaApi
/* loaded from: classes7.dex */
public class AdaptationStubSettings extends StubSettings<AdaptationStubSettings> {
    private final UnaryCallSettings<CreateCustomClassRequest, CustomClass> createCustomClassSettings;
    private final UnaryCallSettings<CreatePhraseSetRequest, PhraseSet> createPhraseSetSettings;
    private final UnaryCallSettings<DeleteCustomClassRequest, Empty> deleteCustomClassSettings;
    private final UnaryCallSettings<DeletePhraseSetRequest, Empty> deletePhraseSetSettings;
    private final UnaryCallSettings<GetCustomClassRequest, CustomClass> getCustomClassSettings;
    private final UnaryCallSettings<GetPhraseSetRequest, PhraseSet> getPhraseSetSettings;
    private final PagedCallSettings<ListCustomClassesRequest, ListCustomClassesResponse, AdaptationClient.ListCustomClassesPagedResponse> listCustomClassesSettings;
    private final PagedCallSettings<ListPhraseSetRequest, ListPhraseSetResponse, AdaptationClient.ListPhraseSetPagedResponse> listPhraseSetSettings;
    private final UnaryCallSettings<UpdateCustomClassRequest, CustomClass> updateCustomClassSettings;
    private final UnaryCallSettings<UpdatePhraseSetRequest, PhraseSet> updatePhraseSetSettings;
    private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES = ImmutableList.builder().add((ImmutableList.Builder) "https://www.googleapis.com/auth/cloud-platform").build();
    private static final PagedListDescriptor<ListPhraseSetRequest, ListPhraseSetResponse, PhraseSet> LIST_PHRASE_SET_PAGE_STR_DESC = new PagedListDescriptor<ListPhraseSetRequest, ListPhraseSetResponse, PhraseSet>() { // from class: com.google.cloud.speech.v1p1beta1.stub.AdaptationStubSettings.1
        @Override // com.google.api.gax.rpc.PagedListDescriptor
        public String emptyToken() {
            return "";
        }

        @Override // com.google.api.gax.rpc.PagedListDescriptor
        public ListPhraseSetRequest injectToken(ListPhraseSetRequest listPhraseSetRequest, String str) {
            return ListPhraseSetRequest.newBuilder(listPhraseSetRequest).setPageToken(str).build();
        }

        @Override // com.google.api.gax.rpc.PagedListDescriptor
        public ListPhraseSetRequest injectPageSize(ListPhraseSetRequest listPhraseSetRequest, int i) {
            return ListPhraseSetRequest.newBuilder(listPhraseSetRequest).setPageSize(i).build();
        }

        @Override // com.google.api.gax.rpc.PagedListDescriptor
        public Integer extractPageSize(ListPhraseSetRequest listPhraseSetRequest) {
            return Integer.valueOf(listPhraseSetRequest.getPageSize());
        }

        @Override // com.google.api.gax.rpc.PagedListDescriptor
        public String extractNextToken(ListPhraseSetResponse listPhraseSetResponse) {
            return listPhraseSetResponse.getNextPageToken();
        }

        @Override // com.google.api.gax.rpc.PagedListDescriptor
        public Iterable<PhraseSet> extractResources(ListPhraseSetResponse listPhraseSetResponse) {
            if (listPhraseSetResponse.getPhraseSetsList() == null) {
                return ImmutableList.of();
            }
            return listPhraseSetResponse.getPhraseSetsList();
        }
    };
    private static final PagedListDescriptor<ListCustomClassesRequest, ListCustomClassesResponse, CustomClass> LIST_CUSTOM_CLASSES_PAGE_STR_DESC = new PagedListDescriptor<ListCustomClassesRequest, ListCustomClassesResponse, CustomClass>() { // from class: com.google.cloud.speech.v1p1beta1.stub.AdaptationStubSettings.2
        @Override // com.google.api.gax.rpc.PagedListDescriptor
        public String emptyToken() {
            return "";
        }

        @Override // com.google.api.gax.rpc.PagedListDescriptor
        public ListCustomClassesRequest injectToken(ListCustomClassesRequest listCustomClassesRequest, String str) {
            return ListCustomClassesRequest.newBuilder(listCustomClassesRequest).setPageToken(str).build();
        }

        @Override // com.google.api.gax.rpc.PagedListDescriptor
        public ListCustomClassesRequest injectPageSize(ListCustomClassesRequest listCustomClassesRequest, int i) {
            return ListCustomClassesRequest.newBuilder(listCustomClassesRequest).setPageSize(i).build();
        }

        @Override // com.google.api.gax.rpc.PagedListDescriptor
        public Integer extractPageSize(ListCustomClassesRequest listCustomClassesRequest) {
            return Integer.valueOf(listCustomClassesRequest.getPageSize());
        }

        @Override // com.google.api.gax.rpc.PagedListDescriptor
        public String extractNextToken(ListCustomClassesResponse listCustomClassesResponse) {
            return listCustomClassesResponse.getNextPageToken();
        }

        @Override // com.google.api.gax.rpc.PagedListDescriptor
        public Iterable<CustomClass> extractResources(ListCustomClassesResponse listCustomClassesResponse) {
            if (listCustomClassesResponse.getCustomClassesList() == null) {
                return ImmutableList.of();
            }
            return listCustomClassesResponse.getCustomClassesList();
        }
    };
    private static final PagedListResponseFactory<ListPhraseSetRequest, ListPhraseSetResponse, AdaptationClient.ListPhraseSetPagedResponse> LIST_PHRASE_SET_PAGE_STR_FACT = new PagedListResponseFactory<ListPhraseSetRequest, ListPhraseSetResponse, AdaptationClient.ListPhraseSetPagedResponse>() { // from class: com.google.cloud.speech.v1p1beta1.stub.AdaptationStubSettings.3
        @Override // com.google.api.gax.rpc.PagedListResponseFactory
        public ApiFuture<AdaptationClient.ListPhraseSetPagedResponse> getFuturePagedResponse(UnaryCallable<ListPhraseSetRequest, ListPhraseSetResponse> unaryCallable, ListPhraseSetRequest listPhraseSetRequest, ApiCallContext apiCallContext, ApiFuture<ListPhraseSetResponse> apiFuture) {
            return AdaptationClient.ListPhraseSetPagedResponse.createAsync(PageContext.create(unaryCallable, AdaptationStubSettings.LIST_PHRASE_SET_PAGE_STR_DESC, listPhraseSetRequest, apiCallContext), apiFuture);
        }
    };
    private static final PagedListResponseFactory<ListCustomClassesRequest, ListCustomClassesResponse, AdaptationClient.ListCustomClassesPagedResponse> LIST_CUSTOM_CLASSES_PAGE_STR_FACT = new PagedListResponseFactory<ListCustomClassesRequest, ListCustomClassesResponse, AdaptationClient.ListCustomClassesPagedResponse>() { // from class: com.google.cloud.speech.v1p1beta1.stub.AdaptationStubSettings.4
        @Override // com.google.api.gax.rpc.PagedListResponseFactory
        public ApiFuture<AdaptationClient.ListCustomClassesPagedResponse> getFuturePagedResponse(UnaryCallable<ListCustomClassesRequest, ListCustomClassesResponse> unaryCallable, ListCustomClassesRequest listCustomClassesRequest, ApiCallContext apiCallContext, ApiFuture<ListCustomClassesResponse> apiFuture) {
            return AdaptationClient.ListCustomClassesPagedResponse.createAsync(PageContext.create(unaryCallable, AdaptationStubSettings.LIST_CUSTOM_CLASSES_PAGE_STR_DESC, listCustomClassesRequest, apiCallContext), apiFuture);
        }
    };

    public static String getDefaultEndpoint() {
        return "speech.googleapis.com:443";
    }

    public UnaryCallSettings<CreatePhraseSetRequest, PhraseSet> createPhraseSetSettings() {
        return this.createPhraseSetSettings;
    }

    public UnaryCallSettings<GetPhraseSetRequest, PhraseSet> getPhraseSetSettings() {
        return this.getPhraseSetSettings;
    }

    public PagedCallSettings<ListPhraseSetRequest, ListPhraseSetResponse, AdaptationClient.ListPhraseSetPagedResponse> listPhraseSetSettings() {
        return this.listPhraseSetSettings;
    }

    public UnaryCallSettings<UpdatePhraseSetRequest, PhraseSet> updatePhraseSetSettings() {
        return this.updatePhraseSetSettings;
    }

    public UnaryCallSettings<DeletePhraseSetRequest, Empty> deletePhraseSetSettings() {
        return this.deletePhraseSetSettings;
    }

    public UnaryCallSettings<CreateCustomClassRequest, CustomClass> createCustomClassSettings() {
        return this.createCustomClassSettings;
    }

    public UnaryCallSettings<GetCustomClassRequest, CustomClass> getCustomClassSettings() {
        return this.getCustomClassSettings;
    }

    public PagedCallSettings<ListCustomClassesRequest, ListCustomClassesResponse, AdaptationClient.ListCustomClassesPagedResponse> listCustomClassesSettings() {
        return this.listCustomClassesSettings;
    }

    public UnaryCallSettings<UpdateCustomClassRequest, CustomClass> updateCustomClassSettings() {
        return this.updateCustomClassSettings;
    }

    public UnaryCallSettings<DeleteCustomClassRequest, Empty> deleteCustomClassSettings() {
        return this.deleteCustomClassSettings;
    }

    @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
    public AdaptationStub createStub() throws IOException {
        if (getTransportChannelProvider().getTransportName().equals(GrpcTransportChannel.getGrpcTransportName())) {
            return GrpcAdaptationStub.create(this);
        }
        throw new UnsupportedOperationException(String.format("Transport not supported: %s", getTransportChannelProvider().getTransportName()));
    }

    public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
        return InstantiatingExecutorProvider.newBuilder();
    }

    public static List<String> getDefaultServiceScopes() {
        return DEFAULT_SERVICE_SCOPES;
    }

    public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
        return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
    }

    public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
        return InstantiatingGrpcChannelProvider.newBuilder().setMaxInboundMessageSize(Integer.MAX_VALUE);
    }

    public static TransportChannelProvider defaultTransportChannelProvider() {
        return defaultGrpcTransportProviderBuilder().build();
    }

    @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
    public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
        return ApiClientHeaderProvider.newBuilder().setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(AdaptationStubSettings.class)).setTransportToken(GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
    }

    public static Builder newBuilder() {
        return Builder.createDefault();
    }

    public static Builder newBuilder(ClientContext clientContext) {
        return new Builder(clientContext);
    }

    @Override // com.google.api.gax.rpc.StubSettings
    public Builder toBuilder() {
        return new Builder(this);
    }

    protected AdaptationStubSettings(Builder builder) throws IOException {
        super(builder);
        this.createPhraseSetSettings = builder.createPhraseSetSettings().build();
        this.getPhraseSetSettings = builder.getPhraseSetSettings().build();
        this.listPhraseSetSettings = builder.listPhraseSetSettings().build();
        this.updatePhraseSetSettings = builder.updatePhraseSetSettings().build();
        this.deletePhraseSetSettings = builder.deletePhraseSetSettings().build();
        this.createCustomClassSettings = builder.createCustomClassSettings().build();
        this.getCustomClassSettings = builder.getCustomClassSettings().build();
        this.listCustomClassesSettings = builder.listCustomClassesSettings().build();
        this.updateCustomClassSettings = builder.updateCustomClassSettings().build();
        this.deleteCustomClassSettings = builder.deleteCustomClassSettings().build();
    }

    /* loaded from: classes7.dex */
    public static class Builder extends StubSettings.Builder<AdaptationStubSettings, Builder> {
        private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>> RETRYABLE_CODE_DEFINITIONS;
        private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;
        private final UnaryCallSettings.Builder<CreateCustomClassRequest, CustomClass> createCustomClassSettings;
        private final UnaryCallSettings.Builder<CreatePhraseSetRequest, PhraseSet> createPhraseSetSettings;
        private final UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty> deleteCustomClassSettings;
        private final UnaryCallSettings.Builder<DeletePhraseSetRequest, Empty> deletePhraseSetSettings;
        private final UnaryCallSettings.Builder<GetCustomClassRequest, CustomClass> getCustomClassSettings;
        private final UnaryCallSettings.Builder<GetPhraseSetRequest, PhraseSet> getPhraseSetSettings;
        private final PagedCallSettings.Builder<ListCustomClassesRequest, ListCustomClassesResponse, AdaptationClient.ListCustomClassesPagedResponse> listCustomClassesSettings;
        private final PagedCallSettings.Builder<ListPhraseSetRequest, ListPhraseSetResponse, AdaptationClient.ListPhraseSetPagedResponse> listPhraseSetSettings;
        private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
        private final UnaryCallSettings.Builder<UpdateCustomClassRequest, CustomClass> updateCustomClassSettings;
        private final UnaryCallSettings.Builder<UpdatePhraseSetRequest, PhraseSet> updatePhraseSetSettings;

        static {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            builder.put("no_retry_codes", ImmutableSet.copyOf((Collection) Lists.newArrayList()));
            RETRYABLE_CODE_DEFINITIONS = builder.build();
            ImmutableMap.Builder builder2 = ImmutableMap.builder();
            builder2.put("no_retry_params", RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0d).build());
            RETRY_PARAM_DEFINITIONS = builder2.build();
        }

        protected Builder() {
            this((ClientContext) null);
        }

        protected Builder(ClientContext clientContext) {
            super(clientContext);
            UnaryCallSettings.Builder<CreatePhraseSetRequest, PhraseSet> newUnaryCallSettingsBuilder = UnaryCallSettings.newUnaryCallSettingsBuilder();
            this.createPhraseSetSettings = newUnaryCallSettingsBuilder;
            UnaryCallSettings.Builder<GetPhraseSetRequest, PhraseSet> newUnaryCallSettingsBuilder2 = UnaryCallSettings.newUnaryCallSettingsBuilder();
            this.getPhraseSetSettings = newUnaryCallSettingsBuilder2;
            PagedCallSettings.Builder<ListPhraseSetRequest, ListPhraseSetResponse, AdaptationClient.ListPhraseSetPagedResponse> newBuilder = PagedCallSettings.newBuilder(AdaptationStubSettings.LIST_PHRASE_SET_PAGE_STR_FACT);
            this.listPhraseSetSettings = newBuilder;
            UnaryCallSettings.Builder<UpdatePhraseSetRequest, PhraseSet> newUnaryCallSettingsBuilder3 = UnaryCallSettings.newUnaryCallSettingsBuilder();
            this.updatePhraseSetSettings = newUnaryCallSettingsBuilder3;
            UnaryCallSettings.Builder<DeletePhraseSetRequest, Empty> newUnaryCallSettingsBuilder4 = UnaryCallSettings.newUnaryCallSettingsBuilder();
            this.deletePhraseSetSettings = newUnaryCallSettingsBuilder4;
            UnaryCallSettings.Builder<CreateCustomClassRequest, CustomClass> newUnaryCallSettingsBuilder5 = UnaryCallSettings.newUnaryCallSettingsBuilder();
            this.createCustomClassSettings = newUnaryCallSettingsBuilder5;
            UnaryCallSettings.Builder<GetCustomClassRequest, CustomClass> newUnaryCallSettingsBuilder6 = UnaryCallSettings.newUnaryCallSettingsBuilder();
            this.getCustomClassSettings = newUnaryCallSettingsBuilder6;
            PagedCallSettings.Builder<ListCustomClassesRequest, ListCustomClassesResponse, AdaptationClient.ListCustomClassesPagedResponse> newBuilder2 = PagedCallSettings.newBuilder(AdaptationStubSettings.LIST_CUSTOM_CLASSES_PAGE_STR_FACT);
            this.listCustomClassesSettings = newBuilder2;
            UnaryCallSettings.Builder<UpdateCustomClassRequest, CustomClass> newUnaryCallSettingsBuilder7 = UnaryCallSettings.newUnaryCallSettingsBuilder();
            this.updateCustomClassSettings = newUnaryCallSettingsBuilder7;
            UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty> newUnaryCallSettingsBuilder8 = UnaryCallSettings.newUnaryCallSettingsBuilder();
            this.deleteCustomClassSettings = newUnaryCallSettingsBuilder8;
            this.unaryMethodSettingsBuilders = ImmutableList.of((UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) newUnaryCallSettingsBuilder, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) newUnaryCallSettingsBuilder2, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) newBuilder, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) newUnaryCallSettingsBuilder3, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) newUnaryCallSettingsBuilder4, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) newUnaryCallSettingsBuilder5, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) newUnaryCallSettingsBuilder6, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) newBuilder2, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) newUnaryCallSettingsBuilder7, newUnaryCallSettingsBuilder8);
            initDefaults(this);
        }

        protected Builder(AdaptationStubSettings adaptationStubSettings) {
            super(adaptationStubSettings);
            UnaryCallSettings.Builder<CreatePhraseSetRequest, PhraseSet> builder = adaptationStubSettings.createPhraseSetSettings.toBuilder();
            this.createPhraseSetSettings = builder;
            UnaryCallSettings.Builder<GetPhraseSetRequest, PhraseSet> builder2 = adaptationStubSettings.getPhraseSetSettings.toBuilder();
            this.getPhraseSetSettings = builder2;
            PagedCallSettings.Builder<ListPhraseSetRequest, ListPhraseSetResponse, AdaptationClient.ListPhraseSetPagedResponse> builder3 = adaptationStubSettings.listPhraseSetSettings.toBuilder();
            this.listPhraseSetSettings = builder3;
            UnaryCallSettings.Builder<UpdatePhraseSetRequest, PhraseSet> builder4 = adaptationStubSettings.updatePhraseSetSettings.toBuilder();
            this.updatePhraseSetSettings = builder4;
            UnaryCallSettings.Builder<DeletePhraseSetRequest, Empty> builder5 = adaptationStubSettings.deletePhraseSetSettings.toBuilder();
            this.deletePhraseSetSettings = builder5;
            UnaryCallSettings.Builder<CreateCustomClassRequest, CustomClass> builder6 = adaptationStubSettings.createCustomClassSettings.toBuilder();
            this.createCustomClassSettings = builder6;
            UnaryCallSettings.Builder<GetCustomClassRequest, CustomClass> builder7 = adaptationStubSettings.getCustomClassSettings.toBuilder();
            this.getCustomClassSettings = builder7;
            PagedCallSettings.Builder<ListCustomClassesRequest, ListCustomClassesResponse, AdaptationClient.ListCustomClassesPagedResponse> builder8 = adaptationStubSettings.listCustomClassesSettings.toBuilder();
            this.listCustomClassesSettings = builder8;
            UnaryCallSettings.Builder<UpdateCustomClassRequest, CustomClass> builder9 = adaptationStubSettings.updateCustomClassSettings.toBuilder();
            this.updateCustomClassSettings = builder9;
            UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty> builder10 = adaptationStubSettings.deleteCustomClassSettings.toBuilder();
            this.deleteCustomClassSettings = builder10;
            this.unaryMethodSettingsBuilders = ImmutableList.of((UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) builder, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) builder2, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) builder3, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) builder4, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) builder5, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) builder6, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) builder7, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) builder8, (UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty>) builder9, builder10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Builder createDefault() {
            Builder builder = new Builder((ClientContext) null);
            builder.setTransportChannelProvider(AdaptationStubSettings.defaultTransportChannelProvider());
            builder.setCredentialsProvider(AdaptationStubSettings.defaultCredentialsProviderBuilder().build());
            builder.setInternalHeaderProvider(AdaptationStubSettings.defaultApiClientHeaderProviderBuilder().build());
            builder.setEndpoint(AdaptationStubSettings.getDefaultEndpoint());
            return initDefaults(builder);
        }

        private static Builder initDefaults(Builder builder) {
            UnaryCallSettings.Builder<CreatePhraseSetRequest, PhraseSet> createPhraseSetSettings = builder.createPhraseSetSettings();
            ImmutableMap<String, ImmutableSet<StatusCode.Code>> immutableMap = RETRYABLE_CODE_DEFINITIONS;
            UnaryCallSettings.Builder<CreatePhraseSetRequest, PhraseSet> retryableCodes = createPhraseSetSettings.setRetryableCodes(immutableMap.get("no_retry_codes"));
            ImmutableMap<String, RetrySettings> immutableMap2 = RETRY_PARAM_DEFINITIONS;
            retryableCodes.setRetrySettings(immutableMap2.get("no_retry_params"));
            builder.getPhraseSetSettings().setRetryableCodes(immutableMap.get("no_retry_codes")).setRetrySettings(immutableMap2.get("no_retry_params"));
            builder.listPhraseSetSettings().setRetryableCodes((Set<StatusCode.Code>) immutableMap.get("no_retry_codes")).setRetrySettings(immutableMap2.get("no_retry_params"));
            builder.updatePhraseSetSettings().setRetryableCodes(immutableMap.get("no_retry_codes")).setRetrySettings(immutableMap2.get("no_retry_params"));
            builder.deletePhraseSetSettings().setRetryableCodes(immutableMap.get("no_retry_codes")).setRetrySettings(immutableMap2.get("no_retry_params"));
            builder.createCustomClassSettings().setRetryableCodes(immutableMap.get("no_retry_codes")).setRetrySettings(immutableMap2.get("no_retry_params"));
            builder.getCustomClassSettings().setRetryableCodes(immutableMap.get("no_retry_codes")).setRetrySettings(immutableMap2.get("no_retry_params"));
            builder.listCustomClassesSettings().setRetryableCodes((Set<StatusCode.Code>) immutableMap.get("no_retry_codes")).setRetrySettings(immutableMap2.get("no_retry_params"));
            builder.updateCustomClassSettings().setRetryableCodes(immutableMap.get("no_retry_codes")).setRetrySettings(immutableMap2.get("no_retry_params"));
            builder.deleteCustomClassSettings().setRetryableCodes(immutableMap.get("no_retry_codes")).setRetrySettings(immutableMap2.get("no_retry_params"));
            return builder;
        }

        public Builder applyToAllUnaryMethods(ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> apiFunction) throws Exception {
            StubSettings.Builder.applyToAllUnaryMethods(this.unaryMethodSettingsBuilders, apiFunction);
            return this;
        }

        public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
            return this.unaryMethodSettingsBuilders;
        }

        public UnaryCallSettings.Builder<CreatePhraseSetRequest, PhraseSet> createPhraseSetSettings() {
            return this.createPhraseSetSettings;
        }

        public UnaryCallSettings.Builder<GetPhraseSetRequest, PhraseSet> getPhraseSetSettings() {
            return this.getPhraseSetSettings;
        }

        public PagedCallSettings.Builder<ListPhraseSetRequest, ListPhraseSetResponse, AdaptationClient.ListPhraseSetPagedResponse> listPhraseSetSettings() {
            return this.listPhraseSetSettings;
        }

        public UnaryCallSettings.Builder<UpdatePhraseSetRequest, PhraseSet> updatePhraseSetSettings() {
            return this.updatePhraseSetSettings;
        }

        public UnaryCallSettings.Builder<DeletePhraseSetRequest, Empty> deletePhraseSetSettings() {
            return this.deletePhraseSetSettings;
        }

        public UnaryCallSettings.Builder<CreateCustomClassRequest, CustomClass> createCustomClassSettings() {
            return this.createCustomClassSettings;
        }

        public UnaryCallSettings.Builder<GetCustomClassRequest, CustomClass> getCustomClassSettings() {
            return this.getCustomClassSettings;
        }

        public PagedCallSettings.Builder<ListCustomClassesRequest, ListCustomClassesResponse, AdaptationClient.ListCustomClassesPagedResponse> listCustomClassesSettings() {
            return this.listCustomClassesSettings;
        }

        public UnaryCallSettings.Builder<UpdateCustomClassRequest, CustomClass> updateCustomClassSettings() {
            return this.updateCustomClassSettings;
        }

        public UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty> deleteCustomClassSettings() {
            return this.deleteCustomClassSettings;
        }

        @Override // com.google.api.gax.rpc.StubSettings.Builder
        public StubSettings<Builder> build() throws IOException {
            return new AdaptationStubSettings(this);
        }
    }
}
