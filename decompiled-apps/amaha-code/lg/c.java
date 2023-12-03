package lg;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.theinnerhour.b2b.utils.Constants;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.b0;
/* compiled from: MPConfig.java */
/* loaded from: classes.dex */
public final class c {
    public static boolean r = false;

    /* renamed from: s  reason: collision with root package name */
    public static c f24287s;

    /* renamed from: t  reason: collision with root package name */
    public static final Object f24288t = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final int f24289a;

    /* renamed from: b  reason: collision with root package name */
    public final int f24290b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24291c;

    /* renamed from: d  reason: collision with root package name */
    public final long f24292d;

    /* renamed from: e  reason: collision with root package name */
    public final int f24293e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f24294g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f24295h;

    /* renamed from: i  reason: collision with root package name */
    public String f24296i;

    /* renamed from: j  reason: collision with root package name */
    public String f24297j;

    /* renamed from: k  reason: collision with root package name */
    public String f24298k;

    /* renamed from: l  reason: collision with root package name */
    public final int f24299l;

    /* renamed from: m  reason: collision with root package name */
    public final int f24300m;

    /* renamed from: n  reason: collision with root package name */
    public final int f24301n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f24302o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f24303p;

    /* renamed from: q  reason: collision with root package name */
    public final SSLSocketFactory f24304q;

