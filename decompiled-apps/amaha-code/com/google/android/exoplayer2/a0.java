package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.b;
import com.google.android.exoplayer2.c;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.w;
import com.google.android.exoplayer2.x;
import com.google.android.gms.internal.p000firebaseauthapi.le;
import com.theinnerhour.b2b.utils.Constants;
import e9.j;
import g8.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p7.o;
/* compiled from: SimpleExoPlayer.java */
@Deprecated
/* loaded from: classes.dex */
public final class a0 extends d implements j {
    public boolean A;
    public List<p8.a> B;
    public final boolean C;
    public boolean D;
    public boolean E;
    public i F;
    public d9.q G;

    /* renamed from: b  reason: collision with root package name */
    public final z[] f6166b;

    /* renamed from: c  reason: collision with root package name */
    public final c9.d f6167c;

    /* renamed from: d  reason: collision with root package name */
    public final k f6168d;

    /* renamed from: e  reason: collision with root package name */
    public final a f6169e;
    public final b f;

    /* renamed from: g  reason: collision with root package name */
    public final CopyOnWriteArraySet<w.d> f6170g;

    /* renamed from: h  reason: collision with root package name */
    public final p7.n f6171h;

    /* renamed from: i  reason: collision with root package name */
    public final com.google.android.exoplayer2.b f6172i;

    /* renamed from: j  reason: collision with root package name */
    public final c f6173j;

    /* renamed from: k  reason: collision with root package name */
    public final c0 f6174k;

    /* renamed from: l  reason: collision with root package name */
    public final o7.y f6175l;

    /* renamed from: m  reason: collision with root package name */
    public final o7.z f6176m;

    /* renamed from: n  reason: collision with root package name */
    public final long f6177n;

    /* renamed from: o  reason: collision with root package name */
    public AudioTrack f6178o;

    /* renamed from: p  reason: collision with root package name */
    public Object f6179p;

    /* renamed from: q  reason: collision with root package name */
    public Surface f6180q;
    public SurfaceHolder r;

    /* renamed from: s  reason: collision with root package name */
    public e9.j f6181s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6182t;

    /* renamed from: u  reason: collision with root package name */
    public TextureView f6183u;

    /* renamed from: v  reason: collision with root package name */
    public int f6184v;

    /* renamed from: w  reason: collision with root package name */
    public int f6185w;

    /* renamed from: x  reason: collision with root package name */
    public final int f6186x;

    /* renamed from: y  reason: collision with root package name */
    public q7.d f6187y;

    /* renamed from: z  reason: collision with root package name */
    public float f6188z;

    /* compiled from: SimpleExoPlayer.java */
    /* loaded from: classes.dex */
    public static final class b implements d9.j, e9.a, x.b {

        /* renamed from: u  reason: collision with root package name */
        public d9.j f6190u;

        /* renamed from: v  reason: collision with root package name */
        public e9.a f6191v;

        /* renamed from: w  reason: collision with root package name */
        public d9.j f6192w;

        /* renamed from: x  reason: collision with root package name */
        public e9.a f6193x;

        @Override // e9.a
        public final void a(long j10, float[] fArr) {
            e9.a aVar = this.f6193x;
            if (aVar != null) {
                aVar.a(j10, fArr);
            }
            e9.a aVar2 = this.f6191v;
            if (aVar2 != null) {
                aVar2.a(j10, fArr);
            }
        }

        @Override // e9.a
        public final void c() {
            e9.a aVar = this.f6193x;
            if (aVar != null) {
                aVar.c();
            }
            e9.a aVar2 = this.f6191v;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // d9.j
        public final void d(long j10, long j11, n nVar, MediaFormat mediaFormat) {
            d9.j jVar = this.f6192w;
            if (jVar != null) {
                jVar.d(j10, j11, nVar, mediaFormat);
            }
            d9.j jVar2 = this.f6190u;
            if (jVar2 != null) {
                jVar2.d(j10, j11, nVar, mediaFormat);
            }
        }

        @Override // com.google.android.exoplayer2.x.b
        public final void o(int i6, Object obj) {
            if (i6 != 7) {
                if (i6 != 8) {
                    if (i6 == 10000) {
                        e9.j jVar = (e9.j) obj;
                        if (jVar == null) {
                            this.f6192w = null;
                            this.f6193x = null;
                            return;
                        }
                        this.f6192w = jVar.getVideoFrameMetadataListener();
                        this.f6193x = jVar.getCameraMotionListener();
                        return;
                    }
                    return;
                }
                this.f6191v = (e9.a) obj;
                return;
            }
            this.f6190u = (d9.j) obj;
        }
    }

