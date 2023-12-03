package q5;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.theinnerhour.b2b.utils.Constants;
import gv.n;
import gv.r;
import java.util.Arrays;
/* compiled from: AppEventUtility.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f29148a = 0;

    static {
        new d();
    }

    public static final String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            byte b10 = bArr[i6];
            i6++;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            kotlin.jvm.internal.i.f(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.i.f(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    public static final View b(Activity activity) {
        if (b6.a.b(d.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            b6.a.a(d.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (gv.n.H0(r0, com.theinnerhour.b2b.utils.Constants.COURSE_GENERIC) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean c() {
        String FINGERPRINT = Build.FINGERPRINT;
        kotlin.jvm.internal.i.f(FINGERPRINT, "FINGERPRINT");
        if (!n.H0(FINGERPRINT, Constants.COURSE_GENERIC) && !n.H0(FINGERPRINT, "unknown")) {
            String MODEL = Build.MODEL;
            kotlin.jvm.internal.i.f(MODEL, "MODEL");
            if (!r.J0(MODEL, "google_sdk") && !r.J0(MODEL, "Emulator") && !r.J0(MODEL, "Android SDK built for x86")) {
                String MANUFACTURER = Build.MANUFACTURER;
                kotlin.jvm.internal.i.f(MANUFACTURER, "MANUFACTURER");
                if (!r.J0(MANUFACTURER, "Genymotion")) {
                    String BRAND = Build.BRAND;
                    kotlin.jvm.internal.i.f(BRAND, "BRAND");
                    if (n.H0(BRAND, Constants.COURSE_GENERIC)) {
                        String DEVICE = Build.DEVICE;
                        kotlin.jvm.internal.i.f(DEVICE, "DEVICE");
                    }
                    if (!kotlin.jvm.internal.i.b("google_sdk", Build.PRODUCT)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
