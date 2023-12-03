package is;

import java.util.RandomAccess;
/* compiled from: _ArraysJvm.kt */
/* loaded from: classes2.dex */
public final class h extends c<Integer> implements RandomAccess {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int[] f20663u;

    public h(int[] iArr) {
        this.f20663u = iArr;
    }

    @Override // is.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f20663u;
        kotlin.jvm.internal.i.g(iArr, "<this>");
        int length = iArr.length;
        int i6 = 0;
        while (true) {
            if (i6 < length) {
                if (intValue == iArr[i6]) {
                    break;
                }
                i6++;
            } else {
                i6 = -1;
                break;
            }
        }
        if (i6 < 0) {
            return false;
        }
        return true;
    }

    @Override // is.a
    public final int g() {
        return this.f20663u.length;
    }

    @Override // is.c, java.util.List
    public final Object get(int i6) {
        return Integer.valueOf(this.f20663u[i6]);
    }

    @Override // is.c, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f20663u;
        kotlin.jvm.internal.i.g(iArr, "<this>");
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6++) {
            if (intValue == iArr[i6]) {
                return i6;
            }
        }
        return -1;
    }

    @Override // is.a, java.util.Collection
    public final boolean isEmpty() {
        if (this.f20663u.length == 0) {
            return true;
        }
        return false;
    }

    @Override // is.c, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Number) obj).intValue();
        int[] iArr = this.f20663u;
        kotlin.jvm.internal.i.g(iArr, "<this>");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i6 = length - 1;
            if (intValue == iArr[length]) {
                return length;
            }
            if (i6 < 0) {
                return -1;
            }
            length = i6;
        }
    }
}
