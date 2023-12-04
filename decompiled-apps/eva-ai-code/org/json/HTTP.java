package org.json;

import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.HttpVersion;
/* loaded from: classes5.dex */
public class HTTP {
    public static final String CRLF = "\r\n";

    public static JSONObject toJSONObject(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        HTTPTokener hTTPTokener = new HTTPTokener(str);
        String nextToken = hTTPTokener.nextToken();
        if (nextToken.toUpperCase(Locale.ROOT).startsWith(HttpVersion.HTTP)) {
            jSONObject.put("HTTP-Version", nextToken);
            jSONObject.put("Status-Code", hTTPTokener.nextToken());
            jSONObject.put("Reason-Phrase", hTTPTokener.nextTo((char) 0));
            hTTPTokener.next();
        } else {
            jSONObject.put("Method", nextToken);
            jSONObject.put("Request-URI", hTTPTokener.nextToken());
            jSONObject.put("HTTP-Version", hTTPTokener.nextToken());
        }
        while (hTTPTokener.more()) {
            String nextTo = hTTPTokener.nextTo(AbstractJsonLexerKt.COLON);
            hTTPTokener.next(AbstractJsonLexerKt.COLON);
            jSONObject.put(nextTo, hTTPTokener.nextTo((char) 0));
            hTTPTokener.next();
        }
        return jSONObject;
    }

    public static String toString(JSONObject jSONObject) throws JSONException {
        StringBuilder sb = new StringBuilder();
        if (jSONObject.has("Status-Code") && jSONObject.has("Reason-Phrase")) {
            sb.append(jSONObject.getString("HTTP-Version"));
            sb.append(' ');
            sb.append(jSONObject.getString("Status-Code"));
            sb.append(' ');
            sb.append(jSONObject.getString("Reason-Phrase"));
        } else if (jSONObject.has("Method") && jSONObject.has("Request-URI")) {
            sb.append(jSONObject.getString("Method"));
            sb.append(" \"");
            sb.append(jSONObject.getString("Request-URI"));
            sb.append("\" ");
            sb.append(jSONObject.getString("HTTP-Version"));
        } else {
            throw new JSONException("Not enough material for an HTTP header.");
        }
        sb.append(CRLF);
        for (String str : jSONObject.keySet()) {
            String optString = jSONObject.optString(str);
            if (!"HTTP-Version".equals(str) && !"Status-Code".equals(str) && !"Reason-Phrase".equals(str) && !"Method".equals(str) && !"Request-URI".equals(str) && !JSONObject.NULL.equals(optString)) {
                sb.append(str);
                sb.append(": ");
                sb.append(jSONObject.optString(str));
                sb.append(CRLF);
            }
        }
        sb.append(CRLF);
        return sb.toString();
    }
}
