package w2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.work.q;
import com.theinnerhour.b2b.utils.Constants;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProcessUtils.kt */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final String f36307a;

    static {
        String f = androidx.work.q.f("ProcessUtils");
        kotlin.jvm.internal.i.f(f, "tagWithPrefix(\"ProcessUtils\")");
        f36307a = f;
    }

    public static final boolean a(Context context, androidx.work.b configuration) {
        String str;
        Object obj;
        boolean z10;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            str = a.f36283a.a();
        } else {
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, androidx.work.v.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                kotlin.jvm.internal.i.d(invoke);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th2) {
                if (((q.a) androidx.work.q.d()).f3335c <= 3) {
                    Log.d(f36307a, "Unable to check ActivityThread for processName", th2);
                }
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService(Constants.SCREEN_ACTIVITY);
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                            z10 = true;
                            continue;
                        } else {
                            z10 = false;
                            continue;
                        }
                        if (z10) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
            str = null;
        }
        return kotlin.jvm.internal.i.b(str, context.getApplicationInfo().processName);
    }
}
