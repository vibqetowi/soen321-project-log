package bn;

import an.t;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.ScrollStateListenerCustomNestedScrollView;
import com.theinnerhour.b2b.utils.UtilsKt;
import hs.k;
import java.util.Timer;
import ss.l;
/* compiled from: LibraryHomeFragmentCoachMarkUtil.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f4537a;

    /* renamed from: b  reason: collision with root package name */
    public final View f4538b;

    /* renamed from: c  reason: collision with root package name */
    public final l<xj.b, k> f4539c;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4541e;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4542g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4543h;

    /* renamed from: k  reason: collision with root package name */
    public Timer f4546k;

    /* renamed from: l  reason: collision with root package name */
    public Timer f4547l;

    /* renamed from: m  reason: collision with root package name */
    public Timer f4548m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f4549n;

    /* renamed from: d  reason: collision with root package name */
    public final String f4540d = LogHelper.INSTANCE.makeLogTag("LibraryHomeFragmentCoachMarkUtil");

    /* renamed from: i  reason: collision with root package name */
    public boolean f4544i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4545j = true;

    public c(p pVar, View view, t.d dVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f4537a = pVar;
        this.f4538b = view;
        this.f4539c = dVar;
        this.f4541e = true;
        this.f = true;
        this.f4542g = true;
        this.f4543h = true;
        try {
            if (!ApplicationPersistence.getInstance().getBooleanValue("lib_coach_mark_tp", false)) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f4541e = z10;
            if (!ApplicationPersistence.getInstance().getBooleanValue("lib_coach_mark_sc", false)) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f = z11;
            if (!ApplicationPersistence.getInstance().getBooleanValue("lib_coach_mark_co", false)) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f4542g = z12;
            this.f4549n = ApplicationPersistence.getInstance().getBooleanValue("lib_coach_mark_immediate", false);
            ApplicationPersistence.getInstance().setBooleanValue("lib_coach_mark_immediate", true);
            if (view != null) {
                try {
                    ScrollStateListenerCustomNestedScrollView scrollStateListenerCustomNestedScrollView = (ScrollStateListenerCustomNestedScrollView) view.findViewById(R.id.libraryContainer);
                    if (scrollStateListenerCustomNestedScrollView != null) {
                        scrollStateListenerCustomNestedScrollView.setOnScrollStoppedListener(new g(this));
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this.f4540d, e10);
                    return;
                }
            }
            this.f4543h = false;
            g();
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f4540d, e11);
        }
    }

    public static final void a(c cVar) {
        ScrollStateListenerCustomNestedScrollView scrollStateListenerCustomNestedScrollView;
        String str = cVar.f4540d;
        try {
            if (cVar.f4542g && cVar.i()) {
                if (cVar.f4549n) {
                    View view = cVar.f4538b;
                    if (view != null && (scrollStateListenerCustomNestedScrollView = (ScrollStateListenerCustomNestedScrollView) view.findViewById(R.id.libraryContainer)) != null) {
                        scrollStateListenerCustomNestedScrollView.smoothScrollBy(0, 0);
                    }
                    cVar.d();
                    return;
                }
                cVar.f4545j = false;
                try {
                    Timer timer = new Timer();
                    cVar.f4548m = timer;
                    timer.schedule(new d(cVar), 3000L);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, e10);
                }
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    public static final void b(c cVar) {
        ScrollStateListenerCustomNestedScrollView scrollStateListenerCustomNestedScrollView;
        String str = cVar.f4540d;
        try {
            if (cVar.f && cVar.j()) {
                if (cVar.f4549n) {
                    View view = cVar.f4538b;
                    if (view != null && (scrollStateListenerCustomNestedScrollView = (ScrollStateListenerCustomNestedScrollView) view.findViewById(R.id.libraryContainer)) != null) {
                        scrollStateListenerCustomNestedScrollView.smoothScrollBy(0, 0);
                    }
                    cVar.e();
                    return;
                }
                cVar.f4544i = false;
                try {
                    Timer timer = new Timer();
                    cVar.f4547l = timer;
                    timer.schedule(new e(cVar), 3000L);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, e10);
                }
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    public final void c(String str) {
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1852828939) {
                if (hashCode != -1741312354) {
                    if (hashCode == 114726152 && str.equals("top_picks")) {
                        this.f4541e = false;
                        ApplicationPersistence.getInstance().setBooleanValue("lib_coach_mark_tp", true);
                        Timer timer = this.f4546k;
                        if (timer != null) {
                            timer.cancel();
                        }
                        Timer timer2 = this.f4546k;
                        if (timer2 != null) {
                            timer2.purge();
                        }
                        this.f4546k = null;
                    }
                } else if (str.equals("collection")) {
                    this.f4542g = false;
                    ApplicationPersistence.getInstance().setBooleanValue("lib_coach_mark_co", true);
                    Timer timer3 = this.f4548m;
                    if (timer3 != null) {
                        timer3.cancel();
                    }
                    Timer timer4 = this.f4548m;
                    if (timer4 != null) {
                        timer4.purge();
                    }
                    this.f4548m = null;
                }
            } else if (str.equals("short_courses")) {
                this.f = false;
                ApplicationPersistence.getInstance().setBooleanValue("lib_coach_mark_sc", true);
                Timer timer5 = this.f4547l;
                if (timer5 != null) {
                    timer5.cancel();
                }
                Timer timer6 = this.f4547l;
                if (timer6 != null) {
                    timer6.purge();
                }
                this.f4547l = null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4540d, e10);
        }
    }

    public final void d() {
        View findViewById;
        try {
            this.f4542g = false;
            ApplicationPersistence.getInstance().setBooleanValue("lib_coach_mark_co", true);
            View view = this.f4538b;
            if (view != null && (findViewById = view.findViewById(R.id.libraryDashboardShortCourses)) != null) {
                findViewById.post(new bn.b(this, 2));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4540d, e10);
        }
    }

    public final void e() {
        View findViewById;
        try {
            this.f = false;
            ApplicationPersistence.getInstance().setBooleanValue("lib_coach_mark_sc", true);
            View view = this.f4538b;
            if (view != null && (findViewById = view.findViewById(R.id.libraryDashboardShortCourses)) != null) {
                findViewById.post(new bn.b(this, 1));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4540d, e10);
        }
    }

    public final void f() {
        View findViewById;
        try {
            this.f4541e = false;
            ApplicationPersistence.getInstance().setBooleanValue("lib_coach_mark_tp", true);
            View view = this.f4538b;
            if (view != null && (findViewById = view.findViewById(R.id.libraryDashboardTopPicks)) != null) {
                findViewById.post(new bn.b(this, 0));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4540d, e10);
        }
    }

    public final void g() {
        ScrollStateListenerCustomNestedScrollView scrollStateListenerCustomNestedScrollView;
        String str = this.f4540d;
        try {
            if (this.f4541e && k()) {
                if (this.f4549n) {
                    View view = this.f4538b;
                    if (view != null && (scrollStateListenerCustomNestedScrollView = (ScrollStateListenerCustomNestedScrollView) view.findViewById(R.id.libraryContainer)) != null) {
                        scrollStateListenerCustomNestedScrollView.smoothScrollBy(0, 0);
                    }
                    f();
                    return;
                }
                this.f4543h = false;
                try {
                    Timer timer = new Timer();
                    this.f4546k = timer;
                    timer.schedule(new f(this), 3000L);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(str, e10);
                }
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    public final boolean h() {
        RecyclerView recyclerView;
        View childAt;
        Activity activity = this.f4537a;
        try {
            Rect rect = new Rect();
            Rect rect2 = new Rect(0, 0, activity.getResources().getDisplayMetrics().widthPixels, activity.getResources().getDisplayMetrics().heightPixels);
            View view = this.f4538b;
            if (view != null && (recyclerView = (RecyclerView) view.findViewById(R.id.rvLibraryCollectionsRecycler)) != null && (childAt = recyclerView.getChildAt(2)) != null) {
                childAt.getGlobalVisibleRect(rect);
            }
            return rect.intersect(rect2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4540d, e10);
            return false;
        }
    }

    public final boolean i() {
        RecyclerView recyclerView;
        View childAt;
        View findViewById;
        Activity activity = this.f4537a;
        try {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect(0, 0, activity.getResources().getDisplayMetrics().widthPixels, activity.getResources().getDisplayMetrics().heightPixels);
            View view = this.f4538b;
            if (view != null && (findViewById = view.findViewById(R.id.viewLibraryCollectionsUpperVisibilityView)) != null) {
                findViewById.getGlobalVisibleRect(rect);
            }
            if (view != null && (recyclerView = (RecyclerView) view.findViewById(R.id.rvLibraryCollectionsRecycler)) != null && (childAt = recyclerView.getChildAt(1)) != null) {
                childAt.getGlobalVisibleRect(rect2);
            }
            if (!rect.intersect(rect3)) {
                return false;
            }
            if (!rect2.intersect(rect3)) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4540d, e10);
            return false;
        }
    }

    public final boolean j() {
        RecyclerView recyclerView;
        View childAt;
        View findViewById;
        View findViewById2;
        Activity activity = this.f4537a;
        try {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect(0, 0, activity.getResources().getDisplayMetrics().widthPixels, activity.getResources().getDisplayMetrics().heightPixels);
            View view = this.f4538b;
            if (view != null && (findViewById2 = view.findViewById(R.id.viewLibraryShortCoursesUpperVisibilityView)) != null) {
                findViewById2.getGlobalVisibleRect(rect);
            }
            if (view != null && (recyclerView = (RecyclerView) view.findViewById(R.id.rvLibraryDbShortCourses)) != null && (childAt = recyclerView.getChildAt(1)) != null && (findViewById = childAt.findViewById(R.id.tvRowScDescription)) != null) {
                findViewById.getGlobalVisibleRect(rect2);
            }
            if (!rect.intersect(rect3)) {
                return false;
            }
            if (!rect2.intersect(rect3)) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4540d, e10);
            return false;
        }
    }

    public final boolean k() {
        View findViewById;
        View findViewById2;
        Activity activity = this.f4537a;
        try {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            Rect rect3 = new Rect(0, 0, activity.getResources().getDisplayMetrics().widthPixels, activity.getResources().getDisplayMetrics().heightPixels);
            View view = this.f4538b;
            if (view != null && (findViewById2 = view.findViewById(R.id.viewLibraryTopPicksUpperVisibilityView)) != null) {
                findViewById2.getGlobalVisibleRect(rect);
            }
            if (view != null && (findViewById = view.findViewById(R.id.viewLibraryTopPicksLowerVisibilityView)) != null) {
                findViewById.getGlobalVisibleRect(rect2);
            }
            if (!rect.intersect(rect3)) {
                return false;
            }
            if (!rect2.intersect(rect3)) {
                return false;
            }
            return true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f4540d, e10);
            return false;
        }
    }

    /* compiled from: LibraryHomeFragmentCoachMarkUtil.kt */
    /* loaded from: classes2.dex */
    public static final class a implements xj.a {
        public a() {
        }

        @Override // xj.a
        public final void b() {
            c cVar = c.this;
            try {
                cVar.f4539c.invoke(null);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(cVar.f4540d, e10);
            }
        }

        @Override // xj.a
        public final void a() {
        }
    }

    /* compiled from: LibraryHomeFragmentCoachMarkUtil.kt */
    /* loaded from: classes2.dex */
    public static final class b implements xj.a {
        public b() {
        }

        @Override // xj.a
        public final void b() {
            c cVar = c.this;
            try {
                cVar.f4539c.invoke(null);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(cVar.f4540d, e10);
            }
        }

        @Override // xj.a
        public final void a() {
        }
    }

    /* compiled from: LibraryHomeFragmentCoachMarkUtil.kt */
    /* renamed from: bn.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0086c implements xj.a {
        public C0086c() {
        }

        @Override // xj.a
        public final void b() {
            View view;
            RecyclerView.c0 H;
            View view2;
            c cVar = c.this;
            try {
                View findViewById = cVar.f4538b.findViewById(R.id.clLibraryDashboardCoachMarkTopPicksContainer);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                    int[] iArr = new int[2];
                    RecyclerView recyclerView = (RecyclerView) cVar.f4538b.findViewById(R.id.rvLibraryTopPicksRecycler);
                    if (recyclerView != null && (H = recyclerView.H(0)) != null && (view2 = H.f2751a) != null) {
                        view = view2.findViewById(R.id.clRowTpCtaContainer);
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        view.getLocationInWindow(iArr);
                    }
                    findViewById.setTranslationY(iArr[1]);
                    cVar.f4539c.invoke(null);
                    UtilsKt.fireAnalytics("ch_mark_lib_toppick_tooltip", UtilsKt.getAnalyticsBundle());
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(cVar.f4540d, e10);
            }
        }

        @Override // xj.a
        public final void a() {
        }
    }
}
