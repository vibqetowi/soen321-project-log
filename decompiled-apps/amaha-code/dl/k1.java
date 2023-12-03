package dl;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.telecommunications.activity.TelecommunicationsPWAActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class k1 extends kotlin.jvm.internal.k implements ss.q<String, String, Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13058u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13059v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(V3DashboardActivity v3DashboardActivity, V3DashboardActivity v3DashboardActivity2) {
        super(3);
        this.f13058u = v3DashboardActivity;
        this.f13059v = v3DashboardActivity2;
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
        Intent putExtra = new Intent(this.f13059v, TelecommunicationsPWAActivity.class).putExtra(Constants.TELECOMMUNICATION_REDIRECT, pp.c.PROVIDER_PACKAGE).putExtra(SessionManager.KEY_UUID, uuid).putExtra("type", "therapist");
        V3DashboardActivity v3DashboardActivity = this.f13058u;
        v3DashboardActivity.startActivityForResult(putExtra, v3DashboardActivity.P);
        return hs.k.f19476a;
    }
}
