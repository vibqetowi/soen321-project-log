package ym;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.LearningHubModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import hs.k;
import java.util.ArrayList;
import java.util.HashMap;
import kc.f;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ls.d;
import ns.e;
import ns.i;
import ss.p;
/* compiled from: LearningHubViewModel.kt */
/* loaded from: classes2.dex */
public final class c extends l0 {

    /* renamed from: x  reason: collision with root package name */
    public final String f38686x;

    /* renamed from: y  reason: collision with root package name */
    public final w<ArrayList<LearningHubModel>> f38687y;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f38688z;

    /* compiled from: LearningHubViewModel.kt */
    @e(c = "com.theinnerhour.b2b.components.learningHub.viewmodel.LearningHubViewModel$fetchData$1", f = "LearningHubViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, d<? super k>, Object> {

        /* compiled from: LearningHubViewModel.kt */
        /* renamed from: ym.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0656a extends kotlin.jvm.internal.k implements p<Boolean, ArrayList<LearningHubModel>, k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ v f38690u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ ArrayList<LearningHubModel> f38691v;

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ c f38692w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ HashMap<String, Integer> f38693x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0656a(v vVar, ArrayList<LearningHubModel> arrayList, c cVar, HashMap<String, Integer> hashMap) {
                super(2);
                this.f38690u = vVar;
                this.f38691v = arrayList;
                this.f38692w = cVar;
                this.f38693x = hashMap;
            }

            @Override // ss.p
            public final k invoke(Boolean bool, ArrayList<LearningHubModel> arrayList) {
                Integer num;
                boolean booleanValue = bool.booleanValue();
                ArrayList<LearningHubModel> dataListTemp = arrayList;
                v vVar = this.f38690u;
                ArrayList<LearningHubModel> arrayList2 = this.f38691v;
                c cVar = this.f38692w;
                kotlin.jvm.internal.i.g(dataListTemp, "dataListTemp");
                try {
                    vVar.f23467u++;
                    arrayList2.addAll(dataListTemp);
                    LogHelper logHelper = LogHelper.INSTANCE;
                    String str = cVar.f38686x;
                    Object[] objArr = new Object[1];
                    StringBuilder sb2 = new StringBuilder("on loaded Learning Hub ");
                    sb2.append(booleanValue);
                    sb2.append(' ');
                    w<ArrayList<LearningHubModel>> wVar = cVar.f38687y;
                    ArrayList<LearningHubModel> d10 = wVar.d();
                    if (d10 != null) {
                        num = Integer.valueOf(d10.size());
                    } else {
                        num = null;
                    }
                    sb2.append(num);
                    objArr[0] = sb2.toString();
                    logHelper.i(str, objArr);
                    if (arrayList2.size() > 0 && vVar.f23467u > 1) {
                        is.p.P1(arrayList2, new dm.a(new ym.a(this.f38693x), 3));
                        is.p.P1(arrayList2, new dm.a(b.f38685u, 4));
                        wVar.i(arrayList2);
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(cVar.f38686x, "Exception", e10);
                    cVar.f38687y.i(new ArrayList<>());
                }
                return k.f19476a;
            }
        }

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final d<k> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            c cVar = c.this;
            sp.b.d0(obj);
            try {
                v vVar = new v();
                c.e(cVar);
                HashMap hashMap = new HashMap();
                hashMap.put("Therapist says", new Integer(1));
                hashMap.put("Tips", new Integer(2));
                hashMap.put("Articles", new Integer(3));
                hashMap.put("Creatives", new Integer(4));
                hashMap.put("Quotes", new Integer(5));
                hashMap.put("Videos", new Integer(6));
                C0656a c0656a = new C0656a(vVar, new ArrayList(), cVar, hashMap);
                String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                FireStoreUtilsKt.fetchCourseSpecificLearningHub("en", currentCourseName, (int) FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getCourseOpenDay(), cVar.f38688z, c0656a);
                FireStoreUtilsKt.fetchGenericLearningHub("en", (int) FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse()).getCourseOpenDay(), cVar.f38688z, c0656a);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(cVar.f38686x, "exception", e10);
            }
            return k.f19476a;
        }
    }

    public c(String language) {
        boolean z10;
        HashMap<String, Object> appConfig;
        kotlin.jvm.internal.i.g(language, "language");
        this.f38686x = LogHelper.INSTANCE.makeLogTag(c.class);
        this.f38687y = new w<>();
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (appConfig = user.getAppConfig()) != null) {
            z10 = kotlin.jvm.internal.i.b(appConfig.get(Constants.IH_RESOURCES_EXPERIMENT), Boolean.TRUE);
        } else {
            z10 = false;
        }
        this.f38688z = z10;
    }

    public static final void e(c cVar) {
        cVar.getClass();
        try {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            long courseOpenDate = courseById.getCourseOpenDate();
            Utils utils = Utils.INSTANCE;
            if (courseOpenDate < utils.getTodayTimeInSeconds()) {
                courseById.setCourseOpenDate(utils.getTodayTimeInSeconds());
                courseById.setCourseOpenDay(courseById.getCourseOpenDay() + 1);
                FirebasePersistence.getInstance().updateUserOnFirebase();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(cVar.f38686x, e10);
        }
    }

    public final void f() {
        ta.v.H(f.H(this), o0.f23642c, 0, new a(null), 2);
    }
}
