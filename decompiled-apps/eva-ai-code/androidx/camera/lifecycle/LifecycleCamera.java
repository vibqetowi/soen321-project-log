package androidx.camera.lifecycle;

import android.os.Build;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes.dex */
final class LifecycleCamera implements LifecycleObserver, Camera {
    private final CameraUseCaseAdapter mCameraUseCaseAdapter;
    private final LifecycleOwner mLifecycleOwner;
    private final Object mLock = new Object();
    private volatile boolean mIsActive = false;
    private boolean mSuspended = false;
    private boolean mReleased = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleCamera(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter cameraUseCaseAdapter) {
        this.mLifecycleOwner = lifecycleOwner;
        this.mCameraUseCaseAdapter = cameraUseCaseAdapter;
        if (lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            cameraUseCaseAdapter.attachUseCases();
        } else {
            cameraUseCaseAdapter.detachUseCases();
        }
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            if (!this.mSuspended && !this.mReleased) {
                this.mCameraUseCaseAdapter.attachUseCases();
                this.mIsActive = true;
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            if (!this.mSuspended && !this.mReleased) {
                this.mCameraUseCaseAdapter.detachUseCases();
                this.mIsActive = false;
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        synchronized (this.mLock) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mCameraUseCaseAdapter.setActiveResumingMode(true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mCameraUseCaseAdapter.setActiveResumingMode(false);
        }
    }

    public void suspend() {
        synchronized (this.mLock) {
            if (this.mSuspended) {
                return;
            }
            onStop(this.mLifecycleOwner);
            this.mSuspended = true;
        }
    }

    public void unsuspend() {
        synchronized (this.mLock) {
            if (this.mSuspended) {
                this.mSuspended = false;
                if (this.mLifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                    onStart(this.mLifecycleOwner);
                }
            }
        }
    }

    public boolean isActive() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mIsActive;
        }
        return z;
    }

    public boolean isBound(UseCase useCase) {
        boolean contains;
        synchronized (this.mLock) {
            contains = this.mCameraUseCaseAdapter.getUseCases().contains(useCase);
        }
        return contains;
    }

    public List<UseCase> getUseCases() {
        List<UseCase> unmodifiableList;
        synchronized (this.mLock) {
            unmodifiableList = Collections.unmodifiableList(this.mCameraUseCaseAdapter.getUseCases());
        }
        return unmodifiableList;
    }

    public LifecycleOwner getLifecycleOwner() {
        LifecycleOwner lifecycleOwner;
        synchronized (this.mLock) {
            lifecycleOwner = this.mLifecycleOwner;
        }
        return lifecycleOwner;
    }

    public CameraUseCaseAdapter getCameraUseCaseAdapter() {
        return this.mCameraUseCaseAdapter;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void bind(Collection<UseCase> collection) throws CameraUseCaseAdapter.CameraException {
        synchronized (this.mLock) {
            this.mCameraUseCaseAdapter.addUseCases(collection);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void unbind(Collection<UseCase> collection) {
        synchronized (this.mLock) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.mCameraUseCaseAdapter.getUseCases());
            this.mCameraUseCaseAdapter.removeUseCases(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void unbindAll() {
        synchronized (this.mLock) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.mCameraUseCaseAdapter;
            cameraUseCaseAdapter.removeUseCases(cameraUseCaseAdapter.getUseCases());
        }
    }

    void release() {
        synchronized (this.mLock) {
            this.mReleased = true;
            this.mIsActive = false;
            this.mLifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    @Override // androidx.camera.core.Camera
    public CameraControl getCameraControl() {
        return this.mCameraUseCaseAdapter.getCameraControl();
    }

    @Override // androidx.camera.core.Camera
    public CameraInfo getCameraInfo() {
        return this.mCameraUseCaseAdapter.getCameraInfo();
    }

    @Override // androidx.camera.core.Camera
    public LinkedHashSet<CameraInternal> getCameraInternals() {
        return this.mCameraUseCaseAdapter.getCameraInternals();
    }

    @Override // androidx.camera.core.Camera
    public CameraConfig getExtendedConfig() {
        return this.mCameraUseCaseAdapter.getExtendedConfig();
    }

    @Override // androidx.camera.core.Camera
    public void setExtendedConfig(CameraConfig cameraConfig) {
        this.mCameraUseCaseAdapter.setExtendedConfig(cameraConfig);
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(UseCase... useCaseArr) {
        return this.mCameraUseCaseAdapter.isUseCasesCombinationSupported(useCaseArr);
    }
}
