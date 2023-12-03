package is;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: _ArraysJvm.kt */
/* loaded from: classes2.dex */
public class i extends ca.a {
    public static final List G1(Object[] objArr) {
        kotlin.jvm.internal.i.g(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        kotlin.jvm.internal.i.f(asList, "asList(this)");
        return asList;
    }

    public static final int H1(Iterable iterable, int i6) {
        kotlin.jvm.internal.i.g(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i6;
    }

    public static final void I1(int i6, int i10, int i11, byte[] bArr, byte[] destination) {
        kotlin.jvm.internal.i.g(bArr, "<this>");
        kotlin.jvm.internal.i.g(destination, "destination");
        System.arraycopy(bArr, i10, destination, i6, i11 - i10);
    }

    public static final void J1(int i6, int i10, int i11, Object[] objArr, Object[] destination) {
        kotlin.jvm.internal.i.g(objArr, "<this>");
        kotlin.jvm.internal.i.g(destination, "destination");
        System.arraycopy(objArr, i10, destination, i6, i11 - i10);
    }

    public static /* synthetic */ void K1(Object[] objArr, Object[] objArr2, int i6, int i10, int i11, int i12) {
        if ((i12 & 2) != 0) {
            i6 = 0;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = objArr.length;
        }
        J1(i6, i10, i11, objArr, objArr2);
    }

    public static final Object[] L1(int i6, int i10, Object[] objArr) {
        kotlin.jvm.internal.i.g(objArr, "<this>");
        ca.a.I(i10, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i6, i10);
        kotlin.jvm.internal.i.f(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final void M1(Object[] objArr, int i6, int i10) {
        kotlin.jvm.internal.i.g(objArr, "<this>");
        Arrays.fill(objArr, i6, i10, (Object) null);
    }

    public static void N1(Object[] objArr, kotlinx.coroutines.internal.r rVar) {
        int length = objArr.length;
        kotlin.jvm.internal.i.g(objArr, "<this>");
        Arrays.fill(objArr, 0, length, rVar);
    }

    public static final ArrayList O1(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            q.R1((Iterable) it.next(), arrayList2);
        }
        return arrayList2;
    }
}
