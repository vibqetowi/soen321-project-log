package io.sentry;

import java.net.URI;
import java.util.List;
/* loaded from: classes4.dex */
public final class TracingOrigins {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean contain(List<String> list, String str) {
        if (list.isEmpty()) {
            return true;
        }
        for (String str2 : list) {
            if (str.contains(str2) || str.matches(str2)) {
                return true;
            }
            while (r3.hasNext()) {
            }
        }
        return false;
    }

    public static boolean contain(List<String> list, URI uri) {
        return contain(list, uri.toString());
    }
}
