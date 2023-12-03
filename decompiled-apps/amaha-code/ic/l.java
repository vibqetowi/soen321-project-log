package ic;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public abstract class l implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final ya.i f19933u;

    public l() {
        this.f19933u = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            ya.i iVar = this.f19933u;
            if (iVar != null) {
                iVar.c(e10);
            }
        }
    }

    public l(ya.i iVar) {
        this.f19933u = iVar;
    }
}
