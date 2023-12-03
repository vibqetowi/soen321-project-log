package gj;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.moengage.pushbase.activities.PushClickDialogTracker;
import com.moengage.pushbase.internal.MoEPushReceiver;
import com.moengage.pushbase.internal.fragments.LaterDialogFragment;
import com.moengage.pushbase.push.PushMessageListener;
import java.util.Calendar;
import qg.g0;
import qg.w;
/* compiled from: ActionHandler.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f16518a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16519b;

    /* compiled from: ActionHandler.kt */
    /* renamed from: gj.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0250a extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0250a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" callAction() : Not a call action.", a.this.f16519b);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ qj.a f16522v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qj.a aVar) {
            super(0);
            this.f16522v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f16519b + " callAction() : Action: " + this.f16522v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" callAction() : Not a valid phone number", a.this.f16519b);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" customAction() : Not a custom action", a.this.f16519b);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ qj.a f16526v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(qj.a aVar) {
            super(0);
            this.f16526v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f16519b + " customAction() : Action: " + this.f16526v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" dismissAction() : Not a dismiss action", a.this.f16519b);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {
        public g() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" navigationAction() : Not a navigation action", a.this.f16519b);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ qj.a f16530v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(qj.a aVar) {
            super(0);
            this.f16530v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f16519b + " navigationAction() : Navigation action " + this.f16530v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {
        public i() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" remindLaterAction() : Not a remind later action", a.this.f16519b);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ qj.a f16533v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(qj.a aVar) {
            super(0);
            this.f16533v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f16519b + " remindLaterAction() : Remind Later action: " + this.f16533v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<String> {
        public k() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" shareAction() : Not a share action.", a.this.f16519b);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ qj.a f16536v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(qj.a aVar) {
            super(0);
            this.f16536v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f16519b + " shareAction() : Action: " + this.f16536v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.a<String> {
        public m() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" snoozeAction() : Not a snooze action.", a.this.f16519b);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class n extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ qj.a f16539v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(qj.a aVar) {
            super(0);
            this.f16539v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f16519b + " snoozeAction() : Action: " + this.f16539v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class o extends kotlin.jvm.internal.k implements ss.a<String> {
        public o() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackAction() : Not a track action.", a.this.f16519b);
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class p extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ qj.a f16542v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(qj.a aVar) {
            super(0);
            this.f16542v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f16519b + " trackAction() : Action: " + this.f16542v;
        }
    }

    /* compiled from: ActionHandler.kt */
    /* loaded from: classes.dex */
    public static final class q extends kotlin.jvm.internal.k implements ss.a<String> {
        public q() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" trackAction() : Not a valid track type.", a.this.f16519b);
        }
    }

    public a(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f16518a = sdkInstance;
        this.f16519b = "PushBase_6.6.0_ActionHandler";
    }

    public final void a(Activity activity, qj.a aVar) {
        boolean z10 = aVar instanceof qj.b;
        ih.p pVar = this.f16518a;
        if (!z10) {
            hh.g.b(pVar.f20105d, 1, new C0250a(), 2);
            return;
        }
        hh.g.b(pVar.f20105d, 0, new b(aVar), 3);
        String str = ((qj.b) aVar).f29612c;
        if (gv.n.B0(str)) {
            return;
        }
        if (!df.b.u(str)) {
            hh.g.b(pVar.f20105d, 1, new c(), 2);
            return;
        }
        df.b.B(activity, str);
    }

    public final void b(Context context, qj.a aVar) {
        if (!(aVar instanceof qj.e)) {
            hh.g.b(this.f16518a.f20105d, 1, new d(), 2);
            return;
        }
        hh.g.b(this.f16518a.f20105d, 0, new e(aVar), 3);
        if (ej.b.f14047b == null) {
            synchronized (ej.b.class) {
                ej.b bVar = ej.b.f14047b;
                if (bVar == null) {
                    bVar = new ej.b();
                }
                ej.b.f14047b = bVar;
            }
        }
        PushMessageListener a10 = ej.b.a(this.f16518a);
        String payload = ((qj.e) aVar).f29615c;
        kotlin.jvm.internal.i.g(payload, "payload");
        hh.g.b(a10.f10242h.f20105d, 0, new rj.d(a10, payload), 3);
    }

    public final void c(Context context, qj.a aVar) {
        if (!(aVar instanceof qj.f)) {
            hh.g.b(this.f16518a.f20105d, 1, new f(), 2);
            return;
        }
        ((qj.f) aVar).getClass();
        Object systemService = context.getSystemService("notification");
        if (systemService != null) {
            ((NotificationManager) systemService).cancel(0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    public final void d(Activity activity, qj.a aVar) {
        if (!(aVar instanceof qj.g)) {
            hh.g.b(this.f16518a.f20105d, 1, new g(), 2);
            return;
        }
        hh.g.b(this.f16518a.f20105d, 0, new h(aVar), 3);
        Bundle bundle = new Bundle();
        String str = aVar.f29610a;
        qj.g gVar = (qj.g) aVar;
        bundle.putParcelable("moe_navAction", new qj.h(gVar.f29618e, str, gVar.f29616c, gVar.f29617d));
        bundle.putBoolean("moe_isDefaultAction", false);
        if (ej.b.f14047b == null) {
            synchronized (ej.b.class) {
                ej.b bVar = ej.b.f14047b;
                if (bVar == null) {
                    bVar = new ej.b();
                }
                ej.b.f14047b = bVar;
            }
        }
        ej.b.a(this.f16518a).f(activity, bundle);
    }

    public final void e(Activity activity, qj.a aVar) {
        Bundle extras;
        boolean z10 = aVar instanceof qj.i;
        ih.p pVar = this.f16518a;
        if (!z10) {
            hh.g.b(pVar.f20105d, 1, new i(), 2);
            return;
        }
        hh.g.b(pVar.f20105d, 0, new j(aVar), 3);
        Intent intent = activity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        extras.putString("remindLater", aVar.f29611b.toString());
        LaterDialogFragment laterDialogFragment = new LaterDialogFragment();
        laterDialogFragment.setItemSelected((PushClickDialogTracker) activity);
        laterDialogFragment.setArguments(extras);
        laterDialogFragment.show(((androidx.fragment.app.p) activity).getSupportFragmentManager(), "laterDialog");
    }

    public final void f(Activity activity, qj.a aVar) {
        boolean z10 = aVar instanceof qj.j;
        ih.p pVar = this.f16518a;
        if (!z10) {
            hh.g.b(pVar.f20105d, 1, new k(), 2);
            return;
        }
        hh.g.b(pVar.f20105d, 0, new l(aVar), 3);
        df.b.C(activity, ((qj.j) aVar).f29625c);
    }

    public final void g(Activity activity, qj.a aVar) {
        Bundle extras;
        boolean z10 = aVar instanceof qj.k;
        ih.p pVar = this.f16518a;
        if (!z10) {
            hh.g.b(pVar.f20105d, 1, new m(), 2);
            return;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return;
        }
        extras.putBoolean("moe_re_notify", true);
        extras.putString("moe_n_r_s", "moe_source_r_l_s");
        hh.g.b(pVar.f20105d, 0, new n(aVar), 3);
        Context applicationContext = activity.getApplicationContext();
        int i6 = ((qj.k) aVar).f29626c;
        if (i6 >= 0 && i6 <= 25) {
            Intent intent2 = new Intent(applicationContext, MoEPushReceiver.class);
            Bundle b10 = di.n.b(extras);
            b10.remove("moe_action_id");
            b10.remove("moe_action");
            intent2.putExtras(b10);
            intent2.setAction("MOE_ACTION_SHOW_NOTIFICATION");
            Context applicationContext2 = activity.getApplicationContext();
            kotlin.jvm.internal.i.f(applicationContext2, "activity.applicationContext");
            PendingIntent k10 = di.b.k(applicationContext2, (int) System.currentTimeMillis(), intent2);
            Calendar calendar = Calendar.getInstance();
            calendar.add(11, i6);
            Object systemService = applicationContext.getSystemService("alarm");
            if (systemService != null) {
                ((AlarmManager) systemService).set(0, calendar.getTimeInMillis(), k10);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
        }
    }

    public final void h(Context context, qj.a aVar) {
        boolean z10 = aVar instanceof qj.l;
        boolean z11 = true;
        ih.p pVar = this.f16518a;
        if (!z10) {
            hh.g.b(pVar.f20105d, 1, new o(), 2);
            return;
        }
        hh.g.b(pVar.f20105d, 0, new p(aVar), 3);
        qj.l lVar = (qj.l) aVar;
        String str = lVar.f29627c;
        if (!gv.n.B0(str)) {
            String eventName = lVar.f29629e;
            if (!gv.n.B0(eventName)) {
                boolean b10 = kotlin.jvm.internal.i.b(str, "event");
                c9.d dVar = pVar.f20102a;
                String str2 = lVar.f29628d;
                if (b10) {
                    ng.c cVar = new ng.c();
                    if (str2 != null && !gv.n.B0(str2)) {
                        z11 = false;
                    }
                    if (!z11) {
                        cVar.a(str2, "valueOf");
                    }
                    String appId = (String) dVar.f5133c;
                    kotlin.jvm.internal.i.g(eventName, "eventName");
                    kotlin.jvm.internal.i.g(appId, "appId");
                    ih.p b11 = g0.b(appId);
                    if (b11 != null) {
                        w.f29578a.getClass();
                        w.d(b11).c(context, eventName, cVar);
                    }
                } else if (kotlin.jvm.internal.i.b(str, "userAttribute")) {
                    if (str2 == null) {
                        return;
                    }
                    og.b.c(context, eventName, str2, (String) dVar.f5133c);
                } else {
                    hh.g.b(pVar.f20105d, 0, new q(), 3);
                }
            }
        }
    }
}
