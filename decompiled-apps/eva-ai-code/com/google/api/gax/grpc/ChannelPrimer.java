package com.google.api.gax.grpc;

import com.google.api.core.InternalApi;
import io.grpc.ManagedChannel;
@InternalApi("For internal use by google-cloud-java clients only")
/* loaded from: classes7.dex */
public interface ChannelPrimer {
    void primeChannel(ManagedChannel managedChannel);
}
