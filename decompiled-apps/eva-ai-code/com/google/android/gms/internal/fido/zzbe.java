package com.google.android.gms.internal.fido;

import java.util.Iterator;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* compiled from: com.google.android.gms:play-services-fido@@19.0.1 */
/* loaded from: classes2.dex */
final class zzbe extends zzba {
    final transient Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbe(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.fido.zzba, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.fido.zzba, com.google.android.gms.internal.fido.zzaw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzbb(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.zza.toString() + AbstractJsonLexerKt.END_LIST;
    }

    @Override // com.google.android.gms.internal.fido.zzaw
    final int zza(Object[] objArr, int i) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.android.gms.internal.fido.zzba, com.google.android.gms.internal.fido.zzaw
    public final zzbf zzd() {
        return new zzbb(this.zza);
    }
}
