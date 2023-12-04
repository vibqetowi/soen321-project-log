package com.ifriend.chat.presentation.ui.avatarGeneration;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: GeneratingBotAvatarPlaceholderViewModel.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GeneratingBotAvatarPlaceholderState;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/domain/CoroutineDispatchers;)V", "init", "", "onButtonClick", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GeneratingBotAvatarPlaceholderViewModel extends BaseViewModel<GeneratingBotAvatarPlaceholderState> {
    public static final int $stable = 8;
    private final AppEventsEmitter appEventsEmitter;
    private final BotRepository botRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GeneratingBotAvatarPlaceholderViewModel(BotRepository botRepository, AppEventsEmitter appEventsEmitter, CoroutineDispatchers dispatchers) {
        super(dispatchers, GeneratingBotAvatarPlaceholderState.Companion.empty());
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.botRepository = botRepository;
        this.appEventsEmitter = appEventsEmitter;
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GeneratingBotAvatarPlaceholderViewModel$init$1(this, null), 3, null);
    }

    public final void onButtonClick() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new GeneratingBotAvatarPlaceholderViewModel$onButtonClick$1(this, null), 3, null);
    }
}
