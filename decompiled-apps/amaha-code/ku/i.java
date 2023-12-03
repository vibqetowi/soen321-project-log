package ku;

import gt.a0;
import java.util.ArrayList;
import java.util.List;
import wu.b0;
import wu.i0;
/* compiled from: ConstantValueFactory.kt */
/* loaded from: classes2.dex */
public final class i {

    /* compiled from: ConstantValueFactory.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<a0, b0> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ dt.k f23943u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dt.k kVar) {
            super(1);
            this.f23943u = kVar;
        }

        @Override // ss.l
        public final b0 invoke(a0 a0Var) {
            a0 module = a0Var;
            kotlin.jvm.internal.i.g(module, "module");
            i0 r = module.o().r(this.f23943u);
            kotlin.jvm.internal.i.f(r, "module.builtIns.getPrimi…KotlinType(componentType)");
            return r;
        }
    }

    public static b a(List list, dt.k kVar) {
        List<Object> I2 = is.u.I2(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : I2) {
            g b10 = b(obj);
            if (b10 != null) {
                arrayList.add(b10);
            }
        }
        return new b(arrayList, new a(kVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [is.w] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static g b(Object obj) {
        if (obj instanceof Byte) {
            return new d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new t(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new l(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new r(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new e(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new c(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new c(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new c(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new u((String) obj);
        }
        boolean z10 = obj instanceof byte[];
        ?? r12 = is.w.f20676u;
        int i6 = 0;
        if (z10) {
            byte[] bArr = (byte[]) obj;
            kotlin.jvm.internal.i.g(bArr, "<this>");
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    r12 = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i6 < length2) {
                        r12.add(Byte.valueOf(bArr[i6]));
                        i6++;
                    }
                } else {
                    r12 = ca.a.O0(Byte.valueOf(bArr[0]));
                }
            }
            return a(r12, dt.k.BYTE);
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            kotlin.jvm.internal.i.g(sArr, "<this>");
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    r12 = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i6 < length4) {
                        r12.add(Short.valueOf(sArr[i6]));
                        i6++;
                    }
                } else {
                    r12 = ca.a.O0(Short.valueOf(sArr[0]));
                }
            }
            return a(r12, dt.k.SHORT);
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            kotlin.jvm.internal.i.g(iArr, "<this>");
            int length5 = iArr.length;
            if (length5 != 0) {
                if (length5 != 1) {
                    r12 = new ArrayList(iArr.length);
                    int length6 = iArr.length;
                    while (i6 < length6) {
                        r12.add(Integer.valueOf(iArr[i6]));
                        i6++;
                    }
                } else {
                    r12 = ca.a.O0(Integer.valueOf(iArr[0]));
                }
            }
            return a(r12, dt.k.INT);
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            kotlin.jvm.internal.i.g(jArr, "<this>");
            int length7 = jArr.length;
            if (length7 != 0) {
                if (length7 != 1) {
                    r12 = new ArrayList(jArr.length);
                    int length8 = jArr.length;
                    while (i6 < length8) {
                        r12.add(Long.valueOf(jArr[i6]));
                        i6++;
                    }
                } else {
                    r12 = ca.a.O0(Long.valueOf(jArr[0]));
                }
            }
            return a(r12, dt.k.LONG);
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            kotlin.jvm.internal.i.g(cArr, "<this>");
            int length9 = cArr.length;
            if (length9 != 0) {
                if (length9 != 1) {
                    r12 = new ArrayList(cArr.length);
                    int length10 = cArr.length;
                    while (i6 < length10) {
                        r12.add(Character.valueOf(cArr[i6]));
                        i6++;
                    }
                } else {
                    r12 = ca.a.O0(Character.valueOf(cArr[0]));
                }
            }
            return a(r12, dt.k.CHAR);
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            kotlin.jvm.internal.i.g(fArr, "<this>");
            int length11 = fArr.length;
            if (length11 != 0) {
                if (length11 != 1) {
                    r12 = new ArrayList(fArr.length);
                    int length12 = fArr.length;
                    while (i6 < length12) {
                        r12.add(Float.valueOf(fArr[i6]));
                        i6++;
                    }
                } else {
                    r12 = ca.a.O0(Float.valueOf(fArr[0]));
                }
            }
            return a(r12, dt.k.FLOAT);
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            kotlin.jvm.internal.i.g(dArr, "<this>");
            int length13 = dArr.length;
            if (length13 != 0) {
                if (length13 != 1) {
                    r12 = new ArrayList(dArr.length);
                    int length14 = dArr.length;
                    while (i6 < length14) {
                        r12.add(Double.valueOf(dArr[i6]));
                        i6++;
                    }
                } else {
                    r12 = ca.a.O0(Double.valueOf(dArr[0]));
                }
            }
            return a(r12, dt.k.DOUBLE);
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            kotlin.jvm.internal.i.g(zArr, "<this>");
            int length15 = zArr.length;
            if (length15 != 0) {
                if (length15 != 1) {
                    r12 = new ArrayList(zArr.length);
                    int length16 = zArr.length;
                    while (i6 < length16) {
                        r12.add(Boolean.valueOf(zArr[i6]));
                        i6++;
                    }
                } else {
                    r12 = ca.a.O0(Boolean.valueOf(zArr[0]));
                }
            }
            return a(r12, dt.k.BOOLEAN);
        } else if (obj == null) {
            return new s();
        } else {
            return null;
        }
    }
}
