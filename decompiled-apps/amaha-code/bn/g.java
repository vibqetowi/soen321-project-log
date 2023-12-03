package bn;

import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.ScrollStateListenerCustomNestedScrollView;
import java.util.Timer;
/* compiled from: LibraryHomeFragmentCoachMarkUtil.kt */
/* loaded from: classes2.dex */
public final class g implements ScrollStateListenerCustomNestedScrollView.OnScrollStoppedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f4556a;

    public g(c cVar) {
        this.f4556a = cVar;
    }

    @Override // com.theinnerhour.b2b.utils.ScrollStateListenerCustomNestedScrollView.OnScrollStoppedListener
    public final void onScrollStopped() {
        c cVar = this.f4556a;
        try {
            if (cVar.f4541e && (cVar.f4549n || cVar.f4543h)) {
                cVar.g();
            }
            if (cVar.f && (cVar.f4549n || cVar.f4544i)) {
                c.b(cVar);
            }
            if (cVar.f4542g) {
                if (cVar.f4549n || cVar.f4545j) {
                    c.a(cVar);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(cVar.f4540d, e10);
        }
    }

    @Override // com.theinnerhour.b2b.utils.ScrollStateListenerCustomNestedScrollView.OnScrollStoppedListener
    public final void onScrollViewInteraction() {
        Timer timer;
        Timer timer2;
        Timer timer3;
        c cVar = this.f4556a;
        try {
            if (!cVar.f4549n) {
                if (!cVar.f4543h && (timer3 = cVar.f4546k) != null) {
                    if (timer3 != null) {
                        timer3.cancel();
                    }
                    Timer timer4 = cVar.f4546k;
                    if (timer4 != null) {
                        timer4.purge();
                    }
                    cVar.f4546k = null;
                    cVar.f4543h = true;
                }
                if (!cVar.f4544i && (timer2 = cVar.f4547l) != null) {
                    if (timer2 != null) {
                        timer2.cancel();
                    }
                    Timer timer5 = cVar.f4547l;
                    if (timer5 != null) {
                        timer5.purge();
                    }
                    cVar.f4547l = null;
                    cVar.f4544i = true;
                }
                if (!cVar.f4545j && (timer = cVar.f4548m) != null) {
                    if (timer != null) {
                        timer.cancel();
                    }
                    Timer timer6 = cVar.f4548m;
                    if (timer6 != null) {
                        timer6.purge();
                    }
                    cVar.f4548m = null;
                    cVar.f4545j = true;
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(cVar.f4540d, e10);
        }
    }
}
