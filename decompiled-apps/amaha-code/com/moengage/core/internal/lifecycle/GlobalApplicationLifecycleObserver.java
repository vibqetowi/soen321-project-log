package com.moengage.core.internal.lifecycle;

import android.content.Context;
import androidx.lifecycle.p;
import eh.o;
import hh.g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: GlobalApplicationLifecycleObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/moengage/core/internal/lifecycle/GlobalApplicationLifecycleObserver;", "", "core_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class GlobalApplicationLifecycleObserver implements androidx.lifecycle.f {

    /* renamed from: u  reason: collision with root package name */
    public final Context f10177u;

    /* renamed from: v  reason: collision with root package name */
    public final String f10178v = "Core_GlobalApplicationLifecycleHandler";

    /* compiled from: GlobalApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onCreate() : ", GlobalApplicationLifecycleObserver.this.f10178v);
        }
    }

    /* compiled from: GlobalApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onDestroy() : ", GlobalApplicationLifecycleObserver.this.f10178v);
        }
    }

    /* compiled from: GlobalApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class c extends k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onPause() : ", GlobalApplicationLifecycleObserver.this.f10178v);
        }
    }

    /* compiled from: GlobalApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class d extends k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onResume() : ", GlobalApplicationLifecycleObserver.this.f10178v);
        }
    }

    /* compiled from: GlobalApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class e extends k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onStart() : ", GlobalApplicationLifecycleObserver.this.f10178v);
        }
    }

    /* compiled from: GlobalApplicationLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class f extends k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onStop() : ", GlobalApplicationLifecycleObserver.this.f10178v);
        }
    }

    public GlobalApplicationLifecycleObserver(Context context) {
        this.f10177u = context;
    }

    @Override // androidx.lifecycle.f
    public final void a(p pVar) {
        hh.a aVar = g.f17610d;
        g.a.b(5, new d(), 2);
    }

    @Override // androidx.lifecycle.f
    public final void b(p pVar) {
        hh.a aVar = g.f17610d;
        g.a.b(5, new a(), 2);
    }

    @Override // androidx.lifecycle.f
    public final void d(p pVar) {
        hh.a aVar = g.f17610d;
        g.a.b(5, new c(), 2);
    }

    @Override // androidx.lifecycle.f
    public final void e(p pVar) {
        try {
            Set<fh.a> set = o.f14029a;
            o.b(this.f10177u);
        } catch (Exception e10) {
            hh.a aVar = g.f17610d;
            g.a.a(1, e10, new f());
        }
    }

    @Override // androidx.lifecycle.f
    public final void f(p pVar) {
        hh.a aVar = g.f17610d;
        g.a.b(5, new b(), 2);
    }

    @Override // androidx.lifecycle.f
    public final void g(p pVar) {
        try {
            Set<fh.a> set = o.f14029a;
            o.c(this.f10177u);
        } catch (Exception e10) {
            hh.a aVar = g.f17610d;
            g.a.a(1, e10, new e());
        }
    }
}
