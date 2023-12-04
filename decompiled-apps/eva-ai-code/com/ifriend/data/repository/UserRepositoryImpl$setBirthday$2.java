package com.ifriend.data.repository;

import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.user.User;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: UserRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/domain/models/profile/user/User;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class UserRepositoryImpl$setBirthday$2 extends Lambda implements Function1<User, User> {
    final /* synthetic */ Birthday $birthday;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserRepositoryImpl$setBirthday$2(Birthday birthday) {
        super(1);
        this.$birthday = birthday;
    }

    @Override // kotlin.jvm.functions.Function1
    public final User invoke(User it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return User.copy$default(it, null, null, null, this.$birthday, null, null, 55, null);
    }
}
