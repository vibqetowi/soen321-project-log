package com.ifriend.chat.new_chat.list.adapter.delegates;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.list.ui.model.ThemedTopicSeparatorUiModel;
import com.ifriend.presentation.databinding.ViewComposeWrapContentBinding;
import com.ifriend.presentation.features.chat.panel.ui.topics.ChatPremiumTopicLabelKt;
import com.ifriend.ui.theme.AppThemeKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TopicSeparatorDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TopicSeparatorDelegateKt$premiumTopicSeparatorDelegate$2$1$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AdapterDelegateViewBindingViewHolder<ThemedTopicSeparatorUiModel.Premium, ViewComposeWrapContentBinding> $this_adapterDelegateViewBinding;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicSeparatorDelegateKt$premiumTopicSeparatorDelegate$2$1$1$1(AdapterDelegateViewBindingViewHolder<ThemedTopicSeparatorUiModel.Premium, ViewComposeWrapContentBinding> adapterDelegateViewBindingViewHolder) {
        super(2);
        this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TopicSeparatorDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.new_chat.list.adapter.delegates.TopicSeparatorDelegateKt$premiumTopicSeparatorDelegate$2$1$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<ThemedTopicSeparatorUiModel.Premium, ViewComposeWrapContentBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<ThemedTopicSeparatorUiModel.Premium, ViewComposeWrapContentBinding> adapterDelegateViewBindingViewHolder) {
            super(2);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1996456420, i, -1, "com.ifriend.chat.new_chat.list.adapter.delegates.premiumTopicSeparatorDelegate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TopicSeparatorDelegate.kt:29)");
            }
            String upperCase = this.$this_adapterDelegateViewBinding.getItem().getUiModel().getTopicName().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            ChatPremiumTopicLabelKt.ChatPremiumTopicLabel(upperCase, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
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
                ComposerKt.traceEventStart(254264107, i, -1, "com.ifriend.chat.new_chat.list.adapter.delegates.premiumTopicSeparatorDelegate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TopicSeparatorDelegate.kt:28)");
            }
            AppThemeKt.AppTheme(null, null, null, null, ComposableLambdaKt.composableLambda(composer, 1996456420, true, new AnonymousClass1(this.$this_adapterDelegateViewBinding)), composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
