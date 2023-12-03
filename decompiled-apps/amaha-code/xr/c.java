package xr;

import com.appsflyer.R;
import javax.security.auth.x500.X500Principal;
/* compiled from: DistinguishedNameParser.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f37949a;

    /* renamed from: b  reason: collision with root package name */
    public final int f37950b;

    /* renamed from: c  reason: collision with root package name */
    public int f37951c;

    /* renamed from: d  reason: collision with root package name */
    public int f37952d;

    /* renamed from: e  reason: collision with root package name */
    public int f37953e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public char[] f37954g;

    public c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f37949a = name;
        this.f37950b = name.length();
    }

    public final int a(int i6) {
        int i10;
        int i11;
        int i12 = i6 + 1;
        int i13 = this.f37950b;
        String str = this.f37949a;
        if (i12 < i13) {
            char[] cArr = this.f37954g;
            char c10 = cArr[i6];
            if (c10 >= '0' && c10 <= '9') {
                i10 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i10 = c10 - 'W';
            } else if (c10 >= 'A' && c10 <= 'F') {
                i10 = c10 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            char c11 = cArr[i12];
            if (c11 >= '0' && c11 <= '9') {
                i11 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i11 = c11 - 'W';
            } else if (c11 >= 'A' && c11 <= 'F') {
                i11 = c11 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            return (i10 << 4) + i11;
        }
        throw new IllegalStateException("Malformed DN: " + str);
    }

    public final char b() {
        int i6;
        int i10 = this.f37951c + 1;
        this.f37951c = i10;
        int i11 = this.f37950b;
        if (i10 != i11) {
            char c10 = this.f37954g[i10];
            if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
                switch (c10) {
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        break;
                    default:
                        switch (c10) {
                            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                                break;
                            default:
                                int a10 = a(i10);
                                this.f37951c++;
                                if (a10 >= 128) {
                                    if (a10 >= 192 && a10 <= 247) {
                                        if (a10 <= 223) {
                                            a10 &= 31;
                                            i6 = 1;
                                        } else if (a10 <= 239) {
                                            a10 &= 15;
                                            i6 = 2;
                                        } else {
                                            a10 &= 7;
                                            i6 = 3;
                                        }
                                        for (int i12 = 0; i12 < i6; i12++) {
                                            int i13 = this.f37951c + 1;
                                            this.f37951c = i13;
                                            if (i13 != i11 && this.f37954g[i13] == '\\') {
                                                int i14 = i13 + 1;
                                                this.f37951c = i14;
                                                int a11 = a(i14);
                                                this.f37951c++;
                                                if ((a11 & 192) == 128) {
                                                    a10 = (a10 << 6) + (a11 & 63);
                                                }
                                            }
                                        }
                                    }
                                    return '?';
                                }
                                return (char) a10;
                        }
                }
            }
            return c10;
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f37949a);
    }

    public final String c() {
        int i6;
        int i10;
        int i11;
        char c10;
        int i12;
        char c11;
        char c12;
        while (true) {
            i6 = this.f37951c;
            i10 = this.f37950b;
            if (i6 >= i10 || this.f37954g[i6] != ' ') {
                break;
            }
            this.f37951c = i6 + 1;
        }
        if (i6 == i10) {
            return null;
        }
        this.f37952d = i6;
        this.f37951c = i6 + 1;
        while (true) {
            i11 = this.f37951c;
            if (i11 >= i10 || (c12 = this.f37954g[i11]) == '=' || c12 == ' ') {
                break;
            }
            this.f37951c = i11 + 1;
        }
        String str = this.f37949a;
        if (i11 < i10) {
            this.f37953e = i11;
            if (this.f37954g[i11] == ' ') {
                while (true) {
                    i12 = this.f37951c;
                    if (i12 >= i10 || (c11 = this.f37954g[i12]) == '=' || c11 != ' ') {
                        break;
                    }
                    this.f37951c = i12 + 1;
                }
                if (this.f37954g[i12] != '=' || i12 == i10) {
                    throw new IllegalStateException("Unexpected end of DN: " + str);
                }
            }
            this.f37951c++;
            while (true) {
                int i13 = this.f37951c;
                if (i13 >= i10 || this.f37954g[i13] != ' ') {
                    break;
                }
                this.f37951c = i13 + 1;
            }
            int i14 = this.f37953e;
            int i15 = this.f37952d;
            if (i14 - i15 > 4) {
                char[] cArr = this.f37954g;
                if (cArr[i15 + 3] == '.' && (((c10 = cArr[i15]) == 'O' || c10 == 'o') && ((cArr[i15 + 1] == 'I' || cArr[i15 + 1] == 'i') && (cArr[i15 + 2] == 'D' || cArr[i15 + 2] == 'd')))) {
                    this.f37952d = i15 + 4;
                }
            }
            char[] cArr2 = this.f37954g;
            int i16 = this.f37952d;
            return new String(cArr2, i16, i14 - i16);
        }
        throw new IllegalStateException("Unexpected end of DN: " + str);
    }
}
