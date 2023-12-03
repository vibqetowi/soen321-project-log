package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.a0;
import com.google.android.exoplayer2.n;
import com.google.android.gms.internal.p000firebaseauthapi.le;
/* compiled from: AudioRendererEventListener.java */
/* loaded from: classes.dex */
public interface a {

    /* compiled from: AudioRendererEventListener.java */
    /* renamed from: com.google.android.exoplayer2.audio.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0132a {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f6253a;

        /* renamed from: b  reason: collision with root package name */
        public final a f6254b;

        public C0132a(Handler handler, a0.a aVar) {
            this.f6253a = handler;
            this.f6254b = aVar;
        }

        public final void a(le leVar) {
            synchronized (leVar) {
            }
            Handler handler = this.f6253a;
            if (handler != null) {
                handler.post(new q7.h(this, leVar, 0));
            }
        }
    }

    void B(String str);

    void M(le leVar);

    void P(le leVar);

    void Q(long j10, String str, long j11);

    void S(Exception exc);

    void U(n nVar, r7.f fVar);

    void W(long j10);

    void Y(Exception exc);

    @Deprecated
    void d();

    void g(boolean z10);

    void j0(int i6, long j10, long j11);
}
