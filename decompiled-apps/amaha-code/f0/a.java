package f0;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
/* compiled from: ActivityCompat.java */
/* loaded from: classes.dex */
public final class a extends g0.a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f14598c = 0;

    /* compiled from: ActivityCompat.java */
    /* renamed from: f0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0226a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String[] f14599u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Activity f14600v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f14601w;

        public RunnableC0226a(Activity activity, String[] strArr, int i6) {
            this.f14599u = strArr;
            this.f14600v = activity;
            this.f14601w = i6;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] strArr = this.f14599u;
            int[] iArr = new int[strArr.length];
            Activity activity = this.f14600v;
            PackageManager packageManager = activity.getPackageManager();
            String packageName = activity.getPackageName();
            int length = strArr.length;
            for (int i6 = 0; i6 < length; i6++) {
                iArr[i6] = packageManager.checkPermission(strArr[i6], packageName);
            }
            ((f) activity).onRequestPermissionsResult(this.f14601w, strArr, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static void a(Activity activity) {
            activity.finishAffinity();
        }

        public static void b(Activity activity, Intent intent, int i6, Bundle bundle) {
            activity.startActivityForResult(intent, i6, bundle);
        }

        public static void c(Activity activity, IntentSender intentSender, int i6, Intent intent, int i10, int i11, int i12, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i6, intent, i10, i11, i12, bundle);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        public static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        public static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i6) {
            activity.requestPermissions(strArr, i6);
        }

        public static boolean c(Activity activity, String str) {
            boolean shouldShowRequestPermissionRationale;
            shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
            return shouldShowRequestPermissionRationale;
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public static <T> T a(Activity activity, int i6) {
            View requireViewById;
            requireViewById = activity.requireViewById(i6);
            return (T) requireViewById;
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface f {
        void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface g {
        void validateRequestPermissionsRequestCode(int i6);
    }

    public static void e(Activity activity, String[] strArr, int i6) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (!TextUtils.isEmpty(strArr[i10])) {
                if (!o0.a.a() && TextUtils.equals(strArr[i10], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i10));
                }
            } else {
                throw new IllegalArgumentException(r1.b0.b(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < strArr.length; i12++) {
                if (!hashSet.contains(Integer.valueOf(i12))) {
                    strArr2[i11] = strArr[i12];
                    i11++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof g) {
                ((g) activity).validateRequestPermissionsRequestCode(i6);
            }
            d.b(activity, strArr, i6);
        } else if (activity instanceof f) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0226a(activity, strArr2, i6));
        }
    }

    public static boolean f(Activity activity, String str) {
        if ((!o0.a.a() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) || Build.VERSION.SDK_INT < 23) {
            return false;
        }
        return d.c(activity, str);
    }
}
