package androidx.camera.camera2.internal.compat.params;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.activity.ComponentDialog$$ExternalSyntheticApiModelOutline0;
import androidx.camera.camera2.internal.compat.ApiCompat;
import java.util.List;
/* loaded from: classes.dex */
public final class OutputConfigurationCompat {
    public static final int SURFACE_GROUP_ID_NONE = -1;
    private final OutputConfigurationCompatImpl mImpl;

    /* loaded from: classes.dex */
    interface OutputConfigurationCompatImpl {
        void addSurface(Surface surface);

        void enableSurfaceSharing();

        int getMaxSharedSurfaceCount();

        Object getOutputConfiguration();

        String getPhysicalCameraId();

        Surface getSurface();

        int getSurfaceGroupId();

        List<Surface> getSurfaces();

        void removeSurface(Surface surface);

        void setPhysicalCameraId(String str);
    }

    public OutputConfigurationCompat(Surface surface) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new OutputConfigurationCompatApi28Impl(surface);
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.mImpl = new OutputConfigurationCompatApi26Impl(surface);
        } else if (Build.VERSION.SDK_INT >= 24) {
            this.mImpl = new OutputConfigurationCompatApi24Impl(surface);
        } else {
            this.mImpl = new OutputConfigurationCompatBaseImpl(surface);
        }
    }

    public <T> OutputConfigurationCompat(Size size, Class<T> cls) {
        OutputConfiguration newOutputConfiguration = ApiCompat.Api26Impl.newOutputConfiguration(size, cls);
        if (Build.VERSION.SDK_INT >= 28) {
            this.mImpl = OutputConfigurationCompatApi28Impl.wrap(newOutputConfiguration);
        } else {
            this.mImpl = OutputConfigurationCompatApi26Impl.wrap(newOutputConfiguration);
        }
    }

    private OutputConfigurationCompat(OutputConfigurationCompatImpl outputConfigurationCompatImpl) {
        this.mImpl = outputConfigurationCompatImpl;
    }

    public static OutputConfigurationCompat wrap(Object obj) {
        OutputConfigurationCompatImpl wrap;
        if (obj == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            wrap = OutputConfigurationCompatApi28Impl.wrap(ComponentDialog$$ExternalSyntheticApiModelOutline0.m(obj));
        } else if (Build.VERSION.SDK_INT >= 26) {
            wrap = OutputConfigurationCompatApi26Impl.wrap(ComponentDialog$$ExternalSyntheticApiModelOutline0.m(obj));
        } else {
            wrap = Build.VERSION.SDK_INT >= 24 ? OutputConfigurationCompatApi24Impl.wrap(ComponentDialog$$ExternalSyntheticApiModelOutline0.m(obj)) : null;
        }
        if (wrap == null) {
            return null;
        }
        return new OutputConfigurationCompat(wrap);
    }

    public void enableSurfaceSharing() {
        this.mImpl.enableSurfaceSharing();
    }

    public String getPhysicalCameraId() {
        return this.mImpl.getPhysicalCameraId();
    }

    public void setPhysicalCameraId(String str) {
        this.mImpl.setPhysicalCameraId(str);
    }

    public void addSurface(Surface surface) {
        this.mImpl.addSurface(surface);
    }

    public void removeSurface(Surface surface) {
        this.mImpl.removeSurface(surface);
    }

    public int getMaxSharedSurfaceCount() {
        return this.mImpl.getMaxSharedSurfaceCount();
    }

    public Surface getSurface() {
        return this.mImpl.getSurface();
    }

    public List<Surface> getSurfaces() {
        return this.mImpl.getSurfaces();
    }

    public int getSurfaceGroupId() {
        return this.mImpl.getSurfaceGroupId();
    }

    public boolean equals(Object obj) {
        if (obj instanceof OutputConfigurationCompat) {
            return this.mImpl.equals(((OutputConfigurationCompat) obj).mImpl);
        }
        return false;
    }

    public int hashCode() {
        return this.mImpl.hashCode();
    }

    public Object unwrap() {
        return this.mImpl.getOutputConfiguration();
    }
}
