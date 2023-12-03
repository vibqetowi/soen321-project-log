package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import androidx.work.q;
import androidx.work.r;
import java.util.Collections;
import n2.a0;
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3295a = q.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        q d10 = q.d();
        String str = f3295a;
        d10.a(str, "Requesting diagnostics");
        try {
            a0 e10 = a0.e(context);
            e10.getClass();
            e10.d(Collections.singletonList(new r.a(DiagnosticsWorker.class).a()));
        } catch (IllegalStateException e11) {
            q.d().c(str, "WorkManager is not initialized", e11);
        }
    }
}
