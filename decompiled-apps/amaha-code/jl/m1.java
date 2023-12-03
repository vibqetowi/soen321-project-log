package jl;

import android.content.Context;
import com.theinnerhour.b2b.components.assessments.model.SuggestedDataModel;
import com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel;
import com.theinnerhour.b2b.model.AssessmentResponseAll;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: NotV4DashboardViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$requestPlanLoadingRetry$1", f = "NotV4DashboardViewModel.kt", l = {601}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m1 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f22268u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ NotV4DashboardViewModel f22269v;

    /* compiled from: NotV4DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$requestPlanLoadingRetry$1$1", f = "NotV4DashboardViewModel.kt", l = {609, 621}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public Object f22270u;

        /* renamed from: v  reason: collision with root package name */
        public Course f22271v;

        /* renamed from: w  reason: collision with root package name */
        public int f22272w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ NotV4DashboardViewModel f22273x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f22273x = notV4DashboardViewModel;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f22273x, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
        /* JADX WARN: Type inference failed for: r0v6, types: [androidx.lifecycle.w] */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            boolean z10;
            androidx.lifecycle.w<Boolean> wVar;
            Object obj2;
            FirebasePersistence firebasePersistence;
            Course course;
            BufferedReader bufferedReader;
            HashMap<String, Object> appConfig;
            HashMap<String, Object> appConfig2;
            SuggestedDataModel suggestedDataModel;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22272w;
            NotV4DashboardViewModel notV4DashboardViewModel = this.f22273x;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        wVar = (androidx.lifecycle.w) this.f22270u;
                        sp.b.d0(obj);
                        wVar.i(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    course = this.f22271v;
                    firebasePersistence = (FirebasePersistence) this.f22270u;
                    sp.b.d0(obj);
                    suggestedDataModel = (SuggestedDataModel) obj;
                    if (suggestedDataModel.getData().size() <= 0) {
                        course.setSet(suggestedDataModel.getSet());
                        course.setPlanSuggested(suggestedDataModel.getData());
                        firebasePersistence.updateUserOnFirebase();
                        notV4DashboardViewModel.p().i(Boolean.FALSE);
                    } else {
                        notV4DashboardViewModel.p().i(Boolean.FALSE);
                    }
                }
            } else {
                sp.b.d0(obj);
                User user = FirebasePersistence.getInstance().getUser();
                if (user != null && (appConfig2 = user.getAppConfig()) != null && appConfig2.containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    User user2 = FirebasePersistence.getInstance().getUser();
                    hs.k kVar = null;
                    if (user2 != null && (appConfig = user2.getAppConfig()) != null) {
                        obj2 = appConfig.get(Constants.DASHBOARD_LIBRARY_EXPERIMENT);
                    } else {
                        obj2 = null;
                    }
                    if (kotlin.jvm.internal.i.b(obj2, "variant_b")) {
                        notV4DashboardViewModel.p().i(Boolean.TRUE);
                        firebasePersistence = FirebasePersistence.getInstance();
                        Course courseById = firebasePersistence.getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                        if (courseById.getPlanSuggested().size() == 0) {
                            Context applicationContext = notV4DashboardViewModel.f2382x.getApplicationContext();
                            kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
                            this.f22270u = firebasePersistence;
                            this.f22271v = courseById;
                            this.f22272w = 1;
                            u0 u0Var = notV4DashboardViewModel.f10867y;
                            u0Var.getClass();
                            kotlinx.coroutines.k kVar2 = new kotlinx.coroutines.k(1, ca.a.G0(this));
                            kVar2.u();
                            try {
                                Integer a10 = u0.a(u0Var);
                                if (a10 != null) {
                                    InputStream openRawResource = applicationContext.getResources().openRawResource(a10.intValue());
                                    kotlin.jvm.internal.i.f(openRawResource, "context.resources.openRawResource(id)");
                                    InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, gv.a.f16927b);
                                    if (inputStreamReader instanceof BufferedReader) {
                                        bufferedReader = (BufferedReader) inputStreamReader;
                                    } else {
                                        bufferedReader = new BufferedReader(inputStreamReader, 8192);
                                    }
                                    String c12 = ca.a.c1(bufferedReader);
                                    ca.a.z(bufferedReader, null);
                                    kVar2.resumeWith(new sf.i().b(SuggestedDataModel.class, c12));
                                    kVar = hs.k.f19476a;
                                }
                                if (kVar == null) {
                                    kVar2.resumeWith(new SuggestedDataModel(new ArrayList(), ""));
                                }
                            } catch (Exception e10) {
                                kVar2.resumeWith(new SuggestedDataModel(new ArrayList(), ""));
                                LogHelper.INSTANCE.e(u0Var.f22359a, e10);
                            }
                            Object s10 = kVar2.s();
                            if (s10 == aVar) {
                                return aVar;
                            }
                            course = courseById;
                            obj = s10;
                            suggestedDataModel = (SuggestedDataModel) obj;
                            if (suggestedDataModel.getData().size() <= 0) {
                            }
                        }
                    }
                }
                androidx.lifecycle.w<Boolean> p10 = notV4DashboardViewModel.p();
                this.f22270u = p10;
                this.f22272w = 2;
                u0 u0Var2 = notV4DashboardViewModel.f10867y;
                u0Var2.getClass();
                kotlinx.coroutines.k kVar3 = new kotlinx.coroutines.k(1, ca.a.G0(this));
                kVar3.u();
                try {
                    ArrayList<AssessmentResponseAll> assessments = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getAssessments();
                    Course courseById2 = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                    courseById2.setAssessments(new ArrayList<>());
                    courseById2.getPlanV3().get(0).setCompleted(false);
                    courseById2.getPlanV3().get(0).setStart_date(0L);
                    courseById2.getPlanV3().get(0).setLast_accessed_date(0L);
                    ApplicationPersistence.getInstance().setIntValue(courseById2.getCourseName() + "CourseSize", 0);
                    FirebasePersistence.getInstance().courseSize = 0;
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    Course courseById3 = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                    courseById3.setAssessments(assessments);
                    courseById3.getPlanV3().get(0).setCompleted(true);
                    Utils utils = Utils.INSTANCE;
                    courseById3.getPlanV3().get(0).setStart_date(utils.getTodayTimeInSeconds());
                    courseById3.getPlanV3().get(0).setLast_accessed_date(utils.getTodayTimeInSeconds());
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                    if (kVar3.a()) {
                        kVar3.resumeWith(Boolean.TRUE);
                    }
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(u0Var2.f22359a, e11);
                    if (kVar3.a()) {
                        kVar3.resumeWith(Boolean.FALSE);
                    }
                }
                Object s11 = kVar3.s();
                if (s11 == aVar) {
                    return aVar;
                }
                wVar = p10;
                obj = s11;
                wVar.i(obj);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(NotV4DashboardViewModel notV4DashboardViewModel, ls.d<? super m1> dVar) {
        super(2, dVar);
        this.f22269v = notV4DashboardViewModel;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new m1(this.f22269v, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((m1) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f22268u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            NotV4DashboardViewModel notV4DashboardViewModel = this.f22269v;
            kotlinx.coroutines.scheduling.b bVar = notV4DashboardViewModel.B;
            a aVar2 = new a(notV4DashboardViewModel, null);
            this.f22268u = 1;
            if (ta.v.S(bVar, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return hs.k.f19476a;
    }
}
