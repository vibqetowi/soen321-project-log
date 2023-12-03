package mq;

import a3.t;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionExerciseActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionExercisePlayFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmq/n;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n extends rr.b {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f25704z = 0;

    /* renamed from: w  reason: collision with root package name */
    public boolean f25707w;

    /* renamed from: x  reason: collision with root package name */
    public m f25708x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f25709y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f25705u = LogHelper.INSTANCE.makeLogTag(n.class);

    /* renamed from: v  reason: collision with root package name */
    public int f25706v = -1;

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f25709y;
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
        return inflater.inflate(R.layout.fragment_screen_a33, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f25709y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f25707w) {
            ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            if (Build.VERSION.SDK_INT < 25) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) _$_findCachedViewById(R.id.animationView);
                if (lottieAnimationView != null) {
                    lottieAnimationView.setRenderMode(t.SOFTWARE);
                }
            } else {
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) _$_findCachedViewById(R.id.animationView);
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setRenderMode(t.HARDWARE);
                }
            }
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView skipCTA = (RobertoTextView) _$_findCachedViewById(R.id.skipCTA);
            kotlin.jvm.internal.i.f(skipCTA, "skipCTA");
            insetsUtils.addStatusBarHeight(skipCTA);
            int i6 = requireArguments().getInt("play");
            this.f25706v = i6;
            switch (i6) {
                case 1:
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesSetWarmUpExercise1));
                    ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesSetWarmUpExercise1Sets));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setText(getString(R.string.depressionExercisesSetWarmUpExercise1Gif));
                    ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_shoulder_rotations);
                    break;
                case 2:
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesWarmUpExercise2));
                    ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesWarmUpExercise2Sets));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setText(getString(R.string.depressionExercisesWarmUpExercise2Gif));
                    ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_hip_rotation);
                    break;
                case 3:
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesWarmUpExercise3));
                    ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesWarmUpExercise3Sets));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setText(getString(R.string.depressionExercisesWarmUpExercise3Gif));
                    ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_arm_reach);
                    break;
                case 4:
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesWarmUpExercise4));
                    ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesWarmUpExercise4Sets));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setText(getString(R.string.depressionExercisesWarmUpExercise4Gif));
                    ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_side_reach);
                    break;
                case 5:
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesWarmUpExercise5));
                    ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesWarmUpExercise5Sets));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setText(getString(R.string.depressionExercisesWarmUpExercise5Gifs));
                    ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_knee_lift);
                    break;
                case 6:
                    androidx.fragment.app.p activity = getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                    String str = ((DepressionExerciseActivity) activity).f10361x;
                    int hashCode = str.hashCode();
                    if (hashCode != -1326152358) {
                        if (hashCode != 782690439) {
                            if (hashCode == 1124743013 && str.equals("I exercise once in a while")) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesModerateExercise1));
                                ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesModerateExercise1Sets));
                                ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_jump_squats);
                                break;
                            }
                        } else if (!str.equals("I almost never exercise")) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesBeginnerExercise1));
                            ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesBeginnerExercise1Sets));
                            ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setText("");
                            ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_jumping_jacks);
                            break;
                        }
                    } else if (!str.equals("Exercise is part of my routine")) {
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesAdvancedExercise1));
                        ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesAdvancedExercise1Sets));
                        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_burpees);
                        break;
                    }
                    break;
                case 7:
                    androidx.fragment.app.p activity2 = getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                    String str2 = ((DepressionExerciseActivity) activity2).f10361x;
                    int hashCode2 = str2.hashCode();
                    if (hashCode2 != -1326152358) {
                        if (hashCode2 != 782690439) {
                            if (hashCode2 == 1124743013 && str2.equals("I exercise once in a while")) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesModerateExercise2));
                                ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesModerateExercise2Sets));
                                ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setText(getString(R.string.depressionExercisesModerateExercise2Gif));
                                ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_cross_crunches);
                                break;
                            }
                        } else if (!str2.equals("I almost never exercise")) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesBeginnerExercise2));
                            ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesBeginnerExercise2Sets));
                            ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_squats);
                            break;
                        }
                    } else if (!str2.equals("Exercise is part of my routine")) {
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesAdvancedExercise2));
                        ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesAdvancedExercise2Sets));
                        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_crunches);
                        break;
                    }
                    break;
                case 8:
                    androidx.fragment.app.p activity3 = getActivity();
                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                    String str3 = ((DepressionExerciseActivity) activity3).f10361x;
                    int hashCode3 = str3.hashCode();
                    if (hashCode3 != -1326152358) {
                        if (hashCode3 != 782690439) {
                            if (hashCode3 == 1124743013 && str3.equals("I exercise once in a while")) {
                                ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesModerateExercise3));
                                ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesModerateExercise3Sets));
                                ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setText(getString(R.string.depressionExercisesModerateExercise2Gif));
                                ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_plank);
                                break;
                            }
                        } else if (!str3.equals("I almost never exercise")) {
                            break;
                        } else {
                            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesBeginnerExercise3));
                            ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesBeginnerExercise3Sets));
                            ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setText(getString(R.string.depressionExercisesBeginnerExercise3Gif));
                            ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_high_knees);
                            break;
                        }
                    } else if (!str3.equals("Exercise is part of my routine")) {
                        break;
                    } else {
                        ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesAdvancedExercise3));
                        ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesAdvancedExercise3Sets));
                        ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_push_ups);
                        break;
                    }
                    break;
                case 9:
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesCoolingDownExercise1));
                    ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesCoolingDownExercise1Sets));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setText(getString(R.string.depressionExercisesCoolingDownExercise1Gifs));
                    ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_neck_bends);
                    break;
                case 10:
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesCoolingDownExercise2));
                    ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesCoolingDownExercise2Sets));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tipText)).setText(getString(R.string.depressionExercisesCoolingDownExercise2Gif));
                    ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_front_of_thigh_stretch);
                    break;
                case 11:
                    ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionExercisesCoolingDownExercise3));
                    ((RobertoTextView) _$_findCachedViewById(R.id.timeText)).setText(getString(R.string.depressionExercisesCoolingDownExercise3Sets));
                    ((LottieAnimationView) _$_findCachedViewById(R.id.animationView)).setAnimation(R.raw.exercise_cat_cow_stretch);
                    break;
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.skipCTA)).setVisibility(8);
            ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setVisibility(0);
            ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setText(getString(R.string.depressionExercisesExercisePlayStartCTA));
            ((RobertoButton) _$_findCachedViewById(R.id.startCTA)).setOnClickListener(new l(this, 0));
            ((RobertoTextView) _$_findCachedViewById(R.id.skipCTA)).setOnClickListener(new l(this, 1));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f25705u, e10);
        }
    }
}
