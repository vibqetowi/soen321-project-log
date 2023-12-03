package eh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashSet;
import java.util.LinkedHashSet;
import qg.g0;
import qg.w;
import s1.s;
/* compiled from: ActivityLifecycleHandler.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f13992a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13993b;

    /* renamed from: c  reason: collision with root package name */
    public int f13994c;

    /* compiled from: ActivityLifecycleHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f13996v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(0);
            this.f13996v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            return d.this.f13993b + " onStart() :  Activity Start: " + ((Object) this.f13996v.getClass().getName());
        }
    }

    /* compiled from: ActivityLifecycleHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" onStart() : ", d.this.f13993b);
        }
    }

    /* compiled from: ActivityLifecycleHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            d dVar = d.this;
            sb2.append(dVar.f13993b);
            sb2.append(" onStop() : Activity Counter: ");
            sb2.append(dVar.f13994c);
            return sb2.toString();
        }
    }

    /* compiled from: ActivityLifecycleHandler.kt */
    /* renamed from: eh.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0219d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f14000v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0219d(Activity activity) {
            super(0);
            this.f14000v = activity;
        }

        @Override // ss.a
        public final String invoke() {
            return d.this.f13993b + " onStop() : Activity Stopped: " + ((Object) this.f14000v.getClass().getName());
        }
    }

    /* compiled from: ActivityLifecycleHandler.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" onStop() : ", d.this.f13993b);
        }
    }

    public d(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f13992a = sdkInstance;
        this.f13993b = "Core_ActivityLifecycleHandler";
    }

    public static void c(Context context, ih.p pVar, String screenName) {
        boolean z10;
        w wVar = w.f29578a;
        wVar.getClass();
        HashSet hashSet = w.c(pVar).f572a;
        if (hashSet.contains(screenName)) {
            return;
        }
        LinkedHashSet optedOutScreenNames = pVar.f20103b.f.f28424d;
        kotlin.jvm.internal.i.g(screenName, "screenName");
        kotlin.jvm.internal.i.g(optedOutScreenNames, "optedOutScreenNames");
        if (optedOutScreenNames.isEmpty() || !optedOutScreenNames.contains(screenName)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ng.c cVar = new ng.c();
            cVar.a(screenName, "ACTIVITY_NAME");
            String appId = (String) pVar.f20102a.f5133c;
            kotlin.jvm.internal.i.g(appId, "appId");
            ih.p b10 = g0.b(appId);
            if (b10 != null) {
                wVar.getClass();
                w.d(b10).c(context, "EVENT_ACTION_ACTIVITY_START", cVar);
            }
            hashSet.add(screenName);
        }
    }

    public final void a(Activity activity) {
        Uri data;
        Bundle extras;
        ih.p pVar = this.f13992a;
        kotlin.jvm.internal.i.g(activity, "activity");
        try {
            th.a aVar = pVar.f20104c;
            hh.g gVar = pVar.f20105d;
            if (!aVar.f33010a) {
                return;
            }
            this.f13994c++;
            hh.g.b(gVar, 0, new a(activity), 3);
            String name = activity.getClass().getName();
            Intent intent = activity.getIntent();
            Bundle bundle = null;
            if (intent == null) {
                data = null;
            } else {
                data = intent.getData();
            }
            Intent intent2 = activity.getIntent();
            if (intent2 == null) {
                extras = null;
            } else {
                extras = intent2.getExtras();
            }
            pVar.f20106e.c(new ah.e("START_ACTIVITY", false, new androidx.emoji2.text.g(26, this, activity, new s(name, data, extras))));
            String str = this.f13993b;
            Intent intent3 = activity.getIntent();
            if (intent3 != null) {
                bundle = intent3.getExtras();
            }
            di.b.w(gVar, str, bundle);
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new b());
        }
    }

    public final void b(Activity activity) {
        ih.p pVar = this.f13992a;
        kotlin.jvm.internal.i.g(activity, "activity");
        try {
            th.a aVar = pVar.f20104c;
            hh.g gVar = pVar.f20105d;
            if (!aVar.f33010a) {
                return;
            }
            this.f13994c--;
            hh.g.b(gVar, 0, new c(), 3);
            hh.g.b(gVar, 0, new C0219d(activity), 3);
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new e());
        }
    }
}
