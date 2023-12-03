package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
/* compiled from: FloatResamplingAudioProcessor.java */
/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: i  reason: collision with root package name */
    public static final int f6287i = Float.floatToIntBits(Float.NaN);

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void d(ByteBuffer byteBuffer) {
        ByteBuffer k10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i6 = limit - position;
        int i10 = this.f6279b.f6198c;
        int i11 = f6287i;
        if (i10 != 536870912) {
            if (i10 == 805306368) {
                k10 = k(i6);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == i11) {
                        floatToIntBits = Float.floatToIntBits(0.0f);
                    }
                    k10.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            k10 = k((i6 / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i11) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                k10.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        k10.flip();
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final AudioProcessor.a g(AudioProcessor.a aVar) {
        boolean z10;
        int i6 = aVar.f6198c;
        if (i6 != 536870912 && i6 != 805306368 && i6 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (i6 != 4) {
                return new AudioProcessor.a(aVar.f6196a, aVar.f6197b, 4);
            }
            return AudioProcessor.a.f6195e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }
}
