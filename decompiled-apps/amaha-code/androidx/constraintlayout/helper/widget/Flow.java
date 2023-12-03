package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.c;
import b0.g;
import tr.r;
import x.e;
import x.j;
import x.m;
/* loaded from: classes.dex */
public class Flow extends g {
    public x.g E;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // b0.g, androidx.constraintlayout.widget.a
    public final void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.E = new x.g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f33565y);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 0) {
                    this.E.b1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    x.g gVar = this.E;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f37441y0 = dimensionPixelSize;
                    gVar.f37442z0 = dimensionPixelSize;
                    gVar.A0 = dimensionPixelSize;
                    gVar.B0 = dimensionPixelSize;
                } else if (index == 18) {
                    x.g gVar2 = this.E;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.A0 = dimensionPixelSize2;
                    gVar2.C0 = dimensionPixelSize2;
                    gVar2.D0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.E.B0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.E.C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.E.f37441y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.E.D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.E.f37442z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.E.Z0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.E.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.E.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.E.L0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.E.N0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.E.M0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.E.O0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.E.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.E.R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.E.T0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.E.S0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.E.U0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.E.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.E.X0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.E.Y0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.E.V0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.E.W0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.E.f37412a1 = obtainStyledAttributes.getInt(index, -1);
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
        if (jVar instanceof x.g) {
            x.g gVar = (x.g) jVar;
            int i6 = aVar2.V;
            if (i6 != -1) {
                gVar.b1 = i6;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public final void o(e eVar, boolean z10) {
        x.g gVar = this.E;
        int i6 = gVar.A0;
        if (i6 > 0 || gVar.B0 > 0) {
            if (z10) {
                gVar.C0 = gVar.B0;
                gVar.D0 = i6;
                return;
            }
            gVar.C0 = i6;
            gVar.D0 = gVar.B0;
        }
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public final void onMeasure(int i6, int i10) {
        r(this.E, i6, i10);
    }

    @Override // b0.g
    public final void r(m mVar, int i6, int i10) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mVar != null) {
            mVar.V(mode, size, mode2, size2);
            setMeasuredDimension(mVar.F0, mVar.G0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public void setFirstHorizontalBias(float f) {
        this.E.R0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i6) {
        this.E.L0 = i6;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.E.S0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i6) {
        this.E.M0 = i6;
        requestLayout();
    }

    public void setHorizontalAlign(int i6) {
        this.E.X0 = i6;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.E.P0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i6) {
        this.E.V0 = i6;
        requestLayout();
    }

    public void setHorizontalStyle(int i6) {
        this.E.J0 = i6;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.E.T0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i6) {
        this.E.N0 = i6;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.E.U0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i6) {
        this.E.O0 = i6;
        requestLayout();
    }

    public void setMaxElementsWrap(int i6) {
        this.E.f37412a1 = i6;
        requestLayout();
    }

    public void setOrientation(int i6) {
        this.E.b1 = i6;
        requestLayout();
    }

    public void setPadding(int i6) {
        x.g gVar = this.E;
        gVar.f37441y0 = i6;
        gVar.f37442z0 = i6;
        gVar.A0 = i6;
        gVar.B0 = i6;
        requestLayout();
    }

    public void setPaddingBottom(int i6) {
        this.E.f37442z0 = i6;
        requestLayout();
    }

    public void setPaddingLeft(int i6) {
        this.E.C0 = i6;
        requestLayout();
    }

    public void setPaddingRight(int i6) {
        this.E.D0 = i6;
        requestLayout();
    }

    public void setPaddingTop(int i6) {
        this.E.f37441y0 = i6;
        requestLayout();
    }

    public void setVerticalAlign(int i6) {
        this.E.Y0 = i6;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.E.Q0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i6) {
        this.E.W0 = i6;
        requestLayout();
    }

    public void setVerticalStyle(int i6) {
        this.E.K0 = i6;
        requestLayout();
    }

    public void setWrapMode(int i6) {
        this.E.Z0 = i6;
        requestLayout();
    }
}
