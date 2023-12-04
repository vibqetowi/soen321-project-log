package com.google.api.gax.batching;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
@InternalApi("For google-cloud-java client use only.")
@BetaApi("The surface for batching is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public interface BatchingRequestBuilder<ElementT, RequestT> {
    void add(ElementT elementt);

    RequestT build();
}
