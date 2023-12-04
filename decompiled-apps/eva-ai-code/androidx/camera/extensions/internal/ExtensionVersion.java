package androidx.camera.extensions.internal;

import androidx.camera.core.Logger;
import androidx.camera.extensions.impl.ExtensionVersionImpl;
/* loaded from: classes.dex */
public abstract class ExtensionVersion {
    private static final String TAG = "ExtenderVersion";
    private static volatile ExtensionVersion sExtensionVersion;

    abstract Version getVersionObject();

    abstract boolean isAdvancedExtenderSupportedInternal();

    private static ExtensionVersion getInstance() {
        if (sExtensionVersion != null) {
            return sExtensionVersion;
        }
        synchronized (ExtensionVersion.class) {
            if (sExtensionVersion == null) {
                try {
                    sExtensionVersion = new VendorExtenderVersioning();
                } catch (NoClassDefFoundError unused) {
                    Logger.d(TAG, "No versioning extender found. Falling back to default.");
                    sExtensionVersion = new DefaultExtenderVersioning();
                }
            }
        }
        return sExtensionVersion;
    }

    public static boolean isExtensionVersionSupported() {
        return getInstance().getVersionObject() != null;
    }

    public static Version getRuntimeVersion() {
        return getInstance().getVersionObject();
    }

    public static boolean isAdvancedExtenderSupported() {
        return getInstance().isAdvancedExtenderSupportedInternal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class VendorExtenderVersioning extends ExtensionVersion {
        private static ExtensionVersionImpl sImpl;
        private Version mRuntimeVersion;

        VendorExtenderVersioning() {
            if (sImpl == null) {
                sImpl = new ExtensionVersionImpl();
            }
            Version parse = Version.parse(sImpl.checkApiVersion(VersionName.getCurrentVersion().toVersionString()));
            if (parse != null && VersionName.getCurrentVersion().getVersion().getMajor() == parse.getMajor()) {
                this.mRuntimeVersion = parse;
            }
            Logger.d(ExtensionVersion.TAG, "Selected vendor runtime: " + this.mRuntimeVersion);
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        Version getVersionObject() {
            return this.mRuntimeVersion;
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        boolean isAdvancedExtenderSupportedInternal() {
            try {
                return sImpl.isAdvancedExtenderImplemented();
            } catch (NoSuchMethodError unused) {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class DefaultExtenderVersioning extends ExtensionVersion {
        @Override // androidx.camera.extensions.internal.ExtensionVersion
        Version getVersionObject() {
            return null;
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        boolean isAdvancedExtenderSupportedInternal() {
            return false;
        }

        DefaultExtenderVersioning() {
        }
    }
}
