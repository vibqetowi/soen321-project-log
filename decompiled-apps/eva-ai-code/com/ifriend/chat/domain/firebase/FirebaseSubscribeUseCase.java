package com.ifriend.chat.domain.firebase;

import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.networking.FirebaseApiRepository;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.useCases.AppConfigUseCase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: FirebaseSubscribeUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/domain/firebase/FirebaseSubscribeUseCase;", "", "preferences", "Lcom/ifriend/domain/data/Preferences;", "firebaseApiRepository", "Lcom/ifriend/domain/data/networking/FirebaseApiRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "appConfigUseCase", "Lcom/ifriend/domain/useCases/AppConfigUseCase;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/domain/data/Preferences;Lcom/ifriend/domain/data/networking/FirebaseApiRepository;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/useCases/AppConfigUseCase;Lkotlinx/coroutines/CoroutineScope;)V", "subscribe", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseSubscribeUseCase {
    private final AppConfigUseCase appConfigUseCase;
    private final CoroutineScope coroutineScope;
    private final FirebaseApiRepository firebaseApiRepository;
    private final Preferences preferences;
    private final UserRepository userRepository;

    public FirebaseSubscribeUseCase(Preferences preferences, FirebaseApiRepository firebaseApiRepository, UserRepository userRepository, AppConfigUseCase appConfigUseCase, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(firebaseApiRepository, "firebaseApiRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(appConfigUseCase, "appConfigUseCase");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.preferences = preferences;
        this.firebaseApiRepository = firebaseApiRepository;
        this.userRepository = userRepository;
        this.appConfigUseCase = appConfigUseCase;
        this.coroutineScope = coroutineScope;
    }

    public final Object subscribe(Continuation<? super Unit> continuation) {
        User currentUser = this.userRepository.getCurrentUser();
        if (currentUser == null) {
            return Unit.INSTANCE;
        }
        Object subscribe = this.firebaseApiRepository.subscribe(currentUser.getAuth().getUserId().getValue(), new FirebaseSubscribeUseCase$subscribe$2(this), continuation);
        return subscribe == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? subscribe : Unit.INSTANCE;
    }
}
