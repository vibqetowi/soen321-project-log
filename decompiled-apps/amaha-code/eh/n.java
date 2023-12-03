package eh;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import hh.g;
import java.util.Set;
/* compiled from: GlobalActivityLifecycleObserver.kt */
/* loaded from: classes.dex */
public final class n implements Application.ActivityLifecycleCallbacks {

    /* compiled from: GlobalActivityLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f14016v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(0);
            this.f14016v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Core_GlobalActivityLifecycleObserver onActivityCreated(): ");
            n.this.getClass();
            sb2.append((Object) this.f14016v.getClass().getSimpleName());
            return sb2.toString();
        }
    }

    /* compiled from: GlobalActivityLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f14018v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(0);
            this.f14018v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Core_GlobalActivityLifecycleObserver onActivityDestroyed(): ");
            n.this.getClass();
            sb2.append((Object) this.f14018v.getClass().getSimpleName());
            return sb2.toString();
        }
    }

    /* compiled from: GlobalActivityLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f14020v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(0);
            this.f14020v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Core_GlobalActivityLifecycleObserver onActivityPaused(): ");
            n.this.getClass();
            sb2.append((Object) this.f14020v.getClass().getSimpleName());
            return sb2.toString();
        }
    }

    /* compiled from: GlobalActivityLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f14022v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity) {
            super(0);
            this.f14022v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Core_GlobalActivityLifecycleObserver onActivityResumed(): ");
            n.this.getClass();
            sb2.append((Object) this.f14022v.getClass().getSimpleName());
            return sb2.toString();
        }
    }

    /* compiled from: GlobalActivityLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f14024v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Activity activity) {
            super(0);
            this.f14024v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Core_GlobalActivityLifecycleObserver onActivitySaveInstanceState(): ");
            n.this.getClass();
            sb2.append((Object) this.f14024v.getClass().getSimpleName());
            return sb2.toString();
        }
    }

    /* compiled from: GlobalActivityLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f14026v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Activity activity) {
            super(0);
            this.f14026v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Core_GlobalActivityLifecycleObserver onActivityStarted(): ");
            n.this.getClass();
            sb2.append((Object) this.f14026v.getClass().getSimpleName());
            return sb2.toString();
        }
    }

    /* compiled from: GlobalActivityLifecycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f14028v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Activity activity) {
            super(0);
            this.f14028v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("Core_GlobalActivityLifecycleObserver onActivityStopped(): ");
            n.this.getClass();
            sb2.append((Object) this.f14028v.getClass().getSimpleName());
            return sb2.toString();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.g(activity, "activity");
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new a(activity), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new b(activity), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new c(activity), 3);
        Set<fh.a> set = o.f14029a;
        ch.a aVar2 = ch.c.f5286a;
        if (aVar2 != null) {
            aVar2.f(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new d(activity), 3);
        Set<fh.a> set = o.f14029a;
        ch.a aVar2 = ch.c.f5286a;
        if (aVar2 != null) {
            aVar2.d(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.i.g(activity, "activity");
        kotlin.jvm.internal.i.g(outState, "outState");
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new e(activity), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new f(activity), 3);
        Set<fh.a> set = o.f14029a;
        ch.a aVar2 = ch.c.f5286a;
        if (aVar2 != null) {
            aVar2.g(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        hh.a aVar = hh.g.f17610d;
        g.a.b(0, new g(activity), 3);
        Set<fh.a> set = o.f14029a;
        ch.a aVar2 = ch.c.f5286a;
        if (aVar2 != null) {
            aVar2.b(activity);
        }
    }
}
