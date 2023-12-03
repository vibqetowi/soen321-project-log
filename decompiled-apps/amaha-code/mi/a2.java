package mi;

import android.content.Context;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
/* compiled from: ViewBuilder.kt */
/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f25133a;

    /* renamed from: b  reason: collision with root package name */
    public final ih.p f25134b;

    /* renamed from: c  reason: collision with root package name */
    public final String f25135c = "InApp_6.5.0_ViewBuilder";

    /* renamed from: d  reason: collision with root package name */
    public final h1 f25136d;

    /* renamed from: e  reason: collision with root package name */
    public final vi.o f25137e;

    public a2(Context context, ih.p pVar) {
        this.f25133a = context;
        this.f25134b = pVar;
        i1.f25206a.getClass();
        this.f25136d = i1.b(pVar);
        this.f25137e = i1.d(context, pVar);
    }

    public final void a(JSONObject jSONObject) {
        jSONObject.put("sdkVersion", String.valueOf(di.b.n()));
        jSONObject.put("os", "ANDROID");
        bh.a.f4292a.getClass();
        ad.h a10 = bh.a.a(this.f25133a);
        jSONObject.put("appVersion", String.valueOf(a10.f504a));
        jSONObject.put("appVersionName", a10.f505b);
    }

    public final pi.d b(si.e eVar, s1.s sVar) {
        String c10 = j1.c();
        if (c10 == null) {
            c10 = "";
        }
        String str = c10;
        i1.f25206a.getClass();
        vi.a a10 = i1.a(this.f25134b);
        ih.h g5 = di.b.g(this.f25133a);
        vi.o oVar = this.f25137e;
        oVar.getClass();
        is.y appContext = a10.f35174g;
        kotlin.jvm.internal.i.g(appContext, "appContext");
        ih.p pVar = oVar.f35210c;
        hh.g.b(pVar.f20105d, 0, new vi.i(oVar), 3);
        try {
            if (oVar.F()) {
                jg.d l2 = oVar.l();
                si.a aVar = eVar.f31592d;
                ti.b bVar = new ti.b(l2, aVar.f31572a, str, appContext, sVar, aVar.f31579i, g5);
                ih.m d10 = oVar.f35209b.d(bVar);
                if (d10 instanceof ih.n) {
                    T t3 = ((ih.n) d10).f20100a;
                    if (t3 != 0) {
                        oVar.G((ti.a) t3, bVar);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.moengage.inapp.internal.model.network.CampaignError");
                    }
                } else if (d10 instanceof ih.o) {
                    T t10 = ((ih.o) d10).f20101a;
                    if (t10 != 0) {
                        return (pi.d) t10;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.moengage.inapp.internal.model.CampaignPayload");
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } catch (Exception e10) {
            pVar.f20105d.a(1, e10, new vi.j(oVar));
        }
        return null;
    }

    public final si.e c(List<si.e> list) {
        int i6;
        aj.a aVar;
        si.e eVar = null;
        if (list.isEmpty()) {
            return null;
        }
        ih.p pVar = this.f25134b;
        f0 f0Var = new f0(pVar);
        pi.j globalState = this.f25137e.x();
        i1.f25206a.getClass();
        is.y yVar = i1.a(pVar).f35174g;
        kotlin.jvm.internal.i.g(globalState, "globalState");
        Context context = this.f25133a;
        kotlin.jvm.internal.i.g(context, "context");
        ih.p pVar2 = f0Var.f25179a;
        c0 c10 = i1.c(pVar2);
        if (c10.f25149a.f20104c.f33016h.f20083a) {
            String m10 = sp.b.m();
            for (si.e eVar2 : list) {
                aj.a aVar2 = eVar2.f31592d.f31579i;
                if (aVar2 != null) {
                    c10.b(aVar2, m10, "ATM");
                }
            }
        }
        String c11 = j1.c();
        if (c11 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < list.size()) {
                    si.e eVar3 = list.get(i10);
                    eVar = eVar3;
                    i6 = i10;
                    ri.a b10 = f0Var.b(eVar3, yVar, c11, globalState, t1.d(context), di.b.q(context));
                    int ordinal = b10.ordinal();
                    if (ordinal == 8) {
                        break;
                    }
                    if (ordinal != 10) {
                        i1.f25206a.getClass();
                        c0 c12 = i1.c(pVar2);
                        String str = (String) d0.f25162a.get(b10);
                        if (str != null && (aVar = eVar.f31592d.f31579i) != null) {
                            c12.b(aVar, sp.b.m(), str);
                        }
                    } else {
                        hh.g.b(pVar2.f20105d, 3, new g0(f0Var, eVar, b10), 2);
                    }
                    i10 = i6 + 1;
                } else {
                    i6 = i10;
                    eVar = null;
                    break;
                }
            }
            if (eVar != null) {
                String m11 = sp.b.m();
                for (int i11 = i6 + 1; i11 < list.size(); i11++) {
                    si.e campaign = list.get(i11);
                    i1.f25206a.getClass();
                    c0 c13 = i1.c(pVar2);
                    kotlin.jvm.internal.i.g(campaign, "campaign");
                    aj.a aVar3 = campaign.f31592d.f31579i;
                    if (aVar3 != null) {
                        c13.b(aVar3, m11, "PRT_HIGH_PRT_CMP_AVL");
                    }
                }
            }
        }
        return eVar;
    }
}
