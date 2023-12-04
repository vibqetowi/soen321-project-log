package com.google.api.gax.batching;

import com.google.api.core.BetaApi;
@BetaApi("The surface for batching is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public interface RequestBuilder<RequestT> {
    void appendRequest(RequestT requestt);

    RequestT build();
}
