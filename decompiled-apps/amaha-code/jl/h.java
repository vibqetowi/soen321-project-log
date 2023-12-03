package jl;

import org.json.JSONObject;
/* compiled from: CustomDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.CustomDashboardViewModel$fetchPsychiatristAssignedInfo$2$1", f = "CustomDashboardViewModel.kt", l = {186}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22203u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f22204v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f22205w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f22206x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(e eVar, kotlin.jvm.internal.u uVar, ls.d<? super Boolean> dVar, ls.d<? super h> dVar2) {
        super(2, dVar2);
        this.f22204v = eVar;
        this.f22205w = uVar;
        this.f22206x = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new h(this.f22204v, this.f22205w, this.f22206x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (kotlin.jvm.internal.i.b(r6.optString("psychiatrist", ""), "null") == false) goto L17;
     */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22203u;
        boolean z11 = true;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            rp.a aVar2 = this.f22204v.f22147z;
            this.f22203u = 1;
            obj = aVar2.f(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null && jSONObject.has("psychiatrist")) {
            String optString = jSONObject.optString("psychiatrist", "");
            if (optString != null && !gv.n.B0(optString)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
            }
        }
        z11 = false;
        kotlin.jvm.internal.u uVar = this.f22205w;
        uVar.f23466u = z11;
        this.f22206x.resumeWith(Boolean.valueOf(uVar.f23466u));
        return hs.k.f19476a;
    }
}
