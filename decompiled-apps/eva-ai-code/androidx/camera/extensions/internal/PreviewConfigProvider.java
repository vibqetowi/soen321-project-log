package androidx.camera.extensions.internal;

import android.content.Context;
import android.os.Build;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.CameraEventCallback;
import androidx.camera.camera2.impl.CameraEventCallbacks;
import androidx.camera.camera2.interop.Camera2CameraInfo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.extensions.impl.CaptureStageImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
/* loaded from: classes.dex */
public class PreviewConfigProvider implements ConfigProvider<PreviewConfig> {
    static final Config.Option<Integer> OPTION_PREVIEW_CONFIG_PROVIDER_MODE = Config.Option.create("camerax.extensions.previewConfigProvider.mode", Integer.class);
    private static final String TAG = "PreviewConfigProvider";
    private final Context mContext;
    private final int mEffectMode;
    private final VendorExtender mVendorExtender;

    public PreviewConfigProvider(int i, VendorExtender vendorExtender, Context context) {
        this.mEffectMode = i;
        this.mVendorExtender = vendorExtender;
        this.mContext = context;
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    public PreviewConfig getConfig() {
        Preview.Builder builder = new Preview.Builder();
        updateBuilderConfig(builder, this.mEffectMode, this.mVendorExtender, this.mContext);
        return builder.getUseCaseConfig();
    }

    void updateBuilderConfig(Preview.Builder builder, int i, VendorExtender vendorExtender, Context context) {
        UseCase.EventCallback previewEventAdapter;
        UseCase.EventCallback eventCallback;
        if (vendorExtender instanceof BasicVendorExtender) {
            PreviewExtenderImpl previewExtenderImpl = ((BasicVendorExtender) vendorExtender).getPreviewExtenderImpl();
            if (previewExtenderImpl != null) {
                int i2 = AnonymousClass1.$SwitchMap$androidx$camera$extensions$impl$PreviewExtenderImpl$ProcessorType[previewExtenderImpl.getProcessorType().ordinal()];
                if (i2 == 1) {
                    AdaptingRequestUpdateProcessor adaptingRequestUpdateProcessor = new AdaptingRequestUpdateProcessor(previewExtenderImpl);
                    builder.setImageInfoProcessor(adaptingRequestUpdateProcessor);
                    previewEventAdapter = new PreviewEventAdapter(previewExtenderImpl, context, adaptingRequestUpdateProcessor);
                } else if (i2 == 2) {
                    AdaptingPreviewProcessor adaptingPreviewProcessor = new AdaptingPreviewProcessor(previewExtenderImpl.getProcessor());
                    builder.setCaptureProcessor(adaptingPreviewProcessor);
                    builder.setIsRgba8888SurfaceRequired(true);
                    previewEventAdapter = new PreviewEventAdapter(previewExtenderImpl, context, adaptingPreviewProcessor);
                } else {
                    eventCallback = new PreviewEventAdapter(previewExtenderImpl, context, null);
                    new Camera2ImplConfig.Extender(builder).setCameraEventCallback(new CameraEventCallbacks(eventCallback));
                    builder.setUseCaseEventCallback(eventCallback);
                }
                eventCallback = previewEventAdapter;
                new Camera2ImplConfig.Extender(builder).setCameraEventCallback(new CameraEventCallbacks(eventCallback));
                builder.setUseCaseEventCallback(eventCallback);
            } else {
                Logger.e(TAG, "PreviewExtenderImpl is null!");
            }
        } else {
            builder.setIsRgba8888SurfaceRequired(true);
        }
        builder.getMutableConfig().insertOption(OPTION_PREVIEW_CONFIG_PROVIDER_MODE, Integer.valueOf(i));
        builder.setSupportedResolutions(vendorExtender.getSupportedPreviewOutputResolutions());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.extensions.internal.PreviewConfigProvider$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$extensions$impl$PreviewExtenderImpl$ProcessorType;

        static {
            int[] iArr = new int[PreviewExtenderImpl.ProcessorType.values().length];
            $SwitchMap$androidx$camera$extensions$impl$PreviewExtenderImpl$ProcessorType = iArr;
            try {
                iArr[PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_REQUEST_UPDATE_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$extensions$impl$PreviewExtenderImpl$ProcessorType[PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class PreviewEventAdapter extends CameraEventCallback implements UseCase.EventCallback {
        final CloseableProcessor mCloseableProcessor;
        private final Context mContext;
        final PreviewExtenderImpl mImpl;
        volatile boolean mActive = true;
        final Object mLock = new Object();
        private volatile int mEnabledSessionCount = 0;
        private volatile boolean mUnbind = false;

        PreviewEventAdapter(PreviewExtenderImpl previewExtenderImpl, Context context, CloseableProcessor closeableProcessor) {
            this.mImpl = previewExtenderImpl;
            this.mContext = context;
            this.mCloseableProcessor = closeableProcessor;
        }

        @Override // androidx.camera.core.UseCase.EventCallback
        public void onAttach(CameraInfo cameraInfo) {
            synchronized (this.mLock) {
                if (this.mActive) {
                    this.mImpl.onInit(Camera2CameraInfo.from(cameraInfo).getCameraId(), Camera2CameraInfo.extractCameraCharacteristics(cameraInfo), this.mContext);
                }
            }
        }

        @Override // androidx.camera.core.UseCase.EventCallback
        public void onDetach() {
            synchronized (this.mLock) {
                this.mUnbind = true;
                if (this.mEnabledSessionCount == 0) {
                    callDeInit();
                }
            }
        }

        private void callDeInit() {
            synchronized (this.mLock) {
                if (this.mActive) {
                    CloseableProcessor closeableProcessor = this.mCloseableProcessor;
                    if (closeableProcessor != null) {
                        closeableProcessor.close();
                    }
                    this.mImpl.onDeInit();
                    this.mActive = false;
                }
            }
        }

        @Override // androidx.camera.camera2.impl.CameraEventCallback
        public CaptureConfig onPresetSession() {
            synchronized (this.mLock) {
                CaptureStageImpl onPresetSession = this.mImpl.onPresetSession();
                if (onPresetSession != null) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        return new AdaptingCaptureStage(onPresetSession).getCaptureConfig();
                    }
                    Logger.w(PreviewConfigProvider.TAG, "The CaptureRequest parameters returned from onPresetSession() will be passed to the camera device as part of the capture session via SessionConfiguration#setSessionParameters(CaptureRequest) which only supported from API level 28!");
                }
                return null;
            }
        }

        @Override // androidx.camera.camera2.impl.CameraEventCallback
        public CaptureConfig onEnableSession() {
            CaptureStageImpl onEnableSession;
            try {
                synchronized (this.mLock) {
                    if (!this.mActive || (onEnableSession = this.mImpl.onEnableSession()) == null) {
                        synchronized (this.mLock) {
                            this.mEnabledSessionCount++;
                        }
                        return null;
                    }
                    CaptureConfig captureConfig = new AdaptingCaptureStage(onEnableSession).getCaptureConfig();
                    synchronized (this.mLock) {
                        this.mEnabledSessionCount++;
                    }
                    return captureConfig;
                }
            } catch (Throwable th) {
                synchronized (this.mLock) {
                    this.mEnabledSessionCount++;
                    throw th;
                }
            }
        }

        @Override // androidx.camera.camera2.impl.CameraEventCallback
        public CaptureConfig onDisableSession() {
            CaptureStageImpl onDisableSession;
            try {
                synchronized (this.mLock) {
                    if (!this.mActive || (onDisableSession = this.mImpl.onDisableSession()) == null) {
                        synchronized (this.mLock) {
                            this.mEnabledSessionCount--;
                            if (this.mEnabledSessionCount == 0 && this.mUnbind) {
                                callDeInit();
                            }
                        }
                        return null;
                    }
                    CaptureConfig captureConfig = new AdaptingCaptureStage(onDisableSession).getCaptureConfig();
                    synchronized (this.mLock) {
                        this.mEnabledSessionCount--;
                        if (this.mEnabledSessionCount == 0 && this.mUnbind) {
                            callDeInit();
                        }
                    }
                    return captureConfig;
                }
            } catch (Throwable th) {
                synchronized (this.mLock) {
                    this.mEnabledSessionCount--;
                    if (this.mEnabledSessionCount == 0 && this.mUnbind) {
                        callDeInit();
                    }
                    throw th;
                }
            }
        }

        @Override // androidx.camera.camera2.impl.CameraEventCallback
        public CaptureConfig onRepeating() {
            CaptureStageImpl captureStage;
            synchronized (this.mLock) {
                if (!this.mActive || (captureStage = this.mImpl.getCaptureStage()) == null) {
                    return null;
                }
                return new AdaptingCaptureStage(captureStage).getCaptureConfig();
            }
        }
    }
}
