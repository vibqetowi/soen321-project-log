package androidx.camera.extensions;

import android.content.Context;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.extensions.ExtensionsConfig;
import androidx.camera.extensions.internal.AdvancedVendorExtender;
import androidx.camera.extensions.internal.BasicVendorExtender;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory;
import androidx.camera.extensions.internal.VendorExtender;
import androidx.camera.extensions.internal.Version;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
final class ExtensionsInfo {
    private static final String EXTENDED_CAMERA_CONFIG_PROVIDER_ID_PREFIX = ":camera:camera-extensions-";
    private final CameraProvider mCameraProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExtensionsInfo(CameraProvider cameraProvider) {
        this.mCameraProvider = cameraProvider;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CameraSelector getExtensionCameraSelectorAndInjectCameraConfig(CameraSelector cameraSelector, int i) {
        if (!isExtensionAvailable(cameraSelector, i)) {
            throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof ExtensionCameraFilter) {
                throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
            }
        }
        injectExtensionCameraConfig(i);
        CameraSelector.Builder fromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        fromSelector.addCameraFilter(getFilter(i));
        return fromSelector.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isExtensionAvailable(CameraSelector cameraSelector, int i) {
        CameraSelector.Builder fromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        fromSelector.addCameraFilter(getFilter(i));
        return !fromSelector.build().filter(this.mCameraProvider.getAvailableCameraInfos()).isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Range<Long> getEstimatedCaptureLatencyRange(CameraSelector cameraSelector, int i, Size size) {
        List<CameraInfo> filter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (filter.isEmpty()) {
            throw new IllegalArgumentException("No cameras found for given CameraSelector");
        }
        CameraInfo cameraInfo = filter.get(0);
        if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) < 0) {
            return null;
        }
        try {
            VendorExtender vendorExtender = getVendorExtender(i);
            vendorExtender.init(cameraInfo);
            return vendorExtender.getEstimatedCaptureLatencyRange(size);
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    private static CameraFilter getFilter(int i) {
        return new ExtensionCameraFilter(getExtendedCameraConfigProviderId(i), getVendorExtender(i));
    }

    private static void injectExtensionCameraConfig(final int i) {
        final Identifier create = Identifier.create(getExtendedCameraConfigProviderId(i));
        if (ExtendedCameraConfigProviderStore.getConfigProvider(create) == CameraConfigProvider.EMPTY) {
            ExtendedCameraConfigProviderStore.addConfig(create, new CameraConfigProvider() { // from class: androidx.camera.extensions.ExtensionsInfo$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.impl.CameraConfigProvider
                public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
                    return ExtensionsInfo.lambda$injectExtensionCameraConfig$0(i, create, cameraInfo, context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ CameraConfig lambda$injectExtensionCameraConfig$0(int i, Identifier identifier, CameraInfo cameraInfo, Context context) {
        VendorExtender vendorExtender = getVendorExtender(i);
        vendorExtender.init(cameraInfo);
        ExtensionsConfig.Builder useCaseCombinationRequiredRule = new ExtensionsConfig.Builder().setExtensionMode(i).setUseCaseConfigFactory((UseCaseConfigFactory) new ExtensionsUseCaseConfigFactory(i, vendorExtender, context)).setCompatibilityId(identifier).setZslDisabled(true).setUseCaseCombinationRequiredRule(1);
        SessionProcessor createSessionProcessor = vendorExtender.createSessionProcessor(context);
        if (createSessionProcessor != null) {
            useCaseCombinationRequiredRule.setSessionProcessor(createSessionProcessor);
        }
        return useCaseCombinationRequiredRule.build();
    }

    private static VendorExtender getVendorExtender(int i) {
        if (isAdvancedExtenderSupported()) {
            return new AdvancedVendorExtender(i);
        }
        return new BasicVendorExtender(i);
    }

    private static boolean isAdvancedExtenderSupported() {
        if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) < 0) {
            return false;
        }
        return ExtensionVersion.isAdvancedExtenderSupported();
    }

    private static String getExtendedCameraConfigProviderId(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
                            }
                            throw new IllegalArgumentException("Invalid extension mode!");
                        }
                        return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
                    }
                    return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
                }
                return ":camera:camera-extensions-EXTENSION_MODE_HDR";
            }
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        return ":camera:camera-extensions-EXTENSION_MODE_NONE";
    }
}
