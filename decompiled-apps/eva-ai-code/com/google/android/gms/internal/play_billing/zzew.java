package com.google.android.gms.internal.play_billing;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
public enum zzew {
    DOUBLE(zzex.DOUBLE, 1),
    FLOAT(zzex.FLOAT, 5),
    INT64(zzex.LONG, 0),
    UINT64(zzex.LONG, 0),
    INT32(zzex.INT, 0),
    FIXED64(zzex.LONG, 1),
    FIXED32(zzex.INT, 5),
    BOOL(zzex.BOOLEAN, 0),
    STRING(zzex.STRING, 2),
    GROUP(zzex.MESSAGE, 3),
    MESSAGE(zzex.MESSAGE, 2),
    BYTES(zzex.BYTE_STRING, 2),
    UINT32(zzex.INT, 0),
    ENUM(zzex.ENUM, 0),
    SFIXED32(zzex.INT, 5),
    SFIXED64(zzex.LONG, 1),
    SINT32(zzex.INT, 0),
    SINT64(zzex.LONG, 0);
    
    private final zzex zzt;

    zzew(zzex zzexVar, int i) {
        this.zzt = zzexVar;
    }

    public final zzex zza() {
        return this.zzt;
    }
}
