package ml;

import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.r;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.journal.model.JournalQuestionModel;
import com.theinnerhour.b2b.components.libraryExperiment.model.MiniCourseMetadata;
import com.theinnerhour.b2b.model.AngerCourse;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.DepressionCourse;
import com.theinnerhour.b2b.model.HappinessCourse;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.MiniCourseMeta;
import com.theinnerhour.b2b.model.SleepCourse;
import com.theinnerhour.b2b.model.StressCourse;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.WorryCourse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.persistence.StatPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.service.BootReceiverNotificationWorkManager;
import com.theinnerhour.b2b.service.PostLoginNotificationWorkManager;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import nf.c;
/* compiled from: V3DashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class c0 extends androidx.lifecycle.b implements ConnectionStatusReceiver.ConnectivityListener, SubscriptionPersistence.SubscriptionInitialiseListener {
    public final String A;
    public final androidx.lifecycle.w<Boolean> B;
    public final androidx.lifecycle.w<hs.f<Boolean, ArrayList<String>>> C;
    public final androidx.lifecycle.w<SingleUseEvent<Boolean>> D;
    public final androidx.lifecycle.w<String> E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final androidx.lifecycle.w<Boolean> J;
    public final androidx.lifecycle.w<Boolean> K;
    public final hs.i L;
    public final hs.i M;
    public final tm.a N;
    public JournalQuestionModel O;
    public boolean P;
    public SubscriptionModel Q;
    public boolean R;
    public boolean S;
    public final hs.i T;
    public MiniCourseMetadata U;
    public ss.l<? super Boolean, hs.k> V;
    public final androidx.lifecycle.w<Boolean> W;
    public final androidx.lifecycle.w<RoutingIntentHandler> X;
    public final hs.i Y;
    public final hs.i Z;

    /* renamed from: a0  reason: collision with root package name */
    public final hs.i f25364a0;

    /* renamed from: b0  reason: collision with root package name */
    public final hs.i f25365b0;
    public Boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public final androidx.lifecycle.w<Boolean> f25366d0;
    public final androidx.lifecycle.w<Long> e0;

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayList<String> f25367f0;

    /* renamed from: y  reason: collision with root package name */
    public final u f25368y;

    /* renamed from: z  reason: collision with root package name */
    public final cn.t f25369z;

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$1", f = "V3DashboardViewModel.kt", l = {159}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25370u;

        public a(ls.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            HashMap<String, Object> appConfig;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25370u;
            boolean z10 = true;
            c0 c0Var = c0.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f25370u = 1;
                if (c0.f(c0Var, this) == aVar) {
                    return aVar;
                }
            }
            Application application = c0Var.f2382x;
            kotlin.jvm.internal.i.e(application, "null cannot be cast to non-null type com.theinnerhour.b2b.MyApplication");
            ((MyApplication) application).a(c0Var);
            ((CourseApiUtil) c0Var.T.getValue()).setMiniCourseFetchListener(new r0(c0Var));
            c0Var.Q = SubscriptionPersistence.INSTANCE.previousSubscriptionModel();
            ta.v.H(kc.f.H(c0Var), null, 0, new h0(c0Var, null), 3);
            StatPersistence.INSTANCE.initialise();
            if (!kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") && LocationPersistence.INSTANCE.isIndianUser()) {
                ta.v.H(kc.f.H(c0Var), null, 0, new d0(c0Var, null), 3);
            }
            if (defpackage.b.u(SessionManager.KEY_USERTYPE, "patient")) {
                User user = FirebasePersistence.getInstance().getUser();
                if ((user == null || (appConfig = user.getAppConfig()) == null || appConfig.containsKey(Constants.FIRESTORE_GOALS_EXPERIMENT)) ? false : false) {
                    nf.b e10 = nf.b.e();
                    kotlin.jvm.internal.i.f(e10, "getInstance()");
                    e10.g(new nf.c(new c.a()));
                    e10.b().addOnCompleteListener(new com.google.firebase.messaging.h(e10, 3, c0Var));
                }
            }
            try {
                if (ApplicationPersistence.getInstance().containsKey(PostLoginNotificationWorkManager.POST_LOGIN_NOTIFICATION_ATTEMPT) && ApplicationPersistence.getInstance().getIntValue(PostLoginNotificationWorkManager.POST_LOGIN_NOTIFICATION_ATTEMPT, 0) < 3) {
                    n2.a0 e11 = n2.a0.e(c0Var.f2382x.getApplicationContext());
                    e11.getClass();
                    e11.c(Collections.singletonList(new r.a(PostLoginNotificationWorkManager.class).a())).M(Collections.singletonList(new r.a(BootReceiverNotificationWorkManager.class).a())).J();
                }
            } catch (Exception e12) {
                LogHelper.INSTANCE.e(c0Var.A, e12);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<rp.a> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f25372u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final rp.a invoke() {
            return new rp.a(0);
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.q<Boolean, String, ArrayList<MiniCourseMeta>, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ HashMap<String, ArrayList<CourseDayModelV1>> f25373u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f25374v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c0 f25375w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.u f25376x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ hs.f<ArrayList<String>, Boolean> f25377y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(HashMap<String, ArrayList<CourseDayModelV1>> hashMap, String str, c0 c0Var, kotlin.jvm.internal.u uVar, hs.f<? extends ArrayList<String>, Boolean> fVar) {
            super(3);
            this.f25373u = hashMap;
            this.f25374v = str;
            this.f25375w = c0Var;
            this.f25376x = uVar;
            this.f25377y = fVar;
        }

        @Override // ss.q
        public final hs.k invoke(Boolean bool, String str, ArrayList<MiniCourseMeta> arrayList) {
            boolean z10;
            boolean booleanValue = bool.booleanValue();
            ArrayList<MiniCourseMeta> metaData = arrayList;
            kotlin.jvm.internal.i.g(str, "<anonymous parameter 1>");
            kotlin.jvm.internal.i.g(metaData, "metaData");
            if (booleanValue && (!metaData.isEmpty())) {
                ArrayList<CourseDayModelV1> arrayList2 = new ArrayList<>();
                for (MiniCourseMeta miniCourseMeta : metaData) {
                    arrayList2.add(MiniCourseUtilsKt.getDayModel(miniCourseMeta));
                }
                HashMap<String, ArrayList<CourseDayModelV1>> hashMap = this.f25373u;
                hashMap.put(this.f25374v, arrayList2);
                int size = hashMap.keySet().size();
                c0 c0Var = this.f25375w;
                if (size == c0Var.f25367f0.size()) {
                    kotlin.jvm.internal.u uVar = this.f25376x;
                    if (!uVar.f23466u) {
                        uVar.f23466u = true;
                        FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                        if (firebasePersistence.getUser().getTopicalCourse() != null || this.f25377y.f19465v.booleanValue()) {
                            firebasePersistence.getUser().setTopicalCourse(null);
                            firebasePersistence.getUser().setTopicalCourseList(new ArrayList<>());
                            firebasePersistence.getUser().setTopicalGoals(new ArrayList<>());
                        }
                        Set<String> keySet = hashMap.keySet();
                        kotlin.jvm.internal.i.f(keySet, "planMap.keys");
                        for (String str2 : keySet) {
                            if (hashMap.get(str2) != null) {
                                ArrayList<MiniCourse> topicalCourseList = firebasePersistence.getUser().getTopicalCourseList();
                                kotlin.jvm.internal.i.f(topicalCourseList, "it.user.topicalCourseList");
                                if (!topicalCourseList.isEmpty()) {
                                    for (MiniCourse miniCourse : topicalCourseList) {
                                        if (kotlin.jvm.internal.i.b(miniCourse.getDomain(), str2)) {
                                            z10 = true;
                                            break;
                                        }
                                    }
                                }
                                z10 = false;
                                if (z10) {
                                    ArrayList<MiniCourse> topicalCourseList2 = firebasePersistence.getUser().getTopicalCourseList();
                                    kotlin.jvm.internal.i.f(topicalCourseList2, "it.user.topicalCourseList");
                                    for (MiniCourse miniCourse2 : topicalCourseList2) {
                                        if (kotlin.jvm.internal.i.b(miniCourse2.getDomain(), str2)) {
                                            ArrayList<CourseDayModelV1> arrayList3 = hashMap.get(str2);
                                            kotlin.jvm.internal.i.d(arrayList3);
                                            miniCourse2.setPlan(arrayList3);
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                                ArrayList<MiniCourse> topicalCourseList3 = firebasePersistence.getUser().getTopicalCourseList();
                                MiniCourse miniCourse3 = new MiniCourse();
                                miniCourse3.setPosition(c0Var.f25367f0.indexOf(str2));
                                ArrayList<CourseDayModelV1> arrayList4 = hashMap.get(str2);
                                kotlin.jvm.internal.i.d(arrayList4);
                                miniCourse3.setPlan(arrayList4);
                                miniCourse3.setCourse(Constants.COURSE_GENERIC);
                                miniCourse3.setDomain(str2);
                                topicalCourseList3.add(miniCourse3);
                            }
                        }
                        firebasePersistence.updateUserOnFirebase();
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<ml.a> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f25378u = new d();

        public d() {
            super(0);
        }

        @Override // ss.a
        public final ml.a invoke() {
            return new ml.a();
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<CourseApiUtil> {

        /* renamed from: u  reason: collision with root package name */
        public static final e f25379u = new e();

        public e() {
            super(0);
        }

        @Override // ss.a
        public final CourseApiUtil invoke() {
            return new CourseApiUtil();
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$fetchLibraryContentOnDb$1", f = "V3DashboardViewModel.kt", l = {862}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25380u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<String> f25382w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlin.jvm.internal.x<String> xVar, ls.d<? super f> dVar) {
            super(2, dVar);
            this.f25382w = xVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new f(this.f25382w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25380u;
            c0 c0Var = c0.this;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(c0Var.A, e10);
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                cn.t tVar = c0Var.f25369z;
                if (tVar != null) {
                    cn.q a10 = cn.t.a(tVar, "top_pick", this.f25382w.f23469u);
                    this.f25380u = 1;
                    obj = ta.v.s(a10, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                c0Var.F = true;
                c0.g(c0Var);
                return hs.k.f19476a;
            }
            List list = (List) obj;
            c0Var.F = true;
            c0.g(c0Var);
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$fetchLibraryContentOnDb$2", f = "V3DashboardViewModel.kt", l = {873}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25383u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<String> f25385w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(kotlin.jvm.internal.x<String> xVar, ls.d<? super g> dVar) {
            super(2, dVar);
            this.f25385w = xVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new g(this.f25385w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25383u;
            c0 c0Var = c0.this;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(c0Var.A, e10);
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                cn.t tVar = c0Var.f25369z;
                if (tVar != null) {
                    cn.q a10 = cn.t.a(tVar, "collection", this.f25385w.f23469u);
                    this.f25383u = 1;
                    obj = ta.v.s(a10, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return hs.k.f19476a;
            }
            if (((List) obj) != null) {
                c0Var.G = true;
                c0.g(c0Var);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$fetchLibraryContentOnDb$3", f = "V3DashboardViewModel.kt", l = {883}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25386u;

        public h(ls.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new h(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((h) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25386u;
            c0 c0Var = c0.this;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(c0Var.A, e10);
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                cn.t tVar = c0Var.f25369z;
                if (tVar != null) {
                    String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                    kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                    cn.r b10 = tVar.b(currentCourseName);
                    this.f25386u = 1;
                    obj = ta.v.s(b10, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return hs.k.f19476a;
            }
            if (((List) obj) != null) {
                c0Var.H = true;
                c0.g(c0Var);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$fetchLibraryContentOnDb$4", f = "V3DashboardViewModel.kt", l = {893}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f25388u;

        public i(ls.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new i(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0098 A[SYNTHETIC] */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            boolean z10;
            String str2;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f25388u;
            Object obj2 = null;
            c0 c0Var = c0.this;
            try {
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(c0Var.A, e10);
            }
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                cn.t tVar = c0Var.f25369z;
                if (tVar != null) {
                    cn.p pVar = new cn.p(new kotlinx.coroutines.flow.r(new cn.s(100L, tVar.f5778b.b("mini_courses").m(Boolean.TRUE, "published"), null)));
                    this.f25388u = 1;
                    obj = ta.v.s(pVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return hs.k.f19476a;
            }
            List list = (List) obj;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    MiniCourseMetadata miniCourseMetadata = (MiniCourseMetadata) next;
                    if (miniCourseMetadata != null) {
                        str = miniCourseMetadata.getSlug();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        String slug = miniCourseMetadata.getSlug();
                        StringBuilder sb2 = new StringBuilder();
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null) {
                            str2 = user.getCurrentCourseName();
                        } else {
                            str2 = null;
                        }
                        sb2.append(str2);
                        sb2.append("-basic");
                        if (kotlin.jvm.internal.i.b(slug, sb2.toString())) {
                            z10 = true;
                            continue;
                            if (z10) {
                                obj2 = next;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    continue;
                    if (z10) {
                    }
                }
                c0Var.U = (MiniCourseMetadata) obj2;
                c0Var.I = true;
                c0.g(c0Var);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<fm.j0> {

        /* renamed from: u  reason: collision with root package name */
        public static final k f25391u = new k();

        public k() {
            super(0);
        }

        @Override // ss.a
        public final fm.j0 invoke() {
            return new fm.j0();
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.a<GoalHelper> {

        /* renamed from: u  reason: collision with root package name */
        public static final l f25392u = new l();

        public l() {
            super(0);
        }

        @Override // ss.a
        public final GoalHelper invoke() {
            return new GoalHelper();
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.w<SingleUseEvent<? extends Boolean>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final m f25393u = new m();

        public m() {
            super(0);
        }

        @Override // ss.a
        public final androidx.lifecycle.w<SingleUseEvent<? extends Boolean>> invoke() {
            return new androidx.lifecycle.w<>();
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$initialiseComplete$1", f = "V3DashboardViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public n(ls.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new n(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((n) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            String str;
            boolean z10;
            sp.b.d0(obj);
            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
            SubscriptionModel currentSubscriptionModel = subscriptionPersistence.getCurrentSubscriptionModel();
            String status = currentSubscriptionModel.getStatus();
            c0 c0Var = c0.this;
            SubscriptionModel subscriptionModel = c0Var.Q;
            String str2 = null;
            if (subscriptionModel != null) {
                str = subscriptionModel.getStatus();
            } else {
                str = null;
            }
            boolean b10 = kotlin.jvm.internal.i.b(status, str);
            boolean z11 = true;
            if (b10) {
                SubscriptionModel subscriptionModel2 = c0Var.Q;
                if (subscriptionModel2 != null && currentSubscriptionModel.getExpiryTime() == subscriptionModel2.getExpiryTime()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    String plan = currentSubscriptionModel.getPlan();
                    SubscriptionModel subscriptionModel3 = c0Var.Q;
                    if (subscriptionModel3 != null) {
                        str2 = subscriptionModel3.getPlan();
                    }
                    if (kotlin.jvm.internal.i.b(plan, str2)) {
                        c0Var.Q = currentSubscriptionModel;
                        z11 = false;
                        if (!subscriptionPersistence.getSubscriptionEnabled() && kotlin.jvm.internal.i.b(currentSubscriptionModel.getPlan(), Constants.PR_COUPON_CODE_SKU) && !ApplicationPersistence.getInstance().getBooleanValue(Constants.SUBSCRIPTION_EXPIRY_SHOWN, false)) {
                            c0Var.e0.i(new Long(currentSubscriptionModel.getExpiryTime()));
                        }
                        c0Var.f25366d0.i(Boolean.valueOf(z11));
                        return hs.k.f19476a;
                    }
                }
            }
            c0Var.Q = currentSubscriptionModel;
            if (!subscriptionPersistence.getSubscriptionEnabled()) {
                c0Var.e0.i(new Long(currentSubscriptionModel.getExpiryTime()));
            }
            c0Var.f25366d0.i(Boolean.valueOf(z11));
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class o extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.w<JournalModel>> {

        /* renamed from: u  reason: collision with root package name */
        public static final o f25395u = new o();

        public o() {
            super(0);
        }

        @Override // ss.a
        public final androidx.lifecycle.w<JournalModel> invoke() {
            return new androidx.lifecycle.w<>();
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$networkConnected$1", f = "V3DashboardViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class p extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public p(ls.d<? super p> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new p(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((p) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            c0 c0Var = c0.this;
            c0Var.j();
            Utils utils = Utils.INSTANCE;
            Application application = c0Var.f2382x;
            kotlin.jvm.internal.i.f(application, "getApplication()");
            utils.checkAndDownloadProfileAssets(application);
            if (c0Var.S && !c0Var.R) {
                kotlin.jvm.internal.i.f(application, "getApplication()");
                ((CourseApiUtil) c0Var.T.getValue()).checkMcSlugUpdate(0, application);
            }
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Application application, u repository, cn.t tVar) {
        super(application);
        kotlin.jvm.internal.i.g(application, "application");
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f25368y = repository;
        this.f25369z = tVar;
        this.A = LogHelper.INSTANCE.makeLogTag("V3DashboardViewModel");
        this.B = new androidx.lifecycle.w<>();
        new androidx.lifecycle.w();
        new androidx.lifecycle.w(null);
        this.C = new androidx.lifecycle.w<>(null);
        this.D = new androidx.lifecycle.w<>(null);
        this.E = new androidx.lifecycle.w<>();
        this.J = new androidx.lifecycle.w<>();
        this.K = new androidx.lifecycle.w<>();
        this.L = sp.b.O(b.f25372u);
        this.M = sp.b.O(o.f25395u);
        this.N = new tm.a();
        this.T = sp.b.O(e.f25379u);
        this.W = new androidx.lifecycle.w<>(Boolean.FALSE);
        this.X = new androidx.lifecycle.w<>();
        this.Y = sp.b.O(d.f25378u);
        this.Z = sp.b.O(k.f25391u);
        this.f25364a0 = sp.b.O(l.f25392u);
        this.f25365b0 = sp.b.O(m.f25393u);
        ta.v.H(kc.f.H(this), null, 0, new a(null), 3);
        this.f25366d0 = new androidx.lifecycle.w<>();
        this.e0 = new androidx.lifecycle.w<>();
        this.f25367f0 = ca.a.k(Constants.TOPICAL_2022_HEALTH_ANXIETY, Constants.TOPICAL_2022_TIME_MANAGEMENT, Constants.TOPICAL_2022_MOTIVATION, Constants.TOPICAL_2022_NURTURING_RELATIONSHIP, Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY, Constants.TOPICAL_2022_COVID);
    }

    public static final void e(c0 c0Var) {
        c0Var.getClass();
        try {
            long longValue = ApplicationPersistence.getInstance().getLongValue(Constants.APP_OPEN_DATE, 0L);
            Utils utils = Utils.INSTANCE;
            if (longValue != utils.getTodayCalendar().getTimeInMillis()) {
                ApplicationPersistence.getInstance().setLongValue(Constants.APP_OPEN_DATE, utils.getTodayCalendar().getTimeInMillis());
                ApplicationPersistence.getInstance().setIntValue(Constants.APP_OPEN_DAY, ApplicationPersistence.getInstance().getIntValue(Constants.APP_OPEN_DAY, 0) + 1);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(c0Var.A, e10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:31|32))(5:33|34|(10:38|(1:40)(1:57)|(1:42)(1:56)|(6:47|(1:49)|(2:51|(2:53|54))|(2:17|(5:19|20|(1:22)|23|(1:25)))|30|(0))|55|(0)|(0)|(3:14|17|(0))|30|(0))|27|28)|12|(0)|30|(0)|27|28))|61|6|7|(0)(0)|12|(0)|30|(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0141, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r10.A, "V3 preLoadWebViews not loading the web page", r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:12:0x0031, B:40:0x008e, B:44:0x0097, B:50:0x00a3, B:53:0x00b0, B:54:0x00f3, B:56:0x00fd, B:17:0x0040, B:19:0x004a, B:21:0x0054, B:23:0x005f, B:26:0x0065, B:29:0x006b, B:37:0x007a), top: B:61:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097 A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:12:0x0031, B:40:0x008e, B:44:0x0097, B:50:0x00a3, B:53:0x00b0, B:54:0x00f3, B:56:0x00fd, B:17:0x0040, B:19:0x004a, B:21:0x0054, B:23:0x005f, B:26:0x0065, B:29:0x006b, B:37:0x007a), top: B:61:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3 A[Catch: Exception -> 0x0092, TRY_LEAVE, TryCatch #0 {Exception -> 0x0092, blocks: (B:12:0x0031, B:40:0x008e, B:44:0x0097, B:50:0x00a3, B:53:0x00b0, B:54:0x00f3, B:56:0x00fd, B:17:0x0040, B:19:0x004a, B:21:0x0054, B:23:0x005f, B:26:0x0065, B:29:0x006b, B:37:0x007a), top: B:61:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(c0 c0Var, ls.d dVar) {
        n0 n0Var;
        int i6;
        String str;
        MyApplication myApplication;
        String str2;
        boolean z10;
        boolean z11;
        c0Var.getClass();
        if (dVar instanceof n0) {
            n0Var = (n0) dVar;
            int i10 = n0Var.f25546x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                n0Var.f25546x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = n0Var.f25544v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = n0Var.f25546x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        c0Var = n0Var.f25543u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.TELE_CACHED, false) || !ApplicationPersistence.getInstance().getBooleanValue(Constants.COMMUNITY_CACHED, false)) {
                        Context applicationContext = c0Var.f2382x.getApplicationContext();
                        str = null;
                        if (applicationContext instanceof MyApplication) {
                            myApplication = (MyApplication) applicationContext;
                        } else {
                            myApplication = null;
                        }
                        if (myApplication != null) {
                            str2 = myApplication.O;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null && !gv.n.B0(str2)) {
                            z10 = false;
                            if (!z10) {
                                str = str2;
                            }
                            if (str == null) {
                                n0Var.f25543u = c0Var;
                                n0Var.f25546x = 1;
                                obj = ((rp.a) c0Var.L.getValue()).j(n0Var);
                                if (obj == aVar) {
                                    return aVar;
                                }
                            }
                            if (str != null && !gv.n.B0(str)) {
                                z11 = false;
                                if (!z11) {
                                    if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.TELE_CACHED, false)) {
                                        WebView webView = new WebView(c0Var.f2382x.getApplicationContext());
                                        WebSettings settings = webView.getSettings();
                                        kotlin.jvm.internal.i.f(settings, "webview.settings");
                                        settings.setDomStorageEnabled(true);
                                        settings.setJavaScriptEnabled(true);
                                        settings.setCacheMode(-1);
                                        settings.setLoadsImagesAutomatically(true);
                                        settings.setGeolocationEnabled(false);
                                        settings.setNeedInitialFocus(false);
                                        settings.setMediaPlaybackRequiresUserGesture(false);
                                        webView.setWebViewClient(new o0());
                                        webView.loadUrl("https://www.amahahealth.com/therapy-psychiatry?token=" + str + "&platform=android&skipAnalytics=true");
                                    }
                                    if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.COMMUNITY_CACHED, false)) {
                                        WebView webView2 = new WebView(c0Var.f2382x.getApplicationContext());
                                        WebSettings settings2 = webView2.getSettings();
                                        kotlin.jvm.internal.i.f(settings2, "webview.settings");
                                        settings2.setDomStorageEnabled(true);
                                        settings2.setJavaScriptEnabled(true);
                                        settings2.setCacheMode(-1);
                                        settings2.setLoadsImagesAutomatically(true);
                                        settings2.setGeolocationEnabled(false);
                                        settings2.setNeedInitialFocus(false);
                                        settings2.setMediaPlaybackRequiresUserGesture(false);
                                        webView2.setWebViewClient(new p0());
                                        webView2.loadUrl("https://community.amahahealth.com/switch?token=" + str + "&skipAnalytics=true");
                                    }
                                }
                            }
                            z11 = true;
                            if (!z11) {
                            }
                        }
                        z10 = true;
                        if (!z10) {
                        }
                        if (str == null) {
                        }
                        if (str != null) {
                            z11 = false;
                            if (!z11) {
                            }
                        }
                        z11 = true;
                        if (!z11) {
                        }
                    }
                    return hs.k.f19476a;
                }
                str = (String) obj;
                if (str != null) {
                }
                z11 = true;
                if (!z11) {
                }
                return hs.k.f19476a;
            }
        }
        n0Var = new n0(c0Var, dVar);
        Object obj2 = n0Var.f25544v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = n0Var.f25546x;
        if (i6 == 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        z11 = true;
        if (!z11) {
        }
        return hs.k.f19476a;
    }

    public static final void g(c0 c0Var) {
        if (c0Var.F && c0Var.G && c0Var.H && c0Var.I) {
            c0Var.J.i(Boolean.TRUE);
        }
    }

    @Override // androidx.lifecycle.l0
    public final void c() {
        Application application = this.f2382x;
        kotlin.jvm.internal.i.e(application, "null cannot be cast to non-null type com.theinnerhour.b2b.MyApplication");
        ((MyApplication) application).i(this);
        SubscriptionPersistence.INSTANCE.removeSubscriptionInitialiseListener(this);
    }

    public final void h(hs.f<? extends ArrayList<String>, Boolean> fVar) {
        try {
            HashMap hashMap = new HashMap();
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            for (String str : (Iterable) fVar.f19464u) {
                FireStoreUtilsKt.fetchTopicalCourse(str, new c(hashMap, str, this, uVar, fVar));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    public final void i() {
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        Object d10 = ri.e.d(Constants.LIBRARY_EXPERIMENT_V3);
        if (kotlin.jvm.internal.i.b(d10, "default")) {
            d10 = null;
        }
        if (d10 == null) {
            d10 = "variant_a";
        }
        xVar.f23469u = (String) d10;
        kotlinx.coroutines.d0 H = kc.f.H(this);
        kotlinx.coroutines.scheduling.b bVar = kotlinx.coroutines.o0.f23642c;
        ta.v.H(H, bVar, 0, new f(xVar, null), 2);
        ta.v.H(kc.f.H(this), bVar, 0, new g(xVar, null), 2);
        ta.v.H(kc.f.H(this), bVar, 0, new h(null), 2);
        ta.v.H(kc.f.H(this), bVar, 0, new i(null), 2);
    }

    @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
    public final void initialiseComplete(boolean z10) {
        ta.v.H(kc.f.H(this), null, 0, new n(null), 3);
    }

    public final void j() {
        ta.v.H(kc.f.H(this), kotlinx.coroutines.o0.f23642c, 0, new j(null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0133 A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:9:0x0018, B:12:0x001f, B:13:0x0024, B:15:0x002a, B:17:0x0036, B:20:0x003b, B:21:0x003e, B:23:0x0040, B:25:0x0047, B:27:0x004d, B:30:0x0054, B:31:0x0059, B:33:0x005f, B:35:0x006b, B:38:0x0070, B:39:0x0073, B:41:0x0075, B:43:0x007c, B:45:0x0082, B:48:0x0089, B:49:0x008e, B:51:0x0094, B:53:0x00a0, B:56:0x00a5, B:57:0x00a8, B:59:0x00aa, B:61:0x00b1, B:63:0x00b7, B:66:0x00be, B:67:0x00c3, B:69:0x00c9, B:71:0x00d5, B:74:0x00da, B:75:0x00dd, B:77:0x00df, B:79:0x00e6, B:81:0x00ec, B:84:0x00f3, B:85:0x00f8, B:87:0x00fe, B:89:0x010a, B:92:0x010f, B:93:0x0112, B:95:0x0114, B:97:0x011b, B:99:0x0121, B:102:0x0128, B:103:0x012d, B:105:0x0133, B:107:0x013f, B:110:0x0144, B:111:0x0147), top: B:117:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:9:0x0018, B:12:0x001f, B:13:0x0024, B:15:0x002a, B:17:0x0036, B:20:0x003b, B:21:0x003e, B:23:0x0040, B:25:0x0047, B:27:0x004d, B:30:0x0054, B:31:0x0059, B:33:0x005f, B:35:0x006b, B:38:0x0070, B:39:0x0073, B:41:0x0075, B:43:0x007c, B:45:0x0082, B:48:0x0089, B:49:0x008e, B:51:0x0094, B:53:0x00a0, B:56:0x00a5, B:57:0x00a8, B:59:0x00aa, B:61:0x00b1, B:63:0x00b7, B:66:0x00be, B:67:0x00c3, B:69:0x00c9, B:71:0x00d5, B:74:0x00da, B:75:0x00dd, B:77:0x00df, B:79:0x00e6, B:81:0x00ec, B:84:0x00f3, B:85:0x00f8, B:87:0x00fe, B:89:0x010a, B:92:0x010f, B:93:0x0112, B:95:0x0114, B:97:0x011b, B:99:0x0121, B:102:0x0128, B:103:0x012d, B:105:0x0133, B:107:0x013f, B:110:0x0144, B:111:0x0147), top: B:117:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:9:0x0018, B:12:0x001f, B:13:0x0024, B:15:0x002a, B:17:0x0036, B:20:0x003b, B:21:0x003e, B:23:0x0040, B:25:0x0047, B:27:0x004d, B:30:0x0054, B:31:0x0059, B:33:0x005f, B:35:0x006b, B:38:0x0070, B:39:0x0073, B:41:0x0075, B:43:0x007c, B:45:0x0082, B:48:0x0089, B:49:0x008e, B:51:0x0094, B:53:0x00a0, B:56:0x00a5, B:57:0x00a8, B:59:0x00aa, B:61:0x00b1, B:63:0x00b7, B:66:0x00be, B:67:0x00c3, B:69:0x00c9, B:71:0x00d5, B:74:0x00da, B:75:0x00dd, B:77:0x00df, B:79:0x00e6, B:81:0x00ec, B:84:0x00f3, B:85:0x00f8, B:87:0x00fe, B:89:0x010a, B:92:0x010f, B:93:0x0112, B:95:0x0114, B:97:0x011b, B:99:0x0121, B:102:0x0128, B:103:0x012d, B:105:0x0133, B:107:0x013f, B:110:0x0144, B:111:0x0147), top: B:117:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094 A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:9:0x0018, B:12:0x001f, B:13:0x0024, B:15:0x002a, B:17:0x0036, B:20:0x003b, B:21:0x003e, B:23:0x0040, B:25:0x0047, B:27:0x004d, B:30:0x0054, B:31:0x0059, B:33:0x005f, B:35:0x006b, B:38:0x0070, B:39:0x0073, B:41:0x0075, B:43:0x007c, B:45:0x0082, B:48:0x0089, B:49:0x008e, B:51:0x0094, B:53:0x00a0, B:56:0x00a5, B:57:0x00a8, B:59:0x00aa, B:61:0x00b1, B:63:0x00b7, B:66:0x00be, B:67:0x00c3, B:69:0x00c9, B:71:0x00d5, B:74:0x00da, B:75:0x00dd, B:77:0x00df, B:79:0x00e6, B:81:0x00ec, B:84:0x00f3, B:85:0x00f8, B:87:0x00fe, B:89:0x010a, B:92:0x010f, B:93:0x0112, B:95:0x0114, B:97:0x011b, B:99:0x0121, B:102:0x0128, B:103:0x012d, B:105:0x0133, B:107:0x013f, B:110:0x0144, B:111:0x0147), top: B:117:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1 A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:9:0x0018, B:12:0x001f, B:13:0x0024, B:15:0x002a, B:17:0x0036, B:20:0x003b, B:21:0x003e, B:23:0x0040, B:25:0x0047, B:27:0x004d, B:30:0x0054, B:31:0x0059, B:33:0x005f, B:35:0x006b, B:38:0x0070, B:39:0x0073, B:41:0x0075, B:43:0x007c, B:45:0x0082, B:48:0x0089, B:49:0x008e, B:51:0x0094, B:53:0x00a0, B:56:0x00a5, B:57:0x00a8, B:59:0x00aa, B:61:0x00b1, B:63:0x00b7, B:66:0x00be, B:67:0x00c3, B:69:0x00c9, B:71:0x00d5, B:74:0x00da, B:75:0x00dd, B:77:0x00df, B:79:0x00e6, B:81:0x00ec, B:84:0x00f3, B:85:0x00f8, B:87:0x00fe, B:89:0x010a, B:92:0x010f, B:93:0x0112, B:95:0x0114, B:97:0x011b, B:99:0x0121, B:102:0x0128, B:103:0x012d, B:105:0x0133, B:107:0x013f, B:110:0x0144, B:111:0x0147), top: B:117:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9 A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:9:0x0018, B:12:0x001f, B:13:0x0024, B:15:0x002a, B:17:0x0036, B:20:0x003b, B:21:0x003e, B:23:0x0040, B:25:0x0047, B:27:0x004d, B:30:0x0054, B:31:0x0059, B:33:0x005f, B:35:0x006b, B:38:0x0070, B:39:0x0073, B:41:0x0075, B:43:0x007c, B:45:0x0082, B:48:0x0089, B:49:0x008e, B:51:0x0094, B:53:0x00a0, B:56:0x00a5, B:57:0x00a8, B:59:0x00aa, B:61:0x00b1, B:63:0x00b7, B:66:0x00be, B:67:0x00c3, B:69:0x00c9, B:71:0x00d5, B:74:0x00da, B:75:0x00dd, B:77:0x00df, B:79:0x00e6, B:81:0x00ec, B:84:0x00f3, B:85:0x00f8, B:87:0x00fe, B:89:0x010a, B:92:0x010f, B:93:0x0112, B:95:0x0114, B:97:0x011b, B:99:0x0121, B:102:0x0128, B:103:0x012d, B:105:0x0133, B:107:0x013f, B:110:0x0144, B:111:0x0147), top: B:117:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6 A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:9:0x0018, B:12:0x001f, B:13:0x0024, B:15:0x002a, B:17:0x0036, B:20:0x003b, B:21:0x003e, B:23:0x0040, B:25:0x0047, B:27:0x004d, B:30:0x0054, B:31:0x0059, B:33:0x005f, B:35:0x006b, B:38:0x0070, B:39:0x0073, B:41:0x0075, B:43:0x007c, B:45:0x0082, B:48:0x0089, B:49:0x008e, B:51:0x0094, B:53:0x00a0, B:56:0x00a5, B:57:0x00a8, B:59:0x00aa, B:61:0x00b1, B:63:0x00b7, B:66:0x00be, B:67:0x00c3, B:69:0x00c9, B:71:0x00d5, B:74:0x00da, B:75:0x00dd, B:77:0x00df, B:79:0x00e6, B:81:0x00ec, B:84:0x00f3, B:85:0x00f8, B:87:0x00fe, B:89:0x010a, B:92:0x010f, B:93:0x0112, B:95:0x0114, B:97:0x011b, B:99:0x0121, B:102:0x0128, B:103:0x012d, B:105:0x0133, B:107:0x013f, B:110:0x0144, B:111:0x0147), top: B:117:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:9:0x0018, B:12:0x001f, B:13:0x0024, B:15:0x002a, B:17:0x0036, B:20:0x003b, B:21:0x003e, B:23:0x0040, B:25:0x0047, B:27:0x004d, B:30:0x0054, B:31:0x0059, B:33:0x005f, B:35:0x006b, B:38:0x0070, B:39:0x0073, B:41:0x0075, B:43:0x007c, B:45:0x0082, B:48:0x0089, B:49:0x008e, B:51:0x0094, B:53:0x00a0, B:56:0x00a5, B:57:0x00a8, B:59:0x00aa, B:61:0x00b1, B:63:0x00b7, B:66:0x00be, B:67:0x00c3, B:69:0x00c9, B:71:0x00d5, B:74:0x00da, B:75:0x00dd, B:77:0x00df, B:79:0x00e6, B:81:0x00ec, B:84:0x00f3, B:85:0x00f8, B:87:0x00fe, B:89:0x010a, B:92:0x010f, B:93:0x0112, B:95:0x0114, B:97:0x011b, B:99:0x0121, B:102:0x0128, B:103:0x012d, B:105:0x0133, B:107:0x013f, B:110:0x0144, B:111:0x0147), top: B:117:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b A[Catch: Exception -> 0x014b, TryCatch #0 {Exception -> 0x014b, blocks: (B:3:0x0001, B:5:0x000b, B:7:0x0012, B:9:0x0018, B:12:0x001f, B:13:0x0024, B:15:0x002a, B:17:0x0036, B:20:0x003b, B:21:0x003e, B:23:0x0040, B:25:0x0047, B:27:0x004d, B:30:0x0054, B:31:0x0059, B:33:0x005f, B:35:0x006b, B:38:0x0070, B:39:0x0073, B:41:0x0075, B:43:0x007c, B:45:0x0082, B:48:0x0089, B:49:0x008e, B:51:0x0094, B:53:0x00a0, B:56:0x00a5, B:57:0x00a8, B:59:0x00aa, B:61:0x00b1, B:63:0x00b7, B:66:0x00be, B:67:0x00c3, B:69:0x00c9, B:71:0x00d5, B:74:0x00da, B:75:0x00dd, B:77:0x00df, B:79:0x00e6, B:81:0x00ec, B:84:0x00f3, B:85:0x00f8, B:87:0x00fe, B:89:0x010a, B:92:0x010f, B:93:0x0112, B:95:0x0114, B:97:0x011b, B:99:0x0121, B:102:0x0128, B:103:0x012d, B:105:0x0133, B:107:0x013f, B:110:0x0144, B:111:0x0147), top: B:117:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k() {
        int i6;
        DepressionCourse depression;
        int i10;
        StressCourse stress;
        int i11;
        HappinessCourse happiness;
        int i12;
        SleepCourse sleep;
        int i13;
        WorryCourse worry;
        ArrayList<CourseDayModelV1> planV3;
        ArrayList<CourseDayModelV1> planV32;
        ArrayList<CourseDayModelV1> planV33;
        ArrayList<CourseDayModelV1> planV34;
        ArrayList<CourseDayModelV1> planV35;
        ArrayList<CourseDayModelV1> planV36;
        int i14 = 0;
        try {
            User user = FirebasePersistence.getInstance().getUser();
            if (user == null) {
                return 0;
            }
            AngerCourse anger = user.getAnger();
            if (anger != null && (planV36 = anger.getPlanV3()) != null && !planV36.isEmpty()) {
                i6 = 0;
                for (CourseDayModelV1 courseDayModelV1 : planV36) {
                    if (courseDayModelV1.isFavorite() && (i6 = i6 + 1) < 0) {
                        ca.a.s1();
                        throw null;
                    }
                }
                int i15 = i6 + 0;
                depression = user.getDepression();
                if (depression != null && (planV35 = depression.getPlanV3()) != null && !planV35.isEmpty()) {
                    i10 = 0;
                    for (CourseDayModelV1 courseDayModelV12 : planV35) {
                        if (courseDayModelV12.isFavorite() && (i10 = i10 + 1) < 0) {
                            ca.a.s1();
                            throw null;
                        }
                    }
                    int i16 = i15 + i10;
                    stress = user.getStress();
                    if (stress != null && (planV34 = stress.getPlanV3()) != null && !planV34.isEmpty()) {
                        i11 = 0;
                        for (CourseDayModelV1 courseDayModelV13 : planV34) {
                            if (courseDayModelV13.isFavorite() && (i11 = i11 + 1) < 0) {
                                ca.a.s1();
                                throw null;
                            }
                        }
                        int i17 = i16 + i11;
                        happiness = user.getHappiness();
                        if (happiness != null && (planV33 = happiness.getPlanV3()) != null && !planV33.isEmpty()) {
                            i12 = 0;
                            for (CourseDayModelV1 courseDayModelV14 : planV33) {
                                if (courseDayModelV14.isFavorite() && (i12 = i12 + 1) < 0) {
                                    ca.a.s1();
                                    throw null;
                                }
                            }
                            int i18 = i17 + i12;
                            sleep = user.getSleep();
                            if (sleep != null && (planV32 = sleep.getPlanV3()) != null && !planV32.isEmpty()) {
                                i13 = 0;
                                for (CourseDayModelV1 courseDayModelV15 : planV32) {
                                    if (courseDayModelV15.isFavorite() && (i13 = i13 + 1) < 0) {
                                        ca.a.s1();
                                        throw null;
                                    }
                                }
                                int i19 = i18 + i13;
                                worry = user.getWorry();
                                if (worry != null && (planV3 = worry.getPlanV3()) != null && !planV3.isEmpty()) {
                                    int i20 = 0;
                                    for (CourseDayModelV1 courseDayModelV16 : planV3) {
                                        if (courseDayModelV16.isFavorite() && (i20 = i20 + 1) < 0) {
                                            ca.a.s1();
                                            throw null;
                                        }
                                    }
                                    i14 = i20;
                                }
                                return i14 + i19;
                            }
                            i13 = 0;
                            int i192 = i18 + i13;
                            worry = user.getWorry();
                            if (worry != null) {
                                int i202 = 0;
                                while (r1.hasNext()) {
                                }
                                i14 = i202;
                            }
                            return i14 + i192;
                        }
                        i12 = 0;
                        int i182 = i17 + i12;
                        sleep = user.getSleep();
                        if (sleep != null) {
                            i13 = 0;
                            while (r2.hasNext()) {
                            }
                            int i1922 = i182 + i13;
                            worry = user.getWorry();
                            if (worry != null) {
                            }
                            return i14 + i1922;
                        }
                        i13 = 0;
                        int i19222 = i182 + i13;
                        worry = user.getWorry();
                        if (worry != null) {
                        }
                        return i14 + i19222;
                    }
                    i11 = 0;
                    int i172 = i16 + i11;
                    happiness = user.getHappiness();
                    if (happiness != null) {
                        i12 = 0;
                        while (r2.hasNext()) {
                        }
                        int i1822 = i172 + i12;
                        sleep = user.getSleep();
                        if (sleep != null) {
                        }
                        i13 = 0;
                        int i192222 = i1822 + i13;
                        worry = user.getWorry();
                        if (worry != null) {
                        }
                        return i14 + i192222;
                    }
                    i12 = 0;
                    int i18222 = i172 + i12;
                    sleep = user.getSleep();
                    if (sleep != null) {
                    }
                    i13 = 0;
                    int i1922222 = i18222 + i13;
                    worry = user.getWorry();
                    if (worry != null) {
                    }
                    return i14 + i1922222;
                }
                i10 = 0;
                int i162 = i15 + i10;
                stress = user.getStress();
                if (stress != null) {
                    i11 = 0;
                    while (r2.hasNext()) {
                    }
                    int i1722 = i162 + i11;
                    happiness = user.getHappiness();
                    if (happiness != null) {
                    }
                    i12 = 0;
                    int i182222 = i1722 + i12;
                    sleep = user.getSleep();
                    if (sleep != null) {
                    }
                    i13 = 0;
                    int i19222222 = i182222 + i13;
                    worry = user.getWorry();
                    if (worry != null) {
                    }
                    return i14 + i19222222;
                }
                i11 = 0;
                int i17222 = i162 + i11;
                happiness = user.getHappiness();
                if (happiness != null) {
                }
                i12 = 0;
                int i1822222 = i17222 + i12;
                sleep = user.getSleep();
                if (sleep != null) {
                }
                i13 = 0;
                int i192222222 = i1822222 + i13;
                worry = user.getWorry();
                if (worry != null) {
                }
                return i14 + i192222222;
            }
            i6 = 0;
            int i152 = i6 + 0;
            depression = user.getDepression();
            if (depression != null) {
                i10 = 0;
                while (r2.hasNext()) {
                }
                int i1622 = i152 + i10;
                stress = user.getStress();
                if (stress != null) {
                }
                i11 = 0;
                int i172222 = i1622 + i11;
                happiness = user.getHappiness();
                if (happiness != null) {
                }
                i12 = 0;
                int i18222222 = i172222 + i12;
                sleep = user.getSleep();
                if (sleep != null) {
                }
                i13 = 0;
                int i1922222222 = i18222222 + i13;
                worry = user.getWorry();
                if (worry != null) {
                }
                return i14 + i1922222222;
            }
            i10 = 0;
            int i16222 = i152 + i10;
            stress = user.getStress();
            if (stress != null) {
            }
            i11 = 0;
            int i1722222 = i16222 + i11;
            happiness = user.getHappiness();
            if (happiness != null) {
            }
            i12 = 0;
            int i182222222 = i1722222 + i12;
            sleep = user.getSleep();
            if (sleep != null) {
            }
            i13 = 0;
            int i19222222222 = i182222222 + i13;
            worry = user.getWorry();
            if (worry != null) {
            }
            return i14 + i19222222222;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
            return 0;
        }
    }

    public final String l() {
        String str;
        boolean z10;
        String str2;
        String firstName;
        try {
            User user = FirebasePersistence.getInstance().getUser();
            String str3 = null;
            if (user != null) {
                str = user.getFirstName();
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                User user2 = FirebasePersistence.getInstance().getUser();
                if (user2 != null && (firstName = user2.getFirstName()) != null) {
                    str3 = gv.r.i1(firstName).toString();
                }
                if (!kotlin.jvm.internal.i.b(str3, "null")) {
                    str2 = FirebasePersistence.getInstance().getUser().getFirstName();
                    kotlin.jvm.internal.i.f(str2, "{\n            if (!Fireb…\"\n            }\n        }");
                    return str2;
                }
            }
            String stringValue = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
            kotlin.jvm.internal.i.f(stringValue, "getInstance().getStringV…ionManager.KEY_FIRSTNAME)");
            if (kotlin.jvm.internal.i.b(gv.r.i1(stringValue).toString(), "null")) {
                str2 = "";
            } else {
                str2 = SessionManager.getInstance().getStringValue(SessionManager.KEY_FIRSTNAME);
            }
            kotlin.jvm.internal.i.f(str2, "{\n            if (!Fireb…\"\n            }\n        }");
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: Exception -> 0x0141, TRY_ENTER, TryCatch #0 {Exception -> 0x0141, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0014, B:21:0x0050, B:23:0x0058, B:25:0x0070, B:27:0x007e, B:33:0x008b, B:34:0x008f, B:36:0x0095, B:46:0x00cf, B:47:0x00d3, B:48:0x00e6, B:50:0x00ec, B:54:0x00ff, B:56:0x0103, B:58:0x0109, B:63:0x0114, B:64:0x0119, B:39:0x00b2, B:40:0x00b6, B:42:0x00bc, B:69:0x0132, B:65:0x011e, B:66:0x0122, B:68:0x0128, B:10:0x001c, B:11:0x0020, B:13:0x0026), top: B:74:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058 A[Catch: Exception -> 0x0141, TryCatch #0 {Exception -> 0x0141, blocks: (B:3:0x0002, B:5:0x000e, B:7:0x0014, B:21:0x0050, B:23:0x0058, B:25:0x0070, B:27:0x007e, B:33:0x008b, B:34:0x008f, B:36:0x0095, B:46:0x00cf, B:47:0x00d3, B:48:0x00e6, B:50:0x00ec, B:54:0x00ff, B:56:0x0103, B:58:0x0109, B:63:0x0114, B:64:0x0119, B:39:0x00b2, B:40:0x00b6, B:42:0x00bc, B:69:0x0132, B:65:0x011e, B:66:0x0122, B:68:0x0128, B:10:0x001c, B:11:0x0020, B:13:0x0026), top: B:74:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final hs.f<ArrayList<String>, Boolean> m() {
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        boolean z13;
        ArrayList<CourseDayModelV1> plan;
        ArrayList<MiniCourse> topicalCourseList;
        boolean z14;
        try {
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null && (topicalCourseList = user.getTopicalCourseList()) != null) {
                if (!topicalCourseList.isEmpty()) {
                    for (MiniCourse miniCourse : topicalCourseList) {
                        if (is.k.Q1(miniCourse.getDomain(), new String[]{"goal-setting-newyear", "building-hope-newyear", "self-love-newyear", "emotional-intimacy-newyear", "cultivating-resilience-covid", "loneliness-covid"})) {
                            z14 = true;
                            break;
                        }
                    }
                }
                z14 = false;
                if (z14) {
                    z10 = true;
                    ArrayList<String> arrayList = this.f25367f0;
                    if (!z10) {
                        return new hs.f<>(arrayList, Boolean.TRUE);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (FirebasePersistence.getInstance().getUser().getTopicalCourseList() != null) {
                        ArrayList<MiniCourse> topicalCourseList2 = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
                        if (topicalCourseList2 != null && topicalCourseList2.isEmpty()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            for (String str : arrayList) {
                                ArrayList<MiniCourse> topicalCourseList3 = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
                                kotlin.jvm.internal.i.f(topicalCourseList3, "getInstance().user.topicalCourseList");
                                if (!topicalCourseList3.isEmpty()) {
                                    for (MiniCourse miniCourse2 : topicalCourseList3) {
                                        if (kotlin.jvm.internal.i.b(miniCourse2.getDomain(), str)) {
                                            z12 = false;
                                            break;
                                        }
                                    }
                                }
                                z12 = true;
                                if (z12) {
                                    arrayList2.add(str);
                                } else {
                                    ArrayList<MiniCourse> topicalCourseList4 = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
                                    kotlin.jvm.internal.i.f(topicalCourseList4, "getInstance().user.topicalCourseList");
                                    Iterator<T> it = topicalCourseList4.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            if (kotlin.jvm.internal.i.b(((MiniCourse) obj).getDomain(), str)) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    MiniCourse miniCourse3 = (MiniCourse) obj;
                                    if (miniCourse3 != null && (plan = miniCourse3.getPlan()) != null && plan.isEmpty()) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        arrayList2.add(str);
                                    } else {
                                        arrayList3.add(str);
                                    }
                                }
                            }
                            arrayList.removeAll(is.u.M2(arrayList3));
                            return new hs.f<>(arrayList2, Boolean.FALSE);
                        }
                    }
                    for (String str2 : arrayList) {
                        arrayList2.add(str2);
                    }
                    arrayList.removeAll(is.u.M2(arrayList3));
                    return new hs.f<>(arrayList2, Boolean.FALSE);
                }
            }
            z10 = false;
            ArrayList<String> arrayList4 = this.f25367f0;
            if (!z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
            return new hs.f<>(new ArrayList(), Boolean.FALSE);
        }
    }

    public final void n(RoutingIntentHandler routingIntentHandler) {
        this.X.i(routingIntentHandler);
    }

    @Override // com.theinnerhour.b2b.utils.ConnectionStatusReceiver.ConnectivityListener
    public final void networkConnected() {
        if (!this.P) {
            this.P = true;
            ta.v.H(kc.f.H(this), null, 0, new p(null), 3);
        }
    }

    @Override // com.theinnerhour.b2b.utils.ConnectionStatusReceiver.ConnectivityListener
    public final void networkDisconnected() {
        if (this.P) {
            this.P = false;
        }
    }

    /* compiled from: V3DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.viewModel.V3DashboardViewModel$fetchNotifications$1", f = "V3DashboardViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {
        public j(ls.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new j(dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((j) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            try {
                CourseApiUtil courseApiUtil = new CourseApiUtil();
                courseApiUtil.setCourseApiListener(new a());
                if (FirebasePersistence.getInstance().getUser() != null) {
                    courseApiUtil.fetchNotificationData();
                }
                courseApiUtil.updateNotifications();
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(c0.this.A, e10);
            }
            return hs.k.f19476a;
        }

        /* compiled from: V3DashboardViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class a implements CourseApiUtil.CourseApiUtilInterface {
            @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
            public final void errorLoadingData(Exception error) {
                kotlin.jvm.internal.i.g(error, "error");
            }

            @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
            public final void audioDownloadComplete() {
            }

            @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
            public final void courseApiComplete(boolean z10) {
            }

            @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
            public final void notificationFetchComplete(boolean z10) {
            }
        }
    }
}
