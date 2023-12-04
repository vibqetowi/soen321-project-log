package androidx.camera.extensions.internal;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.impl.Camera2CameraCaptureResultConverter;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureProcessor;
import androidx.camera.core.impl.ImageProxyBundle;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.extensions.impl.CaptureProcessorImpl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class AdaptingCaptureProcessor implements CaptureProcessor {
    private final CaptureProcessorImpl mImpl;

    @Override // androidx.camera.core.impl.CaptureProcessor
    public /* synthetic */ void close() {
        CaptureProcessor.CC.$default$close(this);
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public /* synthetic */ ListenableFuture getCloseFuture() {
        ListenableFuture immediateFuture;
        immediateFuture = Futures.immediateFuture(null);
        return immediateFuture;
    }

    public AdaptingCaptureProcessor(CaptureProcessorImpl captureProcessorImpl) {
        this.mImpl = captureProcessorImpl;
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void onOutputSurface(Surface surface, int i) {
        this.mImpl.onOutputSurface(surface, i);
        this.mImpl.onImageFormatUpdate(i);
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void process(ImageProxyBundle imageProxyBundle) {
        CameraCaptureResult retrieveCameraCaptureResult;
        CaptureResult captureResult;
        TotalCaptureResult totalCaptureResult;
        List<Integer> captureIds = imageProxyBundle.getCaptureIds();
        HashMap hashMap = new HashMap();
        for (Integer num : captureIds) {
            try {
                ImageProxy imageProxy = imageProxyBundle.getImageProxy(num.intValue()).get(5L, TimeUnit.SECONDS);
                if (imageProxy.getImage() == null || (retrieveCameraCaptureResult = CameraCaptureResults.retrieveCameraCaptureResult(imageProxy.getImageInfo())) == null || (captureResult = Camera2CameraCaptureResultConverter.getCaptureResult(retrieveCameraCaptureResult)) == null || (totalCaptureResult = (TotalCaptureResult) captureResult) == null) {
                    return;
                }
                hashMap.put(num, new Pair(imageProxy.getImage(), totalCaptureResult));
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                return;
            }
        }
        this.mImpl.process(hashMap);
    }

    @Override // androidx.camera.core.impl.CaptureProcessor
    public void onResolutionUpdate(Size size) {
        this.mImpl.onResolutionUpdate(size);
    }
}
