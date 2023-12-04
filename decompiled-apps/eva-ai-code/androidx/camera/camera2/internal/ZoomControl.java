package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ZoomControl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private static final String TAG = "ZoomControl";
    private final Camera2CameraControlImpl mCamera2CameraControlImpl;
    private final ZoomStateImpl mCurrentZoomState;
    private final Executor mExecutor;
    final ZoomImpl mZoomImpl;
    private final MutableLiveData<ZoomState> mZoomStateLiveData;
    private boolean mIsActive = false;
    private Camera2CameraControlImpl.CaptureResultListener mCaptureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: androidx.camera.camera2.internal.ZoomControl.1
        @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
        public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            ZoomControl.this.mZoomImpl.onCaptureResult(totalCaptureResult);
            return false;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface ZoomImpl {
        void addRequestOption(Camera2ImplConfig.Builder builder);

        Rect getCropSensorRegion();

        float getMaxZoom();

        float getMinZoom();

        void onCaptureResult(TotalCaptureResult totalCaptureResult);

        void resetZoom();

        void setZoomRatio(float f, CallbackToFutureAdapter.Completer<Void> completer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoomControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.mCamera2CameraControlImpl = camera2CameraControlImpl;
        this.mExecutor = executor;
        ZoomImpl createZoomImpl = createZoomImpl(cameraCharacteristicsCompat);
        this.mZoomImpl = createZoomImpl;
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(createZoomImpl.getMaxZoom(), createZoomImpl.getMinZoom());
        this.mCurrentZoomState = zoomStateImpl;
        zoomStateImpl.setZoomRatio(1.0f);
        this.mZoomStateLiveData = new MutableLiveData<>(ImmutableZoomState.create(zoomStateImpl));
        camera2CameraControlImpl.addCaptureResultListener(this.mCaptureResultListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoomState getDefaultZoomState(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        ZoomImpl createZoomImpl = createZoomImpl(cameraCharacteristicsCompat);
        ZoomStateImpl zoomStateImpl = new ZoomStateImpl(createZoomImpl.getMaxZoom(), createZoomImpl.getMinZoom());
        zoomStateImpl.setZoomRatio(1.0f);
        return ImmutableZoomState.create(zoomStateImpl);
    }

    private static ZoomImpl createZoomImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        if (isAndroidRZoomSupported(cameraCharacteristicsCompat)) {
            return new AndroidRZoomImpl(cameraCharacteristicsCompat);
        }
        return new CropRegionZoomImpl(cameraCharacteristicsCompat);
    }

    static boolean isAndroidRZoomSupported(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return Build.VERSION.SDK_INT >= 30 && getZoomRatioRange(cameraCharacteristicsCompat) != null;
    }

    private static Range<Float> getZoomRatioRange(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        CameraCharacteristics.Key key;
        try {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            return (Range) cameraCharacteristicsCompat.get(key);
        } catch (AssertionError e) {
            Logger.w(TAG, "AssertionError, fail to get camera characteristic.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addZoomOption(Camera2ImplConfig.Builder builder) {
        this.mZoomImpl.addRequestOption(builder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect getCropSensorRegion() {
        return this.mZoomImpl.getCropSensorRegion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setActive(boolean z) {
        ZoomState create;
        if (this.mIsActive == z) {
            return;
        }
        this.mIsActive = z;
        if (z) {
            return;
        }
        synchronized (this.mCurrentZoomState) {
            this.mCurrentZoomState.setZoomRatio(1.0f);
            create = ImmutableZoomState.create(this.mCurrentZoomState);
        }
        updateLiveData(create);
        this.mZoomImpl.resetZoom();
        this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListenableFuture<Void> setZoomRatio(float f) {
        final ZoomState create;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setZoomRatio(f);
                create = ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (IllegalArgumentException e) {
                return Futures.immediateFailedFuture(e);
            }
        }
        updateLiveData(create);
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.ZoomControl$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ZoomControl.this.m104xc6d8bfa2(create, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setZoomRatio$1$androidx-camera-camera2-internal-ZoomControl  reason: not valid java name */
    public /* synthetic */ Object m104xc6d8bfa2(final ZoomState zoomState, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.ZoomControl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ZoomControl.this.m103xd613203(completer, zoomState);
            }
        });
        return "setZoomRatio";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: submitCameraZoomRatio */
    public void m103xd613203(CallbackToFutureAdapter.Completer<Void> completer, ZoomState zoomState) {
        ZoomState create;
        if (!this.mIsActive) {
            synchronized (this.mCurrentZoomState) {
                this.mCurrentZoomState.setZoomRatio(1.0f);
                create = ImmutableZoomState.create(this.mCurrentZoomState);
            }
            updateLiveData(create);
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        updateLiveData(zoomState);
        this.mZoomImpl.setZoomRatio(zoomState.getZoomRatio(), completer);
        this.mCamera2CameraControlImpl.updateSessionConfigSynchronous();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListenableFuture<Void> setLinearZoom(float f) {
        final ZoomState create;
        synchronized (this.mCurrentZoomState) {
            try {
                this.mCurrentZoomState.setLinearZoom(f);
                create = ImmutableZoomState.create(this.mCurrentZoomState);
            } catch (IllegalArgumentException e) {
                return Futures.immediateFailedFuture(e);
            }
        }
        updateLiveData(create);
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.ZoomControl$$ExternalSyntheticLambda3
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ZoomControl.this.m102x9f268096(create, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setLinearZoom$3$androidx-camera-camera2-internal-ZoomControl  reason: not valid java name */
    public /* synthetic */ Object m102x9f268096(final ZoomState zoomState, final CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mExecutor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.ZoomControl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ZoomControl.this.m101xe5aef2f7(completer, zoomState);
            }
        });
        return "setLinearZoom";
    }

    private void updateLiveData(ZoomState zoomState) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.mZoomStateLiveData.setValue(zoomState);
        } else {
            this.mZoomStateLiveData.postValue(zoomState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LiveData<ZoomState> getZoomState() {
        return this.mZoomStateLiveData;
    }
}
