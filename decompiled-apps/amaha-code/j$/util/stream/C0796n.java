package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.n  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0796n implements Collector {

    /* renamed from: a  reason: collision with root package name */
    private final Supplier f21509a;

    /* renamed from: b  reason: collision with root package name */
    private final BiConsumer f21510b;

    /* renamed from: c  reason: collision with root package name */
    private final BinaryOperator f21511c;

    /* renamed from: d  reason: collision with root package name */
    private final Function f21512d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f21513e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0796n(O0 o02, O0 o03, C0736b c0736b, Set set) {
        Set set2 = Collectors.f21264a;
        C0736b c0736b2 = new C0736b(1);
        this.f21509a = o02;
        this.f21510b = o03;
        this.f21511c = c0736b;
        this.f21512d = c0736b2;
        this.f21513e = set;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.f21510b;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.f21513e;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.f21511c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.f21512d;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.f21509a;
    }
}
