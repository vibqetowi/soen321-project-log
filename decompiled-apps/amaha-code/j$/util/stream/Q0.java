package j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class Q0 extends AbstractC0756f {

    /* renamed from: h  reason: collision with root package name */
    protected final AbstractC0850z0 f21363h;

    /* renamed from: i  reason: collision with root package name */
    protected final LongFunction f21364i;

    /* renamed from: j  reason: collision with root package name */
    protected final BinaryOperator f21365j;

    Q0(Q0 q02, j$.util.S s10) {
        super(q02, s10);
        this.f21363h = q02.f21363h;
        this.f21364i = q02.f21364i;
        this.f21365j = q02.f21365j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Q0(AbstractC0850z0 abstractC0850z0, j$.util.S s10, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC0850z0, s10);
        this.f21363h = abstractC0850z0;
        this.f21364i = longFunction;
        this.f21365j = binaryOperator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0756f
    public final Object a() {
        D0 d02 = (D0) this.f21364i.apply(this.f21363h.k0(this.f21453b));
        this.f21363h.I0(this.f21453b, d02);
        return d02.build();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0756f
    public final AbstractC0756f e(j$.util.S s10) {
        return new Q0(this, s10);
    }

    @Override // j$.util.stream.AbstractC0756f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC0756f abstractC0756f = this.f21455d;
        if (!(abstractC0756f == null)) {
            f((I0) this.f21365j.apply((I0) ((Q0) abstractC0756f).c(), (I0) ((Q0) this.f21456e).c()));
        }
        super.onCompletion(countedCompleter);
    }
}
