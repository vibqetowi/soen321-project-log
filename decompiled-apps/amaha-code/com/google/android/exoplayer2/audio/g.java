package com.google.android.exoplayer2.audio;

import c9.w;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
/* compiled from: ResamplingAudioProcessor.java */
/* loaded from: classes.dex */
public final class g extends c {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[LOOP:4: B:30:0x00b0->B:31:0x00b2, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:15:0x0037, B:31:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(ByteBuffer byteBuffer) {
        int i6;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f6279b.f6198c;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 268435456) {
                    if (i11 != 536870912) {
                        if (i11 != 805306368) {
                            throw new IllegalStateException();
                        }
                    } else {
                        i10 /= 3;
                    }
                }
                ByteBuffer k10 = k(i10);
                i6 = this.f6279b.f6198c;
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 != 268435456) {
                            if (i6 != 536870912) {
                                if (i6 == 805306368) {
                                    while (position < limit) {
                                        k10.put(byteBuffer.get(position + 2));
                                        k10.put(byteBuffer.get(position + 3));
                                        position += 4;
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else {
                                while (position < limit) {
                                    k10.put(byteBuffer.get(position + 1));
                                    k10.put(byteBuffer.get(position + 2));
                                    position += 3;
                                }
                            }
                        } else {
                            while (position < limit) {
                                k10.put(byteBuffer.get(position + 1));
                                k10.put(byteBuffer.get(position));
                                position += 2;
                            }
                        }
                    } else {
                        while (position < limit) {
                            short g5 = (short) (w.g(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                            k10.put((byte) (g5 & 255));
                            k10.put((byte) ((g5 >> 8) & 255));
                            position += 4;
                        }
                    }
                } else {
                    while (position < limit) {
                        k10.put((byte) 0);
                        k10.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                k10.flip();
            }
            i10 /= 2;
            ByteBuffer k102 = k(i10);
            i6 = this.f6279b.f6198c;
            if (i6 != 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            k102.flip();
        }
        i10 *= 2;
        ByteBuffer k1022 = k(i10);
        i6 = this.f6279b.f6198c;
        if (i6 != 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        k1022.flip();
    }

    @Override // com.google.android.exoplayer2.audio.c
    public final AudioProcessor.a g(AudioProcessor.a aVar) {
        int i6 = aVar.f6198c;
        if (i6 != 3 && i6 != 2 && i6 != 268435456 && i6 != 536870912 && i6 != 805306368 && i6 != 4) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        if (i6 != 2) {
            return new AudioProcessor.a(aVar.f6196a, aVar.f6197b, 2);
        }
        return AudioProcessor.a.f6195e;
    }
}
