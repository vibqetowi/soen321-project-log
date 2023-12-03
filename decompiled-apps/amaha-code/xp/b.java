package xp;

import androidx.lifecycle.l0;
import androidx.lifecycle.w;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import hs.f;
import is.k;
import is.p;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
/* compiled from: TopicalCoursesViewModel.kt */
/* loaded from: classes2.dex */
public final class b extends l0 {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f37883x = ca.a.k(Constants.TOPICAL_2022_HEALTH_ANXIETY, Constants.TOPICAL_2022_TIME_MANAGEMENT, Constants.TOPICAL_2022_MOTIVATION, Constants.TOPICAL_2022_NURTURING_RELATIONSHIP, Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY, Constants.TOPICAL_2022_COVID);

    /* renamed from: y  reason: collision with root package name */
    public final w<ArrayList<MiniCourse>> f37884y = new w<>(new ArrayList());

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            String domain = ((MiniCourse) t10).getDomain();
            i.d(domain);
            b bVar = b.this;
            Integer valueOf = Integer.valueOf(b.e(bVar, domain));
            String domain2 = ((MiniCourse) t3).getDomain();
            i.d(domain2);
            return sp.b.g(valueOf, Integer.valueOf(b.e(bVar, domain2)));
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: xp.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0638b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            return sp.b.g(Integer.valueOf(MiniCourseUtilsKt.getMiniCourseProgress((MiniCourse) t10)), Integer.valueOf(MiniCourseUtilsKt.getMiniCourseProgress((MiniCourse) t3)));
        }
    }

    /* compiled from: Comparisons.kt */
    /* loaded from: classes2.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            Long valueOf = Long.valueOf(applicationPersistence.getLongValue(((MiniCourse) t10).getDomain() + "_access_time"));
            ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
            return sp.b.g(valueOf, Long.valueOf(applicationPersistence2.getLongValue(((MiniCourse) t3).getDomain() + "_access_time")));
        }
    }

    public static final int e(b bVar, String str) {
        bVar.getClass();
        switch (str.hashCode()) {
            case -1552422584:
                if (str.equals(Constants.TOPICAL_2022_TIME_MANAGEMENT)) {
                    return 2;
                }
                break;
            case -1190562844:
                if (str.equals(Constants.TOPICAL_2022_HEALTH_ANXIETY)) {
                    return 1;
                }
                break;
            case 58855846:
                if (str.equals(Constants.TOPICAL_2022_COVID)) {
                    return 6;
                }
                break;
            case 378061269:
                if (str.equals(Constants.TOPICAL_2022_MOTIVATION)) {
                    return 3;
                }
                break;
            case 416780353:
                if (str.equals(Constants.TOPICAL_2022_NURTURING_RELATIONSHIP)) {
                    return 4;
                }
                break;
            case 1196421508:
                if (str.equals(Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY)) {
                    return 5;
                }
                break;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        boolean z10;
        f fVar;
        boolean z11;
        boolean z12;
        Object obj;
        boolean z13;
        ArrayList<CourseDayModelV1> plan;
        A a10;
        ArrayList<MiniCourse> topicalCourseList;
        boolean z14;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (topicalCourseList = user.getTopicalCourseList()) != null) {
            if (!topicalCourseList.isEmpty()) {
                for (MiniCourse miniCourse : topicalCourseList) {
                    if (k.Q1(miniCourse.getDomain(), new String[]{"goal-setting-newyear", "building-hope-newyear", "self-love-newyear", "emotional-intimacy-newyear", "cultivating-resilience-covid", "loneliness-covid"})) {
                        z14 = true;
                        break;
                    }
                }
            }
            z14 = false;
            if (z14) {
                z10 = true;
                ArrayList<String> arrayList = this.f37883x;
                if (!z10) {
                    fVar = new f(arrayList, Boolean.TRUE);
                } else {
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
                                i.f(topicalCourseList3, "getInstance().user.topicalCourseList");
                                if (!topicalCourseList3.isEmpty()) {
                                    for (MiniCourse miniCourse2 : topicalCourseList3) {
                                        if (i.b(miniCourse2.getDomain(), str)) {
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
                                    i.f(topicalCourseList4, "getInstance().user.topicalCourseList");
                                    Iterator<T> it = topicalCourseList4.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            if (i.b(((MiniCourse) obj).getDomain(), str)) {
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
                            arrayList.removeAll(arrayList3);
                            fVar = new f(arrayList2, Boolean.FALSE);
                        }
                    }
                    for (String str2 : arrayList) {
                        arrayList2.add(str2);
                    }
                    arrayList.removeAll(arrayList3);
                    fVar = new f(arrayList2, Boolean.FALSE);
                }
                a10 = fVar.f19464u;
                if (!((ArrayList) a10).isEmpty()) {
                    g();
                    return;
                }
                HashMap hashMap = new HashMap();
                u uVar = new u();
                for (String str3 : (Iterable) a10) {
                    FireStoreUtilsKt.fetchTopicalCourse(str3, new xp.a(hashMap, str3, this, uVar, fVar));
                }
                return;
            }
        }
        z10 = false;
        ArrayList<String> arrayList4 = this.f37883x;
        if (!z10) {
        }
        a10 = fVar.f19464u;
        if (!((ArrayList) a10).isEmpty()) {
        }
    }

    public final void g() {
        ArrayList<MiniCourse> arrayList = new ArrayList<>();
        arrayList.addAll(FirebasePersistence.getInstance().getUser().getTopicalCourseList());
        if (arrayList.size() > 1) {
            p.P1(arrayList, new a());
        }
        if (arrayList.size() > 1) {
            p.P1(arrayList, new C0638b());
        }
        if (arrayList.size() > 1) {
            p.P1(arrayList, new c());
        }
        this.f37884y.l(arrayList);
    }
}
