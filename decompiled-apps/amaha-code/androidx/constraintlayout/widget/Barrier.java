package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.c;
import tr.r;
import x.e;
import x.f;
import x.j;
/* loaded from: classes.dex */
public class Barrier extends a {
    public int C;
    public int D;
    public x.a E;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.E.f37329z0;
    }

    public int getMargin() {
        return this.E.A0;
    }

    public int getType() {
        return this.C;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.E = new x.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f33565y);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.E.f37329z0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.E.A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1808x = this.E;
        q();
    }

    @Override // androidx.constraintlayout.widget.a
    public final void n(b.a aVar, j jVar, c.a aVar2, SparseArray sparseArray) {
        super.n(aVar, jVar, aVar2, sparseArray);
        if (jVar instanceof x.a) {
            x.a aVar3 = (x.a) jVar;
            boolean z10 = ((f) jVar.W).B0;
            b.C0027b c0027b = aVar.f1823e;
            r(aVar3, c0027b.f1848g0, z10);
            aVar3.f37329z0 = c0027b.f1864o0;
            aVar3.A0 = c0027b.f1850h0;
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public final void o(e eVar, boolean z10) {
        r(eVar, this.C, z10);
    }

    public final void r(e eVar, int i6, boolean z10) {
        this.D = i6;
        if (z10) {
            int i10 = this.C;
            if (i10 == 5) {
                this.D = 1;
            } else if (i10 == 6) {
                this.D = 0;
            }
        } else {
            int i11 = this.C;
            if (i11 == 5) {
                this.D = 0;
            } else if (i11 == 6) {
                this.D = 1;
            }
        }
        if (eVar instanceof x.a) {
            ((x.a) eVar).f37328y0 = this.D;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.E.f37329z0 = z10;
    }

    public void setDpMargin(int i6) {
        this.E.A0 = (int) ((i6 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i6) {
        this.E.A0 = i6;
    }

    public void setType(int i6) {
        this.C = i6;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
