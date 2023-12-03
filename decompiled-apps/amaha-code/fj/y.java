package fj;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import com.moengage.pushbase.activities.PushClickDialogTracker;
import com.moengage.pushbase.activities.PushTracker;
import hh.g;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class y {

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f15114u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_Utils addPayloadToUri() : ";
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f15115u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_Utils convertBundleToJsonString() : ";
        }
    }

    /* compiled from: Utils.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f15116u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_Utils getActionsFromBundle() : ";
        }
    }

    public static final void a(Context context, Bundle pushPayload, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        hh.g gVar = sdkInstance.f20105d;
        kotlin.jvm.internal.i.g(pushPayload, "pushPayload");
        try {
            pj.b d10 = new lj.h(sdkInstance).d(pushPayload);
            if (d10.f28532h.f28518b) {
                hh.g.b(gVar, 0, w.f15112u, 3);
                return;
            }
            d.f15071a.getClass();
            d.b(context, sdkInstance).f24394a.l(d10);
        } catch (Throwable th2) {
            gVar.a(1, th2, x.f15113u);
        }
    }

    public static final void b(Uri.Builder builder, Bundle bundle) {
        try {
            if (bundle.isEmpty()) {
                return;
            }
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null) {
                    builder.appendQueryParameter(str, obj.toString());
                }
            }
        } catch (Throwable th2) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, th2, a.f15114u);
        }
    }

    public static final String c(Bundle newBundle) {
        kotlin.jvm.internal.i.g(newBundle, "newBundle");
        Set<String> keySet = newBundle.keySet();
        JSONObject jSONObject = new JSONObject();
        for (String str : keySet) {
            try {
                jSONObject.put(str, newBundle.get(str));
            } catch (Throwable th2) {
                hh.a aVar = hh.g.f17610d;
                g.a.a(1, th2, b.f15115u);
            }
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }

    public static final void d(Context context, Bundle payload, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        kotlin.jvm.internal.i.g(payload, "payload");
        try {
            sdkInstance.f20106e.b(new ni.c(1, context, sdkInstance, payload));
        } catch (Throwable th2) {
            sdkInstance.f20105d.a(1, th2, a0.f15061u);
        }
    }

    public static final JSONArray e(Bundle bundle) {
        kotlin.jvm.internal.i.g(bundle, "bundle");
        try {
            String string = bundle.getString("moe_action", null);
            if (string == null) {
                return new JSONArray();
            }
            JSONArray jSONArray = new JSONObject(string).getJSONArray("actions");
            kotlin.jvm.internal.i.f(jSONArray, "action.getJSONArray(ACTIONS)");
            return jSONArray;
        } catch (Throwable th2) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, th2, c.f15116u);
            return new JSONArray();
        }
    }

    public static final Intent f(Context context, Bundle payloadBundle, int i6) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(payloadBundle, "payloadBundle");
        Intent intent = new Intent(context, PushClickDialogTracker.class);
        intent.setFlags(268468224);
        intent.putExtras(payloadBundle).putExtra("MOE_NOTIFICATION_ID", i6);
        return intent;
    }

    public static final Intent g(Context context, Bundle payloadBundle, int i6) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(payloadBundle, "payloadBundle");
        Intent intent = new Intent(context, PushTracker.class);
        intent.setAction(kotlin.jvm.internal.i.n(Long.valueOf(System.currentTimeMillis()), ""));
        intent.setFlags(268435456);
        intent.putExtras(payloadBundle).putExtra("MOE_NOTIFICATION_ID", i6);
        return intent;
    }

    public static final boolean h(Context context, String str) {
        NotificationChannel notificationChannel;
        kotlin.jvm.internal.i.g(context, "context");
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        Object systemService = context.getSystemService("notification");
        if (systemService != null) {
            notificationChannel = ((NotificationManager) systemService).getNotificationChannel(str);
            if (notificationChannel != null) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    public static final int i(int i6, Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        return (int) TypedValue.applyDimension(1, i6, context.getResources().getDisplayMetrics());
    }
}
