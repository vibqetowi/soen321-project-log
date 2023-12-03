package q9;

import androidx.annotation.RecentlyNullable;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @RecentlyNullable
    public static Integer a(String str) {
        char c10;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1118317585:
                if (str.equals("REPEAT_ALL_AND_SHUFFLE")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -962896020:
                if (str.equals("REPEAT_SINGLE")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 1645938909:
                if (str.equals("REPEAT_ALL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1645952171:
                if (str.equals("REPEAT_OFF")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 != 3) {
                        return null;
                    }
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }
}
