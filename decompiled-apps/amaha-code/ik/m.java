package ik;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.widgets.RobertoButton;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ExptInitialAssessmentCourseDetailsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/m;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class m extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f20237w = 0;

    /* renamed from: u  reason: collision with root package name */
    public AssessmentListener f20238u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f20239v = new LinkedHashMap();

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof AssessmentListener) {
            this.f20238u = (AssessmentListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_expt_initial_assessment_course_details, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20239v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        LinkedHashMap linkedHashMap = this.f20239v;
        Integer valueOf = Integer.valueOf((int) R.id.planDetailsCTA);
        View view2 = (View) linkedHashMap.get(valueOf);
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null && (view2 = view3.findViewById(R.id.planDetailsCTA)) != null) {
                linkedHashMap.put(valueOf, view2);
            } else {
                view2 = null;
            }
        }
        ((RobertoButton) view2).setOnClickListener(new w5.i0(15, this));
    }
}
