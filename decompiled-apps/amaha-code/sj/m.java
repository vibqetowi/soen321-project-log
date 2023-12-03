package sj;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import org.json.JSONObject;
/* compiled from: IntentActionHandler.kt */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f31617a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31618b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f31619c;

    /* renamed from: d  reason: collision with root package name */
    public final String f31620d;

    public m(Context context, Bundle bundle, String str) {
        kotlin.jvm.internal.i.g(context, "context");
        this.f31617a = context;
        this.f31618b = str;
        this.f31619c = bundle;
        this.f31620d = "RichPush_4.3.2_IntentActionHandler";
    }

    public static Bundle a(Context context, ih.p pVar, String str) {
        if (str == null) {
            return null;
        }
        if (fj.e.f15075b == null) {
            synchronized (fj.e.class) {
                fj.e eVar = fj.e.f15075b;
                if (eVar == null) {
                    eVar = new fj.e();
                }
                fj.e.f15075b = eVar;
            }
        }
        kotlin.jvm.internal.i.g(context, "context");
        fj.d.f15071a.getClass();
        return fj.d.b(context, pVar).g(str);
    }

    public final void b(Context context, Bundle bundle, ih.p pVar) {
        fj.e eVar;
        hh.g.b(pVar.f20105d, 0, new l(this), 3);
        String string = bundle.getString("displayName");
        if (string == null) {
            return;
        }
        int i6 = bundle.getInt("MOE_NOTIFICATION_ID");
        Bundle a10 = a(context, pVar, bundle.getString("gcm_campaign_id"));
        if (a10 == null) {
            return;
        }
        q.a(context, bundle, pVar);
        hh.g.b(pVar.f20105d, 0, new g(this, i6, string), 3);
        if (Build.VERSION.SDK_INT == 24) {
            Object systemService = context.getSystemService("notification");
            if (systemService != null) {
                ((NotificationManager) systemService).cancel(i6);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templateName", string);
        jSONObject.put("cardId", -1);
        jSONObject.put("widgetId", -1);
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject2, "templateTrackingMetaToJson(meta).toString()");
        a10.putString("moe_template_meta", jSONObject2);
        a10.putInt("MOE_NOTIFICATION_ID", i6);
        fj.e eVar2 = fj.e.f15075b;
        if (eVar2 == null) {
            synchronized (fj.e.class) {
                eVar = fj.e.f15075b;
                if (eVar == null) {
                    eVar = new fj.e();
                }
                fj.e.f15075b = eVar;
            }
            eVar2 = eVar;
        }
        hh.g.b(pVar.f20105d, 0, new fj.f(eVar2), 3);
        fj.y.d(context, a10, pVar);
    }
}
