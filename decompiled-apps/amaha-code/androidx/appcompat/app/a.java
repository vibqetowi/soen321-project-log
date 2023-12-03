package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;
/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ AlertController f1043u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f1044v;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f1044v = bVar;
        this.f1043u = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j10) {
        AlertController.b bVar = this.f1044v;
        DialogInterface.OnClickListener onClickListener = bVar.f1039o;
        AlertController alertController = this.f1043u;
        onClickListener.onClick(alertController.f1000b, i6);
        if (!bVar.f1041q) {
            alertController.f1000b.dismiss();
        }
    }
}
