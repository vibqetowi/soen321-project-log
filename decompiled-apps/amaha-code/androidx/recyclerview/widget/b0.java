package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class b0 extends RecyclerView.j {

    /* renamed from: g  reason: collision with root package name */
    public final boolean f2884g = true;

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean a(RecyclerView.c0 c0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i6;
        int i10;
        if (cVar != null && ((i6 = cVar.f2777a) != (i10 = cVar2.f2777a) || cVar.f2778b != cVar2.f2778b)) {
            return l(c0Var, i6, cVar.f2778b, i10, cVar2.f2778b);
        }
        c cVar3 = (c) this;
        cVar3.r(c0Var);
        c0Var.f2751a.setAlpha(0.0f);
        cVar3.f2887i.add(c0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean b(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i6;
        int i10;
        int i11 = cVar.f2777a;
        int i12 = cVar.f2778b;
        if (c0Var2.t()) {
            int i13 = cVar.f2777a;
            i10 = cVar.f2778b;
            i6 = i13;
        } else {
            i6 = cVar2.f2777a;
            i10 = cVar2.f2778b;
        }
        c cVar3 = (c) this;
        if (c0Var == c0Var2) {
            return cVar3.l(c0Var, i11, i12, i6, i10);
        }
        View view = c0Var.f2751a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        cVar3.r(c0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        cVar3.r(c0Var2);
        View view2 = c0Var2.f2751a;
        view2.setTranslationX(-((int) ((i6 - i11) - translationX)));
        view2.setTranslationY(-((int) ((i10 - i12) - translationY)));
        view2.setAlpha(0.0f);
        cVar3.f2889k.add(new c.d(c0Var, c0Var2, i11, i12, i6, i10));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean c(RecyclerView.c0 c0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i6;
        int i10;
        int i11 = cVar.f2777a;
        int i12 = cVar.f2778b;
        View view = c0Var.f2751a;
        if (cVar2 == null) {
            i6 = view.getLeft();
        } else {
            i6 = cVar2.f2777a;
        }
        int i13 = i6;
        if (cVar2 == null) {
            i10 = view.getTop();
        } else {
            i10 = cVar2.f2778b;
        }
        int i14 = i10;
        if (!c0Var.n() && (i11 != i13 || i12 != i14)) {
            view.layout(i13, i14, view.getWidth() + i13, view.getHeight() + i14);
            return l(c0Var, i11, i12, i13, i14);
        }
        c cVar3 = (c) this;
        cVar3.r(c0Var);
        cVar3.f2886h.add(c0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean d(RecyclerView.c0 c0Var, RecyclerView.j.c cVar, RecyclerView.j.c cVar2) {
        int i6 = cVar.f2777a;
        int i10 = cVar2.f2777a;
        if (i6 == i10 && cVar.f2778b == cVar2.f2778b) {
            g(c0Var);
            return false;
        }
        return l(c0Var, i6, cVar.f2778b, i10, cVar2.f2778b);
    }

    public abstract boolean l(RecyclerView.c0 c0Var, int i6, int i10, int i11, int i12);

    public final boolean m(RecyclerView.c0 c0Var) {
        if (this.f2884g && !c0Var.l()) {
            return false;
        }
        return true;
    }
}
