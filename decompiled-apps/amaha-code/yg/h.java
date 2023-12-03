package yg;

import android.content.Context;
import org.json.JSONObject;
/* compiled from: BatchUpdater.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f38575a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38576b;

    public h(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f38575a = sdkInstance;
        this.f38576b = "Core_BatchUpdater";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(JSONObject jSONObject, qh.a identifiers) {
        com.google.android.gms.internal.p000firebaseauthapi.s sVar;
        String str;
        boolean z10;
        String str2;
        ih.g preferences;
        ih.g gVar;
        kotlin.jvm.internal.i.g(identifiers, "identifiers");
        ih.p pVar = this.f38575a;
        boolean z11 = true;
        try {
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new d(this));
        }
        if (jSONObject.has("meta")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("meta");
            if (jSONObject2.has("dev_pref")) {
                gVar = new ih.g(jSONObject2.getJSONObject("dev_pref").has("e_t_p"));
            } else {
                gVar = null;
            }
            String optString = jSONObject2.optString("bid", "");
            String optString2 = jSONObject2.optString("request_time", "");
            qg.w.f29578a.getClass();
            sVar = new com.google.android.gms.internal.p000firebaseauthapi.s(gVar, optString, optString2, qg.w.c(pVar).f573b);
            if (sVar == null) {
            }
            str = sVar.f8114u;
            if (str == null) {
            }
            z10 = true;
            if (z10) {
            }
            str2 = sVar.f8115v;
            if (str2 != null) {
                z11 = false;
            }
            if (z11) {
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("bid", sVar.f8114u);
            jSONObject3.put("request_time", sVar.f8115v);
            preferences = (ih.g) sVar.f8117x;
            if (preferences != null) {
            }
            jSONObject.put("meta", jSONObject3);
            jSONObject.put("MOE-REQUEST-ID", di.n.c(((Object) sVar.f8114u) + ((Object) sVar.f8115v) + identifiers.f29592d));
        }
        sVar = null;
        if (sVar == null) {
            String m10 = di.b.m();
            String m11 = sp.b.m();
            qg.w.f29578a.getClass();
            sVar = new com.google.android.gms.internal.p000firebaseauthapi.s(null, m10, m11, qg.w.c(pVar).f573b);
        }
        str = sVar.f8114u;
        if (str == null && !gv.n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            sVar.f8114u = di.b.m();
        }
        str2 = sVar.f8115v;
        if (str2 != null && !gv.n.B0(str2)) {
            z11 = false;
        }
        if (z11) {
            sVar.f8115v = sp.b.m();
        }
        JSONObject jSONObject32 = new JSONObject();
        jSONObject32.put("bid", sVar.f8114u);
        jSONObject32.put("request_time", sVar.f8115v);
        preferences = (ih.g) sVar.f8117x;
        if (preferences != null) {
            kotlin.jvm.internal.i.g(preferences, "preferences");
            JSONObject jSONObject4 = new JSONObject();
            if (preferences.f20083a) {
                jSONObject4.put("e_t_p", false);
            }
            if (jSONObject4.length() > 0) {
                jSONObject32.put("dev_pref", jSONObject4);
            }
        }
        jSONObject.put("meta", jSONObject32);
        jSONObject.put("MOE-REQUEST-ID", di.n.c(((Object) sVar.f8114u) + ((Object) sVar.f8115v) + identifiers.f29592d));
    }

    public final void b(Context context, mh.b batch) {
        ih.p pVar = this.f38575a;
        kotlin.jvm.internal.i.g(batch, "batch");
        try {
            JSONObject jSONObject = batch.f25058b;
            if (jSONObject.has("MOE-REQUEST-ID")) {
                hh.g.b(pVar.f20105d, 0, new e(this), 3);
                return;
            }
            hh.g.b(pVar.f20105d, 0, new f(this), 3);
            qg.w.f29578a.getClass();
            uh.b f = qg.w.f(context, pVar);
            a(jSONObject, f.K());
            batch.f25058b = jSONObject;
            if (batch.f25057a != -1) {
                f.R(batch);
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new g(this));
        }
    }
}
