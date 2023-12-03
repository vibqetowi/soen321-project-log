package com.theinnerhour.b2b.components.minicourses;

import android.app.Application;
import androidx.lifecycle.w;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.MiniCourseInfoMeta;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import gv.r;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.o0;
import ss.p;
import ta.v;
/* compiled from: MiniCoursesViewModel.kt */
/* loaded from: classes2.dex */
public final class MiniCoursesViewModel extends androidx.lifecycle.b {
    public final w<List<MiniCourse>> A;
    public boolean B;
    public int C;
    public final Type D;
    public ArrayList<String> E;
    public final Type F;
    public ArrayList<MiniCourseInfoMeta> G;
    public final com.google.android.gms.internal.cast.w H;

    /* renamed from: y  reason: collision with root package name */
    public final String f11378y;

    /* renamed from: z  reason: collision with root package name */
    public final w<List<MiniCourse>> f11379z;

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f11380u = new a();

        public a() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            MiniCourse miniCourse3 = miniCourse;
            MiniCourse miniCourse4 = miniCourse2;
            miniCourse4.getDomain();
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            applicationPersistence.getLongValue(miniCourse4.getDomain() + "_mc_time", -1L);
            ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
            applicationPersistence2.getLongValue(miniCourse3.getDomain() + "_mc_time", -1L);
            ApplicationPersistence applicationPersistence3 = ApplicationPersistence.getInstance();
            long longValue = applicationPersistence3.getLongValue(miniCourse4.getDomain() + "_mc_time", -1L);
            ApplicationPersistence applicationPersistence4 = ApplicationPersistence.getInstance();
            return Integer.valueOf(kotlin.jvm.internal.i.j(longValue, applicationPersistence4.getLongValue(miniCourse3.getDomain() + "_mc_time", -1L)));
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f11381u = new b();

        public b() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            return Integer.valueOf(kotlin.jvm.internal.i.i(miniCourse.getPosition(), miniCourse2.getPosition()));
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f11382u = new c();

        public c() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            return Integer.valueOf(Boolean.compare(kotlin.jvm.internal.i.b(miniCourse2.getCourse(), FirebasePersistence.getInstance().getUser().getCurrentCourseName()), kotlin.jvm.internal.i.b(miniCourse.getCourse(), FirebasePersistence.getInstance().getUser().getCurrentCourseName())));
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f11383u = new d();

        public d() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            boolean z10;
            MiniCourse miniCourse3 = miniCourse;
            MiniCourse miniCourse4 = miniCourse2;
            String domain = miniCourse4.getDomain();
            kotlin.jvm.internal.i.d(domain);
            boolean z11 = true;
            if (r.J0(domain, "basic") && kotlin.jvm.internal.i.b(miniCourse4.getCourse(), FirebasePersistence.getInstance().getUser().getCurrentCourseName())) {
                z10 = true;
            } else {
                z10 = false;
            }
            String domain2 = miniCourse3.getDomain();
            kotlin.jvm.internal.i.d(domain2);
            return Integer.valueOf(Boolean.compare(z10, (r.J0(domain2, "basic") && kotlin.jvm.internal.i.b(miniCourse3.getCourse(), FirebasePersistence.getInstance().getUser().getCurrentCourseName())) ? false : false));
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class e extends kotlin.jvm.internal.k implements p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final e f11384u = new e();

        public e() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            String domain = miniCourse2.getDomain();
            kotlin.jvm.internal.i.d(domain);
            boolean J0 = r.J0(domain, "basic");
            String domain2 = miniCourse.getDomain();
            kotlin.jvm.internal.i.d(domain2);
            return Integer.valueOf(Boolean.compare(J0, r.J0(domain2, "basic")));
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final f f11385u = new f();

        public f() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            String domain = miniCourse2.getDomain();
            kotlin.jvm.internal.i.d(domain);
            int mcDayProgress = MiniCourseUtilsKt.getMcDayProgress(domain);
            String domain2 = miniCourse.getDomain();
            kotlin.jvm.internal.i.d(domain2);
            return Integer.valueOf(kotlin.jvm.internal.i.i(mcDayProgress, MiniCourseUtilsKt.getMcDayProgress(domain2)));
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final g f11386u = new g();

        public g() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            String domain = miniCourse2.getDomain();
            kotlin.jvm.internal.i.d(domain);
            long latestMcAttempt = MiniCourseUtilsKt.getLatestMcAttempt(domain);
            String domain2 = miniCourse.getDomain();
            kotlin.jvm.internal.i.d(domain2);
            return Integer.valueOf(kotlin.jvm.internal.i.j(latestMcAttempt, MiniCourseUtilsKt.getLatestMcAttempt(domain2)));
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final h f11387u = new h();

