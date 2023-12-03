package bb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: ViewOffsetBehavior.java */
/* loaded from: classes.dex */
public class j<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public k f4242a;

    /* renamed from: b  reason: collision with root package name */
    public int f4243b;

    public j() {
        this.f4243b = 0;
    }

    public final int a() {
        k kVar = this.f4242a;
        if (kVar != null) {
            return kVar.f4247d;
        }
        return 0;
    }

    public void b(CoordinatorLayout coordinatorLayout, V v10, int i6) {
        coordinatorLayout.l(i6, v10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i6) {
        b(coordinatorLayout, v10, i6);
        if (this.f4242a == null) {
            this.f4242a = new k(v10);
        }
        k kVar = this.f4242a;
        View view = kVar.f4244a;
        kVar.f4245b = view.getTop();
        kVar.f4246c = view.getLeft();
        this.f4242a.a();
        int i10 = this.f4243b;
        if (i10 != 0) {
            this.f4242a.b(i10);
            this.f4243b = 0;
            return true;
        }
        return true;
    }

    public j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4243b = 0;
    }
}
