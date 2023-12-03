package j$.util;

import j$.util.stream.Stream;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
/* renamed from: j$.util.Collection$-EL */
/* loaded from: classes3.dex */
public final /* synthetic */ class Collection$EL {
    public static void a(Collection collection, Consumer consumer) {
        if (collection instanceof InterfaceC0715c) {
            ((InterfaceC0715c) collection).forEach(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        for (Object obj : collection) {
            consumer.accept(obj);
        }
    }

    public static S b(Collection collection) {
        if (collection instanceof InterfaceC0715c) {
            return ((InterfaceC0715c) collection).spliterator();
        }
        if (collection instanceof LinkedHashSet) {
            return new e0((Collection) Objects.requireNonNull((LinkedHashSet) collection), 17);
        }
        if (collection instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) collection;
            return new C(sortedSet, sortedSet);
        } else if (collection instanceof Set) {
            return new e0((Collection) Objects.requireNonNull((Set) collection), 1);
        } else {
            if (collection instanceof List) {
                List list = (List) collection;
                return list instanceof RandomAccess ? new C0713a(list) : new e0((Collection) Objects.requireNonNull(list), 16);
            }
            return new e0((Collection) Objects.requireNonNull(collection), 0);
        }
    }

    public static /* synthetic */ Stream stream(Collection collection) {
        return collection instanceof InterfaceC0715c ? ((InterfaceC0715c) collection).stream() : AbstractC0714b.g(collection);
    }
}
