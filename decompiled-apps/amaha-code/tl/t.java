package tl;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: TherapistExpertInfoFragment.kt */
/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.k implements ss.p<String, String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q f33277u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q qVar) {
        super(2);
        this.f33277u = qVar;
    }

    @Override // ss.p
    public final hs.k invoke(String str, String str2) {
        String str3;
        String uuid = str;
        String providerName = str2;
        kotlin.jvm.internal.i.g(uuid, "uuid");
        kotlin.jvm.internal.i.g(providerName, "providerName");
        q qVar = this.f33277u;
        androidx.activity.result.c<Intent> cVar = qVar.G;
        Intent putExtra = new Intent(qVar.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PROVIDER_PACKAGE).putExtra(SessionManager.KEY_UUID, uuid);
        if (!qVar.B) {
            str3 = "psychiatrist";
        } else {
            str3 = "therapist";
        }
        cVar.a(putExtra.putExtra("type", str3).putExtra("override_source_value", "app_expert_care"));
        if (qVar.B) {
            String str4 = gk.a.f16573a;
            Bundle f = defpackage.e.f("source", "app_expert_care", "flow", "therapy");
            f.putString("therapist_name", providerName);
            f.putString("therapist_uuid", uuid);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(f, "therapist_list_book");
        } else {
            String str5 = gk.a.f16573a;
            Bundle f2 = defpackage.e.f("source", "app_expert_care", "flow", "psychiatrist");
            f2.putString("psychiatrist_name", providerName);
            f2.putString("psychiatrist_uuid", uuid);
            hs.k kVar2 = hs.k.f19476a;
            gk.a.b(f2, "psychiatrist_list_book");
        }
        return hs.k.f19476a;
    }
}
