package hl;

import com.theinnerhour.b2b.utils.LogHelper;
import java.util.TimerTask;
/* compiled from: NotV4DashboardFragment.kt */
/* loaded from: classes2.dex */
public final class t extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f17765u;

    public t(s sVar) {
        this.f17765u = sVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        s sVar = this.f17765u;
        try {
            il.d dVar = sVar.A;
            if (dVar != null) {
                dVar.T();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(sVar.f17733u, e10);
        }
    }
}
