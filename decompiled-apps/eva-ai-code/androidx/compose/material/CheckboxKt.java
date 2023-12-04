package androidx.compose.material;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.state.ToggleableStateKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.profileinstaller.ProfileVerifier;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Checkbox.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018\u001a-\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u001c\u001aM\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001b2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010 2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010!\u001a9\u0010\"\u001a\u00020\f*\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+\u001aA\u0010,\u001a\u00020\f*\u00020#2\u0006\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u00104\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\b\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\t\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\n\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065²\u0006\n\u00106\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u00107\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020%X\u008a\u0084\u0002"}, d2 = {"BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxDefaultPadding", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxRippleRadius", "CheckboxSize", "RadiusSize", "StrokeWidth", "Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "colors", "Landroidx/compose/material/CheckboxColors;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", "value", "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "TriStateCheckbox", "state", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/CheckboxColors;Landroidx/compose/runtime/Composer;II)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material/CheckDrawingCache;)V", "material_release", "checkDrawFraction", "checkCenterGravitationShiftFraction"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxRippleRadius = Dp.m5607constructorimpl(24);
    private static final float CheckboxSize = Dp.m5607constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(boolean z, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z3;
        int i5;
        Object obj2;
        Object obj3;
        Modifier.Companion companion;
        boolean z4;
        MutableInteractionSource mutableInteractionSource2;
        int i6;
        CheckboxColors m1287colorszjMxDiM;
        Function0 function0;
        CheckboxColors checkboxColors2;
        boolean z5;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-2118660998);
        ComposerKt.sourceInformation(startRestartGroup, "C(Checkbox)P(!1,5,4,2,3)90@4153L39,91@4240L8,93@4257L284:Checkbox.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    obj2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(obj2) ? 16384 : 8192;
                    if ((i & 458752) != 0) {
                        if ((i2 & 32) == 0) {
                            obj3 = checkboxColors;
                            if (startRestartGroup.changed(obj3)) {
                                i7 = 131072;
                                i3 |= i7;
                            }
                        } else {
                            obj3 = checkboxColors;
                        }
                        i7 = 65536;
                        i3 |= i7;
                    } else {
                        obj3 = checkboxColors;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            companion = i8 == 0 ? Modifier.Companion : obj;
                            z4 = i4 == 0 ? true : z3;
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = obj2;
                            }
                            if ((i2 & 32) == 0) {
                                i6 = i3 & (-458753);
                                m1287colorszjMxDiM = CheckboxDefaults.INSTANCE.m1287colorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2118660998, i6, -1, "androidx.compose.material.Checkbox (Checkbox.kt:85)");
                                }
                                ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z);
                                startRestartGroup.startReplaceableGroup(1433125990);
                                ComposerKt.sourceInformation(startRestartGroup, "95@4366L29");
                                if (function1 == null) {
                                    Boolean valueOf = Boolean.valueOf(z);
                                    startRestartGroup.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean changed = startRestartGroup.changed(valueOf) | startRestartGroup.changed(function1);
                                    CheckboxKt$Checkbox$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                                        rememberedValue2 = new CheckboxKt$Checkbox$2$1(function1, z);
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    startRestartGroup.endReplaceableGroup();
                                    function0 = (Function0) rememberedValue2;
                                } else {
                                    function0 = null;
                                }
                                startRestartGroup.endReplaceableGroup();
                                TriStateCheckbox(ToggleableState, function0, companion, z4, mutableInteractionSource2, m1287colorszjMxDiM, startRestartGroup, (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                boolean z6 = z4;
                                checkboxColors2 = m1287colorszjMxDiM;
                                z5 = z6;
                            } else {
                                i6 = i3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            companion = obj;
                            z4 = z3;
                            mutableInteractionSource2 = obj2;
                        }
                        m1287colorszjMxDiM = obj3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ToggleableState ToggleableState2 = ToggleableStateKt.ToggleableState(z);
                        startRestartGroup.startReplaceableGroup(1433125990);
                        ComposerKt.sourceInformation(startRestartGroup, "95@4366L29");
                        if (function1 == null) {
                        }
                        startRestartGroup.endReplaceableGroup();
                        TriStateCheckbox(ToggleableState2, function0, companion, z4, mutableInteractionSource2, m1287colorszjMxDiM, startRestartGroup, (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        boolean z62 = z4;
                        checkboxColors2 = m1287colorszjMxDiM;
                        z5 = z62;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        companion = obj;
                        z5 = z3;
                        mutableInteractionSource2 = obj2;
                        checkboxColors2 = obj3;
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        return;
                    }
                    endRestartGroup.updateScope(new CheckboxKt$Checkbox$3(z, function1, companion, z5, mutableInteractionSource2, checkboxColors2, i, i2));
                    return;
                }
                obj2 = mutableInteractionSource;
                if ((i & 458752) != 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
            }
            z3 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj2 = mutableInteractionSource;
            if ((i & 458752) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
        }
        obj = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj2 = mutableInteractionSource;
        if ((i & 458752) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TriStateCheckbox(ToggleableState state, Function0<Unit> function0, Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, CheckboxColors checkboxColors, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z2;
        int i5;
        Object obj2;
        Object obj3;
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifier2;
        boolean z3;
        Object obj4;
        CheckboxColors checkboxColors2;
        int i6;
        int i7;
        Modifier modifier3;
        Composer composer2;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        boolean z4;
        MutableInteractionSource mutableInteractionSource3;
        CheckboxColors checkboxColors3;
        ScopeUpdateScope endRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(2031255194);
        ComposerKt.sourceInformation(startRestartGroup, "C(TriStateCheckbox)P(5,4,3,1,2)136@6460L39,137@6547L8,155@7071L412:Checkbox.kt#jmzs0o");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    obj2 = mutableInteractionSource;
                    i3 |= startRestartGroup.changed(obj2) ? 16384 : 8192;
                    if ((458752 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            obj3 = checkboxColors;
                            if (startRestartGroup.changed(obj3)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            obj3 = checkboxColors;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        obj3 = checkboxColors;
                    }
                    if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion3 = i9 == 0 ? Modifier.Companion : obj;
                            boolean z5 = i4 == 0 ? true : z2;
                            if (i5 == 0) {
                                startRestartGroup.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.Companion.getEmpty()) {
                                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            } else {
                                mutableInteractionSource2 = obj2;
                            }
                            if ((i2 & 32) == 0) {
                                z3 = z5;
                                obj4 = mutableInteractionSource2;
                                checkboxColors2 = CheckboxDefaults.INSTANCE.m1287colorszjMxDiM(0L, 0L, 0L, 0L, 0L, startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                                i6 = i3 & (-458753);
                                modifier2 = companion3;
                            } else {
                                modifier2 = companion3;
                                z3 = z5;
                                obj4 = mutableInteractionSource2;
                                checkboxColors2 = obj3;
                                i6 = i3;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            i6 = i3;
                            z3 = z2;
                            obj4 = obj2;
                            checkboxColors2 = obj3;
                            modifier2 = obj;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2031255194, i6, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:131)");
                        }
                        startRestartGroup.startReplaceableGroup(-1517549514);
                        ComposerKt.sourceInformation(startRestartGroup, "147@6884L120");
                        if (function0 == null) {
                            i7 = i6;
                            modifier3 = modifier2;
                            composer2 = startRestartGroup;
                            companion = ToggleableKt.m988triStateToggleableO2vRcR0(Modifier.Companion, state, obj4, RippleKt.m1559rememberRipple9IZ8Weo(false, CheckboxRippleRadius, 0L, startRestartGroup, 54, 4), z3, Role.m4917boximpl(Role.Companion.m4925getCheckboxo7Vup1c()), function0);
                        } else {
                            i7 = i6;
                            modifier3 = modifier2;
                            composer2 = startRestartGroup;
                            companion = Modifier.Companion;
                        }
                        composer2.endReplaceableGroup();
                        if (function0 == null) {
                            companion2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
                        } else {
                            companion2 = Modifier.Companion;
                        }
                        CheckboxImpl(z3, state, PaddingKt.m748padding3ABfNKs(modifier3.then(companion2).then(companion), CheckboxDefaultPadding), checkboxColors2, composer2, ((i7 >> 9) & 14) | ((i7 << 3) & 112) | ((i7 >> 6) & 7168));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        obj = modifier3;
                        z4 = z3;
                        mutableInteractionSource3 = obj4;
                        checkboxColors3 = checkboxColors2;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z4 = z2;
                        composer2 = startRestartGroup;
                        mutableInteractionSource3 = obj2;
                        checkboxColors3 = obj3;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new CheckboxKt$TriStateCheckbox$2(state, function0, obj, z4, mutableInteractionSource3, checkboxColors3, i, i2));
                    return;
                }
                obj2 = mutableInteractionSource;
                if ((458752 & i) != 0) {
                }
                if ((374491 & i3) == 74898) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i9 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceableGroup(-1517549514);
                ComposerKt.sourceInformation(startRestartGroup, "147@6884L120");
                if (function0 == null) {
                }
                composer2.endReplaceableGroup();
                if (function0 == null) {
                }
                CheckboxImpl(z3, state, PaddingKt.m748padding3ABfNKs(modifier3.then(companion2).then(companion), CheckboxDefaultPadding), checkboxColors2, composer2, ((i7 >> 9) & 14) | ((i7 << 3) & 112) | ((i7 >> 6) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                }
                obj = modifier3;
                z4 = z3;
                mutableInteractionSource3 = obj4;
                checkboxColors3 = checkboxColors2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj2 = mutableInteractionSource;
            if ((458752 & i) != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i2 & 32) == 0) {
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceableGroup(-1517549514);
            ComposerKt.sourceInformation(startRestartGroup, "147@6884L120");
            if (function0 == null) {
            }
            composer2.endReplaceableGroup();
            if (function0 == null) {
            }
            CheckboxImpl(z3, state, PaddingKt.m748padding3ABfNKs(modifier3.then(companion2).then(companion), CheckboxDefaultPadding), checkboxColors2, composer2, ((i7 >> 9) & 14) | ((i7 << 3) & 112) | ((i7 >> 6) & 7168));
            if (ComposerKt.isTraceInProgress()) {
            }
            obj = modifier3;
            z4 = z3;
            mutableInteractionSource3 = obj4;
            checkboxColors3 = checkboxColors2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        obj = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj2 = mutableInteractionSource;
        if ((458752 & i) != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-1517549514);
        ComposerKt.sourceInformation(startRestartGroup, "147@6884L120");
        if (function0 == null) {
        }
        composer2.endReplaceableGroup();
        if (function0 == null) {
        }
        CheckboxImpl(z3, state, PaddingKt.m748padding3ABfNKs(modifier3.then(companion2).then(companion), CheckboxDefaultPadding), checkboxColors2, composer2, ((i7 >> 9) & 14) | ((i7 << 3) & 112) | ((i7 >> 6) & 7168));
        if (ComposerKt.isTraceInProgress()) {
        }
        obj = modifier3;
        z4 = z3;
        mutableInteractionSource3 = obj4;
        checkboxColors3 = checkboxColors2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c2 A[LOOP:0: B:107:0x02c0->B:108:0x02c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckboxImpl(boolean z, ToggleableState toggleableState, Modifier modifier, CheckboxColors checkboxColors, Composer composer, int i) {
        float f;
        int i2;
        char c;
        int i3;
        int i4;
        float f2;
        int i5;
        int i6;
        float f3;
        int i7;
        Object rememberedValue;
        int i8;
        boolean z2;
        CheckboxKt$CheckboxImpl$1$1 rememberedValue2;
        Composer startRestartGroup = composer.startRestartGroup(-2118895727);
        ComposerKt.sourceInformation(startRestartGroup, "C(CheckboxImpl)P(1,3,2)264@11068L23,265@11132L443,281@11635L458,296@12115L32,297@12177L21,298@12226L24,299@12281L27,300@12391L508,300@12313L586:Checkbox.kt#jmzs0o");
        int i9 = (i & 14) == 0 ? (startRestartGroup.changed(z) ? 4 : 2) | i : i;
        if ((i & 112) == 0) {
            i9 |= startRestartGroup.changed(toggleableState) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i9 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i9 |= startRestartGroup.changed(checkboxColors) ? 2048 : 1024;
        }
        int i10 = i9;
        if ((i10 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2118895727, i10, -1, "androidx.compose.material.CheckboxImpl (Checkbox.kt:258)");
            }
            int i11 = i10 >> 3;
            int i12 = i11 & 14;
            Transition updateTransition = TransitionKt.updateTransition(toggleableState, (String) null, startRestartGroup, i12, 2);
            CheckboxKt$CheckboxImpl$checkDrawFraction$2 checkboxKt$CheckboxImpl$checkDrawFraction$2 = CheckboxKt$CheckboxImpl$checkDrawFraction$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)939@37552L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli");
            ToggleableState toggleableState2 = (ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1798345588);
            ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:273)");
            }
            int i13 = WhenMappings.$EnumSwitchMapping$0[toggleableState2.ordinal()];
            float f4 = 0.0f;
            if (i13 != 1) {
                if (i13 == 2) {
                    f = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf = Float.valueOf(f);
                    ToggleableState toggleableState3 = (ToggleableState) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-1798345588);
                    ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                        i2 = i10;
                        c = 65535;
                    } else {
                        i2 = i10;
                        c = 65535;
                        ComposerKt.traceEventStart(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:273)");
                    }
                    i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState3.ordinal()];
                    if (i3 == 1) {
                        i4 = 2;
                        if (i3 == 2) {
                            f2 = 0.0f;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i14 = i4;
                            int i15 = i2;
                            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke((CheckboxKt$CheckboxImpl$checkDrawFraction$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 = CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-1338768149);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)939@37552L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            startRestartGroup.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli");
                            ToggleableState toggleableState4 = (ToggleableState) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-2098942571);
                            ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
                            }
                            i5 = WhenMappings.$EnumSwitchMapping$0[toggleableState4.ordinal()];
                            if (i5 != 1 || i5 == i14) {
                                i6 = 3;
                                f3 = 0.0f;
                            } else {
                                i6 = 3;
                                if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f3 = 1.0f;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceableGroup();
                            Float valueOf2 = Float.valueOf(f3);
                            ToggleableState toggleableState5 = (ToggleableState) updateTransition.getTargetState();
                            startRestartGroup.startReplaceableGroup(-2098942571);
                            ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2098942571, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:289)");
                            }
                            i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState5.ordinal()];
                            if (i7 != 1 && i7 != i14) {
                                if (i7 == i6) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f4 = 1.0f;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            startRestartGroup.endReplaceableGroup();
                            int i16 = i6;
                            State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.invoke((CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = new CheckDrawingCache(null, null, null, 7, null);
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            CheckDrawingCache checkDrawingCache = (CheckDrawingCache) rememberedValue;
                            State<Color> checkmarkColor = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i12 | ((i15 >> 6) & 112));
                            int i17 = (i11 & 896) | (i15 & 14) | (i15 & 112);
                            State<Color> boxColor = checkboxColors.boxColor(z, toggleableState, startRestartGroup, i17);
                            State<Color> borderColor = checkboxColors.borderColor(z, toggleableState, startRestartGroup, i17);
                            Modifier m787requiredSize3ABfNKs = SizeKt.m787requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.Companion.getCenter(), false, i14, null), CheckboxSize);
                            Object[] objArr = new Object[6];
                            objArr[0] = boxColor;
                            objArr[1] = borderColor;
                            objArr[i14] = checkmarkColor;
                            objArr[i16] = createTransitionAnimation;
                            objArr[4] = createTransitionAnimation2;
                            objArr[5] = checkDrawingCache;
                            startRestartGroup.startReplaceableGroup(-568225417);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            z2 = false;
                            for (i8 = 0; i8 < 6; i8++) {
                                z2 |= startRestartGroup.changed(objArr[i8]);
                            }
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!z2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                                rememberedValue2 = new CheckboxKt$CheckboxImpl$1$1(checkDrawingCache, boxColor, borderColor, checkmarkColor, createTransitionAnimation, createTransitionAnimation2);
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            startRestartGroup.endReplaceableGroup();
                            CanvasKt.Canvas(m787requiredSize3ABfNKs, (Function1) rememberedValue2, startRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i4 = 2;
                    }
                    f2 = 1.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    int i142 = i4;
                    int i152 = i2;
                    State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke((CheckboxKt$CheckboxImpl$checkDrawFraction$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$22 = CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-1338768149);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)939@37552L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    startRestartGroup.startReplaceableGroup(-142660079);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli");
                    ToggleableState toggleableState42 = (ToggleableState) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-2098942571);
                    ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i5 = WhenMappings.$EnumSwitchMapping$0[toggleableState42.ordinal()];
                    if (i5 != 1) {
                    }
                    i6 = 3;
                    f3 = 0.0f;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    Float valueOf22 = Float.valueOf(f3);
                    ToggleableState toggleableState52 = (ToggleableState) updateTransition.getTargetState();
                    startRestartGroup.startReplaceableGroup(-2098942571);
                    ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState52.ordinal()];
                    if (i7 != 1) {
                        if (i7 == i6) {
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    int i162 = i6;
                    State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$22.invoke((CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter22, "FloatAnimation", startRestartGroup, 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    CheckDrawingCache checkDrawingCache2 = (CheckDrawingCache) rememberedValue;
                    State<Color> checkmarkColor2 = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i12 | ((i152 >> 6) & 112));
                    int i172 = (i11 & 896) | (i152 & 14) | (i152 & 112);
                    State<Color> boxColor2 = checkboxColors.boxColor(z, toggleableState, startRestartGroup, i172);
                    State<Color> borderColor2 = checkboxColors.borderColor(z, toggleableState, startRestartGroup, i172);
                    Modifier m787requiredSize3ABfNKs2 = SizeKt.m787requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.Companion.getCenter(), false, i142, null), CheckboxSize);
                    Object[] objArr2 = new Object[6];
                    objArr2[0] = boxColor2;
                    objArr2[1] = borderColor2;
                    objArr2[i142] = checkmarkColor2;
                    objArr2[i162] = createTransitionAnimation3;
                    objArr2[4] = createTransitionAnimation22;
                    objArr2[5] = checkDrawingCache2;
                    startRestartGroup.startReplaceableGroup(-568225417);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                    z2 = false;
                    while (i8 < 6) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z2) {
                    }
                    rememberedValue2 = new CheckboxKt$CheckboxImpl$1$1(checkDrawingCache2, boxColor2, borderColor2, checkmarkColor2, createTransitionAnimation3, createTransitionAnimation22);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    startRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(m787requiredSize3ABfNKs2, (Function1) rememberedValue2, startRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                } else if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            f = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Float valueOf3 = Float.valueOf(f);
            ToggleableState toggleableState32 = (ToggleableState) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-1798345588);
            ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
            }
            i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState32.ordinal()];
            if (i3 == 1) {
            }
            f2 = 1.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            int i1422 = i4;
            int i1522 = i2;
            State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f2), checkboxKt$CheckboxImpl$checkDrawFraction$2.invoke((CheckboxKt$CheckboxImpl$checkDrawFraction$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$222 = CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)939@37552L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)857@34142L32,858@34197L31,859@34253L23,861@34289L89:Transition.kt#pdpnli");
            ToggleableState toggleableState422 = (ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-2098942571);
            ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
            }
            i5 = WhenMappings.$EnumSwitchMapping$0[toggleableState422.ordinal()];
            if (i5 != 1) {
            }
            i6 = 3;
            f3 = 0.0f;
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            Float valueOf222 = Float.valueOf(f3);
            ToggleableState toggleableState522 = (ToggleableState) updateTransition.getTargetState();
            startRestartGroup.startReplaceableGroup(-2098942571);
            ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#jmzs0o");
            if (ComposerKt.isTraceInProgress()) {
            }
            i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState522.ordinal()];
            if (i7 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            int i1622 = i6;
            State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$222.invoke((CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter222, "FloatAnimation", startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CheckDrawingCache checkDrawingCache22 = (CheckDrawingCache) rememberedValue;
            State<Color> checkmarkColor22 = checkboxColors.checkmarkColor(toggleableState, startRestartGroup, i12 | ((i1522 >> 6) & 112));
            int i1722 = (i11 & 896) | (i1522 & 14) | (i1522 & 112);
            State<Color> boxColor22 = checkboxColors.boxColor(z, toggleableState, startRestartGroup, i1722);
            State<Color> borderColor22 = checkboxColors.borderColor(z, toggleableState, startRestartGroup, i1722);
            Modifier m787requiredSize3ABfNKs22 = SizeKt.m787requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.Companion.getCenter(), false, i1422, null), CheckboxSize);
            Object[] objArr22 = new Object[6];
            objArr22[0] = boxColor22;
            objArr22[1] = borderColor22;
            objArr22[i1422] = checkmarkColor22;
            objArr22[i1622] = createTransitionAnimation32;
            objArr22[4] = createTransitionAnimation222;
            objArr22[5] = checkDrawingCache22;
            startRestartGroup.startReplaceableGroup(-568225417);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            z2 = false;
            while (i8 < 6) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue2 = new CheckboxKt$CheckboxImpl$1$1(checkDrawingCache22, boxColor22, borderColor22, checkmarkColor22, createTransitionAnimation32, createTransitionAnimation222);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(m787requiredSize3ABfNKs22, (Function1) rememberedValue2, startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CheckboxKt$CheckboxImpl$2(z, toggleableState, modifier, checkboxColors, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawBox-1wkBAMs  reason: not valid java name */
    public static final void m1290drawBox1wkBAMs(DrawScope drawScope, long j, long j2, float f, float f2) {
        float f3 = f2 / 2.0f;
        Stroke stroke = new Stroke(f2, 0.0f, 0, 0, null, 30, null);
        float m3087getWidthimpl = Size.m3087getWidthimpl(drawScope.mo3762getSizeNHjbRc());
        if (Color.m3292equalsimpl0(j, j2)) {
            DrawScope.CC.m3844drawRoundRectuAw5IA$default(drawScope, j, 0L, androidx.compose.ui.geometry.SizeKt.Size(m3087getWidthimpl, m3087getWidthimpl), CornerRadiusKt.CornerRadius$default(f, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 226, null);
            return;
        }
        float f4 = m3087getWidthimpl - (2 * f2);
        DrawScope.CC.m3844drawRoundRectuAw5IA$default(drawScope, j, OffsetKt.Offset(f2, f2), androidx.compose.ui.geometry.SizeKt.Size(f4, f4), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f - f2), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        float f5 = m3087getWidthimpl - f2;
        DrawScope.CC.m3844drawRoundRectuAw5IA$default(drawScope, j2, OffsetKt.Offset(f3, f3), androidx.compose.ui.geometry.SizeKt.Size(f5, f5), CornerRadiusKt.CornerRadius$default(f - f3, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCheck-3IgeMak  reason: not valid java name */
    public static final void m1291drawCheck3IgeMak(DrawScope drawScope, long j, float f, float f2, float f3, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f3, 0.0f, StrokeCap.Companion.m3646getSquareKaPHkGw(), 0, null, 26, null);
        float m3087getWidthimpl = Size.m3087getWidthimpl(drawScope.mo3762getSizeNHjbRc());
        float lerp = MathHelpersKt.lerp(0.4f, 0.5f, f2);
        float lerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f2);
        float lerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f2);
        float lerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f2);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * m3087getWidthimpl, lerp3 * m3087getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(lerp * m3087getWidthimpl, lerp2 * m3087getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(0.8f * m3087getWidthimpl, m3087getWidthimpl * lerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f, checkDrawingCache.getPathToDraw(), true);
        DrawScope.CC.m3838drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j, 0.0f, stroke, null, 0, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CheckboxImpl$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float CheckboxImpl$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$8(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$9(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CheckboxImpl$lambda$10(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    static {
        float f = 2;
        CheckboxDefaultPadding = Dp.m5607constructorimpl(f);
        StrokeWidth = Dp.m5607constructorimpl(f);
        RadiusSize = Dp.m5607constructorimpl(f);
    }
}
