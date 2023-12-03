package yf;

import com.appsflyer.R;
import com.google.gson.stream.MalformedJsonException;
import com.theinnerhour.b2b.utils.Constants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import r1.b0;
import sf.p;
import v.h;
import vf.f;
/* compiled from: JsonReader.java */
/* loaded from: classes.dex */
public class a implements Closeable {
    public long C;
    public int D;
    public String E;
    public int[] F;
    public String[] H;
    public int[] I;

    /* renamed from: u  reason: collision with root package name */
    public final Reader f38535u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f38536v = false;

    /* renamed from: w  reason: collision with root package name */
    public final char[] f38537w = new char[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];

    /* renamed from: x  reason: collision with root package name */
    public int f38538x = 0;

    /* renamed from: y  reason: collision with root package name */
    public int f38539y = 0;

    /* renamed from: z  reason: collision with root package name */
    public int f38540z = 0;
    public int A = 0;
    public int B = 0;
    public int G = 1;

    /* compiled from: JsonReader.java */
    /* renamed from: yf.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0651a extends com.android.volley.toolbox.a {
        public final void J(a aVar) {
            if (aVar instanceof f) {
                f fVar = (f) aVar;
                fVar.P0(5);
                Map.Entry entry = (Map.Entry) ((Iterator) fVar.Q0()).next();
                fVar.S0(entry.getValue());
                fVar.S0(new p((String) entry.getKey()));
                return;
            }
            int i6 = aVar.B;
            if (i6 == 0) {
                i6 = aVar.h();
            }
            if (i6 == 13) {
                aVar.B = 9;
            } else if (i6 == 12) {
                aVar.B = 8;
            } else if (i6 == 14) {
                aVar.B = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + b0.k(aVar.y0()) + aVar.R());
            }
        }
    }

    static {
        com.android.volley.toolbox.a.f5871u = new C0651a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.F = iArr;
        iArr[0] = 6;
        this.H = new String[32];
        this.I = new int[32];
        this.f38535u = reader;
    }

    public final void B0(int i6) {
        int i10 = this.G;
        int[] iArr = this.F;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.F = Arrays.copyOf(iArr, i11);
            this.I = Arrays.copyOf(this.I, i11);
            this.H = (String[]) Arrays.copyOf(this.H, i11);
        }
        int[] iArr2 = this.F;
        int i12 = this.G;
        this.G = i12 + 1;
        iArr2[i12] = i6;
    }

    public final String G(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i6 = 0;
        while (true) {
            int i10 = this.G;
            if (i6 < i10) {
                int i11 = this.F[i6];
                if (i11 != 1 && i11 != 2) {
                    if (i11 == 3 || i11 == 4 || i11 == 5) {
                        sb2.append('.');
                        String str = this.H[i6];
                        if (str != null) {
                            sb2.append(str);
                        }
                    }
                } else {
                    int i12 = this.I[i6];
                    if (z10 && i12 > 0 && i6 == i10 - 1) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                }
                i6++;
            } else {
                return sb2.toString();
            }
        }
    }

    public String I() {
        return G(true);
    }

    public boolean J() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        if (i6 != 2 && i6 != 4 && i6 != 17) {
            return true;
        }
        return false;
    }

    public final char K0() {
        int i6;
        int i10;
        if (this.f38538x == this.f38539y && !o(1)) {
            O0("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f38538x;
        int i12 = i11 + 1;
        this.f38538x = i12;
        char[] cArr = this.f38537w;
        char c10 = cArr[i11];
        if (c10 != '\n') {
            if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
                if (c10 != 'b') {
                    if (c10 != 'f') {
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 != 'r') {
                            if (c10 != 't') {
                                if (c10 == 'u') {
                                    if (i12 + 4 > this.f38539y && !o(4)) {
                                        O0("Unterminated escape sequence");
                                        throw null;
                                    }
                                    int i13 = this.f38538x;
                                    int i14 = i13 + 4;
                                    char c11 = 0;
                                    while (i13 < i14) {
                                        char c12 = cArr[i13];
                                        char c13 = (char) (c11 << 4);
                                        if (c12 >= '0' && c12 <= '9') {
                                            i10 = c12 - '0';
                                        } else {
                                            if (c12 >= 'a' && c12 <= 'f') {
                                                i6 = c12 - 'a';
                                            } else if (c12 >= 'A' && c12 <= 'F') {
                                                i6 = c12 - 'A';
                                            } else {
                                                throw new NumberFormatException("\\u".concat(new String(cArr, this.f38538x, 4)));
                                            }
                                            i10 = i6 + 10;
                                        }
                                        c11 = (char) (i10 + c13);
                                        i13++;
                                    }
                                    this.f38538x += 4;
                                    return c11;
                                }
                                O0("Invalid escape sequence");
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f38540z++;
            this.A = i12;
        }
        return c10;
    }

    public final void L0(char c10) {
        do {
            int i6 = this.f38538x;
            int i10 = this.f38539y;
            while (i6 < i10) {
                int i11 = i6 + 1;
                char c11 = this.f38537w[i6];
                if (c11 == c10) {
                    this.f38538x = i11;
                    return;
                } else if (c11 == '\\') {
                    this.f38538x = i11;
                    K0();
                    i6 = this.f38538x;
                    i10 = this.f38539y;
                } else {
                    if (c11 == '\n') {
                        this.f38540z++;
                        this.A = i11;
                    }
                    i6 = i11;
                }
            }
            this.f38538x = i6;
        } while (o(1));
        O0("Unterminated string");
        throw null;
    }

    public final void M0() {
        char c10;
        do {
            if (this.f38538x < this.f38539y || o(1)) {
                int i6 = this.f38538x;
                int i10 = i6 + 1;
                this.f38538x = i10;
                c10 = this.f38537w[i6];
                if (c10 == '\n') {
                    this.f38540z++;
                    this.A = i10;
                    return;
                }
            } else {
                return;
            }
        } while (c10 != '\r');
    }

    public void N0() {
        int i6 = 0;
        do {
            int i10 = this.B;
            if (i10 == 0) {
                i10 = h();
            }
            if (i10 == 3) {
                B0(1);
            } else if (i10 == 1) {
                B0(3);
            } else {
                if (i10 == 4) {
                    this.G--;
                } else if (i10 == 2) {
                    this.G--;
                } else {
                    if (i10 != 14 && i10 != 10) {
                        if (i10 != 8 && i10 != 12) {
                            if (i10 != 9 && i10 != 13) {
                                if (i10 == 16) {
                                    this.f38538x += this.D;
                                }
                            } else {
                                L0('\"');
                            }
                        } else {
                            L0('\'');
                        }
                    } else {
                        do {
                            int i11 = 0;
                            while (true) {
                                int i12 = this.f38538x + i11;
                                if (i12 < this.f38539y) {
                                    char c10 = this.f38537w[i12];
                                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                                        if (c10 != '#') {
                                            if (c10 != ',') {
                                                if (c10 != '/' && c10 != '=') {
                                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                                        if (c10 != ';') {
                                                            switch (c10) {
                                                                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                                                case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                                                    break;
                                                                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                                                    break;
                                                                default:
                                                                    i11++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f38538x = i12;
                                }
                            }
                            g();
                            this.f38538x += i11;
                        } while (o(1));
                    }
                    this.B = 0;
                }
                i6--;
                this.B = 0;
            }
            i6++;
            this.B = 0;
        } while (i6 != 0);
        int[] iArr = this.I;
        int i13 = this.G;
        int i14 = i13 - 1;
        iArr[i14] = iArr[i14] + 1;
        this.H[i13 - 1] = "null";
    }

    public final boolean O(char c10) {
        if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
            if (c10 != '#') {
                if (c10 != ',') {
                    if (c10 != '/' && c10 != '=') {
                        if (c10 != '{' && c10 != '}' && c10 != ':') {
                            if (c10 != ';') {
                                switch (c10) {
                                    case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                    case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                        return false;
                                    case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            g();
            return false;
        }
        return false;
    }

    public final void O0(String str) {
        StringBuilder c10 = h.c(str);
        c10.append(R());
        throw new MalformedJsonException(c10.toString());
    }

    public final String R() {
        return " at line " + (this.f38540z + 1) + " column " + ((this.f38538x - this.A) + 1) + " path " + s();
    }

    public void a() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        if (i6 == 3) {
            B0(1);
            this.I[this.G - 1] = 0;
            this.B = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + b0.k(y0()) + R());
    }

    public boolean c0() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        if (i6 == 5) {
            this.B = 0;
            int[] iArr = this.I;
            int i10 = this.G - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        } else if (i6 == 6) {
            this.B = 0;
            int[] iArr2 = this.I;
            int i11 = this.G - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + b0.k(y0()) + R());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.B = 0;
        this.F[0] = 8;
        this.G = 1;
        this.f38535u.close();
    }

    public void e() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        if (i6 == 1) {
            B0(3);
            this.B = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + b0.k(y0()) + R());
    }

    public double e0() {
        char c10;
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        if (i6 == 15) {
            this.B = 0;
            int[] iArr = this.I;
            int i10 = this.G - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.C;
        }
        if (i6 == 16) {
            this.E = new String(this.f38537w, this.f38538x, this.D);
            this.f38538x += this.D;
        } else if (i6 != 8 && i6 != 9) {
            if (i6 == 10) {
                this.E = w0();
            } else if (i6 != 11) {
                throw new IllegalStateException("Expected a double but was " + b0.k(y0()) + R());
            }
        } else {
            if (i6 == 8) {
                c10 = '\'';
            } else {
                c10 = '\"';
            }
            this.E = q0(c10);
        }
        this.B = 11;
        double parseDouble = Double.parseDouble(this.E);
        if (!this.f38536v && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + R());
        }
        this.E = null;
        this.B = 0;
        int[] iArr2 = this.I;
        int i11 = this.G - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return parseDouble;
    }

    public int f0() {
        char c10;
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        if (i6 == 15) {
            long j10 = this.C;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.B = 0;
                int[] iArr = this.I;
                int i11 = this.G - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.C + R());
        }
        if (i6 == 16) {
            this.E = new String(this.f38537w, this.f38538x, this.D);
            this.f38538x += this.D;
        } else if (i6 != 8 && i6 != 9 && i6 != 10) {
            throw new IllegalStateException("Expected an int but was " + b0.k(y0()) + R());
        } else {
            if (i6 == 10) {
                this.E = w0();
            } else {
                if (i6 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.E = q0(c10);
            }
            try {
                int parseInt = Integer.parseInt(this.E);
                this.B = 0;
                int[] iArr2 = this.I;
                int i12 = this.G - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.B = 11;
        double parseDouble = Double.parseDouble(this.E);
        int i13 = (int) parseDouble;
        if (i13 == parseDouble) {
            this.E = null;
            this.B = 0;
            int[] iArr3 = this.I;
            int i14 = this.G - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return i13;
        }
        throw new NumberFormatException("Expected an int but was " + this.E + R());
    }

    public final void g() {
        if (this.f38536v) {
            return;
        }
        O0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x0209, code lost:
        if (O(r1) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x020b, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x020c, code lost:
        if (r11 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x020e, code lost:
        if (r13 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0214, code lost:
        if (r5 != Long.MIN_VALUE) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0216, code lost:
        if (r12 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x021c, code lost:
        if (r5 != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x021e, code lost:
        if (r12 != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0220, code lost:
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0223, code lost:
        r5 = -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0224, code lost:
        r19.C = r5;
        r19.f38538x += r10;
        r8 = 15;
        r19.B = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0230, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0231, code lost:
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0234, code lost:
        if (r11 == 4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0237, code lost:
        if (r11 != 7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0239, code lost:
        r19.D = r10;
        r8 = 16;
        r19.B = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x026f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h() {
        int l02;
        int l03;
        String str;
        String str2;
        int i6;
        char c10;
        long j10;
        boolean z10;
        int i10;
        int[] iArr = this.F;
        int i11 = this.G;
        int i12 = iArr[i11 - 1];
        char[] cArr = this.f38537w;
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int l04 = l0(true);
            if (l04 != 44) {
                if (l04 != 59) {
                    if (l04 == 93) {
                        this.B = 4;
                        return 4;
                    }
                    O0("Unterminated array");
                    throw null;
                }
                g();
            }
        } else if (i12 != 3 && i12 != 5) {
            if (i12 == 4) {
                iArr[i11 - 1] = 5;
                int l05 = l0(true);
                if (l05 != 58) {
                    if (l05 == 61) {
                        g();
                        if (this.f38538x < this.f38539y || o(1)) {
                            int i13 = this.f38538x;
                            if (cArr[i13] == '>') {
                                this.f38538x = i13 + 1;
                            }
                        }
                    } else {
                        O0("Expected ':'");
                        throw null;
                    }
                }
            } else if (i12 == 6) {
                if (this.f38536v) {
                    l0(true);
                    int i14 = this.f38538x - 1;
                    this.f38538x = i14;
                    if (i14 + 5 <= this.f38539y || o(5)) {
                        int i15 = this.f38538x;
                        if (cArr[i15] == ')' && cArr[i15 + 1] == ']' && cArr[i15 + 2] == '}' && cArr[i15 + 3] == '\'' && cArr[i15 + 4] == '\n') {
                            this.f38538x = i15 + 5;
                        }
                    }
                }
                this.F[this.G - 1] = 7;
                l03 = l0(true);
                if (l03 != 34) {
                    if (l03 != 39) {
                        if (l03 != 44 && l03 != 59) {
                            if (l03 != 91) {
                                if (l03 != 93) {
                                    if (l03 != 123) {
                                        int i16 = this.f38538x - 1;
                                        this.f38538x = i16;
                                        char c11 = cArr[i16];
                                        if (c11 != 't' && c11 != 'T') {
                                            if (c11 != 'f' && c11 != 'F') {
                                                if (c11 == 'n' || c11 == 'N') {
                                                    str = "null";
                                                    str2 = "NULL";
                                                    i6 = 7;
                                                }
                                                i6 = 0;
                                                if (i6 == 0) {
                                                    return i6;
                                                }
                                                int i17 = this.f38538x;
                                                int i18 = this.f38539y;
                                                long j11 = 0;
                                                long j12 = 0;
                                                int i19 = 0;
                                                char c12 = 0;
                                                boolean z11 = false;
                                                boolean z12 = true;
                                                while (true) {
                                                    if (i17 + i19 == i18) {
                                                        if (i19 == cArr.length) {
                                                            break;
                                                        } else if (!o(i19 + 1)) {
                                                            break;
                                                        } else {
                                                            int i20 = this.f38538x;
                                                            i18 = this.f38539y;
                                                            i17 = i20;
                                                        }
                                                    }
                                                    char c13 = cArr[i17 + i19];
                                                    if (c13 != '+') {
                                                        if (c13 != 'E' && c13 != 'e') {
                                                            if (c13 != '-') {
                                                                if (c13 != '.') {
                                                                    if (c13 < '0' || c13 > '9') {
                                                                        break;
                                                                    }
                                                                    if (c12 != 1 && c12 != 0) {
                                                                        if (c12 == 2) {
                                                                            if (j12 == j11) {
                                                                                break;
                                                                            }
                                                                            long j13 = (10 * j12) - (c13 - '0');
                                                                            int i21 = (j12 > (-922337203685477580L) ? 1 : (j12 == (-922337203685477580L) ? 0 : -1));
                                                                            if (i21 <= 0 && (i21 != 0 || j13 >= j12)) {
                                                                                z10 = false;
                                                                            } else {
                                                                                z10 = true;
                                                                            }
                                                                            z12 = z10 & z12;
                                                                            j12 = j13;
                                                                        } else if (c12 == 3) {
                                                                            c12 = 4;
                                                                        } else if (c12 == 5 || c12 == 6) {
                                                                            c12 = 7;
                                                                        }
                                                                    } else {
                                                                        j12 = -(c13 - '0');
                                                                        c12 = 2;
                                                                    }
                                                                    j10 = 0;
                                                                    i19++;
                                                                    j11 = j10;
                                                                } else {
                                                                    j10 = j11;
                                                                    if (c12 != 2) {
                                                                        break;
                                                                    }
                                                                    c12 = 3;
                                                                    i19++;
                                                                    j11 = j10;
                                                                }
                                                            } else {
                                                                j10 = j11;
                                                                if (c12 == 0) {
                                                                    c12 = 1;
                                                                    z11 = true;
                                                                    i19++;
                                                                    j11 = j10;
                                                                } else {
                                                                    if (c12 != 5) {
                                                                        break;
                                                                    }
                                                                    c12 = 6;
                                                                    i19++;
                                                                    j11 = j10;
                                                                }
                                                            }
                                                        } else {
                                                            j10 = j11;
                                                            if (c12 != 2 && c12 != 4) {
                                                                break;
                                                            }
                                                            c12 = 5;
                                                            i19++;
                                                            j11 = j10;
                                                        }
                                                        if (i10 == 0) {
                                                            return i10;
                                                        }
                                                        if (O(cArr[this.f38538x])) {
                                                            g();
                                                            this.B = 10;
                                                            return 10;
                                                        }
                                                        O0("Expected value");
                                                        throw null;
                                                    }
                                                    j10 = j11;
                                                    if (c12 != 5) {
                                                        break;
                                                    }
                                                    c12 = 6;
                                                    i19++;
                                                    j11 = j10;
                                                }
                                                i10 = 0;
                                                if (i10 == 0) {
                                                }
                                            } else {
                                                str = "false";
                                                str2 = "FALSE";
                                                i6 = 6;
                                            }
                                        } else {
                                            str = "true";
                                            str2 = "TRUE";
                                            i6 = 5;
                                        }
                                        int length = str.length();
                                        int i22 = 1;
                                        while (true) {
                                            if (i22 < length) {
                                                if ((this.f38538x + i22 >= this.f38539y && !o(i22 + 1)) || ((c10 = cArr[this.f38538x + i22]) != str.charAt(i22) && c10 != str2.charAt(i22))) {
                                                    break;
                                                }
                                                i22++;
                                            } else if ((this.f38538x + length >= this.f38539y && !o(length + 1)) || !O(cArr[this.f38538x + length])) {
                                                this.f38538x += length;
                                                this.B = i6;
                                            }
                                        }
                                        i6 = 0;
                                        if (i6 == 0) {
                                        }
                                    } else {
                                        this.B = 1;
                                        return 1;
                                    }
                                } else if (i12 == 1) {
                                    this.B = 4;
                                    return 4;
                                }
                            } else {
                                this.B = 3;
                                return 3;
                            }
                        }
                        if (i12 != 1 && i12 != 2) {
                            O0("Unexpected value");
                            throw null;
                        }
                        g();
                        this.f38538x--;
                        this.B = 7;
                        return 7;
                    }
                    g();
                    this.B = 8;
                    return 8;
                }
                this.B = 9;
                return 9;
            } else {
                if (i12 == 7) {
                    if (l0(false) == -1) {
                        this.B = 17;
                        return 17;
                    }
                    g();
                    this.f38538x--;
                } else if (i12 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                l03 = l0(true);
                if (l03 != 34) {
                }
            }
        } else {
            iArr[i11 - 1] = 4;
            if (i12 == 5 && (l02 = l0(true)) != 44) {
                if (l02 != 59) {
                    if (l02 == 125) {
                        this.B = 2;
                        return 2;
                    }
                    O0("Unterminated object");
                    throw null;
                }
                g();
            }
            int l06 = l0(true);
            if (l06 != 34) {
                if (l06 != 39) {
                    if (l06 != 125) {
                        g();
                        this.f38538x--;
                        if (O((char) l06)) {
                            this.B = 14;
                            return 14;
                        }
                        O0("Expected name");
                        throw null;
                    } else if (i12 != 5) {
                        this.B = 2;
                        return 2;
                    } else {
                        O0("Expected name");
                        throw null;
                    }
                }
                g();
                this.B = 12;
                return 12;
            }
            this.B = 13;
            return 13;
        }
        l03 = l0(true);
        if (l03 != 34) {
        }
    }

    public long h0() {
        char c10;
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        if (i6 == 15) {
            this.B = 0;
            int[] iArr = this.I;
            int i10 = this.G - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.C;
        }
        if (i6 == 16) {
            this.E = new String(this.f38537w, this.f38538x, this.D);
            this.f38538x += this.D;
        } else if (i6 != 8 && i6 != 9 && i6 != 10) {
            throw new IllegalStateException("Expected a long but was " + b0.k(y0()) + R());
        } else {
            if (i6 == 10) {
                this.E = w0();
            } else {
                if (i6 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.E = q0(c10);
            }
            try {
                long parseLong = Long.parseLong(this.E);
                this.B = 0;
                int[] iArr2 = this.I;
                int i11 = this.G - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.B = 11;
        double parseDouble = Double.parseDouble(this.E);
        long j10 = (long) parseDouble;
        if (j10 == parseDouble) {
            this.E = null;
            this.B = 0;
            int[] iArr3 = this.I;
            int i12 = this.G - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return j10;
        }
        throw new NumberFormatException("Expected a long but was " + this.E + R());
    }

    public void j() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        if (i6 == 4) {
            int i10 = this.G - 1;
            this.G = i10;
            int[] iArr = this.I;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            this.B = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + b0.k(y0()) + R());
    }

    public String k0() {
        String q02;
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        if (i6 == 14) {
            q02 = w0();
        } else if (i6 == 12) {
            q02 = q0('\'');
        } else if (i6 == 13) {
            q02 = q0('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + b0.k(y0()) + R());
        }
        this.B = 0;
        this.H[this.G - 1] = q02;
        return q02;
    }

    public final int l0(boolean z10) {
        int i6 = this.f38538x;
        int i10 = this.f38539y;
        while (true) {
            boolean z11 = true;
            if (i6 == i10) {
                this.f38538x = i6;
                if (!o(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + R());
                }
                i6 = this.f38538x;
                i10 = this.f38539y;
            }
            int i11 = i6 + 1;
            char[] cArr = this.f38537w;
            char c10 = cArr[i6];
            if (c10 == '\n') {
                this.f38540z++;
                this.A = i11;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f38538x = i11;
                    if (i11 == i10) {
                        this.f38538x = i11 - 1;
                        boolean o10 = o(2);
                        this.f38538x++;
                        if (!o10) {
                            return c10;
                        }
                    }
                    g();
                    int i12 = this.f38538x;
                    char c11 = cArr[i12];
                    if (c11 != '*') {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f38538x = i12 + 1;
                        M0();
                        i6 = this.f38538x;
                        i10 = this.f38539y;
                    } else {
                        this.f38538x = i12 + 1;
                        while (true) {
                            if (this.f38538x + 2 > this.f38539y && !o(2)) {
                                z11 = false;
                                break;
                            }
                            int i13 = this.f38538x;
                            if (cArr[i13] == '\n') {
                                this.f38540z++;
                                this.A = i13 + 1;
                            } else {
                                for (int i14 = 0; i14 < 2; i14++) {
                                    if (cArr[this.f38538x + i14] != "*/".charAt(i14)) {
                                        break;
                                    }
                                }
                                break;
                            }
                            this.f38538x++;
                        }
                        if (z11) {
                            i6 = this.f38538x + 2;
                            i10 = this.f38539y;
                        } else {
                            O0("Unterminated comment");
                            throw null;
                        }
                    }
                } else if (c10 == '#') {
                    this.f38538x = i11;
                    g();
                    M0();
                    i6 = this.f38538x;
                    i10 = this.f38539y;
                } else {
                    this.f38538x = i11;
                    return c10;
                }
            }
            i6 = i11;
        }
    }

    public void m() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        if (i6 == 2) {
            int i10 = this.G - 1;
            this.G = i10;
            this.H[i10] = null;
            int[] iArr = this.I;
            int i11 = i10 - 1;
            iArr[i11] = iArr[i11] + 1;
            this.B = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + b0.k(y0()) + R());
    }

    public final boolean o(int i6) {
        int i10;
        int i11;
        int i12 = this.A;
        int i13 = this.f38538x;
        this.A = i12 - i13;
        int i14 = this.f38539y;
        char[] cArr = this.f38537w;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f38539y = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f38539y = 0;
        }
        this.f38538x = 0;
        do {
            int i16 = this.f38539y;
            int read = this.f38535u.read(cArr, i16, cArr.length - i16);
            if (read == -1) {
                return false;
            }
            i10 = this.f38539y + read;
            this.f38539y = i10;
            if (this.f38540z == 0 && (i11 = this.A) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f38538x++;
                this.A = i11 + 1;
                i6++;
                continue;
            }
        } while (i10 < i6);
        return true;
    }

    public void p0() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        if (i6 == 7) {
            this.B = 0;
            int[] iArr = this.I;
            int i10 = this.G - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + b0.k(y0()) + R());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        r10.f38538x = r8;
        r8 = (r8 - r2) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r8 + 1) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r4 - r2) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        r1.append(r7, r2, r4 - r2);
        r10.f38538x = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String q0(char c10) {
        char[] cArr;
        int i6;
        StringBuilder sb2 = null;
        do {
            int i10 = this.f38538x;
            int i11 = this.f38539y;
            while (true) {
                int i12 = i10;
                while (true) {
                    cArr = this.f38537w;
                    if (i12 >= i11) {
                        break;
                    }
                    int i13 = i12 + 1;
                    char c11 = cArr[i12];
                    if (c11 == c10) {
                        this.f38538x = i13;
                        int i14 = (i13 - i10) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i10, i14);
                        }
                        sb2.append(cArr, i10, i14);
                        return sb2.toString();
                    } else if (c11 == '\\') {
                        break;
                    } else {
                        if (c11 == '\n') {
                            this.f38540z++;
                            this.A = i13;
                        }
                        i12 = i13;
                    }
                }
                sb2.append(cArr, i10, i6);
                sb2.append(K0());
                i10 = this.f38538x;
                i11 = this.f38539y;
            }
        } while (o(1));
        O0("Unterminated string");
        throw null;
    }

    public String s() {
        return G(false);
    }

    public String toString() {
        return getClass().getSimpleName() + R();
    }

    public String v0() {
        String str;
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        if (i6 == 10) {
            str = w0();
        } else if (i6 == 8) {
            str = q0('\'');
        } else if (i6 == 9) {
            str = q0('\"');
        } else if (i6 == 11) {
            str = this.E;
            this.E = null;
        } else if (i6 == 15) {
            str = Long.toString(this.C);
        } else if (i6 == 16) {
            str = new String(this.f38537w, this.f38538x, this.D);
            this.f38538x += this.D;
        } else {
            throw new IllegalStateException("Expected a string but was " + b0.k(y0()) + R());
        }
        this.B = 0;
        int[] iArr = this.I;
        int i10 = this.G - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        g();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String w0() {
        char[] cArr;
        String sb2;
        StringBuilder sb3 = null;
        int i6 = 0;
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f38538x;
                int i12 = i11 + i10;
                int i13 = this.f38539y;
                cArr = this.f38537w;
                if (i12 < i13) {
                    char c10 = cArr[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                                case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                                                    break;
                                                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                                    break;
                                                default:
                                                    i10++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i10 < cArr.length) {
                    if (o(i10 + 1)) {
                    }
                } else {
                    if (sb3 == null) {
                        sb3 = new StringBuilder(Math.max(i10, 16));
                    }
                    sb3.append(cArr, this.f38538x, i10);
                    this.f38538x += i10;
                }
            }
            i6 = i10;
            if (sb3 != null) {
                sb2 = new String(cArr, this.f38538x, i6);
            } else {
                sb3.append(cArr, this.f38538x, i6);
                sb2 = sb3.toString();
            }
            this.f38538x += i6;
            return sb2;
        } while (o(1));
        if (sb3 != null) {
        }
        this.f38538x += i6;
        return sb2;
    }

    public int y0() {
        int i6 = this.B;
        if (i6 == 0) {
            i6 = h();
        }
        switch (i6) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }
}
