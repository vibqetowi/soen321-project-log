package com.google.android.gms.internal.measurement;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF6 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public final class o5 {

    /* renamed from: v  reason: collision with root package name */
    public static final o5 f8532v;

    /* renamed from: w  reason: collision with root package name */
    public static final o5 f8533w;

    /* renamed from: x  reason: collision with root package name */
    public static final o5[] f8534x;

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ o5[] f8535y;

    /* renamed from: u  reason: collision with root package name */
    public final int f8536u;
    /* JADX INFO: Fake field, exist only in values array */
    o5 EF6;

    static {
        d6 d6Var = d6.DOUBLE;
        o5 o5Var = new o5("DOUBLE", 0, 0, 1, d6Var);
        d6 d6Var2 = d6.FLOAT;
        o5 o5Var2 = new o5("FLOAT", 1, 1, 1, d6Var2);
        d6 d6Var3 = d6.LONG;
        o5 o5Var3 = new o5("INT64", 2, 2, 1, d6Var3);
        o5 o5Var4 = new o5("UINT64", 3, 3, 1, d6Var3);
        d6 d6Var4 = d6.INT;
        o5 o5Var5 = new o5("INT32", 4, 4, 1, d6Var4);
        o5 o5Var6 = new o5("FIXED64", 5, 5, 1, d6Var3);
        o5 o5Var7 = new o5("FIXED32", 6, 6, 1, d6Var4);
        d6 d6Var5 = d6.BOOLEAN;
        o5 o5Var8 = new o5("BOOL", 7, 7, 1, d6Var5);
        d6 d6Var6 = d6.STRING;
        o5 o5Var9 = new o5("STRING", 8, 8, 1, d6Var6);
        d6 d6Var7 = d6.MESSAGE;
        o5 o5Var10 = new o5("MESSAGE", 9, 9, 1, d6Var7);
        d6 d6Var8 = d6.BYTE_STRING;
        o5 o5Var11 = new o5("BYTES", 10, 10, 1, d6Var8);
        o5 o5Var12 = new o5("UINT32", 11, 11, 1, d6Var4);
        d6 d6Var9 = d6.ENUM;
        o5 o5Var13 = new o5("ENUM", 12, 12, 1, d6Var9);
        o5 o5Var14 = new o5("SFIXED32", 13, 13, 1, d6Var4);
        o5 o5Var15 = new o5("SFIXED64", 14, 14, 1, d6Var3);
        o5 o5Var16 = new o5("SINT32", 15, 15, 1, d6Var4);
        o5 o5Var17 = new o5("SINT64", 16, 16, 1, d6Var3);
        o5 o5Var18 = new o5("GROUP", 17, 17, 1, d6Var7);
        o5 o5Var19 = new o5("DOUBLE_LIST", 18, 18, 2, d6Var);
        o5 o5Var20 = new o5("FLOAT_LIST", 19, 19, 2, d6Var2);
        o5 o5Var21 = new o5("INT64_LIST", 20, 20, 2, d6Var3);
        o5 o5Var22 = new o5("UINT64_LIST", 21, 21, 2, d6Var3);
        o5 o5Var23 = new o5("INT32_LIST", 22, 22, 2, d6Var4);
        o5 o5Var24 = new o5("FIXED64_LIST", 23, 23, 2, d6Var3);
        o5 o5Var25 = new o5("FIXED32_LIST", 24, 24, 2, d6Var4);
        o5 o5Var26 = new o5("BOOL_LIST", 25, 25, 2, d6Var5);
        o5 o5Var27 = new o5("STRING_LIST", 26, 26, 2, d6Var6);
        o5 o5Var28 = new o5("MESSAGE_LIST", 27, 27, 2, d6Var7);
        o5 o5Var29 = new o5("BYTES_LIST", 28, 28, 2, d6Var8);
        o5 o5Var30 = new o5("UINT32_LIST", 29, 29, 2, d6Var4);
        o5 o5Var31 = new o5("ENUM_LIST", 30, 30, 2, d6Var9);
        o5 o5Var32 = new o5("SFIXED32_LIST", 31, 31, 2, d6Var4);
        o5 o5Var33 = new o5("SFIXED64_LIST", 32, 32, 2, d6Var3);
        o5 o5Var34 = new o5("SINT32_LIST", 33, 33, 2, d6Var4);
        o5 o5Var35 = new o5("SINT64_LIST", 34, 34, 2, d6Var3);
        o5 o5Var36 = new o5("DOUBLE_LIST_PACKED", 35, 35, 3, d6Var);
        f8532v = o5Var36;
        o5 o5Var37 = new o5("FLOAT_LIST_PACKED", 36, 36, 3, d6Var2);
        o5 o5Var38 = new o5("INT64_LIST_PACKED", 37, 37, 3, d6Var3);
        o5 o5Var39 = new o5("UINT64_LIST_PACKED", 38, 38, 3, d6Var3);
        o5 o5Var40 = new o5("INT32_LIST_PACKED", 39, 39, 3, d6Var4);
        o5 o5Var41 = new o5("FIXED64_LIST_PACKED", 40, 40, 3, d6Var3);
        o5 o5Var42 = new o5("FIXED32_LIST_PACKED", 41, 41, 3, d6Var4);
        o5 o5Var43 = new o5("BOOL_LIST_PACKED", 42, 42, 3, d6Var5);
        o5 o5Var44 = new o5("UINT32_LIST_PACKED", 43, 43, 3, d6Var4);
        o5 o5Var45 = new o5("ENUM_LIST_PACKED", 44, 44, 3, d6Var9);
        o5 o5Var46 = new o5("SFIXED32_LIST_PACKED", 45, 45, 3, d6Var4);
        o5 o5Var47 = new o5("SFIXED64_LIST_PACKED", 46, 46, 3, d6Var3);
        o5 o5Var48 = new o5("SINT32_LIST_PACKED", 47, 47, 3, d6Var4);
        o5 o5Var49 = new o5("SINT64_LIST_PACKED", 48, 48, 3, d6Var3);
        f8533w = o5Var49;
        f8535y = new o5[]{o5Var, o5Var2, o5Var3, o5Var4, o5Var5, o5Var6, o5Var7, o5Var8, o5Var9, o5Var10, o5Var11, o5Var12, o5Var13, o5Var14, o5Var15, o5Var16, o5Var17, o5Var18, o5Var19, o5Var20, o5Var21, o5Var22, o5Var23, o5Var24, o5Var25, o5Var26, o5Var27, o5Var28, o5Var29, o5Var30, o5Var31, o5Var32, o5Var33, o5Var34, o5Var35, o5Var36, o5Var37, o5Var38, o5Var39, o5Var40, o5Var41, o5Var42, o5Var43, o5Var44, o5Var45, o5Var46, o5Var47, o5Var48, o5Var49, new o5("GROUP_LIST", 49, 49, 2, d6Var7), new o5("MAP", 50, 50, 4, d6.VOID)};
        o5[] values = values();
        f8534x = new o5[values.length];
        for (o5 o5Var50 : values) {
            f8534x[o5Var50.f8536u] = o5Var50;
        }
    }

    public o5(String str, int i6, int i10, int i11, d6 d6Var) {
        this.f8536u = i10;
        d6 d6Var2 = d6.VOID;
        int i12 = i11 - 1;
        if (i12 != 1) {
            if (i12 == 3) {
                d6Var.getClass();
            }
        } else {
            d6Var.getClass();
        }
        if (i11 == 1) {
            d6Var.ordinal();
        }
    }

    public static o5[] values() {
        return (o5[]) f8535y.clone();
    }

    public final int a() {
        return this.f8536u;
    }
}
