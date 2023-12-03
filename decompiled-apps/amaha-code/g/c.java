package g;

import android.view.View;
import androidx.appcompat.app.AlertController;
/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ View f16014u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f16015v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AlertController f16016w;

    public c(AlertController alertController, View view, View view2) {
        this.f16016w = alertController;
        this.f16014u = view;
        this.f16015v = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.c(this.f16016w.f1019w, this.f16014u, this.f16015v);
    }
}
