package ml;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchData$1", f = "DashboardTelecommunicationsViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingStart}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class g extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25451u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f25452v;

    /* compiled from: DashboardTelecommunicationsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchData$1$1", f = "DashboardTelecommunicationsViewModel.kt", l = {R.styleable.AppCompatTheme_panelMenuListWidth, R.styleable.AppCompatTheme_popupMenuStyle, 90}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public rp.a f25453u;

        /* renamed from: v  reason: collision with root package name */
        public p f25454v;

        /* renamed from: w  reason: collision with root package name */
        public rp.a f25455w;

        /* renamed from: x  reason: collision with root package name */
        public p f25456x;

        /* renamed from: y  reason: collision with root package name */
        public int f25457y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ p f25458z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f25458z = pVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f25458z, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            rp.a aVar;
            rp.a aVar2;
            p pVar;
            p pVar2;
            rp.a aVar3;
            p pVar3;
            p pVar4;
            rp.a aVar4;
            p pVar5;
            ms.a aVar5 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25457y;
            p pVar6 = this.f25458z;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(pVar6.f25559z, e10);
            }
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            pVar5 = this.f25454v;
                            sp.b.d0(obj);
                            pVar5.C.i((ArrayList) obj);
                            pVar6.getClass();
                            ta.v.H(kc.f.H(pVar6), null, 0, new f(pVar6, null), 3);
                            p.e(pVar6);
                            return hs.k.f19476a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar3 = this.f25456x;
                    aVar3 = this.f25455w;
                    pVar4 = this.f25454v;
                    aVar4 = this.f25453u;
                    sp.b.d0(obj);
                    p.k(pVar3, (JSONObject) obj);
                    this.f25453u = aVar4;
                    this.f25454v = pVar4;
                    this.f25455w = null;
                    this.f25456x = null;
                    this.f25457y = 3;
                    obj = aVar3.c(this);
                    if (obj != aVar5) {
                        return aVar5;
                    }
                    pVar5 = pVar4;
                    pVar5.C.i((ArrayList) obj);
                    pVar6.getClass();
                    ta.v.H(kc.f.H(pVar6), null, 0, new f(pVar6, null), 3);
                    p.e(pVar6);
                    return hs.k.f19476a;
                }
                pVar = this.f25456x;
                aVar = this.f25455w;
                pVar2 = this.f25454v;
                aVar2 = this.f25453u;
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                rp.a aVar6 = pVar6.f25558y;
                this.f25453u = aVar6;
                this.f25454v = pVar6;
                this.f25455w = aVar6;
                this.f25456x = pVar6;
                this.f25457y = 1;
                Object h10 = aVar6.h(this);
                if (h10 == aVar5) {
                    return aVar5;
                }
                aVar = aVar6;
                aVar2 = aVar;
                obj = h10;
                pVar = pVar6;
                pVar2 = pVar;
            }
            p.l(pVar, (JSONObject) obj);
            this.f25453u = aVar2;
            this.f25454v = pVar2;
            this.f25455w = aVar;
            this.f25456x = pVar2;
            this.f25457y = 2;
            obj = aVar.f(this);
            if (obj == aVar5) {
                return aVar5;
            }
            aVar3 = aVar;
            pVar3 = pVar2;
            pVar4 = pVar3;
            aVar4 = aVar2;
            p.k(pVar3, (JSONObject) obj);
            this.f25453u = aVar4;
            this.f25454v = pVar4;
            this.f25455w = null;
            this.f25456x = null;
            this.f25457y = 3;
            obj = aVar3.c(this);
            if (obj != aVar5) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, ls.d<? super g> dVar) {
        super(2, dVar);
        this.f25452v = pVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new g(this.f25452v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25451u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f25452v, null);
            this.f25451u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
