package eb;

import android.view.View;
import java.util.WeakHashMap;
import qb.w;
import t0.d0;
import t0.o0;
import t0.s0;
/* compiled from: BottomNavigationView.java */
/* loaded from: classes.dex */
public final class c implements w.b {
    @Override // qb.w.b
    public final s0 a(View view, s0 s0Var, w.c cVar) {
        int i6;
        cVar.f29518d = s0Var.a() + cVar.f29518d;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        boolean z10 = true;
        if (d0.e.d(view) != 1) {
            z10 = false;
        }
        int b10 = s0Var.b();
        int c10 = s0Var.c();
        int i10 = cVar.f29515a;
        if (z10) {
            i6 = c10;
        } else {
            i6 = b10;
        }
        int i11 = i10 + i6;
        cVar.f29515a = i11;
        int i12 = cVar.f29517c;
        if (!z10) {
            b10 = c10;
        }
        int i13 = i12 + b10;
        cVar.f29517c = i13;
        d0.e.k(view, i11, cVar.f29516b, i13, cVar.f29518d);
        return s0Var;
    }
}
