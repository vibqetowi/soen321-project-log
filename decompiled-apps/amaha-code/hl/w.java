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
public final class w extends kotlin.jvm.internal.k implements ss.q<String, String, Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f17768u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(s sVar) {
        super(3);
        this.f17768u = sVar;
    }

    @Override // ss.q
    public final hs.k invoke(String str, String str2, Integer num) {
        String str3;
        String uuid = str;
        String type = str2;
        int intValue = num.intValue();
        kotlin.jvm.internal.i.g(uuid, "uuid");
        kotlin.jvm.internal.i.g(type, "type");
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
        s sVar = this.f17768u;
        sVar.U.a(new Intent(sVar.requireActivity(), TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PROVIDER_PACKAGE).putExtra(SessionManager.KEY_UUID, uuid).putExtra("type", "therapist"));
        return hs.k.f19476a;
    }
}
