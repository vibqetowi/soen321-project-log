package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.c;
import java.io.IOException;
import java.util.UUID;
/* loaded from: classes.dex */
public interface DrmSession {

    /* loaded from: classes.dex */
    public static class DrmSessionException extends IOException {

        /* renamed from: u  reason: collision with root package name */
        public final int f6422u;

        public DrmSessionException(Throwable th2, int i6) {
            super(th2);
            this.f6422u = i6;
        }
    }

    void a(c.a aVar);

    void b(c.a aVar);

    UUID c();

    boolean d();

    boolean e(String str);

    r7.b f();

    DrmSessionException getError();

    int getState();
}
