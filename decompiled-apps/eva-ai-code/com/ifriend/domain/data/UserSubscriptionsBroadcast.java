package com.ifriend.domain.data;

import com.ifriend.domain.models.profile.user.Subscription;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: UserSubscriptionsBroadcast.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/data/UserSubscriptionsBroadcast;", "", "userSubscription", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/domain/models/profile/user/Subscription;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UserSubscriptionsBroadcast {
    Flow<Subscription> userSubscription();
}
