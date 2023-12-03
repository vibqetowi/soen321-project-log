package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: DummyExoMediaDrm.java */
/* loaded from: classes.dex */
public final class e implements g {
    @Override // com.google.android.exoplayer2.drm.g
    public final Map<String, String> b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final g.d c() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final r7.b d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final byte[] e() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final void f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final byte[] h(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final void i(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final g.a k(byte[] bArr, List<b.C0134b> list, int i6, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final int l() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final boolean m(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final void a() {
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final void g(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.g
    public final void j(DefaultDrmSessionManager.a aVar) {
    }
}
