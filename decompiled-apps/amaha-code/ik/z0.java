package ik;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: InitialAssessmentExploreFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/z0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class z0 extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f20350v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f20351u = new LinkedHashMap();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20351u;
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
        return inflater.inflate(R.layout.fragment_initial_assessment_explore, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20351u.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
        kotlin.jvm.internal.i.f(header, "header");
        insetsUtils.addStatusBarHeight(header);
        ((ConstraintLayout) _$_findCachedViewById(R.id.option1)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.y0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ z0 f20347v;

            {
                this.f20347v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                z0 this$0 = this.f20347v;
                switch (i6) {
                    case 0:
                        int i10 = z0.f20350v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        this$0.startActivity(new Intent((InitialAssessmentActivity) activity, TelecommunicationsPWAActivity.class));
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        ((InitialAssessmentActivity) activity2).n0();
                        return;
                    case 1:
                        int i11 = z0.f20350v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Utils utils = Utils.INSTANCE;
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        if (utils.checkConnectivity((InitialAssessmentActivity) activity3)) {
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            this$0.startActivity(tr.r.r((InitialAssessmentActivity) activity4));
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            ((InitialAssessmentActivity) activity5).n0();
                            return;
                        }
                        return;
                    default:
                        int i12 = z0.f20350v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity6 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        ((InitialAssessmentActivity) activity6).t0();
                        return;
                }
            }
        });
        ((ConstraintLayout) _$_findCachedViewById(R.id.option2)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.y0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ z0 f20347v;

            {
                this.f20347v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                z0 this$0 = this.f20347v;
                switch (i6) {
                    case 0:
                        int i10 = z0.f20350v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        this$0.startActivity(new Intent((InitialAssessmentActivity) activity, TelecommunicationsPWAActivity.class));
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        ((InitialAssessmentActivity) activity2).n0();
                        return;
                    case 1:
                        int i11 = z0.f20350v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Utils utils = Utils.INSTANCE;
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        if (utils.checkConnectivity((InitialAssessmentActivity) activity3)) {
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            this$0.startActivity(tr.r.r((InitialAssessmentActivity) activity4));
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            ((InitialAssessmentActivity) activity5).n0();
                            return;
                        }
                        return;
                    default:
                        int i12 = z0.f20350v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity6 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        ((InitialAssessmentActivity) activity6).t0();
                        return;
                }
            }
        });
        ((ConstraintLayout) _$_findCachedViewById(R.id.option3)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.y0

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ z0 f20347v;

            {
                this.f20347v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                z0 this$0 = this.f20347v;
                switch (i6) {
                    case 0:
                        int i10 = z0.f20350v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        this$0.startActivity(new Intent((InitialAssessmentActivity) activity, TelecommunicationsPWAActivity.class));
                        androidx.fragment.app.p activity2 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        ((InitialAssessmentActivity) activity2).n0();
                        return;
                    case 1:
                        int i11 = z0.f20350v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        Utils utils = Utils.INSTANCE;
                        androidx.fragment.app.p activity3 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        if (utils.checkConnectivity((InitialAssessmentActivity) activity3)) {
                            androidx.fragment.app.p activity4 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            this$0.startActivity(tr.r.r((InitialAssessmentActivity) activity4));
                            androidx.fragment.app.p activity5 = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity5, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                            ((InitialAssessmentActivity) activity5).n0();
                            return;
                        }
                        return;
                    default:
                        int i12 = z0.f20350v;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        androidx.fragment.app.p activity6 = this$0.getActivity();
                        kotlin.jvm.internal.i.e(activity6, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                        ((InitialAssessmentActivity) activity6).t0();
                        return;
                }
            }
        });
    }
}
