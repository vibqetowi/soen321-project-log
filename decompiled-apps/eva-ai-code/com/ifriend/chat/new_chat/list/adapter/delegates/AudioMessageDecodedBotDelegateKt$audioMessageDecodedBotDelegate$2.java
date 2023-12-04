package com.ifriend.chat.new_chat.list.adapter.delegates;

import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.databinding.ItemAudioMessageDecodedBotBinding;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageBotDecodedUiModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AudioMessageDecodedBotDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;", "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageBotDecodedUiModel;", "Lcom/ifriend/chat/new_chat/databinding/ItemAudioMessageDecodedBotBinding;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AudioMessageDecodedBotDelegateKt$audioMessageDecodedBotDelegate$2 extends Lambda implements Function1<AdapterDelegateViewBindingViewHolder<AudioMessageBotDecodedUiModel, ItemAudioMessageDecodedBotBinding>, Unit> {
    public static final AudioMessageDecodedBotDelegateKt$audioMessageDecodedBotDelegate$2 INSTANCE = new AudioMessageDecodedBotDelegateKt$audioMessageDecodedBotDelegate$2();

    AudioMessageDecodedBotDelegateKt$audioMessageDecodedBotDelegate$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AudioMessageBotDecodedUiModel, ItemAudioMessageDecodedBotBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AudioMessageDecodedBotDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.new_chat.list.adapter.delegates.AudioMessageDecodedBotDelegateKt$audioMessageDecodedBotDelegate$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AudioMessageBotDecodedUiModel, ItemAudioMessageDecodedBotBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdapterDelegateViewBindingViewHolder<AudioMessageBotDecodedUiModel, ItemAudioMessageDecodedBotBinding> adapterDelegateViewBindingViewHolder) {
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
            this.$this_adapterDelegateViewBinding.getBinding().itemAudioMessageDecodedText.setText(this.$this_adapterDelegateViewBinding.getItem().getText());
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AdapterDelegateViewBindingViewHolder<AudioMessageBotDecodedUiModel, ItemAudioMessageDecodedBotBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        adapterDelegateViewBinding.bind(new AnonymousClass1(adapterDelegateViewBinding));
    }
}
