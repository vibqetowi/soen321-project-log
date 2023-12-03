package com.theinnerhour.b2b.components.dynamicActivities.utils;

import a9.f;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.widget.Toast;
import com.appsflyer.R;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import d9.q;
import g0.a;
import gv.n;
import hs.i;
import hs.k;
import is.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.r1;
import ls.f;
import o1.c;
import ql.e0;
import ql.f0;
import ql.o;
import ql.s;
import ss.p;
import t7.a;
import ta.v;
/* compiled from: MusicService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/utils/MusicService;", "Lo1/c;", "<init>", "()V", "a", Constants.ONBOARDING_VARIANT, "c", "d", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public class MusicService extends o1.c {
    public ql.d B;
    public s C;
    public w D;
    public final r1 E;
    public final kotlinx.coroutines.internal.c F;
    public MediaSessionCompat G;
    public t7.a H;
    public List<MediaMetadataCompat> I;
    public int J;
    public e0 K;
    public boolean L;
    public final c M;
    public final i N;
    public final e O;

    /* compiled from: MusicService.kt */
    /* loaded from: classes2.dex */
    public final class b extends t7.b {
        public b(MediaSessionCompat mediaSessionCompat) {
            super(mediaSessionCompat);
        }

        @Override // t7.b
        public final MediaDescriptionCompat n(w player, int i6) {
            kotlin.jvm.internal.i.g(player, "player");
            MusicService musicService = MusicService.this;
            if (i6 < musicService.I.size()) {
                MediaDescriptionCompat b10 = musicService.I.get(i6).b();
                kotlin.jvm.internal.i.f(b10, "currentPlaylistItems[windowIndex].description");
                return b10;
            }
            return new MediaDescriptionCompat(null, null, null, null, null, null, null, null);
        }
    }

    /* compiled from: MusicService.kt */
    /* loaded from: classes2.dex */
    public final class d implements f.d {
        public d() {
        }

        @Override // a9.f.d
        public final void a(int i6, Notification notification, boolean z10) {
            if (z10) {
                MusicService musicService = MusicService.this;
                if (!musicService.L) {
                    Context applicationContext = musicService.getApplicationContext();
                    Intent intent = new Intent(musicService.getApplicationContext(), musicService.getClass());
                    Object obj = g0.a.f16164a;
                    if (Build.VERSION.SDK_INT >= 26) {
                        a.f.b(applicationContext, intent);
                    } else {
                        applicationContext.startService(intent);
                    }
                    musicService.startForeground(i6, notification);
                    musicService.L = true;
                }
            }
        }

        @Override // a9.f.d
        public final void b() {
            MusicService musicService = MusicService.this;
            musicService.stopForeground(true);
            musicService.L = false;
            musicService.stopSelf();
        }
    }

    /* compiled from: MusicService.kt */
    /* loaded from: classes2.dex */
    public static final class e extends BroadcastReceiver {

        /* compiled from: MusicService.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.MusicService$broadcastReceiver$1$onReceive$1", f = "MusicService.kt", l = {R.styleable.AppCompatTheme_seekBarStyle}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends ns.i implements p<d0, ls.d<? super k>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f11115u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ MusicService f11116v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MusicService musicService, ls.d<? super a> dVar) {
                super(2, dVar);
                this.f11116v = musicService;
            }

            @Override // ns.a
            public final ls.d<k> create(Object obj, ls.d<?> dVar) {
                return new a(this.f11116v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
                return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f11115u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    s sVar = this.f11116v.C;
                    if (sVar != null) {
                        this.f11115u = 1;
                        if (sVar.F(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        kotlin.jvm.internal.i.q("mediaSource");
                        throw null;
                    }
                }
                return k.f19476a;
            }
        }

        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Intent launchIntentForPackage;
            Intent launchIntentForPackage2;
            if (intent != null && n.A0(intent.getAction(), Constants.MEDIA_DATA_RECEIVER, false)) {
                Serializable serializableExtra = intent.getSerializableExtra(Constants.MEDIA_RECEIVER_EXTRA);
                kotlin.jvm.internal.i.e(serializableExtra, "null cannot be cast to non-null type com.theinnerhour.b2b.components.dynamicActivities.utils.MediaData");
                MusicService musicService = MusicService.this;
                musicService.getClass();
                musicService.C = new ql.b((o) serializableExtra);
                PendingIntent pendingIntent = null;
                v.H(musicService.F, null, 0, new a(musicService, null), 3);
                Bundle bundleExtra = intent.getBundleExtra(Constants.MEDIA_ANALYTICS_RECEIVER_EXTRA);
                if (musicService.G != null && bundleExtra != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        PackageManager packageManager = musicService.getPackageManager();
                        if (packageManager != null && (launchIntentForPackage2 = packageManager.getLaunchIntentForPackage(musicService.getPackageName())) != null) {
                            launchIntentForPackage2.putExtra(Constants.MEDIA_ANALYTICS_RECEIVER_EXTRA, bundleExtra);
                            pendingIntent = PendingIntent.getActivity(musicService, 0, launchIntentForPackage2, 201326592);
                        }
                    } else {
                        PackageManager packageManager2 = musicService.getPackageManager();
                        if (packageManager2 != null && (launchIntentForPackage = packageManager2.getLaunchIntentForPackage(musicService.getPackageName())) != null) {
                            launchIntentForPackage.putExtra(Constants.MEDIA_ANALYTICS_RECEIVER_EXTRA, bundleExtra);
                            pendingIntent = PendingIntent.getActivity(musicService, 0, launchIntentForPackage, 0);
                        }
                    }
                    musicService.d().f879a.f897a.setSessionActivity(pendingIntent);
                }
            }
        }
    }

    /* compiled from: MusicService.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<a0> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final a0 invoke() {
            MusicService musicService = MusicService.this;
            a0 a10 = new j.b(musicService).a();
            a10.q0(a10.f6187y, true);
            a10.v0();
            if (!a10.E) {
                a10.f6172i.a(true);
            }
            a10.E(musicService.M);
            return a10;
        }
    }

    /* compiled from: MusicService.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dynamicActivities.utils.MusicService$saveRecentSongToStorage$1", f = "MusicService.kt", l = {470}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends ns.i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f11118u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ MediaDescriptionCompat f11120w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f11121x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MediaDescriptionCompat mediaDescriptionCompat, long j10, ls.d<? super g> dVar) {
            super(2, dVar);
            this.f11120w = mediaDescriptionCompat;
            this.f11121x = j10;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new g(this.f11120w, this.f11121x, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((g) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f11118u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                e0 e0Var = MusicService.this.K;
                if (e0Var != null) {
                    MediaDescriptionCompat description = this.f11120w;
                    kotlin.jvm.internal.i.f(description, "description");
                    long j10 = this.f11121x;
                    this.f11118u = 1;
                    Object S = v.S(o0.f23642c, new f0(e0Var, description, j10, null), this);
                    if (S != obj2) {
                        S = k.f19476a;
                    }
                    if (S == obj2) {
                        return obj2;
                    }
                } else {
                    kotlin.jvm.internal.i.q("storage");
                    throw null;
                }
            }
            return k.f19476a;
        }
    }

    public MusicService() {
        r1 a10 = sp.b.a();
        this.E = a10;
        kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
        k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
        k1Var.getClass();
        this.F = h.c(f.a.a(k1Var, a10));
        this.I = is.w.f20676u;
        this.M = new c();
        this.N = sp.b.O(new f());
        this.O = new e();
    }

    @Override // o1.c
    public final c.a b(String clientPackageName) {
        kotlin.jvm.internal.i.g(clientPackageName, "clientPackageName");
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.media.browse.CONTENT_STYLE_SUPPORTED", true);
        bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", 2);
        bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", 1);
        return new c.a(bundle, "@empty@");
    }

    @Override // o1.c
    public final void c(String parentId, c.h<List<MediaBrowserCompat.MediaItem>> hVar) {
        kotlin.jvm.internal.i.g(parentId, "parentId");
        try {
            s sVar = this.C;
            if (sVar != null) {
                ArrayList arrayList = new ArrayList(is.i.H1(sVar, 10));
                for (MediaMetadataCompat mediaMetadataCompat : sVar) {
                    arrayList.add(new MediaBrowserCompat.MediaItem(mediaMetadataCompat.b(), (int) mediaMetadataCompat.c("com.theinnerhour.b2b.METADATA_KEY_FLAGS")));
                }
                hVar.b(u.J2(arrayList));
                w wVar = this.D;
                if (wVar != null) {
                    wVar.z(wVar.h());
                    w wVar2 = this.D;
                    if (wVar2 != null) {
                        wVar2.l();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("currentPlayer");
                        throw null;
                    }
                }
                kotlin.jvm.internal.i.q("currentPlayer");
                throw null;
            }
            d().d("com.theinnerhour.b2b.test.NETWORK_FAILURE");
            hVar.b(u.J2(is.w.f20676u));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e("MusicService", e10);
        }
    }

    public final MediaSessionCompat d() {
        MediaSessionCompat mediaSessionCompat = this.G;
        if (mediaSessionCompat != null) {
            return mediaSessionCompat;
        }
        kotlin.jvm.internal.i.q("mediaSession");
        throw null;
    }

    public final void e(List<MediaMetadataCompat> metadataList, MediaMetadataCompat mediaMetadataCompat, boolean z10, long j10) {
        int indexOf;
        kotlin.jvm.internal.i.g(metadataList, "metadataList");
        if (mediaMetadataCompat == null) {
            indexOf = 0;
        } else {
            indexOf = metadataList.indexOf(mediaMetadataCompat);
        }
        this.I = metadataList;
        w wVar = this.D;
        if (wVar != null) {
            wVar.z(z10);
            w wVar2 = this.D;
            if (wVar2 != null) {
                wVar2.stop();
                w wVar3 = this.D;
                if (wVar3 != null) {
                    ArrayList arrayList = new ArrayList(is.i.H1(metadataList, 10));
                    for (MediaMetadataCompat mediaMetadataCompat2 : metadataList) {
                        arrayList.add(ca.a.x1(mediaMetadataCompat2));
                    }
                    wVar3.g(arrayList, indexOf, j10);
                    w wVar4 = this.D;
                    if (wVar4 != null) {
                        wVar4.l();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("currentPlayer");
                        throw null;
                    }
                }
                kotlin.jvm.internal.i.q("currentPlayer");
                throw null;
            }
            kotlin.jvm.internal.i.q("currentPlayer");
            throw null;
        }
        kotlin.jvm.internal.i.q("currentPlayer");
        throw null;
    }

    public final void f() {
        if (this.I.isEmpty()) {
            return;
        }
        MediaDescriptionCompat b10 = this.I.get(this.J).b();
        w wVar = this.D;
        if (wVar != null) {
            v.H(this.F, null, 0, new g(b10, wVar.getCurrentPosition(), null), 3);
            return;
        }
        kotlin.jvm.internal.i.q("currentPlayer");
        throw null;
    }

    @Override // o1.c, android.app.Service
    public final void onCreate() {
        Intent launchIntentForPackage;
        PendingIntent activity;
        Intent launchIntentForPackage2;
        super.onCreate();
        registerReceiver(this.O, new IntentFilter(Constants.MEDIA_DATA_RECEIVER));
        boolean z10 = false;
        if (Build.VERSION.SDK_INT >= 23) {
            PackageManager packageManager = getPackageManager();
            if (packageManager != null && (launchIntentForPackage2 = packageManager.getLaunchIntentForPackage(getPackageName())) != null) {
                activity = PendingIntent.getActivity(this, 0, launchIntentForPackage2, 201326592);
            }
            activity = null;
        } else {
            PackageManager packageManager2 = getPackageManager();
            if (packageManager2 != null && (launchIntentForPackage = packageManager2.getLaunchIntentForPackage(getPackageName())) != null) {
                activity = PendingIntent.getActivity(this, 0, launchIntentForPackage, 0);
            }
            activity = null;
        }
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this, "MusicService", null, null);
        mediaSessionCompat.f879a.f897a.setSessionActivity(activity);
        mediaSessionCompat.e(true);
        this.G = mediaSessionCompat;
        MediaSessionCompat.Token token = d().f879a.f898b;
        if (token != null) {
            if (this.f26908z == null) {
                this.f26908z = token;
                c.d dVar = this.f26903u;
                o1.c.this.f26907y.a(new o1.d(dVar, token));
                MediaSessionCompat.Token token2 = d().f879a.f898b;
                kotlin.jvm.internal.i.f(token2, "mediaSession.sessionToken");
                this.B = new ql.d(this, token2, new d());
                t7.a aVar = new t7.a(d());
                this.H = aVar;
                a aVar2 = new a();
                a.e eVar = aVar.f32437j;
                if (eVar != aVar2) {
                    if (eVar != null) {
                        aVar.f32432d.remove(eVar);
                    }
                    aVar.f32437j = aVar2;
                    ArrayList<a.InterfaceC0546a> arrayList = aVar.f32432d;
                    if (!arrayList.contains(aVar2)) {
                        arrayList.add(aVar2);
                    }
                    aVar.e();
                }
                t7.a aVar3 = this.H;
                if (aVar3 != null) {
                    b bVar = new b(d());
                    a.f fVar = aVar3.f32438k;
                    if (fVar != bVar) {
                        if (fVar != null) {
                            aVar3.f32432d.remove(fVar);
                        }
                        aVar3.f32438k = bVar;
                        ArrayList<a.InterfaceC0546a> arrayList2 = aVar3.f32432d;
                        if (!arrayList2.contains(bVar)) {
                            arrayList2.add(bVar);
                        }
                    }
                    Object value = this.N.getValue();
                    kotlin.jvm.internal.i.f(value, "<get-exoPlayer>(...)");
                    j jVar = (j) value;
                    this.D = jVar;
                    int p10 = jVar.p();
                    if (this.I.isEmpty()) {
                        w wVar = this.D;
                        if (wVar != null) {
                            wVar.i();
                            w wVar2 = this.D;
                            if (wVar2 != null) {
                                wVar2.stop();
                            } else {
                                kotlin.jvm.internal.i.q("currentPlayer");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("currentPlayer");
                            throw null;
                        }
                    } else if (p10 != 1 && p10 != 4) {
                        List<MediaMetadataCompat> list = this.I;
                        MediaMetadataCompat mediaMetadataCompat = list.get(this.J);
                        w wVar3 = this.D;
                        if (wVar3 != null) {
                            boolean h10 = wVar3.h();
                            w wVar4 = this.D;
                            if (wVar4 != null) {
                                e(list, mediaMetadataCompat, h10, wVar4.getCurrentPosition());
                            } else {
                                kotlin.jvm.internal.i.q("currentPlayer");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.i.q("currentPlayer");
                            throw null;
                        }
                    }
                    t7.a aVar4 = this.H;
                    if (aVar4 != null) {
                        w wVar5 = this.D;
                        if (wVar5 != null) {
                            if (wVar5.R() == aVar4.f32430b) {
                                z10 = true;
                            }
                            sc.b.q(z10);
                            w wVar6 = aVar4.f32436i;
                            a.b bVar2 = aVar4.f32431c;
                            if (wVar6 != null) {
                                wVar6.v(bVar2);
                            }
                            aVar4.f32436i = wVar5;
                            wVar5.E(bVar2);
                            aVar4.e();
                            aVar4.d();
                            ql.d dVar2 = this.B;
                            if (dVar2 != null) {
                                w wVar7 = this.D;
                                if (wVar7 != null) {
                                    dVar2.f29690d.c(wVar7);
                                    e0.a aVar5 = e0.f29706c;
                                    Context applicationContext = getApplicationContext();
                                    kotlin.jvm.internal.i.f(applicationContext, "applicationContext");
                                    e0 e0Var = e0.f29707d;
                                    if (e0Var == null) {
                                        synchronized (aVar5) {
                                            e0Var = e0.f29707d;
                                            if (e0Var == null) {
                                                e0Var = new e0(applicationContext);
                                                e0.f29707d = e0Var;
                                            }
                                        }
                                    }
                                    this.K = e0Var;
                                    return;
                                }
                                kotlin.jvm.internal.i.q("currentPlayer");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("notificationManager");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("currentPlayer");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("mediaSessionConnector");
                    throw null;
                }
                kotlin.jvm.internal.i.q("mediaSessionConnector");
                throw null;
            }
            throw new IllegalStateException("The session token has already been set");
        }
        throw new IllegalArgumentException("Session token may not be null");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        MediaSessionCompat d10 = d();
        d10.e(false);
        d10.c();
        unregisterReceiver(this.O);
        this.E.g(null);
        i iVar = this.N;
        Object value = iVar.getValue();
        kotlin.jvm.internal.i.f(value, "<get-exoPlayer>(...)");
        ((j) value).v(this.M);
        Object value2 = iVar.getValue();
        kotlin.jvm.internal.i.f(value2, "<get-exoPlayer>(...)");
        ((j) value2).a();
    }

    @Override // android.app.Service
    public final void onTaskRemoved(Intent rootIntent) {
        kotlin.jvm.internal.i.g(rootIntent, "rootIntent");
        f();
        super.onTaskRemoved(rootIntent);
        w wVar = this.D;
        if (wVar != null) {
            wVar.m(true);
        } else {
            kotlin.jvm.internal.i.q("currentPlayer");
            throw null;
        }
    }

    /* compiled from: MusicService.kt */
    /* loaded from: classes2.dex */
    public final class a implements a.e {
        public a() {
        }

        @Override // t7.a.InterfaceC0546a
        public final void a(w player, String command) {
            kotlin.jvm.internal.i.g(player, "player");
            kotlin.jvm.internal.i.g(command, "command");
        }

        @Override // t7.a.e
        public final void b(String mediaId, Bundle bundle, boolean z10) {
            kotlin.jvm.internal.i.g(mediaId, "mediaId");
            MusicService musicService = MusicService.this;
            s sVar = musicService.C;
            if (sVar != null) {
                if (sVar != null) {
                    sVar.G(new com.theinnerhour.b2b.components.dynamicActivities.utils.a(musicService, mediaId, bundle, this, z10));
                } else {
                    kotlin.jvm.internal.i.q("mediaSource");
                    throw null;
                }
            }
        }

        @Override // t7.a.e
        public final void h(boolean z10) {
            e0 e0Var = MusicService.this.K;
            MediaBrowserCompat.MediaItem mediaItem = null;
            if (e0Var != null) {
                SharedPreferences sharedPreferences = e0Var.f29709b;
                String string = sharedPreferences.getString("recent_song_media_id", null);
                if (string != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("playback_start_position_ms", sharedPreferences.getLong("recent_song_position", 0L));
                    mediaItem = new MediaBrowserCompat.MediaItem(new MediaDescriptionCompat(string, sharedPreferences.getString("recent_song_title", ""), sharedPreferences.getString("recent_song_subtitle", ""), null, null, Uri.parse(sharedPreferences.getString("recent_song_icon_uri", "")), bundle, null), 2);
                }
                if (mediaItem == null) {
                    return;
                }
                MediaDescriptionCompat mediaDescriptionCompat = mediaItem.f822v;
                String str = mediaDescriptionCompat.f845u;
                kotlin.jvm.internal.i.d(str);
                b(str, mediaDescriptionCompat.A, z10);
                return;
            }
            kotlin.jvm.internal.i.q("storage");
            throw null;
        }

        @Override // t7.a.e
        public final void i(Uri uri) {
            kotlin.jvm.internal.i.g(uri, "uri");
        }

        @Override // t7.a.e
        public final void m(String query, Bundle bundle, boolean z10) {
            kotlin.jvm.internal.i.g(query, "query");
            MusicService musicService = MusicService.this;
            s sVar = musicService.C;
            if (sVar != null) {
                sVar.G(new com.theinnerhour.b2b.components.dynamicActivities.utils.b(musicService, query, bundle, z10));
            } else {
                kotlin.jvm.internal.i.q("mediaSource");
                throw null;
            }
        }

        @Override // t7.a.e
        public final void j() {
        }
    }

    /* compiled from: MusicService.kt */
    /* loaded from: classes2.dex */
    public final class c implements w.d {
        public c() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void D(w player, w.c cVar) {
            kotlin.jvm.internal.i.g(player, "player");
            if (cVar.a(11) || cVar.a(1) || cVar.a(5)) {
                MusicService musicService = MusicService.this;
                int i6 = 0;
                if (!musicService.I.isEmpty()) {
                    i6 = c9.w.h(player.K(), 0, musicService.I.size() - 1);
                }
                musicService.J = i6;
            }
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void V(int i6, boolean z10) {
            MusicService musicService = MusicService.this;
            if (i6 != 2 && i6 != 3) {
                ql.d dVar = musicService.B;
                if (dVar != null) {
                    dVar.f29690d.c(null);
                    return;
                } else {
                    kotlin.jvm.internal.i.q("notificationManager");
                    throw null;
                }
            }
            ql.d dVar2 = musicService.B;
            if (dVar2 != null) {
                w wVar = musicService.D;
                if (wVar != null) {
                    dVar2.f29690d.c(wVar);
                    if (i6 == 3) {
                        musicService.f();
                        if (!z10) {
                            musicService.stopForeground(false);
                            musicService.L = false;
                            return;
                        }
                        return;
                    }
                    return;
                }
                kotlin.jvm.internal.i.q("currentPlayer");
                throw null;
            }
            kotlin.jvm.internal.i.q("notificationManager");
            throw null;
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void q(ExoPlaybackException error) {
            String str;
            int i6;
            kotlin.jvm.internal.i.g(error, "error");
            StringBuilder sb2 = new StringBuilder("Player error: ");
            int i10 = error.f6160u;
            if (i10 != 5001) {
                if (i10 != 5002) {
                    switch (i10) {
                        case 1000:
                            str = "ERROR_CODE_UNSPECIFIED";
                            break;
                        case 1001:
                            str = "ERROR_CODE_REMOTE_ERROR";
                            break;
                        case 1002:
                            str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                            break;
                        case 1003:
                            str = "ERROR_CODE_TIMEOUT";
                            break;
                        case 1004:
                            str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                            break;
                        default:
                            switch (i10) {
                                case 2000:
                                    str = "ERROR_CODE_IO_UNSPECIFIED";
                                    break;
                                case 2001:
                                    str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                    break;
                                case 2002:
                                    str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                    break;
                                case 2003:
                                    str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                    break;
                                case 2004:
                                    str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                    break;
                                case 2005:
                                    str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                    break;
                                case 2006:
                                    str = "ERROR_CODE_IO_NO_PERMISSION";
                                    break;
                                case 2007:
                                    str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                    break;
                                case 2008:
                                    str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                    break;
                                default:
                                    switch (i10) {
                                        case 3001:
                                            str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                            break;
                                        case 3002:
                                            str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                            break;
                                        case 3003:
                                            str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                            break;
                                        case 3004:
                                            str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                            break;
                                        default:
                                            switch (i10) {
                                                case 4001:
                                                    str = "ERROR_CODE_DECODER_INIT_FAILED";
                                                    break;
                                                case 4002:
                                                    str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                    break;
                                                case 4003:
                                                    str = "ERROR_CODE_DECODING_FAILED";
                                                    break;
                                                case 4004:
                                                    str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                    break;
                                                case 4005:
                                                    str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                    break;
                                                default:
                                                    switch (i10) {
                                                        case 6000:
                                                            str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                            break;
                                                        case 6001:
                                                            str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                            break;
                                                        case 6002:
                                                            str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                            break;
                                                        case 6003:
                                                            str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                            break;
                                                        case 6004:
                                                            str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                            break;
                                                        case 6005:
                                                            str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                            break;
                                                        case 6006:
                                                            str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                            break;
                                                        case 6007:
                                                            str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                            break;
                                                        case 6008:
                                                            str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                            break;
                                                        default:
                                                            if (i10 >= 1000000) {
                                                                str = "custom error code";
                                                                break;
                                                            } else {
                                                                str = "invalid error code";
                                                                break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                }
            } else {
                str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
            }
            sb2.append(str);
            sb2.append(" (");
            sb2.append(i10);
            sb2.append(')');
            Log.e("MusicService", sb2.toString());
            if (i10 != 2004 && i10 != 2005) {
                i6 = com.theinnerhour.b2b.R.string.generic_error;
            } else {
                i6 = com.theinnerhour.b2b.R.string.error_media_not_found;
            }
            MusicService musicService = MusicService.this;
            if (i10 == 2001) {
                musicService.d().d("com.theinnerhour.b2b.test.NO_INTERNET");
                return;
            }
            musicService.d().d("com.theinnerhour.b2b.test.GENERIC");
            Toast.makeText(musicService.getApplicationContext(), i6, 1).show();
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void N() {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void T() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void b() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void d0() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void e() {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void f() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void i() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void A(r rVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void C(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void L(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void a(g8.a aVar) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void c(q qVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void f0(com.google.android.exoplayer2.v vVar) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void g(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void h(List list) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void i0(q7.d dVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void l(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void l0(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void r(com.google.android.exoplayer2.f0 f0Var) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void s(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void t(w.a aVar) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void w(float f) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void x(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void y(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void G(o8.p pVar, z8.h hVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void R(com.google.android.exoplayer2.q qVar, int i6) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void e0(int i6, int i10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void v(int i6, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void z(int i6, w.e eVar, w.e eVar2) {
        }
    }
}
