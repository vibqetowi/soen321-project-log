package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.n;
import java.nio.ByteBuffer;
/* compiled from: MediaCodecAdapter.java */
/* loaded from: classes.dex */
public interface c {

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final d f6633a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f6634b;

        /* renamed from: c  reason: collision with root package name */
        public final n f6635c;

        /* renamed from: d  reason: collision with root package name */
        public final Surface f6636d;

        /* renamed from: e  reason: collision with root package name */
        public final MediaCrypto f6637e;

        public a(d dVar, MediaFormat mediaFormat, n nVar, Surface surface, MediaCrypto mediaCrypto) {
            this.f6633a = dVar;
            this.f6634b = mediaFormat;
            this.f6635c = nVar;
            this.f6636d = surface;
            this.f6637e = mediaCrypto;
        }
    }

    /* compiled from: MediaCodecAdapter.java */
    /* loaded from: classes.dex */
    public interface b {
        c a(a aVar);
    }

    /* compiled from: MediaCodecAdapter.java */
    /* renamed from: com.google.android.exoplayer2.mediacodec.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0137c {
    }

    void a();

    void b();

    MediaFormat c();

    void d(Bundle bundle);

    void e(int i6, long j10);

    int f();

    void flush();

    int g(MediaCodec.BufferInfo bufferInfo);

    void h(int i6, int i10, int i11, long j10);

    void i(InterfaceC0137c interfaceC0137c, Handler handler);

    void j(int i6, boolean z10);

    void k(int i6);

    ByteBuffer l(int i6);

    void m(Surface surface);

    ByteBuffer n(int i6);

    void o(int i6, r7.c cVar, long j10);
}
