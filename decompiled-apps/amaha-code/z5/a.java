package z5;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
/* compiled from: ANRDetector.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f39190a;

    /* renamed from: b  reason: collision with root package name */
    public static final ScheduledExecutorService f39191b;

    /* renamed from: c  reason: collision with root package name */
    public static String f39192c;

    /* renamed from: d  reason: collision with root package name */
    public static final i5.b f39193d;

    static {
        new a();
        f39190a = Process.myUid();
        f39191b = Executors.newSingleThreadScheduledExecutor();
        f39192c = "";
        f39193d = new i5.b(15);
    }

    public static final void a(ActivityManager activityManager) {
        if (b6.a.b(a.class)) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f39190a) {
                        Thread thread = Looper.getMainLooper().getThread();
                        i.f(thread, "getMainLooper().thread");
                        StackTraceElement[] stackTrace = thread.getStackTrace();
                        JSONArray jSONArray = new JSONArray();
                        i.f(stackTrace, "stackTrace");
                        int length = stackTrace.length;
                        int i6 = 0;
                        while (i6 < length) {
                            StackTraceElement stackTraceElement = stackTrace[i6];
                            i6++;
                            jSONArray.put(stackTraceElement.toString());
                        }
                        String jSONArray2 = jSONArray.toString();
                        if (!i.b(jSONArray2, f39192c) && sp.b.L(thread)) {
                            f39192c = jSONArray2;
                            new y5.a(processErrorStateInfo.shortMsg, jSONArray2).c();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            b6.a.a(a.class, th2);
        }
    }
}
