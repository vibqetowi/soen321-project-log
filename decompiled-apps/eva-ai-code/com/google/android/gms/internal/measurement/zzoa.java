package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public enum zzoa {
    DOUBLE(zzob.DOUBLE, 1),
    FLOAT(zzob.FLOAT, 5),
    INT64(zzob.LONG, 0),
    UINT64(zzob.LONG, 0),
    INT32(zzob.INT, 0),
    FIXED64(zzob.LONG, 1),
    FIXED32(zzob.INT, 5),
    BOOL(zzob.BOOLEAN, 0),
    STRING(zzob.STRING, 2),
    GROUP(zzob.MESSAGE, 3),
    MESSAGE(zzob.MESSAGE, 2),
    BYTES(zzob.BYTE_STRING, 2),
    UINT32(zzob.INT, 0),
    ENUM(zzob.ENUM, 0),
    SFIXED32(zzob.INT, 5),
    SFIXED64(zzob.LONG, 1),
    SINT32(zzob.INT, 0),
    SINT64(zzob.LONG, 0);
    
    private final zzob zzt;

    zzoa(zzob zzobVar, int i) {
        this.zzt = zzobVar;
    }

    public final zzob zza() {
        return this.zzt;
    }
}
