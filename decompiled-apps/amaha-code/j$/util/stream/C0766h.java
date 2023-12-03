package j$.util.stream;

import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
/* renamed from: j$.util.stream.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0766h implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC0771i f21483a;

    private /* synthetic */ C0766h(InterfaceC0771i interfaceC0771i) {
        this.f21483a = interfaceC0771i;
    }

    public static /* synthetic */ BaseStream k(InterfaceC0771i interfaceC0771i) {
        if (interfaceC0771i == null) {
            return null;
        }
        return interfaceC0771i instanceof C0761g ? ((C0761g) interfaceC0771i).f21462a : interfaceC0771i instanceof H ? G.k((H) interfaceC0771i) : interfaceC0771i instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC0771i) : interfaceC0771i instanceof InterfaceC0812q0 ? C0807p0.k((InterfaceC0812q0) interfaceC0771i) : interfaceC0771i instanceof Stream ? C0750d3.k((Stream) interfaceC0771i) : new C0766h(interfaceC0771i);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21483a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0771i interfaceC0771i = this.f21483a;
        if (obj instanceof C0766h) {
            obj = ((C0766h) obj).f21483a;
        }
        return interfaceC0771i.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21483a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f21483a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f21483a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return k(this.f21483a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return k(this.f21483a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return k(this.f21483a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.Q.a(this.f21483a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return k(this.f21483a.unordered());
    }
}
