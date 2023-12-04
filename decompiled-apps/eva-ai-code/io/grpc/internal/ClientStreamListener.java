package io.grpc.internal;

import io.grpc.Metadata;
import io.grpc.Status;
/* loaded from: classes4.dex */
public interface ClientStreamListener extends StreamListener {

    /* loaded from: classes4.dex */
    public enum RpcProgress {
        PROCESSED,
        REFUSED,
        DROPPED
    }

    void closed(Status status, Metadata metadata);

    void closed(Status status, RpcProgress rpcProgress, Metadata metadata);

    void headersRead(Metadata metadata);
}
