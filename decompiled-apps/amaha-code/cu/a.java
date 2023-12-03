package cu;

import is.c;
import is.h;
import is.k;
import is.u;
import is.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
/* compiled from: BinaryVersion.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f12014a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12015b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12016c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12017d;

    /* renamed from: e  reason: collision with root package name */
    public final List<Integer> f12018e;

    public a(int... numbers) {
        int i6;
        int i10;
        List<Integer> list;
        i.g(numbers, "numbers");
        this.f12014a = numbers;
        Integer U1 = k.U1(numbers, 0);
        if (U1 != null) {
            i6 = U1.intValue();
        } else {
            i6 = -1;
        }
        this.f12015b = i6;
        Integer U12 = k.U1(numbers, 1);
        if (U12 != null) {
            i10 = U12.intValue();
        } else {
            i10 = -1;
        }
        this.f12016c = i10;
        Integer U13 = k.U1(numbers, 2);
        this.f12017d = U13 != null ? U13.intValue() : -1;
        if (numbers.length > 3) {
            if (numbers.length <= 1024) {
                list = u.I2(new c.d(new h(numbers), 3, numbers.length));
            } else {
                throw new IllegalArgumentException(defpackage.c.s(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
        } else {
            list = w.f20676u;
        }
        this.f12018e = list;
    }

    public final boolean a(int i6, int i10, int i11) {
        int i12 = this.f12015b;
        if (i12 > i6) {
            return true;
        }
        if (i12 < i6) {
            return false;
        }
        int i13 = this.f12016c;
        if (i13 > i10) {
            return true;
        }
        if (i13 >= i10 && this.f12017d >= i11) {
            return true;
        }
        return false;
    }

    public final boolean b(a ourVersion) {
        i.g(ourVersion, "ourVersion");
        int i6 = this.f12016c;
        int i10 = ourVersion.f12016c;
        int i11 = ourVersion.f12015b;
        int i12 = this.f12015b;
        if (i12 == 0) {
            if (i11 == 0 && i6 == i10) {
                return true;
            }
        } else if (i12 == i11 && i6 <= i10) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && i.b(getClass(), obj.getClass())) {
            a aVar = (a) obj;
            if (this.f12015b == aVar.f12015b && this.f12016c == aVar.f12016c && this.f12017d == aVar.f12017d && i.b(this.f12018e, aVar.f12018e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f12015b;
        int i10 = (i6 * 31) + this.f12016c + i6;
        int i11 = (i10 * 31) + this.f12017d + i10;
        return this.f12018e.hashCode() + (i11 * 31) + i11;
    }

    public final String toString() {
        int[] iArr;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        for (int i6 : this.f12014a) {
            if (i6 != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            arrayList.add(Integer.valueOf(i6));
        }
        if (arrayList.isEmpty()) {
            return "unknown";
        }
        return u.m2(arrayList, ".", null, null, null, 62);
    }
}
