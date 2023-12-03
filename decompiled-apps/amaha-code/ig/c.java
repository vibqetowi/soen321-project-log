package ig;

import com.appsflyer.R;
/* compiled from: Version.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final c[] f20038d = a();

    /* renamed from: a  reason: collision with root package name */
    public final int f20039a;

    /* renamed from: b  reason: collision with root package name */
    public final b[] f20040b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20041c;

    /* compiled from: Version.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f20042a;

        /* renamed from: b  reason: collision with root package name */
        public final int f20043b;

        public a(int i6, int i10) {
            this.f20042a = i6;
            this.f20043b = i10;
        }
    }

    /* compiled from: Version.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f20044a;

        /* renamed from: b  reason: collision with root package name */
        public final a[] f20045b;

        public b(int i6, a... aVarArr) {
            this.f20044a = i6;
            this.f20045b = aVarArr;
        }
    }

    public c(int i6, b... bVarArr) {
        a[] aVarArr;
        this.f20039a = i6;
        this.f20040b = bVarArr;
        b bVar = bVarArr[0];
        int i10 = bVar.f20044a;
        int i11 = 0;
        for (a aVar : bVar.f20045b) {
            i11 += (aVar.f20043b + i10) * aVar.f20042a;
        }
        this.f20041c = i11;
    }

    public static c[] a() {
        return new c[]{new c(1, new b(7, new a(1, 19)), new b(10, new a(1, 16)), new b(13, new a(1, 13)), new b(17, new a(1, 9))), new c(2, new b(10, new a(1, 34)), new b(16, new a(1, 28)), new b(22, new a(1, 22)), new b(28, new a(1, 16))), new c(3, new b(15, new a(1, 55)), new b(26, new a(1, 44)), new b(18, new a(2, 17)), new b(22, new a(2, 13))), new c(4, new b(20, new a(1, 80)), new b(18, new a(2, 32)), new b(26, new a(2, 24)), new b(16, new a(4, 9))), new c(5, new b(26, new a(1, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle)), new b(24, new a(2, 43)), new b(18, new a(2, 15), new a(2, 16)), new b(22, new a(2, 11), new a(2, 12))), new c(6, new b(18, new a(2, 68)), new b(16, new a(4, 27)), new b(24, new a(4, 19)), new b(28, new a(4, 15))), new c(7, new b(20, new a(2, 78)), new b(18, new a(4, 31)), new b(18, new a(2, 14), new a(4, 15)), new b(26, new a(4, 13), new a(1, 14))), new c(8, new b(24, new a(2, 97)), new b(22, new a(2, 38), new a(2, 39)), new b(22, new a(4, 18), new a(2, 19)), new b(26, new a(4, 14), new a(2, 15))), new c(9, new b(30, new a(2, R.styleable.AppCompatTheme_viewInflaterClass)), new b(22, new a(3, 36), new a(2, 37)), new b(20, new a(4, 16), new a(4, 17)), new b(24, new a(4, 12), new a(4, 13))), new c(10, new b(18, new a(2, 68), new a(2, 69)), new b(26, new a(4, 43), new a(1, 44)), new b(24, new a(6, 19), new a(2, 20)), new b(28, new a(6, 15), new a(2, 16))), new c(11, new b(20, new a(4, 81)), new b(30, new a(1, 50), new a(4, 51)), new b(28, new a(4, 22), new a(4, 23)), new b(24, new a(3, 12), new a(8, 13))), new c(12, new b(24, new a(2, 92), new a(2, 93)), new b(22, new a(6, 36), new a(2, 37)), new b(26, new a(4, 20), new a(6, 21)), new b(28, new a(7, 14), new a(4, 15))), new c(13, new b(26, new a(4, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle)), new b(22, new a(8, 37), new a(1, 38)), new b(24, new a(8, 20), new a(4, 21)), new b(22, new a(12, 11), new a(4, 12))), new c(14, new b(30, new a(3, R.styleable.AppCompatTheme_tooltipFrameBackground), new a(1, R.styleable.AppCompatTheme_viewInflaterClass)), new b(24, new a(4, 40), new a(5, 41)), new b(20, new a(11, 16), new a(5, 17)), new b(24, new a(11, 12), new a(5, 13))), new c(15, new b(22, new a(5, 87), new a(1, 88)), new b(24, new a(5, 41), new a(5, 42)), new b(30, new a(5, 24), new a(7, 25)), new b(24, new a(11, 12), new a(7, 13))), new c(16, new b(24, new a(5, 98), new a(1, 99)), new b(28, new a(7, 45), new a(3, 46)), new b(24, new a(15, 19), new a(2, 20)), new b(30, new a(3, 15), new a(13, 16))), new c(17, new b(28, new a(1, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle), new a(5, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle)), new b(28, new a(10, 46), new a(1, 47)), new b(28, new a(1, 22), new a(15, 23)), new b(28, new a(2, 14), new a(17, 15))), new c(18, new b(30, new a(5, R.styleable.AppCompatTheme_windowFixedHeightMajor), new a(1, R.styleable.AppCompatTheme_windowFixedHeightMinor)), new b(26, new a(9, 43), new a(4, 44)), new b(28, new a(17, 22), new a(1, 23)), new b(28, new a(2, 14), new a(19, 15))), new c(19, new b(28, new a(3, R.styleable.AppCompatTheme_toolbarStyle), new a(4, R.styleable.AppCompatTheme_tooltipForegroundColor)), new b(26, new a(3, 44), new a(11, 45)), new b(26, new a(17, 21), new a(4, 22)), new b(26, new a(9, 13), new a(16, 14))), new c(20, new b(28, new a(3, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle), new a(5, R.styleable.AppCompatTheme_textAppearanceSearchResultTitle)), new b(26, new a(3, 41), new a(13, 42)), new b(30, new a(15, 24), new a(5, 25)), new b(28, new a(15, 15), new a(10, 16))), new c(21, new b(28, new a(4, R.styleable.AppCompatTheme_viewInflaterClass), new a(4, R.styleable.AppCompatTheme_windowActionBar)), new b(26, new a(17, 42)), new b(28, new a(17, 22), new a(6, 23)), new b(30, new a(19, 16), new a(6, 17))), new c(22, new b(28, new a(2, R.styleable.AppCompatTheme_textColorSearchUrl), new a(7, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new b(28, new a(17, 46)), new b(30, new a(7, 24), new a(16, 25)), new b(24, new a(34, 13))), new c(23, new b(30, new a(4, R.styleable.AppCompatTheme_windowFixedHeightMinor), new a(5, R.styleable.AppCompatTheme_windowFixedWidthMajor)), new b(28, new a(4, 47), new a(14, 48)), new b(30, new a(11, 24), new a(14, 25)), new b(30, new a(16, 15), new a(14, 16))), new c(24, new b(30, new a(6, R.styleable.AppCompatTheme_windowActionBar), new a(4, R.styleable.AppCompatTheme_windowActionBarOverlay)), new b(28, new a(6, 45), new a(14, 46)), new b(30, new a(11, 24), new a(16, 25)), new b(30, new a(30, 16), new a(2, 17))), new c(25, new b(26, new a(8, R.styleable.AppCompatTheme_textAppearancePopupMenuHeader), new a(4, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle)), new b(28, new a(8, 47), new a(13, 48)), new b(30, new a(7, 24), new a(22, 25)), new b(30, new a(22, 15), new a(13, 16))), new c(26, new b(28, new a(10, R.styleable.AppCompatTheme_tooltipForegroundColor), new a(2, R.styleable.AppCompatTheme_tooltipFrameBackground)), new b(28, new a(19, 46), new a(4, 47)), new b(28, new a(28, 22), new a(6, 23)), new b(30, new a(33, 16), new a(4, 17))), new c(27, new b(30, new a(8, R.styleable.AppCompatTheme_windowFixedWidthMajor), new a(4, R.styleable.AppCompatTheme_windowFixedWidthMinor)), new b(28, new a(22, 45), new a(3, 46)), new b(30, new a(8, 23), new a(26, 24)), new b(30, new a(12, 15), new a(28, 16))), new c(28, new b(30, new a(3, R.styleable.AppCompatTheme_windowActionBar), new a(10, R.styleable.AppCompatTheme_windowActionBarOverlay)), new b(28, new a(3, 45), new a(23, 46)), new b(30, new a(4, 24), new a(31, 25)), new b(30, new a(11, 15), new a(31, 16))), new c(29, new b(30, new a(7, R.styleable.AppCompatTheme_viewInflaterClass), new a(7, R.styleable.AppCompatTheme_windowActionBar)), new b(28, new a(21, 45), new a(7, 46)), new b(30, new a(1, 23), new a(37, 24)), new b(30, new a(19, 15), new a(26, 16))), new c(30, new b(30, new a(5, R.styleable.AppCompatTheme_tooltipFrameBackground), new a(10, R.styleable.AppCompatTheme_viewInflaterClass)), new b(28, new a(19, 47), new a(10, 48)), new b(30, new a(15, 24), new a(25, 25)), new b(30, new a(23, 15), new a(25, 16))), new c(31, new b(30, new a(13, R.styleable.AppCompatTheme_tooltipFrameBackground), new a(3, R.styleable.AppCompatTheme_viewInflaterClass)), new b(28, new a(2, 46), new a(29, 47)), new b(30, new a(42, 24), new a(1, 25)), new b(30, new a(23, 15), new a(28, 16))), new c(32, new b(30, new a(17, R.styleable.AppCompatTheme_tooltipFrameBackground)), new b(28, new a(10, 46), new a(23, 47)), new b(30, new a(10, 24), new a(35, 25)), new b(30, new a(19, 15), new a(35, 16))), new c(33, new b(30, new a(17, R.styleable.AppCompatTheme_tooltipFrameBackground), new a(1, R.styleable.AppCompatTheme_viewInflaterClass)), new b(28, new a(14, 46), new a(21, 47)), new b(30, new a(29, 24), new a(19, 25)), new b(30, new a(11, 15), new a(46, 16))), new c(34, new b(30, new a(13, R.styleable.AppCompatTheme_tooltipFrameBackground), new a(6, R.styleable.AppCompatTheme_viewInflaterClass)), new b(28, new a(14, 46), new a(23, 47)), new b(30, new a(44, 24), new a(7, 25)), new b(30, new a(59, 16), new a(1, 17))), new c(35, new b(30, new a(12, R.styleable.AppCompatTheme_windowFixedHeightMinor), new a(7, R.styleable.AppCompatTheme_windowFixedWidthMajor)), new b(28, new a(12, 47), new a(26, 48)), new b(30, new a(39, 24), new a(14, 25)), new b(30, new a(22, 15), new a(41, 16))), new c(36, new b(30, new a(6, R.styleable.AppCompatTheme_windowFixedHeightMinor), new a(14, R.styleable.AppCompatTheme_windowFixedWidthMajor)), new b(28, new a(6, 47), new a(34, 48)), new b(30, new a(46, 24), new a(10, 25)), new b(30, new a(2, 15), new a(64, 16))), new c(37, new b(30, new a(17, R.styleable.AppCompatTheme_windowFixedWidthMajor), new a(4, R.styleable.AppCompatTheme_windowFixedWidthMinor)), new b(28, new a(29, 46), new a(14, 47)), new b(30, new a(49, 24), new a(10, 25)), new b(30, new a(24, 15), new a(46, 16))), new c(38, new b(30, new a(4, R.styleable.AppCompatTheme_windowFixedWidthMajor), new a(18, R.styleable.AppCompatTheme_windowFixedWidthMinor)), new b(28, new a(13, 46), new a(32, 47)), new b(30, new a(48, 24), new a(14, 25)), new b(30, new a(42, 15), new a(32, 16))), new c(39, new b(30, new a(20, R.styleable.AppCompatTheme_windowActionBar), new a(4, R.styleable.AppCompatTheme_windowActionBarOverlay)), new b(28, new a(40, 47), new a(7, 48)), new b(30, new a(43, 24), new a(22, 25)), new b(30, new a(10, 15), new a(67, 16))), new c(40, new b(30, new a(19, R.styleable.AppCompatTheme_windowActionBarOverlay), new a(6, R.styleable.AppCompatTheme_windowActionModeOverlay)), new b(28, new a(18, 47), new a(31, 48)), new b(30, new a(34, 24), new a(34, 25)), new b(30, new a(20, 15), new a(61, 16)))};
    }

    public static c b(int i6) {
        if (i6 > 0 && i6 <= 40) {
            return f20038d[i6 - 1];
        }
        throw new IllegalArgumentException();
    }

    public final String toString() {
        return String.valueOf(this.f20039a);
    }
}
