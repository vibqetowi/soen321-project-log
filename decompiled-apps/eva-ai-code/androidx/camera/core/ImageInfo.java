package androidx.camera.core;

import android.graphics.Matrix;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;
/* loaded from: classes.dex */
public interface ImageInfo {
    int getRotationDegrees();

    Matrix getSensorToBufferTransformMatrix();

    TagBundle getTagBundle();

    long getTimestamp();

    void populateExifData(ExifData.Builder builder);

    /* renamed from: androidx.camera.core.ImageInfo$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static Matrix $default$getSensorToBufferTransformMatrix(ImageInfo _this) {
            return new Matrix();
        }
    }
}
