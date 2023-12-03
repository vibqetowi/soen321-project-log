package dc;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.v0;
/* compiled from: MaterialAutoCompleteTextView.java */
/* loaded from: classes.dex */
public final class p implements AdapterView.OnItemClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q f12798u;

    public p(q qVar) {
        this.f12798u = qVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j10) {
        Object item;
        View view2 = null;
        q qVar = this.f12798u;
        if (i6 < 0) {
            v0 v0Var = qVar.f12799y;
            if (!v0Var.a()) {
                item = null;
            } else {
                item = v0Var.f1567w.getSelectedItem();
            }
        } else {
            item = qVar.getAdapter().getItem(i6);
        }
        q.a(qVar, item);
        AdapterView.OnItemClickListener onItemClickListener = qVar.getOnItemClickListener();
        v0 v0Var2 = qVar.f12799y;
        if (onItemClickListener != null) {
            if (view == null || i6 < 0) {
                if (v0Var2.a()) {
                    view2 = v0Var2.f1567w.getSelectedView();
                }
                view = view2;
                if (!v0Var2.a()) {
                    i6 = -1;
                } else {
                    i6 = v0Var2.f1567w.getSelectedItemPosition();
                }
                if (!v0Var2.a()) {
                    j10 = Long.MIN_VALUE;
                } else {
                    j10 = v0Var2.f1567w.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick(v0Var2.f1567w, view, i6, j10);
        }
        v0Var2.dismiss();
    }
}
