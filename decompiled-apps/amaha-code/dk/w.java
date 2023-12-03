package dk;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.activity.SettingsActivity;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes2.dex */
public final class w extends CustomVolleyErrorListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f12960u;

    public w(SettingsActivity settingsActivity) {
        this.f12960u = settingsActivity;
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
    public final void onErrorResponse(VolleyError error) {
        SettingsActivity settingsActivity = this.f12960u;
        kotlin.jvm.internal.i.g(error, "error");
        try {
            super.onErrorResponse(error);
            LogHelper.INSTANCE.e(settingsActivity.f10479v, "https://api.theinnerhour.com/v1/global/delete", error);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(settingsActivity.f10479v, "https://api.theinnerhour.com/v1/global/delete", e10);
        }
    }
}
