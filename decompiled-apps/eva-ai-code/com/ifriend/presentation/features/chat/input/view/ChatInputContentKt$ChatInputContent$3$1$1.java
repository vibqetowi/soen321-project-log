package com.ifriend.presentation.features.chat.input.view;

import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import com.google.accompanist.permissions.PermissionState;
import com.ifriend.presentation.features.chat.input.model.ChatInputState;
import com.ifriend.ui.haptic.AppHapticConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt$ChatInputContent$3$1$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MutableFloatState $audioCancelProgress$delegate;
    final /* synthetic */ PermissionState $audioPermissionState;
    final /* synthetic */ ChatInputCallbacks $callbacks;
    final /* synthetic */ MutableState<Boolean> $cancelled$delegate;
    final /* synthetic */ FocusRequester $focusRequester;
    final /* synthetic */ ChatInputState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$ChatInputContent$3$1$1(ChatInputState chatInputState, MutableFloatState mutableFloatState, MutableState<Boolean> mutableState, ChatInputCallbacks chatInputCallbacks, FocusRequester focusRequester, int i, PermissionState permissionState) {
        super(3);
        this.$state = chatInputState;
        this.$audioCancelProgress$delegate = mutableFloatState;
        this.$cancelled$delegate = mutableState;
        this.$callbacks = chatInputCallbacks;
        this.$focusRequester = focusRequester;
        this.$$dirty = i;
        this.$audioPermissionState = permissionState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28 */
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        float f;
        float ChatInputContent$lambda$3;
        float ChatInputContent$lambda$32;
        boolean ChatInputContent$lambda$6;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2049097453, i2, -1, "com.ifriend.presentation.features.chat.input.view.ChatInputContent.<anonymous>.<anonymous>.<anonymous> (ChatInputContent.kt:170)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            ComposerKt.sourceInformationMarkerEnd(composer);
            View view = (View) consume;
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
            mutableFloatState.setFloatValue(Constraints.m5553getMinWidthimpl(BoxWithConstraints.mo685getConstraintsmsEJaDk()) * 0.5f);
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = SnapshotIntStateKt.mutableIntStateOf(0);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            MutableIntState mutableIntState = (MutableIntState) rememberedValue2;
            composer.startReplaceableGroup(131166435);
            if (this.$state.isRecording()) {
                ChatInputContent$lambda$6 = ChatInputContentKt.ChatInputContent$lambda$6(this.$cancelled$delegate);
                if (!ChatInputContent$lambda$6) {
                    EffectsKt.LaunchedEffect(Integer.valueOf(invoke$lambda$4(mutableIntState)), new AnonymousClass1(view, this.$callbacks, mutableIntState, mutableFloatState, this.$cancelled$delegate, null), (Composer) composer, 64);
                }
            }
            composer.endReplaceableGroup();
            Integer valueOf = Integer.valueOf(invoke$lambda$4(mutableIntState));
            Float valueOf2 = Float.valueOf(invoke$lambda$2(mutableFloatState));
            MutableFloatState mutableFloatState2 = this.$audioCancelProgress$delegate;
            composer.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed = composer.changed(mutableFloatState2) | composer.changed(mutableIntState) | composer.changed(mutableFloatState);
            ChatInputContentKt$ChatInputContent$3$1$1$2$1 rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new ChatInputContentKt$ChatInputContent$3$1$1$2$1(mutableIntState, mutableFloatState, mutableFloatState2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue3, composer, 512);
            Modifier m420backgroundbw27NRU = BackgroundKt.m420backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Color.m3290copywmQWz5c$default(Color.Companion.m3328getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(Dp.m5607constructorimpl(15)));
            f = ChatInputContentKt.lineHeight;
            Modifier m799sizeInqDBjuR0$default = SizeKt.m799sizeInqDBjuR0$default(m420backgroundbw27NRU, 0.0f, f, 0.0f, 0.0f, 13, null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            ChatInputState chatInputState = this.$state;
            ChatInputCallbacks chatInputCallbacks = this.$callbacks;
            FocusRequester focusRequester = this.$focusRequester;
            int i3 = this.$$dirty;
            MutableFloatState mutableFloatState3 = this.$audioCancelProgress$delegate;
            PermissionState permissionState = this.$audioPermissionState;
            MutableState<Boolean> mutableState = this.$cancelled$delegate;
            composer.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m799sizeInqDBjuR0$default);
            int i4 = i2;
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
            Modifier weight$default = RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 1.0f, false, 2, null);
            Alignment center = Alignment.Companion.getCenter();
            composer.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(weight$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl2 = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl2.getInserting() || !Intrinsics.areEqual(m2893constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m2893constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m2893constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            ChatInputContentKt.MessageTextField(chatInputState.getMessage(), chatInputState.getMessagePlaceholder(), chatInputState.isVisibleMessageTextField(), chatInputCallbacks.getOnTextChange(), focusRequester, composer, 57344 & (i3 << 6));
            boolean isVisibleSlideToCancel = chatInputState.isVisibleSlideToCancel();
            ChatInputContent$lambda$3 = ChatInputContentKt.ChatInputContent$lambda$3(mutableFloatState3);
            ChatInputContentKt.SlideToCancel(isVisibleSlideToCancel, ChatInputContent$lambda$3, composer, 0);
            ChatInputContentKt.RecordedAudio(BoxScopeInstance.INSTANCE, chatInputState.isAudioReadyToSend(), composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            boolean isVisibleAttachmentsButtons = chatInputState.isVisibleAttachmentsButtons();
            Function0<Unit> onSendImageClick = chatInputCallbacks.getOnSendImageClick();
            boolean isRecording = chatInputState.isRecording();
            ChatInputContentKt$ChatInputContent$3$1$1$3$2 chatInputContentKt$ChatInputContent$3$1$1$3$2 = new ChatInputContentKt$ChatInputContent$3$1$1$3$2(chatInputCallbacks, permissionState, view, mutableIntState, mutableState);
            ChatInputContentKt$ChatInputContent$3$1$1$3$3 chatInputContentKt$ChatInputContent$3$1$1$3$3 = new ChatInputContentKt$ChatInputContent$3$1$1$3$3(view, chatInputCallbacks, mutableState);
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(mutableIntState) | composer.changed(mutableFloatState);
            ChatInputContentKt$ChatInputContent$3$1$1$3$4$1 rememberedValue4 = composer.rememberedValue();
            if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new ChatInputContentKt$ChatInputContent$3$1$1$3$4$1(mutableIntState, mutableFloatState);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            ChatInputContentKt.AttachmentsButtons(rowScopeInstance, isVisibleAttachmentsButtons, isRecording, onSendImageClick, chatInputContentKt$ChatInputContent$3$1$1$3$2, chatInputContentKt$ChatInputContent$3$1$1$3$3, rememberedValue4, composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            boolean isRecording2 = this.$state.isRecording();
            float volumeDb = this.$state.getVolumeDb();
            int invoke$lambda$4 = invoke$lambda$4(mutableIntState);
            ChatInputContent$lambda$32 = ChatInputContentKt.ChatInputContent$lambda$3(this.$audioCancelProgress$delegate);
            ChatInputContentKt.AudioRecordButton(BoxWithConstraints, isRecording2, invoke$lambda$4, volumeDb, ChatInputContent$lambda$32, composer, i4 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$2(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$4(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatInputContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.chat.input.view.ChatInputContentKt$ChatInputContent$3$1$1$1", f = "ChatInputContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.chat.input.view.ChatInputContentKt$ChatInputContent$3$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatInputCallbacks $callbacks;
        final /* synthetic */ MutableFloatState $cancelOffset$delegate;
        final /* synthetic */ MutableState<Boolean> $cancelled$delegate;
        final /* synthetic */ MutableIntState $dragOffset$delegate;
        final /* synthetic */ View $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(View view, ChatInputCallbacks chatInputCallbacks, MutableIntState mutableIntState, MutableFloatState mutableFloatState, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$view = view;
            this.$callbacks = chatInputCallbacks;
            this.$dragOffset$delegate = mutableIntState;
            this.$cancelOffset$delegate = mutableFloatState;
            this.$cancelled$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$view, this.$callbacks, this.$dragOffset$delegate, this.$cancelOffset$delegate, this.$cancelled$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (Math.abs(ChatInputContentKt$ChatInputContent$3$1$1.invoke$lambda$4(this.$dragOffset$delegate)) >= ChatInputContentKt$ChatInputContent$3$1$1.invoke$lambda$2(this.$cancelOffset$delegate)) {
                    ChatInputContentKt.ChatInputContent$lambda$7(this.$cancelled$delegate, true);
                    this.$view.performHapticFeedback(AppHapticConstants.INSTANCE.getREJECT());
                    this.$callbacks.getOnRecordAudioCancel().invoke();
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
