package jo;

import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.k;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ls.d;
import ls.h;
import ns.e;
import ns.i;
import org.json.JSONObject;
import ss.p;
import ta.v;
/* compiled from: ProAssessmentViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.pro.assessment.viewmodel.ProAssessmentViewModel$fetch$1", f = "ProAssessmentViewModel.kt", l = {24, 26}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a extends i implements p<d0, d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22526u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c f22527v;

    /* compiled from: ProAssessmentViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.pro.assessment.viewmodel.ProAssessmentViewModel$fetch$1$1", f = "ProAssessmentViewModel.kt", l = {24}, m = "invokeSuspend")
    /* renamed from: jo.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0338a extends i implements p<d0, d<? super JSONObject>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22528u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ c f22529v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0338a(c cVar, d<? super C0338a> dVar) {
            super(2, dVar);
            this.f22529v = cVar;
        }

        @Override // ns.a
        public final d<k> create(Object obj, d<?> dVar) {
            return new C0338a(this.f22529v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, d<? super JSONObject> dVar) {
            return ((C0338a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22528u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                io.c cVar = this.f22529v.f22531x;
                this.f22528u = 1;
                cVar.getClass();
                h hVar = new h(ca.a.G0(this));
                try {
                    VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(0, "https://api.theinnerhour.com/v1/get_pro_assessment", null, new io.a(cVar, hVar), new io.b(cVar, hVar)));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(cVar.f20417u, e10);
                    hVar.resumeWith(null);
                }
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, d<? super a> dVar) {
        super(2, dVar);
        this.f22527v = cVar;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new a(this.f22527v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22526u;
        k kVar = null;
        c cVar = this.f22527v;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    kVar = k.f19476a;
                    if (kVar == null) {
                        cVar.C.i(Boolean.TRUE);
                    }
                    cVar.f22533z.l(Boolean.FALSE);
                    return k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            cVar.f22533z.l(Boolean.TRUE);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            C0338a c0338a = new C0338a(cVar, null);
            this.f22526u = 1;
            obj = v.S(bVar, c0338a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject != null) {
            cVar.f22532y = jSONObject;
            this.f22526u = 2;
            Object S = v.S(o0.f23640a, new b(cVar, null), this);
            if (S != aVar) {
                S = k.f19476a;
            }
            if (S == aVar) {
                return aVar;
            }
            kVar = k.f19476a;
        }
        if (kVar == null) {
        }
        cVar.f22533z.l(Boolean.FALSE);
        return k.f19476a;
    }
}
