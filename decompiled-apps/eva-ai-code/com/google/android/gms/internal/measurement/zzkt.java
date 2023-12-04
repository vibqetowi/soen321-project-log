package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
public enum zzkt {
    DOUBLE(0, 1, zzlm.DOUBLE),
    FLOAT(1, 1, zzlm.FLOAT),
    INT64(2, 1, zzlm.LONG),
    UINT64(3, 1, zzlm.LONG),
    INT32(4, 1, zzlm.INT),
    FIXED64(5, 1, zzlm.LONG),
    FIXED32(6, 1, zzlm.INT),
    BOOL(7, 1, zzlm.BOOLEAN),
    STRING(8, 1, zzlm.STRING),
    MESSAGE(9, 1, zzlm.MESSAGE),
    BYTES(10, 1, zzlm.BYTE_STRING),
    UINT32(11, 1, zzlm.INT),
    ENUM(12, 1, zzlm.ENUM),
    SFIXED32(13, 1, zzlm.INT),
    SFIXED64(14, 1, zzlm.LONG),
    SINT32(15, 1, zzlm.INT),
    SINT64(16, 1, zzlm.LONG),
    GROUP(17, 1, zzlm.MESSAGE),
    DOUBLE_LIST(18, 2, zzlm.DOUBLE),
    FLOAT_LIST(19, 2, zzlm.FLOAT),
    INT64_LIST(20, 2, zzlm.LONG),
    UINT64_LIST(21, 2, zzlm.LONG),
    INT32_LIST(22, 2, zzlm.INT),
    FIXED64_LIST(23, 2, zzlm.LONG),
    FIXED32_LIST(24, 2, zzlm.INT),
    BOOL_LIST(25, 2, zzlm.BOOLEAN),
    STRING_LIST(26, 2, zzlm.STRING),
    MESSAGE_LIST(27, 2, zzlm.MESSAGE),
    BYTES_LIST(28, 2, zzlm.BYTE_STRING),
    UINT32_LIST(29, 2, zzlm.INT),
    ENUM_LIST(30, 2, zzlm.ENUM),
    SFIXED32_LIST(31, 2, zzlm.INT),
    SFIXED64_LIST(32, 2, zzlm.LONG),
    SINT32_LIST(33, 2, zzlm.INT),
    SINT64_LIST(34, 2, zzlm.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzlm.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzlm.FLOAT),
    INT64_LIST_PACKED(37, 3, zzlm.LONG),
    UINT64_LIST_PACKED(38, 3, zzlm.LONG),
    INT32_LIST_PACKED(39, 3, zzlm.INT),
    FIXED64_LIST_PACKED(40, 3, zzlm.LONG),
    FIXED32_LIST_PACKED(41, 3, zzlm.INT),
    BOOL_LIST_PACKED(42, 3, zzlm.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzlm.INT),
    ENUM_LIST_PACKED(44, 3, zzlm.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzlm.INT),
    SFIXED64_LIST_PACKED(46, 3, zzlm.LONG),
    SINT32_LIST_PACKED(47, 3, zzlm.INT),
    SINT64_LIST_PACKED(48, 3, zzlm.LONG),
    GROUP_LIST(49, 2, zzlm.MESSAGE),
    MAP(50, 4, zzlm.VOID);
    
    private static final zzkt[] zzZ;
    private final zzlm zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzkt[] values = values();
        zzZ = new zzkt[values.length];
        for (zzkt zzktVar : values) {
            zzZ[zzktVar.zzac] = zzktVar;
        }
    }

    zzkt(int i, int i2, zzlm zzlmVar) {
        this.zzac = i;
        this.zzab = zzlmVar;
        zzlm zzlmVar2 = zzlm.VOID;
        int i3 = i2 - 1;
        if (i3 == 1) {
            this.zzad = zzlmVar.zza();
        } else if (i3 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzlmVar.zza();
        }
        if (i2 == 1) {
            zzlmVar.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}
