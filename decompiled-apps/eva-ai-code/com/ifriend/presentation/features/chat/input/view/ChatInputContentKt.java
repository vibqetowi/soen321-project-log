package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.facebook.internal.AnalyticsEvents;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.google.logging.type.LogSeverity;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
import com.ifriend.ui.components.bubble.AnimatedBubblesKt;
import com.ifriend.ui.components.textfield.TransparentTextFieldKt;
import com.ifriend.ui.theme.AppFontFamily;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u001a-\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u001b\u001aE\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\f2\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\n0\"j\u0002`#2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010$\u001a\u001d\u0010%\u001a\u00020\n2\u0006\u0010 \u001a\u00020\f2\u0006\u0010&\u001a\u00020'H\u0003¢\u0006\u0002\u0010(\u001a\u001d\u0010)\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010+\u001ak\u0010,\u001a\u00020\n*\u00020-2\u0006\u0010 \u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0010\u0010/\u001a\f\u0012\u0004\u0012\u00020\n0\u000ej\u0002`02\u0010\u00101\u001a\f\u0012\u0004\u0012\u00020\n0\u000ej\u0002`02\u0010\u00102\u001a\f\u0012\u0004\u0012\u00020\n0\u000ej\u0002`02\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\n0\"H\u0003¢\u0006\u0002\u00105\u001a1\u00106\u001a\u00020\n*\u0002072\u0006\u0010.\u001a\u00020\f2\u0006\u00108\u001a\u0002042\u0006\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020'H\u0003¢\u0006\u0002\u0010;\u001a)\u0010<\u001a\u00020\n*\u00020-2\u0006\u0010.\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010=\u001a+\u0010>\u001a\u00020\n*\u00020-2\u0006\u0010 \u001a\u00020\f2\u0010\u0010?\u001a\f\u0012\u0004\u0012\u00020\n0\u000ej\u0002`0H\u0003¢\u0006\u0002\u0010@\u001a\u0019\u0010A\u001a\u00020\n*\u0002072\u0006\u0010 \u001a\u00020\fH\u0003¢\u0006\u0002\u0010B\u001a+\u0010C\u001a\u00020\n*\u00020-2\u0006\u0010 \u001a\u00020\f2\u0010\u0010?\u001a\f\u0012\u0004\u0012\u00020\n0\u000ej\u0002`0H\u0003¢\u0006\u0002\u0010@\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0005\u001a\u00020\u0006X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0007\"\u0013\u0010\b\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D²\u0006\n\u0010E\u001a\u00020'X\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010F\u001a\u00020'X\u008a\u0084\u0002²\u0006\n\u00108\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010G\u001a\u00020\fX\u008a\u008e\u0002²\u0006\n\u0010H\u001a\u00020'X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"bubbleSize", "Landroidx/compose/ui/unit/Dp;", "F", "lineHeight", "recordButtonSize", "redColor", "Landroidx/compose/ui/graphics/Color;", "J", "verticalPadding", "AudioRemoveIndicator", "", AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED, "", "onAnimationEnd", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChatInputContent", "state", "Lcom/ifriend/presentation/features/chat/input/model/ChatInputState;", "callbacks", "Lcom/ifriend/presentation/features/chat/input/view/ChatInputCallbacks;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Lcom/ifriend/presentation/features/chat/input/model/ChatInputState;Lcom/ifriend/presentation/features/chat/input/view/ChatInputCallbacks;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;II)V", "ChatInputContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "MessageTextField", "text", "", "placeholder", "isVisible", "onTextChange", "Lkotlin/Function1;", "Lcom/ifriend/ui/tools/OnTextChange;", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;I)V", "SlideToCancel", "alpha", "", "(ZFLandroidx/compose/runtime/Composer;I)V", "TimerIndication", "timerLabel", "(ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "AttachmentsButtons", "Landroidx/compose/foundation/layout/RowScope;", "isRecording", "onImageClick", "Lcom/ifriend/ui/tools/OnClick;", "onRecordAudioStart", "onRecordAudioEnd", "onDragVoice", "", "(Landroidx/compose/foundation/layout/RowScope;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AudioRecordButton", "Landroidx/compose/foundation/layout/BoxScope;", "dragOffset", "volumeDb", "cancelProgress", "(Landroidx/compose/foundation/layout/BoxScope;ZIFFLandroidx/compose/runtime/Composer;I)V", "AudioRecordingIndicators", "(Landroidx/compose/foundation/layout/RowScope;ZLjava/lang/String;ZLandroidx/compose/runtime/Composer;I)V", "ClearButton", "onClick", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RecordedAudio", "(Landroidx/compose/foundation/layout/BoxScope;ZLandroidx/compose/runtime/Composer;I)V", "SendButton", "presentation_release", "audioCancelProgress", "cancelOffset", "internalVisible", "bubblesScale"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt {
    private static final float bubbleSize;
    private static final float recordButtonSize;
    private static final long redColor;
    private static final float verticalPadding = Dp.m5607constructorimpl(16);
    private static final float lineHeight = Dp.m5607constructorimpl(42);

    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChatInputContent(ChatInputState state, ChatInputCallbacks callbacks, FocusRequester focusRequester, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        FocusRequester focusRequester2;
        boolean changed;
        ChatInputContentKt$ChatInputContent$2$1 rememberedValue;
        Object rememberedValue2;
        Object rememberedValue3;
        FocusRequester focusRequester3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer startRestartGroup = composer.startRestartGroup(-1678584483);
        ComposerKt.sourceInformation(startRestartGroup, "C(ChatInputContent)P(2)");
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
            i3 |= startRestartGroup.changed(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = focusRequester;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            i4 = i3;
            if ((i4 & 731) == 146 || !startRestartGroup.getSkipping()) {
                if (i5 == 0) {
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = new FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    startRestartGroup.endReplaceableGroup();
                    focusRequester2 = (FocusRequester) rememberedValue4;
                } else {
                    focusRequester2 = obj;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1678584483, i4, -1, "com.ifriend.presentation.features.chat.input.view.ChatInputContent (ChatInputContent.kt:131)");
                }
                PermissionState rememberPermissionState = PermissionStateKt.rememberPermissionState("android.permission.RECORD_AUDIO", null, startRestartGroup, 6, 2);
                Boolean valueOf = Boolean.valueOf(PermissionsUtilKt.isGranted(rememberPermissionState.getStatus()));
                startRestartGroup.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                changed = startRestartGroup.changed(rememberPermissionState) | startRestartGroup.changed(callbacks);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new ChatInputContentKt$ChatInputContent$2$1(rememberPermissionState, callbacks, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(valueOf, (Function2) rememberedValue, startRestartGroup, 64);
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceableGroup();
                MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue2;
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                startRestartGroup.endReplaceableGroup();
                BoxWithConstraintsKt.BoxWithConstraints(ZIndexModifierKt.zIndex(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 10.0f), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 1839690931, true, new ChatInputContentKt$ChatInputContent$3(state, callbacks, (MutableState) rememberedValue3, mutableFloatState, focusRequester2, i4, rememberPermissionState)), startRestartGroup, 3078, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                focusRequester3 = focusRequester2;
            } else {
                startRestartGroup.skipToGroupEnd();
                focusRequester3 = obj;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ChatInputContentKt$ChatInputContent$4(state, callbacks, focusRequester3, i, i2));
            return;
        }
        obj = focusRequester;
        i4 = i3;
        if ((i4 & 731) == 146) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        PermissionState rememberPermissionState2 = PermissionStateKt.rememberPermissionState("android.permission.RECORD_AUDIO", null, startRestartGroup, 6, 2);
        Boolean valueOf2 = Boolean.valueOf(PermissionsUtilKt.isGranted(rememberPermissionState2.getStatus()));
        startRestartGroup.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
        changed = startRestartGroup.changed(rememberPermissionState2) | startRestartGroup.changed(callbacks);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new ChatInputContentKt$ChatInputContent$2$1(rememberPermissionState2, callbacks, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(valueOf2, (Function2) rememberedValue, startRestartGroup, 64);
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue2;
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        BoxWithConstraintsKt.BoxWithConstraints(ZIndexModifierKt.zIndex(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 10.0f), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, 1839690931, true, new ChatInputContentKt$ChatInputContent$3(state, callbacks, (MutableState) rememberedValue3, mutableFloatState2, focusRequester2, i4, rememberPermissionState2)), startRestartGroup, 3078, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        focusRequester3 = focusRequester2;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ChatInputContent$lambda$3(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChatInputContent$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatInputContent$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RecordedAudio(BoxScope boxScope, boolean z, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1907332878);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1907332878, i2, -1, "com.ifriend.presentation.features.chat.input.view.RecordedAudio (ChatInputContent.kt:280)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, boxScope.align(Modifier.Companion, Alignment.Companion.getCenterStart()), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableSingletons$ChatInputContentKt.INSTANCE.m6903getLambda1$presentation_release(), startRestartGroup, ((i2 >> 3) & 14) | 200064, 16);
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
        endRestartGroup.updateScope(new ChatInputContentKt$RecordedAudio$1(boxScope, z, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioRecordingIndicators(RowScope rowScope, boolean z, String str, boolean z2, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-567337417);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-567337417, i3, -1, "com.ifriend.presentation.features.chat.input.view.AudioRecordingIndicators (ChatInputContent.kt:304)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            Boolean valueOf = Boolean.valueOf(z);
            Boolean valueOf2 = Boolean.valueOf(z);
            Boolean valueOf3 = Boolean.valueOf(z2);
            int i4 = (i3 >> 3) & 14;
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(valueOf2) | startRestartGroup.changed(mutableState) | startRestartGroup.changed(valueOf3);
            ChatInputContentKt$AudioRecordingIndicators$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ChatInputContentKt$AudioRecordingIndicators$1$1(z, z2, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf, (Function2) rememberedValue2, startRestartGroup, i4 | 64);
            composer2 = startRestartGroup;
            AnimatedVisibilityKt.AnimatedVisibility(rowScope, AudioRecordingIndicators$lambda$9(mutableState), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1101484449, true, new ChatInputContentKt$AudioRecordingIndicators$2(z, z2, str, i3, mutableState)), composer2, 1572864 | (i3 & 14), 30);
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
        endRestartGroup.updateScope(new ChatInputContentKt$AudioRecordingIndicators$3(rowScope, z, str, z2, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioRecordingIndicators$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean AudioRecordingIndicators$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioRecordButton(BoxScope boxScope, boolean z, int i, float f, float f2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Animatable animatable;
        Composer startRestartGroup = composer.startRestartGroup(925249032);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= startRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= startRestartGroup.changed(f2) ? 16384 : 8192;
        }
        int i4 = i3;
        if ((46811 & i4) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(925249032, i4, -1, "com.ifriend.presentation.features.chat.input.view.AudioRecordButton (ChatInputContent.kt:351)");
            }
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new Animatable(0, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), null, null, 12, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Animatable animatable2 = (Animatable) rememberedValue2;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Animatable animatable3 = (Animatable) rememberedValue3;
            EffectsKt.LaunchedEffect(Boolean.valueOf(z), new ChatInputContentKt$AudioRecordButton$1(z, animatable3, mutableState, animatable2, null), startRestartGroup, ((i4 >> 3) & 14) | 64);
            if (AudioRecordButton$lambda$13(mutableState)) {
                startRestartGroup.startReplaceableGroup(-630604495);
                if (z) {
                    startRestartGroup.startReplaceableGroup(773894976);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)488@20446L144:Effects.kt#9igjgp");
                    startRestartGroup.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                    Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == Composer.Companion.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                        startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue4 = compositionScopedCoroutineScopeCanceller;
                    }
                    startRestartGroup.endReplaceableGroup();
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue4).getCoroutineScope();
                    startRestartGroup.endReplaceableGroup();
                    animatable = animatable2;
                    EffectsKt.SideEffect(new ChatInputContentKt$AudioRecordButton$2(coroutineScope, animatable, i), startRestartGroup, 0);
                } else {
                    animatable = animatable2;
                }
                startRestartGroup.endReplaceableGroup();
                float lerp = MathHelpersKt.lerp(0.7f, 1.0f, f2);
                Modifier offset = OffsetKt.offset(boxScope.align(SizeKt.m795size3ABfNKs(Modifier.Companion, lineHeight), Alignment.Companion.getCenterEnd()), new ChatInputContentKt$AudioRecordButton$3(animatable));
                Alignment center = Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(offset);
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
                Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState((0.15f * f) + 1.0f, null, 0.0f, "AudioRecordButton::bubblesScale", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 22);
                AnimatedBubblesKt.m7020AnimatedBubblesuFdPcIQ(ScaleKt.scale(DrawModifierKt.drawWithContent(ScaleKt.scale(Modifier.Companion, lerp), new ChatInputContentKt$AudioRecordButton$4$1(animatable3)), AudioRecordButton$lambda$18$lambda$17(animateFloatAsState)), bubbleSize, ((Number) animatable3.getValue()).floatValue(), startRestartGroup, 48, 0);
                composer2 = startRestartGroup;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_mic_black, startRestartGroup, 0), (String) null, AlphaKt.alpha(SizeKt.m795size3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(24)), ((Number) animatable3.getValue()).floatValue()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 56, 120);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
            } else {
                composer2 = startRestartGroup;
            }
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
        endRestartGroup.updateScope(new ChatInputContentKt$AudioRecordButton$5(boxScope, z, i, f, f2, i2));
    }

    private static final boolean AudioRecordButton$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioRecordButton$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimerIndication(boolean z, String str, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-2061961107);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2061961107, i3, -1, "com.ifriend.presentation.features.chat.input.view.TimerIndication (ChatInputContent.kt:439)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier alpha = AlphaKt.alpha(Modifier.Companion, z ? 0.0f : 1.0f);
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(alpha);
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
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            SpacerKt.Spacer(BackgroundKt.m420backgroundbw27NRU(SizeKt.m795size3ABfNKs(AlphaKt.alpha(Modifier.Companion, TimerIndication$lambda$20$lambda$19(InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("TimerIndication::infiniteTransition", startRestartGroup, 6, 0), 1.0f, 0.0f, AnimationSpecKt.m352infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(LogSeverity.EMERGENCY_VALUE, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Reverse, 0L, 4, null), "TimerIndication::alpha", startRestartGroup, InfiniteTransition.$stable | 25008 | (InfiniteRepeatableSpec.$stable << 9), 0))), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7178getSmallestD9Ej5fM()), redColor, RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            long sp = TextUnitKt.getSp(18);
            FontFamily ibmSans = AppFontFamily.INSTANCE.getIbmSans();
            composer2 = startRestartGroup;
            TextKt.m2145Text4IGK_g(str, PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7176getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), sp, (FontStyle) null, FontWeight.Companion.getNormal(), ibmSans, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i3 >> 3) & 14) | 199680, 0, 130960);
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
        endRestartGroup.updateScope(new ChatInputContentKt$TimerIndication$2(z, str, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AudioRemoveIndicator(boolean z, Function0<Unit> function0, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Object obj;
        Modifier.Companion companion;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1880610345);
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
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = modifier;
            i3 |= startRestartGroup.changed(obj) ? 256 : 128;
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                companion = i4 == 0 ? Modifier.Companion : obj;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1880610345, i3, -1, "com.ifriend.presentation.features.chat.input.view.AudioRemoveIndicator (ChatInputContent.kt:488)");
                }
                startRestartGroup.startReplaceableGroup(-492369756);
                ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                Animatable animatable = (Animatable) rememberedValue;
                EffectsKt.LaunchedEffect(Boolean.valueOf(z), new ChatInputContentKt$AudioRemoveIndicator$1(z, animatable, function0, null), startRestartGroup, (i3 & 14) | 64);
                startRestartGroup.startReplaceableGroup(729327675);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_remove, startRestartGroup, 0), (String) null, AlphaKt.alpha(GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(SizeKt.m795size3ABfNKs(companion, Dp.m5607constructorimpl(24)), 0.0f, 0.0f, 0.0f, 0.0f, (-((Density) consume).mo588toPx0680j_4(AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7172getLargeD9Ej5fM())) * (1 - ((Number) animatable.getValue()).floatValue()), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131055, null), ((Number) animatable.getValue()).floatValue()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                companion = obj;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                return;
            }
            endRestartGroup.updateScope(new ChatInputContentKt$AudioRemoveIndicator$2(z, function0, companion, i, i2));
            return;
        }
        obj = modifier;
        if ((i3 & 731) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
        }
        startRestartGroup.endReplaceableGroup();
        Animatable animatable2 = (Animatable) rememberedValue;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z), new ChatInputContentKt$AudioRemoveIndicator$1(z, animatable2, function0, null), startRestartGroup, (i3 & 14) | 64);
        startRestartGroup.startReplaceableGroup(729327675);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_remove, startRestartGroup, 0), (String) null, AlphaKt.alpha(GraphicsLayerModifierKt.m3447graphicsLayerAp8cVGQ$default(SizeKt.m795size3ABfNKs(companion, Dp.m5607constructorimpl(24)), 0.0f, 0.0f, 0.0f, 0.0f, (-((Density) consume2).mo588toPx0680j_4(AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7172getLargeD9Ej5fM())) * (1 - ((Number) animatable2.getValue()).floatValue()), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131055, null), ((Number) animatable2.getValue()).floatValue()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ClearButton(RowScope rowScope, boolean z, Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1953583656);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1953583656, i2, -1, "com.ifriend.presentation.features.chat.input.view.ClearButton (ChatInputContent.kt:523)");
            }
            int i3 = 1572864 | (i2 & 14);
            AnimatedVisibilityKt.AnimatedVisibility(rowScope, z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1965417392, true, new ChatInputContentKt$ClearButton$1(function0, z, i2)), startRestartGroup, i3 | (i2 & 112), 30);
            AnimatedVisibilityKt.AnimatedVisibility(rowScope, !z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableSingletons$ChatInputContentKt.INSTANCE.m6905getLambda3$presentation_release(), startRestartGroup, i3, 30);
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
        endRestartGroup.updateScope(new ChatInputContentKt$ClearButton$2(rowScope, z, function0, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SendButton(RowScope rowScope, boolean z, Function0<Unit> function0, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-218329553);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-218329553, i3, -1, "com.ifriend.presentation.features.chat.input.view.SendButton (ChatInputContent.kt:550)");
            }
            int i4 = i3 & 14;
            AnimatedVisibilityKt.AnimatedVisibility(rowScope, !z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableSingletons$ChatInputContentKt.INSTANCE.m6906getLambda4$presentation_release(), startRestartGroup, i4 | 1572864, 30);
            AnimatedVisibilityKt.AnimatedVisibility(rowScope, z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandHorizontally$default(null, Alignment.Companion.getStart(), false, null, 13, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkHorizontally$default(null, Alignment.Companion.getStart(), false, null, 13, null)), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1784559042, true, new ChatInputContentKt$SendButton$1(function0, z, i3)), startRestartGroup, i4 | 1600512 | (i3 & 112), 18);
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
        endRestartGroup.updateScope(new ChatInputContentKt$SendButton$2(rowScope, z, function0, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageTextField(String str, String str2, boolean z, Function1<? super String, Unit> function1, FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(865062034);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changed(focusRequester) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((46811 & i3) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(865062034, i3, -1, "com.ifriend.presentation.features.chat.input.view.MessageTextField (ChatInputContent.kt:583)");
            }
            State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, null, 0.0f, "ChatInputContent::textFieldAlpha", null, startRestartGroup, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 22);
            long sp = TextUnitKt.getSp(16);
            long sp2 = TextUnitKt.getSp(19);
            TransparentTextFieldKt.TransparentTextField(str, function1, PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(AlphaKt.alpha(FocusRequesterModifierKt.focusRequester(Modifier.Companion, focusRequester), MessageTextField$lambda$23(animateFloatAsState)), 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(startRestartGroup, AppTheme.$stable).m7178getSmallestD9Ej5fM(), 1, null), false, new TextStyle(AppTheme.INSTANCE.getColors(startRestartGroup, AppTheme.$stable).m7108getTextPrimary0d7_KjU(), sp, FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGhino(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, sp2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646104, (DefaultConstructorMarker) null), null, str2, new KeyboardOptions(KeyboardCapitalization.Companion.m5293getSentencesIUNYP9k(), false, 0, 0, 12, null), null, null, startRestartGroup, 12585984 | (i3 & 14) | ((i3 >> 6) & 112) | ((i3 << 15) & 3670016), LogSeverity.EMERGENCY_VALUE);
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
        endRestartGroup.updateScope(new ChatInputContentKt$MessageTextField$1(str, str2, z, function1, focusRequester, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AttachmentsButtons(RowScope rowScope, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Integer, Unit> function1, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1161866745);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((2995931 & i3) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1161866745, i3, -1, "com.ifriend.presentation.features.chat.input.view.AttachmentsButtons (ChatInputContent.kt:622)");
            }
            int i4 = (i3 & 14) | 1600512;
            AnimatedVisibilityKt.AnimatedVisibility(rowScope, z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 1036314847, true, new ChatInputContentKt$AttachmentsButtons$1(function0, z, i3)), startRestartGroup, i4 | (i3 & 112), 18);
            boolean z3 = z || z2;
            composer2 = startRestartGroup;
            AnimatedVisibilityKt.AnimatedVisibility(rowScope, z3, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, 130272214, true, new ChatInputContentKt$AttachmentsButtons$2(z2, z3, function02, function03, function1, i3)), composer2, i4, 18);
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
        endRestartGroup.updateScope(new ChatInputContentKt$AttachmentsButtons$3(rowScope, z, z2, function0, function02, function03, function1, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SlideToCancel(boolean z, float f, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1783616395);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1783616395, i2, -1, "com.ifriend.presentation.features.chat.input.view.SlideToCancel (ChatInputContent.kt:684)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(z, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(startRestartGroup, -1333800349, true, new ChatInputContentKt$SlideToCancel$1(f)), startRestartGroup, (i2 & 14) | 200064, 18);
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
        endRestartGroup.updateScope(new ChatInputContentKt$SlideToCancel$2(z, f, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static final void ChatInputContentPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1674980648);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1674980648, i, -1, "com.ifriend.presentation.features.chat.input.view.ChatInputContentPreview (ChatInputContent.kt:725)");
            }
            Alignment center = Alignment.Companion.getCenter();
            Modifier m421backgroundbw27NRU$default = BackgroundKt.m421backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.Companion.m3320getDarkGray0d7_KjU(), null, 2, null);
            startRestartGroup.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m421backgroundbw27NRU$default);
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
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new ChatInputState(null, "Message Eva", false, false, null, 0.0f, 61, null), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) rememberedValue;
            ChatInputState ChatInputContentPreview$lambda$30$lambda$25 = ChatInputContentPreview$lambda$30$lambda$25(mutableState);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(mutableState);
            ChatInputContentKt$ChatInputContentPreview$1$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ChatInputContentKt$ChatInputContentPreview$1$1$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            Function0 function0 = rememberedValue2;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(mutableState);
            ChatInputContentKt$ChatInputContentPreview$1$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new ChatInputContentKt$ChatInputContentPreview$1$2$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            Function0 function02 = rememberedValue3;
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(mutableState);
            ChatInputContentKt$ChatInputContentPreview$1$3$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new ChatInputContentKt$ChatInputContentPreview$1$3$1(mutableState);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            ChatInputContent(ChatInputContentPreview$lambda$30$lambda$25, new ChatInputCallbacks(function0, function02, null, null, null, null, rememberedValue4, null, null, null, 956, null), null, startRestartGroup, 0, 4);
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
        endRestartGroup.updateScope(new ChatInputContentKt$ChatInputContentPreview$2(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatInputState ChatInputContentPreview$lambda$30$lambda$25(MutableState<ChatInputState> mutableState) {
        return mutableState.getValue();
    }

    private static final float AudioRecordButton$lambda$18$lambda$17(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float TimerIndication$lambda$20$lambda$19(State<Float> state) {
        return state.getValue().floatValue();
    }

    private static final float MessageTextField$lambda$23(State<Float> state) {
        return state.getValue().floatValue();
    }

    static {
        float m5607constructorimpl = Dp.m5607constructorimpl(120);
        bubbleSize = m5607constructorimpl;
        recordButtonSize = Dp.m5607constructorimpl(m5607constructorimpl - Dp.m5607constructorimpl(20));
        redColor = ColorKt.Color(4294914387L);
    }
}
