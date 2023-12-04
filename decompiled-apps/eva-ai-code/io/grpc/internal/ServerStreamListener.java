package io.grpc.internal;

import io.grpc.Status;
/* loaded from: classes4.dex */
public interface ServerStreamListener extends StreamListener {
    void closed(Status status);

    void halfClosed();
}
