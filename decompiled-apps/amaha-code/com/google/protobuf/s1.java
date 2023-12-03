package com.google.protobuf;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum w uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: WireFormat.java */
/* loaded from: classes.dex */
public class s1 {
    public static final /* synthetic */ s1[] A;

    /* renamed from: w  reason: collision with root package name */
    public static final s1 f10036w;

    /* renamed from: x  reason: collision with root package name */
    public static final a f10037x;

    /* renamed from: y  reason: collision with root package name */
    public static final b f10038y;

    /* renamed from: z  reason: collision with root package name */
    public static final c f10039z;

    /* renamed from: u  reason: collision with root package name */
    public final t1 f10040u;

    /* renamed from: v  reason: collision with root package name */
    public final int f10041v;
    /* JADX INFO: Fake field, exist only in values array */
    s1 EF0;
    /* JADX INFO: Fake field, exist only in values array */
    s1 EF1;

    /* compiled from: WireFormat.java */
    /* loaded from: classes.dex */
    public enum a extends s1 {
        public a() {
            super("STRING", 8, t1.A, 2);
        }
    }

    /* compiled from: WireFormat.java */
    /* loaded from: classes.dex */
    public enum b extends s1 {
        public b(t1 t1Var) {
            super("GROUP", 9, t1Var, 3);
        }
    }

    /* compiled from: WireFormat.java */
    /* loaded from: classes.dex */
    public enum c extends s1 {
        public c(t1 t1Var) {
            super("MESSAGE", 10, t1Var, 2);
        }
    }

    static {
        s1 s1Var = new s1("DOUBLE", 0, t1.f10064y, 1);
        s1 s1Var2 = new s1("FLOAT", 1, t1.f10063x, 5);
        t1 t1Var = t1.f10062w;
        s1 s1Var3 = new s1("INT64", 2, t1Var, 0);
        f10036w = s1Var3;
        s1 s1Var4 = new s1("UINT64", 3, t1Var, 0);
        t1 t1Var2 = t1.f10061v;
        s1 s1Var5 = new s1("INT32", 4, t1Var2, 0);
        s1 s1Var6 = new s1("FIXED64", 5, t1Var, 1);
        s1 s1Var7 = new s1("FIXED32", 6, t1Var2, 5);
        s1 s1Var8 = new s1("BOOL", 7, t1.f10065z, 0);
        a aVar = new a();
        f10037x = aVar;
        t1 t1Var3 = t1.D;
        b bVar = new b(t1Var3);
        f10038y = bVar;
        c cVar = new c(t1Var3);
        f10039z = cVar;
        A = new s1[]{s1Var, s1Var2, s1Var3, s1Var4, s1Var5, s1Var6, s1Var7, s1Var8, aVar, bVar, cVar, new s1(t1.B) { // from class: com.google.protobuf.s1.d
        }, new s1("UINT32", 12, t1Var2, 0), new s1("ENUM", 13, t1.C, 0), new s1("SFIXED32", 14, t1Var2, 5), new s1("SFIXED64", 15, t1Var, 1), new s1("SINT32", 16, t1Var2, 0), new s1("SINT64", 17, t1Var, 0)};
    }

    public /* synthetic */ s1() {
        throw null;
    }

    public s1(String str, int i6, t1 t1Var, int i10) {
        this.f10040u = t1Var;
        this.f10041v = i10;
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) A.clone();
    }
}
