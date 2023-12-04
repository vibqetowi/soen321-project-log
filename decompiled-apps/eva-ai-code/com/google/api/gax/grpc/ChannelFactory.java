package com.google.api.gax.grpc;

import com.google.api.core.InternalApi;
import io.grpc.ManagedChannel;
import java.io.IOException;
@InternalApi("For internal use by google-cloud-java clients only")
/* loaded from: classes7.dex */
public interface ChannelFactory {
    ManagedChannel createSingleChannel() throws IOException;
}
