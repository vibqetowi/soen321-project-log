package jl;

import android.app.Application;
import androidx.work.r;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.service.BootReceiverNotificationWorkManager;
import com.theinnerhour.b2b.service.PostLoginNotificationWorkManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import nf.c;
import org.json.JSONArray;
/* compiled from: CustomDashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class e extends androidx.lifecycle.b {
    public final String A;
    public final hs.i B;
    public final androidx.lifecycle.w<SingleUseEvent<JSONArray>> C;
    public final androidx.lifecycle.w<Boolean> D;
    public final androidx.lifecycle.w<SingleUseEvent<Integer>> E;
    public final androidx.lifecycle.w<Boolean> F;
    public final androidx.lifecycle.w<Boolean> G;
    public final androidx.lifecycle.w<hs.f<Boolean, ArrayList<String>>> H;
    public final androidx.lifecycle.w<Boolean> I;
    public final hs.i J;
    public final hs.i K;
    public final ArrayList<String> L;
    public final androidx.lifecycle.w<Boolean> M;

    /* renamed from: y  reason: collision with root package name */
    public final u f22146y;

    /* renamed from: z  reason: collision with root package name */
    public final rp.a f22147z;

    /* compiled from: CustomDashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<CourseApiUtil> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f22148u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final CourseApiUtil invoke() {
            return new CourseApiUtil();
        }
    }

    /* compiled from: CustomDashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.w<SingleUseEvent<? extends Boolean>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f22149u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final androidx.lifecycle.w<SingleUseEvent<? extends Boolean>> invoke() {
            return new androidx.lifecycle.w<>();
        }
    }

    /* compiled from: CustomDashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<androidx.lifecycle.w<SingleUseEvent<? extends Boolean>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f22150u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final androidx.lifecycle.w<SingleUseEvent<? extends Boolean>> invoke() {
            return new androidx.lifecycle.w<>();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u repository, rp.a provideAssignedRepository, Application application) {
        super(application);
        HashMap<String, Object> appConfig;
        kotlin.jvm.internal.i.g(repository, "repository");
        kotlin.jvm.internal.i.g(provideAssignedRepository, "provideAssignedRepository");
        kotlin.jvm.internal.i.g(application, "application");
        this.f22146y = repository;
        this.f22147z = provideAssignedRepository;
        this.A = LogHelper.INSTANCE.makeLogTag("CustomDashboardViewModel");
        this.B = sp.b.O(c.f22150u);
        this.C = new androidx.lifecycle.w<>();
        this.D = new androidx.lifecycle.w<>(null);
        this.E = new androidx.lifecycle.w<>();
        this.F = new androidx.lifecycle.w<>();
        this.G = new androidx.lifecycle.w<>();
        this.H = new androidx.lifecycle.w<>(null);
        this.I = new androidx.lifecycle.w<>();
        this.J = sp.b.O(a.f22148u);
        this.K = sp.b.O(b.f22149u);
        boolean z10 = false;
        try {
            if (ApplicationPersistence.getInstance().containsKey(PostLoginNotificationWorkManager.POST_LOGIN_NOTIFICATION_ATTEMPT) && ApplicationPersistence.getInstance().getIntValue(PostLoginNotificationWorkManager.POST_LOGIN_NOTIFICATION_ATTEMPT, 0) < 3) {
                n2.a0 e10 = n2.a0.e(this.f2382x.getApplicationContext());
                e10.getClass();
                e10.c(Collections.singletonList(new r.a(PostLoginNotificationWorkManager.class).a())).M(Collections.singletonList(new r.a(BootReceiverNotificationWorkManager.class).a())).J();
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.A, e11);
        }
        if (defpackage.b.u(SessionManager.KEY_USERTYPE, "patient")) {
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null && (appConfig = user.getAppConfig()) != null && !appConfig.containsKey(Constants.FIRESTORE_GOALS_EXPERIMENT)) {
                z10 = true;
            }
            if (z10) {
                nf.b e12 = nf.b.e();
                kotlin.jvm.internal.i.f(e12, "getInstance()");
                e12.g(new nf.c(new c.a()));
                e12.b().addOnCompleteListener(new com.google.firebase.messaging.h(e12, 1, this));
            }
        }
        this.L = ca.a.k(Constants.TOPICAL_2022_HEALTH_ANXIETY, Constants.TOPICAL_2022_TIME_MANAGEMENT, Constants.TOPICAL_2022_MOTIVATION, Constants.TOPICAL_2022_NURTURING_RELATIONSHIP, Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY, Constants.TOPICAL_2022_COVID);
        this.M = new androidx.lifecycle.w<>();
    }

    public static final void e(e eVar, hs.f fVar) {
        try {
            HashMap hashMap = new HashMap();
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            for (String str : (Iterable) fVar.f19464u) {
                FireStoreUtilsKt.fetchTopicalCourse(str, new jl.a(hashMap, str, eVar, uVar, fVar));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(eVar.A, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[Catch: Exception -> 0x0147, TRY_ENTER, TryCatch #0 {Exception -> 0x0147, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0017, B:22:0x0054, B:23:0x005d, B:25:0x0075, B:27:0x0083, B:33:0x0090, B:34:0x0094, B:36:0x009a, B:47:0x00d5, B:48:0x00d9, B:49:0x00ec, B:51:0x00f2, B:55:0x0105, B:57:0x0109, B:59:0x010f, B:64:0x011a, B:65:0x011f, B:39:0x00b6, B:40:0x00ba, B:42:0x00c0, B:70:0x0138, B:66:0x0124, B:67:0x0128, B:69:0x012e, B:10:0x001e, B:11:0x0022, B:13:0x0028), top: B:75:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[Catch: Exception -> 0x0147, TryCatch #0 {Exception -> 0x0147, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0017, B:22:0x0054, B:23:0x005d, B:25:0x0075, B:27:0x0083, B:33:0x0090, B:34:0x0094, B:36:0x009a, B:47:0x00d5, B:48:0x00d9, B:49:0x00ec, B:51:0x00f2, B:55:0x0105, B:57:0x0109, B:59:0x010f, B:64:0x011a, B:65:0x011f, B:39:0x00b6, B:40:0x00ba, B:42:0x00c0, B:70:0x0138, B:66:0x0124, B:67:0x0128, B:69:0x012e, B:10:0x001e, B:11:0x0022, B:13:0x0028), top: B:75:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hs.f f(e eVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        boolean z13;
        ArrayList<CourseDayModelV1> plan;
        ArrayList<MiniCourse> topicalCourseList;
        boolean z14;
        eVar.getClass();
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
                    ArrayList<String> arrayList = eVar.L;
                    if (!z10) {
                        return new hs.f(arrayList, Boolean.TRUE);
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
                            return new hs.f(arrayList2, Boolean.FALSE);
                        }
                    }
                    for (String str2 : arrayList) {
                        arrayList2.add(str2);
                    }
                    arrayList.removeAll(is.u.M2(arrayList3));
                    return new hs.f(arrayList2, Boolean.FALSE);
                }
            }
            z10 = false;
            ArrayList<String> arrayList4 = eVar.L;
            if (!z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(eVar.A, e10);
            return new hs.f(new ArrayList(), Boolean.FALSE);
        }
    }
}
