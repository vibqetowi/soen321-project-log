package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.C0721i;
import j$.util.C0722j;
import j$.util.C0723k;
import j$.util.C0725m;
import j$.util.C0726n;
import j$.util.C0727o;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
/* loaded from: classes3.dex */
public final /* synthetic */ class O0 implements BinaryOperator, LongFunction, IntFunction, Consumer, Supplier, BiConsumer, DoubleBinaryOperator, DoubleFunction, ObjDoubleConsumer, Predicate, IntBinaryOperator, ObjIntConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21348a;

    public /* synthetic */ O0(int i6) {
        this.f21348a = i6;
    }

    public final /* synthetic */ BiConsumer a(BiConsumer biConsumer) {
        switch (this.f21348a) {
            case 14:
                return AbstractC0689a.a(this, biConsumer);
            case 15:
            default:
                return AbstractC0689a.a(this, biConsumer);
            case 16:
                return AbstractC0689a.a(this, biConsumer);
            case 17:
                return AbstractC0689a.a(this, biConsumer);
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
    }

    @Override // java.util.function.ObjDoubleConsumer
    public final void accept(Object obj, double d10) {
        ((C0721i) obj).accept(d10);
    }

    @Override // java.util.function.ObjIntConsumer
    public final void accept(Object obj, int i6) {
        ((C0722j) obj).accept(i6);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f21348a) {
            case 14:
                ((List) obj).add(obj2);
                return;
            case 15:
            default:
                ((C0721i) obj).a((C0721i) obj2);
                return;
            case 16:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 17:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
        }
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f21348a) {
            case 23:
                return Objects.requireNonNull(predicate);
            case 24:
                return Objects.requireNonNull(predicate);
            case 25:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // java.util.function.DoubleFunction
    public final Object apply(double d10) {
        return Double.valueOf(d10);
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i6) {
        switch (this.f21348a) {
            case 4:
                return new Object[i6];
            case 5:
                return new Integer[i6];
            case 6:
                return new Long[i6];
            default:
                return new Double[i6];
        }
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j10) {
        return AbstractC0850z0.v0(j10);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f21348a) {
            case 0:
                return new S0((F0) obj, (F0) obj2);
            case 1:
            default:
                return new V0((I0) obj, (I0) obj2);
            case 2:
                return new T0((G0) obj, (G0) obj2);
        }
    }

    @Override // java.util.function.IntBinaryOperator
    public final int applyAsInt(int i6, int i10) {
        switch (this.f21348a) {
            case 27:
                return Math.min(i6, i10);
            default:
                return i6 + i10;
        }
    }

    public final /* synthetic */ BiFunction b(Function function) {
        switch (this.f21348a) {
            case 0:
                return AbstractC0689a.b(this, function);
            case 1:
            default:
                return AbstractC0689a.b(this, function);
            case 2:
                return AbstractC0689a.b(this, function);
        }
    }

    public final /* synthetic */ Consumer f(Consumer consumer) {
        switch (this.f21348a) {
            case 8:
                return AbstractC0689a.c(this, consumer);
            default:
                return AbstractC0689a.c(this, consumer);
        }
    }

    public final double g(double d10, double d11) {
        switch (this.f21348a) {
            case 18:
                return Math.min(d10, d11);
            default:
                return Math.max(d10, d11);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f21348a) {
            case 10:
                return new C0721i();
            case 11:
                return new C0722j();
            case 12:
                return new C0723k();
            case 13:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.f21348a) {
            case 23:
                return Predicate$CC.$default$negate(this);
            case 24:
                return Predicate$CC.$default$negate(this);
            case 25:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f21348a) {
            case 23:
                return Objects.requireNonNull(predicate);
            case 24:
                return Objects.requireNonNull(predicate);
            case 25:
                return Objects.requireNonNull(predicate);
            default:
                return Objects.requireNonNull(predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f21348a) {
            case 23:
                return ((C0725m) obj).c();
            case 24:
                return ((C0726n) obj).c();
            case 25:
                return ((C0727o) obj).c();
            default:
                return ((Optional) obj).c();
        }
    }
}
