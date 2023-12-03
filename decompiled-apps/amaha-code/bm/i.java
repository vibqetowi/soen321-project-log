package bm;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import bm.i;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import ik.l1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import m6.f;
/* compiled from: GoalsAdapterNew.kt */
/* loaded from: classes2.dex */
public final class i extends RecyclerView.e<RecyclerView.c0> {
    public final b A;
    public final HashMap<String, GoalType> B;
    public int C;
    public boolean D;
    public final ArrayList<String> E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final int L;
    public final int M;
    public final int N;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f4466x;

    /* renamed from: y  reason: collision with root package name */
    public Date f4467y;

    /* renamed from: z  reason: collision with root package name */
    public final ArrayList<Object> f4468z;

    /* compiled from: GoalsAdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoButton f4469u;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.addGoalButton);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.addGoalButton)");
            this.f4469u = (RobertoButton) findViewById;
        }
    }

    /* compiled from: GoalsAdapterNew.kt */
    /* loaded from: classes2.dex */
    public interface b {
        void b();

        void u(Goal goal);

        void y(Goal goal, int i6);
    }

    /* compiled from: GoalsAdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class c extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f4470u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f4471v;

        /* renamed from: w  reason: collision with root package name */
        public final CircularProgressBar f4472w;

        public c(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.tvHabitGoalText);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.tvHabitGoalText)");
            this.f4470u = (RobertoTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.tvHabitGoalProgress);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.tvHabitGoalProgress)");
            this.f4471v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.habitCircularProgress);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.habitCircularProgress)");
            this.f4472w = (CircularProgressBar) findViewById3;
        }
    }

    /* compiled from: GoalsAdapterNew.kt */
    /* loaded from: classes2.dex */
    public final class d extends RecyclerView.c0 {
        public final RobertoTextView A;
        public final RobertoTextView B;
        public final RobertoTextView C;
        public final ImageView[] D;
        public final RobertoTextView[] E;

        /* renamed from: u  reason: collision with root package name */
        public final ConstraintLayout f4473u;

        /* renamed from: v  reason: collision with root package name */
        public final LinearLayout f4474v;

        /* renamed from: w  reason: collision with root package name */
        public final LinearLayout f4475w;

        /* renamed from: x  reason: collision with root package name */
        public final AppCompatImageView f4476x;

        /* renamed from: y  reason: collision with root package name */
        public final AppCompatImageView f4477y;

        /* renamed from: z  reason: collision with root package name */
        public final RobertoTextView f4478z;

        public d(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.mainLayout);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.mainLayout)");
            this.f4473u = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.bottomLayout);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.bottomLayout)");
            this.f4474v = (LinearLayout) findViewById2;
            View findViewById3 = view.findViewById(R.id.bottomSliderLayout);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.bottomSliderLayout)");
            this.f4475w = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.goalCheck);
            kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.goalCheck)");
            this.f4476x = (AppCompatImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.imageResponse);
            kotlin.jvm.internal.i.f(findViewById5, "view.findViewById(R.id.imageResponse)");
            this.f4477y = (AppCompatImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.text1);
            kotlin.jvm.internal.i.f(findViewById6, "view.findViewById(R.id.text1)");
            this.f4478z = (RobertoTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.noText);
            kotlin.jvm.internal.i.f(findViewById7, "view.findViewById(R.id.noText)");
            this.A = (RobertoTextView) findViewById7;
            View findViewById8 = view.findViewById(R.id.yesText);
            kotlin.jvm.internal.i.f(findViewById8, "view.findViewById(R.id.yesText)");
            this.B = (RobertoTextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.tvCourseTag);
            kotlin.jvm.internal.i.f(findViewById9, "view.findViewById(R.id.tvCourseTag)");
            this.C = (RobertoTextView) findViewById9;
            this.D = new ImageView[7];
            this.E = new RobertoTextView[7];
            for (int i6 = 0; i6 < 7; i6++) {
                this.D[i6] = (ImageView) view.findViewById(view.getContext().getResources().getIdentifier(defpackage.c.p("iday", i6), "id", view.getContext().getPackageName()));
            }
            for (int i10 = 0; i10 < 7; i10++) {
                this.E[i10] = (RobertoTextView) view.findViewById(view.getContext().getResources().getIdentifier(defpackage.c.p("tday", i10), "id", view.getContext().getPackageName()));
            }
        }
    }

    /* compiled from: GoalsAdapterNew.kt */
    /* loaded from: classes2.dex */
    public static final class e extends f.i {
        @Override // m6.f.i
        public final void a(m6.f view1) {
            kotlin.jvm.internal.i.g(view1, "view1");
            view1.b(true);
        }
    }

    public i(Activity activity, Date date, b listener, ArrayList<String> daysList, ArrayList<Object> goalList) {
        kotlin.jvm.internal.i.g(activity, "activity");
        kotlin.jvm.internal.i.g(listener, "listener");
        kotlin.jvm.internal.i.g(daysList, "daysList");
        kotlin.jvm.internal.i.g(goalList, "goalList");
        this.f4466x = activity;
        this.f4468z = new ArrayList<>();
        this.C = -1;
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = 1;
        this.M = 2;
        this.N = 3;
        this.f4467y = date;
        this.f4468z = goalList;
        this.A = listener;
        HashMap<String, GoalType> goalsHashMap = Constants.getGoalsHashMap();
        kotlin.jvm.internal.i.f(goalsHashMap, "getGoalsHashMap()");
        this.B = goalsHashMap;
        this.E = daysList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f4468z.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        ArrayList<Object> arrayList = this.f4468z;
        if (arrayList.get(i6) instanceof Goal) {
            return this.M;
        }
        Object obj = arrayList.get(i6);
        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Pair<kotlin.String, kotlin.Int>");
        if (kotlin.jvm.internal.i.b(((hs.f) obj).f19464u, "C")) {
            return this.N;
        }
        return this.L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
        if (r8.equals(com.theinnerhour.b2b.utils.Constants.GOAL_TYPE_HABIT) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e2, code lost:
        if (r8.equals("physical_activity") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ec, code lost:
        if (r8.equals(com.theinnerhour.b2b.utils.Constants.GOAL_TYPE_RELAXATION_ACTIVITY) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
        if (r8.equals(com.theinnerhour.b2b.utils.Constants.GOAL_TYPE_DAILY_ACTIVITY) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0133, code lost:
        if (r2 != 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0135, code lost:
        r10.setBackgroundResource(com.theinnerhour.b2b.R.drawable.circle_filled_orange);
        r10.setColorFilter(g0.a.b(r5, com.theinnerhour.b2b.R.color.white));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0140, code lost:
        r10.setBackgroundResource(com.theinnerhour.b2b.R.drawable.circle_hollow_dark_grey_bold);
        r10.setColorFilter(g0.a.b(r5, com.theinnerhour.b2b.R.color.learning_hub_grey_3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0150, code lost:
        r15.setVisibility(8);
        r14.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01cb, code lost:
        if (r0.intValue() >= 0) goto L62;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(final RecyclerView.c0 c0Var, final int i6) {
        int i10;
        int i11;
        int i12;
        int h10 = h(i6);
        int i13 = this.M;
        int i14 = -1;
        ArrayList<Object> arrayList = this.f4468z;
        if (h10 == i13) {
            Object obj = arrayList.get(i6);
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
            Goal goal = (Goal) obj;
            final String type = goal.getType();
            GoalType goalType = this.B.get(goal.getGoalId());
            if (goalType != null) {
                ((d) c0Var).f4478z.setText(goalType.getDashboardTxt());
            } else {
                ((d) c0Var).f4478z.setText(goal.getGoalName());
            }
            String courseDisplayName = Constants.getCourseDisplayName(goal.getCourseName());
            d dVar = (d) c0Var;
            RobertoTextView robertoTextView = dVar.C;
            robertoTextView.setText(courseDisplayName);
            robertoTextView.setVisibility(0);
            HashMap<Date, Integer> trackMap = goal.getTrackMap();
            Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
            if (trackMap.containsKey(this.f4467y)) {
                Integer num = trackMap.get(this.f4467y);
                kotlin.jvm.internal.i.d(num);
                i14 = num.intValue();
            }
            Activity activity = this.f4466x;
            AppCompatImageView appCompatImageView = dVar.f4476x;
            if (type != null) {
                int hashCode = type.hashCode();
                LinearLayout linearLayout = dVar.f4475w;
                LinearLayout linearLayout2 = dVar.f4474v;
                switch (hashCode) {
                    case -1408757131:
                        break;
                    case -1340224999:
                        if (type.equals(Constants.GOAL_TYPE_THOUGHT)) {
                            if (i14 == 2) {
                                appCompatImageView.setBackgroundResource(R.drawable.circle_filled_orange);
                                appCompatImageView.setColorFilter(g0.a.b(activity, R.color.white));
                            } else {
                                appCompatImageView.setBackgroundResource(R.drawable.circle_hollow_dark_grey_bold);
                                appCompatImageView.setColorFilter(g0.a.b(activity, R.color.learning_hub_grey_3));
                            }
                            if (this.C == i6) {
                                linearLayout2.setVisibility(0);
                                i11 = 8;
                            } else {
                                i11 = 8;
                                linearLayout2.setVisibility(8);
                            }
                            linearLayout.setVisibility(i11);
                            break;
                        }
                        break;
                    case -1142639703:
                        break;
                    case -961591945:
                        break;
                    case -517891900:
                        if (type.equals("activity_scheduling")) {
                            if (i14 >= 0) {
                                appCompatImageView.setBackgroundResource(R.drawable.circle_filled_orange);
                                appCompatImageView.setColorFilter(g0.a.b(activity, R.color.white));
                            } else {
                                appCompatImageView.setBackgroundResource(R.drawable.circle_hollow_dark_grey_bold);
                                appCompatImageView.setColorFilter(g0.a.b(activity, R.color.learning_hub_grey_3));
                            }
                            if (this.C == i6) {
                                linearLayout.setVisibility(0);
                                i12 = 8;
                            } else {
                                i12 = 8;
                                linearLayout.setVisibility(8);
                            }
                            linearLayout2.setVisibility(i12);
                            break;
                        }
                        break;
                    case 99033460:
                        break;
                }
            }
            boolean z10 = this.D;
            AppCompatImageView appCompatImageView2 = dVar.f4477y;
            if (z10) {
                i10 = 0;
                appCompatImageView2.setVisibility(0);
                appCompatImageView2.setOnClickListener(new l1(this, goal, i6, 11));
            } else {
                i10 = 0;
                appCompatImageView2.setVisibility(8);
                appCompatImageView2.setOnClickListener(null);
            }
            todayCalendar.add(5, -6);
            while (i10 < 7) {
                RobertoTextView robertoTextView2 = dVar.E[i10];
                if (robertoTextView2 != null) {
                    robertoTextView2.setText(this.E.get(i10));
                }
                boolean containsKey = trackMap.containsKey(todayCalendar.getTime());
                ImageView[] imageViewArr = dVar.D;
                if (containsKey) {
                    Integer num2 = trackMap.get(todayCalendar.getTime());
                    if (num2 == null || num2.intValue() != 2) {
                        if (kotlin.jvm.internal.i.b(type, "activity_scheduling")) {
                            Integer num3 = trackMap.get(todayCalendar.getTime());
                            kotlin.jvm.internal.i.d(num3);
                        }
                    }
                    ImageView imageView = imageViewArr[i10];
                    if (imageView != null) {
                        Object obj2 = g0.a.f16164a;
                        imageView.setBackground(a.c.b(activity, R.drawable.circle_hollow_orange_small));
                    }
                    ImageView imageView2 = imageViewArr[i10];
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.ic_right);
                    }
                    ImageView imageView3 = imageViewArr[i10];
                    if (imageView3 != null) {
                        imageView3.setColorFilter(g0.a.b(activity, R.color.orange));
                    }
                    todayCalendar.add(5, 1);
                    i10++;
                }
                ImageView imageView4 = imageViewArr[i10];
                if (imageView4 != null) {
                    Object obj3 = g0.a.f16164a;
                    imageView4.setBackground(a.c.b(activity, R.drawable.circle_filled_light_grey));
                }
                ImageView imageView5 = imageViewArr[i10];
                if (imageView5 != null) {
                    imageView5.setImageResource(R.drawable.ic_right);
                }
                ImageView imageView6 = imageViewArr[i10];
                if (imageView6 != null) {
                    imageView6.setColorFilter(g0.a.b(activity, R.color.learning_hub_grey_3));
                }
                todayCalendar.add(5, 1);
                i10++;
            }
            dVar.f4473u.setOnClickListener(new ak.d(i6, 10, this));
            appCompatImageView.setOnClickListener(new f(type, i14, this, i6));
            dVar.A.setOnClickListener(new View.OnClickListener(this, i6, type, c0Var, 0) { // from class: bm.g

                /* renamed from: u  reason: collision with root package name */
                public final /* synthetic */ int f4458u;

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ i f4459v;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ int f4460w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ RecyclerView.c0 f4461x;

                {
                    this.f4458u = r5;
                    this.f4459v = this;
                    this.f4461x = c0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = this.f4458u;
                    int i16 = this.f4460w;
                    RecyclerView.c0 holder = this.f4461x;
                    i this$0 = this.f4459v;
                    switch (i15) {
                        case 0:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(holder, "$holder");
                            Object obj4 = this$0.f4468z.get(i16);
                            kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
                            this$0.A.y((Goal) obj4, 1);
                            ((i.d) holder).f4474v.setVisibility(8);
                            this$0.C = -1;
                            this$0.j(i16);
                            return;
                        default:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(holder, "$holder");
                            Object obj5 = this$0.f4468z.get(i16);
                            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
                            this$0.A.y((Goal) obj5, 2);
                            ((i.d) holder).f4474v.setVisibility(8);
                            this$0.C = -1;
                            this$0.j(i16);
                            return;
                    }
                }
            });
            dVar.B.setOnClickListener(new View.OnClickListener(this, i6, type, c0Var, 1) { // from class: bm.g

                /* renamed from: u  reason: collision with root package name */
                public final /* synthetic */ int f4458u;

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ i f4459v;

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ int f4460w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ RecyclerView.c0 f4461x;

                {
                    this.f4458u = r5;
                    this.f4459v = this;
                    this.f4461x = c0Var;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i15 = this.f4458u;
                    int i16 = this.f4460w;
                    RecyclerView.c0 holder = this.f4461x;
                    i this$0 = this.f4459v;
                    switch (i15) {
                        case 0:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(holder, "$holder");
                            Object obj4 = this$0.f4468z.get(i16);
                            kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
                            this$0.A.y((Goal) obj4, 1);
                            ((i.d) holder).f4474v.setVisibility(8);
                            this$0.C = -1;
                            this$0.j(i16);
                            return;
                        default:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(holder, "$holder");
                            Object obj5 = this$0.f4468z.get(i16);
                            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type com.theinnerhour.b2b.model.Goal");
                            this$0.A.y((Goal) obj5, 2);
                            ((i.d) holder).f4474v.setVisibility(8);
                            this$0.C = -1;
                            this$0.j(i16);
                            return;
                    }
                }
            });
        } else if (h(i6) == this.L) {
            Object obj4 = arrayList.get(i6);
            kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            A a10 = ((hs.f) obj4).f19464u;
            kotlin.jvm.internal.i.e(a10, "null cannot be cast to non-null type kotlin.String");
            String str = (String) a10;
            Object obj5 = arrayList.get(i6);
            kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            B b10 = ((hs.f) obj5).f19465v;
            kotlin.jvm.internal.i.e(b10, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) b10).intValue();
            int hashCode2 = str.hashCode();
            if (hashCode2 != 68) {
                if (hashCode2 != 83) {
                    if (hashCode2 == 84 && str.equals("T")) {
                        this.G = i6;
                        c cVar = (c) c0Var;
                        cVar.f4470u.setText("Thought\nGoals");
                        Object obj6 = arrayList.get(i6);
                        kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                        B b11 = ((hs.f) obj6).f19465v;
                        kotlin.jvm.internal.i.e(b11, "null cannot be cast to non-null type kotlin.Int");
                        int intValue2 = ((Integer) b11).intValue();
                        RobertoTextView robertoTextView3 = cVar.f4471v;
                        CircularProgressBar circularProgressBar = cVar.f4472w;
                        if (intValue2 != -1) {
                            StringBuilder sb2 = new StringBuilder("");
                            Object obj7 = arrayList.get(i6);
                            kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                            B b12 = ((hs.f) obj7).f19465v;
                            kotlin.jvm.internal.i.e(b12, "null cannot be cast to non-null type kotlin.Int");
                            sb2.append(((Integer) b12).intValue());
                            sb2.append(" of ");
                            sb2.append(this.J);
                            sb2.append(" completed");
                            robertoTextView3.setText(sb2.toString());
                            circularProgressBar.setProgressMax(this.J);
                            circularProgressBar.c(intValue, 500);
                            return;
                        }
                        robertoTextView3.setText("0 of  " + this.J + " completed");
                        circularProgressBar.setProgressMax((float) this.J);
                        circularProgressBar.setProgress(0.0f);
                    }
                } else if (str.equals("S")) {
                    this.H = i6;
                    c cVar2 = (c) c0Var;
                    cVar2.f4470u.setText("Happiness\nTasks");
                    Object obj8 = arrayList.get(i6);
                    kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b13 = ((hs.f) obj8).f19465v;
                    kotlin.jvm.internal.i.e(b13, "null cannot be cast to non-null type kotlin.Int");
                    int intValue3 = ((Integer) b13).intValue();
                    RobertoTextView robertoTextView4 = cVar2.f4471v;
                    CircularProgressBar circularProgressBar2 = cVar2.f4472w;
                    if (intValue3 != -1) {
                        StringBuilder sb3 = new StringBuilder("");
                        Object obj9 = arrayList.get(i6);
                        kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                        B b14 = ((hs.f) obj9).f19465v;
                        kotlin.jvm.internal.i.e(b14, "null cannot be cast to non-null type kotlin.Int");
                        sb3.append(((Integer) b14).intValue());
                        sb3.append(" of ");
                        sb3.append(this.K);
                        sb3.append(" completed");
                        robertoTextView4.setText(sb3.toString());
                        circularProgressBar2.setProgressMax(this.K);
                        circularProgressBar2.c(intValue, 500);
                        return;
                    }
                    robertoTextView4.setText("0 of  " + this.K + " completed");
                    circularProgressBar2.setProgressMax((float) this.K);
                    circularProgressBar2.setProgress(0.0f);
                }
            } else if (str.equals("D")) {
                this.F = i6;
                c cVar3 = (c) c0Var;
                cVar3.f4470u.setText("Behavioural\nGoals");
                Object obj10 = arrayList.get(i6);
                kotlin.jvm.internal.i.e(obj10, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                B b15 = ((hs.f) obj10).f19465v;
                kotlin.jvm.internal.i.e(b15, "null cannot be cast to non-null type kotlin.Int");
                int intValue4 = ((Integer) b15).intValue();
                RobertoTextView robertoTextView5 = cVar3.f4471v;
                CircularProgressBar circularProgressBar3 = cVar3.f4472w;
                if (intValue4 == -1) {
                    Object obj11 = arrayList.get(i6);
                    kotlin.jvm.internal.i.e(obj11, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b16 = ((hs.f) obj11).f19465v;
                    kotlin.jvm.internal.i.e(b16, "null cannot be cast to non-null type kotlin.Int");
                    if (((Integer) b16).intValue() == 0) {
                        robertoTextView5.setText("0 of  " + this.I + " completed");
                        circularProgressBar3.setProgressMax((float) this.I);
                        circularProgressBar3.setProgress(0.0f);
                        return;
                    }
                }
                StringBuilder sb4 = new StringBuilder("");
                Object obj12 = arrayList.get(i6);
                kotlin.jvm.internal.i.e(obj12, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                B b17 = ((hs.f) obj12).f19465v;
                kotlin.jvm.internal.i.e(b17, "null cannot be cast to non-null type kotlin.Int");
                sb4.append(((Integer) b17).intValue());
                sb4.append(" of ");
                sb4.append(this.I);
                sb4.append(" completed");
                robertoTextView5.setText(sb4.toString());
                circularProgressBar3.setProgressMax(this.I);
                circularProgressBar3.c(intValue, 500);
            }
        } else {
            ((a) c0Var).f4469u.setOnClickListener(new ol.k(11, this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        if (i6 == this.M) {
            View view = defpackage.d.d(parent, R.layout.row_goal_v2, parent, false);
            kotlin.jvm.internal.i.f(view, "view");
            return new d(view);
        } else if (i6 == this.L) {
            View view2 = defpackage.d.d(parent, R.layout.row_goal_header, parent, false);
            kotlin.jvm.internal.i.f(view2, "view");
            return new c(view2);
        } else {
            View view3 = defpackage.d.d(parent, R.layout.row_goal_cta, parent, false);
            kotlin.jvm.internal.i.f(view3, "view");
            return new a(view3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void s(RecyclerView.c0 c0Var) {
        Activity activity = this.f4466x;
        try {
            if (c0Var.h() == 1) {
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.activity.V2GoalsActivity");
                if (((V2GoalsActivity) activity).I) {
                    m6.j jVar = new m6.j(((d) c0Var).f4476x, activity.getString(R.string.trackgoalsToolTipsTitle), activity.getString(R.string.trackgoalsToolTipsSubTitle));
                    jVar.f24865e = R.color.sea;
                    jVar.f = 20;
                    jVar.f24866g = 12;
                    jVar.f24867h = false;
                    m6.f.f(activity, jVar, new e());
                    ((V2GoalsActivity) activity).I = false;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("Exception in goals tooltip", e10);
        }
    }

    public final void v(int i6, String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1340224999) {
            if (hashCode != -517891900) {
                if (hashCode == 99033460 && str.equals(Constants.GOAL_TYPE_HABIT)) {
                    this.I = i6;
                }
            } else if (str.equals("activity_scheduling")) {
                this.K = i6;
            }
        } else if (str.equals(Constants.GOAL_TYPE_THOUGHT)) {
            this.J = i6;
        }
        i();
    }

    public final void w(int i6, String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1340224999) {
            if (hashCode != -517891900) {
                if (hashCode == 99033460 && str.equals(Constants.GOAL_TYPE_HABIT)) {
                    this.F = i6;
                }
            } else if (str.equals("activity_scheduling")) {
                this.H = i6;
            }
        } else if (str.equals(Constants.GOAL_TYPE_THOUGHT)) {
            this.G = i6;
        }
        i();
    }

    public final void x(int i6, String str) {
        int i10;
        int i11;
        int hashCode = str.hashCode();
        ArrayList<Object> arrayList = this.f4468z;
        switch (hashCode) {
            case -1408757131:
                if (!str.equals(Constants.GOAL_TYPE_DAILY_ACTIVITY)) {
                    return;
                }
                break;
            case -1340224999:
                if (str.equals(Constants.GOAL_TYPE_THOUGHT) && (i10 = this.G) != -1) {
                    Object obj = arrayList.get(i10);
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b10 = ((hs.f) obj).f19465v;
                    kotlin.jvm.internal.i.e(b10, "null cannot be cast to non-null type kotlin.Int");
                    if (((Integer) b10).intValue() != i6) {
                        arrayList.set(this.G, new hs.f("T", Integer.valueOf(i6)));
                        j(this.G);
                        return;
                    }
                    return;
                }
                return;
            case -1142639703:
                if (!str.equals(Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                    return;
                }
                break;
            case -961591945:
                if (!str.equals("physical_activity")) {
                    return;
                }
                break;
            case -517891900:
                if (str.equals("activity_scheduling") && (i11 = this.H) != -1) {
                    Object obj2 = arrayList.get(i11);
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    B b11 = ((hs.f) obj2).f19465v;
                    kotlin.jvm.internal.i.e(b11, "null cannot be cast to non-null type kotlin.Int");
                    if (((Integer) b11).intValue() != i6) {
                        arrayList.set(this.H, new hs.f("S", Integer.valueOf(i6)));
                        j(this.H);
                        return;
                    }
                    return;
                }
                return;
            case 99033460:
                if (!str.equals(Constants.GOAL_TYPE_HABIT)) {
                    return;
                }
                break;
            default:
                return;
        }
        int i12 = this.F;
        if (i12 != -1) {
            Object obj3 = arrayList.get(i12);
            kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            B b12 = ((hs.f) obj3).f19465v;
            kotlin.jvm.internal.i.e(b12, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) b12).intValue() != i6) {
                arrayList.set(this.F, new hs.f("D", Integer.valueOf(i6)));
                j(this.F);
            }
        }
    }
}
