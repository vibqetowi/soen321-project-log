package com.ifriend.presentation.features.chatsettings.delegates;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.utils.CoroutinesKt;
import com.ifriend.domain.useCases.levels.GetLevelInfoUseCase;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import com.ifriend.presentation.features.chatsettings.viewmodel.ChatSettingsViewModel;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatSettingsLevelsDelegate.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B&\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0015\u0010\u0004\u001a\u0011\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005j\u0002`\b¢\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u0016R\u00020\f¢\u0006\u0002\u0010\rR\u001d\u0010\u0004\u001a\u0011\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005j\u0002`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/presentation/features/chatsettings/delegates/ChatSettingsLevelsDelegateImpl;", "Lcom/ifriend/presentation/features/chatsettings/delegates/ChatSettingsLevelsDelegate;", "getLevelInfoUseCase", "Lcom/ifriend/domain/useCases/levels/GetLevelInfoUseCase;", "exceptionsEmitter", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "(Lcom/ifriend/domain/useCases/levels/GetLevelInfoUseCase;Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;)V", "initChatSettingsLevelsDelegate", "", "Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel;", "(Lcom/ifriend/presentation/features/chatsettings/viewmodel/ChatSettingsViewModel;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSettingsLevelsDelegateImpl implements ChatSettingsLevelsDelegate {
    public static final int $stable = 8;
    private final FlowObserverEmitter<Throwable> exceptionsEmitter;
    private final GetLevelInfoUseCase getLevelInfoUseCase;

    @Inject
    public ChatSettingsLevelsDelegateImpl(GetLevelInfoUseCase getLevelInfoUseCase, FlowObserverEmitter<Throwable> exceptionsEmitter) {
        Intrinsics.checkNotNullParameter(getLevelInfoUseCase, "getLevelInfoUseCase");
        Intrinsics.checkNotNullParameter(exceptionsEmitter, "exceptionsEmitter");
        this.getLevelInfoUseCase = getLevelInfoUseCase;
        this.exceptionsEmitter = exceptionsEmitter;
    }

    @Override // com.ifriend.presentation.features.chatsettings.delegates.ChatSettingsLevelsDelegate
    public void initChatSettingsLevelsDelegate(ChatSettingsViewModel context_receiver_0) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        CoroutinesKt.safeLaunch$default(ViewModelKt.getViewModelScope(context_receiver_0), new ChatSettingsLevelsDelegateImpl$initChatSettingsLevelsDelegate$1(this, null), null, new ChatSettingsLevelsDelegateImpl$initChatSettingsLevelsDelegate$2(this, context_receiver_0, null), 2, null);
    }
}
