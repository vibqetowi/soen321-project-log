package io.grpc;
/* loaded from: classes4.dex */
public final class InternalCallOptions {
    private InternalCallOptions() {
    }

    public static Boolean getWaitForReady(CallOptions callOptions) {
        return callOptions.getWaitForReady();
    }
}
