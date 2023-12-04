package org.json;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public class JSONPointer {
    private static final String ENCODING = "utf-8";
    private final List<String> refTokens;

    /* loaded from: classes5.dex */
    public static class Builder {
        private final List<String> refTokens = new ArrayList();

        public JSONPointer build() {
            return new JSONPointer(this.refTokens);
        }

        public Builder append(String str) {
            if (str == null) {
                throw new NullPointerException("token cannot be null");
            }
            this.refTokens.add(str);
            return this;
        }

        public Builder append(int i) {
            this.refTokens.add(String.valueOf(i));
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public JSONPointer(String str) {
        String substring;
        if (str == null) {
            throw new NullPointerException("pointer cannot be null");
        }
        if (str.isEmpty() || str.equals("#")) {
            this.refTokens = Collections.emptyList();
            return;
        }
        if (str.startsWith("#/")) {
            try {
                substring = URLDecoder.decode(str.substring(2), ENCODING);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        } else if (str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            substring = str.substring(1);
        } else {
            throw new IllegalArgumentException("a JSON pointer should start with '/' or '#/'");
        }
        this.refTokens = new ArrayList();
        int i = -1;
        while (true) {
            int i2 = i + 1;
            int indexOf = substring.indexOf(47, i2);
            if (i2 == indexOf || i2 == substring.length()) {
                this.refTokens.add("");
            } else if (indexOf >= 0) {
                this.refTokens.add(unescape(substring.substring(i2, indexOf)));
            } else {
                this.refTokens.add(unescape(substring.substring(i2)));
            }
            if (indexOf < 0) {
                return;
            }
            i = indexOf;
        }
    }

    public JSONPointer(List<String> list) {
        this.refTokens = new ArrayList(list);
    }

    private static String unescape(String str) {
        return str.replace("~1", RemoteSettings.FORWARD_SLASH_STRING).replace("~0", "~");
    }

    public Object queryFrom(Object obj) throws JSONPointerException {
        if (this.refTokens.isEmpty()) {
            return obj;
        }
        for (String str : this.refTokens) {
            if (obj instanceof JSONObject) {
                obj = ((JSONObject) obj).opt(unescape(str));
            } else if (obj instanceof JSONArray) {
                obj = readByIndexToken(obj, str);
            } else {
                throw new JSONPointerException(String.format("value [%s] is not an array or object therefore its key %s cannot be resolved", obj, str));
            }
        }
        return obj;
    }

    private static Object readByIndexToken(Object obj, String str) throws JSONPointerException {
        try {
            int parseInt = Integer.parseInt(str);
            JSONArray jSONArray = (JSONArray) obj;
            if (parseInt >= jSONArray.length()) {
                throw new JSONPointerException(String.format("index %s is out of bounds - the array has %d elements", str, Integer.valueOf(jSONArray.length())));
            }
            try {
                return jSONArray.get(parseInt);
            } catch (JSONException e) {
                throw new JSONPointerException("Error reading value at index position " + parseInt, e);
            }
        } catch (NumberFormatException e2) {
            throw new JSONPointerException(String.format("%s is not an array index", str), e2);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("");
        for (String str : this.refTokens) {
            sb.append('/');
            sb.append(escape(str));
        }
        return sb.toString();
    }

    private static String escape(String str) {
        return str.replace("~", "~0").replace(RemoteSettings.FORWARD_SLASH_STRING, "~1");
    }

    public String toURIFragment() {
        try {
            StringBuilder sb = new StringBuilder("#");
            for (String str : this.refTokens) {
                sb.append('/');
                sb.append(URLEncoder.encode(str, ENCODING));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
