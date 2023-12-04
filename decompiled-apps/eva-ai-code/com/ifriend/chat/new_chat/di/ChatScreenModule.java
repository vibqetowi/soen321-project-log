package com.ifriend.chat.new_chat.di;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import com.ifriend.base.di.Feature;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoader;
import com.ifriend.chat.new_chat.list.imageLoader.ImageLoaderImpl;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.player.AudioPlayerSettings;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.ui.base.di.ViewModelFactory;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatScreenModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\bH'¨\u0006\n"}, d2 = {"Lcom/ifriend/chat/new_chat/di/ChatScreenModule;", "", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/ifriend/ui/base/di/ViewModelFactory;", "imageLoader", "Lcom/ifriend/chat/new_chat/list/imageLoader/ImageLoader;", "Lcom/ifriend/chat/new_chat/list/imageLoader/ImageLoaderImpl;", "Companion", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module(includes = {SextingRequestModule.class})
/* loaded from: classes6.dex */
public interface ChatScreenModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Binds
    ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory viewModelFactory);

    @Feature
    @Binds
    ImageLoader imageLoader(ImageLoaderImpl imageLoaderImpl);

    /* compiled from: ChatScreenModule.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J2\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/new_chat/di/ChatScreenModule$Companion;", "", "()V", "audioAudioPlayerSettings", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayerSettings;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "audioPlayer", "Lcom/ifriend/chat/new_chat/list/player/AudioPlayer;", "context", "Landroid/content/Context;", "playerSettings", "screenLifecycle", "Landroidx/lifecycle/Lifecycle;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Feature
        public final AudioPlayer audioPlayer(@FeatureContext Context context, AudioPlayerSettings playerSettings, Lifecycle screenLifecycle, CoroutineDispatchers dispatchers, Logger logger) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(playerSettings, "playerSettings");
            Intrinsics.checkNotNullParameter(screenLifecycle, "screenLifecycle");
            Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new AudioPlayer(context, playerSettings, screenLifecycle, dispatchers, logger);
        }

        @Provides
        @Feature
        public final AudioPlayerSettings audioAudioPlayerSettings(UserRepository userRepository) {
            Intrinsics.checkNotNullParameter(userRepository, "userRepository");
            return new AudioPlayerSettings(userRepository);
        }
    }
}
