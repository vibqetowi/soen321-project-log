package w5;
/* compiled from: InstallReferrerUtil.kt */
/* loaded from: classes.dex */
public final class s {

    /* compiled from: InstallReferrerUtil.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    public static final void a() {
        h5.p.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
