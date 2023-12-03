package kf;

import java.util.concurrent.TimeUnit;
/* compiled from: Rate.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final long f23317a;

    /* renamed from: b  reason: collision with root package name */
    public final long f23318b;

    /* renamed from: c  reason: collision with root package name */
    public final TimeUnit f23319c;

    /* compiled from: Rate.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f23320a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f23320a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23320a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23320a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(long j10, long j11, TimeUnit timeUnit) {
        this.f23317a = j10;
        this.f23318b = j11;
        this.f23319c = timeUnit;
    }
}
