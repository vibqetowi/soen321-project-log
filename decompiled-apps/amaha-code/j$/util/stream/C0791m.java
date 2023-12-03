package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
/* renamed from: j$.util.stream.m  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0791m implements java.util.stream.Collector {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Collector f21506a;

    private /* synthetic */ C0791m(Collector collector) {
        this.f21506a = collector;
    }

    public static /* synthetic */ java.util.stream.Collector a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C0786l ? ((C0786l) collector).f21503a : new C0791m(collector);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return this.f21506a.accumulator();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return AbstractC0850z0.q0(this.f21506a.characteristics());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return this.f21506a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f21506a;
        if (obj instanceof C0791m) {
            obj = ((C0791m) obj).f21506a;
        }
        return collector.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return this.f21506a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.f21506a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return this.f21506a.supplier();
    }
}
