package org.apache.http.client.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.ContentType;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.ParserCursor;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
/* loaded from: classes5.dex */
public class URLEncodedUtils {
    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String NAME_VALUE_SEPARATOR = "=";
    private static final BitSet PATHSAFE;
    private static final char PATH_SEPARATOR = '/';
    private static final BitSet PATH_SEPARATORS;
    private static final BitSet PATH_SPECIAL;
    private static final BitSet PUNCT;
    private static final char QP_SEP_A = '&';
    private static final char QP_SEP_S = ';';
    private static final int RADIX = 16;
    private static final BitSet RESERVED;
    private static final BitSet UNRESERVED;
    private static final BitSet URIC;
    private static final BitSet URLENCODER;
    private static final BitSet USERINFO;

    static {
        BitSet bitSet = new BitSet(256);
        PATH_SEPARATORS = bitSet;
        bitSet.set(47);
        UNRESERVED = new BitSet(256);
        PUNCT = new BitSet(256);
        USERINFO = new BitSet(256);
        PATHSAFE = new BitSet(256);
        URIC = new BitSet(256);
        RESERVED = new BitSet(256);
        URLENCODER = new BitSet(256);
        PATH_SPECIAL = new BitSet(256);
        for (int i = 97; i <= 122; i++) {
            UNRESERVED.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            UNRESERVED.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            UNRESERVED.set(i3);
        }
        BitSet bitSet2 = UNRESERVED;
        bitSet2.set(95);
        bitSet2.set(45);
        bitSet2.set(46);
        bitSet2.set(42);
        URLENCODER.or(bitSet2);
        bitSet2.set(33);
        bitSet2.set(WebSocketProtocol.PAYLOAD_SHORT);
        bitSet2.set(39);
        bitSet2.set(40);
        bitSet2.set(41);
        BitSet bitSet3 = PUNCT;
        bitSet3.set(44);
        bitSet3.set(59);
        bitSet3.set(58);
        bitSet3.set(36);
        bitSet3.set(38);
        bitSet3.set(43);
        bitSet3.set(61);
        BitSet bitSet4 = USERINFO;
        bitSet4.or(bitSet2);
        bitSet4.or(bitSet3);
        BitSet bitSet5 = PATHSAFE;
        bitSet5.or(bitSet2);
        bitSet5.set(59);
        bitSet5.set(58);
        bitSet5.set(64);
        bitSet5.set(38);
        bitSet5.set(61);
        bitSet5.set(43);
        bitSet5.set(36);
        bitSet5.set(44);
        BitSet bitSet6 = PATH_SPECIAL;
        bitSet6.or(bitSet5);
        bitSet6.set(47);
        BitSet bitSet7 = RESERVED;
        bitSet7.set(59);
        bitSet7.set(47);
        bitSet7.set(63);
        bitSet7.set(58);
        bitSet7.set(64);
        bitSet7.set(38);
        bitSet7.set(61);
        bitSet7.set(43);
        bitSet7.set(36);
        bitSet7.set(44);
        bitSet7.set(91);
        bitSet7.set(93);
        BitSet bitSet8 = URIC;
        bitSet8.or(bitSet7);
        bitSet8.or(bitSet2);
    }

    @Deprecated
    public static List<NameValuePair> parse(URI uri, String str) {
        return parse(uri, str != null ? Charset.forName(str) : null);
    }

