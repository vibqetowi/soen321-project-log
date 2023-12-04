package io.grpc.internal;
/* loaded from: classes4.dex */
public interface BackoffPolicy {

    /* loaded from: classes4.dex */
    public interface Provider {
        BackoffPolicy get();
    }

    long nextBackoffNanos();
}
