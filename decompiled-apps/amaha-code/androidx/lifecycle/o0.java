package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import k1.a;
/* compiled from: ViewModelProvider.kt */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f2446a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2447b;

    /* renamed from: c  reason: collision with root package name */
    public final k1.a f2448c;

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: c  reason: collision with root package name */
        public static a f2449c;

        /* renamed from: b  reason: collision with root package name */
        public final Application f2450b;

        public a(Application application) {
            this.f2450b = application;
        }

        @Override // androidx.lifecycle.o0.c, androidx.lifecycle.o0.b
        public final <T extends l0> T a(Class<T> cls) {
            Application application = this.f2450b;
            if (application != null) {
                return (T) c(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.o0.c, androidx.lifecycle.o0.b
        public final l0 b(Class cls, k1.d dVar) {
            if (this.f2450b != null) {
                return a(cls);
            }
            Application application = (Application) dVar.f22765a.get(n0.f2445a);
            if (application != null) {
                return c(cls, application);
            }
            if (!androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public final <T extends l0> T c(Class<T> cls, Application application) {
            if (androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    kotlin.jvm.internal.i.f(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(defpackage.b.l("Cannot create an instance of ", cls), e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException(defpackage.b.l("Cannot create an instance of ", cls), e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException(defpackage.b.l("Cannot create an instance of ", cls), e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException(defpackage.b.l("Cannot create an instance of ", cls), e13);
                }
            }
            return (T) super.a(cls);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public interface b {
        <T extends l0> T a(Class<T> cls);

        l0 b(Class cls, k1.d dVar);
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static c f2451a;

        @Override // androidx.lifecycle.o0.b
        public <T extends l0> T a(Class<T> cls) {
            try {
                T newInstance = cls.newInstance();
                kotlin.jvm.internal.i.f(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(defpackage.b.l("Cannot create an instance of ", cls), e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(defpackage.b.l("Cannot create an instance of ", cls), e11);
            }
        }

        @Override // androidx.lifecycle.o0.b
        public l0 b(Class cls, k1.d dVar) {
            return a(cls);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o0(q0 store, b bVar) {
        this(store, bVar, 0);
        kotlin.jvm.internal.i.g(store, "store");
    }

    public final <T extends l0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final l0 b(Class cls, String key) {
        l0 a10;
        d dVar;
        kotlin.jvm.internal.i.g(key, "key");
        q0 q0Var = this.f2446a;
        l0 viewModel = q0Var.f2462a.get(key);
        boolean isInstance = cls.isInstance(viewModel);
        b bVar = this.f2447b;
        if (isInstance) {
            if (bVar instanceof d) {
                dVar = (d) bVar;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                kotlin.jvm.internal.i.f(viewModel, "viewModel");
                dVar.c(viewModel);
            }
            if (viewModel != null) {
                return viewModel;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        k1.d dVar2 = new k1.d(this.f2448c);
        dVar2.f22765a.put(p0.f2452a, key);
        try {
            a10 = bVar.b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            a10 = bVar.a(cls);
        }
        l0 put = q0Var.f2462a.put(key, a10);
        if (put != null) {
            put.c();
        }
        return a10;
    }

    public o0(q0 store, b factory, k1.a defaultCreationExtras) {
        kotlin.jvm.internal.i.g(store, "store");
        kotlin.jvm.internal.i.g(factory, "factory");
        kotlin.jvm.internal.i.g(defaultCreationExtras, "defaultCreationExtras");
        this.f2446a = store;
        this.f2447b = factory;
        this.f2448c = defaultCreationExtras;
    }

    public /* synthetic */ o0(q0 q0Var, b bVar, int i6) {
        this(q0Var, bVar, a.C0350a.f22766b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o0(r0 owner) {
        this(r0, r2, r5);
        b bVar;
        k1.a aVar;
        kotlin.jvm.internal.i.g(owner, "owner");
        q0 viewModelStore = owner.getViewModelStore();
        kotlin.jvm.internal.i.f(viewModelStore, "owner.viewModelStore");
        boolean z10 = owner instanceof h;
        if (z10) {
            bVar = ((h) owner).getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.i.f(bVar, "owner.defaultViewModelProviderFactory");
        } else {
            if (c.f2451a == null) {
                c.f2451a = new c();
            }
            bVar = c.f2451a;
            kotlin.jvm.internal.i.d(bVar);
        }
        if (z10) {
            aVar = ((h) owner).getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.i.f(aVar, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        } else {
            aVar = a.C0350a.f22766b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o0(r0 owner, b bVar) {
        this(r0, bVar, r3);
        k1.a aVar;
        kotlin.jvm.internal.i.g(owner, "owner");
        q0 viewModelStore = owner.getViewModelStore();
        kotlin.jvm.internal.i.f(viewModelStore, "owner.viewModelStore");
        if (owner instanceof h) {
            aVar = ((h) owner).getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.i.f(aVar, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        } else {
            aVar = a.C0350a.f22766b;
        }
    }

    /* compiled from: ViewModelProvider.kt */
    /* loaded from: classes.dex */
    public static class d {
        public void c(l0 l0Var) {
        }
    }
}
