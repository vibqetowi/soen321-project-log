package org.json;

import kotlin.text.Typography;
/* loaded from: classes5.dex */
public class JSONML {
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0178, code lost:
        throw r9.syntaxError("Reserved attribute.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0181, code lost:
        r7 = r9.nextToken();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0187, code lost:
        if ((r7 instanceof java.lang.String) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0189, code lost:
        r7 = (java.lang.String) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x018b, code lost:
        if (r12 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x018e, code lost:
        r7 = org.json.XML.stringToValue(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x019d, code lost:
        throw r9.syntaxError("Missing value");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Object parse(XMLTokener xMLTokener, boolean z, JSONArray jSONArray, boolean z2) throws JSONException {
        String str;
        Object obj;
        loop0: while (xMLTokener.more()) {
            Object nextContent = xMLTokener.nextContent();
            if (nextContent == XML.LT) {
                Object nextToken = xMLTokener.nextToken();
                if (nextToken instanceof Character) {
                    if (nextToken == XML.SLASH) {
                        Object nextToken2 = xMLTokener.nextToken();
                        if (!(nextToken2 instanceof String)) {
                            throw new JSONException("Expected a closing name instead of '" + nextToken2 + "'.");
                        } else if (xMLTokener.nextToken() == XML.GT) {
                            return nextToken2;
                        } else {
                            throw xMLTokener.syntaxError("Misshaped close tag");
                        }
                    } else if (nextToken == XML.BANG) {
                        char next = xMLTokener.next();
                        if (next == '-') {
                            if (xMLTokener.next() == '-') {
                                xMLTokener.skipPast("-->");
                            } else {
                                xMLTokener.back();
                            }
                        } else if (next != '[') {
                            int i = 1;
                            do {
                                Object nextMeta = xMLTokener.nextMeta();
                                if (nextMeta == null) {
                                    throw xMLTokener.syntaxError("Missing '>' after '<!'.");
                                }
                                if (nextMeta == XML.LT) {
                                    i++;
                                    continue;
                                } else if (nextMeta == XML.GT) {
                                    i--;
                                    continue;
                                } else {
                                    continue;
                                }
                            } while (i > 0);
                        } else if (!xMLTokener.nextToken().equals("CDATA") || xMLTokener.next() != '[') {
                            throw xMLTokener.syntaxError("Expected 'CDATA['");
                        } else {
                            if (jSONArray != null) {
                                jSONArray.put(xMLTokener.nextCDATA());
                            }
                        }
                    } else if (nextToken == XML.QUEST) {
                        xMLTokener.skipPast("?>");
                    } else {
                        throw xMLTokener.syntaxError("Misshaped tag");
                    }
                } else if (!(nextToken instanceof String)) {
                    throw xMLTokener.syntaxError("Bad tagName '" + nextToken + "'.");
                } else {
                    String str2 = (String) nextToken;
                    JSONArray jSONArray2 = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    if (z) {
                        jSONArray2.put(str2);
                        if (jSONArray != null) {
                            jSONArray.put(jSONArray2);
                        }
                    } else {
                        jSONObject.put("tagName", str2);
                        if (jSONArray != null) {
                            jSONArray.put(jSONObject);
                        }
                    }
                    while (true) {
                        Object obj2 = null;
                        while (true) {
                            if (obj2 == null) {
                                obj2 = xMLTokener.nextToken();
                            }
                            if (obj2 == null) {
                                throw xMLTokener.syntaxError("Misshaped tag");
                            }
                            if (obj2 instanceof String) {
                                str = (String) obj2;
                                if (z || (!"tagName".equals(str) && !"childNode".equals(str))) {
                                    Object nextToken3 = xMLTokener.nextToken();
                                    if (nextToken3 == XML.EQ) {
                                        break;
                                    }
                                    jSONObject.accumulate(str, "");
                                    obj2 = nextToken3;
                                }
                            } else {
                                if (z && jSONObject.length() > 0) {
                                    jSONArray2.put(jSONObject);
                                }
                                if (obj2 == XML.SLASH) {
                                    if (xMLTokener.nextToken() != XML.GT) {
                                        throw xMLTokener.syntaxError("Misshaped tag");
                                    }
                                    if (jSONArray == null) {
                                        return z ? jSONArray2 : jSONObject;
                                    }
                                } else if (obj2 != XML.GT) {
                                    throw xMLTokener.syntaxError("Misshaped tag");
                                } else {
                                    String str3 = (String) parse(xMLTokener, z, jSONArray2, z2);
                                    if (str3 == null) {
                                        continue;
                                    } else if (!str3.equals(str2)) {
                                        throw xMLTokener.syntaxError("Mismatched '" + str2 + "' and '" + str3 + "'");
                                    } else {
                                        if (!z && jSONArray2.length() > 0) {
                                            jSONObject.put("childNodes", jSONArray2);
                                        }
                                        if (jSONArray == null) {
                                            return z ? jSONArray2 : jSONObject;
                                        }
                                    }
                                }
                            }
                        }
                        jSONObject.accumulate(str, obj);
                    }
                }
            } else if (jSONArray != null) {
                if (nextContent instanceof String) {
                    nextContent = z2 ? XML.unescape((String) nextContent) : XML.stringToValue((String) nextContent);
                }
                jSONArray.put(nextContent);
            }
        }
        throw xMLTokener.syntaxError("Bad XML");
    }

    public static JSONArray toJSONArray(String str) throws JSONException {
        return (JSONArray) parse(new XMLTokener(str), true, null, false);
    }

    public static JSONArray toJSONArray(String str, boolean z) throws JSONException {
        return (JSONArray) parse(new XMLTokener(str), true, null, z);
    }

    public static JSONArray toJSONArray(XMLTokener xMLTokener, boolean z) throws JSONException {
        return (JSONArray) parse(xMLTokener, true, null, z);
    }

    public static JSONArray toJSONArray(XMLTokener xMLTokener) throws JSONException {
        return (JSONArray) parse(xMLTokener, true, null, false);
    }

    public static JSONObject toJSONObject(String str) throws JSONException {
        return (JSONObject) parse(new XMLTokener(str), false, null, false);
    }

    public static JSONObject toJSONObject(String str, boolean z) throws JSONException {
        return (JSONObject) parse(new XMLTokener(str), false, null, z);
    }

    public static JSONObject toJSONObject(XMLTokener xMLTokener) throws JSONException {
        return (JSONObject) parse(xMLTokener, false, null, false);
    }

    public static JSONObject toJSONObject(XMLTokener xMLTokener, boolean z) throws JSONException {
        return (JSONObject) parse(xMLTokener, false, null, z);
    }

    public static String toString(JSONArray jSONArray) throws JSONException {
        int i;
        StringBuilder sb = new StringBuilder("<");
        String string = jSONArray.getString(0);
        XML.noSpace(string);
        String escape = XML.escape(string);
        sb.append(escape);
        Object opt = jSONArray.opt(1);
        if (opt instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) opt;
            for (String str : jSONObject.keySet()) {
                Object opt2 = jSONObject.opt(str);
                XML.noSpace(str);
                if (opt2 != null) {
                    sb.append(' ');
                    sb.append(XML.escape(str));
                    sb.append("=\"");
                    sb.append(XML.escape(opt2.toString()));
                    sb.append('\"');
                }
            }
            i = 2;
        } else {
            i = 1;
        }
        int length = jSONArray.length();
        if (i >= length) {
            sb.append("/>");
        } else {
            sb.append(Typography.greater);
            do {
                Object obj = jSONArray.get(i);
                i++;
                if (obj != null) {
                    if (obj instanceof String) {
                        sb.append(XML.escape(obj.toString()));
                        continue;
                    } else if (obj instanceof JSONObject) {
                        sb.append(toString((JSONObject) obj));
                        continue;
                    } else if (obj instanceof JSONArray) {
                        sb.append(toString((JSONArray) obj));
                        continue;
                    } else {
                        sb.append(obj.toString());
                        continue;
                    }
                }
            } while (i < length);
            sb.append("</");
            sb.append(escape);
            sb.append(Typography.greater);
        }
        return sb.toString();
    }

    public static String toString(JSONObject jSONObject) throws JSONException {
        StringBuilder sb = new StringBuilder();
        String optString = jSONObject.optString("tagName");
        if (optString == null) {
            return XML.escape(jSONObject.toString());
        }
        XML.noSpace(optString);
        String escape = XML.escape(optString);
        sb.append(Typography.less);
        sb.append(escape);
        for (String str : jSONObject.keySet()) {
            if (!"tagName".equals(str) && !"childNodes".equals(str)) {
                XML.noSpace(str);
                Object opt = jSONObject.opt(str);
                if (opt != null) {
                    sb.append(' ');
                    sb.append(XML.escape(str));
                    sb.append("=\"");
                    sb.append(XML.escape(opt.toString()));
                    sb.append('\"');
                }
            }
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childNodes");
        if (optJSONArray == null) {
            sb.append("/>");
        } else {
            sb.append(Typography.greater);
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = optJSONArray.get(i);
                if (obj != null) {
                    if (obj instanceof String) {
                        sb.append(XML.escape(obj.toString()));
                    } else if (obj instanceof JSONObject) {
                        sb.append(toString((JSONObject) obj));
                    } else if (obj instanceof JSONArray) {
                        sb.append(toString((JSONArray) obj));
                    } else {
                        sb.append(obj.toString());
                    }
                }
            }
            sb.append("</");
            sb.append(escape);
            sb.append(Typography.greater);
        }
        return sb.toString();
    }
}
