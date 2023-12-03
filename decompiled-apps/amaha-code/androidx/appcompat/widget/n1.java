package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public final class n1 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final l.a f1487u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ o1 f1488v;

    public n1(o1 o1Var) {
        this.f1488v = o1Var;
        this.f1487u = new l.a(o1Var.f1493a.getContext(), o1Var.f1500i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o1 o1Var = this.f1488v;
        Window.Callback callback = o1Var.f1503l;
        if (callback != null && o1Var.f1504m) {
            callback.onMenuItemSelected(0, this.f1487u);
        }
    }
}
