package com.ifriend.chat.new_chat.list.adapter.delegates;

import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import com.hannesdorfmann.adapterdelegates4.dsl.AdapterDelegateViewBindingViewHolder;
import com.ifriend.chat.new_chat.databinding.ItemAudioMessageBotBinding;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.presentationSystems.audio.decode.AudioDecodingStatusComponent;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageBotUiModel;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel;
import com.ifriend.chat.new_chat.list.view.audio.AudioMessagePayload;
import com.ifriend.chat.new_chat.list.view.audio.AudioMessagePlayerDelegate;
import com.ifriend.chat.new_chat.list.view.audio.AudioMessageView;
import com.ifriend.chat.new_chat.list.viewModel.AudioItemClick;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AudioMessageBotDelegate.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/hannesdorfmann/adapterdelegates4/dsl/AdapterDelegateViewBindingViewHolder;", "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageBotUiModel;", "Lcom/ifriend/chat/new_chat/databinding/ItemAudioMessageBotBinding;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioMessageBotDelegateKt$audioMessageBotDelegate$2 extends Lambda implements Function1<AdapterDelegateViewBindingViewHolder<AudioMessageBotUiModel, ItemAudioMessageBotBinding>, Unit> {
    final /* synthetic */ AudioItemClick $audioItemClick;
    final /* synthetic */ AudioPlayer $audioPlayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioMessageBotDelegateKt$audioMessageBotDelegate$2(AudioPlayer audioPlayer, AudioItemClick audioItemClick) {
        super(1);
        this.$audioPlayer = audioPlayer;
        this.$audioItemClick = audioItemClick;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AdapterDelegateViewBindingViewHolder<AudioMessageBotUiModel, ItemAudioMessageBotBinding> adapterDelegateViewBindingViewHolder) {
        invoke2(adapterDelegateViewBindingViewHolder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final AdapterDelegateViewBindingViewHolder<AudioMessageBotUiModel, ItemAudioMessageBotBinding> adapterDelegateViewBinding) {
        Intrinsics.checkNotNullParameter(adapterDelegateViewBinding, "$this$adapterDelegateViewBinding");
        AudioMessageView itemAudioMessageBotView = adapterDelegateViewBinding.getBinding().itemAudioMessageBotView;
        Intrinsics.checkNotNullExpressionValue(itemAudioMessageBotView, "itemAudioMessageBotView");
        AudioMessagePlayerDelegate audioMessagePlayerDelegate = new AudioMessagePlayerDelegate(itemAudioMessageBotView, this.$audioPlayer);
        AudioMessageView audioMessageView = adapterDelegateViewBinding.getBinding().itemAudioMessageBotView;
        final AudioItemClick audioItemClick = this.$audioItemClick;
        audioMessageView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.new_chat.list.adapter.delegates.AudioMessageBotDelegateKt$audioMessageBotDelegate$2$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioMessageBotDelegateKt$audioMessageBotDelegate$2.invoke$lambda$0(AudioItemClick.this, adapterDelegateViewBinding, view);
            }
        });
        AppCompatImageView appCompatImageView = adapterDelegateViewBinding.getBinding().itemAudioMessageBotLoadText;
        final AudioItemClick audioItemClick2 = this.$audioItemClick;
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.new_chat.list.adapter.delegates.AudioMessageBotDelegateKt$audioMessageBotDelegate$2$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioMessageBotDelegateKt$audioMessageBotDelegate$2.invoke$lambda$1(AudioItemClick.this, adapterDelegateViewBinding, view);
            }
        });
        AppCompatImageView appCompatImageView2 = adapterDelegateViewBinding.getBinding().itemAudioMessageBotChangeVoice;
        final AudioItemClick audioItemClick3 = this.$audioItemClick;
        appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.chat.new_chat.list.adapter.delegates.AudioMessageBotDelegateKt$audioMessageBotDelegate$2$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioMessageBotDelegateKt$audioMessageBotDelegate$2.invoke$lambda$2(AudioItemClick.this, adapterDelegateViewBinding, view);
            }
        });
        adapterDelegateViewBinding.bind(new AnonymousClass4(adapterDelegateViewBinding, audioMessagePlayerDelegate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(AudioItemClick audioItemClick, AdapterDelegateViewBindingViewHolder this_adapterDelegateViewBinding, View view) {
        Intrinsics.checkNotNullParameter(audioItemClick, "$audioItemClick");
        Intrinsics.checkNotNullParameter(this_adapterDelegateViewBinding, "$this_adapterDelegateViewBinding");
        audioItemClick.onAudioClick((AudioMessageUiModel) this_adapterDelegateViewBinding.getItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(AudioItemClick audioItemClick, AdapterDelegateViewBindingViewHolder this_adapterDelegateViewBinding, View view) {
        Intrinsics.checkNotNullParameter(audioItemClick, "$audioItemClick");
        Intrinsics.checkNotNullParameter(this_adapterDelegateViewBinding, "$this_adapterDelegateViewBinding");
        audioItemClick.onAudioDecodeClick((AudioMessageUiModel) this_adapterDelegateViewBinding.getItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2(AudioItemClick audioItemClick, AdapterDelegateViewBindingViewHolder this_adapterDelegateViewBinding, View view) {
        Intrinsics.checkNotNullParameter(audioItemClick, "$audioItemClick");
        Intrinsics.checkNotNullParameter(this_adapterDelegateViewBinding, "$this_adapterDelegateViewBinding");
        audioItemClick.onChangeVoiceClick((AudioMessageUiModel) this_adapterDelegateViewBinding.getItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$bindDecoded(AdapterDelegateViewBindingViewHolder<AudioMessageBotUiModel, ItemAudioMessageBotBinding> adapterDelegateViewBindingViewHolder, AudioDecodingStatusComponent.DecodingStatus decodingStatus) {
        ItemAudioMessageBotBinding binding = adapterDelegateViewBindingViewHolder.getBinding();
        if (Intrinsics.areEqual(decodingStatus, AudioDecodingStatusComponent.DecodingStatus.DecodingInProgress.INSTANCE)) {
            ProgressBar itemAudioMessageBotLoadProgress = binding.itemAudioMessageBotLoadProgress;
            Intrinsics.checkNotNullExpressionValue(itemAudioMessageBotLoadProgress, "itemAudioMessageBotLoadProgress");
            itemAudioMessageBotLoadProgress.setVisibility(0);
            AppCompatImageView itemAudioMessageBotLoadText = binding.itemAudioMessageBotLoadText;
            Intrinsics.checkNotNullExpressionValue(itemAudioMessageBotLoadText, "itemAudioMessageBotLoadText");
            itemAudioMessageBotLoadText.setVisibility(4);
        } else if (Intrinsics.areEqual(decodingStatus, AudioDecodingStatusComponent.DecodingStatus.ReadyToDecode.INSTANCE)) {
            ProgressBar itemAudioMessageBotLoadProgress2 = binding.itemAudioMessageBotLoadProgress;
            Intrinsics.checkNotNullExpressionValue(itemAudioMessageBotLoadProgress2, "itemAudioMessageBotLoadProgress");
            itemAudioMessageBotLoadProgress2.setVisibility(4);
            AppCompatImageView itemAudioMessageBotLoadText2 = binding.itemAudioMessageBotLoadText;
            Intrinsics.checkNotNullExpressionValue(itemAudioMessageBotLoadText2, "itemAudioMessageBotLoadText");
            itemAudioMessageBotLoadText2.setVisibility(0);
        } else {
            if (decodingStatus instanceof AudioDecodingStatusComponent.DecodingStatus.Decoded ? true : Intrinsics.areEqual(decodingStatus, AudioDecodingStatusComponent.DecodingStatus.None.INSTANCE)) {
                ProgressBar itemAudioMessageBotLoadProgress3 = binding.itemAudioMessageBotLoadProgress;
                Intrinsics.checkNotNullExpressionValue(itemAudioMessageBotLoadProgress3, "itemAudioMessageBotLoadProgress");
                itemAudioMessageBotLoadProgress3.setVisibility(8);
                AppCompatImageView itemAudioMessageBotLoadText3 = binding.itemAudioMessageBotLoadText;
                Intrinsics.checkNotNullExpressionValue(itemAudioMessageBotLoadText3, "itemAudioMessageBotLoadText");
                itemAudioMessageBotLoadText3.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$isDecodedPayload(AdapterDelegateViewBindingViewHolder<AudioMessageBotUiModel, ItemAudioMessageBotBinding> adapterDelegateViewBindingViewHolder, List<?> list) {
        return list != null && list.contains(AudioMessagePayload.DECODING) && (adapterDelegateViewBindingViewHolder.getItem().getDecodingStatus() instanceof AudioDecodingStatusComponent.DecodingStatus.Decoded);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AudioMessageBotDelegate.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.new_chat.list.adapter.delegates.AudioMessageBotDelegateKt$audioMessageBotDelegate$2$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends Lambda implements Function1<List<? extends Object>, Unit> {
        final /* synthetic */ AudioMessagePlayerDelegate $playerDelegate;
        final /* synthetic */ AdapterDelegateViewBindingViewHolder<AudioMessageBotUiModel, ItemAudioMessageBotBinding> $this_adapterDelegateViewBinding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(AdapterDelegateViewBindingViewHolder<AudioMessageBotUiModel, ItemAudioMessageBotBinding> adapterDelegateViewBindingViewHolder, AudioMessagePlayerDelegate audioMessagePlayerDelegate) {
            super(1);
            this.$this_adapterDelegateViewBinding = adapterDelegateViewBindingViewHolder;
            this.$playerDelegate = audioMessagePlayerDelegate;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends Object> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<? extends Object> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$this_adapterDelegateViewBinding.getBinding().itemAudioMessageBotView.botAudio(this.$this_adapterDelegateViewBinding.getItem().isPremium());
            Object firstOrNull = CollectionsKt.firstOrNull(it);
            if (AudioMessageBotDelegateKt$audioMessageBotDelegate$2.invoke$isDecodedPayload(this.$this_adapterDelegateViewBinding, firstOrNull instanceof List ? (List) firstOrNull : null)) {
                View view = this.$this_adapterDelegateViewBinding.itemView;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
                TransitionManager.beginDelayedTransition((ViewGroup) view, new ChangeBounds());
                AdapterDelegateViewBindingViewHolder<AudioMessageBotUiModel, ItemAudioMessageBotBinding> adapterDelegateViewBindingViewHolder = this.$this_adapterDelegateViewBinding;
                AudioMessageBotDelegateKt$audioMessageBotDelegate$2.invoke$bindDecoded(adapterDelegateViewBindingViewHolder, adapterDelegateViewBindingViewHolder.getItem().getDecodingStatus());
            } else {
                AdapterDelegateViewBindingViewHolder<AudioMessageBotUiModel, ItemAudioMessageBotBinding> adapterDelegateViewBindingViewHolder2 = this.$this_adapterDelegateViewBinding;
                AudioMessageBotDelegateKt$audioMessageBotDelegate$2.invoke$bindDecoded(adapterDelegateViewBindingViewHolder2, adapterDelegateViewBindingViewHolder2.getItem().getDecodingStatus());
            }
            this.$playerDelegate.bind(this.$this_adapterDelegateViewBinding.getItem());
            AppCompatImageView itemAudioMessageBotChangeVoice = this.$this_adapterDelegateViewBinding.getBinding().itemAudioMessageBotChangeVoice;
            Intrinsics.checkNotNullExpressionValue(itemAudioMessageBotChangeVoice, "itemAudioMessageBotChangeVoice");
            itemAudioMessageBotChangeVoice.setVisibility(this.$this_adapterDelegateViewBinding.getItem().isChangeVoiceAvailable() ? 0 : 8);
        }
    }
}
