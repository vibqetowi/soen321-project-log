package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: ChildHelper.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0038b f2879a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2880b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f2881c = new ArrayList();

    /* compiled from: ChildHelper.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f2882a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f2883b;

        public final void a(int i6) {
            if (i6 >= 64) {
                a aVar = this.f2883b;
                if (aVar != null) {
                    aVar.a(i6 - 64);
                    return;
                }
                return;
            }
            this.f2882a &= ~(1 << i6);
        }

        public final int b(int i6) {
            a aVar = this.f2883b;
            if (aVar == null) {
                if (i6 >= 64) {
                    return Long.bitCount(this.f2882a);
                }
                return Long.bitCount(this.f2882a & ((1 << i6) - 1));
            } else if (i6 < 64) {
                return Long.bitCount(this.f2882a & ((1 << i6) - 1));
            } else {
                return Long.bitCount(this.f2882a) + aVar.b(i6 - 64);
            }
        }

        public final void c() {
            if (this.f2883b == null) {
                this.f2883b = new a();
            }
        }

        public final boolean d(int i6) {
            if (i6 >= 64) {
                c();
                return this.f2883b.d(i6 - 64);
            } else if ((this.f2882a & (1 << i6)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final void e(int i6, boolean z10) {
            boolean z11;
            if (i6 >= 64) {
                c();
                this.f2883b.e(i6 - 64, z10);
                return;
            }
            long j10 = this.f2882a;
            if ((Long.MIN_VALUE & j10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            long j11 = (1 << i6) - 1;
            this.f2882a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i6);
            } else {
                a(i6);
            }
            if (z11 || this.f2883b != null) {
                c();
                this.f2883b.e(0, z11);
            }
        }

        public final boolean f(int i6) {
            boolean z10;
            if (i6 >= 64) {
                c();
                return this.f2883b.f(i6 - 64);
            }
            long j10 = 1 << i6;
            long j11 = this.f2882a;
            if ((j11 & j10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            long j12 = j11 & (~j10);
            this.f2882a = j12;
            long j13 = j10 - 1;
            this.f2882a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f2883b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2883b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f2882a = 0L;
            a aVar = this.f2883b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i6) {
            if (i6 >= 64) {
                c();
                this.f2883b.h(i6 - 64);
                return;
            }
            this.f2882a |= 1 << i6;
        }

        public final String toString() {
            if (this.f2883b == null) {
                return Long.toBinaryString(this.f2882a);
            }
            return this.f2883b.toString() + "xx" + Long.toBinaryString(this.f2882a);
        }
    }

    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0038b {
    }

    public b(x xVar) {
        this.f2879a = xVar;
    }

    public final void a(View view, int i6, boolean z10) {
        int f;
        InterfaceC0038b interfaceC0038b = this.f2879a;
        if (i6 < 0) {
            f = ((x) interfaceC0038b).a();
        } else {
            f = f(i6);
        }
        this.f2880b.e(f, z10);
        if (z10) {
            i(view);
        }
        RecyclerView recyclerView = ((x) interfaceC0038b).f3061a;
        recyclerView.addView(view, f);
        RecyclerView.c0 L = RecyclerView.L(view);
        RecyclerView.e eVar = recyclerView.G;
        if (eVar != null && L != null) {
            eVar.s(L);
        }
        ArrayList arrayList = recyclerView.f2712a0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((RecyclerView.o) recyclerView.f2712a0.get(size)).d(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void b(View view, int i6, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int f;
        InterfaceC0038b interfaceC0038b = this.f2879a;
        if (i6 < 0) {
            f = ((x) interfaceC0038b).a();
        } else {
            f = f(i6);
        }
        this.f2880b.e(f, z10);
        if (z10) {
            i(view);
        }
        x xVar = (x) interfaceC0038b;
        xVar.getClass();
        RecyclerView.c0 L = RecyclerView.L(view);
        RecyclerView recyclerView = xVar.f3061a;
        if (L != null) {
            if (!L.p() && !L.t()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(L);
                throw new IllegalArgumentException(defpackage.b.i(recyclerView, sb2));
            }
            L.f2759j &= -257;
        }
        recyclerView.attachViewToParent(view, f, layoutParams);
    }

    public final void c(int i6) {
        RecyclerView.c0 L;
        int f = f(i6);
        this.f2880b.f(f);
        x xVar = (x) this.f2879a;
        View childAt = xVar.f3061a.getChildAt(f);
        RecyclerView recyclerView = xVar.f3061a;
        if (childAt != null && (L = RecyclerView.L(childAt)) != null) {
            if (L.p() && !L.t()) {
                StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                sb2.append(L);
                throw new IllegalArgumentException(defpackage.b.i(recyclerView, sb2));
            }
            L.d(256);
        }
        recyclerView.detachViewFromParent(f);
    }

    public final View d(int i6) {
        return ((x) this.f2879a).f3061a.getChildAt(f(i6));
    }

    public final int e() {
        return ((x) this.f2879a).a() - this.f2881c.size();
    }

    public final int f(int i6) {
        if (i6 < 0) {
            return -1;
        }
        int a10 = ((x) this.f2879a).a();
        int i10 = i6;
        while (i10 < a10) {
            a aVar = this.f2880b;
            int b10 = i6 - (i10 - aVar.b(i10));
            if (b10 == 0) {
                while (aVar.d(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += b10;
        }
        return -1;
    }

    public final View g(int i6) {
        return ((x) this.f2879a).f3061a.getChildAt(i6);
    }

    public final int h() {
        return ((x) this.f2879a).a();
    }

    public final void i(View view) {
        this.f2881c.add(view);
        x xVar = (x) this.f2879a;
        xVar.getClass();
        RecyclerView.c0 L = RecyclerView.L(view);
        if (L != null) {
            int i6 = L.f2766q;
            View view2 = L.f2751a;
            if (i6 != -1) {
                L.f2765p = i6;
            } else {
                WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                L.f2765p = d0.d.c(view2);
            }
            RecyclerView recyclerView = xVar.f3061a;
            if (recyclerView.N()) {
                L.f2766q = 4;
                recyclerView.P0.add(L);
                return;
            }
            WeakHashMap<View, o0> weakHashMap2 = t0.d0.f32288a;
            d0.d.s(view2, 4);
        }
    }

    public final int j(View view) {
        int indexOfChild = ((x) this.f2879a).f3061a.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        a aVar = this.f2880b;
        if (aVar.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - aVar.b(indexOfChild);
    }

    public final boolean k(View view) {
        return this.f2881c.contains(view);
    }

    public final void l(int i6) {
        int f = f(i6);
        x xVar = (x) this.f2879a;
        View childAt = xVar.f3061a.getChildAt(f);
        if (childAt == null) {
            return;
        }
        if (this.f2880b.f(f)) {
            m(childAt);
        }
        xVar.b(f);
    }

    public final void m(View view) {
        if (this.f2881c.remove(view)) {
            x xVar = (x) this.f2879a;
            xVar.getClass();
            RecyclerView.c0 L = RecyclerView.L(view);
            if (L != null) {
                int i6 = L.f2765p;
                RecyclerView recyclerView = xVar.f3061a;
                if (recyclerView.N()) {
                    L.f2766q = i6;
                    recyclerView.P0.add(L);
                } else {
                    WeakHashMap<View, o0> weakHashMap = t0.d0.f32288a;
                    d0.d.s(L.f2751a, i6);
                }
                L.f2765p = 0;
            }
        }
    }

    public final String toString() {
        return this.f2880b.toString() + ", hidden list:" + this.f2881c.size();
    }
}
