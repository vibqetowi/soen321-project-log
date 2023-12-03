package tl;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import r1.b0;
/* compiled from: TherapistExpertInfoFragment.kt */
/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.k implements ss.p<String, String, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q f33276u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar) {
        super(2);
        this.f33276u = qVar;
    }

    @Override // ss.p
    public final hs.k invoke(String str, String str2) {
        pp.c cVar;
        String str3;
        String str4;
        String uuid = str;
        String providerName = str2;
        kotlin.jvm.internal.i.g(uuid, "uuid");
        kotlin.jvm.internal.i.g(providerName, "providerName");
        q qVar = this.f33276u;
        androidx.activity.result.c<Intent> cVar2 = qVar.G;
        Intent intent = new Intent(qVar.requireActivity(), TelecommunicationsPWAActivity.class);
        if (qVar.B) {
            cVar = pp.c.PROFILE;
        } else {
            cVar = pp.c.PROFILE_PSYCHIATRIST;
        }
        cVar2.a(intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra(SessionManager.KEY_UUID, uuid).putExtra("override_source_value", "app_expert_care"));
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str3 = user.getCurrentCourseName();
        } else {
            str3 = null;
        }
        String str5 = gk.a.f16573a;
        Bundle a10 = b0.a("source", "app_expert_care");
        if (qVar.B) {
            str4 = "therapy";
        } else {
            str4 = "psychiatry";
        }
        a10.putString("flow", str4);
        if (qVar.B) {
            a10.putString("therapist_name", providerName);
            a10.putString("therapist_uuid", uuid);
        } else {
            a10.putString("psychiatrist_name", providerName);
            a10.putString("psychiatrist_uuid", uuid);
        }
        a10.putString("platform", "android");
        a10.putString("domain", str3);
        hs.k kVar = hs.k.f19476a;
        gk.a.b(a10, "therapy_psychiatry_profile_view");
        return hs.k.f19476a;
    }
}
