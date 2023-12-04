package com.ifriend.presentation.features.chat.panel.ui.topics;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.IntOffset;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicsUiState;
import com.ifriend.ui.components.popup.AnimatedPopupKt;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PremiumTopicPopupContent.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a:\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\bH\u0003¢\u0006\u0002\u0010\t\u001aJ\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"PremiumTopicModalPopup", "", "isVisible", "", "onDismiss", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", FirebaseAnalytics.Param.CONTENT, "Landroidx/compose/runtime/Composable;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "PremiumTopicPopupContent", "state", "Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "onRemindClick", "onPermissionGranted", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "granted", "(Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "PremiumTopicPopupContentPreview", "(Landroidx/compose/runtime/Composer;I)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PremiumTopicPopupContentKt {
    public static final void PremiumTopicPopupContentPreview(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1184798677);
        ComposerKt.sourceInformation(startRestartGroup, "C(PremiumTopicPopupContentPreview)");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1184798677, i, -1, "com.ifriend.presentation.features.chat.panel.ui.topics.PremiumTopicPopupContentPreview (PremiumTopicPopupContent.kt:52)");
            }
            AppThemeKt.AppTheme(null, null, null, null, ComposableSingletons$PremiumTopicPopupContentKt.INSTANCE.m6920getLambda1$presentation_release(), startRestartGroup, 24576, 15);
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
        endRestartGroup.updateScope(new PremiumTopicPopupContentKt$PremiumTopicPopupContentPreview$1(i));
    }

    public static final void PremiumTopicPopupContent(ChatTopicsUiState state, Function0<Unit> onRemindClick, Function1<? super Boolean, Unit> onPermissionGranted, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onRemindClick, "onRemindClick");
        Intrinsics.checkNotNullParameter(onPermissionGranted, "onPermissionGranted");
        Composer startRestartGroup = composer.startRestartGroup(-7866695);
        ComposerKt.sourceInformation(startRestartGroup, "C(PremiumTopicPopupContent)P(2,1)");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onRemindClick) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onPermissionGranted) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-7866695, i2, -1, "com.ifriend.presentation.features.chat.panel.ui.topics.PremiumTopicPopupContent (PremiumTopicPopupContent.kt:74)");
            }
            PremiumTopicModalPopup(state.isVisiblePopup(), PremiumTopicPopupContentKt$PremiumTopicPopupContent$1.INSTANCE, ComposableLambdaKt.composableLambda(startRestartGroup, 240968831, true, new PremiumTopicPopupContentKt$PremiumTopicPopupContent$2(state, onPermissionGranted, i2, onRemindClick)), startRestartGroup, 432);
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
        endRestartGroup.updateScope(new PremiumTopicPopupContentKt$PremiumTopicPopupContent$3(state, onRemindClick, onPermissionGranted, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PremiumTopicModalPopup(boolean z, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(687769377);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(687769377, i2, -1, "com.ifriend.presentation.features.chat.panel.ui.topics.PremiumTopicModalPopup (PremiumTopicPopupContent.kt:209)");
            }
            composer2 = startRestartGroup;
            AnimatedPopupKt.m7050FullscreenAnimatedPopupIkByU14(z, function0, 0L, null, null, false, EnterExitTransitionKt.slideInVertically(AnimationSpecKt.spring$default(0.0f, 200.0f, IntOffset.m5716boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null), PremiumTopicPopupContentKt$PremiumTopicModalPopup$1.INSTANCE), null, function2, startRestartGroup, (i2 & 14) | (i2 & 112) | ((i2 << 18) & 234881024), TsExtractor.TS_PACKET_SIZE);
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
        endRestartGroup.updateScope(new PremiumTopicPopupContentKt$PremiumTopicModalPopup$2(z, function0, function2, i));
    }
}
