package s9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class j extends androidx.fragment.app.n {

    /* renamed from: u  reason: collision with root package name */
    public Dialog f31348u;

    /* renamed from: v  reason: collision with root package name */
    public DialogInterface.OnCancelListener f31349v;

    /* renamed from: w  reason: collision with root package name */
    public AlertDialog f31350w;

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f31349v;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.n
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f31348u;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f31350w == null) {
                Context context = getContext();
                v9.o.h(context);
                this.f31350w = new AlertDialog.Builder(context).create();
            }
            return this.f31350w;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.n
    public final void show(androidx.fragment.app.y yVar, String str) {
        super.show(yVar, str);
    }
}
