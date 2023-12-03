package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashSet;
/* compiled from: ViewModelStore.java */
/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, l0> f2462a = new HashMap<>();

    public final void a() {
        for (l0 l0Var : this.f2462a.values()) {
            l0Var.f2438w = true;
            HashMap hashMap = l0Var.f2436u;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object obj : l0Var.f2436u.values()) {
                        l0.b(obj);
                    }
                }
            }
            LinkedHashSet linkedHashSet = l0Var.f2437v;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable closeable : l0Var.f2437v) {
                        l0.b(closeable);
                    }
                }
            }
            l0Var.c();
        }
        this.f2462a.clear();
    }
}
