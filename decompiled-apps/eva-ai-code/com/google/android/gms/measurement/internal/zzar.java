package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzar implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzas zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzar(zzas zzasVar) {
        Bundle bundle;
        this.zzb = zzasVar;
        bundle = zzasVar.zza;
        this.zza = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final String next() {
        return (String) this.zza.next();
    }
}
