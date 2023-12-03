package d9;

import android.os.Handler;
import com.google.android.exoplayer2.a0;
import com.google.android.gms.internal.p000firebaseauthapi.le;
/* compiled from: VideoRendererEventListener.java */
/* loaded from: classes.dex */
public interface o {

    /* compiled from: VideoRendererEventListener.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f12709a;

        /* renamed from: b  reason: collision with root package name */
        public final o f12710b;

        public a(Handler handler, a0.a aVar) {
            this.f12709a = handler;
            this.f12710b = aVar;
        }

        public final void a(le leVar) {
            synchronized (leVar) {
            }
            Handler handler = this.f12709a;
            if (handler != null) {
                handler.post(new m(this, leVar, 0));
            }
        }
    }

    void E(le leVar);

    void F(int i6, long j10);

    void H(long j10, String str, long j11);

    void Z(Exception exc);

    void a0(com.google.android.exoplayer2.n nVar, r7.f fVar);

    void b0(long j10, Object obj);

    void c(q qVar);

    void c0(le leVar);

    @Deprecated
    void j();

    void m(String str);

    void o(int i6, long j10);
}
