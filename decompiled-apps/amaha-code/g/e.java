package g;

import android.view.View;
import androidx.appcompat.app.AlertController;
/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ View f16048u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f16049v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AlertController f16050w;

    public e(AlertController alertController, View view, View view2) {
        this.f16050w = alertController;
        this.f16048u = view;
        this.f16049v = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertController.c(this.f16050w.f1004g, this.f16048u, this.f16049v);
    }
}
