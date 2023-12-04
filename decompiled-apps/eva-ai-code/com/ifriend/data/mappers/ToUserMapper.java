package com.ifriend.data.mappers;

import com.ifriend.data.networking.responses.UserDataResponse;
import com.ifriend.domain.models.Tag;
import com.ifriend.domain.models.TagKt;
import com.ifriend.domain.models.Tags;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.Subscription;
import com.ifriend.domain.models.profile.user.User;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UserMappers.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/data/mappers/ToUserMapper;", "", "toGenderMapper", "Lcom/ifriend/data/mappers/GenderFromBackendString;", "(Lcom/ifriend/data/mappers/GenderFromBackendString;)V", "map", "Lcom/ifriend/domain/models/profile/user/User;", "response", "Lcom/ifriend/data/networking/responses/UserDataResponse;", "auth", "Lcom/ifriend/domain/models/profile/user/AuthData;", "tags", "", "Lcom/ifriend/domain/models/Tag;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ToUserMapper {
    private final GenderFromBackendString toGenderMapper;

    @Inject
    public ToUserMapper(GenderFromBackendString toGenderMapper) {
        Intrinsics.checkNotNullParameter(toGenderMapper, "toGenderMapper");
        this.toGenderMapper = toGenderMapper;
    }

    public final User map(UserDataResponse response, AuthData auth, List<Tag> tags) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(auth, "auth");
        Intrinsics.checkNotNullParameter(tags, "tags");
        String name = response.getName();
        GenderFromBackendString genderFromBackendString = this.toGenderMapper;
        String gender = response.getGender();
        if (gender == null) {
            gender = "";
        }
        return new User(auth, name, genderFromBackendString.map(gender), Birthday.Companion.fromDatetime(response.getBirthday()), TagKt.contains(tags, Tags.SUBSCRIPTION) ? Subscription.PREMIUM : Subscription.NONE, response.getRegistrationMillis());
    }
}
