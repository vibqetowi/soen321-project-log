package org.json;

import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
/* loaded from: classes5.dex */
public class JSONWriter {
    private static final int maxdepth = 200;
    private boolean comma = false;
    protected char mode = 'i';
    private final JSONObject[] stack = new JSONObject[200];
    private int top = 0;
    protected Appendable writer;

    public JSONWriter(Appendable appendable) {
        this.writer = appendable;
    }

    private JSONWriter append(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Null pointer");
        }
        char c = this.mode;
        if (c == 'o' || c == 'a') {
            try {
                if (this.comma && c == 'a') {
                    this.writer.append(',');
                }
                this.writer.append(str);
                if (this.mode == 'o') {
                    this.mode = 'k';
                }
                this.comma = true;
                return this;
            } catch (IOException e) {
                throw new JSONException(e);
            }
        }
        throw new JSONException("Value out of sequence.");
    }

    public JSONWriter array() throws JSONException {
        char c = this.mode;
        if (c == 'i' || c == 'o' || c == 'a') {
            push(null);
            append("[");
            this.comma = false;
            return this;
        }
        throw new JSONException("Misplaced array.");
    }

    private JSONWriter end(char c, char c2) throws JSONException {
        if (this.mode != c) {
            throw new JSONException(c == 'a' ? "Misplaced endArray." : "Misplaced endObject.");
        }
        pop(c);
        try {
            this.writer.append(c2);
            this.comma = true;
            return this;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }

    public JSONWriter endArray() throws JSONException {
        return end('a', AbstractJsonLexerKt.END_LIST);
    }

    public JSONWriter endObject() throws JSONException {
        return end('k', AbstractJsonLexerKt.END_OBJ);
    }

    public JSONWriter key(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Null key.");
        }
        if (this.mode == 'k') {
            try {
                JSONObject jSONObject = this.stack[this.top - 1];
                if (jSONObject.has(str)) {
                    throw new JSONException("Duplicate key \"" + str + "\"");
                }
                jSONObject.put(str, true);
                if (this.comma) {
                    this.writer.append(',');
                }
                this.writer.append(JSONObject.quote(str));
                this.writer.append(AbstractJsonLexerKt.COLON);
                this.comma = false;
                this.mode = 'o';
                return this;
            } catch (IOException e) {
                throw new JSONException(e);
            }
        }
        throw new JSONException("Misplaced key.");
    }

    public JSONWriter object() throws JSONException {
        if (this.mode == 'i') {
            this.mode = 'o';
        }
        char c = this.mode;
        if (c == 'o' || c == 'a') {
            append("{");
            push(new JSONObject());
            this.comma = false;
            return this;
        }
        throw new JSONException("Misplaced object.");
    }

    private void pop(char c) throws JSONException {
        int i = this.top;
        if (i <= 0) {
            throw new JSONException("Nesting error.");
        }
        JSONObject[] jSONObjectArr = this.stack;
        char c2 = 'a';
        if ((jSONObjectArr[i + (-1)] == null ? 'a' : 'k') != c) {
            throw new JSONException("Nesting error.");
        }
        int i2 = i - 1;
        this.top = i2;
        if (i2 == 0) {
            c2 = 'd';
        } else if (jSONObjectArr[i2 - 1] != null) {
            c2 = 'k';
        }
        this.mode = c2;
    }

    private void push(JSONObject jSONObject) throws JSONException {
        int i = this.top;
        if (i >= 200) {
            throw new JSONException("Nesting too deep.");
        }
        this.stack[i] = jSONObject;
        this.mode = jSONObject == null ? 'a' : 'k';
        this.top = i + 1;
    }

    public static String valueToString(Object obj) throws JSONException {
        if (obj == null || obj.equals(null)) {
            return AbstractJsonLexerKt.NULL;
        }
        if (obj instanceof JSONString) {
            try {
                String jSONString = ((JSONString) obj).toJSONString();
                if (jSONString != null) {
                    return jSONString;
                }
                throw new JSONException("Bad value from toJSONString: " + jSONString);
            } catch (Exception e) {
                throw new JSONException(e);
            }
        } else if (obj instanceof Number) {
            String numberToString = JSONObject.numberToString((Number) obj);
            return JSONObject.NUMBER_PATTERN.matcher(numberToString).matches() ? numberToString : JSONObject.quote(numberToString);
        } else if ((obj instanceof Boolean) || (obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            return obj.toString();
        } else {
            if (obj instanceof Map) {
                return new JSONObject((Map<?, ?>) obj).toString();
            }
            if (obj instanceof Collection) {
                return new JSONArray((Collection<?>) obj).toString();
            }
            if (obj.getClass().isArray()) {
                return new JSONArray(obj).toString();
            }
            if (obj instanceof Enum) {
                return JSONObject.quote(((Enum) obj).name());
            }
            return JSONObject.quote(obj.toString());
        }
    }

    public JSONWriter value(boolean z) throws JSONException {
        return append(z ? ServerProtocol.DIALOG_RETURN_SCOPES_TRUE : "false");
    }

    public JSONWriter value(double d) throws JSONException {
        return value(Double.valueOf(d));
    }

    public JSONWriter value(long j) throws JSONException {
        return append(Long.toString(j));
    }

    public JSONWriter value(Object obj) throws JSONException {
        return append(valueToString(obj));
    }
}
