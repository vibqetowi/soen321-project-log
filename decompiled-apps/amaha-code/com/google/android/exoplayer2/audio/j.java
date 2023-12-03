package com.google.android.exoplayer2.audio;

import c9.w;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
/* compiled from: TrimmingAudioProcessor.java */
/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: i  reason: collision with root package name */
    public int f6321i;

    /* renamed from: j  reason: collision with root package name */
    public int f6322j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f6323k;

    /* renamed from: l  reason: collision with root package name */
    public int f6324l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f6325m = w.f;

    /* renamed from: n  reason: collision with root package name */
    public int f6326n;

    /* renamed from: o  reason: collision with root package name */
    public long f6327o;

    @Override // com.google.android.exoplayer2.audio.c, com.google.android.exoplayer2.audio.AudioProcessor
    public final boolean b() {
        if (super.b() && this.f6326n == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.c, com.google.android.exoplayer2.audio.AudioProcessor
    public final ByteBuffer c() {
        int i6;
        if (super.b() && (i6 = this.f6326n) > 0) {
            k(i6).put(this.f6325m, 0, this.f6326n).flip();
            this.f6326n = 0;
        }
        return super.c();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i6 = limit - position;
        if (i6 == 0) {
            return;
        }
        int min = Math.min(i6, this.f6324l);
        this.f6327o += min / this.f6279b.f6199d;
        this.f6324l -= min;
        byteBuffer.position(position + min);
        if (this.f6324l > 0) {
            return;
        }
        int i10 = i6 - min;
        int length = (this.f6326n + i10) - this.f6325m.length;
        ByteBuffer k10 = k(length);
        int h10 = w.h(length, 0, this.f6326n);
        k10.put(this.f6325m, 0, h10);
        int h11 = w.h(length - h10, 0, i10);
        byteBuffer.limit(byteBuffer.position() + h11);
        k10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i11 = i10 - h11;
        int i12 = this.f6326n - h10;
        this.f6326n = i12;
        byte[] bArr = this.f6325m;
        System.arraycopy(bArr, h10, bArr, 0, i12);
        byteBuffer.get(this.f6325m, this.f6326n, i11);
        this.f6326n += i11;
        k10.flip();
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final AudioProcessor.a g(AudioProcessor.a aVar) {
        if (aVar.f6198c == 2) {
            this.f6323k = true;
            if (this.f6321i == 0 && this.f6322j == 0) {
                return AudioProcessor.a.f6195e;
            }
            return aVar;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final void h() {
        if (this.f6323k) {
            this.f6323k = false;
            int i6 = this.f6322j;
            int i10 = this.f6279b.f6199d;
            this.f6325m = new byte[i6 * i10];
            this.f6324l = this.f6321i * i10;
        }
        this.f6326n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final void i() {
        int i6;
        if (this.f6323k) {
            if (this.f6326n > 0) {
                this.f6327o += i6 / this.f6279b.f6199d;
            }
            this.f6326n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final void j() {
        this.f6325m = w.f;
    }
}
