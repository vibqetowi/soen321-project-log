package com.google.firebase.messaging;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: CommonNotificationBuilder.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f9698a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: CommonNotificationBuilder.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final f0.t f9699a;

        /* renamed from: b  reason: collision with root package name */
        public final String f9700b;

        public a(f0.t tVar, String str) {
            this.f9699a = tVar;
            this.f9700b = str;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(73:1|2|3|(1:5)|237|7|(3:213|214|(71:216|(63:218|(1:220)|10|(1:12)|13|(1:15)|16|(54:18|(1:198)|22|(1:24)|25|(1:27)(2:188|(1:193)(1:192))|(1:29)|30|(1:32)(5:176|(1:178)|179|(1:181)(1:187)|(1:183)(2:184|(1:186)))|33|(1:35)(8:151|(5:154|(1:166)(1:160)|(2:162|163)(1:165)|164|152)|167|168|(1:170)|171|(1:173)(1:175)|174)|36|(1:38)(3:146|(1:148)(1:150)|149)|(1:40)|41|(37:142|143|(1:47)|48|(1:50)|51|(31:53|(1:136)|(1:58)|59|(27:61|(1:134)|(1:66)|67|(23:69|(1:71)|(1:73)|74|(19:129|130|(1:78)|79|(3:119|120|(16:122|(1:124)|125|(1:83)|84|(4:86|87|88|(2:90|(10:92|(3:94|(1:97)|98)|99|(1:101)|102|(1:104)|105|(1:107)|108|109)(2:111|112))(2:113|114))|118|(0)|99|(0)|102|(0)|105|(0)|108|109)(2:126|127))|81|(0)|84|(0)|118|(0)|99|(0)|102|(0)|105|(0)|108|109)|76|(0)|79|(0)|81|(0)|84|(0)|118|(0)|99|(0)|102|(0)|105|(0)|108|109)|133|(0)|74|(0)|76|(0)|79|(0)|81|(0)|84|(0)|118|(0)|99|(0)|102|(0)|105|(0)|108|109)|135|(0)|67|(0)|133|(0)|74|(0)|76|(0)|79|(0)|81|(0)|84|(0)|118|(0)|99|(0)|102|(0)|105|(0)|108|109)|137|(0)|59|(0)|135|(0)|67|(0)|133|(0)|74|(0)|76|(0)|79|(0)|81|(0)|84|(0)|118|(0)|99|(0)|102|(0)|105|(0)|108|109)|43|(37:138|139|(0)|48|(0)|51|(0)|137|(0)|59|(0)|135|(0)|67|(0)|133|(0)|74|(0)|76|(0)|79|(0)|81|(0)|84|(0)|118|(0)|99|(0)|102|(0)|105|(0)|108|109)|45|(0)|48|(0)|51|(0)|137|(0)|59|(0)|135|(0)|67|(0)|133|(0)|74|(0)|76|(0)|79|(0)|81|(0)|84|(0)|118|(0)|99|(0)|102|(0)|105|(0)|108|109)|199|(3:207|208|209)|(1:206)|22|(0)|25|(0)(0)|(0)|30|(0)(0)|33|(0)(0)|36|(0)(0)|(0)|41|(0)|43|(0)|45|(0)|48|(0)|51|(0)|137|(0)|59|(0)|135|(0)|67|(0)|133|(0)|74|(0)|76|(0)|79|(0)|81|(0)|84|(0)|118|(0)|99|(0)|102|(0)|105|(0)|108|109)|221|(67:223|(1:225)|10|(0)|13|(0)|16|(0)|199|(1:201)|207|208|209|(1:204)|206|22|(0)|25|(0)(0)|(0)|30|(0)(0)|33|(0)(0)|36|(0)(0)|(0)|41|(0)|43|(0)|45|(0)|48|(0)|51|(0)|137|(0)|59|(0)|135|(0)|67|(0)|133|(0)|74|(0)|76|(0)|79|(0)|81|(0)|84|(0)|118|(0)|99|(0)|102|(0)|105|(0)|108|109)(1:233)|226|(3:228|(1:230)(1:232)|231)|10|(0)|13|(0)|16|(0)|199|(0)|207|208|209|(0)|206|22|(0)|25|(0)(0)|(0)|30|(0)(0)|33|(0)(0)|36|(0)(0)|(0)|41|(0)|43|(0)|45|(0)|48|(0)|51|(0)|137|(0)|59|(0)|135|(0)|67|(0)|133|(0)|74|(0)|76|(0)|79|(0)|81|(0)|84|(0)|118|(0)|99|(0)|102|(0)|105|(0)|108|109))|9|10|(0)|13|(0)|16|(0)|199|(0)|207|208|209|(0)|206|22|(0)|25|(0)(0)|(0)|30|(0)(0)|33|(0)(0)|36|(0)(0)|(0)|41|(0)|43|(0)|45|(0)|48|(0)|51|(0)|137|(0)|59|(0)|135|(0)|67|(0)|133|(0)|74|(0)|76|(0)|79|(0)|81|(0)|84|(0)|118|(0)|99|(0)|102|(0)|105|(0)|108|109) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015d, code lost:
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0426 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x030a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a a(Context context, v vVar) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        CharSequence d10;
        CharSequence d11;
        String e10;
        int i6;
        String e11;
        Uri defaultUri;
        String e12;
        Uri uri;
        Intent launchIntentForPackage;
        int i10;
        PendingIntent activity;
        boolean z10;
        int i11;
        PendingIntent broadcast;
        String e13;
        Integer valueOf;
        CharSequence e14;
        Integer b10;
        Integer b11;
        Integer b12;
        String e15;
        Long valueOf2;
        JSONArray c10;
        long[] jArr;
        JSONArray c11;
        int[] iArr;
        String e16;
        int i12;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e17) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e17);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle2 = bundle;
        String e18 = vVar.e("gcm.n.android_channel_id");
        int i13 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(e18)) {
                    if (notificationManager.getNotificationChannel(e18) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + e18 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = context.getPackageName();
                    Resources resources = context.getResources();
                    packageManager = context.getPackageManager();
                    f0.t tVar = new f0.t(context, e18);
                    d10 = vVar.d(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(d10)) {
                        tVar.e(d10);
                    }
                    d11 = vVar.d(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(d11)) {
                        tVar.d(d11);
                        f0.s sVar = new f0.s();
                        sVar.j(d11);
                        tVar.j(sVar);
                    }
                    e10 = vVar.e("gcm.n.icon");
                    if (!TextUtils.isEmpty(e10)) {
                        i6 = resources.getIdentifier(e10, "drawable", packageName);
                        if ((i6 == 0 || !b(resources, i6)) && ((i6 = resources.getIdentifier(e10, "mipmap", packageName)) == 0 || !b(resources, i6))) {
                            Log.w("FirebaseMessaging", "Icon resource " + e10 + " not found. Notification will use default icon.");
                        }
                        Notification notification = tVar.D;
                        notification.icon = i6;
                        e11 = vVar.e("gcm.n.sound2");
                        if (TextUtils.isEmpty(e11)) {
                            e11 = vVar.e("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(e11)) {
                            defaultUri = null;
                        } else if (!"default".equals(e11) && resources.getIdentifier(e11, "raw", packageName) != 0) {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + e11);
                        } else {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        }
                        if (defaultUri != null) {
                            tVar.i(defaultUri);
                        }
                        e12 = vVar.e("gcm.n.click_action");
                        if (!TextUtils.isEmpty(e12)) {
                            launchIntentForPackage = new Intent(e12);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(268435456);
                        } else {
                            String e19 = vVar.e("gcm.n.link_android");
                            if (TextUtils.isEmpty(e19)) {
                                e19 = vVar.e("gcm.n.link");
                            }
                            if (!TextUtils.isEmpty(e19)) {
                                uri = Uri.parse(e19);
                            } else {
                                uri = null;
                            }
                            if (uri != null) {
                                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                launchIntentForPackage.setPackage(packageName);
                                launchIntentForPackage.setData(uri);
                            } else {
                                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                if (launchIntentForPackage == null) {
                                    Log.w("FirebaseMessaging", "No activity found to launch app");
                                }
                            }
                        }
                        AtomicInteger atomicInteger = f9698a;
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = vVar.f9784a;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                if (!str.startsWith("google.c.") && !str.startsWith("gcm.n.") && !str.startsWith("gcm.notification.")) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (z10) {
                                    bundle4.remove(str);
                                }
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (vVar.a("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", vVar.g());
                            }
                            int incrementAndGet = atomicInteger.incrementAndGet();
                            if (Build.VERSION.SDK_INT >= 23) {
                                i10 = 1140850688;
                            } else {
                                i10 = 1073741824;
                            }
                            activity = PendingIntent.getActivity(context, incrementAndGet, launchIntentForPackage, i10);
                        }
                        tVar.f14662g = activity;
                        if (!vVar.a("google.c.a.e")) {
                            broadcast = null;
                        } else {
                            Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(vVar.g());
                            int incrementAndGet2 = atomicInteger.incrementAndGet();
                            Intent putExtra = new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", putExtras);
                            if (Build.VERSION.SDK_INT >= 23) {
                                i11 = 1140850688;
                            } else {
                                i11 = 1073741824;
                            }
                            broadcast = PendingIntent.getBroadcast(context, incrementAndGet2, putExtra, i11);
                        }
                        if (broadcast != null) {
                            notification.deleteIntent = broadcast;
                        }
                        e13 = vVar.e("gcm.n.color");
                        if (!TextUtils.isEmpty(e13)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(e13));
                            } catch (IllegalArgumentException unused) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + e13 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                tVar.f14676v = valueOf.intValue();
                            }
                            tVar.g(16, !vVar.a("gcm.n.sticky"));
                            tVar.f14672q = vVar.a("gcm.n.local_only");
                            e14 = vVar.e("gcm.n.ticker");
                            if (e14 != null) {
                                tVar.l(e14);
                            }
                            b10 = vVar.b("gcm.n.notification_priority");
                            if (b10 != null) {
                                if (b10.intValue() < -2 || b10.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + b10 + ". Skipping setting notificationPriority.");
                                }
                                if (b10 != null) {
                                    tVar.f14665j = b10.intValue();
                                }
                                b11 = vVar.b("gcm.n.visibility");
                                if (b11 != null) {
                                    if (b11.intValue() < -1 || b11.intValue() > 1) {
                                        Log.w("NotificationParams", "visibility is invalid: " + b11 + ". Skipping setting visibility.");
                                    }
                                    if (b11 != null) {
                                        tVar.f14677w = b11.intValue();
                                    }
                                    b12 = vVar.b("gcm.n.notification_count");
                                    if (b12 != null) {
                                        if (b12.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + b12 + ". Skipping setting notificationCount.");
                                        }
                                        if (b12 != null) {
                                            tVar.f14664i = b12.intValue();
                                        }
                                        e15 = vVar.e("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(e15)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(e15));
                                            } catch (NumberFormatException unused2) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + v.h("gcm.n.event_time") + "(" + e15 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                tVar.f14666k = true;
                                                notification.when = valueOf2.longValue();
                                            }
                                            c10 = vVar.c("gcm.n.vibrate_timings");
                                            if (c10 != null) {
                                                try {
                                                } catch (NumberFormatException | JSONException unused3) {
                                                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c10 + ". Skipping setting vibrateTimings.");
                                                }
                                                if (c10.length() > 1) {
                                                    int length = c10.length();
                                                    jArr = new long[length];
                                                    for (int i14 = 0; i14 < length; i14++) {
                                                        jArr[i14] = c10.optLong(i14);
                                                    }
                                                    if (jArr != null) {
                                                        notification.vibrate = jArr;
                                                    }
                                                    c11 = vVar.c("gcm.n.light_settings");
                                                    if (c11 != null) {
                                                        int[] iArr2 = new int[3];
                                                        try {
                                                        } catch (IllegalArgumentException e20) {
                                                            Log.w("NotificationParams", "LightSettings is invalid: " + c11 + ". " + e20.getMessage() + ". Skipping setting LightSettings");
                                                        } catch (JSONException unused4) {
                                                            Log.w("NotificationParams", "LightSettings is invalid: " + c11 + ". Skipping setting LightSettings");
                                                        }
                                                        if (c11.length() == 3) {
                                                            int parseColor = Color.parseColor(c11.optString(0));
                                                            if (parseColor != -16777216) {
                                                                iArr2[0] = parseColor;
                                                                iArr2[1] = c11.optInt(1);
                                                                iArr2[2] = c11.optInt(2);
                                                                iArr = iArr2;
                                                                if (iArr != null) {
                                                                    int i15 = iArr[0];
                                                                    int i16 = iArr[1];
                                                                    int i17 = iArr[2];
                                                                    notification.ledARGB = i15;
                                                                    notification.ledOnMS = i16;
                                                                    notification.ledOffMS = i17;
                                                                    if (i16 != 0 && i17 != 0) {
                                                                        i13 = 1;
                                                                    }
                                                                    notification.flags = (notification.flags & (-2)) | i13;
                                                                }
                                                                boolean a10 = vVar.a("gcm.n.default_sound");
                                                                boolean z11 = a10;
                                                                if (vVar.a("gcm.n.default_vibrate_timings")) {
                                                                    z11 = a10 | true;
                                                                }
                                                                int i18 = z11;
                                                                if (vVar.a("gcm.n.default_light_settings")) {
                                                                    i18 = (z11 ? 1 : 0) | true;
                                                                }
                                                                tVar.f(i18);
                                                                e16 = vVar.e("gcm.n.tag");
                                                                if (TextUtils.isEmpty(e16)) {
                                                                    e16 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                                }
                                                                return new a(tVar, e16);
                                                            }
                                                            throw new IllegalArgumentException("Transparent color is invalid");
                                                        }
                                                        throw new JSONException("lightSettings don't have all three fields");
                                                    }
                                                    iArr = null;
                                                    if (iArr != null) {
                                                    }
                                                    boolean a102 = vVar.a("gcm.n.default_sound");
                                                    boolean z112 = a102;
                                                    if (vVar.a("gcm.n.default_vibrate_timings")) {
                                                    }
                                                    int i182 = z112;
                                                    if (vVar.a("gcm.n.default_light_settings")) {
                                                    }
                                                    tVar.f(i182);
                                                    e16 = vVar.e("gcm.n.tag");
                                                    if (TextUtils.isEmpty(e16)) {
                                                    }
                                                    return new a(tVar, e16);
                                                }
                                                throw new JSONException("vibrateTimings have invalid length");
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            c11 = vVar.c("gcm.n.light_settings");
                                            if (c11 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean a1022 = vVar.a("gcm.n.default_sound");
                                            boolean z1122 = a1022;
                                            if (vVar.a("gcm.n.default_vibrate_timings")) {
                                            }
                                            int i1822 = z1122;
                                            if (vVar.a("gcm.n.default_light_settings")) {
                                            }
                                            tVar.f(i1822);
                                            e16 = vVar.e("gcm.n.tag");
                                            if (TextUtils.isEmpty(e16)) {
                                            }
                                            return new a(tVar, e16);
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        c10 = vVar.c("gcm.n.vibrate_timings");
                                        if (c10 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        c11 = vVar.c("gcm.n.light_settings");
                                        if (c11 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean a10222 = vVar.a("gcm.n.default_sound");
                                        boolean z11222 = a10222;
                                        if (vVar.a("gcm.n.default_vibrate_timings")) {
                                        }
                                        int i18222 = z11222;
                                        if (vVar.a("gcm.n.default_light_settings")) {
                                        }
                                        tVar.f(i18222);
                                        e16 = vVar.e("gcm.n.tag");
                                        if (TextUtils.isEmpty(e16)) {
                                        }
                                        return new a(tVar, e16);
                                    }
                                    b12 = null;
                                    if (b12 != null) {
                                    }
                                    e15 = vVar.e("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(e15)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    c10 = vVar.c("gcm.n.vibrate_timings");
                                    if (c10 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    c11 = vVar.c("gcm.n.light_settings");
                                    if (c11 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean a102222 = vVar.a("gcm.n.default_sound");
                                    boolean z112222 = a102222;
                                    if (vVar.a("gcm.n.default_vibrate_timings")) {
                                    }
                                    int i182222 = z112222;
                                    if (vVar.a("gcm.n.default_light_settings")) {
                                    }
                                    tVar.f(i182222);
                                    e16 = vVar.e("gcm.n.tag");
                                    if (TextUtils.isEmpty(e16)) {
                                    }
                                    return new a(tVar, e16);
                                }
                                b11 = null;
                                if (b11 != null) {
                                }
                                b12 = vVar.b("gcm.n.notification_count");
                                if (b12 != null) {
                                }
                                b12 = null;
                                if (b12 != null) {
                                }
                                e15 = vVar.e("gcm.n.event_time");
                                if (!TextUtils.isEmpty(e15)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                c10 = vVar.c("gcm.n.vibrate_timings");
                                if (c10 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                c11 = vVar.c("gcm.n.light_settings");
                                if (c11 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean a1022222 = vVar.a("gcm.n.default_sound");
                                boolean z1122222 = a1022222;
                                if (vVar.a("gcm.n.default_vibrate_timings")) {
                                }
                                int i1822222 = z1122222;
                                if (vVar.a("gcm.n.default_light_settings")) {
                                }
                                tVar.f(i1822222);
                                e16 = vVar.e("gcm.n.tag");
                                if (TextUtils.isEmpty(e16)) {
                                }
                                return new a(tVar, e16);
                            }
                            b10 = null;
                            if (b10 != null) {
                            }
                            b11 = vVar.b("gcm.n.visibility");
                            if (b11 != null) {
                            }
                            b11 = null;
                            if (b11 != null) {
                            }
                            b12 = vVar.b("gcm.n.notification_count");
                            if (b12 != null) {
                            }
                            b12 = null;
                            if (b12 != null) {
                            }
                            e15 = vVar.e("gcm.n.event_time");
                            if (!TextUtils.isEmpty(e15)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            c10 = vVar.c("gcm.n.vibrate_timings");
                            if (c10 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            c11 = vVar.c("gcm.n.light_settings");
                            if (c11 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean a10222222 = vVar.a("gcm.n.default_sound");
                            boolean z11222222 = a10222222;
                            if (vVar.a("gcm.n.default_vibrate_timings")) {
                            }
                            int i18222222 = z11222222;
                            if (vVar.a("gcm.n.default_light_settings")) {
                            }
                            tVar.f(i18222222);
                            e16 = vVar.e("gcm.n.tag");
                            if (TextUtils.isEmpty(e16)) {
                            }
                            return new a(tVar, e16);
                        }
                        i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i12 != 0) {
                            try {
                                valueOf = Integer.valueOf(g0.a.b(context, i12));
                            } catch (Resources.NotFoundException unused5) {
                                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            tVar.g(16, !vVar.a("gcm.n.sticky"));
                            tVar.f14672q = vVar.a("gcm.n.local_only");
                            e14 = vVar.e("gcm.n.ticker");
                            if (e14 != null) {
                            }
                            b10 = vVar.b("gcm.n.notification_priority");
                            if (b10 != null) {
                            }
                            b10 = null;
                            if (b10 != null) {
                            }
                            b11 = vVar.b("gcm.n.visibility");
                            if (b11 != null) {
                            }
                            b11 = null;
                            if (b11 != null) {
                            }
                            b12 = vVar.b("gcm.n.notification_count");
                            if (b12 != null) {
                            }
                            b12 = null;
                            if (b12 != null) {
                            }
                            e15 = vVar.e("gcm.n.event_time");
                            if (!TextUtils.isEmpty(e15)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            c10 = vVar.c("gcm.n.vibrate_timings");
                            if (c10 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            c11 = vVar.c("gcm.n.light_settings");
                            if (c11 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean a102222222 = vVar.a("gcm.n.default_sound");
                            boolean z112222222 = a102222222;
                            if (vVar.a("gcm.n.default_vibrate_timings")) {
                            }
                            int i182222222 = z112222222;
                            if (vVar.a("gcm.n.default_light_settings")) {
                            }
                            tVar.f(i182222222);
                            e16 = vVar.e("gcm.n.tag");
                            if (TextUtils.isEmpty(e16)) {
                            }
                            return new a(tVar, e16);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        tVar.g(16, !vVar.a("gcm.n.sticky"));
                        tVar.f14672q = vVar.a("gcm.n.local_only");
                        e14 = vVar.e("gcm.n.ticker");
                        if (e14 != null) {
                        }
                        b10 = vVar.b("gcm.n.notification_priority");
                        if (b10 != null) {
                        }
                        b10 = null;
                        if (b10 != null) {
                        }
                        b11 = vVar.b("gcm.n.visibility");
                        if (b11 != null) {
                        }
                        b11 = null;
                        if (b11 != null) {
                        }
                        b12 = vVar.b("gcm.n.notification_count");
                        if (b12 != null) {
                        }
                        b12 = null;
                        if (b12 != null) {
                        }
                        e15 = vVar.e("gcm.n.event_time");
                        if (!TextUtils.isEmpty(e15)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        c10 = vVar.c("gcm.n.vibrate_timings");
                        if (c10 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        c11 = vVar.c("gcm.n.light_settings");
                        if (c11 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean a1022222222 = vVar.a("gcm.n.default_sound");
                        boolean z1122222222 = a1022222222;
                        if (vVar.a("gcm.n.default_vibrate_timings")) {
                        }
                        int i1822222222 = z1122222222;
                        if (vVar.a("gcm.n.default_light_settings")) {
                        }
                        tVar.f(i1822222222);
                        e16 = vVar.e("gcm.n.tag");
                        if (TextUtils.isEmpty(e16)) {
                        }
                        return new a(tVar, e16);
                    }
                    i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i6 != 0 || !b(resources, i6)) {
                        i6 = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i6 != 0 || !b(resources, i6)) {
                        i6 = 17301651;
                    }
                    Notification notification2 = tVar.D;
                    notification2.icon = i6;
                    e11 = vVar.e("gcm.n.sound2");
                    if (TextUtils.isEmpty(e11)) {
                    }
                    if (TextUtils.isEmpty(e11)) {
                    }
                    if (defaultUri != null) {
                    }
                    e12 = vVar.e("gcm.n.click_action");
                    if (!TextUtils.isEmpty(e12)) {
                    }
                    AtomicInteger atomicInteger2 = f9698a;
                    if (launchIntentForPackage == null) {
                    }
                    tVar.f14662g = activity;
                    if (!vVar.a("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    e13 = vVar.e("gcm.n.color");
                    if (!TextUtils.isEmpty(e13)) {
                    }
                    i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i12 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    tVar.g(16, !vVar.a("gcm.n.sticky"));
                    tVar.f14672q = vVar.a("gcm.n.local_only");
                    e14 = vVar.e("gcm.n.ticker");
                    if (e14 != null) {
                    }
                    b10 = vVar.b("gcm.n.notification_priority");
                    if (b10 != null) {
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    b11 = vVar.b("gcm.n.visibility");
                    if (b11 != null) {
                    }
                    b11 = null;
                    if (b11 != null) {
                    }
                    b12 = vVar.b("gcm.n.notification_count");
                    if (b12 != null) {
                    }
                    b12 = null;
                    if (b12 != null) {
                    }
                    e15 = vVar.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e15)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c10 = vVar.c("gcm.n.vibrate_timings");
                    if (c10 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c11 = vVar.c("gcm.n.light_settings");
                    if (c11 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a10222222222 = vVar.a("gcm.n.default_sound");
                    boolean z11222222222 = a10222222222;
                    if (vVar.a("gcm.n.default_vibrate_timings")) {
                    }
                    int i18222222222 = z11222222222;
                    if (vVar.a("gcm.n.default_light_settings")) {
                    }
                    tVar.f(i18222222222);
                    e16 = vVar.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e16)) {
                    }
                    return new a(tVar, e16);
                }
                e18 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(e18)) {
                    if (notificationManager.getNotificationChannel(e18) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = context.getPackageName();
                    Resources resources2 = context.getResources();
                    packageManager = context.getPackageManager();
                    f0.t tVar2 = new f0.t(context, e18);
                    d10 = vVar.d(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(d10)) {
                    }
                    d11 = vVar.d(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(d11)) {
                    }
                    e10 = vVar.e("gcm.n.icon");
                    if (!TextUtils.isEmpty(e10)) {
                    }
                    i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i6 != 0) {
                    }
                    i6 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i6 != 0) {
                    }
                    i6 = 17301651;
                    Notification notification22 = tVar2.D;
                    notification22.icon = i6;
                    e11 = vVar.e("gcm.n.sound2");
                    if (TextUtils.isEmpty(e11)) {
                    }
                    if (TextUtils.isEmpty(e11)) {
                    }
                    if (defaultUri != null) {
                    }
                    e12 = vVar.e("gcm.n.click_action");
                    if (!TextUtils.isEmpty(e12)) {
                    }
                    AtomicInteger atomicInteger22 = f9698a;
                    if (launchIntentForPackage == null) {
                    }
                    tVar2.f14662g = activity;
                    if (!vVar.a("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    e13 = vVar.e("gcm.n.color");
                    if (!TextUtils.isEmpty(e13)) {
                    }
                    i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i12 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    tVar2.g(16, !vVar.a("gcm.n.sticky"));
                    tVar2.f14672q = vVar.a("gcm.n.local_only");
                    e14 = vVar.e("gcm.n.ticker");
                    if (e14 != null) {
                    }
                    b10 = vVar.b("gcm.n.notification_priority");
                    if (b10 != null) {
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    b11 = vVar.b("gcm.n.visibility");
                    if (b11 != null) {
                    }
                    b11 = null;
                    if (b11 != null) {
                    }
                    b12 = vVar.b("gcm.n.notification_count");
                    if (b12 != null) {
                    }
                    b12 = null;
                    if (b12 != null) {
                    }
                    e15 = vVar.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e15)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c10 = vVar.c("gcm.n.vibrate_timings");
                    if (c10 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c11 = vVar.c("gcm.n.light_settings");
                    if (c11 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a102222222222 = vVar.a("gcm.n.default_sound");
                    boolean z112222222222 = a102222222222;
                    if (vVar.a("gcm.n.default_vibrate_timings")) {
                    }
                    int i182222222222 = z112222222222;
                    if (vVar.a("gcm.n.default_light_settings")) {
                    }
                    tVar2.f(i182222222222);
                    e16 = vVar.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e16)) {
                    }
                    return new a(tVar2, e16);
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                e18 = "fcm_fallback_notification_channel";
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                packageName = context.getPackageName();
                Resources resources22 = context.getResources();
                packageManager = context.getPackageManager();
                f0.t tVar22 = new f0.t(context, e18);
                d10 = vVar.d(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(d10)) {
                }
                d11 = vVar.d(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(d11)) {
                }
                e10 = vVar.e("gcm.n.icon");
                if (!TextUtils.isEmpty(e10)) {
                }
                i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i6 != 0) {
                }
                i6 = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i6 != 0) {
                }
                i6 = 17301651;
                Notification notification222 = tVar22.D;
                notification222.icon = i6;
                e11 = vVar.e("gcm.n.sound2");
                if (TextUtils.isEmpty(e11)) {
                }
                if (TextUtils.isEmpty(e11)) {
                }
                if (defaultUri != null) {
                }
                e12 = vVar.e("gcm.n.click_action");
                if (!TextUtils.isEmpty(e12)) {
                }
                AtomicInteger atomicInteger222 = f9698a;
                if (launchIntentForPackage == null) {
                }
                tVar22.f14662g = activity;
                if (!vVar.a("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                e13 = vVar.e("gcm.n.color");
                if (!TextUtils.isEmpty(e13)) {
                }
                i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i12 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                tVar22.g(16, !vVar.a("gcm.n.sticky"));
                tVar22.f14672q = vVar.a("gcm.n.local_only");
                e14 = vVar.e("gcm.n.ticker");
                if (e14 != null) {
                }
                b10 = vVar.b("gcm.n.notification_priority");
                if (b10 != null) {
                }
                b10 = null;
                if (b10 != null) {
                }
                b11 = vVar.b("gcm.n.visibility");
                if (b11 != null) {
                }
                b11 = null;
                if (b11 != null) {
                }
                b12 = vVar.b("gcm.n.notification_count");
                if (b12 != null) {
                }
                b12 = null;
                if (b12 != null) {
                }
                e15 = vVar.e("gcm.n.event_time");
                if (!TextUtils.isEmpty(e15)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                c10 = vVar.c("gcm.n.vibrate_timings");
                if (c10 != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                c11 = vVar.c("gcm.n.light_settings");
                if (c11 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean a1022222222222 = vVar.a("gcm.n.default_sound");
                boolean z1122222222222 = a1022222222222;
                if (vVar.a("gcm.n.default_vibrate_timings")) {
                }
                int i1822222222222 = z1122222222222;
                if (vVar.a("gcm.n.default_light_settings")) {
                }
                tVar22.f(i1822222222222);
                e16 = vVar.e("gcm.n.tag");
                if (TextUtils.isEmpty(e16)) {
                }
                return new a(tVar22, e16);
            }
        }
        e18 = null;
        packageName = context.getPackageName();
        Resources resources222 = context.getResources();
        packageManager = context.getPackageManager();
        f0.t tVar222 = new f0.t(context, e18);
        d10 = vVar.d(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(d10)) {
        }
        d11 = vVar.d(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(d11)) {
        }
        e10 = vVar.e("gcm.n.icon");
        if (!TextUtils.isEmpty(e10)) {
        }
        i6 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i6 != 0) {
        }
        i6 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i6 != 0) {
        }
        i6 = 17301651;
        Notification notification2222 = tVar222.D;
        notification2222.icon = i6;
        e11 = vVar.e("gcm.n.sound2");
        if (TextUtils.isEmpty(e11)) {
        }
        if (TextUtils.isEmpty(e11)) {
        }
        if (defaultUri != null) {
        }
        e12 = vVar.e("gcm.n.click_action");
        if (!TextUtils.isEmpty(e12)) {
        }
        AtomicInteger atomicInteger2222 = f9698a;
        if (launchIntentForPackage == null) {
        }
        tVar222.f14662g = activity;
        if (!vVar.a("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        e13 = vVar.e("gcm.n.color");
        if (!TextUtils.isEmpty(e13)) {
        }
        i12 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i12 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        tVar222.g(16, !vVar.a("gcm.n.sticky"));
        tVar222.f14672q = vVar.a("gcm.n.local_only");
        e14 = vVar.e("gcm.n.ticker");
        if (e14 != null) {
        }
        b10 = vVar.b("gcm.n.notification_priority");
        if (b10 != null) {
        }
        b10 = null;
        if (b10 != null) {
        }
        b11 = vVar.b("gcm.n.visibility");
        if (b11 != null) {
        }
        b11 = null;
        if (b11 != null) {
        }
        b12 = vVar.b("gcm.n.notification_count");
        if (b12 != null) {
        }
        b12 = null;
        if (b12 != null) {
        }
        e15 = vVar.e("gcm.n.event_time");
        if (!TextUtils.isEmpty(e15)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        c10 = vVar.c("gcm.n.vibrate_timings");
        if (c10 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        c11 = vVar.c("gcm.n.light_settings");
        if (c11 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean a10222222222222 = vVar.a("gcm.n.default_sound");
        boolean z11222222222222 = a10222222222222;
        if (vVar.a("gcm.n.default_vibrate_timings")) {
        }
        int i18222222222222 = z11222222222222;
        if (vVar.a("gcm.n.default_light_settings")) {
        }
        tVar222.f(i18222222222222);
        e16 = vVar.e("gcm.n.tag");
        if (TextUtils.isEmpty(e16)) {
        }
        return new a(tVar222, e16);
    }

    public static boolean b(Resources resources, int i6) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i6, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i6);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i6 + ", treating it as an invalid icon");
            return false;
        }
    }
}
