package androidx.camera.video;

import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class StreamInfo {
    static final int STREAM_ID_ANY = 0;
    static final int STREAM_ID_ERROR = -1;
    static final StreamInfo STREAM_INFO_ANY_INACTIVE = of(0, StreamState.INACTIVE);
    static final Set<Integer> NON_SURFACE_STREAM_ID = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    static final Observable<StreamInfo> ALWAYS_ACTIVE_OBSERVABLE = ConstantObservable.withValue(of(0, StreamState.ACTIVE));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum StreamState {
        ACTIVE,
        INACTIVE
    }

    public abstract int getId();

    public abstract StreamState getStreamState();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static StreamInfo of(int i, StreamState streamState) {
        return new AutoValue_StreamInfo(i, streamState);
    }
}
