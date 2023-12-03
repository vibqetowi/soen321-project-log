package qq;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.model.ScreenResultPleasurableModel;
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
/* compiled from: DepressionPleasurableGoalFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lqq/g;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f30033x = 0;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f30036w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f30034u = LogHelper.INSTANCE.makeLogTag(g.class);

    /* renamed from: v  reason: collision with root package name */
    public final String f30035v = "result_pleasurable_new";

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30036w;
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
        this.f30036w.clear();
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
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2Title)).setText(getString(R.string.depressionPleasurableGoalHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2Subtitle)).setText(getString(R.string.depressionPleasurableGoalSubheader));
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2activity)).setText(getString(R.string.depressionPleasurableGoalText));
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2TimePickerCTA)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.goal2Button2CTA)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.goal2Button1CTA)).setText(getString(R.string.goodthingsGoalCTA));
            ((RobertoButton) _$_findCachedViewById(R.id.goal2Button1CTA)).setOnClickListener(new View.OnClickListener(this) { // from class: qq.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f30032v;

                {
                    this.f30032v = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6 = r2;
                    g this$0 = this.f30032v;
                    switch (i6) {
                        case 0:
                            int i10 = g.f30033x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ScreenResultPleasurableModel screenResultPleasurableModel = new ScreenResultPleasurableModel(Utils.INSTANCE.getTimeInSeconds());
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            screenResultPleasurableModel.setLetter(((DepressionPleasurableActivity) activity).D);
                            try {
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f30034u, "exception in get goal", e10);
                            }
                            for (Goal goal : FirebasePersistence.getInstance().getUserGoals()) {
                                if (kotlin.jvm.internal.i.b(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_PLEASURABLE_NEW, goal.getGoalId()) && kotlin.jvm.internal.i.b(goal.getCourseName(), Constants.COURSE_DEPRESSION)) {
                                    boolean z10 = true;
                                    String str = this$0.f30035v;
                                    if (goal == null) {
                                        goal.setSource("daily_plan");
                                        Date time = Calendar.getInstance().getTime();
                                        kotlin.jvm.internal.i.f(time, "getInstance().time");
                                        goal.setmLastAdded(time);
                                        if (!goal.getData().containsKey(str)) {
                                            goal.getData().put(str, new ArrayList());
                                        }
                                        if (screenResultPleasurableModel.getLetter().length() <= 0) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            Object obj = goal.getData().get(str);
                                            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultPleasurableModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultPleasurableModel> }");
                                            ((ArrayList) obj).add(screenResultPleasurableModel);
                                        }
                                    } else {
                                        Goal goal2 = new Goal(defpackage.c.n(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_PLEASURABLE_NEW);
                                        goal2.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_PLEASURABLE_NEW).getType());
                                        goal2.setVisible(true);
                                        goal2.setNotificationScheduled(false);
                                        goal2.setSource("daily_plan");
                                        goal2.getData().put(str, new ArrayList());
                                        if (screenResultPleasurableModel.getLetter().length() <= 0) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            Object obj2 = goal2.getData().get(str);
                                            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultPleasurableModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultPleasurableModel> }");
                                            ((ArrayList) obj2).add(screenResultPleasurableModel);
                                        }
                                        FirebasePersistence.getInstance().getUserGoals().add(goal2);
                                    }
                                    Toast.makeText(this$0.getActivity(), this$0.getString(R.string.goodthingsGoalToast), 0).show();
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                    androidx.fragment.app.p activity2 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                                    ((DepressionPleasurableActivity) activity2).t0();
                                    return;
                                }
                            }
                            goal = null;
                            boolean z102 = true;
                            String str2 = this$0.f30035v;
                            if (goal == null) {
                            }
                            Toast.makeText(this$0.getActivity(), this$0.getString(R.string.goodthingsGoalToast), 0).show();
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            androidx.fragment.app.p activity22 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity22).t0();
                            return;
                        default:
                            int i11 = g.f30033x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity3 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity3).t0();
                            return;
                    }
                }
            });
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2SkipButton)).setText(getString(R.string.goodthingsSkipCTA));
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
            if (((DepressionPleasurableActivity) activity).E) {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((RobertoTextView) _$_findCachedViewById(R.id.goalUserInput)).setText(((DepressionPleasurableActivity) activity2).C);
            } else {
                androidx.fragment.app.p activity3 = getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                if (((DepressionPleasurableActivity) activity3).F) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.goalUserInput)).setText(getString(R.string.depressionPleasurableAudioIntroHeader));
                } else {
                    ((RobertoTextView) _$_findCachedViewById(R.id.goalUserInput)).setText(getString(R.string.depressionPleasurableLetterActivityText));
                }
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.goal2SkipButton)).setOnClickListener(new View.OnClickListener(this) { // from class: qq.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ g f30032v;

                {
                    this.f30032v = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view2) {
                    int i6 = r2;
                    g this$0 = this.f30032v;
                    switch (i6) {
                        case 0:
                            int i10 = g.f30033x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ScreenResultPleasurableModel screenResultPleasurableModel = new ScreenResultPleasurableModel(Utils.INSTANCE.getTimeInSeconds());
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            screenResultPleasurableModel.setLetter(((DepressionPleasurableActivity) activity4).D);
                            try {
                            } catch (Exception e10) {
                                LogHelper.INSTANCE.e(this$0.f30034u, "exception in get goal", e10);
                            }
                            for (Goal goal : FirebasePersistence.getInstance().getUserGoals()) {
                                if (kotlin.jvm.internal.i.b(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_PLEASURABLE_NEW, goal.getGoalId()) && kotlin.jvm.internal.i.b(goal.getCourseName(), Constants.COURSE_DEPRESSION)) {
                                    boolean z102 = true;
                                    String str2 = this$0.f30035v;
                                    if (goal == null) {
                                        goal.setSource("daily_plan");
                                        Date time = Calendar.getInstance().getTime();
                                        kotlin.jvm.internal.i.f(time, "getInstance().time");
                                        goal.setmLastAdded(time);
                                        if (!goal.getData().containsKey(str2)) {
                                            goal.getData().put(str2, new ArrayList());
                                        }
                                        if (screenResultPleasurableModel.getLetter().length() <= 0) {
                                            z102 = false;
                                        }
                                        if (z102) {
                                            Object obj = goal.getData().get(str2);
                                            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultPleasurableModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultPleasurableModel> }");
                                            ((ArrayList) obj).add(screenResultPleasurableModel);
                                        }
                                    } else {
                                        Goal goal2 = new Goal(defpackage.c.n(), Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_PLEASURABLE_NEW);
                                        goal2.setType(Constants.getGoalType(Constants.DAILY_ACTIVITY_GOAL_ID_DEPRESSION_PLEASURABLE_NEW).getType());
                                        goal2.setVisible(true);
                                        goal2.setNotificationScheduled(false);
                                        goal2.setSource("daily_plan");
                                        goal2.getData().put(str2, new ArrayList());
                                        if (screenResultPleasurableModel.getLetter().length() <= 0) {
                                            z102 = false;
                                        }
                                        if (z102) {
                                            Object obj2 = goal2.getData().get(str2);
                                            kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<com.theinnerhour.b2b.model.ScreenResultPleasurableModel>{ kotlin.collections.TypeAliasesKt.ArrayList<com.theinnerhour.b2b.model.ScreenResultPleasurableModel> }");
                                            ((ArrayList) obj2).add(screenResultPleasurableModel);
                                        }
                                        FirebasePersistence.getInstance().getUserGoals().add(goal2);
                                    }
                                    Toast.makeText(this$0.getActivity(), this$0.getString(R.string.goodthingsGoalToast), 0).show();
                                    FirebasePersistence.getInstance().updateUserOnFirebase();
                                    androidx.fragment.app.p activity22 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity22, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                                    ((DepressionPleasurableActivity) activity22).t0();
                                    return;
                                }
                            }
                            goal = null;
                            boolean z1022 = true;
                            String str22 = this$0.f30035v;
                            if (goal == null) {
                            }
                            Toast.makeText(this$0.getActivity(), this$0.getString(R.string.goodthingsGoalToast), 0).show();
                            FirebasePersistence.getInstance().updateUserOnFirebase();
                            androidx.fragment.app.p activity222 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity222, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity222).t0();
                            return;
                        default:
                            int i11 = g.f30033x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity32 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity32, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                            ((DepressionPleasurableActivity) activity32).t0();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30034u, e10);
        }
    }
}
