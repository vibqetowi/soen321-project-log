package com.google.android.exoplayer2.audio;

import c9.w;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
/* compiled from: SilenceSkippingAudioProcessor.java */
/* loaded from: classes.dex */
public final class h extends c {

    /* renamed from: i  reason: collision with root package name */
    public final long f6296i = 150000;

    /* renamed from: j  reason: collision with root package name */
    public final long f6297j = 20000;

    /* renamed from: k  reason: collision with root package name */
    public final short f6298k = 1024;

    /* renamed from: l  reason: collision with root package name */
    public int f6299l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6300m;

    /* renamed from: n  reason: collision with root package name */
    public byte[] f6301n;

    /* renamed from: o  reason: collision with root package name */
    public byte[] f6302o;

    /* renamed from: p  reason: collision with root package name */
    public int f6303p;

    /* renamed from: q  reason: collision with root package name */
    public int f6304q;
    public int r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6305s;

    /* renamed from: t  reason: collision with root package name */
    public long f6306t;

    public h() {
        byte[] bArr = w.f;
        this.f6301n = bArr;
        this.f6302o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.c, com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean a() {
        return this.f6300m;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void d(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f6283g.hasRemaining()) {
            int i6 = this.f6303p;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        int limit = byteBuffer.limit();
                        int l2 = l(byteBuffer);
                        byteBuffer.limit(l2);
                        this.f6306t += byteBuffer.remaining() / this.f6299l;
                        n(byteBuffer, this.f6302o, this.r);
                        if (l2 < limit) {
                            m(this.f6302o, this.r);
                            this.f6303p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int l10 = l(byteBuffer);
                    int position2 = l10 - byteBuffer.position();
                    byte[] bArr = this.f6301n;
                    int length = bArr.length;
                    int i10 = this.f6304q;
                    int i11 = length - i10;
                    if (l10 < limit2 && position2 < i11) {
                        m(bArr, i10);
                        this.f6304q = 0;
                        this.f6303p = 0;
                    } else {
                        int min = Math.min(position2, i11);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f6301n, this.f6304q, min);
                        int i12 = this.f6304q + min;
                        this.f6304q = i12;
                        byte[] bArr2 = this.f6301n;
                        if (i12 == bArr2.length) {
                            if (this.f6305s) {
                                m(bArr2, this.r);
                                this.f6306t += (this.f6304q - (this.r * 2)) / this.f6299l;
                            } else {
                                this.f6306t += (i12 - this.r) / this.f6299l;
                            }
                            n(byteBuffer, this.f6301n, this.f6304q);
                            this.f6304q = 0;
                            this.f6303p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f6301n.length));
                int limit4 = byteBuffer.limit();
                while (true) {
                    limit4 -= 2;
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f6298k) {
                            int i13 = this.f6299l;
                            position = ((limit4 / i13) * i13) + i13;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f6303p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    k(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f6305s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final AudioProcessor.a g(AudioProcessor.a aVar) {
        if (aVar.f6198c == 2) {
            if (!this.f6300m) {
                return AudioProcessor.a.f6195e;
            }
            return aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final void h() {
        if (this.f6300m) {
            AudioProcessor.a aVar = this.f6279b;
            int i6 = aVar.f6199d;
            this.f6299l = i6;
            int i10 = aVar.f6196a;
            int i11 = ((int) ((this.f6296i * i10) / 1000000)) * i6;
            if (this.f6301n.length != i11) {
                this.f6301n = new byte[i11];
            }
            int i12 = ((int) ((this.f6297j * i10) / 1000000)) * i6;
            this.r = i12;
            if (this.f6302o.length != i12) {
                this.f6302o = new byte[i12];
            }
        }
        this.f6303p = 0;
        this.f6306t = 0L;
        this.f6304q = 0;
        this.f6305s = false;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final void i() {
        int i6 = this.f6304q;
        if (i6 > 0) {
            m(this.f6301n, i6);
        }
        if (!this.f6305s) {
            this.f6306t += this.r / this.f6299l;
        }
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final void j() {
        this.f6300m = false;
        this.r = 0;
        byte[] bArr = w.f;
        this.f6301n = bArr;
        this.f6302o = bArr;
    }

    public final int l(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f6298k) {
                int i6 = this.f6299l;
                return (position / i6) * i6;
            }
        }
        return byteBuffer.limit();
    }

    public final void m(byte[] bArr, int i6) {
        k(i6).put(bArr, 0, i6).flip();
        if (i6 > 0) {
            this.f6305s = true;
        }
    }

    public final void n(ByteBuffer byteBuffer, byte[] bArr, int i6) {
        int min = Math.min(byteBuffer.remaining(), this.r);
        int i10 = this.r - min;
        System.arraycopy(bArr, i6 - i10, this.f6302o, 0, i10);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f6302o, i10, min);
    }
}
