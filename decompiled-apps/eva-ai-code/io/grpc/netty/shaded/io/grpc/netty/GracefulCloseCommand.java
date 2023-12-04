package io.grpc.netty.shaded.io.grpc.netty;

import io.grpc.Status;
import io.grpc.netty.shaded.io.grpc.netty.WriteQueue;
/* loaded from: classes4.dex */
class GracefulCloseCommand extends WriteQueue.AbstractQueuedCommand {
    private final Status status;

    public GracefulCloseCommand(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }
}
