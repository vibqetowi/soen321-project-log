package com.ifriend.presentation.features.chat.gifts.view;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftUi;
import com.ifriend.presentation.features.chat.gifts.model.ChatGiftsUiState;
import com.ifriend.ui.components.modifier.ClickableModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: ChatGiftsContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatGiftsContentKt$ChatGiftsContent$1$1$1$1$1 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<ChatGiftUi, Unit> $onGiftClick;
    final /* synthetic */ ChatGiftsUiState $uiState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatGiftsContentKt$ChatGiftsContent$1$1$1$1$1(ChatGiftsUiState chatGiftsUiState, Function1<? super ChatGiftUi, Unit> function1, int i) {
        super(1);
        this.$uiState = chatGiftsUiState;
        this.$onGiftClick = function1;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatGiftsContent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.gifts.view.ChatGiftsContentKt$ChatGiftsContent$1$1$1$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ PersistentList<ChatGiftUi> $gifts;
        final /* synthetic */ Function1<ChatGiftUi, Unit> $onGiftClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PersistentList<ChatGiftUi> persistentList, Function1<? super ChatGiftUi, Unit> function1, int i) {
            super(4);
            this.$gifts = persistentList;
            this.$onGiftClick = function1;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            int i3;
            float f;
            float f2;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(items) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 731) != 146 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1559918620, i3, -1, "com.ifriend.presentation.features.chat.gifts.view.ChatGiftsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatGiftsContent.kt:78)");
                }
                ChatGiftUi chatGiftUi = (ChatGiftUi) this.$gifts.get(i);
                composer.startReplaceableGroup(-712995650);
                if (i == 0) {
                    SpacerKt.Spacer(LazyItemScope.CC.animateItemPlacement$default(items, SizeKt.m800width3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(16)), null, 1, null), composer, 0);
                }
                composer.endReplaceableGroup();
                if (!chatGiftUi.isFree()) {
                    composer.startReplaceableGroup(-712995308);
                    f2 = ChatGiftsContentKt.gifBoxSize;
                    Modifier animateItemPlacement = items.animateItemPlacement(SizeKt.m795size3ABfNKs(Modifier.Companion, f2), AnimationSpecKt.spring$default(0.0f, 200.0f, IntOffset.m5716boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null));
                    Function1<ChatGiftUi, Unit> function1 = this.$onGiftClick;
                    PersistentList<ChatGiftUi> persistentList = this.$gifts;
                    Integer valueOf = Integer.valueOf(i);
                    Function1<ChatGiftUi, Unit> function12 = this.$onGiftClick;
                    PersistentList<ChatGiftUi> persistentList2 = this.$gifts;
                    composer.startReplaceableGroup(1618982084);
                    ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                    boolean changed = composer.changed(function1) | composer.changed(persistentList) | composer.changed(valueOf);
                    ChatGiftsContentKt$ChatGiftsContent$1$1$1$1$1$1$1$1 rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new ChatGiftsContentKt$ChatGiftsContent$1$1$1$1$1$1$1$1(function12, persistentList2, i);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    ChatGiftsContentKt.PaidGift(ClickableModifierKt.noIndicationClickable$default(animateItemPlacement, false, (Function0) rememberedValue, 1, null), chatGiftUi, composer, 0);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-712994454);
                    f = ChatGiftsContentKt.gifBoxSize;
                    Modifier animateItemPlacement2 = items.animateItemPlacement(SizeKt.m795size3ABfNKs(Modifier.Companion, f), AnimationSpecKt.spring$default(0.0f, 200.0f, IntOffset.m5716boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null));
                    Function1<ChatGiftUi, Unit> function13 = this.$onGiftClick;
                    PersistentList<ChatGiftUi> persistentList3 = this.$gifts;
                    Integer valueOf2 = Integer.valueOf(i);
                    Function1<ChatGiftUi, Unit> function14 = this.$onGiftClick;
                    PersistentList<ChatGiftUi> persistentList4 = this.$gifts;
                    composer.startReplaceableGroup(1618982084);
                    ComposerKt.sourceInformation(composer, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
                    boolean changed2 = composer.changed(function13) | composer.changed(persistentList3) | composer.changed(valueOf2);
                    ChatGiftsContentKt$ChatGiftsContent$1$1$1$1$1$1$2$1 rememberedValue2 = composer.rememberedValue();
                    if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                        rememberedValue2 = new ChatGiftsContentKt$ChatGiftsContent$1$1$1$1$1$1$2$1(function14, persistentList4, i);
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceableGroup();
                    ChatGiftsContentKt.FreeGift(ClickableModifierKt.noIndicationClickable$default(animateItemPlacement2, false, (Function0) rememberedValue2, 1, null), chatGiftUi, composer, 0);
                    composer.endReplaceableGroup();
                }
                float f3 = 8;
                SpacerKt.Spacer(LazyItemScope.CC.animateItemPlacement$default(items, SizeKt.m800width3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(f3)), null, 1, null), composer, 0);
                if (i == 9) {
                    SpacerKt.Spacer(LazyItemScope.CC.animateItemPlacement$default(items, SizeKt.m800width3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(f3)), null, 1, null), composer, 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        PersistentList<ChatGiftUi> gifts = this.$uiState.getGifts();
        LazyListScope.CC.items$default(LazyRow, gifts.size(), null, null, ComposableLambdaKt.composableLambdaInstance(-1559918620, true, new AnonymousClass1(gifts, this.$onGiftClick, this.$$dirty)), 6, null);
    }
}
