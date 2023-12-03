package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public class LifecycleCallback {
    protected final h mLifecycleFragment;

    public LifecycleCallback(h hVar) {
        this.mLifecycleFragment = hVar;
    }

    @Keep
    private static h getChimeraLifecycleFragmentImpl(g gVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static h getFragment(Activity activity) {
        return getFragment(new g(activity));
    }

    public Activity getActivity() {
        Activity n10 = this.mLifecycleFragment.n();
        v9.o.h(n10);
        return n10;
    }

    public static h getFragment(g gVar) {
        f1 f1Var;
        g1 g1Var;
        Activity activity = gVar.f7378a;
        if (activity instanceof androidx.fragment.app.p) {
            androidx.fragment.app.p pVar = (androidx.fragment.app.p) activity;
            WeakHashMap weakHashMap = g1.f7381x;
            WeakReference weakReference = (WeakReference) weakHashMap.get(pVar);
            if (weakReference == null || (g1Var = (g1) weakReference.get()) == null) {
                try {
                    g1Var = (g1) pVar.getSupportFragmentManager().F("SupportLifecycleFragmentImpl");
                    if (g1Var == null || g1Var.isRemoving()) {
                        g1Var = new g1();
                        androidx.fragment.app.y supportFragmentManager = pVar.getSupportFragmentManager();
                        androidx.fragment.app.a l2 = defpackage.e.l(supportFragmentManager, supportFragmentManager);
                        l2.e(0, g1Var, "SupportLifecycleFragmentImpl", 1);
                        l2.k();
                    }
                    weakHashMap.put(pVar, new WeakReference(g1Var));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
                }
            }
            return g1Var;
        } else if (activity instanceof Activity) {
            WeakHashMap weakHashMap2 = f1.f7374x;
            WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activity);
            if (weakReference2 == null || (f1Var = (f1) weakReference2.get()) == null) {
                try {
                    f1Var = (f1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (f1Var == null || f1Var.isRemoving()) {
                        f1Var = new f1();
                        activity.getFragmentManager().beginTransaction().add(f1Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap2.put(activity, new WeakReference(f1Var));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e11);
                }
            }
            return f1Var;
        } else {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public static h getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void onActivityResult(int i6, int i10, Intent intent) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
