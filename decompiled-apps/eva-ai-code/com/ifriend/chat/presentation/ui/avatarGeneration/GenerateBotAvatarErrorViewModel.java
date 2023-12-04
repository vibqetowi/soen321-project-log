package com.ifriend.chat.presentation.ui.avatarGeneration;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.domain.navigation.GenerateBotAvatarScreenFactory;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.generateAvatar.GenerateBotAvatarRepository;
import com.ifriend.ui.base.mvvm.BaseViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: GenerateBotAvatarErrorViewModel.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0006\u0010\u0015\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/ifriend/chat/presentation/ui/avatarGeneration/GenerateBotAvatarErrorViewModel;", "Lcom/ifriend/ui/base/mvvm/BaseViewModel;", "Lcom/ifriend/chat/presentation/ui/avatarGeneration/GenerateBotAvatarErrorState;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "generateBotAvatarRepository", "Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;", "generateBotAvatarScreenFactory", "Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;", "logger", "Lcom/ifriend/common_utils/Logger;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "(Lkotlinx/coroutines/CoroutineScope;Lcom/ifriend/domain/data/generateAvatar/GenerateBotAvatarRepository;Lcom/ifriend/chat/domain/navigation/GenerateBotAvatarScreenFactory;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/domain/CoroutineDispatchers;)V", "init", "", "onCoroutineError", "throwable", "", "tryAgain", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenerateBotAvatarErrorViewModel extends BaseViewModel<GenerateBotAvatarErrorState> {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final GenerateBotAvatarRepository generateBotAvatarRepository;
    private final GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory;
    private final Logger logger;
    private final RouterProvider router;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public GenerateBotAvatarErrorViewModel(CoroutineScope coroutineScope, GenerateBotAvatarRepository generateBotAvatarRepository, GenerateBotAvatarScreenFactory generateBotAvatarScreenFactory, Logger logger, RouterProvider router, CoroutineDispatchers dispatchers) {
        super(dispatchers, GenerateBotAvatarErrorState.INSTANCE);
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(generateBotAvatarRepository, "generateBotAvatarRepository");
        Intrinsics.checkNotNullParameter(generateBotAvatarScreenFactory, "generateBotAvatarScreenFactory");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.coroutineScope = coroutineScope;
        this.generateBotAvatarRepository = generateBotAvatarRepository;
        this.generateBotAvatarScreenFactory = generateBotAvatarScreenFactory;
        this.logger = logger;
        this.router = router;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.ui.base.mvvm.BaseViewModel
    public void onCoroutineError(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.logger.logException(throwable);
    }

    public final void init() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, getCoroutineErrorHandler(), null, new GenerateBotAvatarErrorViewModel$init$1(this, null), 2, null);
    }

    public final void tryAgain() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, getCoroutineErrorHandler(), null, new GenerateBotAvatarErrorViewModel$tryAgain$1(this, null), 2, null);
    }
}
