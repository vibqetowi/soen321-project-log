package org.apache.http.cookie;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.Serializable;
import java.util.Comparator;
/* loaded from: classes5.dex */
public class CookieIdentityComparator implements Serializable, Comparator<Cookie> {
    private static final long serialVersionUID = 4466565437490631532L;

    @Override // java.util.Comparator
    public int compare(Cookie cookie, Cookie cookie2) {
        int compareTo = cookie.getName().compareTo(cookie2.getName());
        if (compareTo == 0) {
            String domain = cookie.getDomain();
            String str = "";
            if (domain == null) {
                domain = "";
            } else if (domain.indexOf(46) == -1) {
                domain = domain + ".local";
            }
            String domain2 = cookie2.getDomain();
            if (domain2 != null) {
                if (domain2.indexOf(46) == -1) {
                    str = domain2 + ".local";
                } else {
                    str = domain2;
                }
            }
            compareTo = domain.compareToIgnoreCase(str);
        }
        if (compareTo == 0) {
            String path = cookie.getPath();
            String str2 = RemoteSettings.FORWARD_SLASH_STRING;
            if (path == null) {
                path = RemoteSettings.FORWARD_SLASH_STRING;
            }
            String path2 = cookie2.getPath();
            if (path2 != null) {
                str2 = path2;
            }
            return path.compareTo(str2);
        }
        return compareTo;
    }
}
