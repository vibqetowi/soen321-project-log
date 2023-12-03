package tl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.components.expertCare.activity.ExpertStoriesActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import r1.b0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33255u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ q f33256v;

    public /* synthetic */ n(q qVar, int i6) {
        this.f33255u = i6;
        this.f33256v = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f33255u;
        String str = "therapy";
        q this$0 = this.f33256v;
        switch (i6) {
            case 0:
                int i10 = q.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.G.a(new Intent(this$0.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_MATCHING_FLOW).putExtra("override_source_value", "app_expert_care"));
                String str2 = gk.a.f16573a;
                Bundle a10 = b0.a("source", "app_expert_care");
                if (!this$0.B) {
                    str = "psychiatry";
                }
                a10.putString("flow", str);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(a10, "setpref_flow_cta_click");
                return;
            case 1:
                int i11 = q.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                boolean z10 = this$0.B;
                androidx.activity.result.c<Intent> cVar = this$0.G;
                if (z10) {
                    if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                        cVar.a(new Intent(this$0.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.THERAPIST_LISTING).putExtra("override_source_value", "app_expert_care"));
                        String str3 = gk.a.f16573a;
                        Bundle f = defpackage.e.f("source", "app_expert_care", "flow", "therapy");
                        hs.k kVar2 = hs.k.f19476a;
                        gk.a.b(f, "therapy_psychiatry_view_providers_click");
                        return;
                    }
                    return;
                } else if (Utils.INSTANCE.checkConnectivity(this$0.requireActivity())) {
                    cVar.a(new Intent(this$0.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PSYCHIATRIST_LISTING).putExtra("override_source_value", "app_expert_care"));
                    String str4 = gk.a.f16573a;
                    Bundle f2 = defpackage.e.f("source", "app_expert_care", "flow", "psychiatry");
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(f2, "therapy_psychiatry_view_providers_click");
                    return;
                } else {
                    return;
                }
            default:
                int i12 = q.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                String str5 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                if (!this$0.B) {
                    str = "psychiatry";
                }
                bundle.putString("flow", str);
                hs.k kVar4 = hs.k.f19476a;
                gk.a.b(bundle, "therapy_psychiatry_km_click");
                this$0.startActivity(new Intent(this$0.requireActivity(), ExpertStoriesActivity.class).putExtra(Constants.DAYMODEL_POSITION, 0).putExtra("isTherapy", this$0.B));
                return;
        }
    }
}
