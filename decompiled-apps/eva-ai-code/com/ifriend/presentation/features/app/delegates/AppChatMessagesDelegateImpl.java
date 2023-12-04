package com.ifriend.presentation.features.app.delegates;

import androidx.lifecycle.ViewModelKt;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
/* compiled from: AppChatMessagesDelegate.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0016R\u00020\u0011¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ifriend/presentation/features/app/delegates/AppChatMessagesDelegateImpl;", "Lcom/ifriend/presentation/features/app/delegates/AppChatMessagesDelegate;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "chatsInfoInteractor", "Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;", "chatClientInteractor", "Lcom/ifriend/domain/logic/chat/ChatClientInteractor;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "userProfileRepository", "Lcom/ifriend/domain/data/user/UserProfileRepository;", "(Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/logic/chat/info/ChatsInfoInteractor;Lcom/ifriend/domain/logic/chat/ChatClientInteractor;Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/domain/data/user/UserProfileRepository;)V", "chatsLaunchJob", "Lkotlinx/coroutines/Job;", "startAppChatLaunchService", "", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;", "(Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppChatMessagesDelegateImpl implements AppChatMessagesDelegate {
    public static final int $stable = 8;
    private final ChatClientInteractor chatClientInteractor;
    private final ChatsInfoInteractor chatsInfoInteractor;
    private Job chatsLaunchJob;
    private final DispatcherProvider dispatcherProvider;
    private final UserProfileRepository userProfileRepository;
    private final UserRepository userRepository;

    @Inject
    public AppChatMessagesDelegateImpl(UserRepository userRepository, ChatsInfoInteractor chatsInfoInteractor, ChatClientInteractor chatClientInteractor, DispatcherProvider dispatcherProvider, UserProfileRepository userProfileRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(chatsInfoInteractor, "chatsInfoInteractor");
        Intrinsics.checkNotNullParameter(chatClientInteractor, "chatClientInteractor");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(userProfileRepository, "userProfileRepository");
        this.userRepository = userRepository;
        this.chatsInfoInteractor = chatsInfoInteractor;
        this.chatClientInteractor = chatClientInteractor;
        this.dispatcherProvider = dispatcherProvider;
        this.userProfileRepository = userProfileRepository;
    }

    @Override // com.ifriend.presentation.features.app.delegates.AppChatMessagesDelegate
    public void startAppChatLaunchService(AppViewModel context_receiver_0) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Job job = this.chatsLaunchJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(context_receiver_0), null, null, new AppChatMessagesDelegateImpl$startAppChatLaunchService$1(this, context_receiver_0, null), 3, null);
        this.chatsLaunchJob = launch$default;
    }
}
