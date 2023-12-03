package hm;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import hs.f;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.s;
/* compiled from: MatchingCompletedProviderListFragment.kt */
/* loaded from: classes2.dex */
public final class c extends k implements s<String, String, Integer, String, Boolean, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f17782u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar) {
        super(5);
        this.f17782u = aVar;
    }

    @Override // ss.s
    public final Object y(String uuid, String providerName, Object obj, String earliestAvailableDateTime, Object obj2) {
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        i.g(uuid, "uuid");
        i.g(providerName, "providerName");
        i.g(earliestAvailableDateTime, "earliestAvailableDateTime");
        a aVar = this.f17782u;
        aVar.f17778z.a(new Intent(aVar.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PROVIDER_PACKAGE).putExtra(SessionManager.KEY_UUID, uuid).putExtra("type", "therapist").putExtra("override_source_value", "app_expert_care"));
        km.d dVar = aVar.f17777y;
        String str = null;
        if (dVar != null) {
            f<String, String> e10 = dVar.e(earliestAvailableDateTime);
            String str2 = gk.a.f16573a;
            Bundle f = e.f("flow", "therapy", "therapist_uuid", uuid);
            f.putString("therapist_name", providerName);
            f.putString("source", "in_app_matching");
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null) {
                str = user.getCurrentCourseName();
            }
            f.putString("domain", str);
            f.putString("platform", "android_app");
            f.putInt(Constants.DAYMODEL_POSITION, intValue + 1);
            f.putString("next_available_slot_shown", e10.f19464u);
            f.putString("next_available_slot_shown_local", e10.f19465v);
            f.putBoolean("provider_inhouse", booleanValue);
            hs.k kVar = hs.k.f19476a;
            gk.a.b(f, "therapist_list_book");
            return hs.k.f19476a;
        }
        i.q("viewModel");
        throw null;
    }
}
