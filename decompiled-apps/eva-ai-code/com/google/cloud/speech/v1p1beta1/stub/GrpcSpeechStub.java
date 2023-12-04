package com.google.cloud.speech.v1p1beta1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.speech.v1p1beta1.LongRunningRecognizeMetadata;
import com.google.cloud.speech.v1p1beta1.LongRunningRecognizeRequest;
import com.google.cloud.speech.v1p1beta1.LongRunningRecognizeResponse;
import com.google.cloud.speech.v1p1beta1.RecognizeRequest;
import com.google.cloud.speech.v1p1beta1.RecognizeResponse;
import com.google.cloud.speech.v1p1beta1.StreamingRecognizeRequest;
import com.google.cloud.speech.v1p1beta1.StreamingRecognizeResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
@BetaApi
/* loaded from: classes7.dex */
public class GrpcSpeechStub extends SpeechStub {
    private final BackgroundResource backgroundResources;
    private final GrpcStubCallableFactory callableFactory;
    private final UnaryCallable<LongRunningRecognizeRequest, Operation> longRunningRecognizeCallable;
    private final OperationCallable<LongRunningRecognizeRequest, LongRunningRecognizeResponse, LongRunningRecognizeMetadata> longRunningRecognizeOperationCallable;
    private final GrpcOperationsStub operationsStub;
    private final UnaryCallable<RecognizeRequest, RecognizeResponse> recognizeCallable;
    private final BidiStreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse> streamingRecognizeCallable;
    private static final MethodDescriptor<RecognizeRequest, RecognizeResponse> recognizeMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName("google.cloud.speech.v1p1beta1.Speech/Recognize").setRequestMarshaller(ProtoUtils.marshaller(RecognizeRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(RecognizeResponse.getDefaultInstance())).build();
    private static final MethodDescriptor<LongRunningRecognizeRequest, Operation> longRunningRecognizeMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName("google.cloud.speech.v1p1beta1.Speech/LongRunningRecognize").setRequestMarshaller(ProtoUtils.marshaller(LongRunningRecognizeRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance())).build();
    private static final MethodDescriptor<StreamingRecognizeRequest, StreamingRecognizeResponse> streamingRecognizeMethodDescriptor = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.BIDI_STREAMING).setFullMethodName("google.cloud.speech.v1p1beta1.Speech/StreamingRecognize").setRequestMarshaller(ProtoUtils.marshaller(StreamingRecognizeRequest.getDefaultInstance())).setResponseMarshaller(ProtoUtils.marshaller(StreamingRecognizeResponse.getDefaultInstance())).build();

    public static final GrpcSpeechStub create(SpeechStubSettings speechStubSettings) throws IOException {
        return new GrpcSpeechStub(speechStubSettings, ClientContext.create(speechStubSettings));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings] */
    public static final GrpcSpeechStub create(ClientContext clientContext) throws IOException {
        return new GrpcSpeechStub(SpeechStubSettings.newBuilder().build(), clientContext);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings] */
    public static final GrpcSpeechStub create(ClientContext clientContext, GrpcStubCallableFactory grpcStubCallableFactory) throws IOException {
        return new GrpcSpeechStub(SpeechStubSettings.newBuilder().build(), clientContext, grpcStubCallableFactory);
    }

    protected GrpcSpeechStub(SpeechStubSettings speechStubSettings, ClientContext clientContext) throws IOException {
        this(speechStubSettings, clientContext, new GrpcSpeechCallableFactory());
    }

    protected GrpcSpeechStub(SpeechStubSettings speechStubSettings, ClientContext clientContext, GrpcStubCallableFactory grpcStubCallableFactory) throws IOException {
        this.callableFactory = grpcStubCallableFactory;
        GrpcOperationsStub create = GrpcOperationsStub.create(clientContext, grpcStubCallableFactory);
        this.operationsStub = create;
        GrpcCallSettings build = GrpcCallSettings.newBuilder().setMethodDescriptor(recognizeMethodDescriptor).build();
        GrpcCallSettings build2 = GrpcCallSettings.newBuilder().setMethodDescriptor(longRunningRecognizeMethodDescriptor).build();
        GrpcCallSettings build3 = GrpcCallSettings.newBuilder().setMethodDescriptor(streamingRecognizeMethodDescriptor).build();
        this.recognizeCallable = grpcStubCallableFactory.createUnaryCallable(build, speechStubSettings.recognizeSettings(), clientContext);
        this.longRunningRecognizeCallable = grpcStubCallableFactory.createUnaryCallable(build2, speechStubSettings.longRunningRecognizeSettings(), clientContext);
        this.longRunningRecognizeOperationCallable = grpcStubCallableFactory.createOperationCallable(build2, speechStubSettings.longRunningRecognizeOperationSettings(), clientContext, create);
        this.streamingRecognizeCallable = grpcStubCallableFactory.createBidiStreamingCallable(build3, speechStubSettings.streamingRecognizeSettings(), clientContext);
        this.backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.SpeechStub
    public GrpcOperationsStub getOperationsStub() {
        return this.operationsStub;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.SpeechStub
    public UnaryCallable<RecognizeRequest, RecognizeResponse> recognizeCallable() {
        return this.recognizeCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.SpeechStub
    public UnaryCallable<LongRunningRecognizeRequest, Operation> longRunningRecognizeCallable() {
        return this.longRunningRecognizeCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.SpeechStub
    public OperationCallable<LongRunningRecognizeRequest, LongRunningRecognizeResponse, LongRunningRecognizeMetadata> longRunningRecognizeOperationCallable() {
        return this.longRunningRecognizeOperationCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.SpeechStub
    public BidiStreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse> streamingRecognizeCallable() {
        return this.streamingRecognizeCallable;
    }

    @Override // com.google.cloud.speech.v1p1beta1.stub.SpeechStub, java.lang.AutoCloseable
    public final void close() {
        shutdown();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public void shutdown() {
        this.backgroundResources.shutdown();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean isShutdown() {
        return this.backgroundResources.isShutdown();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean isTerminated() {
        return this.backgroundResources.isTerminated();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public void shutdownNow() {
        this.backgroundResources.shutdownNow();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.backgroundResources.awaitTermination(j, timeUnit);
    }
}
