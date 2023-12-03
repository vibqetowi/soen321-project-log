package bb;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import t0.s0;
import t0.t;
/* compiled from: AppBarLayout.java */
/* loaded from: classes.dex */
public final class b implements t {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f4221u;

    public b(AppBarLayout appBarLayout) {
        this.f4221u = appBarLayout;
    }

    @Override // t0.t
    public final s0 i(View view, s0 s0Var) {
        s0 s0Var2;
        boolean z10;
        AppBarLayout appBarLayout = this.f4221u;
        appBarLayout.getClass();
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.d.b(appBarLayout)) {
            s0Var2 = s0Var;
        } else {
            s0Var2 = null;
        }
        if (!s0.b.a(appBarLayout.A, s0Var2)) {
            appBarLayout.A = s0Var2;
            if (appBarLayout.P != null && appBarLayout.getTopInset() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            appBarLayout.setWillNotDraw(!z10);
            appBarLayout.requestLayout();
        }
        return s0Var;
    }
}
