package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TorchControl {
    static final int DEFAULT_TORCH_STATE = 0;
    private static final String TAG = "TorchControl";
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    CallbackToFutureAdapter.Completer<Void> mEnableTorchCompleter;
    private final Executor mExecutor;
    private final boolean mHasFlashUnit;
    private boolean mIsActive;
    boolean mTargetTorchEnabled;
    private final MutableLiveData<Integer> mTorchState = new MutableLiveData<>(0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public TorchControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        this.mHasFlashUnit = FlashAvailabilityChecker.isFlashAvailable(cameraCharacteristicsCompat);
        camera2CameraControlImpl.addCaptureResultListener(new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.TorchControl$$ExternalSyntheticLambda2
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                return TorchControl.this.m100lambda$new$0$androidxcameracamera2internalTorchControl(totalCaptureResult);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$androidx-camera-camera2-internal-TorchControl  reason: not valid java name */
    public /* synthetic */ boolean m100lambda$new$0$androidxcameracamera2internalTorchControl(TotalCaptureResult totalCaptureResult) {
        if (this.mEnableTorchCompleter != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if ((num != null && num.intValue() == 2) == this.mTargetTorchEnabled) {
                this.mEnableTorchCompleter.set(null);
                this.mEnableTorchCompleter = null;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setActive(boolean z) {
        if (this.mIsActive == z) {
            return;
        }
        this.mIsActive = z;
        if (z) {
            return;
        }
        if (this.mTargetTorchEnabled) {
            this.mTargetTorchEnabled = false;
            this.mCamera2CameraControlImpl.enableTorchInternal(false);
            setLiveDataValue(this.mTorchState, 0);
        }
        CallbackToFutureAdapter.Completer<Void> completer = this.mEnableTorchCompleter;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            this.mEnableTorchCompleter = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListenableFuture<Void> enableTorch(final boolean z) {
        if (!this.mHasFlashUnit) {
            Logger.d(TAG, "Unable to enableTorch due to there is no flash unit.");
            return Futures.immediateFailedFuture(new IllegalStateException("No flash unit"));
        }
        setLiveDataValue(this.mTorchState, Integer.valueOf(z ? 1 : 0));
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.TorchControl$$ExternalSyntheticLambda1
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return TorchControl.this.m99x328afed3(z, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$enableTorch$2$androidx-camera-camera2-internal-TorchControl  reason: not valid java name */
    public /* synthetic */ Object m99x328afed3(final boolean z, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.TorchControl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TorchControl.this.m98xbd10d892(completer, z);
            }
        });
        return "enableTorch: " + z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LiveData<Integer> getTorchState() {
        return this.mTorchState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: enableTorchInternal */
    public void m98xbd10d892(CallbackToFutureAdapter.Completer<Void> completer, boolean z) {
        if (!this.mHasFlashUnit) {
            if (completer != null) {
                completer.setException(new IllegalStateException("No flash unit"));
            }
        } else if (!this.mIsActive) {
            setLiveDataValue(this.mTorchState, 0);
            if (completer != null) {
                completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            }
        } else {
            this.mTargetTorchEnabled = z;
            this.mCamera2CameraControlImpl.enableTorchInternal(z);
            setLiveDataValue(this.mTorchState, Integer.valueOf(z ? 1 : 0));
            CallbackToFutureAdapter.Completer<Void> completer2 = this.mEnableTorchCompleter;
            if (completer2 != null) {
                completer2.setException(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.mEnableTorchCompleter = completer;
        }
    }

    private <T> void setLiveDataValue(MutableLiveData<T> mutableLiveData, T t) {
        if (Threads.isMainThread()) {
            mutableLiveData.setValue(t);
        } else {
            mutableLiveData.postValue(t);
        }
    }
}
