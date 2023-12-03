package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.j;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.d0;
/* compiled from: FragmentTransaction.java */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: b  reason: collision with root package name */
    public int f2192b;

    /* renamed from: c  reason: collision with root package name */
    public int f2193c;

    /* renamed from: d  reason: collision with root package name */
    public int f2194d;

    /* renamed from: e  reason: collision with root package name */
    public int f2195e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2196g;

    /* renamed from: i  reason: collision with root package name */
    public String f2198i;

    /* renamed from: j  reason: collision with root package name */
    public int f2199j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2200k;

    /* renamed from: l  reason: collision with root package name */
    public int f2201l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f2202m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<String> f2203n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<String> f2204o;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a> f2191a = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public boolean f2197h = true;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2205p = false;

    /* compiled from: FragmentTransaction.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2206a;

        /* renamed from: b  reason: collision with root package name */
        public Fragment f2207b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2208c;

        /* renamed from: d  reason: collision with root package name */
        public int f2209d;

        /* renamed from: e  reason: collision with root package name */
        public int f2210e;
        public int f;

        /* renamed from: g  reason: collision with root package name */
        public int f2211g;

        /* renamed from: h  reason: collision with root package name */
        public j.c f2212h;

        /* renamed from: i  reason: collision with root package name */
        public j.c f2213i;

        public a() {
        }

        public a(Fragment fragment, int i6) {
            this.f2206a = i6;
            this.f2207b = fragment;
            this.f2208c = false;
            j.c cVar = j.c.RESUMED;
            this.f2212h = cVar;
            this.f2213i = cVar;
        }

        public a(int i6, Fragment fragment) {
            this.f2206a = i6;
            this.f2207b = fragment;
            this.f2208c = true;
            j.c cVar = j.c.RESUMED;
            this.f2212h = cVar;
            this.f2213i = cVar;
        }

        public a(Fragment fragment, j.c cVar) {
            this.f2206a = 10;
            this.f2207b = fragment;
            this.f2208c = false;
            this.f2212h = fragment.mMaxState;
            this.f2213i = cVar;
        }

        public a(a aVar) {
            this.f2206a = aVar.f2206a;
            this.f2207b = aVar.f2207b;
            this.f2208c = aVar.f2208c;
            this.f2209d = aVar.f2209d;
            this.f2210e = aVar.f2210e;
            this.f = aVar.f;
            this.f2211g = aVar.f2211g;
            this.f2212h = aVar.f2212h;
            this.f2213i = aVar.f2213i;
        }
    }

    public final void b(a aVar) {
        this.f2191a.add(aVar);
        aVar.f2209d = this.f2192b;
        aVar.f2210e = this.f2193c;
        aVar.f = this.f2194d;
        aVar.f2211g = this.f2195e;
    }

    public final void c(View view, String str) {
        boolean z10;
        if (i0.f2217a == null && i0.f2218b == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
            String k10 = d0.i.k(view);
            if (k10 != null) {
                if (this.f2203n == null) {
                    this.f2203n = new ArrayList<>();
                    this.f2204o = new ArrayList<>();
                } else if (!this.f2204o.contains(str)) {
                    if (this.f2203n.contains(k10)) {
                        throw new IllegalArgumentException(defpackage.b.m("A shared element with the source name '", k10, "' has already been added to the transaction."));
                    }
                } else {
                    throw new IllegalArgumentException(defpackage.b.m("A shared element with the target name '", str, "' has already been added to the transaction."));
                }
                this.f2203n.add(k10);
                this.f2204o.add(str);
                return;
            }
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
    }

    public final void d(String str) {
        if (this.f2197h) {
            this.f2196g = true;
            this.f2198i = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract void e(int i6, Fragment fragment, String str, int i10);

    public final void f(int i6, Fragment fragment, String str) {
        if (i6 != 0) {
            e(i6, fragment, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public final void g(int i6, int i10) {
        h(i6, i10, 0, 0);
    }

    public final void h(int i6, int i10, int i11, int i12) {
        this.f2192b = i6;
        this.f2193c = i10;
        this.f2194d = i11;
        this.f2195e = i12;
    }
}
