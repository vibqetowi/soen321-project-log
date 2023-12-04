package com.ifriend.chat.new_chat.list.adapter;

import com.ifriend.chat.new_chat.list.imageLoader.ImageLoader;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.viewModel.ListItemsClick;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatListAdapter_Factory implements Factory<ChatListAdapter> {
    private final Provider<AudioPlayer> audioPlayerProvider;
    private final Provider<ImageLoader> imageLoaderProvider;
    private final Provider<ListItemsClick> itemsClickProvider;

    public ChatListAdapter_Factory(Provider<ImageLoader> provider, Provider<ListItemsClick> provider2, Provider<AudioPlayer> provider3) {
        this.imageLoaderProvider = provider;
        this.itemsClickProvider = provider2;
        this.audioPlayerProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatListAdapter get() {
        return newInstance(this.imageLoaderProvider.get(), this.itemsClickProvider.get(), this.audioPlayerProvider.get());
    }

    public static ChatListAdapter_Factory create(Provider<ImageLoader> provider, Provider<ListItemsClick> provider2, Provider<AudioPlayer> provider3) {
        return new ChatListAdapter_Factory(provider, provider2, provider3);
    }

    public static ChatListAdapter newInstance(ImageLoader imageLoader, ListItemsClick listItemsClick, AudioPlayer audioPlayer) {
        return new ChatListAdapter(imageLoader, listItemsClick, audioPlayer);
    }
}
