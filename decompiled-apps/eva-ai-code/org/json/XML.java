package org.json;

import com.facebook.internal.ServerProtocol;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* loaded from: classes5.dex */
public class XML {
    public static final String NULL_ATTR = "xsi:nil";
    public static final String TYPE_ATTR = "xsi:type";
    public static final Character AMP = Character.valueOf(Typography.amp);
    public static final Character APOS = '\'';
    public static final Character BANG = '!';
    public static final Character EQ = '=';
    public static final Character GT = Character.valueOf(Typography.greater);
    public static final Character LT = Character.valueOf(Typography.less);
    public static final Character QUEST = '?';
    public static final Character QUOT = '\"';
    public static final Character SLASH = '/';

    private static Iterable<Integer> codePointIterator(final String str) {
        return new Iterable<Integer>() { // from class: org.json.XML.1
            @Override // java.lang.Iterable
            public Iterator<Integer> iterator() {
                return new Iterator<Integer>() { // from class: org.json.XML.1.1
                    private int length;
                    private int nextIndex = 0;

                    {
                        this.length = str.length();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.nextIndex < this.length;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // java.util.Iterator
                    public Integer next() {
                        int codePointAt = str.codePointAt(this.nextIndex);
                        this.nextIndex += Character.charCount(codePointAt);
                        return Integer.valueOf(codePointAt);
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public static String escape(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (Integer num : codePointIterator(str)) {
            int intValue = num.intValue();
            if (intValue == 34) {
                sb.append("&quot;");
            } else if (intValue == 60) {
                sb.append("&lt;");
            } else if (intValue == 62) {
                sb.append("&gt;");
            } else if (intValue == 38) {
                sb.append("&amp;");
            } else if (intValue == 39) {
                sb.append("&apos;");
            } else if (mustEscape(intValue)) {
                sb.append("&#x");
                sb.append(Integer.toHexString(intValue));
                sb.append(';');
            } else {
                sb.appendCodePoint(intValue);
            }
        }
        return sb.toString();
    }

    private static boolean mustEscape(int i) {
        return !(!Character.isISOControl(i) || i == 9 || i == 10 || i == 13) || ((i < 32 || i > 55295) && ((i < 57344 || i > 65533) && (i < 65536 || i > 1114111)));
    }

    public static String unescape(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '&') {
                int indexOf = str.indexOf(59, i);
                if (indexOf > i) {
                    String substring = str.substring(i + 1, indexOf);
                    sb.append(XMLTokener.unescapeEntity(substring));
                    i += substring.length() + 1;
                } else {
                    sb.append(charAt);
                }
            } else {
                sb.append(charAt);
            }
            i++;
        }
        return sb.toString();
    }

    public static void noSpace(String str) throws JSONException {
        int length = str.length();
        if (length == 0) {
            throw new JSONException("Empty string.");
        }
        for (int i = 0; i < length; i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                throw new JSONException("'" + str + "' contains a space character.");
            }
        }
    }

    private static boolean parse(XMLTokener xMLTokener, JSONObject jSONObject, String str, XMLParserConfiguration xMLParserConfiguration) throws JSONException {
        Object nextToken = xMLTokener.nextToken();
        int i = 1;
        if (nextToken == BANG) {
            char next = xMLTokener.next();
            if (next == '-') {
                if (xMLTokener.next() == '-') {
                    xMLTokener.skipPast("-->");
                    return false;
                }
                xMLTokener.back();
            } else if (next == '[') {
                if ("CDATA".equals(xMLTokener.nextToken()) && xMLTokener.next() == '[') {
                    String nextCDATA = xMLTokener.nextCDATA();
                    if (nextCDATA.length() > 0) {
                        jSONObject.accumulate(xMLParserConfiguration.getcDataTagName(), nextCDATA);
                    }
                    return false;
                }
                throw xMLTokener.syntaxError("Expected 'CDATA['");
            }
            do {
                Object nextMeta = xMLTokener.nextMeta();
                if (nextMeta == null) {
                    throw xMLTokener.syntaxError("Missing '>' after '<!'.");
                }
                if (nextMeta == LT) {
                    i++;
                    continue;
                } else if (nextMeta == GT) {
                    i--;
                    continue;
                } else {
                    continue;
                }
            } while (i > 0);
            return false;
        } else if (nextToken == QUEST) {
            xMLTokener.skipPast("?>");
            return false;
        } else if (nextToken == SLASH) {
            Object nextToken2 = xMLTokener.nextToken();
            if (str == null) {
                throw xMLTokener.syntaxError("Mismatched close tag " + nextToken2);
            } else if (!nextToken2.equals(str)) {
                throw xMLTokener.syntaxError("Mismatched " + str + " and " + nextToken2);
            } else if (xMLTokener.nextToken() == GT) {
                return true;
            } else {
                throw xMLTokener.syntaxError("Misshaped close tag");
            }
        } else if (nextToken instanceof Character) {
            throw xMLTokener.syntaxError("Misshaped tag");
        } else {
            String str2 = (String) nextToken;
            JSONObject jSONObject2 = new JSONObject();
            boolean z = false;
            Object obj = null;
            XMLXsiTypeConverter<?> xMLXsiTypeConverter = null;
            while (true) {
                if (obj == null) {
                    obj = xMLTokener.nextToken();
                }
                if (obj instanceof String) {
                    String str3 = (String) obj;
                    Object nextToken3 = xMLTokener.nextToken();
                    if (nextToken3 == EQ) {
                        Object nextToken4 = xMLTokener.nextToken();
                        if (!(nextToken4 instanceof String)) {
                            throw xMLTokener.syntaxError("Missing value");
                        }
                        if (xMLParserConfiguration.isConvertNilAttributeToNull() && NULL_ATTR.equals(str3) && Boolean.parseBoolean((String) nextToken4)) {
                            z = true;
                        } else if (xMLParserConfiguration.getXsiTypeMap() != null && !xMLParserConfiguration.getXsiTypeMap().isEmpty() && TYPE_ATTR.equals(str3)) {
                            xMLXsiTypeConverter = xMLParserConfiguration.getXsiTypeMap().get(nextToken4);
                        } else if (!z) {
                            String str4 = (String) nextToken4;
                            String str5 = str4;
                            if (!xMLParserConfiguration.isKeepStrings()) {
                                str5 = stringToValue(str4);
                            }
                            jSONObject2.accumulate(str3, str5);
                        }
                        obj = null;
                    } else {
                        jSONObject2.accumulate(str3, "");
                        obj = nextToken3;
                    }
                } else if (obj == SLASH) {
                    if (xMLTokener.nextToken() != GT) {
                        throw xMLTokener.syntaxError("Misshaped tag");
                    }
                    if (xMLParserConfiguration.getForceList().contains(str2)) {
                        if (z) {
                            jSONObject.append(str2, JSONObject.NULL);
                        } else if (jSONObject2.length() > 0) {
                            jSONObject.append(str2, jSONObject2);
                        } else {
                            jSONObject.put(str2, new JSONArray());
                        }
                    } else if (z) {
                        jSONObject.accumulate(str2, JSONObject.NULL);
                    } else if (jSONObject2.length() > 0) {
                        jSONObject.accumulate(str2, jSONObject2);
                    } else {
                        jSONObject.accumulate(str2, "");
                    }
                    return false;
                } else if (obj != GT) {
                    throw xMLTokener.syntaxError("Misshaped tag");
                } else {
                    while (true) {
                        Object nextContent = xMLTokener.nextContent();
                        if (nextContent == null) {
                            if (str2 == null) {
                                return false;
                            }
                            throw xMLTokener.syntaxError("Unclosed tag " + str2);
                        } else if (nextContent instanceof String) {
                            String str6 = (String) nextContent;
                            if (str6.length() > 0) {
                                if (xMLXsiTypeConverter != null) {
                                    jSONObject2.accumulate(xMLParserConfiguration.getcDataTagName(), stringToValue(str6, xMLXsiTypeConverter));
                                } else {
                                    String str7 = xMLParserConfiguration.getcDataTagName();
                                    String str8 = str6;
                                    if (!xMLParserConfiguration.isKeepStrings()) {
                                        str8 = stringToValue(str6);
                                    }
                                    jSONObject2.accumulate(str7, str8);
                                }
                            }
                        } else if (nextContent == LT && parse(xMLTokener, jSONObject2, str2, xMLParserConfiguration)) {
                            if (xMLParserConfiguration.getForceList().contains(str2)) {
                                if (jSONObject2.length() == 0) {
                                    jSONObject.put(str2, new JSONArray());
                                } else if (jSONObject2.length() == 1 && jSONObject2.opt(xMLParserConfiguration.getcDataTagName()) != null) {
                                    jSONObject.append(str2, jSONObject2.opt(xMLParserConfiguration.getcDataTagName()));
                                } else {
                                    jSONObject.append(str2, jSONObject2);
                                }
                            } else if (jSONObject2.length() == 0) {
                                jSONObject.accumulate(str2, "");
                            } else if (jSONObject2.length() == 1 && jSONObject2.opt(xMLParserConfiguration.getcDataTagName()) != null) {
                                jSONObject.accumulate(str2, jSONObject2.opt(xMLParserConfiguration.getcDataTagName()));
                            } else {
                                jSONObject.accumulate(str2, jSONObject2);
                            }
                            return false;
                        }
                    }
                }
            }
        }
    }

    public static Object stringToValue(String str, XMLXsiTypeConverter<?> xMLXsiTypeConverter) {
        if (xMLXsiTypeConverter != null) {
            return xMLXsiTypeConverter.convert(str);
        }
        return stringToValue(str);
    }

    public static Object stringToValue(String str) {
        if ("".equals(str)) {
            return str;
        }
        if (ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equalsIgnoreCase(str)) {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(str)) {
            return Boolean.FALSE;
        }
        if (AbstractJsonLexerKt.NULL.equalsIgnoreCase(str)) {
            return JSONObject.NULL;
        }
        char charAt = str.charAt(0);
        if ((charAt < '0' || charAt > '9') && charAt != '-') {
            return str;
        }
        try {
            return stringToNumber(str);
        } catch (Exception unused) {
            return str;
        }
    }

    private static Number stringToNumber(String str) throws NumberFormatException {
        char charAt = str.charAt(0);
        if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
            if (isDecimalNotation(str)) {
                try {
                    try {
                        BigDecimal bigDecimal = new BigDecimal(str);
                        return (charAt == '-' && BigDecimal.ZERO.compareTo(bigDecimal) == 0) ? Double.valueOf(-0.0d) : bigDecimal;
                    } catch (NumberFormatException unused) {
                        throw new NumberFormatException("val [" + str + "] is not a valid number.");
                    }
                } catch (NumberFormatException unused2) {
                    Double valueOf = Double.valueOf(str);
                    if (valueOf.isNaN() || valueOf.isInfinite()) {
                        throw new NumberFormatException("val [" + str + "] is not a valid number.");
                    }
                    return valueOf;
                }
            }
            if (charAt == '0' && str.length() > 1) {
                char charAt2 = str.charAt(1);
                if (charAt2 >= '0' && charAt2 <= '9') {
                    throw new NumberFormatException("val [" + str + "] is not a valid number.");
                }
            } else if (charAt == '-' && str.length() > 2) {
                char charAt3 = str.charAt(1);
                char charAt4 = str.charAt(2);
                if (charAt3 == '0' && charAt4 >= '0' && charAt4 <= '9') {
                    throw new NumberFormatException("val [" + str + "] is not a valid number.");
                }
            }
            BigInteger bigInteger = new BigInteger(str);
            if (bigInteger.bitLength() <= 31) {
                return Integer.valueOf(bigInteger.intValue());
            }
            return bigInteger.bitLength() <= 63 ? Long.valueOf(bigInteger.longValue()) : bigInteger;
        }
        throw new NumberFormatException("val [" + str + "] is not a valid number.");
    }

    private static boolean isDecimalNotation(String str) {
        return str.indexOf(46) > -1 || str.indexOf(101) > -1 || str.indexOf(69) > -1 || "-0".equals(str);
    }

    public static JSONObject toJSONObject(String str) throws JSONException {
        return toJSONObject(str, XMLParserConfiguration.ORIGINAL);
    }

    public static JSONObject toJSONObject(Reader reader) throws JSONException {
        return toJSONObject(reader, XMLParserConfiguration.ORIGINAL);
    }

    public static JSONObject toJSONObject(Reader reader, boolean z) throws JSONException {
        if (z) {
            return toJSONObject(reader, XMLParserConfiguration.KEEP_STRINGS);
        }
        return toJSONObject(reader, XMLParserConfiguration.ORIGINAL);
    }

    public static JSONObject toJSONObject(Reader reader, XMLParserConfiguration xMLParserConfiguration) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        XMLTokener xMLTokener = new XMLTokener(reader);
        while (xMLTokener.more()) {
            xMLTokener.skipPast("<");
            if (xMLTokener.more()) {
                parse(xMLTokener, jSONObject, null, xMLParserConfiguration);
            }
        }
        return jSONObject;
    }

    public static JSONObject toJSONObject(String str, boolean z) throws JSONException {
        return toJSONObject(new StringReader(str), z);
    }

    public static JSONObject toJSONObject(String str, XMLParserConfiguration xMLParserConfiguration) throws JSONException {
        return toJSONObject(new StringReader(str), xMLParserConfiguration);
    }

    public static String toString(Object obj) throws JSONException {
        return toString(obj, null, XMLParserConfiguration.ORIGINAL);
    }

    public static String toString(Object obj, String str) {
        return toString(obj, str, XMLParserConfiguration.ORIGINAL);
    }

    public static String toString(Object obj, String str, XMLParserConfiguration xMLParserConfiguration) throws JSONException {
        JSONArray jSONArray;
        StringBuilder sb = new StringBuilder();
        if (obj instanceof JSONObject) {
            if (str != null) {
                sb.append(Typography.less);
                sb.append(str);
                sb.append(Typography.greater);
            }
            JSONObject jSONObject = (JSONObject) obj;
            for (String str2 : jSONObject.keySet()) {
                Object opt = jSONObject.opt(str2);
                if (opt == null) {
                    opt = "";
                } else if (opt.getClass().isArray()) {
                    opt = new JSONArray(opt);
                }
                if (str2.equals(xMLParserConfiguration.getcDataTagName())) {
                    if (opt instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) opt;
                        int length = jSONArray2.length();
                        for (int i = 0; i < length; i++) {
                            if (i > 0) {
                                sb.append('\n');
                            }
                            sb.append(escape(jSONArray2.opt(i).toString()));
                        }
                    } else {
                        sb.append(escape(opt.toString()));
                    }
                } else if (opt instanceof JSONArray) {
                    JSONArray jSONArray3 = (JSONArray) opt;
                    int length2 = jSONArray3.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        Object opt2 = jSONArray3.opt(i2);
                        if (opt2 instanceof JSONArray) {
                            sb.append(Typography.less);
                            sb.append(str2);
                            sb.append(Typography.greater);
                            sb.append(toString(opt2, null, xMLParserConfiguration));
                            sb.append("</");
                            sb.append(str2);
                            sb.append(Typography.greater);
                        } else {
                            sb.append(toString(opt2, str2, xMLParserConfiguration));
                        }
                    }
                } else if ("".equals(opt)) {
                    sb.append(Typography.less);
                    sb.append(str2);
                    sb.append("/>");
                } else {
                    sb.append(toString(opt, str2, xMLParserConfiguration));
                }
            }
            if (str != null) {
                sb.append("</");
                sb.append(str);
                sb.append(Typography.greater);
            }
            return sb.toString();
        } else if (obj != null && ((obj instanceof JSONArray) || obj.getClass().isArray())) {
            if (obj.getClass().isArray()) {
                jSONArray = new JSONArray(obj);
            } else {
                jSONArray = (JSONArray) obj;
            }
            int length3 = jSONArray.length();
            for (int i3 = 0; i3 < length3; i3++) {
                sb.append(toString(jSONArray.opt(i3), str == null ? "array" : str, xMLParserConfiguration));
            }
            return sb.toString();
        } else {
            String escape = obj == null ? AbstractJsonLexerKt.NULL : escape(obj.toString());
            if (str == null) {
                return "\"" + escape + "\"";
            } else if (escape.length() == 0) {
                return "<" + str + "/>";
            } else {
                return "<" + str + ">" + escape + "</" + str + ">";
            }
        }
    }
}
