package ik;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
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
/* compiled from: InitialAssessmentQuestionFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lik/h1;", "Lrr/b;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h1 extends rr.b implements View.OnClickListener {
    public static final /* synthetic */ int A = 0;

    /* renamed from: y  reason: collision with root package name */
    public final String f20195y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f20196z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20191u = LogHelper.INSTANCE.makeLogTag(h1.class);

    /* renamed from: v  reason: collision with root package name */
    public String f20192v = "";

    /* renamed from: w  reason: collision with root package name */
    public String f20193w = "";

    /* renamed from: x  reason: collision with root package name */
    public String f20194x = "";

    public h1() {
        String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
        kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
        this.f20195y = currentCourseName;
    }

    public final void J(RobertoTextView robertoTextView, int i6) {
        String str;
        try {
            robertoTextView.setBackgroundResource(R.drawable.background_stroke_blue_corner_5dp);
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            robertoTextView.setTextColor(g0.a.b(context, R.color.sea));
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            InitialAssessmentActivity initialAssessmentActivity = (InitialAssessmentActivity) activity;
            String str2 = this.f20192v;
            kotlin.jvm.internal.i.d(str2);
            String str3 = this.f20194x;
            if (str3 != null && !kotlin.jvm.internal.i.b(str3, "")) {
                str = this.f20194x;
            } else {
                str = this.f20193w;
            }
            kotlin.jvm.internal.i.d(str);
            initialAssessmentActivity.A0(i6, str2, str);
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ((InitialAssessmentActivity) activity2).x0();
            androidx.fragment.app.p activity3 = getActivity();
            kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            ((InitialAssessmentActivity) activity3).t0();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20191u, e10);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20196z;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        boolean z10;
        boolean b10;
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
        int i6 = 1;
        int i10 = 0;
        if (((InitialAssessmentActivity) activity).B == 0) {
            androidx.fragment.app.p activity2 = getActivity();
            kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
            if (((InitialAssessmentActivity) activity2).A == 6) {
                z10 = true;
                b10 = kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response1));
                String str = this.f20195y;
                if (!b10) {
                    RobertoTextView response1 = (RobertoTextView) _$_findCachedViewById(R.id.response1);
                    kotlin.jvm.internal.i.f(response1, "response1");
                    if (kotlin.jvm.internal.i.b(str, Constants.COURSE_HAPPINESS) && z10) {
                        i10 = 4;
                    }
                    J(response1, i10);
                    return;
                } else if (kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response2))) {
                    RobertoTextView response2 = (RobertoTextView) _$_findCachedViewById(R.id.response2);
                    kotlin.jvm.internal.i.f(response2, "response2");
                    if (kotlin.jvm.internal.i.b(str, Constants.COURSE_HAPPINESS) && z10) {
                        i6 = 3;
                    }
                    J(response2, i6);
                    return;
                } else if (kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response3))) {
                    RobertoTextView response3 = (RobertoTextView) _$_findCachedViewById(R.id.response3);
                    kotlin.jvm.internal.i.f(response3, "response3");
                    J(response3, 2);
                    return;
                } else if (kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response4))) {
                    RobertoTextView response4 = (RobertoTextView) _$_findCachedViewById(R.id.response4);
                    kotlin.jvm.internal.i.f(response4, "response4");
                    J(response4, (kotlin.jvm.internal.i.b(str, Constants.COURSE_HAPPINESS) && z10) ? 3 : 3);
                    return;
                } else if (kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response5))) {
                    RobertoTextView response5 = (RobertoTextView) _$_findCachedViewById(R.id.response5);
                    kotlin.jvm.internal.i.f(response5, "response5");
                    J(response5, (kotlin.jvm.internal.i.b(str, Constants.COURSE_HAPPINESS) && z10) ? 4 : 4);
                    return;
                } else {
                    return;
                }
            }
        }
        z10 = false;
        b10 = kotlin.jvm.internal.i.b(view, (RobertoTextView) _$_findCachedViewById(R.id.response1));
        String str2 = this.f20195y;
        if (!b10) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_initial_assessment_question, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20196z.clear();
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
            Bundle arguments3 = getArguments();
            kotlin.jvm.internal.i.d(arguments3);
            this.f20192v = arguments3.getString("question_type");
            Bundle arguments4 = getArguments();
            kotlin.jvm.internal.i.d(arguments4);
            this.f20193w = arguments4.getString("symptom");
            Bundle arguments5 = getArguments();
            kotlin.jvm.internal.i.d(arguments5);
            this.f20194x = arguments5.getString("slug");
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
            ((RobertoTextView) _$_findCachedViewById(R.id.response4)).setText(responseOptions.get(3));
            ((RobertoTextView) _$_findCachedViewById(R.id.response5)).setText(responseOptions.get(4));
            new Handler().postDelayed(new je.o(22, this), 600L);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f20191u, e10);
        }
    }
}
