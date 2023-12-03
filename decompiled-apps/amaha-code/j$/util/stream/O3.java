package j$.util.stream;
/* loaded from: classes3.dex */
final class O3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f21354a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f21355b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public O3(Runnable runnable, Runnable runnable2) {
        this.f21354a = runnable;
        this.f21355b = runnable2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f21355b;
        try {
            this.f21354a.run();
            runnable.run();
        } catch (Throwable th2) {
            try {
                runnable.run();
            } catch (Throwable th3) {
                try {
                    th2.addSuppressed(th3);
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }
}
