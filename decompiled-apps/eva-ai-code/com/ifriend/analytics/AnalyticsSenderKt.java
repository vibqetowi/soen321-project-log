package com.ifriend.analytics;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsSender.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u0006*\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¨\u0006\n"}, d2 = {"get", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/analytics/AnalyticsSender;", "", "([Lcom/ifriend/analytics/AnalyticsSender;)Lcom/ifriend/analytics/AnalyticsSender;", "toBundle", "Landroid/os/Bundle;", "", "", "", "analytics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsSenderKt {
    public static final /* synthetic */ <T extends AnalyticsSender> T get(AnalyticsSender[] analyticsSenderArr) {
        T t;
        Intrinsics.checkNotNullParameter(analyticsSenderArr, "<this>");
        int length = analyticsSenderArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                t = null;
                break;
            }
            t = (T) analyticsSenderArr[i];
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (t instanceof AnalyticsSender) {
                break;
            }
            i++;
        }
        Intrinsics.reifiedOperationMarker(1, "T?");
        T t2 = t;
        return t;
    }

    public static final Bundle toBundle(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Pair[] pairArr = (Pair[]) MapsKt.toList(map).toArray(new Pair[0]);
        return BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
