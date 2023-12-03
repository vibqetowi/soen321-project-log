package n9;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import c4.u;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.List;
import k9.l;
import k9.n;
import m9.c0;
import m9.g;
import m9.z;
import v9.o;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class j implements g.b {

    /* renamed from: m  reason: collision with root package name */
    public static final p9.b f25961m = new p9.b("MediaSessionManager");

    /* renamed from: a  reason: collision with root package name */
    public final Context f25962a;

    /* renamed from: b  reason: collision with root package name */
    public final l9.b f25963b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.android.gms.internal.cast.c f25964c;

    /* renamed from: d  reason: collision with root package name */
    public final ComponentName f25965d;

    /* renamed from: e  reason: collision with root package name */
    public final b f25966e;
    public final b f;

    /* renamed from: g  reason: collision with root package name */
    public final com.google.android.gms.internal.cast.f f25967g;

    /* renamed from: h  reason: collision with root package name */
    public final u f25968h;

    /* renamed from: i  reason: collision with root package name */
    public m9.g f25969i;

    /* renamed from: j  reason: collision with root package name */
    public CastDevice f25970j;

    /* renamed from: k  reason: collision with root package name */
    public MediaSessionCompat f25971k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f25972l;

    public j(Context context, l9.b bVar, com.google.android.gms.internal.cast.c cVar) {
        this.f25962a = context;
        this.f25963b = bVar;
        this.f25964c = cVar;
        m9.a aVar = bVar.f24160z;
        if (aVar != null && !TextUtils.isEmpty(aVar.f24940v)) {
            this.f25965d = new ComponentName(context, bVar.f24160z.f24940v);
        } else {
            this.f25965d = null;
        }
        b bVar2 = new b(context);
        this.f25966e = bVar2;
        bVar2.f25952e = new h(this, 0);
        b bVar3 = new b(context);
        this.f = bVar3;
        bVar3.f25952e = new h(this, 1);
        this.f25967g = new com.google.android.gms.internal.cast.f(Looper.getMainLooper());
        this.f25968h = new u(4, this);
    }

    @Override // m9.g.b
    public final void a() {
        h();
    }

    @Override // m9.g.b
    public final void b() {
        h();
    }

    @Override // m9.g.b
    public final void d() {
        h();
    }

    @Override // m9.g.b
    public final void e() {
        h();
    }

    @Override // m9.g.b
    public final void f() {
        h();
    }

    public final void g(m9.g gVar, CastDevice castDevice) {
        l9.b bVar;
        m9.a aVar;
        if (!this.f25972l && (bVar = this.f25963b) != null && (aVar = bVar.f24160z) != null && gVar != null && castDevice != null) {
            this.f25969i = gVar;
            o.d("Must be called from the main thread.");
            gVar.f24989g.add(this);
            this.f25970j = castDevice;
            String str = aVar.f24939u;
            Context context = this.f25962a;
            ComponentName componentName = new ComponentName(context, str);
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, com.google.android.gms.internal.cast.e.f7516a);
            if (aVar.f24944z) {
                this.f25971k = new MediaSessionCompat(context, "CastMediaSession", componentName, broadcast);
                i(0, null);
                CastDevice castDevice2 = this.f25970j;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.f7250x)) {
                    MediaSessionCompat mediaSessionCompat = this.f25971k;
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(R.string.cast_casting_to_device, this.f25970j.f7250x);
                    t.b<String, Integer> bVar2 = MediaMetadataCompat.f851x;
                    if (bVar2.containsKey("android.media.metadata.ALBUM_ARTIST") && bVar2.getOrDefault("android.media.metadata.ALBUM_ARTIST", null).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    mediaSessionCompat.g(new MediaMetadataCompat(bundle));
                }
                this.f25971k.f(new i(this), null);
                this.f25971k.e(true);
                this.f25964c.X1(this.f25971k);
            }
            this.f25972l = true;
            h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        boolean z10;
        boolean z11;
        int i6;
        boolean z12;
        boolean z13;
        m9.f fVar;
        int size;
        boolean z14;
        MediaInfo mediaInfo;
        m9.g gVar = this.f25969i;
        if (gVar == null) {
            return;
        }
        MediaInfo c10 = gVar.c();
        m9.g gVar2 = this.f25969i;
        gVar2.getClass();
        o.d("Must be called from the main thread.");
        n d10 = gVar2.d();
        if (d10 != null && d10.f23174y == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = 6;
        if (!z10) {
            m9.g gVar3 = this.f25969i;
            gVar3.getClass();
            o.d("Must be called from the main thread.");
            n d11 = gVar3.d();
            if (d11 != null && d11.f23174y == 2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                i10 = 3;
            } else if (this.f25969i.h()) {
                i10 = 2;
            } else {
                if (this.f25969i.g()) {
                    m9.g gVar4 = this.f25969i;
                    gVar4.getClass();
                    o.d("Must be called from the main thread.");
                    n d12 = gVar4.d();
                    l lVar = null;
                    if (d12 != null) {
                        Integer num = d12.Q.get(d12.F);
                        if (num != null) {
                            lVar = (l) d12.K.get(num.intValue());
                        }
                    }
                    if (lVar != null && (mediaInfo = lVar.f23159u) != null) {
                        c10 = mediaInfo;
                    }
                }
                i10 = 0;
            }
        }
        i10 = (c10 == null || c10.f7262x == null) ? 0 : 0;
        i(i10, c10);
        if (!this.f25969i.e()) {
            m();
            o();
        } else if (i10 != 0) {
            if (this.f25970j != null) {
                p9.b bVar = MediaNotificationService.K;
                m9.a aVar = this.f25963b.f24160z;
                if (aVar != null && (fVar = aVar.f24942x) != null) {
                    z zVar = fVar.Z;
                    if (zVar != null) {
                        List<m9.e> a10 = MediaNotificationService.a(zVar);
                        int[] b10 = MediaNotificationService.b(zVar);
                        if (a10 == null) {
                            size = 0;
                        } else {
                            size = a10.size();
                        }
                        p9.b bVar2 = MediaNotificationService.K;
                        if (a10 != null && !a10.isEmpty()) {
                            if (a10.size() > 5) {
                                bVar2.d(l4.c.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]);
                            } else if (b10 != null && (r1 = b10.length) != 0) {
                                for (int i11 : b10) {
                                    if (i11 < 0 || i11 >= size) {
                                        bVar2.d(l4.c.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                                    }
                                }
                            } else {
                                bVar2.d(l4.c.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]);
                            }
                        } else {
                            bVar2.d(l4.c.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]);
                        }
                    }
                    z11 = true;
                    if (z11) {
                        Context context = this.f25962a;
                        Intent intent = new Intent(context, MediaNotificationService.class);
                        intent.putExtra("extra_media_notification_force_update", false);
                        intent.setPackage(context.getPackageName());
                        intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
                        intent.putExtra("extra_media_info", this.f25969i.c());
                        m9.g gVar5 = this.f25969i;
                        synchronized (gVar5.f24984a) {
                            o.d("Must be called from the main thread.");
                            n d13 = gVar5.d();
                            if (d13 != null) {
                                i6 = d13.f23174y;
                            } else {
                                i6 = 1;
                            }
                        }
                        intent.putExtra("extra_remote_media_client_player_state", i6);
                        intent.putExtra("extra_cast_device", this.f25970j);
                        MediaSessionCompat mediaSessionCompat = this.f25971k;
                        if (mediaSessionCompat != null) {
                            intent.putExtra("extra_media_session_token", mediaSessionCompat.f879a.f898b);
                        }
                        n d14 = this.f25969i.d();
                        int i12 = d14.J;
                        if (i12 != 1 && i12 != 2 && i12 != 3) {
                            Integer num2 = d14.Q.get(d14.f23172w);
                            if (num2 != null) {
                                if (num2.intValue() > 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (num2.intValue() < d14.K.size() - 1) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            } else {
                                z12 = false;
                                z13 = false;
                            }
                        } else {
                            z12 = true;
                            z13 = true;
                        }
                        intent.putExtra("extra_can_skip_next", z12);
                        intent.putExtra("extra_can_skip_prev", z13);
                        f25961m.b("Starting notification service.", new Object[0]);
                        if (Build.VERSION.SDK_INT >= 26) {
                            context.startForegroundService(intent);
                        } else {
                            context.startService(intent);
                        }
                    }
                }
                z11 = false;
                if (z11) {
                }
            }
            if (!this.f25969i.g()) {
                n(true);
            }
        }
    }

    public final void i(int i6, MediaInfo mediaInfo) {
        long j10;
        long b10;
        int i10;
        PendingIntent activity;
        long j11;
        MediaSessionCompat mediaSessionCompat = this.f25971k;
        if (mediaSessionCompat == null) {
            return;
        }
        if (i6 == 0) {
            mediaSessionCompat.h(new PlaybackStateCompat(0, 0L, 0L, 1.0f, 0L, 0, null, SystemClock.elapsedRealtime(), new ArrayList(), -1L, null));
            this.f25971k.g(new MediaMetadataCompat(new Bundle()));
            return;
        }
        if (true != this.f25969i.f()) {
            j10 = 768;
        } else {
            j10 = 512;
        }
        long j12 = j10;
        if (this.f25969i.f()) {
            b10 = 0;
        } else {
            b10 = this.f25969i.b();
        }
        this.f25971k.h(new PlaybackStateCompat(i6, b10, 0L, 1.0f, j12, 0, null, SystemClock.elapsedRealtime(), new ArrayList(), -1L, null));
        MediaSessionCompat mediaSessionCompat2 = this.f25971k;
        ComponentName componentName = this.f25965d;
        if (componentName == null) {
            activity = null;
            i10 = 0;
        } else {
            Intent intent = new Intent();
            intent.setComponent(componentName);
            i10 = 0;
            activity = PendingIntent.getActivity(this.f25962a, 0, intent, com.google.android.gms.internal.cast.e.f7516a | 134217728);
        }
        mediaSessionCompat2.f879a.f897a.setSessionActivity(activity);
        if (this.f25971k == null) {
            return;
        }
        k9.i iVar = mediaInfo.f7262x;
        if (this.f25969i.f()) {
            j11 = 0;
        } else {
            j11 = mediaInfo.f7263y;
        }
        MediaMetadataCompat.b l2 = l();
        l2.d("android.media.metadata.TITLE", iVar.f0("com.google.android.gms.cast.metadata.TITLE"));
        l2.d("android.media.metadata.DISPLAY_TITLE", iVar.f0("com.google.android.gms.cast.metadata.TITLE"));
        l2.d("android.media.metadata.DISPLAY_SUBTITLE", iVar.f0("com.google.android.gms.cast.metadata.SUBTITLE"));
        l2.c(j11, "android.media.metadata.DURATION");
        this.f25971k.g(l2.a());
        Uri k10 = k(iVar, i10);
        if (k10 != null) {
            this.f25966e.a(k10);
        } else {
            j(i10, null);
        }
        Uri k11 = k(iVar, 3);
        if (k11 != null) {
            this.f.a(k11);
        } else {
            j(3, null);
        }
    }

    public final void j(int i6, Bitmap bitmap) {
        MediaSessionCompat mediaSessionCompat = this.f25971k;
        if (mediaSessionCompat == null) {
            return;
        }
        if (i6 == 0) {
            if (bitmap != null) {
                MediaMetadataCompat.b l2 = l();
                l2.b("android.media.metadata.DISPLAY_ICON", bitmap);
                mediaSessionCompat.g(l2.a());
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            MediaSessionCompat mediaSessionCompat2 = this.f25971k;
            MediaMetadataCompat.b l10 = l();
            l10.b("android.media.metadata.DISPLAY_ICON", createBitmap);
            mediaSessionCompat2.g(l10.a());
        } else if (i6 == 3) {
            MediaMetadataCompat.b l11 = l();
            l11.b("android.media.metadata.ALBUM_ART", bitmap);
            mediaSessionCompat.g(l11.a());
        }
    }

    public final Uri k(k9.i iVar, int i6) {
        boolean z10;
        u9.a aVar;
        l9.b bVar = this.f25963b;
        if (bVar.f24160z.f0() != null) {
            bVar.f24160z.f0().getClass();
            aVar = m9.c.a(iVar);
        } else {
            List<u9.a> list = iVar.f23145u;
            if (list != null && !list.isEmpty()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                aVar = list.get(0);
            } else {
                aVar = null;
            }
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f33969v;
    }

    public final MediaMetadataCompat.b l() {
        MediaMetadataCompat a10;
        MediaSessionCompat mediaSessionCompat = this.f25971k;
        if (mediaSessionCompat == null) {
            a10 = null;
        } else {
            a10 = mediaSessionCompat.f880b.a();
        }
        if (a10 == null) {
            return new MediaMetadataCompat.b();
        }
        return new MediaMetadataCompat.b(a10);
    }

    public final void m() {
        if (this.f25963b.f24160z.f24942x == null) {
            return;
        }
        f25961m.b("Stopping notification service.", new Object[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            c0 c0Var = MediaNotificationService.L;
            if (c0Var != null) {
                c0Var.run();
                return;
            }
            return;
        }
        Context context = this.f25962a;
        Intent intent = new Intent(context, MediaNotificationService.class);
        intent.setPackage(context.getPackageName());
        intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
        context.stopService(intent);
    }

    public final void n(boolean z10) {
        if (!this.f25963b.A) {
            return;
        }
        com.google.android.gms.internal.cast.f fVar = this.f25967g;
        u uVar = this.f25968h;
        fVar.removeCallbacks(uVar);
        Context context = this.f25962a;
        Intent intent = new Intent(context, ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        try {
            context.startService(intent);
        } catch (IllegalStateException unused) {
            if (z10) {
                fVar.postDelayed(uVar, 1000L);
            }
        }
    }

    public final void o() {
        if (!this.f25963b.A) {
            return;
        }
        this.f25967g.removeCallbacks(this.f25968h);
        Context context = this.f25962a;
        Intent intent = new Intent(context, ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }

    @Override // m9.g.b
    public final void c() {
    }
}
