package j$.util.stream;

import j$.util.Collection$EL;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
/* loaded from: classes3.dex */
final class N2 extends F2 {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f21345d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public N2(InterfaceC0818r2 interfaceC0818r2, Comparator comparator) {
        super(interfaceC0818r2, comparator);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f21345d.add(obj);
    }

    @Override // j$.util.stream.InterfaceC0818r2
    public final void c(long j10) {
        if (j10 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f21345d = j10 >= 0 ? new ArrayList((int) j10) : new ArrayList();
    }

    @Override // j$.util.stream.AbstractC0799n2, j$.util.stream.InterfaceC0818r2
    public final void end() {
        ArrayList arrayList = this.f21345d;
        Object[] array = arrayList.toArray();
        Arrays.sort(array, this.f21283b);
        ListIterator listIterator = arrayList.listIterator();
        for (Object obj : array) {
            listIterator.next();
            listIterator.set(obj);
        }
        InterfaceC0818r2 interfaceC0818r2 = this.f21519a;
        interfaceC0818r2.c(this.f21345d.size());
        if (this.f21284c) {
            Iterator it = this.f21345d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC0818r2.e()) {
                    break;
                }
                interfaceC0818r2.accept((InterfaceC0818r2) next);
            }
        } else {
            ArrayList arrayList2 = this.f21345d;
            Objects.requireNonNull(interfaceC0818r2);
            Collection$EL.a(arrayList2, new C0731a(interfaceC0818r2, 2));
        }
        interfaceC0818r2.end();
        this.f21345d = null;
    }
}
