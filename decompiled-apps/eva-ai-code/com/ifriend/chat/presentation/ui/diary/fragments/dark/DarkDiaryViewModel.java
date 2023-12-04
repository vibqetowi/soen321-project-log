package com.ifriend.chat.presentation.ui.diary.fragments.dark;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.chat.presentation.ui.diary.fragments.BaseDiaryViewModel;
import com.ifriend.chat.presentation.ui.diary.models.DiaryTheme;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.useCases.diary.GetDiaryNotesListUseCase;
import com.ifriend.domain.useCases.diary.OnDiaryShownUseCase;
import com.ifriend.domain.useCases.diary.RefreshDiaryUseCase;
import com.ifriend.domain.useCases.diary.ReplyDiaryNoteUseCase;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DarkDiaryViewModel.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/fragments/dark/DarkDiaryViewModel;", "Lcom/ifriend/chat/presentation/ui/diary/fragments/BaseDiaryViewModel;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "routerProvider", "Lcom/ifriend/base/navigation/api/RouterProvider;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "getDiaryNotesListUseCase", "Lcom/ifriend/domain/useCases/diary/GetDiaryNotesListUseCase;", "replyDiaryNoteUseCase", "Lcom/ifriend/domain/useCases/diary/ReplyDiaryNoteUseCase;", "refreshDiaryUseCase", "Lcom/ifriend/domain/useCases/diary/RefreshDiaryUseCase;", "onDiaryShownUseCase", "Lcom/ifriend/domain/useCases/diary/OnDiaryShownUseCase;", "logger", "Lcom/ifriend/common_utils/Logger;", "appEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "paymentResultFlow", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;", "(Lcom/ifriend/domain/CoroutineDispatchers;Lcom/ifriend/base/navigation/api/RouterProvider;Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/useCases/diary/GetDiaryNotesListUseCase;Lcom/ifriend/domain/useCases/diary/ReplyDiaryNoteUseCase;Lcom/ifriend/domain/useCases/diary/RefreshDiaryUseCase;Lcom/ifriend/domain/useCases/diary/OnDiaryShownUseCase;Lcom/ifriend/common_utils/Logger;Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DarkDiaryViewModel extends BaseDiaryViewModel {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public DarkDiaryViewModel(CoroutineDispatchers dispatchers, RouterProvider routerProvider, BotRepository botRepository, GetDiaryNotesListUseCase getDiaryNotesListUseCase, ReplyDiaryNoteUseCase replyDiaryNoteUseCase, RefreshDiaryUseCase refreshDiaryUseCase, OnDiaryShownUseCase onDiaryShownUseCase, Logger logger, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow) {
        super(dispatchers, appEventsEmitter, paymentResultFlow, routerProvider, botRepository, getDiaryNotesListUseCase, replyDiaryNoteUseCase, refreshDiaryUseCase, onDiaryShownUseCase, DiaryTheme.Dark.INSTANCE, logger);
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(routerProvider, "routerProvider");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(getDiaryNotesListUseCase, "getDiaryNotesListUseCase");
        Intrinsics.checkNotNullParameter(replyDiaryNoteUseCase, "replyDiaryNoteUseCase");
        Intrinsics.checkNotNullParameter(refreshDiaryUseCase, "refreshDiaryUseCase");
        Intrinsics.checkNotNullParameter(onDiaryShownUseCase, "onDiaryShownUseCase");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(appEventsEmitter, "appEventsEmitter");
        Intrinsics.checkNotNullParameter(paymentResultFlow, "paymentResultFlow");
    }
}
