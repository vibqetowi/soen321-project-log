package bn;

import com.theinnerhour.b2b.utils.LogHelper;
import java.util.Timer;
import java.util.TimerTask;
/* compiled from: LibraryHomeFragmentCoachMarkUtil.kt */
/* loaded from: classes2.dex */
public final class f extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f4555u;

    public f(c cVar) {
        this.f4555u = cVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        c cVar = this.f4555u;
        try {
            if (cVar.k()) {
                cVar.f();
                return;
            }
            Timer timer = cVar.f4546k;
            if (timer != null) {
                timer.cancel();
            }
            Timer timer2 = cVar.f4546k;
            if (timer2 != null) {
                timer2.purge();
            }
            cVar.f4546k = null;
            cVar.f4543h = true;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(cVar.f4540d, e10);
        }
    }
}
