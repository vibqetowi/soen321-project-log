package io.grpc;
/* loaded from: classes4.dex */
public abstract class ServerTransportFilter {
    public Attributes transportReady(Attributes attributes) {
        return attributes;
    }

    public void transportTerminated(Attributes attributes) {
    }
}
