package com.ifriend.data.repository;

import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.user.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: UserRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/domain/models/profile/user/User;", "user", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class UserRepositoryImpl$setGender$2 extends Lambda implements Function1<User, User> {
    final /* synthetic */ Gender $gender;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$setGender$2(Gender gender) {
        super(1);
        this.$gender = gender;
    }

    @Override // kotlin.jvm.functions.Function1
    public final User invoke(User user) {
        Intrinsics.checkNotNullParameter(user, "user");
        return User.copy$default(user, null, null, this.$gender, null, null, null, 59, null);
    }
}
