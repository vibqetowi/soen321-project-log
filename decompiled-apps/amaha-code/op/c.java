package op;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UtilsKt;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.q;
/* compiled from: TeleEntryPointFragment.kt */
/* loaded from: classes2.dex */
public final class c extends k implements q<String, String, Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f27706u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar) {
        super(3);
        this.f27706u = aVar;
    }

    @Override // ss.q
    public final hs.k invoke(String str, String str2, Integer num) {
        String str3;
        pp.c cVar;
        String uuid = str;
        String name = str2;
        int intValue = num.intValue();
        i.g(uuid, "uuid");
        i.g(name, "name");
        String str4 = gk.a.f16573a;
        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str3 = user.getCurrentCourseName();
        } else {
            str3 = null;
        }
        analyticsBundle.putString("course", str3);
        analyticsBundle.putString("variant", "d");
        analyticsBundle.putInt("horizontal_scroll_depth", intValue);
        hs.k kVar = hs.k.f19476a;
        gk.a.b(analyticsBundle, "therapy_psychiatry_db_card_click");
        a aVar = this.f27706u;
        androidx.activity.result.c<Intent> cVar2 = aVar.B;
        Intent intent = new Intent(aVar.requireActivity(), TelecommunicationsPWAActivity.class);
        if (aVar.f27697x) {
            cVar = pp.c.PROFILE;
        } else {
            cVar = pp.c.PROFILE_PSYCHIATRIST;
        }
        cVar2.a(intent.putExtra(Constants.TELECOMMUNICATION_REDIRECT, cVar).putExtra(SessionManager.KEY_UUID, uuid));
        return hs.k.f19476a;
    }
}
