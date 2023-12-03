package android.support.v4.media.session;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import f0.j;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a  reason: collision with root package name */
    public final MediaControllerImplApi21 f861a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<a, Boolean> f862b = new ConcurrentHashMap<>();

    /* loaded from: classes.dex */
    public static class MediaControllerImplApi21 {

        /* renamed from: a  reason: collision with root package name */
        public final MediaController f863a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f864b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f865c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final HashMap<a, a> f866d = new HashMap<>();

        /* renamed from: e  reason: collision with root package name */
        public final MediaSessionCompat.Token f867e;

        /* loaded from: classes.dex */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: u  reason: collision with root package name */
            public final WeakReference<MediaControllerImplApi21> f868u;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f868u = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i6, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f868u.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f864b) {
                        mediaControllerImplApi21.f867e.b(b.a.v(j.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        MediaSessionCompat.Token token = mediaControllerImplApi21.f867e;
                        j2.c cVar = null;
                        try {
                            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                            if (bundle2 != null) {
                                bundle2.setClassLoader(j2.a.class.getClassLoader());
                                Parcelable parcelable = bundle2.getParcelable("a");
                                if (parcelable instanceof ParcelImpl) {
                                    cVar = ((ParcelImpl) parcelable).f3083u;
                                } else {
                                    throw new IllegalArgumentException("Invalid parcel");
                                }
                            }
                        } catch (RuntimeException unused) {
                        }
                        token.c(cVar);
                        mediaControllerImplApi21.a();
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public static class a extends a.c {
            public a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.a
            public final void M0(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void Q0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void Q1(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void S0(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void e0(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.a
            public final void g0(ArrayList arrayList) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f867e = token;
            MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f887v);
            this.f863a = mediaController;
            if (token.a() == null) {
                mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
            }
        }

        public final void a() {
            MediaSessionCompat.Token token = this.f867e;
            if (token.a() == null) {
                return;
            }
            ArrayList arrayList = this.f865c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                a aVar2 = new a(aVar);
                this.f866d.put(aVar, aVar2);
                aVar.f871c = aVar2;
                try {
                    token.a().H(aVar2);
                    aVar.f(13, null, null);
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                }
            }
            arrayList.clear();
        }

        public final void b(a aVar) {
            this.f863a.unregisterCallback(aVar.f869a);
            synchronized (this.f864b) {
                if (this.f867e.a() != null) {
                    try {
                        a remove = this.f866d.remove(aVar);
                        if (remove != null) {
                            aVar.f871c = null;
                            this.f867e.a().u0(remove);
                        }
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e10);
                    }
                } else {
                    this.f865c.remove(aVar);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends MediaControllerImplApi21 {
        public b(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public c() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {
    }

    /* loaded from: classes.dex */
    public static class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public final MediaController.TransportControls f876a;

        public e(MediaController.TransportControls transportControls) {
            this.f876a = transportControls;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends e {
        public f(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {
        public g(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public h(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token token = mediaSessionCompat.f879a.f898b;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f861a = new b(context, token);
                return;
            } else {
                this.f861a = new MediaControllerImplApi21(context, token);
                return;
            }
        }
        throw new IllegalArgumentException("session must not be null");
    }

    public final MediaMetadataCompat a() {
        MediaMetadata metadata = this.f861a.f863a.getMetadata();
        if (metadata != null) {
            return MediaMetadataCompat.a(metadata);
        }
        return null;
    }

    public final PlaybackStateCompat b() {
        MediaControllerImplApi21 mediaControllerImplApi21 = this.f861a;
        MediaSessionCompat.Token token = mediaControllerImplApi21.f867e;
        if (token.a() != null) {
            try {
                return token.a().p();
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e10);
            }
        }
        PlaybackState playbackState = mediaControllerImplApi21.f863a.getPlaybackState();
        if (playbackState != null) {
            return PlaybackStateCompat.a(playbackState);
        }
        return null;
    }

    public final e c() {
        MediaController.TransportControls transportControls = this.f861a.f863a.getTransportControls();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            return new h(transportControls);
        }
        if (i6 >= 24) {
            return new g(transportControls);
        }
        if (i6 >= 23) {
            return new f(transportControls);
        }
        return new e(transportControls);
    }

    public final void d(a aVar) {
        if (aVar != null) {
            if (this.f862b.putIfAbsent(aVar, Boolean.TRUE) != null) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            aVar.g(handler);
            MediaControllerImplApi21 mediaControllerImplApi21 = this.f861a;
            mediaControllerImplApi21.f863a.registerCallback(aVar.f869a, handler);
            synchronized (mediaControllerImplApi21.f864b) {
                if (mediaControllerImplApi21.f867e.a() != null) {
                    MediaControllerImplApi21.a aVar2 = new MediaControllerImplApi21.a(aVar);
                    mediaControllerImplApi21.f866d.put(aVar, aVar2);
                    aVar.f871c = aVar2;
                    try {
                        mediaControllerImplApi21.f867e.a().H(aVar2);
                        aVar.f(13, null, null);
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                    }
                } else {
                    aVar.f871c = null;
                    mediaControllerImplApi21.f865c.add(aVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public final void e(a aVar) {
        if (aVar != null) {
            if (this.f862b.remove(aVar) == null) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                this.f861a.b(aVar);
                return;
            } finally {
                aVar.g(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f861a = new MediaControllerImplApi21(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    /* loaded from: classes.dex */
    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final C0014a f869a = new C0014a(this);

        /* renamed from: b  reason: collision with root package name */
        public b f870b;

        /* renamed from: c  reason: collision with root package name */
        public MediaControllerImplApi21.a f871c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0014a extends MediaController.Callback {

            /* renamed from: a  reason: collision with root package name */
            public final WeakReference<a> f872a;

            public C0014a(a aVar) {
                this.f872a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public final void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                if (this.f872a.get() != null) {
                    playbackInfo.getPlaybackType();
                    playbackInfo.getAudioAttributes();
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    playbackInfo.getVolumeControl();
                    playbackInfo.getMaxVolume();
                    playbackInfo.getCurrentVolume();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                this.f872a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = this.f872a.get();
                if (aVar != null) {
                    aVar.a(MediaMetadataCompat.a(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = this.f872a.get();
                if (aVar != null && aVar.f871c == null) {
                    aVar.b(PlaybackStateCompat.a(playbackState));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueChanged(List<MediaSession.QueueItem> list) {
                a aVar = this.f872a.get();
                if (aVar != null) {
                    MediaSessionCompat.QueueItem.a(list);
                    aVar.c();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onQueueTitleChanged(CharSequence charSequence) {
                this.f872a.get();
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionDestroyed() {
                a aVar = this.f872a.get();
                if (aVar != null) {
                    aVar.d();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public final void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = this.f872a.get();
                if (aVar != null) {
                    if (aVar.f871c == null || Build.VERSION.SDK_INT >= 23) {
                        aVar.e(str);
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        public class b extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public boolean f873a;

            public b(Looper looper) {
                super(looper);
                this.f873a = false;
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (!this.f873a) {
                    return;
                }
                int i6 = message.what;
                a aVar = a.this;
                switch (i6) {
                    case 1:
                        MediaSessionCompat.a(message.getData());
                        aVar.e((String) message.obj);
                        return;
                    case 2:
                        aVar.b((PlaybackStateCompat) message.obj);
                        return;
                    case 3:
                        aVar.a((MediaMetadataCompat) message.obj);
                        return;
                    case 4:
                        c cVar = (c) message.obj;
                        aVar.getClass();
                        return;
                    case 5:
                        List list = (List) message.obj;
                        aVar.c();
                        return;
                    case 6:
                        CharSequence charSequence = (CharSequence) message.obj;
                        aVar.getClass();
                        return;
                    case 7:
                        MediaSessionCompat.a((Bundle) message.obj);
                        aVar.getClass();
                        return;
                    case 8:
                        aVar.d();
                        return;
                    case 9:
                        ((Integer) message.obj).intValue();
                        aVar.getClass();
                        return;
                    case 10:
                    default:
                        return;
                    case 11:
                        ((Boolean) message.obj).booleanValue();
                        aVar.getClass();
                        return;
                    case 12:
                        ((Integer) message.obj).intValue();
                        aVar.getClass();
                        return;
                    case 13:
                        aVar.getClass();
                        return;
                }
            }
        }

        /* loaded from: classes.dex */
        public static class c extends a.AbstractBinderC0016a {

            /* renamed from: b  reason: collision with root package name */
            public final WeakReference<a> f875b;

            public c(a aVar) {
                this.f875b = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.a
            public final void A(Bundle bundle, String str) {
                a aVar = this.f875b.get();
                if (aVar != null) {
                    aVar.f(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.a
            public final void M1(PlaybackStateCompat playbackStateCompat) {
                a aVar = this.f875b.get();
                if (aVar != null) {
                    aVar.f(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public final void h1(int i6) {
                a aVar = this.f875b.get();
                if (aVar != null) {
                    aVar.f(12, Integer.valueOf(i6), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public final void y(int i6) {
                a aVar = this.f875b.get();
                if (aVar != null) {
                    aVar.f(9, Integer.valueOf(i6), null);
                }
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            f(8, null, null);
        }

        public final void f(int i6, Object obj, Bundle bundle) {
            b bVar = this.f870b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i6, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public final void g(Handler handler) {
            if (handler == null) {
                b bVar = this.f870b;
                if (bVar != null) {
                    bVar.f873a = false;
                    bVar.removeCallbacksAndMessages(null);
                    this.f870b = null;
                    return;
                }
                return;
            }
            b bVar2 = new b(handler.getLooper());
            this.f870b = bVar2;
            bVar2.f873a = true;
        }

        public void c() {
        }

        public void d() {
        }

        public void a(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void b(PlaybackStateCompat playbackStateCompat) {
        }

        public void e(String str) {
        }
    }
}
