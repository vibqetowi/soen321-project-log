package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import q7.q;
/* compiled from: SonicAudioProcessor.java */
/* loaded from: classes.dex */
public final class i implements AudioProcessor {

    /* renamed from: b  reason: collision with root package name */
    public int f6307b;

    /* renamed from: c  reason: collision with root package name */
    public float f6308c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f6309d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public AudioProcessor.a f6310e;
    public AudioProcessor.a f;

    /* renamed from: g  reason: collision with root package name */
    public AudioProcessor.a f6311g;

    /* renamed from: h  reason: collision with root package name */
    public AudioProcessor.a f6312h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f6313i;

    /* renamed from: j  reason: collision with root package name */
    public q f6314j;

    /* renamed from: k  reason: collision with root package name */
    public ByteBuffer f6315k;

    /* renamed from: l  reason: collision with root package name */
    public ShortBuffer f6316l;

    /* renamed from: m  reason: collision with root package name */
    public ByteBuffer f6317m;

    /* renamed from: n  reason: collision with root package name */
    public long f6318n;

    /* renamed from: o  reason: collision with root package name */
    public long f6319o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6320p;

    public i() {
        AudioProcessor.a aVar = AudioProcessor.a.f6195e;
        this.f6310e = aVar;
        this.f = aVar;
        this.f6311g = aVar;
        this.f6312h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f6194a;
        this.f6315k = byteBuffer;
        this.f6316l = byteBuffer.asShortBuffer();
        this.f6317m = byteBuffer;
        this.f6307b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean a() {
        if (this.f.f6196a != -1 && (Math.abs(this.f6308c - 1.0f) >= 1.0E-4f || Math.abs(this.f6309d - 1.0f) >= 1.0E-4f || this.f.f6196a != this.f6310e.f6196a)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean b() {
        q qVar;
        if (this.f6320p && ((qVar = this.f6314j) == null || qVar.f29316m * qVar.f29306b * 2 == 0)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer c() {
        q qVar = this.f6314j;
        if (qVar != null) {
            int i6 = qVar.f29316m;
            int i10 = qVar.f29306b;
            int i11 = i6 * i10 * 2;
            if (i11 > 0) {
                if (this.f6315k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f6315k = order;
                    this.f6316l = order.asShortBuffer();
                } else {
                    this.f6315k.clear();
                    this.f6316l.clear();
                }
                ShortBuffer shortBuffer = this.f6316l;
                int min = Math.min(shortBuffer.remaining() / i10, qVar.f29316m);
                int i12 = min * i10;
                shortBuffer.put(qVar.f29315l, 0, i12);
                int i13 = qVar.f29316m - min;
                qVar.f29316m = i13;
                short[] sArr = qVar.f29315l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f6319o += i11;
                this.f6315k.limit(i11);
                this.f6317m = this.f6315k;
            }
        }
        ByteBuffer byteBuffer = this.f6317m;
        this.f6317m = AudioProcessor.f6194a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        q qVar = this.f6314j;
        qVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f6318n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i6 = qVar.f29306b;
        int i10 = remaining2 / i6;
        short[] c10 = qVar.c(qVar.f29313j, qVar.f29314k, i10);
        qVar.f29313j = c10;
        asShortBuffer.get(c10, qVar.f29314k * i6, ((i10 * i6) * 2) / 2);
        qVar.f29314k += i10;
        qVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a e(AudioProcessor.a aVar) {
        if (aVar.f6198c == 2) {
            int i6 = this.f6307b;
            if (i6 == -1) {
                i6 = aVar.f6196a;
            }
            this.f6310e = aVar;
            AudioProcessor.a aVar2 = new AudioProcessor.a(i6, aVar.f6197b, 2);
            this.f = aVar2;
            this.f6313i = true;
            return aVar2;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void f() {
        q qVar = this.f6314j;
        if (qVar != null) {
            int i6 = qVar.f29314k;
            float f = qVar.f29307c;
            float f2 = qVar.f29308d;
            float f10 = qVar.f29309e * f2;
            int i10 = qVar.f29316m + ((int) ((((i6 / (f / f2)) + qVar.f29318o) / f10) + 0.5f));
            short[] sArr = qVar.f29313j;
            int i11 = qVar.f29311h * 2;
            qVar.f29313j = qVar.c(sArr, i6, i11 + i6);
            int i12 = 0;
            while (true) {
                int i13 = qVar.f29306b;
                if (i12 >= i11 * i13) {
                    break;
                }
                qVar.f29313j[(i13 * i6) + i12] = 0;
                i12++;
            }
            qVar.f29314k = i11 + qVar.f29314k;
            qVar.f();
            if (qVar.f29316m > i10) {
                qVar.f29316m = i10;
            }
            qVar.f29314k = 0;
            qVar.r = 0;
            qVar.f29318o = 0;
        }
        this.f6320p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (a()) {
            AudioProcessor.a aVar = this.f6310e;
            this.f6311g = aVar;
            AudioProcessor.a aVar2 = this.f;
            this.f6312h = aVar2;
            if (this.f6313i) {
                this.f6314j = new q(aVar.f6196a, aVar.f6197b, this.f6308c, this.f6309d, aVar2.f6196a);
            } else {
                q qVar = this.f6314j;
                if (qVar != null) {
                    qVar.f29314k = 0;
                    qVar.f29316m = 0;
                    qVar.f29318o = 0;
                    qVar.f29319p = 0;
                    qVar.f29320q = 0;
                    qVar.r = 0;
                    qVar.f29321s = 0;
                    qVar.f29322t = 0;
                    qVar.f29323u = 0;
                    qVar.f29324v = 0;
                }
            }
        }
        this.f6317m = AudioProcessor.f6194a;
        this.f6318n = 0L;
        this.f6319o = 0L;
        this.f6320p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        this.f6308c = 1.0f;
        this.f6309d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f6195e;
        this.f6310e = aVar;
        this.f = aVar;
        this.f6311g = aVar;
        this.f6312h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f6194a;
        this.f6315k = byteBuffer;
        this.f6316l = byteBuffer.asShortBuffer();
        this.f6317m = byteBuffer;
        this.f6307b = -1;
        this.f6313i = false;
        this.f6314j = null;
        this.f6318n = 0L;
        this.f6319o = 0L;
        this.f6320p = false;
    }
}
