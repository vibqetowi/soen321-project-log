package m5;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.i;
/* compiled from: UnityReflection.kt */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f24850a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final String f24851b = e.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f24852c;

    public static final void a(String str, String str2) {
        try {
            if (f24852c == null) {
                f24850a.getClass();
                f24852c = Class.forName("com.unity3d.player.UnityPlayer");
            }
            Class<?> cls = f24852c;
            if (cls != null) {
                Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
                Class<?> cls2 = f24852c;
                if (cls2 != null) {
                    method.invoke(cls2, "UnityFacebookSDKPlugin", str, str2);
                    return;
                } else {
                    i.q("unityPlayer");
                    throw null;
                }
            }
            i.q("unityPlayer");
            throw null;
        } catch (Exception e10) {
            Log.e(f24851b, "Failed to send message to Unity", e10);
        }
    }
}
