package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.MultiResolutionImageReaderOutputConfigImpl;
import androidx.camera.extensions.impl.advanced.SurfaceOutputConfigImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
class Camera2OutputConfigBuilder {
    private static AtomicInteger sLastId = new AtomicInteger(0);
    private OutputConfig mOutputConfig;
    private String mPhysicalCameraId;
    private int mSurfaceGroupId;
    private List<Camera2OutputConfig> mSurfaceSharingConfigs;

    private Camera2OutputConfigBuilder(OutputConfig outputConfig) {
        this.mOutputConfig = outputConfig;
    }

    private int getNextId() {
        return sLastId.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Camera2OutputConfigBuilder fromImpl(Camera2OutputConfigImpl camera2OutputConfigImpl) {
        OutputConfig outputConfig;
        if (camera2OutputConfigImpl instanceof SurfaceOutputConfigImpl) {
            outputConfig = SurfaceConfig.create(((SurfaceOutputConfigImpl) camera2OutputConfigImpl).getSurface());
        } else if (camera2OutputConfigImpl instanceof ImageReaderOutputConfigImpl) {
            ImageReaderOutputConfigImpl imageReaderOutputConfigImpl = (ImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            outputConfig = ImageReaderConfig.create(imageReaderOutputConfigImpl.getSize(), imageReaderOutputConfigImpl.getImageFormat(), imageReaderOutputConfigImpl.getMaxImages());
        } else if (camera2OutputConfigImpl instanceof MultiResolutionImageReaderOutputConfigImpl) {
            MultiResolutionImageReaderOutputConfigImpl multiResolutionImageReaderOutputConfigImpl = (MultiResolutionImageReaderOutputConfigImpl) camera2OutputConfigImpl;
            outputConfig = MultiResolutionImageReaderConfig.create(multiResolutionImageReaderOutputConfigImpl.getImageFormat(), multiResolutionImageReaderOutputConfigImpl.getMaxImages());
        } else {
            outputConfig = null;
        }
        outputConfig.setPhysicalCameraId(camera2OutputConfigImpl.getPhysicalCameraId());
        outputConfig.setSurfaceGroup(camera2OutputConfigImpl.getSurfaceGroupId());
        if (camera2OutputConfigImpl.getSurfaceSharingOutputConfigs() != null) {
            ArrayList arrayList = new ArrayList();
            for (Camera2OutputConfigImpl camera2OutputConfigImpl2 : camera2OutputConfigImpl.getSurfaceSharingOutputConfigs()) {
                arrayList.add(fromImpl(camera2OutputConfigImpl2).build());
            }
            outputConfig.setSurfaceSharingConfigs(arrayList);
        }
        return new Camera2OutputConfigBuilder(outputConfig);
    }

    static Camera2OutputConfigBuilder newImageReaderConfig(Size size, int i, int i2) {
        return new Camera2OutputConfigBuilder(ImageReaderConfig.create(size, i, i2));
    }

    static Camera2OutputConfigBuilder newMultiResolutionImageReaderConfig(int i, int i2) {
        return new Camera2OutputConfigBuilder(MultiResolutionImageReaderConfig.create(i, i2));
    }

    static Camera2OutputConfigBuilder newSurfaceConfig(Surface surface) {
        return new Camera2OutputConfigBuilder(SurfaceConfig.create(surface));
    }

    Camera2OutputConfigBuilder addSurfaceSharingOutputConfig(Camera2OutputConfig camera2OutputConfig) {
        if (this.mSurfaceSharingConfigs == null) {
            this.mSurfaceSharingConfigs = new ArrayList();
        }
        this.mSurfaceSharingConfigs.add(camera2OutputConfig);
        return this;
    }

    Camera2OutputConfigBuilder setPhysicalCameraId(String str) {
        this.mPhysicalCameraId = str;
        return this;
    }

    Camera2OutputConfigBuilder setSurfaceGroupId(int i) {
        this.mSurfaceGroupId = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Camera2OutputConfig build() {
        this.mOutputConfig.setId(getNextId());
        this.mOutputConfig.setPhysicalCameraId(this.mPhysicalCameraId);
        this.mOutputConfig.setSurfaceGroup(this.mSurfaceGroupId);
        List<Camera2OutputConfig> list = this.mSurfaceSharingConfigs;
        if (list != null) {
            this.mOutputConfig.setSurfaceSharingConfigs(list);
        }
        return this.mOutputConfig;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class OutputConfig implements Camera2OutputConfig {
        private int mId = -1;
        private int mSurfaceGroup = 0;
        private String mPhysicalCameraId = null;
        private List<Camera2OutputConfig> mSurfaceSharingConfigs = Collections.emptyList();

        OutputConfig() {
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
        public int getId() {
            return this.mId;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
        public int getSurfaceGroupId() {
            return this.mSurfaceGroup;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
        public String getPhysicalCameraId() {
            return this.mPhysicalCameraId;
        }

        @Override // androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig
        public List<Camera2OutputConfig> getSurfaceSharingOutputConfigs() {
            return this.mSurfaceSharingConfigs;
        }

        public void setId(int i) {
            this.mId = i;
        }

        public void setSurfaceGroup(int i) {
            this.mSurfaceGroup = i;
        }

        public void setPhysicalCameraId(String str) {
            this.mPhysicalCameraId = str;
        }

        public void setSurfaceSharingConfigs(List<Camera2OutputConfig> list) {
            this.mSurfaceSharingConfigs = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class SurfaceConfig extends OutputConfig implements SurfaceOutputConfig {
        public abstract Surface getSurface();

        static SurfaceConfig create(Surface surface) {
            return new AutoValue_Camera2OutputConfigBuilder_SurfaceConfig(surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class ImageReaderConfig extends OutputConfig implements ImageReaderOutputConfig {
        public abstract int getImageFormat();

        public abstract int getMaxImages();

        public abstract Size getSize();

        static ImageReaderConfig create(Size size, int i, int i2) {
            return new AutoValue_Camera2OutputConfigBuilder_ImageReaderConfig(size, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class MultiResolutionImageReaderConfig extends OutputConfig implements MultiResolutionImageReaderOutputConfig {
        public abstract int getImageFormat();

        public abstract int getMaxImages();

        static MultiResolutionImageReaderConfig create(int i, int i2) {
            return new AutoValue_Camera2OutputConfigBuilder_MultiResolutionImageReaderConfig(i, i2);
        }
    }
}
