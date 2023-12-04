package com.ifriend.chat.presentation.ui.menu.userProfile;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
/* compiled from: UserProfileDeleteFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class UserProfileDeleteFragment$init$1 extends AdaptedFunctionReference implements Function2<DeleteProfileState, Continuation<? super Unit>, Object>, SuspendFunction {
    /* JADX INFO: Access modifiers changed from: package-private */
    public UserProfileDeleteFragment$init$1(Object obj) {
        super(2, obj, UserProfileDeleteFragment.class, "showState", "showState(Lcom/ifriend/chat/presentation/ui/menu/userProfile/DeleteProfileState;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(DeleteProfileState deleteProfileState, Continuation<? super Unit> continuation) {
        Object init$showState;
        init$showState = UserProfileDeleteFragment.init$showState((UserProfileDeleteFragment) this.receiver, deleteProfileState, continuation);
        return init$showState;
    }
}
