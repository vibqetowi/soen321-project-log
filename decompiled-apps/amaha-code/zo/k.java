package zo;

import android.animation.ObjectAnimator;
import android.os.Handler;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.Locale;
/* compiled from: RecommendedActivityGifFragment.kt */
/* loaded from: classes2.dex */
public final class k implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i f39745u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Handler f39746v;

    public k(i iVar, Handler handler) {
        this.f39745u = iVar;
        this.f39746v = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f39745u;
        ObjectAnimator objectAnimator = iVar.f39724v;
        if (objectAnimator != null) {
            long j10 = 1000;
            long j11 = 3600;
            long j12 = 60;
            int currentPlayTime = (int) (((objectAnimator.getCurrentPlayTime() / j10) % j11) / j12);
            ObjectAnimator objectAnimator2 = iVar.f39724v;
            if (objectAnimator2 != null) {
                int currentPlayTime2 = (int) ((objectAnimator2.getCurrentPlayTime() / j10) % j12);
                ObjectAnimator objectAnimator3 = iVar.f39724v;
                if (objectAnimator3 != null) {
                    int duration = (int) (((objectAnimator3.getDuration() / j10) % j11) / j12);
                    ObjectAnimator objectAnimator4 = iVar.f39724v;
                    if (objectAnimator4 != null) {
                        int duration2 = (int) ((objectAnimator4.getDuration() / j10) % j12);
                        String format = String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf(currentPlayTime), Integer.valueOf(currentPlayTime2));
                        kotlin.jvm.internal.i.f(format, "format(\n                …ecs\n                    )");
                        String format2 = String.format(Locale.getDefault(), "%02d:%02d", Integer.valueOf(duration), Integer.valueOf(duration2));
                        kotlin.jvm.internal.i.f(format2, "format(\n                …ecs\n                    )");
                        if (iVar.S && iVar.U) {
                            defpackage.c.A(format, '/', format2, (RobertoTextView) iVar._$_findCachedViewById(R.id.tvRAProgress));
                            ObjectAnimator objectAnimator5 = iVar.f39724v;
                            if (objectAnimator5 != null) {
                                iVar.W = String.valueOf((int) ((objectAnimator5.getCurrentPlayTime() / j10) % j12));
                            } else {
                                kotlin.jvm.internal.i.q("progressAnimator");
                                throw null;
                            }
                        }
                        this.f39746v.postDelayed(this, 1000L);
                        return;
                    }
                    kotlin.jvm.internal.i.q("progressAnimator");
                    throw null;
                }
                kotlin.jvm.internal.i.q("progressAnimator");
                throw null;
            }
            kotlin.jvm.internal.i.q("progressAnimator");
            throw null;
        }
        kotlin.jvm.internal.i.q("progressAnimator");
        throw null;
    }
}
