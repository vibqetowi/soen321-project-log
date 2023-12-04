package com.ifriend.chat.presentation.di.changingVoice;

import com.ifriend.chat.presentation.ui.menu.botProfile.ChangeVoiceScreenFactoryImpl;
import com.ifriend.presentation.temp.ChangeVoiceScreenFactory;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
/* compiled from: ChangingVoiceModule.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/ifriend/chat/presentation/di/changingVoice/ChangingVoiceModule;", "", "previewChangeVoiceScreenFactory", "Lcom/ifriend/presentation/temp/ChangeVoiceScreenFactory;", "changeVoiceScreenFactory", "Lcom/ifriend/chat/presentation/ui/menu/botProfile/ChangeVoiceScreenFactoryImpl;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface ChangingVoiceModule {
    @Binds
    ChangeVoiceScreenFactory previewChangeVoiceScreenFactory(ChangeVoiceScreenFactoryImpl changeVoiceScreenFactoryImpl);
}
