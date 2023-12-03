package com.google.android.material.behavior;

import a1.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.e;
import com.google.android.material.snackbar.g;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import u0.h;
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public a1.c f8803a;

    /* renamed from: b  reason: collision with root package name */
    public b f8804b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8805c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8806d;

    /* renamed from: e  reason: collision with root package name */
    public int f8807e = 2;
    public final float f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public float f8808g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f8809h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    public final a f8810i = new a();

    /* loaded from: classes.dex */
    public class a extends c.AbstractC0004c {

        /* renamed from: a  reason: collision with root package name */
        public int f8811a;

        /* renamed from: b  reason: collision with root package name */
        public int f8812b = -1;

        public a() {
        }

        @Override // a1.c.AbstractC0004c
        public final int a(View view, int i6) {
            boolean z10;
            int width;
            int width2;
            int width3;
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            if (d0.e.d(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = SwipeDismissBehavior.this.f8807e;
            if (i10 == 0) {
                if (z10) {
                    width = this.f8811a - view.getWidth();
                    width2 = this.f8811a;
                } else {
                    width = this.f8811a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i10 == 1) {
                if (z10) {
                    width = this.f8811a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f8811a - view.getWidth();
                    width2 = this.f8811a;
                }
            } else {
                width = this.f8811a - view.getWidth();
                width2 = view.getWidth() + this.f8811a;
            }
            return Math.min(Math.max(width, i6), width2);
        }

        @Override // a1.c.AbstractC0004c
        public final int b(View view, int i6) {
            return view.getTop();
        }

        @Override // a1.c.AbstractC0004c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // a1.c.AbstractC0004c
        public final void g(int i6, View view) {
            this.f8812b = i6;
            this.f8811a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.f8806d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.f8806d = false;
            }
        }

        @Override // a1.c.AbstractC0004c
        public final void h(int i6) {
            b bVar = SwipeDismissBehavior.this.f8804b;
            if (bVar != null) {
                BaseTransientBottomBar baseTransientBottomBar = ((e) bVar).f9173a;
                if (i6 != 0) {
                    if (i6 == 1 || i6 == 2) {
                        g.b().d(baseTransientBottomBar.f9153s);
                        return;
                    }
                    return;
                }
                g b10 = g.b();
                BaseTransientBottomBar.c cVar = baseTransientBottomBar.f9153s;
                synchronized (b10.f9176a) {
                    if (b10.c(cVar)) {
                        g.c cVar2 = b10.f9178c;
                        if (cVar2.f9183c) {
                            cVar2.f9183c = false;
                            b10.f(cVar2);
                        }
                    }
                }
            }
        }

        @Override // a1.c.AbstractC0004c
        public final void i(View view, int i6, int i10) {
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float width = view.getWidth() * swipeDismissBehavior.f8808g;
            float width2 = view.getWidth() * swipeDismissBehavior.f8809h;
            float abs = Math.abs(i6 - this.f8811a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
            if (java.lang.Math.abs(r9.getLeft() - r8.f8811a) >= java.lang.Math.round(r9.getWidth() * r2.f)) goto L39;
         */
        @Override // a1.c.AbstractC0004c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void j(View view, float f, float f2) {
            boolean z10;
            int i6;
            b bVar;
            boolean z11;
            this.f8812b = -1;
            int width = view.getWidth();
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            boolean z12 = true;
            int i10 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i10 != 0) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                if (d0.e.d(view) == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int i11 = swipeDismissBehavior.f8807e;
                if (i11 != 2) {
                    z10 = i11 == 0 ? false : false;
                }
                z10 = true;
            }
            if (z10) {
                if (f >= 0.0f) {
                    int left = view.getLeft();
                    int i12 = this.f8811a;
                    if (left >= i12) {
                        i6 = i12 + width;
                    }
                }
                i6 = this.f8811a - width;
            } else {
                i6 = this.f8811a;
                z12 = false;
            }
            if (swipeDismissBehavior.f8803a.q(i6, view.getTop())) {
                c cVar = new c(view, z12);
                WeakHashMap<View, o0> weakHashMap2 = d0.f32288a;
                d0.d.m(view, cVar);
            } else if (z12 && (bVar = swipeDismissBehavior.f8804b) != null) {
                ((e) bVar).a(view);
            }
        }

        @Override // a1.c.AbstractC0004c
        public final boolean k(int i6, View view) {
            int i10 = this.f8812b;
            if ((i10 == -1 || i10 == i6) && SwipeDismissBehavior.this.a(view)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final View f8814u;

        /* renamed from: v  reason: collision with root package name */
        public final boolean f8815v;

        public c(View view, boolean z10) {
            this.f8814u = view;
            this.f8815v = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar;
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            a1.c cVar = swipeDismissBehavior.f8803a;
            View view = this.f8814u;
            if (cVar != null && cVar.g()) {
                WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                d0.d.m(view, this);
            } else if (this.f8815v && (bVar = swipeDismissBehavior.f8804b) != null) {
                ((e) bVar).a(view);
            }
        }
    }

    public boolean a(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f8805c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f8805c = false;
            }
        } else {
            z10 = coordinatorLayout.j(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f8805c = z10;
        }
        if (!z10) {
            return false;
        }
        if (this.f8803a == null) {
            this.f8803a = new a1.c(coordinatorLayout.getContext(), coordinatorLayout, this.f8810i);
        }
        if (!this.f8806d && this.f8803a.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v10, int i6) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v10, i6);
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (d0.d.c(v10) == 0) {
            d0.d.s(v10, 1);
            d0.n(1048576, v10);
            d0.i(0, v10);
            if (a(v10)) {
                d0.o(v10, h.a.f33740l, new com.google.android.material.behavior.a(this));
            }
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f8803a != null) {
            if (!this.f8806d || motionEvent.getActionMasked() != 3) {
                this.f8803a.k(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }
}
