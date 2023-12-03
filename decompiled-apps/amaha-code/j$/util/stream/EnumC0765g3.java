package j$.util.stream;

import j$.util.AbstractC0714b;
import java.util.EnumMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DISTINCT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.g3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0765g3 {
    public static final EnumC0765g3 DISTINCT;
    public static final EnumC0765g3 ORDERED;
    public static final EnumC0765g3 SHORT_CIRCUIT;
    public static final EnumC0765g3 SIZED;
    public static final EnumC0765g3 SORTED;
    static final int f;

    /* renamed from: g  reason: collision with root package name */
    static final int f21463g;

    /* renamed from: h  reason: collision with root package name */
    static final int f21464h;

    /* renamed from: i  reason: collision with root package name */
    private static final int f21465i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f21466j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f21467k;

    /* renamed from: l  reason: collision with root package name */
    static final int f21468l;

    /* renamed from: m  reason: collision with root package name */
    static final int f21469m;

    /* renamed from: n  reason: collision with root package name */
    static final int f21470n;

    /* renamed from: o  reason: collision with root package name */
    static final int f21471o;

    /* renamed from: p  reason: collision with root package name */
    static final int f21472p;

    /* renamed from: q  reason: collision with root package name */
    static final int f21473q;
    static final int r;

    /* renamed from: s  reason: collision with root package name */
    static final int f21474s;

    /* renamed from: t  reason: collision with root package name */
    static final int f21475t;

    /* renamed from: u  reason: collision with root package name */
    static final int f21476u;

    /* renamed from: v  reason: collision with root package name */
    private static final /* synthetic */ EnumC0765g3[] f21477v;

    /* renamed from: a  reason: collision with root package name */
    private final Map f21478a;

    /* renamed from: b  reason: collision with root package name */
    private final int f21479b;

    /* renamed from: c  reason: collision with root package name */
    private final int f21480c;

    /* renamed from: d  reason: collision with root package name */
    private final int f21481d;

    /* renamed from: e  reason: collision with root package name */
    private final int f21482e;

    static {
        EnumC0760f3 enumC0760f3 = EnumC0760f3.SPLITERATOR;
        C0755e3 J = J(enumC0760f3);
        EnumC0760f3 enumC0760f32 = EnumC0760f3.STREAM;
        J.a(enumC0760f32);
        EnumC0760f3 enumC0760f33 = EnumC0760f3.OP;
        J.f21450a.put(enumC0760f33, 3);
        EnumC0765g3 enumC0765g3 = new EnumC0765g3("DISTINCT", 0, 0, J);
        DISTINCT = enumC0765g3;
        C0755e3 J2 = J(enumC0760f3);
        J2.a(enumC0760f32);
        J2.f21450a.put(enumC0760f33, 3);
        EnumC0765g3 enumC0765g32 = new EnumC0765g3("SORTED", 1, 1, J2);
        SORTED = enumC0765g32;
        C0755e3 J3 = J(enumC0760f3);
        J3.a(enumC0760f32);
        Map map = J3.f21450a;
        map.put(enumC0760f33, 3);
        EnumC0760f3 enumC0760f34 = EnumC0760f3.TERMINAL_OP;
        map.put(enumC0760f34, 2);
        EnumC0760f3 enumC0760f35 = EnumC0760f3.UPSTREAM_TERMINAL_OP;
        map.put(enumC0760f35, 2);
        EnumC0765g3 enumC0765g33 = new EnumC0765g3("ORDERED", 2, 2, J3);
        ORDERED = enumC0765g33;
        C0755e3 J4 = J(enumC0760f3);
        J4.a(enumC0760f32);
        J4.f21450a.put(enumC0760f33, 2);
        EnumC0765g3 enumC0765g34 = new EnumC0765g3("SIZED", 3, 3, J4);
        SIZED = enumC0765g34;
        C0755e3 J5 = J(enumC0760f33);
        J5.a(enumC0760f34);
        EnumC0765g3 enumC0765g35 = new EnumC0765g3("SHORT_CIRCUIT", 4, 12, J5);
        SHORT_CIRCUIT = enumC0765g35;
        f21477v = new EnumC0765g3[]{enumC0765g3, enumC0765g32, enumC0765g33, enumC0765g34, enumC0765g35};
        f = m(enumC0760f3);
        f21463g = m(enumC0760f32);
        f21464h = m(enumC0760f33);
        m(enumC0760f34);
        m(enumC0760f35);
        int i6 = 0;
        for (EnumC0765g3 enumC0765g36 : values()) {
            i6 |= enumC0765g36.f21482e;
        }
        f21465i = i6;
        int i10 = f21463g;
        f21466j = i10;
        int i11 = i10 << 1;
        f21467k = i11;
        f21468l = i10 | i11;
        EnumC0765g3 enumC0765g37 = DISTINCT;
        f21469m = enumC0765g37.f21480c;
        f21470n = enumC0765g37.f21481d;
        EnumC0765g3 enumC0765g38 = SORTED;
        f21471o = enumC0765g38.f21480c;
        f21472p = enumC0765g38.f21481d;
        EnumC0765g3 enumC0765g39 = ORDERED;
        f21473q = enumC0765g39.f21480c;
        r = enumC0765g39.f21481d;
        EnumC0765g3 enumC0765g310 = SIZED;
        f21474s = enumC0765g310.f21480c;
        f21475t = enumC0765g310.f21481d;
        f21476u = SHORT_CIRCUIT.f21480c;
    }

    private EnumC0765g3(String str, int i6, int i10, C0755e3 c0755e3) {
        EnumC0760f3[] values = EnumC0760f3.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            Map map = c0755e3.f21450a;
            if (i11 >= length) {
                this.f21478a = map;
                int i12 = i10 * 2;
                this.f21479b = i12;
                this.f21480c = 1 << i12;
                this.f21481d = 2 << i12;
                this.f21482e = 3 << i12;
                return;
            }
            AbstractC0714b.q(map, values[i11], 0);
            i11++;
        }
    }

    private static C0755e3 J(EnumC0760f3 enumC0760f3) {
        C0755e3 c0755e3 = new C0755e3(new EnumMap(EnumC0760f3.class));
        c0755e3.a(enumC0760f3);
        return c0755e3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int T(int i6) {
        return i6 & ((~i6) >> 1) & f21466j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i6, int i10) {
        return i6 | (i10 & (i6 == 0 ? f21465i : ~(((f21466j & i6) << 1) | i6 | ((f21467k & i6) >> 1))));
    }

    private static int m(EnumC0760f3 enumC0760f3) {
        EnumC0765g3[] values;
        int i6 = 0;
        for (EnumC0765g3 enumC0765g3 : values()) {
            i6 |= ((Integer) enumC0765g3.f21478a.get(enumC0760f3)).intValue() << enumC0765g3.f21479b;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(j$.util.S s10) {
        int characteristics = s10.characteristics();
        int i6 = characteristics & 4;
        int i10 = f;
        return (i6 == 0 || s10.getComparator() == null) ? characteristics & i10 : characteristics & i10 & (-5);
    }

    public static EnumC0765g3 valueOf(String str) {
        return (EnumC0765g3) Enum.valueOf(EnumC0765g3.class, str);
    }

    public static EnumC0765g3[] values() {
        return (EnumC0765g3[]) f21477v.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean G(int i6) {
        int i10 = this.f21482e;
        return (i6 & i10) == i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean r(int i6) {
        return (i6 & this.f21482e) == this.f21480c;
    }
}
