package com.ifriend.chat.presentation.ui.menu.botProfile.level;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
/* compiled from: LevelPopupDialog.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class LevelPopupDialog$onViewCreated$1 extends AdaptedFunctionReference implements Function2<LevelPopupState, Continuation<? super Unit>, Object>, SuspendFunction {
    /* JADX INFO: Access modifiers changed from: package-private */
    public LevelPopupDialog$onViewCreated$1(Object obj) {
        super(2, obj, LevelPopupDialog.class, "showState", "showState(Lcom/ifriend/chat/presentation/ui/menu/botProfile/level/LevelPopupState;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LevelPopupState levelPopupState, Continuation<? super Unit> continuation) {
        Object onViewCreated$showState;
        onViewCreated$showState = LevelPopupDialog.onViewCreated$showState((LevelPopupDialog) this.receiver, levelPopupState, continuation);
        return onViewCreated$showState;
    }
}
