package h2;

import android.graphics.Matrix;
import android.view.View;
/* compiled from: ViewUtilsApi29.java */
/* loaded from: classes.dex */
public final class y extends x {
    @Override // h2.u
    public final float E(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // h2.u
    public final void F(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // h2.v
    public final void G(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // h2.v
    public final void H(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // h2.w, df.b
    public final void y(View view, int i6, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i6, i10, i11, i12);
    }

    @Override // h2.x, df.b
    public final void z(int i6, View view) {
        view.setTransitionVisibility(i6);
    }
}
