package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import c9.w;
import com.google.android.exoplayer2.mediacodec.c;
import f8.d;
import f8.h;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import nc.m;
/* compiled from: AsynchronousMediaCodecAdapter.java */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f6626a;

    /* renamed from: b  reason: collision with root package name */
    public final f8.e f6627b;

    /* renamed from: c  reason: collision with root package name */
    public final f8.d f6628c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f6629d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6630e;
    public int f = 0;

    /* compiled from: AsynchronousMediaCodecAdapter.java */
    /* renamed from: com.google.android.exoplayer2.mediacodec.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0136a implements c.b {

        /* renamed from: a  reason: collision with root package name */
        public final m<HandlerThread> f6631a;

        /* renamed from: b  reason: collision with root package name */
        public final m<HandlerThread> f6632b;

        public C0136a(final int i6) {
            m<HandlerThread> mVar = new m() { // from class: f8.b
                @Override // nc.m
                public final Object get() {
                    int i10 = r2;
                    int i11 = i6;
                    switch (i10) {
                        case 0:
                            return new HandlerThread(com.google.android.exoplayer2.mediacodec.a.q(i11, "ExoPlayer:MediaCodecAsyncAdapter:"));
                        default:
                            return new HandlerThread(com.google.android.exoplayer2.mediacodec.a.q(i11, "ExoPlayer:MediaCodecQueueingThread:"));
                    }
                }
            };
            m<HandlerThread> mVar2 = new m() { // from class: f8.b
                @Override // nc.m
                public final Object get() {
                    int i10 = r2;
                    int i11 = i6;
                    switch (i10) {
                        case 0:
                            return new HandlerThread(com.google.android.exoplayer2.mediacodec.a.q(i11, "ExoPlayer:MediaCodecAsyncAdapter:"));
                        default:
                            return new HandlerThread(com.google.android.exoplayer2.mediacodec.a.q(i11, "ExoPlayer:MediaCodecQueueingThread:"));
                    }
                }
            };
            this.f6631a = mVar;
            this.f6632b = mVar2;
        }

        @Override // com.google.android.exoplayer2.mediacodec.c.b
        /* renamed from: b */
        public final a a(c.a aVar) {
            MediaCodec mediaCodec;
            String str;
            a aVar2;
            String str2 = aVar.f6633a.f6638a;
            a aVar3 = null;
            try {
                String valueOf = String.valueOf(str2);
                if (valueOf.length() != 0) {
                    str = "createCodec:".concat(valueOf);
                } else {
                    str = new String("createCodec:");
                }
                kc.f.j(str);
                mediaCodec = MediaCodec.createByCodecName(str2);
                try {
                    aVar2 = new a(mediaCodec, this.f6631a.get(), this.f6632b.get(), false);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                mediaCodec = null;
            }
            try {
                kc.f.B();
                a.p(aVar2, aVar.f6634b, aVar.f6636d, aVar.f6637e);
                return aVar2;
            } catch (Exception e12) {
                e = e12;
                aVar3 = aVar2;
                if (aVar3 == null) {
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                } else {
                    aVar3.a();
                }
                throw e;
            }
        }
    }

    public a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f6626a = mediaCodec;
        this.f6627b = new f8.e(handlerThread);
        this.f6628c = new f8.d(mediaCodec, handlerThread2);
        this.f6629d = z10;
    }

    public static void p(a aVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        boolean z10;
        f8.e eVar = aVar.f6627b;
        if (eVar.f14896c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        HandlerThread handlerThread = eVar.f14895b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = aVar.f6626a;
        mediaCodec.setCallback(eVar, handler);
        eVar.f14896c = handler;
        kc.f.j("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        kc.f.B();
        f8.d dVar = aVar.f6628c;
        if (!dVar.f) {
            HandlerThread handlerThread2 = dVar.f14885b;
            handlerThread2.start();
            dVar.f14886c = new f8.c(dVar, handlerThread2.getLooper());
            dVar.f = true;
        }
        kc.f.j("startCodec");
        mediaCodec.start();
        kc.f.B();
        aVar.f = 1;
    }

    public static String q(int i6, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i6 == 1) {
            sb2.append("Audio");
        } else if (i6 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i6);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void a() {
        try {
            if (this.f == 1) {
                f8.d dVar = this.f6628c;
                if (dVar.f) {
                    dVar.a();
                    dVar.f14885b.quit();
                }
                dVar.f = false;
                f8.e eVar = this.f6627b;
                synchronized (eVar.f14894a) {
                    eVar.f14904l = true;
                    eVar.f14895b.quit();
                    eVar.a();
                }
            }
            this.f = 2;
        } finally {
            if (!this.f6630e) {
                this.f6626a.release();
                this.f6630e = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final MediaFormat c() {
        MediaFormat mediaFormat;
        f8.e eVar = this.f6627b;
        synchronized (eVar.f14894a) {
            mediaFormat = eVar.f14900h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void d(Bundle bundle) {
        r();
        this.f6626a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void e(int i6, long j10) {
        this.f6626a.releaseOutputBuffer(i6, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[Catch: all -> 0x0051, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000f, B:13:0x001a, B:15:0x001c, B:17:0x0021, B:19:0x0025, B:26:0x0041, B:25:0x0031, B:28:0x0043, B:29:0x0048, B:30:0x0049, B:31:0x004b, B:32:0x004c, B:33:0x004e), top: B:38:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[Catch: all -> 0x0051, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000f, B:13:0x001a, B:15:0x001c, B:17:0x0021, B:19:0x0025, B:26:0x0041, B:25:0x0031, B:28:0x0043, B:29:0x0048, B:30:0x0049, B:31:0x004b, B:32:0x004c, B:33:0x004e), top: B:38:0x0005 }] */
    @Override // com.google.android.exoplayer2.mediacodec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f() {
        boolean z10;
        int i6;
        f8.e eVar = this.f6627b;
        synchronized (eVar.f14894a) {
            boolean z11 = false;
            if (eVar.f14903k <= 0 && !eVar.f14904l) {
                z10 = false;
                i6 = -1;
                if (z10) {
                    IllegalStateException illegalStateException = eVar.f14905m;
                    if (illegalStateException == null) {
                        MediaCodec.CodecException codecException = eVar.f14902j;
                        if (codecException == null) {
                            h hVar = eVar.f14897d;
                            int i10 = hVar.f14912c;
                            if (i10 == 0) {
                                z11 = true;
                            }
                            if (!z11) {
                                if (i10 != 0) {
                                    int[] iArr = hVar.f14913d;
                                    int i11 = hVar.f14910a;
                                    int i12 = iArr[i11];
                                    hVar.f14910a = (i11 + 1) & hVar.f14914e;
                                    hVar.f14912c = i10 - 1;
                                    i6 = i12;
                                } else {
                                    throw new NoSuchElementException();
                                }
                            }
                        } else {
                            eVar.f14902j = null;
                            throw codecException;
                        }
                    } else {
                        eVar.f14905m = null;
                        throw illegalStateException;
                    }
                }
            }
            z10 = true;
            i6 = -1;
            if (z10) {
            }
        }
        return i6;
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void flush() {
        this.f6628c.a();
        this.f6626a.flush();
        f8.e eVar = this.f6627b;
        MediaCodec mediaCodec = this.f6626a;
        Objects.requireNonNull(mediaCodec);
        androidx.activity.b bVar = new androidx.activity.b(22, mediaCodec);
        synchronized (eVar.f14894a) {
            eVar.f14903k++;
            Handler handler = eVar.f14896c;
            int i6 = w.f5205a;
            handler.post(new q7.f(eVar, 2, bVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[Catch: all -> 0x007b, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000f, B:13:0x001a, B:15:0x001c, B:17:0x0021, B:19:0x0025, B:23:0x002e, B:26:0x0032, B:28:0x0043, B:32:0x006a, B:31:0x0060, B:35:0x006d, B:36:0x0072, B:37:0x0073, B:38:0x0075, B:39:0x0076, B:40:0x0078), top: B:45:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001c A[Catch: all -> 0x007b, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000f, B:13:0x001a, B:15:0x001c, B:17:0x0021, B:19:0x0025, B:23:0x002e, B:26:0x0032, B:28:0x0043, B:32:0x006a, B:31:0x0060, B:35:0x006d, B:36:0x0072, B:37:0x0073, B:38:0x0075, B:39:0x0076, B:40:0x0078), top: B:45:0x0005 }] */
    @Override // com.google.android.exoplayer2.mediacodec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        boolean z10;
        f8.e eVar = this.f6627b;
        synchronized (eVar.f14894a) {
            boolean z11 = false;
            if (eVar.f14903k <= 0 && !eVar.f14904l) {
                z10 = false;
                if (!z10) {
                    return -1;
                }
                IllegalStateException illegalStateException = eVar.f14905m;
                if (illegalStateException == null) {
                    MediaCodec.CodecException codecException = eVar.f14902j;
                    if (codecException == null) {
                        h hVar = eVar.f14898e;
                        int i6 = hVar.f14912c;
                        if (i6 == 0) {
                            z11 = true;
                        }
                        if (z11) {
                            return -1;
                        }
                        if (i6 != 0) {
                            int[] iArr = hVar.f14913d;
                            int i10 = hVar.f14910a;
                            int i11 = iArr[i10];
                            hVar.f14910a = (i10 + 1) & hVar.f14914e;
                            hVar.f14912c = i6 - 1;
                            if (i11 >= 0) {
                                sc.b.E(eVar.f14900h);
                                MediaCodec.BufferInfo remove = eVar.f.remove();
                                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                            } else if (i11 == -2) {
                                eVar.f14900h = eVar.f14899g.remove();
                            }
                            return i11;
                        }
                        throw new NoSuchElementException();
                    }
                    eVar.f14902j = null;
                    throw codecException;
                }
                eVar.f14905m = null;
                throw illegalStateException;
            }
            z10 = true;
            if (!z10) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void h(int i6, int i10, int i11, long j10) {
        d.a removeFirst;
        f8.d dVar = this.f6628c;
        RuntimeException andSet = dVar.f14887d.getAndSet(null);
        if (andSet == null) {
            ArrayDeque<d.a> arrayDeque = f8.d.f14882g;
            synchronized (arrayDeque) {
                if (arrayDeque.isEmpty()) {
                    removeFirst = new d.a();
                } else {
                    removeFirst = arrayDeque.removeFirst();
                }
            }
            removeFirst.f14889a = i6;
            removeFirst.f14890b = 0;
            removeFirst.f14891c = i10;
            removeFirst.f14893e = j10;
            removeFirst.f = i11;
            f8.c cVar = dVar.f14886c;
            int i12 = w.f5205a;
            cVar.obtainMessage(0, removeFirst).sendToTarget();
            return;
        }
        throw andSet;
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void i(c.InterfaceC0137c interfaceC0137c, Handler handler) {
        r();
        this.f6626a.setOnFrameRenderedListener(new f8.a(this, interfaceC0137c, 0), handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void j(int i6, boolean z10) {
        this.f6626a.releaseOutputBuffer(i6, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void k(int i6) {
        r();
        this.f6626a.setVideoScalingMode(i6);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final ByteBuffer l(int i6) {
        return this.f6626a.getInputBuffer(i6);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void m(Surface surface) {
        r();
        this.f6626a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final ByteBuffer n(int i6) {
        return this.f6626a.getOutputBuffer(i6);
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void o(int i6, r7.c cVar, long j10) {
        this.f6628c.b(i6, cVar, j10);
    }

    public final void r() {
        if (this.f6629d) {
            try {
                f8.d dVar = this.f6628c;
                c9.d dVar2 = dVar.f14888e;
                synchronized (dVar2) {
                    dVar2.f5132b = false;
                }
                f8.c cVar = dVar.f14886c;
                int i6 = w.f5205a;
                cVar.obtainMessage(2).sendToTarget();
                dVar2.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.c
    public final void b() {
    }
}
