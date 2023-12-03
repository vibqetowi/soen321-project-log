package lg;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.b0;
/* compiled from: SystemInformation.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: g  reason: collision with root package name */
    public static l f24366g;

    /* renamed from: h  reason: collision with root package name */
    public static final Object f24367h = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Context f24368a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f24369b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f24370c;

    /* renamed from: d  reason: collision with root package name */
    public final DisplayMetrics f24371d;

    /* renamed from: e  reason: collision with root package name */
    public final String f24372e;
    public final Integer f;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(Context context) {
        String str;
        Integer num;
        int i6;
        Method method;
        Boolean bool;
        Boolean bool2;
        this.f24368a = context;
        PackageManager packageManager = context.getPackageManager();
        Boolean bool3 = null;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            str = packageInfo.versionName;
            try {
                num = Integer.valueOf(packageInfo.versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                b0.u("MixpanelAPI.SysInfo", "System information constructed with a context that apparently doesn't exist.");
                num = null;
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                i6 = applicationInfo.labelRes;
                this.f24372e = str;
                this.f = num;
                if (i6 != 0) {
                }
                method = packageManager.getClass().getMethod("hasSystemFeature", String.class);
                if (method == null) {
                }
                this.f24369b = bool3;
                this.f24370c = bool2;
                DisplayMetrics displayMetrics = new DisplayMetrics();
                this.f24371d = displayMetrics;
                ((WindowManager) this.f24368a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            str = null;
        }
        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
        i6 = applicationInfo2.labelRes;
        this.f24372e = str;
        this.f = num;
        if (i6 != 0) {
            CharSequence charSequence = applicationInfo2.nonLocalizedLabel;
            if (charSequence != null) {
                charSequence.toString();
            }
        } else {
            context.getString(i6);
        }
        try {
            method = packageManager.getClass().getMethod("hasSystemFeature", String.class);
        } catch (NoSuchMethodException unused3) {
            method = null;
        }
        if (method == null) {
            try {
                bool = (Boolean) method.invoke(packageManager, "android.hardware.nfc");
            } catch (IllegalAccessException unused4) {
                bool = null;
            } catch (InvocationTargetException unused5) {
                bool = null;
            }
            try {
                bool2 = (Boolean) method.invoke(packageManager, "android.hardware.telephony");
            } catch (IllegalAccessException unused6) {
                b0.u("MixpanelAPI.SysInfo", "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it.");
                bool2 = null;
                bool3 = bool;
                this.f24369b = bool3;
                this.f24370c = bool2;
                DisplayMetrics displayMetrics2 = new DisplayMetrics();
                this.f24371d = displayMetrics2;
                ((WindowManager) this.f24368a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics2);
            } catch (InvocationTargetException unused7) {
                b0.u("MixpanelAPI.SysInfo", "System version appeared to support PackageManager.hasSystemFeature, but we were unable to call it.");
                bool2 = null;
                bool3 = bool;
                this.f24369b = bool3;
                this.f24370c = bool2;
                DisplayMetrics displayMetrics22 = new DisplayMetrics();
                this.f24371d = displayMetrics22;
                ((WindowManager) this.f24368a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics22);
            }
            bool3 = bool;
        } else {
            bool2 = null;
        }
        this.f24369b = bool3;
        this.f24370c = bool2;
        DisplayMetrics displayMetrics222 = new DisplayMetrics();
        this.f24371d = displayMetrics222;
        ((WindowManager) this.f24368a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics222);
    }
}
