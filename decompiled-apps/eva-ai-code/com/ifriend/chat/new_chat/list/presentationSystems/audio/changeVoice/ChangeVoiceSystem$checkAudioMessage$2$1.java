package com.ifriend.chat.new_chat.list.presentationSystems.audio.changeVoice;

import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.presentation.temp.ChangeVoiceScreenFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChangeVoiceSystem.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeVoiceSystem$checkAudioMessage$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ChangeVoiceSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeVoiceSystem$checkAudioMessage$2$1(ChangeVoiceSystem changeVoiceSystem) {
        super(0);
        this.this$0 = changeVoiceSystem;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        RouterProvider routerProvider;
        ChangeVoiceScreenFactory changeVoiceScreenFactory;
        routerProvider = this.this$0.router;
        AppRouter route = routerProvider.getRoute();
        changeVoiceScreenFactory = this.this$0.screenFactory;
        route.navigateTo(changeVoiceScreenFactory.changeVoiceScreen());
    }
}
