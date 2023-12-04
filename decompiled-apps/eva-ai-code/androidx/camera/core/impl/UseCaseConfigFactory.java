package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.core.InitializationException;
/* loaded from: classes.dex */
public interface UseCaseConfigFactory {
    public static final UseCaseConfigFactory EMPTY_INSTANCE = new UseCaseConfigFactory() { // from class: androidx.camera.core.impl.UseCaseConfigFactory.1
        @Override // androidx.camera.core.impl.UseCaseConfigFactory
        public Config getConfig(CaptureType captureType, int i) {
            return null;
        }
    };

    /* loaded from: classes.dex */
    public enum CaptureType {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE
    }

    /* loaded from: classes.dex */
    public interface Provider {
        UseCaseConfigFactory newInstance(Context context) throws InitializationException;
    }

    Config getConfig(CaptureType captureType, int i);
}
