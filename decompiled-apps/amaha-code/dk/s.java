package dk;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.activity.SettingsActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12950u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f12951v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Bundle f12952w;

    public /* synthetic */ s(Dialog dialog, Bundle bundle) {
        this.f12951v = dialog;
        this.f12952w = bundle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f12950u;
        Dialog dialog = this.f12951v;
        Bundle analyticsBundle = this.f12952w;
        switch (i6) {
            case 0:
                int i10 = SettingsActivity.f10478z;
                kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                gk.a.b(analyticsBundle, "account_delete_cancel");
                dialog.dismiss();
                return;
            default:
                kotlin.jvm.internal.i.g(dialog, "$dialog");
                kotlin.jvm.internal.i.g(analyticsBundle, "$analyticsBundle");
                dialog.dismiss();
                gk.a.b(analyticsBundle, "remove_family_cancel");
                return;
        }
    }

    public /* synthetic */ s(Bundle bundle, Dialog dialog) {
        this.f12952w = bundle;
        this.f12951v = dialog;
    }
}
