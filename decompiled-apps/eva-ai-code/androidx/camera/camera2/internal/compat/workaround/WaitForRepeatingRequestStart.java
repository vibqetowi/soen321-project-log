package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.Camera2CaptureCallbacks;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class WaitForRepeatingRequestStart {
    private final boolean mHasCaptureSessionStuckQuirk;
    private boolean mHasSubmittedRepeating;
    CallbackToFutureAdapter.Completer<Void> mStartStreamingCompleter;
    private final ListenableFuture<Void> mStartStreamingFuture;
    private final Object mLock = new Object();
    private final CameraCaptureSession.CaptureCallback mCaptureCallback = new CameraCaptureSession.CaptureCallback() { // from class: androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart.1
        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            if (WaitForRepeatingRequestStart.this.mStartStreamingCompleter != null) {
                WaitForRepeatingRequestStart.this.mStartStreamingCompleter.set(null);
                WaitForRepeatingRequestStart.this.mStartStreamingCompleter = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            if (WaitForRepeatingRequestStart.this.mStartStreamingCompleter != null) {
                WaitForRepeatingRequestStart.this.mStartStreamingCompleter.setCancelled();
                WaitForRepeatingRequestStart.this.mStartStreamingCompleter = null;
            }
        }
    };

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface OpenCaptureSession {
        ListenableFuture<Void> run(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List<DeferrableSurface> list);
    }

    @FunctionalInterface
    /* loaded from: classes.dex */
    public interface SingleRepeatingRequest {
        int run(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;
    }

    public WaitForRepeatingRequestStart(Quirks quirks) {
        this.mHasCaptureSessionStuckQuirk = quirks.contains(CaptureSessionStuckQuirk.class);
        if (shouldWaitRepeatingSubmit()) {
            this.mStartStreamingFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart$$ExternalSyntheticLambda0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                    return WaitForRepeatingRequestStart.this.m127xf823b3a1(completer);
                }
            });
        } else {
            this.mStartStreamingFuture = Futures.immediateFuture(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$androidx-camera-camera2-internal-compat-workaround-WaitForRepeatingRequestStart  reason: not valid java name */
    public /* synthetic */ Object m127xf823b3a1(CallbackToFutureAdapter.Completer completer) throws Exception {
        this.mStartStreamingCompleter = completer;
        return "WaitForRepeatingRequestStart[" + this + "]";
    }

    public boolean shouldWaitRepeatingSubmit() {
        return this.mHasCaptureSessionStuckQuirk;
    }

    public ListenableFuture<Void> getStartStreamFuture() {
        return Futures.nonCancellationPropagating(this.mStartStreamingFuture);
    }

    public ListenableFuture<Void> openCaptureSession(final CameraDevice cameraDevice, final SessionConfigurationCompat sessionConfigurationCompat, final List<DeferrableSurface> list, List<SynchronizedCaptureSession> list2, final OpenCaptureSession openCaptureSession) {
        ArrayList arrayList = new ArrayList();
        for (SynchronizedCaptureSession synchronizedCaptureSession : list2) {
            arrayList.add(synchronizedCaptureSession.getOpeningBlocker());
        }
        return FutureChain.from(Futures.successfulAsList(arrayList)).transformAsync(new AsyncFunction() { // from class: androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
            public final ListenableFuture apply(Object obj) {
                ListenableFuture run;
                List list3 = (List) obj;
                run = WaitForRepeatingRequestStart.OpenCaptureSession.this.run(cameraDevice, sessionConfigurationCompat, list);
                return run;
            }
        }, CameraXExecutors.directExecutor());
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback, SingleRepeatingRequest singleRepeatingRequest) throws CameraAccessException {
        int run;
        synchronized (this.mLock) {
            if (shouldWaitRepeatingSubmit()) {
                captureCallback = Camera2CaptureCallbacks.createComboCallback(this.mCaptureCallback, captureCallback);
                this.mHasSubmittedRepeating = true;
            }
            run = singleRepeatingRequest.run(captureRequest, captureCallback);
        }
        return run;
    }

    public void onSessionEnd() {
        synchronized (this.mLock) {
            if (shouldWaitRepeatingSubmit() && !this.mHasSubmittedRepeating) {
                this.mStartStreamingFuture.cancel(true);
            }
        }
    }
}
