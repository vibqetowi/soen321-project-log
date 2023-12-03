package hl;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: NotV4DashboardFragment.kt */
/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.k implements ss.q<String, String, Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f17766u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s sVar) {
        super(3);
        this.f17766u = sVar;
    }

    @Override // ss.q
    public final hs.k invoke(String str, String str2, Integer num) {
        String str3;
        String uuid = str;
        int intValue = num.intValue();
        kotlin.jvm.internal.i.g(uuid, "uuid");
        kotlin.jvm.internal.i.g(str2, "<anonymous parameter 1>");
        String str4 = gk.a.f16573a;
        Bundle analyticsBundle = UtilsKt.getAnalyticsBundle();
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null) {
            str3 = user.getCurrentCourseName();
        } else {
            str3 = null;
        }
        analyticsBundle.putString("course", str3);
        analyticsBundle.putString("variant", "e");
        analyticsBundle.putInt("horizontal_scroll_depth", intValue);
        hs.k kVar = hs.k.f19476a;
        gk.a.b(analyticsBundle, "therapy_psychiatry_db_card_click");
        s sVar = this.f17766u;
        sVar.V.a(new Intent(sVar.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PROFILE).putExtra(SessionManager.KEY_UUID, uuid));
        return hs.k.f19476a;
    }
}
