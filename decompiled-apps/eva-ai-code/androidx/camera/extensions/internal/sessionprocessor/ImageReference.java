package androidx.camera.extensions.internal.sessionprocessor;

import android.media.Image;
/* loaded from: classes.dex */
public interface ImageReference {
    boolean decrement();

    Image get();

    boolean increment();
}
