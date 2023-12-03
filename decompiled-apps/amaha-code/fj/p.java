package fj;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import org.json.JSONObject;
import qg.g0;
/* compiled from: StatsTracker.kt */
/* loaded from: classes.dex */
public final class p {

    /* compiled from: StatsTracker.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f15104u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_StatsTracker addAttributesToProperties() : ";
        }
    }

    /* compiled from: StatsTracker.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f15105u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "PushBase_6.6.0_StatsTracker addTemplateMetaToProperties() : ";
        }
    }

    public static final void a(Bundle payload, ng.c cVar, ih.p sdkInstance) {
        String string;
        Boolean valueOf;
        kotlin.jvm.internal.i.g(payload, "payload");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        try {
            if (payload.containsKey("shownOffline")) {
                cVar.a(Boolean.TRUE, "shownOffline");
            }
            if (payload.containsKey("moe_push_source")) {
                cVar.a(payload.getString("moe_push_source"), "source");
            }
            if (payload.containsKey("from_appOpen")) {
                String string2 = payload.getString("from_appOpen");
                if (string2 == null) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(Boolean.parseBoolean(string2));
                }
                cVar.a(valueOf, "from_appOpen");
            }
            b(payload, cVar, sdkInstance);
            if (!payload.containsKey("moe_cid_attr") || (string = payload.getString("moe_cid_attr")) == null) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.length() == 0) {
                return;
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                String string3 = jSONObject.getString(key);
                kotlin.jvm.internal.i.f(key, "key");
                cVar.a(string3, key);
            }
        } catch (Throwable th2) {
            sdkInstance.f20105d.a(1, th2, a.f15104u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:3:0x0005, B:6:0x000c, B:8:0x0012, B:15:0x001f, B:17:0x0040, B:20:0x0048, B:22:0x0053), top: B:27:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(Bundle bundle, ng.c cVar, ih.p pVar) {
        boolean z10;
        try {
            if (!bundle.containsKey("moe_template_meta")) {
                return;
            }
            String string = bundle.getString("moe_template_meta");
            if (string != null && string.length() != 0) {
                z10 = false;
                if (!z10) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("templateName");
                kotlin.jvm.internal.i.f(string2, "metaJson.getString(TRACKING_META_TEMPLATE_NAME)");
                int i6 = jSONObject.getInt("cardId");
                int i10 = jSONObject.getInt("widgetId");
                if (!gv.n.B0(string2)) {
                    cVar.a(string2, "template_name");
                }
                if (i6 != -1) {
                    cVar.a(Integer.valueOf(i6), "card_id");
                }
                if (i10 != -1) {
                    cVar.a(Integer.valueOf(i10), "widget_id");
                    return;
                }
                return;
            }
            z10 = true;
            if (!z10) {
            }
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, b.f15105u);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0044 A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:3:0x0006, B:6:0x0015, B:11:0x0021, B:16:0x0027, B:19:0x002e, B:21:0x0038, B:27:0x0044, B:29:0x004d, B:31:0x005f, B:32:0x0074, B:34:0x0081, B:35:0x008c, B:39:0x00af, B:38:0x00a3, B:7:0x0016, B:9:0x001a, B:10:0x001f), top: B:44:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d A[Catch: all -> 0x00be, TryCatch #1 {all -> 0x00be, blocks: (B:3:0x0006, B:6:0x0015, B:11:0x0021, B:16:0x0027, B:19:0x002e, B:21:0x0038, B:27:0x0044, B:29:0x004d, B:31:0x005f, B:32:0x0074, B:34:0x0081, B:35:0x008c, B:39:0x00af, B:38:0x00a3, B:7:0x0016, B:9:0x001a, B:10:0x001f), top: B:44:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(Context context, Bundle bundle, ih.p sdkInstance) {
        boolean z10;
        ej.b bVar;
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        try {
            hh.g.b(sdkInstance.f20105d, 0, q.f15106u, 3);
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
            if (!bVar2.b(bundle)) {
                return;
            }
            String campaignId = bundle.getString("gcm_campaign_id", "");
            if (campaignId != null && !gv.n.B0(campaignId)) {
                z10 = false;
                if (!z10) {
                    hh.g.b(sdkInstance.f20105d, 1, r.f15107u, 2);
                    return;
                }
                ng.c cVar = new ng.c();
                kotlin.jvm.internal.i.f(campaignId, "campaignId");
                if (gv.r.J0(campaignId, "DTSDK")) {
                    campaignId = campaignId.substring(0, gv.r.O0(campaignId, "DTSDK", 0, false, 6));
                    kotlin.jvm.internal.i.f(campaignId, "this as java.lang.String…ing(startIndex, endIndex)");
                    bundle.putString("gcm_campaign_id", campaignId);
                }
                cVar.a(campaignId, "gcm_campaign_id");
                if (bundle.containsKey("moe_action_id")) {
                    cVar.a(bundle.getString("moe_action_id"), "gcm_action_id");
                }
                a(bundle, cVar, sdkInstance);
                String appId = (String) sdkInstance.f20102a.f5133c;
                kotlin.jvm.internal.i.g(appId, "appId");
                ih.p b10 = g0.b(appId);
                if (b10 != null) {
                    qg.w.f29578a.getClass();
                    qg.w.d(b10).c(context, "NOTIFICATION_CLICKED_MOE", cVar);
                }
                d.f15071a.getClass();
                d.b(context, sdkInstance).f24394a.i(bundle);
                return;
            }
            z10 = true;
            if (!z10) {
            }
        } catch (Throwable th2) {
            sdkInstance.f20105d.a(1, th2, s.f15108u);
        }
    }

    public static final void d(Context context, pj.b bVar, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        if (!sdkInstance.f20104c.f33012c.f28435k.contains("MOE_NOTIFICATION_SHOWN")) {
            return;
        }
        ng.c cVar = new ng.c();
        cVar.a(bVar.f28527b, "gcm_campaign_id");
        a(bVar.f28533i, cVar, sdkInstance);
        cVar.b();
        String appId = (String) sdkInstance.f20102a.f5133c;
        kotlin.jvm.internal.i.g(appId, "appId");
        ih.p b10 = g0.b(appId);
        if (b10 != null) {
            qg.w.f29578a.getClass();
            qg.w.d(b10).c(context, "MOE_NOTIFICATION_SHOWN", cVar);
        }
    }
}
