package ya;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ p f38413u;

    public r(p pVar) {
        this.f38413u = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f38413u.f38407c) {
            try {
                Object obj = this.f38413u.f38408d;
                if (((c) obj) != null) {
                    ((c) obj).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
