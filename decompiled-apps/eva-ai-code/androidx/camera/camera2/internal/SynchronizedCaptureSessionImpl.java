package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface;
import androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SynchronizedCaptureSessionImpl extends SynchronizedCaptureSessionBaseImpl {
    private static final String TAG = "SyncCaptureSessionImpl";
    private final ForceCloseDeferrableSurface mCloseSurfaceQuirk;
    private List<DeferrableSurface> mDeferrableSurfaces;
    private final ForceCloseCaptureSession mForceCloseSessionQuirk;
    private final Object mObjectLock;
    ListenableFuture<Void> mOpeningCaptureSession;
    private final WaitForRepeatingRequestStart mWaitForOtherSessionCompleteQuirk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SynchronizedCaptureSessionImpl(Quirks quirks, Quirks quirks2, CaptureSessionRepository captureSessionRepository, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(captureSessionRepository, executor, scheduledExecutorService, handler);
        this.mObjectLock = new Object();
        this.mCloseSurfaceQuirk = new ForceCloseDeferrableSurface(quirks, quirks2);
        this.mWaitForOtherSessionCompleteQuirk = new WaitForRepeatingRequestStart(quirks);
        this.mForceCloseSessionQuirk = new ForceCloseCaptureSession(quirks2);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    public ListenableFuture<Void> openCaptureSession(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list) {
        ListenableFuture<Void> nonCancellationPropagating;
        synchronized (this.mObjectLock) {
            ListenableFuture<Void> openCaptureSession = this.mWaitForOtherSessionCompleteQuirk.openCaptureSession(cameraDevice, sessionConfigurationCompat, list, this.mCaptureSessionRepository.getClosingCaptureSession(), new WaitForRepeatingRequestStart.OpenCaptureSession() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl$$ExternalSyntheticLambda1
                @Override // androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart.OpenCaptureSession
                public final ListenableFuture run(CameraDevice cameraDevice2, SessionConfigurationCompat sessionConfigurationCompat2, List list2) {
                    return SynchronizedCaptureSessionImpl.this.m96xe055f2f(cameraDevice2, sessionConfigurationCompat2, list2);
                }
            });
            this.mOpeningCaptureSession = openCaptureSession;
            nonCancellationPropagating = Futures.nonCancellationPropagating(openCaptureSession);
        }
        return nonCancellationPropagating;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$openCaptureSession$0$androidx-camera-camera2-internal-SynchronizedCaptureSessionImpl  reason: not valid java name */
    public /* synthetic */ ListenableFuture m96xe055f2f(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        return super.openCaptureSession(cameraDevice, sessionConfigurationCompat, list);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public ListenableFuture<Void> getOpeningBlocker() {
        return this.mWaitForOtherSessionCompleteQuirk.getStartStreamFuture();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    public ListenableFuture<List<Surface>> startWithDeferrableSurface(List<DeferrableSurface> list, long j) {
        ListenableFuture<List<Surface>> startWithDeferrableSurface;
        synchronized (this.mObjectLock) {
            this.mDeferrableSurfaces = list;
            startWithDeferrableSurface = super.startWithDeferrableSurface(list, j);
        }
        return startWithDeferrableSurface;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSessionOpener.OpenerImpl
    public boolean stop() {
        boolean stop;
        synchronized (this.mObjectLock) {
            if (isCameraCaptureSessionOpen()) {
                this.mCloseSurfaceQuirk.onSessionEnd(this.mDeferrableSurfaces);
            } else {
                ListenableFuture<Void> listenableFuture = this.mOpeningCaptureSession;
                if (listenableFuture != null) {
                    listenableFuture.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return this.mWaitForOtherSessionCompleteQuirk.setSingleRepeatingRequest(captureRequest, captureCallback, new WaitForRepeatingRequestStart.SingleRepeatingRequest() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl$$ExternalSyntheticLambda3
            @Override // androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart.SingleRepeatingRequest
            public final int run(CaptureRequest captureRequest2, CameraCaptureSession.CaptureCallback captureCallback2) {
                return SynchronizedCaptureSessionImpl.this.m97x8c3ed34e(captureRequest2, captureCallback2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$setSingleRepeatingRequest$1$androidx-camera-camera2-internal-SynchronizedCaptureSessionImpl  reason: not valid java name */
    public /* synthetic */ int m97x8c3ed34e(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        return super.setSingleRepeatingRequest(captureRequest, captureCallback);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
        debugLog("Session onConfigured()");
        this.mForceCloseSessionQuirk.onSessionConfigured(synchronizedCaptureSession, this.mCaptureSessionRepository.getCreatingCaptureSessions(), this.mCaptureSessionRepository.getCaptureSessions(), new ForceCloseCaptureSession.OnConfigured() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl$$ExternalSyntheticLambda2
            @Override // androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession.OnConfigured
            public final void run(SynchronizedCaptureSession synchronizedCaptureSession2) {
                SynchronizedCaptureSessionImpl.this.m95xf1a34454(synchronizedCaptureSession2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onConfigured$2$androidx-camera-camera2-internal-SynchronizedCaptureSessionImpl  reason: not valid java name */
    public /* synthetic */ void m95xf1a34454(SynchronizedCaptureSession synchronizedCaptureSession) {
        super.onConfigured(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public void close() {
        debugLog("Session call close()");
        this.mWaitForOtherSessionCompleteQuirk.onSessionEnd();
        this.mWaitForOtherSessionCompleteQuirk.getStartStreamFuture().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.SynchronizedCaptureSessionImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SynchronizedCaptureSessionImpl.this.m94x47c7bbb6();
            }
        }, getExecutor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$close$3$androidx-camera-camera2-internal-SynchronizedCaptureSessionImpl  reason: not valid java name */
    public /* synthetic */ void m94x47c7bbb6() {
        debugLog("Session call super.close()");
        super.close();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSessionBaseImpl, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.mObjectLock) {
            this.mCloseSurfaceQuirk.onSessionEnd(this.mDeferrableSurfaces);
        }
        debugLog("onClosed()");
        super.onClosed(synchronizedCaptureSession);
    }

    void debugLog(String str) {
        Logger.d(TAG, "[" + this + "] " + str);
    }
}
