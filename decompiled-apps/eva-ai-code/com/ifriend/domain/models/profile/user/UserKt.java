package com.ifriend.domain.models.profile.user;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: User.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isPremium", "", "Lcom/ifriend/domain/models/profile/user/User;", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserKt {
    public static final boolean isPremium(User user) {
        Intrinsics.checkNotNullParameter(user, "<this>");
        return user.getSubscription() == Subscription.PREMIUM;
    }
}
