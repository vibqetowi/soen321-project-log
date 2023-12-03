package ik;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.cardview.widget.CardView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ExptInitialAssessmentA3VarBOfferingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/b;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f20124w = 0;

    /* renamed from: u  reason: collision with root package name */
    public AssessmentListener f20125u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f20126v = new LinkedHashMap();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20126v;
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
            this.f20125u = (AssessmentListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_expt_initial_assessment_a3_varb_offering, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20126v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        ScrollView svCsaA3OfferingParent = (ScrollView) _$_findCachedViewById(R.id.svCsaA3OfferingParent);
        kotlin.jvm.internal.i.f(svCsaA3OfferingParent, "svCsaA3OfferingParent");
        insetsUtils.addStatusBarHeight(svCsaA3OfferingParent);
        CardView cardView = (CardView) _$_findCachedViewById(R.id.clCsaA3OfferingSelfCareContainer);
        if (cardView != null) {
            cardView.setOnClickListener(new View.OnClickListener(this) { // from class: ik.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f20115v;

                {
                    this.f20115v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    String str = null;
                    b this$0 = this.f20115v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f20124w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AssessmentListener assessmentListener = this$0.f20125u;
                            if (assessmentListener != null) {
                                AssessmentListener.DefaultImpls.goToNextScreen$default(assessmentListener, null, 1, null);
                            }
                            String str2 = gk.a.f16573a;
                            Bundle a10 = r1.b0.a("offering", "self-care");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str = user.getCurrentCourseName();
                            }
                            a10.putString("course", str);
                            a10.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(a10, "onboarding_offering_selection");
                            return;
                        default:
                            int i11 = b.f20124w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ll.b bVar = new ll.b();
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                            Intent putExtra = bVar.a(requireActivity, false).putExtra(Constants.A3_VAR_B_FLOW_FLAG, "professional");
                            kotlin.jvm.internal.i.f(putExtra, "DashboardRoutingUtil().r…LOW_FLAG, \"professional\")");
                            this$0.startActivity(putExtra);
                            this$0.requireActivity().finish();
                            String str3 = gk.a.f16573a;
                            Bundle a11 = r1.b0.a("offering", "teleconsultation");
                            User user2 = FirebasePersistence.getInstance().getUser();
                            if (user2 != null) {
                                str = user2.getCurrentCourseName();
                            }
                            a11.putString("course", str);
                            a11.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(a11, "onboarding_offering_selection");
                            return;
                    }
                }
            });
        }
        CardView cardView2 = (CardView) _$_findCachedViewById(R.id.clCsaA3OfferingTeleConsultationContainer);
        if (cardView2 != null) {
            cardView2.setOnClickListener(new View.OnClickListener(this) { // from class: ik.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f20115v;

                {
                    this.f20115v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    String str = null;
                    b this$0 = this.f20115v;
                    switch (i6) {
                        case 0:
                            int i10 = b.f20124w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            AssessmentListener assessmentListener = this$0.f20125u;
                            if (assessmentListener != null) {
                                AssessmentListener.DefaultImpls.goToNextScreen$default(assessmentListener, null, 1, null);
                            }
                            String str2 = gk.a.f16573a;
                            Bundle a10 = r1.b0.a("offering", "self-care");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str = user.getCurrentCourseName();
                            }
                            a10.putString("course", str);
                            a10.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(a10, "onboarding_offering_selection");
                            return;
                        default:
                            int i11 = b.f20124w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            ll.b bVar = new ll.b();
                            androidx.fragment.app.p requireActivity = this$0.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                            Intent putExtra = bVar.a(requireActivity, false).putExtra(Constants.A3_VAR_B_FLOW_FLAG, "professional");
                            kotlin.jvm.internal.i.f(putExtra, "DashboardRoutingUtil().r…LOW_FLAG, \"professional\")");
                            this$0.startActivity(putExtra);
                            this$0.requireActivity().finish();
                            String str3 = gk.a.f16573a;
                            Bundle a11 = r1.b0.a("offering", "teleconsultation");
                            User user2 = FirebasePersistence.getInstance().getUser();
                            if (user2 != null) {
                                str = user2.getCurrentCourseName();
                            }
                            a11.putString("course", str);
                            a11.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(a11, "onboarding_offering_selection");
                            return;
                    }
                }
            });
        }
    }
}
