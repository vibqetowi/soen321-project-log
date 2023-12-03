package zl;

import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import org.json.JSONObject;
/* compiled from: ExpertCareDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchNPSStatus$2$1", f = "ExpertCareDashboardViewModel.kt", l = {593}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39525u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f39526v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f39527w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<String> f39528x;

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchNPSStatus$2$1$1", f = "ExpertCareDashboardViewModel.kt", l = {594}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39529u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f39530v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o f39531w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f39532x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<String> f39533y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, ls.d dVar, kotlinx.coroutines.j jVar, boolean z10) {
            super(2, dVar);
            this.f39531w = oVar;
            this.f39532x = z10;
            this.f39533y = jVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            boolean z10 = this.f39532x;
            a aVar = new a(this.f39531w, dVar, this.f39533y, z10);
            aVar.f39530v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Number, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Number, java.lang.Integer] */
        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String mVar;
            String optString;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39529u;
            o oVar = this.f39531w;
            boolean z10 = true;
            if (i6 != 0) {
                if (i6 == 1) {
                    d0 d0Var = (d0) this.f39530v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                rp.a aVar2 = oVar.f39565x;
                this.f39530v = (d0) this.f39530v;
                this.f39529u = 1;
                obj = aVar2.b(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            sf.m mVar2 = (sf.m) obj;
            kotlinx.coroutines.j<String> jVar = this.f39533y;
            hs.k kVar = null;
            if (mVar2 != null && (mVar = mVar2.toString()) != null) {
                JSONObject jSONObject = new JSONObject(mVar);
                if (this.f39532x) {
                    if (!kotlin.jvm.internal.i.b(jSONObject.optString("therapist_nps_required", ""), "false")) {
                        ?? num = new Integer(jSONObject.optInt("therapist_nps_required", -1));
                        if (num.intValue() != -1) {
                            z10 = false;
                        }
                        if (!z10) {
                            kVar = num;
                        }
                        jSONObject.optInt("therapist_sessions_completed", -1);
                        oVar.getClass();
                    }
                    optString = jSONObject.optString("therapist_feedbackurl", "");
                } else {
                    if (!kotlin.jvm.internal.i.b(jSONObject.optString("psychiatrist_nps_required", ""), "false")) {
                        ?? num2 = new Integer(jSONObject.optInt("psychiatrist_nps_required", -1));
                        if (num2.intValue() != -1) {
                            z10 = false;
                        }
                        if (!z10) {
                            kVar = num2;
                        }
                        jSONObject.optInt("psychiatrist_sessions_completed", -1);
                        oVar.getClass();
                    }
                    optString = jSONObject.optString("psychiatrist_feedbackurl", "");
                }
                if (kVar != null) {
                    oVar.P.i(new SingleUseEvent<>(kVar));
                }
                jVar.resumeWith(optString);
                kVar = hs.k.f19476a;
            }
            if (kVar == null) {
                jVar.resumeWith("");
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, ls.d dVar, kotlinx.coroutines.j jVar, boolean z10) {
        super(2, dVar);
        this.f39526v = oVar;
        this.f39527w = z10;
        this.f39528x = jVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        boolean z10 = this.f39527w;
        return new j(this.f39526v, dVar, this.f39528x, z10);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39525u;
        o oVar = this.f39526v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                a aVar2 = new a(oVar, null, this.f39528x, this.f39527w);
                this.f39525u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(oVar.f39566y, e10);
        }
        return hs.k.f19476a;
    }
}
