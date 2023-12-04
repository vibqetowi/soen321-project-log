package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.util.Preconditions;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class OutputConfigurationCompatApi24Impl extends OutputConfigurationCompatBaseImpl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public OutputConfigurationCompatApi24Impl(Surface surface) {
        this(new OutputConfigurationParamsApi24(new OutputConfiguration(surface)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OutputConfigurationCompatApi24Impl(Object obj) {
        super(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OutputConfigurationCompatApi24Impl wrap(OutputConfiguration outputConfiguration) {
        return new OutputConfigurationCompatApi24Impl(new OutputConfigurationParamsApi24(outputConfiguration));
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void enableSurfaceSharing() {
        ((OutputConfigurationParamsApi24) this.mObject).mIsShared = true;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl
    boolean isSurfaceSharingEnabled() {
        return ((OutputConfigurationParamsApi24) this.mObject).mIsShared;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public void setPhysicalCameraId(String str) {
        ((OutputConfigurationParamsApi24) this.mObject).mPhysicalCameraId = str;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public String getPhysicalCameraId() {
        return ((OutputConfigurationParamsApi24) this.mObject).mPhysicalCameraId;
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Surface getSurface() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurface();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public List<Surface> getSurfaces() {
        return Collections.singletonList(getSurface());
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public int getSurfaceGroupId() {
        return ((OutputConfiguration) getOutputConfiguration()).getSurfaceGroupId();
    }

    @Override // androidx.camera.camera2.internal.compat.params.OutputConfigurationCompatBaseImpl, androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat.OutputConfigurationCompatImpl
    public Object getOutputConfiguration() {
        Preconditions.checkArgument(this.mObject instanceof OutputConfigurationParamsApi24);
        return ((OutputConfigurationParamsApi24) this.mObject).mOutputConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class OutputConfigurationParamsApi24 {
        boolean mIsShared;
        final OutputConfiguration mOutputConfiguration;
        String mPhysicalCameraId;

        OutputConfigurationParamsApi24(OutputConfiguration outputConfiguration) {
            this.mOutputConfiguration = outputConfiguration;
        }

        public boolean equals(Object obj) {
            if (obj instanceof OutputConfigurationParamsApi24) {
                OutputConfigurationParamsApi24 outputConfigurationParamsApi24 = (OutputConfigurationParamsApi24) obj;
                return Objects.equals(this.mOutputConfiguration, outputConfigurationParamsApi24.mOutputConfiguration) && this.mIsShared == outputConfigurationParamsApi24.mIsShared && Objects.equals(this.mPhysicalCameraId, outputConfigurationParamsApi24.mPhysicalCameraId);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.mOutputConfiguration.hashCode() ^ 31;
            int i = (this.mIsShared ? 1 : 0) ^ ((hashCode << 5) - hashCode);
            int i2 = (i << 5) - i;
            String str = this.mPhysicalCameraId;
            return (str == null ? 0 : str.hashCode()) ^ i2;
        }
    }
}
