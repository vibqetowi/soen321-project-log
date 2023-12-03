package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.e0;
/* compiled from: Tasks.kt */
/* loaded from: classes2.dex */
public final class i extends g {

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f23673w;

    public i(Runnable runnable, long j10, h hVar) {
        super(j10, hVar);
        this.f23673w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f23673w.run();
        } finally {
            this.f23672v.a();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f23673w;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(e0.q(runnable));
        sb2.append(", ");
        sb2.append(this.f23671u);
        sb2.append(", ");
        sb2.append(this.f23672v);
        sb2.append(']');
        return sb2.toString();
    }
}
