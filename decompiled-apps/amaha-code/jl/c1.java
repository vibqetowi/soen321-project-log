package jl;

import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$fetchLatestJournalEntry$1", f = "NotV4DashboardViewModel.kt", l = {893}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class c1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22108u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pm.a f22109v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f22110w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22111x;

    /* compiled from: NotV4DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$fetchLatestJournalEntry$1$1", f = "NotV4DashboardViewModel.kt", l = {894}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22112u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ pm.a f22113v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f22114w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ NotV4DashboardViewModel f22115x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pm.a aVar, String str, NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22113v = aVar;
            this.f22114w = str;
            this.f22115x = notV4DashboardViewModel;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22113v, this.f22114w, this.f22115x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22112u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f22112u = 1;
                obj = this.f22113v.b(this.f22114w, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            JournalModel journalModel = (JournalModel) obj;
            if (journalModel != null) {
                ((androidx.lifecycle.w) this.f22115x.f10858g0.getValue()).i(journalModel);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(pm.a aVar, String str, NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super c1> dVar) {
        super(2, dVar);
        this.f22109v = aVar;
        this.f22110w = str;
        this.f22111x = notV4DashboardViewModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new c1(this.f22109v, this.f22110w, this.f22111x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((c1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22108u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
            a aVar2 = new a(this.f22109v, this.f22110w, this.f22111x, null);
            this.f22108u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
