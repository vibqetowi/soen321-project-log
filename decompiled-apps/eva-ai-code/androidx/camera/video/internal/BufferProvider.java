package androidx.camera.video.internal;

import androidx.camera.core.impl.Observable;
import com.google.common.util.concurrent.ListenableFuture;
/* loaded from: classes.dex */
public interface BufferProvider<T> extends Observable<State> {

    /* loaded from: classes.dex */
    public enum State {
        ACTIVE,
        INACTIVE
    }

    ListenableFuture<T> acquireBuffer();
}
