package androidx.lifecycle;

import a2.a;
import android.os.Bundle;
import androidx.lifecycle.d0;
import androidx.lifecycle.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2400a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final c f2401b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a f2402c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class b {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class c {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<k1.a, g0> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f2403u = new d();

        public d() {
            super(1);
        }

        @Override // ss.l
        public final g0 invoke(k1.a aVar) {
            k1.a initializer = aVar;
            kotlin.jvm.internal.i.g(initializer, "$this$initializer");
            return new g0();
        }
    }

    public static final d0 a(k1.d dVar) {
        f0 f0Var;
        Bundle bundle;
        b bVar = f2400a;
        LinkedHashMap linkedHashMap = dVar.f22765a;
        a2.c cVar = (a2.c) linkedHashMap.get(bVar);
        if (cVar != null) {
            r0 r0Var = (r0) linkedHashMap.get(f2401b);
            if (r0Var != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(f2402c);
                String str = (String) linkedHashMap.get(p0.f2452a);
                if (str != null) {
                    a.b b10 = cVar.getSavedStateRegistry().b();
                    if (b10 instanceof f0) {
                        f0Var = (f0) b10;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var != null) {
                        g0 c10 = c(r0Var);
                        d0 d0Var = (d0) c10.f2409x.get(str);
                        if (d0Var == null) {
                            Class<? extends Object>[] clsArr = d0.f;
                            boolean z10 = true;
                            if (!f0Var.f2405b) {
                                f0Var.f2406c = f0Var.f2404a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                                f0Var.f2405b = true;
                                g0 g0Var = (g0) f0Var.f2407d.getValue();
                            }
                            Bundle bundle3 = f0Var.f2406c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = f0Var.f2406c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = f0Var.f2406c;
                            if ((bundle5 == null || !bundle5.isEmpty()) ? false : false) {
                                f0Var.f2406c = null;
                            }
                            d0 a10 = d0.a.a(bundle, bundle2);
                            c10.f2409x.put(str, a10);
                            return a10;
                        }
                        return d0Var;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends a2.c & r0> void b(T t3) {
        boolean z10;
        kotlin.jvm.internal.i.g(t3, "<this>");
        j.c b10 = t3.getLifecycle().b();
        kotlin.jvm.internal.i.f(b10, "lifecycle.currentState");
        if (b10 != j.c.INITIALIZED && b10 != j.c.CREATED) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (t3.getSavedStateRegistry().b() == null) {
                f0 f0Var = new f0(t3.getSavedStateRegistry(), t3);
                t3.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", f0Var);
                t3.getLifecycle().a(new SavedStateHandleAttacher(f0Var));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final g0 c(r0 r0Var) {
        kotlin.jvm.internal.i.g(r0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        ys.d clazz = kotlin.jvm.internal.y.a(g0.class);
        kotlin.jvm.internal.i.g(clazz, "clazz");
        d initializer = d.f2403u;
        kotlin.jvm.internal.i.g(initializer, "initializer");
        arrayList.add(new k1.e(sp.b.C(clazz), initializer));
        Object[] array = arrayList.toArray(new k1.e[0]);
        if (array != null) {
            k1.e[] eVarArr = (k1.e[]) array;
            return (g0) new o0(r0Var, new k1.b((k1.e[]) Arrays.copyOf(eVarArr, eVarArr.length))).b(g0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