        public h() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            long longValue = applicationPersistence.getLongValue(miniCourse2.getDomain() + "_mc_time", -1L);
            ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
            return Integer.valueOf(kotlin.jvm.internal.i.j(longValue, applicationPersistence2.getLongValue(miniCourse.getDomain() + "_mc_time", -1L)));
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final i f11388u = new i();

        public i() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            String domain = miniCourse2.getDomain();
            kotlin.jvm.internal.i.d(domain);
            boolean J0 = r.J0(domain, "basic");
            String domain2 = miniCourse.getDomain();
            kotlin.jvm.internal.i.d(domain2);
            return Integer.valueOf(Boolean.compare(J0, r.J0(domain2, "basic")));
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final j f11389u = new j();

        public j() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            String domain = miniCourse2.getDomain();
            kotlin.jvm.internal.i.d(domain);
            long latestMcAttempt = MiniCourseUtilsKt.getLatestMcAttempt(domain);
            String domain2 = miniCourse.getDomain();
            kotlin.jvm.internal.i.d(domain2);
            return Integer.valueOf(kotlin.jvm.internal.i.j(latestMcAttempt, MiniCourseUtilsKt.getLatestMcAttempt(domain2)));
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final k f11390u = new k();

        public k() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            long longValue = applicationPersistence.getLongValue(miniCourse2.getDomain() + "_mc_time", -1L);
            ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
            return Integer.valueOf(kotlin.jvm.internal.i.j(longValue, applicationPersistence2.getLongValue(miniCourse.getDomain() + "_mc_time", -1L)));
        }
    }

    /* compiled from: MiniCoursesViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class l extends kotlin.jvm.internal.k implements p<MiniCourse, MiniCourse, Integer> {

        /* renamed from: u  reason: collision with root package name */
        public static final l f11391u = new l();

        public l() {
            super(2);
        }

        @Override // ss.p
        public final Integer invoke(MiniCourse miniCourse, MiniCourse miniCourse2) {
            return Integer.valueOf(kotlin.jvm.internal.i.i(miniCourse.getPosition(), miniCourse2.getPosition()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniCoursesViewModel(Application application) {
        super(application);
        kotlin.jvm.internal.i.g(application, "application");
        this.f11378y = LogHelper.INSTANCE.makeLogTag("MiniCoursesViewModel");
        this.f11379z = new w<>();
        this.A = new w<>();
        this.D = new TypeToken<ArrayList<String>>() { // from class: com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel$arrayListStringType$1
        }.getType();
        this.E = new ArrayList<>();
        this.F = new TypeToken<ArrayList<MiniCourseInfoMeta>>() { // from class: com.theinnerhour.b2b.components.minicourses.MiniCoursesViewModel$arrayListMetaType$1
        }.getType();
        this.G = new ArrayList<>();
        this.H = new com.google.android.gms.internal.cast.w();
    }

    public final void e(int i6, String str) {
        v.H(kc.f.H(this), o0.f23642c, 0, new ln.b(this, i6, str, null), 2);
    }

    public final void f(String str) {
        Object c10 = new sf.i().c(ApplicationPersistence.getInstance().getStringValue("mc_slug_list"), this.D);
        kotlin.jvm.internal.i.f(c10, "Gson().fromJson(Applicat…t\"), arrayListStringType)");
        this.E = (ArrayList) c10;
        Object c11 = new sf.i().c(ApplicationPersistence.getInstance().getStringValue("mc_meta_list"), this.F);
        kotlin.jvm.internal.i.f(c11, "Gson().fromJson(Applicat…ist\"), arrayListMetaType)");
        this.G = (ArrayList) c11;
        if (!this.B) {
            e(0, str);
        }
    }

    public final void g(String str) {
        try {
            Object c10 = new sf.i().c(ApplicationPersistence.getInstance().getStringValue("mc_slug_list"), this.D);
            kotlin.jvm.internal.i.f(c10, "Gson().fromJson(Applicat…t\"), arrayListStringType)");
            this.E = (ArrayList) c10;
            Object c11 = new sf.i().c(ApplicationPersistence.getInstance().getStringValue("mc_meta_list"), this.F);
            kotlin.jvm.internal.i.f(c11, "Gson().fromJson(Applicat…ist\"), arrayListMetaType)");
            this.G = (ArrayList) c11;
            ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
            kotlin.jvm.internal.i.f(miniCourses, "getInstance().user.miniCourses");
            ArrayList arrayList = new ArrayList();
            for (Object obj : miniCourses) {
                if (kotlin.jvm.internal.i.b(((MiniCourse) obj).getDomain(), str)) {
                    arrayList.add(obj);
                }
            }
            this.f11379z.i(arrayList);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11378y, e10);
        }
    }

    public final String h(String str) {
        try {
            if (this.G.isEmpty()) {
                Object c10 = new sf.i().c(ApplicationPersistence.getInstance().getStringValue("mc_meta_list"), this.F);
                kotlin.jvm.internal.i.f(c10, "Gson().fromJson(Applicat…ist\"), arrayListMetaType)");
                this.G = (ArrayList) c10;
            }
            Iterator<MiniCourseInfoMeta> it = this.G.iterator();
            while (it.hasNext()) {
                MiniCourseInfoMeta next = it.next();
                if (kotlin.jvm.internal.i.b(next.getSlug(), str)) {
                    return next.getName();
                }
            }
            return "";
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11378y, e10);
            return "";
        }
    }

    public final HashMap<String, String> i() {
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            if (this.G.isEmpty()) {
                Object c10 = new sf.i().c(ApplicationPersistence.getInstance().getStringValue("mc_meta_list"), this.F);
                kotlin.jvm.internal.i.f(c10, "Gson().fromJson(Applicat…ist\"), arrayListMetaType)");
                this.G = (ArrayList) c10;
            }
            Iterator<MiniCourseInfoMeta> it = this.G.iterator();
            while (it.hasNext()) {
                MiniCourseInfoMeta next = it.next();
                hashMap.put(next.getSlug(), next.getName());
            }
            return hashMap;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11378y, e10);
            return new HashMap<>();
        }
    }

    public final ArrayList<String> j(String str) {
        try {
            if (this.G.isEmpty()) {
                Object c10 = new sf.i().c(ApplicationPersistence.getInstance().getStringValue("mc_meta_list"), this.F);
                kotlin.jvm.internal.i.f(c10, "Gson().fromJson(Applicat…ist\"), arrayListMetaType)");
                this.G = (ArrayList) c10;
            }
            Iterator<MiniCourseInfoMeta> it = this.G.iterator();
            while (it.hasNext()) {
                MiniCourseInfoMeta next = it.next();
                if (kotlin.jvm.internal.i.b(next.getSlug(), str)) {
                    return next.getWelcomeStrings();
                }
            }
            return new ArrayList<>();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11378y, e10);
            return new ArrayList<>();
        }
    }

    public final void k(String str) {
        try {
            Object c10 = new sf.i().c(ApplicationPersistence.getInstance().getStringValue("mc_slug_list"), this.D);
            kotlin.jvm.internal.i.f(c10, "Gson().fromJson(Applicat…t\"), arrayListStringType)");
            this.E = (ArrayList) c10;
            Object c11 = new sf.i().c(ApplicationPersistence.getInstance().getStringValue("mc_meta_list"), this.F);
            kotlin.jvm.internal.i.f(c11, "Gson().fromJson(Applicat…ist\"), arrayListMetaType)");
            this.G = (ArrayList) c11;
            ArrayList<MiniCourse> mcList = FirebasePersistence.getInstance().getUser().getMiniCourses();
            kotlin.jvm.internal.i.f(mcList, "mcList");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = mcList.iterator();
            while (true) {
                boolean z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((MiniCourse) next).getPlan().size() != 0) {
                    z10 = true;
                }
                if (z10) {
                    arrayList.add(next);
                }
            }
            if (ca.a.k("v2.3", Constants.USER_VERSION).contains(FirebasePersistence.getInstance().getUser().getVersion()) && str != null) {
                if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    if (!arrayList.isEmpty()) {
                        is.p.P1(arrayList, new dm.a(e.f11384u, 9));
                        is.p.P1(arrayList, new dm.a(f.f11385u, 12));
                        is.p.P1(arrayList, new dm.a(g.f11386u, 13));
                        is.p.P1(arrayList, new dm.a(h.f11387u, 14));
                    }
                } else if (!arrayList.isEmpty()) {
                    is.p.P1(arrayList, new dm.a(i.f11388u, 15));
                }
            } else {
                if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.3", Constants.USER_VERSION})) {
                    if (!arrayList.isEmpty()) {
                        is.p.P1(arrayList, new dm.a(j.f11389u, 16));
                        is.p.P1(arrayList, new dm.a(k.f11390u, 17));
                    }
                } else if (!arrayList.isEmpty()) {
                    is.p.P1(arrayList, new dm.a(l.f11391u, 18));
                    is.p.P1(arrayList, new dm.a(a.f11380u, 19));
                }
            }
            w<List<MiniCourse>> wVar = this.f11379z;
            if (str == null) {
                wVar.i(arrayList);
                if (ca.a.k("v2.3", Constants.USER_VERSION).contains(FirebasePersistence.getInstance().getUser().getVersion())) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList);
                    is.p.P1(arrayList2, new dm.a(b.f11381u, 20));
                    is.p.P1(arrayList2, new dm.a(c.f11382u, 10));
                    is.p.P1(arrayList2, new dm.a(d.f11383u, 11));
                    this.A.i(arrayList2);
                }
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList) {
                    if (kotlin.jvm.internal.i.b(((MiniCourse) obj).getCourse(), str)) {
                        arrayList3.add(obj);
                    }
                }
                wVar.i(arrayList3);
            }
            this.B = false;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f11378y, e10);
        }
    }
}
