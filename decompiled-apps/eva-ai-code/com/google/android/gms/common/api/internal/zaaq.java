package com.google.android.gms.common.api.internal;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
final class zaaq extends zabg {
    final /* synthetic */ zaaw zaa;
    final /* synthetic */ com.google.android.gms.signin.internal.zak zab;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaaq(zaar zaarVar, zabf zabfVar, zaaw zaawVar, com.google.android.gms.signin.internal.zak zakVar) {
        super(zabfVar);
        this.zaa = zaawVar;
        this.zab = zakVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabg
    public final void zaa() {
        zaaw.zar(this.zaa, this.zab);
    }
}
