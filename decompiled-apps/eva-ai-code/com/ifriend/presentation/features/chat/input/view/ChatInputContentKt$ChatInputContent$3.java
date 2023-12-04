package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.accompanist.permissions.PermissionState;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt$ChatInputContent$3 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MutableFloatState $audioCancelProgress$delegate;
    final /* synthetic */ PermissionState $audioPermissionState;
    final /* synthetic */ ChatInputCallbacks $callbacks;
    final /* synthetic */ MutableState<Boolean> $cancelled$delegate;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ ChatInputState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$ChatInputContent$3(ChatInputState chatInputState, ChatInputCallbacks chatInputCallbacks, MutableState<Boolean> mutableState, MutableFloatState mutableFloatState, FocusRequester focusRequester, int i, PermissionState permissionState) {
        super(3);
        this.$state = chatInputState;
        this.$callbacks = chatInputCallbacks;
        this.$cancelled$delegate = mutableState;
        this.$audioCancelProgress$delegate = mutableFloatState;
        this.$focusRequester = focusRequester;
        this.$$dirty = i;
        this.$audioPermissionState = permissionState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        float f;
        float f2;
        boolean ChatInputContent$lambda$6;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1839690931, i, -1, "com.ifriend.presentation.features.chat.input.view.ChatInputContent.<anonymous> (ChatInputContent.kt:150)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            f = ChatInputContentKt.verticalPadding;
            Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(fillMaxWidth$default, 0.0f, f, 0.0f, 0.0f, 13, null);
            f2 = ChatInputContentKt.verticalPadding;
            Modifier m752paddingqDBjuR0$default2 = PaddingKt.m752paddingqDBjuR0$default(m752paddingqDBjuR0$default, 0.0f, 0.0f, 0.0f, f2, 7, null);
            ChatInputState chatInputState = this.$state;
            ChatInputCallbacks chatInputCallbacks = this.$callbacks;
            MutableState<Boolean> mutableState = this.$cancelled$delegate;
            MutableFloatState mutableFloatState = this.$audioCancelProgress$delegate;
            FocusRequester focusRequester = this.$focusRequester;
            int i2 = this.$$dirty;
            PermissionState permissionState = this.$audioPermissionState;
            composer.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m752paddingqDBjuR0$default2);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean isRecording = chatInputState.isRecording();
            String timerLabel = chatInputState.getTimerLabel();
            ChatInputContent$lambda$6 = ChatInputContentKt.ChatInputContent$lambda$6(mutableState);
            ChatInputContentKt.AudioRecordingIndicators(rowScopeInstance, isRecording, timerLabel, ChatInputContent$lambda$6, composer, 6);
            ChatInputContentKt.ClearButton(rowScopeInstance, chatInputState.isVisibleClearMessageButton(), chatInputCallbacks.getOnClearClick(), composer, 6);
            BoxWithConstraintsKt.BoxWithConstraints(RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null), null, false, ComposableLambdaKt.composableLambda(composer, 2049097453, true, new ChatInputContentKt$ChatInputContent$3$1$1(chatInputState, mutableFloatState, mutableState, chatInputCallbacks, focusRequester, i2, permissionState)), composer, CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 6);
            ChatInputContentKt.SendButton(rowScopeInstance, chatInputState.isVisibleSendMessageButton(), chatInputCallbacks.getOnSendClick(), composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
