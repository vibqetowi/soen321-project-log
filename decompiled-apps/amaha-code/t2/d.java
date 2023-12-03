package t2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: BroadcastReceiverConstraintTracker.kt */
/* loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e<Object> f32392a;

    public d(e<Object> eVar) {
        this.f32392a = eVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(intent, "intent");
        this.f32392a.g(intent);
    }
}
