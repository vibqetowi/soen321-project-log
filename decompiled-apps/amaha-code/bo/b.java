package bo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.p;
import com.theinnerhour.b2b.components.onboarding.activity.OnboardingFlowActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4560u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f4561v;

    public /* synthetic */ b(e eVar, int i6) {
        this.f4560u = i6;
        this.f4561v = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Bundle extras;
        OnboardingFlowActivity onboardingFlowActivity;
        OnBackPressedDispatcher onBackPressedDispatcher;
        int i6 = this.f4560u;
        String str = "therapy";
        e this$0 = this.f4561v;
        switch (i6) {
            case 0:
                int i10 = e.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                p requireActivity = this$0.requireActivity();
                if (requireActivity instanceof OnboardingFlowActivity) {
                    onboardingFlowActivity = (OnboardingFlowActivity) requireActivity;
                } else {
                    onboardingFlowActivity = null;
                }
                if (onboardingFlowActivity != null && (onBackPressedDispatcher = onboardingFlowActivity.getOnBackPressedDispatcher()) != null) {
                    onBackPressedDispatcher.b();
                    return;
                }
                return;
            case 1:
                int i11 = e.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str2 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                if (!this$0.f4568w) {
                    str = "psychiatry";
                }
                bundle.putString("flow", str);
                bundle.putString("source", "app_onboarding_matching");
                bundle.putBoolean("results_loaded", this$0.f4571z);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "onboarding_matching_explore_cta");
                boolean z10 = this$0.f4568w;
                androidx.activity.result.c<Intent> cVar = this$0.A;
                if (z10) {
                    cVar.a(new Intent(this$0.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_LISTING).putExtra("override_source_value", "app_onboarding_matching").putExtra("is_prevent_recording", true));
                    return;
                } else {
                    cVar.a(new Intent(this$0.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PSYCHIATRIST_LISTING).putExtra("override_source_value", "app_onboarding_matching").putExtra("is_prevent_recording", true));
                    return;
                }
            case 2:
                int i12 = e.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str3 = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                if (!this$0.f4568w) {
                    str = "psychiatry";
                }
                bundle2.putString("flow", str);
                bundle2.putString("source", "app_onboarding_matching");
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(bundle2, "onboarding_matching_fetch_retry");
                this$0.J();
                this$0.O(true, false);
                return;
            default:
                int i13 = e.C;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str4 = gk.a.f16573a;
                Bundle bundle3 = new Bundle();
                if (!this$0.f4568w) {
                    str = "psychiatry";
                }
                bundle3.putString("flow", str);
                bundle3.putString("source", "app_onboarding_matching");
                bundle3.putBoolean("results_loaded", this$0.f4571z);
                hs.k kVar3 = hs.k.f19476a;
                gk.a.b(bundle3, "onboarding_matching_dashboard_cta");
                ll.b bVar = new ll.b();
                p requireActivity2 = this$0.requireActivity();
                kotlin.jvm.internal.i.f(requireActivity2, "requireActivity()");
                Intent a10 = bVar.a(requireActivity2, false);
                Intent intent = this$0.requireActivity().getIntent();
                if (intent != null && (extras = intent.getExtras()) != null) {
                    a10.putExtras(extras);
                }
                this$0.startActivity(a10);
                this$0.requireActivity().finish();
                return;
        }
    }
}
