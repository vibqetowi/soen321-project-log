package com.ifriend.chat.new_chat.list.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager;
import com.hannesdorfmann.adapterdelegates4.AsyncListDifferDelegationAdapter;
import com.ifriend.chat.new_chat.list.adapter.delegates.AudioMessageBotDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.AudioMessageDecodedBotDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.AudioMessageUserDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.BotFlashingTypingDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.ChatEventDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.DateSeparatorDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.EndCallDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.GiftMessageDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.ImageMessageUserDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.OlderMessageDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.PhotoBotMessageDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.RegenerateMessageDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.TextMessageBotDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.TextMessageUserDelegateKt;
import com.ifriend.chat.new_chat.list.adapter.delegates.TopicSeparatorDelegateKt;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoader;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageBotUiModel;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUiModel;
import com.ifriend.chat.new_chat.list.ui.model.AudioMessageUserUiModel;
import com.ifriend.chat.new_chat.list.ui.model.DateSeparatorUiModel;
import com.ifriend.chat.new_chat.list.ui.model.TagHolder;
import com.ifriend.chat.new_chat.list.ui.model.TextMessageBotUiModel;
import com.ifriend.chat.new_chat.list.ui.model.TextMessageUserUiModel;
import com.ifriend.chat.new_chat.list.view.audio.AudioMessagePayload;
import com.ifriend.chat.new_chat.list.viewModel.ListItemsClick;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatListAdapter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/ifriend/chat/new_chat/list/adapter/ChatListAdapter;", "Lcom/hannesdorfmann/adapterdelegates4/AsyncListDifferDelegationAdapter;", "", "imageLoader", "Lcom/ifriend/chat/new_chat/list/imageLoader/ImageLoader;", "itemsClick", "Lcom/ifriend/chat/new_chat/list/viewModel/ListItemsClick;", "audioPlayer", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;", "(Lcom/ifriend/chat/new_chat/list/imageLoader/ImageLoader;Lcom/ifriend/chat/new_chat/list/viewModel/ListItemsClick;Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;)V", "DiffCallback", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatListAdapter extends AsyncListDifferDelegationAdapter<Object> {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ChatListAdapter(ImageLoader imageLoader, ListItemsClick itemsClick, AudioPlayer audioPlayer) {
        super(new DiffCallback());
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(itemsClick, "itemsClick");
        Intrinsics.checkNotNullParameter(audioPlayer, "audioPlayer");
        AdapterDelegatesManager<List<T>> adapterDelegatesManager = this.delegatesManager;
        ListItemsClick listItemsClick = itemsClick;
        adapterDelegatesManager.addDelegate(AudioMessageUserDelegateKt.audioMessageUserDelegate(listItemsClick, audioPlayer));
        adapterDelegatesManager.addDelegate(AudioMessageBotDelegateKt.audioMessageBotDelegate(listItemsClick, audioPlayer));
        adapterDelegatesManager.addDelegate(AudioMessageDecodedBotDelegateKt.audioMessageDecodedBotDelegate());
        adapterDelegatesManager.addDelegate(ImageMessageUserDelegateKt.imageMessageUserDelegate(imageLoader, itemsClick));
        adapterDelegatesManager.addDelegate(PhotoBotMessageDelegateKt.photoBotMessageDelegate(imageLoader, itemsClick));
        adapterDelegatesManager.addDelegate(OlderMessageDelegateKt.olderMessageDelegate(itemsClick));
        adapterDelegatesManager.addDelegate(ChatEventDelegateKt.chatEventDelegate());
        adapterDelegatesManager.addDelegate(BotFlashingTypingDelegateKt.botFlashingTypingDelegate());
        adapterDelegatesManager.addDelegate(DateSeparatorDelegateKt.dateSeparatorDelegate());
        adapterDelegatesManager.addDelegate(TopicSeparatorDelegateKt.darkTopicSeparatorDelegate());
        adapterDelegatesManager.addDelegate(TopicSeparatorDelegateKt.premiumTopicSeparatorDelegate());
        adapterDelegatesManager.addDelegate(EndCallDelegateKt.endCallDelegate());
        adapterDelegatesManager.addDelegate(TextMessageUserDelegateKt.textMessageUserDelegate());
        adapterDelegatesManager.addDelegate(TextMessageBotDelegateKt.textMessageBotDelegate());
        adapterDelegatesManager.addDelegate(TextMessageBotDelegateKt.textPaidTextMessageFromBotDelegate(itemsClick));
        adapterDelegatesManager.addDelegate(GiftMessageDelegateKt.giftMessageUserDelegate(imageLoader));
        adapterDelegatesManager.addDelegate(RegenerateMessageDelegateKt.regenerationMessageDelegate(itemsClick));
    }

    /* compiled from: ChatListAdapter.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0002J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\rH\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/ifriend/chat/new_chat/list/adapter/ChatListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "audioBotPayload", "", "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageBotUiModel;", "audioUserPayload", "Lcom/ifriend/chat/new_chat/list/ui/model/AudioMessageUserUiModel;", "getChangePayload", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class DiffCallback extends DiffUtil.ItemCallback<Object> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof DateSeparatorUiModel) && (newItem instanceof DateSeparatorUiModel)) {
                return Intrinsics.areEqual(((DateSeparatorUiModel) oldItem).getDate(), ((DateSeparatorUiModel) newItem).getDate());
            }
            if ((oldItem instanceof AudioMessageUiModel) && (newItem instanceof AudioMessageUiModel)) {
                return Intrinsics.areEqual(((AudioMessageUiModel) oldItem).getTag(), ((AudioMessageUiModel) newItem).getTag());
            }
            if ((oldItem instanceof TagHolder) && (newItem instanceof TagHolder)) {
                return Intrinsics.areEqual(((TagHolder) oldItem).getTag(), ((TagHolder) newItem).getTag());
            }
            return Intrinsics.areEqual(oldItem.getClass(), newItem.getClass());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof DateSeparatorUiModel) && (newItem instanceof DateSeparatorUiModel)) {
                return Intrinsics.areEqual(((DateSeparatorUiModel) oldItem).getDate(), ((DateSeparatorUiModel) newItem).getDate());
            }
            if ((oldItem instanceof TextMessageUserUiModel) && (newItem instanceof TextMessageUserUiModel)) {
                TextMessageUserUiModel textMessageUserUiModel = (TextMessageUserUiModel) oldItem;
                TextMessageUserUiModel textMessageUserUiModel2 = (TextMessageUserUiModel) newItem;
                return Intrinsics.areEqual(textMessageUserUiModel.getText().toString(), textMessageUserUiModel2.getText().toString()) && Intrinsics.areEqual(textMessageUserUiModel.getExperienceChange(), textMessageUserUiModel2.getExperienceChange());
            } else if ((oldItem instanceof TextMessageBotUiModel) && (newItem instanceof TextMessageBotUiModel)) {
                return Intrinsics.areEqual(((TextMessageBotUiModel) oldItem).getText().toString(), ((TextMessageBotUiModel) newItem).getText().toString());
            } else {
                return Intrinsics.areEqual(oldItem, newItem);
            }
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public Object getChangePayload(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof AudioMessageUserUiModel) && (newItem instanceof AudioMessageUserUiModel)) {
                return audioUserPayload((AudioMessageUserUiModel) oldItem, (AudioMessageUserUiModel) newItem);
            }
            if ((oldItem instanceof AudioMessageBotUiModel) && (newItem instanceof AudioMessageBotUiModel)) {
                return audioBotPayload((AudioMessageBotUiModel) oldItem, (AudioMessageBotUiModel) newItem);
            }
            return super.getChangePayload(oldItem, newItem);
        }

        private final List<Object> audioUserPayload(AudioMessageUserUiModel audioMessageUserUiModel, AudioMessageUserUiModel audioMessageUserUiModel2) {
            ArrayList arrayList = new ArrayList();
            if (!Intrinsics.areEqual(audioMessageUserUiModel.getPlaybackStatus(), audioMessageUserUiModel2.getPlaybackStatus())) {
                arrayList.add(AudioMessagePayload.PLAYBACK);
            }
            if (audioMessageUserUiModel.isSending() != audioMessageUserUiModel2.isSending()) {
                arrayList.add(AudioMessagePayload.UPLOAD);
            }
            return arrayList;
        }

        private final List<Object> audioBotPayload(AudioMessageBotUiModel audioMessageBotUiModel, AudioMessageBotUiModel audioMessageBotUiModel2) {
            ArrayList arrayList = new ArrayList();
            if (!Intrinsics.areEqual(audioMessageBotUiModel.getPlaybackStatus(), audioMessageBotUiModel2.getPlaybackStatus())) {
                arrayList.add(AudioMessagePayload.PLAYBACK);
            }
            if (!Intrinsics.areEqual(audioMessageBotUiModel.getDecodingStatus(), audioMessageBotUiModel2.getDecodingStatus())) {
                arrayList.add(AudioMessagePayload.DECODING);
            }
            return arrayList;
        }
    }
}
