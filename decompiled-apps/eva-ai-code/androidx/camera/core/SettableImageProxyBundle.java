package androidx.camera.core;

import android.util.SparseArray;
import androidx.camera.core.impl.ImageProxyBundle;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class SettableImageProxyBundle implements ImageProxyBundle {
    private final List<Integer> mCaptureIdList;
    private String mTagBundleKey;
    final Object mLock = new Object();
    final SparseArray<CallbackToFutureAdapter.Completer<ImageProxy>> mCompleters = new SparseArray<>();
    private final SparseArray<ListenableFuture<ImageProxy>> mFutureResults = new SparseArray<>();
    private final List<ImageProxy> mOwnedImageProxies = new ArrayList();
    private boolean mClosed = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SettableImageProxyBundle(List<Integer> list, String str) {
        this.mCaptureIdList = list;
        this.mTagBundleKey = str;
        setup();
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    public ListenableFuture<ImageProxy> getImageProxy(int i) {
        ListenableFuture<ImageProxy> listenableFuture;
        synchronized (this.mLock) {
            if (this.mClosed) {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
            listenableFuture = this.mFutureResults.get(i);
            if (listenableFuture == null) {
                throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i);
            }
        }
        return listenableFuture;
    }

    @Override // androidx.camera.core.impl.ImageProxyBundle
    public List<Integer> getCaptureIds() {
        return Collections.unmodifiableList(this.mCaptureIdList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void addImageProxy(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            Integer num = (Integer) imageProxy.getImageInfo().getTagBundle().getTag(this.mTagBundleKey);
            if (num == null) {
                throw new IllegalArgumentException("CaptureId is null.");
            }
            CallbackToFutureAdapter.Completer<ImageProxy> completer = this.mCompleters.get(num.intValue());
            if (completer != null) {
                this.mOwnedImageProxies.add(imageProxy);
                completer.set(imageProxy);
                return;
            }
            throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void close() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            for (ImageProxy imageProxy : this.mOwnedImageProxies) {
                imageProxy.close();
            }
            this.mOwnedImageProxies.clear();
            this.mFutureResults.clear();
            this.mCompleters.clear();
            this.mClosed = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void reset() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                return;
            }
            for (ImageProxy imageProxy : this.mOwnedImageProxies) {
                imageProxy.close();
            }
            this.mOwnedImageProxies.clear();
            this.mFutureResults.clear();
            this.mCompleters.clear();
            setup();
        }
    }

    private void setup() {
        synchronized (this.mLock) {
            for (Integer num : this.mCaptureIdList) {
                final int intValue = num.intValue();
                this.mFutureResults.put(intValue, CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver<ImageProxy>() { // from class: androidx.camera.core.SettableImageProxyBundle.1
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public Object attachCompleter(CallbackToFutureAdapter.Completer<ImageProxy> completer) {
                        synchronized (SettableImageProxyBundle.this.mLock) {
                            SettableImageProxyBundle.this.mCompleters.put(intValue, completer);
                        }
                        return "getImageProxy(id: " + intValue + ")";
                    }
                }));
            }
        }
    }
}
