package nq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionGoodthingsActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResultGoodthingsModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionGoodthingsGoalFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnq/e;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f26724x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f26727w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f26725u = LogHelper.INSTANCE.makeLogTag(e.class);

    /* renamed from: v  reason: collision with root package name */
    public final String f26726v = "result_goodthings_new";

    public final Goal J() {
        try {
            for (Goal goal : FirebasePersistence.getInstance().getUserGoals()) {
                if (kotlin.jvm.internal.i.b(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW, goal.getGoalId()) && kotlin.jvm.internal.i.b(goal.getCourseName(), Constants.COURSE_DEPRESSION)) {
                    return goal;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26725u, "exception in get goal", e10);
        }
        return null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f26727w;
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
        return inflater.inflate(R.layout.fragment_screen_agoal1, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f26727w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView goal1SkipButton = (RobertoTextView) _$_findCachedViewById(R.id.goal1SkipButton);
            kotlin.jvm.internal.i.f(goal1SkipButton, "goal1SkipButton");
            insetsUtils.addStatusBarHeight(goal1SkipButton);
            ((RobertoTextView) _$_findCachedViewById(R.id.goal1Title)).setText(getString(R.string.goodthingsGoalHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.goal1Subtitle)).setText(getString(R.string.goodthingsGoalSubheader));
            ((RobertoTextView) _$_findCachedViewById(R.id.goal1TimePickerCTA)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.goal1Button2CTA)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.goal1Button1CTA)).setText(getString(R.string.goodthingsGoalCTA));
            ((RobertoTextView) _$_findCachedViewById(R.id.goal1SkipButton)).setText(getString(R.string.goodthingsSkipCTA));
            ((RobertoTextView) _$_findCachedViewById(R.id.goal1SkipButton)).setOnClickListener(new View.OnClickListener(this) { // from class: nq.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e f26723v;

                {
                    this.f26723v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    e this$0 = this.f26723v;
                    switch (i6) {
                        case 0:
                            int i10 = e.f26724x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ScreenResultGoodthingsModel screenResultGoodthingsModel = new ScreenResultGoodthingsModel(Utils.INSTANCE.getTimeInSeconds());
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            screenResultGoodthingsModel.setGoodThingOne(((DepressionGoodthingsActivity) activity).f10367z);
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            screenResultGoodthingsModel.setGoodThingTwo(((DepressionGoodthingsActivity) activity2).A);
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            screenResultGoodthingsModel.setGoodThingThree(((DepressionGoodthingsActivity) activity3).B);
                            Goal J = this$0.J();
                            String str = this$0.f26726v;
                            if (J != null) {
                                J.setSource("daily_plan");
                                Date time = Calendar.getInstance().getTime();
                                kotlin.jvm.internal.i.f(time, "getInstance().time");
                                J.setmLastAdded(time);
                                if (!J.getData().containsKey(str)) {
                                    J.getData().put(str, new ArrayList());
                                }
                                Object obj = J.getData().get(str);
                                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel> }");
                                ((ArrayList) obj).add(screenResultGoodthingsModel);
                            } else {
                                Goal goal = new Goal(defpackage.c.n(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW);
                                goal.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW).getType());
                                goal.setVisible(false);
                                goal.setNotificationScheduled(false);
                                goal.setSource("daily_plan");
                                goal.getData().put(str, new ArrayList());
                                Object obj2 = goal.getData().get(str);
                                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel> }");
                                ((ArrayList) obj2).add(screenResultGoodthingsModel);
                                FirebasePersistence.getInstance().getUserGoals().add(goal);
                            }
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            ((DepressionGoodthingsActivity) activity4).t0();
                            return;
                        default:
                            int i11 = e.f26724x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ScreenResultGoodthingsModel screenResultGoodthingsModel2 = new ScreenResultGoodthingsModel(Utils.INSTANCE.getTimeInSeconds());
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            screenResultGoodthingsModel2.setGoodThingOne(((DepressionGoodthingsActivity) activity5).f10367z);
                            androidx.fragment.app.p activity6 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            screenResultGoodthingsModel2.setGoodThingTwo(((DepressionGoodthingsActivity) activity6).A);
                            androidx.fragment.app.p activity7 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            screenResultGoodthingsModel2.setGoodThingThree(((DepressionGoodthingsActivity) activity7).B);
                            Goal J2 = this$0.J();
                            String str2 = this$0.f26726v;
                            if (J2 != null) {
                                J2.setSource("daily_plan");
                                Date time2 = Calendar.getInstance().getTime();
                                kotlin.jvm.internal.i.f(time2, "getInstance().time");
                                J2.setmLastAdded(time2);
                                if (!J2.getData().containsKey(str2)) {
                                    J2.getData().put(str2, new ArrayList());
                                }
                                Object obj3 = J2.getData().get(str2);
                                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel> }");
                                ((ArrayList) obj3).add(screenResultGoodthingsModel2);
                            } else {
                                Goal goal2 = new Goal(defpackage.c.n(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW);
                                goal2.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW).getType());
                                goal2.setVisible(true);
                                goal2.setNotificationScheduled(false);
                                goal2.setSource("daily_plan");
                                goal2.getData().put(str2, new ArrayList());
                                Object obj4 = goal2.getData().get(str2);
                                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel> }");
                                ((ArrayList) obj4).add(screenResultGoodthingsModel2);
                                FirebasePersistence.getInstance().getUserGoals().add(goal2);
                            }
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            Toast.makeText(this$0.getActivity(), this$0.getString(R.string.goodthingsGoalToast), 0).show();
                            androidx.fragment.app.p activity8 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            ((DepressionGoodthingsActivity) activity8).t0();
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.goal1Button1CTA)).setOnClickListener(new View.OnClickListener(this) { // from class: nq.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e f26723v;

                {
                    this.f26723v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    e this$0 = this.f26723v;
                    switch (i6) {
                        case 0:
                            int i10 = e.f26724x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ScreenResultGoodthingsModel screenResultGoodthingsModel = new ScreenResultGoodthingsModel(Utils.INSTANCE.getTimeInSeconds());
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            screenResultGoodthingsModel.setGoodThingOne(((DepressionGoodthingsActivity) activity).f10367z);
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            screenResultGoodthingsModel.setGoodThingTwo(((DepressionGoodthingsActivity) activity2).A);
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            screenResultGoodthingsModel.setGoodThingThree(((DepressionGoodthingsActivity) activity3).B);
                            Goal J = this$0.J();
                            String str = this$0.f26726v;
                            if (J != null) {
                                J.setSource("daily_plan");
                                Date time = Calendar.getInstance().getTime();
                                kotlin.jvm.internal.i.f(time, "getInstance().time");
                                J.setmLastAdded(time);
                                if (!J.getData().containsKey(str)) {
                                    J.getData().put(str, new ArrayList());
                                }
                                Object obj = J.getData().get(str);
                                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel> }");
                                ((ArrayList) obj).add(screenResultGoodthingsModel);
                            } else {
                                Goal goal = new Goal(defpackage.c.n(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW);
                                goal.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW).getType());
                                goal.setVisible(false);
                                goal.setNotificationScheduled(false);
                                goal.setSource("daily_plan");
                                goal.getData().put(str, new ArrayList());
                                Object obj2 = goal.getData().get(str);
                                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel> }");
                                ((ArrayList) obj2).add(screenResultGoodthingsModel);
                                FirebasePersistence.getInstance().getUserGoals().add(goal);
                            }
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            ((DepressionGoodthingsActivity) activity4).t0();
                            return;
                        default:
                            int i11 = e.f26724x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ScreenResultGoodthingsModel screenResultGoodthingsModel2 = new ScreenResultGoodthingsModel(Utils.INSTANCE.getTimeInSeconds());
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            screenResultGoodthingsModel2.setGoodThingOne(((DepressionGoodthingsActivity) activity5).f10367z);
                            androidx.fragment.app.p activity6 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            screenResultGoodthingsModel2.setGoodThingTwo(((DepressionGoodthingsActivity) activity6).A);
                            androidx.fragment.app.p activity7 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity7, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            screenResultGoodthingsModel2.setGoodThingThree(((DepressionGoodthingsActivity) activity7).B);
                            Goal J2 = this$0.J();
                            String str2 = this$0.f26726v;
                            if (J2 != null) {
                                J2.setSource("daily_plan");
                                Date time2 = Calendar.getInstance().getTime();
                                kotlin.jvm.internal.i.f(time2, "getInstance().time");
                                J2.setmLastAdded(time2);
                                if (!J2.getData().containsKey(str2)) {
                                    J2.getData().put(str2, new ArrayList());
                                }
                                Object obj3 = J2.getData().get(str2);
                                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel> }");
                                ((ArrayList) obj3).add(screenResultGoodthingsModel2);
                            } else {
                                Goal goal2 = new Goal(defpackage.c.n(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW);
                                goal2.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_GOOD_THINGS_NEW).getType());
                                goal2.setVisible(true);
                                goal2.setNotificationScheduled(false);
                                goal2.setSource("daily_plan");
                                goal2.getData().put(str2, new ArrayList());
                                Object obj4 = goal2.getData().get(str2);
                                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultGoodthingsModel> }");
                                ((ArrayList) obj4).add(screenResultGoodthingsModel2);
                                FirebasePersistence.getInstance().getUserGoals().add(goal2);
                            }
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            Toast.makeText(this$0.getActivity(), this$0.getString(R.string.goodthingsGoalToast), 0).show();
                            androidx.fragment.app.p activity8 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity8, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionGoodthingsActivity");
                            ((DepressionGoodthingsActivity) activity8).t0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f26725u, e10);
        }
    }
}
