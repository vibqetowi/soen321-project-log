package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class k3 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8447a = 1;

    public k3() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        switch (this.f8447a) {
            case 0:
                m3.f8467d.set(true);
                return;
            default:
                h4.f8404h.incrementAndGet();
                return;
        }
    }

    public k3(int i6) {
        super(null);
    }
}
