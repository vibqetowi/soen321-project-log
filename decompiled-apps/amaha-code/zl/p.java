package zl;

import com.appsflyer.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.List;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
/* compiled from: ExpertCareViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareViewModel$fetchInsidePageInfo$1", f = "ExpertCareViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeight}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39568u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v f39569v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f39570w;

    /* compiled from: ExpertCareViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareViewModel$fetchInsidePageInfo$1$1", f = "ExpertCareViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingLeft}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super List<? extends hs.k>>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39571u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f39572v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v f39573w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f39574x;

        /* compiled from: ExpertCareViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareViewModel$fetchInsidePageInfo$1$1$1", f = "ExpertCareViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: zl.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0678a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ v f39575u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ boolean f39576v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0678a(v vVar, ls.d dVar, boolean z10) {
                super(2, dVar);
                this.f39575u = vVar;
                this.f39576v = z10;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0678a(this.f39575u, dVar, this.f39576v);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((C0678a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                sp.b.d0(obj);
                v vVar = this.f39575u;
                vVar.getClass();
                ta.v.H(kc.f.H(vVar), null, 0, new q(vVar, null, this.f39576v), 3);
                return hs.k.f19476a;
            }
        }

        /* compiled from: ExpertCareViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareViewModel$fetchInsidePageInfo$1$1$2", f = "ExpertCareViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ v f39577u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(v vVar, ls.d<? super b> dVar) {
                super(2, dVar);
                this.f39577u = vVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new b(this.f39577u, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                sp.b.d0(obj);
                v vVar = this.f39577u;
                vVar.getClass();
                try {
                    if (ApplicationPersistence.getInstance().containsKey(Constants.OFFLINE_CENTERS_IN_CURRENT_LOCATION)) {
                        vVar.B.i(ApplicationPersistence.getInstance().getStringValue(Constants.OFFLINE_CENTERS_IN_CURRENT_LOCATION));
                        ta.v.H(kc.f.H(vVar), null, 0, new r(vVar, null), 3);
                    } else {
                        ta.v.H(kc.f.H(vVar), null, 0, new s(vVar, null), 3);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(vVar.D, e10);
                }
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f39573w = vVar;
            this.f39574x = z10;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f39573w, dVar, this.f39574x);
            aVar.f39572v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super List<? extends hs.k>> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39571u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var = (d0) this.f39572v;
                v vVar = this.f39573w;
                List P0 = ca.a.P0(ta.v.g(d0Var, null, new C0678a(vVar, null, this.f39574x), 3), ta.v.g(d0Var, null, new b(vVar, null), 3));
                this.f39571u = 1;
                obj = ca.a.n(P0, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, ls.d dVar, boolean z10) {
        super(2, dVar);
        this.f39569v = vVar;
        this.f39570w = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new p(this.f39569v, dVar, this.f39570w);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((p) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39568u;
        v vVar = this.f39569v;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                a aVar2 = new a(vVar, null, this.f39570w);
                this.f39568u = 1;
                if (ta.v.S(cVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(vVar.D, e10);
        }
        return hs.k.f19476a;
    }
}
