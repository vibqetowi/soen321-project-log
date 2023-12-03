package ik;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.CenterZoomLayoutManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Timer;
import kotlin.Metadata;
/* compiled from: ExptInitialAssessmentA3VarBTeleConsultationFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lik/k;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class k extends rr.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f20213y = 0;

    /* renamed from: v  reason: collision with root package name */
    public Timer f20215v;

    /* renamed from: w  reason: collision with root package name */
    public AssessmentListener f20216w;

    /* renamed from: x  reason: collision with root package name */
    public final LinkedHashMap f20217x = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f20214u = LogHelper.INSTANCE.makeLogTag("ExptInitialAssessmentA3VarBTCFragment");

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f20217x;
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
            this.f20216w = (AssessmentListener) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_expt_initial_assessment_a3_varb_tc, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f20217x.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ExptInitialAssessmentActivity exptInitialAssessmentActivity;
        RecyclerView recyclerView;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        ScrollView svCsaA3OfferingParent = (ScrollView) _$_findCachedViewById(R.id.svCsaA3OfferingParent);
        kotlin.jvm.internal.i.f(svCsaA3OfferingParent, "svCsaA3OfferingParent");
        insetsUtils.addStatusBarHeight(svCsaA3OfferingParent);
        androidx.fragment.app.p requireActivity = requireActivity();
        ArrayList<TherapistPackagesModel> arrayList = null;
        if (requireActivity instanceof ExptInitialAssessmentActivity) {
            exptInitialAssessmentActivity = (ExptInitialAssessmentActivity) requireActivity;
        } else {
            exptInitialAssessmentActivity = null;
        }
        if (exptInitialAssessmentActivity != null) {
            arrayList = exptInitialAssessmentActivity.Z;
        }
        if (arrayList != null && (recyclerView = (RecyclerView) _$_findCachedViewById(R.id.rvCsaA3OfferingSelfCare)) != null) {
            recyclerView.setLayoutManager(new CenterZoomLayoutManager(requireActivity(), 0, false, 0.2f, 1.5f, null, 32, null));
            recyclerView.setAdapter(new qp.b(arrayList, false, false, new h(this)));
            new androidx.recyclerview.widget.r().a(recyclerView);
            recyclerView.post(new ne.u(this, 16, recyclerView));
        }
        RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.rbCsaA3OfferingButton);
        if (robertoButton != null) {
            robertoButton.setOnClickListener(new View.OnClickListener(this) { // from class: ik.g

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ k f20183v;

                {
                    this.f20183v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str;
                    int i6 = r2;
                    String str2 = null;
                    k this$0 = this.f20183v;
                    switch (i6) {
                        case 0:
                            int i10 = k.f20213y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str3 = gk.a.f16573a;
                            Bundle a10 = r1.b0.a("offering", "teleconsultation");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str2 = user.getCurrentCourseName();
                            }
                            a10.putString("course", str2);
                            a10.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(a10, "onboarding_offering_selection");
                            ll.b bVar = new ll.b();
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                            Intent putExtra = bVar.a(requireActivity2, false).putExtra(Constants.A3_VAR_B_FLOW_FLAG, "professional");
                            kotlin.jvm.internal.i.f(putExtra, "DashboardRoutingUtil().r…LOW_FLAG, \"professional\")");
                            this$0.startActivity(putExtra);
                            this$0.requireActivity().finish();
                            return;
                        default:
                            int i11 = k.f20213y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str4 = gk.a.f16573a;
                            Bundle a11 = r1.b0.a("offering", "self-care");
                            User user2 = FirebasePersistence.getInstance().getUser();
                            if (user2 != null) {
                                str = user2.getCurrentCourseName();
                            } else {
                                str = null;
                            }
                            a11.putString("course", str);
                            a11.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(a11, "onboarding_offering_selection");
                            AssessmentListener assessmentListener = this$0.f20216w;
                            if (assessmentListener != null) {
                                AssessmentListener.DefaultImpls.goToNextScreen$default(assessmentListener, null, 1, null);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        CardView cardView = (CardView) _$_findCachedViewById(R.id.clCsaA3OfferingTeleConsultationContainer);
        if (cardView != null) {
            cardView.setOnClickListener(new View.OnClickListener(this) { // from class: ik.g

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ k f20183v;

                {
                    this.f20183v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str;
                    int i6 = r2;
                    String str2 = null;
                    k this$0 = this.f20183v;
                    switch (i6) {
                        case 0:
                            int i10 = k.f20213y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str3 = gk.a.f16573a;
                            Bundle a10 = r1.b0.a("offering", "teleconsultation");
                            User user = FirebasePersistence.getInstance().getUser();
                            if (user != null) {
                                str2 = user.getCurrentCourseName();
                            }
                            a10.putString("course", str2);
                            a10.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                            hs.k kVar = hs.k.f19476a;
                            gk.a.b(a10, "onboarding_offering_selection");
                            ll.b bVar = new ll.b();
                            androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                            kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                            Intent putExtra = bVar.a(requireActivity2, false).putExtra(Constants.A3_VAR_B_FLOW_FLAG, "professional");
                            kotlin.jvm.internal.i.f(putExtra, "DashboardRoutingUtil().r…LOW_FLAG, \"professional\")");
                            this$0.startActivity(putExtra);
                            this$0.requireActivity().finish();
                            return;
                        default:
                            int i11 = k.f20213y;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            String str4 = gk.a.f16573a;
                            Bundle a11 = r1.b0.a("offering", "self-care");
                            User user2 = FirebasePersistence.getInstance().getUser();
                            if (user2 != null) {
                                str = user2.getCurrentCourseName();
                            } else {
                                str = null;
                            }
                            a11.putString("course", str);
                            a11.putString("a3_variant", Constants.ONBOARDING_VARIANT);
                            hs.k kVar2 = hs.k.f19476a;
                            gk.a.b(a11, "onboarding_offering_selection");
                            AssessmentListener assessmentListener = this$0.f20216w;
                            if (assessmentListener != null) {
                                AssessmentListener.DefaultImpls.goToNextScreen$default(assessmentListener, null, 1, null);
                                return;
                            }
                            return;
                    }
                }
            });
        }
    }
}
