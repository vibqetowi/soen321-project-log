package o0;
/* compiled from: CancellationSignal.java */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f26886a;

    /* renamed from: b  reason: collision with root package name */
    public a f26887b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26888c;

    /* compiled from: CancellationSignal.java */
    /* loaded from: classes.dex */
    public interface a {
        void onCancel();
    }

    public final void a() {
        synchronized (this) {
            if (this.f26886a) {
                return;
            }
            this.f26886a = true;
            this.f26888c = true;
            a aVar = this.f26887b;
            if (aVar != null) {
                try {
                    aVar.onCancel();
                } catch (Throwable th2) {
                    synchronized (this) {
                        this.f26888c = false;
                        notifyAll();
                        throw th2;
                    }
                }
            }
            synchronized (this) {
                this.f26888c = false;
                notifyAll();
            }
        }
    }

    public final void b(a aVar) {
        synchronized (this) {
            while (this.f26888c) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.f26887b == aVar) {
                return;
            }
            this.f26887b = aVar;
            if (this.f26886a) {
                aVar.onCancel();
            }
        }
    }
}
