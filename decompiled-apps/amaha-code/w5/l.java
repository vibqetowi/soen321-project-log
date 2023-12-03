package w5;

import com.appsflyer.R;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: FeatureManager.kt */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f36497a = new l();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f36498b = new HashMap();

    /* compiled from: FeatureManager.kt */
    /* loaded from: classes.dex */
    public interface a {
        void e(boolean z10);
    }

    /* compiled from: FeatureManager.kt */
    /* loaded from: classes.dex */
    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        /* JADX INFO: Fake field, exist only in values array */
        Login(262144),
        /* JADX INFO: Fake field, exist only in values array */
        Elora(327680),
        /* JADX INFO: Fake field, exist only in values array */
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        BypassAppSwitch(16973824),
        /* JADX INFO: Fake field, exist only in values array */
        Share(33554432);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f36504u;

        /* compiled from: FeatureManager.kt */
        /* loaded from: classes.dex */
        public static final class a {
            public static b a(int i6) {
                b[] valuesCustom = b.valuesCustom();
                int length = valuesCustom.length;
                int i10 = 0;
                while (i10 < length) {
                    b bVar = valuesCustom[i10];
                    i10++;
                    if (bVar.f36504u == i6) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }
        }

        b(int i6) {
            this.f36504u = i6;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            return (b[]) Arrays.copyOf(values(), 31);
        }

        @Override // java.lang.Enum
        public final String toString() {
            switch (ordinal()) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "AppEventsCloudbridge";
                case 5:
                    return "RestrictiveDataFiltering";
                case 6:
                    return "AAM";
                case 7:
                    return "PrivacyProtection";
                case 8:
                    return "SuggestedEvents";
                case 9:
                    return "IntelligentIntegrity";
                case 10:
                    return "ModelRequest";
                case 11:
                    return "EventDeactivation";
                case 12:
                    return "OnDeviceEventProcessing";
                case 13:
                    return "OnDevicePostInstallEventProcessing";
                case 14:
                    return "IAPLogging";
                case 15:
                    return "IAPLoggingLib2";
                case 16:
                    return "Instrument";
                case 17:
                    return "CrashReport";
                case 18:
                    return "CrashShield";
                case 19:
                    return "ThreadCheck";
                case 20:
                    return "ErrorReport";
                case 21:
                    return "AnrReport";
                case 22:
                    return "Monitoring";
                case 23:
                    return "ServiceUpdateCompliance";
                case 24:
                    return "Megatron";
                case 25:
                    return "Elora";
                case 26:
                    return "LoginKit";
                case 27:
                    return "ChromeCustomTabsPrefetching";
                case 28:
                    return "IgnoreAppSwitchToLoggedOut";
                case 29:
                    return "BypassAppSwitch";
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    public static final void a(a aVar, b bVar) {
        n.c(new m(aVar, bVar));
    }

    public static boolean b(b bVar) {
        boolean z10;
        switch (bVar.ordinal()) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 27:
            case 28:
            case 29:
                z10 = false;
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                z10 = true;
                break;
        }
        n nVar = n.f36507a;
        return n.b(kotlin.jvm.internal.i.n(bVar, "FBSDKFeature"), h5.p.b(), z10);
    }

    public static final boolean c(b feature) {
        b a10;
        kotlin.jvm.internal.i.g(feature, "feature");
        if (b.Unknown == feature) {
            return false;
        }
        if (b.Core == feature) {
            return true;
        }
        String string = h5.p.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(kotlin.jvm.internal.i.n(feature, "FBSDKFeature"), null);
        if (string != null && kotlin.jvm.internal.i.b(string, "16.0.1")) {
            return false;
        }
        int i6 = feature.f36504u;
        if ((i6 & 255) > 0) {
            a10 = b.a.a(i6 & (-256));
        } else if ((65280 & i6) > 0) {
            a10 = b.a.a(i6 & (-65536));
        } else if ((16711680 & i6) > 0) {
            a10 = b.a.a(i6 & (-16777216));
        } else {
            a10 = b.a.a(0);
        }
        if (a10 == feature) {
            return b(feature);
        }
        if (!c(a10) || !b(feature)) {
            return false;
        }
        return true;
    }
}
