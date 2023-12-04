package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.ifriend.presentation.features.chat.screen.view.ChatOverlayContentKt;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.ui.components.providers.AppLocalProviderKt;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatFragment$onViewCreated$2$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onViewCreated$2$1$1(ChatFragment chatFragment) {
        super(2);
        this.this$0 = chatFragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$onViewCreated$2$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ChatFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatFragment chatFragment) {
            super(2);
            this.this$0 = chatFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-754125740, i, -1, "com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatFragment.kt:182)");
                }
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AppLocalProviderKt.getLocalAppImageLoaderProvider().provides(this.this$0.getImageLoader())}, ComposableLambdaKt.composableLambda(composer, -1012909804, true, new C01151(this.this$0)), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$onViewCreated$2$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01151 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ ChatFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01151(ChatFragment chatFragment) {
                super(2);
                this.this$0 = chatFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ChatViewModel viewModel;
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1012909804, i, -1, "com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatFragment.kt:185)");
                }
                viewModel = this.this$0.getViewModel();
                ChatOverlayContentKt.ChatOverlayContent(viewModel, composer, ChatViewModel.$stable);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1581799973, i, -1, "com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (ChatFragment.kt:181)");
            }
            AppThemeKt.AppTheme(null, null, null, null, ComposableLambdaKt.composableLambda(composer, -754125740, true, new AnonymousClass1(this.this$0)), composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
