package f8;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
/* compiled from: AsynchronousMediaCodecCallback.java */
/* loaded from: classes.dex */
public final class e extends MediaCodec.Callback {

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f14895b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f14896c;

    /* renamed from: h  reason: collision with root package name */
    public MediaFormat f14900h;

    /* renamed from: i  reason: collision with root package name */
    public MediaFormat f14901i;

    /* renamed from: j  reason: collision with root package name */
    public MediaCodec.CodecException f14902j;

    /* renamed from: k  reason: collision with root package name */
    public long f14903k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14904l;

    /* renamed from: m  reason: collision with root package name */
    public IllegalStateException f14905m;

    /* renamed from: a  reason: collision with root package name */
    public final Object f14894a = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final h f14897d = new h();

    /* renamed from: e  reason: collision with root package name */
    public final h f14898e = new h();
    public final ArrayDeque<MediaCodec.BufferInfo> f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f14899g = new ArrayDeque<>();

    public e(HandlerThread handlerThread) {
        this.f14895b = handlerThread;
    }

    public final void a() {
        ArrayDeque<MediaFormat> arrayDeque = this.f14899g;
        if (!arrayDeque.isEmpty()) {
            this.f14901i = arrayDeque.getLast();
        }
        h hVar = this.f14897d;
        hVar.f14910a = 0;
        hVar.f14911b = -1;
        hVar.f14912c = 0;
        h hVar2 = this.f14898e;
        hVar2.f14910a = 0;
        hVar2.f14911b = -1;
        hVar2.f14912c = 0;
        this.f.clear();
        arrayDeque.clear();
        this.f14902j = null;
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f14894a) {
            this.f14905m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f14894a) {
            this.f14902j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i6) {
        synchronized (this.f14894a) {
            this.f14897d.a(i6);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i6, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f14894a) {
            MediaFormat mediaFormat = this.f14901i;
            if (mediaFormat != null) {
                this.f14898e.a(-2);
                this.f14899g.add(mediaFormat);
                this.f14901i = null;
            }
            this.f14898e.a(i6);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f14894a) {
            this.f14898e.a(-2);
            this.f14899g.add(mediaFormat);
            this.f14901i = null;
        }
    }
}
