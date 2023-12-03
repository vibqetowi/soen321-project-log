package lg;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import com.mixpanel.android.util.RemoteService$ServiceUnavailableException;
import com.theinnerhour.b2b.utils.Constants;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.b0;
import lg.d;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: AnalyticsMessages.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap f24265d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final h f24266a = new h();

    /* renamed from: b  reason: collision with root package name */
    public final Context f24267b;

    /* renamed from: c  reason: collision with root package name */
    public final lg.c f24268c;

    /* compiled from: AnalyticsMessages.java */
    /* renamed from: lg.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0381a extends d {

        /* renamed from: c  reason: collision with root package name */
        public final String f24269c;

        /* renamed from: d  reason: collision with root package name */
        public final JSONObject f24270d;

        public C0381a(String str, JSONObject jSONObject, String str2, JSONObject jSONObject2) {
            super(jSONObject, str2);
            this.f24269c = str;
            this.f24270d = jSONObject2;
        }
    }

    /* compiled from: AnalyticsMessages.java */
    /* loaded from: classes.dex */
    public static class b extends d {
        public final String toString() {
            return this.f24272b.toString();
        }
    }

    /* compiled from: AnalyticsMessages.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f24271a;

        public c(String str) {
            this.f24271a = str;
        }
    }

    /* compiled from: AnalyticsMessages.java */
    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final JSONObject f24272b;

        public d(JSONObject jSONObject, String str) {
            super(str);
            if (jSONObject.length() > 0) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.get(next).toString();
                    } catch (AssertionError e10) {
                        jSONObject.remove(next);
                        b0.n("MixpanelAPI.Messages", "Removing people profile property from update (see https://github.com/mixpanel/mixpanel-android/issues/567)", e10);
                    } catch (JSONException unused) {
                    }
                }
            }
            this.f24272b = jSONObject;
        }
    }

    /* compiled from: AnalyticsMessages.java */
    /* loaded from: classes.dex */
    public static class e extends d {
        public e(JSONObject jSONObject, String str) {
            super(jSONObject, str);
        }

        public final String toString() {
            return this.f24272b.toString();
        }
    }

    /* compiled from: AnalyticsMessages.java */
    /* loaded from: classes.dex */
    public static class f extends c {

        /* renamed from: b  reason: collision with root package name */
        public final String f24273b;

        public f(String str, String str2) {
            super(str2);
            this.f24273b = str;
        }

        public final String toString() {
            return this.f24273b;
        }
    }

    /* compiled from: AnalyticsMessages.java */
    /* loaded from: classes.dex */
    public static class g extends c {
    }

    /* compiled from: AnalyticsMessages.java */
    /* loaded from: classes.dex */
    public class h {

        /* renamed from: b  reason: collision with root package name */
        public Handler f24275b;
        public l f;

        /* renamed from: a  reason: collision with root package name */
        public final Object f24274a = new Object();

        /* renamed from: c  reason: collision with root package name */
        public long f24276c = 0;

        /* renamed from: d  reason: collision with root package name */
        public long f24277d = 0;

        /* renamed from: e  reason: collision with root package name */
        public long f24278e = -1;

        /* compiled from: AnalyticsMessages.java */
        /* renamed from: lg.a$h$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class HandlerC0382a extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public lg.d f24280a;

            /* renamed from: b  reason: collision with root package name */
            public final long f24281b;

            /* renamed from: c  reason: collision with root package name */
            public long f24282c;

            /* renamed from: d  reason: collision with root package name */
            public int f24283d;

            public HandlerC0382a(Looper looper) {
                super(looper);
                this.f24280a = null;
                Context context = a.this.f24267b;
                synchronized (l.f24367h) {
                    if (l.f24366g == null) {
                        l.f24366g = new l(context.getApplicationContext());
                    }
                }
                h.this.f = l.f24366g;
                this.f24281b = a.this.f24268c.f24290b;
            }

            /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
                if (r4.isConnected() != false) goto L40;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final JSONObject a(C0381a c0381a) {
                String str;
                Boolean bool;
                String str2;
                BluetoothAdapter defaultAdapter;
                boolean z10;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = c0381a.f24272b;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("mp_lib", "android");
                jSONObject3.put("$lib_version", "7.3.0");
                jSONObject3.put("$os", "Android");
                String str3 = Build.VERSION.RELEASE;
                String str4 = "UNKNOWN";
                if (str3 == null) {
                    str3 = "UNKNOWN";
                }
                jSONObject3.put("$os_version", str3);
                String str5 = Build.MANUFACTURER;
                if (str5 == null) {
                    str5 = "UNKNOWN";
                }
                jSONObject3.put("$manufacturer", str5);
                String str6 = Build.BRAND;
                if (str6 == null) {
                    str6 = "UNKNOWN";
                }
                jSONObject3.put("$brand", str6);
                String str7 = Build.MODEL;
                if (str7 != null) {
                    str4 = str7;
                }
                jSONObject3.put("$model", str4);
                h hVar = h.this;
                DisplayMetrics displayMetrics = hVar.f.f24371d;
                jSONObject3.put("$screen_dpi", displayMetrics.densityDpi);
                jSONObject3.put("$screen_height", displayMetrics.heightPixels);
                jSONObject3.put("$screen_width", displayMetrics.widthPixels);
                String str8 = hVar.f.f24372e;
                if (str8 != null) {
                    jSONObject3.put("$app_version", str8);
                    jSONObject3.put("$app_version_string", str8);
                }
                Integer num = hVar.f.f;
                if (num != null) {
                    String valueOf = String.valueOf(num);
                    jSONObject3.put("$app_release", valueOf);
                    jSONObject3.put("$app_build_number", valueOf);
                }
                Boolean valueOf2 = Boolean.valueOf(hVar.f.f24369b.booleanValue());
                if (valueOf2 != null) {
                    jSONObject3.put("$has_nfc", valueOf2.booleanValue());
                }
                Boolean valueOf3 = Boolean.valueOf(hVar.f.f24370c.booleanValue());
                if (valueOf3 != null) {
                    jSONObject3.put("$has_telephone", valueOf3.booleanValue());
                }
                TelephonyManager telephonyManager = (TelephonyManager) hVar.f.f24368a.getSystemService("phone");
                Boolean bool2 = null;
                if (telephonyManager != null) {
                    str = telephonyManager.getNetworkOperatorName();
                } else {
                    str = null;
                }
                if (str != null && !str.trim().isEmpty()) {
                    jSONObject3.put("$carrier", str);
                }
                Context context = hVar.f.f24368a;
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        z10 = true;
                        if (activeNetworkInfo.getType() == 1) {
                        }
                    }
                    z10 = false;
                    bool = Boolean.valueOf(z10);
                } else {
                    bool = null;
                }
                if (bool != null) {
                    jSONObject3.put("$wifi", bool.booleanValue());
                }
                Context context2 = hVar.f.f24368a;
                try {
                    if (context2.getPackageManager().checkPermission("android.permission.BLUETOOTH", context2.getPackageName()) == 0 && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
                        bool2 = Boolean.valueOf(defaultAdapter.isEnabled());
                    }
                } catch (NoClassDefFoundError | SecurityException unused) {
                }
                if (bool2 != null) {
                    jSONObject3.put("$bluetooth_enabled", bool2);
                }
                Context context3 = hVar.f.f24368a;
                if (context3.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                    str2 = "ble";
                } else if (context3.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
                    str2 = "classic";
                } else {
                    str2 = Constants.SUBSCRIPTION_NONE;
                }
                jSONObject3.put("$bluetooth_version", str2);
                jSONObject3.put("token", c0381a.f24271a);
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject3.put(next, jSONObject2.get(next));
                    }
                }
                jSONObject.put("event", c0381a.f24269c);
                jSONObject.put("properties", jSONObject3);
                jSONObject.put("$mp_metadata", c0381a.f24270d);
                return jSONObject;
            }

            public final void b(lg.d dVar, String str) {
                boolean z10;
                NetworkInfo activeNetworkInfo;
                String str2;
                a.this.getClass();
                a aVar = a.this;
                Context context = aVar.f24267b;
                synchronized (aVar.f24268c) {
                }
                if (mg.c.f25052a) {
                    z10 = false;
                } else {
                    try {
                        activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    } catch (SecurityException unused) {
                        b0.t("MixpanelAPI.Message", "Don't have permission to check connectivity, will assume we are online");
                    }
                    if (activeNetworkInfo == null) {
                        b0.t("MixpanelAPI.Message", "A default network has not been set so we cannot be certain whether we are offline");
                        z10 = true;
                    } else {
                        boolean isConnectedOrConnecting = activeNetworkInfo.isConnectedOrConnecting();
                        StringBuilder sb2 = new StringBuilder("ConnectivityManager says we ");
                        if (isConnectedOrConnecting) {
                            str2 = "are";
                        } else {
                            str2 = "are not";
                        }
                        sb2.append(str2);
                        sb2.append(" online");
                        b0.t("MixpanelAPI.Message", sb2.toString());
                        z10 = isConnectedOrConnecting;
                    }
                }
                if (!z10) {
                    a.a(a.this, "Not flushing data to Mixpanel because the device is not connected to the internet.");
                    return;
                }
                c(dVar, str, 1, a.this.f24268c.f24296i);
                c(dVar, str, 2, a.this.f24268c.f24297j);
                c(dVar, str, 4, a.this.f24268c.f24298k);
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x0284  */
            /* JADX WARN: Removed duplicated region for block: B:101:0x028d  */
            /* JADX WARN: Removed duplicated region for block: B:124:0x029f A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:75:0x01ee  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void c(lg.d dVar, String str, int i6, String str2) {
                boolean z10;
                String str3;
                String str4;
                byte[] a10;
                int i10;
                int i11;
                int i12;
                char c10;
                String str5 = str2;
                String str6 = "MixpanelAPI.Messages";
                String str7 = "Cannot post message to ";
                h hVar = h.this;
                a aVar = a.this;
                a aVar2 = a.this;
                aVar.getClass();
                mg.c cVar = new mg.c();
                String[] e10 = dVar.e(i6, str);
                char c11 = 0;
                Integer num = 0;
                if (e10 != null) {
                    num = Integer.valueOf(e10[2]);
                }
                while (e10 != null && num.intValue() > 0) {
                    String str8 = e10[c11];
                    String str9 = e10[1];
                    char[] cArr = mg.a.f25050a;
                    byte[] bytes = str9.getBytes();
                    int length = bytes.length;
                    Integer num2 = num;
                    int i13 = ((length * 4) + 2) / 3;
                    char[] cArr2 = new char[((length + 2) / 3) * 4];
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < length) {
                        int i16 = i14 + 1;
                        int i17 = bytes[i14] & 255;
                        if (i16 < length) {
                            i10 = bytes[i16] & 255;
                            i16++;
                        } else {
                            i10 = 0;
                        }
                        if (i16 < length) {
                            i11 = i16 + 1;
                            i12 = bytes[i16] & 255;
                        } else {
                            i11 = i16;
                            i12 = 0;
                        }
                        int i18 = i17 >>> 2;
                        int i19 = ((i17 & 3) << 4) | (i10 >>> 4);
                        int i20 = ((i10 & 15) << 2) | (i12 >>> 6);
                        int i21 = i12 & 63;
                        int i22 = i15 + 1;
                        char[] cArr3 = mg.a.f25050a;
                        cArr2[i15] = cArr3[i18];
                        byte[] bArr = bytes;
                        int i23 = i22 + 1;
                        cArr2[i22] = cArr3[i19];
                        char c12 = '=';
                        if (i23 < i13) {
                            c10 = cArr3[i20];
                        } else {
                            c10 = '=';
                        }
                        cArr2[i23] = c10;
                        int i24 = i23 + 1;
                        if (i24 < i13) {
                            c12 = cArr3[i21];
                        }
                        cArr2[i24] = c12;
                        int i25 = i24 + 1;
                        bytes = bArr;
                        i14 = i11;
                        i15 = i25;
                    }
                    String str10 = new String(cArr2);
                    HashMap hashMap = new HashMap();
                    hashMap.put("data", str10);
                    if (lg.c.r) {
                        hashMap.put("verbose", "1");
                    }
                    try {
                        try {
                            a10 = cVar.a(str5, hashMap, aVar2.f24268c.c());
                        } catch (RemoteService$ServiceUnavailableException e11) {
                            e = e11;
                        } catch (SocketTimeoutException e12) {
                            e = e12;
                        } catch (IOException e13) {
                            e = e13;
                        }
                    } catch (OutOfMemoryError e14) {
                        e = e14;
                    } catch (MalformedURLException e15) {
                        e = e15;
                    }
                    if (a10 == null) {
                        try {
                            a.a(aVar2, "Response was null, unexpected failure posting to " + str5 + ".");
                            z10 = false;
                        } catch (OutOfMemoryError e16) {
                            e = e16;
                            z10 = false;
                            b0.n(str6, "Out of memory when posting to " + str5 + ".", e);
                            if (z10) {
                            }
                        } catch (MalformedURLException e17) {
                            e = e17;
                            z10 = false;
                            b0.n(str6, "Cannot interpret " + str5 + " as a URL.", e);
                            if (z10) {
                            }
                        }
                        if (z10) {
                            a.a(aVar2, "Not retrying this batch of events, deleting them from DB.");
                            d.a aVar3 = dVar.f24313a;
                            String b10 = defpackage.d.b(i6);
                            try {
                                try {
                                    str3 = str6;
                                    try {
                                        str4 = str7;
                                        try {
                                            aVar3.getWritableDatabase().delete(b10, new StringBuffer("_id <= " + str8 + " AND token = '" + str + "'").toString(), null);
                                        } catch (SQLiteException e18) {
                                            e = e18;
                                            b0.n("MixpanelAPI.Database", "Could not clean sent Mixpanel records from " + b10 + ". Re-initializing database.", e);
                                            aVar3.a();
                                            aVar3.close();
                                            e10 = dVar.e(i6, str);
                                            if (e10 != null) {
                                            }
                                            str5 = str2;
                                            str6 = str3;
                                            str7 = str4;
                                            c11 = 0;
                                        } catch (Exception e19) {
                                            e = e19;
                                            b0.n("MixpanelAPI.Database", "Unknown exception. Could not clean sent Mixpanel records from " + b10 + ".Re-initializing database.", e);
                                            aVar3.a();
                                            aVar3.close();
                                            e10 = dVar.e(i6, str);
                                            if (e10 != null) {
                                            }
                                            str5 = str2;
                                            str6 = str3;
                                            str7 = str4;
                                            c11 = 0;
                                        }
                                    } catch (SQLiteException e20) {
                                        e = e20;
                                        str4 = str7;
                                        b0.n("MixpanelAPI.Database", "Could not clean sent Mixpanel records from " + b10 + ". Re-initializing database.", e);
                                        aVar3.a();
                                        aVar3.close();
                                        e10 = dVar.e(i6, str);
                                        if (e10 != null) {
                                        }
                                        str5 = str2;
                                        str6 = str3;
                                        str7 = str4;
                                        c11 = 0;
                                    } catch (Exception e21) {
                                        e = e21;
                                        str4 = str7;
                                        b0.n("MixpanelAPI.Database", "Unknown exception. Could not clean sent Mixpanel records from " + b10 + ".Re-initializing database.", e);
                                        aVar3.a();
                                        aVar3.close();
                                        e10 = dVar.e(i6, str);
                                        if (e10 != null) {
                                        }
                                        str5 = str2;
                                        str6 = str3;
                                        str7 = str4;
                                        c11 = 0;
                                    }
                                } catch (Throwable th2) {
                                    aVar3.close();
                                    throw th2;
                                }
                            } catch (SQLiteException e22) {
                                e = e22;
                                str3 = str6;
                            } catch (Exception e23) {
                                e = e23;
                                str3 = str6;
                            }
                            aVar3.close();
                            e10 = dVar.e(i6, str);
                            if (e10 != null) {
                                num = Integer.valueOf(e10[2]);
                            } else {
                                num = num2;
                            }
                            str5 = str2;
                            str6 = str3;
                            str7 = str4;
                            c11 = 0;
                        } else {
                            removeMessages(2, str);
                            long max = Math.max(((long) Math.pow(2.0d, this.f24283d)) * 60000, this.f24282c);
                            this.f24282c = max;
                            this.f24282c = Math.min(max, 600000L);
                            Message obtain = Message.obtain();
                            obtain.what = 2;
                            obtain.obj = str;
                            sendMessageDelayed(obtain, this.f24282c);
                            this.f24283d++;
                            a.a(aVar2, "Retrying this batch of events in " + this.f24282c + " ms");
                            return;
                        }
                    } else {
                        try {
                            String str11 = new String(a10, "UTF-8");
                            if (this.f24283d > 0) {
                                try {
                                    this.f24283d = 0;
                                    removeMessages(2, str);
                                } catch (RemoteService$ServiceUnavailableException e24) {
                                    e = e24;
                                    a.b(aVar2, str7 + str5 + ".", e);
                                    this.f24282c = (long) (e.f10159u * 1000);
                                    z10 = false;
                                    if (z10) {
                                    }
                                } catch (OutOfMemoryError e25) {
                                    e = e25;
                                    z10 = true;
                                    b0.n(str6, "Out of memory when posting to " + str5 + ".", e);
                                    if (z10) {
                                    }
                                } catch (MalformedURLException e26) {
                                    e = e26;
                                    z10 = true;
                                    b0.n(str6, "Cannot interpret " + str5 + " as a URL.", e);
                                    if (z10) {
                                    }
                                } catch (SocketTimeoutException e27) {
                                    e = e27;
                                    a.b(aVar2, str7 + str5 + ".", e);
                                    z10 = false;
                                    if (z10) {
                                    }
                                } catch (IOException e28) {
                                    e = e28;
                                    a.b(aVar2, str7 + str5 + ".", e);
                                    z10 = false;
                                    if (z10) {
                                    }
                                }
                            }
                            a.a(aVar2, "Successfully posted to " + str5 + ": \n" + str9);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Response was ");
                            sb2.append(str11);
                            a.a(aVar2, sb2.toString());
                            z10 = true;
                            if (z10) {
                            }
                        } catch (UnsupportedEncodingException e29) {
                            throw new RuntimeException("UTF not supported on this platform?", e29);
                            break;
                        }
                    }
                }
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                int g5;
                String str6;
                a aVar;
                if (this.f24280a != null) {
                    str = "Queue depth ";
                    str2 = "Flushing queue due to bulk upload limit (";
                    str3 = "Unexpected message received by Mixpanel worker: ";
                } else {
                    lg.d f = lg.d.f(a.this.f24267b);
                    this.f24280a = f;
                    str = "Queue depth ";
                    str2 = "Flushing queue due to bulk upload limit (";
                    f.d(System.currentTimeMillis() - a.this.f24268c.f24292d, 1);
                    str3 = "Unexpected message received by Mixpanel worker: ";
                    this.f24280a.d(System.currentTimeMillis() - a.this.f24268c.f24292d, 2);
                }
                try {
                    int i6 = message.what;
                    int i10 = 3;
                    if (i6 == 0) {
                        e eVar = (e) message.obj;
                        if (!(!eVar.f24272b.has("$distinct_id"))) {
                            i10 = 2;
                        }
                        a.a(a.this, "Queuing people record for sending later");
                        a.a(a.this, "    " + eVar.toString());
                        str5 = eVar.f24271a;
                        g5 = this.f24280a.b(eVar.f24272b, str5, i10);
                        if (!eVar.f24272b.has("$distinct_id")) {
                            g5 = 0;
                        }
                    } else if (i6 == 3) {
                        b bVar = (b) message.obj;
                        a.a(a.this, "Queuing group record for sending later");
                        a.a(a.this, "    " + bVar.toString());
                        str5 = bVar.f24271a;
                        g5 = this.f24280a.b(bVar.f24272b, str5, 4);
                    } else if (i6 == 1) {
                        C0381a c0381a = (C0381a) message.obj;
                        try {
                            JSONObject a10 = a(c0381a);
                            a.a(a.this, "Queuing event for sending later");
                            a.a(a.this, "    " + a10.toString());
                            str6 = c0381a.f24271a;
                            try {
                                str5 = str6;
                                g5 = this.f24280a.b(a10, str6, 1);
                            } catch (JSONException e10) {
                                e = e10;
                                b0.n("MixpanelAPI.Messages", "Exception tracking event " + c0381a.f24269c, e);
                                str5 = str6;
                                g5 = -3;
                                aVar = a.this;
                                if (g5 < aVar.f24268c.f24289a) {
                                }
                                a.a(aVar, str2 + g5 + ") for project " + str5);
                                h.a(h.this);
                                b(this.f24280a, str5);
                            }
                        } catch (JSONException e11) {
                            e = e11;
                            str6 = null;
                        }
                    } else if (i6 == 4) {
                        f fVar = (f) message.obj;
                        String str7 = fVar.f24273b;
                        String str8 = fVar.f24271a;
                        g5 = this.f24280a.g(str8, str7);
                        str5 = str8;
                    } else {
                        if (i6 == 7) {
                            str4 = ((c) message.obj).f24271a;
                            this.f24280a.c(3, str4);
                        } else {
                            if (i6 == 8) {
                                g gVar = (g) message.obj;
                                lg.d dVar = this.f24280a;
                                gVar.getClass();
                                b0.l("MixpanelAPI.Messages", dVar.h(gVar.f24271a) + " stored events were updated with new properties.");
                            } else if (i6 == 2) {
                                a.a(a.this, "Flushing queue due to scheduled or forced flush");
                                h.a(h.this);
                                str4 = (String) message.obj;
                                b(this.f24280a, str4);
                            } else if (i6 == 6) {
                                str4 = ((c) message.obj).f24271a;
                                this.f24280a.c(1, str4);
                                this.f24280a.c(2, str4);
                                this.f24280a.c(4, str4);
                                this.f24280a.c(3, str4);
                            } else if (i6 == 5) {
                                b0.u("MixpanelAPI.Messages", "Worker received a hard kill. Dumping all events and force-killing. Thread id " + Thread.currentThread().getId());
                                synchronized (h.this.f24274a) {
                                    this.f24280a.f24313a.a();
                                    h.this.f24275b = null;
                                    Looper.myLooper().quit();
                                }
                            } else if (i6 == 9) {
                                ca.a.f1((File) message.obj);
                            } else {
                                b0.m("MixpanelAPI.Messages", str3 + message);
                            }
                            str5 = null;
                            g5 = -3;
                        }
                        str5 = str4;
                        g5 = -3;
                    }
                    aVar = a.this;
                    if ((g5 < aVar.f24268c.f24289a || g5 == -2) && this.f24283d <= 0 && str5 != null) {
                        a.a(aVar, str2 + g5 + ") for project " + str5);
                        h.a(h.this);
                        b(this.f24280a, str5);
                    } else if (g5 > 0 && !hasMessages(2, str5)) {
                        a.a(a.this, str + g5 + " - Adding flush in " + this.f24281b);
                        if (this.f24281b >= 0) {
                            Message obtain = Message.obtain();
                            obtain.what = 2;
                            obtain.obj = str5;
                            obtain.arg1 = 1;
                            sendMessageDelayed(obtain, this.f24281b);
                        }
                    }
                } catch (RuntimeException e12) {
                    b0.n("MixpanelAPI.Messages", "Worker threw an unhandled exception", e12);
                    synchronized (h.this.f24274a) {
                        h.this.f24275b = null;
                        try {
                            Looper.myLooper().quit();
                            b0.n("MixpanelAPI.Messages", "Mixpanel will not process any more analytics messages", e12);
                        } catch (Exception e13) {
                            b0.n("MixpanelAPI.Messages", "Could not halt looper", e13);
                        }
                    }
                }
            }
        }

        public h() {
            HandlerThread handlerThread = new HandlerThread("com.mixpanel.android.AnalyticsWorker", 10);
            handlerThread.start();
            this.f24275b = new HandlerC0382a(handlerThread.getLooper());
        }

        public static void a(h hVar) {
            hVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = hVar.f24276c;
            long j11 = 1 + j10;
            long j12 = hVar.f24278e;
            if (j12 > 0) {
                long j13 = ((hVar.f24277d * j10) + (currentTimeMillis - j12)) / j11;
                hVar.f24277d = j13;
                a.a(a.this, "Average send frequency approximately " + (j13 / 1000) + " seconds.");
            }
            hVar.f24278e = currentTimeMillis;
            hVar.f24276c = j11;
        }

        public final void b(Message message) {
            synchronized (this.f24274a) {
                Handler handler = this.f24275b;
                if (handler == null) {
                    a aVar = a.this;
                    a.a(aVar, "Dead mixpanel worker dropping a message: " + message.what);
                } else {
                    handler.sendMessage(message);
                }
            }
        }
    }

    public a(Context context) {
        this.f24267b = context;
        this.f24268c = lg.c.b(context);
        new Thread(new mg.b()).start();
    }

    public static void a(a aVar, String str) {
        aVar.getClass();
        b0.t("MixpanelAPI.Messages", str + " (Thread " + Thread.currentThread().getId() + ")");
    }

    public static void b(a aVar, String str, Exception exc) {
        aVar.getClass();
        String str2 = str + " (Thread " + Thread.currentThread().getId() + ")";
        if (b0.q(2)) {
            Log.v("MixpanelAPI.Messages", str2, exc);
        }
    }
}
