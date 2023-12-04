package androidx.camera.core.impl;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class CameraRepository {
    private static final String TAG = "CameraRepository";
    private CallbackToFutureAdapter.Completer<Void> mDeinitCompleter;
    private ListenableFuture<Void> mDeinitFuture;
    private final Object mCamerasLock = new Object();
    private final Map<String, CameraInternal> mCameras = new LinkedHashMap();
    private final Set<CameraInternal> mReleasingCameras = new HashSet();

    public void init(CameraFactory cameraFactory) throws InitializationException {
        synchronized (this.mCamerasLock) {
            try {
                try {
                    for (String str : cameraFactory.getAvailableCameraIds()) {
                        Logger.d(TAG, "Added camera: " + str);
                        this.mCameras.put(str, cameraFactory.getCamera(str));
                    }
                } catch (CameraUnavailableException e) {
                    throw new InitializationException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ListenableFuture<Void> deinit() {
        synchronized (this.mCamerasLock) {
            if (this.mCameras.isEmpty()) {
                ListenableFuture<Void> listenableFuture = this.mDeinitFuture;
                if (listenableFuture == null) {
                    listenableFuture = Futures.immediateFuture(null);
                }
                return listenableFuture;
            }
            ListenableFuture<Void> listenableFuture2 = this.mDeinitFuture;
            if (listenableFuture2 == null) {
                listenableFuture2 = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.impl.CameraRepository$$ExternalSyntheticLambda0
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return CameraRepository.this.m179lambda$deinit$0$androidxcameracoreimplCameraRepository(completer);
                    }
                });
                this.mDeinitFuture = listenableFuture2;
            }
            this.mReleasingCameras.addAll(this.mCameras.values());
            for (final CameraInternal cameraInternal : this.mCameras.values()) {
                cameraInternal.release().addListener(new Runnable() { // from class: androidx.camera.core.impl.CameraRepository$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraRepository.this.m180lambda$deinit$1$androidxcameracoreimplCameraRepository(cameraInternal);
                    }
                }, CameraXExecutors.directExecutor());
            }
            this.mCameras.clear();
            return listenableFuture2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$deinit$0$androidx-camera-core-impl-CameraRepository  reason: not valid java name */
    public /* synthetic */ Object m179lambda$deinit$0$androidxcameracoreimplCameraRepository(CallbackToFutureAdapter.Completer completer) throws Exception {
        synchronized (this.mCamerasLock) {
            this.mDeinitCompleter = completer;
        }
        return "CameraRepository-deinit";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$deinit$1$androidx-camera-core-impl-CameraRepository  reason: not valid java name */
    public /* synthetic */ void m180lambda$deinit$1$androidxcameracoreimplCameraRepository(CameraInternal cameraInternal) {
        synchronized (this.mCamerasLock) {
            this.mReleasingCameras.remove(cameraInternal);
            if (this.mReleasingCameras.isEmpty()) {
                Preconditions.checkNotNull(this.mDeinitCompleter);
                this.mDeinitCompleter.set(null);
                this.mDeinitCompleter = null;
                this.mDeinitFuture = null;
            }
        }
    }

    public CameraInternal getCamera(String str) {
        CameraInternal cameraInternal;
        synchronized (this.mCamerasLock) {
            cameraInternal = this.mCameras.get(str);
            if (cameraInternal == null) {
                throw new IllegalArgumentException("Invalid camera: " + str);
            }
        }
        return cameraInternal;
    }

    public LinkedHashSet<CameraInternal> getCameras() {
        LinkedHashSet<CameraInternal> linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new LinkedHashSet<>(this.mCameras.values());
        }
        return linkedHashSet;
    }

    Set<String> getCameraIds() {
        LinkedHashSet linkedHashSet;
        synchronized (this.mCamerasLock) {
            linkedHashSet = new LinkedHashSet(this.mCameras.keySet());
        }
        return linkedHashSet;
    }
}
