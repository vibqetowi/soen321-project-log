package com.moengage.pushbase.push;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.moengage.core.exceptions.SdkNotInitializedException;
import com.moengage.pushbase.internal.MoEPushReceiver;
import com.moengage.pushbase.internal.MoEPushWorker;
import com.theinnerhour.b2b.utils.SessionManager;
import f0.f0;
import f0.o;
import f0.s;
import f0.t;
import fj.c;
import fj.n;
import fj.u;
import fj.v;
import fj.y;
import gj.h;
import gj.j;
import gj.l;
import gj.m;
import hh.g;
import ih.p;
import java.util.List;
import jj.d;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import org.json.JSONArray;
import org.json.JSONObject;
import qg.g0;
import qg.w;
import rj.f;
import tr.r;
/* compiled from: PushMessageListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/moengage/pushbase/push/PushMessageListener;", "", "<init>", "()V", "pushbase_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class PushMessageListener {

    /* renamed from: a  reason: collision with root package name */
    public final String f10236a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10237b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10238c;

    /* renamed from: d  reason: collision with root package name */
    public c f10239d;

    /* renamed from: e  reason: collision with root package name */
    public pj.b f10240e;
    public final Object f;

    /* renamed from: g  reason: collision with root package name */
    public final r f10241g;

    /* renamed from: h  reason: collision with root package name */
    public final p f10242h;

    /* renamed from: i  reason: collision with root package name */
    public final n f10243i;

    /* compiled from: PushMessageListener.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" onMessageReceived() : showMultipleNotification is disabled, cancelling notification update.", PushMessageListener.this.f10236a);
        }
    }

    /* compiled from: PushMessageListener.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" isNotificationRequired() : ", PushMessageListener.this.f10236a);
        }
    }

    public PushMessageListener(String appId) {
        p b10;
        i.g(appId, "appId");
        this.f10236a = "PushBase_6.6.0_PushMessageListener";
        this.f = new Object();
        this.f10241g = new r();
        if (appId.length() == 0) {
            b10 = g0.f29558c;
        } else {
            b10 = g0.b(appId);
        }
        if (b10 != null) {
            this.f10242h = b10;
            this.f10243i = new n(b10);
            di.b.a(b10);
            return;
        }
        throw new SdkNotInitializedException("Sdk not initialised for given instance");
    }

    public final t a(Context context, boolean z10, c cVar) {
        t e10;
        if (z10) {
            if (this.f10240e != null) {
                e10 = e();
            } else {
                i.q("notificationPayload");
                throw null;
            }
        } else if (this.f10240e != null) {
            i.g(context, "context");
            g.b(this.f10242h.f20105d, 0, new f(this), 3);
            e10 = e();
        } else {
            i.q("notificationPayload");
            throw null;
        }
        pj.b bVar = cVar.f15066c;
        long j10 = bVar.f28532h.f28522g;
        int i6 = cVar.f15067d;
        Context context2 = cVar.f15064a;
        if (j10 != -1) {
            g.b(cVar.f15065b.f20105d, 0, new fj.b(cVar), 3);
            Intent intent = new Intent(context2, MoEPushReceiver.class);
            intent.putExtra("MOE_ACTION_NOTIFICATION_AUTO_DISMISS", i6);
            intent.setAction("MOE_ACTION_NOTIFICATION_AUTO_DISMISS");
            PendingIntent k10 = di.b.k(context2, i6, intent);
            Object systemService = context2.getSystemService("alarm");
            if (systemService != null) {
                ((AlarmManager) systemService).set(0, bVar.f28532h.f28522g * 1000, k10);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
            }
        }
        Intent intent2 = new Intent(context2, MoEPushWorker.class);
        intent2.putExtras(bVar.f28533i);
        intent2.setAction("ACTION_NOTIFICATION_CLEARED");
        e10.D.deleteIntent = di.b.l(context2, i6 | 501, intent2);
        e10.f14662g = di.b.j(context2, i6, cVar.f15068e);
        return e10;
    }

    public final boolean b(Context context, lj.k kVar, boolean z10) {
        pj.b bVar = this.f10240e;
        if (bVar != null) {
            if (!bVar.f28532h.f28523h) {
                String j10 = kVar.j();
                if (j10 == null) {
                    j10 = "";
                }
                pj.b h10 = kVar.f24394a.h(j10);
                pj.b bVar2 = this.f10240e;
                if (bVar2 != null) {
                    if (!i.b(j10, bVar2.f28527b) && h10 != null) {
                        p pVar = this.f10242h;
                        g.b(pVar.f20105d, 0, new a(), 3);
                        Object systemService = context.getSystemService("notification");
                        if (systemService != null) {
                            ((NotificationManager) systemService).cancel(kVar.e());
                            nj.a aVar = nj.c.f26377a;
                            nj.c.a(context, h10.f28533i, pVar);
                            return true;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
                    }
                    return z10;
                }
                i.q("notificationPayload");
                throw null;
            }
            return z10;
        }
        i.q("notificationPayload");
        throw null;
    }

    public final boolean c(Context context, Bundle payload) {
        i.g(context, "context");
        i.g(payload, "payload");
        this.f10237b = true;
        g.b(this.f10242h.f20105d, 0, new b(), 3);
        pj.b bVar = this.f10240e;
        if (bVar != null) {
            this.f10241g.getClass();
            return true ^ i.b("gcm_silentNotification", bVar.f28526a);
        }
        i.q("notificationPayload");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:3:0x0012, B:6:0x0018, B:11:0x0024, B:16:0x002a, B:19:0x0032, B:21:0x003d, B:27:0x0049, B:28:0x0052, B:30:0x0067, B:31:0x007c, B:34:0x009e, B:7:0x0019, B:9:0x001d, B:10:0x0022), top: B:39:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:3:0x0012, B:6:0x0018, B:11:0x0024, B:16:0x002a, B:19:0x0032, B:21:0x003d, B:27:0x0049, B:28:0x0052, B:30:0x0067, B:31:0x007c, B:34:0x009e, B:7:0x0019, B:9:0x001d, B:10:0x0022), top: B:39:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(Context context, Bundle payload) {
        boolean z10;
        ej.b bVar;
        i.g(context, "context");
        i.g(payload, "payload");
        p sdkInstance = this.f10242h;
        i.g(sdkInstance, "sdkInstance");
        try {
            ej.b bVar2 = ej.b.f14047b;
            if (bVar2 == null) {
                synchronized (ej.b.class) {
                    bVar = ej.b.f14047b;
                    if (bVar == null) {
                        bVar = new ej.b();
                    }
                    ej.b.f14047b = bVar;
                }
                bVar2 = bVar;
            }
            if (bVar2.b(payload)) {
                String campaignId = payload.getString("gcm_campaign_id", "");
                if (campaignId != null && !gv.n.B0(campaignId)) {
                    z10 = false;
                    if (!z10) {
                        g.b(sdkInstance.f20105d, 0, u.f15110u, 3);
                        return;
                    }
                    ng.c cVar = new ng.c();
                    cVar.b();
                    i.f(campaignId, "campaignId");
                    if (gv.r.J0(campaignId, "DTSDK")) {
                        String substring = campaignId.substring(0, gv.r.O0(campaignId, "DTSDK", 0, false, 6));
                        i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        payload.putString("gcm_campaign_id", substring);
                    }
                    cVar.a(payload.getString("gcm_campaign_id"), "gcm_campaign_id");
                    fj.p.a(payload, cVar, sdkInstance);
                    String appId = (String) sdkInstance.f20102a.f5133c;
                    i.g(appId, "appId");
                    p b10 = g0.b(appId);
                    if (b10 != null) {
                        w.f29578a.getClass();
                        w.d(b10).c(context, "NOTIFICATION_RECEIVED_MOE", cVar);
                        return;
                    }
                    return;
                }
                z10 = true;
                if (!z10) {
                }
            }
        } catch (Throwable th2) {
            sdkInstance.f20105d.a(1, th2, v.f15111u);
        }
    }

    public final t e() {
        Intent g5;
        List<jj.a> list;
        g.b(this.f10242h.f20105d, 0, new rj.g(this), 3);
        this.f10238c = true;
        c cVar = this.f10239d;
        Bitmap bitmap = null;
        if (cVar != null) {
            pj.b bVar = cVar.f15066c;
            String str = bVar.f28530e;
            Context context = cVar.f15064a;
            if (!y.h(context, str)) {
                bVar.f28530e = "moe_default_channel";
            }
            t tVar = new t(context, bVar.f28530e);
            d dVar = cVar.f15069g;
            tVar.e(dVar.f22071a);
            CharSequence charSequence = dVar.f22072b;
            tVar.d(charSequence);
            CharSequence charSequence2 = dVar.f22073c;
            if (!gv.n.B0(charSequence2)) {
                tVar.k(charSequence2);
            }
            p pVar = cVar.f15065b;
            dh.a aVar = pVar.f20103b;
            int i6 = aVar.f12858d.f28417b.f28414a;
            if (i6 != -1) {
                tVar.D.icon = i6;
            }
            pj.a aVar2 = bVar.f28532h;
            if (!gv.n.B0(aVar2.f28524i)) {
                bitmap = di.b.e(aVar2.f28524i);
            } else if (aVar.f12858d.f28417b.f28415b != -1) {
                bitmap = BitmapFactory.decodeResource(context.getResources(), aVar.f12858d.f28417b.f28415b, null);
            }
            if (bitmap != null) {
                tVar.h(bitmap);
            }
            aVar.f12858d.f28417b.getClass();
            s sVar = new s();
            sVar.f14682b = t.c(dVar.f22071a);
            sVar.j(charSequence);
            if (!gv.n.B0(charSequence2)) {
                sVar.f14683c = t.c(charSequence2);
                sVar.f14684d = true;
            }
            tVar.j(sVar);
            List<jj.a> list2 = bVar.f28531g;
            if (!list2.isEmpty()) {
                try {
                    int size = list2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        int i11 = i10 + 1;
                        jj.a aVar3 = list2.get(i10);
                        JSONObject jSONObject = aVar3.f22065c;
                        if (jSONObject == null) {
                            list = list2;
                        } else {
                            boolean b10 = i.b("remindLater", jSONObject.getString(SessionManager.KEY_NAME));
                            Bundle bundle = bVar.f28533i;
                            int i12 = cVar.f15067d;
                            if (b10) {
                                g5 = y.f(context, bundle, i12);
                            } else {
                                g5 = y.g(context, bundle, i12);
                            }
                            g5.putExtra("moe_action_id", aVar3.f22064b);
                            JSONObject jSONObject2 = aVar3.f22065c;
                            i.f(jSONObject2, "actionButton.action");
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(jSONObject2);
                            JSONObject jSONObject3 = new JSONObject();
                            list = list2;
                            jSONObject3.put("actions", jSONArray);
                            g5.putExtra("moe_action", jSONObject3.toString());
                            tVar.f14658b.add(new o(0, aVar3.f22063a, di.b.j(context, i10 + 1000 + i12, g5)));
                        }
                        i10 = i11;
                        list2 = list;
                    }
                } catch (Throwable th2) {
                    pVar.f20105d.a(1, th2, new fj.a(cVar));
                }
            }
            return tVar;
        }
        i.q("notificationBuilder");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: Exception -> 0x00c1, TryCatch #0 {Exception -> 0x00c1, blocks: (B:3:0x0029, B:5:0x0031, B:6:0x0036, B:8:0x0046, B:14:0x0052, B:15:0x0057, B:17:0x005f, B:18:0x006b, B:20:0x0075, B:26:0x0081, B:30:0x008f), top: B:37:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[Catch: Exception -> 0x00c1, TryCatch #0 {Exception -> 0x00c1, blocks: (B:3:0x0029, B:5:0x0031, B:6:0x0036, B:8:0x0046, B:14:0x0052, B:15:0x0057, B:17:0x005f, B:18:0x006b, B:20:0x0075, B:26:0x0081, B:30:0x008f), top: B:37:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[Catch: Exception -> 0x00c1, TryCatch #0 {Exception -> 0x00c1, blocks: (B:3:0x0029, B:5:0x0031, B:6:0x0036, B:8:0x0046, B:14:0x0052, B:15:0x0057, B:17:0x005f, B:18:0x006b, B:20:0x0075, B:26:0x0081, B:30:0x008f), top: B:37:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f A[Catch: Exception -> 0x00c1, TRY_LEAVE, TryCatch #0 {Exception -> 0x00c1, blocks: (B:3:0x0029, B:5:0x0031, B:6:0x0036, B:8:0x0046, B:14:0x0052, B:15:0x0057, B:17:0x005f, B:18:0x006b, B:20:0x0075, B:26:0x0081, B:30:0x008f), top: B:37:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Activity activity, Bundle bundle) {
        boolean z10;
        boolean z11;
        Intent intent;
        i.g(activity, "activity");
        h hVar = new h(this.f10242h, this);
        p pVar = hVar.f16554a;
        g gVar = pVar.f20105d;
        g gVar2 = pVar.f20105d;
        g.b(gVar, 0, new j(hVar), 3);
        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
        try {
            if (!bundle.getBoolean("moe_isDefaultAction", true)) {
                hVar.a(activity, bundle);
                return;
            }
            g.b(gVar2, 0, new gj.k(hVar), 3);
            String string = bundle.getString("gcm_notificationType");
            if (string != null && !gv.n.B0(string)) {
                z10 = false;
                if (!z10) {
                    activity.startActivity(launchIntentForPackage);
                    return;
                } else if (i.b("gcm_webNotification", string)) {
                    g.b(gVar2, 0, new l(hVar), 3);
                    hVar.b(activity, bundle);
                    return;
                } else {
                    String string2 = bundle.getString("gcm_activityName", "");
                    if (string2 != null && !gv.n.B0(string2)) {
                        z11 = false;
                        if (z11) {
                            intent = new Intent(activity, Class.forName(string2));
                        } else {
                            intent = launchIntentForPackage;
                        }
                        if (intent == null) {
                            bundle.putBoolean("FROM_BACKGROUND", !hc.d.A);
                            intent.putExtras(bundle);
                            hVar.f16555b.getClass();
                            intent.addFlags(805306368);
                            pVar.f20103b.f12858d.f28417b.getClass();
                            g.b(gVar2, 0, new m(hVar), 3);
                            f0 f0Var = new f0(activity);
                            f0Var.e(intent);
                            f0Var.m();
                            return;
                        }
                        return;
                    }
                    z11 = true;
                    if (z11) {
                    }
                    if (intent == null) {
                    }
                }
            }
            z10 = true;
            if (!z10) {
            }
        } catch (Exception e10) {
            gVar2.a(1, e10, new gj.n(hVar));
            if (launchIntentForPackage != null) {
                activity.startActivity(launchIntentForPackage);
            }
        }
    }

    public PushMessageListener() {
        this("");
    }
}