    public static List<NameValuePair> parse(URI uri, Charset charset) {
        Args.notNull(uri, "URI");
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && !rawQuery.isEmpty()) {
            return parse(rawQuery, charset);
        }
        return createEmptyList();
    }

    public static List<NameValuePair> parse(HttpEntity httpEntity) throws IOException {
        Args.notNull(httpEntity, "HTTP entity");
        ContentType contentType = ContentType.get(httpEntity);
        if (contentType == null || !contentType.getMimeType().equalsIgnoreCase("application/x-www-form-urlencoded")) {
            return createEmptyList();
        }
        long contentLength = httpEntity.getContentLength();
        Args.check(contentLength <= 2147483647L, "HTTP entity is too large");
        Charset charset = contentType.getCharset() != null ? contentType.getCharset() : HTTP.DEF_CONTENT_CHARSET;
        InputStream content = httpEntity.getContent();
        if (content == null) {
            return createEmptyList();
        }
        try {
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(contentLength > 0 ? (int) contentLength : 1024);
            InputStreamReader inputStreamReader = new InputStreamReader(content, charset);
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read == -1) {
                    break;
                }
                charArrayBuffer.append(cArr, 0, read);
            }
            content.close();
            if (charArrayBuffer.isEmpty()) {
                return createEmptyList();
            }
            return parse(charArrayBuffer, charset, '&');
        } catch (Throwable th) {
            content.close();
            throw th;
        }
    }

    public static boolean isEncoded(HttpEntity httpEntity) {
        Args.notNull(httpEntity, "HTTP entity");
        Header contentType = httpEntity.getContentType();
        if (contentType != null) {
            HeaderElement[] elements = contentType.getElements();
            if (elements.length > 0) {
                return elements[0].getName().equalsIgnoreCase("application/x-www-form-urlencoded");
            }
        }
        return false;
    }

    @Deprecated
    public static void parse(List<NameValuePair> list, Scanner scanner, String str) {
        parse(list, scanner, "[&;]", str);
    }

    @Deprecated
    public static void parse(List<NameValuePair> list, Scanner scanner, String str, String str2) {
        String decodeFormFields;
        String str3;
        scanner.useDelimiter(str);
        while (scanner.hasNext()) {
            String next = scanner.next();
            int indexOf = next.indexOf(NAME_VALUE_SEPARATOR);
            if (indexOf != -1) {
                decodeFormFields = decodeFormFields(next.substring(0, indexOf).trim(), str2);
                str3 = decodeFormFields(next.substring(indexOf + 1).trim(), str2);
            } else {
                decodeFormFields = decodeFormFields(next.trim(), str2);
                str3 = null;
            }
            list.add(new BasicNameValuePair(decodeFormFields, str3));
        }
    }

    public static List<NameValuePair> parse(String str, Charset charset) {
        if (str == null) {
            return createEmptyList();
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return parse(charArrayBuffer, charset, '&', QP_SEP_S);
    }

    public static List<NameValuePair> parse(String str, Charset charset, char... cArr) {
        if (str == null) {
            return createEmptyList();
        }
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
        charArrayBuffer.append(str);
        return parse(charArrayBuffer, charset, cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List<NameValuePair> parse(CharArrayBuffer charArrayBuffer, Charset charset, char... cArr) {
        String str;
        Args.notNull(charArrayBuffer, "Char array buffer");
        TokenParser tokenParser = TokenParser.INSTANCE;
        BitSet bitSet = new BitSet();
        for (char c : cArr) {
            bitSet.set(c);
        }
        ParserCursor parserCursor = new ParserCursor(0, charArrayBuffer.length());
        ArrayList arrayList = new ArrayList();
        while (!parserCursor.atEnd()) {
            bitSet.set(61);
            String parseToken = tokenParser.parseToken(charArrayBuffer, parserCursor, bitSet);
            if (!parserCursor.atEnd()) {
                char charAt = charArrayBuffer.charAt(parserCursor.getPos());
                parserCursor.updatePos(parserCursor.getPos() + 1);
                if (charAt == '=') {
                    bitSet.clear(61);
                    str = tokenParser.parseToken(charArrayBuffer, parserCursor, bitSet);
                    if (!parserCursor.atEnd()) {
                        parserCursor.updatePos(parserCursor.getPos() + 1);
                    }
                    if (parseToken.isEmpty()) {
                        arrayList.add(new BasicNameValuePair(decodeFormFields(parseToken, charset), decodeFormFields(str, charset)));
                    }
                }
            }
            str = null;
            if (parseToken.isEmpty()) {
            }
        }
        return arrayList;
    }

    static List<String> splitSegments(CharSequence charSequence, BitSet bitSet) {
        ParserCursor parserCursor = new ParserCursor(0, charSequence.length());
        if (parserCursor.atEnd()) {
            return Collections.emptyList();
        }
        if (bitSet.get(charSequence.charAt(parserCursor.getPos()))) {
            parserCursor.updatePos(parserCursor.getPos() + 1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (!parserCursor.atEnd()) {
            char charAt = charSequence.charAt(parserCursor.getPos());
            if (bitSet.get(charAt)) {
                arrayList.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(charAt);
            }
            parserCursor.updatePos(parserCursor.getPos() + 1);
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> splitPathSegments(CharSequence charSequence) {
        return splitSegments(charSequence, PATH_SEPARATORS);
    }

    public static List<String> parsePathSegments(CharSequence charSequence, Charset charset) {
        Args.notNull(charSequence, "Char sequence");
        List<String> splitPathSegments = splitPathSegments(charSequence);
        for (int i = 0; i < splitPathSegments.size(); i++) {
            splitPathSegments.set(i, urlDecode(splitPathSegments.get(i), charset != null ? charset : Consts.UTF_8, false));
        }
        return splitPathSegments;
    }

    public static List<String> parsePathSegments(CharSequence charSequence) {
        return parsePathSegments(charSequence, Consts.UTF_8);
    }

    public static String formatSegments(Iterable<String> iterable, Charset charset) {
        Args.notNull(iterable, "Segments");
        StringBuilder sb = new StringBuilder();
        for (String str : iterable) {
            sb.append(PATH_SEPARATOR);
            sb.append(urlEncode(str, charset, PATHSAFE, false));
        }
        return sb.toString();
    }

    public static String formatSegments(String... strArr) {
        return formatSegments(Arrays.asList(strArr), Consts.UTF_8);
    }

    public static String format(List<? extends NameValuePair> list, String str) {
        return format(list, '&', str);
    }

    public static String format(List<? extends NameValuePair> list, char c, String str) {
        StringBuilder sb = new StringBuilder();
        for (NameValuePair nameValuePair : list) {
            String encodeFormFields = encodeFormFields(nameValuePair.getName(), str);
            String encodeFormFields2 = encodeFormFields(nameValuePair.getValue(), str);
            if (sb.length() > 0) {
                sb.append(c);
            }
            sb.append(encodeFormFields);
            if (encodeFormFields2 != null) {
                sb.append(NAME_VALUE_SEPARATOR);
                sb.append(encodeFormFields2);
            }
        }
        return sb.toString();
    }

    public static String format(Iterable<? extends NameValuePair> iterable, Charset charset) {
        return format(iterable, '&', charset);
    }

    public static String format(Iterable<? extends NameValuePair> iterable, char c, Charset charset) {
        Args.notNull(iterable, "Parameters");
        StringBuilder sb = new StringBuilder();
        for (NameValuePair nameValuePair : iterable) {
            String encodeFormFields = encodeFormFields(nameValuePair.getName(), charset);
            String encodeFormFields2 = encodeFormFields(nameValuePair.getValue(), charset);
            if (sb.length() > 0) {
                sb.append(c);
            }
            sb.append(encodeFormFields);
            if (encodeFormFields2 != null) {
                sb.append(NAME_VALUE_SEPARATOR);
                sb.append(encodeFormFields2);
            }
        }
        return sb.toString();
    }

    private static List<NameValuePair> createEmptyList() {
        return new ArrayList(0);
    }

    private static String urlEncode(String str, Charset charset, BitSet bitSet, boolean z) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ByteBuffer encode = charset.encode(str);
        while (encode.hasRemaining()) {
            int i = encode.get() & 255;
            if (bitSet.get(i)) {
                sb.append((char) i);
            } else if (z && i == 32) {
                sb.append('+');
            } else {
                sb.append("%");
                char upperCase = Character.toUpperCase(Character.forDigit((i >> 4) & 15, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(i & 15, 16));
                sb.append(upperCase);
                sb.append(upperCase2);
            }
        }
        return sb.toString();
    }

    private static String urlDecode(String str, Charset charset, boolean z) {
        if (str == null) {
            return null;
        }
        ByteBuffer allocate = ByteBuffer.allocate(str.length());
        CharBuffer wrap = CharBuffer.wrap(str);
        while (wrap.hasRemaining()) {
            char c = wrap.get();
            if (c == '%' && wrap.remaining() >= 2) {
                char c2 = wrap.get();
                char c3 = wrap.get();
                int digit = Character.digit(c2, 16);
                int digit2 = Character.digit(c3, 16);
                if (digit != -1 && digit2 != -1) {
                    allocate.put((byte) ((digit << 4) + digit2));
                } else {
                    allocate.put((byte) 37);
                    allocate.put((byte) c2);
                    allocate.put((byte) c3);
                }
            } else if (z && c == '+') {
                allocate.put((byte) 32);
            } else {
                allocate.put((byte) c);
            }
        }
        allocate.flip();
        return charset.decode(allocate).toString();
    }

    private static String decodeFormFields(String str, String str2) {
        if (str == null) {
            return null;
        }
        return urlDecode(str, str2 != null ? Charset.forName(str2) : Consts.UTF_8, true);
    }

    private static String decodeFormFields(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        return urlDecode(str, charset, true);
    }

    private static String encodeFormFields(String str, String str2) {
        if (str == null) {
            return null;
        }
        return urlEncode(str, str2 != null ? Charset.forName(str2) : Consts.UTF_8, URLENCODER, true);
    }

    private static String encodeFormFields(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        if (charset == null) {
            charset = Consts.UTF_8;
        }
        return urlEncode(str, charset, URLENCODER, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String encUserInfo(String str, Charset charset) {
        return urlEncode(str, charset, USERINFO, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String encUric(String str, Charset charset) {
        return urlEncode(str, charset, URIC, false);
    }

    static String encPath(String str, Charset charset) {
        return urlEncode(str, charset, PATH_SPECIAL, false);
    }
}
