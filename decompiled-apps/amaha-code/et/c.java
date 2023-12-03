package et;

import gv.n;
import kotlin.jvm.internal.i;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum z uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: FunctionClassKind.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final c A;
    public static final /* synthetic */ c[] B;

    /* renamed from: w  reason: collision with root package name */
    public static final a f14548w;

    /* renamed from: x  reason: collision with root package name */
    public static final c f14549x;

    /* renamed from: y  reason: collision with root package name */
    public static final c f14550y;

    /* renamed from: z  reason: collision with root package name */
    public static final c f14551z;

    /* renamed from: u  reason: collision with root package name */
    public final fu.c f14552u;

    /* renamed from: v  reason: collision with root package name */
    public final String f14553v;

    /* compiled from: FunctionClassKind.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: FunctionClassKind.kt */
        /* renamed from: et.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0224a {

            /* renamed from: a  reason: collision with root package name */
            public final c f14554a;

            /* renamed from: b  reason: collision with root package name */
            public final int f14555b;

            public C0224a(c cVar, int i6) {
                this.f14554a = cVar;
                this.f14555b = i6;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0224a)) {
                    return false;
                }
                C0224a c0224a = (C0224a) obj;
                if (this.f14554a == c0224a.f14554a && this.f14555b == c0224a.f14555b) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return (this.f14554a.hashCode() * 31) + this.f14555b;
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("KindWithArity(kind=");
                sb2.append(this.f14554a);
                sb2.append(", arity=");
                return defpackage.c.s(sb2, this.f14555b, ')');
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007b A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C0224a a(String str, fu.c packageFqName) {
            c cVar;
            boolean z10;
            Integer num;
            boolean z11;
            boolean z12;
            i.g(packageFqName, "packageFqName");
            c[] values = c.values();
            int length = values.length;
            int i6 = 0;
            while (true) {
                if (i6 < length) {
                    cVar = values[i6];
                    if (i.b(cVar.f14552u, packageFqName) && n.H0(str, cVar.f14553v)) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        break;
                    }
                    i6++;
                } else {
                    cVar = null;
                    break;
                }
            }
            if (cVar == null) {
                return null;
            }
            String substring = str.substring(cVar.f14553v.length());
            i.f(substring, "this as java.lang.String).substring(startIndex)");
            if (substring.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                int length2 = substring.length();
                int i10 = 0;
                for (int i11 = 0; i11 < length2; i11++) {
                    int charAt = substring.charAt(i11) - '0';
                    if (charAt >= 0 && charAt < 10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i10 = (i10 * 10) + charAt;
                    }
                }
                num = Integer.valueOf(i10);
                if (num != null) {
                    return null;
                }
                return new C0224a(cVar, num.intValue());
            }
            num = null;
            if (num != null) {
            }
        }
    }

    static {
        c cVar = new c("Function", 0, dt.n.f13390j, "Function");
        f14549x = cVar;
        c cVar2 = new c("SuspendFunction", 1, dt.n.f13385d, "SuspendFunction");
        f14550y = cVar2;
        fu.c cVar3 = dt.n.f13387g;
        c cVar4 = new c("KFunction", 2, cVar3, "KFunction");
        f14551z = cVar4;
        c cVar5 = new c("KSuspendFunction", 3, cVar3, "KSuspendFunction");
        A = cVar5;
        B = new c[]{cVar, cVar2, cVar4, cVar5};
        f14548w = new a();
    }

    public c(String str, int i6, fu.c cVar, String str2) {
        this.f14552u = cVar;
        this.f14553v = str2;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) B.clone();
    }

    public final fu.e d(int i6) {
        return fu.e.j(this.f14553v + i6);
    }
}
