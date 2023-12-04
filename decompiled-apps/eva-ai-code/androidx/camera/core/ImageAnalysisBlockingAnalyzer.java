package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ImageAnalysisBlockingAnalyzer extends ImageAnalysisAbstractAnalyzer {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    public void clearCache() {
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    ImageProxy acquireImage(ImageReaderProxy imageReaderProxy) {
        return imageReaderProxy.acquireNextImage();
    }

    @Override // androidx.camera.core.ImageAnalysisAbstractAnalyzer
    void onValidImageAvailable(final ImageProxy imageProxy) {
        Futures.addCallback(analyzeImage(imageProxy), new FutureCallback<Void>() { // from class: androidx.camera.core.ImageAnalysisBlockingAnalyzer.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r1) {
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th) {
                imageProxy.close();
            }
        }, CameraXExecutors.directExecutor());
    }
}
