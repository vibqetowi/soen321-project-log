package bb;

import android.view.View;
import t0.d0;
/* compiled from: ViewOffsetHelper.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final View f4244a;

    /* renamed from: b  reason: collision with root package name */
    public int f4245b;

    /* renamed from: c  reason: collision with root package name */
    public int f4246c;

    /* renamed from: d  reason: collision with root package name */
    public int f4247d;

    public k(View view) {
        this.f4244a = view;
    }

    public final void a() {
        int i6 = this.f4247d;
        View view = this.f4244a;
        d0.k(i6 - (view.getTop() - this.f4245b), view);
        d0.j(0 - (view.getLeft() - this.f4246c), view);
    }

    public final boolean b(int i6) {
        if (this.f4247d != i6) {
            this.f4247d = i6;
            a();
            return true;
        }
        return false;
    }
}
