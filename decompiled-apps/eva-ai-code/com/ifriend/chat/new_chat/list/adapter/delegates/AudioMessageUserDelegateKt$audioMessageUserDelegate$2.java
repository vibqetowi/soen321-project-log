package com.ifriend.chat.new_chat.list.adapter.delegates;

import android.view.View;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.databinding.ItemAudioUserMessageBinding;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUserUiModel;
import com.ifriend.chat.new_chat.list.view.audio.AudioMessagePlayerDelegate;
import com.ifriend.chat.new_chat.list.view.audio.AudioMessageView;
import com.ifriend.chat.new_chat.list.viewModel.AudioItemClick;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AudioMessageUserDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;", "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageUserUiModel;", "Lcom/ifriend/chat/new_chat/databinding/ItemAudioUserMessageBinding;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioMessageUserDelegateKt$audioMessageUserDelegate$2 extends Lambda implements Function1<AdapterDelegateViewBindingViewHolder<AudioMessageUserUiModel, ItemAudioUserMessageBinding>, Unit> {
    final /* synthetic */ AudioItemClick $audioItemClick;
    final /* synthetic */ AudioPlayer $audioPlayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioMessageUserDelegateKt$audioMessageUserDelegate$2(AudioPlayer audioPlayer, AudioItemClick audioItemClick) {
        super(1);
        this.$audioPlayer = audioPlayer;
        this.$audioItemClick = audioItemClick;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AudioMessageUserUiModel, ItemAudioUserMessageBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<AudioMessageUserUiModel, ItemAudioUserMessageBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        AudioMessageView itemAudioMessageView = adapterDelegateViewBinding.getBinding().itemAudioMessageView;
        Intrinsics.checkNotNullExpressionValue(itemAudioMessageView, "itemAudioMessageView");
        AudioMessagePlayerDelegate audioMessagePlayerDelegate = new AudioMessagePlayerDelegate(itemAudioMessageView, this.$audioPlayer);
        final AudioItemClick audioItemClick = this.$audioItemClick;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.ifriend.chat.new_chat.list.adapter.delegates.AudioMessageUserDelegateKt$audioMessageUserDelegate$2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioMessageUserDelegateKt$audioMessageUserDelegate$2.invoke$lambda$0(AudioItemClick.this, adapterDelegateViewBinding, view);
            }
        };
        adapterDelegateViewBinding.getBinding().itemAudioMessageView.userAudio();
        adapterDelegateViewBinding.bind(new AnonymousClass1(audioMessagePlayerDelegate, adapterDelegateViewBinding, onClickListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(AudioItemClick audioItemClick, AdapterDelegateViewBindingViewHolder this_adapterDelegateViewBinding, View view) {
        Intrinsics.checkNotNullParameter(audioItemClick, "$audioItemClick");
        Intrinsics.checkNotNullParameter(this_adapterDelegateViewBinding, "$this_adapterDelegateViewBinding");
        audioItemClick.onAudioClick((AudioMessageUiModel) this_adapterDelegateViewBinding.getItem());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AudioMessageUserDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.new_chat.list.adapter.delegates.AudioMessageUserDelegateKt$audioMessageUserDelegate$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ View.OnClickListener $onAudioClick;
        final /* synthetic */ AudioMessagePlayerDelegate $playerDelegate;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AudioMessageUserUiModel, ItemAudioUserMessageBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AudioMessagePlayerDelegate audioMessagePlayerDelegate, AdapterDelegateViewBindingViewHolder<AudioMessageUserUiModel, ItemAudioUserMessageBinding> adapterDelegateViewBindingViewHolder, View.OnClickListener onClickListener) {
            super(1);
            this.$playerDelegate = audioMessagePlayerDelegate;
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$onAudioClick = onClickListener;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$playerDelegate.bind(this.$this_adapterDelegateViewBinding.getItem());
            if (this.$this_adapterDelegateViewBinding.getItem().isSending()) {
                this.$this_adapterDelegateViewBinding.getBinding().itemAudioMessageView.setOnClickListener(null);
                this.$this_adapterDelegateViewBinding.getBinding().itemAudioMessageView.bindState(AudioMessageView.Loading.INSTANCE, this.$this_adapterDelegateViewBinding.getItem().getHistogram());
                return;
            }
            this.$this_adapterDelegateViewBinding.getBinding().itemAudioMessageView.setOnClickListener(this.$onAudioClick);
        }
    }
}
