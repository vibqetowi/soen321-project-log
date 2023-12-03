package ml;

import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkResponseModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
/* compiled from: DashboardTelecommunicationsViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchPendingInitialAssessment$2$1", f = "DashboardTelecommunicationsViewModel.kt", l = {404}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f25483u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f25484v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.j<Boolean> f25485w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f25486x;

    /* compiled from: DashboardTelecommunicationsViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.DashboardTelecommunicationsViewModel$fetchPendingInitialAssessment$2$1$1", f = "DashboardTelecommunicationsViewModel.kt", l = {405}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25487u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f25488v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p f25489w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ boolean f25490x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<Boolean> f25491y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, ls.d dVar, kotlinx.coroutines.j jVar, boolean z10) {
            super(2, dVar);
            this.f25489w = pVar;
            this.f25490x = z10;
            this.f25491y = jVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            boolean z10 = this.f25490x;
            a aVar = new a(this.f25489w, dVar, this.f25491y, z10);
            aVar.f25488v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            boolean z11;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25487u;
            boolean z12 = this.f25490x;
            p pVar = this.f25489w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f25488v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                rp.a aVar2 = pVar.f25558y;
                this.f25488v = (kotlinx.coroutines.d0) this.f25488v;
                this.f25487u = 1;
                obj = aVar2.e(true, z12, 1, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            TelecommunicationsHomeworkResponseModel telecommunicationsHomeworkResponseModel = (TelecommunicationsHomeworkResponseModel) obj;
            kotlinx.coroutines.j<Boolean> jVar = this.f25491y;
            hs.k kVar = null;
            TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel = null;
            if (telecommunicationsHomeworkResponseModel != null) {
                TelecommunicationsHomeworkResponseModel.HomeworkModel initialAssessment = telecommunicationsHomeworkResponseModel.getInitialAssessment();
                boolean z13 = false;
                if (initialAssessment != null) {
                    String id2 = initialAssessment.getId();
                    if (id2 != null && !gv.n.B0(id2)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (!z10 && kotlin.jvm.internal.i.b(initialAssessment.getStatus(), "assigned")) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        homeworkModel = initialAssessment;
                    }
                    if (homeworkModel != null) {
                        if (z12) {
                            pVar.M = homeworkModel;
                            pVar.T = true;
                        } else {
                            pVar.N = homeworkModel;
                            pVar.U = true;
                        }
                    }
                }
                ArrayList<TelecommunicationsHomeworkResponseModel.HomeworkModel> homeworkList = telecommunicationsHomeworkResponseModel.getHomeworkList();
                if (!((homeworkList == null || homeworkList.isEmpty()) ? true : true)) {
                    if (z12) {
                        pVar.T = true;
                    } else {
                        pVar.U = true;
                    }
                }
                if (kotlin.jvm.internal.i.b(telecommunicationsHomeworkResponseModel.getVerificationStatus(), "pending")) {
                    if (z12) {
                        pVar.T = true;
                    } else {
                        pVar.U = true;
                    }
                }
                jVar.resumeWith(Boolean.TRUE);
                kVar = hs.k.f19476a;
            }
            if (kVar == null) {
                jVar.resumeWith(Boolean.FALSE);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, ls.d dVar, kotlinx.coroutines.j jVar, boolean z10) {
        super(2, dVar);
        this.f25484v = pVar;
        this.f25485w = jVar;
        this.f25486x = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new j(this.f25484v, dVar, this.f25485w, this.f25486x);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f25483u;
        p pVar = this.f25484v;
        kotlinx.coroutines.j<Boolean> jVar = this.f25485w;
        try {
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
                a aVar2 = new a(pVar, null, jVar, this.f25486x);
                this.f25483u = 1;
                if (ta.v.S(bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(pVar.f25559z, e10);
            if (jVar.a()) {
                jVar.resumeWith(Boolean.FALSE);
            }
        }
        return hs.k.f19476a;
    }
}
