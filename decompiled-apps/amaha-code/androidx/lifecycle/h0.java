package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.d0;
import androidx.lifecycle.o0;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
/* compiled from: SavedStateViewModelFactory.kt */
/* loaded from: classes.dex */
public final class h0 extends o0.d implements o0.b {

    /* renamed from: a  reason: collision with root package name */
    public final Application f2410a;

    /* renamed from: b  reason: collision with root package name */
    public final o0.a f2411b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f2412c;

    /* renamed from: d  reason: collision with root package name */
    public final j f2413d;

    /* renamed from: e  reason: collision with root package name */
    public final a2.a f2414e;

    public h0() {
        this.f2411b = new o0.a(null);
    }

    @Override // androidx.lifecycle.o0.b
    public final <T extends l0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.o0.b
    public final l0 b(Class cls, k1.d dVar) {
        Constructor a10;
        p0 p0Var = p0.f2452a;
        LinkedHashMap linkedHashMap = dVar.f22765a;
        String str = (String) linkedHashMap.get(p0Var);
        if (str != null) {
            if (linkedHashMap.get(e0.f2400a) != null && linkedHashMap.get(e0.f2401b) != null) {
                Application application = (Application) linkedHashMap.get(n0.f2445a);
                boolean isAssignableFrom = b.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    a10 = i0.a(cls, i0.f2415a);
                } else {
                    a10 = i0.a(cls, i0.f2416b);
                }
                if (a10 == null) {
                    return this.f2411b.b(cls, dVar);
                }
                if (isAssignableFrom && application != null) {
                    return i0.b(cls, a10, application, e0.a(dVar));
                }
                return i0.b(cls, a10, e0.a(dVar));
            } else if (this.f2413d != null) {
                return d(cls, str);
            } else {
                throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            }
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.o0.d
    public final void c(l0 l0Var) {
        j jVar = this.f2413d;
        if (jVar != null) {
            i.a(l0Var, this.f2414e, jVar);
        }
    }

    public final l0 d(Class cls, String str) {
        Constructor a10;
        l0 b10;
        j jVar = this.f2413d;
        if (jVar != null) {
            boolean isAssignableFrom = b.class.isAssignableFrom(cls);
            Application application = this.f2410a;
            if (isAssignableFrom && application != null) {
                a10 = i0.a(cls, i0.f2415a);
            } else {
                a10 = i0.a(cls, i0.f2416b);
            }
            if (a10 == null) {
                if (application != null) {
                    return this.f2411b.a(cls);
                }
                if (o0.c.f2451a == null) {
                    o0.c.f2451a = new o0.c();
                }
                o0.c cVar = o0.c.f2451a;
                kotlin.jvm.internal.i.d(cVar);
                return cVar.a(cls);
            }
            a2.a aVar = this.f2414e;
            Bundle a11 = aVar.a(str);
            Class<? extends Object>[] clsArr = d0.f;
            d0 a12 = d0.a.a(a11, this.f2412c);
            SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, a12);
            if (!savedStateHandleController.f2376v) {
                savedStateHandleController.f2376v = true;
                jVar.a(savedStateHandleController);
                aVar.c(str, a12.f2399e);
                i.b(jVar, aVar);
                if (isAssignableFrom && application != null) {
                    b10 = i0.b(cls, a10, application, a12);
                } else {
                    b10 = i0.b(cls, a10, a12);
                }
                b10.d(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
                return b10;
            }
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public h0(Application application, a2.c owner, Bundle bundle) {
        o0.a aVar;
        kotlin.jvm.internal.i.g(owner, "owner");
        this.f2414e = owner.getSavedStateRegistry();
        this.f2413d = owner.getLifecycle();
        this.f2412c = bundle;
        this.f2410a = application;
        if (application != null) {
            if (o0.a.f2449c == null) {
                o0.a.f2449c = new o0.a(application);
            }
            aVar = o0.a.f2449c;
            kotlin.jvm.internal.i.d(aVar);
        } else {
            aVar = new o0.a(null);
        }
        this.f2411b = aVar;
    }
}
