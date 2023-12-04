package androidx.camera.view.transform;

import android.graphics.Matrix;
import android.util.Size;
/* loaded from: classes.dex */
public final class OutputTransform {
    final Matrix mMatrix;
    final Size mViewPortSize;

    public OutputTransform(Matrix matrix, Size size) {
        this.mMatrix = matrix;
        this.mViewPortSize = size;
    }

    public Matrix getMatrix() {
        return this.mMatrix;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Size getViewPortSize() {
        return this.mViewPortSize;
    }
}
