package androidx.camera.video;

import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Observable;
/* loaded from: classes.dex */
public interface VideoOutput {

    /* loaded from: classes.dex */
    public enum SourceState {
        ACTIVE_STREAMING,
        ACTIVE_NON_STREAMING,
        INACTIVE
    }

    Observable<MediaSpec> getMediaSpec();

    Observable<StreamInfo> getStreamInfo();

    void onSourceStateChanged(SourceState sourceState);

    void onSurfaceRequested(SurfaceRequest surfaceRequest);

    /* renamed from: androidx.camera.video.VideoOutput$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static void $default$onSourceStateChanged(VideoOutput _this, SourceState sourceState) {
        }
    }
}
