package cq;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TimePicker;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.o0;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.core.ValidationPath;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.AddGoalsActivity;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ek.p;
import fm.j0;
import g0.a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.x;
import r1.b0;
import ss.l;
import ta.v;
import tr.r;
/* compiled from: GoalActivityListFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcq/g;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g extends rr.b {
    public static final /* synthetic */ int E = 0;
    public fm.a A;

    /* renamed from: w  reason: collision with root package name */
    public LinearLayout f11911w;

    /* renamed from: x  reason: collision with root package name */
    public LinearLayout f11912x;

    /* renamed from: y  reason: collision with root package name */
    public ImageView f11913y;
    public final LinkedHashMap D = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f11909u = LogHelper.INSTANCE.makeLogTag(g.class);

    /* renamed from: v  reason: collision with root package name */
    public final int f11910v = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;

    /* renamed from: z  reason: collision with root package name */
    public final yn.a f11914z = new yn.a();
    public final boolean B = sp.b.K();
    public final ArrayList<FirestoreGoal> C = new ArrayList<>();

    /* compiled from: GoalActivityListFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<List<? extends FirestoreGoal>, hs.k> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ArrayList<GoalType> f11916v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<GoalType> arrayList) {
            super(1);
            this.f11916v = arrayList;
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends FirestoreGoal> list) {
            boolean z10;
            g gVar = g.this;
            gVar.C.addAll(list);
            String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
            i.f(currentCourse, "getInstance().user.currentCourse");
            String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
            i.f(currentCourseName, "getInstance().user.currentCourseName");
            ArrayList<GoalType> activities = this.f11916v;
            i.f(activities, "activities");
            Iterator<GoalType> it = activities.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                int i10 = i6 + 1;
                GoalType next = it.next();
                View inflate = gVar.getLayoutInflater().inflate(R.layout.row_activity_list_v1, (ViewGroup) null);
                i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                int i11 = i6 % 3;
                boolean z11 = true;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            Context requireContext = gVar.requireContext();
                            Object obj = g0.a.f16164a;
                            ((ConstraintLayout) constraintLayout.findViewById(R.id.ll_deep_breathing)).setBackground(a.c.b(requireContext, R.drawable.ic_recommended_activities_list_view_bar));
                        }
                    } else {
                        Context requireContext2 = gVar.requireContext();
                        Object obj2 = g0.a.f16164a;
                        ((ConstraintLayout) constraintLayout.findViewById(R.id.ll_deep_breathing)).setBackground(a.c.b(requireContext2, R.drawable.ic_recommended_activities_list_view_bar_2));
                    }
                } else {
                    Context requireContext3 = gVar.requireContext();
                    Object obj3 = g0.a.f16164a;
                    ((ConstraintLayout) constraintLayout.findViewById(R.id.ll_deep_breathing)).setBackground(a.c.b(requireContext3, R.drawable.ic_recommended_activities_list_view_bar_3));
                }
                ArrayList<FirestoreGoal> arrayList = gVar.C;
                if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                    Iterator<FirestoreGoal> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        FirestoreGoal next2 = it2.next();
                        if (i.b(next2.getGoalId(), next.getGoalId()) && next2.isVisible()) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    ((RobertoButton) constraintLayout.findViewById(R.id.robertoButton)).setText("REMOVE GOAL");
                    ((RobertoButton) constraintLayout.findViewById(R.id.robertoButton)).setTextColor(g0.a.b(gVar.requireContext(), R.color.goalOrange));
                    ((RobertoButton) constraintLayout.findViewById(R.id.robertoButton)).setBackground(a.c.b(gVar.requireContext(), R.drawable.button_filled_white));
                }
                ((RobertoButton) constraintLayout.findViewById(R.id.robertoButton)).setOnClickListener(new p(gVar, constraintLayout, next, currentCourse, currentCourseName, 2));
                ((RobertoTextView) constraintLayout.findViewById(R.id.text)).setText(next.getText2());
                ((AppCompatImageView) constraintLayout.findViewById(R.id.activityDisabledLock)).setVisibility(8);
                ((RobertoButton) constraintLayout.findViewById(R.id.robertoButton)).setVisibility(0);
                constraintLayout.setOnClickListener(new d(gVar, next, 0));
                if (i.b(next.getType(), "physical_activity")) {
                    LinearLayout linearLayout = gVar.f11912x;
                    if (linearLayout != null) {
                        linearLayout.addView(constraintLayout);
                    } else {
                        i.q("llPhysical");
                        throw null;
                    }
                } else if (i.b(next.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                    LinearLayout linearLayout2 = gVar.f11911w;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(constraintLayout);
                    } else {
                        i.q("llRelaxation");
                        throw null;
                    }
                } else {
                    continue;
                }
                i6 = i10;
            }
            return hs.k.f19476a;
        }
    }

    public final void J(String str) {
        Bundle a10 = b0.a("activity_id", str);
        com.theinnerhour.b2b.fragment.coping.a aVar = new com.theinnerhour.b2b.fragment.coping.a();
        aVar.setArguments(a10);
        androidx.fragment.app.p requireActivity = requireActivity();
        i.e(requireActivity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.AddGoalsActivity");
        ((AddGoalsActivity) requireActivity).s0(aVar);
    }

    public final void K(final Goal goal, final FirestoreGoal firestoreGoal, final View view) {
        boolean z10;
        CustomDate scheduledDate;
        CustomDate scheduledDate2;
        boolean z11 = true;
        if (goal != null && (scheduledDate2 = goal.getScheduledDate()) != null && scheduledDate2.getTime() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            goal.getScheduledDate().setTime(Calendar.getInstance().getTimeInMillis());
        }
        if ((firestoreGoal == null || (scheduledDate = firestoreGoal.getScheduledDate()) == null || scheduledDate.getTime() != 0) ? false : false) {
            firestoreGoal.getScheduledDate().setTime(Calendar.getInstance().getTimeInMillis());
        }
        final Calendar calendar = Calendar.getInstance();
        if (goal != null) {
            calendar.setTimeInMillis(goal.getScheduledDate().getTime() * 1000);
        }
        if (firestoreGoal != null) {
            calendar.setTimeInMillis(firestoreGoal.getScheduledDate().getTime() * 1000);
        }
        TimePickerDialog timePickerDialog = new TimePickerDialog(requireContext(), R.style.myTimePickerTheme, new TimePickerDialog.OnTimeSetListener() { // from class: cq.e
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i6, int i10) {
                AddGoalsActivity addGoalsActivity;
                Calendar calendar2 = calendar;
                int i11 = g.E;
                g this$0 = g.this;
                i.g(this$0, "this$0");
                View v10 = view;
                i.g(v10, "$v");
                try {
                    if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.FFM_RECOMMENDED_ACTIVITIES, false) && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        androidx.fragment.app.p activity = this$0.getActivity();
                        if (activity instanceof AddGoalsActivity) {
                            addGoalsActivity = (AddGoalsActivity) activity;
                        } else {
                            addGoalsActivity = null;
                        }
                        if (addGoalsActivity != null) {
                            addGoalsActivity.f10304z = true;
                        }
                        ApplicationPersistence.getInstance().setBooleanValue(Constants.FFM_RECOMMENDED_ACTIVITIES, true);
                    }
                    calendar2.set(11, i6);
                    calendar2.set(12, i10);
                    Goal goal2 = goal;
                    if (goal2 != null) {
                        goal2.getScheduledDate().setTime(calendar2.getTimeInMillis());
                        goal2.setVisible(true);
                        goal2.setNotificationScheduled(true);
                        FirebasePersistence.getInstance().updateGoal(goal2, Boolean.FALSE);
                        Utils utils = Utils.INSTANCE;
                        Context applicationContext = this$0.requireContext().getApplicationContext();
                        i.f(applicationContext, "requireContext().applicationContext");
                        long time = goal2.getmStartDate().getTime();
                        long time2 = goal2.getmScheduleDate().getTime();
                        String type = goal2.getType();
                        i.d(type);
                        String goalId = goal2.getGoalId();
                        i.d(goalId);
                        String courseName = goal2.getCourseName();
                        i.d(courseName);
                        String goalName = goal2.getGoalName();
                        i.d(goalName);
                        Utils.updateActivityNotification$default(utils, applicationContext, true, time, time2, type, goalId, courseName, goalName, null, null, ValidationPath.MAX_PATH_LENGTH_BYTES, null);
                    }
                    FirestoreGoal firestoreGoal2 = firestoreGoal;
                    if (firestoreGoal2 != null) {
                        firestoreGoal2.getScheduledDate().setTime(calendar2.getTimeInMillis());
                        firestoreGoal2.setVisible(true);
                        firestoreGoal2.setNotificationScheduled(true);
                        fm.a aVar = this$0.A;
                        if (aVar != null) {
                            aVar.g(firestoreGoal2, true);
                            this$0.C.add(firestoreGoal2);
                        } else {
                            i.q("firestoreGoalsViewModel");
                            throw null;
                        }
                    }
                    ((RobertoButton) v10.findViewById(R.id.robertoButton)).setText("REMOVE GOAL");
                    ((RobertoButton) v10.findViewById(R.id.robertoButton)).setTextColor(g0.a.b(this$0.requireContext(), R.color.goalOrange));
                    ((RobertoButton) v10.findViewById(R.id.robertoButton)).setBackground(a.c.b(this$0.requireContext(), R.drawable.button_filled_white));
                    Snackbar.h((CoordinatorLayout) this$0._$_findCachedViewById(R.id.mainContainer), "We've added this goal to the Goals section, accessible from your Dashboard.", 0).i();
                    if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.SCHEDULED_AN_ACTIVITY_BADGE)) {
                        HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                        i.f(badges, "getInstance().user.userGamificationModel.badges");
                        badges.put(Constants.SCHEDULED_AN_ACTIVITY_BADGE, Constants.BADGE_ATTAINED);
                        FirebasePersistence.getInstance().updateUserOnFirebase();
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f11909u, "exception", e10);
                }
            }
        }, calendar.get(11), calendar.get(12), false);
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        i.f(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(R.layout.row_text_view_new, (ViewGroup) null);
        ((RobertoTextView) inflate.findViewById(R.id.textViewMain)).setText("Set a time for this activity so we can send you a reminder");
        timePickerDialog.setCustomTitle(inflate);
        timePickerDialog.setButton(-1, "Proceed", timePickerDialog);
        timePickerDialog.show();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.D;
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
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        if (i6 == this.f11910v && i10 == -1) {
            boolean z10 = false;
            if (intent != null && intent.getBooleanExtra("purchase_successful", false)) {
                z10 = true;
            }
            if (z10 && ((ConstraintLayout) _$_findCachedViewById(R.id.customGoalPromptLayout)).getVisibility() == 0) {
                ((ConstraintLayout) _$_findCachedViewById(R.id.customGoalPromptLayout)).setVisibility(8);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.fragment.app.p requireActivity = requireActivity();
        i.f(requireActivity, "requireActivity()");
        this.A = (fm.a) new o0(requireActivity, new kk.c(MyApplication.V.a(), new j0())).a(fm.a.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_goal_activity_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.D.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, com.theinnerhour.b2b.model.Goal] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup viewGroup;
        boolean z10;
        boolean z11;
        i.g(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.ll_relaxation);
        i.f(findViewById, "view.findViewById(R.id.ll_relaxation)");
        this.f11911w = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.ll_physical);
        i.f(findViewById2, "view.findViewById(R.id.ll_physical)");
        this.f11912x = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.header_arrow_back);
        i.f(findViewById3, "view.findViewById(R.id.header_arrow_back)");
        ImageView imageView = (ImageView) findViewById3;
        this.f11913y = imageView;
        UiUtils.Companion.increaseImageClickArea(imageView);
        ImageView imageView2 = this.f11913y;
        ViewGroup viewGroup2 = null;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: cq.c

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f11896v;

                {
                    this.f11896v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    g this$0 = this.f11896v;
                    switch (i6) {
                        case 0:
                            int i10 = g.E;
                            i.g(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        default:
                            int i11 = g.E;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            i.f(requireActivity, "requireActivity()");
                            this$0.startActivityForResult(r.s(requireActivity, false).putExtra("source", "ra_custom_goal"), this$0.f11910v);
                            gk.a.b(null, "ra_custom_goal_subscription_click");
                            return;
                    }
                }
            });
            int i6 = 1;
            ((ConstraintLayout) _$_findCachedViewById(R.id.customGoalPromptLayout)).setOnClickListener(new View.OnClickListener(this) { // from class: cq.c

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f11896v;

                {
                    this.f11896v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i62 = r2;
                    g this$0 = this.f11896v;
                    switch (i62) {
                        case 0:
                            int i10 = g.E;
                            i.g(this$0, "this$0");
                            this$0.requireActivity().finish();
                            return;
                        default:
                            int i11 = g.E;
                            i.g(this$0, "this$0");
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            i.f(requireActivity, "requireActivity()");
                            this$0.startActivityForResult(r.s(requireActivity, false).putExtra("source", "ra_custom_goal"), this$0.f11910v);
                            gk.a.b(null, "ra_custom_goal_subscription_click");
                            return;
                    }
                }
            });
            if (!SubscriptionPersistence.INSTANCE.getSubscriptionEnabled() && defpackage.d.q(Constants.USER_VERSION)) {
                ArrayList<Goal> userGoals = FirebasePersistence.getInstance().getUser().getUserGoals();
                i.f(userGoals, "getInstance().user.userGoals");
                if (!userGoals.isEmpty()) {
                    for (Goal goal : userGoals) {
                        String goalId = goal.getGoalId();
                        if (goalId != null && gv.r.J0(goalId, "custom_")) {
                            z11 = true;
                            continue;
                        } else {
                            z11 = false;
                            continue;
                        }
                        if (z11) {
                            z10 = true;
                            break;
                        }
                    }
                }
                z10 = false;
                if (z10) {
                    ((ConstraintLayout) _$_findCachedViewById(R.id.customGoalPromptLayout)).setVisibility(0);
                    int i10 = 3;
                    if (!this.B) {
                        ArrayList<GoalType> activities = Constants.getActivities(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                        fm.a aVar = this.A;
                        if (aVar != null) {
                            aVar.f15179m0.e(getViewLifecycleOwner(), new pp.b(4, new a(activities)));
                            i.f(activities, "activities");
                            ArrayList arrayList = new ArrayList(is.i.H1(activities, 10));
                            for (GoalType goalType : activities) {
                                arrayList.add(goalType.getGoalId());
                            }
                            v.H(kc.f.H(aVar), null, 0, new fm.p(aVar, arrayList, null), 3);
                            return;
                        }
                        i.q("firestoreGoalsViewModel");
                        throw null;
                    }
                    ca.a.k("Deep Breathing", "Guided Imagery", "Progressive Muscle Relaxation");
                    ArrayList<GoalType> activities2 = Constants.getActivities(FirebasePersistence.getInstance().getUser().getCurrentCourse());
                    Object systemService = requireActivity().getSystemService("layout_inflater");
                    i.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                    LayoutInflater layoutInflater = (LayoutInflater) systemService;
                    Iterator<GoalType> it = activities2.iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        int i12 = i11 + 1;
                        GoalType next = it.next();
                        View inflate = layoutInflater.inflate(R.layout.row_activity_list_v1, viewGroup2);
                        i.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        int i13 = i11 % i10;
                        if (i13 != 0) {
                            if (i13 != i6) {
                                if (i13 == 2) {
                                    Context requireContext = requireContext();
                                    Object obj = g0.a.f16164a;
                                    ((ConstraintLayout) constraintLayout.findViewById(R.id.ll_deep_breathing)).setBackground(a.c.b(requireContext, R.drawable.ic_recommended_activities_list_view_bar));
                                }
                            } else {
                                Context requireContext2 = requireContext();
                                Object obj2 = g0.a.f16164a;
                                ((ConstraintLayout) constraintLayout.findViewById(R.id.ll_deep_breathing)).setBackground(a.c.b(requireContext2, R.drawable.ic_recommended_activities_list_view_bar_2));
                            }
                        } else {
                            Context requireContext3 = requireContext();
                            Object obj3 = g0.a.f16164a;
                            ((ConstraintLayout) constraintLayout.findViewById(R.id.ll_deep_breathing)).setBackground(a.c.b(requireContext3, R.drawable.ic_recommended_activities_list_view_bar_3));
                        }
                        String goalId2 = next.getGoalId();
                        i.f(goalId2, "type.goalId");
                        String currentCourse = FirebasePersistence.getInstance().getUser().getCurrentCourse();
                        if (!i.b(goalId2, "")) {
                            x xVar = new x();
                            ?? goalById = FirebasePersistence.getInstance().getGoalById(goalId2, currentCourse);
                            xVar.f23469u = goalById;
                            if (goalById != 0 && goalById.isVisible()) {
                                ((RobertoButton) constraintLayout.findViewById(R.id.robertoButton)).setText("REMOVE GOAL");
                                ((RobertoButton) constraintLayout.findViewById(R.id.robertoButton)).setTextColor(g0.a.b(requireContext(), R.color.goalOrange));
                                ((RobertoButton) constraintLayout.findViewById(R.id.robertoButton)).setBackground(a.c.b(requireContext(), R.drawable.button_filled_white));
                            }
                            ((RobertoButton) constraintLayout.findViewById(R.id.robertoButton)).setOnClickListener(new p(xVar, goalId2, currentCourse, this, constraintLayout));
                        }
                        ((RobertoTextView) constraintLayout.findViewById(R.id.text)).setText(next.getText2());
                        ((AppCompatImageView) constraintLayout.findViewById(R.id.activityDisabledLock)).setVisibility(8);
                        ((RobertoButton) constraintLayout.findViewById(R.id.robertoButton)).setVisibility(0);
                        constraintLayout.setOnClickListener(new d(this, next, 1));
                        if (i.b(next.getType(), "physical_activity")) {
                            LinearLayout linearLayout = this.f11912x;
                            if (linearLayout != null) {
                                linearLayout.addView(constraintLayout);
                                viewGroup = null;
                            } else {
                                i.q("llPhysical");
                                throw null;
                            }
                        } else {
                            viewGroup = null;
                            if (i.b(next.getType(), Constants.GOAL_TYPE_RELAXATION_ACTIVITY)) {
                                LinearLayout linearLayout2 = this.f11911w;
                                if (linearLayout2 != null) {
                                    linearLayout2.addView(constraintLayout);
                                } else {
                                    i.q("llRelaxation");
                                    throw null;
                                }
                            } else {
                                continue;
                            }
                        }
                        viewGroup2 = viewGroup;
                        i6 = 1;
                        i10 = 3;
                        i11 = i12;
                    }
                    return;
                }
            }
            ((ConstraintLayout) _$_findCachedViewById(R.id.customGoalPromptLayout)).setVisibility(8);
            int i102 = 3;
            if (!this.B) {
            }
        } else {
            i.q("headerArrowBack");
            throw null;
        }
    }
}
