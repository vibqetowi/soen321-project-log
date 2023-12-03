package bb;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import t0.s0;
import t0.t;
/* compiled from: CollapsingToolbarLayout.java */
/* loaded from: classes.dex */
public final class f implements t {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ CollapsingToolbarLayout f4228u;

    public f(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.f4228u = collapsingToolbarLayout;
    }

    @Override // t0.t
    public final s0 i(View view, s0 s0Var) {
        s0 s0Var2;
        CollapsingToolbarLayout collapsingToolbarLayout = this.f4228u;
        collapsingToolbarLayout.getClass();
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.d.b(collapsingToolbarLayout)) {
            s0Var2 = s0Var;
        } else {
            s0Var2 = null;
        }
        if (!s0.b.a(collapsingToolbarLayout.U, s0Var2)) {
            collapsingToolbarLayout.U = s0Var2;
            collapsingToolbarLayout.requestLayout();
        }
        return s0Var.f32351a.c();
    }
}
