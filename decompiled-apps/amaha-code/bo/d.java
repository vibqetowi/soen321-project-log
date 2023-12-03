package bo;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import ss.p;
/* compiled from: NewOnBoardingMatchingResultFragment.kt */
/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.k implements p<String, String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f4564u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f4565v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, boolean z10) {
        super(2);
        this.f4564u = eVar;
        this.f4565v = z10;
    }

    @Override // ss.p
    public final hs.k invoke(String str, String str2) {
        String str3;
        String uuid = str;
        String providerName = str2;
        kotlin.jvm.internal.i.g(uuid, "uuid");
        kotlin.jvm.internal.i.g(providerName, "providerName");
        e eVar = this.f4564u;
        androidx.activity.result.c<Intent> cVar = eVar.A;
        Intent putExtra = new Intent(eVar.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PROVIDER_PACKAGE).putExtra(SessionManager.KEY_UUID, uuid);
        boolean z10 = this.f4565v;
        if (!z10) {
            str3 = "psychiatrist";
        } else {
            str3 = "therapist";
        }
        cVar.a(putExtra.putExtra("type", str3).putExtra("override_source_value", "app_onboarding_matching").putExtra("is_prevent_recording", true));
        if (z10) {
            String str4 = gk.a.f16573a;
            Bundle f = defpackage.e.f("source", "app_onboarding_matching", "action_source", "tnp_card_click");
            f.putString("platform", "android_app");
            f.putString("flow", "therapy");
            f.putString("therapist_name", providerName);
            f.putString("therapist_uuid", uuid);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(f, "therapist_list_book");
        } else {
            String str5 = gk.a.f16573a;
            Bundle f2 = defpackage.e.f("source", "app_onboarding_matching", "action_source", "tnp_card_click");
            f2.putString("platform", "android_app");
            f2.putString("flow", "psychiatrist");
            f2.putString("psychiatrist_name", providerName);
            f2.putString("psychiatrist_uuid", uuid);
            hs.k kVar2 = hs.k.f19476a;
            gk.a.b(f2, "psychiatrist_list_book");
        }
        return hs.k.f19476a;
    }
}
