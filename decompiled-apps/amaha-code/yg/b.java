package yg;

import android.content.Context;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: BatchHelper.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f38549a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38550b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f38551c;

    /* compiled from: BatchHelper.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" batchToJson() : Mapping batch to JSON", b.this.f38550b);
        }
    }

    /* compiled from: BatchHelper.kt */
    /* renamed from: yg.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0652b extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0652b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" createAndSaveBatches() : ", b.this.f38550b);
        }
    }

    /* compiled from: BatchHelper.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {
        public c() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" createAndSaveBatches() : ", b.this.f38550b);
        }
    }

    public b(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f38549a = sdkInstance;
        this.f38550b = "Core_BatchHelper";
        this.f38551c = new Object();
    }

    public final JSONObject a(s1.s sVar) {
        boolean z10;
        JSONObject b10;
        ih.p pVar = this.f38549a;
        boolean z11 = false;
        hh.g.b(pVar.f20105d, 0, new a(), 3);
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (mh.c cVar : (List) sVar.f31224v) {
            jSONArray.put(new JSONObject(cVar.f25061c));
        }
        jSONObject.put("viewsCount", jSONArray.length()).put("viewsInfo", jSONArray);
        com.google.android.gms.internal.p000firebaseauthapi.s sVar2 = (com.google.android.gms.internal.p000firebaseauthapi.s) sVar.f31225w;
        yg.c cVar2 = new yg.c(this);
        hh.g gVar = pVar.f20105d;
        hh.g.b(gVar, 0, cVar2, 3);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("bid", sVar2.f8114u).put("request_time", sVar2.f8115v);
        ih.g gVar2 = (ih.g) sVar2.f8117x;
        if (gVar2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            if (gVar2.f20083a) {
                jSONObject3.put("e_t_p", false);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("dev_pref", jSONObject3);
            }
        }
        jh.b bVar = (jh.b) sVar2.f8118y;
        if (bVar != null) {
            hh.g.b(gVar, 0, new yg.a(this), 3);
            JSONArray jSONArray2 = new JSONArray();
            jh.a aVar = bVar.f22032c;
            if (aVar != null && !kotlin.jvm.internal.h.H(aVar) && (b10 = sg.t.b(bVar.f22032c)) != null && b10.length() > 0) {
                jSONArray2.put(b10);
            }
            jSONObject2.put("source", jSONArray2);
            JSONObject c10 = sg.t.c(bVar);
            if (c10 != null) {
                if (c10.has("source_array")) {
                    c10.remove("source_array");
                }
                if (c10.has("last_interaction_time")) {
                    c10.remove("last_interaction_time");
                }
                jSONObject2.put("session", c10);
            }
        }
        if (!((List) sVar2.f8119z).isEmpty()) {
            jSONObject2.put("integrations", f6.b.F0((List) sVar2.f8119z));
        }
        if (sVar2.f8116w) {
            jSONObject2.put("dev_add_res", "failure");
        }
        jSONObject.put("meta", jSONObject2);
        qh.a identifiers = (qh.a) sVar.f31226x;
        kotlin.jvm.internal.i.g(identifiers, "identifiers");
        JSONObject jSONObject4 = new JSONObject();
        String str = identifiers.f29590b;
        if (str != null && !gv.n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            jSONObject4.put("moe_user_id", str);
        }
        String str2 = identifiers.f29591c;
        if (!((str2 == null || gv.n.B0(str2)) ? true : true)) {
            jSONObject4.put("segment_id", str2);
        }
        if (jSONObject4.length() > 0) {
            jSONObject.put("identifiers", jSONObject4);
        }
        jSONObject.put("MOE-REQUEST-ID", di.n.c(((Object) ((com.google.android.gms.internal.p000firebaseauthapi.s) sVar.f31225w).f8114u) + ((Object) ((com.google.android.gms.internal.p000firebaseauthapi.s) sVar.f31225w).f8115v) + ((qh.a) sVar.f31226x).f29592d));
        return jSONObject;
    }

    public final void b(Context context, jh.b bVar) {
        kotlin.jvm.internal.i.g(context, "context");
        synchronized (this.f38551c) {
            try {
                boolean z10 = false;
                hh.g.b(this.f38549a.f20105d, 0, new C0652b(), 3);
                qg.w wVar = qg.w.f29578a;
                ih.p pVar = this.f38549a;
                wVar.getClass();
                uh.b f = qg.w.f(context, pVar);
                ih.g Q = f.Q();
                if (!f.Z()) {
                    z10 = true;
                }
                while (true) {
                    List<mh.c> W = f.W();
                    if (!W.isEmpty()) {
                        String m10 = di.b.m();
                        String m11 = sp.b.m();
                        qg.w wVar2 = qg.w.f29578a;
                        ih.p pVar2 = this.f38549a;
                        wVar2.getClass();
                        f.f34156b.o(new mh.b(-1L, a(new s1.s(W, new com.google.android.gms.internal.p000firebaseauthapi.s(Q, m10, m11, bVar, z10, qg.w.c(pVar2).f573b), f.K()))));
                        f.f34156b.l(W);
                    }
                }
            } catch (Throwable th2) {
                this.f38549a.f20105d.a(1, th2, new c());
                hs.k kVar = hs.k.f19476a;
            }
        }
    }
}
