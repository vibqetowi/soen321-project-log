package com.ifriend.chat.new_chat.list.adapter.delegates;

import android.view.View;
import android.widget.ImageView;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.databinding.ItemMessageRegeneratingBinding;
import com.ifriend.chat.new_chat.list.ui.model.RegenerateMessageUiModel;
import com.ifriend.chat.new_chat.list.viewModel.RegenerationMessageItemClick;
import com.ifriend.ui.utils.Animations;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: RegenerateMessageDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;", "Lcom/ifriend/chat/new_chat/list/ui/model/RegenerateMessageUiModel;", "Lcom/ifriend/chat/new_chat/databinding/ItemMessageRegeneratingBinding;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RegenerateMessageDelegateKt$regenerationMessageDelegate$2 extends Lambda implements Function1<AdapterDelegateViewBindingViewHolder<RegenerateMessageUiModel, ItemMessageRegeneratingBinding>, Unit> {
    final /* synthetic */ RegenerationMessageItemClick $regenerationMessageItemClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegenerateMessageDelegateKt$regenerationMessageDelegate$2(RegenerationMessageItemClick regenerationMessageItemClick) {
        super(1);
        this.$regenerationMessageItemClick = regenerationMessageItemClick;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<RegenerateMessageUiModel, ItemMessageRegeneratingBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(RegenerationMessageItemClick regenerationMessageItemClick, AdapterDelegateViewBindingViewHolder this_adapterDelegateViewBinding, View view) {
        Intrinsics.checkNotNullParameter(regenerationMessageItemClick, "$regenerationMessageItemClick");
        Intrinsics.checkNotNullParameter(this_adapterDelegateViewBinding, "$this_adapterDelegateViewBinding");
        regenerationMessageItemClick.onRegenerateMessageClick((RegenerateMessageUiModel) this_adapterDelegateViewBinding.getItem());
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<RegenerateMessageUiModel, ItemMessageRegeneratingBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        ImageView imageView = adapterDelegateViewBinding.getBinding().ivRegenerate;
        final RegenerationMessageItemClick regenerationMessageItemClick = this.$regenerationMessageItemClick;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.new_chat.list.adapter.delegates.RegenerateMessageDelegateKt$regenerationMessageDelegate$2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RegenerateMessageDelegateKt$regenerationMessageDelegate$2.invoke$lambda$0(RegenerationMessageItemClick.this, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass2(adapterDelegateViewBinding));
        adapterDelegateViewBinding.onViewDetachedFromWindow(new AnonymousClass3(adapterDelegateViewBinding));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegenerateMessageDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.new_chat.list.adapter.delegates.RegenerateMessageDelegateKt$regenerationMessageDelegate$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<RegenerateMessageUiModel, ItemMessageRegeneratingBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AdapterDelegateViewBindingViewHolder<RegenerateMessageUiModel, ItemMessageRegeneratingBinding> adapterDelegateViewBindingViewHolder) {
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
            ItemMessageRegeneratingBinding binding = this.$this_adapterDelegateViewBinding.getBinding();
            AdapterDelegateViewBindingViewHolder<RegenerateMessageUiModel, ItemMessageRegeneratingBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
            ImageView imageView = binding.ivRegenerate;
            imageView.setClickable(!adapterDelegateViewBindingViewHolder.getItem().isRegenerating());
            if (adapterDelegateViewBindingViewHolder.getItem().isRegenerating()) {
                Animations animations = Animations.INSTANCE;
                Intrinsics.checkNotNull(imageView);
                Animations.infiniteRotate$default(animations, imageView, 0L, 1, null);
                return;
            }
            imageView.setRotation(0.0f);
            imageView.clearAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegenerateMessageDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.new_chat.list.adapter.delegates.RegenerateMessageDelegateKt$regenerationMessageDelegate$2$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<RegenerateMessageUiModel, ItemMessageRegeneratingBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AdapterDelegateViewBindingViewHolder<RegenerateMessageUiModel, ItemMessageRegeneratingBinding> adapterDelegateViewBindingViewHolder) {
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
            this.$this_adapterDelegateViewBinding.getBinding().ivRegenerate.clearAnimation();
        }
    }
}
