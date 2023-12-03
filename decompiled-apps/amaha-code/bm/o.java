package bm;

import android.app.Activity;
import android.app.Dialog;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import bm.o;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import ik.l1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;
import m6.f;
/* compiled from: V3GoalsAdapterNew.kt */
/* loaded from: classes2.dex */
public final class o extends RecyclerView.e<RecyclerView.c0> {
    public Calendar A;
    public Date B;
    public final ArrayList<hs.f<?, ?>> C;
    public final b D;
    public final HashMap<String, GoalType> E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public final int M;
    public final int N;
    public final int O;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f4509x;

    /* renamed from: y  reason: collision with root package name */
    public final String f4510y;

    /* renamed from: z  reason: collision with root package name */
    public final GoalHelper f4511z;

    /* compiled from: V3GoalsAdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoButton f4512u;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.addGoalButton);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.addGoalButton)");
            this.f4512u = (RobertoButton) findViewById;
        }
    }

    /* compiled from: V3GoalsAdapterNew.kt */
    /* loaded from: classes2.dex */
    public interface b {
        void b();

        void b0(String str, boolean z10);

        void s(Goal goal, int i6);

        void v(Goal goal, long j10, int i6);
    }

    /* compiled from: V3GoalsAdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class c extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f4513u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f4514v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f4515w;

        /* renamed from: x  reason: collision with root package name */
        public final CircularProgressBar f4516x;

