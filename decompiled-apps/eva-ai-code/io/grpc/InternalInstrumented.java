package io.grpc;

import com.google.common.util.concurrent.ListenableFuture;
/* loaded from: classes4.dex */
public interface InternalInstrumented<T> extends InternalWithLogId {
    ListenableFuture<T> getStats();
}
