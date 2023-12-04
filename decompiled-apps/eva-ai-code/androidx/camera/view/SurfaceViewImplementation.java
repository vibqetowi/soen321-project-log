package androidx.camera.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.view.PreviewViewImplementation;
import androidx.camera.view.SurfaceViewImplementation;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SurfaceViewImplementation extends PreviewViewImplementation {
    private static final String TAG = "SurfaceViewImpl";
    private PreviewViewImplementation.OnSurfaceNotInUseListener mOnSurfaceNotInUseListener;
    final SurfaceRequestCallback mSurfaceRequestCallback;
    SurfaceView mSurfaceView;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.PreviewViewImplementation
    public void onAttachedToWindow() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.PreviewViewImplementation
    public void onDetachedFromWindow() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SurfaceViewImplementation(FrameLayout frameLayout, PreviewTransformation previewTransformation) {
        super(frameLayout, previewTransformation);
        this.mSurfaceRequestCallback = new SurfaceRequestCallback();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.PreviewViewImplementation
    public void onSurfaceRequested(final SurfaceRequest surfaceRequest, PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener) {
        this.mResolution = surfaceRequest.getResolution();
        this.mOnSurfaceNotInUseListener = onSurfaceNotInUseListener;
        initializePreview();
        surfaceRequest.addRequestCancellationListener(ContextCompat.getMainExecutor(this.mSurfaceView.getContext()), new Runnable() { // from class: androidx.camera.view.SurfaceViewImplementation$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceViewImplementation.this.notifySurfaceNotInUse();
            }
        });
        this.mSurfaceView.post(new Runnable() { // from class: androidx.camera.view.SurfaceViewImplementation$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceViewImplementation.this.m262x6305943b(surfaceRequest);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onSurfaceRequested$0$androidx-camera-view-SurfaceViewImplementation  reason: not valid java name */
    public /* synthetic */ void m262x6305943b(SurfaceRequest surfaceRequest) {
        this.mSurfaceRequestCallback.setSurfaceRequest(surfaceRequest);
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    void initializePreview() {
        Preconditions.checkNotNull(this.mParent);
        Preconditions.checkNotNull(this.mResolution);
        SurfaceView surfaceView = new SurfaceView(this.mParent.getContext());
        this.mSurfaceView = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.mResolution.getWidth(), this.mResolution.getHeight()));
        this.mParent.removeAllViews();
        this.mParent.addView(this.mSurfaceView);
        this.mSurfaceView.getHolder().addCallback(this.mSurfaceRequestCallback);
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    View getPreview() {
        return this.mSurfaceView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void notifySurfaceNotInUse() {
        PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener = this.mOnSurfaceNotInUseListener;
        if (onSurfaceNotInUseListener != null) {
            onSurfaceNotInUseListener.onSurfaceNotInUse();
            this.mOnSurfaceNotInUseListener = null;
        }
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    Bitmap getPreviewBitmap() {
        SurfaceView surfaceView = this.mSurfaceView;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.mSurfaceView.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.mSurfaceView.getWidth(), this.mSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        Api24Impl.pixelCopyRequest(this.mSurfaceView, createBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.SurfaceViewImplementation$$ExternalSyntheticLambda2
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                SurfaceViewImplementation.lambda$getPreviewBitmap$1(i);
            }
        }, this.mSurfaceView.getHandler());
        return createBitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$getPreviewBitmap$1(int i) {
        if (i == 0) {
            Logger.d(TAG, "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
            return;
        }
        Logger.e(TAG, "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class SurfaceRequestCallback implements SurfaceHolder.Callback {
        private Size mCurrentSurfaceSize;
        private SurfaceRequest mSurfaceRequest;
        private Size mTargetSize;
        private boolean mWasSurfaceProvided = false;

        SurfaceRequestCallback() {
        }

        void setSurfaceRequest(SurfaceRequest surfaceRequest) {
            cancelPreviousRequest();
            this.mSurfaceRequest = surfaceRequest;
            Size resolution = surfaceRequest.getResolution();
            this.mTargetSize = resolution;
            this.mWasSurfaceProvided = false;
            if (tryToComplete()) {
                return;
            }
            Logger.d(SurfaceViewImplementation.TAG, "Wait for new Surface creation.");
            SurfaceViewImplementation.this.mSurfaceView.getHolder().setFixedSize(resolution.getWidth(), resolution.getHeight());
        }

        private boolean tryToComplete() {
            Surface surface = SurfaceViewImplementation.this.mSurfaceView.getHolder().getSurface();
            if (canProvideSurface()) {
                Logger.d(SurfaceViewImplementation.TAG, "Surface set on Preview.");
                this.mSurfaceRequest.provideSurface(surface, ContextCompat.getMainExecutor(SurfaceViewImplementation.this.mSurfaceView.getContext()), new Consumer() { // from class: androidx.camera.view.SurfaceViewImplementation$SurfaceRequestCallback$$ExternalSyntheticLambda0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        SurfaceViewImplementation.SurfaceRequestCallback.this.m263x982c86c5((SurfaceRequest.Result) obj);
                    }
                });
                this.mWasSurfaceProvided = true;
                SurfaceViewImplementation.this.onSurfaceProvided();
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$tryToComplete$0$androidx-camera-view-SurfaceViewImplementation$SurfaceRequestCallback  reason: not valid java name */
        public /* synthetic */ void m263x982c86c5(SurfaceRequest.Result result) {
            Logger.d(SurfaceViewImplementation.TAG, "Safe to release surface.");
            SurfaceViewImplementation.this.notifySurfaceNotInUse();
        }

        private boolean canProvideSurface() {
            Size size;
            return (this.mWasSurfaceProvided || this.mSurfaceRequest == null || (size = this.mTargetSize) == null || !size.equals(this.mCurrentSurfaceSize)) ? false : true;
        }

        private void cancelPreviousRequest() {
            if (this.mSurfaceRequest != null) {
                Logger.d(SurfaceViewImplementation.TAG, "Request canceled: " + this.mSurfaceRequest);
                this.mSurfaceRequest.willNotProvideSurface();
            }
        }

        private void invalidateSurface() {
            if (this.mSurfaceRequest != null) {
                Logger.d(SurfaceViewImplementation.TAG, "Surface invalidated " + this.mSurfaceRequest);
                this.mSurfaceRequest.getDeferrableSurface().close();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            Logger.d(SurfaceViewImplementation.TAG, "Surface created.");
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            Logger.d(SurfaceViewImplementation.TAG, "Surface changed. Size: " + i2 + "x" + i3);
            this.mCurrentSurfaceSize = new Size(i2, i3);
            tryToComplete();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Logger.d(SurfaceViewImplementation.TAG, "Surface destroyed.");
            if (this.mWasSurfaceProvided) {
                invalidateSurface();
            } else {
                cancelPreviousRequest();
            }
            this.mWasSurfaceProvided = false;
            this.mSurfaceRequest = null;
            this.mCurrentSurfaceSize = null;
            this.mTargetSize = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.view.PreviewViewImplementation
    public ListenableFuture<Void> waitForNextFrame() {
        return Futures.immediateFuture(null);
    }

    /* loaded from: classes.dex */
    private static class Api24Impl {
        private Api24Impl() {
        }

        static void pixelCopyRequest(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }
}
