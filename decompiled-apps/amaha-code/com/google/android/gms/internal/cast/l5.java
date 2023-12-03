package com.google.android.gms.internal.cast;
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
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class l5 {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ l5[] f7586v;

    /* renamed from: u  reason: collision with root package name */
    public final m5 f7587u;
    /* JADX INFO: Fake field, exist only in values array */
    l5 EF0;
    /* JADX INFO: Fake field, exist only in values array */
    l5 EF1;
    /* JADX INFO: Fake field, exist only in values array */
    l5 EF2;

    static {
        l5 l5Var = new l5("DOUBLE", 0, m5.f7598y);
        l5 l5Var2 = new l5("FLOAT", 1, m5.f7597x);
        m5 m5Var = m5.f7596w;
        l5 l5Var3 = new l5("INT64", 2, m5Var);
        l5 l5Var4 = new l5("UINT64", 3, m5Var);
        m5 m5Var2 = m5.f7595v;
        l5 l5Var5 = new l5("INT32", 4, m5Var2);
        l5 l5Var6 = new l5("FIXED64", 5, m5Var);
        l5 l5Var7 = new l5("FIXED32", 6, m5Var2);
        l5 l5Var8 = new l5("BOOL", 7, m5.f7599z);
        l5 l5Var9 = new l5("STRING", 8, m5.A);
        m5 m5Var3 = m5.D;
        f7586v = new l5[]{l5Var, l5Var2, l5Var3, l5Var4, l5Var5, l5Var6, l5Var7, l5Var8, l5Var9, new l5("GROUP", 9, m5Var3), new l5("MESSAGE", 10, m5Var3), new l5("BYTES", 11, m5.B), new l5("UINT32", 12, m5Var2), new l5("ENUM", 13, m5.C), new l5("SFIXED32", 14, m5Var2), new l5("SFIXED64", 15, m5Var), new l5("SINT32", 16, m5Var2), new l5("SINT64", 17, m5Var)};
    }

    public l5(String str, int i6, m5 m5Var) {
        this.f7587u = m5Var;
    }

    public static l5[] values() {
        return (l5[]) f7586v.clone();
    }
}
