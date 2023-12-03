package up;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.GoalHelper;
import com.theinnerhour.b2b.utils.MiniCourseUtilsKt;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import il.g;
import is.k;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.v;
/* compiled from: TopicalGoalsAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.e<RecyclerView.c0> {
    public Date A;
    public final ArrayList<Goal> B;
    public final b C;
    public boolean D;
    public final int E;

    /* renamed from: x  reason: collision with root package name */
    public final Activity f34441x;

    /* renamed from: y  reason: collision with root package name */
    public final GoalHelper f34442y;

    /* renamed from: z  reason: collision with root package name */
    public Calendar f34443z;

    /* compiled from: TopicalGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.addGoalButton);
            i.f(findViewById, "view.findViewById(R.id.addGoalButton)");
            RobertoButton robertoButton = (RobertoButton) findViewById;
        }
    }

    /* compiled from: TopicalGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public interface b {
        void b();

        void q(Goal goal, int i6, int i10);

        void t(Goal goal, int i6);
    }

    /* compiled from: TopicalGoalsAdapter.kt */
    /* renamed from: up.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0579c extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final ConstraintLayout f34444u;

        /* renamed from: v  reason: collision with root package name */
        public final AppCompatImageView f34445v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f34446w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f34447x;

        /* renamed from: y  reason: collision with root package name */
        public final ImageView[] f34448y;

        public C0579c(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.mainLayout);
            i.f(findViewById, "view.findViewById(R.id.mainLayout)");
            this.f34444u = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.goalCheck);
            i.f(findViewById2, "view.findViewById(R.id.goalCheck)");
            this.f34445v = (AppCompatImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.text1);
            i.f(findViewById3, "view.findViewById(R.id.text1)");
            this.f34446w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.goalSubheader);
            i.f(findViewById4, "view.findViewById(R.id.goalSubheader)");
            this.f34447x = (RobertoTextView) findViewById4;
            this.f34448y = new ImageView[7];
            for (int i6 = 0; i6 < 7; i6++) {
                this.f34448y[i6] = (ImageView) view.findViewById(view.getContext().getResources().getIdentifier(defpackage.c.p("iday", i6), "id", view.getContext().getPackageName()));
            }
        }
    }

    public c(Activity activity, Date date, b listener, ArrayList<String> daysList, ArrayList<Goal> goalList) {
        i.g(activity, "activity");
        i.g(listener, "listener");
        i.g(daysList, "daysList");
        i.g(goalList, "goalList");
        this.f34441x = activity;
        GoalHelper goalHelper = new GoalHelper();
        this.f34442y = goalHelper;
        this.B = new ArrayList<>();
        this.E = 2;
        this.A = date;
        this.B = goalList;
        this.C = listener;
        Calendar calendar = goalHelper.getWeekOf(date.getTime()).get(0);
        i.f(calendar, "goalHelper.getWeekOf(this.date.time)[0]");
        this.f34443z = calendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.B.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        return this.E;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        int i10;
        Integer num;
        Goal goal = this.B.get(i6);
        i.f(goal, "goalList[position]");
        Goal goal2 = goal;
        String type = goal2.getType();
        C0579c c0579c = (C0579c) c0Var;
        c0579c.f34446w.setText(goal2.getGoalName());
        String source = goal2.getSource();
        Activity activity = this.f34441x;
        c0579c.f34447x.setText(MiniCourseUtilsKt.getMiniCourseTitle(source, activity));
        HashMap<Date, Integer> trackMap = goal2.getTrackMap();
        if (trackMap.containsKey(this.A)) {
            Integer num2 = trackMap.get(this.A);
            i.d(num2);
            i10 = num2.intValue();
        } else {
            i10 = -1;
        }
        v vVar = new v();
        boolean Q1 = k.Q1(type, new String[]{Constants.GOAL_TYPE_HABIT, "physical_activity", Constants.GOAL_TYPE_RELAXATION_ACTIVITY, Constants.GOAL_TYPE_DAILY_ACTIVITY, Constants.GOAL_TYPE_ACTIVITY_DAILY});
        int i11 = 2;
        int i12 = 0;
        ImageView[] imageViewArr = c0579c.f34448y;
        if (Q1) {
            Calendar calendar = this.f34443z;
            int i13 = 0;
            for (int i14 = 7; i13 < i14; i14 = 7) {
                ImageView imageView = imageViewArr[i13];
                if (imageView != null) {
                    imageView.setVisibility(i12);
                }
                if (trackMap.containsKey(calendar.getTime()) && (num = trackMap.get(calendar.getTime())) != null && num.intValue() == i11) {
                    ImageView imageView2 = imageViewArr[i13];
                    if (imageView2 != null) {
                        imageView2.setAlpha(1.0f);
                    }
                    ImageView imageView3 = imageViewArr[i13];
                    if (imageView3 != null) {
                        imageView3.setImageResource(R.drawable.ic_round_check);
                    }
                    ImageView imageView4 = imageViewArr[i13];
                    if (imageView4 != null) {
                        imageView4.setColorFilter(g0.a.b(activity, R.color.white));
                    }
                    ImageView imageView5 = imageViewArr[i13];
                    if (imageView5 != null) {
                        imageView5.setBackgroundResource(R.drawable.circle_filled_light_grey);
                    }
                    ImageView imageView6 = imageViewArr[i13];
                    if (imageView6 != null) {
                        imageView6.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(activity, R.color.topicalYellow)));
                    }
                    vVar.f23467u++;
                } else {
                    ImageView imageView7 = imageViewArr[i13];
                    if (imageView7 != null) {
                        imageView7.setImageResource(0);
                    }
                    if (calendar.getTime().compareTo(Utils.INSTANCE.getTodayCalendar().getTime()) < 0) {
                        ImageView imageView8 = imageViewArr[i13];
                        if (imageView8 != null) {
                            imageView8.setAlpha(0.34f);
                        }
                        ImageView imageView9 = imageViewArr[i13];
                        if (imageView9 != null) {
                            imageView9.setBackgroundResource(R.drawable.circle_filled_light_grey);
                        }
                        ImageView imageView10 = imageViewArr[i13];
                        if (imageView10 != null) {
                            imageView10.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(activity, R.color.topicalYellow)));
                        }
                    } else {
                        ImageView imageView11 = imageViewArr[i13];
                        if (imageView11 != null) {
                            imageView11.setAlpha(1.0f);
                        }
                        ImageView imageView12 = imageViewArr[i13];
                        if (imageView12 != null) {
                            imageView12.setBackgroundResource(R.drawable.circle_hollow_green_topical);
                        }
                        ImageView imageView13 = imageViewArr[i13];
                        if (imageView13 != null) {
                            imageView13.setBackgroundTintList(null);
                        }
                    }
                }
                calendar.add(5, 1);
                i13++;
                i12 = 0;
                i11 = 2;
            }
            calendar.add(5, -7);
        } else {
            for (int i15 = 0; i15 < 7; i15++) {
                ImageView imageView14 = imageViewArr[i15];
                if (imageView14 != null) {
                    imageView14.setVisibility(8);
                }
            }
        }
        boolean z10 = this.D;
        ConstraintLayout constraintLayout = c0579c.f34444u;
        AppCompatImageView appCompatImageView = c0579c.f34445v;
        if (z10) {
            appCompatImageView.setBackgroundResource(R.drawable.circle_filled_orange);
            appCompatImageView.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(activity, R.color.login_grey_background)));
            appCompatImageView.setImageResource(R.drawable.ic_circle_remove);
            appCompatImageView.setColorFilter(g0.a.b(activity, R.color.minicourse_bg_red));
            constraintLayout.setOnClickListener(new g(24));
            appCompatImageView.setOnClickListener(new to.b(this, goal2, i6, 1));
            return;
        }
        if (i10 == 2) {
            appCompatImageView.setBackgroundResource(R.drawable.circle_filled_orange);
            appCompatImageView.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(activity, R.color.topicalGreen)));
            appCompatImageView.setImageResource(R.drawable.ic_round_check);
            appCompatImageView.setColorFilter(g0.a.b(activity, R.color.white));
            constraintLayout.setBackgroundTintList(ColorStateList.valueOf(g0.a.b(activity, R.color.login_grey_background)));
        } else {
            appCompatImageView.setBackgroundResource(R.drawable.circle_hollow_green_topical);
            appCompatImageView.setBackgroundTintList(null);
            appCompatImageView.setImageResource(0);
            constraintLayout.setBackgroundTintList(null);
        }
        constraintLayout.setOnClickListener(new to.b(this, i6, vVar));
        v vVar2 = new v();
        vVar2.f23467u = i10;
        appCompatImageView.setOnClickListener(new am.c(vVar2, this, i6, type, 3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (i6 == this.E) {
            View view = d.d(parent, R.layout.row_goal_topical, parent, false);
            i.f(view, "view");
            return new C0579c(view);
        }
        View view2 = d.d(parent, R.layout.row_goal_cta_topical, parent, false);
        i.f(view2, "view");
        return new a(view2);
    }
}
