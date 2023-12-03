package p5;

import com.theinnerhour.b2b.utils.Constants;
import kotlin.jvm.internal.i;
import r5.c;
/* compiled from: IntegrityManager.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f27903a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f27904b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f27905c;

    public final boolean a(String str) {
        String str2;
        if (b6.a.b(this)) {
            return false;
        }
        try {
            String str3 = null;
            if (!b6.a.b(this)) {
                float[] fArr = new float[30];
                for (int i6 = 0; i6 < 30; i6++) {
                    fArr[i6] = 0.0f;
                }
                c cVar = c.f30467a;
                String[] f = c.f(c.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
                if (f != null && (str2 = f[0]) != null) {
                    str3 = str2;
                }
                str3 = Constants.SUBSCRIPTION_NONE;
            }
            return !i.b(Constants.SUBSCRIPTION_NONE, str3);
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return false;
        }
    }
}
