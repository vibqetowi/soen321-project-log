package nd;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;
/* compiled from: IdManager.java */
/* loaded from: classes.dex */
public final class h0 implements i0 {

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f26065g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h  reason: collision with root package name */
    public static final String f26066h = Pattern.quote("/");

    /* renamed from: a  reason: collision with root package name */
    public final s5 f26067a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f26068b;

    /* renamed from: c  reason: collision with root package name */
    public final String f26069c;

    /* renamed from: d  reason: collision with root package name */
    public final se.d f26070d;

    /* renamed from: e  reason: collision with root package name */
    public final d0 f26071e;
    public String f;

    public h0(Context context, String str, se.d dVar, d0 d0Var) {
        if (str != null) {
            this.f26068b = context;
            this.f26069c = str;
            this.f26070d = dVar;
            this.f26071e = d0Var;
            this.f26067a = new s5(5);
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    public static String b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String uuid = UUID.randomUUID().toString();
        if (uuid == null) {
            lowerCase = null;
        } else {
            lowerCase = f26065g.matcher(uuid).replaceAll("").toLowerCase(Locale.US);
        }
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized String c() {
        String str;
        String str2 = this.f;
        if (str2 != null) {
            return str2;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Determining Crashlytics installation ID...", null);
        }
        boolean z10 = false;
        SharedPreferences sharedPreferences = this.f26068b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        String str3 = "Cached Firebase Installation ID: " + string;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str3, null);
        }
        if (this.f26071e.a()) {
            try {
                str = (String) o0.a(this.f26070d.getId());
            } catch (Exception e10) {
                Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", e10);
                str = null;
            }
            String str4 = "Fetched Firebase Installation ID: " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str4, null);
            }
            if (str == null) {
                if (string == null) {
                    str = b();
                } else {
                    str = string;
                }
            }
            if (str.equals(string)) {
                this.f = sharedPreferences.getString("crashlytics.installation.id", null);
            } else {
                this.f = a(sharedPreferences, str);
            }
        } else {
            if (string != null && string.startsWith("SYN_")) {
                z10 = true;
            }
            if (z10) {
                this.f = sharedPreferences.getString("crashlytics.installation.id", null);
            } else {
                this.f = a(sharedPreferences, b());
            }
        }
        if (this.f == null) {
            Log.w("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", null);
            this.f = a(sharedPreferences, b());
        }
        String str5 = "Crashlytics installation ID: " + this.f;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str5, null);
        }
        return this.f;
    }

    public final String d() {
        String str;
        s5 s5Var = this.f26067a;
        Context context = this.f26068b;
        synchronized (s5Var) {
            if (s5Var.f8126v == null) {
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (installerPackageName == null) {
                    installerPackageName = "";
                }
                s5Var.f8126v = installerPackageName;
            }
            if ("".equals(s5Var.f8126v)) {
                str = null;
            } else {
                str = s5Var.f8126v;
            }
        }
        return str;
    }
}
