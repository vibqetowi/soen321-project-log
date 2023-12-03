package j$.util.concurrent;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.stream.AbstractC0850z0;
import j$.util.stream.C0807p0;
import j$.util.stream.G;
import j$.util.stream.IntStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/* loaded from: classes3.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* renamed from: a  reason: collision with root package name */
    long f21137a;

    /* renamed from: b  reason: collision with root package name */
    int f21138b;

    /* renamed from: c  reason: collision with root package name */
    boolean f21139c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal f21134d = new ThreadLocal();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicInteger f21135e = new AtomicInteger();
    private static final ThreadLocal f = new v();

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLong f21136g = new AtomicLong(h(System.currentTimeMillis()) ^ h(System.nanoTime()));

    static {
        if (((Boolean) AccessController.doPrivileged(new w())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j10 = seed[0] & 255;
            for (int i6 = 1; i6 < 8; i6++) {
                j10 = (j10 << 8) | (seed[i6] & 255);
            }
            f21136g.set(j10);
        }
    }

    private ThreadLocalRandom() {
        this.f21139c = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ThreadLocalRandom(int i6) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int a(int i6) {
        int i10 = i6 ^ (i6 << 13);
        int i11 = i10 ^ (i10 >>> 17);
        int i12 = i11 ^ (i11 << 5);
        ((ThreadLocalRandom) f.get()).f21138b = i12;
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int b() {
        return ((ThreadLocalRandom) f.get()).f21138b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        if (threadLocalRandom.f21138b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void f() {
        int addAndGet = f21135e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h10 = h(f21136g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f.get();
        threadLocalRandom.f21137a = h10;
        threadLocalRandom.f21138b = addAndGet;
    }

    private static int g(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        return (int) (((j11 ^ (j11 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * (-49064778989728563L);
        long j12 = (j11 ^ (j11 >>> 33)) * (-4265267296055464877L);
        return j12 ^ (j12 >>> 33);
    }

    private Object readResolve() {
        return current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.f21137a);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final double c(double d10, double d11) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d10 < d11) {
            double d12 = ((d11 - d10) * nextLong) + d10;
            return d12 >= d11 ? Double.longBitsToDouble(Double.doubleToLongBits(d11) - 1) : d12;
        }
        return nextLong;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(int i6, int i10) {
        int i11;
        int g5 = g(i());
        if (i6 < i10) {
            int i12 = i10 - i6;
            int i13 = i12 - 1;
            if ((i12 & i13) == 0) {
                i11 = g5 & i13;
            } else if (i12 > 0) {
                int i14 = g5 >>> 1;
                while (true) {
                    int i15 = i14 + i13;
                    i11 = i14 % i12;
                    if (i15 - i11 >= 0) {
                        break;
                    }
                    i14 = g(i()) >>> 1;
                }
            } else {
                while (true) {
                    if (g5 >= i6 && g5 < i10) {
                        return g5;
                    }
                    g5 = g(i());
                }
            }
            return i11 + i6;
        }
        return g5;
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return G.k(AbstractC0850z0.i0(new x(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d10, double d11) {
        if (d10 < d11) {
            return G.k(AbstractC0850z0.i0(new x(0L, Long.MAX_VALUE, d10, d11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j10) {
        if (j10 >= 0) {
            return G.k(AbstractC0850z0.i0(new x(0L, j10, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j10, double d10, double d11) {
        if (j10 >= 0) {
            if (d10 < d11) {
                return G.k(AbstractC0850z0.i0(new x(0L, j10, d10, d11)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long e(long j10, long j11) {
        long j12;
        long h10 = h(i());
        if (j10 < j11) {
            long j13 = j11 - j10;
            long j14 = j13 - 1;
            if ((j13 & j14) == 0) {
                j12 = h10 & j14;
            } else if (j13 > 0) {
                while (true) {
                    long j15 = h10 >>> 1;
                    long j16 = j15 + j14;
                    j12 = j15 % j13;
                    if (j16 - j12 >= 0) {
                        break;
                    }
                    h10 = h(i());
                }
            } else {
                while (true) {
                    if (h10 >= j10 && h10 < j11) {
                        return h10;
                    }
                    h10 = h(i());
                }
            }
            return j12 + j10;
        }
        return h10;
    }

    final long i() {
        long j10 = this.f21137a - 7046029254386353131L;
        this.f21137a = j10;
        return j10;
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return IntStream.Wrapper.convert(AbstractC0850z0.u0(new y(0L, Long.MAX_VALUE, SubsamplingScaleImageView.TILE_SIZE_AUTO, 0)));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i6, int i10) {
        if (i6 < i10) {
            return IntStream.Wrapper.convert(AbstractC0850z0.u0(new y(0L, Long.MAX_VALUE, i6, i10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j10) {
        if (j10 >= 0) {
            return IntStream.Wrapper.convert(AbstractC0850z0.u0(new y(0L, j10, SubsamplingScaleImageView.TILE_SIZE_AUTO, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j10, int i6, int i10) {
        if (j10 >= 0) {
            if (i6 < i10) {
                return IntStream.Wrapper.convert(AbstractC0850z0.u0(new y(0L, j10, i6, i10)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C0807p0.k(AbstractC0850z0.w0(new z(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j10) {
        if (j10 >= 0) {
            return C0807p0.k(AbstractC0850z0.w0(new z(0L, j10, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j10, long j11) {
        if (j10 < j11) {
            return C0807p0.k(AbstractC0850z0.w0(new z(0L, Long.MAX_VALUE, j10, j11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j10, long j11, long j12) {
        if (j10 >= 0) {
            if (j11 < j12) {
                return C0807p0.k(AbstractC0850z0.w0(new z(0L, j10, j11, j12)));
            }
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    protected final int next(int i6) {
        return nextInt() >>> (32 - i6);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f21134d;
        Double d10 = (Double) threadLocal.get();
        if (d10 != null) {
            threadLocal.set(null);
            return d10.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d11 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d11 < 1.0d && d11 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d11) * (-2.0d)) / d11);
                threadLocal.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public final int nextInt(int i6) {
        if (i6 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int g5 = g(i());
        int i10 = i6 - 1;
        if ((i6 & i10) == 0) {
            return g5 & i10;
        }
        while (true) {
            int i11 = g5 >>> 1;
            int i12 = i11 + i10;
            int i13 = i11 % i6;
            if (i12 - i13 >= 0) {
                return i13;
            }
            g5 = g(i());
        }
    }

    public int nextInt(int i6, int i10) {
        if (i6 < i10) {
            return d(i6, i10);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final long nextLong() {
        return h(i());
    }

    @Override // java.util.Random
    public final void setSeed(long j10) {
        if (this.f21139c) {
            throw new UnsupportedOperationException();
        }
    }
}
