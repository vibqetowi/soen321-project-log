package ek;

import android.app.Dialog;
import android.view.View;
/* compiled from: ImpactOfStressAdapter.java */
/* loaded from: classes2.dex */
public final class n implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Dialog f14221u;

    public n(Dialog dialog) {
        this.f14221u = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f14221u.dismiss();
    }
}
