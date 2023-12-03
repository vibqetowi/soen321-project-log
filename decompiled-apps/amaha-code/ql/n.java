package ql;

import android.net.Uri;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import ql.i;
/* compiled from: MainAudioViewModel.kt */
/* loaded from: classes2.dex */
public final class n extends l0 {
    public final q A;
    public final b B;

    /* renamed from: x  reason: collision with root package name */
    public final String f29754x;

    /* renamed from: y  reason: collision with root package name */
    public final m f29755y;

    /* renamed from: z  reason: collision with root package name */
    public final m f29756z;

    /* compiled from: MainAudioViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends o0.c {

        /* renamed from: b  reason: collision with root package name */
        public final String f29757b = Constants.AUDIO_MEDIA_ID;

        /* renamed from: c  reason: collision with root package name */
        public final q f29758c;

        public a(q qVar) {
            this.f29758c = qVar;
        }

        @Override // androidx.lifecycle.o0.c, androidx.lifecycle.o0.b
        public final <T extends l0> T a(Class<T> cls) {
            return new n(this.f29758c, this.f29757b);
        }
    }

    /* compiled from: MainAudioViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends MediaBrowserCompat.k {
        @Override // android.support.v4.media.MediaBrowserCompat.k
        public final void a(String parentId, ArrayList children) {
            boolean z10;
            kotlin.jvm.internal.i.g(parentId, "parentId");
            kotlin.jvm.internal.i.g(children, "children");
            ArrayList arrayList = new ArrayList(is.i.H1(children, 10));
            Iterator it = children.iterator();
            while (it.hasNext()) {
                MediaBrowserCompat.MediaItem mediaItem = (MediaBrowserCompat.MediaItem) it.next();
                MediaDescriptionCompat mediaDescriptionCompat = mediaItem.f822v;
                Object obj = mediaDescriptionCompat.f847w;
                if (obj == null) {
                    obj = "";
                }
                String str = mediaDescriptionCompat.f845u;
                kotlin.jvm.internal.i.d(str);
                MediaDescriptionCompat mediaDescriptionCompat2 = mediaItem.f822v;
                Uri uri = mediaDescriptionCompat2.f850z;
                kotlin.jvm.internal.i.d(uri);
                String valueOf = String.valueOf(mediaDescriptionCompat2.f846v);
                String obj2 = obj.toString();
                if ((mediaItem.f821u & 1) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new i.a(str, uri, valueOf, obj2, "90", z10));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.x, ql.m] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.x, ql.m] */
    public n(final q musicServiceConnection, String mediaId) {
        kotlin.jvm.internal.i.g(musicServiceConnection, "musicServiceConnection");
        kotlin.jvm.internal.i.g(mediaId, "mediaId");
        this.f29754x = mediaId;
        ?? r42 = new androidx.lifecycle.x() { // from class: ql.m
            @Override // androidx.lifecycle.x
            public final void a(Object obj) {
                int i6 = r2;
                q musicServiceConnection2 = musicServiceConnection;
                switch (i6) {
                    case 0:
                        PlaybackStateCompat playbackStateCompat = (PlaybackStateCompat) obj;
                        kotlin.jvm.internal.i.g(musicServiceConnection2, "$musicServiceConnection");
                        if (playbackStateCompat == null) {
                            PlaybackStateCompat playbackStateCompat2 = r.f29777a;
                        }
                        MediaMetadataCompat d10 = musicServiceConnection2.f29771e.d();
                        if (d10 == null) {
                            d10 = r.f29778b;
                        }
                        kotlin.jvm.internal.i.f(d10, "musicServiceConnection.n….value ?: NOTHING_PLAYING");
                        return;
                    default:
                        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) obj;
                        kotlin.jvm.internal.i.g(musicServiceConnection2, "$musicServiceConnection");
                        PlaybackStateCompat d11 = musicServiceConnection2.f29770d.d();
                        if (d11 == null) {
                            d11 = r.f29777a;
                        }
                        kotlin.jvm.internal.i.f(d11, "musicServiceConnection.p…e ?: EMPTY_PLAYBACK_STATE");
                        if (mediaMetadataCompat == null) {
                            PlaybackStateCompat playbackStateCompat3 = r.f29777a;
                            return;
                        }
                        return;
                }
            }
        };
        this.f29755y = r42;
        ?? r02 = new androidx.lifecycle.x() { // from class: ql.m
            @Override // androidx.lifecycle.x
            public final void a(Object obj) {
                int i6 = r2;
                q musicServiceConnection2 = musicServiceConnection;
                switch (i6) {
                    case 0:
                        PlaybackStateCompat playbackStateCompat = (PlaybackStateCompat) obj;
                        kotlin.jvm.internal.i.g(musicServiceConnection2, "$musicServiceConnection");
                        if (playbackStateCompat == null) {
                            PlaybackStateCompat playbackStateCompat2 = r.f29777a;
                        }
                        MediaMetadataCompat d10 = musicServiceConnection2.f29771e.d();
                        if (d10 == null) {
                            d10 = r.f29778b;
                        }
                        kotlin.jvm.internal.i.f(d10, "musicServiceConnection.n….value ?: NOTHING_PLAYING");
                        return;
                    default:
                        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) obj;
                        kotlin.jvm.internal.i.g(musicServiceConnection2, "$musicServiceConnection");
                        PlaybackStateCompat d11 = musicServiceConnection2.f29770d.d();
                        if (d11 == null) {
                            d11 = r.f29777a;
                        }
                        kotlin.jvm.internal.i.f(d11, "musicServiceConnection.p…e ?: EMPTY_PLAYBACK_STATE");
                        if (mediaMetadataCompat == null) {
                            PlaybackStateCompat playbackStateCompat3 = r.f29777a;
                            return;
                        }
                        return;
                }
            }
        };
        this.f29756z = r02;
        musicServiceConnection.f29770d.f(r42);
        musicServiceConnection.f29771e.f(r02);
        this.A = musicServiceConnection;
        this.B = new b();
    }

    @Override // androidx.lifecycle.l0
    public final void c() {
        q qVar = this.A;
        qVar.f29770d.j(this.f29755y);
        qVar.f29771e.j(this.f29756z);
        String parentId = this.f29754x;
        kotlin.jvm.internal.i.g(parentId, "parentId");
        b callback = this.B;
        kotlin.jvm.internal.i.g(callback, "callback");
        MediaBrowserCompat mediaBrowserCompat = qVar.f29772g;
        mediaBrowserCompat.getClass();
        if (!TextUtils.isEmpty(parentId)) {
            mediaBrowserCompat.f820a.e(parentId, callback);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public final void e() {
        q qVar = this.A;
        qVar.getClass();
        String parentId = this.f29754x;
        kotlin.jvm.internal.i.g(parentId, "parentId");
        b callback = this.B;
        kotlin.jvm.internal.i.g(callback, "callback");
        MediaBrowserCompat mediaBrowserCompat = qVar.f29772g;
        mediaBrowserCompat.getClass();
        if (!TextUtils.isEmpty(parentId)) {
            mediaBrowserCompat.f820a.d(parentId, callback);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }
}
