package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import com.ifriend.presentation.features.profile.header.model.ChatHeaderUiState;
import com.ifriend.presentation.features.profile.header.view.ChatHeaderClicks;
import com.ifriend.presentation.features.profile.header.view.ChatHeaderContentKt;
import com.ifriend.ui.components.providers.AppLocalProviderKt;
import com.ifriend.ui.theme.AppTheme;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatFragment$onViewCreated$2$3$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$onViewCreated$2$3$1(ChatFragment chatFragment) {
        super(2);
        this.this$0 = chatFragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$onViewCreated$2$3$1$1  reason: invalid class name */
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
                    ComposerKt.traceEventStart(-726010596, i, -1, "com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatFragment.kt:209)");
                }
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AppLocalProviderKt.getLocalAppImageLoaderProvider().provides(this.this$0.getImageLoader())}, ComposableLambdaKt.composableLambda(composer, -309392932, true, new C01171(this.this$0)), composer, 56);
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
        /* renamed from: com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment$onViewCreated$2$3$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01171 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ ChatFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01171(ChatFragment chatFragment) {
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
                ChatViewModel viewModel2;
                ChatViewModel viewModel3;
                ChatViewModel viewModel4;
                ChatViewModel viewModel5;
                ChatViewModel viewModel6;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-309392932, i, -1, "com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatFragment.kt:212)");
                    }
                    viewModel = this.this$0.getViewModel();
                    ChatHeaderUiState invoke$lambda$0 = invoke$lambda$0(FlowExtKt.collectAsStateWithLifecycle(viewModel.getChatHeaderState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7));
                    Modifier statusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(PaddingKt.m750paddingVpY3zN4$default(PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7178getSmallestD9Ej5fM(), 0.0f, 2, null), 0.0f, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 1, null));
                    ChatFragment chatFragment = this.this$0;
                    composer.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        viewModel2 = chatFragment.getViewModel();
                        viewModel3 = chatFragment.getViewModel();
                        viewModel4 = chatFragment.getViewModel();
                        viewModel5 = chatFragment.getViewModel();
                        viewModel6 = chatFragment.getViewModel();
                        rememberedValue = new ChatHeaderClicks(new ChatFragment$onViewCreated$2$3$1$1$1$1$1(viewModel2), new ChatFragment$onViewCreated$2$3$1$1$1$1$2(viewModel3), new ChatFragment$onViewCreated$2$3$1$1$1$1$3(viewModel4), new ChatFragment$onViewCreated$2$3$1$1$1$1$4(viewModel5), new ChatFragment$onViewCreated$2$3$1$1$1$1$5(viewModel6), null, null, null, 224, null);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    ChatHeaderContentKt.ChatScreenHeaderContent(invoke$lambda$0, statusBarsPadding, (ChatHeaderClicks) rememberedValue, composer, (ChatHeaderClicks.$stable << 6) | ChatHeaderUiState.$stable, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            private static final ChatHeaderUiState invoke$lambda$0(State<ChatHeaderUiState> state) {
                return state.getValue();
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
                ComposerKt.traceEventStart(-1551998749, i, -1, "com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (ChatFragment.kt:208)");
            }
            AppThemeKt.AppTheme(null, null, null, null, ComposableLambdaKt.composableLambda(composer, -726010596, true, new AnonymousClass1(this.this$0)), composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
