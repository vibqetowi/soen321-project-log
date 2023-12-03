package hn;

import kotlinx.coroutines.o0;
import org.json.JSONObject;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$getDeepLinkJSON$2$1", f = "LoginSignupReworkViewModel.kt", l = {1634}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f17940u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f17941v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<JSONObject> f17942w;

    /* compiled from: LoginSignupReworkViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.p<Boolean, JSONObject, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<JSONObject> f17943u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ls.d<? super JSONObject> dVar) {
            super(2);
            this.f17943u = dVar;
        }

        @Override // ss.p
        public final hs.k invoke(Boolean bool, JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (!bool.booleanValue()) {
                jSONObject2 = null;
            }
            this.f17943u.resumeWith(jSONObject2);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(q qVar, ls.d<? super JSONObject> dVar, ls.d<? super u> dVar2) {
        super(2, dVar2);
        this.f17941v = qVar;
        this.f17942w = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new u(this.f17941v, this.f17942w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((u) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f17940u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            b bVar = this.f17941v.C;
            a aVar = new a(this.f17942w);
            this.f17940u = 1;
            bVar.getClass();
            Object S = ta.v.S(o0.f23642c, new d(aVar, bVar, null), this);
            if (S != obj2) {
                S = hs.k.f19476a;
            }
            if (S == obj2) {
                return obj2;
            }
        }
        return hs.k.f19476a;
    }
}
