package cm;

import android.app.Application;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.CenterZoomLayoutManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.DebouncedOnClickListener;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fm.r1;
import fm.t1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: V3GoalsRegularFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcm/c0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class c0 extends rr.b {
    public static final /* synthetic */ int J = 0;
    public RecommendedActivityModel B;
    public bm.s C;
    public final androidx.activity.result.c<Intent> H;

    /* renamed from: v  reason: collision with root package name */
    public t1 f5317v;

    /* renamed from: w  reason: collision with root package name */
    public V3GoalsActivity f5318w;

    /* renamed from: x  reason: collision with root package name */
    public bm.o f5319x;

    /* renamed from: z  reason: collision with root package name */
    public CenterZoomLayoutManager f5321z;
    public final LinkedHashMap I = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f5316u = LogHelper.INSTANCE.makeLogTag(c0.class);

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<hs.f<?, ?>> f5320y = new ArrayList<>();
    public ArrayList<RecommendedActivityModel> A = new ArrayList<>();
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public final yn.a G = new yn.a();

    /* compiled from: V3GoalsRegularFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            c0 c0Var = c0.this;
            t1 t1Var = c0Var.f5317v;
            if (t1Var != null) {
                V3GoalsActivity v3GoalsActivity = c0Var.f5318w;
                if (v3GoalsActivity != null) {
                    t1Var.e(v3GoalsActivity.s0());
                    ((RecyclerView) c0Var._$_findCachedViewById(R.id.goalRecyclerView)).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                }
                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                throw null;
            }
            kotlin.jvm.internal.i.q("goalViewModel");
            throw null;
        }
    }

    /* compiled from: V3GoalsRegularFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<ArrayList<RecommendedActivityModel>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(ArrayList<RecommendedActivityModel> arrayList) {
            ArrayList<RecommendedActivityModel> it = arrayList;
            kotlin.jvm.internal.i.f(it, "it");
            c0 c0Var = c0.this;
            c0Var.A = it;
            ((ProgressBar) c0Var._$_findCachedViewById(R.id.pbGoalsRAExperiment)).setVisibility(8);
            ((RobertoButton) c0Var._$_findCachedViewById(R.id.addRAExperimentGoalsButton)).setVisibility(0);
            c0Var.f5321z = new CenterZoomLayoutManager(c0Var.requireActivity(), 0, false, 0.3f, 0.1f, null, 32, null);
            RecyclerView recyclerView = (RecyclerView) c0Var._$_findCachedViewById(R.id.rvRegularGoalRAExperiment);
            CenterZoomLayoutManager centerZoomLayoutManager = c0Var.f5321z;
            if (centerZoomLayoutManager != null) {
                recyclerView.setLayoutManager(centerZoomLayoutManager);
                androidx.fragment.app.p requireActivity = c0Var.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                RecyclerView rvRegularGoalRAExperiment = (RecyclerView) c0Var._$_findCachedViewById(R.id.rvRegularGoalRAExperiment);
                kotlin.jvm.internal.i.f(rvRegularGoalRAExperiment, "rvRegularGoalRAExperiment");
                c0Var.C = new bm.s(requireActivity, it, rvRegularGoalRAExperiment, new d0(c0Var));
                RecyclerView recyclerView2 = (RecyclerView) c0Var._$_findCachedViewById(R.id.rvRegularGoalRAExperiment);
                bm.s sVar = c0Var.C;
                if (sVar != null) {
                    recyclerView2.setAdapter(sVar);
                    ((RecyclerView) c0Var._$_findCachedViewById(R.id.rvRegularGoalRAExperiment)).i(new e0(c0Var));
                    RecyclerView recyclerView3 = (RecyclerView) c0Var._$_findCachedViewById(R.id.rvRegularGoalRAExperiment);
                    if (recyclerView3 != null) {
                        recyclerView3.post(new tl.o(4, c0Var));
                    }
                    return hs.k.f19476a;
                }
                kotlin.jvm.internal.i.q("v3GoalsRAExperimentAdapter");
                throw null;
            }
            kotlin.jvm.internal.i.q("raExperimentRvManager");
            throw null;
        }
    }

    /* compiled from: V3GoalsRegularFragment.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {
        public c() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null) {
                bool2.booleanValue();
                boolean booleanValue = bool2.booleanValue();
                c0 c0Var = c0.this;
                if (booleanValue) {
                    ((ProgressBar) c0Var._$_findCachedViewById(R.id.pbGoalsRAExperiment)).setVisibility(0);
                } else {
                    ((ProgressBar) c0Var._$_findCachedViewById(R.id.pbGoalsRAExperiment)).setVisibility(8);
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: V3GoalsRegularFragment.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.l<Boolean, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<Goal> f5326v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> f5327w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.jvm.internal.x<Goal> xVar, kotlin.jvm.internal.x<com.google.android.material.bottomsheet.f> xVar2) {
            super(1);
            this.f5326v = xVar;
            this.f5327w = xVar2;
        }

        @Override // ss.l
        public final hs.k invoke(Boolean bool) {
            if (bool.booleanValue()) {
                Goal goal = this.f5326v.f23469u;
                kotlin.jvm.internal.i.f(goal, "goal");
                int i6 = c0.J;
                c0.this.O(goal);
            }
            com.google.android.material.bottomsheet.f fVar = this.f5327w.f23469u;
            if (fVar != null) {
                fVar.dismiss();
            }
            return hs.k.f19476a;
        }
    }

    public c0() {
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new am.w(19, this));
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResul…ayDate())\n        }\n    }");
        this.H = registerForActivityResult;
    }

    public final void J() {
        try {
            boolean z10 = true;
            String str = "Edit Goals";
            if (this.f5320y.isEmpty()) {
                V3GoalsActivity v3GoalsActivity = this.f5318w;
                if (v3GoalsActivity != null) {
                    if (v3GoalsActivity.F == 0) {
                        v3GoalsActivity.w0(false);
                    }
                    V3GoalsActivity v3GoalsActivity2 = this.f5318w;
                    if (v3GoalsActivity2 != null) {
                        v3GoalsActivity2.v0("Edit Goals");
                        V3GoalsActivity v3GoalsActivity3 = this.f5318w;
                        if (v3GoalsActivity3 != null) {
                            CardView cardView = (CardView) v3GoalsActivity3.n0(R.id.goalFeedbackLayout);
                            if (cardView == null || cardView.getVisibility() != 0) {
                                z10 = false;
                            }
                            if (!z10) {
                                ((ConstraintLayout) _$_findCachedViewById(R.id.clRegularGoalRAExperiment)).setVisibility(0);
                                M();
                            }
                            ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).setVisibility(8);
                        } else {
                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                    throw null;
                }
            } else {
                V3GoalsActivity v3GoalsActivity4 = this.f5318w;
                if (v3GoalsActivity4 != null) {
                    if (v3GoalsActivity4.F == 0) {
                        v3GoalsActivity4.w0(true);
                    }
                    ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).setVisibility(0);
                    AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.ivEmptyState);
                    if (appCompatImageView != null) {
                        appCompatImageView.setVisibility(8);
                    }
                    RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvEmptyState);
                    if (robertoTextView != null) {
                        robertoTextView.setVisibility(8);
                    }
                    ((RobertoButton) _$_findCachedViewById(R.id.addGoalsButtonMain)).setVisibility(8);
                } else {
                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                    throw null;
                }
            }
            V3GoalsActivity v3GoalsActivity5 = this.f5318w;
            if (v3GoalsActivity5 != null) {
                if (v3GoalsActivity5.f11191z.before(Utils.INSTANCE.getTodayCalendar().getTime())) {
                    RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.tvEmptyState);
                    if (robertoTextView2 != null) {
                        robertoTextView2.setText("You didn't have any goals added for this day.");
                    }
                } else {
                    RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.tvEmptyState);
                    if (robertoTextView3 != null) {
                        robertoTextView3.setText("Goals will be added as you go through your day-wise plan. For now, you can add goals from our list of Recommended Activities!");
                    }
                }
                bm.o oVar = this.f5319x;
                if (oVar != null) {
                    V3GoalsActivity v3GoalsActivity6 = this.f5318w;
                    if (v3GoalsActivity6 != null) {
                        if (oVar.F) {
                            str = "Done";
                        }
                        v3GoalsActivity6.v0(str);
                        return;
                    }
                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                    throw null;
                }
                return;
            }
            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5316u, e10);
        }
    }

    public final void K() {
        try {
            V3GoalsActivity v3GoalsActivity = this.f5318w;
            if (v3GoalsActivity != null) {
                Date s02 = v3GoalsActivity.s0();
                V3GoalsActivity v3GoalsActivity2 = this.f5318w;
                if (v3GoalsActivity2 != null) {
                    this.f5319x = new bm.o(v3GoalsActivity, s02, v3GoalsActivity2, this.f5320y);
                    ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
                    ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).setHasFixedSize(false);
                    ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).setItemAnimator(new androidx.recyclerview.widget.c());
                    ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).setAdapter(this.f5319x);
                    ((RecyclerView) _$_findCachedViewById(R.id.goalRecyclerView)).getViewTreeObserver().addOnGlobalLayoutListener(new a());
                    return;
                }
                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                throw null;
            }
            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5316u, e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r0 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        String str;
        try {
            t1 t1Var = this.f5317v;
            if (t1Var != null) {
                t1Var.B.e(requireActivity(), new tl.m(22, new b()));
                t1 t1Var2 = this.f5317v;
                if (t1Var2 != null) {
                    t1Var2.C.e(requireActivity(), new tl.m(23, new c()));
                    if (this.A.isEmpty()) {
                        User user = FirebasePersistence.getInstance().getUser();
                        if (user != null && (str = user.getCurrentCourseName()) != null) {
                            if (is.k.Q1(str, new String[]{Constants.COURSE_ADHD, Constants.COURSE_OCD, Constants.COURSE_GENERIC})) {
                                str = null;
                            }
                        }
                        str = Constants.COURSE_DEPRESSION;
                        t1 t1Var3 = this.f5317v;
                        if (t1Var3 != null) {
                            ta.v.H(kc.f.H(t1Var3), null, 0, new r1(t1Var3, true, str, null), 3);
                        } else {
                            kotlin.jvm.internal.i.q("goalViewModel");
                            throw null;
                        }
                    } else {
                        t1 t1Var4 = this.f5317v;
                        if (t1Var4 != null) {
                            t1Var4.C.i(Boolean.FALSE);
                        } else {
                            kotlin.jvm.internal.i.q("goalViewModel");
                            throw null;
                        }
                    }
                    ((RobertoButton) _$_findCachedViewById(R.id.addRAExperimentGoalsButton)).setOnClickListener(DebouncedOnClickListener.wrap(new a0(this, 1)));
                    return;
                }
                kotlin.jvm.internal.i.q("goalViewModel");
                throw null;
            }
            kotlin.jvm.internal.i.q("goalViewModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5316u, e10);
        }
    }

    public final void O(Goal goal) {
        try {
            if (goal.getScheduledDate().getTime() == 0) {
                goal.getScheduledDate().setTime(Calendar.getInstance().getTimeInMillis());
            }
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, 9);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar.setTimeInMillis(calendar2.getTimeInMillis());
            TimePickerDialog timePickerDialog = new TimePickerDialog(requireContext(), R.style.myTimePickerTheme, new o(calendar, goal, this, 1), calendar.get(11), calendar.get(12), false);
            LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
            kotlin.jvm.internal.i.f(layoutInflater, "requireActivity().layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.row_text_view_new, (ViewGroup) null);
            ((RobertoTextView) inflate.findViewById(R.id.textViewMain)).setText("Set a time for this activity so we can send you a reminder");
            timePickerDialog.setCustomTitle(inflate);
            timePickerDialog.setButton(-1, "Proceed", timePickerDialog);
            timePickerDialog.show();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5316u, e10);
        }
    }

    public final void P(boolean z10) {
        try {
            if (z10) {
                ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.clGoalsRegularLoadingLayout);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
            } else {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.clGoalsRegularLoadingLayout);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(8);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5316u, e10);
        }
    }

    public final void Q(Date date) {
        try {
            bm.o oVar = this.f5319x;
            if (oVar != null) {
                oVar.B = date;
                Calendar calendar = oVar.f4511z.getWeekOf(date.getTime()).get(0);
                kotlin.jvm.internal.i.f(calendar, "goalHelper.getWeekOf(this.date.time)[0]");
                oVar.A = calendar;
                t1 t1Var = this.f5317v;
                if (t1Var != null) {
                    t1Var.e(date);
                } else {
                    kotlin.jvm.internal.i.q("goalViewModel");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5316u, e10);
        }
    }

    public final void S(Date date) {
        try {
            if (this.f5319x != null) {
                t1 t1Var = this.f5317v;
                if (t1Var != null) {
                    t1Var.e(date);
                } else {
                    kotlin.jvm.internal.i.q("goalViewModel");
                    throw null;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5316u, e10);
        }
    }

    public final void U() {
        try {
            t1 t1Var = this.f5317v;
            if (t1Var != null) {
                V3GoalsActivity v3GoalsActivity = this.f5318w;
                if (v3GoalsActivity != null) {
                    t1Var.e(v3GoalsActivity.s0());
                    K();
                    t1 t1Var2 = this.f5317v;
                    if (t1Var2 != null) {
                        t1Var2.A.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.b0

                            /* renamed from: b  reason: collision with root package name */
                            public final /* synthetic */ c0 f5313b;

                            {
                                this.f5313b = this;
                            }

                            @Override // androidx.lifecycle.x
                            public final void a(Object obj) {
                                int i6 = r2;
                                c0 this$0 = this.f5313b;
                                switch (i6) {
                                    case 0:
                                        ArrayList arrayList = (ArrayList) obj;
                                        int i10 = c0.J;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5320y;
                                        arrayList2.clear();
                                        arrayList2.addAll(arrayList);
                                        this$0.J();
                                        bm.o oVar = this$0.f5319x;
                                        kotlin.jvm.internal.i.d(oVar);
                                        oVar.i();
                                        if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                            V3GoalsActivity v3GoalsActivity2 = this$0.f5318w;
                                            if (v3GoalsActivity2 != null) {
                                                v3GoalsActivity2.y0(true);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                throw null;
                                            }
                                        }
                                        V3GoalsActivity v3GoalsActivity3 = this$0.f5318w;
                                        if (v3GoalsActivity3 != null) {
                                            v3GoalsActivity3.y0(false);
                                            return;
                                        } else {
                                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                            throw null;
                                        }
                                    case 1:
                                        Integer it = (Integer) obj;
                                        int i11 = c0.J;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.o oVar2 = this$0.f5319x;
                                        if (oVar2 != null) {
                                            kotlin.jvm.internal.i.f(it, "it");
                                            oVar2.w(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        Integer it2 = (Integer) obj;
                                        int i12 = c0.J;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.o oVar3 = this$0.f5319x;
                                        if (oVar3 != null) {
                                            kotlin.jvm.internal.i.f(it2, "it");
                                            oVar3.w(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                            return;
                                        }
                                        return;
                                    case 3:
                                        Integer it3 = (Integer) obj;
                                        int i13 = c0.J;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.o oVar4 = this$0.f5319x;
                                        if (oVar4 != null) {
                                            kotlin.jvm.internal.i.f(it3, "it");
                                            oVar4.w(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                            return;
                                        }
                                        return;
                                    case 4:
                                        Integer it4 = (Integer) obj;
                                        int i14 = c0.J;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.o oVar5 = this$0.f5319x;
                                        if (oVar5 != null) {
                                            kotlin.jvm.internal.i.f(it4, "it");
                                            oVar5.x(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                            return;
                                        }
                                        return;
                                    case 5:
                                        Integer it5 = (Integer) obj;
                                        int i15 = c0.J;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.o oVar6 = this$0.f5319x;
                                        if (oVar6 != null) {
                                            kotlin.jvm.internal.i.f(it5, "it");
                                            oVar6.x(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                            return;
                                        }
                                        return;
                                    case 6:
                                        Integer it6 = (Integer) obj;
                                        int i16 = c0.J;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        bm.o oVar7 = this$0.f5319x;
                                        if (oVar7 != null) {
                                            kotlin.jvm.internal.i.f(it6, "it");
                                            oVar7.x(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                            return;
                                        }
                                        return;
                                    case 7:
                                        Integer it7 = (Integer) obj;
                                        int i17 = c0.J;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (it7 == null || it7.intValue() != -1) {
                                            int i18 = this$0.D;
                                            if (it7 == null || it7.intValue() != i18) {
                                                kotlin.jvm.internal.i.f(it7, "it");
                                                this$0.D = it7.intValue();
                                                bm.o oVar8 = this$0.f5319x;
                                                if (oVar8 != null) {
                                                    oVar8.y(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    case 8:
                                        Integer it8 = (Integer) obj;
                                        int i19 = c0.J;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (it8 == null || it8.intValue() != -1) {
                                            int i20 = this$0.E;
                                            if (it8 == null || it8.intValue() != i20) {
                                                kotlin.jvm.internal.i.f(it8, "it");
                                                this$0.E = it8.intValue();
                                                bm.o oVar9 = this$0.f5319x;
                                                if (oVar9 != null) {
                                                    oVar9.y(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    default:
                                        Integer it9 = (Integer) obj;
                                        int i21 = c0.J;
                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                        if (it9 == null || it9.intValue() != -1) {
                                            int i22 = this$0.F;
                                            if (it9 == null || i22 != it9.intValue()) {
                                                kotlin.jvm.internal.i.f(it9, "it");
                                                this$0.F = it9.intValue();
                                                bm.o oVar10 = this$0.f5319x;
                                                if (oVar10 != null) {
                                                    oVar10.y(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        t1 t1Var3 = this.f5317v;
                        if (t1Var3 != null) {
                            t1Var3.H.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.b0

                                /* renamed from: b  reason: collision with root package name */
                                public final /* synthetic */ c0 f5313b;

                                {
                                    this.f5313b = this;
                                }

                                @Override // androidx.lifecycle.x
                                public final void a(Object obj) {
                                    int i6 = r2;
                                    c0 this$0 = this.f5313b;
                                    switch (i6) {
                                        case 0:
                                            ArrayList arrayList = (ArrayList) obj;
                                            int i10 = c0.J;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5320y;
                                            arrayList2.clear();
                                            arrayList2.addAll(arrayList);
                                            this$0.J();
                                            bm.o oVar = this$0.f5319x;
                                            kotlin.jvm.internal.i.d(oVar);
                                            oVar.i();
                                            if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                V3GoalsActivity v3GoalsActivity2 = this$0.f5318w;
                                                if (v3GoalsActivity2 != null) {
                                                    v3GoalsActivity2.y0(true);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                    throw null;
                                                }
                                            }
                                            V3GoalsActivity v3GoalsActivity3 = this$0.f5318w;
                                            if (v3GoalsActivity3 != null) {
                                                v3GoalsActivity3.y0(false);
                                                return;
                                            } else {
                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                throw null;
                                            }
                                        case 1:
                                            Integer it = (Integer) obj;
                                            int i11 = c0.J;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.o oVar2 = this$0.f5319x;
                                            if (oVar2 != null) {
                                                kotlin.jvm.internal.i.f(it, "it");
                                                oVar2.w(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                return;
                                            }
                                            return;
                                        case 2:
                                            Integer it2 = (Integer) obj;
                                            int i12 = c0.J;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.o oVar3 = this$0.f5319x;
                                            if (oVar3 != null) {
                                                kotlin.jvm.internal.i.f(it2, "it");
                                                oVar3.w(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                return;
                                            }
                                            return;
                                        case 3:
                                            Integer it3 = (Integer) obj;
                                            int i13 = c0.J;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.o oVar4 = this$0.f5319x;
                                            if (oVar4 != null) {
                                                kotlin.jvm.internal.i.f(it3, "it");
                                                oVar4.w(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                return;
                                            }
                                            return;
                                        case 4:
                                            Integer it4 = (Integer) obj;
                                            int i14 = c0.J;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.o oVar5 = this$0.f5319x;
                                            if (oVar5 != null) {
                                                kotlin.jvm.internal.i.f(it4, "it");
                                                oVar5.x(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                return;
                                            }
                                            return;
                                        case 5:
                                            Integer it5 = (Integer) obj;
                                            int i15 = c0.J;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.o oVar6 = this$0.f5319x;
                                            if (oVar6 != null) {
                                                kotlin.jvm.internal.i.f(it5, "it");
                                                oVar6.x(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                return;
                                            }
                                            return;
                                        case 6:
                                            Integer it6 = (Integer) obj;
                                            int i16 = c0.J;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            bm.o oVar7 = this$0.f5319x;
                                            if (oVar7 != null) {
                                                kotlin.jvm.internal.i.f(it6, "it");
                                                oVar7.x(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                return;
                                            }
                                            return;
                                        case 7:
                                            Integer it7 = (Integer) obj;
                                            int i17 = c0.J;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (it7 == null || it7.intValue() != -1) {
                                                int i18 = this$0.D;
                                                if (it7 == null || it7.intValue() != i18) {
                                                    kotlin.jvm.internal.i.f(it7, "it");
                                                    this$0.D = it7.intValue();
                                                    bm.o oVar8 = this$0.f5319x;
                                                    if (oVar8 != null) {
                                                        oVar8.y(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        case 8:
                                            Integer it8 = (Integer) obj;
                                            int i19 = c0.J;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (it8 == null || it8.intValue() != -1) {
                                                int i20 = this$0.E;
                                                if (it8 == null || it8.intValue() != i20) {
                                                    kotlin.jvm.internal.i.f(it8, "it");
                                                    this$0.E = it8.intValue();
                                                    bm.o oVar9 = this$0.f5319x;
                                                    if (oVar9 != null) {
                                                        oVar9.y(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        default:
                                            Integer it9 = (Integer) obj;
                                            int i21 = c0.J;
                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                            if (it9 == null || it9.intValue() != -1) {
                                                int i22 = this$0.F;
                                                if (it9 == null || i22 != it9.intValue()) {
                                                    kotlin.jvm.internal.i.f(it9, "it");
                                                    this$0.F = it9.intValue();
                                                    bm.o oVar10 = this$0.f5319x;
                                                    if (oVar10 != null) {
                                                        oVar10.y(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            t1 t1Var4 = this.f5317v;
                            if (t1Var4 != null) {
                                t1Var4.I.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.b0

                                    /* renamed from: b  reason: collision with root package name */
                                    public final /* synthetic */ c0 f5313b;

                                    {
                                        this.f5313b = this;
                                    }

                                    @Override // androidx.lifecycle.x
                                    public final void a(Object obj) {
                                        int i6 = r2;
                                        c0 this$0 = this.f5313b;
                                        switch (i6) {
                                            case 0:
                                                ArrayList arrayList = (ArrayList) obj;
                                                int i10 = c0.J;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5320y;
                                                arrayList2.clear();
                                                arrayList2.addAll(arrayList);
                                                this$0.J();
                                                bm.o oVar = this$0.f5319x;
                                                kotlin.jvm.internal.i.d(oVar);
                                                oVar.i();
                                                if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                    V3GoalsActivity v3GoalsActivity2 = this$0.f5318w;
                                                    if (v3GoalsActivity2 != null) {
                                                        v3GoalsActivity2.y0(true);
                                                        return;
                                                    } else {
                                                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                        throw null;
                                                    }
                                                }
                                                V3GoalsActivity v3GoalsActivity3 = this$0.f5318w;
                                                if (v3GoalsActivity3 != null) {
                                                    v3GoalsActivity3.y0(false);
                                                    return;
                                                } else {
                                                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                    throw null;
                                                }
                                            case 1:
                                                Integer it = (Integer) obj;
                                                int i11 = c0.J;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.o oVar2 = this$0.f5319x;
                                                if (oVar2 != null) {
                                                    kotlin.jvm.internal.i.f(it, "it");
                                                    oVar2.w(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                    return;
                                                }
                                                return;
                                            case 2:
                                                Integer it2 = (Integer) obj;
                                                int i12 = c0.J;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.o oVar3 = this$0.f5319x;
                                                if (oVar3 != null) {
                                                    kotlin.jvm.internal.i.f(it2, "it");
                                                    oVar3.w(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                    return;
                                                }
                                                return;
                                            case 3:
                                                Integer it3 = (Integer) obj;
                                                int i13 = c0.J;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.o oVar4 = this$0.f5319x;
                                                if (oVar4 != null) {
                                                    kotlin.jvm.internal.i.f(it3, "it");
                                                    oVar4.w(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                    return;
                                                }
                                                return;
                                            case 4:
                                                Integer it4 = (Integer) obj;
                                                int i14 = c0.J;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.o oVar5 = this$0.f5319x;
                                                if (oVar5 != null) {
                                                    kotlin.jvm.internal.i.f(it4, "it");
                                                    oVar5.x(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                    return;
                                                }
                                                return;
                                            case 5:
                                                Integer it5 = (Integer) obj;
                                                int i15 = c0.J;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.o oVar6 = this$0.f5319x;
                                                if (oVar6 != null) {
                                                    kotlin.jvm.internal.i.f(it5, "it");
                                                    oVar6.x(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                    return;
                                                }
                                                return;
                                            case 6:
                                                Integer it6 = (Integer) obj;
                                                int i16 = c0.J;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                bm.o oVar7 = this$0.f5319x;
                                                if (oVar7 != null) {
                                                    kotlin.jvm.internal.i.f(it6, "it");
                                                    oVar7.x(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                    return;
                                                }
                                                return;
                                            case 7:
                                                Integer it7 = (Integer) obj;
                                                int i17 = c0.J;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (it7 == null || it7.intValue() != -1) {
                                                    int i18 = this$0.D;
                                                    if (it7 == null || it7.intValue() != i18) {
                                                        kotlin.jvm.internal.i.f(it7, "it");
                                                        this$0.D = it7.intValue();
                                                        bm.o oVar8 = this$0.f5319x;
                                                        if (oVar8 != null) {
                                                            oVar8.y(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            case 8:
                                                Integer it8 = (Integer) obj;
                                                int i19 = c0.J;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (it8 == null || it8.intValue() != -1) {
                                                    int i20 = this$0.E;
                                                    if (it8 == null || it8.intValue() != i20) {
                                                        kotlin.jvm.internal.i.f(it8, "it");
                                                        this$0.E = it8.intValue();
                                                        bm.o oVar9 = this$0.f5319x;
                                                        if (oVar9 != null) {
                                                            oVar9.y(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            default:
                                                Integer it9 = (Integer) obj;
                                                int i21 = c0.J;
                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                if (it9 == null || it9.intValue() != -1) {
                                                    int i22 = this$0.F;
                                                    if (it9 == null || i22 != it9.intValue()) {
                                                        kotlin.jvm.internal.i.f(it9, "it");
                                                        this$0.F = it9.intValue();
                                                        bm.o oVar10 = this$0.f5319x;
                                                        if (oVar10 != null) {
                                                            oVar10.y(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                        }
                                    }
                                });
                                t1 t1Var5 = this.f5317v;
                                if (t1Var5 != null) {
                                    t1Var5.J.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.b0

                                        /* renamed from: b  reason: collision with root package name */
                                        public final /* synthetic */ c0 f5313b;

                                        {
                                            this.f5313b = this;
                                        }

                                        @Override // androidx.lifecycle.x
                                        public final void a(Object obj) {
                                            int i6 = r2;
                                            c0 this$0 = this.f5313b;
                                            switch (i6) {
                                                case 0:
                                                    ArrayList arrayList = (ArrayList) obj;
                                                    int i10 = c0.J;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5320y;
                                                    arrayList2.clear();
                                                    arrayList2.addAll(arrayList);
                                                    this$0.J();
                                                    bm.o oVar = this$0.f5319x;
                                                    kotlin.jvm.internal.i.d(oVar);
                                                    oVar.i();
                                                    if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                        V3GoalsActivity v3GoalsActivity2 = this$0.f5318w;
                                                        if (v3GoalsActivity2 != null) {
                                                            v3GoalsActivity2.y0(true);
                                                            return;
                                                        } else {
                                                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                            throw null;
                                                        }
                                                    }
                                                    V3GoalsActivity v3GoalsActivity3 = this$0.f5318w;
                                                    if (v3GoalsActivity3 != null) {
                                                        v3GoalsActivity3.y0(false);
                                                        return;
                                                    } else {
                                                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                        throw null;
                                                    }
                                                case 1:
                                                    Integer it = (Integer) obj;
                                                    int i11 = c0.J;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.o oVar2 = this$0.f5319x;
                                                    if (oVar2 != null) {
                                                        kotlin.jvm.internal.i.f(it, "it");
                                                        oVar2.w(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                        return;
                                                    }
                                                    return;
                                                case 2:
                                                    Integer it2 = (Integer) obj;
                                                    int i12 = c0.J;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.o oVar3 = this$0.f5319x;
                                                    if (oVar3 != null) {
                                                        kotlin.jvm.internal.i.f(it2, "it");
                                                        oVar3.w(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                        return;
                                                    }
                                                    return;
                                                case 3:
                                                    Integer it3 = (Integer) obj;
                                                    int i13 = c0.J;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.o oVar4 = this$0.f5319x;
                                                    if (oVar4 != null) {
                                                        kotlin.jvm.internal.i.f(it3, "it");
                                                        oVar4.w(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                        return;
                                                    }
                                                    return;
                                                case 4:
                                                    Integer it4 = (Integer) obj;
                                                    int i14 = c0.J;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.o oVar5 = this$0.f5319x;
                                                    if (oVar5 != null) {
                                                        kotlin.jvm.internal.i.f(it4, "it");
                                                        oVar5.x(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                        return;
                                                    }
                                                    return;
                                                case 5:
                                                    Integer it5 = (Integer) obj;
                                                    int i15 = c0.J;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.o oVar6 = this$0.f5319x;
                                                    if (oVar6 != null) {
                                                        kotlin.jvm.internal.i.f(it5, "it");
                                                        oVar6.x(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                        return;
                                                    }
                                                    return;
                                                case 6:
                                                    Integer it6 = (Integer) obj;
                                                    int i16 = c0.J;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    bm.o oVar7 = this$0.f5319x;
                                                    if (oVar7 != null) {
                                                        kotlin.jvm.internal.i.f(it6, "it");
                                                        oVar7.x(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                        return;
                                                    }
                                                    return;
                                                case 7:
                                                    Integer it7 = (Integer) obj;
                                                    int i17 = c0.J;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    if (it7 == null || it7.intValue() != -1) {
                                                        int i18 = this$0.D;
                                                        if (it7 == null || it7.intValue() != i18) {
                                                            kotlin.jvm.internal.i.f(it7, "it");
                                                            this$0.D = it7.intValue();
                                                            bm.o oVar8 = this$0.f5319x;
                                                            if (oVar8 != null) {
                                                                oVar8.y(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                case 8:
                                                    Integer it8 = (Integer) obj;
                                                    int i19 = c0.J;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    if (it8 == null || it8.intValue() != -1) {
                                                        int i20 = this$0.E;
                                                        if (it8 == null || it8.intValue() != i20) {
                                                            kotlin.jvm.internal.i.f(it8, "it");
                                                            this$0.E = it8.intValue();
                                                            bm.o oVar9 = this$0.f5319x;
                                                            if (oVar9 != null) {
                                                                oVar9.y(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    Integer it9 = (Integer) obj;
                                                    int i21 = c0.J;
                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                    if (it9 == null || it9.intValue() != -1) {
                                                        int i22 = this$0.F;
                                                        if (it9 == null || i22 != it9.intValue()) {
                                                            kotlin.jvm.internal.i.f(it9, "it");
                                                            this$0.F = it9.intValue();
                                                            bm.o oVar10 = this$0.f5319x;
                                                            if (oVar10 != null) {
                                                                oVar10.y(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                    t1 t1Var6 = this.f5317v;
                                    if (t1Var6 != null) {
                                        t1Var6.K.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.b0

                                            /* renamed from: b  reason: collision with root package name */
                                            public final /* synthetic */ c0 f5313b;

                                            {
                                                this.f5313b = this;
                                            }

                                            @Override // androidx.lifecycle.x
                                            public final void a(Object obj) {
                                                int i6 = r2;
                                                c0 this$0 = this.f5313b;
                                                switch (i6) {
                                                    case 0:
                                                        ArrayList arrayList = (ArrayList) obj;
                                                        int i10 = c0.J;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5320y;
                                                        arrayList2.clear();
                                                        arrayList2.addAll(arrayList);
                                                        this$0.J();
                                                        bm.o oVar = this$0.f5319x;
                                                        kotlin.jvm.internal.i.d(oVar);
                                                        oVar.i();
                                                        if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                            V3GoalsActivity v3GoalsActivity2 = this$0.f5318w;
                                                            if (v3GoalsActivity2 != null) {
                                                                v3GoalsActivity2.y0(true);
                                                                return;
                                                            } else {
                                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                throw null;
                                                            }
                                                        }
                                                        V3GoalsActivity v3GoalsActivity3 = this$0.f5318w;
                                                        if (v3GoalsActivity3 != null) {
                                                            v3GoalsActivity3.y0(false);
                                                            return;
                                                        } else {
                                                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                            throw null;
                                                        }
                                                    case 1:
                                                        Integer it = (Integer) obj;
                                                        int i11 = c0.J;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.o oVar2 = this$0.f5319x;
                                                        if (oVar2 != null) {
                                                            kotlin.jvm.internal.i.f(it, "it");
                                                            oVar2.w(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                            return;
                                                        }
                                                        return;
                                                    case 2:
                                                        Integer it2 = (Integer) obj;
                                                        int i12 = c0.J;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.o oVar3 = this$0.f5319x;
                                                        if (oVar3 != null) {
                                                            kotlin.jvm.internal.i.f(it2, "it");
                                                            oVar3.w(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                            return;
                                                        }
                                                        return;
                                                    case 3:
                                                        Integer it3 = (Integer) obj;
                                                        int i13 = c0.J;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.o oVar4 = this$0.f5319x;
                                                        if (oVar4 != null) {
                                                            kotlin.jvm.internal.i.f(it3, "it");
                                                            oVar4.w(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                            return;
                                                        }
                                                        return;
                                                    case 4:
                                                        Integer it4 = (Integer) obj;
                                                        int i14 = c0.J;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.o oVar5 = this$0.f5319x;
                                                        if (oVar5 != null) {
                                                            kotlin.jvm.internal.i.f(it4, "it");
                                                            oVar5.x(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                            return;
                                                        }
                                                        return;
                                                    case 5:
                                                        Integer it5 = (Integer) obj;
                                                        int i15 = c0.J;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.o oVar6 = this$0.f5319x;
                                                        if (oVar6 != null) {
                                                            kotlin.jvm.internal.i.f(it5, "it");
                                                            oVar6.x(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                            return;
                                                        }
                                                        return;
                                                    case 6:
                                                        Integer it6 = (Integer) obj;
                                                        int i16 = c0.J;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        bm.o oVar7 = this$0.f5319x;
                                                        if (oVar7 != null) {
                                                            kotlin.jvm.internal.i.f(it6, "it");
                                                            oVar7.x(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                            return;
                                                        }
                                                        return;
                                                    case 7:
                                                        Integer it7 = (Integer) obj;
                                                        int i17 = c0.J;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (it7 == null || it7.intValue() != -1) {
                                                            int i18 = this$0.D;
                                                            if (it7 == null || it7.intValue() != i18) {
                                                                kotlin.jvm.internal.i.f(it7, "it");
                                                                this$0.D = it7.intValue();
                                                                bm.o oVar8 = this$0.f5319x;
                                                                if (oVar8 != null) {
                                                                    oVar8.y(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    case 8:
                                                        Integer it8 = (Integer) obj;
                                                        int i19 = c0.J;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (it8 == null || it8.intValue() != -1) {
                                                            int i20 = this$0.E;
                                                            if (it8 == null || it8.intValue() != i20) {
                                                                kotlin.jvm.internal.i.f(it8, "it");
                                                                this$0.E = it8.intValue();
                                                                bm.o oVar9 = this$0.f5319x;
                                                                if (oVar9 != null) {
                                                                    oVar9.y(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        Integer it9 = (Integer) obj;
                                                        int i21 = c0.J;
                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                        if (it9 == null || it9.intValue() != -1) {
                                                            int i22 = this$0.F;
                                                            if (it9 == null || i22 != it9.intValue()) {
                                                                kotlin.jvm.internal.i.f(it9, "it");
                                                                this$0.F = it9.intValue();
                                                                bm.o oVar10 = this$0.f5319x;
                                                                if (oVar10 != null) {
                                                                    oVar10.y(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        t1 t1Var7 = this.f5317v;
                                        if (t1Var7 != null) {
                                            t1Var7.L.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.b0

                                                /* renamed from: b  reason: collision with root package name */
                                                public final /* synthetic */ c0 f5313b;

                                                {
                                                    this.f5313b = this;
                                                }

                                                @Override // androidx.lifecycle.x
                                                public final void a(Object obj) {
                                                    int i6 = r2;
                                                    c0 this$0 = this.f5313b;
                                                    switch (i6) {
                                                        case 0:
                                                            ArrayList arrayList = (ArrayList) obj;
                                                            int i10 = c0.J;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5320y;
                                                            arrayList2.clear();
                                                            arrayList2.addAll(arrayList);
                                                            this$0.J();
                                                            bm.o oVar = this$0.f5319x;
                                                            kotlin.jvm.internal.i.d(oVar);
                                                            oVar.i();
                                                            if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                                V3GoalsActivity v3GoalsActivity2 = this$0.f5318w;
                                                                if (v3GoalsActivity2 != null) {
                                                                    v3GoalsActivity2.y0(true);
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                    throw null;
                                                                }
                                                            }
                                                            V3GoalsActivity v3GoalsActivity3 = this$0.f5318w;
                                                            if (v3GoalsActivity3 != null) {
                                                                v3GoalsActivity3.y0(false);
                                                                return;
                                                            } else {
                                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                throw null;
                                                            }
                                                        case 1:
                                                            Integer it = (Integer) obj;
                                                            int i11 = c0.J;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.o oVar2 = this$0.f5319x;
                                                            if (oVar2 != null) {
                                                                kotlin.jvm.internal.i.f(it, "it");
                                                                oVar2.w(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                return;
                                                            }
                                                            return;
                                                        case 2:
                                                            Integer it2 = (Integer) obj;
                                                            int i12 = c0.J;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.o oVar3 = this$0.f5319x;
                                                            if (oVar3 != null) {
                                                                kotlin.jvm.internal.i.f(it2, "it");
                                                                oVar3.w(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                return;
                                                            }
                                                            return;
                                                        case 3:
                                                            Integer it3 = (Integer) obj;
                                                            int i13 = c0.J;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.o oVar4 = this$0.f5319x;
                                                            if (oVar4 != null) {
                                                                kotlin.jvm.internal.i.f(it3, "it");
                                                                oVar4.w(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                return;
                                                            }
                                                            return;
                                                        case 4:
                                                            Integer it4 = (Integer) obj;
                                                            int i14 = c0.J;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.o oVar5 = this$0.f5319x;
                                                            if (oVar5 != null) {
                                                                kotlin.jvm.internal.i.f(it4, "it");
                                                                oVar5.x(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                return;
                                                            }
                                                            return;
                                                        case 5:
                                                            Integer it5 = (Integer) obj;
                                                            int i15 = c0.J;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.o oVar6 = this$0.f5319x;
                                                            if (oVar6 != null) {
                                                                kotlin.jvm.internal.i.f(it5, "it");
                                                                oVar6.x(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                return;
                                                            }
                                                            return;
                                                        case 6:
                                                            Integer it6 = (Integer) obj;
                                                            int i16 = c0.J;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            bm.o oVar7 = this$0.f5319x;
                                                            if (oVar7 != null) {
                                                                kotlin.jvm.internal.i.f(it6, "it");
                                                                oVar7.x(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                return;
                                                            }
                                                            return;
                                                        case 7:
                                                            Integer it7 = (Integer) obj;
                                                            int i17 = c0.J;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            if (it7 == null || it7.intValue() != -1) {
                                                                int i18 = this$0.D;
                                                                if (it7 == null || it7.intValue() != i18) {
                                                                    kotlin.jvm.internal.i.f(it7, "it");
                                                                    this$0.D = it7.intValue();
                                                                    bm.o oVar8 = this$0.f5319x;
                                                                    if (oVar8 != null) {
                                                                        oVar8.y(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        case 8:
                                                            Integer it8 = (Integer) obj;
                                                            int i19 = c0.J;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            if (it8 == null || it8.intValue() != -1) {
                                                                int i20 = this$0.E;
                                                                if (it8 == null || it8.intValue() != i20) {
                                                                    kotlin.jvm.internal.i.f(it8, "it");
                                                                    this$0.E = it8.intValue();
                                                                    bm.o oVar9 = this$0.f5319x;
                                                                    if (oVar9 != null) {
                                                                        oVar9.y(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            Integer it9 = (Integer) obj;
                                                            int i21 = c0.J;
                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                            if (it9 == null || it9.intValue() != -1) {
                                                                int i22 = this$0.F;
                                                                if (it9 == null || i22 != it9.intValue()) {
                                                                    kotlin.jvm.internal.i.f(it9, "it");
                                                                    this$0.F = it9.intValue();
                                                                    bm.o oVar10 = this$0.f5319x;
                                                                    if (oVar10 != null) {
                                                                        oVar10.y(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            t1 t1Var8 = this.f5317v;
                                            if (t1Var8 != null) {
                                                t1Var8.M.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.b0

                                                    /* renamed from: b  reason: collision with root package name */
                                                    public final /* synthetic */ c0 f5313b;

                                                    {
                                                        this.f5313b = this;
                                                    }

                                                    @Override // androidx.lifecycle.x
                                                    public final void a(Object obj) {
                                                        int i6 = r2;
                                                        c0 this$0 = this.f5313b;
                                                        switch (i6) {
                                                            case 0:
                                                                ArrayList arrayList = (ArrayList) obj;
                                                                int i10 = c0.J;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5320y;
                                                                arrayList2.clear();
                                                                arrayList2.addAll(arrayList);
                                                                this$0.J();
                                                                bm.o oVar = this$0.f5319x;
                                                                kotlin.jvm.internal.i.d(oVar);
                                                                oVar.i();
                                                                if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                                    V3GoalsActivity v3GoalsActivity2 = this$0.f5318w;
                                                                    if (v3GoalsActivity2 != null) {
                                                                        v3GoalsActivity2.y0(true);
                                                                        return;
                                                                    } else {
                                                                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                        throw null;
                                                                    }
                                                                }
                                                                V3GoalsActivity v3GoalsActivity3 = this$0.f5318w;
                                                                if (v3GoalsActivity3 != null) {
                                                                    v3GoalsActivity3.y0(false);
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                    throw null;
                                                                }
                                                            case 1:
                                                                Integer it = (Integer) obj;
                                                                int i11 = c0.J;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.o oVar2 = this$0.f5319x;
                                                                if (oVar2 != null) {
                                                                    kotlin.jvm.internal.i.f(it, "it");
                                                                    oVar2.w(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                    return;
                                                                }
                                                                return;
                                                            case 2:
                                                                Integer it2 = (Integer) obj;
                                                                int i12 = c0.J;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.o oVar3 = this$0.f5319x;
                                                                if (oVar3 != null) {
                                                                    kotlin.jvm.internal.i.f(it2, "it");
                                                                    oVar3.w(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                    return;
                                                                }
                                                                return;
                                                            case 3:
                                                                Integer it3 = (Integer) obj;
                                                                int i13 = c0.J;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.o oVar4 = this$0.f5319x;
                                                                if (oVar4 != null) {
                                                                    kotlin.jvm.internal.i.f(it3, "it");
                                                                    oVar4.w(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                    return;
                                                                }
                                                                return;
                                                            case 4:
                                                                Integer it4 = (Integer) obj;
                                                                int i14 = c0.J;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.o oVar5 = this$0.f5319x;
                                                                if (oVar5 != null) {
                                                                    kotlin.jvm.internal.i.f(it4, "it");
                                                                    oVar5.x(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                    return;
                                                                }
                                                                return;
                                                            case 5:
                                                                Integer it5 = (Integer) obj;
                                                                int i15 = c0.J;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.o oVar6 = this$0.f5319x;
                                                                if (oVar6 != null) {
                                                                    kotlin.jvm.internal.i.f(it5, "it");
                                                                    oVar6.x(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                    return;
                                                                }
                                                                return;
                                                            case 6:
                                                                Integer it6 = (Integer) obj;
                                                                int i16 = c0.J;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                bm.o oVar7 = this$0.f5319x;
                                                                if (oVar7 != null) {
                                                                    kotlin.jvm.internal.i.f(it6, "it");
                                                                    oVar7.x(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                    return;
                                                                }
                                                                return;
                                                            case 7:
                                                                Integer it7 = (Integer) obj;
                                                                int i17 = c0.J;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                if (it7 == null || it7.intValue() != -1) {
                                                                    int i18 = this$0.D;
                                                                    if (it7 == null || it7.intValue() != i18) {
                                                                        kotlin.jvm.internal.i.f(it7, "it");
                                                                        this$0.D = it7.intValue();
                                                                        bm.o oVar8 = this$0.f5319x;
                                                                        if (oVar8 != null) {
                                                                            oVar8.y(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            case 8:
                                                                Integer it8 = (Integer) obj;
                                                                int i19 = c0.J;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                if (it8 == null || it8.intValue() != -1) {
                                                                    int i20 = this$0.E;
                                                                    if (it8 == null || it8.intValue() != i20) {
                                                                        kotlin.jvm.internal.i.f(it8, "it");
                                                                        this$0.E = it8.intValue();
                                                                        bm.o oVar9 = this$0.f5319x;
                                                                        if (oVar9 != null) {
                                                                            oVar9.y(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                Integer it9 = (Integer) obj;
                                                                int i21 = c0.J;
                                                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                if (it9 == null || it9.intValue() != -1) {
                                                                    int i22 = this$0.F;
                                                                    if (it9 == null || i22 != it9.intValue()) {
                                                                        kotlin.jvm.internal.i.f(it9, "it");
                                                                        this$0.F = it9.intValue();
                                                                        bm.o oVar10 = this$0.f5319x;
                                                                        if (oVar10 != null) {
                                                                            oVar10.y(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                t1 t1Var9 = this.f5317v;
                                                if (t1Var9 != null) {
                                                    t1Var9.E.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.b0

                                                        /* renamed from: b  reason: collision with root package name */
                                                        public final /* synthetic */ c0 f5313b;

                                                        {
                                                            this.f5313b = this;
                                                        }

                                                        @Override // androidx.lifecycle.x
                                                        public final void a(Object obj) {
                                                            int i6 = r2;
                                                            c0 this$0 = this.f5313b;
                                                            switch (i6) {
                                                                case 0:
                                                                    ArrayList arrayList = (ArrayList) obj;
                                                                    int i10 = c0.J;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5320y;
                                                                    arrayList2.clear();
                                                                    arrayList2.addAll(arrayList);
                                                                    this$0.J();
                                                                    bm.o oVar = this$0.f5319x;
                                                                    kotlin.jvm.internal.i.d(oVar);
                                                                    oVar.i();
                                                                    if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                                        V3GoalsActivity v3GoalsActivity2 = this$0.f5318w;
                                                                        if (v3GoalsActivity2 != null) {
                                                                            v3GoalsActivity2.y0(true);
                                                                            return;
                                                                        } else {
                                                                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                            throw null;
                                                                        }
                                                                    }
                                                                    V3GoalsActivity v3GoalsActivity3 = this$0.f5318w;
                                                                    if (v3GoalsActivity3 != null) {
                                                                        v3GoalsActivity3.y0(false);
                                                                        return;
                                                                    } else {
                                                                        kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                        throw null;
                                                                    }
                                                                case 1:
                                                                    Integer it = (Integer) obj;
                                                                    int i11 = c0.J;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.o oVar2 = this$0.f5319x;
                                                                    if (oVar2 != null) {
                                                                        kotlin.jvm.internal.i.f(it, "it");
                                                                        oVar2.w(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 2:
                                                                    Integer it2 = (Integer) obj;
                                                                    int i12 = c0.J;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.o oVar3 = this$0.f5319x;
                                                                    if (oVar3 != null) {
                                                                        kotlin.jvm.internal.i.f(it2, "it");
                                                                        oVar3.w(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 3:
                                                                    Integer it3 = (Integer) obj;
                                                                    int i13 = c0.J;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.o oVar4 = this$0.f5319x;
                                                                    if (oVar4 != null) {
                                                                        kotlin.jvm.internal.i.f(it3, "it");
                                                                        oVar4.w(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 4:
                                                                    Integer it4 = (Integer) obj;
                                                                    int i14 = c0.J;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.o oVar5 = this$0.f5319x;
                                                                    if (oVar5 != null) {
                                                                        kotlin.jvm.internal.i.f(it4, "it");
                                                                        oVar5.x(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 5:
                                                                    Integer it5 = (Integer) obj;
                                                                    int i15 = c0.J;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.o oVar6 = this$0.f5319x;
                                                                    if (oVar6 != null) {
                                                                        kotlin.jvm.internal.i.f(it5, "it");
                                                                        oVar6.x(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 6:
                                                                    Integer it6 = (Integer) obj;
                                                                    int i16 = c0.J;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    bm.o oVar7 = this$0.f5319x;
                                                                    if (oVar7 != null) {
                                                                        kotlin.jvm.internal.i.f(it6, "it");
                                                                        oVar7.x(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 7:
                                                                    Integer it7 = (Integer) obj;
                                                                    int i17 = c0.J;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    if (it7 == null || it7.intValue() != -1) {
                                                                        int i18 = this$0.D;
                                                                        if (it7 == null || it7.intValue() != i18) {
                                                                            kotlin.jvm.internal.i.f(it7, "it");
                                                                            this$0.D = it7.intValue();
                                                                            bm.o oVar8 = this$0.f5319x;
                                                                            if (oVar8 != null) {
                                                                                oVar8.y(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                case 8:
                                                                    Integer it8 = (Integer) obj;
                                                                    int i19 = c0.J;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    if (it8 == null || it8.intValue() != -1) {
                                                                        int i20 = this$0.E;
                                                                        if (it8 == null || it8.intValue() != i20) {
                                                                            kotlin.jvm.internal.i.f(it8, "it");
                                                                            this$0.E = it8.intValue();
                                                                            bm.o oVar9 = this$0.f5319x;
                                                                            if (oVar9 != null) {
                                                                                oVar9.y(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                                default:
                                                                    Integer it9 = (Integer) obj;
                                                                    int i21 = c0.J;
                                                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                    if (it9 == null || it9.intValue() != -1) {
                                                                        int i22 = this$0.F;
                                                                        if (it9 == null || i22 != it9.intValue()) {
                                                                            kotlin.jvm.internal.i.f(it9, "it");
                                                                            this$0.F = it9.intValue();
                                                                            bm.o oVar10 = this$0.f5319x;
                                                                            if (oVar10 != null) {
                                                                                oVar10.y(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    return;
                                                            }
                                                        }
                                                    });
                                                    t1 t1Var10 = this.f5317v;
                                                    if (t1Var10 != null) {
                                                        t1Var10.F.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.b0

                                                            /* renamed from: b  reason: collision with root package name */
                                                            public final /* synthetic */ c0 f5313b;

                                                            {
                                                                this.f5313b = this;
                                                            }

                                                            @Override // androidx.lifecycle.x
                                                            public final void a(Object obj) {
                                                                int i6 = r2;
                                                                c0 this$0 = this.f5313b;
                                                                switch (i6) {
                                                                    case 0:
                                                                        ArrayList arrayList = (ArrayList) obj;
                                                                        int i10 = c0.J;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5320y;
                                                                        arrayList2.clear();
                                                                        arrayList2.addAll(arrayList);
                                                                        this$0.J();
                                                                        bm.o oVar = this$0.f5319x;
                                                                        kotlin.jvm.internal.i.d(oVar);
                                                                        oVar.i();
                                                                        if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                                            V3GoalsActivity v3GoalsActivity2 = this$0.f5318w;
                                                                            if (v3GoalsActivity2 != null) {
                                                                                v3GoalsActivity2.y0(true);
                                                                                return;
                                                                            } else {
                                                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                                throw null;
                                                                            }
                                                                        }
                                                                        V3GoalsActivity v3GoalsActivity3 = this$0.f5318w;
                                                                        if (v3GoalsActivity3 != null) {
                                                                            v3GoalsActivity3.y0(false);
                                                                            return;
                                                                        } else {
                                                                            kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                            throw null;
                                                                        }
                                                                    case 1:
                                                                        Integer it = (Integer) obj;
                                                                        int i11 = c0.J;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        bm.o oVar2 = this$0.f5319x;
                                                                        if (oVar2 != null) {
                                                                            kotlin.jvm.internal.i.f(it, "it");
                                                                            oVar2.w(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 2:
                                                                        Integer it2 = (Integer) obj;
                                                                        int i12 = c0.J;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        bm.o oVar3 = this$0.f5319x;
                                                                        if (oVar3 != null) {
                                                                            kotlin.jvm.internal.i.f(it2, "it");
                                                                            oVar3.w(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 3:
                                                                        Integer it3 = (Integer) obj;
                                                                        int i13 = c0.J;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        bm.o oVar4 = this$0.f5319x;
                                                                        if (oVar4 != null) {
                                                                            kotlin.jvm.internal.i.f(it3, "it");
                                                                            oVar4.w(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 4:
                                                                        Integer it4 = (Integer) obj;
                                                                        int i14 = c0.J;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        bm.o oVar5 = this$0.f5319x;
                                                                        if (oVar5 != null) {
                                                                            kotlin.jvm.internal.i.f(it4, "it");
                                                                            oVar5.x(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 5:
                                                                        Integer it5 = (Integer) obj;
                                                                        int i15 = c0.J;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        bm.o oVar6 = this$0.f5319x;
                                                                        if (oVar6 != null) {
                                                                            kotlin.jvm.internal.i.f(it5, "it");
                                                                            oVar6.x(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 6:
                                                                        Integer it6 = (Integer) obj;
                                                                        int i16 = c0.J;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        bm.o oVar7 = this$0.f5319x;
                                                                        if (oVar7 != null) {
                                                                            kotlin.jvm.internal.i.f(it6, "it");
                                                                            oVar7.x(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 7:
                                                                        Integer it7 = (Integer) obj;
                                                                        int i17 = c0.J;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        if (it7 == null || it7.intValue() != -1) {
                                                                            int i18 = this$0.D;
                                                                            if (it7 == null || it7.intValue() != i18) {
                                                                                kotlin.jvm.internal.i.f(it7, "it");
                                                                                this$0.D = it7.intValue();
                                                                                bm.o oVar8 = this$0.f5319x;
                                                                                if (oVar8 != null) {
                                                                                    oVar8.y(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    case 8:
                                                                        Integer it8 = (Integer) obj;
                                                                        int i19 = c0.J;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        if (it8 == null || it8.intValue() != -1) {
                                                                            int i20 = this$0.E;
                                                                            if (it8 == null || it8.intValue() != i20) {
                                                                                kotlin.jvm.internal.i.f(it8, "it");
                                                                                this$0.E = it8.intValue();
                                                                                bm.o oVar9 = this$0.f5319x;
                                                                                if (oVar9 != null) {
                                                                                    oVar9.y(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                    default:
                                                                        Integer it9 = (Integer) obj;
                                                                        int i21 = c0.J;
                                                                        kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                        if (it9 == null || it9.intValue() != -1) {
                                                                            int i22 = this$0.F;
                                                                            if (it9 == null || i22 != it9.intValue()) {
                                                                                kotlin.jvm.internal.i.f(it9, "it");
                                                                                this$0.F = it9.intValue();
                                                                                bm.o oVar10 = this$0.f5319x;
                                                                                if (oVar10 != null) {
                                                                                    oVar10.y(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        return;
                                                                }
                                                            }
                                                        });
                                                        t1 t1Var11 = this.f5317v;
                                                        if (t1Var11 != null) {
                                                            t1Var11.G.e(getViewLifecycleOwner(), new androidx.lifecycle.x(this) { // from class: cm.b0

                                                                /* renamed from: b  reason: collision with root package name */
                                                                public final /* synthetic */ c0 f5313b;

                                                                {
                                                                    this.f5313b = this;
                                                                }

                                                                @Override // androidx.lifecycle.x
                                                                public final void a(Object obj) {
                                                                    int i6 = r2;
                                                                    c0 this$0 = this.f5313b;
                                                                    switch (i6) {
                                                                        case 0:
                                                                            ArrayList arrayList = (ArrayList) obj;
                                                                            int i10 = c0.J;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            ArrayList<hs.f<?, ?>> arrayList2 = this$0.f5320y;
                                                                            arrayList2.clear();
                                                                            arrayList2.addAll(arrayList);
                                                                            this$0.J();
                                                                            bm.o oVar = this$0.f5319x;
                                                                            kotlin.jvm.internal.i.d(oVar);
                                                                            oVar.i();
                                                                            if (arrayList.size() > 0 && !ApplicationPersistence.getInstance().getBooleanValue("clickable_goal_info", false)) {
                                                                                V3GoalsActivity v3GoalsActivity2 = this$0.f5318w;
                                                                                if (v3GoalsActivity2 != null) {
                                                                                    v3GoalsActivity2.y0(true);
                                                                                    return;
                                                                                } else {
                                                                                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                            V3GoalsActivity v3GoalsActivity3 = this$0.f5318w;
                                                                            if (v3GoalsActivity3 != null) {
                                                                                v3GoalsActivity3.y0(false);
                                                                                return;
                                                                            } else {
                                                                                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                                                                                throw null;
                                                                            }
                                                                        case 1:
                                                                            Integer it = (Integer) obj;
                                                                            int i11 = c0.J;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            bm.o oVar2 = this$0.f5319x;
                                                                            if (oVar2 != null) {
                                                                                kotlin.jvm.internal.i.f(it, "it");
                                                                                oVar2.w(it.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 2:
                                                                            Integer it2 = (Integer) obj;
                                                                            int i12 = c0.J;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            bm.o oVar3 = this$0.f5319x;
                                                                            if (oVar3 != null) {
                                                                                kotlin.jvm.internal.i.f(it2, "it");
                                                                                oVar3.w(it2.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 3:
                                                                            Integer it3 = (Integer) obj;
                                                                            int i13 = c0.J;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            bm.o oVar4 = this$0.f5319x;
                                                                            if (oVar4 != null) {
                                                                                kotlin.jvm.internal.i.f(it3, "it");
                                                                                oVar4.w(it3.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 4:
                                                                            Integer it4 = (Integer) obj;
                                                                            int i14 = c0.J;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            bm.o oVar5 = this$0.f5319x;
                                                                            if (oVar5 != null) {
                                                                                kotlin.jvm.internal.i.f(it4, "it");
                                                                                oVar5.x(it4.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 5:
                                                                            Integer it5 = (Integer) obj;
                                                                            int i15 = c0.J;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            bm.o oVar6 = this$0.f5319x;
                                                                            if (oVar6 != null) {
                                                                                kotlin.jvm.internal.i.f(it5, "it");
                                                                                oVar6.x(it5.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 6:
                                                                            Integer it6 = (Integer) obj;
                                                                            int i16 = c0.J;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            bm.o oVar7 = this$0.f5319x;
                                                                            if (oVar7 != null) {
                                                                                kotlin.jvm.internal.i.f(it6, "it");
                                                                                oVar7.x(it6.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 7:
                                                                            Integer it7 = (Integer) obj;
                                                                            int i17 = c0.J;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            if (it7 == null || it7.intValue() != -1) {
                                                                                int i18 = this$0.D;
                                                                                if (it7 == null || it7.intValue() != i18) {
                                                                                    kotlin.jvm.internal.i.f(it7, "it");
                                                                                    this$0.D = it7.intValue();
                                                                                    bm.o oVar8 = this$0.f5319x;
                                                                                    if (oVar8 != null) {
                                                                                        oVar8.y(it7.intValue(), Constants.GOAL_TYPE_HABIT);
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        case 8:
                                                                            Integer it8 = (Integer) obj;
                                                                            int i19 = c0.J;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            if (it8 == null || it8.intValue() != -1) {
                                                                                int i20 = this$0.E;
                                                                                if (it8 == null || it8.intValue() != i20) {
                                                                                    kotlin.jvm.internal.i.f(it8, "it");
                                                                                    this$0.E = it8.intValue();
                                                                                    bm.o oVar9 = this$0.f5319x;
                                                                                    if (oVar9 != null) {
                                                                                        oVar9.y(it8.intValue(), Constants.GOAL_TYPE_ACTIVITY_WEEKLY);
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        default:
                                                                            Integer it9 = (Integer) obj;
                                                                            int i21 = c0.J;
                                                                            kotlin.jvm.internal.i.g(this$0, "this$0");
                                                                            if (it9 == null || it9.intValue() != -1) {
                                                                                int i22 = this$0.F;
                                                                                if (it9 == null || i22 != it9.intValue()) {
                                                                                    kotlin.jvm.internal.i.f(it9, "it");
                                                                                    this$0.F = it9.intValue();
                                                                                    bm.o oVar10 = this$0.f5319x;
                                                                                    if (oVar10 != null) {
                                                                                        oVar10.y(it9.intValue(), Constants.GOAL_TYPE_ACTIVITY_ONCE);
                                                                                        return;
                                                                                    }
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                    }
                                                                }
                                                            });
                                                            return;
                                                        } else {
                                                            kotlin.jvm.internal.i.q("goalViewModel");
                                                            throw null;
                                                        }
                                                    }
                                                    kotlin.jvm.internal.i.q("goalViewModel");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.i.q("goalViewModel");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.i.q("goalViewModel");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.i.q("goalViewModel");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("goalViewModel");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("goalViewModel");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("goalViewModel");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("goalViewModel");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("goalViewModel");
                    throw null;
                }
                kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                throw null;
            }
            kotlin.jvm.internal.i.q("goalViewModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5316u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.I;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_v3_goals_regular, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        try {
            t1 t1Var = this.f5317v;
            if (t1Var != null) {
                t1Var.A.k(this);
                t1 t1Var2 = this.f5317v;
                if (t1Var2 != null) {
                    t1Var2.H.k(this);
                    t1 t1Var3 = this.f5317v;
                    if (t1Var3 != null) {
                        t1Var3.I.k(this);
                        t1 t1Var4 = this.f5317v;
                        if (t1Var4 != null) {
                            t1Var4.J.k(this);
                            t1 t1Var5 = this.f5317v;
                            if (t1Var5 != null) {
                                t1Var5.E.k(this);
                                t1 t1Var6 = this.f5317v;
                                if (t1Var6 != null) {
                                    t1Var6.F.k(this);
                                    t1 t1Var7 = this.f5317v;
                                    if (t1Var7 != null) {
                                        t1Var7.G.k(this);
                                        return;
                                    } else {
                                        kotlin.jvm.internal.i.q("goalViewModel");
                                        throw null;
                                    }
                                }
                                kotlin.jvm.internal.i.q("goalViewModel");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("goalViewModel");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("goalViewModel");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("goalViewModel");
                    throw null;
                }
                kotlin.jvm.internal.i.q("goalViewModel");
                throw null;
            }
            kotlin.jvm.internal.i.q("goalViewModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5316u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.I.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059 A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:3:0x000c, B:5:0x004d, B:11:0x0059, B:22:0x0086, B:12:0x005d, B:16:0x006e, B:19:0x007f, B:21:0x0083, B:23:0x0098, B:24:0x009c, B:15:0x0069), top: B:29:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[Catch: Exception -> 0x009d, TryCatch #0 {Exception -> 0x009d, blocks: (B:3:0x000c, B:5:0x004d, B:11:0x0059, B:22:0x0086, B:12:0x005d, B:16:0x006e, B:19:0x007f, B:21:0x0083, B:23:0x0098, B:24:0x009c, B:15:0x0069), top: B:29:0x000c }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        String currentCourse;
        boolean z10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            dm.f fVar = new dm.f();
            Application application = requireActivity().getApplication();
            kotlin.jvm.internal.i.f(application, "requireActivity().application");
            this.f5317v = (t1) new o0(this, new kk.c(application, fVar)).a(t1.class);
            androidx.fragment.app.p requireActivity = requireActivity();
            kotlin.jvm.internal.i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.goals.activity.V3GoalsActivity");
            this.f5318w = (V3GoalsActivity) requireActivity;
            currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f5316u, e10);
        }
        if (currentCourse != null && currentCourse.length() != 0) {
            z10 = false;
            if (z10) {
                U();
            } else {
                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.tvEmptyState);
                if (robertoTextView != null) {
                    robertoTextView.setText("Goals will be added as you go through your day-wise plan.");
                }
                ((RobertoButton) _$_findCachedViewById(R.id.addGoalsButtonMain)).setVisibility(8);
                V3GoalsActivity v3GoalsActivity = this.f5318w;
                if (v3GoalsActivity != null) {
                    if (v3GoalsActivity.F == 0) {
                        v3GoalsActivity.w0(false);
                    }
                } else {
                    kotlin.jvm.internal.i.q(Constants.SCREEN_ACTIVITY);
                    throw null;
                }
            }
            new androidx.recyclerview.widget.r().a((RecyclerView) _$_findCachedViewById(R.id.rvRegularGoalRAExperiment));
            ((RobertoButton) _$_findCachedViewById(R.id.addGoalsButtonMain)).setOnClickListener(new a0(this, 0));
        }
        z10 = true;
        if (z10) {
        }
        new androidx.recyclerview.widget.r().a((RecyclerView) _$_findCachedViewById(R.id.rvRegularGoalRAExperiment));
        ((RobertoButton) _$_findCachedViewById(R.id.addGoalsButtonMain)).setOnClickListener(new a0(this, 0));
    }
}
