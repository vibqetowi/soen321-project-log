package ql;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaSession;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
/* compiled from: MusicServiceConnection.kt */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: i  reason: collision with root package name */
    public static final a f29765i = new a();

    /* renamed from: j  reason: collision with root package name */
    public static volatile q f29766j;

    /* renamed from: a  reason: collision with root package name */
    public final androidx.lifecycle.w<Boolean> f29767a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.w<Boolean> f29768b;

    /* renamed from: c  reason: collision with root package name */
    public final androidx.lifecycle.w<g0> f29769c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.lifecycle.w<PlaybackStateCompat> f29770d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.lifecycle.w<MediaMetadataCompat> f29771e;
    public final b f;

    /* renamed from: g  reason: collision with root package name */
    public final MediaBrowserCompat f29772g;

    /* renamed from: h  reason: collision with root package name */
    public MediaControllerCompat f29773h;

    /* compiled from: MusicServiceConnection.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: MusicServiceConnection.kt */
    /* loaded from: classes2.dex */
    public final class b extends MediaBrowserCompat.c {

        /* renamed from: c  reason: collision with root package name */
        public final Context f29774c;

        public b(Context context) {
            this.f29774c = context;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public final void a() {
            q qVar = q.this;
            MediaBrowserCompat.e eVar = qVar.f29772g.f820a;
            if (eVar.f835i == null) {
                MediaSession.Token sessionToken = eVar.f829b.getSessionToken();
                MediaSessionCompat.Token token = null;
                if (sessionToken != null) {
                    token = new MediaSessionCompat.Token(sessionToken, null);
                }
                eVar.f835i = token;
            }
            MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(this.f29774c, eVar.f835i);
            mediaControllerCompat.d(new c());
            qVar.f29773h = mediaControllerCompat;
            qVar.f29767a.i(Boolean.TRUE);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public final void b() {
            q.this.f29767a.i(Boolean.FALSE);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public final void c() {
            q.this.f29767a.i(Boolean.FALSE);
        }
    }

    public q(Context context, ComponentName componentName) {
        androidx.lifecycle.w<Boolean> wVar = new androidx.lifecycle.w<>();
        Boolean bool = Boolean.FALSE;
        wVar.i(bool);
        this.f29767a = wVar;
        androidx.lifecycle.w<Boolean> wVar2 = new androidx.lifecycle.w<>();
        wVar2.i(bool);
        this.f29768b = wVar2;
        androidx.lifecycle.w<g0> wVar3 = new androidx.lifecycle.w<>();
        wVar3.i(g0.NO_ERROR);
        this.f29769c = wVar3;
        androidx.lifecycle.w<PlaybackStateCompat> wVar4 = new androidx.lifecycle.w<>();
        wVar4.i(r.f29777a);
        this.f29770d = wVar4;
        androidx.lifecycle.w<MediaMetadataCompat> wVar5 = new androidx.lifecycle.w<>();
        wVar5.i(r.f29778b);
        this.f29771e = wVar5;
        b bVar = new b(context);
        this.f = bVar;
        MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(context, componentName, bVar);
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        mediaBrowserCompat.f820a.f829b.connect();
        this.f29772g = mediaBrowserCompat;
    }

    public final MediaControllerCompat.e a() {
        MediaControllerCompat mediaControllerCompat = this.f29773h;
        if (mediaControllerCompat != null) {
            return mediaControllerCompat.c();
        }
        kotlin.jvm.internal.i.q("mediaController");
        throw null;
    }

    /* compiled from: MusicServiceConnection.kt */
    /* loaded from: classes2.dex */
    public final class c extends MediaControllerCompat.a {
        public c() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void a(MediaMetadataCompat mediaMetadataCompat) {
            String str;
            androidx.lifecycle.w<MediaMetadataCompat> wVar = q.this.f29771e;
            if (mediaMetadataCompat != null) {
                str = mediaMetadataCompat.d("android.media.metadata.MEDIA_ID");
            } else {
                str = null;
            }
            if (str == null) {
                mediaMetadataCompat = r.f29778b;
            }
            wVar.i(mediaMetadataCompat);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void b(PlaybackStateCompat playbackStateCompat) {
            androidx.lifecycle.w<PlaybackStateCompat> wVar = q.this.f29770d;
            if (playbackStateCompat == null) {
                playbackStateCompat = r.f29777a;
            }
            wVar.i(playbackStateCompat);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void d() {
            q.this.f.c();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void e(String str) {
            if (str != null) {
                int hashCode = str.hashCode();
                q qVar = q.this;
                if (hashCode != -1909666639) {
                    if (hashCode != -1630620553) {
                        if (hashCode == -1337393617 && str.equals("com.theinnerhour.b2b.test.GENERIC")) {
                            qVar.f29769c.i(g0.GENERIC);
                        }
                    } else if (str.equals("com.theinnerhour.b2b.test.NO_INTERNET")) {
                        qVar.f29769c.i(g0.NO_INTERNET);
                    }
                } else if (str.equals("com.theinnerhour.b2b.test.NETWORK_FAILURE")) {
                    qVar.f29768b.i(Boolean.TRUE);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void c() {
        }
    }
}