        public c(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.tvHabitGoalText);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.tvHabitGoalText)");
            this.f4513u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvHabitGoalSubtext);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.tvHabitGoalSubtext)");
            this.f4514v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvHabitGoalProgress);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.tvHabitGoalProgress)");
            this.f4515w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.habitCircularProgress);
            kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.habitCircularProgress)");
            this.f4516x = (CircularProgressBar) findViewById4;
        }
    }

    /* compiled from: V3GoalsAdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class d extends RecyclerView.c0 {
        public final ImageView[] A;
        public final RobertoTextView[] B;

        /* renamed from: u  reason: collision with root package name */
        public final AppCompatImageView f4517u;

        /* renamed from: v  reason: collision with root package name */
        public final AppCompatImageView f4518v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f4519w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f4520x;

        /* renamed from: y  reason: collision with root package name */
        public final RobertoTextView f4521y;

        /* renamed from: z  reason: collision with root package name */
        public final RobertoTextView f4522z;

        /* compiled from: V3GoalsAdapterNew.kt */
        /* loaded from: classes2.dex */
        public static final class a extends f.i {
            @Override // m6.f.i
            public final void a(m6.f view1) {
                kotlin.jvm.internal.i.g(view1, "view1");
                view1.b(true);
                view1.b(true);
            }
        }

        public d(View view) {
            super(view);
            String str;
            View findViewById = view.findViewById(R.id.goalCheck);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.goalCheck)");
            this.f4517u = (AppCompatImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.imageResponse);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.imageResponse)");
            this.f4518v = (AppCompatImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.text1);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.text1)");
            this.f4519w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvCourseTag);
            kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.tvCourseTag)");
            this.f4520x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.goalStatus);
            kotlin.jvm.internal.i.f(findViewById5, "view.findViewById(R.id.goalStatus)");
            this.f4521y = (RobertoTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.weeklyStatus);
            kotlin.jvm.internal.i.f(findViewById6, "view.findViewById(R.id.weeklyStatus)");
            this.f4522z = (RobertoTextView) findViewById6;
            this.A = new ImageView[7];
            this.B = new RobertoTextView[7];
            for (int i6 = 0; i6 < 7; i6++) {
                this.A[i6] = (ImageView) view.findViewById(view.getContext().getResources().getIdentifier(defpackage.c.p("iday", i6), "id", view.getContext().getPackageName()));
            }
            for (int i10 = 0; i10 < 7; i10++) {
                this.B[i10] = (RobertoTextView) view.findViewById(view.getContext().getResources().getIdentifier(defpackage.c.p("tday", i10), "id", view.getContext().getPackageName()));
                RobertoTextView robertoTextView = this.B[i10];
                if (robertoTextView != null) {
                    if (i10 != 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        str = "S";
                                    } else {
                                        str = "F";
                                    }
                                }
                            } else {
                                str = "W";
                            }
                        }
                        str = "T";
                    } else {
                        str = "M";
                    }
                    robertoTextView.setText(str);
                }
                if (i10 == 0) {
                    try {
                        Activity activity = o.this.f4509x;
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity");
                        if (((V3GoalsActivity) activity).E) {
                            Activity activity2 = o.this.f4509x;
                            m6.j jVar = new m6.j(this.f4517u, activity2.getString(R.string.trackgoalsToolTipsTitle), o.this.f4509x.getString(R.string.trackgoalsToolTipsSubTitle));
                            jVar.f24865e = R.color.sea;
                            jVar.f = 20;
                            jVar.f24866g = 12;
                            jVar.f24867h = false;
                            m6.f.f(activity2, jVar, new a());
                            Activity activity3 = o.this.f4509x;
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity");
                            ((V3GoalsActivity) activity3).E = false;
                        }
                    } catch (Exception e10) {
                        LogHelper.INSTANCE.e("Exception in goals tooltip", e10);
                    }
                }
            }
        }
    }

    public o(V3GoalsActivity v3GoalsActivity, Date date, V3GoalsActivity v3GoalsActivity2, ArrayList goalList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f4509x = v3GoalsActivity;
        this.f4510y = LogHelper.INSTANCE.makeLogTag("V3GoalsAdapterNew");
        GoalHelper goalHelper = new GoalHelper();
        this.f4511z = goalHelper;
        this.C = new ArrayList<>();
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = 1;
        this.N = 2;
        this.O = 3;
        this.B = date;
        this.C = goalList;
        this.D = v3GoalsActivity2;
        HashMap<String, GoalType> goalsHashMap = Constants.getGoalsHashMap();
        kotlin.jvm.internal.i.f(goalsHashMap, "getGoalsHashMap()");
        this.E = goalsHashMap;
        Calendar calendar = goalHelper.getWeekOf(this.B.getTime()).get(0);
        kotlin.jvm.internal.i.f(calendar, "goalHelper.getWeekOf(this.date.time)[0]");
        this.A = calendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.C.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        ArrayList<hs.f<?, ?>> arrayList = this.C;
        if (arrayList.get(i6).f19465v instanceof Goal) {
            return this.N;
        }
        if (kotlin.jvm.internal.i.b(arrayList.get(i6).f19464u, "C")) {
            return this.O;
        }
        return this.M;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0181, code lost:
        if (r0.equals(com.theinnerhour.b2b.utils.Constants.GOAL_TYPE_HABIT) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x018c, code lost:
        if (r0.equals("physical_activity") == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x018f, code lost:
        r1 = com.theinnerhour.b2b.utils.Constants.GOAL_TYPE_RELAXATION_ACTIVITY;
        r3 = r21;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02dd  */
    /* JADX WARN: Type inference failed for: r1v55, types: [T, java.lang.Integer] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(RecyclerView.c0 c0Var, final int i6) {
        String str;
        d dVar;
        Goal goal;
        x xVar;
        String str2;
        String str3;
        String str4;
        int i10;
        int i11;
        int i12;
        boolean z10;
        boolean Q1;
        int i13;
        int i14;
        int i15;
        AppCompatImageView appCompatImageView;
        int i16;
        int h10 = h(i6);
        int i17 = this.N;
        ArrayList<hs.f<?, ?>> arrayList = this.C;
        if (h10 == i17) {
            B b10 = arrayList.get(i6).f19465v;
            kotlin.jvm.internal.i.e(b10, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
            Goal goal2 = (Goal) b10;
            String type = goal2.getType();
            GoalType goalType = this.E.get(goal2.getGoalId());
            if (goalType != null) {
                ((d) c0Var).f4519w.setText(goalType.getDashboardTxt());
            } else {
                ((d) c0Var).f4519w.setText(goal2.getGoalName());
            }
            final u uVar = new u();
            x xVar2 = new x();
            String courseDisplayName = Constants.getCourseDisplayName(goal2.getCourseName());
            d dVar2 = (d) c0Var;
            RobertoTextView robertoTextView = dVar2.f4520x;
            robertoTextView.setText(courseDisplayName);
            robertoTextView.setVisibility(0);
            A a10 = arrayList.get(i6).f19464u;
            kotlin.jvm.internal.i.e(a10, "null cannot be cast to non-null type kotlin.String");
            String str5 = (String) a10;
            long time = this.B.getTime();
            GoalHelper goalHelper = this.f4511z;
            ArrayList<Calendar> weekOf = goalHelper.getWeekOf(time);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(this.B);
            int indexOf = weekOf.indexOf(calendar);
            Activity activity = this.f4509x;
            AppCompatImageView appCompatImageView2 = dVar2.f4517u;
            if (type != null) {
                int hashCode = type.hashCode();
                RobertoTextView robertoTextView2 = dVar2.f4519w;
                RobertoTextView robertoTextView3 = dVar2.f4521y;
                RobertoTextView robertoTextView4 = dVar2.f4522z;
                switch (hashCode) {
                    case -2070778647:
                        dVar = dVar2;
                        str3 = Constants.GOAL_TYPE_DAILY_ACTIVITY;
                        str2 = Constants.GOAL_TYPE_RELAXATION_ACTIVITY;
                        xVar = xVar2;
                        str4 = Constants.GOAL_TYPE_ACTIVITY_DAILY;
                        if (!type.equals(str4)) {
                            i10 = 0;
                            str = type;
                            goal = goal2;
                            break;
                        } else {
                            goal = goal2;
                            i13 = -1;
                            str = type;
                            if (indexOf == i13 && str5.length() >= indexOf && kotlin.jvm.internal.i.b(String.valueOf(str5.charAt(indexOf)), "1")) {
                                appCompatImageView2.setBackgroundResource(R.drawable.circle_filled_orange);
                                appCompatImageView2.setColorFilter(g0.a.b(activity, R.color.white));
                                uVar.f23466u = true;
                                i12 = 0;
                            } else {
                                appCompatImageView2.setBackgroundResource(R.drawable.circle_hollow_dark_grey_bold);
                                appCompatImageView2.setColorFilter(g0.a.b(activity, R.color.learning_hub_grey_3));
                                i12 = 0;
                                uVar.f23466u = false;
                            }
                            robertoTextView2.setAlpha(1.0f);
                            i11 = 8;
                            robertoTextView3.setVisibility(8);
                            robertoTextView4.setVisibility(8);
                            break;
                        }
                    case -1408757131:
                        dVar = dVar2;
                        str3 = Constants.GOAL_TYPE_DAILY_ACTIVITY;
                        str2 = Constants.GOAL_TYPE_RELAXATION_ACTIVITY;
                        if (!type.equals(str3)) {
                            i14 = 0;
                            i15 = 8;
                            str = type;
                            goal = goal2;
                            xVar = xVar2;
                            str4 = Constants.GOAL_TYPE_ACTIVITY_DAILY;
                            i12 = i14;
                            i11 = i15;
                            break;
                        }
                        goal = goal2;
                        i13 = -1;
                        xVar = xVar2;
                        str4 = Constants.GOAL_TYPE_ACTIVITY_DAILY;
                        str = type;
                        if (indexOf == i13) {
                            break;
                        }
                        appCompatImageView2.setBackgroundResource(R.drawable.circle_hollow_dark_grey_bold);
                        appCompatImageView2.setColorFilter(g0.a.b(activity, R.color.learning_hub_grey_3));
                        i12 = 0;
                        uVar.f23466u = false;
                        robertoTextView2.setAlpha(1.0f);
                        i11 = 8;
                        robertoTextView3.setVisibility(8);
                        robertoTextView4.setVisibility(8);
                        break;
                    case -1142639703:
                        dVar = dVar2;
                        str2 = Constants.GOAL_TYPE_RELAXATION_ACTIVITY;
                        if (!type.equals(str2)) {
                            str = type;
                            goal = goal2;
                            str3 = Constants.GOAL_TYPE_DAILY_ACTIVITY;
                            xVar = xVar2;
                            str4 = Constants.GOAL_TYPE_ACTIVITY_DAILY;
                            i14 = 0;
                            i15 = 8;
                            i12 = i14;
                            i11 = i15;
                            break;
                        }
                        str3 = Constants.GOAL_TYPE_DAILY_ACTIVITY;
                        goal = goal2;
                        i13 = -1;
                        xVar = xVar2;
                        str4 = Constants.GOAL_TYPE_ACTIVITY_DAILY;
                        str = type;
                        if (indexOf == i13) {
                        }
                        appCompatImageView2.setBackgroundResource(R.drawable.circle_hollow_dark_grey_bold);
                        appCompatImageView2.setColorFilter(g0.a.b(activity, R.color.learning_hub_grey_3));
                        i12 = 0;
                        uVar.f23466u = false;
                        robertoTextView2.setAlpha(1.0f);
                        i11 = 8;
                        robertoTextView3.setVisibility(8);
                        robertoTextView4.setVisibility(8);
                        break;
                    case -1036290639:
                        appCompatImageView = appCompatImageView2;
                        dVar = dVar2;
                        if (type.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                            if (kotlin.jvm.internal.i.b(str5, "1")) {
                                appCompatImageView2 = appCompatImageView;
                                appCompatImageView2.setBackgroundResource(R.drawable.circle_filled_orange);
                                appCompatImageView2.setColorFilter(g0.a.b(activity, R.color.white));
                                robertoTextView3.setVisibility(0);
                                robertoTextView3.setText("All done");
                                robertoTextView2.setAlpha(0.34f);
                                uVar.f23466u = true;
                                i16 = 8;
                            } else {
                                appCompatImageView2 = appCompatImageView;
                                appCompatImageView2.setBackgroundResource(R.drawable.circle_hollow_dark_grey_bold);
                                appCompatImageView2.setColorFilter(g0.a.b(activity, R.color.learning_hub_grey_3));
                                i16 = 8;
                                robertoTextView3.setVisibility(8);
                                robertoTextView2.setAlpha(1.0f);
                                uVar.f23466u = false;
                            }
                            robertoTextView4.setVisibility(i16);
                            str = type;
                            str3 = Constants.GOAL_TYPE_DAILY_ACTIVITY;
                            str2 = Constants.GOAL_TYPE_RELAXATION_ACTIVITY;
                            goal = goal2;
                            xVar = xVar2;
                            str4 = Constants.GOAL_TYPE_ACTIVITY_DAILY;
                            i14 = 0;
                            i15 = 8;
                            i12 = i14;
                            i11 = i15;
                            break;
                        }
                        str = type;
                        str3 = Constants.GOAL_TYPE_DAILY_ACTIVITY;
                        str2 = Constants.GOAL_TYPE_RELAXATION_ACTIVITY;
                        appCompatImageView2 = appCompatImageView;
                        goal = goal2;
                        xVar = xVar2;
                        str4 = Constants.GOAL_TYPE_ACTIVITY_DAILY;
                        i14 = 0;
                        i15 = 8;
                        i12 = i14;
                        i11 = i15;
                    case -961591945:
                        appCompatImageView = appCompatImageView2;
                        dVar = dVar2;
                        break;
                    case 99033460:
                        appCompatImageView = appCompatImageView2;
                        dVar = dVar2;
                        break;
                    case 777898929:
                        dVar = dVar2;
                        if (type.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                            robertoTextView4.setVisibility(0);
                            robertoTextView3.setVisibility(8);
                            robertoTextView2.setAlpha(1.0f);
                            if (kotlin.jvm.internal.i.b(str5, "1")) {
                                appCompatImageView2.setBackgroundResource(R.drawable.circle_filled_orange);
                                appCompatImageView2.setColorFilter(g0.a.b(activity, R.color.white));
                                robertoTextView4.setText(activity.getString(R.string.weeklyGoalDone));
                                uVar.f23466u = true;
                                appCompatImageView = appCompatImageView2;
                            } else {
                                appCompatImageView2.setBackgroundResource(R.drawable.circle_hollow_dark_grey_bold);
                                appCompatImageView2.setColorFilter(g0.a.b(activity, R.color.learning_hub_grey_3));
                                uVar.f23466u = false;
                                appCompatImageView = appCompatImageView2;
                                String obj = DateFormat.format("EEEE", goal2.getScheduledDate().getTime() * 1000).toString();
                                if (kotlin.jvm.internal.i.b(obj, DateFormat.format("EEEE", this.B.getTime()))) {
                                    robertoTextView4.setText(activity.getString(R.string.weeklyGoalScheduledToday));
                                } else {
                                    robertoTextView4.setText(activity.getString(R.string.weeklyGoalScheduled, obj));
                                }
                            }
                            xVar2.f23469u = Integer.valueOf(goalHelper.getWeekdayOffset(goal2.getScheduledDate().getTime() * 1000, this.B.getTime()));
                            str = type;
                            str3 = Constants.GOAL_TYPE_DAILY_ACTIVITY;
                            str2 = Constants.GOAL_TYPE_RELAXATION_ACTIVITY;
                            appCompatImageView2 = appCompatImageView;
                            goal = goal2;
                            xVar = xVar2;
                            str4 = Constants.GOAL_TYPE_ACTIVITY_DAILY;
                            i14 = 0;
                            i15 = 8;
                            i12 = i14;
                            i11 = i15;
                            break;
                        }
                        str = type;
                        str3 = Constants.GOAL_TYPE_DAILY_ACTIVITY;
                        str2 = Constants.GOAL_TYPE_RELAXATION_ACTIVITY;
                        goal = goal2;
                        xVar = xVar2;
                        str4 = Constants.GOAL_TYPE_ACTIVITY_DAILY;
                        i14 = 0;
                        i15 = 8;
                        i12 = i14;
                        i11 = i15;
                    default:
                        str = type;
                        dVar = dVar2;
                        str3 = Constants.GOAL_TYPE_DAILY_ACTIVITY;
                        str2 = Constants.GOAL_TYPE_RELAXATION_ACTIVITY;
                        goal = goal2;
                        xVar = xVar2;
                        str4 = Constants.GOAL_TYPE_ACTIVITY_DAILY;
                        i14 = 0;
                        i15 = 8;
                        i12 = i14;
                        i11 = i15;
                        break;
                }
                z10 = this.F;
                d dVar3 = dVar;
                AppCompatImageView appCompatImageView3 = dVar3.f4518v;
                if (!z10) {
                    appCompatImageView3.setVisibility(i12);
                } else {
                    appCompatImageView3.setVisibility(i11);
                }
                Q1 = is.k.Q1(str, new String[]{Constants.GOAL_TYPE_HABIT, "physical_activity", str2, str3, str4});
                ImageView[] imageViewArr = dVar3.A;
                if (!Q1) {
                    Calendar calendar2 = this.A;
                    for (int i18 = 0; i18 < 7; i18++) {
                        RobertoTextView robertoTextView5 = dVar3.B[i18];
                        if (robertoTextView5 != null) {
                            robertoTextView5.setVisibility(0);
                        }
                        ImageView imageView = imageViewArr[i18];
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        if (str5.length() >= i18 && kotlin.jvm.internal.i.b(String.valueOf(str5.charAt(i18)), "1")) {
                            ImageView imageView2 = imageViewArr[i18];
                            if (imageView2 != null) {
                                Object obj2 = g0.a.f16164a;
                                imageView2.setBackground(a.c.b(activity, R.drawable.circle_hollow_orange_small));
                            }
                            ImageView imageView3 = imageViewArr[i18];
                            if (imageView3 != null) {
                                imageView3.setImageResource(R.drawable.ic_right);
                            }
                            ImageView imageView4 = imageViewArr[i18];
                            if (imageView4 != null) {
                                imageView4.setColorFilter(g0.a.b(activity, R.color.orange));
                            }
                        } else {
                            ImageView imageView5 = imageViewArr[i18];
                            if (imageView5 != null) {
                                Object obj3 = g0.a.f16164a;
                                imageView5.setBackground(a.c.b(activity, R.drawable.circle_filled_light_grey));
                            }
                            ImageView imageView6 = imageViewArr[i18];
                            if (imageView6 != null) {
                                imageView6.setImageResource(R.drawable.ic_right);
                            }
                            ImageView imageView7 = imageViewArr[i18];
                            if (imageView7 != null) {
                                imageView7.setColorFilter(g0.a.b(activity, R.color.learning_hub_grey_3));
                            }
                        }
                        calendar2.add(5, 1);
                    }
                    calendar2.add(5, -7);
                } else {
                    for (int i19 = 0; i19 < 7; i19++) {
                        RobertoTextView robertoTextView6 = dVar3.B[i19];
                        if (robertoTextView6 != null) {
                            robertoTextView6.setVisibility(8);
                        }
                        ImageView imageView8 = imageViewArr[i19];
                        if (imageView8 != null) {
                            imageView8.setVisibility(8);
                        }
                    }
                }
                final Goal goal3 = goal;
                appCompatImageView3.setOnClickListener(new l1(this, goal3, i6, 14));
                final x xVar3 = xVar;
                c0Var.f2751a.setOnClickListener(new View.OnClickListener() { // from class: bm.n
                    /* JADX WARN: Type inference failed for: r15v16, types: [T, java.lang.Integer] */
                    /* JADX WARN: Type inference failed for: r15v36, types: [T, java.lang.Integer] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i20 = r6;
                        int i21 = i6;
                        u isChecked = uVar;
                        o this$0 = this;
                        x dayOffset = xVar3;
                        Goal goal4 = goal3;
                        switch (i20) {
                            case 0:
                                kotlin.jvm.internal.i.g(goal4, "$goal");
                                kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                                try {
                                    boolean b11 = kotlin.jvm.internal.i.b(goal4.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                    o.b bVar = this$0.D;
                                    if (b11) {
                                        if (dayOffset.f23469u == 0) {
                                            dayOffset.f23469u = Integer.valueOf(this$0.f4511z.getWeekdayOffset(goal4.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                        }
                                        Integer num = (Integer) dayOffset.f23469u;
                                        if (num != null && num.intValue() == 0) {
                                            bVar.s(goal4, i21);
                                            return;
                                        }
                                        T t3 = dayOffset.f23469u;
                                        kotlin.jvm.internal.i.d(t3);
                                        if (((Number) t3).intValue() > 0) {
                                            if (isChecked.f23466u) {
                                                this$0.v();
                                                return;
                                            } else {
                                                bVar.v(goal4, this$0.B.getTime(), i21);
                                                return;
                                            }
                                        }
                                        T t10 = dayOffset.f23469u;
                                        kotlin.jvm.internal.i.d(t10);
                                        if (((Number) t10).intValue() < 0) {
                                            if (isChecked.f23466u) {
                                                this$0.v();
                                                return;
                                            } else {
                                                bVar.v(goal4, this$0.B.getTime(), i21);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    bVar.s(goal4, i21);
                                    return;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f4510y, e10);
                                    return;
                                }
                            default:
                                kotlin.jvm.internal.i.g(goal4, "$goal");
                                kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                                try {
                                    boolean b12 = kotlin.jvm.internal.i.b(goal4.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                    String str6 = "";
                                    o.b bVar2 = this$0.D;
                                    if (b12) {
                                        if (dayOffset.f23469u == 0) {
                                            dayOffset.f23469u = Integer.valueOf(this$0.f4511z.getWeekdayOffset(goal4.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                        }
                                        Integer num2 = (Integer) dayOffset.f23469u;
                                        if (num2 != null && num2.intValue() == 0) {
                                            String goalId = goal4.getGoalId();
                                            if (goalId != null) {
                                                str6 = goalId;
                                            }
                                            bVar2.b0(str6, false);
                                            return;
                                        }
                                        if (isChecked.f23466u) {
                                            this$0.v();
                                            return;
                                        } else {
                                            bVar2.v(goal4, this$0.B.getTime(), i21);
                                            return;
                                        }
                                    }
                                    String goalId2 = goal4.getGoalId();
                                    if (goalId2 != null) {
                                        str6 = goalId2;
                                    }
                                    bVar2.b0(str6, false);
                                    return;
                                } catch (Exception e11) {
                                    try {
                                        LogHelper.INSTANCE.e(this$0.f4510y, e11);
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e("Exception in goals tooltip", e12);
                                        return;
                                    }
                                }
                        }
                    }
                });
                appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: bm.n
                    /* JADX WARN: Type inference failed for: r15v16, types: [T, java.lang.Integer] */
                    /* JADX WARN: Type inference failed for: r15v36, types: [T, java.lang.Integer] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i20 = r6;
                        int i21 = i6;
                        u isChecked = uVar;
                        o this$0 = this;
                        x dayOffset = xVar3;
                        Goal goal4 = goal3;
                        switch (i20) {
                            case 0:
                                kotlin.jvm.internal.i.g(goal4, "$goal");
                                kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                                try {
                                    boolean b11 = kotlin.jvm.internal.i.b(goal4.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                    o.b bVar = this$0.D;
                                    if (b11) {
                                        if (dayOffset.f23469u == 0) {
                                            dayOffset.f23469u = Integer.valueOf(this$0.f4511z.getWeekdayOffset(goal4.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                        }
                                        Integer num = (Integer) dayOffset.f23469u;
                                        if (num != null && num.intValue() == 0) {
                                            bVar.s(goal4, i21);
                                            return;
                                        }
                                        T t3 = dayOffset.f23469u;
                                        kotlin.jvm.internal.i.d(t3);
                                        if (((Number) t3).intValue() > 0) {
                                            if (isChecked.f23466u) {
                                                this$0.v();
                                                return;
                                            } else {
                                                bVar.v(goal4, this$0.B.getTime(), i21);
                                                return;
                                            }
                                        }
                                        T t10 = dayOffset.f23469u;
                                        kotlin.jvm.internal.i.d(t10);
                                        if (((Number) t10).intValue() < 0) {
                                            if (isChecked.f23466u) {
                                                this$0.v();
                                                return;
                                            } else {
                                                bVar.v(goal4, this$0.B.getTime(), i21);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    bVar.s(goal4, i21);
                                    return;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f4510y, e10);
                                    return;
                                }
                            default:
                                kotlin.jvm.internal.i.g(goal4, "$goal");
                                kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                                try {
                                    boolean b12 = kotlin.jvm.internal.i.b(goal4.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                    String str6 = "";
                                    o.b bVar2 = this$0.D;
                                    if (b12) {
                                        if (dayOffset.f23469u == 0) {
                                            dayOffset.f23469u = Integer.valueOf(this$0.f4511z.getWeekdayOffset(goal4.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                        }
                                        Integer num2 = (Integer) dayOffset.f23469u;
                                        if (num2 != null && num2.intValue() == 0) {
                                            String goalId = goal4.getGoalId();
                                            if (goalId != null) {
                                                str6 = goalId;
                                            }
                                            bVar2.b0(str6, false);
                                            return;
                                        }
                                        if (isChecked.f23466u) {
                                            this$0.v();
                                            return;
                                        } else {
                                            bVar2.v(goal4, this$0.B.getTime(), i21);
                                            return;
                                        }
                                    }
                                    String goalId2 = goal4.getGoalId();
                                    if (goalId2 != null) {
                                        str6 = goalId2;
                                    }
                                    bVar2.b0(str6, false);
                                    return;
                                } catch (Exception e11) {
                                    try {
                                        LogHelper.INSTANCE.e(this$0.f4510y, e11);
                                        return;
                                    } catch (Exception e12) {
                                        LogHelper.INSTANCE.e("Exception in goals tooltip", e12);
                                        return;
                                    }
                                }
                        }
                    }
                });
            }
            str = type;
            dVar = dVar2;
            goal = goal2;
            xVar = xVar2;
            str2 = Constants.GOAL_TYPE_RELAXATION_ACTIVITY;
            str3 = Constants.GOAL_TYPE_DAILY_ACTIVITY;
            str4 = Constants.GOAL_TYPE_ACTIVITY_DAILY;
            i10 = 0;
            i11 = 8;
            i12 = i10;
            z10 = this.F;
            d dVar32 = dVar;
            AppCompatImageView appCompatImageView32 = dVar32.f4518v;
            if (!z10) {
            }
            Q1 = is.k.Q1(str, new String[]{Constants.GOAL_TYPE_HABIT, "physical_activity", str2, str3, str4});
            ImageView[] imageViewArr2 = dVar32.A;
            if (!Q1) {
            }
            final Goal goal32 = goal;
            appCompatImageView32.setOnClickListener(new l1(this, goal32, i6, 14));
            final x xVar32 = xVar;
            c0Var.f2751a.setOnClickListener(new View.OnClickListener() { // from class: bm.n
                /* JADX WARN: Type inference failed for: r15v16, types: [T, java.lang.Integer] */
                /* JADX WARN: Type inference failed for: r15v36, types: [T, java.lang.Integer] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i20 = r6;
                    int i21 = i6;
                    u isChecked = uVar;
                    o this$0 = this;
                    x dayOffset = xVar32;
                    Goal goal4 = goal32;
                    switch (i20) {
                        case 0:
                            kotlin.jvm.internal.i.g(goal4, "$goal");
                            kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                            try {
                                boolean b11 = kotlin.jvm.internal.i.b(goal4.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                o.b bVar = this$0.D;
                                if (b11) {
                                    if (dayOffset.f23469u == 0) {
                                        dayOffset.f23469u = Integer.valueOf(this$0.f4511z.getWeekdayOffset(goal4.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                    }
                                    Integer num = (Integer) dayOffset.f23469u;
                                    if (num != null && num.intValue() == 0) {
                                        bVar.s(goal4, i21);
                                        return;
                                    }
                                    T t3 = dayOffset.f23469u;
                                    kotlin.jvm.internal.i.d(t3);
                                    if (((Number) t3).intValue() > 0) {
                                        if (isChecked.f23466u) {
                                            this$0.v();
                                            return;
                                        } else {
                                            bVar.v(goal4, this$0.B.getTime(), i21);
                                            return;
                                        }
                                    }
                                    T t10 = dayOffset.f23469u;
                                    kotlin.jvm.internal.i.d(t10);
                                    if (((Number) t10).intValue() < 0) {
                                        if (isChecked.f23466u) {
                                            this$0.v();
                                            return;
                                        } else {
                                            bVar.v(goal4, this$0.B.getTime(), i21);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                bVar.s(goal4, i21);
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f4510y, e10);
                                return;
                            }
                        default:
                            kotlin.jvm.internal.i.g(goal4, "$goal");
                            kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                            try {
                                boolean b12 = kotlin.jvm.internal.i.b(goal4.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                String str6 = "";
                                o.b bVar2 = this$0.D;
                                if (b12) {
                                    if (dayOffset.f23469u == 0) {
                                        dayOffset.f23469u = Integer.valueOf(this$0.f4511z.getWeekdayOffset(goal4.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                    }
                                    Integer num2 = (Integer) dayOffset.f23469u;
                                    if (num2 != null && num2.intValue() == 0) {
                                        String goalId = goal4.getGoalId();
                                        if (goalId != null) {
                                            str6 = goalId;
                                        }
                                        bVar2.b0(str6, false);
                                        return;
                                    }
                                    if (isChecked.f23466u) {
                                        this$0.v();
                                        return;
                                    } else {
                                        bVar2.v(goal4, this$0.B.getTime(), i21);
                                        return;
                                    }
                                }
                                String goalId2 = goal4.getGoalId();
                                if (goalId2 != null) {
                                    str6 = goalId2;
                                }
                                bVar2.b0(str6, false);
                                return;
                            } catch (Exception e11) {
                                try {
                                    LogHelper.INSTANCE.e(this$0.f4510y, e11);
                                    return;
                                } catch (Exception e12) {
                                    LogHelper.INSTANCE.e("Exception in goals tooltip", e12);
                                    return;
                                }
                            }
                    }
                }
            });
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: bm.n
                /* JADX WARN: Type inference failed for: r15v16, types: [T, java.lang.Integer] */
                /* JADX WARN: Type inference failed for: r15v36, types: [T, java.lang.Integer] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i20 = r6;
                    int i21 = i6;
                    u isChecked = uVar;
                    o this$0 = this;
                    x dayOffset = xVar32;
                    Goal goal4 = goal32;
                    switch (i20) {
                        case 0:
                            kotlin.jvm.internal.i.g(goal4, "$goal");
                            kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                            try {
                                boolean b11 = kotlin.jvm.internal.i.b(goal4.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                o.b bVar = this$0.D;
                                if (b11) {
                                    if (dayOffset.f23469u == 0) {
                                        dayOffset.f23469u = Integer.valueOf(this$0.f4511z.getWeekdayOffset(goal4.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                    }
                                    Integer num = (Integer) dayOffset.f23469u;
                                    if (num != null && num.intValue() == 0) {
                                        bVar.s(goal4, i21);
                                        return;
                                    }
                                    T t3 = dayOffset.f23469u;
                                    kotlin.jvm.internal.i.d(t3);
                                    if (((Number) t3).intValue() > 0) {
                                        if (isChecked.f23466u) {
                                            this$0.v();
                                            return;
                                        } else {
                                            bVar.v(goal4, this$0.B.getTime(), i21);
                                            return;
                                        }
                                    }
                                    T t10 = dayOffset.f23469u;
                                    kotlin.jvm.internal.i.d(t10);
                                    if (((Number) t10).intValue() < 0) {
                                        if (isChecked.f23466u) {
                                            this$0.v();
                                            return;
                                        } else {
                                            bVar.v(goal4, this$0.B.getTime(), i21);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                bVar.s(goal4, i21);
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f4510y, e10);
                                return;
                            }
                        default:
                            kotlin.jvm.internal.i.g(goal4, "$goal");
                            kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                            try {
                                boolean b12 = kotlin.jvm.internal.i.b(goal4.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                String str6 = "";
                                o.b bVar2 = this$0.D;
                                if (b12) {
                                    if (dayOffset.f23469u == 0) {
                                        dayOffset.f23469u = Integer.valueOf(this$0.f4511z.getWeekdayOffset(goal4.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                    }
                                    Integer num2 = (Integer) dayOffset.f23469u;
                                    if (num2 != null && num2.intValue() == 0) {
                                        String goalId = goal4.getGoalId();
                                        if (goalId != null) {
                                            str6 = goalId;
                                        }
                                        bVar2.b0(str6, false);
                                        return;
                                    }
                                    if (isChecked.f23466u) {
                                        this$0.v();
                                        return;
                                    } else {
                                        bVar2.v(goal4, this$0.B.getTime(), i21);
                                        return;
                                    }
                                }
                                String goalId2 = goal4.getGoalId();
                                if (goalId2 != null) {
                                    str6 = goalId2;
                                }
                                bVar2.b0(str6, false);
                                return;
                            } catch (Exception e11) {
                                try {
                                    LogHelper.INSTANCE.e(this$0.f4510y, e11);
                                    return;
                                } catch (Exception e12) {
                                    LogHelper.INSTANCE.e("Exception in goals tooltip", e12);
                                    return;
                                }
                            }
                    }
                }
            });
        } else if (h(i6) == this.M) {
            hs.f<?, ?> fVar = arrayList.get(i6);
            kotlin.jvm.internal.i.e(fVar, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            A a11 = fVar.f19464u;
            kotlin.jvm.internal.i.e(a11, "null cannot be cast to non-null type kotlin.String");
            String str6 = (String) a11;
            hs.f<?, ?> fVar2 = arrayList.get(i6);
            kotlin.jvm.internal.i.e(fVar2, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            B b11 = fVar2.f19465v;
            kotlin.jvm.internal.i.e(b11, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) b11).intValue();
            int hashCode2 = str6.hashCode();
            if (hashCode2 != 68) {
                if (hashCode2 != 79) {
                    if (hashCode2 == 87 && str6.equals("W")) {
                        this.H = i6;
                        c cVar = (c) c0Var;
                        cVar.f4513u.setText("Weekly Goals");
                        cVar.f4514v.setText("Here are the goals you have to achieve each week");
                        hs.f<?, ?> fVar3 = arrayList.get(i6);
                        kotlin.jvm.internal.i.e(fVar3, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                        B b12 = fVar3.f19465v;
                        kotlin.jvm.internal.i.e(b12, "null cannot be cast to non-null type kotlin.Int");
                        int intValue2 = ((Integer) b12).intValue();
                        CircularProgressBar circularProgressBar = cVar.f4516x;
                        if (intValue2 != -1) {
                            StringBuilder sb2 = new StringBuilder("");
                            hs.f<?, ?> fVar4 = arrayList.get(i6);
                            kotlin.jvm.internal.i.e(fVar4, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                            B b13 = fVar4.f19465v;
                            kotlin.jvm.internal.i.e(b13, "null cannot be cast to non-null type kotlin.Int");
                            sb2.append(((Integer) b13).intValue());
                            sb2.append(" of ");
                            cVar.f4515w.setText(pl.a.g(sb2, this.K, " completed"));
                            circularProgressBar.setProgressMax(this.K);
                            circularProgressBar.c(intValue, 500);
                            return;
                        }
                        cVar.f4515w.setText(pl.a.g(new StringBuilder("0 of  "), this.K, " completed"));
                        circularProgressBar.setProgressMax(this.K);
                        circularProgressBar.setProgress(0.0f);
                    }
                } else if (str6.equals("O")) {
                    this.I = i6;
                    c cVar2 = (c) c0Var;
                    cVar2.f4513u.setText("One-Time Goals");
                    cVar2.f4514v.setText("Track your one-time goals here");
                    hs.f<?, ?> fVar5 = arrayList.get(i6);
                    kotlin.jvm.internal.i.e(fVar5, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b14 = fVar5.f19465v;
                    kotlin.jvm.internal.i.e(b14, "null cannot be cast to non-null type kotlin.Int");
                    int intValue3 = ((Integer) b14).intValue();
                    RobertoTextView robertoTextView7 = cVar2.f4515w;
                    CircularProgressBar circularProgressBar2 = cVar2.f4516x;
                    if (intValue3 != -1) {
                        StringBuilder sb3 = new StringBuilder("");
                        hs.f<?, ?> fVar6 = arrayList.get(i6);
                        kotlin.jvm.internal.i.e(fVar6, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                        B b15 = fVar6.f19465v;
                        kotlin.jvm.internal.i.e(b15, "null cannot be cast to non-null type kotlin.Int");
                        sb3.append(((Integer) b15).intValue());
                        sb3.append(" of ");
                        sb3.append(this.L);
                        sb3.append(" completed");
                        robertoTextView7.setText(sb3.toString());
                        circularProgressBar2.setProgressMax(this.L);
                        circularProgressBar2.c(intValue, 500);
                        return;
                    }
                    robertoTextView7.setText("0 of  " + this.L + " completed");
                    circularProgressBar2.setProgressMax((float) this.L);
                    circularProgressBar2.setProgress(0.0f);
                }
            } else if (str6.equals("D")) {
                this.G = i6;
                c cVar3 = (c) c0Var;
                cVar3.f4513u.setText("Daily Goals");
                cVar3.f4514v.setText("Here are the goals you have to track each day");
                int i20 = this.J;
                RobertoTextView robertoTextView8 = cVar3.f4515w;
                CircularProgressBar circularProgressBar3 = cVar3.f4516x;
                if (i20 == 0) {
                    circularProgressBar3.setProgress(0.0f);
                    robertoTextView8.setText("No daily goals added");
                    return;
                }
                hs.f<?, ?> fVar7 = arrayList.get(i6);
                kotlin.jvm.internal.i.e(fVar7, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                B b16 = fVar7.f19465v;
                kotlin.jvm.internal.i.e(b16, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) b16).intValue() == -1) {
                    hs.f<?, ?> fVar8 = arrayList.get(i6);
                    kotlin.jvm.internal.i.e(fVar8, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b17 = fVar8.f19465v;
                    kotlin.jvm.internal.i.e(b17, "null cannot be cast to non-null type kotlin.Int");
                    if (((Integer) b17).intValue() == 0) {
                        robertoTextView8.setText("0 of  " + this.J + " completed");
                        circularProgressBar3.setProgressMax((float) this.J);
                        circularProgressBar3.setProgress(0.0f);
                        return;
                    }
                }
                StringBuilder sb4 = new StringBuilder("");
                hs.f<?, ?> fVar9 = arrayList.get(i6);
                kotlin.jvm.internal.i.e(fVar9, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                B b18 = fVar9.f19465v;
                kotlin.jvm.internal.i.e(b18, "null cannot be cast to non-null type kotlin.Int");
                sb4.append(((Integer) b18).intValue());
                sb4.append(" of ");
                sb4.append(this.J);
                sb4.append(" completed");
                robertoTextView8.setText(sb4.toString());
                circularProgressBar3.setProgressMax(this.J);
                circularProgressBar3.c(intValue, 500);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        if (i6 == this.N) {
            View view = defpackage.d.d(parent, R.layout.row_goal_v2_new, parent, false);
            kotlin.jvm.internal.i.f(view, "view");
            return new d(view);
        } else if (i6 == this.M) {
            View view2 = defpackage.d.d(parent, R.layout.row_goal_header, parent, false);
            kotlin.jvm.internal.i.f(view2, "view");
            return new c(view2);
        } else {
            View view3 = defpackage.d.d(parent, R.layout.row_goal_cta, parent, false);
            kotlin.jvm.internal.i.f(view3, "view");
            a aVar = new a(view3);
            aVar.f4512u.setOnClickListener(new ol.k(13, this));
            return aVar;
        }
    }

    public final void v() {
        UiUtils.Companion companion = UiUtils.Companion;
        Activity activity = this.f4509x;
        Dialog styledDialog = companion.getStyledDialog(R.layout.dialog_reset_course, activity, R.style.Theme_Dialog);
        Window window = styledDialog.getWindow();
        kotlin.jvm.internal.i.d(window);
        window.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
        ((AppCompatImageView) styledDialog.findViewById(R.id.resetBanner)).setImageResource(R.drawable.ic_weekly_goal_banner);
        ((RobertoTextView) styledDialog.findViewById(R.id.resetDialogTitle)).setText(activity.getString(R.string.weeklyGoalTrackedHeader));
        ((RobertoTextView) styledDialog.findViewById(R.id.resetQuestion)).setText(activity.getString(R.string.weeklyGoalTrackedBody));
        ((RobertoTextView) styledDialog.findViewById(R.id.f39931no)).setVisibility(4);
        ((RobertoTextView) styledDialog.findViewById(R.id.yes)).setOnClickListener(new dk.n(styledDialog, 25));
        ((RobertoTextView) styledDialog.findViewById(R.id.yes)).setText(activity.getString(R.string.got_it));
        styledDialog.show();
        String str = gk.a.f16573a;
        gk.a.b(UtilsKt.getAnalyticsBundle(), "weekly_goal_tracked_popup");
    }

    public final void w(int i6, String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1036290639) {
            if (hashCode != 99033460) {
                if (hashCode == 777898929 && str.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && i6 != this.K) {
                    this.K = i6;
                    i();
                }
            } else if (str.equals(Constants.GOAL_TYPE_HABIT) && i6 != this.J) {
                this.J = i6;
                i();
            }
        } else if (str.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE) && i6 != this.L) {
            this.L = i6;
            i();
        }
    }

    public final void x(int i6, String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1036290639) {
            if (hashCode != 99033460) {
                if (hashCode == 777898929 && str.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && this.H != i6) {
                    this.H = i6;
                    i();
                }
            } else if (str.equals(Constants.GOAL_TYPE_HABIT) && this.G != i6) {
                this.G = i6;
                i();
            }
        } else if (str.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE) && this.I != i6) {
            this.I = i6;
            i();
        }
    }

    public final void y(int i6, String str) {
        int i10;
        int i11;
        int hashCode = str.hashCode();
        ArrayList<hs.f<?, ?>> arrayList = this.C;
        switch (hashCode) {
            case -2070778647:
                if (!str.equals(Constants.GOAL_TYPE_ACTIVITY_DAILY)) {
                    return;
                }
                break;
            case -1408757131:
                if (!str.equals(Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                    return;
                }
                break;
            case -1142639703:
                if (!str.equals(Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                    return;
                }
                break;
            case -1036290639:
                if (str.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE) && (i10 = this.I) != -1) {
                    hs.f<?, ?> fVar = arrayList.get(i10);
                    kotlin.jvm.internal.i.e(fVar, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b10 = fVar.f19465v;
                    kotlin.jvm.internal.i.e(b10, "null cannot be cast to non-null type kotlin.Int");
                    if (((Integer) b10).intValue() != i6) {
                        arrayList.set(this.I, new hs.f<>("O", Integer.valueOf(i6)));
                        j(this.I);
                        return;
                    }
                    return;
                }
                return;
            case -961591945:
                if (!str.equals("physical_activity")) {
                    return;
                }
                break;
            case 99033460:
                if (!str.equals(Constants.GOAL_TYPE_HABIT)) {
                    return;
                }
                break;
            case 777898929:
                if (str.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && (i11 = this.H) != -1) {
                    hs.f<?, ?> fVar2 = arrayList.get(i11);
                    kotlin.jvm.internal.i.e(fVar2, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b11 = fVar2.f19465v;
                    kotlin.jvm.internal.i.e(b11, "null cannot be cast to non-null type kotlin.Int");
                    if (((Integer) b11).intValue() != i6) {
                        arrayList.set(this.H, new hs.f<>("W", Integer.valueOf(i6)));
                        j(this.H);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
        int i12 = this.G;
        if (i12 != -1) {
            hs.f<?, ?> fVar3 = arrayList.get(i12);
            kotlin.jvm.internal.i.e(fVar3, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            B b12 = fVar3.f19465v;
            kotlin.jvm.internal.i.e(b12, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) b12).intValue() != i6) {
                arrayList.set(this.G, new hs.f<>("D", Integer.valueOf(i6)));
                j(this.G);
            }
        }
    }
}
