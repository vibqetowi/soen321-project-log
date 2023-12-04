package com.ifriend.chat.new_chat.list.adapter.delegates;

import android.view.View;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.databinding.ItemTextBotSextingMessageBinding;
import com.ifriend.chat.new_chat.list.ui.model.PaidTextMessageFromBotUi;
import com.ifriend.chat.new_chat.list.viewModel.ListItemsClick;
import com.ifriend.ui.textView.typer.TyperTextView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TextMessageBotDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;", "Lcom/ifriend/chat/new_chat/list/ui/model/PaidTextMessageFromBotUi;", "Lcom/ifriend/chat/new_chat/databinding/ItemTextBotSextingMessageBinding;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextMessageBotDelegateKt$textPaidTextMessageFromBotDelegate$2 extends Lambda implements Function1<AdapterDelegateViewBindingViewHolder<PaidTextMessageFromBotUi, ItemTextBotSextingMessageBinding>, Unit> {
    final /* synthetic */ ListItemsClick $itemsClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextMessageBotDelegateKt$textPaidTextMessageFromBotDelegate$2(ListItemsClick listItemsClick) {
        super(1);
        this.$itemsClick = listItemsClick;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<PaidTextMessageFromBotUi, ItemTextBotSextingMessageBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(ListItemsClick itemsClick, AdapterDelegateViewBindingViewHolder this_adapterDelegateViewBinding, View view) {
        Intrinsics.checkNotNullParameter(itemsClick, "$itemsClick");
        Intrinsics.checkNotNullParameter(this_adapterDelegateViewBinding, "$this_adapterDelegateViewBinding");
        itemsClick.onPaidTextMessageClick(String.valueOf(((PaidTextMessageFromBotUi) this_adapterDelegateViewBinding.getItem()).getPayload()));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<PaidTextMessageFromBotUi, ItemTextBotSextingMessageBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        TyperTextView typerTextView = adapterDelegateViewBinding.getBinding().itemSextingMessageBotText;
        final ListItemsClick listItemsClick = this.$itemsClick;
        typerTextView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.new_chat.list.adapter.delegates.TextMessageBotDelegateKt$textPaidTextMessageFromBotDelegate$2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextMessageBotDelegateKt$textPaidTextMessageFromBotDelegate$2.invoke$lambda$0(ListItemsClick.this, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding));
        adapterDelegateViewBinding.onViewDetachedFromWindow(new AnonymousClass3(adapterDelegateViewBinding));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextMessageBotDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.new_chat.list.adapter.delegates.TextMessageBotDelegateKt$textPaidTextMessageFromBotDelegate$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<PaidTextMessageFromBotUi, ItemTextBotSextingMessageBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<PaidTextMessageFromBotUi, ItemTextBotSextingMessageBinding> adapterDelegateViewBindingViewHolder) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$this_adapterDelegateViewBinding.getBinding().itemSextingMessageBotText.showTextWithoutAnimation(this.$this_adapterDelegateViewBinding.getItem().getText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TextMessageBotDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.new_chat.list.adapter.delegates.TextMessageBotDelegateKt$textPaidTextMessageFromBotDelegate$2$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<PaidTextMessageFromBotUi, ItemTextBotSextingMessageBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AdapterDelegateViewBindingViewHolder<PaidTextMessageFromBotUi, ItemTextBotSextingMessageBinding> adapterDelegateViewBindingViewHolder) {
            super(0);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_adapterDelegateViewBinding.getBinding().itemSextingMessageBotText.stopAnimation();
        }
    }
}
