package j$.util.stream;

import j$.util.C0719g;
import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
/* loaded from: classes3.dex */
public final /* synthetic */ class P0 implements LongFunction, IntFunction {

    /* renamed from: a  reason: collision with root package name */
    public IntFunction f21357a;

    public /* synthetic */ P0(IntFunction intFunction) {
        this.f21357a = intFunction;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i6) {
        Object apply = this.f21357a.apply(i6);
        if (apply == null) {
            return null;
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (apply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) apply);
        }
        C0719g.a(apply.getClass(), "java.util.stream.IntStream");
        throw null;
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j10) {
        IntFunction intFunction = this.f21357a;
        int i6 = N0.f21341k;
        return AbstractC0850z0.Z(j10, intFunction);
    }
}
