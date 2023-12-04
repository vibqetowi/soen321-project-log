package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
/* loaded from: classes2.dex */
public abstract class dd extends Observable {
    public final String AFKeystoreWrapper;
    private long valueOf;
    final Runnable values;
    public final Map<String, Object> AFInAppEventType = new HashMap();
    public d AFInAppEventParameterName = d.NOT_STARTED;

    /* loaded from: classes2.dex */
    public enum d {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public abstract void AFInAppEventParameterName(Context context);

    public dd(String str, Runnable runnable) {
        this.values = runnable;
        this.AFKeystoreWrapper = str;
    }

    public final void values() {
        this.valueOf = System.currentTimeMillis();
        this.AFInAppEventParameterName = d.STARTED;
        addObserver(new Observer() { // from class: com.appsflyer.internal.dd.3
            @Override // java.util.Observer
            public final void update(Observable observable, Object obj) {
                dd.this.values.run();
            }
        });
    }

    public final void valueOf() {
        this.AFInAppEventType.put("source", this.AFKeystoreWrapper);
        this.AFInAppEventType.putAll(new da());
        this.AFInAppEventType.put("latency", Long.valueOf(System.currentTimeMillis() - this.valueOf));
        this.AFInAppEventParameterName = d.FINISHED;
        setChanged();
        notifyObservers();
    }
}
