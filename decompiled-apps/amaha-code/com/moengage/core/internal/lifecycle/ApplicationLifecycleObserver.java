package com.moengage.core.internal.lifecycle;

import android.content.Context;
import ih.p;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import qg.w;
/* compiled from: ApplicationLifecycleObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/moengage/core/internal/lifecycle/ApplicationLifecycleObserver;", "", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class ApplicationLifecycleObserver implements androidx.lifecycle.f {

    /* renamed from: u  reason: collision with root package name */
    public final Context f10166u;

    /* renamed from: v  reason: collision with root package name */
    public final p f10167v;

    /* renamed from: w  reason: collision with root package name */
    public final String f10168w;

    /* compiled from: ApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onCreate() : ", ApplicationLifecycleObserver.this.f10168w);
        }
    }

    /* compiled from: ApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onDestroy() : ", ApplicationLifecycleObserver.this.f10168w);
        }
    }

    /* compiled from: ApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class c extends k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onPause() : ", ApplicationLifecycleObserver.this.f10168w);
        }
    }

    /* compiled from: ApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class d extends k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onResume() : ", ApplicationLifecycleObserver.this.f10168w);
        }
    }

    /* compiled from: ApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class e extends k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onStart() : ", ApplicationLifecycleObserver.this.f10168w);
        }
    }

    /* compiled from: ApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class f extends k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onStart() : ", ApplicationLifecycleObserver.this.f10168w);
        }
    }

    /* compiled from: ApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class g extends k implements ss.a<String> {
        public g() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onStop() : ", ApplicationLifecycleObserver.this.f10168w);
        }
    }

    /* compiled from: ApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class h extends k implements ss.a<String> {
        public h() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onStop() : ", ApplicationLifecycleObserver.this.f10168w);
        }
    }

    public ApplicationLifecycleObserver(Context context, p sdkInstance) {
        i.g(sdkInstance, "sdkInstance");
        this.f10166u = context;
        this.f10167v = sdkInstance;
        this.f10168w = "Core_ApplicationLifecycleObserver";
    }

    @Override // androidx.lifecycle.f
    public final void a(androidx.lifecycle.p pVar) {
        hh.g.b(this.f10167v.f20105d, 0, new d(), 3);
    }

    @Override // androidx.lifecycle.f
    public final void b(androidx.lifecycle.p pVar) {
        hh.g.b(this.f10167v.f20105d, 0, new a(), 3);
    }

    @Override // androidx.lifecycle.f
    public final void d(androidx.lifecycle.p pVar) {
        hh.g.b(this.f10167v.f20105d, 0, new c(), 3);
    }

    @Override // androidx.lifecycle.f
    public final void e(androidx.lifecycle.p pVar) {
        p pVar2 = this.f10167v;
        hh.g.b(pVar2.f20105d, 0, new g(), 3);
        try {
            w.f29578a.getClass();
            qg.g d10 = w.d(pVar2);
            Context context = this.f10166u;
            i.g(context, "context");
            d10.f29546a.f20106e.c(new ah.e("APP_CLOSE", false, new qg.e(d10, context, 0)));
        } catch (Exception e10) {
            pVar2.f20105d.a(1, e10, new h());
        }
    }

    @Override // androidx.lifecycle.f
    public final void f(androidx.lifecycle.p pVar) {
        hh.g.b(this.f10167v.f20105d, 0, new b(), 3);
    }

    @Override // androidx.lifecycle.f
    public final void g(androidx.lifecycle.p pVar) {
        p pVar2 = this.f10167v;
        hh.g.b(pVar2.f20105d, 0, new e(), 3);
        try {
            w.f29578a.getClass();
            qg.g d10 = w.d(pVar2);
            Context context = this.f10166u;
            i.g(context, "context");
            d10.f29546a.f20106e.c(new ah.e("APP_OPEN", false, new qg.e(d10, context, 1)));
        } catch (Exception e10) {
            pVar2.f20105d.a(1, e10, new f());
        }
    }
}
