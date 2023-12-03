package bn;

import com.theinnerhour.b2b.utils.LogHelper;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: LibraryHomeFragmentCoachMarkUtil.kt */
/* loaded from: classes2.dex */
public final class e extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f4554u;

    public e(c cVar) {
        this.f4554u = cVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        c cVar = this.f4554u;
        try {
            if (cVar.j()) {
                cVar.e();
                return;
            }
            Timer timer = cVar.f4547l;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = cVar.f4547l;
            if (timer2 != null) {
                timer2.purge();
            }
            cVar.f4547l = null;
            cVar.f4544i = true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(cVar.f4540d, e10);
        }
    }
}
