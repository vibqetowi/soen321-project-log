package ml;

import com.theinnerhour.b2b.network.model.TelecommunicationHomeworkNotification;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$getHomeworkNotificationsList$2$1", f = "DashboardTelecommunicationsViewModel.kt", l = {219}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class o extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25547u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f25548v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Integer f25549w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f25550x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f25551y;

    /* compiled from: DashboardTelecommunicationsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$getHomeworkNotificationsList$2$1$1", f = "DashboardTelecommunicationsViewModel.kt", l = {220}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25552u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f25553v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p f25554w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Integer f25555x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f25556y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f25557z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p pVar, Integer num, String str, ls.d<? super Boolean> dVar, ls.d<? super a> dVar2) {
            super(2, dVar2);
            this.f25554w = pVar;
            this.f25555x = num;
            this.f25556y = str;
            this.f25557z = dVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f25554w, this.f25555x, this.f25556y, this.f25557z, dVar);
            aVar.f25553v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25552u;
            hs.k kVar = null;
            p pVar = this.f25554w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f25553v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                rp.a aVar2 = pVar.f25558y;
                int intValue = this.f25555x.intValue();
                this.f25553v = (kotlinx.coroutines.d0) this.f25553v;
                this.f25552u = 1;
                aVar2.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                try {
                    ((or.i) nr.b.a(or.i.class)).e("https://api.theinnerhour.com/v1/bse/notifications", 1, 20, intValue).I(new rp.e(aVar2, hVar));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(aVar2.f30847b, e10);
                    hVar.resumeWith(null);
                }
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            ArrayList<TelecommunicationHomeworkNotification> arrayList = (ArrayList) obj;
            ls.d<Boolean> dVar = this.f25557z;
            if (arrayList != null) {
                String str = this.f25556y;
                if (kotlin.jvm.internal.i.b(str, "therapist")) {
                    pVar.D = arrayList;
                } else if (kotlin.jvm.internal.i.b(str, "psychiatrist")) {
                    pVar.E = arrayList;
                }
                dVar.resumeWith(Boolean.TRUE);
                kVar = hs.k.f19476a;
            }
            if (kVar == null) {
                dVar.resumeWith(Boolean.FALSE);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(p pVar, Integer num, String str, ls.d<? super Boolean> dVar, ls.d<? super o> dVar2) {
        super(2, dVar2);
        this.f25548v = pVar;
        this.f25549w = num;
        this.f25550x = str;
        this.f25551y = dVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new o(this.f25548v, this.f25549w, this.f25550x, this.f25551y, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((o) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25547u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f25548v, this.f25549w, this.f25550x, this.f25551y, null);
            this.f25547u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
