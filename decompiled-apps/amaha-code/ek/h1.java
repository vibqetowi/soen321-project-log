package ek;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: MiniCoursesDashboardAdapter.kt */
/* loaded from: classes2.dex */
public final class h1 extends RecyclerView.e<a> {
    public final HashMap<String, hs.f<String, String>> A;
    public final ss.p<MiniCourse, CardView, hs.k> B;
    public final String C;
    public final LayoutInflater D;
    public final String E;
    public int F;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f14157x;

    /* renamed from: y  reason: collision with root package name */
    public List<MiniCourse> f14158y;

    /* renamed from: z  reason: collision with root package name */
    public final HashMap<String, String> f14159z;

    /* compiled from: MiniCoursesDashboardAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h1(Activity activity, List<MiniCourse> miniCourseList, HashMap<String, String> hashMap, HashMap<String, hs.f<String, String>> assetMap, ss.p<? super MiniCourse, ? super CardView, hs.k> pVar) {
        kotlin.jvm.internal.i.g(activity, "activity");
        kotlin.jvm.internal.i.g(miniCourseList, "miniCourseList");
        kotlin.jvm.internal.i.g(assetMap, "assetMap");
        this.f14157x = activity;
        this.f14158y = miniCourseList;
        this.f14159z = hashMap;
        this.A = assetMap;
        this.B = pVar;
        this.C = LogHelper.INSTANCE.makeLogTag(h1.class);
        Object systemService = activity.getSystemService("layout_inflater");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.D = (LayoutInflater) systemService;
        this.E = FirebasePersistence.getInstance().getUser().getVersion();
        this.F = this.f14158y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.F + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1 A[Catch: Exception -> 0x0388, TryCatch #0 {Exception -> 0x0388, blocks: (B:3:0x000e, B:6:0x001c, B:9:0x0051, B:19:0x0092, B:23:0x00e3, B:25:0x00f1, B:29:0x010b, B:31:0x0135, B:32:0x016d, B:34:0x01bb, B:36:0x01c1, B:41:0x01cd, B:43:0x01d5, B:45:0x01eb, B:47:0x01f9, B:49:0x0209, B:66:0x02f9, B:50:0x021e, B:52:0x0232, B:53:0x0255, B:55:0x0271, B:57:0x0286, B:58:0x0292, B:59:0x02a9, B:65:0x02d2, B:12:0x0062, B:14:0x006e, B:17:0x0078, B:18:0x008c, B:67:0x0308), top: B:72:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0135 A[Catch: Exception -> 0x0388, TryCatch #0 {Exception -> 0x0388, blocks: (B:3:0x000e, B:6:0x001c, B:9:0x0051, B:19:0x0092, B:23:0x00e3, B:25:0x00f1, B:29:0x010b, B:31:0x0135, B:32:0x016d, B:34:0x01bb, B:36:0x01c1, B:41:0x01cd, B:43:0x01d5, B:45:0x01eb, B:47:0x01f9, B:49:0x0209, B:66:0x02f9, B:50:0x021e, B:52:0x0232, B:53:0x0255, B:55:0x0271, B:57:0x0286, B:58:0x0292, B:59:0x02a9, B:65:0x02d2, B:12:0x0062, B:14:0x006e, B:17:0x0078, B:18:0x008c, B:67:0x0308), top: B:72:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01bb A[Catch: Exception -> 0x0388, TryCatch #0 {Exception -> 0x0388, blocks: (B:3:0x000e, B:6:0x001c, B:9:0x0051, B:19:0x0092, B:23:0x00e3, B:25:0x00f1, B:29:0x010b, B:31:0x0135, B:32:0x016d, B:34:0x01bb, B:36:0x01c1, B:41:0x01cd, B:43:0x01d5, B:45:0x01eb, B:47:0x01f9, B:49:0x0209, B:66:0x02f9, B:50:0x021e, B:52:0x0232, B:53:0x0255, B:55:0x0271, B:57:0x0286, B:58:0x0292, B:59:0x02a9, B:65:0x02d2, B:12:0x0062, B:14:0x006e, B:17:0x0078, B:18:0x008c, B:67:0x0308), top: B:72:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0232 A[Catch: Exception -> 0x0388, TryCatch #0 {Exception -> 0x0388, blocks: (B:3:0x000e, B:6:0x001c, B:9:0x0051, B:19:0x0092, B:23:0x00e3, B:25:0x00f1, B:29:0x010b, B:31:0x0135, B:32:0x016d, B:34:0x01bb, B:36:0x01c1, B:41:0x01cd, B:43:0x01d5, B:45:0x01eb, B:47:0x01f9, B:49:0x0209, B:66:0x02f9, B:50:0x021e, B:52:0x0232, B:53:0x0255, B:55:0x0271, B:57:0x0286, B:58:0x0292, B:59:0x02a9, B:65:0x02d2, B:12:0x0062, B:14:0x006e, B:17:0x0078, B:18:0x008c, B:67:0x0308), top: B:72:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0255 A[Catch: Exception -> 0x0388, TryCatch #0 {Exception -> 0x0388, blocks: (B:3:0x000e, B:6:0x001c, B:9:0x0051, B:19:0x0092, B:23:0x00e3, B:25:0x00f1, B:29:0x010b, B:31:0x0135, B:32:0x016d, B:34:0x01bb, B:36:0x01c1, B:41:0x01cd, B:43:0x01d5, B:45:0x01eb, B:47:0x01f9, B:49:0x0209, B:66:0x02f9, B:50:0x021e, B:52:0x0232, B:53:0x0255, B:55:0x0271, B:57:0x0286, B:58:0x0292, B:59:0x02a9, B:65:0x02d2, B:12:0x0062, B:14:0x006e, B:17:0x0078, B:18:0x008c, B:67:0x0308), top: B:72:0x000e }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(a aVar, int i6) {
        boolean subscriptionEnabled;
        int i10;
        int i11;
        Integer[] miniCourseImage;
        int i12;
        boolean z10;
        a aVar2 = aVar;
        Activity activity = this.f14157x;
        try {
            int size = this.f14158y.size();
            View view = aVar2.f2751a;
            if (i6 < size) {
                MiniCourse miniCourse = this.f14158y.get(i6);
                ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseName)).setText(this.f14159z.get(miniCourse.getDomain()));
                if (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                    if (is.k.Q1(this.E, new String[]{"v2.3", Constants.USER_VERSION})) {
                        if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            String domain = this.f14158y.get(i6).getDomain();
                            kotlin.jvm.internal.i.d(domain);
                            subscriptionEnabled = gv.r.J0(domain, "basic");
                        }
                    } else {
                        subscriptionEnabled = SubscriptionPersistence.INSTANCE.getSubscriptionEnabled();
                    }
                    ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseName)).setVisibility(0);
                    ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions)).setVisibility(0);
                    ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions)).setText(miniCourse.getPlan().size() + " days");
                    ((AppCompatImageView) view.findViewById(R.id.tvRowMiniCourseBg)).setVisibility(0);
                    AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.lockedImg);
                    if (!subscriptionEnabled) {
                        i10 = 4;
                    } else {
                        i10 = 0;
                    }
                    appCompatImageView.setVisibility(i10);
                    RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvRowMiniCourseStatus);
                    if (subscriptionEnabled) {
                        if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.3", Constants.USER_VERSION})) {
                            i11 = 0;
                            robertoTextView.setVisibility(i11);
                            ((RobertoTextView) view.findViewById(R.id.seeAll)).setVisibility(8);
                            ((AppCompatImageView) view.findViewById(R.id.seeAllLock)).setVisibility(8);
                            String domain2 = miniCourse.getDomain();
                            kotlin.jvm.internal.i.d(domain2);
                            miniCourseImage = MiniCourseUtilsKt.getMiniCourseImage(domain2);
                            if (miniCourseImage != null) {
                                ((AppCompatImageView) view.findViewById(R.id.tvRowMiniCourseBg)).setImageResource(miniCourseImage[0].intValue());
                                ((AppCompatImageView) view.findViewById(R.id.tvRowMiniCourseBg)).setBackgroundResource(miniCourseImage[1].intValue());
                                ((ConstraintLayout) view.findViewById(R.id.parentLayout)).setBackgroundResource(miniCourseImage[1].intValue());
                            }
                            ((AppCompatImageView) view.findViewById(R.id.lockedImg)).setImageResource(R.drawable.ic_lock_circle_black_alpha);
                            ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions)).setTextColor(g0.a.b(activity, R.color.title_high_contrast));
                            ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseName)).setTextColor(g0.a.b(activity, R.color.title_high_contrast));
                            ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseStatus)).setTextColor(g0.a.b(activity, R.color.title_high_contrast));
                            if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_MINICOURSES, false)) {
                                String domain3 = miniCourse.getDomain();
                                if (domain3 != null && gv.r.J0(domain3, "basic")) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10 && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                                    if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.3", Constants.USER_VERSION}) && (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient") || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE))) {
                                        ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseStatus)).setText(activity.getString(R.string.freeFeatureMessagingText));
                                        view.setOnClickListener(DebouncedOnClickListener.wrap(new dk.t(3, this, miniCourse, aVar2)));
                                        return;
                                    }
                                }
                            }
                            if (miniCourse.getPlan().get(0).getStart_date() == 0) {
                                ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseStatus)).setText(activity.getString(R.string.start_today));
                                ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setVisibility(8);
                            } else if (miniCourse.getPlan().get(miniCourse.getPlan().size() - 1).getStart_date() != 0) {
                                ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseStatus)).setText(activity.getString(R.string.do_it_again));
                                if (subscriptionEnabled) {
                                    ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setVisibility(0);
                                }
                                ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setMax(1);
                                ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setProgress(1);
                            } else {
                                ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseStatus)).setText(activity.getString(R.string.continue_text));
                                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.miniCourseProgressBar);
                                if (x(miniCourse) != 0 && subscriptionEnabled) {
                                    i12 = 0;
                                    progressBar.setVisibility(i12);
                                    ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setMax(miniCourse.getPlan().size());
                                    ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setProgress(x(miniCourse));
                                }
                                i12 = 8;
                                progressBar.setVisibility(i12);
                                ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setMax(miniCourse.getPlan().size());
                                ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setProgress(x(miniCourse));
                            }
                            view.setOnClickListener(DebouncedOnClickListener.wrap(new dk.t(3, this, miniCourse, aVar2)));
                            return;
                        }
                    }
                    i11 = 8;
                    robertoTextView.setVisibility(i11);
                    ((RobertoTextView) view.findViewById(R.id.seeAll)).setVisibility(8);
                    ((AppCompatImageView) view.findViewById(R.id.seeAllLock)).setVisibility(8);
                    String domain22 = miniCourse.getDomain();
                    kotlin.jvm.internal.i.d(domain22);
                    miniCourseImage = MiniCourseUtilsKt.getMiniCourseImage(domain22);
                    if (miniCourseImage != null) {
                    }
                    ((AppCompatImageView) view.findViewById(R.id.lockedImg)).setImageResource(R.drawable.ic_lock_circle_black_alpha);
                    ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions)).setTextColor(g0.a.b(activity, R.color.title_high_contrast));
                    ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseName)).setTextColor(g0.a.b(activity, R.color.title_high_contrast));
                    ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseStatus)).setTextColor(g0.a.b(activity, R.color.title_high_contrast));
                    if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_MINICOURSES, false)) {
                    }
                    if (miniCourse.getPlan().get(0).getStart_date() == 0) {
                    }
                    view.setOnClickListener(DebouncedOnClickListener.wrap(new dk.t(3, this, miniCourse, aVar2)));
                    return;
                }
                subscriptionEnabled = true;
                ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseName)).setVisibility(0);
                ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions)).setVisibility(0);
                ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions)).setText(miniCourse.getPlan().size() + " days");
                ((AppCompatImageView) view.findViewById(R.id.tvRowMiniCourseBg)).setVisibility(0);
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.lockedImg);
                if (!subscriptionEnabled) {
                }
                appCompatImageView2.setVisibility(i10);
                RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvRowMiniCourseStatus);
                if (subscriptionEnabled) {
                }
                i11 = 8;
                robertoTextView2.setVisibility(i11);
                ((RobertoTextView) view.findViewById(R.id.seeAll)).setVisibility(8);
                ((AppCompatImageView) view.findViewById(R.id.seeAllLock)).setVisibility(8);
                String domain222 = miniCourse.getDomain();
                kotlin.jvm.internal.i.d(domain222);
                miniCourseImage = MiniCourseUtilsKt.getMiniCourseImage(domain222);
                if (miniCourseImage != null) {
                }
                ((AppCompatImageView) view.findViewById(R.id.lockedImg)).setImageResource(R.drawable.ic_lock_circle_black_alpha);
                ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions)).setTextColor(g0.a.b(activity, R.color.title_high_contrast));
                ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseName)).setTextColor(g0.a.b(activity, R.color.title_high_contrast));
                ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseStatus)).setTextColor(g0.a.b(activity, R.color.title_high_contrast));
                if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_MINICOURSES, false)) {
                }
                if (miniCourse.getPlan().get(0).getStart_date() == 0) {
                }
                view.setOnClickListener(DebouncedOnClickListener.wrap(new dk.t(3, this, miniCourse, aVar2)));
                return;
            }
            ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseName)).setVisibility(8);
            ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions)).setVisibility(8);
            ((AppCompatImageView) view.findViewById(R.id.lockedImg)).setVisibility(8);
            ((AppCompatImageView) view.findViewById(R.id.tvRowMiniCourseBg)).setVisibility(8);
            ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseStatus)).setVisibility(8);
            ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setVisibility(8);
            ((RobertoTextView) view.findViewById(R.id.seeAll)).setVisibility(0);
            ((AppCompatImageView) view.findViewById(R.id.seeAllLock)).setVisibility(0);
            ((ConstraintLayout) view.findViewById(R.id.parentLayout)).setBackgroundResource(R.color.title_high_contrast);
            view.setOnClickListener(DebouncedOnClickListener.wrap(new w5.i0(14, this)));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.C, "exception", e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        View inflate = this.D.inflate(R.layout.row_db_mini_course_tall, (ViewGroup) parent, false);
        kotlin.jvm.internal.i.f(inflate, "inflater.inflate(R.layou…urse_tall, parent, false)");
        return new a(inflate);
    }

    public final void v(String str, String str2) {
        HashMap<String, hs.f<String, String>> hashMap = this.A;
        if (hashMap.containsKey(str)) {
            hs.f<String, String> fVar = hashMap.get(str);
            kotlin.jvm.internal.i.d(fVar);
            hashMap.put(str, new hs.f<>(fVar.f19464u, str2));
            i();
        }
    }

    public final boolean w(String str) {
        String str2;
        HashMap<String, hs.f<String, String>> hashMap = this.A;
        if (hashMap.containsKey(str)) {
            hs.f<String, String> fVar = hashMap.get(str);
            if (fVar != null) {
                str2 = fVar.f19465v;
            } else {
                str2 = null;
            }
            if (kotlin.jvm.internal.i.b(str2, "")) {
                return true;
            }
        }
        return false;
    }

    public final int x(MiniCourse miniCourse) {
        try {
            Iterator<CourseDayModelV1> it = miniCourse.getPlan().iterator();
            int i6 = 0;
            while (it.hasNext()) {
                if (it.next().getStart_date() != 0) {
                    i6++;
                }
            }
            return i6;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.C, e10);
            return 0;
        }
    }
}
