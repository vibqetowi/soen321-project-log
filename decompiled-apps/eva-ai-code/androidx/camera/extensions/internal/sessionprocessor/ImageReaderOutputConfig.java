package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
/* loaded from: classes.dex */
public interface ImageReaderOutputConfig extends Camera2OutputConfig {
    int getImageFormat();

    int getMaxImages();

    Size getSize();
}
