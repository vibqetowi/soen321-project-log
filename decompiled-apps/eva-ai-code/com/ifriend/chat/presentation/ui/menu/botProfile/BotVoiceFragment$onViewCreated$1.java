package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.ifriend.chat.presentation.databinding.FragmentBotVoiceBinding;
import com.ifriend.domain.models.profile.bot.BotVoice;
import com.ifriend.ui.R;
import com.ifriend.ui.adapter.CheckArrayAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BotVoiceFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "voices", "", "Lcom/ifriend/domain/models/profile/bot/BotVoice;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BotVoiceFragment$onViewCreated$1 extends Lambda implements Function1<List<? extends BotVoice>, Unit> {
    final /* synthetic */ BotVoiceFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotVoiceFragment$onViewCreated$1(BotVoiceFragment botVoiceFragment) {
        super(1);
        this.this$0 = botVoiceFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends BotVoice> list) {
        invoke2((List<BotVoice>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<BotVoice> list) {
        FragmentBotVoiceBinding binding;
        CheckArrayAdapter checkArrayAdapter;
        BotVoiceFragment botVoiceFragment = this.this$0;
        Context requireContext = botVoiceFragment.requireContext();
        Intrinsics.checkNotNull(list);
        List<BotVoice> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (BotVoice botVoice : list2) {
            arrayList.add(botVoice.getName());
        }
        botVoiceFragment.arrayAdapter = new CheckArrayAdapter(requireContext, arrayList, R.layout.button_list, com.ifriend.chat.presentation.R.id.text, R.id.check);
        binding = this.this$0.getBinding();
        ListView listView = binding.items;
        final BotVoiceFragment botVoiceFragment2 = this.this$0;
        checkArrayAdapter = botVoiceFragment2.arrayAdapter;
        listView.setAdapter((ListAdapter) checkArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.ifriend.chat.presentation.ui.menu.botProfile.BotVoiceFragment$onViewCreated$1$$ExternalSyntheticLambda0
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                BotVoiceFragment$onViewCreated$1.invoke$lambda$2$lambda$1(BotVoiceFragment.this, adapterView, view, i, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1(BotVoiceFragment this$0, AdapterView adapterView, View view, int i, long j) {
        BotVoiceViewModel viewModel;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        viewModel = this$0.getViewModel();
        viewModel.onVoiceClick(i);
    }
}
