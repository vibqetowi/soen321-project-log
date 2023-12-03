package ik;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: InitialAssessmentCourseDetailsAlternateFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/w0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class w0 extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f20321x = 0;

    /* renamed from: v  reason: collision with root package name */
    public InitialAssessmentActivity f20323v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f20324w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20322u = LogHelper.INSTANCE.makeLogTag(w0.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20324w;
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
        return inflater.inflate(R.layout.fragment_initial_assessment_course_details_alternate, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20324w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        HashMap<String, Object> appConfig;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            this.f20323v = (InitialAssessmentActivity) activity;
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            AppCompatImageView initialAssessmentCourseDetailsTopImage = (AppCompatImageView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsTopImage);
            kotlin.jvm.internal.i.f(initialAssessmentCourseDetailsTopImage, "initialAssessmentCourseDetailsTopImage");
            insetsUtils.addStatusBarHeight(initialAssessmentCourseDetailsTopImage);
            Bundle bundle2 = new Bundle();
            bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            InitialAssessmentActivity initialAssessmentActivity = this.f20323v;
            if (initialAssessmentActivity != null) {
                bundle2.putInt("score", initialAssessmentActivity.v0());
                InitialAssessmentActivity initialAssessmentActivity2 = this.f20323v;
                if (initialAssessmentActivity2 != null) {
                    bundle2.putInt("health_score", initialAssessmentActivity2.C.getScore());
                    InitialAssessmentActivity initialAssessmentActivity3 = this.f20323v;
                    if (initialAssessmentActivity3 != null) {
                        bundle2.putInt("symptom_score", initialAssessmentActivity3.D.getScore());
                        InitialAssessmentActivity initialAssessmentActivity4 = this.f20323v;
                        if (initialAssessmentActivity4 != null) {
                            bundle2.putInt("global_score", initialAssessmentActivity4.E.getScore());
                            bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                            InitialAssessmentActivity initialAssessmentActivity5 = this.f20323v;
                            if (initialAssessmentActivity5 != null) {
                                int i6 = initialAssessmentActivity5.K;
                                if (i6 != 0) {
                                    if (i6 != 1) {
                                        bundle2.putInt("day", 28);
                                    } else {
                                        bundle2.putInt("day", 15);
                                    }
                                } else {
                                    bundle2.putInt("day", 0);
                                }
                                User user = FirebasePersistence.getInstance().getUser();
                                if (user != null && (appConfig = user.getAppConfig()) != null) {
                                    obj = appConfig.get(Constants.ONBOARDING_EXPERIMENT);
                                } else {
                                    obj = null;
                                }
                                bundle2.putString("variant", (String) obj);
                                ((RobertoButton) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsDoneButton)).setOnClickListener(new defpackage.a(bundle2, 28, this));
                                String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                                if (currentCourseName != null) {
                                    switch (currentCourseName.hashCode()) {
                                        case -2114782937:
                                            if (currentCourseName.equals(Constants.COURSE_HAPPINESS)) {
                                                RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText1);
                                                InitialAssessmentActivity initialAssessmentActivity6 = this.f20323v;
                                                if (initialAssessmentActivity6 != null) {
                                                    robertoTextView.setText(initialAssessmentActivity6.getString(R.string.assessmentPlanHappinessOp1));
                                                    RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText2);
                                                    InitialAssessmentActivity initialAssessmentActivity7 = this.f20323v;
                                                    if (initialAssessmentActivity7 != null) {
                                                        robertoTextView2.setText(initialAssessmentActivity7.getString(R.string.assessmentPlanHappinessOp2));
                                                        RobertoTextView robertoTextView3 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText3);
                                                        InitialAssessmentActivity initialAssessmentActivity8 = this.f20323v;
                                                        if (initialAssessmentActivity8 != null) {
                                                            robertoTextView3.setText(initialAssessmentActivity8.getString(R.string.assessmentPlanHappinessOp3));
                                                            RobertoTextView robertoTextView4 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText4);
                                                            InitialAssessmentActivity initialAssessmentActivity9 = this.f20323v;
                                                            if (initialAssessmentActivity9 != null) {
                                                                robertoTextView4.setText(initialAssessmentActivity9.getString(R.string.assessmentPlanHappinessOp4));
                                                                RobertoTextView robertoTextView5 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineRememberText);
                                                                InitialAssessmentActivity initialAssessmentActivity10 = this.f20323v;
                                                                if (initialAssessmentActivity10 != null) {
                                                                    robertoTextView5.setText(initialAssessmentActivity10.getString(R.string.assessmentPlanHappinessSupport));
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                                }
                                                            }
                                                            kotlin.jvm.internal.i.q("act");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                            return;
                                        case -1617042330:
                                            if (currentCourseName.equals(Constants.COURSE_DEPRESSION)) {
                                                RobertoTextView robertoTextView6 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText1);
                                                InitialAssessmentActivity initialAssessmentActivity11 = this.f20323v;
                                                if (initialAssessmentActivity11 != null) {
                                                    robertoTextView6.setText(initialAssessmentActivity11.getString(R.string.assessmentPlanDepressionOp1));
                                                    RobertoTextView robertoTextView7 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText2);
                                                    InitialAssessmentActivity initialAssessmentActivity12 = this.f20323v;
                                                    if (initialAssessmentActivity12 != null) {
                                                        robertoTextView7.setText(initialAssessmentActivity12.getString(R.string.assessmentPlanDepressionOp2));
                                                        RobertoTextView robertoTextView8 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText3);
                                                        InitialAssessmentActivity initialAssessmentActivity13 = this.f20323v;
                                                        if (initialAssessmentActivity13 != null) {
                                                            robertoTextView8.setText(initialAssessmentActivity13.getString(R.string.assessmentPlanDepressionOp3));
                                                            RobertoTextView robertoTextView9 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText4);
                                                            InitialAssessmentActivity initialAssessmentActivity14 = this.f20323v;
                                                            if (initialAssessmentActivity14 != null) {
                                                                robertoTextView9.setText(initialAssessmentActivity14.getString(R.string.assessmentPlanDepressionOp4));
                                                                RobertoTextView robertoTextView10 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineRememberText);
                                                                InitialAssessmentActivity initialAssessmentActivity15 = this.f20323v;
                                                                if (initialAssessmentActivity15 != null) {
                                                                    robertoTextView10.setText(initialAssessmentActivity15.getString(R.string.assessmentPlanDepressionSupport));
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                                }
                                                            }
                                                            kotlin.jvm.internal.i.q("act");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                            return;
                                        case -891989580:
                                            if (currentCourseName.equals(Constants.COURSE_STRESS)) {
                                                RobertoTextView robertoTextView11 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText1);
                                                InitialAssessmentActivity initialAssessmentActivity16 = this.f20323v;
                                                if (initialAssessmentActivity16 != null) {
                                                    robertoTextView11.setText(initialAssessmentActivity16.getString(R.string.assessmentPlanStressOp1));
                                                    RobertoTextView robertoTextView12 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText2);
                                                    InitialAssessmentActivity initialAssessmentActivity17 = this.f20323v;
                                                    if (initialAssessmentActivity17 != null) {
                                                        robertoTextView12.setText(initialAssessmentActivity17.getString(R.string.assessmentPlanStressOp2));
                                                        RobertoTextView robertoTextView13 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText3);
                                                        InitialAssessmentActivity initialAssessmentActivity18 = this.f20323v;
                                                        if (initialAssessmentActivity18 != null) {
                                                            robertoTextView13.setText(initialAssessmentActivity18.getString(R.string.assessmentPlanStressOp3));
                                                            RobertoTextView robertoTextView14 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText4);
                                                            InitialAssessmentActivity initialAssessmentActivity19 = this.f20323v;
                                                            if (initialAssessmentActivity19 != null) {
                                                                robertoTextView14.setText(initialAssessmentActivity19.getString(R.string.assessmentPlanStressOp4));
                                                                RobertoTextView robertoTextView15 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineRememberText);
                                                                InitialAssessmentActivity initialAssessmentActivity20 = this.f20323v;
                                                                if (initialAssessmentActivity20 != null) {
                                                                    robertoTextView15.setText(initialAssessmentActivity20.getString(R.string.assessmentPlanStressSupport));
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                                }
                                                            }
                                                            kotlin.jvm.internal.i.q("act");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                            return;
                                        case 92960775:
                                            if (currentCourseName.equals(Constants.COURSE_ANGER)) {
                                                RobertoTextView robertoTextView16 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText1);
                                                InitialAssessmentActivity initialAssessmentActivity21 = this.f20323v;
                                                if (initialAssessmentActivity21 != null) {
                                                    robertoTextView16.setText(initialAssessmentActivity21.getString(R.string.assessmentPlanAngerOp1));
                                                    RobertoTextView robertoTextView17 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText2);
                                                    InitialAssessmentActivity initialAssessmentActivity22 = this.f20323v;
                                                    if (initialAssessmentActivity22 != null) {
                                                        robertoTextView17.setText(initialAssessmentActivity22.getString(R.string.assessmentPlanAngerOp2));
                                                        RobertoTextView robertoTextView18 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText3);
                                                        InitialAssessmentActivity initialAssessmentActivity23 = this.f20323v;
                                                        if (initialAssessmentActivity23 != null) {
                                                            robertoTextView18.setText(initialAssessmentActivity23.getString(R.string.assessmentPlanAngerOp3));
                                                            RobertoTextView robertoTextView19 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText4);
                                                            InitialAssessmentActivity initialAssessmentActivity24 = this.f20323v;
                                                            if (initialAssessmentActivity24 != null) {
                                                                robertoTextView19.setText(initialAssessmentActivity24.getString(R.string.assessmentPlanAngerOp4));
                                                                RobertoTextView robertoTextView20 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineRememberText);
                                                                InitialAssessmentActivity initialAssessmentActivity25 = this.f20323v;
                                                                if (initialAssessmentActivity25 != null) {
                                                                    robertoTextView20.setText(initialAssessmentActivity25.getString(R.string.assessmentPlanAngerSupport));
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                                }
                                                            }
                                                            kotlin.jvm.internal.i.q("act");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                            return;
                                        case 109522647:
                                            if (currentCourseName.equals(Constants.COURSE_SLEEP)) {
                                                RobertoTextView robertoTextView21 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText1);
                                                InitialAssessmentActivity initialAssessmentActivity26 = this.f20323v;
                                                if (initialAssessmentActivity26 != null) {
                                                    robertoTextView21.setText(initialAssessmentActivity26.getString(R.string.assessmentPlanSleepOp1));
                                                    RobertoTextView robertoTextView22 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText2);
                                                    InitialAssessmentActivity initialAssessmentActivity27 = this.f20323v;
                                                    if (initialAssessmentActivity27 != null) {
                                                        robertoTextView22.setText(initialAssessmentActivity27.getString(R.string.assessmentPlanSleepOp2));
                                                        RobertoTextView robertoTextView23 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText3);
                                                        InitialAssessmentActivity initialAssessmentActivity28 = this.f20323v;
                                                        if (initialAssessmentActivity28 != null) {
                                                            robertoTextView23.setText(initialAssessmentActivity28.getString(R.string.assessmentPlanSleepOp3));
                                                            RobertoTextView robertoTextView24 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText4);
                                                            InitialAssessmentActivity initialAssessmentActivity29 = this.f20323v;
                                                            if (initialAssessmentActivity29 != null) {
                                                                robertoTextView24.setText(initialAssessmentActivity29.getString(R.string.assessmentPlanSleepOp4));
                                                                RobertoTextView robertoTextView25 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineRememberText);
                                                                InitialAssessmentActivity initialAssessmentActivity30 = this.f20323v;
                                                                if (initialAssessmentActivity30 != null) {
                                                                    robertoTextView25.setText(initialAssessmentActivity30.getString(R.string.assessmentPlanSleepSupport));
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                                }
                                                            }
                                                            kotlin.jvm.internal.i.q("act");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                            return;
                                        case 113319009:
                                            if (currentCourseName.equals(Constants.COURSE_WORRY)) {
                                                RobertoTextView robertoTextView26 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText1);
                                                InitialAssessmentActivity initialAssessmentActivity31 = this.f20323v;
                                                if (initialAssessmentActivity31 != null) {
                                                    robertoTextView26.setText(initialAssessmentActivity31.getString(R.string.assessmentPlanAnxietyOp1));
                                                    RobertoTextView robertoTextView27 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText2);
                                                    InitialAssessmentActivity initialAssessmentActivity32 = this.f20323v;
                                                    if (initialAssessmentActivity32 != null) {
                                                        robertoTextView27.setText(initialAssessmentActivity32.getString(R.string.assessmentPlanAnxietyOp2));
                                                        RobertoTextView robertoTextView28 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText3);
                                                        InitialAssessmentActivity initialAssessmentActivity33 = this.f20323v;
                                                        if (initialAssessmentActivity33 != null) {
                                                            robertoTextView28.setText(initialAssessmentActivity33.getString(R.string.assessmentPlanAnxietyOp3));
                                                            RobertoTextView robertoTextView29 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineText4);
                                                            InitialAssessmentActivity initialAssessmentActivity34 = this.f20323v;
                                                            if (initialAssessmentActivity34 != null) {
                                                                robertoTextView29.setText(initialAssessmentActivity34.getString(R.string.assessmentPlanAnxietyOp4));
                                                                RobertoTextView robertoTextView30 = (RobertoTextView) _$_findCachedViewById(R.id.initialAssessmentCourseDetailsRoutineRememberText);
                                                                InitialAssessmentActivity initialAssessmentActivity35 = this.f20323v;
                                                                if (initialAssessmentActivity35 != null) {
                                                                    robertoTextView30.setText(initialAssessmentActivity35.getString(R.string.assessmentPlanAnxietySupport));
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.i.q("act");
                                                                    throw null;
                                                                }
                                                            }
                                                            kotlin.jvm.internal.i.q("act");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.i.q("act");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.i.q("act");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.i.q("act");
                                                throw null;
                                            }
                                            return;
                                        default:
                                            return;
                                    }
                                }
                                return;
                            }
                            kotlin.jvm.internal.i.q("act");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("act");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("act");
                    throw null;
                }
                kotlin.jvm.internal.i.q("act");
                throw null;
            }
            kotlin.jvm.internal.i.q("act");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20322u, e10);
        }
    }
}
