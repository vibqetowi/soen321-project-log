package is;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
/* compiled from: _Arrays.kt */
/* loaded from: classes2.dex */
public class k extends i {

    /* compiled from: Sequences.kt */
    /* loaded from: classes2.dex */
    public static final class a implements fv.h<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object[] f20670a;

        public a(Object[] objArr) {
            this.f20670a = objArr;
        }

        @Override // fv.h
        public final Iterator<T> iterator() {
            return kotlin.jvm.internal.h.N(this.f20670a);
        }
    }

    public static final <T> fv.h<T> P1(T[] tArr) {
        boolean z10;
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return fv.d.f15960a;
        }
        return new a(tArr);
    }

    public static final boolean Q1(Object obj, Object[] objArr) {
        kotlin.jvm.internal.i.g(objArr, "<this>");
        if (W1(obj, objArr) >= 0) {
            return true;
        }
        return false;
    }

    public static final ArrayList R1(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final <T> T S1(T[] tArr) {
        boolean z10;
        kotlin.jvm.internal.i.g(tArr, "<this>");
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T T1(T[] tArr) {
        boolean z10;
        kotlin.jvm.internal.i.g(tArr, "<this>");
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        return tArr[0];
    }

    public static final Integer U1(int[] iArr, int i6) {
        kotlin.jvm.internal.i.g(iArr, "<this>");
        if (i6 >= 0 && i6 <= iArr.length - 1) {
            return Integer.valueOf(iArr[i6]);
        }
        return null;
    }

    public static final Object V1(int i6, Object[] objArr) {
        kotlin.jvm.internal.i.g(objArr, "<this>");
        if (i6 >= 0 && i6 <= objArr.length - 1) {
            return objArr[i6];
        }
        return null;
    }

    public static final int W1(Object obj, Object[] objArr) {
        kotlin.jvm.internal.i.g(objArr, "<this>");
        int i6 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i6 < length) {
                if (objArr[i6] == null) {
                    return i6;
                }
                i6++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i6 < length2) {
            if (kotlin.jvm.internal.i.b(obj, objArr[i6])) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static final void X1(Object[] objArr, StringBuilder sb2, CharSequence separator, CharSequence prefix, CharSequence postfix, int i6, CharSequence truncated, ss.l lVar) {
        kotlin.jvm.internal.i.g(objArr, "<this>");
        kotlin.jvm.internal.i.g(separator, "separator");
        kotlin.jvm.internal.i.g(prefix, "prefix");
        kotlin.jvm.internal.i.g(postfix, "postfix");
        kotlin.jvm.internal.i.g(truncated, "truncated");
        sb2.append(prefix);
        int i10 = 0;
        for (Object obj : objArr) {
            i10++;
            if (i10 > 1) {
                sb2.append(separator);
            }
            if (i6 >= 0 && i10 > i6) {
                break;
            }
            kotlin.jvm.internal.h.d(sb2, obj, lVar);
        }
        if (i6 >= 0 && i10 > i6) {
            sb2.append(truncated);
        }
        sb2.append(postfix);
    }

    public static String Y1(byte[] bArr, ss.l lVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int i6 = 0;
        for (byte b10 : bArr) {
            i6++;
            if (i6 > 1) {
                sb2.append((CharSequence) "");
            }
            if (lVar != null) {
                sb2.append((CharSequence) lVar.invoke(Byte.valueOf(b10)));
            } else {
                sb2.append((CharSequence) String.valueOf((int) b10));
            }
        }
        sb2.append((CharSequence) "");
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static String Z1(Object[] objArr, String str, String str2, String str3, ss.l lVar, int i6) {
        String prefix;
        String postfix;
        int i10;
        CharSequence truncated;
        ss.l lVar2;
        if ((i6 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        if ((i6 & 2) != 0) {
            prefix = "";
        } else {
            prefix = str2;
        }
        if ((i6 & 4) != 0) {
            postfix = "";
        } else {
            postfix = str3;
        }
        if ((i6 & 8) != 0) {
            i10 = -1;
        } else {
            i10 = 0;
        }
        if ((i6 & 16) != 0) {
            truncated = "...";
        } else {
            truncated = null;
        }
        if ((i6 & 32) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        kotlin.jvm.internal.i.g(separator, "separator");
        kotlin.jvm.internal.i.g(prefix, "prefix");
        kotlin.jvm.internal.i.g(postfix, "postfix");
        kotlin.jvm.internal.i.g(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        X1(objArr, sb2, separator, prefix, postfix, i10, truncated, lVar2);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb3;
    }

    public static final <T> T a2(T[] tArr) {
        boolean z10;
        kotlin.jvm.internal.i.g(tArr, "<this>");
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return tArr[tArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T b2(T[] tArr) {
        boolean z10;
        kotlin.jvm.internal.i.g(tArr, "<this>");
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static final <T extends Comparable<? super T>> T c2(T[] tArr) {
        boolean z10;
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        T t3 = tArr[0];
        xs.e it = new xs.f(1, tArr.length - 1).iterator();
        while (it.f38001w) {
            T t10 = tArr[it.nextInt()];
            if (t3.compareTo(t10) < 0) {
                t3 = t10;
            }
        }
        return t3;
    }

    public static final char d2(char[] cArr) {
        kotlin.jvm.internal.i.g(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> T e2(T[] tArr) {
        kotlin.jvm.internal.i.g(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length == 1) {
                return tArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> List<T> f2(T[] tArr, Comparator<? super T> comparator) {
        boolean z10;
        kotlin.jvm.internal.i.g(tArr, "<this>");
        if (tArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            tArr = (T[]) Arrays.copyOf(tArr, tArr.length);
            kotlin.jvm.internal.i.f(tArr, "copyOf(this, size)");
            if (tArr.length > 1) {
                Arrays.sort(tArr, comparator);
            }
        }
        return i.G1(tArr);
    }

    public static final long g2(Long[] lArr) {
        kotlin.jvm.internal.i.g(lArr, "<this>");
        long j10 = 0;
        for (Long l2 : lArr) {
            j10 += l2.longValue();
        }
        return j10;
    }

    public static final void h2(AbstractCollection abstractCollection, Object[] objArr) {
        kotlin.jvm.internal.i.g(objArr, "<this>");
        for (Object obj : objArr) {
            abstractCollection.add(obj);
        }
    }

    public static final <T> List<T> i2(T[] tArr) {
        kotlin.jvm.internal.i.g(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new f(tArr, false));
            }
            return ca.a.O0(tArr[0]);
        }
        return w.f20676u;
    }

    public static final Set<Integer> j2(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(sp.b.P(iArr.length));
                for (int i6 : iArr) {
                    linkedHashSet.add(Integer.valueOf(i6));
                }
                return linkedHashSet;
            }
            return ca.a.l1(Integer.valueOf(iArr[0]));
        }
        return y.f20678u;
    }

    public static final <T> Set<T> k2(T[] tArr) {
        kotlin.jvm.internal.i.g(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(sp.b.P(tArr.length));
                h2(linkedHashSet, tArr);
                return linkedHashSet;
            }
            return ca.a.l1(tArr[0]);
        }
        return y.f20678u;
    }

    public static final a0 l2(Object[] objArr) {
        return new a0(new l(objArr));
    }
}
