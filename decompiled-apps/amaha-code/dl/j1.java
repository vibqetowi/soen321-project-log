package dl;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.teleEntryPoint.activity.ProviderVideoActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: V3DashboardActivity.kt */
/* loaded from: classes2.dex */
public final class j1 extends kotlin.jvm.internal.k implements ss.q<String, String, Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13050u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V3DashboardActivity f13051v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(V3DashboardActivity v3DashboardActivity, V3DashboardActivity v3DashboardActivity2) {
        super(3);
        this.f13050u = v3DashboardActivity;
        this.f13051v = v3DashboardActivity2;
    }

    @Override // ss.q
    public final hs.k invoke(String str, String str2, Integer num) {
        String str3;
        String uuid = str;
        String providerVideoUrl = str2;
        int intValue = num.intValue();
        kotlin.jvm.internal.i.g(uuid, "uuid");
        kotlin.jvm.internal.i.g(providerVideoUrl, "providerVideoUrl");
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
        gk.a.b(analyticsBundle, "therapy_psychiatry_db_video_click");
        this.f13050u.startActivity(new Intent(this.f13051v, ProviderVideoActivity.class).putExtra("pro_video_url", providerVideoUrl));
        return hs.k.f19476a;
    }
}
