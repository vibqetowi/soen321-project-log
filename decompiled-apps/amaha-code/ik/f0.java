package ik;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ExptInitialAssessmentReassessmentFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/f0;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f0 extends rr.b {

    /* renamed from: v  reason: collision with root package name */
    public AssessmentListener f20177v;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f20178w = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20176u = LogHelper.INSTANCE.makeLogTag(f0.class);

    /* compiled from: ExptInitialAssessmentReassessmentFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<hs.k> {
        public a() {
            super(0);
        }

        @Override // ss.a
        public final hs.k invoke() {
            Integer num;
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            final f0 f0Var = f0.this;
            AppCompatImageView backButton = (AppCompatImageView) f0Var._$_findCachedViewById(R.id.backButton);
            kotlin.jvm.internal.i.f(backButton, "backButton");
            insetsUtils.addStatusBarHeight(backButton);
            AppCompatImageView headerImage = (AppCompatImageView) f0Var._$_findCachedViewById(R.id.headerImage);
            kotlin.jvm.internal.i.f(headerImage, "headerImage");
            insetsUtils.addStatusBarHeight(headerImage);
            ((RobertoButton) f0Var._$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new View.OnClickListener() { // from class: ik.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    f0 this$0 = f0Var;
                    switch (i6) {
                        case 0:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AssessmentListener assessmentListener = this$0.f20177v;
                            if (assessmentListener != null) {
                                m0 m0Var = new m0();
                                Bundle arguments = this$0.getArguments();
                                if (arguments != null) {
                                    m0Var.setArguments(arguments);
                                }
                                assessmentListener.goToNextScreen(m0Var);
                                return;
                            }
                            return;
                        default:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AssessmentListener assessmentListener2 = this$0.f20177v;
                            if (assessmentListener2 != null) {
                                AssessmentListener.DefaultImpls.onExit$default(assessmentListener2, false, true, false, 5, null);
                                return;
                            }
                            return;
                    }
                }
            });
            ((AppCompatImageView) f0Var._$_findCachedViewById(R.id.backButton)).setOnClickListener(new View.OnClickListener() { // from class: ik.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = r2;
                    f0 this$0 = f0Var;
                    switch (i6) {
                        case 0:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AssessmentListener assessmentListener = this$0.f20177v;
                            if (assessmentListener != null) {
                                m0 m0Var = new m0();
                                Bundle arguments = this$0.getArguments();
                                if (arguments != null) {
                                    m0Var.setArguments(arguments);
                                }
                                assessmentListener.goToNextScreen(m0Var);
                                return;
                            }
                            return;
                        default:
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AssessmentListener assessmentListener2 = this$0.f20177v;
                            if (assessmentListener2 != null) {
                                AssessmentListener.DefaultImpls.onExit$default(assessmentListener2, false, true, false, 5, null);
                                return;
                            }
                            return;
                    }
                }
            });
            Bundle arguments = f0Var.getArguments();
            if (arguments != null) {
                num = Integer.valueOf(arguments.getInt("dayPlanPosition"));
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 15) {
                ((RobertoTextView) f0Var._$_findCachedViewById(R.id.header)).setText(f0Var.getString(R.string.reassessmentMidHeader));
                ((RobertoTextView) f0Var._$_findCachedViewById(R.id.subheader)).setText(f0Var.getString(R.string.reassessmentMidSubheader));
                ((RobertoTextView) f0Var._$_findCachedViewById(R.id.prompt)).setText(f0Var.getString(R.string.reassessmentMidPrompt));
                ((RobertoButton) f0Var._$_findCachedViewById(R.id.continueCTA)).setText(f0Var.getString(R.string.initial_assessment_activity_btn));
            } else {
                ((RobertoTextView) f0Var._$_findCachedViewById(R.id.header)).setText(f0Var.getString(R.string.reassessmentEndHeader));
                ((RobertoTextView) f0Var._$_findCachedViewById(R.id.subheader)).setText(f0Var.getString(R.string.reassessmentEndPrompt));
                ((RobertoTextView) f0Var._$_findCachedViewById(R.id.prompt)).setText(f0Var.getString(R.string.reassessmentEndSubheader));
                ((RobertoButton) f0Var._$_findCachedViewById(R.id.continueCTA)).setText(f0Var.getString(R.string.lets_start));
            }
            return hs.k.f19476a;
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20178w;
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
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof AssessmentListener) {
            this.f20177v = (AssessmentListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_condition_selection_reassessment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20178w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        UtilsKt.logError$default(this.f20176u, null, new a(), 2, null);
    }
}
