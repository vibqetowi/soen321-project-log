package com.google.cloud.speech.v1p1beta1.stub;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StreamingCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadata;
import com.google.cloud.speech.v1p1beta1.LongRunningRecognizeRequest;
import com.google.cloud.speech.v1p1beta1.LongRunningRecognizeResponse;
import com.google.cloud.speech.v1p1beta1.RecognizeRequest;
import com.google.cloud.speech.v1p1beta1.RecognizeResponse;
import com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest;
import com.google.cloud.speech.v1p1beta1.StreamingRecognizeResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.threeten.bp.Duration;
@BetaApi
/* loaded from: classes7.dex */
public class SpeechStubSettings extends StubSettings<SpeechStubSettings> {
    private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES = ImmutableList.builder().add((ImmutableList.Builder) "https://www.googleapis.com/auth/cloud-platform").build();
    private final OperationCallSettings<LongRunningRecognizeRequest, LongRunningRecognizeResponse, LongRunningRecognizeMetadata> longRunningRecognizeOperationSettings;
    private final UnaryCallSettings<LongRunningRecognizeRequest, Operation> longRunningRecognizeSettings;
    private final UnaryCallSettings<RecognizeRequest, RecognizeResponse> recognizeSettings;
    private final StreamingCallSettings<StreamingRecognizeRequest, StreamingRecognizeResponse> streamingRecognizeSettings;

    public static String getDefaultEndpoint() {
        return "speech.googleapis.com:443";
    }

    public UnaryCallSettings<RecognizeRequest, RecognizeResponse> recognizeSettings() {
        return this.recognizeSettings;
    }

    public UnaryCallSettings<LongRunningRecognizeRequest, Operation> longRunningRecognizeSettings() {
        return this.longRunningRecognizeSettings;
    }

    public OperationCallSettings<LongRunningRecognizeRequest, LongRunningRecognizeResponse, LongRunningRecognizeMetadata> longRunningRecognizeOperationSettings() {
        return this.longRunningRecognizeOperationSettings;
    }

    public StreamingCallSettings<StreamingRecognizeRequest, StreamingRecognizeResponse> streamingRecognizeSettings() {
        return this.streamingRecognizeSettings;
    }

