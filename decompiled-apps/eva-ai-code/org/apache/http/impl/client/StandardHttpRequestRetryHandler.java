package org.apache.http.impl.client;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpRequest;
/* loaded from: classes5.dex */
public class StandardHttpRequestRetryHandler extends DefaultHttpRequestRetryHandler {
    private final Map<String, Boolean> idempotentMethods;

    public StandardHttpRequestRetryHandler(int i, boolean z) {
        super(i, z);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.idempotentMethods = concurrentHashMap;
        concurrentHashMap.put("GET", Boolean.TRUE);
        concurrentHashMap.put("HEAD", Boolean.TRUE);
        concurrentHashMap.put("PUT", Boolean.TRUE);
        concurrentHashMap.put("DELETE", Boolean.TRUE);
        concurrentHashMap.put("OPTIONS", Boolean.TRUE);
        concurrentHashMap.put("TRACE", Boolean.TRUE);
    }

    public StandardHttpRequestRetryHandler() {
        this(3, false);
    }

    @Override // org.apache.http.impl.client.DefaultHttpRequestRetryHandler
    protected boolean handleAsIdempotent(HttpRequest httpRequest) {
        Boolean bool = this.idempotentMethods.get(httpRequest.getRequestLine().getMethod().toUpperCase(Locale.ROOT));
        return bool != null && bool.booleanValue();
    }
}
