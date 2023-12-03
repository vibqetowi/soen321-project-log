package yk;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
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
@ns.e(c = "com.theinnerhour.b2b.components.community.viewmodels.CommunityDashboardViewModel$getCommunityPosts$1", f = "CommunityDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_activityChooserViewStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f38669u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f38670v;

    /* compiled from: CommunityDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.community.viewmodels.CommunityDashboardViewModel$getCommunityPosts$1$1", f = "CommunityDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_alertDialogStyle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public e f38671u;

        /* renamed from: v  reason: collision with root package name */
        public int f38672v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ e f38673w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f38673w = eVar;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f38673w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String currentCourseName;
            e eVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f38672v;
            e eVar2 = this.f38673w;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(eVar2.f38675y, e10);
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    eVar = this.f38671u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (currentCourseName = user.getCurrentCourseName()) != null) {
                    f fVar = eVar2.f38674x;
                    this.f38671u = eVar2;
                    this.f38672v = 1;
                    fVar.getClass();
                    h hVar = new h(ca.a.G0(this));
                    ((uk.a) nr.b.a(uk.a.class)).b("https://api.theinnerhour.com/v1/sample_posts", currentCourseName).I(new wk.d(hVar));
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                    eVar = eVar2;
                }
                return k.f19476a;
            }
            vk.d dVar = (vk.d) obj;
            if (dVar != null) {
                eVar.f38676z.i(dVar);
            }
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f38670v = eVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f38670v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f38669u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar2 = new a(this.f38670v, null);
            this.f38669u = 1;
            if (v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
