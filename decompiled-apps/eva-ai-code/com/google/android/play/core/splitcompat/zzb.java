package com.google.android.play.core.splitcompat;

import java.io.File;
/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes2.dex */
final class zzb extends zzt {
    private final File zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(File file, String str) {
        if (file == null) {
            throw new NullPointerException("Null splitFile");
        }
        this.zza = file;
        if (str != null) {
            this.zzb = str;
            return;
        }
        throw new NullPointerException("Null splitId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzt) {
            zzt zztVar = (zzt) obj;
            if (this.zza.equals(zztVar.zza()) && this.zzb.equals(zztVar.zzb())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String str = this.zzb;
        return "SplitFileInfo{splitFile=" + obj + ", splitId=" + str + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.splitcompat.zzt
    public final File zza() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.play.core.splitcompat.zzt
    public final String zzb() {
        return this.zzb;
    }
}