    public a0(j.b bVar) {
        a0 a0Var;
        Context context;
        int i6;
        a aVar;
        b bVar2;
        Handler handler;
        int generateAudioSessionId;
        k kVar;
        c9.d dVar = new c9.d();
        this.f6167c = dVar;
        try {
            context = bVar.f6516a;
            Context applicationContext = context.getApplicationContext();
            p7.n nVar = bVar.f6522h.get();
            this.f6171h = nVar;
            this.f6187y = bVar.f6524j;
            i6 = bVar.f6525k;
            this.A = false;
            this.f6177n = bVar.r;
            aVar = new a();
            this.f6169e = aVar;
            bVar2 = new b();
            this.f = bVar2;
            this.f6170g = new CopyOnWriteArraySet<>();
            handler = new Handler(bVar.f6523i);
            z[] a10 = bVar.f6518c.get().a(handler, aVar, aVar, aVar, aVar);
            this.f6166b = a10;
            this.f6188z = 1.0f;
            if (c9.w.f5205a < 21) {
                AudioTrack audioTrack = this.f6178o;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f6178o.release();
                    this.f6178o = null;
                }
                if (this.f6178o == null) {
                    this.f6178o = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f6186x = this.f6178o.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
                if (audioManager == null) {
                    generateAudioSessionId = -1;
                } else {
                    generateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.f6186x = generateAudioSessionId;
            }
            this.B = Collections.emptyList();
            this.C = true;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {21, 22, 23, 24, 25, 26, 27, 28};
            for (int i10 = 0; i10 < 8; i10++) {
                int i11 = iArr[i10];
                sc.b.C(!false);
                sparseBooleanArray.append(i11, true);
            }
            sc.b.C(!false);
            try {
                kVar = new k(a10, bVar.f6520e.get(), bVar.f6519d.get(), bVar.f.get(), bVar.f6521g.get(), nVar, bVar.f6526l, bVar.f6527m, bVar.f6528n, bVar.f6529o, bVar.f6530p, bVar.f6531q, bVar.f6517b, bVar.f6523i, this, new w.a(new c9.h(sparseBooleanArray)));
                a0Var = this;
            } catch (Throwable th2) {
                th = th2;
                a0Var = this;
            }
        } catch (Throwable th3) {
            th = th3;
            a0Var = this;
        }
        try {
            a0Var.f6168d = kVar;
            kVar.i0(aVar);
            kVar.f6540j.add(aVar);
            com.google.android.exoplayer2.b bVar3 = new com.google.android.exoplayer2.b(context, handler, aVar);
            a0Var.f6172i = bVar3;
            bVar3.a(false);
            c cVar = new c(context, handler, aVar);
            a0Var.f6173j = cVar;
            cVar.c(null);
            c0 c0Var = new c0(context, handler, aVar);
            a0Var.f6174k = c0Var;
            c0Var.b(c9.w.r(a0Var.f6187y.f29245w));
            a0Var.f6175l = new o7.y(context);
            a0Var.f6176m = new o7.z(context);
            a0Var.F = k0(c0Var);
            a0Var.G = d9.q.f12712y;
            a0Var.p0(1, 10, Integer.valueOf(a0Var.f6186x));
            a0Var.p0(2, 10, Integer.valueOf(a0Var.f6186x));
            a0Var.p0(1, 3, a0Var.f6187y);
            a0Var.p0(2, 4, Integer.valueOf(i6));
            a0Var.p0(2, 5, 0);
            a0Var.p0(1, 9, Boolean.valueOf(a0Var.A));
            a0Var.p0(2, 7, bVar2);
            a0Var.p0(6, 8, bVar2);
            dVar.c();
        } catch (Throwable th4) {
            th = th4;
            a0Var.f6167c.c();
            throw th;
        }
    }

    public static void i0(a0 a0Var) {
        int p10 = a0Var.p();
        o7.z zVar = a0Var.f6176m;
        o7.y yVar = a0Var.f6175l;
        if (p10 != 1) {
            if (p10 != 2 && p10 != 3) {
                if (p10 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                a0Var.v0();
                boolean z10 = a0Var.f6168d.E.f27249p;
                a0Var.h();
                yVar.getClass();
                a0Var.h();
                zVar.getClass();
                return;
            }
        }
        yVar.getClass();
        zVar.getClass();
    }

    public static i k0(c0 c0Var) {
        int i6;
        c0Var.getClass();
        if (c9.w.f5205a >= 28) {
            i6 = c0Var.f6349d.getStreamMinVolume(c0Var.f);
        } else {
            i6 = 0;
        }
        return new i(0, i6, c0Var.f6349d.getStreamMaxVolume(c0Var.f));
    }

    @Override // com.google.android.exoplayer2.w
    public final void B(int i6) {
        v0();
        this.f6168d.B(i6);
    }

    @Override // com.google.android.exoplayer2.w
    public final long C() {
        v0();
        return this.f6168d.f6548s;
    }

    @Override // com.google.android.exoplayer2.w
    public final long D() {
        v0();
        return this.f6168d.D();
    }

    @Override // com.google.android.exoplayer2.w
    public final void E(w.d dVar) {
        dVar.getClass();
        this.f6170g.add(dVar);
        this.f6168d.i0(dVar);
    }

    @Override // com.google.android.exoplayer2.w
    public final long F() {
        v0();
        return this.f6168d.F();
    }

    @Override // com.google.android.exoplayer2.w
    public final List<p8.a> G() {
        v0();
        return this.B;
    }

    @Override // com.google.android.exoplayer2.w
    public final int I() {
        v0();
        return this.f6168d.I();
    }

    @Override // com.google.android.exoplayer2.w
    public final w.a J() {
        v0();
        return this.f6168d.B;
    }

    @Override // com.google.android.exoplayer2.w
    public final int K() {
        v0();
        return this.f6168d.K();
    }

    @Override // com.google.android.exoplayer2.w
    public final void M(SurfaceView surfaceView) {
        SurfaceHolder holder;
        v0();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        v0();
        if (holder != null && holder == this.r) {
            j0();
        }
    }

    @Override // com.google.android.exoplayer2.w
    public final int O() {
        v0();
        return this.f6168d.E.f27246m;
    }

    @Override // com.google.android.exoplayer2.w
    public final f0 P() {
        v0();
        return this.f6168d.P();
    }

    @Override // com.google.android.exoplayer2.w
    public final e0 Q() {
        v0();
        return this.f6168d.E.f27235a;
    }

    @Override // com.google.android.exoplayer2.w
    public final Looper R() {
        return this.f6168d.f6546p;
    }

    @Override // com.google.android.exoplayer2.w
    public final boolean S() {
        v0();
        return this.f6168d.f6551v;
    }

    @Override // com.google.android.exoplayer2.w
    public final long T() {
        v0();
        return this.f6168d.T();
    }

    @Override // com.google.android.exoplayer2.w
    public final void W(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        v0();
        if (textureView == null) {
            j0();
            return;
        }
        o0();
        this.f6183u = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f6169e);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            s0(null);
            m0(0, 0);
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        s0(surface);
        this.f6180q = surface;
        m0(textureView.getWidth(), textureView.getHeight());
    }

    @Override // com.google.android.exoplayer2.w
    public final r Y() {
        return this.f6168d.C;
    }

    @Override // com.google.android.exoplayer2.w
    public final void Z(List list) {
        v0();
        this.f6168d.Z(list);
    }

    @Override // com.google.android.exoplayer2.w
    public final void a() {
        AudioTrack audioTrack;
        v0();
        if (c9.w.f5205a < 21 && (audioTrack = this.f6178o) != null) {
            audioTrack.release();
            this.f6178o = null;
        }
        this.f6172i.a(false);
        c0 c0Var = this.f6174k;
        c0.b bVar = c0Var.f6350e;
        if (bVar != null) {
            try {
                c0Var.f6346a.unregisterReceiver(bVar);
            } catch (RuntimeException e10) {
                ca.a.B1("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            c0Var.f6350e = null;
        }
        this.f6175l.getClass();
        this.f6176m.getClass();
        c cVar = this.f6173j;
        cVar.f6339c = null;
        cVar.a();
        this.f6168d.a();
        p7.n nVar = this.f6171h;
        c9.i iVar = nVar.B;
        sc.b.E(iVar);
        iVar.f(new androidx.activity.b(19, nVar));
        o0();
        Surface surface = this.f6180q;
        if (surface != null) {
            surface.release();
            this.f6180q = null;
        }
        this.B = Collections.emptyList();
        this.E = true;
    }

    @Override // com.google.android.exoplayer2.w
    public final long a0() {
        v0();
        return this.f6168d.r;
    }

    @Override // com.google.android.exoplayer2.w
    public final boolean b() {
        v0();
        return this.f6168d.b();
    }

    @Override // com.google.android.exoplayer2.w
    public final v c() {
        v0();
        return this.f6168d.E.f27247n;
    }

    @Override // com.google.android.exoplayer2.w
    public final void d(v vVar) {
        v0();
        this.f6168d.d(vVar);
    }

    @Override // com.google.android.exoplayer2.w
    public final long e() {
        v0();
        return this.f6168d.e();
    }

    @Override // com.google.android.exoplayer2.w
    public final void f(int i6, long j10) {
        v0();
        p7.n nVar = this.f6171h;
        if (!nVar.C) {
            o.a m02 = nVar.m0();
            nVar.C = true;
            nVar.r0(m02, -1, new p7.e(m02, 0));
        }
        this.f6168d.f(i6, j10);
    }

    @Override // com.google.android.exoplayer2.w
    public final void g(ArrayList arrayList, int i6, long j10) {
        v0();
        this.f6168d.g(arrayList, i6, j10);
    }

    @Override // com.google.android.exoplayer2.w
    public final long getCurrentPosition() {
        v0();
        return this.f6168d.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.w
    public final long getDuration() {
        v0();
        return this.f6168d.getDuration();
    }

    @Override // com.google.android.exoplayer2.w
    public final boolean h() {
        v0();
        return this.f6168d.E.f27245l;
    }

    public final void j0() {
        v0();
        o0();
        s0(null);
        m0(0, 0);
    }

    @Override // com.google.android.exoplayer2.w
    public final void k(boolean z10) {
        v0();
        this.f6168d.k(z10);
    }

    @Override // com.google.android.exoplayer2.w
    public final void l() {
        v0();
        boolean h10 = h();
        int i6 = 2;
        int e10 = this.f6173j.e(2, h10);
        u0(e10, (!h10 || e10 == 1) ? 1 : 1, h10);
        this.f6168d.l();
    }

    @Override // com.google.android.exoplayer2.w
    /* renamed from: l0 */
    public final ExoPlaybackException H() {
        v0();
        return this.f6168d.E.f;
    }

    @Override // com.google.android.exoplayer2.w
    @Deprecated
    public final void m(boolean z10) {
        v0();
        this.f6173j.e(1, h());
        this.f6168d.y0(z10, null);
        this.B = Collections.emptyList();
    }

    public final void m0(int i6, int i10) {
        if (i6 != this.f6184v || i10 != this.f6185w) {
            this.f6184v = i6;
            this.f6185w = i10;
            this.f6171h.e0(i6, i10);
            Iterator<w.d> it = this.f6170g.iterator();
            while (it.hasNext()) {
                it.next().e0(i6, i10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.w
    public final void n() {
        v0();
        this.f6168d.getClass();
    }

    @Deprecated
    public final void n0(com.google.android.exoplayer2.source.n nVar) {
        v0();
        List<com.google.android.exoplayer2.source.i> singletonList = Collections.singletonList(nVar);
        v0();
        this.f6168d.w0(singletonList, -1, -9223372036854775807L, true);
        l();
    }

    @Override // com.google.android.exoplayer2.w
    public final void o() {
        v0();
        this.f6168d.o();
    }

    public final void o0() {
        e9.j jVar = this.f6181s;
        a aVar = this.f6169e;
        if (jVar != null) {
            x m02 = this.f6168d.m0(this.f);
            sc.b.C(!m02.f7212g);
            m02.f7210d = Constants.TIMEOUT_MS;
            sc.b.C(!m02.f7212g);
            m02.f7211e = null;
            m02.c();
            this.f6181s.f13910u.remove(aVar);
            this.f6181s = null;
        }
        TextureView textureView = this.f6183u;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != aVar) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f6183u.setSurfaceTextureListener(null);
            }
            this.f6183u = null;
        }
        SurfaceHolder surfaceHolder = this.r;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(aVar);
            this.r = null;
        }
    }

    @Override // com.google.android.exoplayer2.w
    public final int p() {
        v0();
        return this.f6168d.E.f27239e;
    }

    public final void p0(int i6, int i10, Object obj) {
        z[] zVarArr;
        for (z zVar : this.f6166b) {
            if (zVar.v() == i6) {
                x m02 = this.f6168d.m0(zVar);
                sc.b.C(!m02.f7212g);
                m02.f7210d = i10;
                sc.b.C(!m02.f7212g);
                m02.f7211e = obj;
                m02.c();
            }
        }
    }

    public final void q0(q7.d dVar, boolean z10) {
        v0();
        if (this.E) {
            return;
        }
        int i6 = 1;
        if (!c9.w.a(this.f6187y, dVar)) {
            this.f6187y = dVar;
            p0(1, 3, dVar);
            this.f6174k.b(c9.w.r(dVar.f29245w));
            this.f6171h.i0(dVar);
            Iterator<w.d> it = this.f6170g.iterator();
            while (it.hasNext()) {
                it.next().i0(dVar);
            }
        }
        if (!z10) {
            dVar = null;
        }
        c cVar = this.f6173j;
        cVar.c(dVar);
        boolean h10 = h();
        int e10 = cVar.e(p(), h10);
        if (h10 && e10 != 1) {
            i6 = 2;
        }
        u0(e10, i6, h10);
    }

    @Override // com.google.android.exoplayer2.w
    public final int r() {
        v0();
        return this.f6168d.f6550u;
    }

    public final void r0(SurfaceHolder surfaceHolder) {
        this.f6182t = false;
        this.r = surfaceHolder;
        surfaceHolder.addCallback(this.f6169e);
        Surface surface = this.r.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.r.getSurfaceFrame();
            m0(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        m0(0, 0);
    }

    @Override // com.google.android.exoplayer2.w
    public final int s() {
        v0();
        return this.f6168d.s();
    }

    public final void s0(Object obj) {
        boolean z10;
        k kVar;
        ArrayList arrayList = new ArrayList();
        z[] zVarArr = this.f6166b;
        int length = zVarArr.length;
        int i6 = 0;
        while (true) {
            z10 = true;
            kVar = this.f6168d;
            if (i6 >= length) {
                break;
            }
            z zVar = zVarArr[i6];
            if (zVar.v() == 2) {
                x m02 = kVar.m0(zVar);
                sc.b.C(!m02.f7212g);
                m02.f7210d = 1;
                sc.b.C(true ^ m02.f7212g);
                m02.f7211e = obj;
                m02.c();
                arrayList.add(m02);
            }
            i6++;
        }
        Object obj2 = this.f6179p;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((x) it.next()).a(this.f6177n);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f6179p;
            Surface surface = this.f6180q;
            if (obj3 == surface) {
                surface.release();
                this.f6180q = null;
            }
        } else {
            z10 = false;
        }
        this.f6179p = obj;
        if (z10) {
            kVar.y0(false, new ExoPlaybackException(2, new ExoTimeoutException(3), 1003));
        }
    }

    @Override // com.google.android.exoplayer2.w
    public final void stop() {
        m(false);
    }

    @Override // com.google.android.exoplayer2.w
    public final void t(TextureView textureView) {
        v0();
        if (textureView != null && textureView == this.f6183u) {
            j0();
        }
    }

    public final void t0(float f) {
        v0();
        float g5 = c9.w.g(f, 0.0f, 1.0f);
        if (this.f6188z == g5) {
            return;
        }
        this.f6188z = g5;
        p0(1, 2, Float.valueOf(this.f6173j.f6342g * g5));
        this.f6171h.w(g5);
        Iterator<w.d> it = this.f6170g.iterator();
        while (it.hasNext()) {
            it.next().w(g5);
        }
    }

    @Override // com.google.android.exoplayer2.w
    public final d9.q u() {
        return this.G;
    }

    public final void u0(int i6, int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        if (z10 && i6 != -1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && i6 != 1) {
            i11 = 1;
        }
        this.f6168d.x0(i11, i10, z11);
    }

    @Override // com.google.android.exoplayer2.w
    public final void v(w.d dVar) {
        dVar.getClass();
        this.f6170g.remove(dVar);
        this.f6168d.u0(dVar);
    }

    public final void v0() {
        IllegalStateException illegalStateException;
        c9.d dVar = this.f6167c;
        synchronized (dVar) {
            boolean z10 = false;
            while (!dVar.f5132b) {
                try {
                    dVar.wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f6168d.f6546p.getThread()) {
            String k10 = c9.w.k("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), this.f6168d.f6546p.getThread().getName());
            if (!this.C) {
                if (this.D) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                ca.a.B1("SimpleExoPlayer", k10, illegalStateException);
                this.D = true;
                return;
            }
            throw new IllegalStateException(k10);
        }
    }

    @Override // com.google.android.exoplayer2.w
    public final int w() {
        v0();
        return this.f6168d.w();
    }

    @Override // com.google.android.exoplayer2.w
    public final void x(SurfaceView surfaceView) {
        SurfaceHolder holder;
        v0();
        if (surfaceView instanceof d9.i) {
            o0();
            s0(surfaceView);
            r0(surfaceView.getHolder());
            return;
        }
        boolean z10 = surfaceView instanceof e9.j;
        a aVar = this.f6169e;
        if (z10) {
            o0();
            this.f6181s = (e9.j) surfaceView;
            x m02 = this.f6168d.m0(this.f);
            sc.b.C(!m02.f7212g);
            m02.f7210d = Constants.TIMEOUT_MS;
            e9.j jVar = this.f6181s;
            sc.b.C(true ^ m02.f7212g);
            m02.f7211e = jVar;
            m02.c();
            this.f6181s.f13910u.add(aVar);
            s0(this.f6181s.getVideoSurface());
            r0(surfaceView.getHolder());
            return;
        }
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        v0();
        if (holder == null) {
            j0();
            return;
        }
        o0();
        this.f6182t = true;
        this.r = holder;
        holder.addCallback(aVar);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            s0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            m0(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        s0(null);
        m0(0, 0);
    }

    @Override // com.google.android.exoplayer2.w
    public final void z(boolean z10) {
        v0();
        int e10 = this.f6173j.e(p(), z10);
        int i6 = 1;
        if (z10 && e10 != 1) {
            i6 = 2;
        }
        u0(e10, i6, z10);
    }

    /* compiled from: SimpleExoPlayer.java */
    /* loaded from: classes.dex */
    public final class a implements d9.o, com.google.android.exoplayer2.audio.a, p8.l, g8.e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, j.b, c.b, b.InterfaceC0133b, c0.a, w.b, j.a {
        public a() {
        }

        @Override // com.google.android.exoplayer2.audio.a
        public final void B(String str) {
            a0.this.f6171h.B(str);
        }

        @Override // d9.o
        public final void E(le leVar) {
            a0.this.f6171h.E(leVar);
        }

        @Override // d9.o
        public final void F(int i6, long j10) {
            a0.this.f6171h.F(i6, j10);
        }

        @Override // d9.o
        public final void H(long j10, String str, long j11) {
            a0.this.f6171h.H(j10, str, j11);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public final void M(le leVar) {
            a0.this.f6171h.M(leVar);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public final void P(le leVar) {
            a0 a0Var = a0.this;
            a0Var.getClass();
            a0Var.f6171h.P(leVar);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public final void Q(long j10, String str, long j11) {
            a0.this.f6171h.Q(j10, str, j11);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public final void S(Exception exc) {
            a0.this.f6171h.S(exc);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public final void U(n nVar, r7.f fVar) {
            a0 a0Var = a0.this;
            a0Var.getClass();
            a0Var.f6171h.U(nVar, fVar);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public final void W(long j10) {
            a0.this.f6171h.W(j10);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public final void Y(Exception exc) {
            a0.this.f6171h.Y(exc);
        }

        @Override // d9.o
        public final void Z(Exception exc) {
            a0.this.f6171h.Z(exc);
        }

        @Override // g8.e
        public final void a(g8.a aVar) {
            a0 a0Var = a0.this;
            a0Var.f6171h.a(aVar);
            k kVar = a0Var.f6168d;
            r rVar = kVar.D;
            rVar.getClass();
            r.a aVar2 = new r.a(rVar);
            int i6 = 0;
            while (true) {
                a.b[] bVarArr = aVar.f16378u;
                if (i6 >= bVarArr.length) {
                    break;
                }
                bVarArr[i6].r(aVar2);
                i6++;
            }
            kVar.D = new r(aVar2);
            r k02 = kVar.k0();
            if (!k02.equals(kVar.C)) {
                kVar.C = k02;
                o7.l lVar = new o7.l(kVar, 2);
                c9.j<w.b> jVar = kVar.f6539i;
                jVar.b(14, lVar);
                jVar.a();
            }
            Iterator<w.d> it = a0Var.f6170g.iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }

        @Override // d9.o
        public final void a0(n nVar, r7.f fVar) {
            a0 a0Var = a0.this;
            a0Var.getClass();
            a0Var.f6171h.a0(nVar, fVar);
        }

        @Override // d9.o
        public final void b0(long j10, Object obj) {
            a0 a0Var = a0.this;
            a0Var.f6171h.b0(j10, obj);
            if (a0Var.f6179p == obj) {
                Iterator<w.d> it = a0Var.f6170g.iterator();
                while (it.hasNext()) {
                    it.next().f();
                }
            }
        }

        @Override // d9.o
        public final void c(d9.q qVar) {
            a0 a0Var = a0.this;
            a0Var.G = qVar;
            a0Var.f6171h.c(qVar);
            Iterator<w.d> it = a0Var.f6170g.iterator();
            while (it.hasNext()) {
                it.next().c(qVar);
            }
        }

        @Override // d9.o
        public final void c0(le leVar) {
            a0 a0Var = a0.this;
            a0Var.getClass();
            a0Var.f6171h.c0(leVar);
        }

        @Override // com.google.android.exoplayer2.audio.a
        public final void g(boolean z10) {
            a0 a0Var = a0.this;
            if (a0Var.A == z10) {
                return;
            }
            a0Var.A = z10;
            a0Var.f6171h.g(z10);
            Iterator<w.d> it = a0Var.f6170g.iterator();
            while (it.hasNext()) {
                it.next().g(a0Var.A);
            }
        }

        @Override // p8.l
        public final void h(List<p8.a> list) {
            a0 a0Var = a0.this;
            a0Var.B = list;
            Iterator<w.d> it = a0Var.f6170g.iterator();
            while (it.hasNext()) {
                it.next().h(list);
            }
        }

        @Override // com.google.android.exoplayer2.audio.a
        public final void j0(int i6, long j10, long j11) {
            a0.this.f6171h.j0(i6, j10, j11);
        }

        @Override // d9.o
        public final void m(String str) {
            a0.this.f6171h.m(str);
        }

        @Override // e9.j.b
        public final void n() {
            a0.this.s0(null);
        }

        @Override // d9.o
        public final void o(int i6, long j10) {
            a0.this.f6171h.o(i6, j10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i6, int i10) {
            a0 a0Var = a0.this;
            a0Var.getClass();
            Surface surface = new Surface(surfaceTexture);
            a0Var.s0(surface);
            a0Var.f6180q = surface;
            a0Var.m0(i6, i10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            a0 a0Var = a0.this;
            a0Var.s0(null);
            a0Var.m0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i6, int i10) {
            a0.this.m0(i6, i10);
        }

        @Override // e9.j.b
        public final void p(Surface surface) {
            a0.this.s0(surface);
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void s(boolean z10) {
            a0.this.getClass();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i6, int i10, int i11) {
            a0.this.m0(i10, i11);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            a0 a0Var = a0.this;
            if (a0Var.f6182t) {
                a0Var.s0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            a0 a0Var = a0.this;
            if (a0Var.f6182t) {
                a0Var.s0(null);
            }
            a0Var.m0(0, 0);
        }

        @Override // com.google.android.exoplayer2.j.a
        public final void u() {
            a0.i0(a0.this);
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void v(int i6, boolean z10) {
            a0.i0(a0.this);
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void x(int i6) {
            a0.i0(a0.this);
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void b() {
        }

        @Override // com.google.android.exoplayer2.audio.a
        public final /* synthetic */ void d() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void d0() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void e() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void i() {
        }

        @Override // d9.o
        public final /* synthetic */ void j() {
        }

        @Override // com.google.android.exoplayer2.j.a
        public final /* synthetic */ void k() {
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

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void f0(v vVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void l(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void l0(boolean z10) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void q(ExoPlaybackException exoPlaybackException) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void r(f0 f0Var) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void t(w.a aVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void y(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void D(w wVar, w.c cVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void G(o8.p pVar, z8.h hVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void R(q qVar, int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void V(int i6, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void z(int i6, w.e eVar, w.e eVar2) {
        }
    }
}
