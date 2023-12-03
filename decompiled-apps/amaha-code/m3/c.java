package m3;

import android.util.Log;
import java.util.HashSet;
/* compiled from: Logger.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f24792a = new b();

    public static void a() {
        f24792a.getClass();
    }

    public static void b(String str) {
        f24792a.getClass();
        HashSet hashSet = b.f24791a;
        if (!hashSet.contains(str)) {
            Log.w("LOTTIE", str, null);
            hashSet.add(str);
        }
    }
}
