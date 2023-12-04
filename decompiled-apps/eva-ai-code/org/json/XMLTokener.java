package org.json;

import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import java.io.Reader;
import java.util.HashMap;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* loaded from: classes5.dex */
public class XMLTokener extends JSONTokener {
    public static final HashMap<String, Character> entity;

    static {
        HashMap<String, Character> hashMap = new HashMap<>(8);
        entity = hashMap;
        hashMap.put("amp", XML.AMP);
        hashMap.put("apos", XML.APOS);
        hashMap.put("gt", XML.GT);
        hashMap.put("lt", XML.LT);
        hashMap.put("quot", XML.QUOT);
    }

    public XMLTokener(Reader reader) {
        super(reader);
    }

    public XMLTokener(String str) {
        super(str);
    }

    public String nextCDATA() throws JSONException {
        StringBuilder sb = new StringBuilder();
        while (more()) {
            sb.append(next());
            int length = sb.length() - 3;
            if (length >= 0 && sb.charAt(length) == ']' && sb.charAt(length + 1) == ']' && sb.charAt(length + 2) == '>') {
                sb.setLength(length);
                return sb.toString();
            }
        }
        throw syntaxError("Unclosed CDATA");
    }

    public Object nextContent() throws JSONException {
        char next;
        do {
            next = next();
        } while (Character.isWhitespace(next));
        if (next == 0) {
            return null;
        }
        if (next == '<') {
            return XML.LT;
        }
        StringBuilder sb = new StringBuilder();
        while (next != 0) {
            if (next == '<') {
                back();
                return sb.toString().trim();
            }
            if (next == '&') {
                sb.append(nextEntity(next));
            } else {
                sb.append(next);
            }
            next = next();
        }
        return sb.toString().trim();
    }

    public Object nextEntity(char c) throws JSONException {
        char next;
        StringBuilder sb = new StringBuilder();
        while (true) {
            next = next();
            if (!Character.isLetterOrDigit(next) && next != '#') {
                break;
            }
            sb.append(Character.toLowerCase(next));
        }
        if (next != ';') {
            throw syntaxError("Missing ';' in XML entity: &" + ((Object) sb));
        }
        return unescapeEntity(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String unescapeEntity(String str) {
        int parseInt;
        if (str == null || str.isEmpty()) {
            return "";
        }
        if (str.charAt(0) == '#') {
            if (str.charAt(1) == 'x' || str.charAt(1) == 'X') {
                parseInt = Integer.parseInt(str.substring(2), 16);
            } else {
                parseInt = Integer.parseInt(str.substring(1));
            }
            return new String(new int[]{parseInt}, 0, 1);
        }
        Character ch = entity.get(str);
        if (ch == null) {
            return "&" + str + ';';
        }
        return ch.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
        return java.lang.Boolean.TRUE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nextMeta() throws JSONException {
        char next;
        char next2;
        do {
            next = next();
        } while (Character.isWhitespace(next));
        if (next == 0) {
            throw syntaxError("Misshaped meta tag");
        }
        if (next != '\'') {
            if (next == '/') {
                return XML.SLASH;
            }
            if (next == '!') {
                return XML.BANG;
            }
            if (next != '\"') {
                switch (next) {
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        return XML.LT;
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        return XML.EQ;
                    case SSL.SSL_PROTOCOL_TLS /* 62 */:
                        return XML.GT;
                    case '?':
                        return XML.QUEST;
                }
                while (true) {
                    char next3 = next();
                    if (Character.isWhitespace(next3)) {
                        return Boolean.TRUE;
                    }
                    if (next3 == 0) {
                        throw syntaxError("Unterminated string");
                    }
                    if (next3 != '\'' && next3 != '/' && next3 != '!' && next3 != '\"') {
                        switch (next3) {
                        }
                    }
                }
            }
        }
        do {
            next2 = next();
            if (next2 == 0) {
                throw syntaxError("Unterminated string");
            }
        } while (next2 != next);
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
        return r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005a, code lost:
        throw syntaxError("Bad character in a name");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nextToken() throws JSONException {
        char next;
        do {
            next = next();
        } while (Character.isWhitespace(next));
        if (next == 0) {
            throw syntaxError("Misshaped element");
        }
        if (next != '\'') {
            if (next == '/') {
                return XML.SLASH;
            }
            if (next == '!') {
                return XML.BANG;
            }
            if (next != '\"') {
                switch (next) {
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        throw syntaxError("Misplaced '<'");
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        return XML.EQ;
                    case SSL.SSL_PROTOCOL_TLS /* 62 */:
                        return XML.GT;
                    case '?':
                        return XML.QUEST;
                    default:
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            sb.append(next);
                            next = next();
                            if (Character.isWhitespace(next)) {
                                return sb.toString();
                            }
                            if (next == 0) {
                                return sb.toString();
                            }
                            if (next != '\'') {
                                if (next != '/' && next != '[' && next != ']' && next != '!') {
                                    if (next == '\"') {
                                        break;
                                    } else {
                                        switch (next) {
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                        }
                        break;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            char next2 = next();
            if (next2 == 0) {
                throw syntaxError("Unterminated string");
            }
            if (next2 == next) {
                return sb2.toString();
            }
            if (next2 == '&') {
                sb2.append(nextEntity(next2));
            } else {
                sb2.append(next2);
            }
        }
    }

    public void skipPast(String str) {
        boolean z;
        char next;
        int length = str.length();
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            char next2 = next();
            if (next2 == 0) {
                return;
            }
            cArr[i] = next2;
        }
        int i2 = 0;
        while (true) {
            int i3 = 0;
            int i4 = i2;
            while (true) {
                if (i3 >= length) {
                    z = true;
                    break;
                } else if (cArr[i4] != str.charAt(i3)) {
                    z = false;
                    break;
                } else {
                    i4++;
                    if (i4 >= length) {
                        i4 -= length;
                    }
                    i3++;
                }
            }
            if (z || (next = next()) == 0) {
                return;
            }
            cArr[i2] = next;
            i2++;
            if (i2 >= length) {
                i2 -= length;
            }
        }
    }
}
