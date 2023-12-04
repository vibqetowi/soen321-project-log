package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface ImageProxy extends AutoCloseable {

    /* loaded from: classes.dex */
    public interface PlaneProxy {
        ByteBuffer getBuffer();

        int getPixelStride();

        int getRowStride();
    }

    @Override // java.lang.AutoCloseable
    void close();

    Rect getCropRect();

    int getFormat();

    int getHeight();

    Image getImage();

    ImageInfo getImageInfo();

    PlaneProxy[] getPlanes();

    int getWidth();

    void setCropRect(Rect rect);
}
