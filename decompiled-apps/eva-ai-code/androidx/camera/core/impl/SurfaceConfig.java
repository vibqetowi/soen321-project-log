package androidx.camera.core.impl;
/* loaded from: classes.dex */
public abstract class SurfaceConfig {

    /* loaded from: classes.dex */
    public enum ConfigType {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    public abstract ConfigSize getConfigSize();

    public abstract ConfigType getConfigType();

    public static SurfaceConfig create(ConfigType configType, ConfigSize configSize) {
        return new AutoValue_SurfaceConfig(configType, configSize);
    }

    public final boolean isSupported(SurfaceConfig surfaceConfig) {
        return surfaceConfig.getConfigSize().getId() <= getConfigSize().getId() && surfaceConfig.getConfigType() == getConfigType();
    }

    /* loaded from: classes.dex */
    public enum ConfigSize {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);
        
        final int mId;

        ConfigSize(int i) {
            this.mId = i;
        }

        int getId() {
            return this.mId;
        }
    }
}
