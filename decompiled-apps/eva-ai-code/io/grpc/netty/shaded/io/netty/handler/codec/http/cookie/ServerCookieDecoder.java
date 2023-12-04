package io.grpc.netty.shaded.io.netty.handler.codec.http.cookie;

import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/* loaded from: classes4.dex */
public final class ServerCookieDecoder extends CookieDecoder {
    private static final String RFC2965_DOMAIN = "$Domain";
    private static final String RFC2965_PATH = "$Path";
    private static final String RFC2965_PORT = "$Port";
    private static final String RFC2965_VERSION = "$Version";
    public static final ServerCookieDecoder STRICT = new ServerCookieDecoder(true);
    public static final ServerCookieDecoder LAX = new ServerCookieDecoder(false);

    private ServerCookieDecoder(boolean z) {
        super(z);
    }

    public List<Cookie> decodeAll(String str) {
        ArrayList arrayList = new ArrayList();
        decode(arrayList, str);
        return Collections.unmodifiableList(arrayList);
    }

    public Set<Cookie> decode(String str) {
        TreeSet treeSet = new TreeSet();
        decode(treeSet, str);
        return treeSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
        r9 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
        r5 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
        if (r5 != r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
        r8 = r1;
        r9 = 0;
        r10 = 0;
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
        r6 = r14.indexOf(59, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
        if (r6 <= 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0070, code lost:
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0071, code lost:
        r8 = r1;
        r9 = r5;
        r1 = r6;
        r10 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0085 -> B:8:0x0025). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x008e -> B:8:0x0025). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0096 -> B:8:0x0025). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x009f -> B:8:0x0025). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a1 -> B:8:0x0025). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void decode(Collection<? super Cookie> collection, String str) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        DefaultCookie initCookie;
        int length = ((String) ObjectUtil.checkNotNull(str, "header")).length();
        if (length == 0) {
            return;
        }
        if (!str.regionMatches(true, 0, RFC2965_VERSION, 0, 8)) {
            z = false;
            i = 0;
            while (i != length) {
            }
        }
        z = true;
        int i5 = str.indexOf(59) + 1;
        i = i5;
        while (i != length) {
            char charAt = str.charAt(i);
            if (charAt == '\t' || charAt == '\n' || charAt == 11 || charAt == '\f' || charAt == '\r' || charAt == ' ' || charAt == ',' || charAt == ';') {
                i++;
            } else {
                i5 = i;
                while (true) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 == ';') {
                        i2 = i5;
                        break;
                    } else if (charAt2 == '=') {
                        break;
                    } else {
                        i5++;
                        if (i5 == length) {
                            i2 = length;
                            break;
                        }
                    }
                }
                if ((!z || (!str.regionMatches(i, RFC2965_PATH, 0, 5) && !str.regionMatches(i, RFC2965_DOMAIN, 0, 7) && !str.regionMatches(i, RFC2965_PORT, 0, 5))) && (initCookie = initCookie(str, i, i2, i4, i3)) != null) {
                    collection.add(initCookie);
                }
                i = i5;
                while (i != length) {
                }
            }
        }
    }
}
