package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import c9.w;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import java.lang.reflect.Method;
import q7.m;
/* compiled from: AudioTrackPositionTracker.java */
/* loaded from: classes.dex */
public final class b {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* renamed from: a  reason: collision with root package name */
    public final a f6255a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f6256b;

    /* renamed from: c  reason: collision with root package name */
    public AudioTrack f6257c;

    /* renamed from: d  reason: collision with root package name */
    public int f6258d;

    /* renamed from: e  reason: collision with root package name */
    public int f6259e;
    public m f;

    /* renamed from: g  reason: collision with root package name */
    public int f6260g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f6261h;

    /* renamed from: i  reason: collision with root package name */
    public long f6262i;

    /* renamed from: j  reason: collision with root package name */
    public float f6263j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6264k;

    /* renamed from: l  reason: collision with root package name */
    public long f6265l;

    /* renamed from: m  reason: collision with root package name */
    public long f6266m;

    /* renamed from: n  reason: collision with root package name */
    public Method f6267n;

    /* renamed from: o  reason: collision with root package name */
    public long f6268o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6269p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6270q;
    public long r;

    /* renamed from: s  reason: collision with root package name */
    public long f6271s;

    /* renamed from: t  reason: collision with root package name */
    public long f6272t;

    /* renamed from: u  reason: collision with root package name */
    public long f6273u;

    /* renamed from: v  reason: collision with root package name */
    public int f6274v;

    /* renamed from: w  reason: collision with root package name */
    public int f6275w;

    /* renamed from: x  reason: collision with root package name */
    public long f6276x;

    /* renamed from: y  reason: collision with root package name */
    public long f6277y;

    /* renamed from: z  reason: collision with root package name */
    public long f6278z;

    /* compiled from: AudioTrackPositionTracker.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(long j10);

        void b(int i6, long j10);

        void c(long j10);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10, long j11, long j12, long j13);
    }

    public b(DefaultAudioSink.g gVar) {
        this.f6255a = gVar;
        if (w.f5205a >= 18) {
            try {
                this.f6267n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f6256b = new long[10];
    }

    public final long a() {
        AudioTrack audioTrack = this.f6257c;
        audioTrack.getClass();
        if (this.f6276x != -9223372036854775807L) {
            return Math.min(this.A, this.f6278z + ((((SystemClock.elapsedRealtime() * 1000) - this.f6276x) * this.f6260g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f6261h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f6273u = this.f6271s;
            }
            playbackHeadPosition += this.f6273u;
        }
        if (w.f5205a <= 29) {
            if (playbackHeadPosition == 0 && this.f6271s > 0 && playState == 3) {
                if (this.f6277y == -9223372036854775807L) {
                    this.f6277y = SystemClock.elapsedRealtime();
                }
                return this.f6271s;
            }
            this.f6277y = -9223372036854775807L;
        }
        if (this.f6271s > playbackHeadPosition) {
            this.f6272t++;
        }
        this.f6271s = playbackHeadPosition;
        return playbackHeadPosition + (this.f6272t << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(long j10) {
        boolean z10;
        if (j10 > a()) {
            return true;
        }
        if (this.f6261h) {
            AudioTrack audioTrack = this.f6257c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && a() == 0) {
                z10 = true;
                if (!z10) {
                    return true;
                }
                return false;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r4 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(AudioTrack audioTrack, boolean z10, int i6, int i10, int i11) {
        boolean z11;
        long j10;
        boolean z12;
        this.f6257c = audioTrack;
        this.f6258d = i10;
        this.f6259e = i11;
        this.f = new m(audioTrack);
        this.f6260g = audioTrack.getSampleRate();
        if (z10) {
            z11 = true;
            if (w.f5205a < 23 && (i6 == 5 || i6 == 6)) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        z11 = false;
        this.f6261h = z11;
        boolean w10 = w.w(i6);
        this.f6270q = w10;
        if (w10) {
            j10 = ((i11 / i10) * 1000000) / this.f6260g;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f6262i = j10;
        this.f6271s = 0L;
        this.f6272t = 0L;
        this.f6273u = 0L;
        this.f6269p = false;
        this.f6276x = -9223372036854775807L;
        this.f6277y = -9223372036854775807L;
        this.r = 0L;
        this.f6268o = 0L;
        this.f6263j = 1.0f;
    }
}
