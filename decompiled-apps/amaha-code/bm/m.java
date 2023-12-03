package bm;

import android.app.Activity;
import android.app.Dialog;
import android.text.format.DateFormat;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import bm.m;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
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
/* compiled from: V3CustomGoalsAdapter.kt */
/* loaded from: classes2.dex */
public final class m extends RecyclerView.e<RecyclerView.c0> {
    public Calendar A;
    public Date B;
    public ArrayList<hs.f<?, ?>> C;
    public boolean D;
    public final b E;
    public final HashMap<String, GoalType> F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public final int N;
    public final int O;
    public final int P;
    public hs.f<String, Integer> Q;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f4489x;

    /* renamed from: y  reason: collision with root package name */
    public final String f4490y;

    /* renamed from: z  reason: collision with root package name */
    public final GoalHelper f4491z;

    /* compiled from: V3CustomGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoButton f4492u;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.addGoalButton);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.addGoalButton)");
            this.f4492u = (RobertoButton) findViewById;
        }
    }

    /* compiled from: V3CustomGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public interface b {
        void K(String str, boolean z10, long j10);

        void V();

        void p(Goal goal, int i6);

        void w(Goal goal, long j10, int i6);
    }

    /* compiled from: V3CustomGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class c extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f4493u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f4494v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f4495w;

        /* renamed from: x  reason: collision with root package name */
        public final CircularProgressBar f4496x;

