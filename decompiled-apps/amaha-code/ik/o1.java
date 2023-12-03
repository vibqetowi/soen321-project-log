package ik;

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
/* compiled from: InitialAssessmentSubquestionFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lik/o1;", "Lrr/b;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o1 extends rr.b implements View.OnClickListener {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f20262z = 0;

    /* renamed from: x  reason: collision with root package name */
    public final String f20266x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap f20267y = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20263u = LogHelper.INSTANCE.makeLogTag(o1.class);

    /* renamed from: v  reason: collision with root package name */
    public String f20264v = "";

    /* renamed from: w  reason: collision with root package name */
    public String f20265w = "";

    public o1() {
        String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
        kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
        this.f20266x = currentCourseName;
    }

    public final void J(RobertoTextView robertoTextView, int i6) {
        robertoTextView.setBackgroundResource(R.drawable.background_stroke_blue_corner_5dp);
        robertoTextView.setTextColor(g0.a.b(requireContext(), R.color.sea));
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
        String str = this.f20264v;
        kotlin.jvm.internal.i.d(str);
        String str2 = this.f20265w;
        kotlin.jvm.internal.i.d(str2);
        ((InitialAssessmentActivity) activity).A0(i6, str, str2);
        androidx.fragment.app.p activity2 = getActivity();
        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
        ((InitialAssessmentActivity) activity2).x0();
        androidx.fragment.app.p activity3 = getActivity();
        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
        ((InitialAssessmentActivity) activity3).t0();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20267y;
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
        int i6;
        boolean b10 = kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response1));
        int i10 = 3;
        String str = this.f20266x;
        if (b10) {
            RobertoTextView response1 = (RobertoTextView) _$_findCachedViewById(R.id.response1);
            kotlin.jvm.internal.i.f(response1, "response1");
            if (!kotlin.jvm.internal.i.b(str, Constants.COURSE_HAPPINESS)) {
                i10 = 1;
            }
            J(response1, i10);
        } else if (kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response2))) {
            RobertoTextView response2 = (RobertoTextView) _$_findCachedViewById(R.id.response2);
            kotlin.jvm.internal.i.f(response2, "response2");
            J(response2, 2);
        } else if (kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response3))) {
            RobertoTextView response3 = (RobertoTextView) _$_findCachedViewById(R.id.response3);
            kotlin.jvm.internal.i.f(response3, "response3");
            if (kotlin.jvm.internal.i.b(str, Constants.COURSE_HAPPINESS)) {
                i10 = 1;
            }
            J(response3, i10);
        } else if (kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response4))) {
            RobertoTextView response4 = (RobertoTextView) _$_findCachedViewById(R.id.response4);
            kotlin.jvm.internal.i.f(response4, "response4");
            if (kotlin.jvm.internal.i.b(str, Constants.COURSE_HAPPINESS)) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            J(response4, i6);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20264v = requireArguments().getString("question_type");
        this.f20265w = requireArguments().getString("symptom");
        postponeEnterTransition();
        setSharedElementEnterTransition(TransitionInflater.from(getContext()).inflateTransition(17760257));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_initial_assessment_subquestion, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20267y.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView parentQuestion = (RobertoTextView) _$_findCachedViewById(R.id.parentQuestion);
            kotlin.jvm.internal.i.f(parentQuestion, "parentQuestion");
            insetsUtils.addStatusBarHeight(parentQuestion);
            int i6 = requireArguments().getInt("index");
            int i10 = requireArguments().getInt(Constants.SCREEN_PROGRESS);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ArrayList<String> responseOptions = ((InitialAssessmentActivity) activity).f10606z.get(i10).get(i6).getResponseOptions();
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(((InitialAssessmentActivity) activity2).f10606z.get(i10).get(i6).getTitle());
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ((RobertoTextView) _$_findCachedViewById(R.id.parentQuestion)).setText(((InitialAssessmentActivity) activity3).F);
            ((RobertoTextView) _$_findCachedViewById(R.id.parentQuestion)).setTransitionName("response_transition");
            ((RobertoTextView) _$_findCachedViewById(R.id.response1)).setText(responseOptions.get(0));
            ((RobertoTextView) _$_findCachedViewById(R.id.response2)).setText(responseOptions.get(1));
            ((RobertoTextView) _$_findCachedViewById(R.id.response3)).setText(responseOptions.get(2));
            ((RobertoTextView) _$_findCachedViewById(R.id.response4)).setText(responseOptions.get(3));
            new Handler().postDelayed(new je.o(24, this), 600L);
            startPostponedEnterTransition();
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(FirebasePersistence.getInstance().getUser().getVersion());
            sb2.append(", ");
            sb2.append(FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            sb2.append(", ");
            sb2.append(requireArguments().getInt("index"));
            sb2.append(", ");
            sb2.append(requireArguments().getInt(Constants.SCREEN_PROGRESS));
            sb2.append(", ");
            androidx.fragment.app.p activity4 = getActivity();
            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            sb2.append(((InitialAssessmentActivity) activity4).F);
            LogHelper.INSTANCE.e(this.f20263u, sb2.toString(), e10);
        }
    }
}
