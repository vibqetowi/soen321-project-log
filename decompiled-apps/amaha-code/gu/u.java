package gu;
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
/* compiled from: WireFormat.java */
/* loaded from: classes2.dex */
public class u {
    public static final u A;
    public static final /* synthetic */ u[] B;

    /* renamed from: w  reason: collision with root package name */
    public static final u f16914w;

    /* renamed from: x  reason: collision with root package name */
    public static final u f16915x;

    /* renamed from: y  reason: collision with root package name */
    public static final b f16916y;

    /* renamed from: z  reason: collision with root package name */
    public static final c f16917z;

    /* renamed from: u  reason: collision with root package name */
    public final v f16918u;

    /* renamed from: v  reason: collision with root package name */
    public final int f16919v;
    /* JADX INFO: Fake field, exist only in values array */
    u EF0;
    /* JADX INFO: Fake field, exist only in values array */
    u EF1;
    /* JADX INFO: Fake field, exist only in values array */
    u EF2;

    /* compiled from: WireFormat.java */
    /* loaded from: classes2.dex */
    public enum a extends u {
        public a() {
            super("STRING", 8, v.A, 2);
        }
    }

    /* compiled from: WireFormat.java */
    /* loaded from: classes2.dex */
    public enum b extends u {
        public b(v vVar) {
            super("GROUP", 9, vVar, 3);
        }

        @Override // gu.u
        public final boolean d() {
            return false;
        }
    }

    /* compiled from: WireFormat.java */
    /* loaded from: classes2.dex */
    public enum c extends u {
        public c(v vVar) {
            super("MESSAGE", 10, vVar, 2);
        }

        @Override // gu.u
        public final boolean d() {
            return false;
        }
    }

    static {
        u uVar = new u("DOUBLE", 0, v.f16923y, 1);
        u uVar2 = new u("FLOAT", 1, v.f16922x, 5);
        v vVar = v.f16921w;
        u uVar3 = new u("INT64", 2, vVar, 0);
        u uVar4 = new u("UINT64", 3, vVar, 0);
        v vVar2 = v.f16920v;
        u uVar5 = new u("INT32", 4, vVar2, 0);
        f16914w = uVar5;
        u uVar6 = new u("FIXED64", 5, vVar, 1);
        u uVar7 = new u("FIXED32", 6, vVar2, 5);
        u uVar8 = new u("BOOL", 7, v.f16924z, 0);
        f16915x = uVar8;
        a aVar = new a();
        v vVar3 = v.D;
        b bVar = new b(vVar3);
        f16916y = bVar;
        c cVar = new c(vVar3);
        f16917z = cVar;
        u uVar9 = new u(v.B) { // from class: gu.u.d
            @Override // gu.u
            public final boolean d() {
                return false;
            }
        };
        u uVar10 = new u("UINT32", 12, vVar2, 0);
        u uVar11 = new u("ENUM", 13, v.C, 0);
        A = uVar11;
        B = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, aVar, bVar, cVar, uVar9, uVar10, uVar11, new u("SFIXED32", 14, vVar2, 5), new u("SFIXED64", 15, vVar, 1), new u("SINT32", 16, vVar2, 0), new u("SINT64", 17, vVar, 0)};
    }

    public /* synthetic */ u() {
        throw null;
    }

    public u(String str, int i6, v vVar, int i10) {
        this.f16918u = vVar;
        this.f16919v = i10;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) B.clone();
    }

    public boolean d() {
        return !(this instanceof a);
    }
}
