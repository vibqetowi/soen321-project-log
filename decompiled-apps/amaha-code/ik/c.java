package ik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.network.model.CourseResetModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.LoadingDots;
import com.theinnerhour.b2b.widgets.RobertoButton;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20135u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ d f20136v;

    public /* synthetic */ c(d dVar, int i6) {
        this.f20135u = i6;
        this.f20136v = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i6 = this.f20135u;
        String str2 = null;
        rr.a aVar = null;
        d this$0 = this.f20136v;
        switch (i6) {
            case 0:
                int i10 = d.A;
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
                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
                Intent putExtra = bVar.a(requireActivity, false).putExtra(Constants.A3_VAR_B_FLOW_FLAG, "professional");
                kotlin.jvm.internal.i.f(putExtra, "DashboardRoutingUtil().r…LOW_FLAG, \"professional\")");
                this$0.startActivity(putExtra);
                this$0.requireActivity().finish();
                return;
            case 1:
                int i11 = d.A;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.f20146x) {
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
                    androidx.fragment.app.p requireActivity2 = this$0.requireActivity();
                    if (requireActivity2 instanceof rr.a) {
                        aVar = (rr.a) requireActivity2;
                    }
                    if (aVar != null) {
                        aVar.n0();
                        return;
                    }
                    return;
                }
                return;
            default:
                int i12 = d.A;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (!this$0.f20146x && Utils.INSTANCE.checkConnectivity(this$0.requireContext())) {
                    this$0.f20146x = true;
                    RobertoButton robertoButton = (RobertoButton) this$0._$_findCachedViewById(R.id.rbCsaA3OfferingSelfCareFailureButton);
                    if (robertoButton != null) {
                        robertoButton.setText("");
                    }
                    LoadingDots loadingDots = (LoadingDots) this$0._$_findCachedViewById(R.id.ldCsaA3OfferingSelfCareRetryLoading);
                    if (loadingDots != null) {
                        loadingDots.setVisibility(0);
                    }
                    String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                    kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                    ArrayList k10 = ca.a.k(currentCourseName);
                    String a12 = FirebaseAuth.getInstance().a();
                    kotlin.jvm.internal.i.d(a12);
                    ((or.a) nr.b.a(or.a.class)).a("https://us-central1-gcpinnerhour.cloudfunctions.net/retryFetch", new CourseResetModel(k10, a12)).I(new f(this$0));
                    return;
                }
                return;
        }
    }
}
