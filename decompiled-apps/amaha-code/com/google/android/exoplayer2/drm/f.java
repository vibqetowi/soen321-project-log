package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.c;
import java.util.UUID;
/* compiled from: ErrorStateDrmSession.java */
/* loaded from: classes.dex */
public final class f implements DrmSession {

    /* renamed from: a  reason: collision with root package name */
    public final DrmSession.DrmSessionException f6445a;

    public f(DrmSession.DrmSessionException drmSessionException) {
        this.f6445a = drmSessionException;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID c() {
        return o7.b.f27180a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean e(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final r7.b f() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        return this.f6445a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void a(c.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void b(c.a aVar) {
    }
}
