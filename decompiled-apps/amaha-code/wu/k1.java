package wu;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* compiled from: TypeUtils.java */
/* loaded from: classes2.dex */
public final class k1 {

    /* renamed from: a  reason: collision with root package name */
    public static final yu.f f37261a = yu.i.c(yu.h.F, new String[0]);

    /* renamed from: b  reason: collision with root package name */
    public static final yu.f f37262b = yu.i.c(yu.h.C, new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final a f37263c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d  reason: collision with root package name */
    public static final a f37264d = new a("UNIT_EXPECTED_TYPE");

    /* compiled from: TypeUtils.java */
    /* loaded from: classes2.dex */
    public static class a extends q {

        /* renamed from: v  reason: collision with root package name */
        public final String f37265v;

        public a(String str) {
            this.f37265v = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void a1(int i6) {
            String str;
            int i10;
            String format;
            if (i6 != 1 && i6 != 4) {
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i6 != 1 && i6 != 4) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            Object[] objArr = new Object[i10];
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            objArr[0] = "newAttributes";
                        }
                    } else {
                        objArr[0] = "kotlinTypeRefiner";
                    }
                } else {
                    objArr[0] = "delegate";
                }
                if (i6 == 1) {
                    if (i6 != 4) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
                    } else {
                        objArr[1] = "refine";
                    }
                } else {
                    objArr[1] = "toString";
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 != 4) {
                                objArr[2] = "replaceAttributes";
                            }
                        } else {
                            objArr[2] = "refine";
                        }
                    } else {
                        objArr[2] = "replaceDelegate";
                    }
                }
                format = String.format(str, objArr);
                if (i6 != 1 || i6 == 4) {
                    throw new IllegalStateException(format);
                }
                throw new IllegalArgumentException(format);
            }
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            if (i6 == 1) {
            }
            if (i6 != 1) {
            }
            format = String.format(str, objArr);
            if (i6 != 1) {
            }
            throw new IllegalStateException(format);
        }

        @Override // wu.q, wu.b0
        public final b0 Q0(xu.e eVar) {
            if (eVar != null) {
                return this;
            }
            a1(3);
            throw null;
        }

        @Override // wu.i0, wu.m1
        public final /* bridge */ /* synthetic */ m1 S0(boolean z10) {
            V0(z10);
            throw null;
        }

        @Override // wu.q, wu.m1
        public final m1 T0(xu.e eVar) {
            if (eVar != null) {
                return this;
            }
            a1(3);
            throw null;
        }

        @Override // wu.i0, wu.m1
        public final /* bridge */ /* synthetic */ m1 U0(v0 v0Var) {
            W0(v0Var);
            throw null;
        }

        @Override // wu.i0
        public final i0 V0(boolean z10) {
            throw new IllegalStateException(this.f37265v);
        }

        @Override // wu.i0
        public final i0 W0(v0 v0Var) {
            if (v0Var == null) {
                a1(0);
                throw null;
            }
            throw new IllegalStateException(this.f37265v);
        }

        @Override // wu.q
        public final i0 X0() {
            throw new IllegalStateException(this.f37265v);
        }

        @Override // wu.q
        public final i0 Y0(xu.e eVar) {
            if (eVar != null) {
                return this;
            }
            a1(3);
            throw null;
        }

        @Override // wu.q
        public final q Z0(i0 i0Var) {
            throw new IllegalStateException(this.f37265v);
        }

        @Override // wu.i0
        public final String toString() {
            String str = this.f37265v;
            if (str != null) {
                return str;
            }
            a1(1);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        if (i6 != 4 && i6 != 9 && i6 != 11 && i6 != 15 && i6 != 17 && i6 != 19 && i6 != 26 && i6 != 35 && i6 != 48 && i6 != 53 && i6 != 6 && i6 != 7) {
            switch (i6) {
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            if (i6 != 4 && i6 != 9 && i6 != 11 && i6 != 15 && i6 != 17 && i6 != 19 && i6 != 26 && i6 != 35 && i6 != 48 && i6 != 53 && i6 != 6 && i6 != 7) {
                switch (i6) {
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        break;
                    default:
                        i10 = 3;
                        break;
                }
                Object[] objArr = new Object[i10];
                switch (i6) {
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                    case 26:
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                    case 5:
                    case 8:
                    case 10:
                    case 18:
                    case 23:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    default:
                        objArr[0] = "type";
                        break;
                    case 12:
                        objArr[0] = "typeConstructor";
                        break;
                    case 13:
                        objArr[0] = "unsubstitutedMemberScope";
                        break;
                    case 14:
                        objArr[0] = "refinedTypeFactory";
                        break;
                    case 16:
                        objArr[0] = "parameters";
                        break;
                    case 20:
                        objArr[0] = "subType";
                        break;
                    case 21:
                        objArr[0] = "superType";
                        break;
                    case 22:
                        objArr[0] = "substitutor";
                        break;
                    case 24:
                        objArr[0] = "result";
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        objArr[0] = "clazz";
                        break;
                    case 32:
                        objArr[0] = "typeArguments";
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        objArr[0] = "projections";
                        break;
                    case 36:
                        objArr[0] = "a";
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        objArr[0] = Constants.ONBOARDING_VARIANT;
                        break;
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        objArr[0] = "typeParameters";
                        break;
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        objArr[0] = "typeParameterConstructors";
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                        objArr[0] = "specialType";
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        objArr[0] = "isSpecialType";
                        break;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        objArr[0] = "parameterDescriptor";
                        break;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                        objArr[0] = "numberValueTypeConstructor";
                        break;
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    case 50:
                        objArr[0] = "supertypes";
                        break;
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        objArr[0] = "expectedType";
                        break;
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                        objArr[0] = "literalTypeConstructor";
                        break;
                }
                if (i6 == 4) {
                    if (i6 != 9) {
                        if (i6 != 11 && i6 != 15) {
                            if (i6 != 17) {
                                if (i6 != 19) {
                                    if (i6 != 26) {
                                        if (i6 != 35) {
                                            if (i6 != 48) {
                                                if (i6 != 53) {
                                                    if (i6 != 6 && i6 != 7) {
                                                        switch (i6) {
                                                            case R.styleable.AppCompatTheme_colorError /* 56 */:
                                                            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                                                            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                                                            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                                                                break;
                                                            default:
                                                                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                                                                break;
                                                        }
                                                    }
                                                }
                                                objArr[1] = "getPrimitiveNumberType";
                                            } else {
                                                objArr[1] = "getDefaultPrimitiveNumberType";
                                            }
                                        } else {
                                            objArr[1] = "substituteProjectionsForParameters";
                                        }
                                    } else {
                                        objArr[1] = "getAllSupertypes";
                                    }
                                } else {
                                    objArr[1] = "getImmediateSupertypes";
                                }
                            } else {
                                objArr[1] = "getDefaultTypeProjections";
                            }
                        } else {
                            objArr[1] = "makeUnsubstitutedType";
                        }
                    }
                    objArr[1] = "makeNullableIfNeeded";
                } else {
                    objArr[1] = "makeNullableAsSpecified";
                }
                switch (i6) {
                    case 1:
                        objArr[2] = "makeNullable";
                        break;
                    case 2:
                        objArr[2] = "makeNotNullable";
                        break;
                    case 3:
                        objArr[2] = "makeNullableAsSpecified";
                        break;
                    case 4:
                    case 6:
                    case 7:
                    case 9:
                    case 11:
                    case 15:
                    case 17:
                    case 19:
                    case 26:
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                    case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                    case R.styleable.AppCompatTheme_colorError /* 56 */:
                    case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                    case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                    case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                        break;
                    case 5:
                    case 8:
                        objArr[2] = "makeNullableIfNeeded";
                        break;
                    case 10:
                        objArr[2] = "canHaveSubtypes";
                        break;
                    case 12:
                    case 13:
                    case 14:
                        objArr[2] = "makeUnsubstitutedType";
                        break;
                    case 16:
                        objArr[2] = "getDefaultTypeProjections";
                        break;
                    case 18:
                        objArr[2] = "getImmediateSupertypes";
                        break;
                    case 20:
                    case 21:
                    case 22:
                        objArr[2] = "createSubstitutedSupertype";
                        break;
                    case 23:
                    case 24:
                        objArr[2] = "collectAllSupertypes";
                        break;
                    case 25:
                        objArr[2] = "getAllSupertypes";
                        break;
                    case 27:
                        objArr[2] = "isNullableType";
                        break;
                    case 28:
                        objArr[2] = "acceptsNullable";
                        break;
                    case 29:
                        objArr[2] = "hasNullableSuperType";
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        objArr[2] = "getClassDescriptor";
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    case 32:
                        objArr[2] = "substituteParameters";
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        objArr[2] = "substituteProjectionsForParameters";
                        break;
                    case 36:
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        objArr[2] = "equalTypes";
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                    case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                        objArr[2] = "dependsOnTypeParameters";
                        break;
                    case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                    case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                        objArr[2] = "dependsOnTypeConstructors";
                        break;
                    case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                    case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                    case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        objArr[2] = "contains";
                        break;
                    case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                    case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        objArr[2] = "makeStarProjection";
                        break;
                    case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                    case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                        objArr[2] = "getDefaultPrimitiveNumberType";
                        break;
                    case 50:
                        objArr[2] = "findByFqName";
                        break;
                    case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                    case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                    case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                    case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                        objArr[2] = "getPrimitiveNumberType";
                        break;
                    case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                        objArr[2] = "isTypeParameter";
                        break;
                    case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                        objArr[2] = "isReifiedTypeParameter";
                        break;
                    case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                        objArr[2] = "isNonReifiedTypeParameter";
                        break;
                    case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                        objArr[2] = "getTypeParameterDescriptorOrNull";
                        break;
                    default:
                        objArr[2] = "noExpectedType";
                        break;
                }
                String format = String.format(str, objArr);
                if (i6 != 4 && i6 != 9 && i6 != 11 && i6 != 15 && i6 != 17 && i6 != 19 && i6 != 26 && i6 != 35 && i6 != 48 && i6 != 53 && i6 != 6 && i6 != 7) {
                    switch (i6) {
                        case R.styleable.AppCompatTheme_colorError /* 56 */:
                        case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                        case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                        case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                            break;
                        default:
                            throw new IllegalArgumentException(format);
                    }
                }
                throw new IllegalStateException(format);
            }
            i10 = 2;
            Object[] objArr2 = new Object[i10];
            switch (i6) {
            }
            if (i6 == 4) {
            }
            switch (i6) {
            }
            String format2 = String.format(str, objArr2);
            if (i6 != 4) {
                switch (i6) {
                }
            }
            throw new IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i6 != 4) {
            switch (i6) {
            }
            Object[] objArr22 = new Object[i10];
            switch (i6) {
            }
            if (i6 == 4) {
            }
            switch (i6) {
            }
            String format22 = String.format(str, objArr22);
            if (i6 != 4) {
            }
            throw new IllegalStateException(format22);
        }
        i10 = 2;
        Object[] objArr222 = new Object[i10];
        switch (i6) {
        }
        if (i6 == 4) {
        }
        switch (i6) {
        }
        String format222 = String.format(str, objArr222);
        if (i6 != 4) {
        }
        throw new IllegalStateException(format222);
    }

    public static boolean b(b0 b0Var) {
        if (b0Var != null) {
            if (b0Var.P0()) {
                return true;
            }
            if (ca.a.J0(b0Var) && b(ca.a.m(b0Var).f37299w)) {
                return true;
            }
            return false;
        }
        a(28);
        throw null;
    }

    public static boolean c(b0 b0Var, ss.l<m1, Boolean> lVar) {
        if (lVar != null) {
            return d(b0Var, lVar, null);
        }
        a(43);
        throw null;
    }

    public static boolean d(b0 b0Var, ss.l<m1, Boolean> lVar, dv.e<b0> eVar) {
        v vVar = null;
        if (lVar != null) {
            if (b0Var == null) {
                return false;
            }
            m1 R0 = b0Var.R0();
            if (q(b0Var)) {
                return lVar.invoke(R0).booleanValue();
            }
            if (eVar != null && eVar.contains(b0Var)) {
                return false;
            }
            if (lVar.invoke(R0).booleanValue()) {
                return true;
            }
            if (eVar == null) {
                eVar = new dv.e<>();
            }
            eVar.add(b0Var);
            if (R0 instanceof v) {
                vVar = (v) R0;
            }
            if (vVar != null && (d(vVar.f37298v, lVar, eVar) || d(vVar.f37299w, lVar, eVar))) {
                return true;
            }
            if ((R0 instanceof o) && d(((o) R0).f37280v, lVar, eVar)) {
                return true;
            }
            x0 O0 = b0Var.O0();
            if (O0 instanceof z) {
                for (b0 b0Var2 : ((z) O0).f37321b) {
                    if (d(b0Var2, lVar, eVar)) {
                        return true;
                    }
                }
                return false;
            }
            for (d1 d1Var : b0Var.M0()) {
                if (!d1Var.d()) {
                    if (d(d1Var.a(), lVar, eVar)) {
                        return true;
                    }
                }
            }
            return false;
        }
        a(44);
        throw null;
    }

    public static List<d1> e(List<gt.v0> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (gt.v0 v0Var : list) {
                arrayList.add(new f1(v0Var.r()));
            }
            return is.u.I2(arrayList);
        }
        a(16);
        throw null;
    }

    public static boolean f(b0 b0Var) {
        b0 b0Var2;
        if (b0Var != null) {
            if (b0Var.O0().a() instanceof gt.e) {
                return false;
            }
            j1 d10 = j1.d(b0Var);
            Collection<b0> c10 = b0Var.O0().c();
            ArrayList arrayList = new ArrayList(c10.size());
            for (b0 b0Var3 : c10) {
                if (b0Var3 != null) {
                    b0 k10 = d10.k(b0Var3, n1.INVARIANT);
                    if (k10 != null) {
                        b0Var2 = k(k10, b0Var.P0());
                    } else {
                        b0Var2 = null;
                    }
                    if (b0Var2 != null) {
                        arrayList.add(b0Var2);
                    }
                } else {
                    a(21);
                    throw null;
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (g((b0) it.next())) {
                    return true;
                }
            }
            return false;
        }
        a(29);
        throw null;
    }

    public static boolean g(b0 b0Var) {
        if (b0Var != null) {
            if (b0Var.P0()) {
                return true;
            }
            if (ca.a.J0(b0Var) && g(ca.a.m(b0Var).f37299w)) {
                return true;
            }
            if (b0Var.R0() instanceof o) {
                return false;
            }
            if (h(b0Var)) {
                return f(b0Var);
            }
            if (b0Var instanceof c) {
                gt.v0 b10 = ((c) b0Var).f37210v.b();
                if (b10 == null || f(b10.r())) {
                    return true;
                }
                return false;
            }
            x0 O0 = b0Var.O0();
            if (O0 instanceof z) {
                for (b0 b0Var2 : O0.c()) {
                    if (g(b0Var2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        a(27);
        throw null;
    }

    public static boolean h(b0 b0Var) {
        gt.v0 v0Var = null;
        if (b0Var != null) {
            if (b0Var != null) {
                if (b0Var.O0().a() instanceof gt.v0) {
                    v0Var = (gt.v0) b0Var.O0().a();
                }
                if (v0Var == null && !(b0Var.O0() instanceof xu.m)) {
                    return false;
                }
                return true;
            }
            a(63);
            throw null;
        }
        a(60);
        throw null;
    }

    public static m1 i(b0 b0Var) {
        if (b0Var != null) {
            return j(b0Var, false);
        }
        a(2);
        throw null;
    }

    public static m1 j(b0 b0Var, boolean z10) {
        if (b0Var != null) {
            m1 S0 = b0Var.R0().S0(z10);
            if (S0 != null) {
                return S0;
            }
            a(4);
            throw null;
        }
        a(3);
        throw null;
    }

    public static b0 k(b0 b0Var, boolean z10) {
        if (b0Var != null) {
            if (z10) {
                return j(b0Var, true);
            }
            return b0Var;
        }
        a(8);
        throw null;
    }

    public static i0 l(i0 i0Var, boolean z10) {
        if (i0Var != null) {
            if (z10) {
                i0 S0 = i0Var.S0(true);
                if (S0 != null) {
                    return S0;
                }
                a(6);
                throw null;
            } else if (i0Var != null) {
                return i0Var;
            } else {
                a(7);
                throw null;
            }
        }
        a(5);
        throw null;
    }

    public static n0 m(gt.v0 v0Var) {
        if (v0Var != null) {
            return new n0(v0Var);
        }
        a(45);
        throw null;
    }

    public static e1 n(gt.v0 v0Var, u uVar) {
        if (v0Var != null) {
            if (uVar.b() == 1) {
                return new f1(kc.f.X(v0Var));
            }
            return new n0(v0Var);
        }
        a(46);
        throw null;
    }

    public static i0 o(gt.g gVar, pu.i iVar, ss.l<xu.e, i0> lVar) {
        if (yu.i.f(gVar)) {
            return yu.i.c(yu.h.E, gVar.toString());
        }
        return p(gVar.l(), iVar, lVar);
    }

    public static i0 p(x0 x0Var, pu.i iVar, ss.l<xu.e, i0> lVar) {
        if (x0Var != null) {
            if (iVar != null) {
                if (lVar != null) {
                    List<d1> e10 = e(x0Var.getParameters());
                    v0.f37300v.getClass();
                    return c0.h(v0.f37301w, x0Var, e10, false, iVar, lVar);
                }
                a(14);
                throw null;
            }
            a(13);
            throw null;
        }
        a(12);
        throw null;
    }

    public static boolean q(b0 b0Var) {
        if (b0Var != null) {
            if (b0Var != f37263c && b0Var != f37264d) {
                return false;
            }
            return true;
        }
        a(0);
        throw null;
    }
}
