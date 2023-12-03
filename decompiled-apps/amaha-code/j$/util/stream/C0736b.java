package j$.util.stream;

import j$.time.AbstractC0689a;
import j$.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
/* renamed from: j$.util.stream.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0736b implements IntFunction, Function, BinaryOperator, ObjDoubleConsumer, BiConsumer, Supplier, ToDoubleFunction, ToIntFunction, ObjIntConsumer, ToLongFunction, ObjLongConsumer, LongFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21422a;

    public /* synthetic */ C0736b(int i6) {
        this.f21422a = i6;
    }

    public final /* synthetic */ BiConsumer a(BiConsumer biConsumer) {
        switch (this.f21422a) {
            case 5:
                return AbstractC0689a.a(this, biConsumer);
            case 8:
                return AbstractC0689a.a(this, biConsumer);
            case 19:
                return AbstractC0689a.a(this, biConsumer);
            default:
                return AbstractC0689a.a(this, biConsumer);
        }
    }

    @Override // java.util.function.ObjDoubleConsumer
    public final void accept(Object obj, double d10) {
        switch (this.f21422a) {
            case 4:
                double[] dArr = (double[]) obj;
                Collectors.a(dArr, d10);
                dArr[2] = dArr[2] + d10;
                return;
            default:
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                Collectors.a(dArr2, d10);
                dArr2[3] = dArr2[3] + d10;
                return;
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public final void accept(Object obj, int i6) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + i6;
    }

    @Override // java.util.function.ObjLongConsumer
    public final void accept(Object obj, long j10) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j10;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f21422a) {
            case 5:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case 8:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
            case 19:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            default:
                long[] jArr3 = (long[]) obj;
                long[] jArr4 = (long[]) obj2;
                jArr3[0] = jArr3[0] + jArr4[0];
                jArr3[1] = jArr3[1] + jArr4[1];
                return;
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i6) {
        switch (this.f21422a) {
            case 0:
                return new Object[i6];
            case 3:
                return new Double[i6];
            case 15:
                int i10 = V.f21392h;
                return new Object[i6];
            case 20:
                return new Integer[i6];
            case 22:
                return new Long[i6];
            default:
                return new Object[i6];
        }
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j10) {
        switch (this.f21422a) {
            case 27:
                return AbstractC0850z0.h0(j10);
            default:
                return AbstractC0850z0.t0(j10);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Set set = Collectors.f21264a;
        return obj;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f21422a) {
            case 2:
                List list = (List) obj;
                Set set = Collectors.f21264a;
                list.addAll((List) obj2);
                return list;
            default:
                return new R0((E0) obj, (E0) obj2);
        }
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    public final /* synthetic */ BiFunction b(Function function) {
        switch (this.f21422a) {
            case 2:
                return AbstractC0689a.b(this, function);
            default:
                return AbstractC0689a.b(this, function);
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f21422a) {
            case 6:
                return new double[4];
            case 7:
            case 8:
            case 9:
            case 15:
            case 16:
            default:
                return new long[2];
            case 10:
                return new double[3];
            case 11:
                return new J();
            case 12:
                return new K();
            case 13:
                return new L();
            case 14:
                return new M();
            case 17:
                return new long[2];
        }
    }
}
