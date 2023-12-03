package j$.util.stream;

import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0761g implements InterfaceC0771i {

    /* renamed from: a */
    public final /* synthetic */ BaseStream f21462a;

    private /* synthetic */ C0761g(BaseStream baseStream) {
        this.f21462a = baseStream;
    }

    public static /* synthetic */ InterfaceC0771i k(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C0766h ? ((C0766h) baseStream).f21483a : baseStream instanceof DoubleStream ? F.k((DoubleStream) baseStream) : baseStream instanceof java.util.stream.IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C0802o0.k((LongStream) baseStream) : baseStream instanceof java.util.stream.Stream ? C0745c3.k((java.util.stream.Stream) baseStream) : new C0761g(baseStream);
    }

    @Override // j$.util.stream.InterfaceC0771i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21462a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0761g) {
            obj = ((C0761g) obj).f21462a;
        }
        return this.f21462a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21462a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final /* synthetic */ boolean isParallel() {
        return this.f21462a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ Iterator iterator() {
        return this.f21462a.iterator();
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final /* synthetic */ InterfaceC0771i onClose(Runnable runnable) {
        return k(this.f21462a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ InterfaceC0771i parallel() {
        return k(this.f21462a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ InterfaceC0771i sequential() {
        return k(this.f21462a.sequential());
    }

    @Override // j$.util.stream.InterfaceC0771i, j$.util.stream.H
    public final /* synthetic */ j$.util.S spliterator() {
        return j$.util.P.a(this.f21462a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0771i
    public final /* synthetic */ InterfaceC0771i unordered() {
        return k(this.f21462a.unordered());
    }
}
