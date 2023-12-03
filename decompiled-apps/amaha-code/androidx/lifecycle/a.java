package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.d0;
import androidx.lifecycle.o0;
import s1.f;
/* compiled from: AbstractSavedStateViewModelFactory.java */
/* loaded from: classes.dex */
public abstract class a extends o0.d implements o0.b {

    /* renamed from: a  reason: collision with root package name */
    public final a2.a f2379a;

    /* renamed from: b  reason: collision with root package name */
    public final j f2380b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f2381c = null;

    public a(s1.f fVar) {
        this.f2379a = fVar.C.f174b;
        this.f2380b = fVar.B;
    }

    @Override // androidx.lifecycle.o0.b
    public final <T extends l0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            j jVar = this.f2380b;
            if (jVar != null) {
                a2.a aVar = this.f2379a;
                Bundle a10 = aVar.a(canonicalName);
                Class<? extends Object>[] clsArr = d0.f;
                d0 a11 = d0.a.a(a10, this.f2381c);
                SavedStateHandleController savedStateHandleController = new SavedStateHandleController(canonicalName, a11);
                if (!savedStateHandleController.f2376v) {
                    savedStateHandleController.f2376v = true;
                    jVar.a(savedStateHandleController);
                    aVar.c(canonicalName, a11.f2399e);
                    i.b(jVar, aVar);
                    f.c cVar = new f.c(a11);
                    cVar.d(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
                    return cVar;
                }
                throw new IllegalStateException("Already attached to lifecycleOwner");
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.o0.b
    public final l0 b(Class cls, k1.d dVar) {
        String str = (String) dVar.f22765a.get(p0.f2452a);
        if (str != null) {
            a2.a aVar = this.f2379a;
            if (aVar != null) {
                Bundle a10 = aVar.a(str);
                Class<? extends Object>[] clsArr = d0.f;
                d0 a11 = d0.a.a(a10, this.f2381c);
                SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, a11);
                if (!savedStateHandleController.f2376v) {
                    savedStateHandleController.f2376v = true;
                    j jVar = this.f2380b;
                    jVar.a(savedStateHandleController);
                    aVar.c(str, a11.f2399e);
                    i.b(jVar, aVar);
                    f.c cVar = new f.c(a11);
                    cVar.d(savedStateHandleController, "androidx.lifecycle.savedstate.vm.tag");
                    return cVar;
                }
                throw new IllegalStateException("Already attached to lifecycleOwner");
            }
            return new f.c(e0.a(dVar));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.o0.d
    public final void c(l0 l0Var) {
        a2.a aVar = this.f2379a;
        if (aVar != null) {
            i.a(l0Var, aVar, this.f2380b);
        }
    }
}
