package gj;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.moengage.pushbase.push.PushMessageListener;
import fj.y;
import ih.p;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ClickHandler.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final p f16551a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16552b = "PushBase_6.6.0_ClickHandler";

    /* compiled from: ClickHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" onClick() : ", g.this.f16552b);
        }
    }

    public g(p pVar) {
        this.f16551a = pVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.i.g(activity, "activity");
        hh.g.b(this.f16551a.f20105d, 0, new a(), 3);
        if (bundle.containsKey("moe_action")) {
            JSONArray e10 = y.e(bundle);
            gj.a aVar = new gj.a(this.f16551a);
            lj.a aVar2 = new lj.a();
            int length = e10.length();
            int i6 = 0;
            while (i6 < length) {
                int i10 = i6 + 1;
                JSONObject jSONObject = e10.getJSONObject(i6);
                kotlin.jvm.internal.i.f(jSONObject, "actions.getJSONObject(i)");
                qj.a a10 = aVar2.a(jSONObject);
                if (a10 != null) {
                    p pVar = aVar.f16518a;
                    String str = a10.f29610a;
                    try {
                        if (!gv.n.B0(str)) {
                            hh.g.b(pVar.f20105d, 0, new d(aVar, a10), 3);
                            switch (str.hashCode()) {
                                case -1349088399:
                                    if (str.equals("custom")) {
                                        Context applicationContext = activity.getApplicationContext();
                                        kotlin.jvm.internal.i.f(applicationContext, "activity.applicationContext");
                                        aVar.b(applicationContext, a10);
                                        break;
                                    } else {
                                        hh.g.b(pVar.f20105d, 0, new e(aVar), 3);
                                        break;
                                    }
                                case -897610266:
                                    if (str.equals("snooze")) {
                                        aVar.g(activity, a10);
                                        break;
                                    } else {
                                        hh.g.b(pVar.f20105d, 0, new e(aVar), 3);
                                        break;
                                    }
                                case -717304697:
                                    if (str.equals("remindLater")) {
                                        aVar.e(activity, a10);
                                        break;
                                    } else {
                                        hh.g.b(pVar.f20105d, 0, new e(aVar), 3);
                                        break;
                                    }
                                case 3045982:
                                    if (str.equals("call")) {
                                        aVar.a(activity, a10);
                                        break;
                                    } else {
                                        hh.g.b(pVar.f20105d, 0, new e(aVar), 3);
                                        break;
                                    }
                                case 3059573:
                                    if (str.equals("copy")) {
                                        Context applicationContext2 = activity.getApplicationContext();
                                        kotlin.jvm.internal.i.f(applicationContext2, "activity.applicationContext");
                                        if (!(a10 instanceof qj.c)) {
                                            hh.g.b(pVar.f20105d, 1, new b(aVar), 2);
                                            break;
                                        } else {
                                            hh.g.b(pVar.f20105d, 0, new c(aVar, a10), 3);
                                            String textToCopy = ((qj.c) a10).f29613c;
                                            kotlin.jvm.internal.i.g(textToCopy, "textToCopy");
                                            di.b.d(applicationContext2, textToCopy);
                                            di.b.x(applicationContext2, "");
                                            break;
                                        }
                                    } else {
                                        hh.g.b(pVar.f20105d, 0, new e(aVar), 3);
                                        break;
                                    }
                                case 109400031:
                                    if (str.equals("share")) {
                                        aVar.f(activity, a10);
                                        break;
                                    } else {
                                        hh.g.b(pVar.f20105d, 0, new e(aVar), 3);
                                        break;
                                    }
                                case 110621003:
                                    if (str.equals("track")) {
                                        Context applicationContext3 = activity.getApplicationContext();
                                        kotlin.jvm.internal.i.f(applicationContext3, "activity.applicationContext");
                                        aVar.h(applicationContext3, a10);
                                        break;
                                    } else {
                                        hh.g.b(pVar.f20105d, 0, new e(aVar), 3);
                                        break;
                                    }
                                case 1671672458:
                                    if (str.equals("dismiss")) {
                                        Context applicationContext4 = activity.getApplicationContext();
                                        kotlin.jvm.internal.i.f(applicationContext4, "activity.applicationContext");
                                        aVar.c(applicationContext4, a10);
                                        break;
                                    } else {
                                        hh.g.b(pVar.f20105d, 0, new e(aVar), 3);
                                        break;
                                    }
                                case 2102494577:
                                    if (str.equals("navigate")) {
                                        aVar.d(activity, a10);
                                        break;
                                    } else {
                                        hh.g.b(pVar.f20105d, 0, new e(aVar), 3);
                                        break;
                                    }
                                default:
                                    hh.g.b(pVar.f20105d, 0, new e(aVar), 3);
                                    break;
                            }
                        }
                    } catch (Exception e11) {
                        pVar.f20105d.a(1, e11, new f(aVar));
                    }
                }
                i6 = i10;
            }
            return;
        }
        bundle.putBoolean("moe_isDefaultAction", true);
        if (ej.b.f14047b == null) {
            synchronized (ej.b.class) {
                ej.b bVar = ej.b.f14047b;
                if (bVar == null) {
                    bVar = new ej.b();
                }
                ej.b.f14047b = bVar;
            }
        }
        ej.b.a(this.f16551a).f(activity, bundle);
    }

    public final void b(Activity activity) {
        Bundle extras;
        int i6;
        pj.b d10;
        pj.a aVar;
        boolean isTemplateSupported;
        kotlin.jvm.internal.i.g(activity, "activity");
        Intent intent = activity.getIntent();
        if (intent == null) {
            extras = null;
        } else {
            extras = intent.getExtras();
        }
        if (extras == null) {
            return;
        }
        if (ej.b.f14047b == null) {
            synchronized (ej.b.class) {
                ej.b bVar = ej.b.f14047b;
                if (bVar == null) {
                    bVar = new ej.b();
                }
                ej.b.f14047b = bVar;
            }
        }
        PushMessageListener a10 = ej.b.a(this.f16551a);
        Context applicationContext = activity.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext, "activity.applicationContext");
        p pVar = a10.f10242h;
        try {
            hh.g.b(pVar.f20105d, 0, new rj.a(a10), 3);
            i6 = extras.getInt("MOE_NOTIFICATION_ID", -1);
            d10 = new lj.h(pVar).d(extras);
            aVar = d10.f28532h;
            hh.g.b(pVar.f20105d, 0, new rj.b(a10, d10, i6), 3);
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new rj.c(a10));
        }
        if (aVar.f28521e) {
            nj.a aVar2 = nj.c.f26377a;
            nj.a aVar3 = nj.c.f26377a;
            if (aVar3 == null) {
                isTemplateSupported = false;
            } else {
                isTemplateSupported = aVar3.isTemplateSupported(applicationContext, d10, pVar);
            }
            if (isTemplateSupported) {
                Context applicationContext2 = activity.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext2, "activity.applicationContext");
                Intent intent2 = activity.getIntent();
                kotlin.jvm.internal.i.f(intent2, "activity.intent");
                p pVar2 = a10.f10242h;
                hh.g.b(pVar2.f20105d, 0, new rj.e(a10), 3);
                pVar2.f20106e.c(new ah.e("PUSH_BASE_LOG_NOTIFICATION_CLICK_TASK", false, new ni.c(3, a10, applicationContext2, intent2)));
                Context applicationContext3 = activity.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext3, "activity.applicationContext");
                y.d(applicationContext3, extras, this.f16551a);
            }
        }
        if (i6 != -1 && aVar.f) {
            Object systemService = applicationContext.getSystemService("notification");
            if (systemService != null) {
                ((NotificationManager) systemService).cancel(i6);
                nj.c.a(applicationContext, extras, pVar);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
        }
        Context applicationContext22 = activity.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext22, "activity.applicationContext");
        Intent intent22 = activity.getIntent();
        kotlin.jvm.internal.i.f(intent22, "activity.intent");
        p pVar22 = a10.f10242h;
        hh.g.b(pVar22.f20105d, 0, new rj.e(a10), 3);
        pVar22.f20106e.c(new ah.e("PUSH_BASE_LOG_NOTIFICATION_CLICK_TASK", false, new ni.c(3, a10, applicationContext22, intent22)));
        Context applicationContext32 = activity.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext32, "activity.applicationContext");
        y.d(applicationContext32, extras, this.f16551a);
    }

    public final void c(Context context, Bundle bundle) {
        boolean z10;
        if (bundle.containsKey("moe_inapp") || bundle.containsKey("moe_inapp_cid")) {
            p sdkInstance = this.f16551a;
            kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
            ch.a aVar = ch.c.f5286a;
            if (aVar != null) {
                th.a aVar2 = sdkInstance.f20104c;
                if (aVar2.f33011b.f25749u && aVar2.f33010a) {
                    z10 = true;
                    if (!z10 && aVar != null) {
                        aVar.a(context, bundle, sdkInstance);
                        return;
                    }
                }
            }
            z10 = false;
            if (!z10) {
            }
        }
    }
}
