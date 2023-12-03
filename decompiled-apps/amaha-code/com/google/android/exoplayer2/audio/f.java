package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import androidx.appcompat.widget.l;
import c9.k;
import c9.w;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.c;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.z;
import com.google.android.gms.internal.p000firebaseauthapi.le;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: MediaCodecAudioRenderer.java */
/* loaded from: classes.dex */
public final class f extends MediaCodecRenderer implements k {
    public final Context Y0;
    public final a.C0132a Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final AudioSink f6288a1;
    public int b1;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f6289c1;

    /* renamed from: d1  reason: collision with root package name */
    public n f6290d1;

    /* renamed from: e1  reason: collision with root package name */
    public long f6291e1;

    /* renamed from: f1  reason: collision with root package name */
    public boolean f6292f1;
    public boolean g1;

    /* renamed from: h1  reason: collision with root package name */
    public boolean f6293h1;

    /* renamed from: i1  reason: collision with root package name */
    public z.a f6294i1;

    /* compiled from: MediaCodecAudioRenderer.java */
    /* loaded from: classes.dex */
    public final class a implements AudioSink.a {
        public a() {
        }

        public final void a(Exception exc) {
            ca.a.Q("MediaCodecAudioRenderer", "Audio sink error", exc);
            a.C0132a c0132a = f.this.Z0;
            Handler handler = c0132a.f6253a;
            if (handler != null) {
                handler.post(new q7.i(c0132a, exc, 0));
            }
        }
    }

