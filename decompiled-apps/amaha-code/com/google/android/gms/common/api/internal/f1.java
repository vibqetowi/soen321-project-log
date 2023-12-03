package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class f1 extends Fragment implements h {

    /* renamed from: x  reason: collision with root package name */
    public static final WeakHashMap f7374x = new WeakHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final Map f7375u = DesugarCollections.synchronizedMap(new t.b());

    /* renamed from: v  reason: collision with root package name */
    public int f7376v = 0;

    /* renamed from: w  reason: collision with root package name */
    public Bundle f7377w;

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f7375u.values()) {
            lifecycleCallback.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final void j(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f7375u;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.f7376v > 0) {
                new ma.c(Looper.getMainLooper()).post(new k9.d0(this, lifecycleCallback, str, 1));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(defpackage.b.m("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final LifecycleCallback m(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f7375u.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.h
    public final Activity n() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        for (LifecycleCallback lifecycleCallback : this.f7375u.values()) {
            lifecycleCallback.onActivityResult(i6, i10, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f7376v = 1;
        this.f7377w = bundle;
        for (Map.Entry entry : this.f7375u.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f7376v = 5;
        for (LifecycleCallback lifecycleCallback : this.f7375u.values()) {
            lifecycleCallback.onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f7376v = 3;
        for (LifecycleCallback lifecycleCallback : this.f7375u.values()) {
            lifecycleCallback.onResume();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f7375u.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f7376v = 2;
        for (LifecycleCallback lifecycleCallback : this.f7375u.values()) {
            lifecycleCallback.onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f7376v = 4;
        for (LifecycleCallback lifecycleCallback : this.f7375u.values()) {
            lifecycleCallback.onStop();
        }
    }
}
