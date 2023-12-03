package tl;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: TherapistExpertInfoFragment.kt */
/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.k implements ss.l<xl.a, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q f33275u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar) {
        super(1);
        this.f33275u = qVar;
    }

    @Override // ss.l
    public final hs.k invoke(xl.a aVar) {
        xl.a it = aVar;
        kotlin.jvm.internal.i.g(it, "it");
        xl.c e10 = it.e();
        if (e10 != null) {
            q qVar = this.f33275u;
            boolean z10 = qVar.B;
            androidx.activity.result.c<Intent> cVar = qVar.G;
            if (z10) {
                if (Utils.INSTANCE.checkConnectivity(qVar.requireActivity())) {
                    cVar.a(new Intent(qVar.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PROFILE).putExtra(SessionManager.KEY_UUID, e10.b()).putExtra("override_source_value", "app_expert_care"));
                    String str = gk.a.f16573a;
                    Bundle f = defpackage.e.f("source", "app_expert_care_testimonials", "flow", "therapy");
                    f.putString("therapist_name", e10.a());
                    f.putString("therapist_uuid", e10.b());
                    f.putString("platform", "android");
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(f, "therapy_psychiatry_profile_view");
                }
            } else if (Utils.INSTANCE.checkConnectivity(qVar.requireActivity())) {
                cVar.a(new Intent(qVar.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PROFILE_PSYCHIATRIST).putExtra(SessionManager.KEY_UUID, e10.b()).putExtra("override_source_value", "app_expert_care"));
                String str2 = gk.a.f16573a;
                Bundle f2 = defpackage.e.f("source", "app_expert_care_testimonials", "flow", "psychiatry");
                f2.putString("psychiatrist_name", e10.a());
                f2.putString("psychiatrist_uuid", e10.b());
                f2.putString("platform", "android");
                hs.k kVar2 = hs.k.f19476a;
                gk.a.b(f2, "therapy_psychiatry_profile_view");
            }
        }
        return hs.k.f19476a;
    }
}
