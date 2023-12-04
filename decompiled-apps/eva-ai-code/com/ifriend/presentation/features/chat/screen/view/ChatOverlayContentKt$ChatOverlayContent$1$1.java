package com.ifriend.presentation.features.chat.screen.view;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.profileinstaller.ProfileVerifier;
import com.ifriend.presentation.features.chat.actions.ChatAction;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.ui.features.chat.ChatSubscriptionBadgeContentKt;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatOverlayContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatOverlayContentKt$ChatOverlayContent$1$1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ State<ChatViewModel.UiState> $state$delegate;
    final /* synthetic */ ColumnScope $this_Column;
    final /* synthetic */ ChatViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatOverlayContentKt$ChatOverlayContent$1$1(ColumnScope columnScope, State<ChatViewModel.UiState> state, ChatViewModel chatViewModel) {
        super(3);
        this.$this_Column = columnScope;
        this.$state$delegate = state;
        this.$viewModel = chatViewModel;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatOverlayContent.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chat.screen.view.ChatOverlayContentKt$ChatOverlayContent$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        final /* synthetic */ ChatViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatViewModel chatViewModel) {
            super(0);
            this.$viewModel = chatViewModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.dispatchAction((ChatAction) ChatAction.SubscriptionBadgeClick.INSTANCE);
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        ChatViewModel.UiState ChatOverlayContent$lambda$0;
        ChatViewModel.UiState ChatOverlayContent$lambda$02;
        ChatViewModel.UiState ChatOverlayContent$lambda$03;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1977445770, i, -1, "com.ifriend.presentation.features.chat.screen.view.ChatOverlayContent.<anonymous>.<anonymous> (ChatOverlayContent.kt:34)");
        }
        Modifier m750paddingVpY3zN4$default = PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m752paddingqDBjuR0$default(this.$this_Column.align(SizeKt.wrapContentWidth$default(Modifier.Companion, null, false, 3, null), Alignment.Companion.getCenterHorizontally()), 0.0f, 0.0f, 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7167getExtraMediumD9Ej5fM(), 7, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7167getExtraMediumD9Ej5fM(), 0.0f, 2, null);
        ChatOverlayContent$lambda$0 = ChatOverlayContentKt.ChatOverlayContent$lambda$0(this.$state$delegate);
        String chatName = ChatOverlayContent$lambda$0.getChatName();
        long Color = ColorKt.Color(4063114553L);
        ChatOverlayContent$lambda$02 = ChatOverlayContentKt.ChatOverlayContent$lambda$0(this.$state$delegate);
        boolean isVerified = ChatOverlayContent$lambda$02.isVerified();
        ChatOverlayContent$lambda$03 = ChatOverlayContentKt.ChatOverlayContent$lambda$0(this.$state$delegate);
        ChatSubscriptionBadgeContentKt.m7075ChatSubscriptionBadgeContent1YH7lEI(m750paddingVpY3zN4$default, chatName, ChatOverlayContent$lambda$03.getSubscriptionStateLabel(), isVerified, false, Color, new AnonymousClass1(this.$viewModel), null, composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 144);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
