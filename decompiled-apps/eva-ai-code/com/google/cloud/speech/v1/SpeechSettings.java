package com.google.cloud.speech.v1;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.StreamingCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.speech.v1.stub.SpeechStubSettings;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.util.List;
/* loaded from: classes7.dex */
public class SpeechSettings extends ClientSettings<SpeechSettings> {
    public UnaryCallSettings<RecognizeRequest, RecognizeResponse> recognizeSettings() {
        return ((SpeechStubSettings) getStubSettings()).recognizeSettings();
    }

    public UnaryCallSettings<LongRunningRecognizeRequest, Operation> longRunningRecognizeSettings() {
        return ((SpeechStubSettings) getStubSettings()).longRunningRecognizeSettings();
    }

    public OperationCallSettings<LongRunningRecognizeRequest, LongRunningRecognizeResponse, LongRunningRecognizeMetadata> longRunningRecognizeOperationSettings() {
        return ((SpeechStubSettings) getStubSettings()).longRunningRecognizeOperationSettings();
    }

    public StreamingCallSettings<StreamingRecognizeRequest, StreamingRecognizeResponse> streamingRecognizeSettings() {
        return ((SpeechStubSettings) getStubSettings()).streamingRecognizeSettings();
    }

    public static final SpeechSettings create(SpeechStubSettings speechStubSettings) throws IOException {
        return new Builder(speechStubSettings.toBuilder()).build();
    }

    public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
        return SpeechStubSettings.defaultExecutorProviderBuilder();
    }

    public static String getDefaultEndpoint() {
        return SpeechStubSettings.getDefaultEndpoint();
    }

    public static List<String> getDefaultServiceScopes() {
        return SpeechStubSettings.getDefaultServiceScopes();
    }

    public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
        return SpeechStubSettings.defaultCredentialsProviderBuilder();
    }

    public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
        return SpeechStubSettings.defaultGrpcTransportProviderBuilder();
    }

    public static TransportChannelProvider defaultTransportChannelProvider() {
        return SpeechStubSettings.defaultTransportChannelProvider();
    }

    @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
    public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
        return SpeechStubSettings.defaultApiClientHeaderProviderBuilder();
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

    protected SpeechSettings(Builder builder) throws IOException {
        super(builder);
    }

    /* loaded from: classes7.dex */
    public static class Builder extends ClientSettings.Builder<SpeechSettings, Builder> {
        protected Builder() throws IOException {
            this((ClientContext) null);
        }

        protected Builder(ClientContext clientContext) {
            super(SpeechStubSettings.newBuilder(clientContext));
        }

        protected Builder(SpeechSettings speechSettings) {
            super(speechSettings.getStubSettings().toBuilder());
        }

        protected Builder(SpeechStubSettings.Builder builder) {
            super(builder);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Builder createDefault() {
            return new Builder(SpeechStubSettings.newBuilder());
        }

        public SpeechStubSettings.Builder getStubSettingsBuilder() {
            return (SpeechStubSettings.Builder) getStubSettings();
        }

        public Builder applyToAllUnaryMethods(ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> apiFunction) throws Exception {
            ClientSettings.Builder.applyToAllUnaryMethods(getStubSettingsBuilder().unaryMethodSettingsBuilders(), apiFunction);
            return this;
        }

        public UnaryCallSettings.Builder<RecognizeRequest, RecognizeResponse> recognizeSettings() {
            return getStubSettingsBuilder().recognizeSettings();
        }

        public UnaryCallSettings.Builder<LongRunningRecognizeRequest, Operation> longRunningRecognizeSettings() {
            return getStubSettingsBuilder().longRunningRecognizeSettings();
        }

        public OperationCallSettings.Builder<LongRunningRecognizeRequest, LongRunningRecognizeResponse, LongRunningRecognizeMetadata> longRunningRecognizeOperationSettings() {
            return getStubSettingsBuilder().longRunningRecognizeOperationSettings();
        }

        public StreamingCallSettings.Builder<StreamingRecognizeRequest, StreamingRecognizeResponse> streamingRecognizeSettings() {
            return getStubSettingsBuilder().streamingRecognizeSettings();
        }

        @Override // com.google.api.gax.rpc.ClientSettings.Builder
        public SpeechSettings build() throws IOException {
            return new SpeechSettings(this);
        }
    }
}
