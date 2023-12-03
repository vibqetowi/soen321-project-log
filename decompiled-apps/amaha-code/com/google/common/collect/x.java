package com.google.common.collect;

import java.util.ArrayList;
import java.util.Collections;
/* compiled from: Lists.java */
/* loaded from: classes.dex */
public final class x {
    public static void a(int i6, String str) {
        if (i6 >= 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 40);
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i6);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Object b(int i6) {
        if (i6 >= 2 && i6 <= 1073741824 && Integer.highestOneBit(i6) == i6) {
            if (i6 <= 256) {
                return new byte[i6];
            }
            if (i6 <= 65536) {
                return new short[i6];
            }
            return new int[i6];
        }
        throw new IllegalArgumentException(defpackage.b.h(52, "must be power of 2 between 2^1 and 2^30: ", i6));
    }

    @SafeVarargs
    public static ArrayList c(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        a(length, "arraySize");
        ArrayList arrayList = new ArrayList(qc.a.F(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r5 != (-1)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        h(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        r13[r5] = (r9 & r11) | (r13[r5] & r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int d(Object obj, Object obj2, int i6, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int f = f(obj);
        int i10 = f & i6;
        int g5 = g(i10, obj3);
        if (g5 == 0) {
            return -1;
        }
        int i11 = ~i6;
        int i12 = f & i11;
        int i13 = -1;
        while (true) {
            int i14 = g5 - 1;
            int i15 = iArr[i14];
            if ((i15 & i11) != i12 || !f6.b.v0(obj, objArr[i14]) || (objArr2 != null && !f6.b.v0(obj2, objArr2[i14]))) {
                int i16 = i15 & i6;
                if (i16 == 0) {
                    return -1;
                }
                i13 = i14;
                g5 = i16;
            }
        }
    }

    public static int e(int i6) {
        return (int) (Integer.rotateLeft((int) (i6 * (-862048943)), 15) * 461845907);
    }

    public static int f(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return e(hashCode);
    }

    public static int g(int i6, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i6] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i6] & 65535;
        }
        return ((int[]) obj)[i6];
    }

    public static void h(int i6, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i6] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i6] = (short) i10;
        } else {
            ((int[]) obj)[i6] = i10;
        }
    }
}
