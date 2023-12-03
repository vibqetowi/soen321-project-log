package cu;

import au.b;
import au.i;
import au.j;
import au.w;
import gu.h;
/* compiled from: Flags.java */
/* loaded from: classes2.dex */
public final class b {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public static final a L;
    public static final a M;

    /* renamed from: a  reason: collision with root package name */
    public static final a f12019a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f12020b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f12021c;

    /* renamed from: d  reason: collision with root package name */
    public static final C0179b f12022d;

    /* renamed from: e  reason: collision with root package name */
    public static final C0179b f12023e;
    public static final C0179b f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f12024g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f12025h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f12026i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f12027j;

    /* renamed from: k  reason: collision with root package name */
    public static final a f12028k;

    /* renamed from: l  reason: collision with root package name */
    public static final a f12029l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f12030m;

    /* renamed from: n  reason: collision with root package name */
    public static final a f12031n;

    /* renamed from: o  reason: collision with root package name */
    public static final C0179b f12032o;

    /* renamed from: p  reason: collision with root package name */
    public static final a f12033p;

    /* renamed from: q  reason: collision with root package name */
    public static final a f12034q;
    public static final a r;

    /* renamed from: s  reason: collision with root package name */
    public static final a f12035s;

    /* renamed from: t  reason: collision with root package name */
    public static final a f12036t;

    /* renamed from: u  reason: collision with root package name */
    public static final a f12037u;

    /* renamed from: v  reason: collision with root package name */
    public static final a f12038v;

    /* renamed from: w  reason: collision with root package name */
    public static final a f12039w;

    /* renamed from: x  reason: collision with root package name */
    public static final a f12040x;

    /* renamed from: y  reason: collision with root package name */
    public static final a f12041y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f12042z;

    /* compiled from: Flags.java */
    /* loaded from: classes2.dex */
    public static class a extends c<Boolean> {
        public a(int i6) {
            super(i6, 1);
        }

        public final Boolean c(int i6) {
            boolean z10;
            if ((i6 & (1 << this.f12044a)) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Boolean valueOf = Boolean.valueOf(z10);
            if (valueOf != null) {
                return valueOf;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        public final int d(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f12044a;
            }
            return 0;
        }
    }

    /* compiled from: Flags.java */
    /* renamed from: cu.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0179b<E extends h.a> extends c<E> {

        /* renamed from: c  reason: collision with root package name */
        public final E[] f12043c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C0179b(int i6, E[] eArr) {
            super(i6, r0);
            int i10 = 1;
            if (eArr != null) {
                int length = eArr.length - 1;
                if (length != 0) {
                    for (int i11 = 31; i11 >= 0; i11--) {
                        if (((1 << i11) & length) != 0) {
                            i10 = 1 + i11;
                        }
                    }
                    throw new IllegalStateException("Empty enum: " + eArr.getClass());
                }
                this.f12043c = eArr;
                return;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        public final Object c(int i6) {
            E[] eArr;
            int i10 = this.f12044a;
            int i11 = (i6 & (((1 << this.f12045b) - 1) << i10)) >> i10;
            for (E e10 : this.f12043c) {
                if (e10.e() == i11) {
                    return e10;
                }
            }
            return null;
        }
    }

    /* compiled from: Flags.java */
    /* loaded from: classes2.dex */
    public static abstract class c<E> {

        /* renamed from: a  reason: collision with root package name */
        public final int f12044a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12045b;

        public c(int i6, int i10) {
            this.f12044a = i6;
            this.f12045b = i10;
        }

        public static a a(c<?> cVar) {
            return new a(cVar.f12044a + cVar.f12045b);
        }

        public static a b() {
            return new a(0);
        }
    }

    static {
        a b10 = c.b();
        f12019a = b10;
        f12020b = c.a(b10);
        a b11 = c.b();
        f12021c = b11;
        C0179b c0179b = new C0179b(1, w.values());
        f12022d = c0179b;
        j[] values = j.values();
        int i6 = 1 + c0179b.f12045b;
        C0179b c0179b2 = new C0179b(i6, values);
        f12023e = c0179b2;
        b.c[] values2 = b.c.values();
        int i10 = c0179b2.f12045b;
        C0179b c0179b3 = new C0179b(i6 + i10, values2);
        f = c0179b3;
        a a10 = c.a(c0179b3);
        f12024g = a10;
        a a11 = c.a(a10);
        f12025h = a11;
        a a12 = c.a(a11);
        f12026i = a12;
        a a13 = c.a(a12);
        f12027j = a13;
        a a14 = c.a(a13);
        f12028k = a14;
        f12029l = c.a(a14);
        a a15 = c.a(c0179b);
        f12030m = a15;
        f12031n = c.a(a15);
        C0179b c0179b4 = new C0179b(i6 + i10, i.values());
        f12032o = c0179b4;
        a a16 = c.a(c0179b4);
        f12033p = a16;
        a a17 = c.a(a16);
        f12034q = a17;
        a a18 = c.a(a17);
        r = a18;
        a a19 = c.a(a18);
        f12035s = a19;
        a a20 = c.a(a19);
        f12036t = a20;
        a a21 = c.a(a20);
        f12037u = a21;
        a a22 = c.a(a21);
        f12038v = a22;
        f12039w = c.a(a22);
        a a23 = c.a(c0179b4);
        f12040x = a23;
        a a24 = c.a(a23);
        f12041y = a24;
        a a25 = c.a(a24);
        f12042z = a25;
        a a26 = c.a(a25);
        A = a26;
        a a27 = c.a(a26);
        B = a27;
        a a28 = c.a(a27);
        C = a28;
        a a29 = c.a(a28);
        D = a29;
        a a30 = c.a(a29);
        E = a30;
        F = c.a(a30);
        a a31 = c.a(b11);
        G = a31;
        a a32 = c.a(a31);
        H = a32;
        I = c.a(a32);
        a a33 = c.a(c0179b2);
        J = a33;
        a a34 = c.a(a33);
        K = a34;
        L = c.a(a34);
        M = c.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i6) {
        Object[] objArr = new Object[3];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 5) {
                    if (i6 != 6) {
                        if (i6 != 8) {
                            if (i6 != 9) {
                                if (i6 != 11) {
                                    objArr[0] = "visibility";
                                }
                            }
                        }
                    }
                    objArr[0] = "memberKind";
                }
            } else {
                objArr[0] = "kind";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
            switch (i6) {
                case 3:
                    objArr[2] = "getConstructorFlags";
                    break;
                case 4:
                case 5:
                case 6:
                    objArr[2] = "getFunctionFlags";
                    break;
                case 7:
                case 8:
                case 9:
                    objArr[2] = "getPropertyFlags";
                    break;
                case 10:
                case 11:
                    objArr[2] = "getAccessorFlags";
                    break;
                default:
                    objArr[2] = "getClassFlags";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        objArr[0] = "modality";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i6) {
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
