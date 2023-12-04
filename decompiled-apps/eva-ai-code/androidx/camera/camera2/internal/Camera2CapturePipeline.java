package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.compat.workaround.UseTorchAsFlash;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class Camera2CapturePipeline {
    private static final String TAG = "Camera2CapturePipeline";
    private final Camera2CameraControlImpl mCameraControl;
    private final Quirks mCameraQuirk;
    private final Executor mExecutor;
    private final boolean mIsLegacyDevice;
    private int mTemplate = 1;
    private final UseTorchAsFlash mUseTorchAsFlash;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface PipelineTask {
        boolean isCaptureResultNeeded();

        void postCapture();

        ListenableFuture<Boolean> preCapture(TotalCaptureResult totalCaptureResult);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Camera2CapturePipeline(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Quirks quirks, Executor executor) {
        boolean z = true;
        this.mCameraControl = camera2CameraControlImpl;
        Integer num = (Integer) cameraCharacteristicsCompat.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.mIsLegacyDevice = (num == null || num.intValue() != 2) ? false : false;
        this.mExecutor = executor;
        this.mCameraQuirk = quirks;
        this.mUseTorchAsFlash = new UseTorchAsFlash(quirks);
    }

    public void setTemplate(int i) {
        this.mTemplate = i;
    }

    public ListenableFuture<List<Void>> submitStillCaptures(List<CaptureConfig> list, int i, int i2, int i3) {
        OverrideAeModeForStillCapture overrideAeModeForStillCapture = new OverrideAeModeForStillCapture(this.mCameraQuirk);
        Pipeline pipeline = new Pipeline(this.mTemplate, this.mExecutor, this.mCameraControl, this.mIsLegacyDevice, overrideAeModeForStillCapture);
        if (i == 0) {
            pipeline.addTask(new AfTask(this.mCameraControl));
        }
        if (isTorchAsFlash(i3)) {
            pipeline.addTask(new TorchTask(this.mCameraControl, i2));
        } else {
            pipeline.addTask(new AePreCaptureTask(this.mCameraControl, i2, overrideAeModeForStillCapture));
        }
        return Futures.nonCancellationPropagating(pipeline.executeCapture(list, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Pipeline {
        private static final long CHECK_3A_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(1);
        private static final long CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS = TimeUnit.SECONDS.toNanos(5);
        private final Camera2CameraControlImpl mCameraControl;
        private final Executor mExecutor;
        private final boolean mIsLegacyDevice;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;
        private final int mTemplate;
        private long mTimeout3A = CHECK_3A_TIMEOUT_IN_NS;
        final List<PipelineTask> mTasks = new ArrayList();
        private final PipelineTask mPipelineSubTask = new AnonymousClass1();

        /* renamed from: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1  reason: invalid class name */
        /* loaded from: classes.dex */
        class AnonymousClass1 implements PipelineTask {
            AnonymousClass1() {
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public ListenableFuture<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                for (PipelineTask pipelineTask : Pipeline.this.mTasks) {
                    arrayList.add(pipelineTask.preCapture(totalCaptureResult));
                }
                return Futures.transform(Futures.allAsList(arrayList), new Function() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$1$$ExternalSyntheticLambda0
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        Boolean valueOf;
                        valueOf = Boolean.valueOf(((List) obj).contains(true));
                        return valueOf;
                    }
                }, CameraXExecutors.directExecutor());
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public boolean isCaptureResultNeeded() {
                for (PipelineTask pipelineTask : Pipeline.this.mTasks) {
                    if (pipelineTask.isCaptureResultNeeded()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
            public void postCapture() {
                for (PipelineTask pipelineTask : Pipeline.this.mTasks) {
                    pipelineTask.postCapture();
                }
            }
        }

        Pipeline(int i, Executor executor, Camera2CameraControlImpl camera2CameraControlImpl, boolean z, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mTemplate = i;
            this.mExecutor = executor;
            this.mCameraControl = camera2CameraControlImpl;
            this.mIsLegacyDevice = z;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        void addTask(PipelineTask pipelineTask) {
            this.mTasks.add(pipelineTask);
        }

        private void setTimeout3A(long j) {
            this.mTimeout3A = j;
        }

        ListenableFuture<List<Void>> executeCapture(final List<CaptureConfig> list, final int i) {
            ListenableFuture immediateFuture = Futures.immediateFuture(null);
            if (!this.mTasks.isEmpty()) {
                immediateFuture = FutureChain.from(this.mPipelineSubTask.isCaptureResultNeeded() ? waitForResult(0L, null) : Futures.immediateFuture(null)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$ExternalSyntheticLambda1
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        return Camera2CapturePipeline.Pipeline.this.m62xe4aaa129(i, (TotalCaptureResult) obj);
                    }
                }, this.mExecutor).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$ExternalSyntheticLambda2
                    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                    public final ListenableFuture apply(Object obj) {
                        return Camera2CapturePipeline.Pipeline.this.m63x4eda2948((Boolean) obj);
                    }
                }, this.mExecutor);
            }
            FutureChain transformAsync = FutureChain.from(immediateFuture).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$ExternalSyntheticLambda3
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    return Camera2CapturePipeline.Pipeline.this.m64xb909b167(list, i, (TotalCaptureResult) obj);
                }
            }, this.mExecutor);
            transformAsync.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CapturePipeline.Pipeline.this.m65x23393986();
                }
            }, this.mExecutor);
            return transformAsync;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$executeCapture$0$androidx-camera-camera2-internal-Camera2CapturePipeline$Pipeline  reason: not valid java name */
        public /* synthetic */ ListenableFuture m62xe4aaa129(int i, TotalCaptureResult totalCaptureResult) throws Exception {
            if (Camera2CapturePipeline.isFlashRequired(i, totalCaptureResult)) {
                setTimeout3A(CHECK_3A_WITH_FLASH_TIMEOUT_IN_NS);
            }
            return this.mPipelineSubTask.preCapture(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$executeCapture$1$androidx-camera-camera2-internal-Camera2CapturePipeline$Pipeline  reason: not valid java name */
        public /* synthetic */ ListenableFuture m63x4eda2948(Boolean bool) throws Exception {
            if (bool.booleanValue()) {
                return waitForResult(this.mTimeout3A, new ResultListener.Checker() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$ExternalSyntheticLambda5
                    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
                    public final boolean check(TotalCaptureResult totalCaptureResult) {
                        boolean is3AConverged;
                        is3AConverged = Camera2CapturePipeline.Pipeline.this.is3AConverged(totalCaptureResult);
                        return is3AConverged;
                    }
                });
            }
            return Futures.immediateFuture(null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$executeCapture$2$androidx-camera-camera2-internal-Camera2CapturePipeline$Pipeline  reason: not valid java name */
        public /* synthetic */ ListenableFuture m64xb909b167(List list, int i, TotalCaptureResult totalCaptureResult) throws Exception {
            return submitConfigsInternal(list, i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$executeCapture$3$androidx-camera-camera2-internal-Camera2CapturePipeline$Pipeline  reason: not valid java name */
        public /* synthetic */ void m65x23393986() {
            this.mPipelineSubTask.postCapture();
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        ListenableFuture<List<Void>> submitConfigsInternal(List<CaptureConfig> list, int i) {
            CameraCaptureResult cameraCaptureResult;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (CaptureConfig captureConfig : list) {
                final CaptureConfig.Builder from = CaptureConfig.Builder.from(captureConfig);
                if (captureConfig.getTemplateType() == 5) {
                    ImageProxy dequeueImageFromBuffer = this.mCameraControl.getZslControl().dequeueImageFromBuffer();
                    if (dequeueImageFromBuffer != null && this.mCameraControl.getZslControl().enqueueImageToImageWriter(dequeueImageFromBuffer)) {
                        cameraCaptureResult = CameraCaptureResults.retrieveCameraCaptureResult(dequeueImageFromBuffer.getImageInfo());
                        if (cameraCaptureResult == null) {
                            from.setCameraCaptureResult(cameraCaptureResult);
                        } else {
                            applyStillCaptureTemplate(from, captureConfig);
                        }
                        if (!this.mOverrideAeModeForStillCapture.shouldSetAeModeAlwaysFlash(i)) {
                            applyAeModeQuirk(from);
                        }
                        arrayList.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$ExternalSyntheticLambda0
                            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                                return Camera2CapturePipeline.Pipeline.this.m66x1f41775a(from, completer);
                            }
                        }));
                        arrayList2.add(from.build());
                    }
                }
                cameraCaptureResult = null;
                if (cameraCaptureResult == null) {
                }
                if (!this.mOverrideAeModeForStillCapture.shouldSetAeModeAlwaysFlash(i)) {
                }
                arrayList.add(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$Pipeline$$ExternalSyntheticLambda0
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return Camera2CapturePipeline.Pipeline.this.m66x1f41775a(from, completer);
                    }
                }));
                arrayList2.add(from.build());
            }
            this.mCameraControl.submitCaptureRequestsInternal(arrayList2);
            return Futures.allAsList(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$submitConfigsInternal$4$androidx-camera-camera2-internal-Camera2CapturePipeline$Pipeline  reason: not valid java name */
        public /* synthetic */ Object m66x1f41775a(CaptureConfig.Builder builder, final CallbackToFutureAdapter.Completer completer) throws Exception {
            builder.addCameraCaptureCallback(new CameraCaptureCallback() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline.Pipeline.2
                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                    completer.set(null);
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureFailed(CameraCaptureFailure cameraCaptureFailure) {
                    completer.setException(new ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.getReason(), null));
                }

                @Override // androidx.camera.core.impl.CameraCaptureCallback
                public void onCaptureCancelled() {
                    completer.setException(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
                }
            });
            return "submitStillCapture";
        }

        private void applyStillCaptureTemplate(CaptureConfig.Builder builder, CaptureConfig captureConfig) {
            int i;
            if (this.mTemplate != 3 || this.mIsLegacyDevice) {
                i = (captureConfig.getTemplateType() == -1 || captureConfig.getTemplateType() == 5) ? 2 : -1;
            } else {
                i = 4;
            }
            if (i != -1) {
                builder.setTemplateType(i);
            }
        }

        private void applyAeModeQuirk(CaptureConfig.Builder builder) {
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, 3);
            builder.addImplementationOptions(builder2.build());
        }

        private ListenableFuture<TotalCaptureResult> waitForResult(long j, ResultListener.Checker checker) {
            ResultListener resultListener = new ResultListener(j, checker);
            this.mCameraControl.addCaptureResultListener(resultListener);
            return resultListener.getFuture();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean is3AConverged(TotalCaptureResult totalCaptureResult) {
            if (totalCaptureResult == null) {
                return false;
            }
            Camera2CameraCaptureResult camera2CameraCaptureResult = new Camera2CameraCaptureResult(totalCaptureResult);
            boolean z = camera2CameraCaptureResult.getAfMode() == CameraCaptureMetaData.AfMode.OFF || camera2CameraCaptureResult.getAfMode() == CameraCaptureMetaData.AfMode.UNKNOWN || camera2CameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.PASSIVE_FOCUSED || camera2CameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.PASSIVE_NOT_FOCUSED || camera2CameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.LOCKED_FOCUSED || camera2CameraCaptureResult.getAfState() == CameraCaptureMetaData.AfState.LOCKED_NOT_FOCUSED;
            boolean z2 = camera2CameraCaptureResult.getAeState() == CameraCaptureMetaData.AeState.CONVERGED || camera2CameraCaptureResult.getAeState() == CameraCaptureMetaData.AeState.FLASH_REQUIRED || camera2CameraCaptureResult.getAeState() == CameraCaptureMetaData.AeState.UNKNOWN;
            boolean z3 = camera2CameraCaptureResult.getAwbState() == CameraCaptureMetaData.AwbState.CONVERGED || camera2CameraCaptureResult.getAwbState() == CameraCaptureMetaData.AwbState.UNKNOWN;
            Logger.d(Camera2CapturePipeline.TAG, "checkCaptureResult, AE=" + camera2CameraCaptureResult.getAeState() + " AF =" + camera2CameraCaptureResult.getAfState() + " AWB=" + camera2CameraCaptureResult.getAwbState());
            return z && z2 && z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class AfTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private boolean mIsExecuted = false;

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return true;
        }

        AfTask(Camera2CameraControlImpl camera2CameraControlImpl) {
            this.mCameraControl = camera2CameraControlImpl;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public ListenableFuture<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            Integer num;
            ListenableFuture<Boolean> immediateFuture = Futures.immediateFuture(true);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return immediateFuture;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                Logger.d(Camera2CapturePipeline.TAG, "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    Logger.d(Camera2CapturePipeline.TAG, "Trigger AF");
                    this.mIsExecuted = true;
                    this.mCameraControl.getFocusMeteringControl().triggerAf(null, false);
                }
            }
            return immediateFuture;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.d(Camera2CapturePipeline.TAG, "cancel TriggerAF");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(true, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class TorchTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private final int mFlashMode;
        private boolean mIsExecuted = false;

        TorchTask(Camera2CameraControlImpl camera2CameraControlImpl, int i) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public ListenableFuture<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            if (Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                if (this.mCameraControl.isTorchOn()) {
                    Logger.d(Camera2CapturePipeline.TAG, "Torch already on, not turn on");
                } else {
                    Logger.d(Camera2CapturePipeline.TAG, "Turn on torch");
                    this.mIsExecuted = true;
                    return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask$$ExternalSyntheticLambda0
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return Camera2CapturePipeline.TorchTask.this.m68x3ebf0c8c(completer);
                        }
                    })).transform(new Function() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$TorchTask$$ExternalSyntheticLambda1
                        @Override // androidx.arch.core.util.Function
                        public final Object apply(Object obj) {
                            return Camera2CapturePipeline.TorchTask.lambda$preCapture$1((Void) obj);
                        }
                    }, CameraXExecutors.directExecutor());
                }
            }
            return Futures.immediateFuture(false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$preCapture$0$androidx-camera-camera2-internal-Camera2CapturePipeline$TorchTask  reason: not valid java name */
        public /* synthetic */ Object m68x3ebf0c8c(CallbackToFutureAdapter.Completer completer) throws Exception {
            this.mCameraControl.getTorchControl().m98xbd10d892(completer, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ Boolean lambda$preCapture$1(Void r0) {
            return true;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                this.mCameraControl.getTorchControl().m98xbd10d892(null, false);
                Logger.d(Camera2CapturePipeline.TAG, "Turn off torch");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class AePreCaptureTask implements PipelineTask {
        private final Camera2CameraControlImpl mCameraControl;
        private final int mFlashMode;
        private boolean mIsExecuted = false;
        private final OverrideAeModeForStillCapture mOverrideAeModeForStillCapture;

        AePreCaptureTask(Camera2CameraControlImpl camera2CameraControlImpl, int i, OverrideAeModeForStillCapture overrideAeModeForStillCapture) {
            this.mCameraControl = camera2CameraControlImpl;
            this.mFlashMode = i;
            this.mOverrideAeModeForStillCapture = overrideAeModeForStillCapture;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public ListenableFuture<Boolean> preCapture(TotalCaptureResult totalCaptureResult) {
            if (Camera2CapturePipeline.isFlashRequired(this.mFlashMode, totalCaptureResult)) {
                Logger.d(Camera2CapturePipeline.TAG, "Trigger AE");
                this.mIsExecuted = true;
                return FutureChain.from(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$AePreCaptureTask$$ExternalSyntheticLambda0
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return Camera2CapturePipeline.AePreCaptureTask.this.m61x78c3ed41(completer);
                    }
                })).transform(new Function() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$AePreCaptureTask$$ExternalSyntheticLambda1
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        return Camera2CapturePipeline.AePreCaptureTask.lambda$preCapture$1((Void) obj);
                    }
                }, CameraXExecutors.directExecutor());
            }
            return Futures.immediateFuture(false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$preCapture$0$androidx-camera-camera2-internal-Camera2CapturePipeline$AePreCaptureTask  reason: not valid java name */
        public /* synthetic */ Object m61x78c3ed41(CallbackToFutureAdapter.Completer completer) throws Exception {
            this.mCameraControl.getFocusMeteringControl().triggerAePrecapture(completer);
            this.mOverrideAeModeForStillCapture.onAePrecaptureStarted();
            return "AePreCapture";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ Boolean lambda$preCapture$1(Void r0) {
            return true;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public boolean isCaptureResultNeeded() {
            return this.mFlashMode == 0;
        }

        @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.PipelineTask
        public void postCapture() {
            if (this.mIsExecuted) {
                Logger.d(Camera2CapturePipeline.TAG, "cancel TriggerAePreCapture");
                this.mCameraControl.getFocusMeteringControl().cancelAfAeTrigger(false, true);
                this.mOverrideAeModeForStillCapture.onAePrecaptureFinished();
            }
        }
    }

    static boolean isFlashRequired(int i, TotalCaptureResult totalCaptureResult) {
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        } else if (i != 1) {
            if (i == 2) {
                return false;
            }
            throw new AssertionError(i);
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class ResultListener implements Camera2CameraControlImpl.CaptureResultListener {
        static final long NO_TIMEOUT = 0;
        private final Checker mChecker;
        private CallbackToFutureAdapter.Completer<TotalCaptureResult> mCompleter;
        private final long mTimeLimitNs;
        private final ListenableFuture<TotalCaptureResult> mFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.Camera2CapturePipeline$ResultListener$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return Camera2CapturePipeline.ResultListener.this.m67xaa6bbe23(completer);
            }
        });
        private volatile Long mTimestampOfFirstUpdateNs = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface Checker {
            boolean check(TotalCaptureResult totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$new$0$androidx-camera-camera2-internal-Camera2CapturePipeline$ResultListener  reason: not valid java name */
        public /* synthetic */ Object m67xaa6bbe23(CallbackToFutureAdapter.Completer completer) throws Exception {
            this.mCompleter = completer;
            return "waitFor3AResult";
        }

        ResultListener(long j, Checker checker) {
            this.mTimeLimitNs = j;
            this.mChecker = checker;
        }

        public ListenableFuture<TotalCaptureResult> getFuture() {
            return this.mFuture;
        }

        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.mTimestampOfFirstUpdateNs == null) {
                this.mTimestampOfFirstUpdateNs = l;
            }
            Long l2 = this.mTimestampOfFirstUpdateNs;
            if (0 != this.mTimeLimitNs && l2 != null && l != null && l.longValue() - l2.longValue() > this.mTimeLimitNs) {
                this.mCompleter.set(null);
                Logger.d(Camera2CapturePipeline.TAG, "Wait for capture result timeout, current:" + l + " first: " + l2);
                return true;
            }
            Checker checker = this.mChecker;
            if (checker == null || checker.check(totalCaptureResult)) {
                this.mCompleter.set(totalCaptureResult);
                return true;
            }
            return false;
        }
    }

    private boolean isTorchAsFlash(int i) {
        return this.mUseTorchAsFlash.shouldUseTorchAsFlash() || this.mTemplate == 3 || i == 1;
    }
}
