package ml;

import org.json.JSONObject;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchNPSStatus$2", f = "DashboardTelecommunicationsViewModel.kt", l = {452}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25472u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f25473v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f25474w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, boolean z10, ls.d<? super i> dVar) {
        super(2, dVar);
        this.f25473v = pVar;
        this.f25474w = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new i(this.f25473v, this.f25474w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r4 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
        if (r4 == false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String mVar;
        Integer num;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Integer num2;
        boolean z14;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25472u;
        p pVar = this.f25473v;
        boolean z15 = true;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            rp.a aVar2 = pVar.f25558y;
            this.f25472u = 1;
            obj = aVar2.b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        sf.m mVar2 = (sf.m) obj;
        Integer num3 = null;
        if (mVar2 == null || (mVar = mVar2.toString()) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(mVar);
        if (this.f25474w) {
            if (!kotlin.jvm.internal.i.b(jSONObject.optString("therapist_nps_required", ""), "false")) {
                num2 = new Integer(jSONObject.optInt("therapist_nps_required", -1));
                if (num2.intValue() == -1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
            }
            num2 = null;
            pVar.O = jSONObject.optString("therapist_feedbackurl", "");
            Integer num4 = num2;
            num = null;
            num3 = num4;
        } else {
            if (!kotlin.jvm.internal.i.b(jSONObject.optString("psychiatrist_nps_required", ""), "false")) {
                num = new Integer(jSONObject.optInt("psychiatrist_nps_required", -1));
                if (num.intValue() == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            num = null;
            pVar.P = jSONObject.optString("psychiatrist_feedbackurl", "");
        }
        if (!pVar.T) {
            String str = pVar.O;
            if (str != null && !gv.n.B0(str)) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13 && num3 == null) {
                z11 = false;
                pVar.T = z11;
                if (!z11) {
                    String str2 = pVar.P;
                    if (str2 != null && !gv.n.B0(str2)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12 && num == null) {
                        z15 = false;
                    }
                }
                pVar.U = z15;
                return hs.k.f19476a;
            }
        }
        z11 = true;
        pVar.T = z11;
        if (!z11) {
        }
        pVar.U = z15;
        return hs.k.f19476a;
    }
}
