package pq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionMasteryActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResultMasteryModel;
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
/* compiled from: DepressionMasteryGoalFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpq/d;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f28773x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f28776w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f28774u = LogHelper.INSTANCE.makeLogTag(d.class);

    /* renamed from: v  reason: collision with root package name */
    public final String f28775v = "result_mastery_new";

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f28776w;
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
        this.f28776w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView goal2SkipButton = (RobertoTextView) _$_findCachedViewById(R.id.goal2SkipButton);
            kotlin.jvm.internal.i.f(goal2SkipButton, "goal2SkipButton");
            insetsUtils.addStatusBarHeight(goal2SkipButton);
            RobertoTextView goal2Title = (RobertoTextView) _$_findCachedViewById(R.id.goal2Title);
            kotlin.jvm.internal.i.f(goal2Title, "goal2Title");
            insetsUtils.addStatusBarHeight(goal2Title);
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2Title)).setText(getString(R.string.depressionMasteryGoalHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2Subtitle)).setText(getString(R.string.depressionMasteryGoalSubheader));
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2activity)).setText(getString(R.string.depressionMasteryGoalText));
            ((RobertoButton) _$_findCachedViewById(R.id.goal2Button1CTA)).setText(getString(R.string.depressionTimeoutGoalCTA1));
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
            ((RobertoTextView) _$_findCachedViewById(R.id.goalUserInput)).setText(((DepressionMasteryActivity) activity).E);
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2TimePickerCTA)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.goal2Button2CTA)).setVisibility(8);
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2SkipButton)).setOnClickListener(new View.OnClickListener(this) { // from class: pq.c

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ d f28772v;

                {
                    this.f28772v = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6 = r2;
                    d this$0 = this.f28772v;
                    switch (i6) {
                        case 0:
                            int i10 = d.f28773x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                            ((DepressionMasteryActivity) activity2).t0();
                            return;
                        default:
                            int i11 = d.f28773x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ScreenResultMasteryModel screenResultMasteryModel = new ScreenResultMasteryModel(Utils.INSTANCE.getTimeInSeconds());
                            try {
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f28774u, "exception in get goal", e10);
                            }
                            for (Goal goal : FirebasePersistence.getInstance().getUserGoals()) {
                                if (kotlin.jvm.internal.i.b(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_MASTERY_NEW, goal.getGoalId()) && kotlin.jvm.internal.i.b(goal.getCourseName(), Constants.COURSE_DEPRESSION)) {
                                    String str = this$0.f28775v;
                                    if (goal == null) {
                                        if (!goal.getData().containsKey(str)) {
                                            goal.getData().put(str, new ArrayList());
                                        }
                                        Object obj = goal.getData().get(str);
                                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultMasteryModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultMasteryModel> }");
                                        ((ArrayList) obj).add(screenResultMasteryModel);
                                    } else {
                                        Goal goal2 = new Goal(defpackage.c.n(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_MASTERY_NEW);
                                        goal2.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_MASTERY_NEW).getType());
                                        goal2.setVisible(true);
                                        goal2.setNotificationScheduled(false);
                                        goal2.getData().put(str, new ArrayList());
                                        Object obj2 = goal2.getData().get(str);
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultMasteryModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultMasteryModel> }");
                                        ((ArrayList) obj2).add(screenResultMasteryModel);
                                        FirebasePersistence.getInstance().getUserGoals().add(goal2);
                                    }
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                    Toast.makeText(this$0.getActivity(), this$0.getString(R.string.goodthingsGoalToast), 0).show();
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                                    ((DepressionMasteryActivity) activity3).t0();
                                    return;
                                }
                            }
                            goal = null;
                            String str2 = this$0.f28775v;
                            if (goal == null) {
                            }
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            Toast.makeText(this$0.getActivity(), this$0.getString(R.string.goodthingsGoalToast), 0).show();
                            androidx.fragment.app.p activity32 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity32, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                            ((DepressionMasteryActivity) activity32).t0();
                            return;
                    }
                }
            });
            ((RobertoButton) _$_findCachedViewById(R.id.goal2Button1CTA)).setOnClickListener(new View.OnClickListener(this) { // from class: pq.c

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ d f28772v;

                {
                    this.f28772v = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6 = r2;
                    d this$0 = this.f28772v;
                    switch (i6) {
                        case 0:
                            int i10 = d.f28773x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity2 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                            ((DepressionMasteryActivity) activity2).t0();
                            return;
                        default:
                            int i11 = d.f28773x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ScreenResultMasteryModel screenResultMasteryModel = new ScreenResultMasteryModel(Utils.INSTANCE.getTimeInSeconds());
                            try {
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f28774u, "exception in get goal", e10);
                            }
                            for (Goal goal : FirebasePersistence.getInstance().getUserGoals()) {
                                if (kotlin.jvm.internal.i.b(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_MASTERY_NEW, goal.getGoalId()) && kotlin.jvm.internal.i.b(goal.getCourseName(), Constants.COURSE_DEPRESSION)) {
                                    String str2 = this$0.f28775v;
                                    if (goal == null) {
                                        if (!goal.getData().containsKey(str2)) {
                                            goal.getData().put(str2, new ArrayList());
                                        }
                                        Object obj = goal.getData().get(str2);
                                        kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultMasteryModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultMasteryModel> }");
                                        ((ArrayList) obj).add(screenResultMasteryModel);
                                    } else {
                                        Goal goal2 = new Goal(defpackage.c.n(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_MASTERY_NEW);
                                        goal2.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_MASTERY_NEW).getType());
                                        goal2.setVisible(true);
                                        goal2.setNotificationScheduled(false);
                                        goal2.getData().put(str2, new ArrayList());
                                        Object obj2 = goal2.getData().get(str2);
                                        kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultMasteryModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultMasteryModel> }");
                                        ((ArrayList) obj2).add(screenResultMasteryModel);
                                        FirebasePersistence.getInstance().getUserGoals().add(goal2);
                                    }
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                    Toast.makeText(this$0.getActivity(), this$0.getString(R.string.goodthingsGoalToast), 0).show();
                                    androidx.fragment.app.p activity32 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity32, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                                    ((DepressionMasteryActivity) activity32).t0();
                                    return;
                                }
                            }
                            goal = null;
                            String str22 = this$0.f28775v;
                            if (goal == null) {
                            }
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            Toast.makeText(this$0.getActivity(), this$0.getString(R.string.goodthingsGoalToast), 0).show();
                            androidx.fragment.app.p activity322 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity322, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                            ((DepressionMasteryActivity) activity322).t0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28774u, e10);
        }
    }
}
