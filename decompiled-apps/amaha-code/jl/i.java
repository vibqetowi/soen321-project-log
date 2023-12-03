package jl;

import org.json.JSONObject;
/* compiled from: CustomDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$fetchTherapistAssignedInfo$2$1", f = "CustomDashboardViewModel.kt", l = {170}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22222u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f22223v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f22224w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22225x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(e eVar, kotlin.jvm.internal.u uVar, ls.d<? super Boolean> dVar, ls.d<? super i> dVar2) {
        super(2, dVar2);
        this.f22223v = eVar;
        this.f22224w = uVar;
        this.f22225x = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new i(this.f22223v, this.f22224w, this.f22225x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (kotlin.jvm.internal.i.b(r7.optString("therapist", ""), "null") == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
        if (kotlin.jvm.internal.i.b(r7.optString("couplestherapist", ""), "null") == false) goto L17;
     */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        boolean z11;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22222u;
        boolean z12 = true;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            rp.a aVar2 = this.f22223v.f22147z;
            this.f22222u = 1;
            obj = aVar2.h(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            if (jSONObject.has("therapist")) {
                String optString = jSONObject.optString("therapist", "");
                if (optString != null && !gv.n.B0(optString)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                }
            }
            if (jSONObject.has("couplestherapist")) {
                String optString2 = jSONObject.optString("couplestherapist", "");
                if (optString2 != null && !gv.n.B0(optString2)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                }
            }
        }
        z12 = false;
        kotlin.jvm.internal.u uVar = this.f22224w;
        uVar.f23466u = z12;
        this.f22225x.resumeWith(Boolean.valueOf(uVar.f23466u));
        return hs.k.f19476a;
    }
}
