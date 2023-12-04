package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.ifriend.presentation.features.chatstore.viewmodel.ChatsStoreViewModel;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.components.providers.AppLocalProviderKt;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatsStoreFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatsStoreFragment$onViewCreated$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ChatsStoreFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsStoreFragment$onViewCreated$1$1(ChatsStoreFragment chatsStoreFragment) {
        super(2);
        this.this$0 = chatsStoreFragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatsStoreFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.chatstore.ui.ChatsStoreFragment$onViewCreated$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ChatsStoreFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ChatsStoreFragment chatsStoreFragment) {
            super(2);
            this.this$0 = chatsStoreFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-541340061, i, -1, "com.ifriend.presentation.features.chatstore.ui.ChatsStoreFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (ChatsStoreFragment.kt:59)");
                }
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AppLocalProviderKt.getLocalAppImageLoaderProvider().provides(this.this$0.getImageLoader())}, ComposableLambdaKt.composableLambda(composer, -897678557, true, new C01571(this.this$0)), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatsStoreFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.chatstore.ui.ChatsStoreFragment$onViewCreated$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01571 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ ChatsStoreFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01571(ChatsStoreFragment chatsStoreFragment) {
                super(2);
                this.this$0 = chatsStoreFragment;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ChatsStoreFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "chatId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chatstore.ui.ChatsStoreFragment$onViewCreated$1$1$1$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public static final class AnonymousClass2 extends Lambda implements Function1<String, Unit> {
                final /* synthetic */ ChatsStoreFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(ChatsStoreFragment chatsStoreFragment) {
                    super(1);
                    this.this$0 = chatsStoreFragment;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(String chatId) {
                    Intrinsics.checkNotNullParameter(chatId, "chatId");
                    AppFlowCoordinator.DefaultImpls.goToChat$default(this.this$0.getFlowCoordinator(), chatId, false, true, 2, null);
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ChatsStoreViewModel viewModel;
                if ((i & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-897678557, i, -1, "com.ifriend.presentation.features.chatstore.ui.ChatsStoreFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatsStoreFragment.kt:62)");
                }
                viewModel = this.this$0.getViewModel();
                ChatsStoreScreenKt.ChatsStoreScreen(viewModel, new AnonymousClass2(this.this$0), new C01581(this.this$0.getFlowCoordinator()), composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: ChatsStoreFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.features.chatstore.ui.ChatsStoreFragment$onViewCreated$1$1$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C01581 extends FunctionReferenceImpl implements Function0<Unit> {
                C01581(Object obj) {
                    super(0, obj, AppFlowCoordinator.class, "back", "back()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((AppFlowCoordinator) this.receiver).back();
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
                ComposerKt.traceEventStart(107787946, i, -1, "com.ifriend.presentation.features.chatstore.ui.ChatsStoreFragment.onViewCreated.<anonymous>.<anonymous> (ChatsStoreFragment.kt:58)");
            }
            AppThemeKt.AppTheme(null, null, null, null, ComposableLambdaKt.composableLambda(composer, -541340061, true, new AnonymousClass1(this.this$0)), composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
