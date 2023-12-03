package iu;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import gt.a0;
import gt.b;
import gt.d0;
import gt.h0;
import gt.m0;
import gt.r0;
import gt.z;
import java.util.Collection;
import java.util.LinkedHashSet;
import wu.b0;
import wu.x0;
/* compiled from: DescriptorUtils.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f20688a = 0;

    static {
        new fu.c("kotlin.jvm.JvmName");
    }

    public static /* synthetic */ void a(int i6) {
        String str;
        int i10;
        switch (i6) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case 86:
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i6) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case 86:
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        Object[] objArr = new Object[i10];
        switch (i6) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
            case 36:
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case 86:
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                objArr[0] = "superClass";
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case 32:
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                objArr[0] = "type";
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                objArr[0] = "other";
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                objArr[0] = "classKind";
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                objArr[0] = "classDescriptor";
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                objArr[0] = "typeConstructor";
                break;
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                objArr[0] = "innerClassName";
                break;
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                objArr[0] = "location";
                break;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                objArr[0] = "variable";
                break;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                objArr[0] = "f";
                break;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
                objArr[0] = "current";
                break;
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                objArr[0] = "result";
                break;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                objArr[0] = "memberDescriptor";
                break;
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                objArr[0] = "annotated";
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
                objArr[0] = "scope";
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
            case 90:
                objArr[0] = SessionManager.KEY_NAME;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i6) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                objArr[1] = "getSuperClassType";
                break;
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                objArr[1] = "unwrapFakeOverride";
                break;
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                objArr[1] = "getContainingSourceFile";
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                objArr[1] = "getAllDescriptors";
                break;
            case 86:
                objArr[1] = "getFunctionByName";
                break;
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                objArr[1] = "getPropertyByName";
                break;
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i6) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case 86:
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                objArr[2] = "isSubtypeOfClass";
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                objArr[2] = "isAnonymousObject";
                break;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                objArr[2] = "isKindOf";
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                objArr[2] = "hasAbstractMembers";
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                objArr[2] = "getSuperClassType";
                break;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                objArr[2] = "getClassDescriptorForType";
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
            case R.styleable.AppCompatTheme_colorError /* 56 */:
                objArr[2] = "getInnerClassByName";
                break;
            case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                objArr[2] = "isStaticNestedClass";
                break;
            case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                objArr[2] = "unwrapFakeOverride";
                break;
            case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
            case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case R.styleable.AppCompatTheme_editTextStyle /* 70 */:
            case R.styleable.AppCompatTheme_homeAsUpIndicator /* 71 */:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated /* 75 */:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case R.styleable.AppCompatTheme_listDividerAlertDialog /* 76 */:
                objArr[2] = "getJvmName";
                break;
            case R.styleable.AppCompatTheme_listMenuViewStyle /* 77 */:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case R.styleable.AppCompatTheme_listPopupWindowStyle /* 78 */:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case R.styleable.AppCompatTheme_listPreferredItemHeight /* 79 */:
                objArr[2] = "getContainingSourceFile";
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingEnd /* 82 */:
                objArr[2] = "getAllDescriptors";
                break;
            case R.styleable.AppCompatTheme_listPreferredItemPaddingRight /* 84 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingStart /* 85 */:
                objArr[2] = "getFunctionByName";
                break;
            case R.styleable.AppCompatTheme_panelMenuListTheme /* 87 */:
            case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case R.styleable.AppCompatTheme_popupMenuStyle /* 89 */:
            case 90:
                objArr[2] = "getPropertyByName";
                break;
            case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                objArr[2] = "getDirectMember";
                break;
            case R.styleable.AppCompatTheme_ratingBarStyleSmall /* 94 */:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i6) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
            case R.styleable.AppCompatTheme_controlBackground /* 60 */:
            case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
            case R.styleable.AppCompatTheme_editTextColor /* 69 */:
            case R.styleable.AppCompatTheme_listChoiceBackgroundIndicator /* 73 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
            case R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
            case R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
            case 86:
            case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
            case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static void b(gt.a aVar, LinkedHashSet linkedHashSet) {
        if (aVar != null) {
            if (linkedHashSet.contains(aVar)) {
                return;
            }
            for (gt.a aVar2 : aVar.b().f()) {
                gt.a b10 = aVar2.b();
                b(b10, linkedHashSet);
                linkedHashSet.add(b10);
            }
            return;
        }
        a(70);
        throw null;
    }

    public static gt.e c(b0 b0Var) {
        if (b0Var != null) {
            x0 O0 = b0Var.O0();
            if (O0 != null) {
                gt.e eVar = (gt.e) O0.a();
                if (eVar != null) {
                    return eVar;
                }
                a(47);
                throw null;
            }
            a(46);
            throw null;
        }
        a(45);
        throw null;
    }

    public static a0 d(gt.j jVar) {
        if (jVar != null) {
            a0 e10 = e(jVar);
            if (e10 != null) {
                return e10;
            }
            a(22);
            throw null;
        }
        a(21);
        throw null;
    }

    public static a0 e(gt.j jVar) {
        if (jVar != null) {
            while (jVar != null) {
                if (jVar instanceof a0) {
                    return (a0) jVar;
                }
                if (jVar instanceof h0) {
                    return ((h0) jVar).w0();
                }
                jVar = jVar.c();
            }
            return null;
        }
        a(23);
        throw null;
    }

    public static r0 f(gt.j jVar) {
        if (jVar != null) {
            if (jVar instanceof m0) {
                jVar = ((m0) jVar).E0();
            }
            boolean z10 = jVar instanceof gt.m;
            r0.a aVar = r0.f16817a;
            if (z10) {
                ((gt.m) jVar).g().a();
            }
            return aVar;
        }
        a(79);
        throw null;
    }

    public static fu.d g(gt.j jVar) {
        if (jVar != null) {
            fu.c h10 = h(jVar);
            if (h10 != null) {
                return h10.i();
            }
            return g(jVar.c()).b(jVar.getName());
        }
        a(2);
        throw null;
    }

    public static fu.c h(gt.j jVar) {
        if (jVar != null) {
            if (!(jVar instanceof a0) && !yu.i.f(jVar)) {
                if (jVar instanceof h0) {
                    return ((h0) jVar).e();
                }
                if (!(jVar instanceof d0)) {
                    return null;
                }
                return ((d0) jVar).e();
            }
            return fu.c.f15921c;
        }
        a(5);
        throw null;
    }

    public static <D extends gt.j> D i(gt.j jVar, Class<D> cls, boolean z10) {
        if (jVar == null) {
            return null;
        }
        if (z10) {
            jVar = (D) jVar.c();
        }
        while (jVar != null) {
            if (cls.isInstance(jVar)) {
                return (D) jVar;
            }
            jVar = (D) jVar.c();
        }
        return null;
    }

    public static gt.e j(gt.e eVar) {
        if (eVar != null) {
            for (b0 b0Var : eVar.l().c()) {
                gt.e c10 = c(b0Var);
                if (c10.j() != 2) {
                    return c10;
                }
            }
            return null;
        }
        a(44);
        throw null;
    }

    public static boolean k(gt.j jVar) {
        if (n(jVar, 1) && jVar.getName().equals(fu.g.f15933a)) {
            return true;
        }
        return false;
    }

    public static boolean l(gt.j jVar) {
        if (n(jVar, 6) && ((gt.e) jVar).w()) {
            return true;
        }
        return false;
    }

    public static boolean m(gt.j jVar) {
        if (jVar != null) {
            return n(jVar, 4);
        }
        a(36);
        throw null;
    }

    public static boolean n(gt.j jVar, int i6) {
        if (i6 != 0) {
            if ((jVar instanceof gt.e) && ((gt.e) jVar).j() == i6) {
                return true;
            }
            return false;
        }
        a(37);
        throw null;
    }

    public static boolean o(gt.j jVar) {
        if (jVar != null) {
            while (true) {
                boolean z10 = false;
                if (jVar == null) {
                    return false;
                }
                if (k(jVar)) {
                    break;
                }
                if ((jVar instanceof gt.n) && ((gt.n) jVar).getVisibility() == gt.p.f) {
                    z10 = true;
                }
                if (z10) {
                    break;
                }
                jVar = jVar.c();
            }
            return true;
        }
        a(1);
        throw null;
    }

    public static boolean p(b0 b0Var, gt.e eVar) {
        if (b0Var != null) {
            if (eVar != null) {
                gt.g a10 = b0Var.O0().a();
                if (a10 != null) {
                    gt.j b10 = a10.b();
                    if ((b10 instanceof gt.g) && eVar.l().equals(((gt.g) b10).l())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            a(31);
            throw null;
        }
        a(30);
        throw null;
    }

    public static boolean q(gt.h hVar) {
        if ((n(hVar, 1) || n(hVar, 2)) && ((gt.e) hVar).m() == z.SEALED) {
            return true;
        }
        return false;
    }

    public static boolean r(gt.e eVar, gt.e eVar2) {
        return s(eVar.r(), eVar2.b());
    }

    public static boolean s(b0 b0Var, gt.e eVar) {
        if (b0Var != null) {
            if (eVar != null) {
                if (p(b0Var, eVar)) {
                    return true;
                }
                for (b0 b0Var2 : b0Var.O0().c()) {
                    if (s(b0Var2, eVar)) {
                        return true;
                    }
                }
                return false;
            }
            a(33);
            throw null;
        }
        a(32);
        throw null;
    }

    public static boolean t(gt.j jVar) {
        if (jVar != null && (jVar.c() instanceof d0)) {
            return true;
        }
        return false;
    }

    public static <D extends gt.b> D u(D d10) {
        if (d10 != null) {
            while (d10.m0() == b.a.FAKE_OVERRIDE) {
                Collection<? extends gt.b> f = d10.f();
                if (!f.isEmpty()) {
                    d10 = (D) f.iterator().next();
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d10);
                }
            }
            return d10;
        }
        a(59);
        throw null;
    }

    public static <D extends gt.n> D v(D d10) {
        if (d10 instanceof gt.b) {
            return u((gt.b) d10);
        }
        return d10;
    }
}
