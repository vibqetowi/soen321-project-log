package kotlinx.coroutines;

import ls.f;
/* compiled from: CoroutineContext.kt */
/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.k implements ss.p<Boolean, f.b, Boolean> {

    /* renamed from: u  reason: collision with root package name */
    public static final z f23719u = new z();

    public z() {
        super(2);
    }

    @Override // ss.p
    public final Boolean invoke(Boolean bool, f.b bVar) {
        boolean z10;
        f.b bVar2 = bVar;
        if (!bool.booleanValue() && !(bVar2 instanceof x)) {
            z10 = false;
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
