package vs;

import java.util.Random;
import kotlin.jvm.internal.i;
/* compiled from: PlatformRandom.kt */
/* loaded from: classes2.dex */
public final class b extends vs.a {

    /* renamed from: w  reason: collision with root package name */
    public final a f36134w = new a();

    /* compiled from: PlatformRandom.kt */
    /* loaded from: classes2.dex */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // vs.a
    public final Random e() {
        Random random = this.f36134w.get();
        i.f(random, "implStorage.get()");
        return random;
    }
}
