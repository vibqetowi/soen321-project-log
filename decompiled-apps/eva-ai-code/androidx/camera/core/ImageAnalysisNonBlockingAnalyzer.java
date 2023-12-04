package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageAnalysisNonBlockingAnalyzer;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ImageAnalysisNonBlockingAnalyzer extends ImageAnalysisAbstractAnalyzer {
    final Executor mBackgroundExecutor;
    ImageProxy mCachedImage;
    private final Object mLock = new Object();
    private CacheAnalyzingImageProxy mPostedImage;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ImageAnalysisNonBlockingAnalyzer(Executor executor) {
        this.mBackgroundExecutor = executor;
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    ImageProxy acquireImage(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireLatestImage();
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    void onValidImageAvailable(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            if (!this.mIsAttached) {
                imageProxy.close();
            } else if (this.mPostedImage != null) {
                if (imageProxy.getImageInfo().getTimestamp() <= this.mPostedImage.getImageInfo().getTimestamp()) {
                    imageProxy.close();
                } else {
                    ImageProxy imageProxy2 = this.mCachedImage;
                    if (imageProxy2 != null) {
                        imageProxy2.close();
                    }
                    this.mCachedImage = imageProxy;
                }
            } else {
                final CacheAnalyzingImageProxy cacheAnalyzingImageProxy = new CacheAnalyzingImageProxy(imageProxy, this);
                this.mPostedImage = cacheAnalyzingImageProxy;
                Futures.addCallback(analyzeImage(cacheAnalyzingImageProxy), new FutureCallback<Void>() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onSuccess(Void r1) {
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(Throwable th) {
                        cacheAnalyzingImageProxy.close();
                    }
                }, CameraXExecutors.directExecutor());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public void clearCache() {
        synchronized (this.mLock) {
            ImageProxy imageProxy = this.mCachedImage;
            if (imageProxy != null) {
                imageProxy.close();
                this.mCachedImage = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void analyzeCachedImage() {
        synchronized (this.mLock) {
            this.mPostedImage = null;
            ImageProxy imageProxy = this.mCachedImage;
            if (imageProxy != null) {
                this.mCachedImage = null;
                onValidImageAvailable(imageProxy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class CacheAnalyzingImageProxy extends ForwardingImageProxy {
        final WeakReference<ImageAnalysisNonBlockingAnalyzer> mNonBlockingAnalyzerWeakReference;

        CacheAnalyzingImageProxy(ImageProxy imageProxy, ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer) {
            super(imageProxy);
            this.mNonBlockingAnalyzerWeakReference = new WeakReference<>(imageAnalysisNonBlockingAnalyzer);
            addOnImageCloseListener(new ForwardingImageProxy.OnImageCloseListener() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$ExternalSyntheticLambda1
                @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
                public final void onImageClose(ImageProxy imageProxy2) {
                    ImageAnalysisNonBlockingAnalyzer.CacheAnalyzingImageProxy.this.m149x18076637(imageProxy2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: lambda$new$1$androidx-camera-core-ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy  reason: not valid java name */
        public /* synthetic */ void m149x18076637(ImageProxy imageProxy) {
            final ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer = this.mNonBlockingAnalyzerWeakReference.get();
            if (imageAnalysisNonBlockingAnalyzer != null) {
                imageAnalysisNonBlockingAnalyzer.mBackgroundExecutor.execute(new Runnable() { // from class: androidx.camera.core.ImageAnalysisNonBlockingAnalyzer$CacheAnalyzingImageProxy$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageAnalysisNonBlockingAnalyzer.this.analyzeCachedImage();
                    }
                });
            }
        }
    }
}
