package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import c9.w;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.audio.b;
import com.google.android.exoplayer2.audio.f;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.z;
import com.theinnerhour.b2b.utils.Constants;
import j$.util.Objects;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import q7.k;
import q7.l;
import q7.m;
import q7.n;
import q7.p;
import q7.q;
import u7.x;
/* loaded from: classes.dex */
public final class DefaultAudioSink implements AudioSink {
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public float H;
    public AudioProcessor[] I;
    public ByteBuffer[] J;
    public ByteBuffer K;
    public int L;
    public ByteBuffer M;
    public byte[] N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public n V;
    public boolean W;
    public long X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public final q7.e f6205a;

    /* renamed from: b  reason: collision with root package name */
    public final b f6206b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6207c;

    /* renamed from: d  reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.d f6208d;

    /* renamed from: e  reason: collision with root package name */
    public final j f6209e;
    public final AudioProcessor[] f;

    /* renamed from: g  reason: collision with root package name */
    public final AudioProcessor[] f6210g;

    /* renamed from: h  reason: collision with root package name */
    public final ConditionVariable f6211h;

    /* renamed from: i  reason: collision with root package name */
    public final com.google.android.exoplayer2.audio.b f6212i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayDeque<e> f6213j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f6214k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6215l;

    /* renamed from: m  reason: collision with root package name */
    public h f6216m;

    /* renamed from: n  reason: collision with root package name */
    public final f<AudioSink.InitializationException> f6217n;

    /* renamed from: o  reason: collision with root package name */
    public final f<AudioSink.WriteException> f6218o;

    /* renamed from: p  reason: collision with root package name */
    public AudioSink.a f6219p;

    /* renamed from: q  reason: collision with root package name */
    public c f6220q;
    public c r;

    /* renamed from: s  reason: collision with root package name */
    public AudioTrack f6221s;

    /* renamed from: t  reason: collision with root package name */
    public q7.d f6222t;

    /* renamed from: u  reason: collision with root package name */
    public e f6223u;

    /* renamed from: v  reason: collision with root package name */
    public e f6224v;

    /* renamed from: w  reason: collision with root package name */
    public v f6225w;

    /* renamed from: x  reason: collision with root package name */
    public ByteBuffer f6226x;

    /* renamed from: y  reason: collision with root package name */
    public int f6227y;

    /* renamed from: z  reason: collision with root package name */
    public long f6228z;

    /* loaded from: classes.dex */
    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        public InvalidAudioTrackTimestampException() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class a extends Thread {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ AudioTrack f6229u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AudioTrack audioTrack) {
            super("ExoPlayer:AudioTrackReleaseThread");
            this.f6229u = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            AudioTrack audioTrack = this.f6229u;
            try {
                audioTrack.flush();
                audioTrack.release();
            } finally {
                defaultAudioSink.f6211h.open();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        v a(v vVar);

        long b(long j10);

        long c();

        boolean d(boolean z10);
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final com.google.android.exoplayer2.n f6231a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6232b;

        /* renamed from: c  reason: collision with root package name */
        public final int f6233c;

        /* renamed from: d  reason: collision with root package name */
        public final int f6234d;

        /* renamed from: e  reason: collision with root package name */
        public final int f6235e;
        public final int f;

        /* renamed from: g  reason: collision with root package name */
        public final int f6236g;

        /* renamed from: h  reason: collision with root package name */
        public final int f6237h;

        /* renamed from: i  reason: collision with root package name */
        public final AudioProcessor[] f6238i;

        public c(com.google.android.exoplayer2.n nVar, int i6, int i10, int i11, int i12, int i13, int i14, boolean z10, AudioProcessor[] audioProcessorArr) {
            float f;
            int h10;
            this.f6231a = nVar;
            this.f6232b = i6;
            this.f6233c = i10;
            this.f6234d = i11;
            this.f6235e = i12;
            this.f = i13;
            this.f6236g = i14;
            this.f6238i = audioProcessorArr;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        h10 = d(250000L);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    h10 = d(50000000L);
                }
            } else {
                if (z10) {
                    f = 8.0f;
                } else {
                    f = 1.0f;
                }
                int minBufferSize = AudioTrack.getMinBufferSize(i12, i13, i14);
                sc.b.C(minBufferSize != -2);
                h10 = w.h(minBufferSize * 4, ((int) ((250000 * i12) / 1000000)) * i11, Math.max(minBufferSize, ((int) ((750000 * i12) / 1000000)) * i11));
                if (f != 1.0f) {
                    h10 = Math.round(h10 * f);
                }
            }
            this.f6237h = h10;
        }

        public static AudioAttributes c(q7.d dVar, boolean z10) {
            if (z10) {
                return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            }
            return dVar.b();
        }

