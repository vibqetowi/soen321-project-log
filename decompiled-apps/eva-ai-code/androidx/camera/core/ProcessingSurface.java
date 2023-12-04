package androidx.camera.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.SingleImageProxyBundle;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProcessingSurface extends DeferrableSurface {
    private static final int MAX_IMAGES = 2;
    private static final String TAG = "ProcessingSurfaceTextur";
    private final CameraCaptureCallback mCameraCaptureCallback;
    final CaptureProcessor mCaptureProcessor;
    final CaptureStage mCaptureStage;
    private final Handler mImageReaderHandler;
    final MetadataImageReader mInputImageReader;
    final Surface mInputSurface;
    final Object mLock;
    private final DeferrableSurface mOutputDeferrableSurface;
    boolean mReleased;
    private final Size mResolution;
    private String mTagBundleKey;
    private final ImageReaderProxy.OnImageAvailableListener mTransformedListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$androidx-camera-core-ProcessingSurface  reason: not valid java name */
    public /* synthetic */ void m167lambda$new$0$androidxcameracoreProcessingSurface(ImageReaderProxy imageReaderProxy) {
        synchronized (this.mLock) {
            imageIncoming(imageReaderProxy);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ProcessingSurface(int i, int i2, int i3, Handler handler, CaptureStage captureStage, CaptureProcessor captureProcessor, DeferrableSurface deferrableSurface, String str) {
        super(new Size(i, i2), i3);
        this.mLock = new Object();
        ImageReaderProxy.OnImageAvailableListener onImageAvailableListener = new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.ProcessingSurface$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                ProcessingSurface.this.m167lambda$new$0$androidxcameracoreProcessingSurface(imageReaderProxy);
            }
        };
        this.mTransformedListener = onImageAvailableListener;
        this.mReleased = false;
        Size size = new Size(i, i2);
        this.mResolution = size;
        if (handler != null) {
            this.mImageReaderHandler = handler;
        } else {
            Looper myLooper = Looper.myLooper();
            if (myLooper == null) {
                throw new IllegalStateException("Creating a ProcessingSurface requires a non-null Handler, or be created  on a thread with a Looper.");
            }
            this.mImageReaderHandler = new Handler(myLooper);
        }
        ScheduledExecutorService newHandlerExecutor = CameraXExecutors.newHandlerExecutor(this.mImageReaderHandler);
        MetadataImageReader metadataImageReader = new MetadataImageReader(i, i2, i3, 2);
        this.mInputImageReader = metadataImageReader;
        metadataImageReader.setOnImageAvailableListener(onImageAvailableListener, newHandlerExecutor);
        this.mInputSurface = metadataImageReader.getSurface();
        this.mCameraCaptureCallback = metadataImageReader.getCameraCaptureCallback();
        this.mCaptureProcessor = captureProcessor;
        captureProcessor.onResolutionUpdate(size);
        this.mCaptureStage = captureStage;
        this.mOutputDeferrableSurface = deferrableSurface;
        this.mTagBundleKey = str;
        Futures.addCallback(deferrableSurface.getSurface(), new FutureCallback<Surface>() { // from class: androidx.camera.core.ProcessingSurface.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Surface surface) {
                synchronized (ProcessingSurface.this.mLock) {
                    ProcessingSurface.this.mCaptureProcessor.onOutputSurface(surface, 1);
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                Logger.e(ProcessingSurface.TAG, "Failed to extract Listenable<Surface>.", th);
            }
        }, CameraXExecutors.directExecutor());
        getTerminationFuture().addListener(new Runnable() { // from class: androidx.camera.core.ProcessingSurface$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ProcessingSurface.this.release();
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public ListenableFuture<Surface> provideSurface() {
        ListenableFuture<Surface> immediateFuture;
        synchronized (this.mLock) {
            immediateFuture = Futures.immediateFuture(this.mInputSurface);
        }
        return immediateFuture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CameraCaptureCallback getCameraCaptureCallback() {
        CameraCaptureCallback cameraCaptureCallback;
        synchronized (this.mLock) {
            if (this.mReleased) {
                throw new IllegalStateException("ProcessingSurface already released!");
            }
            cameraCaptureCallback = this.mCameraCaptureCallback;
        }
        return cameraCaptureCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        synchronized (this.mLock) {
            if (this.mReleased) {
                return;
            }
            this.mInputImageReader.close();
            this.mInputSurface.release();
            this.mOutputDeferrableSurface.close();
            this.mReleased = true;
        }
    }

    void imageIncoming(ImageReaderProxy imageReaderProxy) {
        ImageProxy imageProxy;
        if (this.mReleased) {
            return;
        }
        try {
            imageProxy = imageReaderProxy.acquireNextImage();
        } catch (IllegalStateException e) {
            Logger.e(TAG, "Failed to acquire next image.", e);
            imageProxy = null;
        }
        if (imageProxy == null) {
            return;
        }
        ImageInfo imageInfo = imageProxy.getImageInfo();
        if (imageInfo == null) {
            imageProxy.close();
            return;
        }
        Integer num = (Integer) imageInfo.getTagBundle().getTag(this.mTagBundleKey);
        if (num == null) {
            imageProxy.close();
        } else if (this.mCaptureStage.getId() != num.intValue()) {
            Logger.w(TAG, "ImageProxyBundle does not contain this id: " + num);
            imageProxy.close();
        } else {
            SingleImageProxyBundle singleImageProxyBundle = new SingleImageProxyBundle(imageProxy, this.mTagBundleKey);
            this.mCaptureProcessor.process(singleImageProxyBundle);
            singleImageProxyBundle.close();
        }
    }
}
