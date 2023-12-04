package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.UseCaseEventConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
class MeteringRepeatingSession {
    private static final String TAG = "MeteringRepeating";
    private DeferrableSurface mDeferrableSurface;
    private final SessionConfig mSessionConfig;
    private final SupportedRepeatingSurfaceSize mSupportedRepeatingSurfaceSize = new SupportedRepeatingSurfaceSize();

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getName() {
        return TAG;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MeteringRepeatingSession(CameraCharacteristicsCompat cameraCharacteristicsCompat, DisplayInfoManager displayInfoManager) {
        MeteringRepeatingConfig meteringRepeatingConfig = new MeteringRepeatingConfig();
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size properPreviewSize = getProperPreviewSize(cameraCharacteristicsCompat, displayInfoManager);
        Logger.d(TAG, "MeteringSession SurfaceTexture size: " + properPreviewSize);
        surfaceTexture.setDefaultBufferSize(properPreviewSize.getWidth(), properPreviewSize.getHeight());
        final Surface surface = new Surface(surfaceTexture);
        SessionConfig.Builder createFrom = SessionConfig.Builder.createFrom(meteringRepeatingConfig);
        createFrom.setTemplateType(1);
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        this.mDeferrableSurface = immediateSurface;
        Futures.addCallback(immediateSurface.getTerminationFuture(), new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.MeteringRepeatingSession.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r1) {
                surface.release();
                surfaceTexture.release();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
            }
        }, CameraXExecutors.directExecutor());
        createFrom.addSurface(this.mDeferrableSurface);
        this.mSessionConfig = createFrom.build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionConfig getSessionConfig() {
        return this.mSessionConfig;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clear() {
        Logger.d(TAG, "MeteringRepeating clear!");
        DeferrableSurface deferrableSurface = this.mDeferrableSurface;
        if (deferrableSurface != null) {
            deferrableSurface.close();
        }
        this.mDeferrableSurface = null;
    }

    /* loaded from: classes.dex */
    private static class MeteringRepeatingConfig implements UseCaseConfig<UseCase> {
        private final Config mConfig;

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ boolean containsOption(Config.Option option) {
            boolean containsOption;
            containsOption = getConfig().containsOption(option);
            return containsOption;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ void findOptions(String str, Config.OptionMatcher optionMatcher) {
            getConfig().findOptions(str, optionMatcher);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CameraSelector getCameraSelector() {
            return UseCaseConfig.CC.$default$getCameraSelector(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CameraSelector getCameraSelector(CameraSelector cameraSelector) {
            return UseCaseConfig.CC.$default$getCameraSelector(this, cameraSelector);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker() {
            return UseCaseConfig.CC.$default$getCaptureOptionUnpacker(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CaptureConfig.OptionUnpacker getCaptureOptionUnpacker(CaptureConfig.OptionUnpacker optionUnpacker) {
            return UseCaseConfig.CC.$default$getCaptureOptionUnpacker(this, optionUnpacker);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CaptureConfig getDefaultCaptureConfig() {
            return UseCaseConfig.CC.$default$getDefaultCaptureConfig(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ CaptureConfig getDefaultCaptureConfig(CaptureConfig captureConfig) {
            return UseCaseConfig.CC.$default$getDefaultCaptureConfig(this, captureConfig);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ SessionConfig getDefaultSessionConfig() {
            return UseCaseConfig.CC.$default$getDefaultSessionConfig(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ SessionConfig getDefaultSessionConfig(SessionConfig sessionConfig) {
            return UseCaseConfig.CC.$default$getDefaultSessionConfig(this, sessionConfig);
        }

        @Override // androidx.camera.core.impl.ImageInputConfig
        public /* synthetic */ int getInputFormat() {
            int intValue;
            intValue = ((Integer) retrieveOption(ImageInputConfig.OPTION_INPUT_FORMAT)).intValue();
            return intValue;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Config.OptionPriority getOptionPriority(Config.Option option) {
            Config.OptionPriority optionPriority;
            optionPriority = getConfig().getOptionPriority(option);
            return optionPriority;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Set getPriorities(Config.Option option) {
            Set priorities;
            priorities = getConfig().getPriorities(option);
            return priorities;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker() {
            return UseCaseConfig.CC.$default$getSessionOptionUnpacker(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ SessionConfig.OptionUnpacker getSessionOptionUnpacker(SessionConfig.OptionUnpacker optionUnpacker) {
            return UseCaseConfig.CC.$default$getSessionOptionUnpacker(this, optionUnpacker);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ int getSurfaceOccupancyPriority() {
            int intValue;
            intValue = ((Integer) retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY)).intValue();
            return intValue;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ int getSurfaceOccupancyPriority(int i) {
            int intValue;
            intValue = ((Integer) retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i))).intValue();
            return intValue;
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ Class getTargetClass() {
            return TargetConfig.CC.$default$getTargetClass(this);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ Class getTargetClass(Class cls) {
            return TargetConfig.CC.$default$getTargetClass(this, cls);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ Range getTargetFramerate() {
            return UseCaseConfig.CC.$default$getTargetFramerate(this);
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public /* synthetic */ Range getTargetFramerate(Range range) {
            return UseCaseConfig.CC.$default$getTargetFramerate(this, range);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ String getTargetName() {
            return TargetConfig.CC.$default$getTargetName(this);
        }

        @Override // androidx.camera.core.internal.TargetConfig
        public /* synthetic */ String getTargetName(String str) {
            return TargetConfig.CC.$default$getTargetName(this, str);
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig
        public /* synthetic */ UseCase.EventCallback getUseCaseEventCallback() {
            return UseCaseEventConfig.CC.$default$getUseCaseEventCallback(this);
        }

        @Override // androidx.camera.core.internal.UseCaseEventConfig
        public /* synthetic */ UseCase.EventCallback getUseCaseEventCallback(UseCase.EventCallback eventCallback) {
            return UseCaseEventConfig.CC.$default$getUseCaseEventCallback(this, eventCallback);
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Set listOptions() {
            Set listOptions;
            listOptions = getConfig().listOptions();
            return listOptions;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Object retrieveOption(Config.Option option) {
            Object retrieveOption;
            retrieveOption = getConfig().retrieveOption(option);
            return retrieveOption;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Object retrieveOption(Config.Option option, Object obj) {
            Object retrieveOption;
            retrieveOption = getConfig().retrieveOption(option, obj);
            return retrieveOption;
        }

        @Override // androidx.camera.core.impl.ReadableConfig, androidx.camera.core.impl.Config
        public /* synthetic */ Object retrieveOptionWithPriority(Config.Option option, Config.OptionPriority optionPriority) {
            Object retrieveOptionWithPriority;
            retrieveOptionWithPriority = getConfig().retrieveOptionWithPriority(option, optionPriority);
            return retrieveOptionWithPriority;
        }

        MeteringRepeatingConfig() {
            MutableOptionsBundle create = MutableOptionsBundle.create();
            create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, new Camera2SessionOptionUnpacker());
            this.mConfig = create;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public Config getConfig() {
            return this.mConfig;
        }
    }

    private Size getProperPreviewSize(CameraCharacteristicsCompat cameraCharacteristicsCompat, DisplayInfoManager displayInfoManager) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            Logger.e(TAG, "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.");
            return new Size(0, 0);
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(34);
        if (outputSizes == null) {
            Logger.e(TAG, "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] supportedSizes = this.mSupportedRepeatingSurfaceSize.getSupportedSizes(outputSizes);
        List asList = Arrays.asList(supportedSizes);
        Collections.sort(asList, new Comparator() { // from class: androidx.camera.camera2.internal.MeteringRepeatingSession$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int signum;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
                return signum;
            }
        });
        Size previewSize = displayInfoManager.getPreviewSize();
        long min = Math.min(previewSize.getWidth() * previewSize.getHeight(), 307200L);
        int length = supportedSizes.length;
        Size size = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Size size2 = supportedSizes[i];
            int i2 = ((size2.getWidth() * size2.getHeight()) > min ? 1 : ((size2.getWidth() * size2.getHeight()) == min ? 0 : -1));
            if (i2 == 0) {
                return size2;
            }
            if (i2 <= 0) {
                i++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) asList.get(0);
    }
}
