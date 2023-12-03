package x1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* compiled from: RoomSQLiteQuery.kt */
/* loaded from: classes.dex */
public final class p implements b2.e, b2.d {
    public static final TreeMap<Integer, p> C = new TreeMap<>();
    public final int[] A;
    public int B;

    /* renamed from: u  reason: collision with root package name */
    public final int f37550u;

    /* renamed from: v  reason: collision with root package name */
    public volatile String f37551v;

    /* renamed from: w  reason: collision with root package name */
    public final long[] f37552w;

    /* renamed from: x  reason: collision with root package name */
    public final double[] f37553x;

    /* renamed from: y  reason: collision with root package name */
    public final String[] f37554y;

    /* renamed from: z  reason: collision with root package name */
    public final byte[][] f37555z;

    public p(int i6) {
        this.f37550u = i6;
        int i10 = i6 + 1;
        this.A = new int[i10];
        this.f37552w = new long[i10];
        this.f37553x = new double[i10];
        this.f37554y = new String[i10];
        this.f37555z = new byte[i10];
    }

    public static final p g(int i6, String query) {
        kotlin.jvm.internal.i.g(query, "query");
        TreeMap<Integer, p> treeMap = C;
        synchronized (treeMap) {
            Map.Entry<Integer, p> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i6));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                p value = ceilingEntry.getValue();
                value.getClass();
                value.f37551v = query;
                value.B = i6;
                return value;
            }
            hs.k kVar = hs.k.f19476a;
            p pVar = new p(i6);
            pVar.f37551v = query;
            pVar.B = i6;
            return pVar;
        }
    }

    @Override // b2.d
    public final void M(int i6, long j10) {
        this.A[i6] = 2;
        this.f37552w[i6] = j10;
    }

    @Override // b2.d
    public final void W(byte[] bArr, int i6) {
        this.A[i6] = 5;
        this.f37555z[i6] = bArr;
    }

    @Override // b2.e
    public final String a() {
        String str = this.f37551v;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // b2.e
    public final void e(m mVar) {
        int i6 = this.B;
        if (1 <= i6) {
            int i10 = 1;
            while (true) {
                int i11 = this.A[i10];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    byte[] bArr = this.f37555z[i10];
                                    if (bArr != null) {
                                        mVar.W(bArr, i10);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str = this.f37554y[i10];
                                if (str != null) {
                                    mVar.t(i10, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                        } else {
                            mVar.a(this.f37553x[i10], i10);
                        }
                    } else {
                        mVar.M(i10, this.f37552w[i10]);
                    }
                } else {
                    mVar.i0(i10);
                }
                if (i10 != i6) {
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void h() {
        TreeMap<Integer, p> treeMap = C;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f37550u), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                kotlin.jvm.internal.i.f(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i6 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i6;
                }
            }
            hs.k kVar = hs.k.f19476a;
        }
    }

    @Override // b2.d
    public final void i0(int i6) {
        this.A[i6] = 1;
    }

    @Override // b2.d
    public final void t(int i6, String value) {
        kotlin.jvm.internal.i.g(value, "value");
        this.A[i6] = 4;
        this.f37554y[i6] = value;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
