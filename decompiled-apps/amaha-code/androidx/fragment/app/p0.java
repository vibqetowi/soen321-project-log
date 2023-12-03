package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.j;
import androidx.lifecycle.o0;
import java.util.LinkedHashMap;
/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
public final class p0 implements androidx.lifecycle.h, a2.c, androidx.lifecycle.r0 {

    /* renamed from: u  reason: collision with root package name */
    public final Fragment f2258u;

    /* renamed from: v  reason: collision with root package name */
    public final androidx.lifecycle.q0 f2259v;

    /* renamed from: w  reason: collision with root package name */
    public o0.b f2260w;

    /* renamed from: x  reason: collision with root package name */
    public androidx.lifecycle.q f2261x = null;

    /* renamed from: y  reason: collision with root package name */
    public a2.b f2262y = null;

    public p0(Fragment fragment, androidx.lifecycle.q0 q0Var) {
        this.f2258u = fragment;
        this.f2259v = q0Var;
    }

    public final void a(j.b bVar) {
        this.f2261x.f(bVar);
    }

    public final void b() {
        if (this.f2261x == null) {
            this.f2261x = new androidx.lifecycle.q(this);
            a2.b bVar = new a2.b(this);
            this.f2262y = bVar;
            bVar.a();
        }
    }

    @Override // androidx.lifecycle.h
    public final k1.a getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f2258u;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        k1.d dVar = new k1.d(0);
        LinkedHashMap linkedHashMap = dVar.f22765a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.n0.f2445a, application);
        }
        linkedHashMap.put(androidx.lifecycle.e0.f2400a, fragment);
        linkedHashMap.put(androidx.lifecycle.e0.f2401b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.e0.f2402c, fragment.getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.h
    public final o0.b getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f2258u;
        o0.b defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f2260w = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f2260w == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            this.f2260w = new androidx.lifecycle.h0(application, fragment, fragment.getArguments());
        }
        return this.f2260w;
    }

    @Override // androidx.lifecycle.p
    public final androidx.lifecycle.j getLifecycle() {
        b();
        return this.f2261x;
    }

    @Override // a2.c
    public final a2.a getSavedStateRegistry() {
        b();
        return this.f2262y.f174b;
    }

    @Override // androidx.lifecycle.r0
    public final androidx.lifecycle.q0 getViewModelStore() {
        b();
        return this.f2259v;
    }
}
