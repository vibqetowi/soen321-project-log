package zl;

import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.network.model.TelecommunicationsHomeworkResponseModel;
import com.theinnerhour.b2b.network.model.UpcomingBooking;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
/* compiled from: ExpertCareDashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchToolList$1", f = "ExpertCareDashboardViewModel.kt", l = {165}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f39547u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o f39548v;

    /* compiled from: ExpertCareDashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchToolList$1$1", f = "ExpertCareDashboardViewModel.kt", l = {170}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f39549u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f39550v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ o f39551w;

        /* compiled from: ExpertCareDashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchToolList$1$1$1", f = "ExpertCareDashboardViewModel.kt", l = {167}, m = "invokeSuspend")
        /* renamed from: zl.m$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0677a extends ns.i implements ss.p<d0, ls.d<? super TelecommunicationsHomeworkResponseModel>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f39552u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ o f39553v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0677a(o oVar, ls.d<? super C0677a> dVar) {
                super(2, dVar);
                this.f39553v = oVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0677a(this.f39553v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super TelecommunicationsHomeworkResponseModel> dVar) {
                return ((C0677a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f39552u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f39552u = 1;
                    obj = o.i(this.f39553v, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: ExpertCareDashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchToolList$1$1$2", f = "ExpertCareDashboardViewModel.kt", l = {168}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends ns.i implements ss.p<d0, ls.d<? super TelecommunicationsHomeworkResponseModel>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f39554u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ o f39555v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o oVar, ls.d<? super b> dVar) {
                super(2, dVar);
                this.f39555v = oVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new b(this.f39555v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super TelecommunicationsHomeworkResponseModel> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f39554u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f39554u = 1;
                    obj = o.i(this.f39555v, false, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: ExpertCareDashboardViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.expertCare.viewmodel.ExpertCareDashboardViewModel$fetchToolList$1$1$3", f = "ExpertCareDashboardViewModel.kt", l = {169}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends ns.i implements ss.p<d0, ls.d<? super Boolean>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f39556u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ o f39557v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(o oVar, ls.d<? super c> dVar) {
                super(2, dVar);
                this.f39557v = oVar;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new c(this.f39557v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super Boolean> dVar) {
                return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f39556u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f39556u = 1;
                    o oVar = this.f39557v;
                    oVar.getClass();
                    ls.h hVar = new ls.h(ca.a.G0(this));
                    ta.v.H(kc.f.H(oVar), null, 0, new f(oVar, hVar, null), 3);
                    obj = hVar.b();
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        /* compiled from: Comparisons.kt */
        /* loaded from: classes2.dex */
        public static final class d<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t3, T t10) {
                Long l2;
                TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel = ((vl.f) t3).f35272c;
                Long l10 = null;
                if (homeworkModel != null) {
                    l2 = homeworkModel.getEpochSortKey();
                } else {
                    l2 = null;
                }
                TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel2 = ((vl.f) t10).f35272c;
                if (homeworkModel2 != null) {
                    l10 = homeworkModel2.getEpochSortKey();
                }
                return sp.b.g(l2, l10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f39551w = oVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f39551w, dVar);
            aVar.f39550v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            Object n10;
            boolean z10;
            boolean z11;
            Object j22;
            List<UpcomingBooking> list;
            Integer num;
            TherapistPackagesModel peekContent;
            Integer num2;
            hs.f<TherapistPackagesModel, TherapistPackagesModel> peekContent2;
            TherapistPackagesModel therapistPackagesModel;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f39549u;
            o oVar = this.f39551w;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                    n10 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var = (d0) this.f39550v;
                ArrayList k10 = ca.a.k(ta.v.g(d0Var, null, new C0677a(oVar, null), 3), ta.v.g(d0Var, null, new b(oVar, null), 3), ta.v.g(d0Var, null, new c(oVar, null), 3));
                this.f39549u = 1;
                n10 = ca.a.n(k10, this);
                if (n10 == aVar) {
                    return aVar;
                }
            }
            List list2 = (List) n10;
            try {
                oVar.N.clear();
                ArrayList<UpcomingBooking> arrayList = oVar.L;
                arrayList.clear();
                ArrayList<UpcomingBooking> arrayList2 = oVar.O;
                arrayList2.clear();
                ArrayList<UpcomingBooking> arrayList3 = oVar.M;
                arrayList3.clear();
                ArrayList arrayList4 = new ArrayList();
                if ((!list2.isEmpty()) && (j22 = is.u.j2(2, list2)) != null && ((Boolean) j22).booleanValue() && (list = oVar.K) != null) {
                    for (UpcomingBooking upcomingBooking : list) {
                        if (kotlin.jvm.internal.i.b(upcomingBooking.getBookingtype(), "single")) {
                            if (upcomingBooking.getTherapistId() != null) {
                                Integer therapistId = upcomingBooking.getTherapistId();
                                SingleUseEvent<hs.f<TherapistPackagesModel, TherapistPackagesModel>> d10 = oVar.f39567z.d();
                                if (d10 != null && (peekContent2 = d10.peekContent()) != null && (therapistPackagesModel = peekContent2.f19464u) != null) {
                                    num2 = new Integer(therapistPackagesModel.getId());
                                } else {
                                    num2 = null;
                                }
                                if (kotlin.jvm.internal.i.b(therapistId, num2)) {
                                    if (kotlin.jvm.internal.i.b(upcomingBooking.getStatus(), "cancel")) {
                                        oVar.N.add(upcomingBooking);
                                    } else {
                                        arrayList.add(upcomingBooking);
                                    }
                                }
                            }
                            if (upcomingBooking.getPsychiatristId() != null) {
                                Integer psychiatristId = upcomingBooking.getPsychiatristId();
                                SingleUseEvent<TherapistPackagesModel> d11 = oVar.A.d();
                                if (d11 != null && (peekContent = d11.peekContent()) != null) {
                                    num = new Integer(peekContent.getId());
                                } else {
                                    num = null;
                                }
                                if (kotlin.jvm.internal.i.b(psychiatristId, num)) {
                                    if (kotlin.jvm.internal.i.b(upcomingBooking.getStatus(), "cancel")) {
                                        arrayList2.add(upcomingBooking);
                                    } else {
                                        arrayList3.add(upcomingBooking);
                                    }
                                }
                            }
                        }
                    }
                }
                Iterator it = o.m(oVar).iterator();
                while (it.hasNext()) {
                    arrayList4.add((vl.f) it.next());
                }
                ArrayList arrayList5 = new ArrayList();
                if (!list2.isEmpty()) {
                    Object j23 = is.u.j2(0, list2);
                    if (j23 != null) {
                        TelecommunicationsHomeworkResponseModel telecommunicationsHomeworkResponseModel = (TelecommunicationsHomeworkResponseModel) j23;
                        TelecommunicationsHomeworkResponseModel.HomeworkModel initialAssessment = telecommunicationsHomeworkResponseModel.getInitialAssessment();
                        if (initialAssessment != null) {
                            if (initialAssessment.getId() == null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                initialAssessment = null;
                            }
                            if (initialAssessment != null) {
                                arrayList4.add(new vl.f(0, true, initialAssessment));
                            }
                        }
                        for (TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel : telecommunicationsHomeworkResponseModel.getHomeworkList()) {
                            arrayList5.add(new vl.f(6, true, homeworkModel));
                        }
                    }
                    Object j24 = is.u.j2(1, list2);
                    if (j24 != null) {
                        TelecommunicationsHomeworkResponseModel telecommunicationsHomeworkResponseModel2 = (TelecommunicationsHomeworkResponseModel) j24;
                        TelecommunicationsHomeworkResponseModel.HomeworkModel initialAssessment2 = telecommunicationsHomeworkResponseModel2.getInitialAssessment();
                        if (initialAssessment2 != null) {
                            if (initialAssessment2.getId() == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                initialAssessment2 = null;
                            }
                            if (initialAssessment2 != null) {
                                arrayList4.add(new vl.f(1, false, initialAssessment2, 2));
                            }
                        }
                        for (TelecommunicationsHomeworkResponseModel.HomeworkModel homeworkModel2 : telecommunicationsHomeworkResponseModel2.getHomeworkList()) {
                            arrayList5.add(new vl.f(6, false, homeworkModel2));
                        }
                    }
                    arrayList4.addAll(is.u.D2(arrayList5, new d()));
                    oVar.B.i(new SingleUseEvent<>(arrayList4));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(oVar.f39566y, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, ls.d<? super m> dVar) {
        super(2, dVar);
        this.f39548v = oVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new m(this.f39548v, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((m) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f39547u;
        o oVar = this.f39548v;
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
                this.f39547u = 1;
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
