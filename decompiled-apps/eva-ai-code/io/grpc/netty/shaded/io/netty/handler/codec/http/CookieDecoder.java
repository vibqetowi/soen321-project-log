package io.grpc.netty.shaded.io.netty.handler.codec.http;

import io.grpc.netty.shaded.io.netty.handler.codec.DateFormatter;
import io.grpc.netty.shaded.io.netty.handler.codec.http.cookie.CookieHeaderNames;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLogger;
import io.grpc.netty.shaded.io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
@Deprecated
/* loaded from: classes4.dex */
public final class CookieDecoder {
    private static final String COMMENT = "Comment";
    private static final String COMMENTURL = "CommentURL";
    private static final String DISCARD = "Discard";
    private static final String PORT = "Port";
    private static final String VERSION = "Version";
    private final InternalLogger logger = InternalLoggerFactory.getInstance(getClass());
    private final boolean strict;
    private static final CookieDecoder STRICT = new CookieDecoder(true);
    private static final CookieDecoder LAX = new CookieDecoder(false);

    public static Set<Cookie> decode(String str) {
        return decode(str, true);
    }

    public static Set<Cookie> decode(String str, boolean z) {
        return (z ? STRICT : LAX).doDecode(str);
    }

    private Set<Cookie> doDecode(String str) {
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        ArrayList arrayList3 = new ArrayList(8);
        ArrayList arrayList4 = new ArrayList(8);
        extractKeyValuePairs(str, arrayList3, arrayList4);
        if (arrayList3.isEmpty()) {
            return Collections.emptySet();
        }
        boolean z2 = false;
        if (((String) arrayList3.get(0)).equalsIgnoreCase(VERSION)) {
            try {
                i = Integer.parseInt((String) arrayList4.get(0));
            } catch (NumberFormatException unused) {
                i = 0;
            }
            i2 = 1;
        } else {
            i = 0;
            i2 = 0;
        }
        if (arrayList3.size() <= i2) {
            return Collections.emptySet();
        }
        TreeSet treeSet = new TreeSet();
        while (i2 < arrayList3.size()) {
            String str2 = (String) arrayList3.get(i2);
            String str3 = (String) arrayList4.get(i2);
            if (str3 == null) {
                str3 = "";
            }
            DefaultCookie initCookie = initCookie(str2, str3);
            if (initCookie == null) {
                break;
            }
            ArrayList arrayList5 = new ArrayList(2);
            int i3 = i2 + 1;
            String str4 = null;
            boolean z3 = z2;
            boolean z4 = z3;
            TreeSet treeSet2 = treeSet;
            String str5 = null;
            long j = Long.MIN_VALUE;
            String str6 = null;
            String str7 = null;
            while (true) {
                if (i3 >= arrayList3.size()) {
                    arrayList = arrayList3;
                    arrayList2 = arrayList4;
                    z = z2;
                    break;
                }
                String str8 = (String) arrayList3.get(i3);
                arrayList = arrayList3;
                String str9 = (String) arrayList4.get(i3);
                arrayList2 = arrayList4;
                if (DISCARD.equalsIgnoreCase(str8)) {
                    z2 = true;
                } else if (CookieHeaderNames.SECURE.equalsIgnoreCase(str8)) {
                    z3 = true;
                } else if (CookieHeaderNames.HTTPONLY.equalsIgnoreCase(str8)) {
                    z4 = true;
                } else if (COMMENT.equalsIgnoreCase(str8)) {
                    str4 = str9;
                } else if (COMMENTURL.equalsIgnoreCase(str8)) {
                    str6 = str9;
                } else if (CookieHeaderNames.DOMAIN.equalsIgnoreCase(str8)) {
                    str7 = str9;
                } else if (CookieHeaderNames.PATH.equalsIgnoreCase(str8)) {
                    str5 = str9;
                } else {
                    if ("Expires".equalsIgnoreCase(str8)) {
                        Date parseHttpDate = DateFormatter.parseHttpDate(str9);
                        if (parseHttpDate != null) {
                            long time = parseHttpDate.getTime() - System.currentTimeMillis();
                            z = z2;
                            j = (time / 1000) + (time % 1000 != 0 ? 1 : 0);
                        } else {
                            z = z2;
                        }
                    } else {
                        z = z2;
                        if (CookieHeaderNames.MAX_AGE.equalsIgnoreCase(str8)) {
                            j = Integer.parseInt(str9);
                        } else if (VERSION.equalsIgnoreCase(str8)) {
                            i = Integer.parseInt(str9);
                        } else if (!PORT.equalsIgnoreCase(str8)) {
                            break;
                        } else {
                            String[] split = str9.split(",");
                            int length = split.length;
                            int i4 = 0;
                            while (i4 < length) {
                                String[] strArr = split;
                                try {
                                    arrayList5.add(Integer.valueOf(split[i4]));
                                } catch (NumberFormatException unused2) {
                                }
                                i4++;
                                split = strArr;
                            }
                        }
                    }
                    z2 = z;
                }
                i3++;
                i2++;
                arrayList4 = arrayList2;
                arrayList3 = arrayList;
            }
            initCookie.setVersion(i);
            initCookie.setMaxAge(j);
            initCookie.setPath(str5);
            initCookie.setDomain(str7);
            initCookie.setSecure(z3);
            initCookie.setHttpOnly(z4);
            if (i > 0) {
                initCookie.setComment(str4);
            }
            if (i > 1) {
                initCookie.setCommentUrl(str6);
                initCookie.setPorts(arrayList5);
                initCookie.setDiscard(z);
            }
            treeSet2.add(initCookie);
            i2++;
            treeSet = treeSet2;
            arrayList4 = arrayList2;
            arrayList3 = arrayList;
            z2 = false;
        }
        return treeSet;
    }

