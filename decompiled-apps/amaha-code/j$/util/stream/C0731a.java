package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.C0719g;
import j$.util.Objects;
import j$.util.stream.IntStream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
/* renamed from: j$.util.stream.a  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0731a implements Supplier, Consumer, DoubleFunction, Function, LongFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21417a;

    /* renamed from: b  reason: collision with root package name */
    public Object f21418b;

    public /* synthetic */ C0731a(Object obj, int i6) {
        this.f21417a = i6;
        this.f21418b = obj;
    }

    public final /* synthetic */ Consumer a(Consumer consumer) {
        switch (this.f21417a) {
            case 2:
                return AbstractC0689a.c(this, consumer);
            default:
                return AbstractC0689a.c(this, consumer);
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f21417a) {
            case 2:
                ((InterfaceC0818r2) this.f21418b).accept((InterfaceC0818r2) obj);
                return;
            default:
                ((List) this.f21418b).add(obj);
                return;
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // java.util.function.DoubleFunction
    public final Object apply(double d10) {
        Object apply = ((DoubleFunction) this.f21418b).apply(d10);
        if (apply == null) {
            return null;
        }
        if (apply instanceof H) {
            return G.k((H) apply);
        }
        if (apply instanceof DoubleStream) {
            return F.k((DoubleStream) apply);
        }
        C0719g.a(apply.getClass(), "java.util.stream.DoubleStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j10) {
        Object apply = ((LongFunction) this.f21418b).apply(j10);
        if (apply == null) {
            return null;
        }
        if (apply instanceof InterfaceC0812q0) {
            return C0807p0.k((InterfaceC0812q0) apply);
        }
        if (apply instanceof LongStream) {
            return C0802o0.k((LongStream) apply);
        }
        C0719g.a(apply.getClass(), "java.util.stream.LongStream");
        throw null;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object apply = ((Function) this.f21418b).apply(obj);
        if (apply == null) {
            return null;
        }
        if (apply instanceof Stream) {
            return C0750d3.k((Stream) apply);
        }
        if (apply instanceof java.util.stream.Stream) {
            return C0745c3.k((java.util.stream.Stream) apply);
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        if (apply instanceof H) {
            return G.k((H) apply);
        }
        if (apply instanceof DoubleStream) {
            return F.k((DoubleStream) apply);
        }
        if (apply instanceof InterfaceC0812q0) {
            return C0807p0.k((InterfaceC0812q0) apply);
        }
        if (apply instanceof LongStream) {
            return C0802o0.k((LongStream) apply);
        }
        C0719g.a(apply.getClass(), "java.util.stream.*Stream");
        throw null;
    }

    public final boolean b() {
        switch (this.f21417a) {
            case 3:
                C0819r3 c0819r3 = (C0819r3) this.f21418b;
                return c0819r3.f21491d.tryAdvance(c0819r3.f21492e);
            case 4:
                t3 t3Var = (t3) this.f21418b;
                return t3Var.f21491d.tryAdvance(t3Var.f21492e);
            case 5:
                v3 v3Var = (v3) this.f21418b;
                return v3Var.f21491d.tryAdvance(v3Var.f21492e);
            default:
                N3 n32 = (N3) this.f21418b;
                return n32.f21491d.tryAdvance(n32.f21492e);
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f21417a) {
            case 0:
                return (j$.util.S) this.f21418b;
            default:
                return ((AbstractC0741c) this.f21418b).S0();
        }
    }
}
