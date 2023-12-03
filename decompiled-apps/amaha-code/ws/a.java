package ws;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import kotlin.jvm.internal.i;
/* compiled from: PlatformThreadLocalRandom.kt */
/* loaded from: classes2.dex */
public final class a extends vs.a {
    @Override // vs.c
    public final int d(int i6, int i10) {
        return ThreadLocalRandom.current().nextInt(i6, i10);
    }

    @Override // vs.a
    public final Random e() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.f(current, "current()");
        return current;
    }
}
