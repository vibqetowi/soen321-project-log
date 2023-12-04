package com.google.api.gax.rpc;

import com.google.api.core.InternalApi;
@InternalApi("For use by transport-specific implementations")
/* loaded from: classes7.dex */
public interface RequestParamsEncoder<RequestT> {
    String encode(RequestT requestt);
}
