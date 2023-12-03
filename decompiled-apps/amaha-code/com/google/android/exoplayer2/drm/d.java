package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.n;
/* compiled from: DrmSessionManager.java */
/* loaded from: classes.dex */
public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6443a = new a();

    /* compiled from: DrmSessionManager.java */
    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final com.google.firebase.messaging.j f6444a = new com.google.firebase.messaging.j(26);

        void a();
    }

    void a();

    b b(Looper looper, c.a aVar, n nVar);

    DrmSession c(Looper looper, c.a aVar, n nVar);

    int d(n nVar);

    void l();

    /* compiled from: DrmSessionManager.java */
    /* loaded from: classes.dex */
    public class a implements d {
        @Override // com.google.android.exoplayer2.drm.d
        public final /* synthetic */ b b(Looper looper, c.a aVar, n nVar) {
            return b.f6444a;
        }

        @Override // com.google.android.exoplayer2.drm.d
        public final DrmSession c(Looper looper, c.a aVar, n nVar) {
            if (nVar.I == null) {
                return null;
            }
            return new f(new DrmSession.DrmSessionException(new UnsupportedDrmException(), 6001));
        }

        @Override // com.google.android.exoplayer2.drm.d
        public final int d(n nVar) {
            if (nVar.I != null) {
                return 1;
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.drm.d
        public final /* synthetic */ void a() {
        }

        @Override // com.google.android.exoplayer2.drm.d
        public final /* synthetic */ void l() {
        }
    }
}
