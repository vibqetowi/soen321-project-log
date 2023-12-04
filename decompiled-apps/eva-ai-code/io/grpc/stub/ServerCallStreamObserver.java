package io.grpc.stub;
/* loaded from: classes4.dex */
public abstract class ServerCallStreamObserver<V> extends CallStreamObserver<V> {
    public abstract boolean isCancelled();

    @Override // io.grpc.stub.CallStreamObserver
    public abstract boolean isReady();

    @Override // io.grpc.stub.CallStreamObserver
    public abstract void request(int i);

    public abstract void setCompression(String str);

    @Override // io.grpc.stub.CallStreamObserver
    public abstract void setMessageCompression(boolean z);

    public abstract void setOnCancelHandler(Runnable runnable);

    @Override // io.grpc.stub.CallStreamObserver
    public abstract void setOnReadyHandler(Runnable runnable);

    public void disableAutoRequest() {
        throw new UnsupportedOperationException();
    }
}
