package androidx.camera.core;

import android.media.ImageReader;
import android.util.Size;
import android.view.Surface;
import androidx.arch.core.util.Function;
import androidx.camera.core.ProcessingImageReader;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.CaptureStage;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ProcessingImageReader implements ImageReaderProxy {
    private static final int EXIF_MAX_SIZE_BYTES = 64000;
    private static final String TAG = "ProcessingImageReader";
    final CaptureProcessor mCaptureProcessor;
    CallbackToFutureAdapter.Completer<Void> mCloseCompleter;
    private ListenableFuture<Void> mCloseFuture;
    Executor mErrorCallbackExecutor;
    Executor mExecutor;
    final ImageReaderProxy mInputImageReader;
    ImageReaderProxy.OnImageAvailableListener mListener;
    OnProcessingErrorCallback mOnProcessingErrorCallback;
    final ImageReaderProxy mOutputImageReader;
    final Executor mPostProcessExecutor;
    private final ListenableFuture<Void> mUnderlyingCaptureProcessorCloseFuture;
    final Object mLock = new Object();
    private ImageReaderProxy.OnImageAvailableListener mTransformedListener = new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.ProcessingImageReader.1
        @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
        public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
            ProcessingImageReader.this.imageIncoming(imageReaderProxy);
        }
    };
    private ImageReaderProxy.OnImageAvailableListener mImageProcessedListener = new AnonymousClass2();
    private FutureCallback<List<ImageProxy>> mCaptureStageReadyCallback = new AnonymousClass3();
    boolean mClosed = false;
    boolean mProcessing = false;
    private String mTagBundleKey = new String();
    SettableImageProxyBundle mSettableImageProxyBundle = new SettableImageProxyBundle(Collections.emptyList(), this.mTagBundleKey);
    private final List<Integer> mCaptureIdList = new ArrayList();
    private ListenableFuture<List<ImageProxy>> mSettableImageProxyFutureList = Futures.immediateFuture(new ArrayList());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface OnProcessingErrorCallback {
        void notifyProcessingError(String str, Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Void lambda$getCloseFuture$1(Void r0) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.core.ProcessingImageReader$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements ImageReaderProxy.OnImageAvailableListener {
        AnonymousClass2() {
        }

        @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
        public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
            final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
            Executor executor;
            synchronized (ProcessingImageReader.this.mLock) {
                onImageAvailableListener = ProcessingImageReader.this.mListener;
                executor = ProcessingImageReader.this.mExecutor;
                ProcessingImageReader.this.mSettableImageProxyBundle.reset();
                ProcessingImageReader.this.setupSettableImageProxyBundleCallbacks();
            }
            if (onImageAvailableListener != null) {
                if (executor != null) {
                    executor.execute(new Runnable() { // from class: androidx.camera.core.ProcessingImageReader$2$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProcessingImageReader.AnonymousClass2.this.m166x3c329d5d(onImageAvailableListener);
                        }
                    });
                } else {
                    onImageAvailableListener.onImageAvailable(ProcessingImageReader.this);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$onImageAvailable$0$androidx-camera-core-ProcessingImageReader$2  reason: not valid java name */
        public /* synthetic */ void m166x3c329d5d(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
            onImageAvailableListener.onImageAvailable(ProcessingImageReader.this);
        }
    }

    /* renamed from: androidx.camera.core.ProcessingImageReader$3  reason: invalid class name */
    /* loaded from: classes.dex */
    class AnonymousClass3 implements FutureCallback<List<ImageProxy>> {
        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onFailure(Throwable th) {
        }

        AnonymousClass3() {
        }

        @Override // androidx.camera.core.impl.utils.futures.FutureCallback
        public void onSuccess(List<ImageProxy> list) {
            synchronized (ProcessingImageReader.this.mLock) {
                if (ProcessingImageReader.this.mClosed) {
                    return;
                }
                ProcessingImageReader.this.mProcessing = true;
                SettableImageProxyBundle settableImageProxyBundle = ProcessingImageReader.this.mSettableImageProxyBundle;
                final OnProcessingErrorCallback onProcessingErrorCallback = ProcessingImageReader.this.mOnProcessingErrorCallback;
                Executor executor = ProcessingImageReader.this.mErrorCallbackExecutor;
                try {
                    ProcessingImageReader.this.mCaptureProcessor.process(settableImageProxyBundle);
                } catch (Exception e) {
                    synchronized (ProcessingImageReader.this.mLock) {
                        ProcessingImageReader.this.mSettableImageProxyBundle.reset();
                        if (onProcessingErrorCallback != null && executor != null) {
                            executor.execute(new Runnable() { // from class: androidx.camera.core.ProcessingImageReader$3$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ProcessingImageReader.OnProcessingErrorCallback.this.notifyProcessingError(r1.getMessage(), e.getCause());
                                }
                            });
                        }
                    }
                }
                synchronized (ProcessingImageReader.this.mLock) {
                    ProcessingImageReader.this.mProcessing = false;
                }
                ProcessingImageReader.this.closeAndCompleteFutureIfNecessary();
            }
        }
    }

    ProcessingImageReader(Builder builder) {
        if (builder.mInputImageReader.getMaxImages() < builder.mCaptureBundle.getCaptureStages().size()) {
            throw new IllegalArgumentException("MetadataImageReader is smaller than CaptureBundle.");
        }
        ImageReaderProxy imageReaderProxy = builder.mInputImageReader;
        this.mInputImageReader = imageReaderProxy;
        int width = imageReaderProxy.getWidth();
        int height = imageReaderProxy.getHeight();
        if (builder.mOutputFormat == 256) {
            width = ((int) (width * height * 1.5f)) + EXIF_MAX_SIZE_BYTES;
            height = 1;
        }
        AndroidImageReaderProxy androidImageReaderProxy = new AndroidImageReaderProxy(ImageReader.newInstance(width, height, builder.mOutputFormat, imageReaderProxy.getMaxImages()));
        this.mOutputImageReader = androidImageReaderProxy;
        this.mPostProcessExecutor = builder.mPostProcessExecutor;
        CaptureProcessor captureProcessor = builder.mCaptureProcessor;
        this.mCaptureProcessor = captureProcessor;
        captureProcessor.onOutputSurface(androidImageReaderProxy.getSurface(), builder.mOutputFormat);
        captureProcessor.onResolutionUpdate(new Size(imageReaderProxy.getWidth(), imageReaderProxy.getHeight()));
        this.mUnderlyingCaptureProcessorCloseFuture = captureProcessor.getCloseFuture();
        setCaptureBundle(builder.mCaptureBundle);
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireLatestImage() {
        ImageProxy acquireLatestImage;
        synchronized (this.mLock) {
            acquireLatestImage = this.mOutputImageReader.acquireLatestImage();
        }
        return acquireLatestImage;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireNextImage() {
        ImageProxy acquireNextImage;
        synchronized (this.mLock) {
            acquireNextImage = this.mOutputImageReader.acquireNextImage();
        }
        return acquireNextImage;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            this.mInputImageReader.clearOnImageAvailableListener();
            this.mOutputImageReader.clearOnImageAvailableListener();
            this.mClosed = true;
            this.mCaptureProcessor.close();
            closeAndCompleteFutureIfNecessary();
        }
    }

    void closeAndCompleteFutureIfNecessary() {
        boolean z;
        boolean z2;
        final CallbackToFutureAdapter.Completer<Void> completer;
        synchronized (this.mLock) {
            z = this.mClosed;
            z2 = this.mProcessing;
            completer = this.mCloseCompleter;
            if (z && !z2) {
                this.mInputImageReader.close();
                this.mSettableImageProxyBundle.close();
                this.mOutputImageReader.close();
            }
        }
        if (!z || z2) {
            return;
        }
        this.mUnderlyingCaptureProcessorCloseFuture.addListener(new Runnable() { // from class: androidx.camera.core.ProcessingImageReader$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ProcessingImageReader.this.m164x76c5121f(completer);
            }
        }, CameraXExecutors.directExecutor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$closeAndCompleteFutureIfNecessary$0$androidx-camera-core-ProcessingImageReader  reason: not valid java name */
    public /* synthetic */ void m164x76c5121f(CallbackToFutureAdapter.Completer completer) {
        cancelSettableImageProxyBundleFutureList();
        if (completer != null) {
            completer.set(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ListenableFuture<Void> getCloseFuture() {
        ListenableFuture<Void> nonCancellationPropagating;
        synchronized (this.mLock) {
            if (this.mClosed && !this.mProcessing) {
                nonCancellationPropagating = Futures.transform(this.mUnderlyingCaptureProcessorCloseFuture, new Function() { // from class: androidx.camera.core.ProcessingImageReader$$ExternalSyntheticLambda0
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        return ProcessingImageReader.lambda$getCloseFuture$1((Void) obj);
                    }
                }, CameraXExecutors.directExecutor());
            } else {
                if (this.mCloseFuture == null) {
                    this.mCloseFuture = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.ProcessingImageReader$$ExternalSyntheticLambda1
                        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                        public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                            return ProcessingImageReader.this.m165xf1cfc5d5(completer);
                        }
                    });
                }
                nonCancellationPropagating = Futures.nonCancellationPropagating(this.mCloseFuture);
            }
        }
        return nonCancellationPropagating;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$getCloseFuture$2$androidx-camera-core-ProcessingImageReader  reason: not valid java name */
    public /* synthetic */ Object m165xf1cfc5d5(CallbackToFutureAdapter.Completer completer) throws Exception {
        synchronized (this.mLock) {
            this.mCloseCompleter = completer;
        }
        return "ProcessingImageReader-close";
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mInputImageReader.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mInputImageReader.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mOutputImageReader.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mInputImageReader.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mInputImageReader.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.mLock) {
            this.mListener = (ImageReaderProxy.OnImageAvailableListener) Preconditions.checkNotNull(onImageAvailableListener);
            this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
            this.mInputImageReader.setOnImageAvailableListener(this.mTransformedListener, executor);
            this.mOutputImageReader.setOnImageAvailableListener(this.mImageProcessedListener, executor);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mListener = null;
            this.mExecutor = null;
            this.mInputImageReader.clearOnImageAvailableListener();
            this.mOutputImageReader.clearOnImageAvailableListener();
            if (!this.mProcessing) {
                this.mSettableImageProxyBundle.close();
            }
        }
    }

    public void setCaptureBundle(CaptureBundle captureBundle) {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            cancelSettableImageProxyBundleFutureList();
            if (captureBundle.getCaptureStages() != null) {
                if (this.mInputImageReader.getMaxImages() < captureBundle.getCaptureStages().size()) {
                    throw new IllegalArgumentException("CaptureBundle is larger than InputImageReader.");
                }
                this.mCaptureIdList.clear();
                for (CaptureStage captureStage : captureBundle.getCaptureStages()) {
                    if (captureStage != null) {
                        this.mCaptureIdList.add(Integer.valueOf(captureStage.getId()));
                    }
                }
            }
            String num = Integer.toString(captureBundle.hashCode());
            this.mTagBundleKey = num;
            this.mSettableImageProxyBundle = new SettableImageProxyBundle(this.mCaptureIdList, num);
            setupSettableImageProxyBundleCallbacks();
        }
    }

    private void cancelSettableImageProxyBundleFutureList() {
        synchronized (this.mLock) {
            if (!this.mSettableImageProxyFutureList.isDone()) {
                this.mSettableImageProxyFutureList.cancel(true);
            }
            this.mSettableImageProxyBundle.reset();
        }
    }

    public String getTagBundleKey() {
        return this.mTagBundleKey;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CameraCaptureCallback getCameraCaptureCallback() {
        synchronized (this.mLock) {
            ImageReaderProxy imageReaderProxy = this.mInputImageReader;
            if (imageReaderProxy instanceof MetadataImageReader) {
                return ((MetadataImageReader) imageReaderProxy).getCameraCaptureCallback();
            }
            return new CameraCaptureCallback() { // from class: androidx.camera.core.ProcessingImageReader.4
            };
        }
    }

    public void setOnProcessingErrorCallback(Executor executor, OnProcessingErrorCallback onProcessingErrorCallback) {
        synchronized (this.mLock) {
            this.mErrorCallbackExecutor = executor;
            this.mOnProcessingErrorCallback = onProcessingErrorCallback;
        }
    }

    void setupSettableImageProxyBundleCallbacks() {
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.mCaptureIdList) {
            arrayList.add(this.mSettableImageProxyBundle.getImageProxy(num.intValue()));
        }
        this.mSettableImageProxyFutureList = Futures.allAsList(arrayList);
        Futures.addCallback(Futures.allAsList(arrayList), this.mCaptureStageReadyCallback, this.mPostProcessExecutor);
    }

    void imageIncoming(ImageReaderProxy imageReaderProxy) {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            try {
                ImageProxy acquireNextImage = imageReaderProxy.acquireNextImage();
                if (acquireNextImage != null) {
                    Integer num = (Integer) acquireNextImage.getImageInfo().getTagBundle().getTag(this.mTagBundleKey);
                    if (!this.mCaptureIdList.contains(num)) {
                        Logger.w(TAG, "ImageProxyBundle does not contain this id: " + num);
                        acquireNextImage.close();
                    } else {
                        this.mSettableImageProxyBundle.addImageProxy(acquireNextImage);
                    }
                }
            } catch (IllegalStateException e) {
                Logger.e(TAG, "Failed to acquire latest image.", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class Builder {
        protected final CaptureBundle mCaptureBundle;
        protected final CaptureProcessor mCaptureProcessor;
        protected final ImageReaderProxy mInputImageReader;
        protected int mOutputFormat;
        protected Executor mPostProcessExecutor;

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(ImageReaderProxy imageReaderProxy, CaptureBundle captureBundle, CaptureProcessor captureProcessor) {
            this.mPostProcessExecutor = Executors.newSingleThreadExecutor();
            this.mInputImageReader = imageReaderProxy;
            this.mCaptureBundle = captureBundle;
            this.mCaptureProcessor = captureProcessor;
            this.mOutputFormat = imageReaderProxy.getImageFormat();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(int i, int i2, int i3, int i4, CaptureBundle captureBundle, CaptureProcessor captureProcessor) {
            this(new MetadataImageReader(i, i2, i3, i4), captureBundle, captureProcessor);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setPostProcessExecutor(Executor executor) {
            this.mPostProcessExecutor = executor;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder setOutputFormat(int i) {
            this.mOutputFormat = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ProcessingImageReader build() {
            return new ProcessingImageReader(this);
        }
    }
}
