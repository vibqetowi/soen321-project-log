package bn;

import com.theinnerhour.b2b.utils.LogHelper;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: LibraryHomeFragmentCoachMarkUtil.kt */
/* loaded from: classes2.dex */
public final class d extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f4553u;

    public d(c cVar) {
        this.f4553u = cVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        c cVar = this.f4553u;
        try {
            if (cVar.i()) {
                cVar.d();
                return;
            }
            Timer timer = cVar.f4548m;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = cVar.f4548m;
            if (timer2 != null) {
                timer2.purge();
            }
            cVar.f4548m = null;
            cVar.f4545j = true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(cVar.f4540d, e10);
        }
    }
}
