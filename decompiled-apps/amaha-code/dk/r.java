package dk;

import android.app.Dialog;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.SettingsActivity;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Utils;
import g0.a;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12946u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ SettingsActivity f12947v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f12948w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Dialog f12949x;

    public /* synthetic */ r(SettingsActivity settingsActivity, kotlin.jvm.internal.u uVar, Dialog dialog) {
        this.f12947v = settingsActivity;
        this.f12948w = uVar;
        this.f12949x = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i6 = this.f12946u;
        SettingsActivity this$0 = this.f12947v;
        Dialog logoutDialog = this.f12949x;
        kotlin.jvm.internal.u logoutFromAllDevice = this.f12948w;
        switch (i6) {
            case 0:
                int i10 = SettingsActivity.f10478z;
                kotlin.jvm.internal.i.g(logoutFromAllDevice, "$logoutFromAllDevice");
                kotlin.jvm.internal.i.g(logoutDialog, "$logoutDialog");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                boolean z10 = !logoutFromAllDevice.f23466u;
                logoutFromAllDevice.f23466u = z10;
                if (z10) {
                    ((AppCompatImageView) logoutDialog.findViewById(R.id.ivLogoutCheckbox)).setBackgroundColor(g0.a.b(this$0, R.color.amahaLightGreen));
                    ((AppCompatImageView) logoutDialog.findViewById(R.id.ivLogoutCheckbox)).setImageDrawable(a.c.b(this$0, R.drawable.ic_checkbox_amaha_green));
                    ((AppCompatImageView) logoutDialog.findViewById(R.id.ivLogoutCheckbox)).setImageTintList(null);
                    return;
                }
                ((AppCompatImageView) logoutDialog.findViewById(R.id.ivLogoutCheckbox)).setBackgroundColor(g0.a.b(this$0, R.color.white));
                ((AppCompatImageView) logoutDialog.findViewById(R.id.ivLogoutCheckbox)).setImageDrawable(a.c.b(this$0, R.drawable.ic_check_box_outline_blank_blue_24dp));
                ((AppCompatImageView) logoutDialog.findViewById(R.id.ivLogoutCheckbox)).setImageTintList(ColorStateList.valueOf(g0.a.b(this$0, R.color.amahaGreen)));
                return;
            default:
                int i11 = SettingsActivity.f10478z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(logoutFromAllDevice, "$logoutFromAllDevice");
                kotlin.jvm.internal.i.g(logoutDialog, "$logoutDialog");
                String str2 = gk.a.f16573a;
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_logout_all_devices", logoutFromAllDevice.f23466u);
                hs.k kVar = hs.k.f19476a;
                gk.a.b(bundle, "dashboard_logout_confirm");
                SubscriptionPersistence.INSTANCE.removeAllSubscriptionInitialiseListeners();
                Utils utils = Utils.INSTANCE;
                if (logoutFromAllDevice.f23466u) {
                    str = "yes";
                } else {
                    str = null;
                }
                utils.logout(this$0, null, str);
                logoutDialog.dismiss();
                return;
        }
    }

    public /* synthetic */ r(kotlin.jvm.internal.u uVar, Dialog dialog, SettingsActivity settingsActivity) {
        this.f12948w = uVar;
        this.f12949x = dialog;
        this.f12947v = settingsActivity;
    }
}