    @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
    public SpeechStub createStub() throws IOException {
        if (getTransportChannelProvider().getTransportName().equals(GrpcTransportChannel.getGrpcTransportName())) {
            return GrpcSpeechStub.create(this);
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
        return ApiClientHeaderProvider.newBuilder().setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(SpeechStubSettings.class)).setTransportToken(GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
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

    protected SpeechStubSettings(Builder builder) throws IOException {
        super(builder);
        this.recognizeSettings = builder.recognizeSettings().build();
        this.longRunningRecognizeSettings = builder.longRunningRecognizeSettings().build();
        this.longRunningRecognizeOperationSettings = builder.longRunningRecognizeOperationSettings().build();
        this.streamingRecognizeSettings = builder.streamingRecognizeSettings().build();
    }

    /* loaded from: classes7.dex */
    public static class Builder extends StubSettings.Builder<SpeechStubSettings, Builder> {
        private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>> RETRYABLE_CODE_DEFINITIONS;
        private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;
        private final OperationCallSettings.Builder<LongRunningRecognizeRequest, LongRunningRecognizeResponse, LongRunningRecognizeMetadata> longRunningRecognizeOperationSettings;
        private final UnaryCallSettings.Builder<LongRunningRecognizeRequest, Operation> longRunningRecognizeSettings;
        private final UnaryCallSettings.Builder<RecognizeRequest, RecognizeResponse> recognizeSettings;
        private final StreamingCallSettings.Builder<StreamingRecognizeRequest, StreamingRecognizeResponse> streamingRecognizeSettings;
        private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;

        static {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            builder.put("retry_policy_0_codes", ImmutableSet.copyOf((Collection) Lists.newArrayList(StatusCode.Code.DEADLINE_EXCEEDED, StatusCode.Code.UNAVAILABLE)));
            builder.put("no_retry_1_codes", ImmutableSet.copyOf((Collection) Lists.newArrayList()));
            RETRYABLE_CODE_DEFINITIONS = builder.build();
            ImmutableMap.Builder builder2 = ImmutableMap.builder();
            builder2.put("retry_policy_0_params", RetrySettings.newBuilder().setInitialRetryDelay(Duration.ofMillis(100L)).setRetryDelayMultiplier(1.3d).setMaxRetryDelay(Duration.ofMillis(60000L)).setInitialRpcTimeout(Duration.ofMillis(5000000L)).setRpcTimeoutMultiplier(1.0d).setMaxRpcTimeout(Duration.ofMillis(5000000L)).setTotalTimeout(Duration.ofMillis(5000000L)).build());
            builder2.put("no_retry_1_params", RetrySettings.newBuilder().setInitialRpcTimeout(Duration.ofMillis(5000000L)).setRpcTimeoutMultiplier(1.0d).setMaxRpcTimeout(Duration.ofMillis(5000000L)).setTotalTimeout(Duration.ofMillis(5000000L)).build());
            RETRY_PARAM_DEFINITIONS = builder2.build();
        }

        protected Builder() {
            this((ClientContext) null);
        }

        protected Builder(ClientContext clientContext) {
            super(clientContext);
            UnaryCallSettings.Builder<RecognizeRequest, RecognizeResponse> newUnaryCallSettingsBuilder = UnaryCallSettings.newUnaryCallSettingsBuilder();
            this.recognizeSettings = newUnaryCallSettingsBuilder;
            UnaryCallSettings.Builder<LongRunningRecognizeRequest, Operation> newUnaryCallSettingsBuilder2 = UnaryCallSettings.newUnaryCallSettingsBuilder();
            this.longRunningRecognizeSettings = newUnaryCallSettingsBuilder2;
            this.longRunningRecognizeOperationSettings = OperationCallSettings.newBuilder();
            this.streamingRecognizeSettings = StreamingCallSettings.newBuilder();
            this.unaryMethodSettingsBuilders = ImmutableList.of((UnaryCallSettings.Builder<LongRunningRecognizeRequest, Operation>) newUnaryCallSettingsBuilder, newUnaryCallSettingsBuilder2);
            initDefaults(this);
        }

        protected Builder(SpeechStubSettings speechStubSettings) {
            super(speechStubSettings);
            UnaryCallSettings.Builder<RecognizeRequest, RecognizeResponse> builder = speechStubSettings.recognizeSettings.toBuilder();
            this.recognizeSettings = builder;
            UnaryCallSettings.Builder<LongRunningRecognizeRequest, Operation> builder2 = speechStubSettings.longRunningRecognizeSettings.toBuilder();
            this.longRunningRecognizeSettings = builder2;
            this.longRunningRecognizeOperationSettings = speechStubSettings.longRunningRecognizeOperationSettings.toBuilder();
            this.streamingRecognizeSettings = speechStubSettings.streamingRecognizeSettings.toBuilder();
            this.unaryMethodSettingsBuilders = ImmutableList.of((UnaryCallSettings.Builder<LongRunningRecognizeRequest, Operation>) builder, builder2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Builder createDefault() {
            Builder builder = new Builder((ClientContext) null);
            builder.setTransportChannelProvider(SpeechStubSettings.defaultTransportChannelProvider());
            builder.setCredentialsProvider(SpeechStubSettings.defaultCredentialsProviderBuilder().build());
            builder.setInternalHeaderProvider(SpeechStubSettings.defaultApiClientHeaderProviderBuilder().build());
            builder.setEndpoint(SpeechStubSettings.getDefaultEndpoint());
            return initDefaults(builder);
        }

        private static Builder initDefaults(Builder builder) {
            UnaryCallSettings.Builder<RecognizeRequest, RecognizeResponse> recognizeSettings = builder.recognizeSettings();
            ImmutableMap<String, ImmutableSet<StatusCode.Code>> immutableMap = RETRYABLE_CODE_DEFINITIONS;
            UnaryCallSettings.Builder<RecognizeRequest, RecognizeResponse> retryableCodes = recognizeSettings.setRetryableCodes(immutableMap.get("retry_policy_0_codes"));
            ImmutableMap<String, RetrySettings> immutableMap2 = RETRY_PARAM_DEFINITIONS;
            retryableCodes.setRetrySettings(immutableMap2.get("retry_policy_0_params"));
            builder.longRunningRecognizeSettings().setRetryableCodes(immutableMap.get("no_retry_1_codes")).setRetrySettings(immutableMap2.get("no_retry_1_params"));
            builder.longRunningRecognizeOperationSettings().setInitialCallSettings(UnaryCallSettings.newUnaryCallSettingsBuilder().setRetryableCodes(immutableMap.get("no_retry_1_codes")).setRetrySettings(immutableMap2.get("no_retry_1_params")).build()).setResponseTransformer(ProtoOperationTransformers.ResponseTransformer.create(LongRunningRecognizeResponse.class)).setMetadataTransformer(ProtoOperationTransformers.MetadataTransformer.create(LongRunningRecognizeMetadata.class)).setPollingAlgorithm(OperationTimedPollAlgorithm.create(RetrySettings.newBuilder().setInitialRetryDelay(Duration.ofMillis(5000L)).setRetryDelayMultiplier(1.5d).setMaxRetryDelay(Duration.ofMillis(45000L)).setInitialRpcTimeout(Duration.ZERO).setRpcTimeoutMultiplier(1.0d).setMaxRpcTimeout(Duration.ZERO).setTotalTimeout(Duration.ofMillis(300000L)).build()));
            return builder;
        }

        public Builder applyToAllUnaryMethods(ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> apiFunction) throws Exception {
            StubSettings.Builder.applyToAllUnaryMethods(this.unaryMethodSettingsBuilders, apiFunction);
            return this;
        }

        public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
            return this.unaryMethodSettingsBuilders;
        }

        public UnaryCallSettings.Builder<RecognizeRequest, RecognizeResponse> recognizeSettings() {
            return this.recognizeSettings;
        }

        public UnaryCallSettings.Builder<LongRunningRecognizeRequest, Operation> longRunningRecognizeSettings() {
            return this.longRunningRecognizeSettings;
        }

        @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
        public OperationCallSettings.Builder<LongRunningRecognizeRequest, LongRunningRecognizeResponse, LongRunningRecognizeMetadata> longRunningRecognizeOperationSettings() {
            return this.longRunningRecognizeOperationSettings;
        }

        public StreamingCallSettings.Builder<StreamingRecognizeRequest, StreamingRecognizeResponse> streamingRecognizeSettings() {
            return this.streamingRecognizeSettings;
        }

        @Override // com.google.api.gax.rpc.StubSettings.Builder
        public StubSettings<Builder> build() throws IOException {
            return new SpeechStubSettings(this);
        }
    }
}
