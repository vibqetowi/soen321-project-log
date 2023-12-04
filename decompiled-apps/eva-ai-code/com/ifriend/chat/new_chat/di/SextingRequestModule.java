package com.ifriend.chat.new_chat.di;

import com.ifriend.base.di.Feature;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ChatHistory;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.SextingRequestApi;
import com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.UserPreferencesChatHistory;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
/* compiled from: SextingRequestModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/new_chat/di/SextingRequestModule;", "", "bindChatHistory", "Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/ChatHistory;", "history", "Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/UserPreferencesChatHistory;", "Companion", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface SextingRequestModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Feature
    @Binds
    ChatHistory bindChatHistory(UserPreferencesChatHistory userPreferencesChatHistory);

    /* compiled from: SextingRequestModule.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/new_chat/di/SextingRequestModule$Companion;", "", "()V", "provideSextingRequestApi", "Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/SextingRequestApi;", "retrofit", "Lretrofit2/Retrofit;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Feature
        public final SextingRequestApi provideSextingRequestApi(Retrofit retrofit) {
            Intrinsics.checkNotNullParameter(retrofit, "retrofit");
            Object create = retrofit.create(SextingRequestApi.class);
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            return (SextingRequestApi) create;
        }
    }
}
