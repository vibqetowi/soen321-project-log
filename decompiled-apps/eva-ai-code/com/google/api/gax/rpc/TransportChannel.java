package com.google.api.gax.rpc;

import com.google.api.core.InternalExtensionOnly;
import com.google.api.gax.core.BackgroundResource;
@InternalExtensionOnly
/* loaded from: classes7.dex */
public interface TransportChannel extends BackgroundResource {
    ApiCallContext getEmptyCallContext();

    String getTransportName();
}
