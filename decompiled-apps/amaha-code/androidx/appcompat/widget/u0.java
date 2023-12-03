package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: ListPopupWindow.java */
/* loaded from: classes.dex */
public final class u0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ v0 f1562u;

    public u0(v0 v0Var) {
        this.f1562u = v0Var;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i6, long j10) {
        r0 r0Var;
        if (i6 != -1 && (r0Var = this.f1562u.f1567w) != null) {
            r0Var.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
