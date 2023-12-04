package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraConfigProvider;
/* loaded from: classes.dex */
public interface CameraConfigProvider {
    public static final CameraConfigProvider EMPTY = new CameraConfigProvider() { // from class: androidx.camera.core.impl.CameraConfigProvider$$ExternalSyntheticLambda0
        @Override // androidx.camera.core.impl.CameraConfigProvider
        public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
            return CameraConfigProvider.CC.lambda$static$0(cameraInfo, context);
        }
    };

    /* renamed from: androidx.camera.core.impl.CameraConfigProvider$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        static {
            CameraConfigProvider cameraConfigProvider = CameraConfigProvider.EMPTY;
        }

        public static /* synthetic */ CameraConfig lambda$static$0(CameraInfo cameraInfo, Context context) {
            return null;
        }
    }

    CameraConfig getConfig(CameraInfo cameraInfo, Context context);
}
