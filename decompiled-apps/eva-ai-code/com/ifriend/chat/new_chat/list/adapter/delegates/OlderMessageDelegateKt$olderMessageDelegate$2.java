package com.ifriend.chat.new_chat.list.adapter.delegates;

import android.view.View;
import android.widget.TextView;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.list.ui.model.OlderMessagesUiModel;
import com.ifriend.chat.new_chat.list.viewModel.LoadMoreItemClick;
import com.ifriend.ui.databinding.OlderMessagesItemBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: OlderMessageDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;", "Lcom/ifriend/chat/new_chat/list/ui/model/OlderMessagesUiModel;", "Lcom/ifriend/ui/databinding/OlderMessagesItemBinding;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OlderMessageDelegateKt$olderMessageDelegate$2 extends Lambda implements Function1<AdapterDelegateViewBindingViewHolder<OlderMessagesUiModel, OlderMessagesItemBinding>, Unit> {
    final /* synthetic */ LoadMoreItemClick $loadMoreItemClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OlderMessageDelegateKt$olderMessageDelegate$2(LoadMoreItemClick loadMoreItemClick) {
        super(1);
        this.$loadMoreItemClick = loadMoreItemClick;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<OlderMessagesUiModel, OlderMessagesItemBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(LoadMoreItemClick loadMoreItemClick, View view) {
        Intrinsics.checkNotNullParameter(loadMoreItemClick, "$loadMoreItemClick");
        loadMoreItemClick.onLoadMoreClick();
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<OlderMessagesUiModel, OlderMessagesItemBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        TextView root = adapterDelegateViewBinding.getBinding().getRoot();
        final LoadMoreItemClick loadMoreItemClick = this.$loadMoreItemClick;
        root.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.new_chat.list.adapter.delegates.OlderMessageDelegateKt$olderMessageDelegate$2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OlderMessageDelegateKt$olderMessageDelegate$2.invoke$lambda$0(LoadMoreItemClick.this, view);
            }
        });
        adapterDelegateViewBinding.bind(AnonymousClass2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OlderMessageDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.new_chat.list.adapter.delegates.OlderMessageDelegateKt$olderMessageDelegate$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<List<? extends Object>, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }
    }
}
