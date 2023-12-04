package io.grpc;

import io.grpc.CallCredentials;
import java.util.concurrent.Executor;
@Deprecated
/* loaded from: classes4.dex */
public abstract class CallCredentials2 extends CallCredentials {

    /* loaded from: classes4.dex */
    public static abstract class MetadataApplier extends CallCredentials.MetadataApplier {
    }

    public abstract void applyRequestMetadata(CallCredentials.RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier);

    @Override // io.grpc.CallCredentials
    public final void applyRequestMetadata(CallCredentials.RequestInfo requestInfo, Executor executor, final CallCredentials.MetadataApplier metadataApplier) {
        applyRequestMetadata(requestInfo, executor, new MetadataApplier() { // from class: io.grpc.CallCredentials2.1
            @Override // io.grpc.CallCredentials.MetadataApplier
            public void apply(Metadata metadata) {
                metadataApplier.apply(metadata);
            }

            @Override // io.grpc.CallCredentials.MetadataApplier
            public void fail(Status status) {
                metadataApplier.fail(status);
            }
        });
    }
}
