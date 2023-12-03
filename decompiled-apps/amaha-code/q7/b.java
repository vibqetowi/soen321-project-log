package q7;

import com.appsflyer.R;
/* compiled from: Ac3Util.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f29233a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f29234b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f29235c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f29236d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f29237e = {32, 40, 48, 56, 64, 80, 96, R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, R.styleable.AppCompatTheme_windowFixedHeightMinor, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i6, int i10) {
        int i11 = i10 / 2;
        if (i6 >= 0 && i6 < 3 && i10 >= 0 && i11 < 19) {
            int i12 = f29234b[i6];
            if (i12 == 44100) {
                return ((i10 % 2) + f[i11]) * 2;
            }
            int i13 = f29237e[i11];
            if (i12 == 32000) {
                return i13 * 6;
            }
            return i13 * 4;
        }
        return -1;
    }
}
