package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
/* loaded from: classes.dex */
public class TransformUtils {
    public static final RectF NORMALIZED_RECT = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    private TransformUtils() {
    }

    public static Size rectToSize(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static RectF verticesToRect(float[] fArr) {
        return new RectF(min(fArr[0], fArr[2], fArr[4], fArr[6]), min(fArr[1], fArr[3], fArr[5], fArr[7]), max(fArr[0], fArr[2], fArr[4], fArr[6]), max(fArr[1], fArr[3], fArr[5], fArr[7]));
    }

    public static float max(float f, float f2, float f3, float f4) {
        return Math.max(Math.max(f, f2), Math.max(f3, f4));
    }

    public static float min(float f, float f2, float f3, float f4) {
        return Math.min(Math.min(f, f2), Math.min(f3, f4));
    }

    public static int surfaceRotationToRotationDegrees(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return 270;
                    }
                    throw new IllegalStateException("Unexpected rotation value " + i);
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }

    public static boolean is90or270(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException("Invalid rotation degrees: " + i);
    }

    public static float[] sizeToVertices(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static float[] rectToVertices(RectF rectF) {
        return new float[]{rectF.left, rectF.top, rectF.right, rectF.top, rectF.right, rectF.bottom, rectF.left, rectF.bottom};
    }

    public static boolean isAspectRatioMatchingWithRoundingError(Size size, boolean z, Size size2, boolean z2) {
        float width;
        float width2;
        float width3;
        float f;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z2) {
            width3 = size2.getWidth() / size2.getHeight();
            f = width3;
        } else {
            float width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            f = width4;
        }
        return width >= width3 && f >= width2;
    }

    public static Matrix getRectToRect(RectF rectF, RectF rectF2, int i) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, NORMALIZED_RECT, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i);
        matrix.postConcat(getNormalizedToBuffer(rectF2));
        return matrix;
    }

    public static Matrix getNormalizedToBuffer(Rect rect) {
        return getNormalizedToBuffer(new RectF(rect));
    }

    private static Matrix getNormalizedToBuffer(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(NORMALIZED_RECT, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Matrix getExifTransform(int i, int i2, int i3) {
        Matrix matrix = new Matrix();
        float f = i2;
        float f2 = i3;
        RectF rectF = new RectF(0.0f, 0.0f, f, f2);
        RectF rectF2 = NORMALIZED_RECT;
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
        boolean z = true;
        switch (i) {
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                z = false;
                break;
            case 3:
                matrix.postRotate(180.0f);
                z = false;
                break;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                z = false;
                break;
            case 5:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(270.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(90.0f);
                break;
            case 8:
                matrix.postRotate(270.0f);
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            rectF = new RectF(0.0f, 0.0f, f2, f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }
}
