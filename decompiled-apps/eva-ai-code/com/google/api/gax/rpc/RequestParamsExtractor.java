package com.google.api.gax.rpc;

import com.google.api.core.InternalApi;
import java.util.Map;
@InternalApi("For use by transport-specific implementations")
/* loaded from: classes7.dex */
public interface RequestParamsExtractor<RequestT> {
    Map<String, String> extract(RequestT requestt);
}
