package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
/* loaded from: classes.dex */
public abstract class AFe1hSDK extends Observable {
    public final String AFKeystoreWrapper;
    long afDebugLog;
    public final String afErrorLog;
    final Runnable values;
    public final Map<String, Object> AFInAppEventType = new HashMap();
    public AFa1zSDK afRDLog = AFa1zSDK.NOT_STARTED;

    /* renamed from: com.appsflyer.internal.AFe1hSDK$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements Observer {
        public AnonymousClass2() {
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            AFe1hSDK.this.values.run();
        }
    }

    /* loaded from: classes.dex */
    public enum AFa1zSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public AFe1hSDK(String str, String str2, Runnable runnable) {
        this.values = runnable;
        this.AFKeystoreWrapper = str2;
        this.afErrorLog = str;
    }

    public final void AFKeystoreWrapper() {
        this.AFInAppEventType.put("source", this.AFKeystoreWrapper);
        this.AFInAppEventType.put("type", this.afErrorLog);
        this.AFInAppEventType.put("latency", Long.valueOf(System.currentTimeMillis() - this.afDebugLog));
        this.afRDLog = AFa1zSDK.FINISHED;
        setChanged();
        notifyObservers();
    }

    public abstract void valueOf(Context context);
}
