package ik;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.transition.TransitionInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: InitialAssessmentParentQuestionFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lik/d1;", "Lrr/b;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d1 extends rr.b implements View.OnClickListener {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f20157z = 0;

    /* renamed from: x  reason: collision with root package name */
    public final String f20161x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f20162y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20158u = LogHelper.INSTANCE.makeLogTag(d1.class);

    /* renamed from: v  reason: collision with root package name */
    public String f20159v = "";

    /* renamed from: w  reason: collision with root package name */
    public String f20160w = "";

    public d1() {
        String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
        kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
        this.f20161x = currentCourseName;
    }

    public final void J(RobertoTextView robertoTextView, int i6, int i10) {
        View _$_findCachedViewById;
        try {
            if (i6 == 0) {
                _$_findCachedViewById = _$_findCachedViewById(R.id.response1);
            } else {
                _$_findCachedViewById = _$_findCachedViewById(R.id.response2);
            }
            ((RobertoTextView) _$_findCachedViewById).setTransitionName("response_transition");
            robertoTextView.setBackgroundResource(R.drawable.background_stroke_blue_corner_5dp);
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            robertoTextView.setTextColor(g0.a.b(context, R.color.sea));
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            String obj = robertoTextView.getText().toString();
            kotlin.jvm.internal.i.g(obj, "<set-?>");
            ((InitialAssessmentActivity) activity).F = obj;
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            String str = this.f20159v;
            kotlin.jvm.internal.i.d(str);
            String str2 = this.f20160w;
            kotlin.jvm.internal.i.d(str2);
            ((InitialAssessmentActivity) activity2).A0(i10, str, str2);
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ((InitialAssessmentActivity) activity3).x0();
            if (i6 == 2) {
                androidx.fragment.app.p activity4 = getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                ((InitialAssessmentActivity) activity4).x0();
            }
            androidx.fragment.app.p activity5 = getActivity();
            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ((InitialAssessmentActivity) activity5).setSharedResponse(robertoTextView);
            androidx.fragment.app.p activity6 = getActivity();
            kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ((InitialAssessmentActivity) activity6).t0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20158u, "Error selecting response", e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20162y;
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = 0;
        if (kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response1))) {
            RobertoTextView response1 = (RobertoTextView) _$_findCachedViewById(R.id.response1);
            kotlin.jvm.internal.i.f(response1, "response1");
            J(response1, 0, -1);
        } else if (kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response2))) {
            RobertoTextView response2 = (RobertoTextView) _$_findCachedViewById(R.id.response2);
            kotlin.jvm.internal.i.f(response2, "response2");
            J(response2, 1, -1);
        } else if (kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response3))) {
            RobertoTextView response3 = (RobertoTextView) _$_findCachedViewById(R.id.response3);
            kotlin.jvm.internal.i.f(response3, "response3");
            if (kotlin.jvm.internal.i.b(this.f20161x, Constants.COURSE_HAPPINESS)) {
                i6 = 4;
            }
            J(response3, 2, i6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            this.f20159v = arguments.getString("question_type");
            Bundle arguments2 = getArguments();
            kotlin.jvm.internal.i.d(arguments2);
            this.f20160w = arguments2.getString("symptom");
            postponeEnterTransition();
            setSharedElementEnterTransition(TransitionInflater.from(getContext()).inflateTransition(17760257));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20158u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_initial_assessment_parent_question, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20162y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
            kotlin.jvm.internal.i.f(header, "header");
            insetsUtils.addStatusBarHeight(header);
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            int i6 = arguments.getInt("index");
            Bundle arguments2 = getArguments();
            kotlin.jvm.internal.i.d(arguments2);
            int i10 = arguments2.getInt(Constants.SCREEN_PROGRESS);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ArrayList<String> responseOptions = ((InitialAssessmentActivity) activity).f10606z.get(i10).get(i6).getResponseOptions();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(((InitialAssessmentActivity) activity2).f10606z.get(i10).get(i6).getTitle());
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            if (((InitialAssessmentActivity) activity3).f10606z.get(i10).get(i6).getSubtitle() != null) {
                ((RobertoTextView) _$_findCachedViewById(R.id.questionDesc)).setVisibility(0);
                androidx.fragment.app.p activity4 = getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                ((RobertoTextView) _$_findCachedViewById(R.id.questionDesc)).setText(((InitialAssessmentActivity) activity4).f10606z.get(i10).get(i6).getSubtitle());
            } else {
                ((RobertoTextView) _$_findCachedViewById(R.id.questionDesc)).setVisibility(8);
            }
            ((RobertoTextView) _$_findCachedViewById(R.id.response1)).setText(responseOptions.get(0));
            ((RobertoTextView) _$_findCachedViewById(R.id.response2)).setText(responseOptions.get(1));
            ((RobertoTextView) _$_findCachedViewById(R.id.response3)).setText(responseOptions.get(2));
            new Handler().postDelayed(new je.o(21, this), 600L);
            startPostponedEnterTransition();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20158u, e10);
        }
    }
}
