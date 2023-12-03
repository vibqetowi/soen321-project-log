package f8;

import android.media.MediaCodec;
import android.os.HandlerThread;
import c9.w;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: g  reason: collision with root package name */
    public static final ArrayDeque<a> f14882g = new ArrayDeque<>();

    /* renamed from: h  reason: collision with root package name */
    public static final Object f14883h = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f14884a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f14885b;

    /* renamed from: c  reason: collision with root package name */
    public c f14886c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<RuntimeException> f14887d;

    /* renamed from: e  reason: collision with root package name */
    public final c9.d f14888e;
    public boolean f;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f14889a;

        /* renamed from: b  reason: collision with root package name */
        public int f14890b;

        /* renamed from: c  reason: collision with root package name */
        public int f14891c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f14892d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f14893e;
        public int f;
    }

    public d(MediaCodec mediaCodec, HandlerThread handlerThread) {
        c9.d dVar = new c9.d();
        this.f14884a = mediaCodec;
        this.f14885b = handlerThread;
        this.f14888e = dVar;
        this.f14887d = new AtomicReference<>();
    }

    public static void c(a aVar) {
        ArrayDeque<a> arrayDeque = f14882g;
        synchronized (arrayDeque) {
            arrayDeque.add(aVar);
        }
    }

    public final void a() {
        if (this.f) {
            try {
                c cVar = this.f14886c;
                int i6 = w.f5205a;
                cVar.removeCallbacksAndMessages(null);
                c9.d dVar = this.f14888e;
                synchronized (dVar) {
                    dVar.f5132b = false;
                }
                this.f14886c.obtainMessage(2).sendToTarget();
                dVar.a();
                RuntimeException andSet = this.f14887d.getAndSet(null);
                if (andSet != null) {
                    throw andSet;
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void b(int i6, r7.c cVar, long j10) {
        a removeFirst;
        RuntimeException andSet = this.f14887d.getAndSet(null);
        if (andSet == null) {
            ArrayDeque<a> arrayDeque = f14882g;
            synchronized (arrayDeque) {
                if (arrayDeque.isEmpty()) {
                    removeFirst = new a();
                } else {
                    removeFirst = arrayDeque.removeFirst();
                }
            }
            removeFirst.f14889a = i6;
            removeFirst.f14890b = 0;
            removeFirst.f14891c = 0;
            removeFirst.f14893e = j10;
            removeFirst.f = 0;
            int i10 = cVar.f;
            MediaCodec.CryptoInfo cryptoInfo = removeFirst.f14892d;
            cryptoInfo.numSubSamples = i10;
            int[] iArr = cVar.f30532d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = cVar.f30533e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = cVar.f30530b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = cVar.f30529a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = cVar.f30531c;
            if (w.f5205a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f30534g, cVar.f30535h));
            }
            this.f14886c.obtainMessage(1, removeFirst).sendToTarget();
            return;
        }
        throw andSet;
    }
}
