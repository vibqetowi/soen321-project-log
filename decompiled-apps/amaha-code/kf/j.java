package kf;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f23324a;

    public static boolean a(Context context) {
        Boolean bool = f23324a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f23324a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e10) {
            df.a d10 = df.a.d();
            d10.a("No perf logcat meta data found " + e10.getMessage());
            return false;
        }
    }

    public static int b(long j10) {
        if (j10 > 2147483647L) {
            return SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        if (j10 < -2147483648L) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        return (int) j10;
    }
}
