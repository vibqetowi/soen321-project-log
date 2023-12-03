package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes3.dex */
public final class Collectors {

    /* renamed from: a  reason: collision with root package name */
    static final Set f21264a;

    static {
        EnumC0781k enumC0781k = EnumC0781k.CONCURRENT;
        EnumC0781k enumC0781k2 = EnumC0781k.UNORDERED;
        EnumC0781k enumC0781k3 = EnumC0781k.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC0781k, enumC0781k2, enumC0781k3));
        Collections.unmodifiableSet(EnumSet.of(enumC0781k, enumC0781k2));
        f21264a = Collections.unmodifiableSet(EnumSet.of(enumC0781k3));
        Collections.unmodifiableSet(EnumSet.of(enumC0781k2, enumC0781k3));
        Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(enumC0781k2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(double[] dArr, double d10) {
        double d11 = d10 - dArr[1];
        double d12 = dArr[0];
        double d13 = d12 + d11;
        dArr[1] = (d13 - d12) - d11;
        dArr[0] = d13;
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C0796n(new O0(13), new O0(14), new C0736b(2), f21264a);
    }
}
