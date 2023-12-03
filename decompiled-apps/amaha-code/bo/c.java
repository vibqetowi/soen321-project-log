package bo;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import ss.p;
/* compiled from: NewOnBoardingMatchingResultFragment.kt */
/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.k implements p<String, String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f4562u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f4563v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, boolean z10) {
        super(2);
        this.f4562u = eVar;
        this.f4563v = z10;
    }

    @Override // ss.p
    public final hs.k invoke(String str, String str2) {
        pp.c cVar;
        String str3;
        String uuid = str;
        String providerName = str2;
        kotlin.jvm.internal.i.g(uuid, "uuid");
        kotlin.jvm.internal.i.g(providerName, "providerName");
        e eVar = this.f4562u;
        androidx.activity.result.c<Intent> cVar2 = eVar.A;
        Intent intent = new Intent(eVar.requireActivity(), TelecommunicationsPWAActivity.class);
        boolean z10 = this.f4563v;
        if (z10) {
            cVar = pp.c.PROFILE;
        } else {
            cVar = pp.c.PROFILE_PSYCHIATRIST;
        }
        cVar2.a(intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra(SessionManager.KEY_UUID, uuid).putExtra("override_source_value", "app_onboarding_matching").putExtra("is_prevent_recording", true));
        String str4 = gk.a.f16573a;
        Bundle f = defpackage.e.f("source", "app_onboarding_matching", "action_source", "tnp_card_click");
        if (z10) {
            str3 = "therapy";
        } else {
            str3 = "psychiatry";
        }
        f.putString("flow", str3);
        if (z10) {
            f.putString("therapist_name", providerName);
            f.putString("therapist_uuid", uuid);
        } else {
            f.putString("psychiatrist_name", providerName);
            f.putString("psychiatrist_uuid", uuid);
        }
        f.putString("platform", "android_app");
        hs.k kVar = hs.k.f19476a;
        gk.a.b(f, "therapy_psychiatry_profile_view");
        return hs.k.f19476a;
    }
}
