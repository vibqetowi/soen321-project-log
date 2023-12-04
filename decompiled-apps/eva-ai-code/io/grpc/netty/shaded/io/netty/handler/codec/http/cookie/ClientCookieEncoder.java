package io.grpc.netty.shaded.io.netty.handler.codec.http.cookie;

import io.grpc.netty.shaded.io.netty.util.internal.InternalThreadLocalMap;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
/* loaded from: classes4.dex */
public final class ClientCookieEncoder extends CookieEncoder {
    public static final ClientCookieEncoder STRICT = new ClientCookieEncoder(true);
    public static final ClientCookieEncoder LAX = new ClientCookieEncoder(false);
    static final Comparator<Cookie> COOKIE_COMPARATOR = new Comparator<Cookie>() { // from class: io.grpc.netty.shaded.io.netty.handler.codec.http.cookie.ClientCookieEncoder.1
        @Override // java.util.Comparator
        public int compare(Cookie cookie, Cookie cookie2) {
            String path = cookie.path();
            String path2 = cookie2.path();
            return (path2 != null ? path2.length() : Integer.MAX_VALUE) - (path == null ? Integer.MAX_VALUE : path.length());
        }
    };

    private ClientCookieEncoder(boolean z) {
        super(z);
    }

    public String encode(String str, String str2) {
        return encode(new DefaultCookie(str, str2));
    }

    public String encode(Cookie cookie) {
        StringBuilder stringBuilder = CookieUtil.stringBuilder();
        encode(stringBuilder, (Cookie) ObjectUtil.checkNotNull(cookie, "cookie"));
        return CookieUtil.stripTrailingSeparator(stringBuilder);
    }

    public String encode(Cookie... cookieArr) {
        if (((Cookie[]) ObjectUtil.checkNotNull(cookieArr, "cookies")).length == 0) {
            return null;
        }
        StringBuilder stringBuilder = CookieUtil.stringBuilder();
        int i = 0;
        if (this.strict) {
            if (cookieArr.length == 1) {
                encode(stringBuilder, cookieArr[0]);
            } else {
                Cookie[] cookieArr2 = (Cookie[]) Arrays.copyOf(cookieArr, cookieArr.length);
                Arrays.sort(cookieArr2, COOKIE_COMPARATOR);
                int length = cookieArr2.length;
                while (i < length) {
                    encode(stringBuilder, cookieArr2[i]);
                    i++;
                }
            }
        } else {
            int length2 = cookieArr.length;
            while (i < length2) {
                encode(stringBuilder, cookieArr[i]);
                i++;
            }
        }
        return CookieUtil.stripTrailingSeparatorOrNull(stringBuilder);
    }

    public String encode(Collection<? extends Cookie> collection) {
        if (((Collection) ObjectUtil.checkNotNull(collection, "cookies")).isEmpty()) {
            return null;
        }
        StringBuilder stringBuilder = CookieUtil.stringBuilder();
        if (this.strict) {
            if (collection.size() == 1) {
                encode(stringBuilder, collection.iterator().next());
            } else {
                Cookie[] cookieArr = (Cookie[]) collection.toArray(new Cookie[0]);
                Arrays.sort(cookieArr, COOKIE_COMPARATOR);
                for (Cookie cookie : cookieArr) {
                    encode(stringBuilder, cookie);
                }
            }
        } else {
            for (Cookie cookie2 : collection) {
                encode(stringBuilder, cookie2);
            }
        }
        return CookieUtil.stripTrailingSeparatorOrNull(stringBuilder);
    }

    public String encode(Iterable<? extends Cookie> iterable) {
        Iterator it = ((Iterable) ObjectUtil.checkNotNull(iterable, "cookies")).iterator();
        if (it.hasNext()) {
            StringBuilder stringBuilder = CookieUtil.stringBuilder();
            if (this.strict) {
                Cookie cookie = (Cookie) it.next();
                if (!it.hasNext()) {
                    encode(stringBuilder, cookie);
                } else {
                    ArrayList arrayList = InternalThreadLocalMap.get().arrayList();
                    arrayList.add(cookie);
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                    }
                    Cookie[] cookieArr = (Cookie[]) arrayList.toArray(new Cookie[0]);
                    Arrays.sort(cookieArr, COOKIE_COMPARATOR);
                    for (Cookie cookie2 : cookieArr) {
                        encode(stringBuilder, cookie2);
                    }
                }
            } else {
                while (it.hasNext()) {
                    encode(stringBuilder, (Cookie) it.next());
                }
            }
            return CookieUtil.stripTrailingSeparatorOrNull(stringBuilder);
        }
        return null;
    }

    private void encode(StringBuilder sb, Cookie cookie) {
        String name = cookie.name();
        String value = cookie.value() != null ? cookie.value() : "";
        validateCookie(name, value);
        if (cookie.wrap()) {
            CookieUtil.addQuoted(sb, name, value);
        } else {
            CookieUtil.add(sb, name, value);
        }
    }
}