        public final AudioTrack a(boolean z10, q7.d dVar, int i6) {
            boolean z11;
            boolean z12;
            int i10 = this.f6233c;
            try {
                AudioTrack b10 = b(z10, dVar, i6);
                int state = b10.getState();
                if (state == 1) {
                    return b10;
                }
                try {
                    b10.release();
                } catch (Exception unused) {
                }
                int i11 = this.f6235e;
                int i12 = this.f;
                int i13 = this.f6237h;
                com.google.android.exoplayer2.n nVar = this.f6231a;
                if (i10 == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                throw new AudioSink.InitializationException(state, i11, i12, i13, nVar, z12, null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                int i14 = this.f6235e;
                int i15 = this.f;
                int i16 = this.f6237h;
                com.google.android.exoplayer2.n nVar2 = this.f6231a;
                if (i10 == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                throw new AudioSink.InitializationException(0, i14, i15, i16, nVar2, z11, e10);
            }
        }

        public final AudioTrack b(boolean z10, q7.d dVar, int i6) {
            AudioTrack.Builder offloadedPlayback;
            int i10 = w.f5205a;
            int i11 = this.f6236g;
            int i12 = this.f;
            int i13 = this.f6235e;
            if (i10 >= 29) {
                AudioFormat v10 = DefaultAudioSink.v(i13, i12, i11);
                AudioAttributes c10 = c(dVar, z10);
                boolean z11 = true;
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c10).setAudioFormat(v10).setTransferMode(1).setBufferSizeInBytes(this.f6237h).setSessionId(i6);
                if (this.f6233c != 1) {
                    z11 = false;
                }
                offloadedPlayback = sessionId.setOffloadedPlayback(z11);
                return offloadedPlayback.build();
            } else if (i10 >= 21) {
                return new AudioTrack(c(dVar, z10), DefaultAudioSink.v(i13, i12, i11), this.f6237h, 1, i6);
            } else {
                int r = w.r(dVar.f29245w);
                if (i6 == 0) {
                    return new AudioTrack(r, this.f6235e, this.f, this.f6236g, this.f6237h, 1);
                }
                return new AudioTrack(r, this.f6235e, this.f, this.f6236g, this.f6237h, 1, i6);
            }
        }

        public final int d(long j10) {
            int i6;
            int i10 = this.f6236g;
            switch (i10) {
                case 5:
                    i6 = 80000;
                    break;
                case 6:
                case 18:
                    i6 = 768000;
                    break;
                case 7:
                    i6 = 192000;
                    break;
                case 8:
                    i6 = 2250000;
                    break;
                case 9:
                    i6 = 40000;
                    break;
                case 10:
                    i6 = 100000;
                    break;
                case 11:
                    i6 = 16000;
                    break;
                case 12:
                    i6 = 7000;
                    break;
                case 13:
                default:
                    throw new IllegalArgumentException();
                case 14:
                    i6 = 3062500;
                    break;
                case 15:
                    i6 = 8000;
                    break;
                case 16:
                    i6 = 256000;
                    break;
                case 17:
                    i6 = 336000;
                    break;
            }
            if (i10 == 5) {
                i6 *= 2;
            }
            return (int) ((j10 * i6) / 1000000);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public final AudioProcessor[] f6239a;

        /* renamed from: b  reason: collision with root package name */
        public final com.google.android.exoplayer2.audio.h f6240b;

        /* renamed from: c  reason: collision with root package name */
        public final i f6241c;

        public d(AudioProcessor... audioProcessorArr) {
            com.google.android.exoplayer2.audio.h hVar = new com.google.android.exoplayer2.audio.h();
            i iVar = new i();
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.f6239a = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.f6240b = hVar;
            this.f6241c = iVar;
            audioProcessorArr2[audioProcessorArr.length] = hVar;
            audioProcessorArr2[audioProcessorArr.length + 1] = iVar;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public final v a(v vVar) {
            float f = vVar.f7195u;
            i iVar = this.f6241c;
            if (iVar.f6308c != f) {
                iVar.f6308c = f;
                iVar.f6313i = true;
            }
            float f2 = iVar.f6309d;
            float f10 = vVar.f7196v;
            if (f2 != f10) {
                iVar.f6309d = f10;
                iVar.f6313i = true;
            }
            return vVar;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public final long b(long j10) {
            i iVar = this.f6241c;
            if (iVar.f6319o >= 1024) {
                long j11 = iVar.f6318n;
                q qVar = iVar.f6314j;
                qVar.getClass();
                long j12 = j11 - ((qVar.f29314k * qVar.f29306b) * 2);
                int i6 = iVar.f6312h.f6196a;
                int i10 = iVar.f6311g.f6196a;
                if (i6 == i10) {
                    return w.C(j10, j12, iVar.f6319o);
                }
                return w.C(j10, j12 * i6, iVar.f6319o * i10);
            }
            return (long) (iVar.f6308c * j10);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public final long c() {
            return this.f6240b.f6306t;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.b
        public final boolean d(boolean z10) {
            this.f6240b.f6300m = z10;
            return z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final v f6242a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6243b;

        /* renamed from: c  reason: collision with root package name */
        public final long f6244c;

        /* renamed from: d  reason: collision with root package name */
        public final long f6245d;

        public e(v vVar, boolean z10, long j10, long j11) {
            this.f6242a = vVar;
            this.f6243b = z10;
            this.f6244c = j10;
            this.f6245d = j11;
        }
    }

    /* loaded from: classes.dex */
    public static final class f<T extends Exception> {

        /* renamed from: a  reason: collision with root package name */
        public T f6246a;

        /* renamed from: b  reason: collision with root package name */
        public long f6247b;

        public final void a(T t3) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f6246a == null) {
                this.f6246a = t3;
                this.f6247b = 100 + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f6247b) {
                T t10 = this.f6246a;
                if (t10 != t3) {
                    t10.addSuppressed(t3);
                }
                T t11 = this.f6246a;
                this.f6246a = null;
                throw t11;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class g implements b.a {
        public g() {
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public final void a(long j10) {
            a.C0132a c0132a;
            Handler handler;
            AudioSink.a aVar = DefaultAudioSink.this.f6219p;
            if (aVar != null && (handler = (c0132a = com.google.android.exoplayer2.audio.f.this.Z0).f6253a) != null) {
                handler.post(new q7.g(0, j10, c0132a));
            }
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public final void b(int i6, long j10) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            if (defaultAudioSink.f6219p != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - defaultAudioSink.X;
                a.C0132a c0132a = com.google.android.exoplayer2.audio.f.this.Z0;
                Handler handler = c0132a.f6253a;
                if (handler != null) {
                    handler.post(new l(c0132a, i6, j10, elapsedRealtime, 0));
                }
            }
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public final void c(long j10) {
            StringBuilder sb2 = new StringBuilder(61);
            sb2.append("Ignoring impossibly large audio latency: ");
            sb2.append(j10);
            Log.w("DefaultAudioSink", sb2.toString());
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public final void d(long j10, long j11, long j12, long j13) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            long y10 = defaultAudioSink.y();
            long z10 = defaultAudioSink.z();
            StringBuilder sb2 = new StringBuilder(182);
            sb2.append("Spurious audio timestamp (frame position mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            sb2.append(y10);
            sb2.append(", ");
            sb2.append(z10);
            Log.w("DefaultAudioSink", sb2.toString());
        }

        @Override // com.google.android.exoplayer2.audio.b.a
        public final void e(long j10, long j11, long j12, long j13) {
            DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
            long y10 = defaultAudioSink.y();
            long z10 = defaultAudioSink.z();
            StringBuilder sb2 = new StringBuilder((int) SubsamplingScaleImageView.ORIENTATION_180);
            sb2.append("Spurious audio timestamp (system clock mismatch): ");
            sb2.append(j10);
            sb2.append(", ");
            sb2.append(j11);
            sb2.append(", ");
            sb2.append(j12);
            sb2.append(", ");
            sb2.append(j13);
            sb2.append(", ");
            sb2.append(y10);
            sb2.append(", ");
            sb2.append(z10);
            Log.w("DefaultAudioSink", sb2.toString());
        }
    }

    /* loaded from: classes.dex */
    public final class h {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f6249a = new Handler();

        /* renamed from: b  reason: collision with root package name */
        public final a f6250b = new a();

        /* loaded from: classes.dex */
        public class a extends AudioTrack.StreamEventCallback {
            public a() {
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onDataRequest(AudioTrack audioTrack, int i6) {
                boolean z10;
                z.a aVar;
                if (audioTrack == DefaultAudioSink.this.f6221s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sc.b.C(z10);
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.a aVar2 = defaultAudioSink.f6219p;
                if (aVar2 != null && defaultAudioSink.S && (aVar = com.google.android.exoplayer2.audio.f.this.f6294i1) != null) {
                    aVar.a();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public final void onTearDown(AudioTrack audioTrack) {
                boolean z10;
                z.a aVar;
                if (audioTrack == DefaultAudioSink.this.f6221s) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                sc.b.C(z10);
                DefaultAudioSink defaultAudioSink = DefaultAudioSink.this;
                AudioSink.a aVar2 = defaultAudioSink.f6219p;
                if (aVar2 != null && defaultAudioSink.S && (aVar = com.google.android.exoplayer2.audio.f.this.f6294i1) != null) {
                    aVar.a();
                }
            }
        }

        public h() {
        }
    }

    public DefaultAudioSink(q7.e eVar, d dVar) {
        this.f6205a = eVar;
        this.f6206b = dVar;
        int i6 = w.f5205a;
        this.f6207c = false;
        this.f6214k = false;
        this.f6215l = 0;
        this.f6211h = new ConditionVariable(true);
        this.f6212i = new com.google.android.exoplayer2.audio.b(new g());
        com.google.android.exoplayer2.audio.d dVar2 = new com.google.android.exoplayer2.audio.d();
        this.f6208d = dVar2;
        j jVar = new j();
        this.f6209e = jVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new com.google.android.exoplayer2.audio.g(), dVar2, jVar);
        Collections.addAll(arrayList, dVar.f6239a);
        this.f = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.f6210g = new AudioProcessor[]{new com.google.android.exoplayer2.audio.e()};
        this.H = 1.0f;
        this.f6222t = q7.d.f29242z;
        this.U = 0;
        this.V = new n();
        v vVar = v.f7194x;
        this.f6224v = new e(vVar, false, 0L, 0L);
        this.f6225w = vVar;
        this.P = -1;
        this.I = new AudioProcessor[0];
        this.J = new ByteBuffer[0];
        this.f6213j = new ArrayDeque<>();
        this.f6217n = new f<>();
        this.f6218o = new f<>();
    }

    public static boolean C(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (w.f5205a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    public static AudioFormat v(int i6, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i6).setChannelMask(i10).setEncoding(i11).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> w(com.google.android.exoplayer2.n nVar, q7.e eVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        int m10;
        boolean isDirectPlaybackSupported;
        boolean z13;
        if (eVar == null) {
            return null;
        }
        String str = nVar.F;
        str.getClass();
        int b10 = c9.l.b(str, nVar.C);
        int i6 = 8;
        int i10 = 0;
        if (b10 != 5 && b10 != 6 && b10 != 18 && b10 != 17 && b10 != 7 && b10 != 8 && b10 != 14) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return null;
        }
        int[] iArr = eVar.f29251a;
        if (b10 == 18) {
            if (Arrays.binarySearch(iArr, 18) >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                b10 = 6;
                if (Arrays.binarySearch(iArr, b10) < 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    return null;
                }
                if (b10 == 18) {
                    if (w.f5205a >= 29) {
                        AudioAttributes build = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
                        int i11 = 8;
                        while (true) {
                            if (i11 <= 0) {
                                break;
                            }
                            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(18).setSampleRate(nVar.T).setChannelMask(w.m(i11)).build(), build);
                            if (isDirectPlaybackSupported) {
                                i10 = i11;
                                break;
                            }
                            i11--;
                        }
                        if (i10 == 0) {
                            Log.w("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                            return null;
                        }
                    } else {
                        i10 = 6;
                    }
                } else {
                    int i12 = eVar.f29252b;
                    i10 = nVar.S;
                    if (i10 > i12) {
                        return null;
                    }
                }
                int i13 = w.f5205a;
                if (i13 <= 28) {
                    if (i10 != 7) {
                        if (i10 == 3 || i10 == 4 || i10 == 5) {
                            i6 = 6;
                        }
                    }
                    if (i13 <= 26 && "fugu".equals(w.f5206b) && i6 == 1) {
                        i6 = 2;
                    }
                    m10 = w.m(i6);
                    if (m10 != 0) {
                        return null;
                    }
                    return Pair.create(Integer.valueOf(b10), Integer.valueOf(m10));
                }
                i6 = i10;
                if (i13 <= 26) {
                    i6 = 2;
                }
                m10 = w.m(i6);
                if (m10 != 0) {
                }
            }
        }
        if (b10 == 8) {
            if (Arrays.binarySearch(iArr, 8) >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                b10 = 7;
            }
        }
        if (Arrays.binarySearch(iArr, b10) < 0) {
        }
        if (z12) {
        }
    }

    public final void A() {
        boolean z10;
        this.f6211h.block();
        boolean z11 = false;
        try {
            c cVar = this.r;
            cVar.getClass();
            AudioTrack a10 = cVar.a(this.W, this.f6222t, this.U);
            this.f6221s = a10;
            if (C(a10)) {
                AudioTrack audioTrack = this.f6221s;
                if (this.f6216m == null) {
                    this.f6216m = new h();
                }
                h hVar = this.f6216m;
                Handler handler = hVar.f6249a;
                Objects.requireNonNull(handler);
                audioTrack.registerStreamEventCallback(new r1.a(1, handler), hVar.f6250b);
                if (this.f6215l != 3) {
                    AudioTrack audioTrack2 = this.f6221s;
                    com.google.android.exoplayer2.n nVar = this.r.f6231a;
                    audioTrack2.setOffloadDelayPadding(nVar.V, nVar.W);
                }
            }
            this.U = this.f6221s.getAudioSessionId();
            com.google.android.exoplayer2.audio.b bVar = this.f6212i;
            AudioTrack audioTrack3 = this.f6221s;
            c cVar2 = this.r;
            if (cVar2.f6233c == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            bVar.c(audioTrack3, z10, cVar2.f6236g, cVar2.f6234d, cVar2.f6237h);
            I();
            int i6 = this.V.f29288a;
            if (i6 != 0) {
                this.f6221s.attachAuxEffect(i6);
                this.f6221s.setAuxEffectSendLevel(this.V.f29289b);
            }
            this.F = true;
        } catch (AudioSink.InitializationException e10) {
            if (this.r.f6233c == 1) {
                z11 = true;
            }
            if (z11) {
                this.Y = true;
            }
            AudioSink.a aVar = this.f6219p;
            if (aVar != null) {
                ((f.a) aVar).a(e10);
            }
            throw e10;
        }
    }

    public final boolean B() {
        if (this.f6221s != null) {
            return true;
        }
        return false;
    }

    public final void D() {
        if (!this.R) {
            this.R = true;
            long z10 = z();
            com.google.android.exoplayer2.audio.b bVar = this.f6212i;
            bVar.f6278z = bVar.a();
            bVar.f6276x = SystemClock.elapsedRealtime() * 1000;
            bVar.A = z10;
            this.f6221s.stop();
            this.f6227y = 0;
        }
    }

    public final void E(long j10) {
        ByteBuffer byteBuffer;
        int length = this.I.length;
        int i6 = length;
        while (i6 >= 0) {
            if (i6 > 0) {
                byteBuffer = this.J[i6 - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.f6194a;
                }
            }
            if (i6 == length) {
                L(byteBuffer, j10);
            } else {
                AudioProcessor audioProcessor = this.I[i6];
                if (i6 > this.P) {
                    audioProcessor.d(byteBuffer);
                }
                ByteBuffer c10 = audioProcessor.c();
                this.J[i6] = c10;
                if (c10.hasRemaining()) {
                    i6++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i6--;
        }
    }

    public final void F() {
        this.f6228z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        int i6 = 0;
        this.Z = false;
        this.D = 0;
        this.f6224v = new e(x().f6242a, x().f6243b, 0L, 0L);
        this.G = 0L;
        this.f6223u = null;
        this.f6213j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.f6226x = null;
        this.f6227y = 0;
        this.f6209e.f6327o = 0L;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.I;
            if (i6 < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i6];
                audioProcessor.flush();
                this.J[i6] = audioProcessor.c();
                i6++;
            } else {
                return;
            }
        }
    }

    public final void G(v vVar, boolean z10) {
        e x10 = x();
        if (!vVar.equals(x10.f6242a) || z10 != x10.f6243b) {
            e eVar = new e(vVar, z10, -9223372036854775807L, -9223372036854775807L);
            if (B()) {
                this.f6223u = eVar;
            } else {
                this.f6224v = eVar;
            }
        }
    }

    public final void H(v vVar) {
        if (B()) {
            try {
                this.f6221s.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(vVar.f7195u).setPitch(vVar.f7196v).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                ca.a.B1("DefaultAudioSink", "Failed to set playback params", e10);
            }
            vVar = new v(this.f6221s.getPlaybackParams().getSpeed(), this.f6221s.getPlaybackParams().getPitch());
            com.google.android.exoplayer2.audio.b bVar = this.f6212i;
            bVar.f6263j = vVar.f7195u;
            m mVar = bVar.f;
            if (mVar != null) {
                mVar.a();
            }
        }
        this.f6225w = vVar;
    }

    public final void I() {
        if (B()) {
            if (w.f5205a >= 21) {
                this.f6221s.setVolume(this.H);
                return;
            }
            AudioTrack audioTrack = this.f6221s;
            float f2 = this.H;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean J() {
        boolean z10;
        boolean z11;
        if (this.W || !"audio/raw".equals(this.r.f6231a.F)) {
            return false;
        }
        int i6 = this.r.f6231a.U;
        if (this.f6207c) {
            int i10 = w.f5205a;
            if (i6 != 536870912 && i6 != 805306368 && i6 != 4) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                z10 = true;
                if (!z10) {
                    return false;
                }
                return true;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    public final boolean K(com.google.android.exoplayer2.n nVar, q7.d dVar) {
        int i6;
        int m10;
        boolean isOffloadedPlaybackSupported;
        int i10;
        boolean z10;
        boolean z11;
        int i11 = w.f5205a;
        if (i11 < 29 || (i6 = this.f6215l) == 0) {
            return false;
        }
        String str = nVar.F;
        str.getClass();
        int b10 = c9.l.b(str, nVar.C);
        if (b10 == 0 || (m10 = w.m(nVar.S)) == 0) {
            return false;
        }
        AudioFormat v10 = v(nVar.T, m10, b10);
        AudioAttributes b11 = dVar.b();
        if (i11 >= 31) {
            i10 = AudioManager.getPlaybackOffloadSupport(v10, b11);
        } else {
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(v10, b11);
            if (!isOffloadedPlaybackSupported) {
                i10 = 0;
            } else if (i11 == 30 && w.f5208d.startsWith("Pixel")) {
                i10 = 2;
            } else {
                i10 = 1;
            }
        }
        if (i10 == 0) {
            return false;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                return true;
            }
            throw new IllegalStateException();
        }
        if (nVar.V == 0 && nVar.W == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i6 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && z11) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00df, code lost:
        if (r13 < r12) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L(ByteBuffer byteBuffer, long j10) {
        int write;
        boolean z10;
        boolean z11;
        boolean z12;
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.M;
        boolean z13 = true;
        boolean z14 = false;
        if (byteBuffer2 != null) {
            if (byteBuffer2 == byteBuffer) {
                z12 = true;
            } else {
                z12 = false;
            }
            sc.b.q(z12);
        } else {
            this.M = byteBuffer;
            if (w.f5205a < 21) {
                int remaining = byteBuffer.remaining();
                byte[] bArr = this.N;
                if (bArr == null || bArr.length < remaining) {
                    this.N = new byte[remaining];
                }
                int position = byteBuffer.position();
                byteBuffer.get(this.N, 0, remaining);
                byteBuffer.position(position);
                this.O = 0;
            }
        }
        int remaining2 = byteBuffer.remaining();
        int i6 = w.f5205a;
        com.google.android.exoplayer2.audio.b bVar = this.f6212i;
        if (i6 < 21) {
            int a10 = bVar.f6259e - ((int) (this.B - (bVar.a() * bVar.f6258d)));
            if (a10 > 0) {
                write = this.f6221s.write(this.N, this.O, Math.min(remaining2, a10));
                if (write > 0) {
                    this.O += write;
                    byteBuffer.position(byteBuffer.position() + write);
                }
            }
            write = 0;
        } else if (this.W) {
            if (j10 != -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.C(z10);
            AudioTrack audioTrack = this.f6221s;
            if (i6 >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j10 * 1000);
            } else {
                if (this.f6226x == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f6226x = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f6226x.putInt(1431633921);
                }
                if (this.f6227y == 0) {
                    this.f6226x.putInt(4, remaining2);
                    this.f6226x.putLong(8, j10 * 1000);
                    this.f6226x.position(0);
                    this.f6227y = remaining2;
                }
                int remaining3 = this.f6226x.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack.write(this.f6226x, remaining3, 1);
                    if (write2 < 0) {
                        this.f6227y = 0;
                        write = write2;
                    }
                }
                write = audioTrack.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.f6227y = 0;
                } else {
                    this.f6227y -= write;
                }
            }
        } else {
            write = this.f6221s.write(byteBuffer, remaining2, 1);
        }
        this.X = SystemClock.elapsedRealtime();
        f<AudioSink.WriteException> fVar = this.f6218o;
        if (write < 0) {
            if ((i6 >= 24 && write == -6) || write == -32) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.r.f6233c == 1) {
                    z14 = true;
                }
                if (z14) {
                    this.Y = true;
                }
            }
            AudioSink.WriteException writeException = new AudioSink.WriteException(write, this.r.f6231a, z11);
            AudioSink.a aVar = this.f6219p;
            if (aVar != null) {
                ((f.a) aVar).a(writeException);
            }
            if (!writeException.f6203u) {
                fVar.a(writeException);
                return;
            }
            throw writeException;
        }
        fVar.f6246a = null;
        if (C(this.f6221s)) {
            long j11 = this.C;
            if (j11 > 0) {
                this.Z = false;
            }
            if (this.S && this.f6219p != null && write < remaining2 && !this.Z) {
                long E = w.E(((j11 - bVar.a()) * 1000000) / bVar.f6260g);
                z.a aVar2 = com.google.android.exoplayer2.audio.f.this.f6294i1;
                if (aVar2 != null) {
                    aVar2.b(E);
                }
            }
        }
        int i10 = this.r.f6233c;
        if (i10 == 0) {
            this.B += write;
        }
        if (write == remaining2) {
            if (i10 != 0) {
                if (byteBuffer != this.K) {
                    z13 = false;
                }
                sc.b.C(z13);
                this.C += this.D * this.L;
            }
            this.M = null;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean a(com.google.android.exoplayer2.n nVar) {
        if (r(nVar) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean b() {
        if (B() && (!this.Q || g())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final v c() {
        if (this.f6214k) {
            return this.f6225w;
        }
        return x().f6242a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void d(v vVar) {
        v vVar2 = new v(w.g(vVar.f7195u, 0.1f, 8.0f), w.g(vVar.f7196v, 0.1f, 8.0f));
        if (this.f6214k && w.f5205a >= 23) {
            H(vVar2);
        } else {
            G(vVar2, x().f6243b);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void e(n nVar) {
        if (this.V.equals(nVar)) {
            return;
        }
        int i6 = nVar.f29288a;
        AudioTrack audioTrack = this.f6221s;
        if (audioTrack != null) {
            if (this.V.f29288a != i6) {
                audioTrack.attachAuxEffect(i6);
            }
            if (i6 != 0) {
                this.f6221s.setAuxEffectSendLevel(nVar.f29289b);
            }
        }
        this.V = nVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void f() {
        if (!this.Q && B() && u()) {
            D();
            this.Q = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void flush() {
        boolean z10;
        if (B()) {
            F();
            com.google.android.exoplayer2.audio.b bVar = this.f6212i;
            AudioTrack audioTrack = bVar.f6257c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f6221s.pause();
            }
            if (C(this.f6221s)) {
                h hVar = this.f6216m;
                hVar.getClass();
                this.f6221s.unregisterStreamEventCallback(hVar.f6250b);
                hVar.f6249a.removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.f6221s;
            this.f6221s = null;
            if (w.f5205a < 21 && !this.T) {
                this.U = 0;
            }
            c cVar = this.f6220q;
            if (cVar != null) {
                this.r = cVar;
                this.f6220q = null;
            }
            bVar.f6265l = 0L;
            bVar.f6275w = 0;
            bVar.f6274v = 0;
            bVar.f6266m = 0L;
            bVar.C = 0L;
            bVar.F = 0L;
            bVar.f6264k = false;
            bVar.f6257c = null;
            bVar.f = null;
            this.f6211h.close();
            new a(audioTrack2).start();
        }
        this.f6218o.f6246a = null;
        this.f6217n.f6246a = null;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final boolean g() {
        if (B() && this.f6212i.b(z())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void h(int i6) {
        boolean z10;
        if (this.U != i6) {
            this.U = i6;
            if (i6 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T = z10;
            flush();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r7 != false) goto L13;
     */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(com.google.android.exoplayer2.n nVar, int[] iArr) {
        int intValue;
        int intValue2;
        AudioProcessor[] audioProcessorArr;
        int i6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        AudioProcessor[] audioProcessorArr2;
        int[] iArr2;
        boolean z10;
        boolean equals = "audio/raw".equals(nVar.F);
        int i15 = 1;
        int i16 = nVar.T;
        int i17 = nVar.S;
        if (equals) {
            int i18 = nVar.U;
            sc.b.q(w.w(i18));
            i13 = w.q(i18, i17);
            if (this.f6207c) {
                if (i18 != 536870912 && i18 != 805306368 && i18 != 4) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            i15 = 0;
            if (i15 != 0) {
                audioProcessorArr2 = this.f6210g;
            } else {
                audioProcessorArr2 = this.f;
            }
            int i19 = nVar.V;
            j jVar = this.f6209e;
            jVar.f6321i = i19;
            jVar.f6322j = nVar.W;
            if (w.f5205a < 21 && i17 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i20 = 0; i20 < 6; i20++) {
                    iArr2[i20] = i20;
                }
            } else {
                iArr2 = iArr;
            }
            this.f6208d.f6285i = iArr2;
            AudioProcessor.a aVar = new AudioProcessor.a(i16, i17, i18);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.a e10 = audioProcessor.e(aVar);
                    if (audioProcessor.a()) {
                        aVar = e10;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e11) {
                    throw new AudioSink.ConfigurationException(e11, nVar);
                }
            }
            int i21 = aVar.f6198c;
            int i22 = aVar.f6197b;
            int m10 = w.m(i22);
            int q10 = w.q(i21, i22);
            i6 = aVar.f6196a;
            i11 = i21;
            audioProcessorArr = audioProcessorArr2;
            i10 = m10;
            i12 = q10;
            i14 = 0;
        } else {
            AudioProcessor[] audioProcessorArr3 = new AudioProcessor[0];
            if (K(nVar, this.f6222t)) {
                String str = nVar.F;
                str.getClass();
                intValue = c9.l.b(str, nVar.C);
                intValue2 = w.m(i17);
            } else {
                Pair<Integer, Integer> w10 = w(nVar, this.f6205a);
                if (w10 != null) {
                    intValue = ((Integer) w10.first).intValue();
                    intValue2 = ((Integer) w10.second).intValue();
                    i15 = 2;
                } else {
                    String valueOf = String.valueOf(nVar);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 37);
                    sb2.append("Unable to configure passthrough for: ");
                    sb2.append(valueOf);
                    throw new AudioSink.ConfigurationException(sb2.toString(), nVar);
                }
            }
            audioProcessorArr = audioProcessorArr3;
            i6 = i16;
            i10 = intValue2;
            i11 = intValue;
            i12 = -1;
            i13 = -1;
            i14 = i15;
        }
        if (i11 != 0) {
            if (i10 != 0) {
                this.Y = false;
                c cVar = new c(nVar, i13, i14, i12, i6, i10, i11, this.f6214k, audioProcessorArr);
                if (B()) {
                    this.f6220q = cVar;
                    return;
                } else {
                    this.r = cVar;
                    return;
                }
            }
            String valueOf2 = String.valueOf(nVar);
            StringBuilder sb3 = new StringBuilder(valueOf2.length() + 54);
            sb3.append("Invalid output channel config (mode=");
            sb3.append(i14);
            sb3.append(") for: ");
            sb3.append(valueOf2);
            throw new AudioSink.ConfigurationException(sb3.toString(), nVar);
        }
        String valueOf3 = String.valueOf(nVar);
        StringBuilder sb4 = new StringBuilder(valueOf3.length() + 48);
        sb4.append("Invalid output encoding (mode=");
        sb4.append(i14);
        sb4.append(") for: ");
        sb4.append(valueOf3);
        throw new AudioSink.ConfigurationException(sb4.toString(), nVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02ba A[ADDED_TO_REGION, EDGE_INSN: B:156:0x02ba->B:139:0x02ba ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b0 A[Catch: Exception -> 0x01b7, TRY_LEAVE, TryCatch #0 {Exception -> 0x01b7, blocks: (B:90:0x018c, B:92:0x01b0), top: B:151:0x018c }] */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long j(boolean z10) {
        m mVar;
        boolean z11;
        long j10;
        long j11;
        ArrayDeque<e> arrayDeque;
        boolean equals;
        long o10;
        long j12;
        long j13;
        long j14;
        boolean z12;
        Method method;
        AudioTrack audioTrack;
        long max;
        long j15;
        long j16;
        if (B() && !this.F) {
            com.google.android.exoplayer2.audio.b bVar = this.f6212i;
            AudioTrack audioTrack2 = bVar.f6257c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            b.a aVar = bVar.f6255a;
            if (playState == 3) {
                long a10 = (bVar.a() * 1000000) / bVar.f6260g;
                if (a10 != 0) {
                    long nanoTime = System.nanoTime() / 1000;
                    if (nanoTime - bVar.f6266m >= 30000) {
                        int i6 = bVar.f6274v;
                        long[] jArr = bVar.f6256b;
                        jArr[i6] = a10 - nanoTime;
                        bVar.f6274v = (i6 + 1) % 10;
                        int i10 = bVar.f6275w;
                        if (i10 < 10) {
                            bVar.f6275w = i10 + 1;
                        }
                        bVar.f6266m = nanoTime;
                        bVar.f6265l = 0L;
                        int i11 = 0;
                        while (true) {
                            int i12 = bVar.f6275w;
                            if (i11 >= i12) {
                                break;
                            }
                            bVar.f6265l = (jArr[i11] / i12) + bVar.f6265l;
                            i11++;
                        }
                    }
                    if (!bVar.f6261h) {
                        m mVar2 = bVar.f;
                        mVar2.getClass();
                        m.a aVar2 = mVar2.f29278a;
                        if (aVar2 != null && nanoTime - mVar2.f29282e >= mVar2.f29281d) {
                            mVar2.f29282e = nanoTime;
                            AudioTrack audioTrack3 = aVar2.f29283a;
                            AudioTimestamp audioTimestamp = aVar2.f29284b;
                            z12 = audioTrack3.getTimestamp(audioTimestamp);
                            if (z12) {
                                long j17 = audioTimestamp.framePosition;
                                j14 = nanoTime;
                                if (aVar2.f29286d > j17) {
                                    aVar2.f29285c++;
                                }
                                aVar2.f29286d = j17;
                                aVar2.f29287e = j17 + (aVar2.f29285c << 32);
                            } else {
                                j14 = nanoTime;
                            }
                            int i13 = mVar2.f29279b;
                            if (i13 != 0) {
                                if (i13 != 1) {
                                    if (i13 != 2) {
                                        if (i13 != 3) {
                                            if (i13 != 4) {
                                                throw new IllegalStateException();
                                            }
                                        } else if (z12) {
                                            mVar2.a();
                                        }
                                    } else if (!z12) {
                                        mVar2.a();
                                    }
                                } else if (z12) {
                                    if (aVar2.f29287e > mVar2.f) {
                                        mVar2.b(2);
                                    }
                                } else {
                                    mVar2.a();
                                }
                            } else if (z12) {
                                if (audioTimestamp.nanoTime / 1000 >= mVar2.f29280c) {
                                    mVar2.f = aVar2.f29287e;
                                    mVar2.b(1);
                                }
                            } else if (j14 - mVar2.f29280c > 500000) {
                                mVar2.b(3);
                            }
                            if (z12) {
                                if (aVar2 != null) {
                                    j15 = aVar2.f29284b.nanoTime / 1000;
                                } else {
                                    j15 = -9223372036854775807L;
                                }
                                if (aVar2 != null) {
                                    j16 = aVar2.f29287e;
                                } else {
                                    j16 = -1;
                                }
                                if (Math.abs(j15 - j14) > 5000000) {
                                    bVar.f6255a.e(j16, j15, j14, a10);
                                    mVar2.b(4);
                                } else if (Math.abs(((j16 * 1000000) / bVar.f6260g) - a10) > 5000000) {
                                    bVar.f6255a.d(j16, j15, j14, a10);
                                    mVar2.b(4);
                                } else if (mVar2.f29279b == 4) {
                                    mVar2.a();
                                }
                            }
                            if (bVar.f6270q && (method = bVar.f6267n) != null && j14 - bVar.r >= 500000) {
                                try {
                                    bVar.f6257c.getClass();
                                    try {
                                        int i14 = w.f5205a;
                                        long intValue = (((Integer) method.invoke(audioTrack, new Object[0])).intValue() * 1000) - bVar.f6262i;
                                        bVar.f6268o = intValue;
                                        max = Math.max(intValue, 0L);
                                        bVar.f6268o = max;
                                        if (max > 5000000) {
                                            aVar.c(max);
                                            bVar.f6268o = 0L;
                                        }
                                    } catch (Exception unused) {
                                        bVar.f6267n = null;
                                        bVar.r = j14;
                                        long nanoTime2 = System.nanoTime() / 1000;
                                        mVar = bVar.f;
                                        mVar.getClass();
                                        if (mVar.f29279b != 2) {
                                        }
                                        if (!z11) {
                                        }
                                        if (bVar.D != z11) {
                                        }
                                        j11 = nanoTime2 - bVar.F;
                                        if (j11 < 1000000) {
                                        }
                                        if (!bVar.f6264k) {
                                        }
                                        bVar.C = nanoTime2;
                                        bVar.B = j10;
                                        bVar.D = z11;
                                        long min = Math.min(j10, (z() * 1000000) / this.r.f6235e);
                                        while (true) {
                                            arrayDeque = this.f6213j;
                                            if (!arrayDeque.isEmpty()) {
                                            }
                                            this.f6224v = arrayDeque.remove();
                                        }
                                        e eVar = this.f6224v;
                                        long j18 = min - eVar.f6245d;
                                        equals = eVar.f6242a.equals(v.f7194x);
                                        b bVar2 = this.f6206b;
                                        if (!equals) {
                                        }
                                        return ((bVar2.c() * 1000000) / this.r.f6235e) + o10;
                                    }
                                } catch (Exception unused2) {
                                }
                                bVar.r = j14;
                                long nanoTime22 = System.nanoTime() / 1000;
                                mVar = bVar.f;
                                mVar.getClass();
                                if (mVar.f29279b != 2) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11) {
                                    m.a aVar3 = mVar.f29278a;
                                    if (aVar3 != null) {
                                        j12 = aVar3.f29287e;
                                    } else {
                                        j12 = -1;
                                    }
                                    long j19 = (j12 * 1000000) / bVar.f6260g;
                                    if (aVar3 != null) {
                                        j13 = aVar3.f29284b.nanoTime / 1000;
                                    } else {
                                        j13 = -9223372036854775807L;
                                    }
                                    j10 = w.o(nanoTime22 - j13, bVar.f6263j) + j19;
                                } else {
                                    if (bVar.f6275w == 0) {
                                        j10 = (bVar.a() * 1000000) / bVar.f6260g;
                                    } else {
                                        j10 = bVar.f6265l + nanoTime22;
                                    }
                                    if (!z10) {
                                        j10 = Math.max(0L, j10 - bVar.f6268o);
                                    }
                                }
                                if (bVar.D != z11) {
                                    bVar.F = bVar.C;
                                    bVar.E = bVar.B;
                                }
                                j11 = nanoTime22 - bVar.F;
                                if (j11 < 1000000) {
                                    long j20 = (j11 * 1000) / 1000000;
                                    j10 = (((1000 - j20) * (w.o(j11, bVar.f6263j) + bVar.E)) + (j10 * j20)) / 1000;
                                }
                                if (!bVar.f6264k) {
                                    long j21 = bVar.B;
                                    if (j10 > j21) {
                                        bVar.f6264k = true;
                                        long E = w.E(j10 - j21);
                                        float f2 = bVar.f6263j;
                                        if (f2 != 1.0f) {
                                            E = Math.round(E / f2);
                                        }
                                        aVar.a(System.currentTimeMillis() - w.E(E));
                                    }
                                }
                                bVar.C = nanoTime22;
                                bVar.B = j10;
                                bVar.D = z11;
                                long min2 = Math.min(j10, (z() * 1000000) / this.r.f6235e);
                                while (true) {
                                    arrayDeque = this.f6213j;
                                    if (!!arrayDeque.isEmpty() || min2 < arrayDeque.getFirst().f6245d) {
                                        break;
                                    }
                                    this.f6224v = arrayDeque.remove();
                                }
                                e eVar2 = this.f6224v;
                                long j182 = min2 - eVar2.f6245d;
                                equals = eVar2.f6242a.equals(v.f7194x);
                                b bVar22 = this.f6206b;
                                if (!equals) {
                                    o10 = this.f6224v.f6244c + j182;
                                } else if (arrayDeque.isEmpty()) {
                                    o10 = bVar22.b(j182) + this.f6224v.f6244c;
                                } else {
                                    e first = arrayDeque.getFirst();
                                    o10 = first.f6244c - w.o(first.f6245d - min2, this.f6224v.f6242a.f7195u);
                                }
                                return ((bVar22.c() * 1000000) / this.r.f6235e) + o10;
                            }
                        } else {
                            j14 = nanoTime;
                        }
                        z12 = false;
                        if (z12) {
                        }
                        if (bVar.f6270q) {
                            bVar.f6257c.getClass();
                            int i142 = w.f5205a;
                            long intValue2 = (((Integer) method.invoke(audioTrack, new Object[0])).intValue() * 1000) - bVar.f6262i;
                            bVar.f6268o = intValue2;
                            max = Math.max(intValue2, 0L);
                            bVar.f6268o = max;
                            if (max > 5000000) {
                            }
                            bVar.r = j14;
                            long nanoTime222 = System.nanoTime() / 1000;
                            mVar = bVar.f;
                            mVar.getClass();
                            if (mVar.f29279b != 2) {
                            }
                            if (!z11) {
                            }
                            if (bVar.D != z11) {
                            }
                            j11 = nanoTime222 - bVar.F;
                            if (j11 < 1000000) {
                            }
                            if (!bVar.f6264k) {
                            }
                            bVar.C = nanoTime222;
                            bVar.B = j10;
                            bVar.D = z11;
                            long min22 = Math.min(j10, (z() * 1000000) / this.r.f6235e);
                            while (true) {
                                arrayDeque = this.f6213j;
                                if (!arrayDeque.isEmpty()) {
                                    break;
                                }
                                break;
                                this.f6224v = arrayDeque.remove();
                            }
                            e eVar22 = this.f6224v;
                            long j1822 = min22 - eVar22.f6245d;
                            equals = eVar22.f6242a.equals(v.f7194x);
                            b bVar222 = this.f6206b;
                            if (!equals) {
                            }
                            return ((bVar222.c() * 1000000) / this.r.f6235e) + o10;
                        }
                    }
                }
            }
            long nanoTime2222 = System.nanoTime() / 1000;
            mVar = bVar.f;
            mVar.getClass();
            if (mVar.f29279b != 2) {
            }
            if (!z11) {
            }
            if (bVar.D != z11) {
            }
            j11 = nanoTime2222 - bVar.F;
            if (j11 < 1000000) {
            }
            if (!bVar.f6264k) {
            }
            bVar.C = nanoTime2222;
            bVar.B = j10;
            bVar.D = z11;
            long min222 = Math.min(j10, (z() * 1000000) / this.r.f6235e);
            while (true) {
                arrayDeque = this.f6213j;
                if (!arrayDeque.isEmpty()) {
                }
                this.f6224v = arrayDeque.remove();
            }
            e eVar222 = this.f6224v;
            long j18222 = min222 - eVar222.f6245d;
            equals = eVar222.f6242a.equals(v.f7194x);
            b bVar2222 = this.f6206b;
            if (!equals) {
            }
            return ((bVar2222.c() * 1000000) / this.r.f6235e) + o10;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void k() {
        if (this.W) {
            this.W = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void l() {
        this.E = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void m(float f2) {
        if (this.H != f2) {
            this.H = f2;
            I();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void n() {
        boolean z10;
        if (w.f5205a >= 21) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        sc.b.C(this.T);
        if (!this.W) {
            this.W = true;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void o(q7.d dVar) {
        if (this.f6222t.equals(dVar)) {
            return;
        }
        this.f6222t = dVar;
        if (this.W) {
            return;
        }
        flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e8, code lost:
        if (r5.a() == 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    @Override // com.google.android.exoplayer2.audio.AudioSink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(ByteBuffer byteBuffer, long j10, int i6) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        byte b10;
        int i12;
        byte b11;
        int i13;
        boolean z15;
        int i14;
        boolean z16;
        ByteBuffer byteBuffer2 = this.K;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            z10 = false;
        } else {
            z10 = true;
        }
        sc.b.q(z10);
        int i15 = 3;
        if (this.f6220q != null) {
            if (!u()) {
                return false;
            }
            c cVar = this.f6220q;
            c cVar2 = this.r;
            cVar.getClass();
            if (cVar2.f6233c == cVar.f6233c && cVar2.f6236g == cVar.f6236g && cVar2.f6235e == cVar.f6235e && cVar2.f == cVar.f && cVar2.f6234d == cVar.f6234d) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (!z16) {
                D();
                if (g()) {
                    return false;
                }
                flush();
            } else {
                this.r = this.f6220q;
                this.f6220q = null;
                if (C(this.f6221s) && this.f6215l != 3) {
                    this.f6221s.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.f6221s;
                    com.google.android.exoplayer2.n nVar = this.r.f6231a;
                    audioTrack.setOffloadDelayPadding(nVar.V, nVar.W);
                    this.Z = true;
                }
            }
            t(j10);
        }
        boolean B = B();
        f<AudioSink.InitializationException> fVar = this.f6217n;
        if (!B) {
            try {
                A();
            } catch (AudioSink.InitializationException e10) {
                if (!e10.f6201u) {
                    fVar.a(e10);
                    return false;
                }
                throw e10;
            }
        }
        fVar.f6246a = null;
        if (this.F) {
            this.G = Math.max(0L, j10);
            this.E = false;
            this.F = false;
            if (this.f6214k && w.f5205a >= 23) {
                H(this.f6225w);
            }
            t(j10);
            if (this.S) {
                q();
            }
        }
        long z17 = z();
        com.google.android.exoplayer2.audio.b bVar = this.f6212i;
        AudioTrack audioTrack2 = bVar.f6257c;
        audioTrack2.getClass();
        int playState = audioTrack2.getPlayState();
        if (bVar.f6261h) {
            if (playState == 2) {
                bVar.f6269p = false;
            } else if (playState == 1) {
            }
            z11 = false;
            if (z11) {
                return false;
            }
            if (this.K == null) {
                if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                sc.b.q(z13);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                c cVar3 = this.r;
                if (cVar3.f6233c != 0 && this.D == 0) {
                    int i16 = cVar3.f6236g;
                    switch (i16) {
                        case 5:
                        case 6:
                        case 18:
                            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z14) {
                                if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                                    i15 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
                                }
                                i10 = q7.b.f29233a[i15] * 256;
                                break;
                            } else {
                                i10 = 1536;
                                break;
                            }
                        case 7:
                        case 8:
                            int position = byteBuffer.position();
                            byte b12 = byteBuffer.get(position);
                            if (b12 != -2) {
                                if (b12 != -1) {
                                    if (b12 != 31) {
                                        i11 = (byteBuffer.get(position + 4) & 1) << 6;
                                        b10 = byteBuffer.get(position + 5);
                                    } else {
                                        i11 = (byteBuffer.get(position + 5) & 7) << 4;
                                        b11 = byteBuffer.get(position + 6);
                                    }
                                } else {
                                    i11 = (byteBuffer.get(position + 4) & 7) << 4;
                                    b11 = byteBuffer.get(position + 7);
                                }
                                i12 = b11 & 60;
                                i10 = (((i12 >> 2) | i11) + 1) * 32;
                                break;
                            } else {
                                i11 = (byteBuffer.get(position + 5) & 1) << 6;
                                b10 = byteBuffer.get(position + 4);
                            }
                            i12 = b10 & 252;
                            i10 = (((i12 >> 2) | i11) + 1) * 32;
                        case 9:
                            int position2 = byteBuffer.position();
                            int i17 = w.f5205a;
                            int i18 = byteBuffer.getInt(position2);
                            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                i18 = Integer.reverseBytes(i18);
                            }
                            i10 = p.b(i18);
                            if (i10 == -1) {
                                throw new IllegalArgumentException();
                            }
                            break;
                        case 10:
                        case 16:
                            i10 = Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
                            break;
                        case 11:
                        case 12:
                            i10 = Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID;
                            break;
                        case 13:
                        default:
                            throw new IllegalStateException(defpackage.b.h(38, "Unexpected audio encoding: ", i16));
                        case 14:
                            int position3 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i19 = position3;
                            while (true) {
                                if (i19 <= limit) {
                                    int i20 = w.f5205a;
                                    int i21 = byteBuffer.getInt(i19 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        i21 = Integer.reverseBytes(i21);
                                    }
                                    if ((i21 & (-2)) == -126718022) {
                                        i13 = i19 - position3;
                                    } else {
                                        i19++;
                                    }
                                } else {
                                    i13 = -1;
                                }
                            }
                            if (i13 == -1) {
                                i10 = 0;
                                break;
                            } else {
                                if ((byteBuffer.get(byteBuffer.position() + i13 + 7) & 255) == 187) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                int position4 = byteBuffer.position() + i13;
                                if (z15) {
                                    i14 = 9;
                                } else {
                                    i14 = 8;
                                }
                                i10 = (40 << ((byteBuffer.get(position4 + i14) >> 4) & 7)) * 16;
                                break;
                            }
                        case 15:
                            i10 = 512;
                            break;
                        case 17:
                            byte[] bArr = new byte[16];
                            int position5 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position5);
                            i10 = q7.c.b(new x(bArr, 1, 0)).f29241c;
                            break;
                    }
                    this.D = i10;
                    if (i10 == 0) {
                        return true;
                    }
                }
                if (this.f6223u != null) {
                    if (!u()) {
                        return false;
                    }
                    t(j10);
                    this.f6223u = null;
                }
                long y10 = (((y() - this.f6209e.f6327o) * 1000000) / this.r.f6231a.T) + this.G;
                if (!this.E && Math.abs(y10 - j10) > 200000) {
                    ((f.a) this.f6219p).a(new AudioSink.UnexpectedDiscontinuityException(j10, y10));
                    this.E = true;
                }
                if (this.E) {
                    if (!u()) {
                        return false;
                    }
                    long j11 = j10 - y10;
                    this.G += j11;
                    this.E = false;
                    t(j10);
                    AudioSink.a aVar = this.f6219p;
                    if (aVar != null && j11 != 0) {
                        com.google.android.exoplayer2.audio.f.this.g1 = true;
                    }
                }
                if (this.r.f6233c == 0) {
                    this.f6228z += byteBuffer.remaining();
                } else {
                    this.A += this.D * i6;
                }
                this.K = byteBuffer;
                this.L = i6;
            }
            E(j10);
            if (!this.K.hasRemaining()) {
                this.K = null;
                this.L = 0;
                return true;
            }
            long z18 = z();
            if (bVar.f6277y != -9223372036854775807L && z18 > 0 && SystemClock.elapsedRealtime() - bVar.f6277y >= 200) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                Log.w("DefaultAudioSink", "Resetting stalled audio track");
                flush();
                return true;
            }
            return false;
        }
        boolean z19 = bVar.f6269p;
        boolean b13 = bVar.b(z17);
        bVar.f6269p = b13;
        if (z19 && !b13 && playState != 1) {
            bVar.f6255a.b(bVar.f6259e, w.E(bVar.f6262i));
        }
        z11 = true;
        if (z11) {
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void pause() {
        boolean z10 = false;
        this.S = false;
        if (B()) {
            com.google.android.exoplayer2.audio.b bVar = this.f6212i;
            bVar.f6265l = 0L;
            bVar.f6275w = 0;
            bVar.f6274v = 0;
            bVar.f6266m = 0L;
            bVar.C = 0L;
            bVar.F = 0L;
            bVar.f6264k = false;
            if (bVar.f6276x == -9223372036854775807L) {
                m mVar = bVar.f;
                mVar.getClass();
                mVar.a();
                z10 = true;
            }
            if (z10) {
                this.f6221s.pause();
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void q() {
        this.S = true;
        if (B()) {
            m mVar = this.f6212i.f;
            mVar.getClass();
            mVar.a();
            this.f6221s.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final int r(com.google.android.exoplayer2.n nVar) {
        boolean z10 = true;
        if ("audio/raw".equals(nVar.F)) {
            int i6 = nVar.U;
            if (!w.w(i6)) {
                defpackage.d.k(33, "Invalid PCM encoding: ", i6, "DefaultAudioSink");
                return 0;
            } else if (i6 != 2 && (!this.f6207c || i6 != 4)) {
                return 1;
            } else {
                return 2;
            }
        } else if (!this.Y && K(nVar, this.f6222t)) {
            return 2;
        } else {
            if (w(nVar, this.f6205a) == null) {
                z10 = false;
            }
            if (!z10) {
                return 0;
            }
            return 2;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void reset() {
        flush();
        for (AudioProcessor audioProcessor : this.f) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.f6210g) {
            audioProcessor2.reset();
        }
        this.S = false;
        this.Y = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public final void s(boolean z10) {
        G(x().f6242a, z10);
    }

    public final void t(long j10) {
        v vVar;
        boolean z10;
        a.C0132a c0132a;
        Handler handler;
        boolean J = J();
        b bVar = this.f6206b;
        if (J) {
            vVar = bVar.a(x().f6242a);
        } else {
            vVar = v.f7194x;
        }
        v vVar2 = vVar;
        if (J()) {
            z10 = bVar.d(x().f6243b);
        } else {
            z10 = false;
        }
        this.f6213j.add(new e(vVar2, z10, Math.max(0L, j10), (z() * 1000000) / this.r.f6235e));
        AudioProcessor[] audioProcessorArr = this.r.f6238i;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.a()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.I = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.J = new ByteBuffer[size];
        int i6 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr2 = this.I;
            if (i6 >= audioProcessorArr2.length) {
                break;
            }
            AudioProcessor audioProcessor2 = audioProcessorArr2[i6];
            audioProcessor2.flush();
            this.J[i6] = audioProcessor2.c();
            i6++;
        }
        AudioSink.a aVar = this.f6219p;
        if (aVar != null && (handler = (c0132a = com.google.android.exoplayer2.audio.f.this.Z0).f6253a) != null) {
            handler.post(new k(0, c0132a, z10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u() {
        boolean z10;
        int i6;
        AudioProcessor[] audioProcessorArr;
        if (this.P == -1) {
            this.P = 0;
            z10 = true;
            i6 = this.P;
            audioProcessorArr = this.I;
            if (i6 < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i6];
                if (z10) {
                    audioProcessor.f();
                }
                E(-9223372036854775807L);
                if (!audioProcessor.b()) {
                    return false;
                }
                this.P++;
                z10 = true;
                i6 = this.P;
                audioProcessorArr = this.I;
                if (i6 < audioProcessorArr.length) {
                    ByteBuffer byteBuffer = this.M;
                    if (byteBuffer != null) {
                        L(byteBuffer, -9223372036854775807L);
                        if (this.M != null) {
                            return false;
                        }
                    }
                    this.P = -1;
                    return true;
                }
            }
        } else {
            z10 = false;
            i6 = this.P;
            audioProcessorArr = this.I;
            if (i6 < audioProcessorArr.length) {
            }
        }
    }

    public final e x() {
        e eVar = this.f6223u;
        if (eVar == null) {
            ArrayDeque<e> arrayDeque = this.f6213j;
            if (!arrayDeque.isEmpty()) {
                return arrayDeque.getLast();
            }
            return this.f6224v;
        }
        return eVar;
    }

    public final long y() {
        c cVar = this.r;
        if (cVar.f6233c == 0) {
            return this.f6228z / cVar.f6232b;
        }
        return this.A;
    }

    public final long z() {
        c cVar = this.r;
        if (cVar.f6233c == 0) {
            return this.B / cVar.f6234d;
        }
        return this.C;
    }
}
