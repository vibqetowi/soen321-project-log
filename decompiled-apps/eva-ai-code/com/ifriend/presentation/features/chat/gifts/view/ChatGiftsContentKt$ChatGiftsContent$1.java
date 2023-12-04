package com.ifriend.presentation.features.chat.gifts.view;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatGiftsContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatGiftsContentKt$ChatGiftsContent$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<ChatGiftUi, Unit> $onGiftClick;
    final /* synthetic */ Function0<Unit> $onGiftsCloseClick;
    final /* synthetic */ ChatGiftsUiState $uiState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatGiftsContentKt$ChatGiftsContent$1(ChatGiftsUiState chatGiftsUiState, Function0<Unit> function0, int i, Function1<? super ChatGiftUi, Unit> function1) {
        super(2);
        this.$uiState = chatGiftsUiState;
        this.$onGiftsCloseClick = function0;
        this.$$dirty = i;
        this.$onGiftClick = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1828876871, i, -1, "com.ifriend.presentation.features.chat.gifts.view.ChatGiftsContent.<anonymous> (ChatGiftsContent.kt:66)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(this.$uiState.isShowGiftsContent(), (Modifier) null, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.shrinkVertically$default(null, Alignment.Companion.getBottom(), false, null, 13, null), (String) null, ComposableLambdaKt.composableLambda(composer, -643390353, true, new AnonymousClass1(this.$onGiftsCloseClick, this.$$dirty, this.$uiState, this.$onGiftClick)), composer, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatGiftsContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.gifts.view.ChatGiftsContentKt$ChatGiftsContent$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function1<ChatGiftUi, Unit> $onGiftClick;
        final /* synthetic */ Function0<Unit> $onGiftsCloseClick;
        final /* synthetic */ ChatGiftsUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function0<Unit> function0, int i, ChatGiftsUiState chatGiftsUiState, Function1<? super ChatGiftUi, Unit> function1) {
            super(3);
            this.$onGiftsCloseClick = function0;
            this.$$dirty = i;
            this.$uiState = chatGiftsUiState;
            this.$onGiftClick = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r19v0, types: [androidx.compose.runtime.Composer, java.lang.Object] */
        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-643390353, i, -1, "com.ifriend.presentation.features.chat.gifts.view.ChatGiftsContent.<anonymous>.<anonymous> (ChatGiftsContent.kt:71)");
            }
            Function0<Unit> function0 = this.$onGiftsCloseClick;
            int i2 = this.$$dirty;
            ChatGiftsUiState chatGiftsUiState = this.$uiState;
            Function1<ChatGiftUi, Unit> function1 = this.$onGiftClick;
            composer.startReplaceableGroup(-483455358);
            ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)75@3779L61,76@3845L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(Modifier.Companion);
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
            Updater.m2900setimpl(m2893constructorimpl, columnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, 276693570, "C77@3893L9:Column.kt#2w3rfo");
            ChatGiftsContentKt.CloseContent(ColumnScopeInstance.INSTANCE, function0, composer, ((i2 >> 3) & 112) | 6);
            Modifier m781height3ABfNKs = SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(86));
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer.changed(chatGiftsUiState) | composer.changed(function1);
            ChatGiftsContentKt$ChatGiftsContent$1$1$1$1$1 rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ChatGiftsContentKt$ChatGiftsContent$1$1$1$1$1(chatGiftsUiState, function1, i2);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            LazyDslKt.LazyRow(m781height3ABfNKs, null, null, false, null, null, null, false, rememberedValue, composer, 6, 254);
            SpacerKt.Spacer(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(16)), composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
