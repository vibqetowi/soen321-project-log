package com.google.firebase.storage.internal;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class ActivityLifecycleListener {
    private static final ActivityLifecycleListener instance = new ActivityLifecycleListener();
    private final Map<Object, LifecycleEntry> cookieMap = new HashMap();
    private final Object sync = new Object();

    /* loaded from: classes.dex */
    public static class LifecycleEntry {
        private final Activity activity;
        private final Object cookie;
        private final Runnable runnable;

        public LifecycleEntry(Activity activity, Runnable runnable, Object obj) {
            this.activity = activity;
            this.runnable = runnable;
            this.cookie = obj;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof LifecycleEntry)) {
                return false;
            }
            LifecycleEntry lifecycleEntry = (LifecycleEntry) obj;
            if (!lifecycleEntry.cookie.equals(this.cookie) || lifecycleEntry.runnable != this.runnable || lifecycleEntry.activity != this.activity) {
                return false;
            }
            return true;
        }

        public Activity getActivity() {
            return this.activity;
        }

        public Object getCookie() {
            return this.cookie;
        }

        public Runnable getRunnable() {
            return this.runnable;
        }

        public int hashCode() {
            return this.cookie.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class OnStopCallback extends LifecycleCallback {
        private static final String TAG = "StorageOnStopCallback";
        private final List<LifecycleEntry> listeners;

        private OnStopCallback(h hVar) {
            super(hVar);
            this.listeners = new ArrayList();
            this.mLifecycleFragment.j(TAG, this);
        }

        public static OnStopCallback getInstance(Activity activity) {
            h fragment = LifecycleCallback.getFragment(new g(activity));
            OnStopCallback onStopCallback = (OnStopCallback) fragment.m(OnStopCallback.class, TAG);
            if (onStopCallback == null) {
                return new OnStopCallback(fragment);
            }
            return onStopCallback;
        }

        public void addEntry(LifecycleEntry lifecycleEntry) {
            synchronized (this.listeners) {
                this.listeners.add(lifecycleEntry);
            }
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            ArrayList arrayList;
            synchronized (this.listeners) {
                arrayList = new ArrayList(this.listeners);
                this.listeners.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LifecycleEntry lifecycleEntry = (LifecycleEntry) it.next();
                if (lifecycleEntry != null) {
                    Log.d(TAG, "removing subscription from activity.");
                    lifecycleEntry.getRunnable().run();
                    ActivityLifecycleListener.getInstance().removeCookie(lifecycleEntry.getCookie());
                }
            }
        }

        public void removeEntry(LifecycleEntry lifecycleEntry) {
            synchronized (this.listeners) {
                this.listeners.remove(lifecycleEntry);
            }
        }
    }

    private ActivityLifecycleListener() {
    }

    public static ActivityLifecycleListener getInstance() {
        return instance;
    }

    public void removeCookie(Object obj) {
        synchronized (this.sync) {
            LifecycleEntry lifecycleEntry = this.cookieMap.get(obj);
            if (lifecycleEntry != null) {
                OnStopCallback.getInstance(lifecycleEntry.getActivity()).removeEntry(lifecycleEntry);
            }
        }
    }

    public void runOnActivityStopped(Activity activity, Object obj, Runnable runnable) {
        synchronized (this.sync) {
            LifecycleEntry lifecycleEntry = new LifecycleEntry(activity, runnable, obj);
            OnStopCallback.getInstance(activity).addEntry(lifecycleEntry);
            this.cookieMap.put(obj, lifecycleEntry);
        }
    }
}
