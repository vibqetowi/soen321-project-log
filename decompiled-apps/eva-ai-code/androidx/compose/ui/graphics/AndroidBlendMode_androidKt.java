package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import android.os.Build;
import kotlin.Metadata;
/* compiled from: AndroidBlendMode.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\n*\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidBlendMode_androidKt {
    /* renamed from: isSupported-s9anfk8  reason: not valid java name */
    public static final boolean m3109isSupporteds9anfk8(int i) {
        return Build.VERSION.SDK_INT >= 29 || BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3235getSrcOver0nO6VwU()) || m3111toPorterDuffModes9anfk8(i) != PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: toPorterDuffMode-s9anfk8  reason: not valid java name */
    public static final PorterDuff.Mode m3111toPorterDuffModes9anfk8(int i) {
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3208getClear0nO6VwU())) {
            return PorterDuff.Mode.CLEAR;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3231getSrc0nO6VwU())) {
            return PorterDuff.Mode.SRC;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3214getDst0nO6VwU())) {
            return PorterDuff.Mode.DST;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3235getSrcOver0nO6VwU())) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3218getDstOver0nO6VwU())) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3233getSrcIn0nO6VwU())) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3216getDstIn0nO6VwU())) {
            return PorterDuff.Mode.DST_IN;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3234getSrcOut0nO6VwU())) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3217getDstOut0nO6VwU())) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3232getSrcAtop0nO6VwU())) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3215getDstAtop0nO6VwU())) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3236getXor0nO6VwU())) {
            return PorterDuff.Mode.XOR;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3227getPlus0nO6VwU())) {
            return PorterDuff.Mode.ADD;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3229getScreen0nO6VwU())) {
            return PorterDuff.Mode.SCREEN;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3226getOverlay0nO6VwU())) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3212getDarken0nO6VwU())) {
            return PorterDuff.Mode.DARKEN;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3222getLighten0nO6VwU())) {
            return PorterDuff.Mode.LIGHTEN;
        }
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3224getModulate0nO6VwU())) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: toAndroidBlendMode-s9anfk8  reason: not valid java name */
    public static final android.graphics.BlendMode m3110toAndroidBlendModes9anfk8(int i) {
        android.graphics.BlendMode blendMode;
        android.graphics.BlendMode blendMode2;
        android.graphics.BlendMode blendMode3;
        android.graphics.BlendMode blendMode4;
        android.graphics.BlendMode blendMode5;
        android.graphics.BlendMode blendMode6;
        android.graphics.BlendMode blendMode7;
        android.graphics.BlendMode blendMode8;
        android.graphics.BlendMode blendMode9;
        android.graphics.BlendMode blendMode10;
        android.graphics.BlendMode blendMode11;
        android.graphics.BlendMode blendMode12;
        android.graphics.BlendMode blendMode13;
        android.graphics.BlendMode blendMode14;
        android.graphics.BlendMode blendMode15;
        android.graphics.BlendMode blendMode16;
        android.graphics.BlendMode blendMode17;
        android.graphics.BlendMode blendMode18;
        android.graphics.BlendMode blendMode19;
        android.graphics.BlendMode blendMode20;
        android.graphics.BlendMode blendMode21;
        android.graphics.BlendMode blendMode22;
        android.graphics.BlendMode blendMode23;
        android.graphics.BlendMode blendMode24;
        android.graphics.BlendMode blendMode25;
        android.graphics.BlendMode blendMode26;
        android.graphics.BlendMode blendMode27;
        android.graphics.BlendMode blendMode28;
        android.graphics.BlendMode blendMode29;
        android.graphics.BlendMode blendMode30;
        if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3208getClear0nO6VwU())) {
            blendMode30 = android.graphics.BlendMode.CLEAR;
            return blendMode30;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3231getSrc0nO6VwU())) {
            blendMode29 = android.graphics.BlendMode.SRC;
            return blendMode29;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3214getDst0nO6VwU())) {
            blendMode28 = android.graphics.BlendMode.DST;
            return blendMode28;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3235getSrcOver0nO6VwU())) {
            blendMode27 = android.graphics.BlendMode.SRC_OVER;
            return blendMode27;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3218getDstOver0nO6VwU())) {
            blendMode26 = android.graphics.BlendMode.DST_OVER;
            return blendMode26;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3233getSrcIn0nO6VwU())) {
            blendMode25 = android.graphics.BlendMode.SRC_IN;
            return blendMode25;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3216getDstIn0nO6VwU())) {
            blendMode24 = android.graphics.BlendMode.DST_IN;
            return blendMode24;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3234getSrcOut0nO6VwU())) {
            blendMode23 = android.graphics.BlendMode.SRC_OUT;
            return blendMode23;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3217getDstOut0nO6VwU())) {
            blendMode22 = android.graphics.BlendMode.DST_OUT;
            return blendMode22;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3232getSrcAtop0nO6VwU())) {
            blendMode21 = android.graphics.BlendMode.SRC_ATOP;
            return blendMode21;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3215getDstAtop0nO6VwU())) {
            blendMode20 = android.graphics.BlendMode.DST_ATOP;
            return blendMode20;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3236getXor0nO6VwU())) {
            blendMode19 = android.graphics.BlendMode.XOR;
            return blendMode19;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3227getPlus0nO6VwU())) {
            blendMode18 = android.graphics.BlendMode.PLUS;
            return blendMode18;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3224getModulate0nO6VwU())) {
            blendMode17 = android.graphics.BlendMode.MODULATE;
            return blendMode17;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3229getScreen0nO6VwU())) {
            blendMode16 = android.graphics.BlendMode.SCREEN;
            return blendMode16;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3226getOverlay0nO6VwU())) {
            blendMode15 = android.graphics.BlendMode.OVERLAY;
            return blendMode15;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3212getDarken0nO6VwU())) {
            blendMode14 = android.graphics.BlendMode.DARKEN;
            return blendMode14;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3222getLighten0nO6VwU())) {
            blendMode13 = android.graphics.BlendMode.LIGHTEN;
            return blendMode13;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3211getColorDodge0nO6VwU())) {
            blendMode12 = android.graphics.BlendMode.COLOR_DODGE;
            return blendMode12;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3210getColorBurn0nO6VwU())) {
            blendMode11 = android.graphics.BlendMode.COLOR_BURN;
            return blendMode11;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3220getHardlight0nO6VwU())) {
            blendMode10 = android.graphics.BlendMode.HARD_LIGHT;
            return blendMode10;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3230getSoftlight0nO6VwU())) {
            blendMode9 = android.graphics.BlendMode.SOFT_LIGHT;
            return blendMode9;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3213getDifference0nO6VwU())) {
            blendMode8 = android.graphics.BlendMode.DIFFERENCE;
            return blendMode8;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3219getExclusion0nO6VwU())) {
            blendMode7 = android.graphics.BlendMode.EXCLUSION;
            return blendMode7;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3225getMultiply0nO6VwU())) {
            blendMode6 = android.graphics.BlendMode.MULTIPLY;
            return blendMode6;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3221getHue0nO6VwU())) {
            blendMode5 = android.graphics.BlendMode.HUE;
            return blendMode5;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3228getSaturation0nO6VwU())) {
            blendMode4 = android.graphics.BlendMode.SATURATION;
            return blendMode4;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3209getColor0nO6VwU())) {
            blendMode3 = android.graphics.BlendMode.COLOR;
            return blendMode3;
        } else if (BlendMode.m3204equalsimpl0(i, BlendMode.Companion.m3223getLuminosity0nO6VwU())) {
            blendMode2 = android.graphics.BlendMode.LUMINOSITY;
            return blendMode2;
        } else {
            blendMode = android.graphics.BlendMode.SRC_OVER;
            return blendMode;
        }
    }
}
