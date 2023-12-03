package yf;

import com.appsflyer.R;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
/* compiled from: JsonWriter.java */
/* loaded from: classes.dex */
public class b implements Closeable, Flushable {
    public static final Pattern D = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] E = new String[128];
    public static final String[] F;
    public boolean A;
    public String B;
    public boolean C;

    /* renamed from: u  reason: collision with root package name */
    public final Writer f38541u;

    /* renamed from: v  reason: collision with root package name */
    public int[] f38542v;

    /* renamed from: w  reason: collision with root package name */
    public int f38543w;

    /* renamed from: x  reason: collision with root package name */
    public String f38544x;

    /* renamed from: y  reason: collision with root package name */
    public String f38545y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f38546z;

    static {
        for (int i6 = 0; i6 <= 31; i6++) {
            E[i6] = String.format("\\u%04x", Integer.valueOf(i6));
        }
        String[] strArr = E;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        F = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f38542v = iArr;
        this.f38543w = 0;
        if (iArr.length == 0) {
            this.f38542v = Arrays.copyOf(iArr, 0 * 2);
        }
        int[] iArr2 = this.f38542v;
        int i6 = this.f38543w;
        this.f38543w = i6 + 1;
        iArr2[i6] = 6;
        this.f38545y = ":";
        this.C = true;
        if (writer != null) {
            this.f38541u = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    public b G() {
        if (this.B != null) {
            if (this.C) {
                h0();
            } else {
                this.B = null;
                return this;
            }
        }
        a();
        this.f38541u.write("null");
        return this;
    }

    public final int I() {
        int i6 = this.f38543w;
        if (i6 != 0) {
            return this.f38542v[i6 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(String str) {
        String[] strArr;
        String str2;
        if (this.A) {
            strArr = F;
        } else {
            strArr = E;
        }
        Writer writer = this.f38541u;
        writer.write(34);
        int length = str.length();
        int i6 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i6 < i10) {
                    writer.write(str, i6, i10 - i6);
                }
                writer.write(str2);
                i6 = i10 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i6 < i10) {
                }
                writer.write(str2);
                i6 = i10 + 1;
            }
        }
        if (i6 < length) {
            writer.write(str, i6, length - i6);
        }
        writer.write(34);
    }

    public void O(long j10) {
        h0();
        a();
        this.f38541u.write(Long.toString(j10));
    }

    public void R(Boolean bool) {
        String str;
        if (bool == null) {
            G();
            return;
        }
        h0();
        a();
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        this.f38541u.write(str);
    }

    public final void a() {
        int I = I();
        if (I != 1) {
            Writer writer = this.f38541u;
            if (I != 2) {
                if (I != 4) {
                    if (I != 6) {
                        if (I == 7) {
                            if (!this.f38546z) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.f38542v[this.f38543w - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.f38545y);
                this.f38542v[this.f38543w - 1] = 5;
                return;
            }
            writer.append(',');
            s();
            return;
        }
        this.f38542v[this.f38543w - 1] = 2;
        s();
    }

    public void c0(Number number) {
        boolean z10;
        if (number == null) {
            G();
            return;
        }
        h0();
        String obj = number.toString();
        if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && !D.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        } else if (!this.f38546z) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
        }
        a();
        this.f38541u.append((CharSequence) obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f38541u.close();
        int i6 = this.f38543w;
        if (i6 <= 1 && (i6 != 1 || this.f38542v[i6 - 1] == 7)) {
            this.f38543w = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public void e() {
        h0();
        a();
        int i6 = this.f38543w;
        int[] iArr = this.f38542v;
        if (i6 == iArr.length) {
            this.f38542v = Arrays.copyOf(iArr, i6 * 2);
        }
        int[] iArr2 = this.f38542v;
        int i10 = this.f38543w;
        this.f38543w = i10 + 1;
        iArr2[i10] = 1;
        this.f38541u.write(91);
    }

    public void e0(String str) {
        if (str == null) {
            G();
            return;
        }
        h0();
        a();
        J(str);
    }

    public void f0(boolean z10) {
        String str;
        h0();
        a();
        if (z10) {
            str = "true";
        } else {
            str = "false";
        }
        this.f38541u.write(str);
    }

    public void flush() {
        if (this.f38543w != 0) {
            this.f38541u.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public void g() {
        h0();
        a();
        int i6 = this.f38543w;
        int[] iArr = this.f38542v;
        if (i6 == iArr.length) {
            this.f38542v = Arrays.copyOf(iArr, i6 * 2);
        }
        int[] iArr2 = this.f38542v;
        int i10 = this.f38543w;
        this.f38543w = i10 + 1;
        iArr2[i10] = 3;
        this.f38541u.write(R.styleable.AppCompatTheme_windowFixedWidthMinor);
    }

    public final void h(int i6, int i10, char c10) {
        int I = I();
        if (I != i10 && I != i6) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.B == null) {
            this.f38543w--;
            if (I == i10) {
                s();
            }
            this.f38541u.write(c10);
            return;
        }
        throw new IllegalStateException("Dangling name: " + this.B);
    }

    public final void h0() {
        if (this.B != null) {
            int I = I();
            if (I == 5) {
                this.f38541u.write(44);
            } else if (I != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            s();
            this.f38542v[this.f38543w - 1] = 4;
            J(this.B);
            this.B = null;
        }
    }

    public void j() {
        h(1, 2, ']');
    }

    public void m() {
        h(3, 5, '}');
    }

    public void o(String str) {
        if (str != null) {
            if (this.B == null) {
                if (this.f38543w != 0) {
                    this.B = str;
                    return;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public final void s() {
        if (this.f38544x == null) {
            return;
        }
        Writer writer = this.f38541u;
        writer.write(10);
        int i6 = this.f38543w;
        for (int i10 = 1; i10 < i6; i10++) {
            writer.write(this.f38544x);
        }
    }
}
