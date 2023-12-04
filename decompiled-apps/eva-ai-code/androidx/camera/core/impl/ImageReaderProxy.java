package androidx.camera.core.impl;

import android.view.Surface;
import androidx.camera.core.ImageProxy;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public interface ImageReaderProxy {

    /* loaded from: classes.dex */
    public interface OnImageAvailableListener {
        void onImageAvailable(ImageReaderProxy imageReaderProxy);
    }

    ImageProxy acquireLatestImage();

    ImageProxy acquireNextImage();

    void clearOnImageAvailableListener();

    void close();

    int getHeight();

    int getImageFormat();

    int getMaxImages();

    Surface getSurface();

    int getWidth();

    void setOnImageAvailableListener(OnImageAvailableListener onImageAvailableListener, Executor executor);
}
