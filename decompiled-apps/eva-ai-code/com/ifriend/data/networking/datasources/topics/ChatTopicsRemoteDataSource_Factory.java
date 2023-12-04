package com.ifriend.data.networking.datasources.topics;

import com.ifriend.data.networking.api.topics.TopicsApi;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatTopicsRemoteDataSource_Factory implements Factory<ChatTopicsRemoteDataSource> {
    private final Provider<TopicsApi> topicsApiProvider;

    public ChatTopicsRemoteDataSource_Factory(Provider<TopicsApi> provider) {
        this.topicsApiProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatTopicsRemoteDataSource get() {
        return newInstance(this.topicsApiProvider.get());
    }

    public static ChatTopicsRemoteDataSource_Factory create(Provider<TopicsApi> provider) {
        return new ChatTopicsRemoteDataSource_Factory(provider);
    }

    public static ChatTopicsRemoteDataSource newInstance(TopicsApi topicsApi) {
        return new ChatTopicsRemoteDataSource(topicsApi);
    }
}
