package p9;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Pattern;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f28027a = Pattern.compile("urn:x-cast:[-A-Za-z0-9_]+(\\.[-A-Za-z0-9_]+)*");

    /* renamed from: b  reason: collision with root package name */
    public static final Random f28028b = new Random(SystemClock.elapsedRealtime());

    public static double a(long j10) {
        return j10 / 1000.0d;
    }

    @RecentlyNullable
    public static String b(@RecentlyNonNull JSONObject jSONObject, @RecentlyNonNull String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static long c(double d10) {
        return (long) (d10 * 1000.0d);
    }

    public static void d(@RecentlyNonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            if (str.length() <= 128) {
                if (str.startsWith("urn:x-cast:")) {
                    if (str.length() != 11) {
                        return;
                    }
                    throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\" and have non-empty suffix");
                }
                throw new IllegalArgumentException("Namespace must begin with the prefix \"urn:x-cast:\"");
            }
            throw new IllegalArgumentException("Invalid namespace length");
        }
        throw new IllegalArgumentException("Namespace cannot be null or empty");
    }

    public static <T> boolean e(@RecentlyNonNull T t3, @RecentlyNonNull T t10) {
        if (t3 == null && t10 == null) {
            return true;
        }
        if (t3 != null && t10 != null && t3.equals(t10)) {
            return true;
        }
        return false;
    }

    @RecentlyNonNull
    public static int[] f(@RecentlyNonNull AbstractCollection abstractCollection) {
        int[] iArr = new int[abstractCollection.size()];
        Iterator it = abstractCollection.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            iArr[i6] = ((Integer) it.next()).intValue();
            i6++;
        }
        return iArr;
    }

    @RecentlyNonNull
    public static ArrayList g(@RecentlyNonNull int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i6 : iArr) {
            arrayList.add(Integer.valueOf(i6));
        }
        return arrayList;
    }
}
