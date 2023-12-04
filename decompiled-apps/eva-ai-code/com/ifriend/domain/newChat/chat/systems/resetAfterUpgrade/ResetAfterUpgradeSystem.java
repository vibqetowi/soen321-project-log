package com.ifriend.domain.newChat.chat.systems.resetAfterUpgrade;

import com.ifriend.common_entities_engine.CoroutineScopeSystem;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.domain.data.UserSubscriptionsBroadcast;
import com.ifriend.domain.models.profile.user.Subscription;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ResetAfterUpgradeSystem.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/resetAfterUpgrade/ResetAfterUpgradeSystem;", "Lcom/ifriend/common_entities_engine/CoroutineScopeSystem;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "subscriptionsBroadcast", "Lcom/ifriend/domain/data/UserSubscriptionsBroadcast;", "parentScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/ifriend/domain/data/UserSubscriptionsBroadcast;Lkotlinx/coroutines/CoroutineScope;)V", "lastSubscription", "Lcom/ifriend/domain/models/profile/user/Subscription;", "onStart", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResetAfterUpgradeSystem extends CoroutineScopeSystem<EntitiesState> {
    private Subscription lastSubscription;
    private final UserSubscriptionsBroadcast subscriptionsBroadcast;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetAfterUpgradeSystem(UserSubscriptionsBroadcast subscriptionsBroadcast, CoroutineScope parentScope) {
        super(parentScope);
        Intrinsics.checkNotNullParameter(subscriptionsBroadcast, "subscriptionsBroadcast");
        Intrinsics.checkNotNullParameter(parentScope, "parentScope");
        this.subscriptionsBroadcast = subscriptionsBroadcast;
    }

    @Override // com.ifriend.common_entities_engine.System
    public void onStart() {
        super.onStart();
        FlowKt.launchIn(FlowKt.onEach(this.subscriptionsBroadcast.userSubscription(), new ResetAfterUpgradeSystem$onStart$1(this, null)), this);
    }
}
