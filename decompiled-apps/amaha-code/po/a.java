package po;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.pro.goal.activity.ProGoalsActivity;
import com.theinnerhour.b2b.components.pro.goal.model.DaySpecificDailyGoal;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import hs.f;
import ik.l1;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import nn.v0;
/* compiled from: ProGoalsAdapter.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.e<RecyclerView.c0> {

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<f<String, ?>> f28724x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f28725y;

    /* renamed from: z  reason: collision with root package name */
    public final d f28726z;

    /* compiled from: ProGoalsAdapter.kt */
    /* renamed from: po.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0485a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f28727u;

        public C0485a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.rowGoalAlertProCta);
            i.f(findViewById, "view.findViewById(R.id.rowGoalAlertProCta)");
            this.f28727u = (RobertoTextView) findViewById;
        }
    }

    /* compiled from: ProGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f28728u;

        public b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.rowGoalDividerTitle);
            i.f(findViewById, "view.findViewById(R.id.rowGoalDividerTitle)");
            this.f28728u = (RobertoTextView) findViewById;
        }
    }

    /* compiled from: ProGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public final class c extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final AppCompatImageView f28729u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f28730v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f28731w;

        /* renamed from: x  reason: collision with root package name */
        public final ImageView[] f28732x;

        public c(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.goalCheck);
            i.f(findViewById, "view.findViewById(R.id.goalCheck)");
            this.f28729u = (AppCompatImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.goalHeader);
            i.f(findViewById2, "view.findViewById(R.id.goalHeader)");
            this.f28730v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.goalSubheader);
            i.f(findViewById3, "view.findViewById(R.id.goalSubheader)");
            this.f28731w = (RobertoTextView) findViewById3;
            this.f28732x = new ImageView[7];
            for (int i6 = 0; i6 < 7; i6++) {
                this.f28732x[i6] = (ImageView) view.findViewById(view.getContext().getResources().getIdentifier(defpackage.c.p("iday", i6), "id", view.getContext().getPackageName()));
            }
        }
    }

    /* compiled from: ProGoalsAdapter.kt */
    /* loaded from: classes2.dex */
    public interface d {
        void N(Goal goal);

        void U();
    }

    public a(ArrayList goalsList, ProGoalsActivity context, ProGoalsActivity listener) {
        i.g(goalsList, "goalsList");
        i.g(context, "context");
        i.g(listener, "listener");
        this.f28724x = goalsList;
        this.f28725y = context;
        this.f28726z = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f28724x.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047 A[ORIG_RETURN, RETURN] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(int i6) {
        String str = this.f28724x.get(i6).f19464u;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals("enabled")) {
                    return 0;
                }
                return 3;
            case -1368506995:
                if (str.equals("gap_day_divider")) {
                    return 2;
                }
                break;
            case -858933162:
                if (!str.equals("disabled_divider")) {
                }
                break;
            case -552569829:
                if (!str.equals("enabled_divider")) {
                }
                break;
            case 270940796:
                if (str.equals("disabled")) {
                    return 1;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(RecyclerView.c0 c0Var, int i6) {
        String str;
        int i10 = c0Var.f;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                f<String, ?> fVar = this.f28724x.get(i6);
                i.f(fVar, "goalsList[position]");
                f<String, ?> fVar2 = fVar;
                b bVar = (b) c0Var;
                if (i.b(fVar2.f19464u, "enabled_divider")) {
                    B b10 = fVar2.f19465v;
                    i.e(b10, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                    f fVar3 = (f) b10;
                    B b11 = fVar3.f19465v;
                    i.e(b11, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = ((Integer) b11).intValue();
                    A a10 = fVar3.f19464u;
                    i.e(a10, "null cannot be cast to non-null type kotlin.Int");
                    int intValue2 = intValue - ((Integer) a10).intValue();
                    if (intValue2 != 0) {
                        if (intValue2 != 1) {
                            str = intValue2 + " goals left";
                        } else {
                            str = "1 goal left";
                        }
                    } else {
                        str = "Done for the day!";
                    }
                } else if (i.b(fVar2.f19464u, "disabled_divider")) {
                    str = "Inactive goals";
                } else {
                    str = "No goals for today";
                }
                bVar.f28728u.setText(str);
                return;
            }
            return;
        }
        B b12 = this.f28724x.get(i6).f19465v;
        i.e(b12, "null cannot be cast to non-null type com.theinnerhour.b2b.components.pro.goal.model.DaySpecificDailyGoal");
        DaySpecificDailyGoal daySpecificDailyGoal = (DaySpecificDailyGoal) b12;
        c cVar = (c) c0Var;
        cVar.f28730v.setText(daySpecificDailyGoal.getGoal().getGoalName());
        String courseName = daySpecificDailyGoal.getGoal().getCourseName();
        RobertoTextView robertoTextView = cVar.f28731w;
        robertoTextView.setText(courseName);
        robertoTextView.setText(Constants.getCourseDisplayName(daySpecificDailyGoal.getGoal().getCourseName()));
        boolean trackedForDay = daySpecificDailyGoal.getTrackedForDay();
        AppCompatImageView appCompatImageView = cVar.f28729u;
        if (trackedForDay) {
            Context context = appCompatImageView.getContext();
            Object obj = g0.a.f16164a;
            appCompatImageView.setImageDrawable(a.c.b(context, R.drawable.ic_round_check));
            appCompatImageView.setBackground(a.c.b(appCompatImageView.getContext(), R.drawable.circle));
            appCompatImageView.setBackgroundTintList(g0.a.c(R.color.proLightPink, appCompatImageView.getContext()));
        } else {
            appCompatImageView.setImageDrawable(null);
            Context context2 = appCompatImageView.getContext();
            Object obj2 = g0.a.f16164a;
            appCompatImageView.setBackground(a.c.b(context2, R.drawable.circle_hollow_light_pink_4dp));
            appCompatImageView.setBackgroundTintList(null);
        }
        int i11 = 0;
        while (true) {
            float f = 1.0f;
            if (i11 >= 7) {
                break;
            }
            int intValue3 = daySpecificDailyGoal.getWeekTrackStatus()[i11].intValue();
            ImageView[] imageViewArr = cVar.f28732x;
            if (intValue3 == 1) {
                ImageView imageView = imageViewArr[i11];
                if (imageView != null) {
                    Context context3 = imageView.getContext();
                    Object obj3 = g0.a.f16164a;
                    imageView.setImageDrawable(a.c.b(context3, R.drawable.ic_round_check));
                    imageView.setBackground(a.c.b(imageView.getContext(), R.drawable.circle));
                    imageView.setBackgroundTintList(g0.a.c(R.color.pro_card_dark_blue, imageView.getContext()));
                    if (cVar.f != 0) {
                        f = 0.1f;
                    }
                    imageView.setAlpha(f);
                }
            } else if (daySpecificDailyGoal.getWeekTrackStatus()[i11].intValue() == 0) {
                ImageView imageView2 = imageViewArr[i11];
                if (imageView2 != null) {
                    imageView2.setImageDrawable(null);
                    Context context4 = imageView2.getContext();
                    Object obj4 = g0.a.f16164a;
                    imageView2.setBackground(a.c.b(context4, R.drawable.circle));
                    imageView2.setBackgroundTintList(g0.a.c(R.color.pro_card_dark_blue, imageView2.getContext()));
                    imageView2.setAlpha(0.1f);
                }
            } else {
                ImageView imageView3 = imageViewArr[i11];
                if (imageView3 != null) {
                    imageView3.setImageDrawable(null);
                    Context context5 = imageView3.getContext();
                    Object obj5 = g0.a.f16164a;
                    imageView3.setBackground(a.c.b(context5, R.drawable.circle_hollow_light_pink_2dp));
                    imageView3.setBackgroundTintList(null);
                    if (cVar.f != 0) {
                        f = 0.1f;
                    }
                    imageView3.setAlpha(f);
                }
            }
            i11++;
        }
        if (cVar.f == 0) {
            appCompatImageView.setAlpha(1.0f);
            robertoTextView.setAlpha(1.0f);
            return;
        }
        appCompatImageView.setAlpha(0.2f);
        robertoTextView.setAlpha(0.2f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (i6 != 0 && i6 != 1) {
            if (i6 != 2) {
                C0485a c0485a = new C0485a(e.h(parent, R.layout.row_goal_alert_pro, parent, false, "from(parent.context).inf…alert_pro, parent, false)"));
                c0485a.f28727u.setOnClickListener(new v0(19, this));
                return c0485a;
            }
            return new b(e.h(parent, R.layout.row_goal_divider_pro, parent, false, "from(parent.context).inf…vider_pro, parent, false)"));
        }
        c cVar = new c(e.h(parent, R.layout.row_goal_pro, parent, false, "from(parent.context).inf…_goal_pro, parent, false)"));
        cVar.f28729u.setOnClickListener(new l1(i6, this, cVar, 28));
        return cVar;
    }
}