    public f(Context context, com.google.android.exoplayer2.mediacodec.b bVar, Handler handler, a0.a aVar, DefaultAudioSink defaultAudioSink) {
        super(1, bVar, 44100.0f);
        this.Y0 = context.getApplicationContext();
        this.f6288a1 = defaultAudioSink;
        this.Z0 = new a.C0132a(handler, aVar);
        defaultAudioSink.f6219p = new a();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public final void A(boolean z10, long j10) {
        super.A(z10, j10);
        this.f6288a1.flush();
        this.f6291e1 = j10;
        this.f6292f1 = true;
        this.g1 = true;
    }

    @Override // com.google.android.exoplayer2.e
    public final void B() {
        AudioSink audioSink = this.f6288a1;
        try {
            J();
            k0();
            DrmSession drmSession = this.W;
            if (drmSession != null) {
                drmSession.b(null);
            }
            this.W = null;
        } finally {
            if (this.f6293h1) {
                this.f6293h1 = false;
                audioSink.reset();
            }
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void C() {
        this.f6288a1.q();
    }

    @Override // com.google.android.exoplayer2.e
    public final void D() {
        w0();
        this.f6288a1.pause();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final r7.f H(com.google.android.exoplayer2.mediacodec.d dVar, n nVar, n nVar2) {
        int i6;
        r7.f b10 = dVar.b(nVar, nVar2);
        int v02 = v0(nVar2, dVar);
        int i10 = this.b1;
        int i11 = b10.f30545e;
        if (v02 > i10) {
            i11 |= 64;
        }
        int i12 = i11;
        String str = dVar.f6638a;
        if (i12 != 0) {
            i6 = 0;
        } else {
            i6 = b10.f30544d;
        }
        return new r7.f(str, nVar, nVar2, i6, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final float R(float f, n[] nVarArr) {
        int i6 = -1;
        for (n nVar : nVarArr) {
            int i10 = nVar.T;
            if (i10 != -1) {
                i6 = Math.max(i6, i10);
            }
        }
        if (i6 == -1) {
            return -1.0f;
        }
        return f * i6;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final List<com.google.android.exoplayer2.mediacodec.d> S(com.google.android.exoplayer2.mediacodec.e eVar, n nVar, boolean z10) {
        com.google.android.exoplayer2.mediacodec.d dVar;
        String str = nVar.F;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f6288a1.a(nVar)) {
            List<com.google.android.exoplayer2.mediacodec.d> d10 = MediaCodecUtil.d("audio/raw", false, false);
            if (d10.isEmpty()) {
                dVar = null;
            } else {
                dVar = d10.get(0);
            }
            if (dVar != null) {
                return Collections.singletonList(dVar);
            }
        }
        List<com.google.android.exoplayer2.mediacodec.d> a10 = eVar.a(str, z10, false);
        Pattern pattern = MediaCodecUtil.f6618a;
        ArrayList arrayList = new ArrayList(a10);
        Collections.sort(arrayList, new f8.j(0, new f8.i(nVar)));
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.addAll(eVar.a("audio/eac3", z10, false));
            arrayList = arrayList2;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c.a U(com.google.android.exoplayer2.mediacodec.d dVar, n nVar, MediaCrypto mediaCrypto, float f) {
        boolean z10;
        MediaFormat mediaFormat;
        n nVar2;
        boolean z11;
        n[] nVarArr = this.A;
        nVarArr.getClass();
        int v02 = v0(nVar, dVar);
        boolean z12 = false;
        if (nVarArr.length != 1) {
            for (n nVar3 : nVarArr) {
                if (dVar.b(nVar, nVar3).f30544d != 0) {
                    v02 = Math.max(v02, v0(nVar3, dVar));
                }
            }
        }
        this.b1 = v02;
        int i6 = w.f5205a;
        if (i6 < 24 && "OMX.SEC.aac.dec".equals(dVar.f6638a) && "samsung".equals(w.f5207c)) {
            String str = w.f5206b;
            if (str.startsWith("zeroflte") || str.startsWith("herolte") || str.startsWith("heroqlte")) {
                z10 = true;
                this.f6289c1 = z10;
                int i10 = this.b1;
                mediaFormat = new MediaFormat();
                mediaFormat.setString("mime", dVar.f6640c);
                mediaFormat.setInteger("channel-count", nVar.S);
                int i11 = nVar.T;
                mediaFormat.setInteger("sample-rate", i11);
                sc.b.e0(mediaFormat, nVar.H);
                sc.b.T(mediaFormat, "max-input-size", i10);
                if (i6 >= 23) {
                    mediaFormat.setInteger("priority", 0);
                    if (f != -1.0f) {
                        if (i6 == 23) {
                            String str2 = w.f5208d;
                            if ("ZTE B2017G".equals(str2) || "AXON 7 mini".equals(str2)) {
                                z11 = true;
                                if (!z11) {
                                    mediaFormat.setFloat("operating-rate", f);
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    }
                }
                String str3 = nVar.F;
                if (i6 <= 28 && "audio/ac4".equals(str3)) {
                    mediaFormat.setInteger("ac4-is-sync", 1);
                }
                if (i6 >= 24) {
                    n.a aVar = new n.a();
                    aVar.f6665k = "audio/raw";
                    aVar.f6677x = nVar.S;
                    aVar.f6678y = i11;
                    aVar.f6679z = 4;
                    if (this.f6288a1.r(aVar.a()) == 2) {
                        mediaFormat.setInteger("pcm-encoding", 4);
                    }
                }
                if ("audio/raw".equals(dVar.f6639b) && !"audio/raw".equals(str3)) {
                    z12 = true;
                }
                if (!z12) {
                    nVar2 = nVar;
                } else {
                    nVar2 = null;
                }
                this.f6290d1 = nVar2;
                return new c.a(dVar, mediaFormat, nVar, null, mediaCrypto);
            }
        }
        z10 = false;
        this.f6289c1 = z10;
        int i102 = this.b1;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", dVar.f6640c);
        mediaFormat.setInteger("channel-count", nVar.S);
        int i112 = nVar.T;
        mediaFormat.setInteger("sample-rate", i112);
        sc.b.e0(mediaFormat, nVar.H);
        sc.b.T(mediaFormat, "max-input-size", i102);
        if (i6 >= 23) {
        }
        String str32 = nVar.F;
        if (i6 <= 28) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i6 >= 24) {
        }
        if ("audio/raw".equals(dVar.f6639b)) {
            z12 = true;
        }
        if (!z12) {
        }
        this.f6290d1 = nVar2;
        return new c.a(dVar, mediaFormat, nVar, null, mediaCrypto);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void Z(Exception exc) {
        ca.a.Q("MediaCodecAudioRenderer", "Audio codec error", exc);
        a.C0132a c0132a = this.Z0;
        Handler handler = c0132a.f6253a;
        if (handler != null) {
            handler.post(new q7.i(c0132a, exc, 1));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void a0(long j10, String str, long j11) {
        a.C0132a c0132a = this.Z0;
        Handler handler = c0132a.f6253a;
        if (handler != null) {
            handler.post(new q7.j(c0132a, str, j10, j11, 0));
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z
    public final boolean b() {
        if (this.P0 && this.f6288a1.b()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void b0(String str) {
        a.C0132a c0132a = this.Z0;
        Handler handler = c0132a.f6253a;
        if (handler != null) {
            handler.post(new q7.f(c0132a, 0, str));
        }
    }

    @Override // c9.k
    public final v c() {
        return this.f6288a1.c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final r7.f c0(l lVar) {
        r7.f c0 = super.c0(lVar);
        n nVar = (n) lVar.f1472w;
        a.C0132a c0132a = this.Z0;
        Handler handler = c0132a.f6253a;
        if (handler != null) {
            handler.post(new androidx.emoji2.text.g(6, c0132a, nVar, c0));
        }
        return c0;
    }

    @Override // c9.k
    public final void d(v vVar) {
        this.f6288a1.d(vVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[LOOP:0: B:30:0x0080->B:31:0x0082, LOOP_END] */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d0(n nVar, MediaFormat mediaFormat) {
        int i6;
        int i10;
        int i11;
        n nVar2 = this.f6290d1;
        int[] iArr = null;
        if (nVar2 != null) {
            nVar = nVar2;
        } else if (this.c0 != null) {
            if (!"audio/raw".equals(nVar.F)) {
                if (w.f5205a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                    i6 = mediaFormat.getInteger("pcm-encoding");
                } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                    i6 = w.p(mediaFormat.getInteger("v-bits-per-sample"));
                } else if (!"audio/raw".equals(nVar.F)) {
                    i6 = 2;
                }
                n.a aVar = new n.a();
                aVar.f6665k = "audio/raw";
                aVar.f6679z = i6;
                aVar.A = nVar.V;
                aVar.B = nVar.W;
                aVar.f6677x = mediaFormat.getInteger("channel-count");
                aVar.f6678y = mediaFormat.getInteger("sample-rate");
                n nVar3 = new n(aVar);
                if (this.f6289c1 && nVar3.S == 6 && (i10 = nVar.S) < 6) {
                    int[] iArr2 = new int[i10];
                    for (i11 = 0; i11 < i10; i11++) {
                        iArr2[i11] = i11;
                    }
                    iArr = iArr2;
                }
                nVar = nVar3;
            }
            i6 = nVar.U;
            n.a aVar2 = new n.a();
            aVar2.f6665k = "audio/raw";
            aVar2.f6679z = i6;
            aVar2.A = nVar.V;
            aVar2.B = nVar.W;
            aVar2.f6677x = mediaFormat.getInteger("channel-count");
            aVar2.f6678y = mediaFormat.getInteger("sample-rate");
            n nVar32 = new n(aVar2);
            if (this.f6289c1) {
                int[] iArr22 = new int[i10];
                while (i11 < i10) {
                }
                iArr = iArr22;
            }
            nVar = nVar32;
        }
        try {
            this.f6288a1.i(nVar, iArr);
        } catch (AudioSink.ConfigurationException e10) {
            throw w(5001, e10.f6200u, e10, false);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void f0() {
        this.f6288a1.l();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void g0(DecoderInputBuffer decoderInputBuffer) {
        if (this.f6292f1 && !decoderInputBuffer.l()) {
            if (Math.abs(decoderInputBuffer.f6362y - this.f6291e1) > 500000) {
                this.f6291e1 = decoderInputBuffer.f6362y;
            }
            this.f6292f1 = false;
        }
    }

    @Override // com.google.android.exoplayer2.z, o7.u
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean i0(long j10, long j11, com.google.android.exoplayer2.mediacodec.c cVar, ByteBuffer byteBuffer, int i6, int i10, int i11, long j12, boolean z10, boolean z11, n nVar) {
        byteBuffer.getClass();
        if (this.f6290d1 != null && (i10 & 2) != 0) {
            cVar.getClass();
            cVar.j(i6, false);
            return true;
        }
        AudioSink audioSink = this.f6288a1;
        if (z10) {
            if (cVar != null) {
                cVar.j(i6, false);
            }
            this.T0.getClass();
            audioSink.l();
            return true;
        }
        try {
            if (!audioSink.p(byteBuffer, j12, i11)) {
                return false;
            }
            if (cVar != null) {
                cVar.j(i6, false);
            }
            this.T0.getClass();
            return true;
        } catch (AudioSink.InitializationException e10) {
            throw w(5001, e10.f6202v, e10, e10.f6201u);
        } catch (AudioSink.WriteException e11) {
            throw w(5002, nVar, e11, e11.f6203u);
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.z
    public final boolean isReady() {
        if (!this.f6288a1.g() && !super.isReady()) {
            return false;
        }
        return true;
    }

    @Override // c9.k
    public final long j() {
        if (this.f6462y == 2) {
            w0();
        }
        return this.f6291e1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final void l0() {
        try {
            this.f6288a1.f();
        } catch (AudioSink.WriteException e10) {
            throw w(5002, e10.f6204v, e10, e10.f6203u);
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.x.b
    public final void o(int i6, Object obj) {
        AudioSink audioSink = this.f6288a1;
        if (i6 != 2) {
            if (i6 != 3) {
                if (i6 != 6) {
                    switch (i6) {
                        case 9:
                            audioSink.s(((Boolean) obj).booleanValue());
                            return;
                        case 10:
                            audioSink.h(((Integer) obj).intValue());
                            return;
                        case 11:
                            this.f6294i1 = (z.a) obj;
                            return;
                        default:
                            return;
                    }
                }
                audioSink.e((q7.n) obj);
                return;
            }
            audioSink.o((q7.d) obj);
            return;
        }
        audioSink.m(((Float) obj).floatValue());
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public final boolean q0(n nVar) {
        return this.f6288a1.a(nVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
        if (r4 != null) goto L25;
     */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int r0(com.google.android.exoplayer2.mediacodec.e eVar, n nVar) {
        int i6;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        com.google.android.exoplayer2.mediacodec.d dVar;
        if (!c9.l.h(nVar.F)) {
            return 0;
        }
        if (w.f5205a >= 21) {
            i6 = 32;
        } else {
            i6 = 0;
        }
        int i12 = nVar.Y;
        if (i12 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 != 0 && i12 != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        AudioSink audioSink = this.f6288a1;
        if (z11 && audioSink.a(nVar)) {
            if (z10) {
                List<com.google.android.exoplayer2.mediacodec.d> d10 = MediaCodecUtil.d("audio/raw", false, false);
                if (d10.isEmpty()) {
                    dVar = null;
                } else {
                    dVar = d10.get(0);
                }
            }
            return i6 | 12;
        }
        if ("audio/raw".equals(nVar.F) && !audioSink.a(nVar)) {
            return 1;
        }
        n.a aVar = new n.a();
        aVar.f6665k = "audio/raw";
        aVar.f6677x = nVar.S;
        aVar.f6678y = nVar.T;
        aVar.f6679z = 2;
        if (!audioSink.a(aVar.a())) {
            return 1;
        }
        List<com.google.android.exoplayer2.mediacodec.d> S = S(eVar, nVar, false);
        if (S.isEmpty()) {
            return 1;
        }
        if (!z11) {
            return 2;
        }
        com.google.android.exoplayer2.mediacodec.d dVar2 = S.get(0);
        boolean c10 = dVar2.c(nVar);
        if (c10 && dVar2.d(nVar)) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        if (c10) {
            i11 = 4;
        } else {
            i11 = 3;
        }
        return i10 | i11 | i6;
    }

    public final int v0(n nVar, com.google.android.exoplayer2.mediacodec.d dVar) {
        int i6;
        if ("OMX.google.raw.decoder".equals(dVar.f6638a) && (i6 = w.f5205a) < 24 && (i6 != 23 || !w.x(this.Y0))) {
            return -1;
        }
        return nVar.G;
    }

    public final void w0() {
        long j10 = this.f6288a1.j(b());
        if (j10 != Long.MIN_VALUE) {
            if (!this.g1) {
                j10 = Math.max(this.f6291e1, j10);
            }
            this.f6291e1 = j10;
            this.g1 = false;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.e
    public final void y() {
        a.C0132a c0132a = this.Z0;
        this.f6293h1 = true;
        try {
            this.f6288a1.flush();
            try {
                super.y();
            } finally {
            }
        } catch (Throwable th2) {
            try {
                super.y();
                throw th2;
            } finally {
            }
        }
    }

    @Override // com.google.android.exoplayer2.e
    public final void z(boolean z10, boolean z11) {
        le leVar = new le();
        this.T0 = leVar;
        a.C0132a c0132a = this.Z0;
        Handler handler = c0132a.f6253a;
        if (handler != null) {
            handler.post(new q7.h(c0132a, leVar, 1));
        }
        o7.v vVar = this.f6460w;
        vVar.getClass();
        boolean z12 = vVar.f27254a;
        AudioSink audioSink = this.f6288a1;
        if (z12) {
            audioSink.n();
        } else {
            audioSink.k();
        }
    }

    @Override // com.google.android.exoplayer2.e, com.google.android.exoplayer2.z
    public final k u() {
        return this;
    }
}
