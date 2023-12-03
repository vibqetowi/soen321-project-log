package zl;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import org.json.JSONObject;
/* compiled from: ExpertCareDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchData$1", f = "ExpertCareDashboardViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingLeft}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39508u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f39509v;

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchData$1$1", f = "ExpertCareDashboardViewModel.kt", l = {86, R.styleable.AppCompatTheme_panelMenuListTheme}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super Object>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public rp.a f39510u;

        /* renamed from: v  reason: collision with root package name */
        public o f39511v;

        /* renamed from: w  reason: collision with root package name */
        public rp.a f39512w;

        /* renamed from: x  reason: collision with root package name */
        public o f39513x;

        /* renamed from: y  reason: collision with root package name */
        public int f39514y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ o f39515z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f39515z = oVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f39515z, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super Object> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            rp.a aVar;
            rp.a aVar2;
            o oVar;
            o oVar2;
            o oVar3;
            rp.a aVar3;
            ms.a aVar4 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39514y;
            o oVar4 = this.f39515z;
            try {
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            oVar3 = this.f39511v;
                            aVar3 = this.f39510u;
                            sp.b.d0(obj);
                            o.k(oVar3, (JSONObject) obj);
                            return aVar3;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = this.f39513x;
                    aVar = this.f39512w;
                    oVar2 = this.f39511v;
                    aVar2 = this.f39510u;
                    sp.b.d0(obj);
                } else {
                    sp.b.d0(obj);
                    rp.a aVar5 = oVar4.f39565x;
                    this.f39510u = aVar5;
                    this.f39511v = oVar4;
                    this.f39512w = aVar5;
                    this.f39513x = oVar4;
                    this.f39514y = 1;
                    Object h10 = aVar5.h(this);
                    if (h10 == aVar4) {
                        return aVar4;
                    }
                    aVar = aVar5;
                    aVar2 = aVar;
                    obj = h10;
                    oVar = oVar4;
                    oVar2 = oVar;
                }
                o.l(oVar, (JSONObject) obj);
                this.f39510u = aVar2;
                this.f39511v = oVar2;
                this.f39512w = null;
                this.f39513x = null;
                this.f39514y = 2;
                obj = aVar.f(this);
                if (obj == aVar4) {
                    return aVar4;
                }
                oVar3 = oVar2;
                aVar3 = aVar2;
                o.k(oVar3, (JSONObject) obj);
                return aVar3;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(oVar4.f39566y, e10);
                return hs.k.f19476a;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, ls.d<? super h> dVar) {
        super(2, dVar);
        this.f39509v = oVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new h(this.f39509v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39508u;
        o oVar = this.f39509v;
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
                a aVar2 = new a(oVar, null);
                this.f39508u = 1;
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
