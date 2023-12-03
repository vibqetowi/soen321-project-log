package com.bugsnag.android;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
/* loaded from: classes.dex */
class JsonWriter implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private static final String[] REPLACEMENT_CHARS = new String[128];
    private String deferredName;
    private boolean htmlSafe;
    private String indent;
    private boolean lenient;
    private final Writer out;
    private String separator;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;

    static {
        for (int i6 = 0; i6 <= 31; i6++) {
            REPLACEMENT_CHARS[i6] = String.format("\\u%04x", Integer.valueOf(i6));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        push(6);
        this.separator = ":";
        this.serializeNulls = true;
        if (writer != null) {
            this.out = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private void beforeName() {
        int peek = peek();
        if (peek == 5) {
            this.out.write(44);
        } else if (peek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private JsonWriter close(int i6, int i10, String str) {
        int peek = peek();
        if (peek != i10 && peek != i6) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName == null) {
            this.stackSize--;
            if (peek == i10) {
                newline();
            }
            this.out.write(str);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.deferredName);
    }

    private void newline() {
        if (this.indent == null) {
            return;
        }
        this.out.write("\n");
        int i6 = this.stackSize;
        for (int i10 = 1; i10 < i6; i10++) {
            this.out.write(this.indent);
        }
    }

    private JsonWriter open(int i6, String str) {
        beforeValue();
        push(i6);
        this.out.write(str);
        return this;
    }

    private int peek() {
        int i6 = this.stackSize;
        if (i6 != 0) {
            return this.stack[i6 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void push(int i6) {
        int i10 = this.stackSize;
        int[] iArr = this.stack;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[i10 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.stack = iArr2;
        }
        int[] iArr3 = this.stack;
        int i11 = this.stackSize;
        this.stackSize = i11 + 1;
        iArr3[i11] = i6;
    }

    private void replaceTop(int i6) {
        this.stack[this.stackSize - 1] = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void string(String str) {
        String[] strArr;
        String str2;
        if (this.htmlSafe) {
            strArr = HTML_SAFE_REPLACEMENT_CHARS;
        } else {
            strArr = REPLACEMENT_CHARS;
        }
        this.out.write("\"");
        int length = str.length();
        int i6 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i6 < i10) {
                    this.out.write(str, i6, i10 - i6);
                }
                this.out.write(str2);
                i6 = i10 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i6 < i10) {
                }
                this.out.write(str2);
                i6 = i10 + 1;
            }
        }
        if (i6 < length) {
            this.out.write(str, i6, length - i6);
        }
        this.out.write("\"");
    }

    private void writeDeferredName() {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public void beforeValue() {
        int peek = peek();
        if (peek != 1) {
            if (peek != 2) {
                if (peek != 4) {
                    if (peek != 6) {
                        if (peek == 7) {
                            if (!this.lenient) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    replaceTop(7);
                    return;
                }
                this.out.append((CharSequence) this.separator);
                replaceTop(5);
                return;
            }
            this.out.append(',');
            newline();
            return;
        }
        replaceTop(2);
        newline();
    }

    public JsonWriter beginArray() {
        writeDeferredName();
        return open(1, "[");
    }

    public JsonWriter beginObject() {
        writeDeferredName();
        return open(3, "{");
    }

    public JsonWriter endArray() {
        return close(1, 2, "]");
    }

    public JsonWriter endObject() {
        return close(3, 5, "}");
    }

    public void flush() {
        if (this.stackSize != 0) {
            this.out.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.lenient;
    }

    public JsonWriter jsonValue(String str) {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((CharSequence) str);
        return this;
    }

    public JsonWriter name(String str) {
        if (str != null) {
            if (this.deferredName == null) {
                if (this.stackSize != 0) {
                    this.deferredName = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public JsonWriter nullValue() {
        if (this.deferredName != null) {
            if (this.serializeNulls) {
                writeDeferredName();
            } else {
                this.deferredName = null;
                return this;
            }
        }
        beforeValue();
        this.out.write("null");
        return this;
    }

    public final void setHtmlSafe(boolean z10) {
        this.htmlSafe = z10;
    }

    public final void setIndent(String str) {
        if (str.length() == 0) {
            this.indent = null;
            this.separator = ":";
            return;
        }
        this.indent = str;
        this.separator = ": ";
    }

    public final void setLenient(boolean z10) {
        this.lenient = z10;
    }

    public final void setSerializeNulls(boolean z10) {
        this.serializeNulls = z10;
    }

    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }

    public JsonWriter value(boolean z10) {
        writeDeferredName();
        beforeValue();
        this.out.write(z10 ? "true" : "false");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.out.close();
        int i6 = this.stackSize;
        if (i6 <= 1 && (i6 != 1 || this.stack[i6 - 1] == 7)) {
            this.stackSize = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public JsonWriter value(double d10) {
        writeDeferredName();
        if (!this.lenient && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        beforeValue();
        this.out.append((CharSequence) Double.toString(d10));
        return this;
    }

    public JsonWriter value(long j10) {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(j10));
        return this;
    }

    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        String obj = number.toString();
        if (!this.lenient && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        beforeValue();
        this.out.append((CharSequence) obj);
        return this;
    }
}
