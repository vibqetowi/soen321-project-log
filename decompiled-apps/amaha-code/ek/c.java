package ek;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModel;
import com.theinnerhour.b2b.model.CourseHeroBannerModel;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
/* compiled from: ActivityAdapterWeekly.kt */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.e<a> {
    public final String A;
    public final LayoutInflater B;
    public long C;
    public final int D;
    public final int E;
    public final int F;
    public int G;
    public final ArrayList<Integer> H;
    public boolean I;
    public int J;
    public final ArrayList<CourseDayModel> K;
    public int L;
    public final boolean M;
    public final boolean N;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f14080x;

    /* renamed from: y  reason: collision with root package name */
    public Course f14081y;

    /* renamed from: z  reason: collision with root package name */
    public final ss.l<CourseDayModel, hs.k> f14082z;

    /* compiled from: ActivityAdapterWeekly.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
        }
    }

    public c(Activity activity, Course course, int i6, boolean z10, boolean z11, V2DashboardActivity.e eVar) {
        kotlin.jvm.internal.i.g(activity, "activity");
        this.f14080x = activity;
        this.f14081y = course;
        this.f14082z = eVar;
        this.A = LogHelper.INSTANCE.makeLogTag(c.class);
        Object systemService = activity.getSystemService("layout_inflater");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.B = (LayoutInflater) systemService;
        this.C = Utils.INSTANCE.getTodayTimeInSeconds();
        this.D = 1;
        this.E = 2;
        this.F = 3;
        this.G = 1;
        this.H = ca.a.k(Integer.valueOf((int) R.drawable.img_1_dashboard_activity_background), Integer.valueOf((int) R.drawable.img_2_dashboard_activity_background), Integer.valueOf((int) R.drawable.img_3_dashboard_activity_background), Integer.valueOf((int) R.drawable.img_4_dashboard_activity_background), Integer.valueOf((int) R.drawable.img_5_dashboard_activity_background));
        this.J = 1;
        this.K = new ArrayList<>();
        this.J = i6;
        this.M = z10;
        this.N = z11;
        w();
        v();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        int i6 = this.J;
        ArrayList<CourseDayModel> arrayList = this.K;
        if (i6 != 4) {
            return arrayList.size();
        }
        return arrayList.size() + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f4, code lost:
        if (r11.J == 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0102, code lost:
        if (r11.J == 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0130, code lost:
        if (r1.getStart_date() < r11.C) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0167, code lost:
        if (r11.J == 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0195, code lost:
        if (r0.getStart_date() < r11.C) goto L58;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(int i6) {
        CourseDayModel courseDayModel;
        CourseDayModel courseDayModel2;
        CourseDayModel courseDayModel3;
        int i10 = this.E;
        int i11 = this.D;
        ArrayList<CourseDayModel> arrayList = this.K;
        boolean z10 = this.M;
        if (z10 && (!z10 || !this.N)) {
            if (i6 != arrayList.size() || this.J != 4) {
                if (i6 == 0 && this.L == 0) {
                    courseDayModel3 = this.f14081y.getPlan().get(i6);
                } else if (i6 == 0 && this.L != 0) {
                    courseDayModel3 = this.f14081y.getPlan().get(this.L - 1);
                } else {
                    courseDayModel3 = arrayList.get(i6 - 1);
                }
                CourseDayModel courseDayModel4 = courseDayModel3;
                kotlin.jvm.internal.i.f(courseDayModel4, "if (position == 0 && las…{courseList[position -1]}");
                if (i6 == 0 && this.J == 1) {
                    return 0;
                }
                if ((i6 != 1 || this.f14081y.getInitialAssessmentScore() == -1 || this.J != 1) && arrayList.get(i6).getStart_date() == 0 && (arrayList.get(i6).getStart_date() != 0 || courseDayModel4.getStart_date() == 0 || courseDayModel4.getStart_date() >= this.C)) {
                    return i11;
                }
                return this.F;
            }
            return i10;
        } else if (i6 != arrayList.size() || this.J != 4) {
            if (this.f14081y.getPlan().size() > 28) {
                if (i6 == 0 && this.L == 0) {
                    courseDayModel2 = this.f14081y.getPlan().get(i6);
                } else if (i6 == 0 && this.L != 0) {
                    courseDayModel2 = this.f14081y.getPlan().get(this.L - 1);
                } else {
                    courseDayModel2 = arrayList.get(i6 - 1);
                }
                kotlin.jvm.internal.i.f(courseDayModel2, "if (position == 0 && las…ion -1]\n                }");
                if (i6 == 0) {
                }
                if (i6 == 1) {
                    if (this.f14081y.getInitialAssessmentScore() != -1) {
                    }
                }
                if (arrayList.get(i6).getStart_date() == 0) {
                    if (arrayList.get(i6).getStart_date() == 0) {
                        if (courseDayModel2.getStart_date() != 0) {
                        }
                    }
                    return i11;
                }
                return 0;
            }
            if (i6 == 0 && this.L == 0) {
                courseDayModel = this.f14081y.getPlan().get(i6);
            } else if (i6 == 0 && this.L != 0) {
                courseDayModel = this.f14081y.getPlan().get(this.L - 1);
            } else {
                courseDayModel = arrayList.get(i6 - 1);
            }
            CourseDayModel courseDayModel5 = courseDayModel;
            kotlin.jvm.internal.i.f(courseDayModel5, "if (position == 0 && las…{courseList[position -1]}");
            if (i6 == 0) {
            }
            if (arrayList.get(i6).getStart_date() == 0) {
                if (arrayList.get(i6).getStart_date() == 0) {
                    if (courseDayModel5.getStart_date() != 0) {
                    }
                }
                return i11;
            }
            return 0;
        } else {
            return i10;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        a aVar2 = aVar;
        try {
            int h10 = h(i6);
            int i10 = this.E;
            View view = aVar2.f2751a;
            if (h10 == i10) {
                view.setOnClickListener(new View.OnClickListener(this) { // from class: ek.a

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ c f14053v;

                    {
                        this.f14053v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11 = r2;
                        c this$0 = this.f14053v;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                boolean isConnected = ConnectionStatusReceiver.isConnected();
                                Activity activity = this$0.f14080x;
                                if (isConnected) {
                                    activity.startActivity(tr.r.r(activity));
                                    activity.finish();
                                    return;
                                }
                                Utils.INSTANCE.showCustomToast(activity, "No internet connection");
                                return;
                            case 1:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Activity activity2 = this$0.f14080x;
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity");
                                Snackbar.h((CoordinatorLayout) ((V2DashboardActivity) activity2).n0(R.id.mainContainer), "Please complete the assessment to access activities from your plan.", 0).i();
                                return;
                            case 2:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Toast.makeText(this$0.f14080x, "Available after assessment", 0).show();
                                return;
                            case 3:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Toast.makeText(this$0.f14080x, "Available tomorrow", 0).show();
                                return;
                            case 4:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Activity activity3 = this$0.f14080x;
                                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity");
                                Snackbar.h((CoordinatorLayout) ((V2DashboardActivity) activity3).n0(R.id.mainContainer), "Please complete the assessment to access activities from your plan.", 0).i();
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Toast.makeText(this$0.f14080x, "Available later", 0).show();
                                return;
                        }
                    }
                });
                return;
            }
            ArrayList<CourseDayModel> arrayList = this.K;
            ArrayList<Integer> arrayList2 = this.H;
            if (h10 == 0) {
                CourseDayModel courseDayModel = arrayList.get(i6);
                kotlin.jvm.internal.i.f(courseDayModel, "courseList[position]");
                final CourseDayModel courseDayModel2 = courseDayModel;
                Integer num = arrayList2.get(i6 % arrayList2.size());
                kotlin.jvm.internal.i.f(num, "imageList[position % imageList.size]");
                ((AppCompatImageView) view.findViewById(R.id.ivDesign)).setImageResource(num.intValue());
                ((AppCompatImageView) view.findViewById(R.id.ivRowActivityDisabledLock)).setVisibility(4);
                CourseHeroBannerModel hero_banner = courseDayModel2.getHero_banner();
                kotlin.jvm.internal.i.d(hero_banner);
                String link = hero_banner.getLink();
                if (this.J == 1 && i6 == 0) {
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledDayCount)).setText("ASSESSMENT");
                } else {
                    if (courseDayModel2.getStart_date() != 0 && courseDayModel2.getStart_date() != Utils.INSTANCE.getTodayTimeInSeconds()) {
                        ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledDayCount)).setText("YOU WERE ON");
                    }
                    if (this.J == 1) {
                        if (this.f14081y.getPlan().size() > 28) {
                            ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledDayCount)).setText("Day " + i6 + " of week " + this.J);
                        } else {
                            ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledDayCount)).setText("Day " + (i6 + 1) + " of week " + this.J);
                        }
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledDayCount)).setText("Day " + (i6 + 1) + " of week " + this.J);
                    }
                }
                if (!kotlin.jvm.internal.i.b(link, Constants.SCREEN_SLIDER_ASSESSMENT) && !kotlin.jvm.internal.i.b(link, Constants.SCREEN_SLIDER_ASSESSMENT_FINAL)) {
                    if (courseDayModel2.getStart_date() != 0) {
                        long start_date = courseDayModel2.getStart_date();
                        Utils utils = Utils.INSTANCE;
                        if (start_date != utils.getTodayTimeInSeconds() || courseDayModel2.isCompleted()) {
                            if (courseDayModel2.getStart_date() == utils.getTodayTimeInSeconds() && courseDayModel2.isCompleted()) {
                                ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledName)).setText("You Are Done for the Day!");
                                ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledStatus)).setText("Do it again");
                            } else {
                                if (this.J == 1) {
                                    if (this.f14081y.getPlan().size() > 28) {
                                        ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledName)).setText("Day " + i6 + " of Week " + this.J);
                                    } else {
                                        ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledName)).setText("Day " + (i6 + 1) + " of week " + this.J);
                                    }
                                } else {
                                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledName)).setText("Day " + (i6 + 1) + " of Week " + this.J);
                                }
                                ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledStatus)).setText("Do it again");
                            }
                            ((AppCompatImageView) view.findViewById(R.id.ivRowActivityEnabledCheck)).setVisibility(4);
                            this.G = i6 + 1;
                            view.setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: ek.b

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ c f14068v;

                                {
                                    this.f14068v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i11 = r3;
                                    CourseDayModel model = courseDayModel2;
                                    c this$0 = this.f14068v;
                                    switch (i11) {
                                        case 0:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            kotlin.jvm.internal.i.g(model, "$model");
                                            this$0.f14082z.invoke(model);
                                            return;
                                        case 1:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            kotlin.jvm.internal.i.g(model, "$model");
                                            this$0.f14082z.invoke(model);
                                            return;
                                        default:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            kotlin.jvm.internal.i.g(model, "$model");
                                            this$0.f14082z.invoke(model);
                                            return;
                                    }
                                }
                            }));
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledName)).setText(x(i6));
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledStatus)).setText("Get Started");
                    ((AppCompatImageView) view.findViewById(R.id.ivRowActivityEnabledCheck)).setVisibility(4);
                    this.G = i6 + 1;
                    view.setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: ek.b

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ c f14068v;

                        {
                            this.f14068v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i11 = r3;
                            CourseDayModel model = courseDayModel2;
                            c this$0 = this.f14068v;
                            switch (i11) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(model, "$model");
                                    this$0.f14082z.invoke(model);
                                    return;
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(model, "$model");
                                    this$0.f14082z.invoke(model);
                                    return;
                                default:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(model, "$model");
                                    this$0.f14082z.invoke(model);
                                    return;
                            }
                        }
                    }));
                }
                CourseHeroBannerModel hero_banner2 = courseDayModel2.getHero_banner();
                kotlin.jvm.internal.i.d(hero_banner2);
                ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledName)).setText(hero_banner2.getTitle());
                if (courseDayModel2.isCompleted()) {
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledStatus)).setText("View result");
                } else {
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledStatus)).setText("Get Started");
                }
                ((AppCompatImageView) view.findViewById(R.id.ivRowActivityEnabledCheck)).setVisibility(4);
                this.G = i6 + 1;
                view.setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: ek.b

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ c f14068v;

                    {
                        this.f14068v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11 = r3;
                        CourseDayModel model = courseDayModel2;
                        c this$0 = this.f14068v;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(model, "$model");
                                this$0.f14082z.invoke(model);
                                return;
                            case 1:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(model, "$model");
                                this$0.f14082z.invoke(model);
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(model, "$model");
                                this$0.f14082z.invoke(model);
                                return;
                        }
                    }
                }));
            } else if (h10 == this.F) {
                ((AppCompatImageView) view.findViewById(R.id.ivRowActivityDisabledLock)).setVisibility(0);
                ((AppCompatImageView) view.findViewById(R.id.ivRowActivityEnabledCheck)).setVisibility(4);
                CourseDayModel courseDayModel3 = arrayList.get(i6);
                kotlin.jvm.internal.i.f(courseDayModel3, "courseList[position]");
                final CourseDayModel courseDayModel4 = courseDayModel3;
                CourseHeroBannerModel hero_banner3 = courseDayModel4.getHero_banner();
                kotlin.jvm.internal.i.d(hero_banner3);
                String link2 = hero_banner3.getLink();
                if (courseDayModel4.getPosition() == 0) {
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledDayCount)).setText("ASSESSMENT");
                } else {
                    if (courseDayModel4.getStart_date() != 0 && courseDayModel4.getStart_date() != Utils.INSTANCE.getTodayTimeInSeconds()) {
                        ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledDayCount)).setText("YOU WERE ON");
                    }
                    if (this.J == 1) {
                        ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledDayCount)).setText("Day " + i6 + " of week " + this.J);
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledDayCount)).setText("Day " + (i6 + 1) + " of week " + this.J);
                    }
                }
                if (!kotlin.jvm.internal.i.b(link2, Constants.SCREEN_SLIDER_ASSESSMENT) && !kotlin.jvm.internal.i.b(link2, Constants.SCREEN_SLIDER_ASSESSMENT_FINAL)) {
                    if (courseDayModel4.getStart_date() != 0) {
                        long start_date2 = courseDayModel4.getStart_date();
                        Utils utils2 = Utils.INSTANCE;
                        if (start_date2 != utils2.getTodayTimeInSeconds() || courseDayModel4.isCompleted()) {
                            if (courseDayModel4.getStart_date() == utils2.getTodayTimeInSeconds() && courseDayModel4.isCompleted()) {
                                ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledName)).setText("You Are Done for the Day!");
                                ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledStatus)).setText("Do it again");
                            } else {
                                if (this.J == 1) {
                                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledName)).setText("Day " + i6 + " of Week " + this.J);
                                } else {
                                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledName)).setText("Day " + (i6 + 1) + " of Week " + this.J);
                                }
                                ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledStatus)).setText("Do it again");
                            }
                            this.G = i6 + 1;
                            view.setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: ek.b

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ c f14068v;

                                {
                                    this.f14068v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i11 = r3;
                                    CourseDayModel model = courseDayModel4;
                                    c this$0 = this.f14068v;
                                    switch (i11) {
                                        case 0:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            kotlin.jvm.internal.i.g(model, "$model");
                                            this$0.f14082z.invoke(model);
                                            return;
                                        case 1:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            kotlin.jvm.internal.i.g(model, "$model");
                                            this$0.f14082z.invoke(model);
                                            return;
                                        default:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            kotlin.jvm.internal.i.g(model, "$model");
                                            this$0.f14082z.invoke(model);
                                            return;
                                    }
                                }
                            }));
                        }
                    }
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledName)).setText(x(i6));
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledStatus)).setText("Get Started");
                    this.G = i6 + 1;
                    view.setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: ek.b

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ c f14068v;

                        {
                            this.f14068v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i11 = r3;
                            CourseDayModel model = courseDayModel4;
                            c this$0 = this.f14068v;
                            switch (i11) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(model, "$model");
                                    this$0.f14082z.invoke(model);
                                    return;
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(model, "$model");
                                    this$0.f14082z.invoke(model);
                                    return;
                                default:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(model, "$model");
                                    this$0.f14082z.invoke(model);
                                    return;
                            }
                        }
                    }));
                }
                CourseHeroBannerModel hero_banner4 = courseDayModel4.getHero_banner();
                kotlin.jvm.internal.i.d(hero_banner4);
                ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledName)).setText(hero_banner4.getTitle());
                if (courseDayModel4.isCompleted()) {
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledStatus)).setText("View result");
                } else {
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityEnabledStatus)).setText("Get Started");
                }
                this.G = i6 + 1;
                view.setOnClickListener(DebouncedOnClickListener.wrap(new View.OnClickListener(this) { // from class: ek.b

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ c f14068v;

                    {
                        this.f14068v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i11 = r3;
                        CourseDayModel model = courseDayModel4;
                        c this$0 = this.f14068v;
                        switch (i11) {
                            case 0:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(model, "$model");
                                this$0.f14082z.invoke(model);
                                return;
                            case 1:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(model, "$model");
                                this$0.f14082z.invoke(model);
                                return;
                            default:
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(model, "$model");
                                this$0.f14082z.invoke(model);
                                return;
                        }
                    }
                }));
            } else {
                CourseDayModel courseDayModel5 = arrayList.get(i6);
                kotlin.jvm.internal.i.f(courseDayModel5, "courseList[position]");
                final CourseDayModel courseDayModel6 = courseDayModel5;
                if (this.J == 1) {
                    if (this.f14081y.getPlan().size() > 28) {
                        ((RobertoTextView) view.findViewById(R.id.tvRowActivityDisabledDayCount)).setText("Day " + i6 + " of week " + this.J);
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.tvRowActivityDisabledDayCount)).setText("Day " + (i6 + 1) + " of week " + this.J);
                    }
                } else {
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityDisabledDayCount)).setText("Day " + (i6 + 1) + " of week " + this.J);
                }
                ((RobertoTextView) view.findViewById(R.id.tvRowActivityDisabledName)).setVisibility(8);
                Integer num2 = arrayList2.get(i6 % arrayList2.size());
                kotlin.jvm.internal.i.f(num2, "imageList[position % imageList.size]");
                ((AppCompatImageView) view.findViewById(R.id.ivRowActivityDisabledDesign)).setImageResource(num2.intValue());
                if (this.M && this.N) {
                    ((AppCompatImageView) view.findViewById(R.id.ivRowActivityDisabledCheck)).setVisibility(8);
                } else {
                    ((AppCompatImageView) view.findViewById(R.id.ivRowActivityDisabledCheck)).setVisibility(0);
                }
                if (this.G == i6) {
                    if (this.f14081y.getPlan().size() > 28 && this.f14081y.getInitialAssessmentScore() == -1 && this.I) {
                        view.setOnClickListener(new View.OnClickListener(this) { // from class: ek.a

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ c f14053v;

                            {
                                this.f14053v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i11 = r2;
                                c this$0 = this.f14053v;
                                switch (i11) {
                                    case 0:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                                        Activity activity = this$0.f14080x;
                                        if (isConnected) {
                                            activity.startActivity(tr.r.r(activity));
                                            activity.finish();
                                            return;
                                        }
                                        Utils.INSTANCE.showCustomToast(activity, "No internet connection");
                                        return;
                                    case 1:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Activity activity2 = this$0.f14080x;
                                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity");
                                        Snackbar.h((CoordinatorLayout) ((V2DashboardActivity) activity2).n0(R.id.mainContainer), "Please complete the assessment to access activities from your plan.", 0).i();
                                        return;
                                    case 2:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Toast.makeText(this$0.f14080x, "Available after assessment", 0).show();
                                        return;
                                    case 3:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Toast.makeText(this$0.f14080x, "Available tomorrow", 0).show();
                                        return;
                                    case 4:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Activity activity3 = this$0.f14080x;
                                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity");
                                        Snackbar.h((CoordinatorLayout) ((V2DashboardActivity) activity3).n0(R.id.mainContainer), "Please complete the assessment to access activities from your plan.", 0).i();
                                        return;
                                    default:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Toast.makeText(this$0.f14080x, "Available later", 0).show();
                                        return;
                                }
                            }
                        });
                        if (i6 == 1) {
                            ((RobertoTextView) view.findViewById(R.id.tvRowActivityDisabledStatus)).setText("Today");
                            view.setOnClickListener(new View.OnClickListener(this) { // from class: ek.a

                                /* renamed from: v  reason: collision with root package name */
                                public final /* synthetic */ c f14053v;

                                {
                                    this.f14053v = this;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view2) {
                                    int i11 = r2;
                                    c this$0 = this.f14053v;
                                    switch (i11) {
                                        case 0:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            boolean isConnected = ConnectionStatusReceiver.isConnected();
                                            Activity activity = this$0.f14080x;
                                            if (isConnected) {
                                                activity.startActivity(tr.r.r(activity));
                                                activity.finish();
                                                return;
                                            }
                                            Utils.INSTANCE.showCustomToast(activity, "No internet connection");
                                            return;
                                        case 1:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            Activity activity2 = this$0.f14080x;
                                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity");
                                            Snackbar.h((CoordinatorLayout) ((V2DashboardActivity) activity2).n0(R.id.mainContainer), "Please complete the assessment to access activities from your plan.", 0).i();
                                            return;
                                        case 2:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            Toast.makeText(this$0.f14080x, "Available after assessment", 0).show();
                                            return;
                                        case 3:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            Toast.makeText(this$0.f14080x, "Available tomorrow", 0).show();
                                            return;
                                        case 4:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            Activity activity3 = this$0.f14080x;
                                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity");
                                            Snackbar.h((CoordinatorLayout) ((V2DashboardActivity) activity3).n0(R.id.mainContainer), "Please complete the assessment to access activities from your plan.", 0).i();
                                            return;
                                        default:
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            Toast.makeText(this$0.f14080x, "Available later", 0).show();
                                            return;
                                    }
                                }
                            });
                        } else {
                            ((RobertoTextView) view.findViewById(R.id.tvRowActivityDisabledStatus)).setText("Tomorrow");
                        }
                    } else {
                        ((RobertoTextView) view.findViewById(R.id.tvRowActivityDisabledStatus)).setText("Tomorrow");
                        view.setOnClickListener(new View.OnClickListener(this) { // from class: ek.a

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ c f14053v;

                            {
                                this.f14053v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i11 = r2;
                                c this$0 = this.f14053v;
                                switch (i11) {
                                    case 0:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                                        Activity activity = this$0.f14080x;
                                        if (isConnected) {
                                            activity.startActivity(tr.r.r(activity));
                                            activity.finish();
                                            return;
                                        }
                                        Utils.INSTANCE.showCustomToast(activity, "No internet connection");
                                        return;
                                    case 1:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Activity activity2 = this$0.f14080x;
                                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity");
                                        Snackbar.h((CoordinatorLayout) ((V2DashboardActivity) activity2).n0(R.id.mainContainer), "Please complete the assessment to access activities from your plan.", 0).i();
                                        return;
                                    case 2:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Toast.makeText(this$0.f14080x, "Available after assessment", 0).show();
                                        return;
                                    case 3:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Toast.makeText(this$0.f14080x, "Available tomorrow", 0).show();
                                        return;
                                    case 4:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Activity activity3 = this$0.f14080x;
                                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity");
                                        Snackbar.h((CoordinatorLayout) ((V2DashboardActivity) activity3).n0(R.id.mainContainer), "Please complete the assessment to access activities from your plan.", 0).i();
                                        return;
                                    default:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Toast.makeText(this$0.f14080x, "Available later", 0).show();
                                        return;
                                }
                            }
                        });
                    }
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityDisabledStatus)).setVisibility(0);
                } else {
                    if (this.f14081y.getPlan().size() > 28 && this.f14081y.getInitialAssessmentScore() == -1 && this.I) {
                        view.setOnClickListener(new View.OnClickListener(this) { // from class: ek.a

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ c f14053v;

                            {
                                this.f14053v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i11 = r2;
                                c this$0 = this.f14053v;
                                switch (i11) {
                                    case 0:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                                        Activity activity = this$0.f14080x;
                                        if (isConnected) {
                                            activity.startActivity(tr.r.r(activity));
                                            activity.finish();
                                            return;
                                        }
                                        Utils.INSTANCE.showCustomToast(activity, "No internet connection");
                                        return;
                                    case 1:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Activity activity2 = this$0.f14080x;
                                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity");
                                        Snackbar.h((CoordinatorLayout) ((V2DashboardActivity) activity2).n0(R.id.mainContainer), "Please complete the assessment to access activities from your plan.", 0).i();
                                        return;
                                    case 2:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Toast.makeText(this$0.f14080x, "Available after assessment", 0).show();
                                        return;
                                    case 3:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Toast.makeText(this$0.f14080x, "Available tomorrow", 0).show();
                                        return;
                                    case 4:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Activity activity3 = this$0.f14080x;
                                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity");
                                        Snackbar.h((CoordinatorLayout) ((V2DashboardActivity) activity3).n0(R.id.mainContainer), "Please complete the assessment to access activities from your plan.", 0).i();
                                        return;
                                    default:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Toast.makeText(this$0.f14080x, "Available later", 0).show();
                                        return;
                                }
                            }
                        });
                    } else {
                        view.setOnClickListener(new View.OnClickListener(this) { // from class: ek.a

                            /* renamed from: v  reason: collision with root package name */
                            public final /* synthetic */ c f14053v;

                            {
                                this.f14053v = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i11 = r2;
                                c this$0 = this.f14053v;
                                switch (i11) {
                                    case 0:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        boolean isConnected = ConnectionStatusReceiver.isConnected();
                                        Activity activity = this$0.f14080x;
                                        if (isConnected) {
                                            activity.startActivity(tr.r.r(activity));
                                            activity.finish();
                                            return;
                                        }
                                        Utils.INSTANCE.showCustomToast(activity, "No internet connection");
                                        return;
                                    case 1:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Activity activity2 = this$0.f14080x;
                                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity");
                                        Snackbar.h((CoordinatorLayout) ((V2DashboardActivity) activity2).n0(R.id.mainContainer), "Please complete the assessment to access activities from your plan.", 0).i();
                                        return;
                                    case 2:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Toast.makeText(this$0.f14080x, "Available after assessment", 0).show();
                                        return;
                                    case 3:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Toast.makeText(this$0.f14080x, "Available tomorrow", 0).show();
                                        return;
                                    case 4:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Activity activity3 = this$0.f14080x;
                                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity");
                                        Snackbar.h((CoordinatorLayout) ((V2DashboardActivity) activity3).n0(R.id.mainContainer), "Please complete the assessment to access activities from your plan.", 0).i();
                                        return;
                                    default:
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        Toast.makeText(this$0.f14080x, "Available later", 0).show();
                                        return;
                                }
                            }
                        });
                    }
                    ((RobertoTextView) view.findViewById(R.id.tvRowActivityDisabledStatus)).setVisibility(8);
                }
                Boolean ACTIVITY_UNLOCK = Constants.ACTIVITY_UNLOCK;
                kotlin.jvm.internal.i.f(ACTIVITY_UNLOCK, "ACTIVITY_UNLOCK");
                if (ACTIVITY_UNLOCK.booleanValue()) {
                    view.setOnClickListener(new View.OnClickListener(this) { // from class: ek.b

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ c f14068v;

                        {
                            this.f14068v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i11 = r3;
                            CourseDayModel model = courseDayModel6;
                            c this$0 = this.f14068v;
                            switch (i11) {
                                case 0:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(model, "$model");
                                    this$0.f14082z.invoke(model);
                                    return;
                                case 1:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(model, "$model");
                                    this$0.f14082z.invoke(model);
                                    return;
                                default:
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    kotlin.jvm.internal.i.g(model, "$model");
                                    this$0.f14082z.invoke(model);
                                    return;
                            }
                        }
                    });
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, "exception", e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        int i10 = this.E;
        LayoutInflater layoutInflater = this.B;
        if (i6 == i10) {
            View inflate = layoutInflater.inflate(R.layout.row_db_activity_switch_course, (ViewGroup) parent, false);
            kotlin.jvm.internal.i.f(inflate, "inflater.inflate(R.layou…ch_course, parent, false)");
            return new a(inflate);
        } else if (i6 == 0) {
            View inflate2 = layoutInflater.inflate(R.layout.row_db_activity_enabled, (ViewGroup) parent, false);
            kotlin.jvm.internal.i.f(inflate2, "inflater.inflate(R.layou…y_enabled, parent, false)");
            return new a(inflate2);
        } else if (i6 == this.F) {
            View inflate3 = layoutInflater.inflate(R.layout.row_db_activity_enabled, (ViewGroup) parent, false);
            kotlin.jvm.internal.i.f(inflate3, "inflater.inflate(R.layou…y_enabled, parent, false)");
            return new a(inflate3);
        } else {
            View inflate4 = layoutInflater.inflate(R.layout.row_db_activity_disabled, (ViewGroup) parent, false);
            kotlin.jvm.internal.i.f(inflate4, "inflater.inflate(R.layou…_disabled, parent, false)");
            return new a(inflate4);
        }
    }

    public final void v() {
        boolean z10;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.f14081y.getStartDate().getTime() * 1000);
        calendar.clear(11);
        calendar.clear(9);
        calendar.clear(12);
        calendar.clear(10);
        calendar.clear(13);
        calendar.clear(14);
        if (TimeUnit.DAYS.convert(Utils.INSTANCE.getTodayCalendar().getTimeInMillis() - calendar.getTimeInMillis(), TimeUnit.MILLISECONDS) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.I = z10;
    }

    public final void w() {
        ArrayList<CourseDayModel> arrayList = this.K;
        arrayList.clear();
        int i6 = this.J;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 == 4) {
                        if (this.f14081y.getPlan().size() > 28) {
                            for (int i10 = 22; i10 < 29; i10++) {
                                arrayList.add(this.f14081y.getPlan().get(i10));
                                this.L = 22;
                            }
                            return;
                        }
                        for (int i11 = 21; i11 < 28; i11++) {
                            arrayList.add(this.f14081y.getPlan().get(i11));
                            this.L = 21;
                        }
                    }
                } else if (this.f14081y.getPlan().size() > 28) {
                    for (int i12 = 15; i12 < 22; i12++) {
                        arrayList.add(this.f14081y.getPlan().get(i12));
                        this.L = 15;
                    }
                } else {
                    for (int i13 = 14; i13 < 21; i13++) {
                        arrayList.add(this.f14081y.getPlan().get(i13));
                        this.L = 14;
                    }
                }
            } else if (this.f14081y.getPlan().size() > 28) {
                for (int i14 = 8; i14 < 15; i14++) {
                    arrayList.add(this.f14081y.getPlan().get(i14));
                    this.L = 8;
                }
            } else {
                for (int i15 = 7; i15 < 14; i15++) {
                    arrayList.add(this.f14081y.getPlan().get(i15));
                    this.L = 7;
                }
            }
        } else if (this.f14081y.getPlan().size() > 28) {
            for (int i16 = 0; i16 < 8; i16++) {
                arrayList.add(this.f14081y.getPlan().get(i16));
                this.L = 0;
            }
        } else {
            for (int i17 = 0; i17 < 7; i17++) {
                arrayList.add(this.f14081y.getPlan().get(i17));
                this.L = 0;
            }
        }
    }

    public final String x(int i6) {
        int i10 = i6 % 5;
        Activity activity = this.f14080x;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return "";
                        }
                        String string = activity.getResources().getString(R.string.card_title_4);
                        kotlin.jvm.internal.i.f(string, "activity.resources.getSt…ng(R.string.card_title_4)");
                        return string;
                    }
                    String string2 = activity.getResources().getString(R.string.card_title_4);
                    kotlin.jvm.internal.i.f(string2, "activity.resources.getSt…ng(R.string.card_title_4)");
                    return string2;
                }
                String string3 = activity.getResources().getString(R.string.card_title_3);
                kotlin.jvm.internal.i.f(string3, "activity.resources.getSt…ng(R.string.card_title_3)");
                return string3;
            }
            String string4 = activity.getResources().getString(R.string.card_title_2);
            kotlin.jvm.internal.i.f(string4, "activity.resources.getSt…ng(R.string.card_title_2)");
            return string4;
        }
        String string5 = activity.getResources().getString(R.string.card_title_1);
        kotlin.jvm.internal.i.f(string5, "activity.resources.getSt…ng(R.string.card_title_1)");
        return string5;
    }

    public final void y(int i6, Course course) {
        this.f14081y = course;
        this.C = Utils.INSTANCE.getTodayTimeInSeconds();
        v();
        this.J = i6;
        w();
        i();
    }
}
