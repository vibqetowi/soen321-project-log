package com.google.android.gms.internal.cast;
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
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: v  reason: collision with root package name */
    public static final y2 f7683v;

    /* renamed from: w  reason: collision with root package name */
    public static final y2 f7684w;

    /* renamed from: x  reason: collision with root package name */
    public static final y2[] f7685x;

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ y2[] f7686y;

    /* renamed from: u  reason: collision with root package name */
    public final int f7687u;
    /* JADX INFO: Fake field, exist only in values array */
    y2 EF6;

    static {
        l3 l3Var = l3.DOUBLE;
        y2 y2Var = new y2("DOUBLE", 0, 0, 1, l3Var);
        l3 l3Var2 = l3.FLOAT;
        y2 y2Var2 = new y2("FLOAT", 1, 1, 1, l3Var2);
        l3 l3Var3 = l3.LONG;
        y2 y2Var3 = new y2("INT64", 2, 2, 1, l3Var3);
        y2 y2Var4 = new y2("UINT64", 3, 3, 1, l3Var3);
        l3 l3Var4 = l3.INT;
        y2 y2Var5 = new y2("INT32", 4, 4, 1, l3Var4);
        y2 y2Var6 = new y2("FIXED64", 5, 5, 1, l3Var3);
        y2 y2Var7 = new y2("FIXED32", 6, 6, 1, l3Var4);
        l3 l3Var5 = l3.BOOLEAN;
        y2 y2Var8 = new y2("BOOL", 7, 7, 1, l3Var5);
        l3 l3Var6 = l3.STRING;
        y2 y2Var9 = new y2("STRING", 8, 8, 1, l3Var6);
        l3 l3Var7 = l3.MESSAGE;
        y2 y2Var10 = new y2("MESSAGE", 9, 9, 1, l3Var7);
        l3 l3Var8 = l3.BYTE_STRING;
        y2 y2Var11 = new y2("BYTES", 10, 10, 1, l3Var8);
        y2 y2Var12 = new y2("UINT32", 11, 11, 1, l3Var4);
        l3 l3Var9 = l3.ENUM;
        y2 y2Var13 = new y2("ENUM", 12, 12, 1, l3Var9);
        y2 y2Var14 = new y2("SFIXED32", 13, 13, 1, l3Var4);
        y2 y2Var15 = new y2("SFIXED64", 14, 14, 1, l3Var3);
        y2 y2Var16 = new y2("SINT32", 15, 15, 1, l3Var4);
        y2 y2Var17 = new y2("SINT64", 16, 16, 1, l3Var3);
        y2 y2Var18 = new y2("GROUP", 17, 17, 1, l3Var7);
        y2 y2Var19 = new y2("DOUBLE_LIST", 18, 18, 2, l3Var);
        y2 y2Var20 = new y2("FLOAT_LIST", 19, 19, 2, l3Var2);
        y2 y2Var21 = new y2("INT64_LIST", 20, 20, 2, l3Var3);
        y2 y2Var22 = new y2("UINT64_LIST", 21, 21, 2, l3Var3);
        y2 y2Var23 = new y2("INT32_LIST", 22, 22, 2, l3Var4);
        y2 y2Var24 = new y2("FIXED64_LIST", 23, 23, 2, l3Var3);
        y2 y2Var25 = new y2("FIXED32_LIST", 24, 24, 2, l3Var4);
        y2 y2Var26 = new y2("BOOL_LIST", 25, 25, 2, l3Var5);
        y2 y2Var27 = new y2("STRING_LIST", 26, 26, 2, l3Var6);
        y2 y2Var28 = new y2("MESSAGE_LIST", 27, 27, 2, l3Var7);
        y2 y2Var29 = new y2("BYTES_LIST", 28, 28, 2, l3Var8);
        y2 y2Var30 = new y2("UINT32_LIST", 29, 29, 2, l3Var4);
        y2 y2Var31 = new y2("ENUM_LIST", 30, 30, 2, l3Var9);
        y2 y2Var32 = new y2("SFIXED32_LIST", 31, 31, 2, l3Var4);
        y2 y2Var33 = new y2("SFIXED64_LIST", 32, 32, 2, l3Var3);
        y2 y2Var34 = new y2("SINT32_LIST", 33, 33, 2, l3Var4);
        y2 y2Var35 = new y2("SINT64_LIST", 34, 34, 2, l3Var3);
        y2 y2Var36 = new y2("DOUBLE_LIST_PACKED", 35, 35, 3, l3Var);
        f7683v = y2Var36;
        y2 y2Var37 = new y2("FLOAT_LIST_PACKED", 36, 36, 3, l3Var2);
        y2 y2Var38 = new y2("INT64_LIST_PACKED", 37, 37, 3, l3Var3);
        y2 y2Var39 = new y2("UINT64_LIST_PACKED", 38, 38, 3, l3Var3);
        y2 y2Var40 = new y2("INT32_LIST_PACKED", 39, 39, 3, l3Var4);
        y2 y2Var41 = new y2("FIXED64_LIST_PACKED", 40, 40, 3, l3Var3);
        y2 y2Var42 = new y2("FIXED32_LIST_PACKED", 41, 41, 3, l3Var4);
        y2 y2Var43 = new y2("BOOL_LIST_PACKED", 42, 42, 3, l3Var5);
        y2 y2Var44 = new y2("UINT32_LIST_PACKED", 43, 43, 3, l3Var4);
        y2 y2Var45 = new y2("ENUM_LIST_PACKED", 44, 44, 3, l3Var9);
        y2 y2Var46 = new y2("SFIXED32_LIST_PACKED", 45, 45, 3, l3Var4);
        y2 y2Var47 = new y2("SFIXED64_LIST_PACKED", 46, 46, 3, l3Var3);
        y2 y2Var48 = new y2("SINT32_LIST_PACKED", 47, 47, 3, l3Var4);
        y2 y2Var49 = new y2("SINT64_LIST_PACKED", 48, 48, 3, l3Var3);
        f7684w = y2Var49;
        f7686y = new y2[]{y2Var, y2Var2, y2Var3, y2Var4, y2Var5, y2Var6, y2Var7, y2Var8, y2Var9, y2Var10, y2Var11, y2Var12, y2Var13, y2Var14, y2Var15, y2Var16, y2Var17, y2Var18, y2Var19, y2Var20, y2Var21, y2Var22, y2Var23, y2Var24, y2Var25, y2Var26, y2Var27, y2Var28, y2Var29, y2Var30, y2Var31, y2Var32, y2Var33, y2Var34, y2Var35, y2Var36, y2Var37, y2Var38, y2Var39, y2Var40, y2Var41, y2Var42, y2Var43, y2Var44, y2Var45, y2Var46, y2Var47, y2Var48, y2Var49, new y2("GROUP_LIST", 49, 49, 2, l3Var7), new y2("MAP", 50, 50, 4, l3.VOID)};
        y2[] values = values();
        f7685x = new y2[values.length];
        for (y2 y2Var50 : values) {
            f7685x[y2Var50.f7687u] = y2Var50;
        }
    }

    public y2(String str, int i6, int i10, int i11, l3 l3Var) {
        this.f7687u = i10;
        l3 l3Var2 = l3.VOID;
        int i12 = i11 - 1;
        if (i12 != 1) {
            if (i12 == 3) {
                l3Var.getClass();
            }
        } else {
            l3Var.getClass();
        }
        if (i11 == 1) {
            l3Var.ordinal();
        }
    }

    public static y2[] values() {
        return (y2[]) f7686y.clone();
    }

    public final int a() {
        return this.f7687u;
    }
}
