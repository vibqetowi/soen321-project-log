package ik;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ExptInitialAssessmentExploreFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/o;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class o extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f20258w = 0;

    /* renamed from: u  reason: collision with root package name */
    public AssessmentListener f20259u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f20260v = new LinkedHashMap();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20260v;
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
            this.f20259u = (AssessmentListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_initial_assessment_explore, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20260v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ConstraintLayout constraintLayout;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        RobertoTextView header = (RobertoTextView) _$_findCachedViewById(R.id.header);
        kotlin.jvm.internal.i.f(header, "header");
        insetsUtils.addStatusBarHeight(header);
        ((ConstraintLayout) _$_findCachedViewById(R.id.option1)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.n

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ o f20250v;

            {
                this.f20250v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                o this$0 = this.f20250v;
                switch (i6) {
                    case 0:
                        int i10 = o.f20258w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0.requireContext(), TelecommunicationsPWAActivity.class));
                        AssessmentListener assessmentListener = this$0.f20259u;
                        if (assessmentListener != null) {
                            AssessmentListener.DefaultImpls.onExit$default(assessmentListener, false, false, false, 7, null);
                            return;
                        }
                        return;
                    case 1:
                        int i11 = o.f20258w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (Utils.INSTANCE.checkConnectivity(this$0.requireContext())) {
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                            this$0.startActivity(tr.r.r(requireActivity));
                            AssessmentListener assessmentListener2 = this$0.f20259u;
                            if (assessmentListener2 != null) {
                                AssessmentListener.DefaultImpls.onExit$default(assessmentListener2, false, false, false, 7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i12 = o.f20258w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        AssessmentListener assessmentListener3 = this$0.f20259u;
                        if (assessmentListener3 != null) {
                            AssessmentListener.DefaultImpls.onExit$default(assessmentListener3, false, false, true, 3, null);
                            return;
                        }
                        return;
                }
            }
        });
        ((ConstraintLayout) _$_findCachedViewById(R.id.option2)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.n

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ o f20250v;

            {
                this.f20250v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                o this$0 = this.f20250v;
                switch (i6) {
                    case 0:
                        int i10 = o.f20258w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0.requireContext(), TelecommunicationsPWAActivity.class));
                        AssessmentListener assessmentListener = this$0.f20259u;
                        if (assessmentListener != null) {
                            AssessmentListener.DefaultImpls.onExit$default(assessmentListener, false, false, false, 7, null);
                            return;
                        }
                        return;
                    case 1:
                        int i11 = o.f20258w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (Utils.INSTANCE.checkConnectivity(this$0.requireContext())) {
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                            this$0.startActivity(tr.r.r(requireActivity));
                            AssessmentListener assessmentListener2 = this$0.f20259u;
                            if (assessmentListener2 != null) {
                                AssessmentListener.DefaultImpls.onExit$default(assessmentListener2, false, false, false, 7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i12 = o.f20258w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        AssessmentListener assessmentListener3 = this$0.f20259u;
                        if (assessmentListener3 != null) {
                            AssessmentListener.DefaultImpls.onExit$default(assessmentListener3, false, false, true, 3, null);
                            return;
                        }
                        return;
                }
            }
        });
        ((ConstraintLayout) _$_findCachedViewById(R.id.option3)).setOnClickListener(new View.OnClickListener(this) { // from class: ik.n

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ o f20250v;

            {
                this.f20250v = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i6 = r2;
                o this$0 = this.f20250v;
                switch (i6) {
                    case 0:
                        int i10 = o.f20258w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        this$0.startActivity(new Intent(this$0.requireContext(), TelecommunicationsPWAActivity.class));
                        AssessmentListener assessmentListener = this$0.f20259u;
                        if (assessmentListener != null) {
                            AssessmentListener.DefaultImpls.onExit$default(assessmentListener, false, false, false, 7, null);
                            return;
                        }
                        return;
                    case 1:
                        int i11 = o.f20258w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        if (Utils.INSTANCE.checkConnectivity(this$0.requireContext())) {
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                            this$0.startActivity(tr.r.r(requireActivity));
                            AssessmentListener assessmentListener2 = this$0.f20259u;
                            if (assessmentListener2 != null) {
                                AssessmentListener.DefaultImpls.onExit$default(assessmentListener2, false, false, false, 7, null);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        int i12 = o.f20258w;
                        kotlin.jvm.internal.i.g(this$0, "this$0");
                        AssessmentListener assessmentListener3 = this$0.f20259u;
                        if (assessmentListener3 != null) {
                            AssessmentListener.DefaultImpls.onExit$default(assessmentListener3, false, false, true, 3, null);
                            return;
                        }
                        return;
                }
            }
        });
        if (LocationPersistence.INSTANCE.isIndianUser() && (constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.option1)) != null) {
            constraintLayout.setVisibility(0);
        }
    }
}
