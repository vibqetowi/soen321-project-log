package eh;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import qg.y;
/* compiled from: ActivityLifeCycleObserver.kt */
/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: u  reason: collision with root package name */
    public final ih.p f13970u;

    /* renamed from: v  reason: collision with root package name */
    public final eh.d f13971v;

    /* renamed from: w  reason: collision with root package name */
    public final String f13972w;

    /* compiled from: ActivityLifeCycleObserver.kt */
    /* renamed from: eh.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0218a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f13974v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0218a(Activity activity) {
            super(0);
            this.f13974v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f13972w + " onActivityCreated() : " + ((Object) this.f13974v.getClass().getSimpleName());
        }
    }

    /* compiled from: ActivityLifeCycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f13976v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity) {
            super(0);
            this.f13976v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f13972w + " onActivityDestroyed() : " + ((Object) this.f13976v.getClass().getSimpleName());
        }
    }

    /* compiled from: ActivityLifeCycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f13978v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity) {
            super(0);
            this.f13978v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f13972w + " onActivityPaused() : " + ((Object) this.f13978v.getClass().getSimpleName());
        }
    }

    /* compiled from: ActivityLifeCycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f13980v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Activity activity) {
            super(0);
            this.f13980v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f13972w + " onActivityResumed() : " + ((Object) this.f13980v.getClass().getSimpleName());
        }
    }

    /* compiled from: ActivityLifeCycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" onActivityResumed() : ", a.this.f13972w);
        }
    }

    /* compiled from: ActivityLifeCycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f13983v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Activity activity) {
            super(0);
            this.f13983v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f13972w + " onActivitySaveInstanceState() : " + ((Object) this.f13983v.getClass().getSimpleName());
        }
    }

    /* compiled from: ActivityLifeCycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f13985v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Activity activity) {
            super(0);
            this.f13985v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f13972w + " onActivityStarted() : " + ((Object) this.f13985v.getClass().getSimpleName());
        }
    }

    /* compiled from: ActivityLifeCycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {
        public h() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" onActivityStarted() : ", a.this.f13972w);
        }
    }

    /* compiled from: ActivityLifeCycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f13988v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Activity activity) {
            super(0);
            this.f13988v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f13972w + " onActivityStopped() : " + ((Object) this.f13988v.getClass().getSimpleName());
        }
    }

    /* compiled from: ActivityLifeCycleObserver.kt */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<String> {
        public j() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" onActivityStopped() : ", a.this.f13972w);
        }
    }

    public a(ih.p sdkInstance, eh.d activityLifecycleHandler) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        kotlin.jvm.internal.i.g(activityLifecycleHandler, "activityLifecycleHandler");
        this.f13970u = sdkInstance;
        this.f13971v = activityLifecycleHandler;
        this.f13972w = "Core_ActivityLifeCycleObserver";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.g(activity, "activity");
        hh.g.b(this.f13970u.f20105d, 0, new C0218a(activity), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        hh.g.b(this.f13970u.f20105d, 0, new b(activity), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        hh.g.b(this.f13970u.f20105d, 0, new c(activity), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ih.p pVar = this.f13970u;
        kotlin.jvm.internal.i.g(activity, "activity");
        try {
            hh.g.b(pVar.f20105d, 0, new d(activity), 3);
            eh.d dVar = this.f13971v;
            ih.p pVar2 = dVar.f13992a;
            try {
                if (pVar2.f20104c.f33010a) {
                    hh.g.b(pVar2.f20105d, 0, new eh.b(dVar), 3);
                    y.b(activity, pVar2);
                }
            } catch (Exception e10) {
                pVar2.f20105d.a(1, e10, new eh.c(dVar));
            }
        } catch (Exception e11) {
            pVar.f20105d.a(1, e11, new e());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.i.g(activity, "activity");
        kotlin.jvm.internal.i.g(outState, "outState");
        hh.g.b(this.f13970u.f20105d, 0, new f(activity), 3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ih.p pVar = this.f13970u;
        kotlin.jvm.internal.i.g(activity, "activity");
        try {
            hh.g.b(pVar.f20105d, 0, new g(activity), 3);
            this.f13971v.a(activity);
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new h());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ih.p pVar = this.f13970u;
        kotlin.jvm.internal.i.g(activity, "activity");
        try {
            hh.g.b(pVar.f20105d, 0, new i(activity), 3);
            this.f13971v.b(activity);
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new j());
        }
    }
}
