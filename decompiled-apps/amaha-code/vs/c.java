package vs;

import java.io.Serializable;
import kotlin.jvm.internal.i;
/* compiled from: Random.kt */
/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: u  reason: collision with root package name */
    public static final a f36135u = new a(0);

    /* renamed from: v  reason: collision with root package name */
    public static final c f36136v = os.b.f27779a.b();

    /* compiled from: Random.kt */
    /* loaded from: classes2.dex */
    public static final class a extends c implements Serializable {

        /* compiled from: Random.kt */
        /* renamed from: vs.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0607a implements Serializable {

            /* renamed from: u  reason: collision with root package name */
            public static final C0607a f36137u = new C0607a();

            private final Object readResolve() {
                return c.f36135u;
            }
        }

        public a(int i6) {
        }

        private final Object writeReplace() {
            return C0607a.f36137u;
        }

        @Override // vs.c
        public final int a(int i6) {
            return c.f36136v.a(i6);
        }

        @Override // vs.c
        public final int b() {
            return c.f36136v.b();
        }

        @Override // vs.c
        public final int c(int i6) {
            return c.f36136v.c(i6);
        }

        @Override // vs.c
        public final int d(int i6, int i10) {
            return c.f36136v.d(i6, i10);
        }
    }

    public abstract int a(int i6);

    public abstract int b();

    public abstract int c(int i6);

    public int d(int i6, int i10) {
        boolean z10;
        int b10;
        int i11;
        int i12;
        int b11;
        boolean z11;
        if (i10 > i6) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int i13 = i10 - i6;
            if (i13 <= 0 && i13 != Integer.MIN_VALUE) {
                do {
                    b11 = b();
                    if (i6 <= b11 && b11 < i10) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                } while (!z11);
                return b11;
            }
            if (((-i13) & i13) == i13) {
                i12 = a(31 - Integer.numberOfLeadingZeros(i13));
            } else {
                do {
                    b10 = b() >>> 1;
                    i11 = b10 % i13;
                } while ((i13 - 1) + (b10 - i11) < 0);
                i12 = i11;
            }
            return i6 + i12;
        }
        Integer from = Integer.valueOf(i6);
        Integer until = Integer.valueOf(i10);
        i.g(from, "from");
        i.g(until, "until");
        throw new IllegalArgumentException(("Random range is empty: [" + from + ", " + until + ").").toString());
    }
}
