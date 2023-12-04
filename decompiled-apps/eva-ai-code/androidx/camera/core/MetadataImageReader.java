package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MetadataImageReader implements ImageReaderProxy, ForwardingImageProxy.OnImageCloseListener {
    private static final String TAG = "MetadataImageReader";
    private final List<ImageProxy> mAcquiredImageProxies;
    private CameraCaptureCallback mCameraCaptureCallback;
    private boolean mClosed;
    private Executor mExecutor;
    private int mImageProxiesIndex;
    private final ImageReaderProxy mImageReaderProxy;
    ImageReaderProxy.OnImageAvailableListener mListener;
    private final Object mLock;
    private final List<ImageProxy> mMatchedImageProxies;
    private final LongSparseArray<ImageInfo> mPendingImageInfos;
    private final LongSparseArray<ImageProxy> mPendingImages;
    private ImageReaderProxy.OnImageAvailableListener mTransformedListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MetadataImageReader(int i, int i2, int i3, int i4) {
        this(createImageReaderProxy(i, i2, i3, i4));
    }

    private static ImageReaderProxy createImageReaderProxy(int i, int i2, int i3, int i4) {
        return new AndroidImageReaderProxy(ImageReader.newInstance(i, i2, i3, i4));
    }

    MetadataImageReader(ImageReaderProxy imageReaderProxy) {
        this.mLock = new Object();
        this.mCameraCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.core.MetadataImageReader.1
            @Override // androidx.camera.core.impl.CameraCaptureCallback
            public void onCaptureCompleted(CameraCaptureResult cameraCaptureResult) {
                super.onCaptureCompleted(cameraCaptureResult);
                MetadataImageReader.this.resultIncoming(cameraCaptureResult);
            }
        };
        this.mTransformedListener = new ImageReaderProxy.OnImageAvailableListener() { // from class: androidx.camera.core.MetadataImageReader$$ExternalSyntheticLambda1
            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy2) {
                MetadataImageReader.this.m162lambda$new$0$androidxcameracoreMetadataImageReader(imageReaderProxy2);
            }
        };
        this.mClosed = false;
        this.mPendingImageInfos = new LongSparseArray<>();
        this.mPendingImages = new LongSparseArray<>();
        this.mAcquiredImageProxies = new ArrayList();
        this.mImageReaderProxy = imageReaderProxy;
        this.mImageProxiesIndex = 0;
        this.mMatchedImageProxies = new ArrayList(getMaxImages());
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireLatestImage() {
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.isEmpty()) {
                return null;
            }
            if (this.mImageProxiesIndex >= this.mMatchedImageProxies.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            ArrayList<ImageProxy> arrayList = new ArrayList();
            for (int i = 0; i < this.mMatchedImageProxies.size() - 1; i++) {
                if (!this.mAcquiredImageProxies.contains(this.mMatchedImageProxies.get(i))) {
                    arrayList.add(this.mMatchedImageProxies.get(i));
                }
            }
            for (ImageProxy imageProxy : arrayList) {
                imageProxy.close();
            }
            int size = this.mMatchedImageProxies.size() - 1;
            List<ImageProxy> list = this.mMatchedImageProxies;
            this.mImageProxiesIndex = size + 1;
            ImageProxy imageProxy2 = list.get(size);
            this.mAcquiredImageProxies.add(imageProxy2);
            return imageProxy2;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public ImageProxy acquireNextImage() {
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.isEmpty()) {
                return null;
            }
            if (this.mImageProxiesIndex >= this.mMatchedImageProxies.size()) {
                throw new IllegalStateException("Maximum image number reached.");
            }
            List<ImageProxy> list = this.mMatchedImageProxies;
            int i = this.mImageProxiesIndex;
            this.mImageProxiesIndex = i + 1;
            ImageProxy imageProxy = list.get(i);
            this.mAcquiredImageProxies.add(imageProxy);
            return imageProxy;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void close() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            for (ImageProxy imageProxy : new ArrayList(this.mMatchedImageProxies)) {
                imageProxy.close();
            }
            this.mMatchedImageProxies.clear();
            this.mImageReaderProxy.close();
            this.mClosed = true;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getHeight() {
        int height;
        synchronized (this.mLock) {
            height = this.mImageReaderProxy.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getWidth() {
        int width;
        synchronized (this.mLock) {
            width = this.mImageReaderProxy.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getImageFormat() {
        int imageFormat;
        synchronized (this.mLock) {
            imageFormat = this.mImageReaderProxy.getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public int getMaxImages() {
        int maxImages;
        synchronized (this.mLock) {
            maxImages = this.mImageReaderProxy.getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public Surface getSurface() {
        Surface surface;
        synchronized (this.mLock) {
            surface = this.mImageReaderProxy.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void setOnImageAvailableListener(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener, Executor executor) {
        synchronized (this.mLock) {
            this.mListener = (ImageReaderProxy.OnImageAvailableListener) Preconditions.checkNotNull(onImageAvailableListener);
            this.mExecutor = (Executor) Preconditions.checkNotNull(executor);
            this.mImageReaderProxy.setOnImageAvailableListener(this.mTransformedListener, executor);
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy
    public void clearOnImageAvailableListener() {
        synchronized (this.mLock) {
            this.mListener = null;
            this.mExecutor = null;
        }
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            dequeImageProxy(imageProxy);
        }
    }

    private void enqueueImageProxy(SettableImageProxy settableImageProxy) {
        final ImageReaderProxy.OnImageAvailableListener onImageAvailableListener;
        Executor executor;
        synchronized (this.mLock) {
            if (this.mMatchedImageProxies.size() < getMaxImages()) {
                settableImageProxy.addOnImageCloseListener(this);
                this.mMatchedImageProxies.add(settableImageProxy);
                onImageAvailableListener = this.mListener;
                executor = this.mExecutor;
            } else {
                Logger.d("TAG", "Maximum image number reached.");
                settableImageProxy.close();
                onImageAvailableListener = null;
                executor = null;
            }
        }
        if (onImageAvailableListener != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.camera.core.MetadataImageReader$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MetadataImageReader.this.m161xfaac2cde(onImageAvailableListener);
                    }
                });
            } else {
                onImageAvailableListener.onImageAvailable(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$enqueueImageProxy$1$androidx-camera-core-MetadataImageReader  reason: not valid java name */
    public /* synthetic */ void m161xfaac2cde(ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        onImageAvailableListener.onImageAvailable(this);
    }

    private void dequeImageProxy(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            int indexOf = this.mMatchedImageProxies.indexOf(imageProxy);
            if (indexOf >= 0) {
                this.mMatchedImageProxies.remove(indexOf);
                int i = this.mImageProxiesIndex;
                if (indexOf <= i) {
                    this.mImageProxiesIndex = i - 1;
                }
            }
            this.mAcquiredImageProxies.remove(imageProxy);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CameraCaptureCallback getCameraCaptureCallback() {
        return this.mCameraCaptureCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: imageIncoming */
    public void m162lambda$new$0$androidxcameracoreMetadataImageReader(ImageReaderProxy imageReaderProxy) {
        ImageProxy imageProxy;
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            int i = 0;
            do {
                try {
                    imageProxy = imageReaderProxy.acquireNextImage();
                    if (imageProxy != null) {
                        i++;
                        this.mPendingImages.put(imageProxy.getImageInfo().getTimestamp(), imageProxy);
                        matchImages();
                    }
                } catch (IllegalStateException e) {
                    Logger.d(TAG, "Failed to acquire next image.", e);
                    imageProxy = null;
                }
                if (imageProxy == null) {
                    break;
                }
            } while (i < imageReaderProxy.getMaxImages());
        }
    }

    void resultIncoming(CameraCaptureResult cameraCaptureResult) {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            this.mPendingImageInfos.put(cameraCaptureResult.getTimestamp(), new CameraCaptureResultImageInfo(cameraCaptureResult));
            matchImages();
        }
    }

    private void removeStaleData() {
        synchronized (this.mLock) {
            if (this.mPendingImages.size() != 0 && this.mPendingImageInfos.size() != 0) {
                Long valueOf = Long.valueOf(this.mPendingImages.keyAt(0));
                Long valueOf2 = Long.valueOf(this.mPendingImageInfos.keyAt(0));
                Preconditions.checkArgument(valueOf2.equals(valueOf) ? false : true);
                if (valueOf2.longValue() > valueOf.longValue()) {
                    for (int size = this.mPendingImages.size() - 1; size >= 0; size--) {
                        if (this.mPendingImages.keyAt(size) < valueOf2.longValue()) {
                            this.mPendingImages.valueAt(size).close();
                            this.mPendingImages.removeAt(size);
                        }
                    }
                } else {
                    for (int size2 = this.mPendingImageInfos.size() - 1; size2 >= 0; size2--) {
                        if (this.mPendingImageInfos.keyAt(size2) < valueOf.longValue()) {
                            this.mPendingImageInfos.removeAt(size2);
                        }
                    }
                }
            }
        }
    }

    private void matchImages() {
        synchronized (this.mLock) {
            for (int size = this.mPendingImageInfos.size() - 1; size >= 0; size--) {
                ImageInfo valueAt = this.mPendingImageInfos.valueAt(size);
                long timestamp = valueAt.getTimestamp();
                ImageProxy imageProxy = this.mPendingImages.get(timestamp);
                if (imageProxy != null) {
                    this.mPendingImages.remove(timestamp);
                    this.mPendingImageInfos.removeAt(size);
                    enqueueImageProxy(new SettableImageProxy(imageProxy, valueAt));
                }
            }
            removeStaleData();
        }
    }
}
