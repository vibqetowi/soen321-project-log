package ql;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.lifecycle.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
/* compiled from: AudioViewModel.kt */
/* loaded from: classes2.dex */
public final class i extends androidx.lifecycle.b {
    public boolean A;
    public final androidx.lifecycle.w<a> B;
    public final androidx.lifecycle.w<Long> C;
    public final androidx.lifecycle.w<Integer> D;
    public final androidx.lifecycle.w<Integer> E;
    public final Handler F;
    public final h G;
    public final bl.c H;
    public final q I;
    public final androidx.lifecycle.u J;

    /* renamed from: y  reason: collision with root package name */
    public final Application f29728y;

    /* renamed from: z  reason: collision with root package name */
    public PlaybackStateCompat f29729z;

    /* compiled from: AudioViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f29730a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f29731b;

        /* renamed from: c  reason: collision with root package name */
        public final String f29732c;

        /* renamed from: d  reason: collision with root package name */
        public final String f29733d;

        /* renamed from: e  reason: collision with root package name */
        public final String f29734e;
        public final boolean f;

        /* compiled from: AudioViewModel.kt */
        /* renamed from: ql.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0504a {
            public static String a(Context context, long j10) {
                kotlin.jvm.internal.i.g(context, "context");
                int floor = (int) Math.floor(j10 / 1000.0d);
                int i6 = floor / 60;
                int i10 = floor - (i6 * 60);
                if (j10 < 0) {
                    String string = context.getString(R.string.duration_unknown);
                    kotlin.jvm.internal.i.f(string, "context.getString(R.string.duration_unknown)");
                    return string;
                }
                String string2 = context.getString(R.string.duration_format);
                kotlin.jvm.internal.i.f(string2, "context.getString(R.string.duration_format)");
                return defpackage.b.o(new Object[]{Integer.valueOf(i6), Integer.valueOf(i10)}, 2, string2, "format(this, *args)");
            }
        }

        public a(String str, Uri uri, String str2, String str3, String duration, boolean z10) {
            kotlin.jvm.internal.i.g(duration, "duration");
            this.f29730a = str;
            this.f29731b = uri;
            this.f29732c = str2;
            this.f29733d = str3;
            this.f29734e = duration;
            this.f = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.i.b(this.f29730a, aVar.f29730a) && kotlin.jvm.internal.i.b(this.f29731b, aVar.f29731b) && kotlin.jvm.internal.i.b(this.f29732c, aVar.f29732c) && kotlin.jvm.internal.i.b(this.f29733d, aVar.f29733d) && kotlin.jvm.internal.i.b(this.f29734e, aVar.f29734e) && this.f == aVar.f) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode;
            int hashCode2 = (this.f29731b.hashCode() + (this.f29730a.hashCode() * 31)) * 31;
            int i6 = 0;
            String str = this.f29732c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i10 = (hashCode2 + hashCode) * 31;
            String str2 = this.f29733d;
            if (str2 != null) {
                i6 = str2.hashCode();
            }
            int c10 = pl.a.c(this.f29734e, (i10 + i6) * 31, 31);
            boolean z10 = this.f;
            int i11 = z10;
            if (z10 != 0) {
                i11 = 1;
            }
            return c10 + i11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AudioPlaybackMetadata(id=");
            sb2.append(this.f29730a);
            sb2.append(", albumArtUri=");
            sb2.append(this.f29731b);
            sb2.append(", title=");
            sb2.append(this.f29732c);
            sb2.append(", subtitle=");
            sb2.append(this.f29733d);
            sb2.append(", duration=");
            sb2.append(this.f29734e);
            sb2.append(", browsable=");
            return defpackage.c.t(sb2, this.f, ')');
        }
    }

    /* compiled from: AudioViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends o0.c {

        /* renamed from: b  reason: collision with root package name */
        public final Application f29735b;

        /* renamed from: c  reason: collision with root package name */
        public final q f29736c;

        public b(Application application, q qVar) {
            this.f29735b = application;
            this.f29736c = qVar;
        }

