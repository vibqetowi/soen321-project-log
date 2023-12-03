package iu;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import gt.b;
import gt.j0;
import gt.k0;
import gt.m0;
import gt.n0;
import gt.v0;
import gt.z;
import gt.z0;
import iu.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import kt.l0;
import kt.x;
import ta.v;
import wu.b0;
import wu.m1;
import wu.w0;
import wu.x0;
import xu.c;
import xu.d;
import xu.e;
/* compiled from: OverridingUtil.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: e  reason: collision with root package name */
    public static final List<h> f20698e = is.u.I2(ServiceLoader.load(h.class, h.class.getClassLoader()));
    public static final l f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f20699g;

    /* renamed from: a  reason: collision with root package name */
    public final xu.e f20700a;

    /* renamed from: b  reason: collision with root package name */
    public final xu.d f20701b;

    /* renamed from: c  reason: collision with root package name */
    public final c.a f20702c;

    /* renamed from: d  reason: collision with root package name */
    public final ss.p<b0, b0, Boolean> f20703d;

    /* compiled from: OverridingUtil.java */
    /* loaded from: classes2.dex */
    public static class a implements c.a {
        public static /* synthetic */ void b(int i6) {
            Object[] objArr = new Object[3];
            if (i6 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = Constants.ONBOARDING_VARIANT;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // xu.c.a
        public final boolean a(x0 x0Var, x0 x0Var2) {
            if (x0Var != null) {
                if (x0Var2 != null) {
                    return x0Var.equals(x0Var2);
                }
                b(1);
                throw null;
            }
            b(0);
            throw null;
        }
    }

    /* compiled from: OverridingUtil.java */
    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f20704b = new b(1, "SUCCESS");

        /* renamed from: a  reason: collision with root package name */
        public final int f20705a;

        public b(int i6, String str) {
            if (i6 != 0) {
                this.f20705a = i6;
            } else {
                a(3);
                throw null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void a(int i6) {
            String str;
            int i10;
            String format;
            if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4) {
                str = "@NotNull method %s.%s must not return null";
            } else {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            }
            if (i6 != 1 && i6 != 2 && i6 != 3 && i6 != 4) {
                i10 = 2;
            } else {
                i10 = 3;
            }
            Object[] objArr = new Object[i10];
            if (i6 != 1 && i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    }
                } else {
                    objArr[0] = "success";
                }
                switch (i6) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                        break;
                    case 5:
                        objArr[1] = "getResult";
                        break;
                    case 6:
                        objArr[1] = "getDebugMessage";
                        break;
                    default:
                        objArr[1] = "success";
                        break;
                }
                if (i6 == 1) {
                    if (i6 != 2) {
                        if (i6 == 3 || i6 == 4) {
                            objArr[2] = "<init>";
                        }
                    } else {
                        objArr[2] = "conflict";
                    }
                } else {
                    objArr[2] = "incompatible";
                }
                format = String.format(str, objArr);
                if (i6 != 1 || i6 == 2 || i6 == 3 || i6 == 4) {
                    throw new IllegalArgumentException(format);
                }
                throw new IllegalStateException(format);
            }
            objArr[0] = "debugMessage";
            switch (i6) {
            }
            if (i6 == 1) {
            }
            format = String.format(str, objArr);
            if (i6 != 1) {
            }
            throw new IllegalArgumentException(format);
        }

        public static b b(String str) {
            return new b(3, str);
        }

        public static b d(String str) {
            return new b(2, str);
        }

        public final int c() {
            int i6 = this.f20705a;
            if (i6 != 0) {
                return i6;
            }
            a(5);
            throw null;
        }
    }

    static {
        a aVar = new a();
        f20699g = aVar;
        f = new l(aVar, e.a.f38097b, d.a.f38096v);
    }

    public l(c.a aVar, e.a aVar2, d.a aVar3) {
        if (aVar != null) {
            if (aVar2 != null) {
                if (aVar3 != null) {
                    this.f20702c = aVar;
                    this.f20700a = aVar2;
                    this.f20701b = aVar3;
                    this.f20703d = null;
                    return;
                }
                a(7);
                throw null;
            }
            a(6);
            throw null;
        }
        a(5);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        Object[] objArr;
        if (i6 != 11 && i6 != 12 && i6 != 16 && i6 != 21 && i6 != 95 && i6 != 98 && i6 != 103 && i6 != 44 && i6 != 45) {
            switch (i6) {
                default:
                    switch (i6) {
                        default:
                            switch (i6) {
                                default:
                                    switch (i6) {
                                        case 90:
                                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 32:
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        case 36:
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
            }
            if (i6 != 11 && i6 != 12 && i6 != 16 && i6 != 21 && i6 != 95 && i6 != 98 && i6 != 103 && i6 != 44 && i6 != 45) {
                switch (i6) {
                    default:
                        switch (i6) {
                            default:
                                switch (i6) {
                                    default:
                                        switch (i6) {
                                            case 90:
                                            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                                break;
                                            default:
                                                i10 = 3;
                                                break;
                                        }
                                    case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                        i10 = 2;
                                        break;
                                }
                            case 32:
                            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                            case 36:
                            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                break;
                        }
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        break;
                }
                objArr = new Object[i10];
                switch (i6) {
                    case 1:
                    case 7:
                        objArr[0] = "kotlinTypePreparator";
                        break;
                    case 2:
                        objArr[0] = "customSubtype";
                        break;
                    case 3:
                    case 6:
                    default:
                        objArr[0] = "kotlinTypeRefiner";
                        break;
                    case 4:
                        objArr[0] = "equalityAxioms";
                        break;
                    case 5:
                        objArr[0] = "axioms";
                        break;
                    case 8:
                    case 9:
                        objArr[0] = "candidateSet";
                        break;
                    case 10:
                        objArr[0] = "transformFirst";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 32:
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    case 36:
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                    case 90:
                    case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                    case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                    case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                    case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                    case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                        break;
                    case 13:
                        objArr[0] = "f";
                        break;
                    case 14:
                        objArr[0] = "g";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "descriptor";
                        break;
                    case 18:
                        objArr[0] = "result";
                        break;
                    case 19:
                    case 22:
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                        objArr[0] = "superDescriptor";
                        break;
                    case 20:
                    case 23:
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        objArr[0] = "subDescriptor";
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        objArr[0] = "firstParameters";
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        objArr[0] = "secondParameters";
                        break;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        objArr[0] = "typeInSuper";
                        break;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        objArr[0] = "typeInSub";
                        break;
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                        objArr[0] = "typeCheckerState";
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        objArr[0] = "superTypeParameter";
                        break;
                    case 50:
                        objArr[0] = "subTypeParameter";
                        break;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                        objArr[0] = SessionManager.KEY_NAME;
                        break;
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                        objArr[0] = "membersFromSupertypes";
                        break;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        objArr[0] = "membersFromCurrent";
                        break;
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    case 86:
                    case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                    case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                        objArr[0] = "current";
                        break;
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                    case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                    case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                        objArr[0] = "strategy";
                        break;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        objArr[0] = "overriding";
                        break;
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        objArr[0] = "fromSuper";
                        break;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        objArr[0] = "fromCurrent";
                        break;
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        objArr[0] = "descriptorsFromSuper";
                        break;
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                        objArr[0] = "notOverridden";
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                    case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                        objArr[0] = "a";
                        break;
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                    case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                        objArr[0] = Constants.ONBOARDING_VARIANT;
                        break;
                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                        objArr[0] = "candidate";
                        break;
                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                    case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                    case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                        objArr[0] = "descriptors";
                        break;
                    case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                        objArr[0] = "aReturnType";
                        break;
                    case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                        objArr[0] = "bReturnType";
                        break;
                    case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                        objArr[0] = "overridables";
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                    case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                        objArr[0] = "descriptorByHandle";
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                        objArr[0] = "classModality";
                        break;
                    case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        objArr[0] = "toFilter";
                        break;
                    case 99:
                    case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                        objArr[0] = "overrider";
                        break;
                    case 100:
                    case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                        objArr[0] = "extractFrom";
                        break;
                    case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                        objArr[0] = "onConflict";
                        break;
                    case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                    case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                        objArr[0] = "memberDescriptor";
                        break;
                }
                if (i6 == 11 && i6 != 12) {
                    if (i6 != 16) {
                        if (i6 != 21) {
                            if (i6 != 95) {
                                if (i6 != 98) {
                                    if (i6 != 103) {
                                        if (i6 != 44 && i6 != 45) {
                                            switch (i6) {
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                    break;
                                                default:
                                                    switch (i6) {
                                                        case 32:
                                                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                                        case 36:
                                                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                                            objArr[1] = "isOverridableByWithoutExternalConditions";
                                                            break;
                                                        default:
                                                            switch (i6) {
                                                                case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                                                case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                                                case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                                                case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                                                case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                                                    objArr[1] = "selectMostSpecificMember";
                                                                    break;
                                                                default:
                                                                    switch (i6) {
                                                                        case 90:
                                                                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                                                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                                                            objArr[1] = "determineModalityForFakeOverride";
                                                                            break;
                                                                        default:
                                                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                        } else {
                                            objArr[1] = "createTypeCheckerState";
                                        }
                                    } else {
                                        objArr[1] = "extractMembersOverridableInBothWays";
                                    }
                                } else {
                                    objArr[1] = "filterVisibleFakeOverrides";
                                }
                            } else {
                                objArr[1] = "getMinimalModality";
                            }
                        }
                        objArr[1] = "isOverridableBy";
                    } else {
                        objArr[1] = "getOverriddenDeclarations";
                    }
                } else {
                    objArr[1] = "filterOverrides";
                }
                switch (i6) {
                    case 1:
                    case 2:
                        objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "create";
                        break;
                    case 5:
                    case 6:
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 8:
                        objArr[2] = "filterOutOverridden";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "filterOverrides";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 32:
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    case 36:
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                    case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                    case 90:
                    case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                    case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                    case R.styleable.AppCompatTheme_searchViewStyle /* 95 */:
                    case R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                    case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                        break;
                    case 13:
                    case 14:
                        objArr[2] = "overrides";
                        break;
                    case 15:
                        objArr[2] = "getOverriddenDeclarations";
                        break;
                    case 17:
                    case 18:
                        objArr[2] = "collectOverriddenDeclarations";
                        break;
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                        objArr[2] = "isOverridableBy";
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        objArr[2] = "isOverridableByWithoutExternalConditions";
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        objArr[2] = "getBasicOverridabilityProblem";
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                        objArr[2] = "createTypeCheckerState";
                        break;
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                        objArr[2] = "areTypesEquivalent";
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    case 50:
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        objArr[2] = "areTypeParametersEquivalent";
                        break;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                        objArr[2] = "generateOverridesInFunctionGroup";
                        break;
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        objArr[2] = "isVisibleForOverride";
                        break;
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        objArr[2] = "extractAndBindOverridesForMember";
                        break;
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        objArr[2] = "allHasSameContainingDeclaration";
                        break;
                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                        objArr[2] = "createAndBindFakeOverrides";
                        break;
                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                        objArr[2] = "isMoreSpecific";
                        break;
                    case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                    case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                        objArr[2] = "isVisibilityMoreSpecific";
                        break;
                    case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                    case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                        objArr[2] = "isMoreSpecificThenAllOf";
                        break;
                    case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                    case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                    case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                    case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                    case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                        objArr[2] = "isReturnTypeMoreSpecific";
                        break;
                    case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                    case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                        objArr[2] = "selectMostSpecificMember";
                        break;
                    case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                    case 86:
                    case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
                        objArr[2] = "createAndBindFakeOverride";
                        break;
                    case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                    case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                        objArr[2] = "determineModalityForFakeOverride";
                        break;
                    case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                    case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                        objArr[2] = "getMinimalModality";
                        break;
                    case R.styleable.AppCompatTheme_seekBarStyle /* 96 */:
                    case R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        objArr[2] = "filterVisibleFakeOverrides";
                        break;
                    case 99:
                    case 100:
                    case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                    case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                    case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                    case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                    case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                        objArr[2] = "extractMembersOverridableInBothWays";
                        break;
                    case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                        objArr[2] = "resolveUnknownVisibilityForMember";
                        break;
                    case R.styleable.AppCompatTheme_textAppearanceSearchResultTitle /* 108 */:
                        objArr[2] = "computeVisibilityToInherit";
                        break;
                    case R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu /* 109 */:
                        objArr[2] = "findMaxVisibility";
                        break;
                    default:
                        objArr[2] = "createWithTypeRefiner";
                        break;
                }
                String format = String.format(str, objArr);
                if (i6 != 11 && i6 != 12 && i6 != 16 && i6 != 21 && i6 != 95 && i6 != 98 && i6 != 103 && i6 != 44 && i6 != 45) {
                    switch (i6) {
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                            break;
                        default:
                            switch (i6) {
                                case 32:
                                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                                case 36:
                                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                                    break;
                                default:
                                    switch (i6) {
                                        case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                                        case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
                                            break;
                                        default:
                                            switch (i6) {
                                                case 90:
                                                case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                                                case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format);
            }
            i10 = 2;
            objArr = new Object[i10];
            switch (i6) {
            }
            if (i6 == 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i6) {
            }
            String format2 = String.format(str, objArr);
            if (i6 != 11) {
                switch (i6) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i6 != 11) {
            switch (i6) {
            }
            objArr = new Object[i10];
            switch (i6) {
            }
            if (i6 == 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i6) {
            }
            String format22 = String.format(str, objArr);
            if (i6 != 11) {
            }
            throw new IllegalStateException(format22);
        }
        i10 = 2;
        objArr = new Object[i10];
        switch (i6) {
        }
        if (i6 == 11) {
        }
        objArr[1] = "filterOverrides";
        switch (i6) {
        }
        String format222 = String.format(str, objArr);
        if (i6 != 11) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean b(b0 b0Var, b0 b0Var2, w0 w0Var) {
        boolean z10;
        if (b0Var != null) {
            if (b0Var2 != null) {
                if (v.E(b0Var) && v.E(b0Var2)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
                return kc.f.C(w0Var, b0Var.R0(), b0Var2.R0());
            }
            a(47);
            throw null;
        }
        a(46);
        throw null;
    }

    public static void c(gt.b bVar, LinkedHashSet linkedHashSet) {
        boolean z10;
        if (bVar != null) {
            b.a m02 = bVar.m0();
            m02.getClass();
            if (m02 != b.a.FAKE_OVERRIDE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                linkedHashSet.add(bVar);
                return;
            } else if (!bVar.f().isEmpty()) {
                for (gt.b bVar2 : bVar.f()) {
                    c(bVar2, linkedHashSet);
                }
                return;
            } else {
                throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
            }
        }
        a(17);
        throw null;
    }

    public static ArrayList d(gt.a aVar) {
        n0 k02 = aVar.k0();
        ArrayList arrayList = new ArrayList();
        if (k02 != null) {
            arrayList.add(k02.a());
        }
        for (z0 z0Var : aVar.i()) {
            arrayList.add(z0Var.a());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0145, code lost:
        if (r2 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0147, code lost:
        r1 = gt.p.f16806h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014a, code lost:
        r1 = gt.p.f16805g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014c, code lost:
        r12 = ((gt.b) s(r11, new iu.m())).d0(r12, r0, r1);
        r13.r(r12, r11);
        r13.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0161, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(Collection collection, gt.e eVar, k kVar) {
        z zVar;
        z m10;
        if (collection != null) {
            if (eVar != null) {
                ArrayList d22 = is.u.d2(collection, new n(eVar));
                boolean isEmpty = d22.isEmpty();
                if (!isEmpty) {
                    collection = d22;
                }
                Iterator it = collection.iterator();
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    if (it.hasNext()) {
                        gt.b bVar = (gt.b) it.next();
                        int ordinal = bVar.m().ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal == 3) {
                                        z12 = true;
                                    }
                                } else {
                                    z11 = true;
                                }
                            } else {
                                throw new IllegalStateException("Member cannot have SEALED modality: " + bVar);
                            }
                        } else {
                            zVar = z.FINAL;
                            break;
                        }
                    } else {
                        boolean M = eVar.M();
                        z zVar2 = z.ABSTRACT;
                        if (M && eVar.m() != zVar2 && eVar.m() != z.SEALED) {
                            z10 = true;
                        }
                        if (z11 && !z12) {
                            zVar = z.OPEN;
                        } else if (!z11 && z12) {
                            if (z10) {
                                zVar2 = eVar.m();
                            }
                            if (zVar2 != null) {
                                zVar = zVar2;
                            } else {
                                a(92);
                                throw null;
                            }
                        } else {
                            HashSet<gt.b> hashSet = new HashSet();
                            for (gt.b bVar2 : collection) {
                                if (bVar2 != null) {
                                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                                    c(bVar2, linkedHashSet);
                                    hashSet.addAll(linkedHashSet);
                                } else {
                                    a(15);
                                    throw null;
                                }
                            }
                            if (!hashSet.isEmpty()) {
                                xu.n nVar = (xu.n) mu.a.j((gt.j) hashSet.iterator().next()).s0(xu.f.f38098a);
                            }
                            if (hashSet.size() > 1) {
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                Iterator it2 = hashSet.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    Iterator it3 = linkedHashSet2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            gt.a aVar = (gt.a) next;
                                            gt.a aVar2 = (gt.a) it3.next();
                                            if (q(aVar, aVar2)) {
                                                it3.remove();
                                            } else if (q(aVar2, aVar)) {
                                                break;
                                            }
                                        } else {
                                            linkedHashSet2.add(next);
                                            break;
                                        }
                                    }
                                }
                                hashSet = linkedHashSet2;
                            }
                            z m11 = eVar.m();
                            if (m11 != null) {
                                z zVar3 = zVar2;
                                for (gt.b bVar3 : hashSet) {
                                    if (z10 && bVar3.m() == zVar2) {
                                        m10 = m11;
                                    } else {
                                        m10 = bVar3.m();
                                    }
                                    if (m10.compareTo(zVar3) < 0) {
                                        zVar3 = m10;
                                    }
                                }
                                if (zVar3 != null) {
                                    zVar = zVar3;
                                } else {
                                    a(95);
                                    throw null;
                                }
                            } else {
                                a(94);
                                throw null;
                            }
                        }
                    }
                }
            } else {
                a(86);
                throw null;
            }
        } else {
            a(85);
            throw null;
        }
    }

    public static ArrayList g(Object obj, LinkedList linkedList, ss.l lVar, ss.l lVar2) {
        if (obj != null) {
            if (lVar != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(obj);
                gt.a aVar = (gt.a) lVar.invoke(obj);
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    gt.a aVar2 = (gt.a) lVar.invoke(next);
                    if (obj == next) {
                        it.remove();
                    } else {
                        int j10 = j(aVar, aVar2);
                        if (j10 == 1) {
                            arrayList.add(next);
                            it.remove();
                        } else if (j10 == 3) {
                            lVar2.invoke(next);
                            it.remove();
                        }
                    }
                }
                return arrayList;
            }
            a(R.styleable.AppCompatTheme_switchStyle);
            throw null;
        }
        a(99);
        throw null;
    }

    public static b i(gt.a aVar, gt.a aVar2) {
        boolean z10;
        boolean z11;
        b bVar;
        if (aVar != null) {
            if (aVar2 != null) {
                boolean z12 = aVar instanceof gt.u;
                if ((z12 && !(aVar2 instanceof gt.u)) || (((z10 = aVar instanceof k0)) && !(aVar2 instanceof k0))) {
                    return b.d("Member kind mismatch");
                }
                if (!z12 && !z10) {
                    throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
                } else if (!aVar.getName().equals(aVar2.getName())) {
                    return b.d("Name mismatch");
                } else {
                    boolean z13 = false;
                    if (aVar.k0() == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (aVar2.k0() == null) {
                        z13 = true;
                    }
                    if (z11 != z13) {
                        bVar = b.d("Receiver presence mismatch");
                    } else if (aVar.i().size() != aVar2.i().size()) {
                        bVar = b.d("Value parameter number mismatch");
                    } else {
                        bVar = null;
                    }
                    if (bVar == null) {
                        return null;
                    }
                    return bVar;
                }
            }
            a(41);
            throw null;
        }
        a(40);
        throw null;
    }

    public static int j(gt.a aVar, gt.a aVar2) {
        l lVar = f;
        int c10 = lVar.l(aVar2, aVar, null).c();
        int c11 = lVar.l(aVar, aVar2, null).c();
        if (c10 == 1 && c11 == 1) {
            return 1;
        }
        if (c10 == 3 || c11 == 3) {
            return 3;
        }
        return 2;
    }

    public static boolean k(gt.a aVar, gt.a aVar2) {
        boolean z10;
        if (aVar != null) {
            if (aVar2 != null) {
                b0 returnType = aVar.getReturnType();
                b0 returnType2 = aVar2.getReturnType();
                if (!p(aVar, aVar2)) {
                    return false;
                }
                w0 f2 = f.f(aVar.getTypeParameters(), aVar2.getTypeParameters());
                if (aVar instanceof gt.u) {
                    return o(aVar, returnType, aVar2, returnType2, f2);
                }
                if (aVar instanceof k0) {
                    k0 k0Var = (k0) aVar;
                    k0 k0Var2 = (k0) aVar2;
                    m0 h10 = k0Var.h();
                    m0 h11 = k0Var2.h();
                    if (h10 != null && h11 != null) {
                        z10 = p(h10, h11);
                    } else {
                        z10 = true;
                    }
                    if (!z10) {
                        return false;
                    }
                    if (k0Var.i0() && k0Var2.i0()) {
                        return kc.f.C(f2, returnType.R0(), returnType2.R0());
                    }
                    if ((!k0Var.i0() && k0Var2.i0()) || !o(aVar, returnType, aVar2, returnType2, f2)) {
                        return false;
                    }
                    return true;
                }
                throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
            }
            a(68);
            throw null;
        }
        a(67);
        throw null;
    }

    public static boolean o(gt.a aVar, b0 b0Var, gt.a aVar2, b0 b0Var2, w0 w0Var) {
        if (aVar != null) {
            if (b0Var != null) {
                if (aVar2 != null) {
                    if (b0Var2 != null) {
                        kc.f fVar = kc.f.f23229s0;
                        m1 subType = b0Var.R0();
                        m1 superType = b0Var2.R0();
                        kotlin.jvm.internal.i.g(subType, "subType");
                        kotlin.jvm.internal.i.g(superType, "superType");
                        return kc.f.M(fVar, w0Var, subType, superType);
                    }
                    a(76);
                    throw null;
                }
                a(75);
                throw null;
            }
            a(74);
            throw null;
        }
        a(73);
        throw null;
    }

    public static boolean p(gt.n nVar, gt.n nVar2) {
        if (nVar != null) {
            if (nVar2 != null) {
                Integer b10 = gt.p.b(nVar.getVisibility(), nVar2.getVisibility());
                if (b10 != null && b10.intValue() < 0) {
                    return false;
                }
                return true;
            }
            a(70);
            throw null;
        }
        a(69);
        throw null;
    }

    public static boolean q(gt.a aVar, gt.a aVar2) {
        if (aVar != null) {
            if (aVar2 != null) {
                boolean equals = aVar.equals(aVar2);
                kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.b0.J;
                if (!equals && b0Var.f(aVar.b(), aVar2.b(), false, true)) {
                    return true;
                }
                gt.a b10 = aVar2.b();
                int i6 = g.f20688a;
                LinkedHashSet<gt.a> linkedHashSet = new LinkedHashSet();
                g.b(aVar.b(), linkedHashSet);
                for (gt.a aVar3 : linkedHashSet) {
                    if (b0Var.f(b10, aVar3, false, true)) {
                        return true;
                    }
                }
                return false;
            }
            a(14);
            throw null;
        }
        a(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void r(gt.b bVar, ss.l<gt.b, hs.k> lVar) {
        gt.q qVar;
        gt.q qVar2;
        gt.q qVar3;
        ss.l<gt.b, hs.k> lVar2;
        if (bVar != null) {
            for (gt.b bVar2 : bVar.f()) {
                if (bVar2.getVisibility() == gt.p.f16805g) {
                    r(bVar2, lVar);
                }
            }
            if (bVar.getVisibility() != gt.p.f16805g) {
                return;
            }
            Collection<? extends gt.b> f2 = bVar.f();
            if (f2 != null) {
                if (f2.isEmpty()) {
                    qVar2 = gt.p.f16809k;
                } else {
                    loop3: while (true) {
                        qVar = null;
                        for (gt.b bVar3 : f2) {
                            gt.q visibility = bVar3.getVisibility();
                            if (qVar != null) {
                                Integer b10 = gt.p.b(visibility, qVar);
                                if (b10 == null) {
                                    break;
                                } else if (b10.intValue() > 0) {
                                }
                            }
                            qVar = visibility;
                        }
                    }
                    if (qVar != null) {
                        for (gt.b bVar4 : f2) {
                            Integer b11 = gt.p.b(qVar, bVar4.getVisibility());
                            if (b11 != null) {
                                if (b11.intValue() < 0) {
                                }
                            }
                        }
                        qVar2 = qVar;
                    }
                    qVar2 = null;
                    break;
                }
                if (qVar2 != null) {
                    if (bVar.m0() == b.a.FAKE_OVERRIDE) {
                        for (gt.b bVar5 : f2) {
                            if (bVar5.m() == z.ABSTRACT || bVar5.getVisibility().equals(qVar2)) {
                            }
                        }
                    } else {
                        qVar2 = qVar2.d();
                    }
                    if (qVar2 != null) {
                        if (lVar != null) {
                            lVar.invoke(bVar);
                        }
                        qVar3 = gt.p.f16804e;
                    } else {
                        qVar3 = qVar2;
                    }
                    if (!(bVar instanceof l0)) {
                        l0 l0Var = (l0) bVar;
                        if (qVar3 != null) {
                            l0Var.D = qVar3;
                            for (j0 j0Var : ((k0) bVar).u()) {
                                if (qVar2 == null) {
                                    lVar2 = null;
                                } else {
                                    lVar2 = lVar;
                                }
                                r(j0Var, lVar2);
                            }
                            return;
                        }
                        l0.I(20);
                        throw null;
                    } else if (bVar instanceof x) {
                        x xVar = (x) bVar;
                        if (qVar3 != null) {
                            xVar.F = qVar3;
                            return;
                        } else {
                            x.I(10);
                            throw null;
                        }
                    } else {
                        kt.k0 k0Var = (kt.k0) bVar;
                        k0Var.E = qVar3;
                        if (qVar3 != k0Var.E0().getVisibility()) {
                            k0Var.f23860y = false;
                            return;
                        }
                        return;
                    }
                }
                qVar2 = null;
                if (qVar2 != null) {
                }
                if (!(bVar instanceof l0)) {
                }
            } else {
                a(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
                throw null;
            }
        } else {
            a(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <H> H s(Collection<H> collection, ss.l<H, gt.a> lVar) {
        H h10;
        boolean z10;
        if (lVar != 0) {
            if (collection.size() == 1) {
                H h11 = (H) is.u.f2(collection);
                if (h11 != null) {
                    return h11;
                }
                a(80);
                throw null;
            }
            ArrayList arrayList = new ArrayList(2);
            ArrayList arrayList2 = new ArrayList(is.i.H1(collection, 10));
            for (H h12 : collection) {
                arrayList2.add(lVar.invoke(h12));
            }
            H h13 = (H) is.u.f2(collection);
            gt.a aVar = (gt.a) lVar.invoke(h13);
            for (H h14 : collection) {
                gt.a aVar2 = (gt.a) lVar.invoke(h14);
                if (aVar2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!k(aVar2, (gt.a) it.next())) {
                                z10 = false;
                                break;
                            }
                        } else {
                            z10 = true;
                            break;
                        }
                    }
                    if (z10) {
                        arrayList.add(h14);
                    }
                    if (k(aVar2, aVar) && !k(aVar, aVar2)) {
                        h13 = h14;
                    }
                } else {
                    a(71);
                    throw null;
                }
            }
            if (arrayList.isEmpty()) {
                if (h13 != null) {
                    return h13;
                }
                a(81);
                throw null;
            } else if (arrayList.size() == 1) {
                H h15 = (H) is.u.f2(arrayList);
                if (h15 != null) {
                    return h15;
                }
                a(82);
                throw null;
            } else {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        h10 = (H) it2.next();
                        if (!ca.a.J0(((gt.a) lVar.invoke(h10)).getReturnType())) {
                            break;
                        }
                    } else {
                        h10 = null;
                        break;
                    }
                }
                if (h10 != null) {
                    return h10;
                }
                H h16 = (H) is.u.f2(arrayList);
                if (h16 != null) {
                    return h16;
                }
                a(84);
                throw null;
            }
        }
        a(79);
        throw null;
    }

    public final w0 f(List<v0> list, List<v0> list2) {
        if (list != null) {
            if (list2 != null) {
                if (list.isEmpty()) {
                    r rVar = new r(null, this.f20702c, this.f20700a, this.f20701b, this.f20703d);
                    ss.p<b0, b0, Boolean> pVar = rVar.f20714y;
                    xu.e kotlinTypeRefiner = rVar.f20712w;
                    xu.d kotlinTypePreparator = rVar.f20713x;
                    if (pVar == null) {
                        kotlin.jvm.internal.i.g(kotlinTypePreparator, "kotlinTypePreparator");
                        kotlin.jvm.internal.i.g(kotlinTypeRefiner, "kotlinTypeRefiner");
                        return new w0(true, true, rVar, kotlinTypePreparator, kotlinTypeRefiner);
                    }
                    return new q(rVar, kotlinTypePreparator, kotlinTypeRefiner);
                }
                HashMap hashMap = new HashMap();
                for (int i6 = 0; i6 < list.size(); i6++) {
                    hashMap.put(list.get(i6).l(), list2.get(i6).l());
                }
                r rVar2 = new r(hashMap, this.f20702c, this.f20700a, this.f20701b, this.f20703d);
                ss.p<b0, b0, Boolean> pVar2 = rVar2.f20714y;
                xu.e kotlinTypeRefiner2 = rVar2.f20712w;
                xu.d kotlinTypePreparator2 = rVar2.f20713x;
                if (pVar2 == null) {
                    kotlin.jvm.internal.i.g(kotlinTypePreparator2, "kotlinTypePreparator");
                    kotlin.jvm.internal.i.g(kotlinTypeRefiner2, "kotlinTypeRefiner");
                    return new w0(true, true, rVar2, kotlinTypePreparator2, kotlinTypeRefiner2);
                }
                return new q(rVar2, kotlinTypePreparator2, kotlinTypeRefiner2);
            }
            a(43);
            throw null;
        }
        a(42);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(fu.e eVar, Collection collection, Collection collection2, gt.e eVar2, k kVar) {
        boolean z10;
        Integer b10;
        boolean z11;
        boolean z12;
        int d10;
        boolean z13;
        if (eVar != null) {
            if (collection != null) {
                if (collection2 != null) {
                    if (eVar2 != null) {
                        LinkedHashSet<gt.b> linkedHashSet = new LinkedHashSet(collection);
                        Iterator it = collection2.iterator();
                        while (it.hasNext()) {
                            gt.b bVar = (gt.b) it.next();
                            if (bVar != null) {
                                ArrayList arrayList = new ArrayList(collection.size());
                                dv.e eVar3 = new dv.e();
                                Iterator it2 = collection.iterator();
                                while (it2.hasNext()) {
                                    gt.b bVar2 = (gt.b) it2.next();
                                    int c10 = l(bVar2, bVar, eVar2).c();
                                    if (!gt.p.e(bVar2.getVisibility())) {
                                        if (gt.p.c(gt.p.f16811m, bVar2, bVar) == null) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (z13) {
                                            z12 = true;
                                            d10 = v.h.d(c10);
                                            if (d10 == 0) {
                                                if (d10 == 2) {
                                                    if (z12) {
                                                        kVar.J(bVar2, bVar);
                                                    }
                                                    arrayList.add(bVar2);
                                                }
                                            } else {
                                                if (z12) {
                                                    eVar3.add(bVar2);
                                                }
                                                arrayList.add(bVar2);
                                            }
                                        }
                                    }
                                    z12 = false;
                                    d10 = v.h.d(c10);
                                    if (d10 == 0) {
                                    }
                                }
                                kVar.r(bVar, eVar3);
                                linkedHashSet.removeAll(arrayList);
                            } else {
                                a(59);
                                throw null;
                            }
                        }
                        if (linkedHashSet.size() >= 2) {
                            gt.j c11 = ((gt.b) linkedHashSet.iterator().next()).c();
                            if (!linkedHashSet.isEmpty()) {
                                for (gt.b bVar3 : linkedHashSet) {
                                    if (bVar3.c() == c11) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (!Boolean.valueOf(z11).booleanValue()) {
                                        z10 = false;
                                        break;
                                    }
                                }
                            }
                        }
                        z10 = true;
                        if (z10) {
                            for (gt.b bVar4 : linkedHashSet) {
                                e(Collections.singleton(bVar4), eVar2, kVar);
                            }
                            return;
                        }
                        LinkedList<gt.b> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            gt.b bVar5 = null;
                            for (gt.b bVar6 : linkedList) {
                                if (bVar5 == null || ((b10 = gt.p.b(bVar5.getVisibility(), bVar6.getVisibility())) != null && b10.intValue() < 0)) {
                                    bVar5 = bVar6;
                                }
                            }
                            kotlin.jvm.internal.i.d(bVar5);
                            e(g(bVar5, linkedList, new o(), new p(kVar, bVar5)), eVar2, kVar);
                        }
                        return;
                    }
                    a(55);
                    throw null;
                }
                a(54);
                throw null;
            }
            a(53);
            throw null;
        }
        a(52);
        throw null;
    }

    public final b l(gt.a aVar, gt.a aVar2, gt.e eVar) {
        if (aVar != null) {
            if (aVar2 != null) {
                b m10 = m(aVar, aVar2, eVar, false);
                if (m10 != null) {
                    return m10;
                }
                a(21);
                throw null;
            }
            a(20);
            throw null;
        }
        a(19);
        throw null;
    }

    public final b m(gt.a aVar, gt.a aVar2, gt.e eVar, boolean z10) {
        boolean z11;
        if (aVar != null) {
            if (aVar2 != null) {
                b n10 = n(aVar, aVar2, z10);
                if (n10.c() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                List<h> list = f20698e;
                Iterator<h> it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    h.a aVar3 = h.a.CONFLICTS_ONLY;
                    if (hasNext) {
                        h next = it.next();
                        if (next.b() != aVar3 && (!z11 || next.b() != h.a.SUCCESS_ONLY)) {
                            int ordinal = next.a(aVar, aVar2, eVar).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        return b.d("External condition");
                                    }
                                } else {
                                    return b.b("External condition failed");
                                }
                            } else {
                                z11 = true;
                            }
                        }
                    } else if (!z11) {
                        return n10;
                    } else {
                        for (h hVar : list) {
                            if (hVar.b() == aVar3) {
                                int ordinal2 = hVar.a(aVar, aVar2, eVar).ordinal();
                                if (ordinal2 != 0) {
                                    if (ordinal2 != 1) {
                                        if (ordinal2 == 2) {
                                            return b.d("External condition");
                                        }
                                    } else {
                                        return b.b("External condition failed");
                                    }
                                } else {
                                    throw new IllegalStateException("Contract violation in " + hVar.getClass().getName() + " condition. It's not supposed to end with success");
                                }
                            }
                        }
                        b bVar = b.f20704b;
                        if (bVar != null) {
                            return bVar;
                        }
                        b.a(0);
                        throw null;
                    }
                }
            } else {
                a(23);
                throw null;
            }
        } else {
            a(22);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
        r15.remove();
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[LOOP:1: B:20:0x005b->B:42:0x00c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b n(gt.a aVar, gt.a aVar2, boolean z10) {
        boolean z11;
        boolean z12;
        if (aVar != null) {
            if (aVar2 != null) {
                b i6 = i(aVar, aVar2);
                if (i6 != null) {
                    return i6;
                }
                ArrayList d10 = d(aVar);
                ArrayList d11 = d(aVar2);
                List<v0> typeParameters = aVar.getTypeParameters();
                List<v0> typeParameters2 = aVar2.getTypeParameters();
                if (typeParameters.size() != typeParameters2.size()) {
                    for (int i10 = 0; i10 < d10.size(); i10++) {
                        if (!xu.c.f38095a.c((b0) d10.get(i10), (b0) d11.get(i10))) {
                            return b.d("Type parameter number mismatch");
                        }
                    }
                    return b.b("Type parameter number mismatch");
                }
                w0 f2 = f(typeParameters, typeParameters2);
                for (int i11 = 0; i11 < typeParameters.size(); i11++) {
                    v0 v0Var = typeParameters.get(i11);
                    v0 v0Var2 = typeParameters2.get(i11);
                    if (v0Var != null) {
                        if (v0Var2 != null) {
                            List<b0> upperBounds = v0Var.getUpperBounds();
                            ArrayList arrayList = new ArrayList(v0Var2.getUpperBounds());
                            if (upperBounds.size() == arrayList.size()) {
                                for (b0 b0Var : upperBounds) {
                                    ListIterator listIterator = arrayList.listIterator();
                                    while (listIterator.hasNext()) {
                                        if (b(b0Var, (b0) listIterator.next(), f2)) {
                                            break;
                                        }
                                    }
                                }
                                z12 = true;
                                if (z12) {
                                    return b.d("Type parameter bounds mismatch");
                                }
                            }
                            z12 = false;
                            if (z12) {
                            }
                        } else {
                            a(50);
                            throw null;
                        }
                    } else {
                        a(49);
                        throw null;
                    }
                }
                for (int i12 = 0; i12 < d10.size(); i12++) {
                    if (!b((b0) d10.get(i12), (b0) d11.get(i12), f2)) {
                        return b.d("Value parameter type mismatch");
                    }
                }
                if ((aVar instanceof gt.u) && (aVar2 instanceof gt.u) && ((gt.u) aVar).isSuspend() != ((gt.u) aVar2).isSuspend()) {
                    return b.b("Incompatible suspendability");
                }
                if (z10) {
                    b0 returnType = aVar.getReturnType();
                    b0 returnType2 = aVar2.getReturnType();
                    if (returnType != null && returnType2 != null) {
                        if (v.E(returnType2) && v.E(returnType)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            kc.f fVar = kc.f.f23229s0;
                            m1 subType = returnType2.R0();
                            m1 superType = returnType.R0();
                            kotlin.jvm.internal.i.g(subType, "subType");
                            kotlin.jvm.internal.i.g(superType, "superType");
                            if (!kc.f.M(fVar, f2, subType, superType)) {
                                return b.b("Return type mismatch");
                            }
                        }
                    }
                }
                b bVar = b.f20704b;
                if (bVar != null) {
                    return bVar;
                }
                b.a(0);
                throw null;
            }
            a(31);
            throw null;
        }
        a(30);
        throw null;
    }
}
