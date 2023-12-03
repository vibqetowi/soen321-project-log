package is;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: MutableCollectionsJVM.kt */
/* loaded from: classes2.dex */
public class p extends o {
    public static final <T> void P1(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.i.g(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
