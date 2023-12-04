package com.ifriend.chat.new_chat.list.player;

import android.content.Context;
import com.google.android.exoplayer2.database.StandaloneDatabaseProvider;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.models.profile.user.UserToken;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AudioPlayerSettings.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayerSettings;", "", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/domain/data/UserRepository;)V", "cacheEvictor", "Lcom/google/android/exoplayer2/upstream/cache/LeastRecentlyUsedCacheEvictor;", "cache", "Lcom/google/android/exoplayer2/upstream/cache/Cache;", "applicationContext", "Landroid/content/Context;", "cacheDataSource", "Lcom/google/android/exoplayer2/upstream/cache/CacheDataSource$Factory;", "cacheDir", "Ljava/io/File;", "clearCache", "", "context", "httpDataSource", "Lcom/google/android/exoplayer2/upstream/DefaultHttpDataSource$Factory;", "mediaSourceFactory", "Lcom/google/android/exoplayer2/source/DefaultMediaSourceFactory;", "release", "Companion", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AudioPlayerSettings {
    private static final String AUDIO_MESSAGE_CACHE_DIR = "audioMessageCache";
    private final LeastRecentlyUsedCacheEvictor cacheEvictor;
    private final UserRepository userRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public AudioPlayerSettings(UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.userRepository = userRepository;
        this.cacheEvictor = new LeastRecentlyUsedCacheEvictor(104857600L);
    }

    private final File cacheDir(Context context) {
        File file = new File(context.getCacheDir(), AUDIO_MESSAGE_CACHE_DIR);
        file.mkdir();
        return file;
    }

    private final Cache cache(Context context) {
        Cache cache;
        cache = AudioPlayerSettingsKt.cache;
        if (cache == null) {
            SimpleCache simpleCache = new SimpleCache(cacheDir(context), this.cacheEvictor, new StandaloneDatabaseProvider(context));
            AudioPlayerSettingsKt.cache = simpleCache;
            return simpleCache;
        }
        return cache;
    }

    private final DefaultHttpDataSource.Factory httpDataSource() {
        Map<String, String> emptyMap;
        AuthData auth;
        UserToken token;
        User currentUser = this.userRepository.getCurrentUser();
        String formatted = (currentUser == null || (auth = currentUser.getAuth()) == null || (token = auth.getToken()) == null) ? null : token.formatted();
        if (formatted == null || (emptyMap = MapsKt.mapOf(TuplesKt.to("Authorization", formatted))) == null) {
            emptyMap = MapsKt.emptyMap();
        }
        DefaultHttpDataSource.Factory defaultRequestProperties = new DefaultHttpDataSource.Factory().setDefaultRequestProperties(emptyMap);
        Intrinsics.checkNotNullExpressionValue(defaultRequestProperties, "setDefaultRequestProperties(...)");
        return defaultRequestProperties;
    }

    private final CacheDataSource.Factory cacheDataSource(Context context) {
        CacheDataSource.Factory flags = new CacheDataSource.Factory().setCache(cache(context)).setUpstreamDataSourceFactory(httpDataSource()).setFlags(2);
        Intrinsics.checkNotNullExpressionValue(flags, "setFlags(...)");
        return flags;
    }

    public final DefaultMediaSourceFactory mediaSourceFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(applicationContext);
        Intrinsics.checkNotNull(applicationContext);
        DefaultMediaSourceFactory dataSourceFactory = defaultMediaSourceFactory.setDataSourceFactory(cacheDataSource(applicationContext));
        Intrinsics.checkNotNullExpressionValue(dataSourceFactory, "setDataSourceFactory(...)");
        return dataSourceFactory;
    }

    public final void release() {
        Cache cache;
        cache = AudioPlayerSettingsKt.cache;
        if (cache != null) {
            cache.release();
        }
        AudioPlayerSettingsKt.cache = null;
    }

    public final void clearCache(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File[] listFiles = cacheDir(context).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                Intrinsics.checkNotNull(file);
                FilesKt.deleteRecursively(file);
            }
        }
    }

    /* compiled from: AudioPlayerSettings.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/new_chat/list/player/AudioPlayerSettings$Companion;", "", "()V", "AUDIO_MESSAGE_CACHE_DIR", "", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
