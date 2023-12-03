package j$.time;

import j$.time.AbstractC0689a;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
/* renamed from: j$.time.a */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0689a {
    public static j$.util.concurrent.u a(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new j$.util.concurrent.u(1, biConsumer, biConsumer2);
    }

    public static j$.util.concurrent.u b(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new j$.util.concurrent.u(biFunction, function);
    }

    public static j$.util.concurrent.u c(Consumer consumer, Consumer consumer2) {
        Objects.requireNonNull(consumer2);
        return new j$.util.concurrent.u(3, consumer, consumer2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static j$.util.function.b d(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d10) {
                AbstractC0689a.h(DoubleConsumer.this, doubleConsumer2, d10);
            }

            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return AbstractC0689a.d(this, doubleConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.d] */
    public static j$.util.function.d e(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        Objects.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: j$.util.function.d
            @Override // java.util.function.IntConsumer
            public final void accept(int i6) {
                IntConsumer.this.accept(i6);
                intConsumer2.accept(i6);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return AbstractC0689a.e(this, intConsumer3);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    public static j$.util.function.e f(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.e
            @Override // java.util.function.LongConsumer
            public final void accept(long j10) {
                LongConsumer.this.accept(j10);
                longConsumer2.accept(j10);
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return AbstractC0689a.f(this, longConsumer3);
            }
        };
    }

    public static /* synthetic */ void h(DoubleConsumer doubleConsumer, DoubleConsumer doubleConsumer2, double d10) {
        doubleConsumer.accept(d10);
        doubleConsumer2.accept(d10);
    }

    public static /* synthetic */ int i(long j10) {
        int i6 = (int) j10;
        if (j10 == i6) {
            return i6;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long j(long j10, long j11) {
        long j12 = j10 + j11;
        if (((j11 ^ j10) < 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry k(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    public static /* synthetic */ List l(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ long m(long j10, long j11) {
        long j12 = j10 % j11;
        if (j12 == 0) {
            return 0L;
        }
        return (((j10 ^ j11) >> 63) | 1) > 0 ? j12 : j12 + j11;
    }

    public static /* synthetic */ long n(long j10, long j11) {
        long j12 = j10 / j11;
        return (j10 - (j11 * j12) != 0 && (((j10 ^ j11) >> 63) | 1) < 0) ? j12 - 1 : j12;
    }

    public static /* synthetic */ long o(long j10, long j11) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j11) + Long.numberOfLeadingZeros(j11) + Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10);
        if (numberOfLeadingZeros > 65) {
            return j10 * j11;
        }
        if (numberOfLeadingZeros >= 64) {
            int i6 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if ((i6 >= 0) | (j11 != Long.MIN_VALUE)) {
                long j12 = j10 * j11;
                if (i6 == 0 || j12 / j10 == j11) {
                    return j12;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long p(long j10, long j11) {
        long j12 = j10 - j11;
        if (((j11 ^ j10) >= 0) || ((j10 ^ j12) >= 0)) {
            return j12;
        }
        throw new ArithmeticException();
    }
}
