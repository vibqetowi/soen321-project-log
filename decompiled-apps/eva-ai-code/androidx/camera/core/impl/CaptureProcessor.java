package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
/* loaded from: classes.dex */
public interface CaptureProcessor {
    void close();

    ListenableFuture<Void> getCloseFuture();

    void onOutputSurface(Surface surface, int i);

    void onResolutionUpdate(Size size);

    void process(ImageProxyBundle imageProxyBundle);

    /* renamed from: androidx.camera.core.impl.CaptureProcessor$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static void $default$close(CaptureProcessor _this) {
        }
    }
}
