package io.grpc;

import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public abstract class ClientCall<ReqT, RespT> {

    /* loaded from: classes4.dex */
    public static abstract class Listener<T> {
        public void onClose(Status status, Metadata metadata) {
        }

        public void onHeaders(Metadata metadata) {
        }

        public void onMessage(T t) {
        }

        public void onReady() {
        }
    }

    public abstract void cancel(@Nullable String str, @Nullable Throwable th);

    public abstract void halfClose();

    public boolean isReady() {
        return true;
    }

    public abstract void request(int i);

    public abstract void sendMessage(ReqT reqt);

    public void setMessageCompression(boolean z) {
    }

    public abstract void start(Listener<RespT> listener, Metadata metadata);

    public Attributes getAttributes() {
        return Attributes.EMPTY;
    }
}
