package com.ifriend.presentation.features.home.ui.chatitem;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.ifriend.presentation.features.home.ui.models.HomeChatUi;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeChatsContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeChatsContentKt$HomeChatsContent$2 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ Function1<HomeChatUi, Unit> $onChatClick;
    final /* synthetic */ HomeViewModel.UiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeChatsContentKt$HomeChatsContent$2(HomeViewModel.UiState uiState, Function1<? super HomeChatUi, Unit> function1) {
        super(1);
        this.$state = uiState;
        this.$onChatClick = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.CC.item$default(LazyColumn, null, null, ComposableSingletons$HomeChatsContentKt.INSTANCE.m6929getLambda1$presentation_release(), 3, null);
        HomeActiveChatContentKt.activeChatsItems(LazyColumn, this.$state.getActiveChats(), this.$onChatClick);
        if ((this.$state.getChatUnlockLevelLabel().length() > 0) && (!this.$state.getUnavailableChats().isEmpty())) {
            LazyListScope.CC.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-741812656, true, new AnonymousClass1(this.$state)), 3, null);
        }
        HomeUnavailableChatContentKt.unavailableChatsItems(LazyColumn, this.$state.getUnavailableChats(), this.$onChatClick);
        LazyListScope.CC.item$default(LazyColumn, null, null, ComposableSingletons$HomeChatsContentKt.INSTANCE.m6930getLambda2$presentation_release(), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeChatsContent.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.home.ui.chatitem.HomeChatsContentKt$HomeChatsContent$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<LazyItemScope, Composer, Integer, Unit> {
        final /* synthetic */ HomeViewModel.UiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HomeViewModel.UiState uiState) {
            super(3);
            this.$state = uiState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-741812656, i, -1, "com.ifriend.presentation.features.home.ui.chatitem.HomeChatsContent.<anonymous>.<anonymous> (HomeChatsContent.kt:43)");
                }
                HomeChatsContentKt.ChatUnlockLevelLabel(PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7167getExtraMediumD9Ej5fM(), 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7169getExtraSmallestD9Ej5fM(), 5, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7166getExtraLargeD9Ej5fM(), 0.0f, 2, null), this.$state.getChatUnlockLevelLabel(), composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }
}
