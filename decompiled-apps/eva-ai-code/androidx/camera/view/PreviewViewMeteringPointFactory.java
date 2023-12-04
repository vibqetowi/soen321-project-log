package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import androidx.camera.core.MeteringPointFactory;
import androidx.camera.core.impl.utils.Threads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class PreviewViewMeteringPointFactory extends MeteringPointFactory {
    static final PointF INVALID_POINT = new PointF(2.0f, 2.0f);
    private Matrix mMatrix;
    private final PreviewTransformation mPreviewTransformation;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PreviewViewMeteringPointFactory(PreviewTransformation previewTransformation) {
        this.mPreviewTransformation = previewTransformation;
    }

    @Override // androidx.camera.core.MeteringPointFactory
    protected PointF convertPoint(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            Matrix matrix = this.mMatrix;
            if (matrix == null) {
                return INVALID_POINT;
            }
            matrix.mapPoints(fArr);
            return new PointF(fArr[0], fArr[1]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void recalculate(Size size, int i) {
        Threads.checkMainThread();
        synchronized (this) {
            if (size.getWidth() != 0 && size.getHeight() != 0) {
                this.mMatrix = this.mPreviewTransformation.getPreviewViewToNormalizedSurfaceMatrix(size, i);
                return;
            }
            this.mMatrix = null;
        }
    }
}
