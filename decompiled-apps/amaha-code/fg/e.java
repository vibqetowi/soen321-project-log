package fg;

import com.appsflyer.R;
/* compiled from: SymbolInfo.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: i  reason: collision with root package name */
    public static final e[] f15043i = {new e(false, 3, 5, 8, 8, 1), new e(false, 5, 7, 10, 10, 1), new e(true, 5, 7, 16, 6, 1), new e(false, 8, 10, 12, 12, 1), new e(true, 10, 11, 14, 6, 2), new e(false, 12, 12, 14, 14, 1), new e(true, 16, 14, 24, 10, 1), new e(false, 18, 14, 16, 16, 1), new e(false, 22, 18, 18, 18, 1), new e(true, 22, 18, 16, 10, 2), new e(false, 30, 20, 20, 20, 1), new e(true, 32, 24, 16, 14, 2), new e(false, 36, 24, 22, 22, 1), new e(false, 44, 28, 24, 24, 1), new e(true, 49, 28, 22, 14, 2), new e(false, 62, 36, 14, 14, 4), new e(false, 86, 42, 16, 16, 4), new e(false, R.styleable.AppCompatTheme_tooltipForegroundColor, 48, 18, 18, 4), new e(false, 144, 56, 20, 20, 4), new e(false, 174, 68, 22, 22, 4), new e(false, 204, 84, 24, 24, 4, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 42), new e(false, 280, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 14, 14, 16, 140, 56), new e(false, 368, 144, 16, 16, 16, 92, 36), new e(false, 456, 192, 18, 18, 16, R.styleable.AppCompatTheme_tooltipForegroundColor, 48), new e(false, 576, 224, 20, 20, 16, 144, 56), new e(false, 696, 272, 22, 22, 16, 174, 68), new e(false, 816, 336, 24, 24, 16, 136, 56), new e(false, 1050, 408, 18, 18, 36, 175, 68), new e(false, 1304, 496, 20, 20, 36, 163, 62), new a()};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15044a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15045b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15046c;

    /* renamed from: d  reason: collision with root package name */
    public final int f15047d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15048e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15049g;

    /* renamed from: h  reason: collision with root package name */
    public final int f15050h;

    public e(boolean z10, int i6, int i10, int i11, int i12, int i13) {
        this(z10, i6, i10, i11, i12, i13, i6, i10);
    }

    public static e f(int i6, f fVar, bg.b bVar, bg.b bVar2) {
        e[] eVarArr = f15043i;
        for (int i10 = 0; i10 < 30; i10++) {
            e eVar = eVarArr[i10];
            if ((fVar != f.FORCE_SQUARE || !eVar.f15044a) && ((fVar != f.FORCE_RECTANGLE || eVar.f15044a) && ((bVar == null || (eVar.d() >= 0 && (eVar.e() * eVar.f15048e) + (eVar.e() << 1) >= 0)) && ((bVar2 == null || (eVar.d() <= 0 && (eVar.e() * eVar.f15048e) + (eVar.e() << 1) <= 0)) && i6 <= eVar.f15045b)))) {
                return eVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i6)));
    }

    public int a(int i6) {
        return this.f15049g;
    }

    public final int b() {
        int i6 = 1;
        int i10 = this.f;
        if (i10 != 1) {
            i6 = 2;
            if (i10 != 2 && i10 != 4) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i6;
    }

    public int c() {
        return this.f15045b / this.f15049g;
    }

    public final int d() {
        return (b() * this.f15047d) + (b() << 1);
    }

    public final int e() {
        int i6 = this.f;
        if (i6 == 1 || i6 == 2) {
            return 1;
        }
        if (i6 == 4) {
            return 2;
        }
        if (i6 == 16) {
            return 4;
        }
        if (i6 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f15044a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb2.append(str);
        sb2.append(" data region ");
        int i6 = this.f15047d;
        sb2.append(i6);
        sb2.append('x');
        int i10 = this.f15048e;
        sb2.append(i10);
        sb2.append(", symbol size ");
        sb2.append(d());
        sb2.append('x');
        sb2.append((e() * i10) + (e() << 1));
        sb2.append(", symbol data size ");
        sb2.append(b() * i6);
        sb2.append('x');
        sb2.append(e() * i10);
        sb2.append(", codewords ");
        sb2.append(this.f15045b);
        sb2.append('+');
        sb2.append(this.f15046c);
        return sb2.toString();
    }

    public e(boolean z10, int i6, int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f15044a = z10;
        this.f15045b = i6;
        this.f15046c = i10;
        this.f15047d = i11;
        this.f15048e = i12;
        this.f = i13;
        this.f15049g = i14;
        this.f15050h = i15;
    }
}
