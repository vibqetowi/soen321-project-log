package dk;

import android.widget.Toast;
import com.theinnerhour.b2b.activity.SettingsActivity;
import com.theinnerhour.b2b.utils.Utils;
import e4.l;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements l.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12957u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f12958v;

    public /* synthetic */ u(SettingsActivity settingsActivity, int i6) {
        this.f12957u = i6;
        this.f12958v = settingsActivity;
    }

    @Override // e4.l.b
    public final void a(Object obj) {
        int i6 = this.f12957u;
        SettingsActivity this$0 = this.f12958v;
        switch (i6) {
            case 0:
                String str = (String) obj;
                int i10 = SettingsActivity.f10478z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    Toast.makeText(this$0, "Reset Done", 1).show();
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                JSONObject jSONObject = (JSONObject) obj;
                int i11 = SettingsActivity.f10478z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Utils utils = Utils.INSTANCE;
                utils.showCustomToast(this$0, "Your account has been deleted");
                utils.logout(this$0, null, null);
                return;
        }
    }
}
