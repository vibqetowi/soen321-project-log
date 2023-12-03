package vs;

import java.util.Random;
/* compiled from: PlatformRandom.kt */
/* loaded from: classes2.dex */
public abstract class a extends c {
    @Override // vs.c
    public final int a(int i6) {
        return ((-i6) >> 31) & (e().nextInt() >>> (32 - i6));
    }

    @Override // vs.c
    public final int b() {
        return e().nextInt();
    }

    @Override // vs.c
    public final int c(int i6) {
        return e().nextInt(i6);
    }

    public abstract Random e();
}
