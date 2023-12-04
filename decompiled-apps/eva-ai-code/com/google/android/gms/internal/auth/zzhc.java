package com.google.android.gms.internal.auth;

import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
final class zzhc implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzhd zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhc(zzhd zzhdVar) {
        zzfe zzfeVar;
        this.zzb = zzhdVar;
        zzfeVar = zzhdVar.zza;
        this.zza = zzfeVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
