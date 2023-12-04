package com.google.android.gms.internal.play_billing;
/* compiled from: com.android.billingclient:billing@@6.0.1 */
/* loaded from: classes2.dex */
public enum zzbt {
    DOUBLE(0, 1, zzcj.DOUBLE),
    FLOAT(1, 1, zzcj.FLOAT),
    INT64(2, 1, zzcj.LONG),
    UINT64(3, 1, zzcj.LONG),
    INT32(4, 1, zzcj.INT),
    FIXED64(5, 1, zzcj.LONG),
    FIXED32(6, 1, zzcj.INT),
    BOOL(7, 1, zzcj.BOOLEAN),
    STRING(8, 1, zzcj.STRING),
    MESSAGE(9, 1, zzcj.MESSAGE),
    BYTES(10, 1, zzcj.BYTE_STRING),
    UINT32(11, 1, zzcj.INT),
    ENUM(12, 1, zzcj.ENUM),
    SFIXED32(13, 1, zzcj.INT),
    SFIXED64(14, 1, zzcj.LONG),
    SINT32(15, 1, zzcj.INT),
    SINT64(16, 1, zzcj.LONG),
    GROUP(17, 1, zzcj.MESSAGE),
    DOUBLE_LIST(18, 2, zzcj.DOUBLE),
    FLOAT_LIST(19, 2, zzcj.FLOAT),
    INT64_LIST(20, 2, zzcj.LONG),
    UINT64_LIST(21, 2, zzcj.LONG),
    INT32_LIST(22, 2, zzcj.INT),
    FIXED64_LIST(23, 2, zzcj.LONG),
    FIXED32_LIST(24, 2, zzcj.INT),
    BOOL_LIST(25, 2, zzcj.BOOLEAN),
    STRING_LIST(26, 2, zzcj.STRING),
    MESSAGE_LIST(27, 2, zzcj.MESSAGE),
    BYTES_LIST(28, 2, zzcj.BYTE_STRING),
    UINT32_LIST(29, 2, zzcj.INT),
    ENUM_LIST(30, 2, zzcj.ENUM),
    SFIXED32_LIST(31, 2, zzcj.INT),
    SFIXED64_LIST(32, 2, zzcj.LONG),
    SINT32_LIST(33, 2, zzcj.INT),
    SINT64_LIST(34, 2, zzcj.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzcj.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzcj.FLOAT),
    INT64_LIST_PACKED(37, 3, zzcj.LONG),
    UINT64_LIST_PACKED(38, 3, zzcj.LONG),
    INT32_LIST_PACKED(39, 3, zzcj.INT),
    FIXED64_LIST_PACKED(40, 3, zzcj.LONG),
    FIXED32_LIST_PACKED(41, 3, zzcj.INT),
    BOOL_LIST_PACKED(42, 3, zzcj.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzcj.INT),
    ENUM_LIST_PACKED(44, 3, zzcj.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzcj.INT),
    SFIXED64_LIST_PACKED(46, 3, zzcj.LONG),
    SINT32_LIST_PACKED(47, 3, zzcj.INT),
    SINT64_LIST_PACKED(48, 3, zzcj.LONG),
    GROUP_LIST(49, 2, zzcj.MESSAGE),
    MAP(50, 4, zzcj.VOID);
    
    private static final zzbt[] zzZ;
    private final zzcj zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzbt[] values = values();
        zzZ = new zzbt[values.length];
        for (zzbt zzbtVar : values) {
            zzZ[zzbtVar.zzac] = zzbtVar;
        }
    }

    zzbt(int i, int i2, zzcj zzcjVar) {
        this.zzac = i;
        this.zzab = zzcjVar;
        int i3 = i2 - 1;
        if (i3 == 1) {
            this.zzad = zzcjVar.zza();
        } else if (i3 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzcjVar.zza();
        }
        if (i2 == 1) {
            zzcj zzcjVar2 = zzcj.VOID;
            zzcjVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}
