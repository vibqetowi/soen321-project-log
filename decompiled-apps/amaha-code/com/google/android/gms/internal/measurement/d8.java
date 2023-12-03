package com.google.android.gms.internal.measurement;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF2 uses external variables
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
public final class d8 {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ d8[] f8341v;

    /* renamed from: u  reason: collision with root package name */
    public final e8 f8342u;
    /* JADX INFO: Fake field, exist only in values array */
    d8 EF0;
    /* JADX INFO: Fake field, exist only in values array */
    d8 EF1;
    /* JADX INFO: Fake field, exist only in values array */
    d8 EF2;

    static {
        d8 d8Var = new d8("DOUBLE", 0, e8.f8366y);
        d8 d8Var2 = new d8("FLOAT", 1, e8.f8365x);
        e8 e8Var = e8.f8364w;
        d8 d8Var3 = new d8("INT64", 2, e8Var);
        d8 d8Var4 = new d8("UINT64", 3, e8Var);
        e8 e8Var2 = e8.f8363v;
        d8 d8Var5 = new d8("INT32", 4, e8Var2);
        d8 d8Var6 = new d8("FIXED64", 5, e8Var);
        d8 d8Var7 = new d8("FIXED32", 6, e8Var2);
        d8 d8Var8 = new d8("BOOL", 7, e8.f8367z);
        d8 d8Var9 = new d8("STRING", 8, e8.A);
        e8 e8Var3 = e8.D;
        f8341v = new d8[]{d8Var, d8Var2, d8Var3, d8Var4, d8Var5, d8Var6, d8Var7, d8Var8, d8Var9, new d8("GROUP", 9, e8Var3), new d8("MESSAGE", 10, e8Var3), new d8("BYTES", 11, e8.B), new d8("UINT32", 12, e8Var2), new d8("ENUM", 13, e8.C), new d8("SFIXED32", 14, e8Var2), new d8("SFIXED64", 15, e8Var), new d8("SINT32", 16, e8Var2), new d8("SINT64", 17, e8Var)};
    }

    public d8(String str, int i6, e8 e8Var) {
        this.f8342u = e8Var;
    }

    public static d8[] values() {
        return (d8[]) f8341v.clone();
    }
}
