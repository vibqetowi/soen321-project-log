package rp;

import android.content.Context;
import com.theinnerhour.b2b.MyApplication;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
/* compiled from: TelecommunicationsPWAViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.telecommunications.viewmodel.TelecommunicationsPWAViewModel$getAccessToken$2", f = "TelecommunicationsPWAViewModel.kt", l = {27}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f30904u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ t f30905v;

    /* compiled from: TelecommunicationsPWAViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.telecommunications.viewmodel.TelecommunicationsPWAViewModel$getAccessToken$2$1", f = "TelecommunicationsPWAViewModel.kt", l = {29}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public androidx.lifecycle.w f30906u;

        /* renamed from: v  reason: collision with root package name */
        public int f30907v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ t f30908w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t tVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f30908w = tVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f30908w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.w] */
        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            MyApplication myApplication;
            String str;
            boolean z10;
            MyApplication myApplication2;
            androidx.lifecycle.w<String> wVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f30907v;
            if (i6 != 0) {
                if (i6 == 1) {
                    wVar = this.f30906u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                t tVar = this.f30908w;
                Context applicationContext = tVar.f2382x.getApplicationContext();
                String str2 = null;
                if (applicationContext instanceof MyApplication) {
                    myApplication = (MyApplication) applicationContext;
                } else {
                    myApplication = null;
                }
                if (myApplication != null) {
                    str = myApplication.O;
                } else {
                    str = null;
                }
                if (str != null && !gv.n.B0(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                androidx.lifecycle.w<String> wVar2 = tVar.A;
                if (z10) {
                    this.f30906u = wVar2;
                    this.f30907v = 1;
                    obj = tVar.f30900y.j(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    wVar = wVar2;
                } else {
                    Context applicationContext2 = tVar.f2382x.getApplicationContext();
                    if (applicationContext2 instanceof MyApplication) {
                        myApplication2 = (MyApplication) applicationContext2;
                    } else {
                        myApplication2 = null;
                    }
                    if (myApplication2 != null) {
                        str2 = myApplication2.O;
                    }
                    wVar2.i(str2);
                    return hs.k.f19476a;
                }
            }
            wVar.i(obj);
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, ls.d<? super u> dVar) {
        super(2, dVar);
        this.f30905v = tVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new u(this.f30905v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((u) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f30904u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar2 = new a(this.f30905v, null);
            this.f30904u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
