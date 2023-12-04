package androidx.camera.core;
/* loaded from: classes.dex */
final class SingleCloseImageProxy extends ForwardingImageProxy {
    private boolean mClosed;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleCloseImageProxy(ImageProxy imageProxy) {
        super(imageProxy);
        this.mClosed = false;
    }

    @Override // androidx.camera.core.ForwardingImageProxy, androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.mClosed) {
            this.mClosed = true;
            super.close();
        }
    }
}
