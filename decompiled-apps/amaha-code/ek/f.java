package ek;

import android.app.Activity;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AllMiniCoursesActivity;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: AllMiniCoursesAdapterV2.kt */
/* loaded from: classes2.dex */
public final class f extends RecyclerView.e<RecyclerView.c0> {
    public final String A;
    public final String B;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f14122x;

    /* renamed from: y  reason: collision with root package name */
    public List<MiniCourse> f14123y;

    /* renamed from: z  reason: collision with root package name */
    public final HashMap<String, String> f14124z;

    /* compiled from: AllMiniCoursesAdapterV2.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public f(AllMiniCoursesActivity allMiniCoursesActivity, List list, HashMap hashMap) {
        kotlin.jvm.internal.i.g(list, "list");
        this.f14122x = allMiniCoursesActivity;
        this.f14123y = list;
        this.f14124z = hashMap;
        this.A = FirebasePersistence.getInstance().getUser().getVersion();
        this.B = LogHelper.INSTANCE.makeLogTag(f.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f14123y.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013d A[Catch: Exception -> 0x02aa, TryCatch #0 {Exception -> 0x02aa, blocks: (B:3:0x0004, B:6:0x0099, B:16:0x00da, B:20:0x00e9, B:22:0x00ff, B:24:0x0107, B:27:0x011d, B:29:0x013d, B:30:0x0170, B:32:0x0188, B:34:0x0190, B:36:0x01a3, B:38:0x01b8, B:40:0x01d2, B:41:0x01e6, B:43:0x0211, B:47:0x021d, B:50:0x022a, B:51:0x0241, B:57:0x025c, B:62:0x0278, B:9:0x00ac, B:11:0x00b6, B:14:0x00c0, B:15:0x00d4), top: B:67:0x0004 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(RecyclerView.c0 c0Var, int i6) {
        boolean subscriptionEnabled;
        int i10;
        Integer[] miniCourseImage;
        int i11;
        int i12;
        String domain;
        View view = c0Var.f2751a;
        try {
            view.getLayoutParams().width = -1;
            ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions)).setText(this.f14123y.get(i6).getPlan().size() + " days");
            int i13 = 0;
            ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseName)).setVisibility(0);
            ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseName)).setText(this.f14124z.get(this.f14123y.get(i6).getDomain()));
            ((RobertoTextView) view.findViewById(R.id.footerCourse)).setText(Constants.getCourseDisplayName(this.f14123y.get(i6).getCourse()));
            boolean b10 = kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient");
            String str = this.A;
            if (b10 || !kotlin.jvm.internal.i.b(SessionManager.getInstance().getBooleanValue(SessionManager.KEY_B2B_IS_VERIFIED), Boolean.TRUE)) {
                if (is.k.Q1(str, new String[]{"v2.3", Constants.USER_VERSION})) {
                    if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        String domain2 = this.f14123y.get(i6).getDomain();
                        kotlin.jvm.internal.i.d(domain2);
                        subscriptionEnabled = gv.r.J0(domain2, "basic");
                    }
                } else {
                    subscriptionEnabled = SubscriptionPersistence.INSTANCE.getSubscriptionEnabled();
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.lockedImg);
                int i14 = 4;
                if (!subscriptionEnabled) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                appCompatImageView.setVisibility(i10);
                RobertoButton robertoButton = (RobertoButton) view.findViewById(R.id.freeTag);
                if (is.k.Q1(str, new String[]{"v2.3", Constants.USER_VERSION}) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                    domain = this.f14123y.get(i6).getDomain();
                    kotlin.jvm.internal.i.d(domain);
                    if (gv.r.J0(domain, "basic")) {
                        i14 = 0;
                    }
                }
                robertoButton.setVisibility(i14);
                view.setOnClickListener(new ak.d(i6, 1, this));
                String domain3 = this.f14123y.get(i6).getDomain();
                kotlin.jvm.internal.i.d(domain3);
                miniCourseImage = MiniCourseUtilsKt.getMiniCourseImage(domain3);
                if (miniCourseImage != null) {
                    ((AppCompatImageView) view.findViewById(R.id.tvRowMiniCourseBg)).setImageResource(miniCourseImage[0].intValue());
                    ((AppCompatImageView) view.findViewById(R.id.tvRowMiniCourseBg)).setBackgroundResource(miniCourseImage[1].intValue());
                    ((ConstraintLayout) view.findViewById(R.id.cardLayout)).setBackgroundResource(miniCourseImage[1].intValue());
                }
                String domain4 = this.f14123y.get(i6).getDomain();
                kotlin.jvm.internal.i.d(domain4);
                if (!(!this.f14123y.isEmpty()) && this.f14123y.size() > i6 && (!this.f14123y.get(i6).getPlan().isEmpty())) {
                    if (!ApplicationPersistence.getInstance().getBooleanValue("mc_welcome_".concat(domain4), false) && this.f14123y.get(i6).getPlan().get(0).getStart_date() == 0) {
                        ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setVisibility(8);
                        ((RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions)).setVisibility(0);
                        return;
                    } else if (this.f14123y.get(i6).getPlan().get(this.f14123y.get(i6).getPlan().size() - 1).getStart_date() != 0) {
                        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.miniCourseProgressBar);
                        if (!subscriptionEnabled) {
                            i12 = 8;
                        } else {
                            i12 = 0;
                        }
                        progressBar.setVisibility(i12);
                        RobertoTextView robertoTextView = (RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions);
                        if (subscriptionEnabled) {
                            i13 = 8;
                        }
                        robertoTextView.setVisibility(i13);
                        ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setMax(1);
                        ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setProgress(1);
                        return;
                    } else {
                        ProgressBar progressBar2 = (ProgressBar) view.findViewById(R.id.miniCourseProgressBar);
                        if (v(this.f14123y.get(i6)) != 0 && subscriptionEnabled) {
                            i11 = 0;
                            progressBar2.setVisibility(i11);
                            RobertoTextView robertoTextView2 = (RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions);
                            if (v(this.f14123y.get(i6)) != 0 && subscriptionEnabled) {
                                i13 = 8;
                            }
                            robertoTextView2.setVisibility(i13);
                            ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setMax(this.f14123y.get(i6).getPlan().size());
                            ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setProgress(v(this.f14123y.get(i6)));
                            return;
                        }
                        i11 = 8;
                        progressBar2.setVisibility(i11);
                        RobertoTextView robertoTextView22 = (RobertoTextView) view.findViewById(R.id.tvRowMiniCourseSessions);
                        if (v(this.f14123y.get(i6)) != 0) {
                            i13 = 8;
                        }
                        robertoTextView22.setVisibility(i13);
                        ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setMax(this.f14123y.get(i6).getPlan().size());
                        ((ProgressBar) view.findViewById(R.id.miniCourseProgressBar)).setProgress(v(this.f14123y.get(i6)));
                        return;
                    }
                }
                return;
            }
            subscriptionEnabled = true;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) view.findViewById(R.id.lockedImg);
            int i142 = 4;
            if (!subscriptionEnabled) {
            }
            appCompatImageView2.setVisibility(i10);
            RobertoButton robertoButton2 = (RobertoButton) view.findViewById(R.id.freeTag);
            if (is.k.Q1(str, new String[]{"v2.3", Constants.USER_VERSION})) {
                domain = this.f14123y.get(i6).getDomain();
                kotlin.jvm.internal.i.d(domain);
                if (gv.r.J0(domain, "basic")) {
                }
            }
            robertoButton2.setVisibility(i142);
            view.setOnClickListener(new ak.d(i6, 1, this));
            String domain32 = this.f14123y.get(i6).getDomain();
            kotlin.jvm.internal.i.d(domain32);
            miniCourseImage = MiniCourseUtilsKt.getMiniCourseImage(domain32);
            if (miniCourseImage != null) {
            }
            String domain42 = this.f14123y.get(i6).getDomain();
            kotlin.jvm.internal.i.d(domain42);
            if (!(!this.f14123y.isEmpty())) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.B, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_db_mini_courses_allmc_v2, parent, false, "from(parent.context).inf…_allmc_v2, parent, false)"));
    }

    public final int v(MiniCourse miniCourse) {
        kotlin.jvm.internal.i.g(miniCourse, "miniCourse");
        Iterator<CourseDayModelV1> it = miniCourse.getPlan().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            CourseDayModelV1 next = it.next();
            if (next.getStart_date() != 0 || next.isCompleted()) {
                i6++;
            }
        }
        return i6;
    }
}
