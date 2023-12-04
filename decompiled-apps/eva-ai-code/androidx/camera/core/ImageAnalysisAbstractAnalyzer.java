package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.compat.ImageWriterCompat;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.os.OperationCanceledException;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class ImageAnalysisAbstractAnalyzer implements ImageReaderProxy.OnImageAvailableListener {
    private static final RectF NORMALIZED_RECT = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);
    private static final String TAG = "ImageAnalysisAnalyzer";
    private volatile boolean mOnePixelShiftEnabled;
    private volatile boolean mOutputImageRotationEnabled;
    private volatile int mPrevBufferRotationDegrees;
    private SafeCloseImageReaderProxy mProcessedImageReaderProxy;
    private ImageWriter mProcessedImageWriter;
    ByteBuffer mRGBConvertedBuffer;
    private volatile int mRelativeRotation;
    private ImageAnalysis.Analyzer mSubscribedAnalyzer;
    ByteBuffer mURotatedBuffer;
    private Executor mUserExecutor;
    ByteBuffer mVRotatedBuffer;
    ByteBuffer mYRotatedBuffer;
    private volatile int mOutputImageFormat = 1;
    private Rect mOriginalViewPortCropRect = new Rect();
    private Rect mUpdatedViewPortCropRect = new Rect();
    private Matrix mOriginalSensorToBufferTransformMatrix = new Matrix();
    private Matrix mUpdatedSensorToBufferTransformMatrix = new Matrix();
    private final Object mAnalyzerLock = new Object();
    protected boolean mIsAttached = true;

    abstract ImageProxy acquireImage(ImageReaderProxy imageReaderProxy);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void clearCache();

    abstract void onValidImageAvailable(ImageProxy imageProxy);

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy acquireImage = acquireImage(imageReaderProxy);
            if (acquireImage != null) {
                onValidImageAvailable(acquireImage);
            }
        } catch (IllegalStateException e) {
            Logger.e(TAG, "Failed to acquire image.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ListenableFuture<Void> analyzeImage(final ImageProxy imageProxy) {
        final Executor executor;
        final ImageAnalysis.Analyzer analyzer;
        boolean z;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        ImageProxy imageProxy2;
        int i = this.mOutputImageRotationEnabled ? this.mRelativeRotation : 0;
        synchronized (this.mAnalyzerLock) {
            executor = this.mUserExecutor;
            analyzer = this.mSubscribedAnalyzer;
            z = this.mOutputImageRotationEnabled && i != this.mPrevBufferRotationDegrees;
            if (z) {
                recreateImageReaderProxy(imageProxy, i);
            }
            if (this.mOutputImageRotationEnabled) {
                createHelperBuffer(imageProxy);
            }
            safeCloseImageReaderProxy = this.mProcessedImageReaderProxy;
            imageWriter = this.mProcessedImageWriter;
            byteBuffer = this.mRGBConvertedBuffer;
            byteBuffer2 = this.mYRotatedBuffer;
            byteBuffer3 = this.mURotatedBuffer;
            byteBuffer4 = this.mVRotatedBuffer;
        }
        if (analyzer != null && executor != null && this.mIsAttached) {
            if (safeCloseImageReaderProxy != null) {
                if (this.mOutputImageFormat == 2) {
                    imageProxy2 = ImageProcessingUtil.convertYUVToRGB(imageProxy, safeCloseImageReaderProxy, byteBuffer, i, this.mOnePixelShiftEnabled);
                } else if (this.mOutputImageFormat == 1) {
                    if (this.mOnePixelShiftEnabled) {
                        ImageProcessingUtil.applyPixelShiftForYUV(imageProxy);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        imageProxy2 = ImageProcessingUtil.rotateYUV(imageProxy, safeCloseImageReaderProxy, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                boolean z2 = imageProxy2 == null;
                final ImageProxy imageProxy3 = !z2 ? imageProxy : imageProxy2;
                final Rect rect = new Rect();
                final Matrix matrix = new Matrix();
                synchronized (this.mAnalyzerLock) {
                    if (z && !z2) {
                        recalculateTransformMatrixAndCropRect(imageProxy.getWidth(), imageProxy.getHeight(), imageProxy3.getWidth(), imageProxy3.getHeight());
                    }
                    this.mPrevBufferRotationDegrees = i;
                    rect.set(this.mUpdatedViewPortCropRect);
                    matrix.set(this.mUpdatedSensorToBufferTransformMatrix);
                }
                return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.ImageAnalysisAbstractAnalyzer$$ExternalSyntheticLambda0
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                        return ImageAnalysisAbstractAnalyzer.this.m148x9959ff20(executor, imageProxy, matrix, imageProxy3, rect, analyzer, completer);
                    }
                });
            }
            imageProxy2 = null;
            if (imageProxy2 == null) {
            }
            if (!z2) {
            }
            final Rect rect2 = new Rect();
            final Matrix matrix2 = new Matrix();
            synchronized (this.mAnalyzerLock) {
            }
        } else {
            return Futures.immediateFailedFuture(new OperationCanceledException("No analyzer or executor currently set."));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$analyzeImage$1$androidx-camera-core-ImageAnalysisAbstractAnalyzer  reason: not valid java name */
    public /* synthetic */ Object m148x9959ff20(Executor executor, final ImageProxy imageProxy, final Matrix matrix, final ImageProxy imageProxy2, final Rect rect, final ImageAnalysis.Analyzer analyzer, final CallbackToFutureAdapter.Completer completer) throws Exception {
        executor.execute(new Runnable() { // from class: androidx.camera.core.ImageAnalysisAbstractAnalyzer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ImageAnalysisAbstractAnalyzer.this.m147x6b8164c1(imageProxy, matrix, imageProxy2, rect, analyzer, completer);
            }
        });
        return "analyzeImage";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$analyzeImage$0$androidx-camera-core-ImageAnalysisAbstractAnalyzer  reason: not valid java name */
    public /* synthetic */ void m147x6b8164c1(ImageProxy imageProxy, Matrix matrix, ImageProxy imageProxy2, Rect rect, ImageAnalysis.Analyzer analyzer, CallbackToFutureAdapter.Completer completer) {
        if (this.mIsAttached) {
            SettableImageProxy settableImageProxy = new SettableImageProxy(imageProxy2, ImmutableImageInfo.create(imageProxy.getImageInfo().getTagBundle(), imageProxy.getImageInfo().getTimestamp(), this.mOutputImageRotationEnabled ? 0 : this.mRelativeRotation, matrix));
            if (!rect.isEmpty()) {
                settableImageProxy.setCropRect(rect);
            }
            analyzer.analyze(settableImageProxy);
            completer.set(null);
            return;
        }
        completer.setException(new OperationCanceledException("ImageAnalysis is detached"));
    }

    private static SafeCloseImageReaderProxy createImageReaderProxy(int i, int i2, int i3, int i4, int i5) {
        boolean z = i3 == 90 || i3 == 270;
        int i6 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        return new SafeCloseImageReaderProxy(ImageReaderProxys.createIsolatedReader(i6, i, i4, i5));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRelativeRotation(int i) {
        this.mRelativeRotation = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOutputImageRotationEnabled(boolean z) {
        this.mOutputImageRotationEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOutputImageFormat(int i) {
        this.mOutputImageFormat = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnePixelShiftEnabled(boolean z) {
        this.mOnePixelShiftEnabled = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setViewPortCropRect(Rect rect) {
        synchronized (this.mAnalyzerLock) {
            this.mOriginalViewPortCropRect = rect;
            this.mUpdatedViewPortCropRect = new Rect(this.mOriginalViewPortCropRect);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSensorToBufferTransformMatrix(Matrix matrix) {
        synchronized (this.mAnalyzerLock) {
            this.mOriginalSensorToBufferTransformMatrix = matrix;
            this.mUpdatedSensorToBufferTransformMatrix = new Matrix(this.mOriginalSensorToBufferTransformMatrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setProcessedImageReaderProxy(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        synchronized (this.mAnalyzerLock) {
            this.mProcessedImageReaderProxy = safeCloseImageReaderProxy;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setAnalyzer(Executor executor, ImageAnalysis.Analyzer analyzer) {
        synchronized (this.mAnalyzerLock) {
            if (analyzer == null) {
                clearCache();
            }
            this.mSubscribedAnalyzer = analyzer;
            this.mUserExecutor = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void attach() {
        this.mIsAttached = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void detach() {
        this.mIsAttached = false;
        clearCache();
    }

    private void createHelperBuffer(ImageProxy imageProxy) {
        if (this.mOutputImageFormat == 1) {
            if (this.mYRotatedBuffer == null) {
                this.mYRotatedBuffer = ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight());
            }
            this.mYRotatedBuffer.position(0);
            if (this.mURotatedBuffer == null) {
                this.mURotatedBuffer = ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
            }
            this.mURotatedBuffer.position(0);
            if (this.mVRotatedBuffer == null) {
                this.mVRotatedBuffer = ByteBuffer.allocateDirect((imageProxy.getWidth() * imageProxy.getHeight()) / 4);
            }
            this.mVRotatedBuffer.position(0);
        } else if (this.mOutputImageFormat == 2 && this.mRGBConvertedBuffer == null) {
            this.mRGBConvertedBuffer = ByteBuffer.allocateDirect(imageProxy.getWidth() * imageProxy.getHeight() * 4);
        }
    }

    private void recreateImageReaderProxy(ImageProxy imageProxy, int i) {
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mProcessedImageReaderProxy;
        if (safeCloseImageReaderProxy == null) {
            return;
        }
        safeCloseImageReaderProxy.safeClose();
        this.mProcessedImageReaderProxy = createImageReaderProxy(imageProxy.getWidth(), imageProxy.getHeight(), i, this.mProcessedImageReaderProxy.getImageFormat(), this.mProcessedImageReaderProxy.getMaxImages());
        if (this.mOutputImageFormat == 1) {
            ImageWriter imageWriter = this.mProcessedImageWriter;
            if (imageWriter != null) {
                ImageWriterCompat.close(imageWriter);
            }
            this.mProcessedImageWriter = ImageWriterCompat.newInstance(this.mProcessedImageReaderProxy.getSurface(), this.mProcessedImageReaderProxy.getMaxImages());
        }
    }

    private void recalculateTransformMatrixAndCropRect(int i, int i2, int i3, int i4) {
        Matrix additionalTransformMatrixAppliedByProcessor = getAdditionalTransformMatrixAppliedByProcessor(i, i2, i3, i4, this.mRelativeRotation);
        this.mUpdatedViewPortCropRect = getUpdatedCropRect(this.mOriginalViewPortCropRect, additionalTransformMatrixAppliedByProcessor);
        this.mUpdatedSensorToBufferTransformMatrix.setConcat(this.mOriginalSensorToBufferTransformMatrix, additionalTransformMatrixAppliedByProcessor);
    }

    static Rect getUpdatedCropRect(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    static Matrix getAdditionalTransformMatrixAppliedByProcessor(int i, int i2, int i3, int i4, int i5) {
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i, i2), NORMALIZED_RECT, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i5);
            matrix.postConcat(getNormalizedToBuffer(new RectF(0.0f, 0.0f, i3, i4)));
        }
        return matrix;
    }

    private static Matrix getNormalizedToBuffer(RectF rectF) {
        Matrix matrix = new Matrix();
        matrix.setRectToRect(NORMALIZED_RECT, rectF, Matrix.ScaleToFit.FILL);
        return matrix;
    }
}
