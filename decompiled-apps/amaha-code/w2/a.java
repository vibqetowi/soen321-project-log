package w2;

import android.app.Application;
/* compiled from: ProcessUtils.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f36283a = new a();

    public final String a() {
        String processName;
        processName = Application.getProcessName();
        kotlin.jvm.internal.i.f(processName, "getProcessName()");
        return processName;
    }
}
