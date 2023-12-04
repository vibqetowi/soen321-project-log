package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import io.grpc.netty.shaded.io.netty.handler.codec.http.websocketx.WebSocketServerHandshaker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public final class ai {
    private static String AFInAppEventParameterName;
    private static String values;
    public final List<Object> AFKeystoreWrapper;

    public ai() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void AFInAppEventType(String str) {
        AFInAppEventParameterName = str;
        if (str == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                sb.append(str.charAt(i));
            } else {
                sb.append(WebSocketServerHandshaker.SUB_PROTOCOL_WILDCARD);
            }
        }
        values = sb.toString();
    }

    public static void AFKeystoreWrapper(String str) {
        if (AFInAppEventParameterName == null) {
            AFInAppEventType(AppsFlyerProperties.getInstance().getDevKey());
        }
        String str2 = AFInAppEventParameterName;
        if (str2 != null) {
            AFLogger.values(str.replace(str2, values));
        }
    }

    public ai(byte b) {
        Executors.newSingleThreadExecutor();
        new Timer(true);
        this.AFKeystoreWrapper = new CopyOnWriteArrayList();
        new CopyOnWriteArraySet();
        Collections.newSetFromMap(new ConcurrentHashMap());
        new ConcurrentSkipListSet();
        new ConcurrentSkipListSet();
        new ArrayList();
        Collections.newSetFromMap(new ConcurrentHashMap());
    }
}
