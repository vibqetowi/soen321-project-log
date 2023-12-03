package ik;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: InitialAssessmentTitlesFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/q1;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class q1 extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f20277x = 0;

    /* renamed from: v  reason: collision with root package name */
    public InitialAssessmentActivity f20279v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f20280w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20278u = LogHelper.INSTANCE.makeLogTag(q1.class);

    public final InitialAssessmentActivity J() {
        InitialAssessmentActivity initialAssessmentActivity = this.f20279v;
        if (initialAssessmentActivity != null) {
            return initialAssessmentActivity;
        }
        kotlin.jvm.internal.i.q("act");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20280w;
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
        return inflater.inflate(R.layout.fragment_initial_assessment_titles, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20280w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            this.f20279v = (InitialAssessmentActivity) activity;
            new Handler().postDelayed(new Runnable(this) { // from class: ik.p1

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ q1 f20272v;

                {
                    this.f20272v = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i6 = r2;
                    q1 this$0 = this.f20272v;
                    switch (i6) {
                        case 0:
                            int i10 = q1.f20277x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.isAdded()) {
                                InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
                                RobertoTextView header = (RobertoTextView) this$0._$_findCachedViewById(R.id.header);
                                kotlin.jvm.internal.i.f(header, "header");
                                insetsUtils.addStatusBarHeight(header);
                                return;
                            }
                            return;
                        default:
                            int i11 = q1.f20277x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.isAdded()) {
                                ((RobertoButton) this$0._$_findCachedViewById(R.id.btnContinue)).setOnClickListener(new w5.i0(19, this$0));
                                return;
                            }
                            return;
                    }
                }
            }, 50L);
            int i6 = requireArguments().getInt("index");
            int i10 = requireArguments().getInt(Constants.SCREEN_PROGRESS);
            String string = requireArguments().getString("course");
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(J().f10606z.get(i10).get(i6).getTitle());
            ((RobertoTextView) _$_findCachedViewById(R.id.assessmentDesc)).setText(J().f10606z.get(i10).get(i6).getSubtitle());
            ((RobertoButton) _$_findCachedViewById(R.id.btnContinue)).setText(J().f10606z.get(i10).get(i6).getBtnText());
            try {
                if (kotlin.jvm.internal.i.b(string, Constants.COURSE_SLEEP)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.symptomAssessmentTitle)).setText(J().getString(R.string.IndicatorAssessment));
                }
                if (kotlin.jvm.internal.i.b(string, Constants.COURSE_HAPPINESS)) {
                    ((RobertoTextView) _$_findCachedViewById(R.id.symptomAssessmentTitle)).setText(J().getString(R.string.factorAssessment));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e("Exception when retrieving course name from bundle", e10);
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            int i11 = J().K;
            if (i11 != 0) {
                if (i11 != 1) {
                    bundle2.putInt("day", 28);
                } else {
                    bundle2.putInt("day", 15);
                }
            } else {
                bundle2.putInt("day", 0);
            }
            bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
            bundle2.putString("variant", (String) FirebasePersistence.getInstance().getUser().getAppConfig().get(Constants.ONBOARDING_EXPERIMENT));
            if (i10 != 1) {
                if (i10 == 2) {
                    ((AppCompatImageView) _$_findCachedViewById(R.id.healthAssessmentImageFore)).setImageResource(R.drawable.ic_check_default);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.healthAssessmentImage)).setImageResource(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.healthAssessmentTitle)).setTextColor(g0.a.b(J(), R.color.sea));
                    ((RobertoTextView) _$_findCachedViewById(R.id.healthAssessmentDuration)).setTextColor(g0.a.b(J(), R.color.sea));
                    ((AppCompatImageView) _$_findCachedViewById(R.id.symptomAssessmentImageFore)).setImageResource(R.drawable.ic_check_default);
                    ((AppCompatImageView) _$_findCachedViewById(R.id.symptomAssessmentImage)).setImageResource(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.symptomAssessmentTitle)).setTextColor(g0.a.b(J(), R.color.sea));
                    ((RobertoTextView) _$_findCachedViewById(R.id.symptomAssessmentDuration)).setTextColor(g0.a.b(J(), R.color.sea));
                    if (J().G) {
                        J().v0();
                        bundle2.putInt("score", J().E.getScore());
                        gk.a.b(bundle2, "global_assessment_finish");
                    } else {
                        J().v0();
                        bundle2.putInt("score", J().D.getScore());
                        gk.a.b(bundle2, "symptpm_assessment_finish");
                    }
                }
            } else {
                J().v0();
                bundle2.putInt("score", J().C.getScore());
                gk.a.b(bundle2, "health_assessment_finish");
                ((AppCompatImageView) _$_findCachedViewById(R.id.healthAssessmentImageFore)).setImageResource(R.drawable.ic_check_default);
                ((AppCompatImageView) _$_findCachedViewById(R.id.healthAssessmentImage)).setImageResource(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.healthAssessmentTitle)).setTextColor(g0.a.b(J(), R.color.sea));
                ((RobertoTextView) _$_findCachedViewById(R.id.healthAssessmentDuration)).setTextColor(g0.a.b(J(), R.color.sea));
            }
            if (J().G) {
                ((AppCompatImageView) _$_findCachedViewById(R.id.globalAssessmentImageFore)).setImageResource(R.drawable.ic_check_default);
                ((AppCompatImageView) _$_findCachedViewById(R.id.globalAssessmentImage)).setImageResource(0);
                ((RobertoTextView) _$_findCachedViewById(R.id.globalAssessmentTitle)).setTextColor(g0.a.b(J(), R.color.sea));
                ((RobertoTextView) _$_findCachedViewById(R.id.globalAssessmentDuration)).setTextColor(g0.a.b(J(), R.color.sea));
                ((RobertoButton) _$_findCachedViewById(R.id.btnContinue)).setBackgroundResource(R.drawable.button_blue_high_contrast);
                new Handler().postDelayed(new Runnable(this) { // from class: ik.p1

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ q1 f20272v;

                    {
                        this.f20272v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i62 = r2;
                        q1 this$0 = this.f20272v;
                        switch (i62) {
                            case 0:
                                int i102 = q1.f20277x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.isAdded()) {
                                    InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
                                    RobertoTextView header = (RobertoTextView) this$0._$_findCachedViewById(R.id.header);
                                    kotlin.jvm.internal.i.f(header, "header");
                                    insetsUtils.addStatusBarHeight(header);
                                    return;
                                }
                                return;
                            default:
                                int i112 = q1.f20277x;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                if (this$0.isAdded()) {
                                    ((RobertoButton) this$0._$_findCachedViewById(R.id.btnContinue)).setOnClickListener(new w5.i0(19, this$0));
                                    return;
                                }
                                return;
                        }
                    }
                }, 600L);
                return;
            }
            new Handler().postDelayed(new s7.b(this, i10, bundle2, 2), 600L);
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f20278u, e11);
        }
    }
}
