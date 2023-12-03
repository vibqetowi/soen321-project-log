package zl;

import com.appsflyer.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
/* compiled from: ExpertCareViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareViewModel$getResources$1", f = "ExpertCareViewModel.kt", l = {R.styleable.AppCompatTheme_colorSwitchThumbNormal}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39592u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ v f39593v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ boolean f39594w;

    /* compiled from: ExpertCareViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareViewModel$getResources$1$1", f = "ExpertCareViewModel.kt", l = {R.styleable.AppCompatTheme_dialogTheme}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39595u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ boolean f39596v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ v f39597w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v vVar, ls.d dVar, boolean z10) {
            super(2, dVar);
            this.f39596v = z10;
            this.f39597w = vVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f39597w, dVar, this.f39596v);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39595u;
            v vVar = this.f39597w;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null) {
                    str = user.getCurrentCourseName();
                } else {
                    str = null;
                }
                if (this.f39596v) {
                    str2 = "therapy";
                } else {
                    str2 = "psychiatry";
                }
                if (str != null) {
                    yl.b bVar = vVar.f39602x;
                    this.f39595u = 1;
                    bVar.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ((wl.a) nr.b.a(wl.a.class)).a("https://api.theinnerhour.com/v1/domain_blogs", str2, str).I(new yl.c(hVar));
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return hs.k.f19476a;
            }
            vl.c cVar = (vl.c) obj;
            if (cVar != null) {
                vVar.f39604z.i(cVar);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, ls.d dVar, boolean z10) {
        super(2, dVar);
        this.f39593v = vVar;
        this.f39594w = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new t(this.f39593v, dVar, this.f39594w);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((t) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39592u;
        v vVar = this.f39593v;
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
                a aVar2 = new a(vVar, null, this.f39594w);
                this.f39592u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(vVar.D, e10);
        }
        return hs.k.f19476a;
    }
}
