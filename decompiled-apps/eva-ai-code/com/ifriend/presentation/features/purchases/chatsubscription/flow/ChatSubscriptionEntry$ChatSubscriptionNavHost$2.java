package com.ifriend.presentation.features.purchases.chatsubscription.flow;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavHostController;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatSubscriptionEntry.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionEntry$ChatSubscriptionNavHost$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ NavHostController $featureNavController;
    final /* synthetic */ Function0<Unit> $onFeatureBackClick;
    final /* synthetic */ BuyChatSubscriptionBillingUiParams $params;
    final /* synthetic */ String $startDestination;
    final /* synthetic */ ChatSubscriptionEntry $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionEntry$ChatSubscriptionNavHost$2(ChatSubscriptionEntry chatSubscriptionEntry, NavHostController navHostController, String str, Function0<Unit> function0, BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, int i) {
        super(2);
        this.$tmp0_rcvr = chatSubscriptionEntry;
        this.$featureNavController = navHostController;
        this.$startDestination = str;
        this.$onFeatureBackClick = function0;
        this.$params = buyChatSubscriptionBillingUiParams;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.ChatSubscriptionNavHost(this.$featureNavController, this.$startDestination, this.$onFeatureBackClick, this.$params, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
