package hl;

import android.content.Intent;
import android.os.Bundle;
import com.theinnerhour.b2b.components.teleEntryPoint.activity.ProviderVideoActivity;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: NotV4DashboardFragment.kt */
/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.k implements ss.q<String, String, Integer, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f17767u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s sVar) {
        super(3);
        this.f17767u = sVar;
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
        s sVar = this.f17767u;
        sVar.startActivity(new Intent(sVar.requireActivity(), ProviderVideoActivity.class).putExtra("pro_video_url", providerVideoUrl));
        return hs.k.f19476a;
    }
}
