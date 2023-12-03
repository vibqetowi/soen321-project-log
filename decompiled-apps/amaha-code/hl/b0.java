package hl;

import com.theinnerhour.b2b.utils.LogHelper;
import java.util.TimerTask;
/* compiled from: NotV4DashboardFragment.kt */
/* loaded from: classes2.dex */
public final class b0 extends TimerTask {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ s f17658u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ s f17659v;

    public b0(s sVar, s sVar2) {
        this.f17658u = sVar;
        this.f17659v = sVar2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        il.d dVar;
        s sVar = this.f17659v;
        try {
            if (this.f17658u.isAdded() && (dVar = sVar.A) != null) {
                dVar.T();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(sVar.f17733u, e10);
        }
    }
}
