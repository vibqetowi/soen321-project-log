package hn;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.login.model.LoginLoading;
import kotlinx.coroutines.o0;
/* compiled from: LoginSignupReworkViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$validateCredentialsSSO$1", f = "LoginSignupReworkViewModel.kt", l = {1389}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f17863u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f17864v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f17865w;

    /* compiled from: LoginSignupReworkViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.login.viewmodel.LoginSignupReworkViewModel$validateCredentialsSSO$1$1", f = "LoginSignupReworkViewModel.kt", l = {1391}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f17866u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ q f17867v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f17868w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f17867v = qVar;
            this.f17868w = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f17867v, this.f17868w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f17866u;
            q qVar = this.f17867v;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                qVar.F.i(LoginLoading.SHOW_LOADING);
                this.f17866u = 1;
                obj = q.e(qVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (!((Boolean) obj).booleanValue()) {
                qVar.F.i(LoginLoading.HIDE_LOADING);
                qVar.H.i(qVar.f2382x.getApplicationContext().getString(R.string.signUpConnectivityError));
            } else {
                qVar.getClass();
                ta.v.H(kc.f.H(qVar), null, 0, new x(qVar, this.f17868w, null), 3);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(q qVar, String str, ls.d<? super g0> dVar) {
        super(2, dVar);
        this.f17864v = qVar;
        this.f17865w = str;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new g0(this.f17864v, this.f17865w, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((g0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f17863u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar2 = new a(this.f17864v, this.f17865w, null);
            this.f17863u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
