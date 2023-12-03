package mc;
/* compiled from: com.google.android.play:integrity@@1.0.1 */
/* loaded from: classes.dex */
public abstract class h implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final ya.i f25016u;

    public h() {
        this.f25016u = null;
    }

    public void a(Exception exc) {
        ya.i iVar = this.f25016u;
        if (iVar != null) {
            iVar.c(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public h(ya.i iVar) {
        this.f25016u = iVar;
    }
}
