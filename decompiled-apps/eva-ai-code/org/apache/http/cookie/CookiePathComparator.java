package org.apache.http.cookie;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Serializable;
import java.util.Comparator;
/* loaded from: classes5.dex */
public class CookiePathComparator implements Serializable, Comparator<Cookie> {
    public static final CookiePathComparator INSTANCE = new CookiePathComparator();
    private static final long serialVersionUID = 7523645369616405818L;

    private String normalizePath(Cookie cookie) {
        String path = cookie.getPath();
        if (path == null) {
            path = RemoteSettings.FORWARD_SLASH_STRING;
        }
        if (path.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return path;
        }
        return path + '/';
    }

    @Override // java.util.Comparator
    public int compare(Cookie cookie, Cookie cookie2) {
        String normalizePath = normalizePath(cookie);
        String normalizePath2 = normalizePath(cookie2);
        if (normalizePath.equals(normalizePath2)) {
            return 0;
        }
        if (normalizePath.startsWith(normalizePath2)) {
            return -1;
        }
        return normalizePath2.startsWith(normalizePath) ? 1 : 0;
    }
}
