package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
/* renamed from: j$.util.stream.l */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0786l implements Collector {

    /* renamed from: a */
    public final /* synthetic */ java.util.stream.Collector f21503a;

    private /* synthetic */ C0786l(java.util.stream.Collector collector) {
        this.f21503a = collector;
    }

    public static /* synthetic */ Collector a(java.util.stream.Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C0791m ? ((C0791m) collector).f21506a : new C0786l(collector);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f21503a.accumulator();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC0850z0.q0(this.f21503a.characteristics());
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f21503a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0786l) {
            obj = ((C0786l) obj).f21503a;
        }
        return this.f21503a.equals(obj);
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f21503a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21503a.hashCode();
    }

    @Override // j$.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f21503a.supplier();
    }
}
