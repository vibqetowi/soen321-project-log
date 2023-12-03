package f8;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import c9.w;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.mediacodec.c;
import d9.g;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14876a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c.InterfaceC0137c f14877b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.mediacodec.c f14878c;

    public /* synthetic */ a(com.google.android.exoplayer2.mediacodec.c cVar, c.InterfaceC0137c interfaceC0137c, int i6) {
        this.f14876a = i6;
        this.f14878c = cVar;
        this.f14877b = interfaceC0137c;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f14876a) {
            case 0:
                c.InterfaceC0137c interfaceC0137c = this.f14877b;
                ((com.google.android.exoplayer2.mediacodec.a) this.f14878c).getClass();
                g.b bVar = (g.b) interfaceC0137c;
                bVar.getClass();
                if (w.f5205a < 30) {
                    Handler handler = bVar.f12668u;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    return;
                }
                d9.g gVar = d9.g.this;
                if (bVar == gVar.F1) {
                    if (j10 == Long.MAX_VALUE) {
                        gVar.R0 = true;
                        return;
                    }
                    try {
                        gVar.u0(j10);
                        gVar.D0();
                        gVar.T0.getClass();
                        gVar.C0();
                        gVar.e0(j10);
                        return;
                    } catch (ExoPlaybackException e10) {
                        gVar.S0 = e10;
                        return;
                    }
                }
                return;
            default:
                c.InterfaceC0137c interfaceC0137c2 = this.f14877b;
                ((com.google.android.exoplayer2.mediacodec.f) this.f14878c).getClass();
                g.b bVar2 = (g.b) interfaceC0137c2;
                bVar2.getClass();
                if (w.f5205a < 30) {
                    Handler handler2 = bVar2.f12668u;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    return;
                }
                d9.g gVar2 = d9.g.this;
                if (bVar2 == gVar2.F1) {
                    if (j10 == Long.MAX_VALUE) {
                        gVar2.R0 = true;
                        return;
                    }
                    try {
                        gVar2.u0(j10);
                        gVar2.D0();
                        gVar2.T0.getClass();
                        gVar2.C0();
                        gVar2.e0(j10);
                        return;
                    } catch (ExoPlaybackException e11) {
                        gVar2.S0 = e11;
                        return;
                    }
                }
                return;
        }
    }
}
