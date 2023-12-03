package a0;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: MotionHelper.java */
/* loaded from: classes.dex */
public final class o extends androidx.constraintlayout.widget.a implements MotionLayout.h {
    public boolean C;
    public boolean D;
    public float E;
    public View[] F;

    public float getProgress() {
        return this.E;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tr.r.J);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 1) {
                    this.C = obtainStyledAttributes.getBoolean(index, this.C);
                } else if (index == 0) {
                    this.D = obtainStyledAttributes.getBoolean(index, this.D);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.E = f;
        int i6 = 0;
        if (this.f1806v > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.A;
            if (viewArr == null || viewArr.length != this.f1806v) {
                this.A = new View[this.f1806v];
            }
            for (int i10 = 0; i10 < this.f1806v; i10++) {
                this.A[i10] = constraintLayout.c(this.f1805u[i10]);
            }
            this.F = this.A;
            while (i6 < this.f1806v) {
                View view = this.F[i6];
                i6++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i6 < childCount) {
            boolean z10 = viewGroup.getChildAt(i6) instanceof o;
            i6++;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void b() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void c() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void d() {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void a(int i6) {
    }
}
