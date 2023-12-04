package androidx.compose.material3;

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
import androidx.compose.material3.tokens.CheckboxTokens;
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
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u001b\u001aM\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010 \u001a9\u0010!\u001a\u00020\u000b*\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aA\u0010+\u001a\u00020\u000b*\u00020\"2\u0006\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\u0007\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\b\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\"\u0013\u0010\t\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxDefaultPadding", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxSize", "RadiusSize", "StrokeWidth", "Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/CheckboxColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", "value", "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "TriStateCheckbox", "state", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material3/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material3/CheckDrawingCache;)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(boolean z, Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z3;
        Object obj2;
        int i5;
        Object obj3;
        Modifier.Companion companion;
        boolean z4;
        CheckboxColors checkboxColors2;
        Object obj4;
        int i6;
        Object obj5;
        Function0 function0;
        boolean z5;
        MutableInteractionSource mutableInteractionSource2;
        ScopeUpdateScope endRestartGroup;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(-1406741137);
        ComposerKt.sourceInformation(startRestartGroup, "C(Checkbox)P(!1,5,4,2)92@4250L8,93@4310L39,95@4358L328:Checkbox.kt#uh7d8r");
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
                if ((i & 57344) == 0) {
                    if ((i2 & 16) == 0) {
                        obj2 = checkboxColors;
                        if (startRestartGroup.changed(obj2)) {
                            i7 = 16384;
                            i3 |= i7;
                        }
                    } else {
                        obj2 = checkboxColors;
                    }
                    i7 = 8192;
                    i3 |= i7;
                } else {
                    obj2 = checkboxColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    obj3 = mutableInteractionSource;
                } else {
                    obj3 = mutableInteractionSource;
                    if ((i & 458752) == 0) {
                        i3 |= startRestartGroup.changed(obj3) ? 131072 : 65536;
                    }
                }
                if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        companion = i8 != 0 ? Modifier.Companion : obj;
                        z4 = i4 != 0 ? true : z3;
                        if ((i2 & 16) != 0) {
                            checkboxColors2 = CheckboxDefaults.INSTANCE.m1613colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                            i3 &= -57345;
                        } else {
                            checkboxColors2 = obj2;
                        }
                        if (i5 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            obj4 = (MutableInteractionSource) rememberedValue;
                        } else {
                            obj4 = mutableInteractionSource;
                        }
                        Object obj6 = checkboxColors2;
                        i6 = i3;
                        obj5 = obj6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i6 = i3;
                        companion = obj;
                        z4 = z3;
                        obj5 = obj2;
                        obj4 = obj3;
                    }
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1406741137, i6, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:87)");
                    }
                    ToggleableState ToggleableState = ToggleableStateKt.ToggleableState(z);
                    startRestartGroup.startReplaceableGroup(1557792622);
                    ComposerKt.sourceInformation(startRestartGroup, "98@4479L29");
                    if (function1 != null) {
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
                    TriStateCheckbox(ToggleableState, function0, companion, z4, obj5, obj4, startRestartGroup, (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    obj2 = obj5;
                    z5 = z4;
                    mutableInteractionSource2 = obj4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    companion = obj;
                    z5 = z3;
                    mutableInteractionSource2 = obj3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new CheckboxKt$Checkbox$3(z, function1, companion, z5, obj2, mutableInteractionSource2, i, i2));
                return;
            }
            z3 = z2;
            if ((i & 57344) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i8 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            Object obj62 = checkboxColors2;
            i6 = i3;
            obj5 = obj62;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ToggleableState ToggleableState2 = ToggleableStateKt.ToggleableState(z);
            startRestartGroup.startReplaceableGroup(1557792622);
            ComposerKt.sourceInformation(startRestartGroup, "98@4479L29");
            if (function1 != null) {
            }
            startRestartGroup.endReplaceableGroup();
            TriStateCheckbox(ToggleableState2, function0, companion, z4, obj5, obj4, startRestartGroup, (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            obj2 = obj5;
            z5 = z4;
            mutableInteractionSource2 = obj4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        obj = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z2;
        if ((i & 57344) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i8 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        Object obj622 = checkboxColors2;
        i6 = i3;
        obj5 = obj622;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ToggleableState ToggleableState22 = ToggleableStateKt.ToggleableState(z);
        startRestartGroup.startReplaceableGroup(1557792622);
        ComposerKt.sourceInformation(startRestartGroup, "98@4479L29");
        if (function1 != null) {
        }
        startRestartGroup.endReplaceableGroup();
        TriStateCheckbox(ToggleableState22, function0, companion, z4, obj5, obj4, startRestartGroup, (i6 & 896) | (i6 & 7168) | (i6 & 57344) | (i6 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        obj2 = obj5;
        z5 = z4;
        mutableInteractionSource2 = obj4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TriStateCheckbox(ToggleableState state, Function0<Unit> function0, Modifier modifier, boolean z, CheckboxColors checkboxColors, MutableInteractionSource mutableInteractionSource, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean z2;
        Object obj2;
        int i5;
        Object obj3;
        MutableInteractionSource mutableInteractionSource2;
        Object obj4;
        boolean z3;
        Object obj5;
        int i6;
        int i7;
        Modifier modifier2;
        Composer composer2;
        Modifier.Companion companion;
        Modifier.Companion companion2;
        Modifier modifier3;
        boolean z4;
        CheckboxColors checkboxColors2;
        MutableInteractionSource mutableInteractionSource3;
        int i8;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(-1608358065);
        ComposerKt.sourceInformation(startRestartGroup, "C(TriStateCheckbox)P(5,4,3,1)142@6643L8,143@6703L39,161@7271L412:Checkbox.kt#uh7d8r");
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
                if ((57344 & i) == 0) {
                    if ((i2 & 16) == 0) {
                        obj2 = checkboxColors;
                        if (startRestartGroup.changed(obj2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        obj2 = checkboxColors;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    obj2 = checkboxColors;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    obj3 = mutableInteractionSource;
                } else {
                    obj3 = mutableInteractionSource;
                    if ((458752 & i) == 0) {
                        i3 |= startRestartGroup.changed(obj3) ? 131072 : 65536;
                    }
                }
                if ((374491 & i3) == 74898 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                        Modifier.Companion companion3 = i9 != 0 ? Modifier.Companion : obj;
                        boolean z5 = i4 != 0 ? true : z2;
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            obj2 = CheckboxDefaults.INSTANCE.m1613colors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, startRestartGroup, 1572864, 63);
                        }
                        if (i5 != 0) {
                            startRestartGroup.startReplaceableGroup(-492369756);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                            Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == Composer.Companion.getEmpty()) {
                                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            startRestartGroup.endReplaceableGroup();
                            z3 = z5;
                            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
                            obj5 = obj2;
                            i6 = i3;
                            obj4 = companion3;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1608358065, i6, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:137)");
                            }
                            startRestartGroup.startReplaceableGroup(1797978260);
                            ComposerKt.sourceInformation(startRestartGroup, "153@7071L133");
                            if (function0 == null) {
                                i7 = i6;
                                modifier2 = obj4;
                                composer2 = startRestartGroup;
                                companion = ToggleableKt.m988triStateToggleableO2vRcR0(Modifier.Companion, state, mutableInteractionSource2, RippleKt.m1559rememberRipple9IZ8Weo(false, Dp.m5607constructorimpl(CheckboxTokens.INSTANCE.m2300getStateLayerSizeD9Ej5fM() / 2), 0L, startRestartGroup, 54, 4), z3, Role.m4917boximpl(Role.Companion.m4925getCheckboxo7Vup1c()), function0);
                            } else {
                                i7 = i6;
                                modifier2 = obj4;
                                composer2 = startRestartGroup;
                                companion = Modifier.Companion;
                            }
                            composer2.endReplaceableGroup();
                            if (function0 == null) {
                                companion2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.Companion);
                            } else {
                                companion2 = Modifier.Companion;
                            }
                            CheckboxImpl(z3, state, PaddingKt.m748padding3ABfNKs(modifier2.then(companion2).then(companion), CheckboxDefaultPadding), obj5, composer2, ((i7 >> 9) & 14) | ((i7 << 3) & 112) | ((i7 >> 3) & 7168));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            z4 = z3;
                            checkboxColors2 = obj5;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                            obj4 = companion3;
                            z3 = z5;
                            obj5 = obj2;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        obj4 = obj;
                        z3 = z2;
                        obj5 = obj2;
                        mutableInteractionSource2 = obj3;
                    }
                    i6 = i3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    startRestartGroup.startReplaceableGroup(1797978260);
                    ComposerKt.sourceInformation(startRestartGroup, "153@7071L133");
                    if (function0 == null) {
                    }
                    composer2.endReplaceableGroup();
                    if (function0 == null) {
                    }
                    CheckboxImpl(z3, state, PaddingKt.m748padding3ABfNKs(modifier2.then(companion2).then(companion), CheckboxDefaultPadding), obj5, composer2, ((i7 >> 9) & 14) | ((i7 << 3) & 112) | ((i7 >> 3) & 7168));
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    z4 = z3;
                    checkboxColors2 = obj5;
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = obj;
                    z4 = z2;
                    checkboxColors2 = obj2;
                    composer2 = startRestartGroup;
                    mutableInteractionSource3 = obj3;
                }
                ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                    return;
                }
                endRestartGroup.updateScope(new CheckboxKt$TriStateCheckbox$2(state, function0, modifier3, z4, checkboxColors2, mutableInteractionSource3, i, i2));
                return;
            }
            z2 = z;
            if ((57344 & i) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            if ((374491 & i3) == 74898) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
        }
        obj = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((57344 & i) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        if ((374491 & i3) == 74898) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
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
        Composer startRestartGroup = composer.startRestartGroup(2007131616);
        ComposerKt.sourceInformation(startRestartGroup, "C(CheckboxImpl)P(1,3,2)235@10358L23,236@10421L443,252@10923L458,267@11403L32,268@11464L21,269@11512L24,270@11566L27,275@11716L538,271@11598L656:Checkbox.kt#uh7d8r");
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
                ComposerKt.traceEventStart(2007131616, i10, -1, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:229)");
            }
            int i11 = i10 >> 3;
            int i12 = i11 & 14;
            Transition updateTransition = TransitionKt.updateTransition(toggleableState, (String) null, startRestartGroup, i12, 2);
            CheckboxKt$CheckboxImpl$checkDrawFraction$1 checkboxKt$CheckboxImpl$checkDrawFraction$1 = CheckboxKt$CheckboxImpl$checkDrawFraction$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
            ToggleableState toggleableState2 = (ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(1800065638);
            ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1800065638, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:244)");
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
                    startRestartGroup.startReplaceableGroup(1800065638);
                    ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#uh7d8r");
                    if (ComposerKt.isTraceInProgress()) {
                        i2 = i10;
                        c = 65535;
                    } else {
                        i2 = i10;
                        c = 65535;
                        ComposerKt.traceEventStart(1800065638, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:244)");
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
                            State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), checkboxKt$CheckboxImpl$checkDrawFraction$1.invoke((CheckboxKt$CheckboxImpl$checkDrawFraction$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                            startRestartGroup.endReplaceableGroup();
                            startRestartGroup.endReplaceableGroup();
                            CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 = CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1.INSTANCE;
                            startRestartGroup.startReplaceableGroup(-1338768149);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
                            TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                            startRestartGroup.startReplaceableGroup(-142660079);
                            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                            ToggleableState toggleableState4 = (ToggleableState) updateTransition.getCurrentState();
                            startRestartGroup.startReplaceableGroup(-1426969489);
                            ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1426969489, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:260)");
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
                            startRestartGroup.startReplaceableGroup(-1426969489);
                            ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#uh7d8r");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1426969489, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:260)");
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
                            State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1.invoke((CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
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
                            State<Color> checkmarkColor$material3_release = checkboxColors.checkmarkColor$material3_release(toggleableState, startRestartGroup, i12 | ((i15 >> 6) & 112));
                            int i17 = (i11 & 896) | (i15 & 14) | (i15 & 112);
                            State<Color> boxColor$material3_release = checkboxColors.boxColor$material3_release(z, toggleableState, startRestartGroup, i17);
                            State<Color> borderColor$material3_release = checkboxColors.borderColor$material3_release(z, toggleableState, startRestartGroup, i17);
                            Modifier m787requiredSize3ABfNKs = SizeKt.m787requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.Companion.getCenter(), false, i14, null), CheckboxSize);
                            Object[] objArr = new Object[6];
                            objArr[0] = boxColor$material3_release;
                            objArr[1] = borderColor$material3_release;
                            objArr[i14] = checkmarkColor$material3_release;
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
                                rememberedValue2 = new CheckboxKt$CheckboxImpl$1$1(boxColor$material3_release, borderColor$material3_release, checkmarkColor$material3_release, createTransitionAnimation, createTransitionAnimation2, checkDrawingCache);
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
                    State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), checkboxKt$CheckboxImpl$checkDrawFraction$1.invoke((CheckboxKt$CheckboxImpl$checkDrawFraction$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$12 = CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1.INSTANCE;
                    startRestartGroup.startReplaceableGroup(-1338768149);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
                    TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                    startRestartGroup.startReplaceableGroup(-142660079);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                    ToggleableState toggleableState42 = (ToggleableState) updateTransition.getCurrentState();
                    startRestartGroup.startReplaceableGroup(-1426969489);
                    ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#uh7d8r");
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
                    startRestartGroup.startReplaceableGroup(-1426969489);
                    ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#uh7d8r");
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
                    State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition, valueOf22, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$12.invoke((CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter22, "FloatAnimation", startRestartGroup, 0);
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.endReplaceableGroup();
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                    }
                    startRestartGroup.endReplaceableGroup();
                    CheckDrawingCache checkDrawingCache2 = (CheckDrawingCache) rememberedValue;
                    State<Color> checkmarkColor$material3_release2 = checkboxColors.checkmarkColor$material3_release(toggleableState, startRestartGroup, i12 | ((i152 >> 6) & 112));
                    int i172 = (i11 & 896) | (i152 & 14) | (i152 & 112);
                    State<Color> boxColor$material3_release2 = checkboxColors.boxColor$material3_release(z, toggleableState, startRestartGroup, i172);
                    State<Color> borderColor$material3_release2 = checkboxColors.borderColor$material3_release(z, toggleableState, startRestartGroup, i172);
                    Modifier m787requiredSize3ABfNKs2 = SizeKt.m787requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.Companion.getCenter(), false, i142, null), CheckboxSize);
                    Object[] objArr2 = new Object[6];
                    objArr2[0] = boxColor$material3_release2;
                    objArr2[1] = borderColor$material3_release2;
                    objArr2[i142] = checkmarkColor$material3_release2;
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
                    rememberedValue2 = new CheckboxKt$CheckboxImpl$1$1(boxColor$material3_release2, borderColor$material3_release2, checkmarkColor$material3_release2, createTransitionAnimation3, createTransitionAnimation22, checkDrawingCache2);
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
            startRestartGroup.startReplaceableGroup(1800065638);
            ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#uh7d8r");
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
            State createTransitionAnimation32 = TransitionKt.createTransitionAnimation(updateTransition, valueOf3, Float.valueOf(f2), checkboxKt$CheckboxImpl$checkDrawFraction$1.invoke((CheckboxKt$CheckboxImpl$checkDrawFraction$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$122 = CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1.INSTANCE;
            startRestartGroup.startReplaceableGroup(-1338768149);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
            TwoWayConverter<Float, AnimationVector1D> vectorConverter222 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
            startRestartGroup.startReplaceableGroup(-142660079);
            ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
            ToggleableState toggleableState422 = (ToggleableState) updateTransition.getCurrentState();
            startRestartGroup.startReplaceableGroup(-1426969489);
            ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#uh7d8r");
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
            startRestartGroup.startReplaceableGroup(-1426969489);
            ComposerKt.sourceInformation(startRestartGroup, "C:Checkbox.kt#uh7d8r");
            if (ComposerKt.isTraceInProgress()) {
            }
            i7 = WhenMappings.$EnumSwitchMapping$0[toggleableState522.ordinal()];
            if (i7 != 1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.endReplaceableGroup();
            int i1622 = i6;
            State createTransitionAnimation222 = TransitionKt.createTransitionAnimation(updateTransition, valueOf222, Float.valueOf(f4), checkboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$122.invoke((CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter222, "FloatAnimation", startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            CheckDrawingCache checkDrawingCache22 = (CheckDrawingCache) rememberedValue;
            State<Color> checkmarkColor$material3_release22 = checkboxColors.checkmarkColor$material3_release(toggleableState, startRestartGroup, i12 | ((i1522 >> 6) & 112));
            int i1722 = (i11 & 896) | (i1522 & 14) | (i1522 & 112);
            State<Color> boxColor$material3_release22 = checkboxColors.boxColor$material3_release(z, toggleableState, startRestartGroup, i1722);
            State<Color> borderColor$material3_release22 = checkboxColors.borderColor$material3_release(z, toggleableState, startRestartGroup, i1722);
            Modifier m787requiredSize3ABfNKs22 = SizeKt.m787requiredSize3ABfNKs(SizeKt.wrapContentSize$default(modifier, Alignment.Companion.getCenter(), false, i1422, null), CheckboxSize);
            Object[] objArr22 = new Object[6];
            objArr22[0] = boxColor$material3_release22;
            objArr22[1] = borderColor$material3_release22;
            objArr22[i1422] = checkmarkColor$material3_release22;
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
            rememberedValue2 = new CheckboxKt$CheckboxImpl$1$1(boxColor$material3_release22, borderColor$material3_release22, checkmarkColor$material3_release22, createTransitionAnimation32, createTransitionAnimation222, checkDrawingCache22);
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
    public static final void m1616drawBox1wkBAMs(DrawScope drawScope, long j, long j2, float f, float f2) {
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
    public static final void m1617drawCheck3IgeMak(DrawScope drawScope, long j, float f, float f2, float f3, CheckDrawingCache checkDrawingCache) {
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

    static {
        float f = 2;
        CheckboxDefaultPadding = Dp.m5607constructorimpl(f);
        StrokeWidth = Dp.m5607constructorimpl(f);
        RadiusSize = Dp.m5607constructorimpl(f);
    }
}
