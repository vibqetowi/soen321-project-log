package com.ifriend.chat.presentation.ui.avatarGeneration;

import android.view.View;
import com.ifriend.base.navigation.api.cicerone.Screen;
import com.ifriend.chat.presentation.databinding.FragmentSelectGeneratedAvatarBinding;
import com.ifriend.chat.presentation.ui.avatarGeneration.analytics.AvatarGenerationAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: SelectGeneratedAvatarFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SelectGeneratedAvatarFragment$initOnClickListeners$1$2 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ FragmentSelectGeneratedAvatarBinding $this_with;
    final /* synthetic */ SelectGeneratedAvatarFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectGeneratedAvatarFragment$initOnClickListeners$1$2(FragmentSelectGeneratedAvatarBinding fragmentSelectGeneratedAvatarBinding, SelectGeneratedAvatarFragment selectGeneratedAvatarFragment) {
        super(1);
        this.$this_with = fragmentSelectGeneratedAvatarBinding;
        this.this$0 = selectGeneratedAvatarFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view) {
        Screen generateBotAvatarScreen = this.this$0.getGenerateBotAvatarScreenFactory().getGenerateBotAvatarScreen(this.$this_with.avatarDescription.getText().toString());
        AvatarGenerationAnalytics.INSTANCE.trackGenerateAvatarStartOver();
        this.this$0.getRouter().navigateTo(generateBotAvatarScreen);
        this.$this_with.editDescriptionIcon.setEnabled(false);
    }
}
