package s9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.theinnerhour.b2b.R;
import java.util.concurrent.atomic.AtomicBoolean;
import v9.g1;
import v9.o0;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final int f31338a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f31339b;

    static {
        AtomicBoolean atomicBoolean = h.f31341a;
        f31338a = 12451000;
        f31339b = new f();
    }

    public Intent a(Context context, String str, int i6) {
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return null;
            }
            int i10 = g1.f34904a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && aa.d.a(context)) {
            int i11 = g1.f34904a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder sb2 = new StringBuilder("gcore_");
            sb2.append(f31338a);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    sb2.append(ca.c.a(context).b(0, context.getPackageName()).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb3 = sb2.toString();
            int i12 = g1.f34904a;
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb3)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb3);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:2|3)|4|(4:8|2c|15|(2:17|(2:19|20))(2:22|23))|38|(4:40|(3:42|(1:48)(1:46)|47)|49|(12:51|(1:53)(1:106)|54|(2:102|103)(1:56)|57|58|59|(1:61)(2:(2:72|(1:74))|(7:80|(1:82)(1:99)|(1:84)|(1:86)(4:87|(2:93|94)|89|(1:91)(1:92))|63|(1:(1:66)(1:67))|(1:69)(1:70))(1:79))|62|63|(0)|(0)(0)))|107|(0)(0)|54|(0)(0)|57|58|59|(0)(0)|62|63|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0196, code lost:
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(int i6, Context context) {
        boolean z10;
        boolean z11;
        PackageInfo packageInfo;
        int i10;
        PackageInfo packageInfo2;
        int i11;
        boolean z12;
        Bundle bundle;
        AtomicBoolean atomicBoolean = h.f31341a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z13 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !h.f31344d.get()) {
            synchronized (o0.f34926a) {
                if (!o0.f34927b) {
                    o0.f34927b = true;
                    try {
                        bundle = ca.c.a(context).a(128, context.getPackageName()).metaData;
                    } catch (PackageManager.NameNotFoundException e10) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e10);
                    }
                    if (bundle != null) {
                        bundle.getString("com.google.app.id");
                        o0.f34928c = bundle.getInt("com.google.android.gms.version");
                    }
                }
            }
            int i12 = o0.f34928c;
            if (i12 != 0) {
                if (i12 != 12451000) {
                    throw new GooglePlayServicesIncorrectManifestValueException(i12);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        if (!aa.d.a(context)) {
            if (aa.d.f443c == null) {
                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                aa.d.f443c = Boolean.valueOf(z12);
            }
            if (!aa.d.f443c.booleanValue()) {
                z10 = true;
                if (i6 < 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                v9.o.b(z11);
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                if (!z10) {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                } else {
                    packageInfo = null;
                }
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                i.a(context);
                if (i.d(packageInfo2, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                } else {
                    if (z10) {
                        v9.o.h(packageInfo);
                        if (!i.d(packageInfo, true)) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                        }
                    }
                    if (z10 && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    } else {
                        int i13 = packageInfo2.versionCode;
                        int i14 = -1;
                        if (i13 == -1) {
                            i11 = -1;
                        } else {
                            i11 = i13 / 1000;
                        }
                        if (i6 != -1) {
                            i14 = i6 / 1000;
                        }
                        if (i11 < i14) {
                            Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i6 + " but found " + i13);
                            i10 = 2;
                        } else {
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e11) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                                    i10 = 1;
                                    if (i10 != 18) {
                                    }
                                    if (!z13) {
                                    }
                                }
                            }
                            if (!applicationInfo.enabled) {
                                i10 = 3;
                            } else {
                                i10 = 0;
                            }
                        }
                        if (i10 != 18) {
                            if (i10 == 1) {
                                z13 = h.b(context);
                            } else {
                                z13 = false;
                            }
                        }
                        if (!z13) {
                            return 18;
                        }
                        return i10;
                    }
                }
                i10 = 9;
                if (i10 != 18) {
                }
                if (!z13) {
                }
            }
        }
        z10 = false;
        if (i6 < 0) {
        }
        v9.o.b(z11);
        String packageName2 = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        if (!z10) {
        }
        packageInfo2 = packageManager2.getPackageInfo("com.google.android.gms", 64);
        i.a(context);
        if (i.d(packageInfo2, true)) {
        }
        i10 = 9;
        if (i10 != 18) {
        }
        if (!z13) {
        }
    }
}
