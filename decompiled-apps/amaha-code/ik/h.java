package ik;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: ExptInitialAssessmentA3VarBTeleConsultationFragment.kt */
/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.k implements ss.q<String, String, Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f20188u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar) {
        super(3);
        this.f20188u = kVar;
    }

    @Override // ss.q
    public final hs.k invoke(String str, String str2, Integer num) {
        String uuid = str;
        String name = str2;
        num.intValue();
        kotlin.jvm.internal.i.g(uuid, "uuid");
        kotlin.jvm.internal.i.g(name, "name");
        ll.b bVar = new ll.b();
        k kVar = this.f20188u;
        androidx.fragment.app.p requireActivity = kVar.requireActivity();
        kotlin.jvm.internal.i.f(requireActivity, "requireActivity()");
        Intent putExtra = bVar.a(requireActivity, false).putExtra(Constants.A3_VAR_B_FLOW_FLAG, "professional_profile").putExtra(SessionManager.KEY_UUID, uuid);
        kotlin.jvm.internal.i.f(putExtra, "DashboardRoutingUtil().r…  .putExtra(\"uuid\", uuid)");
        kVar.startActivity(putExtra);
        kVar.requireActivity().finish();
        String str3 = gk.a.f16573a;
        Bundle f = defpackage.e.f("flow", "therapy", "therapist_name", name);
        f.putString("therapist_uuid", uuid);
        f.putString("device", "app");
        f.putString("a3_variant", Constants.ONBOARDING_VARIANT);
        f.putString("source", "a3_expt_result");
        hs.k kVar2 = hs.k.f19476a;
        gk.a.b(f, "therapy_psychiatry_profile_view");
        return hs.k.f19476a;
    }
}
