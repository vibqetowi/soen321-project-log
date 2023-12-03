package f8;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import f8.d;
/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes.dex */
public final class c extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f14881a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Looper looper) {
        super(looper);
        this.f14881a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        d.a aVar;
        d dVar = this.f14881a;
        dVar.getClass();
        int i6 = message.what;
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    dVar.f14887d.set(new IllegalStateException(String.valueOf(message.what)));
                } else {
                    dVar.f14888e.c();
                }
                aVar = null;
            } else {
                aVar = (d.a) message.obj;
                int i10 = aVar.f14889a;
                int i11 = aVar.f14890b;
                MediaCodec.CryptoInfo cryptoInfo = aVar.f14892d;
                long j10 = aVar.f14893e;
                int i12 = aVar.f;
                try {
                    synchronized (d.f14883h) {
                        dVar.f14884a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
                    }
                } catch (RuntimeException e10) {
                    dVar.f14887d.set(e10);
                }
            }
        } else {
            aVar = (d.a) message.obj;
            try {
                dVar.f14884a.queueInputBuffer(aVar.f14889a, aVar.f14890b, aVar.f14891c, aVar.f14893e, aVar.f);
            } catch (RuntimeException e11) {
                dVar.f14887d.set(e11);
            }
        }
        if (aVar != null) {
            d.c(aVar);
        }
    }
}
