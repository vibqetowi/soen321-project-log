package com.google.android.exoplayer2;

import com.google.android.exoplayer2.z;
/* compiled from: ExoPlayerImplInternal.java */
/* loaded from: classes.dex */
public final class l implements z.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m f6558a;

    public l(m mVar) {
        this.f6558a = mVar;
    }

    @Override // com.google.android.exoplayer2.z.a
    public final void a() {
        this.f6558a.B.j(2);
    }

    @Override // com.google.android.exoplayer2.z.a
    public final void b(long j10) {
        if (j10 >= 2000) {
            this.f6558a.f6560b0 = true;
        }
    }
}
