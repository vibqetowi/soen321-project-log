package com.ifriend.registration.domain.useCase.facebook;

import androidx.autofill.HintConstants;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FacebookAccountData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ifriend/registration/domain/useCase/facebook/FacebookAccountData;", "", "email", "", "name", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "birthday", "Lcom/ifriend/domain/models/profile/Birthday;", "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/domain/models/profile/Gender;Lcom/ifriend/domain/models/profile/Birthday;)V", "getBirthday", "()Lcom/ifriend/domain/models/profile/Birthday;", "getEmail", "()Ljava/lang/String;", "getGender", "()Lcom/ifriend/domain/models/profile/Gender;", "getName", "domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FacebookAccountData {
    private final Birthday birthday;
    private final String email;
    private final Gender gender;
    private final String name;

    public FacebookAccountData(String email, String str, Gender gender, Birthday birthday) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.email = email;
        this.name = str;
        this.gender = gender;
        this.birthday = birthday;
    }

    public /* synthetic */ FacebookAccountData(String str, String str2, Gender gender, Birthday birthday, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : gender, (i & 8) != 0 ? null : birthday);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final Birthday getBirthday() {
        return this.birthday;
    }
}
