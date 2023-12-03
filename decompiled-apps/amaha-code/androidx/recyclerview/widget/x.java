package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.b;
/* compiled from: RecyclerView.java */
/* loaded from: classes.dex */
public final class x implements b.InterfaceC0038b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3061a;

    public x(RecyclerView recyclerView) {
        this.f3061a = recyclerView;
    }

    public final int a() {
        return this.f3061a.getChildCount();
    }

    public final void b(int i6) {
        RecyclerView recyclerView = this.f3061a;
        View childAt = recyclerView.getChildAt(i6);
        if (childAt != null) {
            recyclerView.q(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i6);
    }
}
