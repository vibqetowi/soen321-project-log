package qc;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.k;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.h;
import sc.b;
/* compiled from: Ints.java */
/* loaded from: classes.dex */
public final class a extends k {

    /* compiled from: Ints.java */
    /* renamed from: qc.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0498a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: u  reason: collision with root package name */
        public final int[] f29520u;

        /* renamed from: v  reason: collision with root package name */
        public final int f29521v;

        /* renamed from: w  reason: collision with root package name */
        public final int f29522w;

        public C0498a(int i6, int i10, int[] iArr) {
            this.f29520u = iArr;
            this.f29521v = i6;
            this.f29522w = i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                int i6 = this.f29521v;
                while (true) {
                    if (i6 < this.f29522w) {
                        if (this.f29520u[i6] == intValue) {
                            break;
                        }
                        i6++;
                    } else {
                        i6 = -1;
                        break;
                    }
                }
                if (i6 != -1) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0498a) {
                C0498a c0498a = (C0498a) obj;
                int i6 = this.f29522w;
                int i10 = this.f29521v;
                int i11 = i6 - i10;
                if (c0498a.f29522w - c0498a.f29521v != i11) {
                    return false;
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    if (this.f29520u[i10 + i12] != c0498a.f29520u[c0498a.f29521v + i12]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i6) {
            int i10 = this.f29522w;
            int i11 = this.f29521v;
            b.u(i6, i10 - i11);
            return Integer.valueOf(this.f29520u[i11 + i6]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            int i6 = 1;
            for (int i10 = this.f29521v; i10 < this.f29522w; i10++) {
                i6 = (i6 * 31) + this.f29520u[i10];
            }
            return i6;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                int i6 = this.f29521v;
                int i10 = i6;
                while (true) {
                    if (i10 < this.f29522w) {
                        if (this.f29520u[i10] == intValue) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 >= 0) {
                    return i10 - i6;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i6;
            if (obj instanceof Integer) {
                int intValue = ((Integer) obj).intValue();
                int i10 = this.f29522w - 1;
                while (true) {
                    i6 = this.f29521v;
                    if (i10 >= i6) {
                        if (this.f29520u[i10] == intValue) {
                            break;
                        }
                        i10--;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 >= 0) {
                    return i10 - i6;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i6, Object obj) {
            Integer num = (Integer) obj;
            int i10 = this.f29522w;
            int i11 = this.f29521v;
            b.u(i6, i10 - i11);
            int i12 = i11 + i6;
            int[] iArr = this.f29520u;
            int i13 = iArr[i12];
            num.getClass();
            iArr[i12] = num.intValue();
            return Integer.valueOf(i13);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f29522w - this.f29521v;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List<Integer> subList(int i6, int i10) {
            int i11 = this.f29522w;
            int i12 = this.f29521v;
            b.y(i6, i10, i11 - i12);
            if (i6 == i10) {
                return Collections.emptyList();
            }
            return new C0498a(i6 + i12, i12 + i10, this.f29520u);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            int i6 = this.f29522w;
            int i10 = this.f29521v;
            StringBuilder sb2 = new StringBuilder((i6 - i10) * 5);
            sb2.append('[');
            int[] iArr = this.f29520u;
            sb2.append(iArr[i10]);
            while (true) {
                i10++;
                if (i10 < i6) {
                    sb2.append(", ");
                    sb2.append(iArr[i10]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }
    }

    public static int D(long j10) {
        boolean z10;
        int i6 = (int) j10;
        if (i6 == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        b.o("Out of range: %s", j10, z10);
        return i6;
    }

    public static int E(int i6, int i10) {
        boolean z10;
        if (i10 <= 1073741823) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return Math.min(Math.max(i6, i10), 1073741823);
        }
        throw new IllegalArgumentException(h.P("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i10), 1073741823));
    }

    public static int F(long j10) {
        if (j10 > 2147483647L) {
            return SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        if (j10 < -2147483648L) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        return (int) j10;
    }

    public static int[] G(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof C0498a) {
            C0498a c0498a = (C0498a) abstractCollection;
            return Arrays.copyOfRange(c0498a.f29520u, c0498a.f29521v, c0498a.f29522w);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            Object obj = array[i6];
            obj.getClass();
            iArr[i6] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
