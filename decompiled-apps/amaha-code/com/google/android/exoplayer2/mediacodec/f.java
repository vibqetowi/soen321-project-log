package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import c9.w;
import com.google.android.exoplayer2.mediacodec.c;
import java.nio.ByteBuffer;
/* compiled from: SynchronousMediaCodecAdapter.java */
/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f6645a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer[] f6646b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer[] f6647c;

    /* compiled from: SynchronousMediaCodecAdapter.java */
    /* loaded from: classes.dex */
    public static class a implements c.b {
        public static MediaCodec b(c.a aVar) {
            String str;
            aVar.f6633a.getClass();
            String str2 = aVar.f6633a.f6638a;
            String valueOf = String.valueOf(str2);
            if (valueOf.length() != 0) {
                str = "createCodec:".concat(valueOf);
            } else {
                str = new String("createCodec:");
            }
            kc.f.j(str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str2);
            kc.f.B();
            return createByCodecName;
        }
    }

    public f(MediaCodec mediaCodec) {
        this.f6645a = mediaCodec;
        if (w.f5205a < 21) {
            this.f6646b = mediaCodec.getInputBuffers();
            this.f6647c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void a() {
        this.f6646b = null;
        this.f6647c = null;
        this.f6645a.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final MediaFormat c() {
        return this.f6645a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void d(Bundle bundle) {
        this.f6645a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void e(int i6, long j10) {
        this.f6645a.releaseOutputBuffer(i6, j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final int f() {
        return this.f6645a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void flush() {
        this.f6645a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f6645a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && w.f5205a < 21) {
                this.f6647c = mediaCodec.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void h(int i6, int i10, int i11, long j10) {
        this.f6645a.queueInputBuffer(i6, 0, i10, j10, i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void i(c.InterfaceC0137c interfaceC0137c, Handler handler) {
        this.f6645a.setOnFrameRenderedListener(new f8.a(this, interfaceC0137c, 1), handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void j(int i6, boolean z10) {
        this.f6645a.releaseOutputBuffer(i6, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void k(int i6) {
        this.f6645a.setVideoScalingMode(i6);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final ByteBuffer l(int i6) {
        if (w.f5205a >= 21) {
            return this.f6645a.getInputBuffer(i6);
        }
        return this.f6646b[i6];
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void m(Surface surface) {
        this.f6645a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final ByteBuffer n(int i6) {
        if (w.f5205a >= 21) {
            return this.f6645a.getOutputBuffer(i6);
        }
        return this.f6647c[i6];
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void o(int i6, r7.c cVar, long j10) {
        this.f6645a.queueSecureInputBuffer(i6, 0, cVar.f30536i, j10, 0);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void b() {
    }
}
