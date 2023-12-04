package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.google.android.exoplayer2.C;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.onboarding.steps.view.common.SelectButtonUiParams;
import com.ifriend.presentation.features.onboarding.steps.view.common.SelectButtonWithImageUiParams;
import com.ifriend.ui.components.MultipleEventsCutterKt;
import com.ifriend.ui.components.modifier.ColoredShadowModifierKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: OnboardingButtonComponents.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\u001a\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0018\u001a/\u0010\u0019\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u000b0\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001a#\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001c2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013H\u0003¢\u0006\u0002\u0010!\u001a?\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\"\u001a\u00020#H\u0003¢\u0006\u0002\u0010$\u001a-\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010(\u001a=\u0010%\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007¢\u0006\u0002\u0010+\u001a\r\u0010,\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0018\u001a\r\u0010-\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0018\u001a\u0018\u0010.\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0002\u0010/\u001a\u0018\u00100\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0002\u0010/\u001a\u0018\u00101\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0002\u0010/\u001a\u0018\u00102\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0002\u0010/\u001a\u001c\u00103\u001a\u00020\u0001*\u00020#2\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0002\u00104\u001a\u001c\u00105\u001a\u00020\u0001*\u00020#2\u0006\u0010\f\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0002\u00104\u001a\f\u00106\u001a\u000207*\u00020*H\u0003\u001a\f\u00108\u001a\u000209*\u00020*H\u0002\u001a\u001b\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020<0;*\u00020*H\u0002ø\u0001\u0000\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\t\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006=²\u0006\n\u0010>\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010?\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010@\u001a\u00020AX\u008a\u0084\u0002²\u0006\n\u0010>\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010?\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010@\u001a\u00020AX\u008a\u0084\u0002²\u0006\n\u0010>\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010?\u001a\u00020\u0001X\u008a\u0084\u0002"}, d2 = {"primaryBackground", "Landroidx/compose/ui/graphics/Color;", "J", "primaryButtonTextColor", "regularBackground", "regularButtonTextColor", "secondaryBackground", "secondaryButtonTextColor", "selectedBackground", "selectedButtonTextColor", "ButtonsPreview", "", "selected", "", "(ZLandroidx/compose/runtime/Composer;I)V", "ChipButton", "text", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChipButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "OnboardingOptionsSelector", "buttons", "", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams;", "Lkotlin/Function1;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "OnboardingSelectButton", "selectButtonUiParams", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "style", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams$Style;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams$Style;Landroidx/compose/runtime/Composer;II)V", "OnboardingSquareSelectButton", "selectButton", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonWithImageUiParams;", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonWithImageUiParams;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "image", "Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonWithImageUiParams$Image;", "(Ljava/lang/String;Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonWithImageUiParams$Image;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewOnboardingSelectButton", "SquareButtonsPreview", "getChipButtonBackground", "(Z)J", "getChipButtonTextColor", "getSquareButtonBackground", "getSquareButtonTextColor", "getButtonBackground", "(Lcom/ifriend/presentation/features/onboarding/steps/view/common/SelectButtonUiParams$Style;Z)J", "getButtonTextColor", "getDrawableRes", "", "getImagePaddings", "Landroidx/compose/foundation/layout/PaddingValues;", "getImageSize", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/Dp;", "presentation_release", "buttonTextColor", "buttonColor", "shadowAlpha", ""}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingButtonComponentsKt {
    private static final long selectedButtonTextColor = ColorKt.Color(4284640478L);
    private static final long primaryButtonTextColor = Color.Companion.m3328getWhite0d7_KjU();
    private static final long secondaryButtonTextColor = ColorKt.Color(4289967027L);
    private static final long regularButtonTextColor = Color.Companion.m3328getWhite0d7_KjU();
    private static final long selectedBackground = Color.Companion.m3328getWhite0d7_KjU();
    private static final long regularBackground = Color.m3290copywmQWz5c$default(ColorKt.Color(4291811548L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
    private static final long secondaryBackground = Color.m3290copywmQWz5c$default(ColorKt.Color(4291811548L), 0.1f, 0.0f, 0.0f, 0.0f, 14, null);
    private static final long primaryBackground = Color.m3290copywmQWz5c$default(ColorKt.Color(4291811548L), 0.25f, 0.0f, 0.0f, 0.0f, 14, null);

    /* compiled from: OnboardingButtonComponents.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SelectButtonUiParams.Style.values().length];
            try {
                iArr[SelectButtonUiParams.Style.Regular.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectButtonUiParams.Style.Primary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectButtonUiParams.Style.Secondary.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SelectButtonWithImageUiParams.Image.values().length];
            try {
                iArr2[SelectButtonWithImageUiParams.Image.Fire.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SelectButtonWithImageUiParams.Image.Lips.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[SelectButtonWithImageUiParams.Image.Balloon.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[SelectButtonWithImageUiParams.Image.Sparkles.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final long getButtonTextColor(SelectButtonUiParams.Style style, boolean z) {
        if (z) {
            return selectedButtonTextColor;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return secondaryButtonTextColor;
                }
                throw new NoWhenBranchMatchedException();
            }
            return primaryButtonTextColor;
        }
        return regularButtonTextColor;
    }

    private static final long getButtonBackground(SelectButtonUiParams.Style style, boolean z) {
        if (z) {
            return selectedBackground;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return secondaryBackground;
                }
                throw new NoWhenBranchMatchedException();
            }
            return primaryBackground;
        }
        return regularBackground;
    }

    private static final long getSquareButtonTextColor(boolean z) {
        if (z) {
            return selectedButtonTextColor;
        }
        return regularButtonTextColor;
    }

    private static final long getSquareButtonBackground(boolean z) {
        if (z) {
            return selectedBackground;
        }
        return regularBackground;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getDrawableRes(SelectButtonWithImageUiParams.Image image) {
        int i = WhenMappings.$EnumSwitchMapping$1[image.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return R.drawable.onboarding_image_sparkles;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return R.drawable.onboarding_image_balloon;
            }
            return R.drawable.onboarding_image_lips;
        }
        return R.drawable.onboarding_image_fire;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair<Dp, Dp> getImageSize(SelectButtonWithImageUiParams.Image image) {
        int i = WhenMappings.$EnumSwitchMapping$1[image.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return TuplesKt.to(Dp.m5605boximpl(Dp.m5607constructorimpl(55)), Dp.m5605boximpl(Dp.m5607constructorimpl(61)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return TuplesKt.to(Dp.m5605boximpl(Dp.m5607constructorimpl(60)), Dp.m5605boximpl(Dp.m5607constructorimpl(75)));
            }
            return TuplesKt.to(Dp.m5605boximpl(Dp.m5607constructorimpl(125)), Dp.m5605boximpl(Dp.m5607constructorimpl(100)));
        }
        return TuplesKt.to(Dp.m5605boximpl(Dp.m5607constructorimpl(55)), Dp.m5605boximpl(Dp.m5607constructorimpl(76)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaddingValues getImagePaddings(SelectButtonWithImageUiParams.Image image) {
        int i = WhenMappings.$EnumSwitchMapping$1[image.ordinal()];
        if (i == 1) {
            return new PaddingValues.Absolute(0.0f, 0.0f, Dp.m5607constructorimpl(14), Dp.m5607constructorimpl(20), 3, null);
        } else if (i == 2) {
            float f = 0;
            return new PaddingValues.Absolute(0.0f, 0.0f, Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f), 3, null);
        } else if (i == 3) {
            return new PaddingValues.Absolute(0.0f, 0.0f, Dp.m5607constructorimpl(14), Dp.m5607constructorimpl(20), 3, null);
        } else if (i == 4) {
            return new PaddingValues.Absolute(0.0f, 0.0f, Dp.m5607constructorimpl(14), Dp.m5607constructorimpl(20), 3, null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final long getChipButtonTextColor(boolean z) {
        if (z) {
            return selectedButtonTextColor;
        }
        return regularButtonTextColor;
    }

    private static final long getChipButtonBackground(boolean z) {
        if (z) {
            return selectedBackground;
        }
        return regularBackground;
    }

    public static final void OnboardingOptionsSelector(List<SelectButtonUiParams> buttons, Function1<? super SelectButtonUiParams, Unit> onClick, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1711280283);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingOptionsSelector)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1711280283, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingOptionsSelector (OnboardingButtonComponents.kt:175)");
        }
        MultipleEventsCutterKt.multipleEventsCutter(ComposableLambdaKt.composableLambda(startRestartGroup, -1925074325, true, new OnboardingButtonComponentsKt$OnboardingOptionsSelector$1(buttons, onClick)), startRestartGroup, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OnboardingButtonComponentsKt$OnboardingOptionsSelector$2(buttons, onClick, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OnboardingSelectButton(SelectButtonUiParams selectButtonUiParams, Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1124111775);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(selectButtonUiParams) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1124111775, i2, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingSelectButton (OnboardingButtonComponents.kt:197)");
            }
            OnboardingSelectButton(selectButtonUiParams.getText(), selectButtonUiParams.getSelected(), function0, null, selectButtonUiParams.getStyle(), startRestartGroup, (i2 << 3) & 896, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OnboardingButtonComponentsKt$OnboardingSelectButton$1(selectButtonUiParams, function0, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingSelectButton(String str, boolean z, Function0<Unit> function0, Modifier modifier, SelectButtonUiParams.Style style, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        Object obj2;
        Modifier m7044coloredShadowPRYyx80;
        Modifier modifier2;
        SelectButtonUiParams.Style style2;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-626507898);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                obj = modifier;
                i3 |= startRestartGroup.changed(obj) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    obj2 = style;
                    i3 |= startRestartGroup.changed(obj2) ? 16384 : 8192;
                    if ((46811 & i3) == 9362 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i4 == 0 ? Modifier.Companion : obj;
                        SelectButtonUiParams.Style style3 = i5 == 0 ? SelectButtonUiParams.Style.Regular : obj2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-626507898, i3, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingSelectButton (OnboardingButtonComponents.kt:213)");
                        }
                        SelectButtonUiParams.Style style4 = style3;
                        State<Color> m329animateColorAsStateeuL9pac = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getButtonTextColor(style3, z), null, "OnboardingSelectButton::buttonTextColor", null, startRestartGroup, 384, 10);
                        State<Color> m329animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getButtonBackground(style4, z), null, "OnboardingSelectButton::buttonColor", null, startRestartGroup, 384, 10);
                        float f = 15;
                        m7044coloredShadowPRYyx80 = ColoredShadowModifierKt.m7044coloredShadowPRYyx80(SizeKt.fillMaxWidth$default(SizeKt.m780defaultMinSizeVpY3zN4$default(companion, 0.0f, Dp.m5607constructorimpl(65), 1, null), 0.0f, 1, null), Color.Companion.m3328getWhite0d7_KjU(), (r17 & 2) != 0 ? 0.2f : OnboardingSelectButton$lambda$2(AnimateAsStateKt.animateFloatAsState(!z ? 0.7f : 0.0f, null, 0.0f, "OnboardingSelectButton::shadowAlpha", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 22)), (r17 & 4) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f), (r17 & 8) != 0 ? Dp.m5607constructorimpl(20) : Dp.m5607constructorimpl(10), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
                        Modifier modifier3 = companion;
                        ButtonKt.Button(function0, m7044coloredShadowPRYyx80, false, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(f)), ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(OnboardingSelectButton$lambda$1(m329animateColorAsStateeuL9pac2), OnboardingSelectButton$lambda$0(m329animateColorAsStateeuL9pac), OnboardingSelectButton$lambda$1(m329animateColorAsStateeuL9pac2), OnboardingSelectButton$lambda$0(m329animateColorAsStateeuL9pac), startRestartGroup, ButtonDefaults.$stable << 12, 0), null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 156888950, true, new OnboardingButtonComponentsKt$OnboardingSelectButton$2(str, i3, m329animateColorAsStateeuL9pac)), startRestartGroup, ((i3 >> 6) & 14) | C.ENCODING_PCM_32BIT, 484);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        style2 = style4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier2 = obj;
                        style2 = obj2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        return;
                    }
                    endRestartGroup.updateScope(new OnboardingButtonComponentsKt$OnboardingSelectButton$3(str, z, function0, modifier2, style2, i, i2));
                    return;
                }
                obj2 = style;
                if ((46811 & i3) == 9362) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                SelectButtonUiParams.Style style42 = style3;
                State<Color> m329animateColorAsStateeuL9pac3 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getButtonTextColor(style3, z), null, "OnboardingSelectButton::buttonTextColor", null, startRestartGroup, 384, 10);
                State<Color> m329animateColorAsStateeuL9pac22 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getButtonBackground(style42, z), null, "OnboardingSelectButton::buttonColor", null, startRestartGroup, 384, 10);
                float f2 = 15;
                m7044coloredShadowPRYyx80 = ColoredShadowModifierKt.m7044coloredShadowPRYyx80(SizeKt.fillMaxWidth$default(SizeKt.m780defaultMinSizeVpY3zN4$default(companion, 0.0f, Dp.m5607constructorimpl(65), 1, null), 0.0f, 1, null), Color.Companion.m3328getWhite0d7_KjU(), (r17 & 2) != 0 ? 0.2f : OnboardingSelectButton$lambda$2(AnimateAsStateKt.animateFloatAsState(!z ? 0.7f : 0.0f, null, 0.0f, "OnboardingSelectButton::shadowAlpha", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 22)), (r17 & 4) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f2), (r17 & 8) != 0 ? Dp.m5607constructorimpl(20) : Dp.m5607constructorimpl(10), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
                Modifier modifier32 = companion;
                ButtonKt.Button(function0, m7044coloredShadowPRYyx80, false, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(f2)), ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(OnboardingSelectButton$lambda$1(m329animateColorAsStateeuL9pac22), OnboardingSelectButton$lambda$0(m329animateColorAsStateeuL9pac3), OnboardingSelectButton$lambda$1(m329animateColorAsStateeuL9pac22), OnboardingSelectButton$lambda$0(m329animateColorAsStateeuL9pac3), startRestartGroup, ButtonDefaults.$stable << 12, 0), null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 156888950, true, new OnboardingButtonComponentsKt$OnboardingSelectButton$2(str, i3, m329animateColorAsStateeuL9pac3)), startRestartGroup, ((i3 >> 6) & 14) | C.ENCODING_PCM_32BIT, 484);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier32;
                style2 = style42;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            obj = modifier;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            obj2 = style;
            if ((46811 & i3) == 9362) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            SelectButtonUiParams.Style style422 = style3;
            State<Color> m329animateColorAsStateeuL9pac32 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getButtonTextColor(style3, z), null, "OnboardingSelectButton::buttonTextColor", null, startRestartGroup, 384, 10);
            State<Color> m329animateColorAsStateeuL9pac222 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getButtonBackground(style422, z), null, "OnboardingSelectButton::buttonColor", null, startRestartGroup, 384, 10);
            float f22 = 15;
            m7044coloredShadowPRYyx80 = ColoredShadowModifierKt.m7044coloredShadowPRYyx80(SizeKt.fillMaxWidth$default(SizeKt.m780defaultMinSizeVpY3zN4$default(companion, 0.0f, Dp.m5607constructorimpl(65), 1, null), 0.0f, 1, null), Color.Companion.m3328getWhite0d7_KjU(), (r17 & 2) != 0 ? 0.2f : OnboardingSelectButton$lambda$2(AnimateAsStateKt.animateFloatAsState(!z ? 0.7f : 0.0f, null, 0.0f, "OnboardingSelectButton::shadowAlpha", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 22)), (r17 & 4) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f22), (r17 & 8) != 0 ? Dp.m5607constructorimpl(20) : Dp.m5607constructorimpl(10), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
            Modifier modifier322 = companion;
            ButtonKt.Button(function0, m7044coloredShadowPRYyx80, false, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(f22)), ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(OnboardingSelectButton$lambda$1(m329animateColorAsStateeuL9pac222), OnboardingSelectButton$lambda$0(m329animateColorAsStateeuL9pac32), OnboardingSelectButton$lambda$1(m329animateColorAsStateeuL9pac222), OnboardingSelectButton$lambda$0(m329animateColorAsStateeuL9pac32), startRestartGroup, ButtonDefaults.$stable << 12, 0), null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 156888950, true, new OnboardingButtonComponentsKt$OnboardingSelectButton$2(str, i3, m329animateColorAsStateeuL9pac32)), startRestartGroup, ((i3 >> 6) & 14) | C.ENCODING_PCM_32BIT, 484);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier2 = modifier322;
            style2 = style422;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        obj = modifier;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        obj2 = style;
        if ((46811 & i3) == 9362) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        SelectButtonUiParams.Style style4222 = style3;
        State<Color> m329animateColorAsStateeuL9pac322 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getButtonTextColor(style3, z), null, "OnboardingSelectButton::buttonTextColor", null, startRestartGroup, 384, 10);
        State<Color> m329animateColorAsStateeuL9pac2222 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getButtonBackground(style4222, z), null, "OnboardingSelectButton::buttonColor", null, startRestartGroup, 384, 10);
        float f222 = 15;
        m7044coloredShadowPRYyx80 = ColoredShadowModifierKt.m7044coloredShadowPRYyx80(SizeKt.fillMaxWidth$default(SizeKt.m780defaultMinSizeVpY3zN4$default(companion, 0.0f, Dp.m5607constructorimpl(65), 1, null), 0.0f, 1, null), Color.Companion.m3328getWhite0d7_KjU(), (r17 & 2) != 0 ? 0.2f : OnboardingSelectButton$lambda$2(AnimateAsStateKt.animateFloatAsState(!z ? 0.7f : 0.0f, null, 0.0f, "OnboardingSelectButton::shadowAlpha", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 22)), (r17 & 4) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f222), (r17 & 8) != 0 ? Dp.m5607constructorimpl(20) : Dp.m5607constructorimpl(10), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
        Modifier modifier3222 = companion;
        ButtonKt.Button(function0, m7044coloredShadowPRYyx80, false, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(f222)), ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(OnboardingSelectButton$lambda$1(m329animateColorAsStateeuL9pac2222), OnboardingSelectButton$lambda$0(m329animateColorAsStateeuL9pac322), OnboardingSelectButton$lambda$1(m329animateColorAsStateeuL9pac2222), OnboardingSelectButton$lambda$0(m329animateColorAsStateeuL9pac322), startRestartGroup, ButtonDefaults.$stable << 12, 0), null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 156888950, true, new OnboardingButtonComponentsKt$OnboardingSelectButton$2(str, i3, m329animateColorAsStateeuL9pac322)), startRestartGroup, ((i3 >> 6) & 14) | C.ENCODING_PCM_32BIT, 484);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3222;
        style2 = style4222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void OnboardingSquareSelectButton(SelectButtonWithImageUiParams selectButton, Function0<Unit> onClick, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(selectButton, "selectButton");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1829560902);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingSquareSelectButton)P(2,1)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(selectButton) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1829560902, i3, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingSquareSelectButton (OnboardingButtonComponents.kt:265)");
            }
            int i5 = i3 << 6;
            OnboardingSquareSelectButton(selectButton.getText(), selectButton.getImage(), selectButton.getSelected(), onClick, modifier, startRestartGroup, (i5 & 7168) | (i5 & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OnboardingButtonComponentsKt$OnboardingSquareSelectButton$1(selectButton, onClick, modifier2, i, i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OnboardingSquareSelectButton(String text, SelectButtonWithImageUiParams.Image image, boolean z, Function0<Unit> onClick, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Modifier m7044coloredShadowPRYyx80;
        Composer composer2;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1530441853);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingSquareSelectButton)P(4!1,3,2)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(image) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 16384 : 8192;
            i4 = i3;
            if ((46811 & i4) == 9362 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i5 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1530441853, i4, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingSquareSelectButton (OnboardingButtonComponents.kt:282)");
                }
                State<Color> m329animateColorAsStateeuL9pac = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getSquareButtonTextColor(z), null, "OnboardingSquareSelectButton::buttonTextColor", null, startRestartGroup, 384, 10);
                State<Color> m329animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getSquareButtonBackground(z), null, "OnboardingSquareSelectButton::buttonColor", null, startRestartGroup, 384, 10);
                float f = 15;
                m7044coloredShadowPRYyx80 = ColoredShadowModifierKt.m7044coloredShadowPRYyx80(AspectRatioKt.aspectRatio(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.93167704f, true), Color.Companion.m3328getWhite0d7_KjU(), (r17 & 2) != 0 ? 0.2f : OnboardingSquareSelectButton$lambda$5(AnimateAsStateKt.animateFloatAsState(!z ? 0.7f : 0.0f, null, 0.0f, "OnboardingSquareSelectButton::shadowAlpha", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 22)), (r17 & 4) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f), (r17 & 8) != 0 ? Dp.m5607constructorimpl(20) : Dp.m5607constructorimpl(10), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
                Modifier modifier3 = companion;
                composer2 = startRestartGroup;
                ButtonKt.Button(onClick, m7044coloredShadowPRYyx80, false, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(f)), ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(OnboardingSquareSelectButton$lambda$4(m329animateColorAsStateeuL9pac2), OnboardingSquareSelectButton$lambda$3(m329animateColorAsStateeuL9pac), OnboardingSquareSelectButton$lambda$4(m329animateColorAsStateeuL9pac2), OnboardingSquareSelectButton$lambda$3(m329animateColorAsStateeuL9pac), startRestartGroup, ButtonDefaults.$stable << 12, 0), null, null, PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)), null, ComposableLambdaKt.composableLambda(startRestartGroup, -75322259, true, new OnboardingButtonComponentsKt$OnboardingSquareSelectButton$2(companion, text, i4, image, m329animateColorAsStateeuL9pac)), composer2, ((i4 >> 9) & 14) | 817889280, 356);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = obj;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new OnboardingButtonComponentsKt$OnboardingSquareSelectButton$3(text, image, z, onClick, modifier2, i, i2));
            return;
        }
        obj = modifier;
        i4 = i3;
        if ((46811 & i4) == 9362) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        State<Color> m329animateColorAsStateeuL9pac3 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getSquareButtonTextColor(z), null, "OnboardingSquareSelectButton::buttonTextColor", null, startRestartGroup, 384, 10);
        State<Color> m329animateColorAsStateeuL9pac22 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getSquareButtonBackground(z), null, "OnboardingSquareSelectButton::buttonColor", null, startRestartGroup, 384, 10);
        float f2 = 15;
        m7044coloredShadowPRYyx80 = ColoredShadowModifierKt.m7044coloredShadowPRYyx80(AspectRatioKt.aspectRatio(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), 0.93167704f, true), Color.Companion.m3328getWhite0d7_KjU(), (r17 & 2) != 0 ? 0.2f : OnboardingSquareSelectButton$lambda$5(AnimateAsStateKt.animateFloatAsState(!z ? 0.7f : 0.0f, null, 0.0f, "OnboardingSquareSelectButton::shadowAlpha", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 22)), (r17 & 4) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f2), (r17 & 8) != 0 ? Dp.m5607constructorimpl(20) : Dp.m5607constructorimpl(10), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
        Modifier modifier32 = companion;
        composer2 = startRestartGroup;
        ButtonKt.Button(onClick, m7044coloredShadowPRYyx80, false, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(f2)), ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(OnboardingSquareSelectButton$lambda$4(m329animateColorAsStateeuL9pac22), OnboardingSquareSelectButton$lambda$3(m329animateColorAsStateeuL9pac3), OnboardingSquareSelectButton$lambda$4(m329animateColorAsStateeuL9pac22), OnboardingSquareSelectButton$lambda$3(m329animateColorAsStateeuL9pac3), startRestartGroup, ButtonDefaults.$stable << 12, 0), null, null, PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)), null, ComposableLambdaKt.composableLambda(startRestartGroup, -75322259, true, new OnboardingButtonComponentsKt$OnboardingSquareSelectButton$2(companion, text, i4, image, m329animateColorAsStateeuL9pac3)), composer2, ((i4 >> 9) & 14) | 817889280, 356);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier32;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChipButton(String text, boolean z, Function0<Unit> onClick, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        Composer composer2;
        Modifier modifier2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1490469462);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChipButton)P(3,2,1)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
        } else if ((i & 7168) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 2048 : 1024;
            i4 = i3;
            if ((i4 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i5 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1490469462, i4, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.ChipButton (OnboardingButtonComponents.kt:357)");
                }
                Modifier modifier3 = companion;
                State<Color> m329animateColorAsStateeuL9pac = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getChipButtonTextColor(z), null, "ChipButton::buttonTextColor", null, startRestartGroup, 384, 10);
                State<Color> m329animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getChipButtonBackground(z), null, "ChipButton::buttonColor", null, startRestartGroup, 384, 10);
                Modifier m748padding3ABfNKs = PaddingKt.m748padding3ABfNKs(SizeKt.m781height3ABfNKs(modifier3, Dp.m5607constructorimpl(35)), Dp.m5607constructorimpl(0));
                ButtonColors m1595buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(ChipButton$lambda$7(m329animateColorAsStateeuL9pac2), ChipButton$lambda$6(m329animateColorAsStateeuL9pac), ChipButton$lambda$7(m329animateColorAsStateeuL9pac2), ChipButton$lambda$6(m329animateColorAsStateeuL9pac), startRestartGroup, ButtonDefaults.$stable << 12, 0);
                float f = 15;
                composer2 = startRestartGroup;
                ButtonKt.Button(onClick, m748padding3ABfNKs, false, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(f)), m1595buttonColorsro_MJ88, null, null, PaddingKt.m743PaddingValuesYgX7TsA$default(Dp.m5607constructorimpl(f), 0.0f, 2, null), null, ComposableLambdaKt.composableLambda(composer2, -188117434, true, new OnboardingButtonComponentsKt$ChipButton$1(text, i4, m329animateColorAsStateeuL9pac)), composer2, ((i4 >> 6) & 14) | 817889280, 356);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier2 = obj;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new OnboardingButtonComponentsKt$ChipButton$2(text, z, onClick, modifier2, i, i2));
            return;
        }
        obj = modifier;
        i4 = i3;
        if ((i4 & 5851) == 1170) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier32 = companion;
        State<Color> m329animateColorAsStateeuL9pac3 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getChipButtonTextColor(z), null, "ChipButton::buttonTextColor", null, startRestartGroup, 384, 10);
        State<Color> m329animateColorAsStateeuL9pac22 = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(getChipButtonBackground(z), null, "ChipButton::buttonColor", null, startRestartGroup, 384, 10);
        Modifier m748padding3ABfNKs2 = PaddingKt.m748padding3ABfNKs(SizeKt.m781height3ABfNKs(modifier32, Dp.m5607constructorimpl(35)), Dp.m5607constructorimpl(0));
        ButtonColors m1595buttonColorsro_MJ882 = ButtonDefaults.INSTANCE.m1595buttonColorsro_MJ88(ChipButton$lambda$7(m329animateColorAsStateeuL9pac22), ChipButton$lambda$6(m329animateColorAsStateeuL9pac3), ChipButton$lambda$7(m329animateColorAsStateeuL9pac22), ChipButton$lambda$6(m329animateColorAsStateeuL9pac3), startRestartGroup, ButtonDefaults.$stable << 12, 0);
        float f2 = 15;
        composer2 = startRestartGroup;
        ButtonKt.Button(onClick, m748padding3ABfNKs2, false, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(f2)), m1595buttonColorsro_MJ882, null, null, PaddingKt.m743PaddingValuesYgX7TsA$default(Dp.m5607constructorimpl(f2), 0.0f, 2, null), null, ComposableLambdaKt.composableLambda(composer2, -188117434, true, new OnboardingButtonComponentsKt$ChipButton$1(text, i4, m329animateColorAsStateeuL9pac3)), composer2, ((i4 >> 6) & 14) | 817889280, 356);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier32;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void PreviewOnboardingSelectButton(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1403582335);
        ComposerKt.sourceInformation(startRestartGroup, "C(PreviewOnboardingSelectButton)");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1403582335, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.PreviewOnboardingSelectButton (OnboardingButtonComponents.kt:399)");
            }
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ButtonsPreview(true, startRestartGroup, 6);
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(32)), startRestartGroup, 6);
            ButtonsPreview(false, startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OnboardingButtonComponentsKt$PreviewOnboardingSelectButton$2(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ButtonsPreview(boolean z, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1907833361);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1907833361, i2, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.ButtonsPreview (OnboardingButtonComponents.kt:410)");
            }
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((i2 << 3) & 112) | 24960;
            OnboardingSelectButton("Regular " + z, z, OnboardingButtonComponentsKt$ButtonsPreview$1$1.INSTANCE, null, SelectButtonUiParams.Style.Regular, startRestartGroup, i3, 8);
            float f = (float) 32;
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(f)), startRestartGroup, 6);
            OnboardingSelectButton("Primary " + z, z, OnboardingButtonComponentsKt$ButtonsPreview$1$2.INSTANCE, null, SelectButtonUiParams.Style.Primary, startRestartGroup, i3, 8);
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(f)), startRestartGroup, 6);
            OnboardingSelectButton("Secondary " + z, z, OnboardingButtonComponentsKt$ButtonsPreview$1$3.INSTANCE, null, SelectButtonUiParams.Style.Secondary, startRestartGroup, i3, 8);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OnboardingButtonComponentsKt$ButtonsPreview$2(z, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SquareButtonsPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(1400078638);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1400078638, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.SquareButtonsPreview (OnboardingButtonComponents.kt:437)");
            }
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            OnboardingSquareSelectButton("Button", SelectButtonWithImageUiParams.Image.Balloon, true, OnboardingButtonComponentsKt$SquareButtonsPreview$1$1.INSTANCE, null, startRestartGroup, 3510, 16);
            float f = 32;
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(f)), startRestartGroup, 6);
            OnboardingSquareSelectButton("Button", SelectButtonWithImageUiParams.Image.Sparkles, false, OnboardingButtonComponentsKt$SquareButtonsPreview$1$2.INSTANCE, null, startRestartGroup, 3510, 16);
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(f)), startRestartGroup, 6);
            OnboardingSquareSelectButton("Button", SelectButtonWithImageUiParams.Image.Fire, false, OnboardingButtonComponentsKt$SquareButtonsPreview$1$3.INSTANCE, null, startRestartGroup, 3510, 16);
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(f)), startRestartGroup, 6);
            OnboardingSquareSelectButton("Button", SelectButtonWithImageUiParams.Image.Lips, false, OnboardingButtonComponentsKt$SquareButtonsPreview$1$4.INSTANCE, null, startRestartGroup, 3510, 16);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OnboardingButtonComponentsKt$SquareButtonsPreview$2(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChipButtonPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2139412136);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2139412136, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.ChipButtonPreview (OnboardingButtonComponents.kt:471)");
            }
            startRestartGroup.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ChipButton("Button", true, OnboardingButtonComponentsKt$ChipButtonPreview$1$1.INSTANCE, null, startRestartGroup, 438, 8);
            ChipButton("Button", false, OnboardingButtonComponentsKt$ChipButtonPreview$1$2.INSTANCE, null, startRestartGroup, 438, 8);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OnboardingButtonComponentsKt$ChipButtonPreview$2(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OnboardingSelectButton$lambda$0(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final long OnboardingSelectButton$lambda$1(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final float OnboardingSelectButton$lambda$2(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long OnboardingSquareSelectButton$lambda$3(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final long OnboardingSquareSelectButton$lambda$4(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final float OnboardingSquareSelectButton$lambda$5(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ChipButton$lambda$6(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }

    private static final long ChipButton$lambda$7(State<Color> state) {
        return state.getValue().m3301unboximpl();
    }
}
