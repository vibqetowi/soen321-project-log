package com.google.cloud.speech.v1p1beta1;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.speech.v1p1beta1.AdaptationClient;
import com.google.cloud.speech.v1p1beta1.stub.AdaptationStubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
@BetaApi
/* loaded from: classes7.dex */
public class AdaptationSettings extends ClientSettings<AdaptationSettings> {
    public UnaryCallSettings<CreatePhraseSetRequest, PhraseSet> createPhraseSetSettings() {
        return ((AdaptationStubSettings) getStubSettings()).createPhraseSetSettings();
    }

    public UnaryCallSettings<GetPhraseSetRequest, PhraseSet> getPhraseSetSettings() {
        return ((AdaptationStubSettings) getStubSettings()).getPhraseSetSettings();
    }

    public PagedCallSettings<ListPhraseSetRequest, ListPhraseSetResponse, AdaptationClient.ListPhraseSetPagedResponse> listPhraseSetSettings() {
        return ((AdaptationStubSettings) getStubSettings()).listPhraseSetSettings();
    }

    public UnaryCallSettings<UpdatePhraseSetRequest, PhraseSet> updatePhraseSetSettings() {
        return ((AdaptationStubSettings) getStubSettings()).updatePhraseSetSettings();
    }

    public UnaryCallSettings<DeletePhraseSetRequest, Empty> deletePhraseSetSettings() {
        return ((AdaptationStubSettings) getStubSettings()).deletePhraseSetSettings();
    }

    public UnaryCallSettings<CreateCustomClassRequest, CustomClass> createCustomClassSettings() {
        return ((AdaptationStubSettings) getStubSettings()).createCustomClassSettings();
    }

    public UnaryCallSettings<GetCustomClassRequest, CustomClass> getCustomClassSettings() {
        return ((AdaptationStubSettings) getStubSettings()).getCustomClassSettings();
    }

    public PagedCallSettings<ListCustomClassesRequest, ListCustomClassesResponse, AdaptationClient.ListCustomClassesPagedResponse> listCustomClassesSettings() {
        return ((AdaptationStubSettings) getStubSettings()).listCustomClassesSettings();
    }

    public UnaryCallSettings<UpdateCustomClassRequest, CustomClass> updateCustomClassSettings() {
        return ((AdaptationStubSettings) getStubSettings()).updateCustomClassSettings();
    }

    public UnaryCallSettings<DeleteCustomClassRequest, Empty> deleteCustomClassSettings() {
        return ((AdaptationStubSettings) getStubSettings()).deleteCustomClassSettings();
    }

    public static final AdaptationSettings create(AdaptationStubSettings adaptationStubSettings) throws IOException {
        return new Builder(adaptationStubSettings.toBuilder()).build();
    }

    public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
        return AdaptationStubSettings.defaultExecutorProviderBuilder();
    }

    public static String getDefaultEndpoint() {
        return AdaptationStubSettings.getDefaultEndpoint();
    }

    public static List<String> getDefaultServiceScopes() {
        return AdaptationStubSettings.getDefaultServiceScopes();
    }

    public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
        return AdaptationStubSettings.defaultCredentialsProviderBuilder();
    }

    public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
        return AdaptationStubSettings.defaultGrpcTransportProviderBuilder();
    }

    public static TransportChannelProvider defaultTransportChannelProvider() {
        return AdaptationStubSettings.defaultTransportChannelProvider();
    }

    @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
    public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
        return AdaptationStubSettings.defaultApiClientHeaderProviderBuilder();
    }

    public static Builder newBuilder() {
        return Builder.createDefault();
    }

    public static Builder newBuilder(ClientContext clientContext) {
        return new Builder(clientContext);
    }

    @Override // com.google.api.gax.rpc.ClientSettings
    public Builder toBuilder() {
        return new Builder(this);
    }

    protected AdaptationSettings(Builder builder) throws IOException {
        super(builder);
    }

    /* loaded from: classes7.dex */
    public static class Builder extends ClientSettings.Builder<AdaptationSettings, Builder> {
        protected Builder() throws IOException {
            this((ClientContext) null);
        }

        protected Builder(ClientContext clientContext) {
            super(AdaptationStubSettings.newBuilder(clientContext));
        }

        protected Builder(AdaptationSettings adaptationSettings) {
            super(adaptationSettings.getStubSettings().toBuilder());
        }

        protected Builder(AdaptationStubSettings.Builder builder) {
            super(builder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Builder createDefault() {
            return new Builder(AdaptationStubSettings.newBuilder());
        }

        public AdaptationStubSettings.Builder getStubSettingsBuilder() {
            return (AdaptationStubSettings.Builder) getStubSettings();
        }

        public Builder applyToAllUnaryMethods(ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> apiFunction) throws Exception {
            ClientSettings.Builder.applyToAllUnaryMethods(getStubSettingsBuilder().unaryMethodSettingsBuilders(), apiFunction);
            return this;
        }

        public UnaryCallSettings.Builder<CreatePhraseSetRequest, PhraseSet> createPhraseSetSettings() {
            return getStubSettingsBuilder().createPhraseSetSettings();
        }

        public UnaryCallSettings.Builder<GetPhraseSetRequest, PhraseSet> getPhraseSetSettings() {
            return getStubSettingsBuilder().getPhraseSetSettings();
        }

        public PagedCallSettings.Builder<ListPhraseSetRequest, ListPhraseSetResponse, AdaptationClient.ListPhraseSetPagedResponse> listPhraseSetSettings() {
            return getStubSettingsBuilder().listPhraseSetSettings();
        }

        public UnaryCallSettings.Builder<UpdatePhraseSetRequest, PhraseSet> updatePhraseSetSettings() {
            return getStubSettingsBuilder().updatePhraseSetSettings();
        }

        public UnaryCallSettings.Builder<DeletePhraseSetRequest, Empty> deletePhraseSetSettings() {
            return getStubSettingsBuilder().deletePhraseSetSettings();
        }

        public UnaryCallSettings.Builder<CreateCustomClassRequest, CustomClass> createCustomClassSettings() {
            return getStubSettingsBuilder().createCustomClassSettings();
        }

        public UnaryCallSettings.Builder<GetCustomClassRequest, CustomClass> getCustomClassSettings() {
            return getStubSettingsBuilder().getCustomClassSettings();
        }

        public PagedCallSettings.Builder<ListCustomClassesRequest, ListCustomClassesResponse, AdaptationClient.ListCustomClassesPagedResponse> listCustomClassesSettings() {
            return getStubSettingsBuilder().listCustomClassesSettings();
        }

        public UnaryCallSettings.Builder<UpdateCustomClassRequest, CustomClass> updateCustomClassSettings() {
            return getStubSettingsBuilder().updateCustomClassSettings();
        }

        public UnaryCallSettings.Builder<DeleteCustomClassRequest, Empty> deleteCustomClassSettings() {
            return getStubSettingsBuilder().deleteCustomClassSettings();
        }

        @Override // com.google.api.gax.rpc.ClientSettings.Builder
        public AdaptationSettings build() throws IOException {
            return new AdaptationSettings(this);
        }
    }
}
