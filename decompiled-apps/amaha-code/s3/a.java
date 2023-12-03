package s3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.i;
import s9.g;
import v.h;
import ya.k;
/* compiled from: AndroidContextProvider.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f31252a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f31253b;

    /* renamed from: c  reason: collision with root package name */
    public C0531a f31254c;

    /* compiled from: AndroidContextProvider.kt */
    /* renamed from: s3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0531a {

        /* renamed from: a  reason: collision with root package name */
        public String f31255a;

        /* renamed from: b  reason: collision with root package name */
        public final String f31256b;

        /* renamed from: c  reason: collision with root package name */
        public final String f31257c;

        /* renamed from: d  reason: collision with root package name */
        public final String f31258d;

        /* renamed from: e  reason: collision with root package name */
        public final String f31259e;
        public final String f;

        /* renamed from: g  reason: collision with root package name */
        public final String f31260g;

        /* renamed from: h  reason: collision with root package name */
        public final String f31261h;

        /* renamed from: i  reason: collision with root package name */
        public final String f31262i;

        /* renamed from: j  reason: collision with root package name */
        public final String f31263j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f31264k;

        /* renamed from: l  reason: collision with root package name */
        public String f31265l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ a f31266m;

        /* JADX WARN: Removed duplicated region for block: B:88:0x01c0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C0531a(a this$0) {
            String str;
            Object invoke;
            Object invoke2;
            boolean z10;
            String str2;
            String str3;
            String str4;
            boolean z11;
            String str5;
            boolean z12;
            Object systemService;
            String networkCountryIso;
            Object invoke3;
            Object invoke4;
            Location c10;
            List<Address> fromLocation;
            Object systemService2;
            boolean z13;
            i.g(this$0, "this$0");
            this.f31266m = this$0;
            this.f31264k = true;
            String MANUFACTURER = Build.MANUFACTURER;
            i.f(MANUFACTURER, "MANUFACTURER");
            boolean b10 = i.b("Amazon", MANUFACTURER);
            Context context = this$0.f31252a;
            if (b10) {
                ContentResolver contentResolver = context.getContentResolver();
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f31264k = z13;
                str = Settings.Secure.getString(contentResolver, "advertising_id");
                this.f31255a = str;
            } else {
                try {
                    invoke = g9.a.class.getMethod("a", Context.class).invoke(null, context);
                    invoke2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                } catch (ClassNotFoundException unused) {
                    if (h.a(2, 3) <= 0) {
                        Log.w("Amplitude", "Google Play Services SDK not found for advertising id!");
                    }
                } catch (InvocationTargetException unused2) {
                    if (h.a(2, 3) <= 0) {
                        Log.w("Amplitude", "Google Play Services not available for advertising id");
                    }
                } catch (Exception unused3) {
                    if (h.a(2, 4) <= 0) {
                        Log.e("Amplitude", "Encountered an error connecting to Google Play Services for advertising id");
                    }
                }
                if (invoke2 != null) {
                    if (((Boolean) invoke2).booleanValue()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f31264k = z10;
                    Object invoke5 = invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
                    if (invoke5 != null) {
                        this.f31255a = (String) invoke5;
                        str = this.f31255a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                }
            }
            this.f31255a = str;
            a aVar = this.f31266m;
            try {
                PackageInfo packageInfo = aVar.f31252a.getPackageManager().getPackageInfo(aVar.f31252a.getPackageName(), 0);
                i.f(packageInfo, "context.packageManager.g…o(context.packageName, 0)");
                str2 = packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException | Exception unused4) {
                str2 = null;
            }
            this.f31257c = str2;
            this.f31258d = "android";
            String RELEASE = Build.VERSION.RELEASE;
            i.f(RELEASE, "RELEASE");
            this.f31259e = RELEASE;
            String BRAND = Build.BRAND;
            i.f(BRAND, "BRAND");
            this.f = BRAND;
            String MANUFACTURER2 = Build.MANUFACTURER;
            i.f(MANUFACTURER2, "MANUFACTURER");
            this.f31260g = MANUFACTURER2;
            String MODEL = Build.MODEL;
            i.f(MODEL, "MODEL");
            this.f31261h = MODEL;
            try {
                systemService2 = this.f31266m.f31252a.getSystemService("phone");
            } catch (Exception unused5) {
                str3 = null;
            }
            if (systemService2 != null) {
                str3 = ((TelephonyManager) systemService2).getNetworkOperatorName();
                this.f31262i = str3;
                a aVar2 = this.f31266m;
                if (aVar2.f31253b && (c10 = aVar2.c()) != null) {
                    try {
                        if (Geocoder.isPresent() && (fromLocation = aVar2.b().getFromLocation(c10.getLatitude(), c10.getLongitude(), 1)) != null) {
                            for (Address address : fromLocation) {
                                if (address != null) {
                                    str4 = address.getCountryCode();
                                    break;
                                }
                            }
                        }
                    } catch (IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException | SecurityException unused6) {
                    }
                }
                str4 = null;
                if (str4 != null && str4.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    try {
                        systemService = aVar2.f31252a.getSystemService("phone");
                    } catch (Exception unused7) {
                    }
                    if (systemService != null) {
                        TelephonyManager telephonyManager = (TelephonyManager) systemService;
                        if (telephonyManager.getPhoneType() != 2 && (networkCountryIso = telephonyManager.getNetworkCountryIso()) != null) {
                            Locale US = Locale.US;
                            i.f(US, "US");
                            str5 = networkCountryIso.toUpperCase(US);
                            i.f(str5, "(this as java.lang.String).toUpperCase(locale)");
                            if (str5 == null && str5.length() != 0) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (z12) {
                                str5 = a().getCountry();
                                i.f(str5, "locale.country");
                            }
                            str4 = str5;
                        }
                        str5 = null;
                        if (str5 == null) {
                        }
                        z12 = true;
                        if (z12) {
                        }
                        str4 = str5;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                    }
                }
                this.f31256b = str4;
                String language = a().getLanguage();
                i.f(language, "locale.language");
                this.f31263j = language;
                try {
                    int i6 = g.f31340e;
                    invoke4 = g.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, this.f31266m.f31252a);
                } catch (ClassNotFoundException unused8) {
                    if (h.a(2, 3) <= 0) {
                        Log.w("Amplitude", "Google Play Services Util not found!");
                    }
                } catch (IllegalAccessException unused9) {
                    if (h.a(2, 3) <= 0) {
                        Log.w("Amplitude", "Google Play Services not available");
                    }
                } catch (Exception e10) {
                    String message = i.n(e10, "Error when checking for Google Play Services: ");
                    i.g(message, "message");
                    if (h.a(2, 3) <= 0) {
                        Log.w("Amplitude", message);
                    }
                } catch (NoClassDefFoundError unused10) {
                    if (h.a(2, 3) <= 0) {
                        Log.w("Amplitude", "Google Play Services Util not found!");
                    }
                } catch (NoSuchMethodException unused11) {
                    if (h.a(2, 3) <= 0) {
                        Log.w("Amplitude", "Google Play Services not available");
                    }
                } catch (InvocationTargetException unused12) {
                    if (h.a(2, 3) <= 0) {
                        Log.w("Amplitude", "Google Play Services not available");
                    }
                }
                if (invoke4 != null) {
                    ((Integer) invoke4).intValue();
                    try {
                        Object invoke6 = Class.forName("com.google.android.gms.appset.AppSet").getMethod("getClient", Context.class).invoke(null, this.f31266m.f31252a);
                        Object invoke7 = k.class.getMethod("a", ya.h.class).invoke(null, invoke6.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(invoke6, new Object[0]));
                        invoke3 = invoke7.getClass().getMethod("getId", new Class[0]).invoke(invoke7, new Object[0]);
                    } catch (ClassNotFoundException unused13) {
                        if (h.a(2, 3) <= 0) {
                            Log.w("Amplitude", "Google Play Services SDK not found for app set id!");
                        }
                    } catch (InvocationTargetException unused14) {
                        if (h.a(2, 3) <= 0) {
                            Log.w("Amplitude", "Google Play Services not available for app set id");
                        }
                    } catch (Exception unused15) {
                        if (h.a(2, 4) <= 0) {
                            Log.e("Amplitude", "Encountered an error connecting to Google Play Services for app set id");
                        }
                    }
                    if (invoke3 != null) {
                        this.f31265l = (String) invoke3;
                        this.f31265l = this.f31265l;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
        }

        public static Locale a() {
            LocaleList locales;
            boolean isEmpty;
            Locale locale;
            Configuration configuration = Resources.getSystem().getConfiguration();
            if (Build.VERSION.SDK_INT >= 24) {
                locales = configuration.getLocales();
                i.f(locales, "configuration.locales");
                isEmpty = locales.isEmpty();
                if (!isEmpty) {
                    locale = locales.get(0);
                    i.f(locale, "localeList.get(0)");
                    return locale;
                }
                Locale locale2 = Locale.getDefault();
                i.f(locale2, "getDefault()");
                return locale2;
            }
            Locale locale3 = configuration.locale;
            i.f(locale3, "configuration.locale");
            return locale3;
        }
    }

    public a(boolean z10, Context context) {
        i.g(context, "context");
        this.f31252a = context;
        this.f31253b = true;
        this.f31253b = z10;
    }

    public final C0531a a() {
        if (this.f31254c == null) {
            this.f31254c = new C0531a(this);
        }
        return this.f31254c;
    }

    public final Geocoder b() {
        return new Geocoder(this.f31252a, Locale.ENGLISH);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Location c() {
        boolean z10;
        List<String> list;
        Location location;
        Location location2 = null;
        if (!this.f31253b) {
            return null;
        }
        Context context = this.f31252a;
        if (!b0.h(context, "android.permission.ACCESS_COARSE_LOCATION") && !b0.h(context, "android.permission.ACCESS_FINE_LOCATION")) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return null;
        }
        Object systemService = context.getSystemService("location");
        if (systemService != null) {
            LocationManager locationManager = (LocationManager) systemService;
            try {
                list = locationManager.getProviders(true);
            } catch (SecurityException | Exception unused) {
                list = null;
            }
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                try {
                    i.d(str);
                    location = locationManager.getLastKnownLocation(str);
                } catch (SecurityException unused2) {
                    if (h.a(2, 3) <= 0) {
                        Log.w("Amplitude", "Failed to get most recent location");
                    }
                    location = null;
                    if (location != null) {
                    }
                } catch (Exception unused3) {
                    if (h.a(2, 3) <= 0) {
                        Log.w("Amplitude", "Failed to get most recent location");
                    }
                    location = null;
                    if (location != null) {
                    }
                }
                if (location != null) {
                    arrayList.add(location);
                }
            }
            Iterator it = arrayList.iterator();
            long j10 = -1;
            while (it.hasNext()) {
                Location location3 = (Location) it.next();
                if (location3.getTime() > j10) {
                    j10 = location3.getTime();
                    location2 = location3;
                }
            }
            return location2;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }
}
