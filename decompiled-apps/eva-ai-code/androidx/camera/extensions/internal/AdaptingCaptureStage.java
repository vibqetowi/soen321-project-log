package androidx.camera.extensions.internal;

import android.hardware.camera2.CaptureRequest;
import android.util.Pair;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.extensions.impl.CaptureStageImpl;
/* loaded from: classes.dex */
public final class AdaptingCaptureStage implements CaptureStage {
    private final CaptureConfig mCaptureRequestConfiguration;
    private final int mId;

    public AdaptingCaptureStage(CaptureStageImpl captureStageImpl) {
        this.mId = captureStageImpl.getId();
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        for (Pair pair : captureStageImpl.getParameters()) {
            builder.setCaptureRequestOption((CaptureRequest.Key) pair.first, pair.second);
        }
        CaptureConfig.Builder builder2 = new CaptureConfig.Builder();
        builder2.addImplementationOptions(builder.build());
        this.mCaptureRequestConfiguration = builder2.build();
    }

    @Override // androidx.camera.core.impl.CaptureStage
    public int getId() {
        return this.mId;
    }

    @Override // androidx.camera.core.impl.CaptureStage
    public CaptureConfig getCaptureConfig() {
        return this.mCaptureRequestConfiguration;
    }
}
