package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.util.HashMap;
import tr.r;
/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public final class c extends ViewGroup {

    /* renamed from: u  reason: collision with root package name */
    public b f1908u;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public b getConstraintSet() {
        if (this.f1908u == null) {
            this.f1908u = new b();
        }
        b bVar = this.f1908u;
        bVar.getClass();
        int childCount = getChildCount();
        HashMap<Integer, b.a> hashMap = bVar.f;
        hashMap.clear();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (bVar.f1818e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id2))) {
                hashMap.put(Integer.valueOf(id2), new b.a());
            }
            b.a aVar2 = hashMap.get(Integer.valueOf(id2));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar3 = (androidx.constraintlayout.widget.a) childAt;
                    aVar2.d(id2, aVar);
                    if (aVar3 instanceof Barrier) {
                        b.C0027b c0027b = aVar2.f1823e;
                        c0027b.f1852i0 = 1;
                        Barrier barrier = (Barrier) aVar3;
                        c0027b.f1848g0 = barrier.getType();
                        c0027b.f1854j0 = barrier.getReferencedIds();
                        c0027b.f1850h0 = barrier.getMargin();
                    }
                }
                aVar2.d(id2, aVar);
            }
        }
        return this.f1908u;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.a {
        public final float A0;
        public final float B0;
        public final float C0;
        public final float D0;

        /* renamed from: r0  reason: collision with root package name */
        public final float f1909r0;

        /* renamed from: s0  reason: collision with root package name */
        public final boolean f1910s0;

        /* renamed from: t0  reason: collision with root package name */
        public final float f1911t0;

        /* renamed from: u0  reason: collision with root package name */
        public final float f1912u0;

        /* renamed from: v0  reason: collision with root package name */
        public final float f1913v0;

        /* renamed from: w0  reason: collision with root package name */
        public final float f1914w0;

        /* renamed from: x0  reason: collision with root package name */
        public final float f1915x0;

        /* renamed from: y0  reason: collision with root package name */
        public final float f1916y0;

        /* renamed from: z0  reason: collision with root package name */
        public final float f1917z0;

        public a() {
            this.f1909r0 = 1.0f;
            this.f1910s0 = false;
            this.f1911t0 = 0.0f;
            this.f1912u0 = 0.0f;
            this.f1913v0 = 0.0f;
            this.f1914w0 = 0.0f;
            this.f1915x0 = 1.0f;
            this.f1916y0 = 1.0f;
            this.f1917z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1909r0 = 1.0f;
            this.f1910s0 = false;
            this.f1911t0 = 0.0f;
            this.f1912u0 = 0.0f;
            this.f1913v0 = 0.0f;
            this.f1914w0 = 0.0f;
            this.f1915x0 = 1.0f;
            this.f1916y0 = 1.0f;
            this.f1917z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.A);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 15) {
                    this.f1909r0 = obtainStyledAttributes.getFloat(index, this.f1909r0);
                } else if (index == 28) {
                    this.f1911t0 = obtainStyledAttributes.getFloat(index, this.f1911t0);
                    this.f1910s0 = true;
                } else if (index == 23) {
                    this.f1913v0 = obtainStyledAttributes.getFloat(index, this.f1913v0);
                } else if (index == 24) {
                    this.f1914w0 = obtainStyledAttributes.getFloat(index, this.f1914w0);
                } else if (index == 22) {
                    this.f1912u0 = obtainStyledAttributes.getFloat(index, this.f1912u0);
                } else if (index == 20) {
                    this.f1915x0 = obtainStyledAttributes.getFloat(index, this.f1915x0);
                } else if (index == 21) {
                    this.f1916y0 = obtainStyledAttributes.getFloat(index, this.f1916y0);
                } else if (index == 16) {
                    this.f1917z0 = obtainStyledAttributes.getFloat(index, this.f1917z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
    }
}
