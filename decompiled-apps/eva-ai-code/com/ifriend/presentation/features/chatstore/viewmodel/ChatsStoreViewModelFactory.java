package com.ifriend.presentation.features.chatstore.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.bolts.AppLinks;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.chat.buy.BuyChatInteractor;
import com.ifriend.domain.logic.store.GetChatsStoreInteractor;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.features.chatstore.analytics.ChatsStoreAnalyticsInteractor;
import com.ifriend.presentation.features.chatstore.mapper.ChatStoreUiMapper;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatsStoreViewModelFactory.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\"Bh\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0015\u0010\f\u001a\u0011\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rj\u0002`\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J-\u0010\u001a\u001a\u0002H\u001b\"\b\b\u0000\u0010\u001b*\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016¢\u0006\u0002\u0010!R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0011\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rj\u0002`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "chatId", "", "getChatsStoreInteractor", "Lcom/ifriend/domain/logic/store/GetChatsStoreInteractor;", "chatStoreUiMapper", "Lcom/ifriend/presentation/features/chatstore/mapper/ChatStoreUiMapper;", "userBalanceRepository", "Lcom/ifriend/domain/data/user/UserBalanceRepository;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "paymentResultFlow", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;", "buyChatInteractor", "Lcom/ifriend/domain/logic/chat/buy/BuyChatInteractor;", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "chatsStoreAnalyticsInteractor", "Lcom/ifriend/presentation/features/chatstore/analytics/ChatsStoreAnalyticsInteractor;", "(Ljava/lang/String;Lcom/ifriend/domain/logic/store/GetChatsStoreInteractor;Lcom/ifriend/presentation/features/chatstore/mapper/ChatStoreUiMapper;Lcom/ifriend/domain/data/user/UserBalanceRepository;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;Lcom/ifriend/domain/logic/chat/buy/BuyChatInteractor;Lcom/ifriend/platform/tools/api/ResourceProvider;Lcom/ifriend/presentation/features/chatstore/analytics/ChatsStoreAnalyticsInteractor;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", AppLinks.KEY_NAME_EXTRAS, "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsStoreViewModelFactory implements ViewModelProvider.Factory {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final BuyChatInteractor buyChatInteractor;
    private final String chatId;
    private final ChatStoreUiMapper chatStoreUiMapper;
    private final ChatsStoreAnalyticsInteractor chatsStoreAnalyticsInteractor;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final GetChatsStoreInteractor getChatsStoreInteractor;
    private final PaymentResultFlow paymentResultFlow;
    private final ResourceProvider resourceProvider;
    private final UserBalanceRepository userBalanceRepository;

    /* compiled from: ChatsStoreViewModelFactory.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModelFactory$Factory;", "", "create", "Lcom/ifriend/presentation/features/chatstore/viewmodel/ChatsStoreViewModelFactory;", "chatId", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        ChatsStoreViewModelFactory create(String str);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return ViewModelProvider.Factory.CC.$default$create(this, cls);
    }

    @AssistedInject
    public ChatsStoreViewModelFactory(@Assisted String chatId, GetChatsStoreInteractor getChatsStoreInteractor, ChatStoreUiMapper chatStoreUiMapper, UserBalanceRepository userBalanceRepository, AppEventsEmitter appEventsEmitter, FlowObserverEmitter<Throwable> exceptionsEmitter, PaymentResultFlow paymentResultFlow, BuyChatInteractor buyChatInteractor, ResourceProvider resourceProvider, ChatsStoreAnalyticsInteractor chatsStoreAnalyticsInteractor) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(getChatsStoreInteractor, "getChatsStoreInteractor");
        Intrinsics.checkNotNullParameter(chatStoreUiMapper, "chatStoreUiMapper");
        Intrinsics.checkNotNullParameter(userBalanceRepository, "userBalanceRepository");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        Intrinsics.checkNotNullParameter(paymentResultFlow, "paymentResultFlow");
        Intrinsics.checkNotNullParameter(buyChatInteractor, "buyChatInteractor");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(chatsStoreAnalyticsInteractor, "chatsStoreAnalyticsInteractor");
        this.chatId = chatId;
        this.getChatsStoreInteractor = getChatsStoreInteractor;
        this.chatStoreUiMapper = chatStoreUiMapper;
        this.userBalanceRepository = userBalanceRepository;
        this.appEventsEmitter = appEventsEmitter;
        this.exceptionsEmitter = exceptionsEmitter;
        this.paymentResultFlow = paymentResultFlow;
        this.buyChatInteractor = buyChatInteractor;
        this.resourceProvider = resourceProvider;
        this.chatsStoreAnalyticsInteractor = chatsStoreAnalyticsInteractor;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass, CreationExtras extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (modelClass.isAssignableFrom(ChatsStoreViewModel.class)) {
            return new ChatsStoreViewModel(this.chatId, this.userBalanceRepository, this.getChatsStoreInteractor, this.chatStoreUiMapper, this.appEventsEmitter, this.exceptionsEmitter, this.paymentResultFlow, this.buyChatInteractor, this.resourceProvider, this.chatsStoreAnalyticsInteractor);
        }
        String simpleName = getClass().getSimpleName();
        throw new IllegalArgumentException("Unknown ViewModel class=" + simpleName);
    }
}
