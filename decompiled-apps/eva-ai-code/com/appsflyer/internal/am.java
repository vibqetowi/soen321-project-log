package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public final class am {
    public final String AFInAppEventType;
    public final long AFKeystoreWrapper;
    private final boolean values;

    public am() {
    }

    public static Map<String, String> AFKeystoreWrapper(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                hashMap.put(URLEncoder.encode(entry.getKey(), "utf-8"), URLEncoder.encode(entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                AFLogger.values(e);
            }
        }
        return hashMap;
    }

    public am(String str, long j, boolean z) {
        this.AFInAppEventType = str;
        this.AFKeystoreWrapper = j;
        this.values = z;
    }

    public final boolean values() {
        return this.values;
    }
}
