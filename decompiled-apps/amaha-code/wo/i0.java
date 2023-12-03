package wo;

import com.theinnerhour.b2b.model.AngerCourse;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.DepressionCourse;
import com.theinnerhour.b2b.model.HappinessCourse;
import com.theinnerhour.b2b.model.SleepCourse;
import com.theinnerhour.b2b.model.StressCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.WorryCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import kotlinx.coroutines.o0;
/* compiled from: ExperimentProfileActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchBookmarkedActivities$1", f = "ExperimentProfileActivityViewModel.kt", l = {324}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class i0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36911u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n0 f36912v;

    /* compiled from: ExperimentProfileActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchBookmarkedActivities$1$1", f = "ExperimentProfileActivityViewModel.kt", l = {325}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f36913u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f36914v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n0 f36915w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n0 n0Var, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f36915w = n0Var;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f36915w, dVar);
            aVar.f36914v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            hs.k kVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f36913u;
            n0 n0Var = this.f36915w;
            if (i6 != 0) {
                if (i6 == 1) {
                    kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f36914v;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                e0 e0Var = n0Var.f36970y;
                this.f36914v = (kotlinx.coroutines.d0) this.f36914v;
                this.f36913u = 1;
                e0Var.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                try {
                    User user = FirebasePersistence.getInstance().getUser();
                    ArrayList arrayList = new ArrayList();
                    AngerCourse anger = user.getAnger();
                    if (anger != null) {
                        ArrayList<CourseDayModelV1> planV3 = anger.getPlanV3();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : planV3) {
                            if (((CourseDayModelV1) obj2).isFavorite()) {
                                arrayList2.add(obj2);
                            }
                        }
                        arrayList.addAll(e0.a(Constants.COURSE_ANGER, arrayList2));
                    }
                    DepressionCourse depression = user.getDepression();
                    if (depression != null) {
                        ArrayList<CourseDayModelV1> planV32 = depression.getPlanV3();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : planV32) {
                            if (((CourseDayModelV1) obj3).isFavorite()) {
                                arrayList3.add(obj3);
                            }
                        }
                        arrayList.addAll(e0.a(Constants.COURSE_DEPRESSION, arrayList3));
                    }
                    StressCourse stress = user.getStress();
                    if (stress != null) {
                        ArrayList<CourseDayModelV1> planV33 = stress.getPlanV3();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : planV33) {
                            if (((CourseDayModelV1) obj4).isFavorite()) {
                                arrayList4.add(obj4);
                            }
                        }
                        arrayList.addAll(e0.a(Constants.COURSE_STRESS, arrayList4));
                    }
                    HappinessCourse happiness = user.getHappiness();
                    if (happiness != null) {
                        ArrayList<CourseDayModelV1> planV34 = happiness.getPlanV3();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj5 : planV34) {
                            if (((CourseDayModelV1) obj5).isFavorite()) {
                                arrayList5.add(obj5);
                            }
                        }
                        arrayList.addAll(e0.a(Constants.COURSE_HAPPINESS, arrayList5));
                    }
                    SleepCourse sleep = user.getSleep();
                    if (sleep != null) {
                        ArrayList<CourseDayModelV1> planV35 = sleep.getPlanV3();
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj6 : planV35) {
                            if (((CourseDayModelV1) obj6).isFavorite()) {
                                arrayList6.add(obj6);
                            }
                        }
                        arrayList.addAll(e0.a(Constants.COURSE_SLEEP, arrayList6));
                    }
                    WorryCourse worry = user.getWorry();
                    if (worry != null) {
                        ArrayList<CourseDayModelV1> planV36 = worry.getPlanV3();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj7 : planV36) {
                            if (((CourseDayModelV1) obj7).isFavorite()) {
                                arrayList7.add(obj7);
                            }
                        }
                        arrayList.addAll(e0.a(Constants.COURSE_WORRY, arrayList7));
                    }
                    if (arrayList.size() > 1) {
                        is.p.P1(arrayList, new b0());
                    }
                    hVar.resumeWith(arrayList);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e0Var.f36882a, "exception", e10);
                }
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            ArrayList<CourseDayDomainModelV1> arrayList8 = (ArrayList) obj;
            if (arrayList8 != null) {
                n0Var.O.i(arrayList8);
                kVar = hs.k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                n0Var.O.i(null);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(n0 n0Var, ls.d<? super i0> dVar) {
        super(2, dVar);
        this.f36912v = n0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new i0(this.f36912v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((i0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36911u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
            a aVar2 = new a(this.f36912v, null);
            this.f36911u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
