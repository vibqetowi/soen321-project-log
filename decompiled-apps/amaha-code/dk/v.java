package dk;

import android.widget.Toast;
import com.android.volley.VolleyError;
import com.theinnerhour.b2b.activity.SettingsActivity;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes2.dex */
public final class v extends CustomVolleyErrorListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f12959u;

    public v(SettingsActivity settingsActivity) {
        this.f12959u = settingsActivity;
    }

    @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
    public final void onErrorResponse(VolleyError error) {
        SettingsActivity settingsActivity = this.f12959u;
        kotlin.jvm.internal.i.g(error, "error");
        try {
            Toast.makeText(settingsActivity, "Reset Failed", 1).show();
            super.onErrorResponse(error);
            LogHelper.INSTANCE.e(settingsActivity.f10479v, "https://api.theinnerhour.com/v1/allie", error);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(settingsActivity.f10479v, "https://api.theinnerhour.com/v1/allie", e10);
        }
    }
}
