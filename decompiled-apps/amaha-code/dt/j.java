package dt;

import com.appsflyer.R;
import dt.a;
import dt.n;
import gt.a0;
import gt.d0;
import gt.e0;
import gt.k0;
import gt.t;
import gt.u;
import ht.h;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jt.a;
import jt.c;
import kt.g0;
import kt.m0;
import vu.c;
import wu.b0;
import wu.c0;
import wu.f1;
import wu.i0;
import wu.k1;
import wu.m1;
import wu.n1;
import wu.x0;
/* compiled from: KotlinBuiltIns.java */
/* loaded from: classes2.dex */
public abstract class j {

    /* renamed from: e */
    public static final fu.e f13360e = fu.e.l("<built-ins module>");

    /* renamed from: a */
    public g0 f13361a;

    /* renamed from: b */
    public final vu.i<a> f13362b;

    /* renamed from: c */
    public final vu.g<fu.e, gt.e> f13363c;

    /* renamed from: d */
    public final vu.l f13364d;

    /* compiled from: KotlinBuiltIns.java */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public final Map<k, i0> f13365a;

        /* renamed from: b */
        public final Map<b0, i0> f13366b;

        /* renamed from: c */
        public final Map<i0, i0> f13367c;

        public a() {
            throw null;
        }

        public a(EnumMap enumMap, HashMap hashMap, HashMap hashMap2) {
            this.f13365a = enumMap;
            this.f13366b = hashMap;
            this.f13367c = hashMap2;
        }
    }

    public j(vu.c cVar) {
        this.f13364d = cVar;
        cVar.e(new f(this));
        this.f13362b = cVar.e(new g(this));
        this.f13363c = cVar.h(new h(this));
    }

    public static boolean A(gt.j jVar) {
        if (jVar != null) {
            if (iu.g.i(jVar, b.class, false) == null) {
                return false;
            }
            return true;
        }
        a(9);
        throw null;
    }

    public static boolean B(b0 b0Var, fu.d dVar) {
        if (b0Var != null) {
            if (dVar != null) {
                return K(b0Var.O0(), dVar);
            }
            a(98);
            throw null;
        }
        a(97);
        throw null;
    }

    public static boolean C(b0 b0Var, fu.d dVar) {
        if (dVar != null) {
            if (B(b0Var, dVar) && !b0Var.P0()) {
                return true;
            }
            return false;
        }
        a(135);
        throw null;
    }

    public static boolean D(u uVar) {
        if (uVar.b().getAnnotations().H(n.a.f13408m)) {
            return true;
        }
        if (!(uVar instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) uVar;
        boolean i02 = k0Var.i0();
        m0 n10 = k0Var.n();
        gt.m0 h10 = k0Var.h();
        if (n10 != null && D(n10)) {
            if (!i02) {
                return true;
            }
            if (h10 != null && D(h10)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(b0 b0Var, fu.d dVar) {
        if (dVar != null) {
            if (!b0Var.P0() && B(b0Var, dVar)) {
                return true;
            }
            return false;
        }
        a(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader);
        throw null;
    }

    public static boolean F(b0 b0Var) {
        if (b0Var != null) {
            if (b0Var != null) {
                if (B(b0Var, n.a.f13397b) && !k1.g(b0Var)) {
                    return true;
                }
                return false;
            }
            a(138);
            throw null;
        }
        a(136);
        throw null;
    }

    public static boolean G(b0 b0Var) {
        gt.g a10 = b0Var.O0().a();
        if (a10 != null && s(a10) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean H(b0 b0Var) {
        boolean z10;
        boolean z11;
        if (b0Var != null) {
            if (b0Var.P0()) {
                return false;
            }
            gt.g a10 = b0Var.O0().a();
            if (a10 instanceof gt.e) {
                gt.e eVar = (gt.e) a10;
                if (eVar != null) {
                    if (u(eVar) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z10 = true;
                        if (z10) {
                            return false;
                        }
                        return true;
                    }
                } else {
                    a(96);
                    throw null;
                }
            }
            z10 = false;
            if (z10) {
            }
        } else {
            a(94);
            throw null;
        }
    }

    public static boolean I(gt.e eVar) {
        if (eVar != null) {
            if (!c(eVar, n.a.f13395a) && !c(eVar, n.a.f13397b)) {
                return false;
            }
            return true;
        }
        a(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle);
        throw null;
    }

    public static boolean J(b0 b0Var) {
        if (E(b0Var, n.a.f)) {
            return true;
        }
        return false;
    }

    public static boolean K(x0 x0Var, fu.d dVar) {
        if (x0Var != null) {
            if (dVar != null) {
                gt.g a10 = x0Var.a();
                if ((a10 instanceof gt.e) && c(a10, dVar)) {
                    return true;
                }
                return false;
            }
            a(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
            throw null;
        }
        a(R.styleable.AppCompatTheme_switchStyle);
        throw null;
    }

    public static boolean L(gt.j jVar) {
        if (jVar != null) {
            while (jVar != null) {
                if (jVar instanceof d0) {
                    return ((d0) jVar).e().h(n.f13389i);
                }
                jVar = jVar.c();
            }
            return false;
        }
        a(10);
        throw null;
    }

    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        switch (i6) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case 32:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case 36:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
            case 86:
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case 32:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case 36:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
            case 86:
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                i10 = 2;
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case 32:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case 36:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
            case 86:
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
            case 160:
                objArr[0] = "descriptor";
                break;
            case 12:
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
            case 100:
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
            case 90:
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
            case 99:
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
            case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 162:
                objArr[0] = "type";
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                objArr[0] = "classSimpleName";
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                objArr[0] = "arrayType";
                break;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                objArr[0] = "notNullArrayType";
                break;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                objArr[0] = "primitiveType";
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                objArr[0] = "kotlinType";
                break;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                objArr[0] = "projectionType";
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                objArr[0] = "argument";
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                objArr[0] = "annotations";
                break;
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                objArr[0] = "typeConstructor";
                break;
            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                objArr[0] = "classDescriptor";
                break;
            case 161:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i6) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                objArr[1] = "getIterator";
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                objArr[1] = "getMutableIterator";
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                objArr[1] = "getCollection";
                break;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                objArr[1] = "getMutableList";
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                objArr[1] = "getSet";
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                objArr[1] = "getMutableSet";
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                objArr[1] = "getMap";
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                objArr[1] = "getMutableMap";
                break;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                objArr[1] = "getMapEntry";
                break;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                objArr[1] = "getMutableMapEntry";
                break;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                objArr[1] = "getListIterator";
                break;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                objArr[1] = "getMutableListIterator";
                break;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                objArr[1] = "getNothingType";
                break;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                objArr[1] = "getNullableAnyType";
                break;
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                objArr[1] = "getDefaultBound";
                break;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                objArr[1] = "getNumberType";
                break;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                objArr[1] = "getByteType";
                break;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                objArr[1] = "getShortType";
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                objArr[1] = "getIntType";
                break;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                objArr[1] = "getLongType";
                break;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                objArr[1] = "getFloatType";
                break;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                objArr[1] = "getDoubleType";
                break;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                objArr[1] = "getCharType";
                break;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                objArr[1] = "getBooleanType";
                break;
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                objArr[1] = "getUnitType";
                break;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                objArr[1] = "getStringType";
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                objArr[1] = "getIterableType";
                break;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                objArr[1] = "getArrayElementType";
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                objArr[1] = "getAnnotationType";
                break;
        }
        switch (i6) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case 32:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case 36:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
            case 86:
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                objArr[2] = "getArrayElementType";
                break;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                objArr[2] = "getPrimitiveType";
                break;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                objArr[2] = "getArrayType";
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                objArr[2] = "getEnumType";
                break;
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                objArr[2] = "isArray";
                break;
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                objArr[2] = "isPrimitiveArray";
                break;
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                objArr[2] = "isPrimitiveType";
                break;
            case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                objArr[2] = "isPrimitiveClass";
                break;
            case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
            case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case R.styleable.AppCompatTheme_switchStyle /* 101 */:
            case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
            case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                objArr[2] = "classFqNameEquals";
                break;
            case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
            case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
            case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                objArr[2] = "isAny";
                break;
            case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
            case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                objArr[2] = "isBoolean";
                break;
            case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                objArr[2] = "isNumber";
                break;
            case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                objArr[2] = "isChar";
                break;
            case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                objArr[2] = "isCharOrNullableChar";
                break;
            case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                objArr[2] = "isInt";
                break;
            case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                objArr[2] = "isByte";
                break;
            case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                objArr[2] = "isLong";
                break;
            case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                objArr[2] = "isLongOrNullableLong";
                break;
            case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                objArr[2] = "isShort";
                break;
            case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                objArr[2] = "isFloat";
                break;
            case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                objArr[2] = "isDouble";
                break;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                objArr[2] = "isUByte";
                break;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                objArr[2] = "isUShort";
                break;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isCloneable";
                break;
            case 161:
                objArr[2] = "isDeprecated";
                break;
            case 162:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i6) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case 32:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case 36:
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
            case 86:
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                throw new IllegalStateException(format);
            case 9:
            case 10:
            case 12:
            case 14:
            case 16:
            case 17:
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static i0 b(j jVar, String str) {
        if (str != null) {
            i0 r = jVar.k(str).r();
            if (r != null) {
                return r;
            }
            a(47);
            throw null;
        }
        jVar.getClass();
        a(46);
        throw null;
    }

    public static boolean c(gt.g gVar, fu.d dVar) {
        if (gVar != null) {
            if (dVar != null) {
                if (gVar.getName().equals(dVar.g()) && dVar.equals(iu.g.g(gVar))) {
                    return true;
                }
                return false;
            }
            a(R.styleable.AppCompatTheme_textAppearanceListItemSecondary);
            throw null;
        }
        a(R.styleable.AppCompatTheme_textAppearanceListItem);
        throw null;
    }

    public static k s(gt.g gVar) {
        if (gVar != null) {
            if (!n.a.f13396a0.contains(gVar.getName())) {
                return null;
            }
            return (k) n.a.c0.get(iu.g.g(gVar));
        }
        a(77);
        throw null;
    }

    public static k u(gt.j jVar) {
        if (jVar != null) {
            if (!n.a.Z.contains(jVar.getName())) {
                return null;
            }
            return (k) n.a.f13398b0.get(iu.g.g(jVar));
        }
        a(76);
        throw null;
    }

    public static boolean y(b0 b0Var) {
        if (b0Var != null) {
            return B(b0Var, n.a.f13395a);
        }
        a(139);
        throw null;
    }

    public static boolean z(b0 b0Var) {
        if (b0Var != null) {
            return B(b0Var, n.a.f13402g);
        }
        a(88);
        throw null;
    }

    public final void d(boolean z10) {
        fu.e moduleName = f13360e;
        kotlin.jvm.internal.i.g(moduleName, "moduleName");
        vu.l storageManager = this.f13364d;
        kotlin.jvm.internal.i.g(storageManager, "storageManager");
        g0 g0Var = new g0(moduleName, storageManager, this, 48);
        this.f13361a = g0Var;
        dt.a.f13350a.getClass();
        e0 providerForModuleContent = a.C0196a.f13352b.getValue().a(this.f13364d, this.f13361a, m(), q(), e(), z10);
        kotlin.jvm.internal.i.g(providerForModuleContent, "providerForModuleContent");
        g0Var.B = providerForModuleContent;
        g0 g0Var2 = this.f13361a;
        g0Var2.getClass();
        g0Var2.A = new kt.d0(is.k.i2(new g0[]{g0Var2}));
    }

    public jt.a e() {
        return a.C0345a.f22623a;
    }

    public final i0 f() {
        i0 r = k("Any").r();
        if (r != null) {
            return r;
        }
        a(50);
        throw null;
    }

    public final b0 g(b0 b0Var) {
        a0 e10;
        fu.b f;
        fu.b bVar;
        gt.e a10;
        i0 i0Var = null;
        if (b0Var != null) {
            if (z(b0Var)) {
                if (b0Var.M0().size() == 1) {
                    b0 a11 = b0Var.M0().get(0).a();
                    if (a11 != null) {
                        return a11;
                    }
                    a(68);
                    throw null;
                }
                throw new IllegalStateException();
            }
            m1 i6 = k1.i(b0Var);
            i0 i0Var2 = this.f13362b.invoke().f13367c.get(i6);
            if (i0Var2 != null) {
                return i0Var2;
            }
            int i10 = iu.g.f20688a;
            gt.g a12 = i6.O0().a();
            if (a12 == null) {
                e10 = null;
            } else {
                e10 = iu.g.e(a12);
            }
            if (e10 != null) {
                gt.g a13 = i6.O0().a();
                if (a13 != null) {
                    Set<fu.e> set = r.f13432a;
                    fu.e name = a13.getName();
                    kotlin.jvm.internal.i.g(name, "name");
                    if (r.f13435d.contains(name) && (f = mu.a.f(a13)) != null && (bVar = r.f13433b.get(f)) != null && (a10 = t.a(e10, bVar)) != null) {
                        i0Var = a10.r();
                    }
                }
                if (i0Var != null) {
                    return i0Var;
                }
            }
            throw new IllegalStateException("not array: " + b0Var);
        }
        a(67);
        throw null;
    }

    public final i0 h(m1 m1Var) {
        n1 n1Var = n1.INVARIANT;
        if (m1Var != null) {
            return i(n1Var, m1Var, h.a.f19495a);
        }
        a(83);
        throw null;
    }

    public final i0 i(n1 n1Var, b0 b0Var, ht.h hVar) {
        if (b0Var != null) {
            return c0.e(ca.a.v1(hVar), k("Array"), Collections.singletonList(new f1(b0Var, n1Var)));
        }
        a(79);
        throw null;
    }

    public final gt.e j(fu.c cVar) {
        if (cVar != null) {
            gt.e i12 = ca.a.i1(l(), cVar);
            if (i12 != null) {
                return i12;
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public final gt.e k(String str) {
        if (str != null) {
            gt.e eVar = (gt.e) ((c.k) this.f13363c).invoke(fu.e.j(str));
            if (eVar != null) {
                return eVar;
            }
            a(15);
            throw null;
        }
        a(14);
        throw null;
    }

    public final g0 l() {
        g0 g0Var = this.f13361a;
        g0Var.getClass();
        if (g0Var != null) {
            return g0Var;
        }
        a(7);
        throw null;
    }

    public Iterable<jt.b> m() {
        List singletonList = Collections.singletonList(new et.a(this.f13364d, l()));
        if (singletonList != null) {
            return singletonList;
        }
        a(5);
        throw null;
    }

    public final i0 n() {
        i0 p10 = p();
        if (p10 != null) {
            return p10;
        }
        a(52);
        throw null;
    }

    public final i0 o() {
        i0 r = k("Nothing").r();
        if (r != null) {
            return r;
        }
        a(48);
        throw null;
    }

    public final i0 p() {
        i0 S0 = f().S0(true);
        if (S0 != null) {
            return S0;
        }
        a(51);
        throw null;
    }

    public jt.c q() {
        return c.b.f22625a;
    }

    public final i0 r(k kVar) {
        if (kVar != null) {
            i0 i0Var = this.f13362b.invoke().f13365a.get(kVar);
            if (i0Var != null) {
                return i0Var;
            }
            a(74);
            throw null;
        }
        a(73);
        throw null;
    }

    public final i0 t(k kVar) {
        if (kVar != null) {
            if (kVar != null) {
                i0 r = k(kVar.f13370u.f()).r();
                if (r != null) {
                    return r;
                }
                a(54);
                throw null;
            }
            a(16);
            throw null;
        }
        a(53);
        throw null;
    }

    public final i0 v() {
        i0 r = k("String").r();
        if (r != null) {
            return r;
        }
        a(65);
        throw null;
    }

    public final gt.e w(int i6) {
        fu.c cVar = n.f13385d;
        gt.e j10 = j(cVar.c(fu.e.j(et.c.f14550y.f14553v + i6)));
        if (j10 != null) {
            return j10;
        }
        a(18);
        throw null;
    }

    public final i0 x() {
        i0 r = k("Unit").r();
        if (r != null) {
            return r;
        }
        a(64);
        throw null;
    }
}
