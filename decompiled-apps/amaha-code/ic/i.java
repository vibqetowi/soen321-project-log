package ic;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: com.google.android.play:app-update@@2.0.1 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f19931a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        f19931a = new HashMap();
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat("PlayCoreVersion");
    }
}
