package androidx.compose.material3;

import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.MenuTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Menu.kt */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aT\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u0018¢\u0006\u0002\b\u001a¢\u0006\u0002\b\u001bH\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u0080\u0001\u0010\u001d\u001a\u00020\u000e2\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u000e0\u001f¢\u0006\u0002\b\u001a2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u001f2\u0006\u0010\u0015\u001a\u00020\u00162\u0013\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001f¢\u0006\u0002\b\u001a2\u0013\u0010\"\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001f¢\u0006\u0002\b\u001a2\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\u0010*\u001a \u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0000ø\u0001\u0000¢\u0006\u0002\u0010/\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u0019\u0010\n\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u000b\u0010\u0007\"\u000e\u0010\f\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"DropdownMenuItemDefaultMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "DropdownMenuItemDefaultMinWidth", "DropdownMenuItemHorizontalPadding", "DropdownMenuVerticalPadding", "getDropdownMenuVerticalPadding", "()F", "InTransitionDuration", "", "MenuVerticalMargin", "getMenuVerticalMargin", "OutTransitionDuration", "DropdownMenuContent", "", "expandedStates", "Landroidx/compose/animation/core/MutableTransitionState;", "", "transformOriginState", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/graphics/TransformOrigin;", "modifier", "Landroidx/compose/ui/Modifier;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/MutableState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItemContent", "text", "Lkotlin/Function0;", "onClick", "leadingIcon", "trailingIcon", "enabled", "colors", "Landroidx/compose/material3/MenuItemColors;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/MenuItemColors;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;I)V", "calculateTransformOrigin", "parentBounds", "Landroidx/compose/ui/unit/IntRect;", "menuBounds", "(Landroidx/compose/ui/unit/IntRect;Landroidx/compose/ui/unit/IntRect;)J", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuKt {
    public static final int InTransitionDuration = 120;
    public static final int OutTransitionDuration = 75;
    private static final float MenuVerticalMargin = Dp.m5607constructorimpl(48);
    private static final float DropdownMenuItemHorizontalPadding = Dp.m5607constructorimpl(12);
    private static final float DropdownMenuVerticalPadding = Dp.m5607constructorimpl(8);
    private static final float DropdownMenuItemDefaultMinWidth = Dp.m5607constructorimpl(112);
    private static final float DropdownMenuItemDefaultMaxWidth = Dp.m5607constructorimpl(280);

    public static final /* synthetic */ float access$getDropdownMenuItemHorizontalPadding$p() {
        return DropdownMenuItemHorizontalPadding;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DropdownMenuContent(MutableTransitionState<Boolean> expandedStates, MutableState<TransformOrigin> transformOriginState, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        boolean changed;
        MenuKt$DropdownMenuContent$1$1 rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(expandedStates, "expandedStates");
        Intrinsics.checkNotNullParameter(transformOriginState, "transformOriginState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-159754260);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuContent)P(1,3,2)72@3078L48,74@3156L666,100@3852L477,120@4385L153,126@4582L9,127@4623L11,119@4334L715:Menu.kt#uh7d8r");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(expandedStates) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(transformOriginState) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i5 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-159754260, i4, -1, "androidx.compose.material3.DropdownMenuContent (Menu.kt:65)");
                }
                Transition updateTransition = TransitionKt.updateTransition((MutableTransitionState) expandedStates, "DropDownMenu", startRestartGroup, MutableTransitionState.$stable | 48 | (i4 & 14), 0);
                MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$2 = MenuKt$DropdownMenuContent$scale$2.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1338768149);
                ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                startRestartGroup.startReplaceableGroup(-142660079);
                ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                boolean booleanValue = ((Boolean) updateTransition.getCurrentState()).booleanValue();
                startRestartGroup.startReplaceableGroup(1808111696);
                ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
                }
                float f = !booleanValue ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceableGroup();
                Float valueOf = Float.valueOf(f);
                boolean booleanValue2 = ((Boolean) updateTransition.getTargetState()).booleanValue();
                startRestartGroup.startReplaceableGroup(1808111696);
                ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1808111696, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:90)");
                }
                float f2 = !booleanValue2 ? 1.0f : 0.8f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceableGroup();
                State createTransitionAnimation = TransitionKt.createTransitionAnimation(updateTransition, valueOf, Float.valueOf(f2), menuKt$DropdownMenuContent$scale$2.invoke((MenuKt$DropdownMenuContent$scale$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter, "FloatAnimation", startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$2 = MenuKt$DropdownMenuContent$alpha$2.INSTANCE;
                startRestartGroup.startReplaceableGroup(-1338768149);
                ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
                TwoWayConverter<Float, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
                startRestartGroup.startReplaceableGroup(-142660079);
                ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
                boolean booleanValue3 = ((Boolean) updateTransition.getCurrentState()).booleanValue();
                startRestartGroup.startReplaceableGroup(1864763068);
                ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
                }
                float f3 = !booleanValue3 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceableGroup();
                Float valueOf2 = Float.valueOf(f3);
                boolean booleanValue4 = ((Boolean) updateTransition.getTargetState()).booleanValue();
                startRestartGroup.startReplaceableGroup(1864763068);
                ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#uh7d8r");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1864763068, 0, -1, "androidx.compose.material3.DropdownMenuContent.<anonymous> (Menu.kt:110)");
                }
                float f4 = booleanValue4 ? 1.0f : 0.0f;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                startRestartGroup.endReplaceableGroup();
                State createTransitionAnimation2 = TransitionKt.createTransitionAnimation(updateTransition, valueOf2, Float.valueOf(f4), menuKt$DropdownMenuContent$alpha$2.invoke((MenuKt$DropdownMenuContent$alpha$2) updateTransition.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter2, "FloatAnimation", startRestartGroup, 0);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                Modifier.Companion companion2 = Modifier.Companion;
                startRestartGroup.startReplaceableGroup(1618982084);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(createTransitionAnimation) | startRestartGroup.changed(createTransitionAnimation2) | startRestartGroup.changed(transformOriginState);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new MenuKt$DropdownMenuContent$1$1(transformOriginState, createTransitionAnimation, createTransitionAnimation2);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Modifier modifier2 = companion;
                SurfaceKt.m2067SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(companion2, (Function1) rememberedValue), ShapesKt.toShape(MenuTokens.INSTANCE.getContainerShape(), startRestartGroup, 6), ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6), MenuTokens.INSTANCE.getContainerColor()), 0L, MenuTokens.INSTANCE.m2552getContainerElevationD9Ej5fM(), MenuTokens.INSTANCE.m2552getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1651673913, true, new MenuKt$DropdownMenuContent$2(companion, content, i4)), startRestartGroup, 12804096, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                obj = modifier2;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new MenuKt$DropdownMenuContent$3(expandedStates, transformOriginState, obj, content, i, i2));
            return;
        }
        obj = modifier;
        if ((i2 & 8) == 0) {
        }
        i4 = i3;
        if ((i4 & 5851) == 1170) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Transition updateTransition2 = TransitionKt.updateTransition((MutableTransitionState) expandedStates, "DropDownMenu", startRestartGroup, MutableTransitionState.$stable | 48 | (i4 & 14), 0);
        MenuKt$DropdownMenuContent$scale$2 menuKt$DropdownMenuContent$scale$22 = MenuKt$DropdownMenuContent$scale$2.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1338768149);
        ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter3 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        startRestartGroup.startReplaceableGroup(-142660079);
        ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
        boolean booleanValue5 = ((Boolean) updateTransition2.getCurrentState()).booleanValue();
        startRestartGroup.startReplaceableGroup(1808111696);
        ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!booleanValue5) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceableGroup();
        Float valueOf3 = Float.valueOf(f);
        boolean booleanValue22 = ((Boolean) updateTransition2.getTargetState()).booleanValue();
        startRestartGroup.startReplaceableGroup(1808111696);
        ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!booleanValue22) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceableGroup();
        State createTransitionAnimation3 = TransitionKt.createTransitionAnimation(updateTransition2, valueOf3, Float.valueOf(f2), menuKt$DropdownMenuContent$scale$22.invoke((MenuKt$DropdownMenuContent$scale$2) updateTransition2.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter3, "FloatAnimation", startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        MenuKt$DropdownMenuContent$alpha$2 menuKt$DropdownMenuContent$alpha$22 = MenuKt$DropdownMenuContent$alpha$2.INSTANCE;
        startRestartGroup.startReplaceableGroup(-1338768149);
        ComposerKt.sourceInformation(startRestartGroup, "CC(animateFloat)P(2)938@37489L78:Transition.kt#pdpnli");
        TwoWayConverter<Float, AnimationVector1D> vectorConverter22 = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        startRestartGroup.startReplaceableGroup(-142660079);
        ComposerKt.sourceInformation(startRestartGroup, "CC(animateValue)P(3,2)856@34079L32,857@34134L31,858@34190L23,860@34226L89:Transition.kt#pdpnli");
        boolean booleanValue32 = ((Boolean) updateTransition2.getCurrentState()).booleanValue();
        startRestartGroup.startReplaceableGroup(1864763068);
        ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!booleanValue32) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceableGroup();
        Float valueOf22 = Float.valueOf(f3);
        boolean booleanValue42 = ((Boolean) updateTransition2.getTargetState()).booleanValue();
        startRestartGroup.startReplaceableGroup(1864763068);
        ComposerKt.sourceInformation(startRestartGroup, "C:Menu.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
        }
        if (booleanValue42) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.endReplaceableGroup();
        State createTransitionAnimation22 = TransitionKt.createTransitionAnimation(updateTransition2, valueOf22, Float.valueOf(f4), menuKt$DropdownMenuContent$alpha$22.invoke((MenuKt$DropdownMenuContent$alpha$2) updateTransition2.getSegment(), (Transition.Segment) startRestartGroup, (Composer) 0), vectorConverter22, "FloatAnimation", startRestartGroup, 0);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        Modifier.Companion companion22 = Modifier.Companion;
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(createTransitionAnimation3) | startRestartGroup.changed(createTransitionAnimation22) | startRestartGroup.changed(transformOriginState);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new MenuKt$DropdownMenuContent$1$1(transformOriginState, createTransitionAnimation3, createTransitionAnimation22);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        Modifier modifier22 = companion;
        SurfaceKt.m2067SurfaceT9BRK9s(GraphicsLayerModifierKt.graphicsLayer(companion22, (Function1) rememberedValue), ShapesKt.toShape(MenuTokens.INSTANCE.getContainerShape(), startRestartGroup, 6), ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, 6), MenuTokens.INSTANCE.getContainerColor()), 0L, MenuTokens.INSTANCE.m2552getContainerElevationD9Ej5fM(), MenuTokens.INSTANCE.m2552getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(startRestartGroup, -1651673913, true, new MenuKt$DropdownMenuContent$2(companion, content, i4)), startRestartGroup, 12804096, 72);
        if (ComposerKt.isTraceInProgress()) {
        }
        obj = modifier22;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void DropdownMenuItemContent(Function2<? super Composer, ? super Integer, Unit> text, Function0<Unit> onClick, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, boolean z, MenuItemColors colors, PaddingValues contentPadding, MutableInteractionSource interactionSource, Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer startRestartGroup = composer.startRestartGroup(-1564716777);
        ComposerKt.sourceInformation(startRestartGroup, "C(DropdownMenuItemContent)P(7,6,5,4,8,2)159@5627L20,153@5416L2336:Menu.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changedInstance(text) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changed(colors) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= startRestartGroup.changed(contentPadding) ? 8388608 : 4194304;
        }
        if ((234881024 & i) == 0) {
            i2 |= startRestartGroup.changed(interactionSource) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i3 = i2;
        if ((191739611 & i3) != 38347922 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1564716777, i3, -1, "androidx.compose.material3.DropdownMenuItemContent (Menu.kt:142)");
            }
            Modifier padding = PaddingKt.padding(SizeKt.m799sizeInqDBjuR0$default(SizeKt.fillMaxWidth$default(ClickableKt.m452clickableO2vRcR0$default(modifier, interactionSource, RippleKt.m1559rememberRipple9IZ8Weo(true, 0.0f, 0L, startRestartGroup, 6, 6), z, null, null, onClick, 24, null), 0.0f, 1, null), DropdownMenuItemDefaultMinWidth, MenuTokens.INSTANCE.m2553getListItemContainerHeightD9Ej5fM(), DropdownMenuItemDefaultMaxWidth, 0.0f, 8, null), contentPadding);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1557318497, "C171@6130L10,171@6099L1647:Menu.kt#uh7d8r");
            composer2 = startRestartGroup;
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6), MenuTokens.INSTANCE.getListItemLabelTextFont()), ComposableLambdaKt.composableLambda(composer2, 1065051884, true, new MenuKt$DropdownMenuItemContent$1$1(function2, colors, z, i3, function22, rowScopeInstance, text)), composer2, 48);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new MenuKt$DropdownMenuItemContent$2(text, onClick, modifier, function2, function22, z, colors, contentPadding, interactionSource, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long calculateTransformOrigin(IntRect parentBounds, IntRect menuBounds) {
        float max;
        Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
        Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
        float f = 1.0f;
        if (menuBounds.getLeft() < parentBounds.getRight()) {
            if (menuBounds.getRight() <= parentBounds.getLeft()) {
                max = 1.0f;
            } else if (menuBounds.getWidth() != 0) {
                max = (((Math.max(parentBounds.getLeft(), menuBounds.getLeft()) + Math.min(parentBounds.getRight(), menuBounds.getRight())) / 2) - menuBounds.getLeft()) / menuBounds.getWidth();
            }
            if (menuBounds.getTop() < parentBounds.getBottom()) {
                if (menuBounds.getBottom() > parentBounds.getTop()) {
                    if (menuBounds.getHeight() != 0) {
                        f = (((Math.max(parentBounds.getTop(), menuBounds.getTop()) + Math.min(parentBounds.getBottom(), menuBounds.getBottom())) / 2) - menuBounds.getTop()) / menuBounds.getHeight();
                    }
                }
                return TransformOriginKt.TransformOrigin(max, f);
            }
            f = 0.0f;
            return TransformOriginKt.TransformOrigin(max, f);
        }
        max = 0.0f;
        if (menuBounds.getTop() < parentBounds.getBottom()) {
        }
        f = 0.0f;
        return TransformOriginKt.TransformOrigin(max, f);
    }

    public static final float getMenuVerticalMargin() {
        return MenuVerticalMargin;
    }

    public static final float getDropdownMenuVerticalPadding() {
        return DropdownMenuVerticalPadding;
    }

    public static final float DropdownMenuContent$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final float DropdownMenuContent$lambda$3(State<Float> state) {
        return state.getValue().floatValue();
    }
}