        public c(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.tvHabitGoalText);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.tvHabitGoalText)");
            this.f4493u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvHabitGoalSubtext);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.tvHabitGoalSubtext)");
            this.f4494v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvHabitGoalProgress);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.tvHabitGoalProgress)");
            this.f4495w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.habitCircularProgress);
            kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.habitCircularProgress)");
            this.f4496x = (CircularProgressBar) findViewById4;
        }
    }

    /* compiled from: V3CustomGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class d extends RecyclerView.c0 {
        public final ImageView[] A;
        public final RobertoTextView[] B;

        /* renamed from: u  reason: collision with root package name */
        public final AppCompatImageView f4497u;

        /* renamed from: v  reason: collision with root package name */
        public final AppCompatImageView f4498v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f4499w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f4500x;

        /* renamed from: y  reason: collision with root package name */
        public final RobertoTextView f4501y;

        /* renamed from: z  reason: collision with root package name */
        public final RobertoTextView f4502z;

        /* compiled from: V3CustomGoalsAdapter.kt */
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
            this.f4497u = (AppCompatImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.imageResponse);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.imageResponse)");
            this.f4498v = (AppCompatImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.text1);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.text1)");
            this.f4499w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvCourseTag);
            kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.tvCourseTag)");
            this.f4500x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.goalStatus);
            kotlin.jvm.internal.i.f(findViewById5, "view.findViewById(R.id.goalStatus)");
            this.f4501y = (RobertoTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.weeklyStatus);
            kotlin.jvm.internal.i.f(findViewById6, "view.findViewById(R.id.weeklyStatus)");
            this.f4502z = (RobertoTextView) findViewById6;
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
                        Activity activity = m.this.f4489x;
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity");
                        if (((V3GoalsActivity) activity).E) {
                            Activity activity2 = m.this.f4489x;
                            m6.j jVar = new m6.j(this.f4497u, activity2.getString(R.string.trackgoalsToolTipsTitle), m.this.f4489x.getString(R.string.trackgoalsToolTipsSubTitle));
                            jVar.f24865e = R.color.sea;
                            jVar.f = 20;
                            jVar.f24866g = 12;
                            jVar.f24867h = false;
                            m6.f.f(activity2, jVar, new a());
                            Activity activity3 = m.this.f4489x;
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

    public m(V3GoalsActivity v3GoalsActivity, Date date, V3GoalsActivity v3GoalsActivity2, ArrayList goalList) {
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f4489x = v3GoalsActivity;
        this.f4490y = LogHelper.INSTANCE.makeLogTag("V3CustomGoalsAdapter");
        GoalHelper goalHelper = new GoalHelper();
        this.f4491z = goalHelper;
        this.C = new ArrayList<>();
        this.D = SubscriptionPersistence.INSTANCE.getSubscriptionEnabled();
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = 1;
        this.O = 2;
        this.P = 3;
        this.B = date;
        this.C = goalList;
        this.E = v3GoalsActivity2;
        HashMap<String, GoalType> goalsHashMap = Constants.getGoalsHashMap();
        kotlin.jvm.internal.i.f(goalsHashMap, "getGoalsHashMap()");
        this.F = goalsHashMap;
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
        if (this.C.get(i6).f19465v instanceof Goal) {
            return this.O;
        }
        if (kotlin.jvm.internal.i.b(this.C.get(i6).f19464u, "C")) {
            return this.P;
        }
        return this.N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x018f, code lost:
        if (r0.equals(com.theinnerhour.b2b.utils.Constants.GOAL_TYPE_HABIT) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x019c, code lost:
        if (r0.equals("physical_activity") == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x019f, code lost:
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0218, code lost:
        if (r0.equals(com.theinnerhour.b2b.utils.Constants.GOAL_TYPE_RELAXATION_ACTIVITY) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0222, code lost:
        if (r0.equals(com.theinnerhour.b2b.utils.Constants.GOAL_TYPE_DAILY_ACTIVITY) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x022b, code lost:
        if (r0.equals(com.theinnerhour.b2b.utils.Constants.GOAL_TYPE_ACTIVITY_DAILY) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0231, code lost:
        if (r5 == (-1)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0237, code lost:
        if (r2.length() < r5) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0245, code lost:
        if (kotlin.jvm.internal.i.b(java.lang.String.valueOf(r2.charAt(r5)), "1") == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0247, code lost:
        r15.setBackgroundResource(com.theinnerhour.b2b.R.drawable.circle_filled_orange);
        r15.setBackgroundTintList(g0.a.c(com.theinnerhour.b2b.R.color.sea, r4));
        r15.setColorFilter(g0.a.b(r4, com.theinnerhour.b2b.R.color.white));
        r11.f23466u = true;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0266, code lost:
        r15.setBackgroundResource(com.theinnerhour.b2b.R.drawable.circle_hollow_dark_grey_bold);
        r15.setBackgroundTintList(null);
        r15.setColorFilter(g0.a.b(r4, com.theinnerhour.b2b.R.color.learning_hub_grey_3));
        r1 = 0;
        r11.f23466u = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027d, code lost:
        r8.setAlpha(1.0f);
        r3 = 8;
        r9.setVisibility(8);
        r5.setVisibility(8);
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b1  */
    /* JADX WARN: Type inference failed for: r1v78, types: [T, java.lang.Integer] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(RecyclerView.c0 c0Var, final int i6) {
        d dVar;
        int i10;
        int i11;
        boolean z10;
        boolean Q1;
        String str;
        int i12;
        if (h(i6) == this.O) {
            B b10 = this.C.get(i6).f19465v;
            kotlin.jvm.internal.i.e(b10, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
            final Goal goal = (Goal) b10;
            String type = goal.getType();
            GoalType goalType = this.F.get(goal.getGoalId());
            if (goalType != null) {
                ((d) c0Var).f4499w.setText(goalType.getDashboardTxt());
            } else {
                ((d) c0Var).f4499w.setText(goal.getGoalName());
            }
            final u uVar = new u();
            final x xVar = new x();
            String courseDisplayName = Constants.getCourseDisplayName(goal.getCourseName());
            boolean b11 = kotlin.jvm.internal.i.b(courseDisplayName, "");
            Activity activity = this.f4489x;
            if (b11) {
                courseDisplayName = activity.getString(R.string.customGoalLabel);
            }
            d dVar2 = (d) c0Var;
            RobertoTextView robertoTextView = dVar2.f4500x;
            robertoTextView.setText(courseDisplayName);
            robertoTextView.setVisibility(0);
            A a10 = this.C.get(i6).f19464u;
            kotlin.jvm.internal.i.e(a10, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) a10;
            long time = this.B.getTime();
            GoalHelper goalHelper = this.f4491z;
            ArrayList<Calendar> weekOf = goalHelper.getWeekOf(time);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(this.B);
            int indexOf = weekOf.indexOf(calendar);
            AppCompatImageView appCompatImageView = dVar2.f4497u;
            if (type != null) {
                int hashCode = type.hashCode();
                RobertoTextView robertoTextView2 = dVar2.f4499w;
                RobertoTextView robertoTextView3 = dVar2.f4501y;
                RobertoTextView robertoTextView4 = dVar2.f4502z;
                switch (hashCode) {
                    case -2070778647:
                        dVar = dVar2;
                        break;
                    case -1408757131:
                        dVar = dVar2;
                        break;
                    case -1142639703:
                        dVar = dVar2;
                        break;
                    case -1036290639:
                        str = str2;
                        dVar = dVar2;
                        if (type.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE)) {
                            str2 = str;
                            if (kotlin.jvm.internal.i.b(str2, "1")) {
                                appCompatImageView.setBackgroundResource(R.drawable.circle_filled_orange);
                                appCompatImageView.setBackgroundTintList(g0.a.c(R.color.sea, activity));
                                appCompatImageView.setColorFilter(g0.a.b(activity, R.color.white));
                                robertoTextView3.setVisibility(0);
                                robertoTextView3.setText("All done");
                                robertoTextView2.setAlpha(0.34f);
                                uVar.f23466u = true;
                                i12 = 8;
                            } else {
                                appCompatImageView.setBackgroundResource(R.drawable.circle_hollow_dark_grey_bold);
                                appCompatImageView.setBackgroundTintList(null);
                                appCompatImageView.setColorFilter(g0.a.b(activity, R.color.learning_hub_grey_3));
                                i12 = 8;
                                robertoTextView3.setVisibility(8);
                                robertoTextView2.setAlpha(1.0f);
                                uVar.f23466u = false;
                            }
                            robertoTextView4.setVisibility(i12);
                            i10 = 8;
                            i11 = 0;
                            break;
                        }
                        str2 = str;
                        i10 = 8;
                        i11 = 0;
                    case -961591945:
                        str = str2;
                        dVar = dVar2;
                        break;
                    case 99033460:
                        str = str2;
                        dVar = dVar2;
                        break;
                    case 777898929:
                        dVar = dVar2;
                        if (type.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY)) {
                            robertoTextView4.setVisibility(0);
                            robertoTextView3.setVisibility(8);
                            robertoTextView2.setAlpha(1.0f);
                            if (kotlin.jvm.internal.i.b(str2, "1")) {
                                appCompatImageView.setBackgroundResource(R.drawable.circle_filled_orange);
                                appCompatImageView.setBackgroundTintList(g0.a.c(R.color.sea, activity));
                                appCompatImageView.setColorFilter(g0.a.b(activity, R.color.white));
                                robertoTextView4.setText(activity.getString(R.string.weeklyGoalDone));
                                uVar.f23466u = true;
                                str = str2;
                            } else {
                                appCompatImageView.setBackgroundResource(R.drawable.circle_hollow_dark_grey_bold);
                                appCompatImageView.setBackgroundTintList(null);
                                appCompatImageView.setColorFilter(g0.a.b(activity, R.color.learning_hub_grey_3));
                                uVar.f23466u = false;
                                str = str2;
                                String obj = DateFormat.format("EEEE", goal.getScheduledDate().getTime() * 1000).toString();
                                if (kotlin.jvm.internal.i.b(obj, DateFormat.format("EEEE", this.B.getTime()))) {
                                    robertoTextView4.setText(activity.getString(R.string.weeklyGoalScheduledToday));
                                } else {
                                    robertoTextView4.setText(activity.getString(R.string.weeklyGoalScheduled, obj));
                                }
                            }
                            xVar.f23469u = Integer.valueOf(goalHelper.getWeekdayOffset(goal.getScheduledDate().getTime() * 1000, this.B.getTime()));
                            str2 = str;
                        }
                        i10 = 8;
                        i11 = 0;
                        break;
                }
                z10 = this.G;
                d dVar3 = dVar;
                AppCompatImageView appCompatImageView2 = dVar3.f4498v;
                if (!z10) {
                    appCompatImageView2.setVisibility(i11);
                } else {
                    appCompatImageView2.setVisibility(i10);
                }
                Q1 = is.k.Q1(type, new String[]{Constants.GOAL_TYPE_HABIT, "physical_activity", Constants.GOAL_TYPE_RELAXATION_ACTIVITY, Constants.GOAL_TYPE_DAILY_ACTIVITY, Constants.GOAL_TYPE_ACTIVITY_DAILY});
                ImageView[] imageViewArr = dVar3.A;
                if (!Q1) {
                    Calendar calendar2 = this.A;
                    for (int i13 = 0; i13 < 7; i13++) {
                        RobertoTextView robertoTextView5 = dVar3.B[i13];
                        if (robertoTextView5 != null) {
                            robertoTextView5.setVisibility(0);
                        }
                        ImageView imageView = imageViewArr[i13];
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        if (str2.length() >= i13 && kotlin.jvm.internal.i.b(String.valueOf(str2.charAt(i13)), "1")) {
                            ImageView imageView2 = imageViewArr[i13];
                            if (imageView2 != null) {
                                Object obj2 = g0.a.f16164a;
                                imageView2.setBackground(a.c.b(activity, R.drawable.circle_hollow_blue_small));
                            }
                            ImageView imageView3 = imageViewArr[i13];
                            if (imageView3 != null) {
                                imageView3.setImageResource(R.drawable.ic_right);
                            }
                            ImageView imageView4 = imageViewArr[i13];
                            if (imageView4 != null) {
                                imageView4.setColorFilter(g0.a.b(activity, R.color.sea));
                            }
                        } else {
                            ImageView imageView5 = imageViewArr[i13];
                            if (imageView5 != null) {
                                Object obj3 = g0.a.f16164a;
                                imageView5.setBackground(a.c.b(activity, R.drawable.circle_filled_light_grey));
                            }
                            ImageView imageView6 = imageViewArr[i13];
                            if (imageView6 != null) {
                                imageView6.setImageResource(R.drawable.ic_right);
                            }
                            ImageView imageView7 = imageViewArr[i13];
                            if (imageView7 != null) {
                                imageView7.setColorFilter(g0.a.b(activity, R.color.learning_hub_grey_3));
                            }
                        }
                        calendar2.add(5, 1);
                    }
                    calendar2.add(5, -7);
                } else {
                    for (int i14 = 0; i14 < 7; i14++) {
                        RobertoTextView robertoTextView6 = dVar3.B[i14];
                        if (robertoTextView6 != null) {
                            robertoTextView6.setVisibility(8);
                        }
                        ImageView imageView8 = imageViewArr[i14];
                        if (imageView8 != null) {
                            imageView8.setVisibility(8);
                        }
                    }
                }
                appCompatImageView2.setOnClickListener(new l1(this, goal, i6, 13));
                c0Var.f2751a.setOnClickListener(new View.OnClickListener() { // from class: bm.l
                    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Integer] */
                    /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.Integer] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i6;
                        int i16 = r6;
                        u isChecked = uVar;
                        m this$0 = this;
                        x dayOffset = xVar;
                        Goal goal2 = goal;
                        switch (i16) {
                            case 0:
                                kotlin.jvm.internal.i.g(goal2, "$goal");
                                kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                                try {
                                    boolean b12 = kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                    m.b bVar = this$0.E;
                                    if (b12) {
                                        if (dayOffset.f23469u == 0) {
                                            dayOffset.f23469u = Integer.valueOf(this$0.f4491z.getWeekdayOffset(goal2.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                        }
                                        Integer num = (Integer) dayOffset.f23469u;
                                        if (num != null && num.intValue() == 0) {
                                            bVar.p(goal2, i15);
                                            return;
                                        }
                                        T t3 = dayOffset.f23469u;
                                        kotlin.jvm.internal.i.d(t3);
                                        if (((Number) t3).intValue() > 0) {
                                            if (isChecked.f23466u) {
                                                this$0.w();
                                                return;
                                            } else {
                                                bVar.w(goal2, this$0.B.getTime(), i15);
                                                return;
                                            }
                                        }
                                        T t10 = dayOffset.f23469u;
                                        kotlin.jvm.internal.i.d(t10);
                                        if (((Number) t10).intValue() < 0) {
                                            if (isChecked.f23466u) {
                                                this$0.w();
                                                return;
                                            } else {
                                                bVar.w(goal2, this$0.B.getTime(), i15);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    bVar.p(goal2, i15);
                                    return;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f4490y, e10);
                                    return;
                                }
                            default:
                                kotlin.jvm.internal.i.g(goal2, "$goal");
                                kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                                boolean b13 = kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                m.b bVar2 = this$0.E;
                                String str3 = "";
                                if (b13) {
                                    if (dayOffset.f23469u == 0) {
                                        dayOffset.f23469u = Integer.valueOf(this$0.f4491z.getWeekdayOffset(goal2.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                    }
                                    Integer num2 = (Integer) dayOffset.f23469u;
                                    if (num2 != null && num2.intValue() == 0) {
                                        String goalId = goal2.getGoalId();
                                        if (goalId != null) {
                                            str3 = goalId;
                                        }
                                        bVar2.K(str3, false, -1L);
                                        return;
                                    } else if (isChecked.f23466u) {
                                        this$0.w();
                                        return;
                                    } else {
                                        bVar2.w(goal2, this$0.B.getTime(), i15);
                                        return;
                                    }
                                }
                                String goalId2 = goal2.getGoalId();
                                if (goalId2 != null) {
                                    str3 = goalId2;
                                }
                                bVar2.K(str3, false, -1L);
                                return;
                        }
                    }
                });
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: bm.l
                    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Integer] */
                    /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.Integer] */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i6;
                        int i16 = r6;
                        u isChecked = uVar;
                        m this$0 = this;
                        x dayOffset = xVar;
                        Goal goal2 = goal;
                        switch (i16) {
                            case 0:
                                kotlin.jvm.internal.i.g(goal2, "$goal");
                                kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                                try {
                                    boolean b12 = kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                    m.b bVar = this$0.E;
                                    if (b12) {
                                        if (dayOffset.f23469u == 0) {
                                            dayOffset.f23469u = Integer.valueOf(this$0.f4491z.getWeekdayOffset(goal2.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                        }
                                        Integer num = (Integer) dayOffset.f23469u;
                                        if (num != null && num.intValue() == 0) {
                                            bVar.p(goal2, i15);
                                            return;
                                        }
                                        T t3 = dayOffset.f23469u;
                                        kotlin.jvm.internal.i.d(t3);
                                        if (((Number) t3).intValue() > 0) {
                                            if (isChecked.f23466u) {
                                                this$0.w();
                                                return;
                                            } else {
                                                bVar.w(goal2, this$0.B.getTime(), i15);
                                                return;
                                            }
                                        }
                                        T t10 = dayOffset.f23469u;
                                        kotlin.jvm.internal.i.d(t10);
                                        if (((Number) t10).intValue() < 0) {
                                            if (isChecked.f23466u) {
                                                this$0.w();
                                                return;
                                            } else {
                                                bVar.w(goal2, this$0.B.getTime(), i15);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    bVar.p(goal2, i15);
                                    return;
                                } catch (Exception e10) {
                                    LogHelper.INSTANCE.e(this$0.f4490y, e10);
                                    return;
                                }
                            default:
                                kotlin.jvm.internal.i.g(goal2, "$goal");
                                kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                                boolean b13 = kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                m.b bVar2 = this$0.E;
                                String str3 = "";
                                if (b13) {
                                    if (dayOffset.f23469u == 0) {
                                        dayOffset.f23469u = Integer.valueOf(this$0.f4491z.getWeekdayOffset(goal2.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                    }
                                    Integer num2 = (Integer) dayOffset.f23469u;
                                    if (num2 != null && num2.intValue() == 0) {
                                        String goalId = goal2.getGoalId();
                                        if (goalId != null) {
                                            str3 = goalId;
                                        }
                                        bVar2.K(str3, false, -1L);
                                        return;
                                    } else if (isChecked.f23466u) {
                                        this$0.w();
                                        return;
                                    } else {
                                        bVar2.w(goal2, this$0.B.getTime(), i15);
                                        return;
                                    }
                                }
                                String goalId2 = goal2.getGoalId();
                                if (goalId2 != null) {
                                    str3 = goalId2;
                                }
                                bVar2.K(str3, false, -1L);
                                return;
                        }
                    }
                });
            }
            dVar = dVar2;
            i10 = 8;
            i11 = 0;
            z10 = this.G;
            d dVar32 = dVar;
            AppCompatImageView appCompatImageView22 = dVar32.f4498v;
            if (!z10) {
            }
            Q1 = is.k.Q1(type, new String[]{Constants.GOAL_TYPE_HABIT, "physical_activity", Constants.GOAL_TYPE_RELAXATION_ACTIVITY, Constants.GOAL_TYPE_DAILY_ACTIVITY, Constants.GOAL_TYPE_ACTIVITY_DAILY});
            ImageView[] imageViewArr2 = dVar32.A;
            if (!Q1) {
            }
            appCompatImageView22.setOnClickListener(new l1(this, goal, i6, 13));
            c0Var.f2751a.setOnClickListener(new View.OnClickListener() { // from class: bm.l
                /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Integer] */
                /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.Integer] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = i6;
                    int i16 = r6;
                    u isChecked = uVar;
                    m this$0 = this;
                    x dayOffset = xVar;
                    Goal goal2 = goal;
                    switch (i16) {
                        case 0:
                            kotlin.jvm.internal.i.g(goal2, "$goal");
                            kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                            try {
                                boolean b12 = kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                m.b bVar = this$0.E;
                                if (b12) {
                                    if (dayOffset.f23469u == 0) {
                                        dayOffset.f23469u = Integer.valueOf(this$0.f4491z.getWeekdayOffset(goal2.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                    }
                                    Integer num = (Integer) dayOffset.f23469u;
                                    if (num != null && num.intValue() == 0) {
                                        bVar.p(goal2, i15);
                                        return;
                                    }
                                    T t3 = dayOffset.f23469u;
                                    kotlin.jvm.internal.i.d(t3);
                                    if (((Number) t3).intValue() > 0) {
                                        if (isChecked.f23466u) {
                                            this$0.w();
                                            return;
                                        } else {
                                            bVar.w(goal2, this$0.B.getTime(), i15);
                                            return;
                                        }
                                    }
                                    T t10 = dayOffset.f23469u;
                                    kotlin.jvm.internal.i.d(t10);
                                    if (((Number) t10).intValue() < 0) {
                                        if (isChecked.f23466u) {
                                            this$0.w();
                                            return;
                                        } else {
                                            bVar.w(goal2, this$0.B.getTime(), i15);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                bVar.p(goal2, i15);
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f4490y, e10);
                                return;
                            }
                        default:
                            kotlin.jvm.internal.i.g(goal2, "$goal");
                            kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                            boolean b13 = kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                            m.b bVar2 = this$0.E;
                            String str3 = "";
                            if (b13) {
                                if (dayOffset.f23469u == 0) {
                                    dayOffset.f23469u = Integer.valueOf(this$0.f4491z.getWeekdayOffset(goal2.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                }
                                Integer num2 = (Integer) dayOffset.f23469u;
                                if (num2 != null && num2.intValue() == 0) {
                                    String goalId = goal2.getGoalId();
                                    if (goalId != null) {
                                        str3 = goalId;
                                    }
                                    bVar2.K(str3, false, -1L);
                                    return;
                                } else if (isChecked.f23466u) {
                                    this$0.w();
                                    return;
                                } else {
                                    bVar2.w(goal2, this$0.B.getTime(), i15);
                                    return;
                                }
                            }
                            String goalId2 = goal2.getGoalId();
                            if (goalId2 != null) {
                                str3 = goalId2;
                            }
                            bVar2.K(str3, false, -1L);
                            return;
                    }
                }
            });
            appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: bm.l
                /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Integer] */
                /* JADX WARN: Type inference failed for: r0v37, types: [T, java.lang.Integer] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = i6;
                    int i16 = r6;
                    u isChecked = uVar;
                    m this$0 = this;
                    x dayOffset = xVar;
                    Goal goal2 = goal;
                    switch (i16) {
                        case 0:
                            kotlin.jvm.internal.i.g(goal2, "$goal");
                            kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                            try {
                                boolean b12 = kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                m.b bVar = this$0.E;
                                if (b12) {
                                    if (dayOffset.f23469u == 0) {
                                        dayOffset.f23469u = Integer.valueOf(this$0.f4491z.getWeekdayOffset(goal2.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                    }
                                    Integer num = (Integer) dayOffset.f23469u;
                                    if (num != null && num.intValue() == 0) {
                                        bVar.p(goal2, i15);
                                        return;
                                    }
                                    T t3 = dayOffset.f23469u;
                                    kotlin.jvm.internal.i.d(t3);
                                    if (((Number) t3).intValue() > 0) {
                                        if (isChecked.f23466u) {
                                            this$0.w();
                                            return;
                                        } else {
                                            bVar.w(goal2, this$0.B.getTime(), i15);
                                            return;
                                        }
                                    }
                                    T t10 = dayOffset.f23469u;
                                    kotlin.jvm.internal.i.d(t10);
                                    if (((Number) t10).intValue() < 0) {
                                        if (isChecked.f23466u) {
                                            this$0.w();
                                            return;
                                        } else {
                                            bVar.w(goal2, this$0.B.getTime(), i15);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                bVar.p(goal2, i15);
                                return;
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f4490y, e10);
                                return;
                            }
                        default:
                            kotlin.jvm.internal.i.g(goal2, "$goal");
                            kotlin.jvm.internal.i.g(dayOffset, "$dayOffset");
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(isChecked, "$isChecked");
                            boolean b13 = kotlin.jvm.internal.i.b(goal2.getType(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                            m.b bVar2 = this$0.E;
                            String str3 = "";
                            if (b13) {
                                if (dayOffset.f23469u == 0) {
                                    dayOffset.f23469u = Integer.valueOf(this$0.f4491z.getWeekdayOffset(goal2.getScheduledDate().getTime() * 1000, this$0.B.getTime()));
                                }
                                Integer num2 = (Integer) dayOffset.f23469u;
                                if (num2 != null && num2.intValue() == 0) {
                                    String goalId = goal2.getGoalId();
                                    if (goalId != null) {
                                        str3 = goalId;
                                    }
                                    bVar2.K(str3, false, -1L);
                                    return;
                                } else if (isChecked.f23466u) {
                                    this$0.w();
                                    return;
                                } else {
                                    bVar2.w(goal2, this$0.B.getTime(), i15);
                                    return;
                                }
                            }
                            String goalId2 = goal2.getGoalId();
                            if (goalId2 != null) {
                                str3 = goalId2;
                            }
                            bVar2.K(str3, false, -1L);
                            return;
                    }
                }
            });
        } else if (h(i6) == this.N) {
            hs.f<?, ?> fVar = this.C.get(i6);
            kotlin.jvm.internal.i.e(fVar, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            A a11 = fVar.f19464u;
            kotlin.jvm.internal.i.e(a11, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) a11;
            hs.f<?, ?> fVar2 = this.C.get(i6);
            kotlin.jvm.internal.i.e(fVar2, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            B b12 = fVar2.f19465v;
            kotlin.jvm.internal.i.e(b12, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) b12).intValue();
            int hashCode2 = str3.hashCode();
            if (hashCode2 != 68) {
                if (hashCode2 != 79) {
                    if (hashCode2 == 87 && str3.equals("W")) {
                        this.I = i6;
                        c cVar = (c) c0Var;
                        cVar.f4493u.setText("Weekly Goals");
                        cVar.f4494v.setText("Here are the goals you have to achieve each week");
                        hs.f<?, ?> fVar3 = this.C.get(i6);
                        kotlin.jvm.internal.i.e(fVar3, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                        B b13 = fVar3.f19465v;
                        kotlin.jvm.internal.i.e(b13, "null cannot be cast to non-null type kotlin.Int");
                        int intValue2 = ((Integer) b13).intValue();
                        RobertoTextView robertoTextView7 = cVar.f4495w;
                        CircularProgressBar circularProgressBar = cVar.f4496x;
                        if (intValue2 != -1) {
                            StringBuilder sb2 = new StringBuilder("");
                            hs.f<?, ?> fVar4 = this.C.get(i6);
                            kotlin.jvm.internal.i.e(fVar4, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                            B b14 = fVar4.f19465v;
                            kotlin.jvm.internal.i.e(b14, "null cannot be cast to non-null type kotlin.Int");
                            sb2.append(((Integer) b14).intValue());
                            sb2.append(" of ");
                            sb2.append(this.L);
                            sb2.append(" completed");
                            robertoTextView7.setText(sb2.toString());
                            circularProgressBar.setProgressMax(this.L);
                            circularProgressBar.c(intValue, 500);
                            return;
                        }
                        robertoTextView7.setText("0 of  " + this.L + " completed");
                        circularProgressBar.setProgressMax((float) this.L);
                        circularProgressBar.setProgress(0.0f);
                    }
                } else if (str3.equals("O")) {
                    this.J = i6;
                    c cVar2 = (c) c0Var;
                    cVar2.f4493u.setText("One-Time Goals");
                    cVar2.f4494v.setText("Track your one-time goals here");
                    hs.f<?, ?> fVar5 = this.C.get(i6);
                    kotlin.jvm.internal.i.e(fVar5, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b15 = fVar5.f19465v;
                    kotlin.jvm.internal.i.e(b15, "null cannot be cast to non-null type kotlin.Int");
                    int intValue3 = ((Integer) b15).intValue();
                    RobertoTextView robertoTextView8 = cVar2.f4495w;
                    CircularProgressBar circularProgressBar2 = cVar2.f4496x;
                    if (intValue3 != -1) {
                        StringBuilder sb3 = new StringBuilder("");
                        hs.f<?, ?> fVar6 = this.C.get(i6);
                        kotlin.jvm.internal.i.e(fVar6, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                        B b16 = fVar6.f19465v;
                        kotlin.jvm.internal.i.e(b16, "null cannot be cast to non-null type kotlin.Int");
                        sb3.append(((Integer) b16).intValue());
                        sb3.append(" of ");
                        sb3.append(this.M);
                        sb3.append(" completed");
                        robertoTextView8.setText(sb3.toString());
                        circularProgressBar2.setProgressMax(this.M);
                        circularProgressBar2.c(intValue, 500);
                        return;
                    }
                    robertoTextView8.setText("0 of  " + this.M + " completed");
                    circularProgressBar2.setProgressMax((float) this.M);
                    circularProgressBar2.setProgress(0.0f);
                }
            } else if (str3.equals("D")) {
                this.H = i6;
                c cVar3 = (c) c0Var;
                cVar3.f4493u.setText("Daily Goals");
                cVar3.f4494v.setText("Here are the goals you have to track each day");
                int i15 = this.K;
                RobertoTextView robertoTextView9 = cVar3.f4495w;
                CircularProgressBar circularProgressBar3 = cVar3.f4496x;
                if (i15 == 0) {
                    circularProgressBar3.setProgress(0.0f);
                    robertoTextView9.setText("No daily goals added");
                    return;
                }
                hs.f<?, ?> fVar7 = this.C.get(i6);
                kotlin.jvm.internal.i.e(fVar7, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                B b17 = fVar7.f19465v;
                kotlin.jvm.internal.i.e(b17, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) b17).intValue() == -1) {
                    hs.f<?, ?> fVar8 = this.C.get(i6);
                    kotlin.jvm.internal.i.e(fVar8, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b18 = fVar8.f19465v;
                    kotlin.jvm.internal.i.e(b18, "null cannot be cast to non-null type kotlin.Int");
                    if (((Integer) b18).intValue() == 0) {
                        robertoTextView9.setText("0 of  " + this.K + " completed");
                        circularProgressBar3.setProgressMax((float) this.K);
                        circularProgressBar3.setProgress(0.0f);
                        return;
                    }
                }
                StringBuilder sb4 = new StringBuilder("");
                hs.f<?, ?> fVar9 = this.C.get(i6);
                kotlin.jvm.internal.i.e(fVar9, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                B b19 = fVar9.f19465v;
                kotlin.jvm.internal.i.e(b19, "null cannot be cast to non-null type kotlin.Int");
                sb4.append(((Integer) b19).intValue());
                sb4.append(" of ");
                sb4.append(this.K);
                sb4.append(" completed");
                robertoTextView9.setText(sb4.toString());
                circularProgressBar3.setProgressMax(this.K);
                circularProgressBar3.c(intValue, 500);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        View view;
        kotlin.jvm.internal.i.g(parent, "parent");
        if (i6 == this.O) {
            View view2 = defpackage.d.d(parent, R.layout.row_goal_custom_new, parent, false);
            kotlin.jvm.internal.i.f(view2, "view");
            return new d(view2);
        } else if (i6 == this.N) {
            View view3 = defpackage.d.d(parent, R.layout.row_goal_header_custom, parent, false);
            kotlin.jvm.internal.i.f(view3, "view");
            return new c(view3);
        } else {
            if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && !this.D) {
                view = defpackage.d.d(parent, R.layout.row_goal_cta_custom, parent, false);
            } else {
                view = defpackage.d.d(parent, R.layout.row_goal_cta_custom_unlocked, parent, false);
            }
            kotlin.jvm.internal.i.f(view, "view");
            a aVar = new a(view);
            aVar.f4492u.setOnClickListener(new ol.k(12, this));
            return aVar;
        }
    }

    public final void v(boolean z10) {
        this.G = z10;
        if (z10 && (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() || this.D)) {
            hs.f remove = this.C.remove(0);
            kotlin.jvm.internal.i.e(remove, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.Int>");
            this.Q = remove;
        } else if ((!this.C.isEmpty()) && this.Q != null) {
            ArrayList<hs.f<?, ?>> arrayList = new ArrayList<>();
            hs.f<String, Integer> fVar = this.Q;
            kotlin.jvm.internal.i.d(fVar);
            arrayList.add(fVar);
            arrayList.addAll(this.C);
            this.C = arrayList;
            this.Q = null;
        }
        i();
    }

    public final void w() {
        UiUtils.Companion companion = UiUtils.Companion;
        Activity activity = this.f4489x;
        Dialog styledDialog = companion.getStyledDialog(R.layout.dialog_reset_course, activity, R.style.Theme_Dialog);
        Window window = styledDialog.getWindow();
        kotlin.jvm.internal.i.d(window);
        window.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
        ((AppCompatImageView) styledDialog.findViewById(R.id.resetBanner)).setImageResource(R.drawable.ic_weekly_goal_banner);
        ((RobertoTextView) styledDialog.findViewById(R.id.resetDialogTitle)).setText(activity.getString(R.string.weeklyGoalTrackedHeader));
        ((RobertoTextView) styledDialog.findViewById(R.id.resetQuestion)).setText(activity.getString(R.string.weeklyGoalTrackedBody));
        ((RobertoTextView) styledDialog.findViewById(R.id.f39931no)).setVisibility(4);
        ((RobertoTextView) styledDialog.findViewById(R.id.yes)).setOnClickListener(new dk.n(styledDialog, 24));
        ((RobertoTextView) styledDialog.findViewById(R.id.yes)).setText(activity.getString(R.string.got_it));
        styledDialog.show();
        String str = gk.a.f16573a;
        gk.a.b(UtilsKt.getAnalyticsBundle(), "weekly_goal_tracked_popup");
    }

    public final void x(int i6, String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1036290639) {
            if (hashCode != 99033460) {
                if (hashCode == 777898929 && str.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && i6 != this.L) {
                    this.L = i6;
                    i();
                }
            } else if (str.equals(Constants.GOAL_TYPE_HABIT) && i6 != this.K) {
                this.K = i6;
                i();
            }
        } else if (str.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE) && i6 != this.M) {
            this.M = i6;
            i();
        }
    }

    public final void y(int i6, String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1036290639) {
            if (hashCode != 99033460) {
                if (hashCode == 777898929 && str.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && this.I != i6) {
                    this.I = i6;
                    i();
                }
            } else if (str.equals(Constants.GOAL_TYPE_HABIT) && this.H != i6) {
                this.H = i6;
                i();
            }
        } else if (str.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE) && this.J != i6) {
            this.J = i6;
            i();
        }
    }

    public final void z(int i6, String str) {
        int i10;
        int i11;
        switch (str.hashCode()) {
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
                if (str.equals(Constants.GOAL_TYPE_ACTIVITY_ONCE) && (i10 = this.J) != -1) {
                    hs.f<?, ?> fVar = this.C.get(i10);
                    kotlin.jvm.internal.i.e(fVar, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b10 = fVar.f19465v;
                    kotlin.jvm.internal.i.e(b10, "null cannot be cast to non-null type kotlin.Int");
                    if (((Integer) b10).intValue() != i6) {
                        this.C.set(this.J, new hs.f<>("O", Integer.valueOf(i6)));
                        j(this.J);
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
                if (str.equals(Constants.GOAL_TYPE_ACTIVITY_WEEKLY) && (i11 = this.I) != -1) {
                    hs.f<?, ?> fVar2 = this.C.get(i11);
                    kotlin.jvm.internal.i.e(fVar2, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b11 = fVar2.f19465v;
                    kotlin.jvm.internal.i.e(b11, "null cannot be cast to non-null type kotlin.Int");
                    if (((Integer) b11).intValue() != i6) {
                        this.C.set(this.I, new hs.f<>("W", Integer.valueOf(i6)));
                        j(this.I);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
        int i12 = this.H;
        if (i12 != -1) {
            hs.f<?, ?> fVar3 = this.C.get(i12);
            kotlin.jvm.internal.i.e(fVar3, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            B b12 = fVar3.f19465v;
            kotlin.jvm.internal.i.e(b12, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) b12).intValue() != i6) {
                this.C.set(this.H, new hs.f<>("D", Integer.valueOf(i6)));
                j(this.H);
            }
        }
    }
}
