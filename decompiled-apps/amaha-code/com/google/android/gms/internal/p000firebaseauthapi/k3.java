package com.google.android.gms.internal.p000firebaseauthapi;
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
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.k3  reason: invalid package */
/* loaded from: classes.dex */
public final class k3 {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ k3[] f7936v;

    /* renamed from: u  reason: collision with root package name */
    public final l3 f7937u;
    /* JADX INFO: Fake field, exist only in values array */
    k3 EF0;
    /* JADX INFO: Fake field, exist only in values array */
    k3 EF1;
    /* JADX INFO: Fake field, exist only in values array */
    k3 EF2;

    static {
        k3 k3Var = new k3("DOUBLE", 0, l3.f7962y);
        k3 k3Var2 = new k3("FLOAT", 1, l3.f7961x);
        l3 l3Var = l3.f7960w;
        k3 k3Var3 = new k3("INT64", 2, l3Var);
        k3 k3Var4 = new k3("UINT64", 3, l3Var);
        l3 l3Var2 = l3.f7959v;
        k3 k3Var5 = new k3("INT32", 4, l3Var2);
        k3 k3Var6 = new k3("FIXED64", 5, l3Var);
        k3 k3Var7 = new k3("FIXED32", 6, l3Var2);
        k3 k3Var8 = new k3("BOOL", 7, l3.f7963z);
        k3 k3Var9 = new k3("STRING", 8, l3.A);
        l3 l3Var3 = l3.D;
        f7936v = new k3[]{k3Var, k3Var2, k3Var3, k3Var4, k3Var5, k3Var6, k3Var7, k3Var8, k3Var9, new k3("GROUP", 9, l3Var3), new k3("MESSAGE", 10, l3Var3), new k3("BYTES", 11, l3.B), new k3("UINT32", 12, l3Var2), new k3("ENUM", 13, l3.C), new k3("SFIXED32", 14, l3Var2), new k3("SFIXED64", 15, l3Var), new k3("SINT32", 16, l3Var2), new k3("SINT64", 17, l3Var)};
    }

    public k3(String str, int i6, l3 l3Var) {
        this.f7937u = l3Var;
    }

    public static k3[] values() {
        return (k3[]) f7936v.clone();
    }
}
