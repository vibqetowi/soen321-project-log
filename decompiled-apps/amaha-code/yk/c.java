package yk;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.k;
import kc.f;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ls.h;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: CommunityDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.community.viewmodels.CommunityDashboardViewModel$getCommunities$1", f = "CommunityDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_colorControlNormal}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f38665u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f38666v;

    /* compiled from: CommunityDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.community.viewmodels.CommunityDashboardViewModel$getCommunities$1$1", f = "CommunityDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_colorPrimary}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f38667u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ e f38668v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f38668v = eVar;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f38668v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f38667u;
            e eVar = this.f38668v;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    f fVar = eVar.f38674x;
                    this.f38667u = 1;
                    fVar.getClass();
                    h hVar = new h(ca.a.G0(this));
                    ((uk.a) nr.b.a(uk.a.class)).a("https://api.theinnerhour.com/v1/communities/communities").I(new wk.c(hVar));
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                vk.a aVar2 = (vk.a) obj;
                if (aVar2 != null) {
                    eVar.A.i(aVar2);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(eVar.f38675y, e10);
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ls.d<? super c> dVar) {
        super(2, dVar);
        this.f38666v = eVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new c(this.f38666v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f38665u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar2 = new a(this.f38666v, null);
            this.f38665u = 1;
            if (v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
