package com.facebook.appevents.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
/* compiled from: AppEventUtility.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0006H\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/internal/AppEventUtility;", "", "()V", "PRICE_REGEX", "", "isMainThread", "", "()Z", "assertIsMainThread", "", "assertIsNotMainThread", "bytesToHex", "bytes", "", "getAppVersion", "getRootView", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "isEmulator", "normalizePrice", "", "value", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventUtility {
    public static final AppEventUtility INSTANCE = new AppEventUtility();
    private static final String PRICE_REGEX = "[-+]*\\d+([.,]\\d+)*([.,]\\d+)?";

    @JvmStatic
    public static final void assertIsMainThread() {
    }

    @JvmStatic
    public static final void assertIsNotMainThread() {
    }

    private AppEventUtility() {
    }

    @JvmStatic
    public static final double normalizePrice(String str) {
        try {
            Matcher matcher = Pattern.compile(PRICE_REGEX, 8).matcher(str);
            if (matcher.find()) {
                String group = matcher.group(0);
                Utility utility = Utility.INSTANCE;
                return NumberFormat.getNumberInstance(Utility.getCurrentLocale()).parse(group).doubleValue();
            }
            return 0.0d;
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    @JvmStatic
    public static final String bytesToHex(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            byte b = bytes[i];
            i++;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            stringBuffer.append(format);
        }
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
        if (kotlin.text.StringsKt.startsWith$default(r0, "generic", false, 2, (java.lang.Object) null) == false) goto L17;
     */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean isEmulator() {
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        if (!StringsKt.startsWith$default(FINGERPRINT, "generic", false, 2, (Object) null)) {
            String FINGERPRINT2 = Build.FINGERPRINT;
            Intrinsics.checkNotNullExpressionValue(FINGERPRINT2, "FINGERPRINT");
            if (!StringsKt.startsWith$default(FINGERPRINT2, "unknown", false, 2, (Object) null)) {
                String MODEL = Build.MODEL;
                Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
                if (!StringsKt.contains$default((CharSequence) MODEL, (CharSequence) "google_sdk", false, 2, (Object) null)) {
                    String MODEL2 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(MODEL2, "MODEL");
                    if (!StringsKt.contains$default((CharSequence) MODEL2, (CharSequence) "Emulator", false, 2, (Object) null)) {
                        String MODEL3 = Build.MODEL;
                        Intrinsics.checkNotNullExpressionValue(MODEL3, "MODEL");
                        if (!StringsKt.contains$default((CharSequence) MODEL3, (CharSequence) "Android SDK built for x86", false, 2, (Object) null)) {
                            String MANUFACTURER = Build.MANUFACTURER;
                            Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
                            if (!StringsKt.contains$default((CharSequence) MANUFACTURER, (CharSequence) "Genymotion", false, 2, (Object) null)) {
                                String BRAND = Build.BRAND;
                                Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
                                if (StringsKt.startsWith$default(BRAND, "generic", false, 2, (Object) null)) {
                                    String DEVICE = Build.DEVICE;
                                    Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
                                }
                                if (!Intrinsics.areEqual("google_sdk", Build.PRODUCT)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @JvmStatic
    private static final boolean isMainThread() {
        return Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper());
    }

    @JvmStatic
    public static final String getAppVersion() {
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        Context applicationContext = FacebookSdk.getApplicationContext();
        try {
            String str = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    @JvmStatic
    public static final View getRootView(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(AppEventUtility.class) || activity == null) {
            return null;
        }
        try {
            try {
                Window window = activity.getWindow();
                if (window == null) {
                    return null;
                }
                return window.getDecorView().getRootView();
            } catch (Exception unused) {
                View view = null;
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppEventUtility.class);
            return null;
        }
    }
}
