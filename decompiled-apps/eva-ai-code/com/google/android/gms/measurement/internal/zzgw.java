package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import org.checkerframework.dataflow.qual.Pure;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
public class zzgw implements zzgy {
    protected final zzgd zzt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgw(zzgd zzgdVar) {
        Preconditions.checkNotNull(zzgdVar);
        this.zzt = zzgdVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final zzet zzaA() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final zzga zzaB() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final Context zzaw() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final Clock zzax() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    @Pure
    public final zzab zzay() {
        throw null;
    }

    public void zzaz() {
        this.zzt.zzaB().zzaz();
    }

    public void zzg() {
        this.zzt.zzaB().zzg();
    }
}
