package j$.util.concurrent;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
/* loaded from: classes3.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements java.util.concurrent.ConcurrentMap<K, V>, Serializable, ConcurrentMap<K, V> {

    /* renamed from: g  reason: collision with root package name */
    static final int f21120g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h  reason: collision with root package name */
    private static final j$.sun.misc.b f21121h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f21122i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f21123j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f21124k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f21125l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f21126m;

    /* renamed from: n  reason: collision with root package name */
    private static final int f21127n;

    /* renamed from: o  reason: collision with root package name */
    private static final int f21128o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a  reason: collision with root package name */
    volatile transient l[] f21129a;

    /* renamed from: b  reason: collision with root package name */
    private volatile transient l[] f21130b;
    private volatile transient long baseCount;

    /* renamed from: c  reason: collision with root package name */
    private volatile transient c[] f21131c;
    private volatile transient int cellsBusy;

    /* renamed from: d  reason: collision with root package name */
    private transient i f21132d;

    /* renamed from: e  reason: collision with root package name */
    private transient t f21133e;
    private transient e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", o[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.b h10 = j$.sun.misc.b.h();
        f21121h = h10;
        f21122i = h10.j(ConcurrentHashMap.class, "sizeCtl");
        f21123j = h10.j(ConcurrentHashMap.class, "transferIndex");
        f21124k = h10.j(ConcurrentHashMap.class, "baseCount");
        f21125l = h10.j(ConcurrentHashMap.class, "cellsBusy");
        f21126m = h10.j(c.class, "value");
        f21127n = h10.a(l[].class);
        int b10 = h10.b(l[].class);
        if (((b10 - 1) & b10) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f21128o = 31 - Integer.numberOfLeadingZeros(b10);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i6) {
        this(i6, 0.75f, 1);
    }

    public ConcurrentHashMap(int i6, float f, int i10) {
        if (f <= 0.0f || i6 < 0 || i10 <= 0) {
            throw new IllegalArgumentException();
        }
        long j10 = (long) (((i6 < i10 ? i10 : i6) / f) + 1.0d);
        this.sizeCtl = j10 >= 1073741824 ? 1073741824 : m((int) j10);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.d(r25, r3, r5, r14) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013b, code lost:
        if (r25.f21131c != r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x013d, code lost:
        r25.f21131c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a(long j10, int i6) {
        boolean z10;
        boolean z11;
        int length;
        boolean z12;
        int length2;
        int length3;
        c cVar;
        long k10;
        l[] lVarArr;
        int length4;
        l[] lVarArr2;
        c[] cVarArr = this.f21131c;
        if (cVarArr == null) {
            j$.sun.misc.b bVar = f21121h;
            long j11 = f21124k;
            long j12 = this.baseCount;
            k10 = j12 + j10;
        }
        if (cVarArr == null || (length3 = cVarArr.length - 1) < 0 || (cVar = cVarArr[length3 & ThreadLocalRandom.b()]) == null) {
            z10 = true;
        } else {
            j$.sun.misc.b bVar2 = f21121h;
            long j13 = f21126m;
            long j14 = cVar.value;
            z10 = bVar2.d(cVar, j13, j14, j14 + j10);
            if (z10) {
                if (i6 <= 1) {
                    return;
                }
                k10 = k();
                if (i6 < 0) {
                    return;
                }
                while (true) {
                    int i10 = this.sizeCtl;
                    if (k10 < i10 || (lVarArr = this.f21129a) == null || (length4 = lVarArr.length) >= 1073741824) {
                        return;
                    }
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length4) | 32768;
                    if (i10 < 0) {
                        if ((i10 >>> 16) != numberOfLeadingZeros || i10 == numberOfLeadingZeros + 1 || i10 == numberOfLeadingZeros + 65535 || (lVarArr2 = this.f21130b) == null || this.transferIndex <= 0) {
                            return;
                        }
                        if (f21121h.c(this, f21122i, i10, i10 + 1)) {
                            n(lVarArr, lVarArr2);
                        }
                    } else if (f21121h.c(this, f21122i, i10, (numberOfLeadingZeros << 16) + 2)) {
                        n(lVarArr, null);
                    }
                    k10 = k();
                }
            }
        }
        int b10 = ThreadLocalRandom.b();
        if (b10 == 0) {
            ThreadLocalRandom.f();
            b10 = ThreadLocalRandom.b();
            z10 = true;
        }
        while (true) {
            boolean z13 = z10;
            boolean z14 = false;
            while (true) {
                c[] cVarArr2 = this.f21131c;
                if (cVarArr2 != null && (length = cVarArr2.length) > 0) {
                    c cVar2 = cVarArr2[(length - 1) & b10];
                    if (cVar2 != null) {
                        if (z13) {
                            j$.sun.misc.b bVar3 = f21121h;
                            long j15 = f21126m;
                            long j16 = cVar2.value;
                            if (bVar3.d(cVar2, j15, j16, j16 + j10)) {
                                return;
                            }
                            if (this.f21131c == cVarArr2 && length < f21120g) {
                                if (!z14) {
                                    z14 = true;
                                } else if (this.cellsBusy == 0 && bVar3.c(this, f21125l, 0, 1)) {
                                    try {
                                        break;
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            z13 = true;
                        }
                        b10 = ThreadLocalRandom.a(b10);
                    } else if (this.cellsBusy == 0) {
                        c cVar3 = new c(j10);
                        if (this.cellsBusy == 0 && f21121h.c(this, f21125l, 0, 1)) {
                            try {
                                c[] cVarArr3 = this.f21131c;
                                if (cVarArr3 != null && (length2 = cVarArr3.length) > 0) {
                                    int i11 = (length2 - 1) & b10;
                                    if (cVarArr3[i11] == null) {
                                        cVarArr3[i11] = cVar3;
                                        z12 = true;
                                        if (!z12) {
                                            return;
                                        }
                                    }
                                }
                                z12 = false;
                                if (!z12) {
                                }
                            } finally {
                            }
                        }
                    }
                    z14 = false;
                    b10 = ThreadLocalRandom.a(b10);
                } else if (this.cellsBusy == 0 && this.f21131c == cVarArr2 && f21121h.c(this, f21125l, 0, 1)) {
                    try {
                        if (this.f21131c == cVarArr2) {
                            c[] cVarArr4 = new c[2];
                            cVarArr4[b10 & 1] = new c(j10);
                            this.f21131c = cVarArr4;
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            return;
                        }
                    } finally {
                    }
                } else {
                    j$.sun.misc.b bVar4 = f21121h;
                    long j17 = f21124k;
                    long j18 = this.baseCount;
                    if (bVar4.d(this, j17, j18, j18 + j10)) {
                        return;
                    }
                }
            }
            this.cellsBusy = 0;
            z10 = z13;
        }
    }

    static final boolean b(l[] lVarArr, int i6, l lVar) {
        return f21121h.e(lVarArr, (i6 << f21128o) + f21127n, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces != null) {
                for (Type type : genericInterfaces) {
                    if (type instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                            return cls;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    private final l[] f() {
        while (true) {
            l[] lVarArr = this.f21129a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i6 = this.sizeCtl;
            if (i6 < 0) {
                Thread.yield();
            } else if (f21121h.c(this, f21122i, i6, -1)) {
                try {
                    l[] lVarArr2 = this.f21129a;
                    if (lVarArr2 == null || lVarArr2.length == 0) {
                        int i10 = i6 > 0 ? i6 : 16;
                        l[] lVarArr3 = new l[i10];
                        this.f21129a = lVarArr3;
                        i6 = i10 - (i10 >>> 2);
                        lVarArr2 = lVarArr3;
                    }
                    this.sizeCtl = i6;
                    return lVarArr2;
                } catch (Throwable th2) {
                    this.sizeCtl = i6;
                    throw th2;
                }
            }
        }
    }

    static final void i(l[] lVarArr, int i6, l lVar) {
        f21121h.l(lVarArr, (i6 << f21128o) + f21127n, lVar);
    }

    static final int j(int i6) {
        return (i6 ^ (i6 >>> 16)) & SubsamplingScaleImageView.TILE_SIZE_AUTO;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final l l(l[] lVarArr, int i6) {
        return (l) f21121h.g(lVarArr, (i6 << f21128o) + f21127n);
    }

    private static final int m(int i6) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i6 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + numberOfLeadingZeros;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r6v17, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r6v22, types: [j$.util.concurrent.l] */
    private final void n(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        ConcurrentHashMap<K, V> concurrentHashMap;
        l[] lVarArr4;
        int i6;
        int i10;
        g gVar;
        ConcurrentHashMap<K, V> concurrentHashMap2;
        int i11;
        s sVar;
        int i12;
        ConcurrentHashMap<K, V> concurrentHashMap3 = this;
        int length = lVarArr.length;
        int i13 = f21120g;
        int i14 = i13 > 1 ? (length >>> 3) / i13 : length;
        int i15 = i14 < 16 ? 16 : i14;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap3.f21130b = lVarArr5;
                concurrentHashMap3.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap3.sizeCtl = SubsamplingScaleImageView.TILE_SIZE_AUTO;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar2 = new g(lVarArr3);
        l[] lVarArr6 = lVarArr;
        ConcurrentHashMap<K, V> concurrentHashMap4 = concurrentHashMap3;
        int i16 = 0;
        int i17 = 0;
        boolean z10 = true;
        boolean z11 = false;
        while (true) {
            if (z10) {
                int i18 = i16 - 1;
                if (i18 >= i17 || z11) {
                    concurrentHashMap = concurrentHashMap4;
                    lVarArr4 = lVarArr6;
                    i16 = i18;
                    i17 = i17;
                } else {
                    int i19 = concurrentHashMap4.transferIndex;
                    if (i19 <= 0) {
                        concurrentHashMap = concurrentHashMap4;
                        lVarArr4 = lVarArr6;
                        i16 = -1;
                    } else {
                        j$.sun.misc.b bVar = f21121h;
                        long j10 = f21123j;
                        int i20 = i19 > i15 ? i19 - i15 : 0;
                        concurrentHashMap = concurrentHashMap4;
                        lVarArr4 = lVarArr6;
                        int i21 = i17;
                        if (bVar.c(this, j10, i19, i20)) {
                            i16 = i19 - 1;
                            i17 = i20;
                        } else {
                            lVarArr6 = lVarArr4;
                            i16 = i18;
                            i17 = i21;
                            concurrentHashMap4 = concurrentHashMap;
                        }
                    }
                }
                lVarArr6 = lVarArr4;
                concurrentHashMap4 = concurrentHashMap;
                z10 = false;
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap5 = concurrentHashMap4;
                l[] lVarArr7 = lVarArr6;
                int i22 = i17;
                s sVar2 = null;
                if (i16 < 0 || i16 >= length || (i11 = i16 + length) >= length2) {
                    i6 = i15;
                    i10 = length2;
                    gVar = gVar2;
                    if (z11) {
                        this.f21130b = null;
                        this.f21129a = lVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap2 = this;
                    j$.sun.misc.b bVar2 = f21121h;
                    long j11 = f21122i;
                    int i23 = concurrentHashMap2.sizeCtl;
                    int i24 = i16;
                    if (!bVar2.c(this, j11, i23, i23 - 1)) {
                        concurrentHashMap4 = concurrentHashMap2;
                        i16 = i24;
                        lVarArr6 = lVarArr7;
                    } else if (i23 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                        return;
                    } else {
                        i16 = length;
                        concurrentHashMap4 = concurrentHashMap2;
                        lVarArr6 = lVarArr7;
                        z10 = true;
                        z11 = true;
                    }
                } else {
                    l l2 = l(lVarArr7, i16);
                    if (l2 == null) {
                        z10 = b(lVarArr7, i16, gVar2);
                        i6 = i15;
                        gVar = gVar2;
                        lVarArr6 = lVarArr7;
                        concurrentHashMap4 = concurrentHashMap5;
                        i10 = length2;
                    } else {
                        int i25 = l2.f21152a;
                        if (i25 == -1) {
                            concurrentHashMap2 = concurrentHashMap3;
                            i6 = i15;
                            gVar = gVar2;
                            lVarArr6 = lVarArr7;
                            concurrentHashMap4 = concurrentHashMap5;
                            z10 = true;
                            i10 = length2;
                        } else {
                            synchronized (l2) {
                                if (l(lVarArr7, i16) == l2) {
                                    if (i25 >= 0) {
                                        int i26 = i25 & length;
                                        s sVar3 = l2;
                                        for (s sVar4 = l2.f21155d; sVar4 != null; sVar4 = sVar4.f21155d) {
                                            int i27 = sVar4.f21152a & length;
                                            if (i27 != i26) {
                                                sVar3 = sVar4;
                                                i26 = i27;
                                            }
                                        }
                                        if (i26 == 0) {
                                            sVar = sVar3;
                                        } else {
                                            sVar = null;
                                            sVar2 = sVar3;
                                        }
                                        l lVar = l2;
                                        while (lVar != sVar3) {
                                            int i28 = lVar.f21152a;
                                            s sVar5 = sVar3;
                                            Object obj = lVar.f21153b;
                                            int i29 = i15;
                                            Object obj2 = lVar.f21154c;
                                            if ((i28 & length) == 0) {
                                                i12 = length2;
                                                sVar = new l(i28, obj, obj2, sVar);
                                            } else {
                                                i12 = length2;
                                                sVar2 = new l(i28, obj, obj2, sVar2);
                                            }
                                            lVar = lVar.f21155d;
                                            sVar3 = sVar5;
                                            i15 = i29;
                                            length2 = i12;
                                        }
                                        i6 = i15;
                                        i10 = length2;
                                        i(lVarArr3, i16, sVar);
                                        i(lVarArr3, i11, sVar2);
                                        i(lVarArr7, i16, gVar2);
                                        gVar = gVar2;
                                    } else {
                                        i6 = i15;
                                        i10 = length2;
                                        if (l2 instanceof r) {
                                            r rVar = (r) l2;
                                            s sVar6 = null;
                                            s sVar7 = null;
                                            l lVar2 = rVar.f;
                                            int i30 = 0;
                                            int i31 = 0;
                                            s sVar8 = null;
                                            while (lVar2 != null) {
                                                r rVar2 = rVar;
                                                int i32 = lVar2.f21152a;
                                                g gVar3 = gVar2;
                                                s sVar9 = new s(i32, lVar2.f21153b, lVar2.f21154c, null, null);
                                                if ((i32 & length) == 0) {
                                                    sVar9.f21173h = sVar7;
                                                    if (sVar7 == null) {
                                                        sVar2 = sVar9;
                                                    } else {
                                                        sVar7.f21155d = sVar9;
                                                    }
                                                    i30++;
                                                    sVar7 = sVar9;
                                                } else {
                                                    sVar9.f21173h = sVar6;
                                                    if (sVar6 == null) {
                                                        sVar8 = sVar9;
                                                    } else {
                                                        sVar6.f21155d = sVar9;
                                                    }
                                                    i31++;
                                                    sVar6 = sVar9;
                                                }
                                                lVar2 = lVar2.f21155d;
                                                rVar = rVar2;
                                                gVar2 = gVar3;
                                            }
                                            r rVar3 = rVar;
                                            g gVar4 = gVar2;
                                            l q10 = i30 <= 6 ? q(sVar2) : i31 != 0 ? new r(sVar2) : rVar3;
                                            l q11 = i31 <= 6 ? q(sVar8) : i30 != 0 ? new r(sVar8) : rVar3;
                                            i(lVarArr3, i16, q10);
                                            i(lVarArr3, i11, q11);
                                            gVar = gVar4;
                                            i(lVarArr, i16, gVar);
                                            lVarArr7 = lVarArr;
                                        }
                                    }
                                    z10 = true;
                                } else {
                                    i6 = i15;
                                    i10 = length2;
                                }
                                gVar = gVar2;
                            }
                            concurrentHashMap4 = this;
                            lVarArr6 = lVarArr7;
                        }
                    }
                    concurrentHashMap2 = this;
                }
                gVar2 = gVar;
                concurrentHashMap3 = concurrentHashMap2;
                i17 = i22;
                i15 = i6;
                length2 = i10;
            }
        }
    }

    private final void o(l[] lVarArr, int i6) {
        int length = lVarArr.length;
        if (length < 64) {
            p(length << 1);
            return;
        }
        l l2 = l(lVarArr, i6);
        if (l2 == null || l2.f21152a < 0) {
            return;
        }
        synchronized (l2) {
            if (l(lVarArr, i6) == l2) {
                s sVar = null;
                l lVar = l2;
                s sVar2 = null;
                while (lVar != null) {
                    s sVar3 = new s(lVar.f21152a, lVar.f21153b, lVar.f21154c, null, null);
                    sVar3.f21173h = sVar2;
                    if (sVar2 == null) {
                        sVar = sVar3;
                    } else {
                        sVar2.f21155d = sVar3;
                    }
                    lVar = lVar.f21155d;
                    sVar2 = sVar3;
                }
                i(lVarArr, i6, new r(sVar));
            }
        }
    }

    private final void p(int i6) {
        int length;
        int m10 = i6 >= 536870912 ? 1073741824 : m(i6 + (i6 >>> 1) + 1);
        while (true) {
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                return;
            }
            l[] lVarArr = this.f21129a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i11 = i10 > m10 ? i10 : m10;
                if (f21121h.c(this, f21122i, i10, -1)) {
                    try {
                        if (this.f21129a == lVarArr) {
                            this.f21129a = new l[i11];
                            i10 = i11 - (i11 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i10;
                    }
                } else {
                    continue;
                }
            } else if (m10 <= i10 || length >= 1073741824) {
                return;
            } else {
                if (lVarArr == this.f21129a && f21121h.c(this, f21122i, i10, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                    n(lVarArr, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.l] */
    static l q(s sVar) {
        l lVar = null;
        l lVar2 = null;
        for (s sVar2 = sVar; sVar2 != null; sVar2 = sVar2.f21155d) {
            l lVar3 = new l(sVar2.f21152a, sVar2.f21153b, sVar2.f21154c);
            if (lVar2 == null) {
                lVar = lVar3;
            } else {
                lVar2.f21155d = lVar3;
            }
            lVar2 = lVar3;
        }
        return lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j10;
        boolean z10;
        boolean z11;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j11 = 0;
        long j12 = 0;
        l lVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j10 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j12++;
            lVar = new l(j(readObject.hashCode()), readObject, readObject2, lVar);
        }
        if (j12 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j13 = (long) ((((float) j12) / 0.75f) + 1.0d);
        int m10 = j13 >= 1073741824 ? 1073741824 : m((int) j13);
        l[] lVarArr = new l[m10];
        int i6 = m10 - 1;
        while (lVar != null) {
            l lVar2 = lVar.f21155d;
            int i10 = lVar.f21152a;
            int i11 = i10 & i6;
            l l2 = l(lVarArr, i11);
            if (l2 == null) {
                z11 = true;
            } else {
                Object obj2 = lVar.f21153b;
                if (l2.f21152a >= 0) {
                    int i12 = 0;
                    for (l lVar3 = l2; lVar3 != null; lVar3 = lVar3.f21155d) {
                        if (lVar3.f21152a == i10 && ((obj = lVar3.f21153b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z10 = false;
                            break;
                        }
                        i12++;
                    }
                    z10 = true;
                    if (!z10 || i12 < 8) {
                        z11 = z10;
                    } else {
                        long j14 = j11 + 1;
                        lVar.f21155d = l2;
                        l lVar4 = lVar;
                        s sVar = null;
                        s sVar2 = null;
                        while (lVar4 != null) {
                            long j15 = j14;
                            s sVar3 = new s(lVar4.f21152a, lVar4.f21153b, lVar4.f21154c, null, null);
                            sVar3.f21173h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.f21155d = sVar3;
                            }
                            lVar4 = lVar4.f21155d;
                            sVar2 = sVar3;
                            j14 = j15;
                        }
                        i(lVarArr, i11, new r(sVar));
                        j11 = j14;
                    }
                } else if (((r) l2).e(i10, obj2, lVar.f21154c) == null) {
                    j11 += j10;
                }
                z11 = false;
            }
            j10 = 1;
            if (z11) {
                j11++;
                lVar.f21155d = l2;
                i(lVarArr, i11, lVar);
            }
            lVar = lVar2;
        }
        this.f21129a = lVarArr;
        this.sizeCtl = m10 - (m10 >>> 2);
        this.baseCount = j11;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i6 = 1;
        int i10 = 0;
        while (i6 < 16) {
            i10++;
            i6 <<= 1;
        }
        int i11 = 32 - i10;
        int i12 = i6 - 1;
        o[] oVarArr = new o[16];
        for (int i13 = 0; i13 < 16; i13++) {
            oVarArr[i13] = new o();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", oVarArr);
        putFields.put("segmentShift", i11);
        putFields.put("segmentMask", i12);
        objectOutputStream.writeFields();
        l[] lVarArr = this.f21129a;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a10 = qVar.a();
                if (a10 == null) {
                    break;
                }
                objectOutputStream.writeObject(a10.f21153b);
                objectOutputStream.writeObject(a10.f21154c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void clear() {
        l l2;
        l[] lVarArr = this.f21129a;
        long j10 = 0;
        loop0: while (true) {
            int i6 = 0;
            while (lVarArr != null && i6 < lVarArr.length) {
                l2 = l(lVarArr, i6);
                if (l2 == null) {
                    i6++;
                } else {
                    int i10 = l2.f21152a;
                    if (i10 == -1) {
                        break;
                    }
                    synchronized (l2) {
                        if (l(lVarArr, i6) == l2) {
                            for (l lVar = i10 >= 0 ? l2 : l2 instanceof r ? ((r) l2).f : null; lVar != null; lVar = lVar.f21155d) {
                                j10--;
                            }
                            i(lVarArr, i6, null);
                            i6++;
                        }
                    }
                }
            }
            lVarArr = e(lVarArr, l2);
        }
        if (j10 != 0) {
            a(j10, -1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0115, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x010f, code lost:
        if (r3 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0111, code lost:
        a(r3, r4);
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object compute(Object obj, BiFunction biFunction) {
        int i6;
        l lVar;
        Object obj2;
        Object obj3;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int j10 = j(obj.hashCode());
        l[] lVarArr = this.f21129a;
        int i10 = 0;
        Object obj4 = null;
        int i11 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i12 = (length - 1) & j10;
                    l l2 = l(lVarArr, i12);
                    if (l2 == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            if (b(lVarArr, i12, mVar)) {
                                Object apply = biFunction.apply(obj, null);
                                if (apply != null) {
                                    lVar = new l(j10, obj, apply);
                                    i6 = 1;
                                } else {
                                    i6 = i10;
                                    lVar = null;
                                }
                                i(lVarArr, i12, lVar);
                                i10 = i6;
                                obj4 = apply;
                                i11 = 1;
                            }
                        }
                        if (i11 != 0) {
                        }
                    } else {
                        int i13 = l2.f21152a;
                        if (i13 == -1) {
                            lVarArr = e(lVarArr, l2);
                        } else {
                            synchronized (l2) {
                                try {
                                    if (l(lVarArr, i12) == l2) {
                                        if (i13 >= 0) {
                                            l lVar2 = null;
                                            l lVar3 = l2;
                                            int i14 = 1;
                                            while (true) {
                                                if (lVar3.f21152a != j10 || ((obj3 = lVar3.f21153b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                    l lVar4 = lVar3.f21155d;
                                                    if (lVar4 == null) {
                                                        Object apply2 = biFunction.apply(obj, null);
                                                        if (apply2 == null) {
                                                            obj2 = apply2;
                                                        } else if (lVar3.f21155d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        } else {
                                                            lVar3.f21155d = new l(j10, obj, apply2);
                                                            obj2 = apply2;
                                                            i10 = 1;
                                                        }
                                                    } else {
                                                        i14++;
                                                        lVar2 = lVar3;
                                                        lVar3 = lVar4;
                                                    }
                                                }
                                            }
                                            obj2 = biFunction.apply(obj, lVar3.f21154c);
                                            if (obj2 != null) {
                                                lVar3.f21154c = obj2;
                                            } else {
                                                l lVar5 = lVar3.f21155d;
                                                if (lVar2 != null) {
                                                    lVar2.f21155d = lVar5;
                                                } else {
                                                    i(lVarArr, i12, lVar5);
                                                }
                                                i10 = -1;
                                            }
                                            i11 = i14;
                                            obj4 = obj2;
                                        } else if (l2 instanceof r) {
                                            r rVar = (r) l2;
                                            s sVar = rVar.f21169e;
                                            s b10 = sVar != null ? sVar.b(j10, obj, null) : null;
                                            Object apply3 = biFunction.apply(obj, b10 == null ? null : b10.f21154c);
                                            if (apply3 != null) {
                                                if (b10 != null) {
                                                    b10.f21154c = apply3;
                                                } else {
                                                    rVar.e(j10, obj, apply3);
                                                    i10 = 1;
                                                }
                                            } else if (b10 != null) {
                                                if (rVar.f(b10)) {
                                                    i(lVarArr, i12, q(rVar.f));
                                                }
                                                i10 = -1;
                                            }
                                            obj4 = apply3;
                                            i11 = 1;
                                        } else if (l2 instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    o(lVarArr, i12);
                                }
                            }
                        }
                    }
                }
            }
            lVarArr = f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f0, code lost:
        if (r5 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f2, code lost:
        a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f7, code lost:
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfAbsent(Object obj, Function function) {
        Object obj2;
        s b10;
        Object apply;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null || function == null) {
            throw null;
        }
        int j10 = j(obj.hashCode());
        l[] lVarArr = this.f21129a;
        Object obj7 = null;
        int i6 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i10 = (length - 1) & j10;
                    l l2 = l(lVarArr, i10);
                    boolean z10 = true;
                    if (l2 == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            if (b(lVarArr, i10, mVar)) {
                                Object apply2 = function.apply(obj);
                                i(lVarArr, i10, apply2 != null ? new l(j10, obj, apply2) : null);
                                obj7 = apply2;
                                i6 = 1;
                            }
                        }
                        if (i6 != 0) {
                            break;
                        }
                    } else {
                        int i11 = l2.f21152a;
                        if (i11 == -1) {
                            lVarArr = e(lVarArr, l2);
                        } else if (i11 == j10 && (((obj5 = l2.f21153b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = l2.f21154c) != null)) {
                            return obj6;
                        } else {
                            synchronized (l2) {
                                if (l(lVarArr, i10) == l2) {
                                    if (i11 >= 0) {
                                        l lVar = l2;
                                        int i12 = 1;
                                        while (true) {
                                            if (lVar.f21152a != j10 || ((obj4 = lVar.f21153b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                l lVar2 = lVar.f21155d;
                                                if (lVar2 == null) {
                                                    apply = function.apply(obj);
                                                    if (apply == null) {
                                                        obj3 = apply;
                                                    } else if (lVar.f21155d != null) {
                                                        throw new IllegalStateException("Recursive update");
                                                    } else {
                                                        lVar.f21155d = new l(j10, obj, apply);
                                                    }
                                                } else {
                                                    i12++;
                                                    lVar = lVar2;
                                                }
                                            }
                                        }
                                        obj3 = lVar.f21154c;
                                        apply = obj3;
                                        z10 = false;
                                        i6 = i12;
                                        obj7 = apply;
                                    } else if (l2 instanceof r) {
                                        r rVar = (r) l2;
                                        s sVar = rVar.f21169e;
                                        if (sVar == null || (b10 = sVar.b(j10, obj, null)) == null) {
                                            obj7 = function.apply(obj);
                                            if (obj7 != null) {
                                                rVar.e(j10, obj, obj7);
                                                i6 = 2;
                                            } else {
                                                obj2 = obj7;
                                            }
                                        } else {
                                            obj2 = b10.f21154c;
                                        }
                                        obj7 = obj2;
                                        z10 = false;
                                        i6 = 2;
                                    } else if (l2 instanceof m) {
                                        throw new IllegalStateException("Recursive update");
                                    }
                                }
                                z10 = false;
                            }
                            if (i6 != 0) {
                                if (i6 >= 8) {
                                    o(lVarArr, i10);
                                }
                                if (!z10) {
                                    return obj7;
                                }
                            }
                        }
                    }
                }
            }
            lVarArr = f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a9, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        s b10;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int j10 = j(obj.hashCode());
        l[] lVarArr = this.f21129a;
        int i6 = 0;
        Object obj3 = null;
        int i10 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i11 = (length - 1) & j10;
                    l l2 = l(lVarArr, i11);
                    if (l2 == null) {
                        break;
                    }
                    int i12 = l2.f21152a;
                    if (i12 == -1) {
                        lVarArr = e(lVarArr, l2);
                    } else {
                        synchronized (l2) {
                            try {
                                if (l(lVarArr, i11) == l2) {
                                    if (i12 < 0) {
                                        if (!(l2 instanceof r)) {
                                            if (l2 instanceof m) {
                                                break;
                                            }
                                        } else {
                                            r rVar = (r) l2;
                                            s sVar = rVar.f21169e;
                                            if (sVar != null && (b10 = sVar.b(j10, obj, null)) != null) {
                                                obj3 = biFunction.apply(obj, b10.f21154c);
                                                if (obj3 != null) {
                                                    b10.f21154c = obj3;
                                                } else {
                                                    if (rVar.f(b10)) {
                                                        i(lVarArr, i11, q(rVar.f));
                                                    }
                                                    i6 = -1;
                                                }
                                            }
                                            i10 = 2;
                                        }
                                    } else {
                                        i10 = 1;
                                        l lVar = null;
                                        l lVar2 = l2;
                                        while (true) {
                                            if (lVar2.f21152a != j10 || ((obj2 = lVar2.f21153b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                                                l lVar3 = lVar2.f21155d;
                                                if (lVar3 == null) {
                                                    break;
                                                }
                                                i10++;
                                                lVar = lVar2;
                                                lVar2 = lVar3;
                                            }
                                        }
                                        obj3 = biFunction.apply(obj, lVar2.f21154c);
                                        if (obj3 != null) {
                                            lVar2.f21154c = obj3;
                                        } else {
                                            l lVar4 = lVar2.f21155d;
                                            if (lVar != null) {
                                                lVar.f21155d = lVar4;
                                            } else {
                                                i(lVarArr, i11, lVar4);
                                            }
                                            i6 = -1;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (i10 != 0) {
                            break;
                        }
                    }
                }
            }
            lVarArr = f();
        }
        if (i6 != 0) {
            a(i6, i10);
        }
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.f21129a;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a10 = qVar.a();
                if (a10 == null) {
                    break;
                }
                Object obj2 = a10.f21154c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    final l[] e(l[] lVarArr, l lVar) {
        l[] lVarArr2;
        int i6;
        if (!(lVar instanceof g) || (lVarArr2 = ((g) lVar).f21145e) == null) {
            return this.f21129a;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
        while (true) {
            if (lVarArr2 != this.f21130b || this.f21129a != lVarArr || (i6 = this.sizeCtl) >= 0 || (i6 >>> 16) != numberOfLeadingZeros || i6 == numberOfLeadingZeros + 1 || i6 == 65535 + numberOfLeadingZeros || this.transferIndex <= 0) {
                break;
            } else if (f21121h.c(this, f21122i, i6, i6 + 1)) {
                n(lVarArr, lVarArr2);
                break;
            }
        }
        return lVarArr2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v10;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                l[] lVarArr = this.f21129a;
                int length = lVarArr == null ? 0 : lVarArr.length;
                q qVar = new q(lVarArr, length, 0, length);
                while (true) {
                    l a10 = qVar.a();
                    if (a10 == null) {
                        for (Map.Entry<K, V> entry : map.entrySet()) {
                            K key = entry.getKey();
                            if (key == null || (value = entry.getValue()) == null || (v10 = get(key)) == null || (value != v10 && !value.equals(v10))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    Object obj2 = a10.f21154c;
                    Object obj3 = map.get(a10.f21153b);
                    if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                        break;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.f21129a;
        if (lVarArr == null) {
            return;
        }
        q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a10 = qVar.a();
            if (a10 == null) {
                return;
            }
            biConsumer.accept(a10.f21153b, a10.f21154c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a2, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b1, code lost:
        a(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b6, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj, Object obj2, boolean z10) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int j10 = j(obj.hashCode());
        l[] lVarArr = this.f21129a;
        int i6 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i10 = (length - 1) & j10;
                    l l2 = l(lVarArr, i10);
                    if (l2 != null) {
                        int i11 = l2.f21152a;
                        if (i11 == -1) {
                            lVarArr = e(lVarArr, l2);
                        } else if (z10 && i11 == j10 && (((obj5 = l2.f21153b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = l2.f21154c) != null)) {
                            return obj6;
                        } else {
                            synchronized (l2) {
                                if (l(lVarArr, i10) == l2) {
                                    if (i11 < 0) {
                                        if (!(l2 instanceof r)) {
                                            if (l2 instanceof m) {
                                                break;
                                            }
                                        } else {
                                            s e10 = ((r) l2).e(j10, obj, obj2);
                                            if (e10 != null) {
                                                Object obj7 = e10.f21154c;
                                                if (!z10) {
                                                    e10.f21154c = obj2;
                                                }
                                                obj3 = obj7;
                                            } else {
                                                obj3 = null;
                                            }
                                            i6 = 2;
                                        }
                                    } else {
                                        i6 = 1;
                                        l lVar = l2;
                                        while (true) {
                                            if (lVar.f21152a != j10 || ((obj4 = lVar.f21153b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                l lVar2 = lVar.f21155d;
                                                if (lVar2 == null) {
                                                    lVar.f21155d = new l(j10, obj, obj2);
                                                    break;
                                                }
                                                i6++;
                                                lVar = lVar2;
                                            }
                                        }
                                        obj3 = lVar.f21154c;
                                        if (!z10) {
                                            lVar.f21154c = obj2;
                                        }
                                    }
                                }
                                obj3 = null;
                            }
                            if (i6 != 0) {
                                if (i6 >= 8) {
                                    o(lVarArr, i10);
                                }
                                if (obj3 != null) {
                                    return obj3;
                                }
                            }
                        }
                    } else if (b(lVarArr, i10, new l(j10, obj, obj2))) {
                        break;
                    }
                }
            }
            lVarArr = f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return (V) r1.f21154c;
     */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V get(Object obj) {
        int length;
        l l2;
        Object obj2;
        int j10 = j(obj.hashCode());
        l[] lVarArr = this.f21129a;
        if (lVarArr != null && (length = lVarArr.length) > 0 && (l2 = l(lVarArr, (length - 1) & j10)) != null) {
            int i6 = l2.f21152a;
            if (i6 == j10) {
                Object obj3 = l2.f21153b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return (V) l2.f21154c;
                }
            } else if (i6 < 0) {
                l a10 = l2.a(obj, j10);
                if (a10 != null) {
                    return (V) a10.f21154c;
                }
                return null;
            }
            while (true) {
                l2 = l2.f21155d;
                if (l2 == null) {
                    break;
                } else if (l2.f21152a != j10 || ((obj2 = l2.f21153b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                }
            }
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v10 = get(obj);
        return v10 == null ? obj2 : v10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a9, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Object obj, Object obj2, Object obj3) {
        int length;
        int i6;
        l l2;
        boolean z10;
        Object obj4;
        s b10;
        l q10;
        Object obj5;
        int j10 = j(obj.hashCode());
        l[] lVarArr = this.f21129a;
        while (true) {
            if (lVarArr == null || (length = lVarArr.length) == 0 || (l2 = l(lVarArr, (i6 = (length - 1) & j10))) == null) {
                break;
            }
            int i10 = l2.f21152a;
            if (i10 == -1) {
                lVarArr = e(lVarArr, l2);
            } else {
                synchronized (l2) {
                    try {
                        if (l(lVarArr, i6) == l2) {
                            z10 = true;
                            if (i10 < 0) {
                                if (!(l2 instanceof r)) {
                                    if (l2 instanceof m) {
                                        break;
                                    }
                                } else {
                                    r rVar = (r) l2;
                                    s sVar = rVar.f21169e;
                                    if (sVar != null && (b10 = sVar.b(j10, obj, null)) != null) {
                                        obj4 = b10.f21154c;
                                        if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                            if (obj2 != null) {
                                                b10.f21154c = obj2;
                                            } else if (rVar.f(b10)) {
                                                q10 = q(rVar.f);
                                                i(lVarArr, i6, q10);
                                            }
                                        }
                                    }
                                    obj4 = null;
                                }
                            } else {
                                l lVar = null;
                                l lVar2 = l2;
                                while (true) {
                                    if (lVar2.f21152a != j10 || ((obj5 = lVar2.f21153b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        l lVar3 = lVar2.f21155d;
                                        if (lVar3 == null) {
                                            break;
                                        }
                                        lVar = lVar2;
                                        lVar2 = lVar3;
                                    }
                                }
                                obj4 = lVar2.f21154c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        lVar2.f21154c = obj2;
                                    } else if (lVar != null) {
                                        lVar.f21155d = lVar2.f21155d;
                                    } else {
                                        q10 = lVar2.f21155d;
                                        i(lVarArr, i6, q10);
                                    }
                                }
                                obj4 = null;
                            }
                        }
                        z10 = false;
                        obj4 = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int hashCode() {
        l[] lVarArr = this.f21129a;
        int i6 = 0;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a10 = qVar.a();
                if (a10 == null) {
                    break;
                }
                i6 += a10.f21154c.hashCode() ^ a10.f21153b.hashCode();
            }
        }
        return i6;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean isEmpty() {
        return k() <= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long k() {
        c[] cVarArr = this.f21131c;
        long j10 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j10 += cVar.value;
                }
            }
        }
        return j10;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set<K> keySet() {
        i iVar = this.f21132d;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.f21132d = iVar2;
        return iVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00da, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i6;
        Object obj3;
        Object obj4;
        Object obj5 = obj2;
        if (obj == null || obj5 == null || biFunction == null) {
            throw null;
        }
        int j10 = j(obj.hashCode());
        l[] lVarArr = this.f21129a;
        int i10 = 0;
        Object obj6 = null;
        int i11 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i12 = (length - 1) & j10;
                    l l2 = l(lVarArr, i12);
                    i6 = 1;
                    if (l2 != null) {
                        int i13 = l2.f21152a;
                        if (i13 == -1) {
                            lVarArr = e(lVarArr, l2);
                        } else {
                            synchronized (l2) {
                                try {
                                    if (l(lVarArr, i12) == l2) {
                                        if (i13 < 0) {
                                            if (!(l2 instanceof r)) {
                                                if (l2 instanceof m) {
                                                    break;
                                                }
                                            } else {
                                                r rVar = (r) l2;
                                                s sVar = rVar.f21169e;
                                                s b10 = sVar == null ? null : sVar.b(j10, obj, null);
                                                Object apply = b10 == null ? obj5 : biFunction.apply(b10.f21154c, obj5);
                                                if (apply != null) {
                                                    if (b10 != null) {
                                                        b10.f21154c = apply;
                                                    } else {
                                                        rVar.e(j10, obj, apply);
                                                        i11 = 1;
                                                    }
                                                } else if (b10 != null) {
                                                    if (rVar.f(b10)) {
                                                        i(lVarArr, i12, q(rVar.f));
                                                    }
                                                    i11 = -1;
                                                }
                                                i10 = 2;
                                                obj6 = apply;
                                            }
                                        } else {
                                            l lVar = null;
                                            l lVar2 = l2;
                                            int i14 = 1;
                                            while (true) {
                                                if (lVar2.f21152a != j10 || ((obj4 = lVar2.f21153b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                    l lVar3 = lVar2.f21155d;
                                                    if (lVar3 == null) {
                                                        lVar2.f21155d = new l(j10, obj, obj5);
                                                        obj3 = obj5;
                                                        i11 = 1;
                                                        break;
                                                    }
                                                    i14++;
                                                    lVar = lVar2;
                                                    lVar2 = lVar3;
                                                }
                                            }
                                            obj3 = biFunction.apply(lVar2.f21154c, obj5);
                                            if (obj3 != null) {
                                                lVar2.f21154c = obj3;
                                            } else {
                                                l lVar4 = lVar2.f21155d;
                                                if (lVar != null) {
                                                    lVar.f21155d = lVar4;
                                                } else {
                                                    i(lVarArr, i12, lVar4);
                                                }
                                                i11 = -1;
                                            }
                                            i10 = i14;
                                            obj6 = obj3;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (i10 != 0) {
                                if (i10 >= 8) {
                                    o(lVarArr, i12);
                                }
                                i6 = i11;
                                obj5 = obj6;
                            }
                        }
                    } else if (b(lVarArr, i12, new l(j10, obj, obj5))) {
                        break;
                    }
                }
            }
            lVarArr = f();
        }
        if (i6 != 0) {
            a(i6, i10);
        }
        return obj5;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V put(K k10, V v10) {
        return (V) g(k10, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        p(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            g(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k10, V v10) {
        return (V) g(k10, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V remove(Object obj) {
        return (V) h(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || h(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return h(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return h(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.f21129a;
        if (lVarArr == null) {
            return;
        }
        q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l a10 = qVar.a();
            if (a10 == null) {
                return;
            }
            Object obj = a10.f21154c;
            Object obj2 = a10.f21153b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (h(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int size() {
        long k10 = k();
        if (k10 < 0) {
            return 0;
        }
        return k10 > 2147483647L ? SubsamplingScaleImageView.TILE_SIZE_AUTO : (int) k10;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.f21129a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        q qVar = new q(lVarArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder("{");
        l a10 = qVar.a();
        if (a10 != null) {
            while (true) {
                Object obj = a10.f21153b;
                Object obj2 = a10.f21154c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                a10 = qVar.a();
                if (a10 == null) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Collection<V> values() {
        t tVar = this.f21133e;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this);
        this.f21133e = tVar2;
        return tVar2;
    }
}
