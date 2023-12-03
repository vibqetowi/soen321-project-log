package mi;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: DeliveryLogger.kt */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f25149a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25150b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f25151c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f25152d;

    /* compiled from: DeliveryLogger.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" writeStatsToStorage() : Stats upload is disabled, will not store stats.", c0.this.f25150b);
        }
    }

    /* compiled from: DeliveryLogger.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" writeStatsToStorage() : Not stats to store", c0.this.f25150b);
        }
    }

    /* compiled from: DeliveryLogger.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ JSONObject f25156v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            super(0);
            this.f25156v = jSONObject;
        }

        @Override // ss.a
        public final String invoke() {
            return c0.this.f25150b + " writeStatsToStorage() : Recorded Stats: " + this.f25156v;
        }
    }

    /* compiled from: DeliveryLogger.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" writeStatsToStorage() : ", c0.this.f25150b);
        }
    }

    public c0(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f25149a = sdkInstance;
        this.f25150b = "InApp_6.5.0_StatsLogger";
        this.f25151c = new HashMap();
        this.f25152d = new Object();
    }

    public static JSONObject a(pi.e stats) {
        kotlin.jvm.internal.i.g(stats, "stats");
        JSONObject jSONObject = new JSONObject();
        HashMap hashMap = stats.f28462a;
        kotlin.jvm.internal.i.f(hashMap, "stats.reasons");
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            List<String> value = (List) entry.getValue();
            kotlin.jvm.internal.i.f(value, "value");
            JSONArray jSONArray = new JSONArray();
            for (String str2 : value) {
                jSONArray.put(str2);
            }
            jSONObject.put(str, jSONArray);
        }
        return jSONObject;
    }

    public final void b(aj.a campaignContext, String str, String str2) {
        kotlin.jvm.internal.i.g(campaignContext, "campaignContext");
        synchronized (this.f25152d) {
            if (!this.f25149a.f20104c.f33016h.f20083a) {
                return;
            }
            pi.e eVar = (pi.e) this.f25151c.get(campaignContext.f585a);
            if (eVar == null) {
                pi.e eVar2 = new pi.e();
                HashMap hashMap = eVar2.f28462a;
                kotlin.jvm.internal.i.f(hashMap, "campaignStats.reasons");
                hashMap.put(str2, ca.a.Y0(str));
                this.f25151c.put(campaignContext.f585a, eVar2);
                return;
            }
            List list = (List) eVar.f28462a.get(str2);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                HashMap hashMap2 = eVar.f28462a;
                kotlin.jvm.internal.i.f(hashMap2, "campaignStats.reasons");
                hashMap2.put(str2, arrayList);
                hs.k kVar = hs.k.f19476a;
            } else {
                list.add(str);
            }
        }
    }

    public final void c(pi.d campaignPayload, String str, String str2) {
        kotlin.jvm.internal.i.g(campaignPayload, "campaignPayload");
        b(campaignPayload.a(), str, str2);
    }

    public final void d(Context context) {
        ih.p pVar = this.f25149a;
        try {
            boolean z10 = pVar.f20104c.f33016h.f20083a;
            HashMap hashMap = this.f25151c;
            if (!z10) {
                hh.g.b(pVar.f20105d, 0, new a(), 3);
                hashMap.clear();
            } else if (hashMap.isEmpty()) {
                hh.g.b(pVar.f20105d, 0, new b(), 3);
            } else {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    jSONObject.put((String) entry.getKey(), a((pi.e) entry.getValue()));
                }
                hh.g.b(pVar.f20105d, 0, new c(jSONObject), 3);
                if (jSONObject.length() == 0) {
                    return;
                }
                hashMap.clear();
                i1.f25206a.getClass();
                vi.o d10 = i1.d(context, pVar);
                d10.f35208a.j(new pi.p(-1L, sp.b.n(), di.b.m(), jSONObject));
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new d());
        }
    }
}
