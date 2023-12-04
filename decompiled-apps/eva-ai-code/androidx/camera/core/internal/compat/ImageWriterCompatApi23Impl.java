package androidx.camera.core.internal.compat;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
/* loaded from: classes.dex */
final class ImageWriterCompatApi23Impl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static ImageWriter newInstance(Surface surface, int i) {
        return ImageWriter.newInstance(surface, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Image dequeueInputImage(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void queueInputImage(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void close(ImageWriter imageWriter) {
        imageWriter.close();
    }

    private ImageWriterCompatApi23Impl() {
    }
}
