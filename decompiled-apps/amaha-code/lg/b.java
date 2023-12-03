package lg;

import android.os.Process;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ExceptionHandler.java */
/* loaded from: classes.dex */
public final class b implements Thread.UncaughtExceptionHandler {

    /* renamed from: b  reason: collision with root package name */
    public static b f24285b;

    /* renamed from: a  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f24286a = Thread.getDefaultUncaughtExceptionHandler();

    public b() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static void a() {
        if (f24285b == null) {
            synchronized (b.class) {
                if (f24285b == null) {
                    f24285b = new b();
                }
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        HashMap hashMap = f.f24318k;
        synchronized (hashMap) {
            for (Map map : hashMap.values()) {
                for (f fVar : map.values()) {
                    if (fVar.f24324d.booleanValue()) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("$ae_crashed_reason", th2.toString());
                            fVar.m("$ae_crashed", jSONObject, true);
                        } catch (JSONException unused) {
                        }
                    }
                }
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f24286a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
            return;
        }
        try {
            Thread.sleep(400L);
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        Process.killProcess(Process.myPid());
        System.exit(10);
    }
}
