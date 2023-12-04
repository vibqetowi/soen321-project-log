package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdo;
import com.google.android.gms.internal.auth.zzdp;
/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes2.dex */
public abstract class zzdo<MessageType extends zzdp<MessageType, BuilderType>, BuilderType extends zzdo<MessageType, BuilderType>> implements zzfv {
    @Override // 
    /* renamed from: zza */
    public abstract zzdo clone();

    protected abstract zzdo zzb(zzdp zzdpVar);

    @Override // com.google.android.gms.internal.auth.zzfv
    public final /* bridge */ /* synthetic */ zzfv zzc(zzfw zzfwVar) {
        if (!zzh().getClass().isInstance(zzfwVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zzb((zzdp) zzfwVar);
    }
}
