package gj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.moe.pushlibrary.activities.MoEActivity;
import com.moengage.pushbase.push.PushMessageListener;
import f0.f0;
import fj.y;
import ih.p;
/* compiled from: RedirectionHandler.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final p f16554a;

    /* renamed from: b  reason: collision with root package name */
    public final PushMessageListener f16555b;

    /* renamed from: c  reason: collision with root package name */
    public final String f16556c;

    /* compiled from: RedirectionHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" handleNonDefaultClickAction() : Not a valid action", h.this.f16556c);
        }
    }

    /* compiled from: RedirectionHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ qj.h f16559v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(qj.h hVar) {
            super(0);
            this.f16559v = hVar;
        }

        @Override // ss.a
        public final String invoke() {
            return h.this.f16556c + " handleNonDefaultClickAction() : Action " + this.f16559v;
        }
    }

    /* compiled from: RedirectionHandler.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Uri f16561v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri) {
            super(0);
            this.f16561v = uri;
        }

        @Override // ss.a
        public final String invoke() {
            return h.this.f16556c + " handleNonDefaultClickAction() : Uri: " + this.f16561v;
        }
    }

    /* compiled from: RedirectionHandler.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" handleNonDefaultClickAction() : Web View Disabled", h.this.f16556c);
        }
    }

    /* compiled from: RedirectionHandler.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {
        public e() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" handleNonDefaultClickAction() : Not a valid action.", h.this.f16556c);
        }
    }

    /* compiled from: RedirectionHandler.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" handleNonDefaultClickAction() : synthesizing back-stack", h.this.f16556c);
        }
    }

    /* compiled from: RedirectionHandler.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {
        public g() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" handleNonDefaultClickAction() : ", h.this.f16556c);
        }
    }

    public h(p sdkInstance, PushMessageListener messageListener) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        kotlin.jvm.internal.i.g(messageListener, "messageListener");
        this.f16554a = sdkInstance;
        this.f16555b = messageListener;
        this.f16556c = "PushBase_6.6.0_RedirectionHandler";
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037 A[Catch: Exception -> 0x010d, TRY_LEAVE, TryCatch #0 {Exception -> 0x010d, blocks: (B:3:0x0003, B:5:0x0013, B:7:0x001b, B:14:0x0029, B:21:0x0037, B:24:0x0045, B:31:0x005a, B:34:0x0063, B:36:0x0072, B:54:0x00dc, B:56:0x00e2, B:57:0x00e5, B:37:0x007f, B:38:0x0088, B:41:0x0091, B:43:0x009f, B:44:0x00a7, B:45:0x00bb, B:48:0x00c4, B:49:0x00ce, B:58:0x0102), top: B:63:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Activity activity, Bundle bundle) {
        boolean z10;
        boolean z11;
        Intent intent;
        p pVar = this.f16554a;
        try {
            Context applicationContext = activity.getApplicationContext();
            qj.h hVar = (qj.h) bundle.getParcelable("moe_navAction");
            if (hVar != null) {
                String str = hVar.f29620v;
                Bundle bundle2 = hVar.f29622x;
                String str2 = hVar.f29621w;
                if (str != null && !gv.n.B0(str)) {
                    z10 = false;
                    if (!z10) {
                        if (str2 != null && !gv.n.B0(str2)) {
                            z11 = false;
                            if (z11) {
                                hh.g.b(pVar.f20105d, 0, new b(hVar), 3);
                                hh.g gVar = pVar.f20105d;
                                if (str != null) {
                                    int hashCode = str.hashCode();
                                    if (hashCode != -417556201) {
                                        if (hashCode != 628280070) {
                                            if (hashCode == 1778710939 && str.equals("richLanding")) {
                                                Context applicationContext2 = activity.getApplicationContext();
                                                kotlin.jvm.internal.i.f(applicationContext2, "activity.applicationContext");
                                                if (di.b.c(applicationContext2)) {
                                                    intent = new Intent(activity, MoEActivity.class);
                                                    intent.putExtra("gcm_webUrl", str2);
                                                    if (intent == null) {
                                                        return;
                                                    }
                                                    if (bundle2 != null && !bundle2.isEmpty()) {
                                                        intent.putExtras(bundle2);
                                                    }
                                                    pVar.f20103b.f12858d.f28417b.getClass();
                                                    hh.g.b(gVar, 0, new f(), 3);
                                                    f0 f0Var = new f0(applicationContext);
                                                    f0Var.e(intent);
                                                    f0Var.m();
                                                    return;
                                                }
                                                hh.g.b(gVar, 0, new d(), 3);
                                            }
                                        } else if (str.equals("deepLink")) {
                                            Uri.Builder uriBuilder = Uri.parse(di.b.h(str2)).buildUpon();
                                            if (bundle2 != null) {
                                                kotlin.jvm.internal.i.f(uriBuilder, "uriBuilder");
                                                y.b(uriBuilder, bundle2);
                                            }
                                            Uri build = uriBuilder.build();
                                            hh.g.b(gVar, 0, new c(build), 3);
                                            intent = new Intent("android.intent.action.VIEW", build);
                                            if (intent == null) {
                                            }
                                        }
                                    } else if (str.equals("screenName")) {
                                        intent = new Intent(applicationContext, Class.forName(str2));
                                        if (intent == null) {
                                        }
                                    }
                                    intent = null;
                                    if (intent == null) {
                                    }
                                }
                                hh.g.b(gVar, 0, new e(), 3);
                                intent = null;
                                if (intent == null) {
                                }
                            }
                        }
                        z11 = true;
                        if (z11) {
                        }
                    }
                }
                z10 = true;
                if (!z10) {
                }
            }
            hh.g.b(pVar.f20105d, 0, new a(), 3);
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new g());
        }
    }

    public final void b(Activity activity, Bundle bundle) {
        Uri build;
        if (bundle.containsKey("moe_webUrl")) {
            build = Uri.parse(di.b.h(bundle.getString("moe_webUrl")));
            kotlin.jvm.internal.i.f(build, "parse(\n                g…          )\n            )");
        } else {
            Uri.Builder builder = Uri.parse(bundle.getString("gcm_webUrl")).buildUpon();
            kotlin.jvm.internal.i.f(builder, "builder");
            y.b(builder, bundle);
            build = builder.build();
            kotlin.jvm.internal.i.f(build, "builder.build()");
        }
        bundle.remove("gcm_webNotification");
        bundle.remove("gcm_notificationType");
        hh.g.b(this.f16554a.f20105d, 0, new i(this, build), 3);
        Intent intent = new Intent("android.intent.action.VIEW", build);
        intent.putExtras(bundle);
        this.f16555b.getClass();
        intent.addFlags(805306368);
        activity.startActivity(intent);
    }
}