        @Override // androidx.lifecycle.o0.c, androidx.lifecycle.o0.b
        public final <T extends l0> T a(Class<T> cls) {
            return new i(this.f29735b, this.f29736c);
        }
    }

    /* compiled from: Transformations.kt */
    /* loaded from: classes2.dex */
    public static final class c<I, O> implements o.a {
        @Override // o.a
        public final Boolean apply(Boolean bool) {
            return bool;
        }
    }

    /* compiled from: Transformations.kt */
    /* loaded from: classes2.dex */
    public static final class d<I, O> implements o.a {
        @Override // o.a
        public final g0 apply(g0 g0Var) {
            return g0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Application app, q musicServiceConnection) {
        super(app);
        kotlin.jvm.internal.i.g(app, "app");
        kotlin.jvm.internal.i.g(musicServiceConnection, "musicServiceConnection");
        this.f29728y = app;
        this.f29729z = r.f29777a;
        this.A = true;
        this.B = new androidx.lifecycle.w<>();
        androidx.lifecycle.w<Long> wVar = new androidx.lifecycle.w<>();
        wVar.i(0L);
        this.C = wVar;
        androidx.lifecycle.w<Integer> wVar2 = new androidx.lifecycle.w<>();
        wVar2.i(Integer.valueOf((int) R.drawable.ic_play));
        this.D = wVar2;
        androidx.lifecycle.w<Integer> wVar3 = new androidx.lifecycle.w<>();
        wVar3.i(-1);
        this.E = wVar3;
        Handler handler = new Handler(Looper.getMainLooper());
        this.F = handler;
        h hVar = new h(this, 0, musicServiceConnection);
        this.G = hVar;
        bl.c cVar = new bl.c(2, this);
        this.H = cVar;
        musicServiceConnection.f29770d.f(hVar);
        musicServiceConnection.f29771e.f(cVar);
        handler.postDelayed(new je.o(28, this), 100L);
        this.I = musicServiceConnection;
        androidx.lifecycle.w<Boolean> wVar4 = musicServiceConnection.f29768b;
        c cVar2 = new c();
        androidx.lifecycle.u uVar = new androidx.lifecycle.u();
        uVar.m(wVar4, new k0(uVar, cVar2));
        androidx.lifecycle.w<g0> wVar5 = musicServiceConnection.f29769c;
        d dVar = new d();
        androidx.lifecycle.u uVar2 = new androidx.lifecycle.u();
        uVar2.m(wVar5, new k0(uVar2, dVar));
        this.J = uVar2;
    }

    @Override // androidx.lifecycle.l0
    public final void c() {
        q qVar = this.I;
        qVar.a().f876a.stop();
        qVar.f29770d.j(this.G);
        qVar.f29771e.j(this.H);
        this.A = false;
    }

    public final void e(boolean z10) {
        long longValue;
        boolean z11;
        androidx.lifecycle.w<Long> wVar = this.C;
        if (z10) {
            Long d10 = wVar.d();
            if (d10 == null) {
                d10 = 0L;
            }
            longValue = d10.longValue() + ((long) Constants.TIMEOUT_MS);
        } else {
            Long d11 = wVar.d();
            if (d11 == null) {
                d11 = 0L;
            }
            longValue = d11.longValue() - ((long) Constants.TIMEOUT_MS);
        }
        q qVar = this.I;
        if (qVar.f29773h != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            qVar.a().f876a.seekTo(longValue);
        }
    }

    public final void f(Long l2) {
        boolean z10;
        if (l2 == null) {
            return;
        }
        q qVar = this.I;
        if (qVar.f29773h != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            MediaControllerCompat.e a10 = qVar.a();
            a10.f876a.seekTo(l2.longValue());
        }
    }

    public final void g(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        boolean z10;
        int i6;
        String str;
        String str2;
        if (mediaMetadataCompat.c("android.media.metadata.DURATION") != 0 && mediaMetadataCompat.d("android.media.metadata.MEDIA_ID") != null) {
            String d10 = mediaMetadataCompat.d("android.media.metadata.MEDIA_ID");
            kotlin.jvm.internal.i.d(d10);
            Uri y12 = ca.a.y1(mediaMetadataCompat.d("android.media.metadata.ALBUM_ART_URI"));
            String d11 = mediaMetadataCompat.d("android.media.metadata.TITLE");
            if (d11 != null) {
                str = gv.r.i1(d11).toString();
            } else {
                str = null;
            }
            String d12 = mediaMetadataCompat.d("android.media.metadata.DISPLAY_SUBTITLE");
            if (d12 != null) {
                str2 = gv.r.i1(d12).toString();
            } else {
                str2 = null;
            }
            this.B.i(new a(d10, y12, str, str2, a.C0504a.a(this.f29728y, mediaMetadataCompat.c("android.media.metadata.DURATION")), false));
        }
        androidx.lifecycle.w<Integer> wVar = this.D;
        int i10 = playbackStateCompat.f915u;
        if (i10 != 6 && i10 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i6 = R.drawable.ic_pause;
        } else {
            i6 = R.drawable.ic_play;
        }
        wVar.i(Integer.valueOf(i6));
        this.E.i(Integer.valueOf(playbackStateCompat.f915u));
    }
}
