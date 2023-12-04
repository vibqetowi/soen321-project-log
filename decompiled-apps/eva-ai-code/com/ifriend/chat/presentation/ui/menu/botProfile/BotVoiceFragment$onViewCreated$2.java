package com.ifriend.chat.presentation.ui.menu.botProfile;

import com.ifriend.domain.models.profile.bot.BotVoice;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BotVoiceFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "voiceId", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BotVoiceFragment$onViewCreated$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ BotVoiceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotVoiceFragment$onViewCreated$2(BotVoiceFragment botVoiceFragment) {
        super(1);
        this.this$0 = botVoiceFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        BotVoiceViewModel viewModel;
        viewModel = this.this$0.getViewModel();
        List<BotVoice> value = viewModel.getAvailableVoices().getValue();
        if (value != null) {
            Iterator<BotVoice> it = value.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next().getId(), str)) {
                    break;
                } else {
                    i++;
                }
            }
            this.this$0.chooseVoice(i);
        }
    }
}
