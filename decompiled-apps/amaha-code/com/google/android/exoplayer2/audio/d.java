package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
/* compiled from: ChannelMappingAudioProcessor.java */
/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: i  reason: collision with root package name */
    public int[] f6285i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f6286j;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void d(ByteBuffer byteBuffer) {
        int[] iArr = this.f6286j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k10 = k(((limit - position) / this.f6279b.f6199d) * this.f6280c.f6199d);
        while (position < limit) {
            for (int i6 : iArr) {
                k10.putShort(byteBuffer.getShort((i6 * 2) + position));
            }
            position += this.f6279b.f6199d;
        }
        byteBuffer.position(limit);
        k10.flip();
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final AudioProcessor.a g(AudioProcessor.a aVar) {
        boolean z10;
        boolean z11;
        int[] iArr = this.f6285i;
        if (iArr == null) {
            return AudioProcessor.a.f6195e;
        }
        if (aVar.f6198c == 2) {
            int length = iArr.length;
            int i6 = aVar.f6197b;
            if (i6 != length) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i10 = 0; i10 < iArr.length; i10++) {
                int i11 = iArr[i10];
                if (i11 < i6) {
                    if (i11 != i10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 |= z11;
                } else {
                    throw new AudioProcessor.UnhandledAudioFormatException(aVar);
                }
            }
            if (z10) {
                return new AudioProcessor.a(aVar.f6196a, iArr.length, 2);
            }
            return AudioProcessor.a.f6195e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final void h() {
        this.f6286j = this.f6285i;
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final void j() {
        this.f6286j = null;
        this.f6285i = null;
    }
}
