package com.google.cloud.speech.v1p1beta1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.speech.v1p1beta1.stub.SpeechStub;
import com.google.cloud.speech.v1p1beta1.stub.SpeechStubSettings;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
@BetaApi
/* loaded from: classes7.dex */
public class SpeechClient implements BackgroundResource {
    private final OperationsClient operationsClient;
    private final SpeechSettings settings;
    private final SpeechStub stub;

    public static final SpeechClient create() throws IOException {
        return create(SpeechSettings.newBuilder().build());
    }

    public static final SpeechClient create(SpeechSettings speechSettings) throws IOException {
        return new SpeechClient(speechSettings);
    }

    @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
    public static final SpeechClient create(SpeechStub speechStub) {
        return new SpeechClient(speechStub);
    }

    protected SpeechClient(SpeechSettings speechSettings) throws IOException {
        this.settings = speechSettings;
        SpeechStub createStub = ((SpeechStubSettings) speechSettings.getStubSettings()).createStub();
        this.stub = createStub;
        this.operationsClient = OperationsClient.create(createStub.getOperationsStub());
    }

    @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
    protected SpeechClient(SpeechStub speechStub) {
        this.settings = null;
        this.stub = speechStub;
        this.operationsClient = OperationsClient.create(speechStub.getOperationsStub());
    }

    public final SpeechSettings getSettings() {
        return this.settings;
    }

    @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
    public SpeechStub getStub() {
        return this.stub;
    }

    public final OperationsClient getOperationsClient() {
        return this.operationsClient;
    }

    public final RecognizeResponse recognize(RecognitionConfig recognitionConfig, RecognitionAudio recognitionAudio) {
        return recognize(RecognizeRequest.newBuilder().setConfig(recognitionConfig).setAudio(recognitionAudio).build());
    }

    public final RecognizeResponse recognize(RecognizeRequest recognizeRequest) {
        return recognizeCallable().call(recognizeRequest);
    }

    public final UnaryCallable<RecognizeRequest, RecognizeResponse> recognizeCallable() {
        return this.stub.recognizeCallable();
    }

    public final OperationFuture<LongRunningRecognizeResponse, LongRunningRecognizeMetadata> longRunningRecognizeAsync(RecognitionConfig recognitionConfig, RecognitionAudio recognitionAudio) {
        return longRunningRecognizeAsync(LongRunningRecognizeRequest.newBuilder().setConfig(recognitionConfig).setAudio(recognitionAudio).build());
    }

    public final OperationFuture<LongRunningRecognizeResponse, LongRunningRecognizeMetadata> longRunningRecognizeAsync(LongRunningRecognizeRequest longRunningRecognizeRequest) {
        return longRunningRecognizeOperationCallable().futureCall(longRunningRecognizeRequest);
    }

    public final OperationCallable<LongRunningRecognizeRequest, LongRunningRecognizeResponse, LongRunningRecognizeMetadata> longRunningRecognizeOperationCallable() {
        return this.stub.longRunningRecognizeOperationCallable();
    }

    public final UnaryCallable<LongRunningRecognizeRequest, Operation> longRunningRecognizeCallable() {
        return this.stub.longRunningRecognizeCallable();
    }

    public final BidiStreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse> streamingRecognizeCallable() {
        return this.stub.streamingRecognizeCallable();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.stub.close();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public void shutdown() {
        this.stub.shutdown();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean isShutdown() {
        return this.stub.isShutdown();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean isTerminated() {
        return this.stub.isTerminated();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public void shutdownNow() {
        this.stub.shutdownNow();
    }

    @Override // com.google.api.gax.core.BackgroundResource
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.stub.awaitTermination(j, timeUnit);
    }
}
