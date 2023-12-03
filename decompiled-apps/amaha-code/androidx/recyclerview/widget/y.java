package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.ArrayList;
/* compiled from: RecyclerView.java */
/* loaded from: classes.dex */
public final class y implements a.InterfaceC0037a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3062a;

    public y(RecyclerView recyclerView) {
        this.f3062a = recyclerView;
    }

    public final void a(a.b bVar) {
        int i6 = bVar.f2875a;
        RecyclerView recyclerView = this.f3062a;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 4) {
                    if (i6 == 8) {
                        recyclerView.H.onItemsMoved(recyclerView, bVar.f2876b, bVar.f2878d, 1);
                        return;
                    }
                    return;
                }
                recyclerView.H.onItemsUpdated(recyclerView, bVar.f2876b, bVar.f2878d, bVar.f2877c);
                return;
            }
            recyclerView.H.onItemsRemoved(recyclerView, bVar.f2876b, bVar.f2878d);
            return;
        }
        recyclerView.H.onItemsAdded(recyclerView, bVar.f2876b, bVar.f2878d);
    }

    public final RecyclerView.c0 b(int i6) {
        RecyclerView recyclerView = this.f3062a;
        int h10 = recyclerView.f2740z.h();
        int i10 = 0;
        RecyclerView.c0 c0Var = null;
        while (true) {
            if (i10 >= h10) {
                break;
            }
            RecyclerView.c0 L = RecyclerView.L(recyclerView.f2740z.g(i10));
            if (L != null && !L.n() && L.f2753c == i6) {
                if (recyclerView.f2740z.k(L.f2751a)) {
                    c0Var = L;
                } else {
                    c0Var = L;
                    break;
                }
            }
            i10++;
        }
        if (c0Var == null || recyclerView.f2740z.k(c0Var.f2751a)) {
            return null;
        }
        return c0Var;
    }

    public final void c(int i6, int i10, Object obj) {
        int i11;
        int i12;
        RecyclerView recyclerView = this.f3062a;
        int h10 = recyclerView.f2740z.h();
        int i13 = i10 + i6;
        for (int i14 = 0; i14 < h10; i14++) {
            View g5 = recyclerView.f2740z.g(i14);
            RecyclerView.c0 L = RecyclerView.L(g5);
            if (L != null && !L.t() && (i12 = L.f2753c) >= i6 && i12 < i13) {
                L.d(2);
                L.c(obj);
                ((RecyclerView.n) g5.getLayoutParams()).f2788c = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f2734w;
        ArrayList<RecyclerView.c0> arrayList = tVar.f2799c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.c0 c0Var = arrayList.get(size);
                if (c0Var != null && (i11 = c0Var.f2753c) >= i6 && i11 < i13) {
                    c0Var.d(2);
                    tVar.g(size);
                }
            } else {
                recyclerView.G0 = true;
                return;
            }
        }
    }

    public final void d(int i6, int i10) {
        RecyclerView recyclerView = this.f3062a;
        int h10 = recyclerView.f2740z.h();
        for (int i11 = 0; i11 < h10; i11++) {
            RecyclerView.c0 L = RecyclerView.L(recyclerView.f2740z.g(i11));
            if (L != null && !L.t() && L.f2753c >= i6) {
                L.q(i10, false);
                recyclerView.C0.f = true;
            }
        }
        ArrayList<RecyclerView.c0> arrayList = recyclerView.f2734w.f2799c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.c0 c0Var = arrayList.get(i12);
            if (c0Var != null && c0Var.f2753c >= i6) {
                c0Var.q(i10, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.F0 = true;
    }

    public final void e(int i6, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        RecyclerView recyclerView = this.f3062a;
        int h10 = recyclerView.f2740z.h();
        int i18 = -1;
        if (i6 < i10) {
            i12 = i6;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i6;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < h10; i19++) {
            RecyclerView.c0 L = RecyclerView.L(recyclerView.f2740z.g(i19));
            if (L != null && (i17 = L.f2753c) >= i12 && i17 <= i11) {
                if (i17 == i6) {
                    L.q(i10 - i6, false);
                } else {
                    L.q(i13, false);
                }
                recyclerView.C0.f = true;
            }
        }
        RecyclerView.t tVar = recyclerView.f2734w;
        tVar.getClass();
        if (i6 < i10) {
            i15 = i6;
            i14 = i10;
        } else {
            i14 = i6;
            i15 = i10;
            i18 = 1;
        }
        ArrayList<RecyclerView.c0> arrayList = tVar.f2799c;
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            RecyclerView.c0 c0Var = arrayList.get(i20);
            if (c0Var != null && (i16 = c0Var.f2753c) >= i15 && i16 <= i14) {
                if (i16 == i6) {
                    c0Var.q(i10 - i6, false);
                } else {
                    c0Var.q(i18, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.F0 = true;
    }
}
