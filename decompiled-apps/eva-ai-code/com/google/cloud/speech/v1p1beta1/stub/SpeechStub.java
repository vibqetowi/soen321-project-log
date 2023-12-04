package com.google.cloud.speech.v1p1beta1.stub;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.BidiStreamingCallable;
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
import com.google.longrunning.stub.OperationsStub;
@BetaApi
/* loaded from: classes7.dex */
public abstract class SpeechStub implements BackgroundResource {
    @Override // java.lang.AutoCloseable
    public abstract void close();

    public OperationsStub getOperationsStub() {
        throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
    }

    public UnaryCallable<RecognizeRequest, RecognizeResponse> recognizeCallable() {
        throw new UnsupportedOperationException("Not implemented: recognizeCallable()");
    }

    public OperationCallable<LongRunningRecognizeRequest, LongRunningRecognizeResponse, LongRunningRecognizeMetadata> longRunningRecognizeOperationCallable() {
        throw new UnsupportedOperationException("Not implemented: longRunningRecognizeOperationCallable()");
    }

    public UnaryCallable<LongRunningRecognizeRequest, Operation> longRunningRecognizeCallable() {
        throw new UnsupportedOperationException("Not implemented: longRunningRecognizeCallable()");
    }

    public BidiStreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse> streamingRecognizeCallable() {
        throw new UnsupportedOperationException("Not implemented: streamingRecognizeCallable()");
    }
}
