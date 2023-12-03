package wo;

import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import com.theinnerhour.b2b.model.AngerCourse;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.DepressionCourse;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalDateObj;
import com.theinnerhour.b2b.model.HappinessCourse;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.PostsRead;
import com.theinnerhour.b2b.model.SleepCourse;
import com.theinnerhour.b2b.model.StressCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.UserAudioStatisticsDetail;
import com.theinnerhour.b2b.model.UserGamificationModel;
import com.theinnerhour.b2b.model.UserStatisticsModel;
import com.theinnerhour.b2b.model.WorryCourse;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.StatPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.o0;
/* compiled from: ExperimentProfileActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1", f = "ExperimentProfileActivityViewModel.kt", l = {R.styleable.AppCompatTheme_editTextColor}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class j0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36920u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n0 f36921v;

    /* compiled from: ExperimentProfileActivityViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1", f = "ExperimentProfileActivityViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemPaddingLeft}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super List<? extends hs.k>>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f36922u;

        /* renamed from: v  reason: collision with root package name */
        public /* synthetic */ Object f36923v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n0 f36924w;

        /* compiled from: ExperimentProfileActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1$10", f = "ExperimentProfileActivityViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightLarge}, m = "invokeSuspend")
        /* renamed from: wo.j0$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0619a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f36925u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ n0 f36926v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0619a(n0 n0Var, ls.d<? super C0619a> dVar) {
                super(2, dVar);
                this.f36926v = n0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0619a(this.f36926v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((C0619a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f36925u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f36925u = 1;
                    if (n0.f(this.f36926v, true, this) == aVar) {
                        return aVar;
                    }
                }
                return hs.k.f19476a;
            }
        }

        /* compiled from: ExperimentProfileActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1$11", f = "ExperimentProfileActivityViewModel.kt", l = {R.styleable.AppCompatTheme_listPreferredItemHeightSmall}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f36927u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ n0 f36928v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n0 n0Var, ls.d<? super b> dVar) {
                super(2, dVar);
                this.f36928v = n0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new b(this.f36928v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((b) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f36927u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    this.f36927u = 1;
                    if (n0.f(this.f36928v, false, this) == aVar) {
                        return aVar;
                    }
                }
                return hs.k.f19476a;
            }
        }

        /* compiled from: ExperimentProfileActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1$12", f = "ExperimentProfileActivityViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class c extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ n0 f36929u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(n0 n0Var, ls.d<? super c> dVar) {
                super(2, dVar);
                this.f36929u = n0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new c(this.f36929u, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((c) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                sp.b.d0(obj);
                n0 n0Var = this.f36929u;
                n0Var.getClass();
                ta.v.H(kc.f.H(n0Var), null, 0, new k0(n0Var, null), 3);
                return hs.k.f19476a;
            }
        }

        /* compiled from: ExperimentProfileActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1$1", f = "ExperimentProfileActivityViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class d extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ n0 f36930u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(n0 n0Var, ls.d<? super d> dVar) {
                super(2, dVar);
                this.f36930u = n0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new d(this.f36930u, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                long j10;
                User user;
                long j11;
                ArrayList<CourseDayModel> plan;
                ArrayList<CourseDayModel> plan2;
                ArrayList<CourseDayModel> plan3;
                ArrayList<CourseDayModel> plan4;
                ArrayList<CourseDayModel> plan5;
                ArrayList<CourseDayModel> plan6;
                String course;
                Object obj2;
                ArrayList<CourseDayModelV1> planV3;
                ArrayList<CourseDayModelV1> planV32;
                ArrayList<CourseDayModelV1> planV33;
                ArrayList<CourseDayModelV1> planV34;
                ArrayList<CourseDayModelV1> planV35;
                ArrayList<CourseDayModelV1> planV36;
                ArrayList<SuggestedActivityModel> planSuggested;
                ArrayList<SuggestedActivityModel> planSuggested2;
                ArrayList<SuggestedActivityModel> planSuggested3;
                ArrayList<SuggestedActivityModel> planSuggested4;
                ArrayList<SuggestedActivityModel> planSuggested5;
                ArrayList<SuggestedActivityModel> planSuggested6;
                HashMap<String, Object> appConfig;
                sp.b.d0(obj);
                n0 n0Var = this.f36930u;
                e0 e0Var = n0Var.f36970y;
                e0Var.getClass();
                try {
                    user = e0Var.f36883b;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e0Var.f36882a, e10);
                }
                if (user != null) {
                    Long[] lArr = new Long[6];
                    char c10 = 0;
                    int i6 = 0;
                    while (true) {
                        j11 = 0;
                        if (i6 >= 6) {
                            break;
                        }
                        lArr[i6] = 0L;
                        i6++;
                    }
                    if (kotlin.jvm.internal.i.b(user.getVersion(), Constants.USER_VERSION)) {
                        User user2 = FirebasePersistence.getInstance().getUser();
                        if (user2 != null && (appConfig = user2.getAppConfig()) != null) {
                            obj2 = appConfig.get(Constants.DASHBOARD_LIBRARY_EXPERIMENT);
                        } else {
                            obj2 = null;
                        }
                        if (obj2 != null && !kotlin.jvm.internal.i.b(obj2, "default")) {
                            AngerCourse anger = user.getAnger();
                            if (anger != null && (planSuggested6 = anger.getPlanSuggested()) != null) {
                                Iterator<T> it = planSuggested6.iterator();
                                while (it.hasNext()) {
                                    if (((SuggestedActivityModel) it.next()).getStart_date() != 0) {
                                        lArr[0] = Long.valueOf(lArr[0].longValue() + 1);
                                    }
                                }
                            }
                            DepressionCourse depression = user.getDepression();
                            if (depression != null && (planSuggested5 = depression.getPlanSuggested()) != null) {
                                Iterator<T> it2 = planSuggested5.iterator();
                                while (it2.hasNext()) {
                                    if (((SuggestedActivityModel) it2.next()).getStart_date() != 0) {
                                        lArr[1] = Long.valueOf(lArr[1].longValue() + 1);
                                    }
                                }
                            }
                            HappinessCourse happiness = user.getHappiness();
                            if (happiness != null && (planSuggested4 = happiness.getPlanSuggested()) != null) {
                                Iterator<T> it3 = planSuggested4.iterator();
                                while (it3.hasNext()) {
                                    if (((SuggestedActivityModel) it3.next()).getStart_date() != 0) {
                                        lArr[2] = Long.valueOf(lArr[2].longValue() + 1);
                                    }
                                }
                            }
                            SleepCourse sleep = user.getSleep();
                            if (sleep != null && (planSuggested3 = sleep.getPlanSuggested()) != null) {
                                Iterator<T> it4 = planSuggested3.iterator();
                                while (it4.hasNext()) {
                                    if (((SuggestedActivityModel) it4.next()).getStart_date() != 0) {
                                        lArr[3] = Long.valueOf(lArr[3].longValue() + 1);
                                    }
                                }
                            }
                            StressCourse stress = user.getStress();
                            if (stress != null && (planSuggested2 = stress.getPlanSuggested()) != null) {
                                Iterator<T> it5 = planSuggested2.iterator();
                                while (it5.hasNext()) {
                                    if (((SuggestedActivityModel) it5.next()).getStart_date() != 0) {
                                        lArr[4] = Long.valueOf(lArr[4].longValue() + 1);
                                    }
                                }
                            }
                            WorryCourse worry = user.getWorry();
                            if (worry != null && (planSuggested = worry.getPlanSuggested()) != null) {
                                Iterator<T> it6 = planSuggested.iterator();
                                while (it6.hasNext()) {
                                    if (((SuggestedActivityModel) it6.next()).getStart_date() != 0) {
                                        lArr[5] = Long.valueOf(lArr[5].longValue() + 1);
                                    }
                                }
                            }
                        } else {
                            AngerCourse anger2 = user.getAnger();
                            if (anger2 != null && (planV36 = anger2.getPlanV3()) != null) {
                                for (CourseDayModelV1 courseDayModelV1 : planV36) {
                                    if (courseDayModelV1.getStart_date() != 0) {
                                        if (kotlin.jvm.internal.i.b(courseDayModelV1.isAssessment(), Boolean.FALSE)) {
                                            lArr[0] = Long.valueOf(lArr[0].longValue() + 1);
                                        }
                                    }
                                }
                            }
                            DepressionCourse depression2 = user.getDepression();
                            if (depression2 != null && (planV35 = depression2.getPlanV3()) != null) {
                                for (CourseDayModelV1 courseDayModelV12 : planV35) {
                                    if (courseDayModelV12.getStart_date() != 0 && kotlin.jvm.internal.i.b(courseDayModelV12.isAssessment(), Boolean.FALSE)) {
                                        lArr[1] = Long.valueOf(lArr[1].longValue() + 1);
                                    }
                                }
                            }
                            HappinessCourse happiness2 = user.getHappiness();
                            if (happiness2 != null && (planV34 = happiness2.getPlanV3()) != null) {
                                for (CourseDayModelV1 courseDayModelV13 : planV34) {
                                    if (courseDayModelV13.getStart_date() != 0 && kotlin.jvm.internal.i.b(courseDayModelV13.isAssessment(), Boolean.FALSE)) {
                                        lArr[2] = Long.valueOf(lArr[2].longValue() + 1);
                                    }
                                }
                            }
                            SleepCourse sleep2 = user.getSleep();
                            if (sleep2 != null && (planV33 = sleep2.getPlanV3()) != null) {
                                for (CourseDayModelV1 courseDayModelV14 : planV33) {
                                    if (courseDayModelV14.getStart_date() != 0 && kotlin.jvm.internal.i.b(courseDayModelV14.isAssessment(), Boolean.FALSE)) {
                                        lArr[3] = Long.valueOf(lArr[3].longValue() + 1);
                                    }
                                }
                            }
                            StressCourse stress2 = user.getStress();
                            if (stress2 != null && (planV32 = stress2.getPlanV3()) != null) {
                                for (CourseDayModelV1 courseDayModelV15 : planV32) {
                                    if (courseDayModelV15.getStart_date() != 0 && kotlin.jvm.internal.i.b(courseDayModelV15.isAssessment(), Boolean.FALSE)) {
                                        lArr[4] = Long.valueOf(lArr[4].longValue() + 1);
                                    }
                                }
                            }
                            WorryCourse worry2 = user.getWorry();
                            if (worry2 != null && (planV3 = worry2.getPlanV3()) != null) {
                                for (CourseDayModelV1 courseDayModelV16 : planV3) {
                                    if (courseDayModelV16.getStart_date() != 0 && kotlin.jvm.internal.i.b(courseDayModelV16.isAssessment(), Boolean.FALSE)) {
                                        lArr[5] = Long.valueOf(lArr[5].longValue() + 1);
                                    }
                                }
                            }
                        }
                    } else {
                        AngerCourse anger3 = user.getAnger();
                        if (anger3 != null && (plan6 = anger3.getPlan()) != null) {
                            Iterator<T> it7 = plan6.iterator();
                            while (it7.hasNext()) {
                                if (((CourseDayModel) it7.next()).getStart_date() != 0) {
                                    lArr[0] = Long.valueOf(lArr[0].longValue() + 1);
                                }
                            }
                        }
                        DepressionCourse depression3 = user.getDepression();
                        if (depression3 != null && (plan5 = depression3.getPlan()) != null) {
                            Iterator<T> it8 = plan5.iterator();
                            while (it8.hasNext()) {
                                if (((CourseDayModel) it8.next()).getStart_date() != 0) {
                                    lArr[1] = Long.valueOf(lArr[1].longValue() + 1);
                                }
                            }
                        }
                        HappinessCourse happiness3 = user.getHappiness();
                        if (happiness3 != null && (plan4 = happiness3.getPlan()) != null) {
                            Iterator<T> it9 = plan4.iterator();
                            while (it9.hasNext()) {
                                if (((CourseDayModel) it9.next()).getStart_date() != 0) {
                                    lArr[2] = Long.valueOf(lArr[2].longValue() + 1);
                                }
                            }
                        }
                        SleepCourse sleep3 = user.getSleep();
                        if (sleep3 != null && (plan3 = sleep3.getPlan()) != null) {
                            Iterator<T> it10 = plan3.iterator();
                            while (it10.hasNext()) {
                                if (((CourseDayModel) it10.next()).getStart_date() != 0) {
                                    lArr[3] = Long.valueOf(lArr[3].longValue() + 1);
                                }
                            }
                        }
                        StressCourse stress3 = user.getStress();
                        if (stress3 != null && (plan2 = stress3.getPlan()) != null) {
                            Iterator<T> it11 = plan2.iterator();
                            while (it11.hasNext()) {
                                if (((CourseDayModel) it11.next()).getStart_date() != 0) {
                                    lArr[4] = Long.valueOf(lArr[4].longValue() + 1);
                                }
                            }
                        }
                        WorryCourse worry3 = user.getWorry();
                        if (worry3 != null && (plan = worry3.getPlan()) != null) {
                            Iterator<T> it12 = plan.iterator();
                            while (it12.hasNext()) {
                                if (((CourseDayModel) it12.next()).getStart_date() != 0) {
                                    lArr[5] = Long.valueOf(lArr[5].longValue() + 1);
                                }
                            }
                        }
                    }
                    ArrayList<MiniCourse> miniCourses = user.getMiniCourses();
                    if (miniCourses != null) {
                        for (MiniCourse miniCourse : miniCourses) {
                            Iterator<T> it13 = miniCourse.getPlan().iterator();
                            while (it13.hasNext()) {
                                if (((CourseDayModelV1) it13.next()).getStart_date() != j11 && (course = miniCourse.getCourse()) != null) {
                                    switch (course.hashCode()) {
                                        case -2114782937:
                                            if (course.equals(Constants.COURSE_HAPPINESS)) {
                                                lArr[2] = Long.valueOf(lArr[2].longValue() + 1);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case -1617042330:
                                            if (course.equals(Constants.COURSE_DEPRESSION)) {
                                                lArr[1] = Long.valueOf(lArr[1].longValue() + 1);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case -891989580:
                                            if (course.equals(Constants.COURSE_STRESS)) {
                                                lArr[4] = Long.valueOf(lArr[4].longValue() + 1);
                                                break;
                                            } else {
                                                break;
                                            }
                                        case 92960775:
                                            if (course.equals(Constants.COURSE_ANGER)) {
                                                lArr[c10] = Long.valueOf(lArr[c10].longValue() + 1);
                                            }
                                            break;
                                        case 109522647:
                                            if (course.equals(Constants.COURSE_SLEEP)) {
                                                lArr[3] = Long.valueOf(lArr[3].longValue() + 1);
                                            }
                                            break;
                                        case 113319009:
                                            if (course.equals(Constants.COURSE_WORRY)) {
                                                lArr[5] = Long.valueOf(lArr[5].longValue() + 1);
                                                break;
                                            } else {
                                                break;
                                            }
                                    }
                                    c10 = 0;
                                    j11 = 0;
                                }
                                c10 = 0;
                                j11 = 0;
                            }
                        }
                    }
                    StatPersistence.INSTANCE.updateUniqueActivitiesCount(lArr);
                    j10 = is.k.g2(lArr);
                    n0Var.A.i(new Long(j10));
                    return hs.k.f19476a;
                }
                j10 = -1;
                n0Var.A.i(new Long(j10));
                return hs.k.f19476a;
            }
        }

        /* compiled from: ExperimentProfileActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1$2", f = "ExperimentProfileActivityViewModel.kt", l = {R.styleable.AppCompatTheme_imageButtonStyle}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class e extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f36931u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ n0 f36932v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(n0 n0Var, ls.d<? super e> dVar) {
                super(2, dVar);
                this.f36932v = n0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new e(this.f36932v, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                Object s10;
                String courseName;
                String str;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f36931u;
                n0 n0Var = this.f36932v;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                        s10 = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    e0 e0Var = n0Var.f36970y;
                    this.f36931u = 1;
                    e0Var.getClass();
                    kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
                    kVar.u();
                    try {
                        Long[] lArr = new Long[8];
                        for (int i10 = 0; i10 < 8; i10++) {
                            lArr[i10] = new Long(0L);
                        }
                        User user = e0Var.f36883b;
                        if (user != null) {
                            if (sp.b.K()) {
                                FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("userStatistics/");
                                fd.f fVar = FirebaseAuth.getInstance().f;
                                if (fVar != null) {
                                    str = fVar.j0();
                                } else {
                                    str = null;
                                }
                                sb2.append(str);
                                firebaseDatabase.getReference(sb2.toString()).child("uniqueGoalTracks").addListenerForSingleValueEvent(new dw.m(kVar));
                            } else {
                                ArrayList<Goal> userGoals = user.getUserGoals();
                                if (userGoals != null) {
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj2 : userGoals) {
                                        if (((Goal) obj2).isVisible()) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        Goal goal = (Goal) it.next();
                                        for (GoalDateObj goalDateObj : goal.getTrackList()) {
                                            if (goalDateObj.getVal() == 2 && (courseName = goal.getCourseName()) != null) {
                                                switch (courseName.hashCode()) {
                                                    case -2114782937:
                                                        if (courseName.equals(Constants.COURSE_HAPPINESS)) {
                                                            lArr[2] = new Long(lArr[2].longValue() + 1);
                                                        }
                                                        break;
                                                    case -1617042330:
                                                        if (courseName.equals(Constants.COURSE_DEPRESSION)) {
                                                            lArr[1] = new Long(lArr[1].longValue() + 1);
                                                        }
                                                        break;
                                                    case -952207494:
                                                        if (courseName.equals("independent")) {
                                                            lArr[6] = new Long(lArr[6].longValue() + 1);
                                                        }
                                                        break;
                                                    case -891989580:
                                                        if (courseName.equals(Constants.COURSE_STRESS)) {
                                                            lArr[4] = new Long(lArr[4].longValue() + 1);
                                                        }
                                                        break;
                                                    case 92960775:
                                                        if (courseName.equals(Constants.COURSE_ANGER)) {
                                                            lArr[0] = new Long(lArr[0].longValue() + 1);
                                                        }
                                                        break;
                                                    case 109522647:
                                                        if (courseName.equals(Constants.COURSE_SLEEP)) {
                                                            lArr[3] = new Long(lArr[3].longValue() + 1);
                                                        }
                                                        break;
                                                    case 113319009:
                                                        if (courseName.equals(Constants.COURSE_WORRY)) {
                                                            lArr[5] = new Long(lArr[5].longValue() + 1);
                                                        }
                                                        break;
                                                    case 907087443:
                                                        if (courseName.equals(Constants.LIBRARY_GOAL_COURSE)) {
                                                            lArr[7] = new Long(lArr[7].longValue() + 1);
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                }
                                            }
                                        }
                                    }
                                }
                                StatPersistence.INSTANCE.updateGoalTrackCount(lArr);
                                if (kVar.a()) {
                                    kVar.resumeWith(new Long(is.k.g2(lArr)));
                                }
                            }
                        }
                    } catch (Exception e10) {
                        if (kVar.a()) {
                            kVar.resumeWith(new Long(0L));
                        }
                        LogHelper.INSTANCE.e(e0Var.f36882a, e10);
                    }
                    s10 = kVar.s();
                    if (s10 == aVar) {
                        return aVar;
                    }
                }
                n0Var.B.i(new Long(((Number) s10).longValue()));
                return hs.k.f19476a;
            }
        }

        /* compiled from: ExperimentProfileActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1$3", f = "ExperimentProfileActivityViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class f extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ n0 f36933u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(n0 n0Var, ls.d<? super f> dVar) {
                super(2, dVar);
                this.f36933u = n0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new f(this.f36933u, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                long j10;
                sp.b.d0(obj);
                n0 n0Var = this.f36933u;
                e0 e0Var = n0Var.f36970y;
                e0Var.getClass();
                try {
                    wn.b.f36765a.getClass();
                    j10 = wn.b.a();
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e0Var.f36882a, e10);
                    j10 = -1;
                }
                n0Var.C.i(new Long(j10));
                return hs.k.f19476a;
            }
        }

        /* compiled from: ExperimentProfileActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1$4", f = "ExperimentProfileActivityViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class g extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ n0 f36934u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(n0 n0Var, ls.d<? super g> dVar) {
                super(2, dVar);
                this.f36934u = n0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new g(this.f36934u, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                long j10;
                UserStatisticsModel statisticsModel;
                UserAudioStatisticsDetail audioMinutes;
                sp.b.d0(obj);
                n0 n0Var = this.f36934u;
                e0 e0Var = n0Var.f36970y;
                e0Var.getClass();
                try {
                    statisticsModel = StatPersistence.INSTANCE.getStatisticsModel();
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e0Var.f36882a, e10);
                }
                if (statisticsModel != null && (audioMinutes = statisticsModel.getAudioMinutes()) != null) {
                    j10 = audioMinutes.getTotal();
                    n0Var.D.i(new Long(j10));
                    return hs.k.f19476a;
                }
                j10 = 0;
                n0Var.D.i(new Long(j10));
                return hs.k.f19476a;
            }
        }

        /* compiled from: ExperimentProfileActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1$5", f = "ExperimentProfileActivityViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class h extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ n0 f36935u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(n0 n0Var, ls.d<? super h> dVar) {
                super(2, dVar);
                this.f36935u = n0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new h(this.f36935u, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                long j10;
                UserStatisticsModel statisticsModel;
                sp.b.d0(obj);
                n0 n0Var = this.f36935u;
                e0 e0Var = n0Var.f36970y;
                e0Var.getClass();
                try {
                    statisticsModel = StatPersistence.INSTANCE.getStatisticsModel();
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e0Var.f36882a, e10);
                }
                if (statisticsModel != null) {
                    j10 = statisticsModel.getAllieTaps();
                    n0Var.E.i(new Long(j10));
                    return hs.k.f19476a;
                }
                j10 = 0;
                n0Var.E.i(new Long(j10));
                return hs.k.f19476a;
            }
        }

        /* compiled from: ExperimentProfileActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1$6", f = "ExperimentProfileActivityViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class i extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ n0 f36936u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(n0 n0Var, ls.d<? super i> dVar) {
                super(2, dVar);
                this.f36936u = n0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new i(this.f36936u, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                long j10;
                User user;
                sp.b.d0(obj);
                n0 n0Var = this.f36936u;
                e0 e0Var = n0Var.f36970y;
                e0Var.getClass();
                try {
                    user = e0Var.f36883b;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e0Var.f36882a, e10);
                }
                if (user != null) {
                    Long[] lArr = new Long[7];
                    for (int i6 = 0; i6 < 7; i6++) {
                        lArr[i6] = 0L;
                    }
                    ArrayList<PostsRead> postsRead = user.getPostsRead();
                    if (postsRead != null) {
                        for (PostsRead postsRead2 : postsRead) {
                            String courseName = postsRead2.getCourseName();
                            if (courseName != null) {
                                switch (courseName.hashCode()) {
                                    case -2114782937:
                                        if (!courseName.equals(Constants.COURSE_HAPPINESS)) {
                                            break;
                                        } else {
                                            lArr[2] = Long.valueOf(lArr[2].longValue() + 1);
                                            continue;
                                        }
                                    case -1617042330:
                                        if (!courseName.equals(Constants.COURSE_DEPRESSION)) {
                                            break;
                                        } else {
                                            lArr[1] = Long.valueOf(lArr[1].longValue() + 1);
                                            continue;
                                        }
                                    case -891989580:
                                        if (!courseName.equals(Constants.COURSE_STRESS)) {
                                            break;
                                        } else {
                                            lArr[4] = Long.valueOf(lArr[4].longValue() + 1);
                                            continue;
                                        }
                                    case 92960775:
                                        if (!courseName.equals(Constants.COURSE_ANGER)) {
                                            break;
                                        } else {
                                            lArr[0] = Long.valueOf(lArr[0].longValue() + 1);
                                            continue;
                                        }
                                    case 109522647:
                                        if (!courseName.equals(Constants.COURSE_SLEEP)) {
                                            break;
                                        } else {
                                            lArr[3] = Long.valueOf(lArr[3].longValue() + 1);
                                            continue;
                                        }
                                    case 113319009:
                                        if (!courseName.equals(Constants.COURSE_WORRY)) {
                                            break;
                                        } else {
                                            lArr[5] = Long.valueOf(lArr[5].longValue() + 1);
                                            continue;
                                        }
                                }
                            }
                            lArr[6] = Long.valueOf(lArr[6].longValue() + 1);
                        }
                    }
                    StatPersistence.INSTANCE.updateResourcesReadCount(lArr);
                    j10 = is.k.g2(lArr);
                    n0Var.F.i(new Long(j10));
                    return hs.k.f19476a;
                }
                j10 = -1;
                n0Var.F.i(new Long(j10));
                return hs.k.f19476a;
            }
        }

        /* compiled from: ExperimentProfileActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1$7", f = "ExperimentProfileActivityViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class j extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ n0 f36937u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(n0 n0Var, ls.d<? super j> dVar) {
                super(2, dVar);
                this.f36937u = n0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new j(this.f36937u, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                Integer[] numArr;
                User user;
                int i6;
                int i10;
                int i11;
                int i12;
                int i13;
                ArrayList<CourseDayModel> plan;
                ArrayList<CourseDayModel> plan2;
                ArrayList<CourseDayModel> plan3;
                ArrayList<CourseDayModel> plan4;
                ArrayList<CourseDayModel> plan5;
                ArrayList<CourseDayModel> plan6;
                ArrayList<CourseDayModelV1> planV3;
                ArrayList<CourseDayModelV1> planV32;
                ArrayList<CourseDayModelV1> planV33;
                ArrayList<CourseDayModelV1> planV34;
                ArrayList<CourseDayModelV1> planV35;
                ArrayList<CourseDayModelV1> planV36;
                sp.b.d0(obj);
                n0 n0Var = this.f36937u;
                e0 e0Var = n0Var.f36970y;
                e0Var.getClass();
                try {
                    user = FirebasePersistence.getInstance().getUser();
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e0Var.f36882a, e10);
                }
                if (user != null) {
                    numArr = new Integer[6];
                    int i14 = -1;
                    if (user.getAnger() != null) {
                        i6 = 0;
                    } else {
                        i6 = -1;
                    }
                    numArr[0] = Integer.valueOf(i6);
                    if (user.getDepression() != null) {
                        i10 = 0;
                    } else {
                        i10 = -1;
                    }
                    numArr[1] = Integer.valueOf(i10);
                    if (user.getHappiness() != null) {
                        i11 = 0;
                    } else {
                        i11 = -1;
                    }
                    numArr[2] = Integer.valueOf(i11);
                    if (user.getSleep() != null) {
                        i12 = 0;
                    } else {
                        i12 = -1;
                    }
                    numArr[3] = Integer.valueOf(i12);
                    if (user.getStress() != null) {
                        i13 = 0;
                    } else {
                        i13 = -1;
                    }
                    numArr[4] = Integer.valueOf(i13);
                    if (user.getWorry() != null) {
                        i14 = 0;
                    }
                    numArr[5] = Integer.valueOf(i14);
                    AngerCourse anger = user.getAnger();
                    if (anger != null && (planV36 = anger.getPlanV3()) != null) {
                        Iterator<T> it = planV36.iterator();
                        while (it.hasNext()) {
                            if (((CourseDayModelV1) it.next()).getStart_date() != 0) {
                                numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                            }
                        }
                    }
                    DepressionCourse depression = user.getDepression();
                    if (depression != null && (planV35 = depression.getPlanV3()) != null) {
                        Iterator<T> it2 = planV35.iterator();
                        while (it2.hasNext()) {
                            if (((CourseDayModelV1) it2.next()).getStart_date() != 0) {
                                numArr[1] = Integer.valueOf(numArr[1].intValue() + 1);
                            }
                        }
                    }
                    HappinessCourse happiness = user.getHappiness();
                    if (happiness != null && (planV34 = happiness.getPlanV3()) != null) {
                        Iterator<T> it3 = planV34.iterator();
                        while (it3.hasNext()) {
                            if (((CourseDayModelV1) it3.next()).getStart_date() != 0) {
                                numArr[2] = Integer.valueOf(numArr[2].intValue() + 1);
                            }
                        }
                    }
                    SleepCourse sleep = user.getSleep();
                    if (sleep != null && (planV33 = sleep.getPlanV3()) != null) {
                        Iterator<T> it4 = planV33.iterator();
                        while (it4.hasNext()) {
                            if (((CourseDayModelV1) it4.next()).getStart_date() != 0) {
                                numArr[3] = Integer.valueOf(numArr[3].intValue() + 1);
                            }
                        }
                    }
                    StressCourse stress = user.getStress();
                    if (stress != null && (planV32 = stress.getPlanV3()) != null) {
                        Iterator<T> it5 = planV32.iterator();
                        while (it5.hasNext()) {
                            if (((CourseDayModelV1) it5.next()).getStart_date() != 0) {
                                numArr[4] = Integer.valueOf(numArr[4].intValue() + 1);
                            }
                        }
                    }
                    WorryCourse worry = user.getWorry();
                    if (worry != null && (planV3 = worry.getPlanV3()) != null) {
                        Iterator<T> it6 = planV3.iterator();
                        while (it6.hasNext()) {
                            if (((CourseDayModelV1) it6.next()).getStart_date() != 0) {
                                numArr[5] = Integer.valueOf(numArr[5].intValue() + 1);
                            }
                        }
                    }
                    AngerCourse anger2 = user.getAnger();
                    if (anger2 != null && (plan6 = anger2.getPlan()) != null) {
                        Iterator<T> it7 = plan6.iterator();
                        while (it7.hasNext()) {
                            if (((CourseDayModel) it7.next()).getStart_date() != 0) {
                                numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                            }
                        }
                    }
                    DepressionCourse depression2 = user.getDepression();
                    if (depression2 != null && (plan5 = depression2.getPlan()) != null) {
                        Iterator<T> it8 = plan5.iterator();
                        while (it8.hasNext()) {
                            if (((CourseDayModel) it8.next()).getStart_date() != 0) {
                                numArr[1] = Integer.valueOf(numArr[1].intValue() + 1);
                            }
                        }
                    }
                    HappinessCourse happiness2 = user.getHappiness();
                    if (happiness2 != null && (plan4 = happiness2.getPlan()) != null) {
                        Iterator<T> it9 = plan4.iterator();
                        while (it9.hasNext()) {
                            if (((CourseDayModel) it9.next()).getStart_date() != 0) {
                                numArr[2] = Integer.valueOf(numArr[2].intValue() + 1);
                            }
                        }
                    }
                    SleepCourse sleep2 = user.getSleep();
                    if (sleep2 != null && (plan3 = sleep2.getPlan()) != null) {
                        Iterator<T> it10 = plan3.iterator();
                        while (it10.hasNext()) {
                            if (((CourseDayModel) it10.next()).getStart_date() != 0) {
                                numArr[3] = Integer.valueOf(numArr[3].intValue() + 1);
                            }
                        }
                    }
                    StressCourse stress2 = user.getStress();
                    if (stress2 != null && (plan2 = stress2.getPlan()) != null) {
                        Iterator<T> it11 = plan2.iterator();
                        while (it11.hasNext()) {
                            if (((CourseDayModel) it11.next()).getStart_date() != 0) {
                                numArr[4] = Integer.valueOf(numArr[4].intValue() + 1);
                            }
                        }
                    }
                    WorryCourse worry2 = user.getWorry();
                    if (worry2 != null && (plan = worry2.getPlan()) != null) {
                        Iterator<T> it12 = plan.iterator();
                        while (it12.hasNext()) {
                            if (((CourseDayModel) it12.next()).getStart_date() != 0) {
                                numArr[5] = Integer.valueOf(numArr[5].intValue() + 1);
                            }
                        }
                    }
                    n0Var.G.i(numArr);
                    return hs.k.f19476a;
                }
                numArr = new Integer[0];
                n0Var.G.i(numArr);
                return hs.k.f19476a;
            }
        }

        /* compiled from: ExperimentProfileActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1$8", f = "ExperimentProfileActivityViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class k extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ n0 f36938u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(n0 n0Var, ls.d<? super k> dVar) {
                super(2, dVar);
                this.f36938u = n0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new k(this.f36938u, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((k) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                Boolean[] boolArr;
                User user;
                UserGamificationModel userGamificationModel;
                HashMap<String, String> badges;
                sp.b.d0(obj);
                n0 n0Var = this.f36938u;
                e0 e0Var = n0Var.f36970y;
                e0Var.getClass();
                try {
                    user = e0Var.f36883b;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e0Var.f36882a, e10);
                }
                if (user != null && (userGamificationModel = user.getUserGamificationModel()) != null && (badges = userGamificationModel.getBadges()) != null) {
                    boolArr = new Boolean[]{Boolean.valueOf(badges.containsKey(Constants.REACHED_100_POINTS_BADGE)), Boolean.valueOf(badges.containsKey(Constants.TRACKING_YOUR_MOOD_BADGE)), Boolean.valueOf(badges.containsKey(Constants.SCHEDULED_AN_ACTIVITY_BADGE)), Boolean.valueOf(badges.containsKey(Constants.REACHED_500_POINTS_BADGE)), Boolean.valueOf(badges.containsKey(Constants.TRACKING_GOALS_FOR_A_WEEK_BADGE)), Boolean.valueOf(badges.containsKey(Constants.REACHED_1000_POINTS_BADGE)), Boolean.valueOf(badges.containsKey(Constants.HAPPINESS_GO_GETTER_BADGE)), Boolean.valueOf(badges.containsKey(Constants.SHARE_APP_BADGE))};
                    n0Var.H.i(boolArr);
                    return hs.k.f19476a;
                }
                boolArr = new Boolean[0];
                n0Var.H.i(boolArr);
                return hs.k.f19476a;
            }
        }

        /* compiled from: ExperimentProfileActivityViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchData$1$1$9", f = "ExperimentProfileActivityViewModel.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class l extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ n0 f36939u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(n0 n0Var, ls.d<? super l> dVar) {
                super(2, dVar);
                this.f36939u = n0Var;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new l(this.f36939u, dVar);
            }

            @Override // ss.p
            public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
                return ((l) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                Integer[] numArr;
                User user;
                sp.b.d0(obj);
                n0 n0Var = this.f36939u;
                e0 e0Var = n0Var.f36970y;
                e0Var.getClass();
                try {
                    user = e0Var.f36883b;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(e0Var.f36882a, e10);
                }
                if (user != null) {
                    numArr = new Integer[4];
                    for (int i6 = 0; i6 < 4; i6++) {
                        numArr[i6] = 0;
                    }
                    int totalGamificationPoints = user.getUserGamificationModel().getTotalGamificationPoints();
                    int i10 = 25;
                    int i11 = 1;
                    while (totalGamificationPoints >= i10) {
                        i10 *= 2;
                        i11++;
                    }
                    numArr[0] = Integer.valueOf(i11);
                    numArr[1] = Integer.valueOf(totalGamificationPoints);
                    numArr[2] = Integer.valueOf(i10 - totalGamificationPoints);
                    numArr[3] = Integer.valueOf(i10);
                    n0Var.I.i(numArr);
                    return hs.k.f19476a;
                }
                numArr = new Integer[0];
                n0Var.I.i(numArr);
                return hs.k.f19476a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n0 n0Var, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f36924w = n0Var;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            a aVar = new a(this.f36924w, dVar);
            aVar.f36923v = obj;
            return aVar;
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super List<? extends hs.k>> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f36922u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.d0 d0Var = (kotlinx.coroutines.d0) this.f36923v;
                n0 n0Var = this.f36924w;
                List P0 = ca.a.P0(ta.v.g(d0Var, null, new d(n0Var, null), 3), ta.v.g(d0Var, null, new e(n0Var, null), 3), ta.v.g(d0Var, null, new f(n0Var, null), 3), ta.v.g(d0Var, null, new g(n0Var, null), 3), ta.v.g(d0Var, null, new h(n0Var, null), 3), ta.v.g(d0Var, null, new i(n0Var, null), 3), ta.v.g(d0Var, null, new j(n0Var, null), 3), ta.v.g(d0Var, null, new k(n0Var, null), 3), ta.v.g(d0Var, null, new l(n0Var, null), 3), ta.v.g(d0Var, null, new C0619a(n0Var, null), 3), ta.v.g(d0Var, null, new b(n0Var, null), 3), ta.v.g(d0Var, null, new c(n0Var, null), 3));
                this.f36922u = 1;
                obj = ca.a.n(P0, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n0 n0Var, ls.d<? super j0> dVar) {
        super(2, dVar);
        this.f36921v = n0Var;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new j0(this.f36921v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((j0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36920u;
        n0 n0Var = this.f36921v;
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
                a aVar2 = new a(n0Var, null);
                this.f36920u = 1;
                if (ta.v.S(cVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(n0Var.f36971z, e10);
        }
        return hs.k.f19476a;
    }
}
