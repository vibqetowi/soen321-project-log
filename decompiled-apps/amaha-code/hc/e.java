package hc;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class e extends ic.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat("AppUpdateListenerRegistry");
        new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
    }
}