    private static void extractKeyValuePairs(String str, List<String> list, List<String> list2) {
        String substring;
        String str2;
        String sb;
        String substring2;
        int length = str.length();
        int i = 0;
        while (i != length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != ',' && charAt != ';') {
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        while (i != length) {
                            if (str.charAt(i) == '$') {
                                i++;
                            } else {
                                String str3 = null;
                                if (i == length) {
                                    str2 = null;
                                } else {
                                    int i2 = i;
                                    while (true) {
                                        char charAt2 = str.charAt(i2);
                                        if (charAt2 == ';') {
                                            substring = str.substring(i, i2);
                                        } else if (charAt2 != '=') {
                                            i2++;
                                            if (i2 == length) {
                                                substring = str.substring(i);
                                            }
                                        } else {
                                            String substring3 = str.substring(i, i2);
                                            int i3 = i2 + 1;
                                            if (i3 == length) {
                                                sb = "";
                                            } else {
                                                char charAt3 = str.charAt(i3);
                                                if (charAt3 == '\"' || charAt3 == '\'') {
                                                    StringBuilder sb2 = new StringBuilder(str.length() - i3);
                                                    i3++;
                                                    while (true) {
                                                        boolean z = false;
                                                        while (i3 != length) {
                                                            if (z) {
                                                                int i4 = i3 + 1;
                                                                char charAt4 = str.charAt(i3);
                                                                if (charAt4 == '\"' || charAt4 == '\'' || charAt4 == '\\') {
                                                                    sb2.setCharAt(sb2.length() - 1, charAt4);
                                                                } else {
                                                                    sb2.append(charAt4);
                                                                }
                                                                i3 = i4;
                                                            } else {
                                                                int i5 = i3 + 1;
                                                                char charAt5 = str.charAt(i3);
                                                                if (charAt5 == charAt3) {
                                                                    str2 = sb2.toString();
                                                                    str3 = substring3;
                                                                    i = i5;
                                                                } else {
                                                                    sb2.append(charAt5);
                                                                    if (charAt5 == '\\') {
                                                                        z = true;
                                                                    }
                                                                    i3 = i5;
                                                                }
                                                            }
                                                        }
                                                        sb = sb2.toString();
                                                    }
                                                } else {
                                                    i = str.indexOf(59, i3);
                                                    if (i > 0) {
                                                        substring2 = str.substring(i3, i);
                                                    } else {
                                                        substring2 = str.substring(i3);
                                                        i = length;
                                                    }
                                                    str2 = substring2;
                                                    str3 = substring3;
                                                }
                                            }
                                            str2 = sb;
                                            i = i3;
                                            str3 = substring3;
                                        }
                                    }
                                    str2 = null;
                                    str3 = substring;
                                    i = i2;
                                }
                                list.add(str3);
                                list2.add(str2);
                                continue;
                            }
                        }
                        return;
                }
            }
            i++;
        }
    }

    private CookieDecoder(boolean z) {
        this.strict = z;
    }

    private DefaultCookie initCookie(String str, String str2) {
        int firstInvalidCookieValueOctet;
        int firstInvalidCookieNameOctet;
        if (str == null || str.length() == 0) {
            this.logger.debug("Skipping cookie with null name");
            return null;
        } else if (str2 == null) {
            this.logger.debug("Skipping cookie with null value");
            return null;
        } else {
            CharSequence unwrapValue = CookieUtil.unwrapValue(str2);
            if (unwrapValue == null) {
                this.logger.debug("Skipping cookie because starting quotes are not properly balanced in '{}'", unwrapValue);
                return null;
            } else if (this.strict && (firstInvalidCookieNameOctet = CookieUtil.firstInvalidCookieNameOctet(str)) >= 0) {
                if (this.logger.isDebugEnabled()) {
                    this.logger.debug("Skipping cookie because name '{}' contains invalid char '{}'", str, Character.valueOf(str.charAt(firstInvalidCookieNameOctet)));
                }
                return null;
            } else {
                boolean z = unwrapValue.length() != str2.length();
                if (this.strict && (firstInvalidCookieValueOctet = CookieUtil.firstInvalidCookieValueOctet(unwrapValue)) >= 0) {
                    if (this.logger.isDebugEnabled()) {
                        this.logger.debug("Skipping cookie because value '{}' contains invalid char '{}'", unwrapValue, Character.valueOf(unwrapValue.charAt(firstInvalidCookieValueOctet)));
                    }
                    return null;
                }
                DefaultCookie defaultCookie = new DefaultCookie(str, unwrapValue.toString());
                defaultCookie.setWrap(z);
                return defaultCookie;
            }
        }
    }
}