    /* JADX WARN: Removed duplicated region for block: B:30:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(Bundle bundle) {
        long floatValue;
        String string;
        String string2;
        String string3;
        SSLSocketFactory sSLSocketFactory = null;
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            sSLSocketFactory = sSLContext.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            if (b0.q(4)) {
                Log.i("MixpanelAPI.Conf", "System has no SSL support. Built-in events editor will not be available", e10);
            }
        }
        this.f24304q = sSLSocketFactory;
        boolean z10 = bundle.getBoolean("com.mixpanel.android.MPConfig.EnableDebugLogging", false);
        r = z10;
        if (z10) {
            b0.U = 2;
        }
        if (bundle.containsKey("com.mixpanel.android.MPConfig.DebugFlushInterval")) {
            b0.u("MixpanelAPI.Conf", "We do not support com.mixpanel.android.MPConfig.DebugFlushInterval anymore. There will only be one flush interval. Please, update your AndroidManifest.xml.");
        }
        this.f24289a = bundle.getInt("com.mixpanel.android.MPConfig.BulkUploadLimit", 40);
        this.f24290b = bundle.getInt("com.mixpanel.android.MPConfig.FlushInterval", 60000);
        this.f24299l = bundle.getInt("com.mixpanel.android.MPConfig.FlushBatchSize", 50);
        this.f24291c = bundle.getBoolean("com.mixpanel.android.MPConfig.FlushOnBackground", true);
        this.f24293e = bundle.getInt("com.mixpanel.android.MPConfig.MinimumDatabaseLimit", 20971520);
        this.f = bundle.getInt("com.mixpanel.android.MPConfig.MaximumDatabaseLimit", SubsamplingScaleImageView.TILE_SIZE_AUTO);
        bundle.getString("com.mixpanel.android.MPConfig.ResourcePackageName");
        this.f24294g = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableAppOpenEvent", true);
        this.f24295h = bundle.getBoolean("com.mixpanel.android.MPConfig.DisableExceptionHandler", false);
        this.f24300m = bundle.getInt("com.mixpanel.android.MPConfig.MinimumSessionDuration", Constants.TIMEOUT_MS);
        this.f24301n = bundle.getInt("com.mixpanel.android.MPConfig.SessionTimeoutDuration", SubsamplingScaleImageView.TILE_SIZE_AUTO);
        this.f24302o = bundle.getBoolean("com.mixpanel.android.MPConfig.UseIpAddressForGeolocation", true);
        this.f24303p = bundle.getBoolean("com.mixpanel.android.MPConfig.RemoveLegacyResidualFiles", false);
        Object obj = bundle.get("com.mixpanel.android.MPConfig.DataExpiration");
        if (obj != null) {
            try {
                if (obj instanceof Integer) {
                    floatValue = ((Integer) obj).intValue();
                } else if (obj instanceof Float) {
                    floatValue = ((Float) obj).floatValue();
                } else {
                    throw new NumberFormatException(obj.toString() + " is not a number.");
                }
            } catch (Exception e11) {
                b0.n("MixpanelAPI.Conf", "Error parsing com.mixpanel.android.MPConfig.DataExpiration meta-data value", e11);
            }
            this.f24292d = floatValue;
            boolean z11 = !bundle.containsKey("com.mixpanel.android.MPConfig.UseIpAddressForGeolocation");
            string = bundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
            if (string == null) {
                this.f24296i = z11 ? string : a(string, this.f24302o);
            } else {
                this.f24296i = a("https://api.mixpanel.com/track/", this.f24302o);
            }
            string2 = bundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
            if (string2 == null) {
                this.f24297j = z11 ? string2 : a(string2, this.f24302o);
            } else {
                this.f24297j = a("https://api.mixpanel.com/engage/", this.f24302o);
            }
            string3 = bundle.getString("com.mixpanel.android.MPConfig.GroupsEndpoint");
            if (string3 == null) {
                this.f24298k = z11 ? string3 : a(string3, this.f24302o);
            } else {
                this.f24298k = a("https://api.mixpanel.com/groups/", this.f24302o);
            }
            b0.t("MixpanelAPI.Conf", toString());
        }
        floatValue = 432000000;
        this.f24292d = floatValue;
        boolean z112 = !bundle.containsKey("com.mixpanel.android.MPConfig.UseIpAddressForGeolocation");
        string = bundle.getString("com.mixpanel.android.MPConfig.EventsEndpoint");
        if (string == null) {
        }
        string2 = bundle.getString("com.mixpanel.android.MPConfig.PeopleEndpoint");
        if (string2 == null) {
        }
        string3 = bundle.getString("com.mixpanel.android.MPConfig.GroupsEndpoint");
        if (string3 == null) {
        }
        b0.t("MixpanelAPI.Conf", toString());
    }

    public static String a(String str, boolean z10) {
        String str2 = "1";
        if (str.contains("?ip=")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(0, str.indexOf("?ip=")));
            sb2.append("?ip=");
            if (!z10) {
                str2 = "0";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder d10 = v.g.d(str, "?ip=");
        if (!z10) {
            str2 = "0";
        }
        d10.append(str2);
        return d10.toString();
    }

    public static c b(Context context) {
        synchronized (f24288t) {
            if (f24287s == null) {
                f24287s = d(context.getApplicationContext());
            }
        }
        return f24287s;
    }

    public static c d(Context context) {
        String packageName = context.getPackageName();
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
            return new c(bundle);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException(defpackage.c.r("Can't configure Mixpanel with package name ", packageName), e10);
        }
    }

    public final synchronized SSLSocketFactory c() {
        return this.f24304q;
    }

    public final String toString() {
        return "Mixpanel (7.3.0) configured with:\n    TrackAutomaticEvents: true\n    BulkUploadLimit " + this.f24289a + "\n    FlushInterval " + this.f24290b + "\n    FlushInterval " + this.f24299l + "\n    DataExpiration " + this.f24292d + "\n    MinimumDatabaseLimit " + this.f24293e + "\n    MaximumDatabaseLimit " + this.f + "\n    DisableAppOpenEvent " + this.f24294g + "\n    EnableDebugLogging " + r + "\n    EventsEndpoint " + this.f24296i + "\n    PeopleEndpoint " + this.f24297j + "\n    MinimumSessionDuration: " + this.f24300m + "\n    SessionTimeoutDuration: " + this.f24301n + "\n    DisableExceptionHandler: " + this.f24295h + "\n    FlushOnBackground: " + this.f24291c;
    }
}
