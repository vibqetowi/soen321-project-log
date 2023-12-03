package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
/* compiled from: AppCompatSpinner.java */
/* loaded from: classes.dex */
public final class y extends t0 {
    public final /* synthetic */ AppCompatSpinner.g D;
    public final /* synthetic */ AppCompatSpinner E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.g gVar) {
        super(view);
        this.E = appCompatSpinner;
        this.D = gVar;
    }

    @Override // androidx.appcompat.widget.t0
    public final l.f b() {
        return this.D;
    }

    @Override // androidx.appcompat.widget.t0
    public final boolean c() {
        AppCompatSpinner appCompatSpinner = this.E;
        if (!appCompatSpinner.getInternalPopup().a()) {
            appCompatSpinner.f1202z.n(AppCompatSpinner.c.b(appCompatSpinner), AppCompatSpinner.c.a(appCompatSpinner));
            return true;
        }
        return true;
    }
}
