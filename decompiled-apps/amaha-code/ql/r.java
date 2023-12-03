package ql;

import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
/* compiled from: MusicServiceConnection.kt */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final PlaybackStateCompat f29777a = new PlaybackStateCompat(0, 0, 0, 0.0f, 0, 0, null, SystemClock.elapsedRealtime(), new ArrayList(), -1, null);

    /* renamed from: b  reason: collision with root package name */
    public static final MediaMetadataCompat f29778b;

    static {
        MediaMetadataCompat.b bVar = new MediaMetadataCompat.b();
        bVar.d("android.media.metadata.MEDIA_ID", "");
        bVar.c(0L, "android.media.metadata.DURATION");
        f29778b = bVar.a();
    }
}
