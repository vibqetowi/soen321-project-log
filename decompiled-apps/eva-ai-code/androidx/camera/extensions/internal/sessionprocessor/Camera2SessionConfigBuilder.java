package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
class Camera2SessionConfigBuilder {
    private int mSessionTemplateId = 1;
    private Map<CaptureRequest.Key<?>, Object> mSessionParameters = new HashMap();
    private List<Camera2OutputConfig> mCamera2OutputConfigs = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Camera2SessionConfigBuilder addOutputConfig(Camera2OutputConfig camera2OutputConfig) {
        this.mCamera2OutputConfigs.add(camera2OutputConfig);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T> Camera2SessionConfigBuilder addSessionParameter(CaptureRequest.Key<T> key, T t) {
        this.mSessionParameters.put(key, t);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Camera2SessionConfigBuilder setSessionTemplateId(int i) {
        this.mSessionTemplateId = i;
        return this;
    }

    int getSessionTemplateId() {
        return this.mSessionTemplateId;
    }

    Map<CaptureRequest.Key<?>, Object> getSessionParameters() {
        return this.mSessionParameters;
    }

    List<Camera2OutputConfig> getCamera2OutputConfigs() {
        return this.mCamera2OutputConfigs;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Camera2SessionConfig build() {
        return new SessionConfigImpl(this.mSessionTemplateId, this.mSessionParameters, this.mCamera2OutputConfigs);
    }

    /* loaded from: classes.dex */
    private static class SessionConfigImpl implements Camera2SessionConfig {
        private final List<Camera2OutputConfig> mCamera2OutputConfigs;
        private final Map<CaptureRequest.Key<?>, Object> mSessionParameters;
        private final int mSessionTemplateId;

        SessionConfigImpl(int i, Map<CaptureRequest.Key<?>, Object> map, List<Camera2OutputConfig> list) {
            this.mSessionTemplateId = i;
            this.mSessionParameters = map;
            this.mCamera2OutputConfigs = list;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig
        public List<Camera2OutputConfig> getOutputConfigs() {
            return this.mCamera2OutputConfigs;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig
        public Map<CaptureRequest.Key<?>, Object> getSessionParameters() {
            return this.mSessionParameters;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2SessionConfig
        public int getSessionTemplateId() {
            return this.mSessionTemplateId;
        }
    }
}
