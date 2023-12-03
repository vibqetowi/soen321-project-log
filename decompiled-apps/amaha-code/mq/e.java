package mq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionExerciseActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResultExercisesModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionExerciseGoalFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/e;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class e extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f25679x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f25682w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f25680u = "result_exercises";

    /* renamed from: v  reason: collision with root package name */
    public final String f25681v = LogHelper.INSTANCE.makeLogTag(e.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f25682w;
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
        return inflater.inflate(R.layout.fragment_screen_agoal2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f25682w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            ((RobertoTextView) _$_findCachedViewById(R.id.goalUserInput)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2Title)).setText(getString(R.string.depressionExercisesGoalHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2Subtitle)).setText(getString(R.string.depressionExercisesGoalSubHead));
            ((RobertoButton) _$_findCachedViewById(R.id.goal2Button2CTA)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2TimePickerCTA)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2activity)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.goalUserInput)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.goal2Button1CTA)).setText(getString(R.string.depressionExercisesGoalADDCTA));
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2SkipButton)).setText(getString(R.string.depressionExercisesGoalSkipCTA));
            ((RobertoButton) _$_findCachedViewById(R.id.goal2Button1CTA)).setOnClickListener(new View.OnClickListener(this) { // from class: mq.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e f25678v;

                {
                    this.f25678v = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6 = r2;
                    e this$0 = this.f25678v;
                    switch (i6) {
                        case 0:
                            int i10 = e.f25679x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Toast.makeText(this$0.getActivity(), this$0.getString(R.string.goodthingsGoalToast), 0).show();
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                            String str = ((DepressionExerciseActivity) activity).f10361x;
                            ScreenResultExercisesModel screenResultExercisesModel = new ScreenResultExercisesModel(Utils.INSTANCE.getTimeInSeconds());
                            screenResultExercisesModel.setDifficulty(str);
                            try {
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f25681v, "exception in get goal of Timeout", e10);
                            }
                            for (Goal goal : FirebasePersistence.getInstance().getUserGoals()) {
                                if (kotlin.jvm.internal.i.b(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_EXERCISES_NEW, goal.getGoalId()) && kotlin.jvm.internal.i.b(goal.getCourseName(), Constants.COURSE_DEPRESSION)) {
                                    String str2 = this$0.f25680u;
                                    if (goal == null) {
                                        if (!goal.getData().containsKey(str2)) {
                                            goal.getData().put(str2, new ArrayList());
                                        }
                                        Object obj = goal.getData().get(str2);
                                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultExercisesModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultExercisesModel> }");
                                        ((ArrayList) obj).add(screenResultExercisesModel);
                                    } else {
                                        Goal goal2 = new Goal(defpackage.c.n(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_EXERCISES_NEW);
                                        goal2.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_EXERCISES_NEW).getType());
                                        goal2.setVisible(true);
                                        goal2.setNotificationScheduled(false);
                                        goal2.getData().put(str2, new ArrayList());
                                        Object obj2 = goal2.getData().get(str2);
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultExercisesModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultExercisesModel> }");
                                        ((ArrayList) obj2).add(screenResultExercisesModel);
                                        FirebasePersistence.getInstance().getUserGoals().add(goal2);
                                    }
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                    androidx.fragment.app.p activity2 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                                    ((DepressionExerciseActivity) activity2).t0();
                                    return;
                                }
                            }
                            goal = null;
                            String str22 = this$0.f25680u;
                            if (goal == null) {
                            }
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            androidx.fragment.app.p activity22 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                            ((DepressionExerciseActivity) activity22).t0();
                            return;
                        default:
                            int i11 = e.f25679x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                            ((DepressionExerciseActivity) activity3).t0();
                            return;
                    }
                }
            });
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2SkipButton)).setOnClickListener(new View.OnClickListener(this) { // from class: mq.d

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ e f25678v;

                {
                    this.f25678v = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6 = r2;
                    e this$0 = this.f25678v;
                    switch (i6) {
                        case 0:
                            int i10 = e.f25679x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Toast.makeText(this$0.getActivity(), this$0.getString(R.string.goodthingsGoalToast), 0).show();
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                            String str = ((DepressionExerciseActivity) activity).f10361x;
                            ScreenResultExercisesModel screenResultExercisesModel = new ScreenResultExercisesModel(Utils.INSTANCE.getTimeInSeconds());
                            screenResultExercisesModel.setDifficulty(str);
                            try {
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f25681v, "exception in get goal of Timeout", e10);
                            }
                            for (Goal goal : FirebasePersistence.getInstance().getUserGoals()) {
                                if (kotlin.jvm.internal.i.b(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_EXERCISES_NEW, goal.getGoalId()) && kotlin.jvm.internal.i.b(goal.getCourseName(), Constants.COURSE_DEPRESSION)) {
                                    String str22 = this$0.f25680u;
                                    if (goal == null) {
                                        if (!goal.getData().containsKey(str22)) {
                                            goal.getData().put(str22, new ArrayList());
                                        }
                                        Object obj = goal.getData().get(str22);
                                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultExercisesModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultExercisesModel> }");
                                        ((ArrayList) obj).add(screenResultExercisesModel);
                                    } else {
                                        Goal goal2 = new Goal(defpackage.c.n(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_EXERCISES_NEW);
                                        goal2.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_EXERCISES_NEW).getType());
                                        goal2.setVisible(true);
                                        goal2.setNotificationScheduled(false);
                                        goal2.getData().put(str22, new ArrayList());
                                        Object obj2 = goal2.getData().get(str22);
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultExercisesModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultExercisesModel> }");
                                        ((ArrayList) obj2).add(screenResultExercisesModel);
                                        FirebasePersistence.getInstance().getUserGoals().add(goal2);
                                    }
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                    androidx.fragment.app.p activity22 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                                    ((DepressionExerciseActivity) activity22).t0();
                                    return;
                                }
                            }
                            goal = null;
                            String str222 = this$0.f25680u;
                            if (goal == null) {
                            }
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            androidx.fragment.app.p activity222 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity222, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                            ((DepressionExerciseActivity) activity222).t0();
                            return;
                        default:
                            int i11 = e.f25679x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                            ((DepressionExerciseActivity) activity3).t0();
                            return;
                    }
                }
            });
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView goal2SkipButton = (RobertoTextView) _$_findCachedViewById(R.id.goal2SkipButton);
            kotlin.jvm.internal.i.f(goal2SkipButton, "goal2SkipButton");
            insetsUtils.addStatusBarHeight(goal2SkipButton);
            RobertoTextView goal2Title = (RobertoTextView) _$_findCachedViewById(R.id.goal2Title);
            kotlin.jvm.internal.i.f(goal2Title, "goal2Title");
            insetsUtils.addStatusBarHeight(goal2Title);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25681v, e10);
        }
    }
}
