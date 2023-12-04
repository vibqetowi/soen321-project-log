package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder;
/* loaded from: classes.dex */
final class AutoValue_Camera2OutputConfigBuilder_SurfaceConfig extends Camera2OutputConfigBuilder.SurfaceConfig {
    private final Surface surface;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Camera2OutputConfigBuilder_SurfaceConfig(Surface surface) {
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.surface = surface;
    }

    @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfigBuilder.SurfaceConfig, androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig
    public Surface getSurface() {
        return this.surface;
    }

    public String toString() {
        return "SurfaceConfig{surface=" + this.surface + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Camera2OutputConfigBuilder.SurfaceConfig) {
            return this.surface.equals(((Camera2OutputConfigBuilder.SurfaceConfig) obj).getSurface());
        }
        return false;
    }

    public int hashCode() {
        return this.surface.hashCode() ^ 1000003;
    }
}
