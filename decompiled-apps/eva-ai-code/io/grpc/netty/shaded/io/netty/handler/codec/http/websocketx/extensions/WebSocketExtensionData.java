package io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.extensions;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes4.dex */
public final class WebSocketExtensionData {
    private final String name;
    private final Map<String, String> parameters;

    public WebSocketExtensionData(String str, Map<String, String> map) {
        this.name = (String) ObjectUtil.checkNotNull(str, "name");
        this.parameters = Collections.unmodifiableMap((Map) ObjectUtil.checkNotNull(map, "parameters"));
    }

    public String name() {
        return this.name;
    }

    public Map<String, String> parameters() {
        return this.parameters;
    }
}
