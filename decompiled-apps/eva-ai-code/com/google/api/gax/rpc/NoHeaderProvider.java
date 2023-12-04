package com.google.api.gax.rpc;

import com.google.api.core.BetaApi;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
@BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
/* loaded from: classes7.dex */
public class NoHeaderProvider implements HeaderProvider, Serializable {
    private static final long serialVersionUID = 7323717933589691233L;

    @Override // com.google.api.gax.rpc.HeaderProvider
    public Map<String, String> getHeaders() {
        return Collections.emptyMap();
    }
}
