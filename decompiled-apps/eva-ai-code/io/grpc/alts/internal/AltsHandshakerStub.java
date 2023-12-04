package io.grpc.alts.internal;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.google.common.base.Optional;
import io.grpc.alts.internal.HandshakerServiceGrpc;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class AltsHandshakerStub {
    private static final long HANDSHAKE_RPC_DEADLINE_SECS = 20;
    private final AtomicReference<String> exceptionMessage;
    private final StreamObserver<HandshakerResp> reader;
    private final ArrayBlockingQueue<Optional<HandshakerResp>> responseQueue;
    private final HandshakerServiceGrpc.HandshakerServiceStub serviceStub;
    private StreamObserver<HandshakerReq> writer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AltsHandshakerStub(HandshakerServiceGrpc.HandshakerServiceStub handshakerServiceStub) {
        this.reader = new Reader();
        this.responseQueue = new ArrayBlockingQueue<>(1);
        this.exceptionMessage = new AtomicReference<>();
        this.serviceStub = handshakerServiceStub;
    }

    AltsHandshakerStub() {
        this.reader = new Reader();
        this.responseQueue = new ArrayBlockingQueue<>(1);
        this.exceptionMessage = new AtomicReference<>();
        this.serviceStub = null;
    }

    AltsHandshakerStub(StreamObserver<HandshakerReq> streamObserver) {
        this.reader = new Reader();
        this.responseQueue = new ArrayBlockingQueue<>(1);
        this.exceptionMessage = new AtomicReference<>();
        this.writer = streamObserver;
        this.serviceStub = null;
    }

    StreamObserver<HandshakerResp> getReaderForTest() {
        return this.reader;
    }

    public HandshakerResp send(HandshakerReq handshakerReq) throws InterruptedException, IOException {
        createWriterIfNull();
        maybeThrowIoException();
        if (!this.responseQueue.isEmpty()) {
            throw new IOException("Received an unexpected response.");
        }
        this.writer.onNext(handshakerReq);
        Optional<HandshakerResp> take = this.responseQueue.take();
        if (!take.isPresent()) {
            maybeThrowIoException();
        }
        return take.get();
    }

    private void createWriterIfNull() {
        if (this.writer == null) {
            this.writer = ((HandshakerServiceGrpc.HandshakerServiceStub) this.serviceStub.withDeadlineAfter(20L, TimeUnit.SECONDS)).doHandshake(this.reader);
        }
    }

    private void maybeThrowIoException() throws IOException {
        if (this.exceptionMessage.get() != null) {
            throw new IOException(this.exceptionMessage.get());
        }
    }

    public void close() {
        StreamObserver<HandshakerReq> streamObserver = this.writer;
        if (streamObserver != null) {
            streamObserver.onCompleted();
        }
    }

    /* loaded from: classes4.dex */
    private class Reader implements StreamObserver<HandshakerResp> {
        private Reader() {
        }

        @Override // io.grpc.stub.StreamObserver
        public void onNext(HandshakerResp handshakerResp) {
            try {
                AltsHandshakerStub.this.responseQueue.add(Optional.of(handshakerResp));
            } catch (IllegalStateException unused) {
                PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(AltsHandshakerStub.this.exceptionMessage, null, "Received an unexpected response.");
                AltsHandshakerStub.this.close();
            }
        }

        @Override // io.grpc.stub.StreamObserver
        public void onError(Throwable th) {
            AtomicReference atomicReference = AltsHandshakerStub.this.exceptionMessage;
            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, "Received a terminating error: " + th.toString());
            AltsHandshakerStub.this.responseQueue.offer(Optional.absent());
        }

        @Override // io.grpc.stub.StreamObserver
        public void onCompleted() {
            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(AltsHandshakerStub.this.exceptionMessage, null, "Response stream closed.");
            AltsHandshakerStub.this.responseQueue.offer(Optional.absent());
        }
    }
}
