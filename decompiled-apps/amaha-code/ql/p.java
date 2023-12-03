package ql;

import android.support.v4.media.MediaMetadataCompat;
import java.util.Comparator;
/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class p<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t3, T t10) {
        return sp.b.g(Long.valueOf(((MediaMetadataCompat) t3).c("android.media.metadata.TRACK_NUMBER")), Long.valueOf(((MediaMetadataCompat) t10).c("android.media.metadata.TRACK_NUMBER")));
    }
}
