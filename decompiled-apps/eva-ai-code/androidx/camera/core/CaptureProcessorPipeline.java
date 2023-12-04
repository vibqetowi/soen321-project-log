package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.ImageProxyBundle;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CaptureProcessorPipeline implements CaptureProcessor {
    private static final String TAG = "CaptureProcessorPipeline";
    CallbackToFutureAdapter.Completer<Void> mCloseCompleter;
    private ListenableFuture<Void> mCloseFuture;
    final Executor mExecutor;
    private final int mMaxImages;
    private final CaptureProcessor mPostCaptureProcessor;
    private final CaptureProcessor mPreCaptureProcessor;
    private final ListenableFuture<List<Void>> mUnderlyingCaptureProcessorsCloseFuture;
    private ImageReaderProxy mIntermediateImageReader = null;
    private ImageInfo mSourceImageInfo = null;
    private final Object mLock = new Object();
    private boolean mClosed = false;
    private boolean mProcessing = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Void lambda$getCloseFuture$3(List list) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CaptureProcessorPipeline(CaptureProcessor captureProcessor, int i, CaptureProcessor captureProcessor2, Executor executor) {
        this.mPreCaptureProcessor = captureProcessor;
        this.mPostCaptureProcessor = captureProcessor2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(captureProcessor.getCloseFuture());
        arrayList.add(captureProcessor2.getCloseFuture());
        this.mUnderlyingCaptureProcessorsCloseFuture = Futures.allAsList(arrayList);
        this.mExecutor = executor;
        this.mMaxImages = i;
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void onOutputSurface(Surface surface, int i) {
        this.mPostCaptureProcessor.onOutputSurface(surface, i);
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void process(ImageProxyBundle imageProxyBundle) {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            this.mProcessing = true;
            ListenableFuture<ImageProxy> imageProxy = imageProxyBundle.getImageProxy(imageProxyBundle.getCaptureIds().get(0).intValue());
            Preconditions.checkArgument(imageProxy.isDone());
            try {
                this.mSourceImageInfo = imageProxy.get().getImageInfo();
                this.mPreCaptureProcessor.process(imageProxyBundle);
            } catch (InterruptedException | ExecutionException unused) {
                throw new IllegalArgumentException("Can not successfully extract ImageProxy from the ImageProxyBundle.");
            }
        }
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void onResolutionUpdate(Size size) {
        AndroidImageReaderProxy androidImageReaderProxy = new AndroidImageReaderProxy(ImageReader.newInstance(size.getWidth(), size.getHeight(), 35, this.mMaxImages));
        this.mIntermediateImageReader = androidImageReaderProxy;
        this.mPreCaptureProcessor.onOutputSurface(androidImageReaderProxy.getSurface(), 35);
        this.mPreCaptureProcessor.onResolutionUpdate(size);
        this.mPostCaptureProcessor.onResolutionUpdate(size);
        this.mIntermediateImageReader.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.CaptureProcessorPipeline$$ExternalSyntheticLambda0
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
                CaptureProcessorPipeline.this.m145x3f602b2(imageReaderProxy);
            }
        }, CameraXExecutors.directExecutor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onResolutionUpdate$1$androidx-camera-core-CaptureProcessorPipeline  reason: not valid java name */
    public /* synthetic */ void m145x3f602b2(ImageReaderProxy imageReaderProxy) {
        final ImageProxy acquireNextImage = imageReaderProxy.acquireNextImage();
        try {
            this.mExecutor.execute(new Runnable() { // from class: androidx.camera.core.CaptureProcessorPipeline$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    CaptureProcessorPipeline.this.m144x8e7bdc71(acquireNextImage);
                }
            });
        } catch (RejectedExecutionException unused) {
            Logger.e(TAG, "The executor for post-processing might have been shutting down or terminated!");
            acquireNextImage.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: postProcess */
    public void m144x8e7bdc71(ImageProxy imageProxy) {
        boolean z;
        synchronized (this.mLock) {
            z = this.mClosed;
        }
        if (!z) {
            Size size = new Size(imageProxy.getWidth(), imageProxy.getHeight());
            Preconditions.checkNotNull(this.mSourceImageInfo);
            String next = this.mSourceImageInfo.getTagBundle().listKeys().iterator().next();
            int intValue = ((Integer) this.mSourceImageInfo.getTagBundle().getTag(next)).intValue();
            SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy, size, this.mSourceImageInfo);
            this.mSourceImageInfo = null;
            SettableImageProxyBundle settableImageProxyBundle = new SettableImageProxyBundle(Collections.singletonList(Integer.valueOf(intValue)), next);
            settableImageProxyBundle.addImageProxy(settableImageProxy);
            try {
                this.mPostCaptureProcessor.process(settableImageProxyBundle);
            } catch (Exception e) {
                Logger.e(TAG, "Post processing image failed! " + e.getMessage());
            }
        }
        synchronized (this.mLock) {
            this.mProcessing = false;
        }
        closeAndCompleteFutureIfNecessary();
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void close() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            this.mClosed = true;
            this.mPreCaptureProcessor.close();
            this.mPostCaptureProcessor.close();
            closeAndCompleteFutureIfNecessary();
        }
    }

    private void closeAndCompleteFutureIfNecessary() {
        boolean z;
        boolean z2;
        final CallbackToFutureAdapter.Completer<Void> completer;
        synchronized (this.mLock) {
            z = this.mClosed;
            z2 = this.mProcessing;
            completer = this.mCloseCompleter;
            if (z && !z2) {
                this.mIntermediateImageReader.close();
            }
        }
        if (!z || z2 || completer == null) {
            return;
        }
        this.mUnderlyingCaptureProcessorsCloseFuture.addListener(new Runnable() { // from class: androidx.camera.core.CaptureProcessorPipeline$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                CallbackToFutureAdapter.Completer.this.set(null);
            }
        }, CameraXExecutors.directExecutor());
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public ListenableFuture<Void> getCloseFuture() {
        ListenableFuture<Void> nonCancellationPropagating;
        synchronized (this.mLock) {
            if (this.mClosed && !this.mProcessing) {
                nonCancellationPropagating = Futures.transform(this.mUnderlyingCaptureProcessorsCloseFuture, new Function() { // from class: androidx.camera.core.CaptureProcessorPipeline$$ExternalSyntheticLambda1
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        return CaptureProcessorPipeline.lambda$getCloseFuture$3((List) obj);
                    }
                }, CameraXExecutors.directExecutor());
            } else {
                if (this.mCloseFuture == null) {
                    this.mCloseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.CaptureProcessorPipeline$$ExternalSyntheticLambda2
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return CaptureProcessorPipeline.this.m143x1c495a06(completer);
                        }
                    });
                }
                nonCancellationPropagating = Futures.nonCancellationPropagating(this.mCloseFuture);
            }
        }
        return nonCancellationPropagating;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getCloseFuture$4$androidx-camera-core-CaptureProcessorPipeline  reason: not valid java name */
    public /* synthetic */ Object m143x1c495a06(CallbackToFutureAdapter.Completer completer) throws Exception {
        synchronized (this.mLock) {
            this.mCloseCompleter = completer;
        }
        return "CaptureProcessorPipeline-close";
    }
}
