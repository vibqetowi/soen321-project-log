package t7;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o7.m;
import o8.p;
import z8.h;
/* compiled from: MediaSessionConnector.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: m  reason: collision with root package name */
    public static final MediaMetadataCompat f32428m;

    /* renamed from: a  reason: collision with root package name */
    public final MediaSessionCompat f32429a;

    /* renamed from: b  reason: collision with root package name */
    public final Looper f32430b;

    /* renamed from: c  reason: collision with root package name */
    public final b f32431c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<InterfaceC0546a> f32432d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<InterfaceC0546a> f32433e;
    public final c[] f;

    /* renamed from: g  reason: collision with root package name */
    public Map<String, c> f32434g;

    /* renamed from: h  reason: collision with root package name */
    public final d f32435h;

    /* renamed from: i  reason: collision with root package name */
    public w f32436i;

    /* renamed from: j  reason: collision with root package name */
    public e f32437j;

    /* renamed from: k  reason: collision with root package name */
    public f f32438k;

    /* renamed from: l  reason: collision with root package name */
    public final long f32439l;

    /* compiled from: MediaSessionConnector.java */
    /* renamed from: t7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0546a {
        void a(w wVar, String str);
    }

    /* compiled from: MediaSessionConnector.java */
    /* loaded from: classes.dex */
    public interface c {
        PlaybackStateCompat.CustomAction a();

        void b();
    }

    /* compiled from: MediaSessionConnector.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final MediaControllerCompat f32441a;

        /* renamed from: b  reason: collision with root package name */
        public final String f32442b = "";

        public d(MediaControllerCompat mediaControllerCompat) {
            this.f32441a = mediaControllerCompat;
        }
    }

    /* compiled from: MediaSessionConnector.java */
    /* loaded from: classes.dex */
    public interface e extends InterfaceC0546a {
        void b(String str, Bundle bundle, boolean z10);

        void h(boolean z10);

        void i(Uri uri);

        void j();

        void m(String str, Bundle bundle, boolean z10);
    }

    /* compiled from: MediaSessionConnector.java */
    /* loaded from: classes.dex */
    public interface f extends InterfaceC0546a {
        void c(w wVar);

        long d(w wVar);

        void e(w wVar);

        void f(w wVar);

        void g(w wVar, long j10);

        long k();

        void l(w wVar);
    }

    static {
        m.a("goog.exo.mediasession");
        f32428m = new MediaMetadataCompat(new Bundle());
    }

    public a(MediaSessionCompat mediaSessionCompat) {
        this.f32429a = mediaSessionCompat;
        int i6 = c9.w.f5205a;
        Looper myLooper = Looper.myLooper();
        myLooper = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f32430b = myLooper;
        b bVar = new b();
        this.f32431c = bVar;
        this.f32432d = new ArrayList<>();
        this.f32433e = new ArrayList<>();
        this.f = new c[0];
        this.f32434g = Collections.emptyMap();
        this.f32435h = new d(mediaSessionCompat.f880b);
        this.f32439l = 2360143L;
        mediaSessionCompat.f879a.f897a.setFlags(3);
        mediaSessionCompat.f(bVar, new Handler(myLooper));
    }

    public static boolean a(a aVar, long j10) {
        e eVar = aVar.f32437j;
        if (eVar != null) {
            eVar.j();
            if ((j10 & 101376) != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(a aVar, long j10) {
        if (aVar.f32436i != null && (j10 & aVar.f32439l) != 0) {
            return true;
        }
        return false;
    }

    public static boolean c(a aVar, long j10) {
        f fVar;
        w wVar = aVar.f32436i;
        if (wVar != null && (fVar = aVar.f32438k) != null && (j10 & fVar.d(wVar)) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01d7, code lost:
        if (r10 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01f1, code lost:
        if (r10 != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        MediaMetadataCompat mediaMetadataCompat;
        w wVar;
        long j10;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Object obj;
        boolean z10;
        d dVar = this.f32435h;
        if (dVar != null && (wVar = this.f32436i) != null && !wVar.Q().q()) {
            MediaMetadataCompat.b bVar = new MediaMetadataCompat.b();
            if (wVar.b()) {
                bVar.c(1L, "android.media.metadata.ADVERTISEMENT");
            }
            if (!wVar.N() && wVar.getDuration() != -9223372036854775807L) {
                j10 = wVar.getDuration();
            } else {
                j10 = -1;
            }
            bVar.c(j10, "android.media.metadata.DURATION");
            MediaControllerCompat mediaControllerCompat = dVar.f32441a;
            long j11 = mediaControllerCompat.b().D;
            if (j11 != -1) {
                List<MediaSession.QueueItem> queue = mediaControllerCompat.f861a.f863a.getQueue();
                Integer num = null;
                if (queue != null) {
                    arrayList = MediaSessionCompat.QueueItem.a(queue);
                } else {
                    arrayList = null;
                }
                int i6 = 0;
                while (true) {
                    if (arrayList == null || i6 >= arrayList.size()) {
                        break;
                    }
                    MediaSessionCompat.QueueItem queueItem = (MediaSessionCompat.QueueItem) arrayList.get(i6);
                    if (queueItem.f883v == j11) {
                        MediaDescriptionCompat mediaDescriptionCompat = queueItem.f882u;
                        Bundle bundle = mediaDescriptionCompat.A;
                        if (bundle != null) {
                            for (String str7 : bundle.keySet()) {
                                Object obj2 = bundle.get(str7);
                                boolean z11 = obj2 instanceof String;
                                String str8 = dVar.f32442b;
                                if (z11) {
                                    String valueOf = String.valueOf(str8);
                                    String valueOf2 = String.valueOf(str7);
                                    if (valueOf2.length() != 0) {
                                        str = valueOf.concat(valueOf2);
                                    } else {
                                        str = new String(valueOf);
                                    }
                                    bVar.d(str, (String) obj2);
                                } else {
                                    boolean z12 = obj2 instanceof CharSequence;
                                    boolean z13 = true;
                                    Bundle bundle2 = bVar.f857a;
                                    if (z12) {
                                        String valueOf3 = String.valueOf(str8);
                                        String valueOf4 = String.valueOf(str7);
                                        if (valueOf4.length() != 0) {
                                            str2 = valueOf3.concat(valueOf4);
                                        } else {
                                            str2 = new String(valueOf3);
                                        }
                                        CharSequence charSequence = (CharSequence) obj2;
                                        t.b<String, Integer> bVar2 = MediaMetadataCompat.f851x;
                                        if (bVar2.containsKey(str2) && bVar2.getOrDefault(str2, num).intValue() != 1) {
                                            throw new IllegalArgumentException(defpackage.b.m("The ", str2, " key cannot be used to put a CharSequence"));
                                        }
                                        bundle2.putCharSequence(str2, charSequence);
                                    } else if (obj2 instanceof Long) {
                                        String valueOf5 = String.valueOf(str8);
                                        String valueOf6 = String.valueOf(str7);
                                        if (valueOf6.length() != 0) {
                                            str3 = valueOf5.concat(valueOf6);
                                        } else {
                                            str3 = new String(valueOf5);
                                        }
                                        bVar.c(((Long) obj2).longValue(), str3);
                                    } else if (obj2 instanceof Integer) {
                                        String valueOf7 = String.valueOf(str8);
                                        String valueOf8 = String.valueOf(str7);
                                        if (valueOf8.length() != 0) {
                                            str4 = valueOf7.concat(valueOf8);
                                        } else {
                                            str4 = new String(valueOf7);
                                        }
                                        bVar.c(((Integer) obj2).intValue(), str4);
                                    } else if (obj2 instanceof Bitmap) {
                                        String valueOf9 = String.valueOf(str8);
                                        String valueOf10 = String.valueOf(str7);
                                        if (valueOf10.length() != 0) {
                                            str5 = valueOf9.concat(valueOf10);
                                        } else {
                                            str5 = new String(valueOf9);
                                        }
                                        bVar.b(str5, (Bitmap) obj2);
                                    } else if (obj2 instanceof RatingCompat) {
                                        String valueOf11 = String.valueOf(str8);
                                        String valueOf12 = String.valueOf(str7);
                                        if (valueOf12.length() != 0) {
                                            str6 = valueOf11.concat(valueOf12);
                                        } else {
                                            str6 = new String(valueOf11);
                                        }
                                        RatingCompat ratingCompat = (RatingCompat) obj2;
                                        t.b<String, Integer> bVar3 = MediaMetadataCompat.f851x;
                                        if (bVar3.containsKey(str6) && bVar3.getOrDefault(str6, num).intValue() != 3) {
                                            throw new IllegalArgumentException(defpackage.b.m("The ", str6, " key cannot be used to put a Rating"));
                                        }
                                        if (ratingCompat.f860w == null) {
                                            float f2 = ratingCompat.f859v;
                                            if (f2 >= 0.0f) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            int i10 = ratingCompat.f858u;
                                            if (z10) {
                                                switch (i10) {
                                                    case 1:
                                                        ratingCompat.f860w = RatingCompat.b.g((i10 == 1 && f2 == 1.0f) ? false : false);
                                                        break;
                                                    case 2:
                                                        ratingCompat.f860w = RatingCompat.b.j((i10 == 2 && f2 == 1.0f) ? false : false);
                                                        break;
                                                    case 3:
                                                    case 4:
                                                    case 5:
                                                        if (i10 == 3 || i10 == 4 || i10 == 5) {
                                                            if (f2 < 0.0f) {
                                                                z13 = false;
                                                                break;
                                                            }
                                                        }
                                                        f2 = -1.0f;
                                                        ratingCompat.f860w = RatingCompat.b.i(i10, f2);
                                                        break;
                                                    case 6:
                                                        if (i10 == 6) {
                                                            if (f2 < 0.0f) {
                                                                z13 = false;
                                                                break;
                                                            }
                                                        }
                                                        f2 = -1.0f;
                                                        ratingCompat.f860w = RatingCompat.b.h(f2);
                                                        break;
                                                    default:
                                                        obj = null;
                                                        break;
                                                }
                                                bundle2.putParcelable(str6, (Parcelable) obj);
                                                num = null;
                                            } else {
                                                ratingCompat.f860w = RatingCompat.b.k(i10);
                                            }
                                        }
                                        obj = ratingCompat.f860w;
                                        bundle2.putParcelable(str6, (Parcelable) obj);
                                        num = null;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        CharSequence charSequence2 = mediaDescriptionCompat.f846v;
                        if (charSequence2 != null) {
                            String valueOf13 = String.valueOf(charSequence2);
                            bVar.d("android.media.metadata.TITLE", valueOf13);
                            bVar.d("android.media.metadata.DISPLAY_TITLE", valueOf13);
                        }
                        CharSequence charSequence3 = mediaDescriptionCompat.f847w;
                        if (charSequence3 != null) {
                            bVar.d("android.media.metadata.DISPLAY_SUBTITLE", String.valueOf(charSequence3));
                        }
                        CharSequence charSequence4 = mediaDescriptionCompat.f848x;
                        if (charSequence4 != null) {
                            bVar.d("android.media.metadata.DISPLAY_DESCRIPTION", String.valueOf(charSequence4));
                        }
                        Bitmap bitmap = mediaDescriptionCompat.f849y;
                        if (bitmap != null) {
                            bVar.b("android.media.metadata.DISPLAY_ICON", bitmap);
                        }
                        Uri uri = mediaDescriptionCompat.f850z;
                        if (uri != null) {
                            bVar.d("android.media.metadata.DISPLAY_ICON_URI", String.valueOf(uri));
                        }
                        String str9 = mediaDescriptionCompat.f845u;
                        if (str9 != null) {
                            bVar.d("android.media.metadata.MEDIA_ID", str9);
                        }
                        Uri uri2 = mediaDescriptionCompat.B;
                        if (uri2 != null) {
                            bVar.d("android.media.metadata.MEDIA_URI", String.valueOf(uri2));
                        }
                    } else {
                        i6++;
                        num = null;
                    }
                }
            }
            mediaMetadataCompat = bVar.a();
        } else {
            mediaMetadataCompat = f32428m;
        }
        this.f32429a.g(mediaMetadataCompat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
        if (r12 != false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        c[] cVarArr;
        boolean z10;
        int i6;
        int i10;
        long j10;
        float f2;
        long j11;
        long j12;
        ArrayList arrayList = new ArrayList();
        w wVar = this.f32436i;
        long j13 = 0;
        MediaSessionCompat mediaSessionCompat = this.f32429a;
        int i11 = 0;
        if (wVar == null) {
            e eVar = this.f32437j;
            if (eVar == null) {
                j12 = 0;
            } else {
                eVar.j();
                j12 = 101376;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            mediaSessionCompat.j(0);
            mediaSessionCompat.k(0);
            mediaSessionCompat.h(new PlaybackStateCompat(0, 0L, 0L, 0.0f, j12, 0, null, elapsedRealtime, arrayList, -1L, null));
            return;
        }
        HashMap hashMap = new HashMap();
        for (c cVar : this.f) {
            PlaybackStateCompat.CustomAction a10 = cVar.a();
            if (a10 != null) {
                hashMap.put(a10.f921u, cVar);
                arrayList.add(a10);
            }
        }
        this.f32434g = Collections.unmodifiableMap(hashMap);
        Bundle bundle = new Bundle();
        if (wVar.H() == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i10 = 7;
        } else {
            int p10 = wVar.p();
            boolean h10 = wVar.h();
            if (p10 != 2) {
                i6 = 3;
                if (p10 != 3) {
                    if (p10 != 4) {
                        i6 = 0;
                    } else {
                        i6 = 1;
                    }
                }
                i10 = i6;
            } else {
                if (h10) {
                    i6 = 6;
                    i10 = i6;
                }
                i6 = 2;
                i10 = i6;
            }
        }
        f fVar = this.f32438k;
        if (fVar != null) {
            j10 = fVar.k();
        } else {
            j10 = -1;
        }
        long j14 = j10;
        float f10 = wVar.c().f7195u;
        bundle.putFloat("EXO_SPEED", f10);
        if (wVar.isPlaying()) {
            f2 = f10;
        } else {
            f2 = 0.0f;
        }
        q j15 = wVar.j();
        if (j15 != null) {
            String str = j15.f6684u;
            if (!"".equals(str)) {
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", str);
            }
        }
        e eVar2 = this.f32437j;
        if (eVar2 != null) {
            eVar2.j();
            j13 = 101376;
        }
        boolean L = wVar.L(5);
        boolean L2 = wVar.L(11);
        boolean L3 = wVar.L(12);
        if (!wVar.Q().q()) {
            wVar.b();
        }
        if (L) {
            j11 = 6554375;
        } else {
            j11 = 6554119;
        }
        if (L3) {
            j11 |= 64;
        }
        if (L2) {
            j11 |= 8;
        }
        long j16 = this.f32439l & j11;
        f fVar2 = this.f32438k;
        if (fVar2 != null) {
            j16 |= 4144 & fVar2.d(wVar);
        }
        long j17 = j13 | j16;
        long F = wVar.F();
        long currentPosition = wVar.getCurrentPosition();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        int r = wVar.r();
        if (r == 1) {
            i11 = 1;
        } else if (r == 2) {
            i11 = 2;
        }
        mediaSessionCompat.j(i11);
        mediaSessionCompat.k(wVar.S() ? 1 : 0);
        mediaSessionCompat.h(new PlaybackStateCompat(i10, currentPosition, F, f2, j17, 0, null, elapsedRealtime2, arrayList, j14, bundle));
    }

    /* compiled from: MediaSessionConnector.java */
    /* loaded from: classes.dex */
    public class b extends MediaSessionCompat.a implements w.d {
        public int A;

        /* renamed from: z  reason: collision with root package name */
        public int f32440z;

        public b() {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void B() {
            a aVar = a.this;
            if (a.b(aVar, 4L)) {
                if (aVar.f32436i.p() == 1) {
                    e eVar = aVar.f32437j;
                    if (eVar != null) {
                        eVar.h(true);
                    } else {
                        aVar.f32436i.l();
                    }
                } else if (aVar.f32436i.p() == 4) {
                    w wVar = aVar.f32436i;
                    wVar.f(wVar.K(), -9223372036854775807L);
                }
                w wVar2 = aVar.f32436i;
                wVar2.getClass();
                wVar2.q();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
            if (r7.f32440z == r5) goto L16;
         */
        @Override // com.google.android.exoplayer2.w.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void D(w wVar, w.c cVar) {
            boolean z10;
            boolean z11;
            w wVar2;
            boolean a10 = cVar.a(11);
            a aVar = a.this;
            boolean z12 = true;
            if (a10) {
                if (this.f32440z != wVar.K()) {
                    f fVar = aVar.f32438k;
                    if (fVar != null) {
                        fVar.f(wVar);
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            if (cVar.a(0)) {
                int p10 = wVar.Q().p();
                int K = wVar.K();
                f fVar2 = aVar.f32438k;
                if (fVar2 != null) {
                    fVar2.l(wVar);
                } else if (this.A == p10) {
                }
                z11 = true;
                this.A = p10;
                z10 = true;
            }
            this.f32440z = wVar.K();
            if (cVar.b(4, 5, 7, 8, 12)) {
                z11 = true;
            }
            if (cVar.b(9)) {
                f fVar3 = aVar.f32438k;
                if (fVar3 != null && (wVar2 = aVar.f32436i) != null) {
                    fVar3.l(wVar2);
                }
            } else {
                z12 = z11;
            }
            if (z12) {
                aVar.e();
            }
            if (z10) {
                aVar.d();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void E(String str, Bundle bundle) {
            a aVar = a.this;
            if (a.a(aVar, 1024L)) {
                aVar.f32437j.b(str, bundle, true);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void F(String str, Bundle bundle) {
            a aVar = a.this;
            if (a.a(aVar, 2048L)) {
                aVar.f32437j.m(str, bundle, true);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void H(Uri uri, Bundle bundle) {
            a aVar = a.this;
            if (a.a(aVar, 8192L)) {
                aVar.f32437j.i(uri);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void I() {
            a aVar = a.this;
            if (a.a(aVar, 16384L)) {
                aVar.f32437j.h(false);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void J(String str, Bundle bundle) {
            a aVar = a.this;
            if (a.a(aVar, 32768L)) {
                aVar.f32437j.b(str, bundle, false);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void K(String str, Bundle bundle) {
            a aVar = a.this;
            if (a.a(aVar, 65536L)) {
                aVar.f32437j.m(str, bundle, false);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void M(Uri uri, Bundle bundle) {
            a aVar = a.this;
            if (a.a(aVar, 131072L)) {
                aVar.f32437j.i(uri);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void O() {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void P() {
            a aVar = a.this;
            if (a.b(aVar, 8L)) {
                aVar.f32436i.X();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void Q(long j10) {
            a aVar = a.this;
            if (a.b(aVar, 256L)) {
                w wVar = aVar.f32436i;
                wVar.f(wVar.K(), j10);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void S() {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void U(float f) {
            a aVar = a.this;
            if (a.b(aVar, 4194304L) && f > 0.0f) {
                w wVar = aVar.f32436i;
                wVar.d(new v(f, wVar.c().f7196v));
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void W() {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void X() {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void Y(int i6) {
            a aVar = a.this;
            if (a.b(aVar, 262144L)) {
                int i10 = 1;
                if (i6 != 1) {
                    i10 = 2;
                    if (i6 != 2 && i6 != 3) {
                        i10 = 0;
                    }
                }
                aVar.f32436i.B(i10);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void Z(int i6) {
            a aVar = a.this;
            if (a.b(aVar, 2097152L)) {
                boolean z10 = true;
                if (i6 != 1 && i6 != 2) {
                    z10 = false;
                }
                aVar.f32436i.k(z10);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void a0() {
            a aVar = a.this;
            if (a.c(aVar, 32L)) {
                aVar.f32438k.c(aVar.f32436i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void b0() {
            a aVar = a.this;
            if (a.c(aVar, 16L)) {
                aVar.f32438k.e(aVar.f32436i);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void c0(long j10) {
            a aVar = a.this;
            if (a.c(aVar, 4096L)) {
                aVar.f32438k.g(aVar.f32436i, j10);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void g0() {
            a aVar = a.this;
            if (a.b(aVar, 1L)) {
                aVar.f32436i.stop();
                aVar.f32436i.i();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void j() {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void k() {
            a.this.getClass();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void m(String str, Bundle bundle, ResultReceiver resultReceiver) {
            a aVar = a.this;
            if (aVar.f32436i != null) {
                int i6 = 0;
                int i10 = 0;
                while (true) {
                    ArrayList<InterfaceC0546a> arrayList = aVar.f32432d;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    arrayList.get(i10).a(aVar.f32436i, str);
                    i10++;
                }
                while (true) {
                    ArrayList<InterfaceC0546a> arrayList2 = aVar.f32433e;
                    if (i6 < arrayList2.size()) {
                        arrayList2.get(i6).a(aVar.f32436i, str);
                        i6++;
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void n(String str, Bundle bundle) {
            a aVar = a.this;
            if (aVar.f32436i != null && aVar.f32434g.containsKey(str)) {
                aVar.f32434g.get(str).b();
                aVar.e();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void o() {
            a aVar = a.this;
            if (a.b(aVar, 64L)) {
                aVar.f32436i.V();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final boolean p(Intent intent) {
            a.this.getClass();
            if (super.p(intent)) {
                return true;
            }
            return false;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.a
        public final void u() {
            a aVar = a.this;
            if (a.b(aVar, 2L)) {
                aVar.f32436i.pause();
            }
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
        public final /* synthetic */ void c(d9.q qVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void f0(v vVar) {
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
        public final /* synthetic */ void q(ExoPlaybackException exoPlaybackException) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void r(f0 f0Var) {
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
        public final /* synthetic */ void G(p pVar, h hVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void R(q qVar, int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void V(int i6, boolean z10) {
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
