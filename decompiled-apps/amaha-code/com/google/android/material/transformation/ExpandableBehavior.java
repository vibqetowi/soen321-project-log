package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f9319a;

    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ View f9320u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f9321v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ob.a f9322w;

        public a(View view, int i6, ob.a aVar) {
            this.f9320u = view;
            this.f9321v = i6;
            this.f9322w = aVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view = this.f9320u;
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f9319a == this.f9321v) {
                ob.a aVar = this.f9322w;
                expandableBehavior.a((View) aVar, view, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f9319a = 0;
    }

    public abstract void a(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z10;
        int i6;
        ob.a aVar = (ob.a) view2;
        int i10 = 2;
        if (!aVar.a() ? this.f9319a != 1 : (i6 = this.f9319a) != 0 && i6 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        if (aVar.a()) {
            i10 = 1;
        }
        this.f9319a = i10;
        a((View) aVar, view, aVar.a(), true);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i6) {
        ob.a aVar;
        boolean z10;
        int i10;
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        if (!d0.g.c(view)) {
            ArrayList e10 = coordinatorLayout.e(view);
            int size = e10.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    View view2 = (View) e10.get(i11);
                    if (layoutDependsOn(coordinatorLayout, view, view2)) {
                        aVar = (ob.a) view2;
                        break;
                    }
                    i11++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                int i12 = 2;
                if (!aVar.a() ? this.f9319a != 1 : (i10 = this.f9319a) != 0 && i10 != 2) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    if (aVar.a()) {
                        i12 = 1;
                    }
                    this.f9319a = i12;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i12, aVar));
                }
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9319a = 0;
    }
}
