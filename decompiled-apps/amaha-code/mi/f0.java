package mi;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: Evaluator.kt */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f25179a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25180b;

    /* compiled from: Evaluator.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ JSONObject f25182v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(0);
            this.f25182v = jSONObject;
        }

        @Override // ss.a
        public final String invoke() {
            return f0.this.f25180b + " evaluateCondition() : Attribute for evaluation: " + this.f25182v;
        }
    }

    /* compiled from: Evaluator.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" evaluateCondition() : ", f0.this.f25180b);
        }
    }

    public f0(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f25179a = sdkInstance;
        this.f25180b = "InApp_6.5.0_Evaluator";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:3:0x0006, B:5:0x0015, B:12:0x0022), top: B:17:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(si.g gVar, JSONObject jSONObject) {
        boolean z10;
        ih.p pVar = this.f25179a;
        si.h hVar = gVar.f31596a;
        try {
            hh.g.b(pVar.f20105d, 0, new a(jSONObject), 3);
            JSONObject jSONObject2 = hVar.f31598b;
            if (jSONObject2 != null && jSONObject2.length() != 0) {
                z10 = false;
                if (!z10) {
                    return true;
                }
                return new ih.k(hVar.f31598b, jSONObject).a();
            }
            z10 = true;
            if (!z10) {
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new b());
            return false;
        }
    }

    public final ri.a b(si.e inAppCampaign, is.y yVar, String str, pi.j globalState, int i6, boolean z10) {
        boolean z11;
        kotlin.jvm.internal.i.g(inAppCampaign, "inAppCampaign");
        kotlin.jvm.internal.i.g(globalState, "globalState");
        ih.p pVar = this.f25179a;
        hh.g gVar = pVar.f20105d;
        si.a aVar = inAppCampaign.f31592d;
        f8.g gVar2 = inAppCampaign.f31593e;
        hh.g.b(gVar, 0, new p0(this, aVar, gVar2), 3);
        int i10 = aVar.f31582l;
        hh.g gVar3 = pVar.f20105d;
        if (i10 == 2 && z10) {
            hh.g.b(gVar3, 0, new q0(this, aVar), 3);
            return ri.a.CAMPAIGN_PURPOSE_SERVED;
        }
        Set<ri.c> set = aVar.f31581k;
        kotlin.jvm.internal.i.f(set, "meta.supportedOrientations");
        if (!t1.c(i6, set)) {
            hh.g.b(gVar3, 3, new r0(this, aVar, i6), 2);
            return ri.a.ORIENTATION_NOT_SUPPORTED;
        }
        LinkedHashSet blockedActivityList = pVar.f20103b.f12861h.f28407a;
        kotlin.jvm.internal.i.g(blockedActivityList, "blockedActivityList");
        boolean z12 = true;
        if (blockedActivityList.contains(str)) {
            hh.g.b(gVar3, 3, new e0(this, str), 2);
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            hh.g.b(gVar3, 3, new s0(this, aVar), 2);
            return ri.a.BLOCKED_ON_SCREEN;
        }
        hh.g.b(gVar3, 0, new t0(this), 3);
        long j10 = globalState.f28484b + globalState.f28483a;
        long j11 = globalState.f28485c;
        si.b bVar = aVar.f31577g;
        if (j10 > j11 && !bVar.f31584b.f31586a) {
            hh.g.b(gVar3, 3, new u0(this, aVar), 2);
            return ri.a.GLOBAL_DELAY;
        }
        hh.g.b(gVar3, 0, new v0(this), 3);
        if (aVar.f31574c < j11) {
            hh.g.b(gVar3, 3, new w0(this), 2);
            return ri.a.EXPIRY;
        }
        hh.g.b(gVar3, 0, new x0(this), 3);
        si.c cVar = aVar.f31576e;
        String str2 = cVar.f31585a.f31594a;
        if (str2 != null && !kotlin.jvm.internal.i.b(str2, str)) {
            hh.g.b(gVar3, 3, new h0(this, aVar), 2);
            return ri.a.INVALID_SCREEN;
        }
        hh.g.b(gVar3, 0, new i0(this), 3);
        si.f fVar = cVar.f31585a;
        Set<String> set2 = fVar.f31595b;
        if (set2 != null && !set2.isEmpty()) {
            z12 = false;
        }
        if (!z12) {
            ri.a aVar2 = ri.a.INVALID_CONTEXT;
            if (yVar == null) {
                return aVar2;
            }
            if (Collections.disjoint(yVar, fVar.f31595b)) {
                hh.g.b(gVar3, 3, new j0(this, aVar), 2);
                return aVar2;
            }
        }
        hh.g.b(gVar3, 0, new k0(this), 3);
        long j12 = bVar.f31584b.f31587b;
        if (j12 > 0 && gVar2.f14907b >= j12) {
            hh.g.b(gVar3, 3, new l0(this, aVar), 2);
            return ri.a.MAX_COUNT;
        }
        hh.g.b(gVar3, 0, new m0(this), 3);
        if (gVar2.f14908c + bVar.f31584b.f31588c > j11) {
            hh.g.b(gVar3, 3, new n0(this, aVar), 2);
            return ri.a.CAMPAIGN_DELAY;
        }
        hh.g.b(gVar3, 0, new o0(this), 3);
        return ri.a.SUCCESS;
    }
}
