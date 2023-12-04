package com.ifriend.domain.models.profile.user;

import androidx.autofill.HintConstants;
import com.ifriend.domain.models.Tags;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: User.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0018JR\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016¨\u0006,"}, d2 = {"Lcom/ifriend/domain/models/profile/user/User;", "", "auth", "Lcom/ifriend/domain/models/profile/user/AuthData;", "name", "", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "birthday", "Lcom/ifriend/domain/models/profile/Birthday;", Tags.SUBSCRIPTION, "Lcom/ifriend/domain/models/profile/user/Subscription;", "registrationDate", "", "(Lcom/ifriend/domain/models/profile/user/AuthData;Ljava/lang/String;Lcom/ifriend/domain/models/profile/Gender;Lcom/ifriend/domain/models/profile/Birthday;Lcom/ifriend/domain/models/profile/user/Subscription;Ljava/lang/Long;)V", "getAuth", "()Lcom/ifriend/domain/models/profile/user/AuthData;", "getBirthday", "()Lcom/ifriend/domain/models/profile/Birthday;", "getGender", "()Lcom/ifriend/domain/models/profile/Gender;", "getName", "()Ljava/lang/String;", "getRegistrationDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSubscription", "()Lcom/ifriend/domain/models/profile/user/Subscription;", "userIdValue", "getUserIdValue", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/ifriend/domain/models/profile/user/AuthData;Ljava/lang/String;Lcom/ifriend/domain/models/profile/Gender;Lcom/ifriend/domain/models/profile/Birthday;Lcom/ifriend/domain/models/profile/user/Subscription;Ljava/lang/Long;)Lcom/ifriend/domain/models/profile/user/User;", "equals", "", "other", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class User {
    private final AuthData auth;
    private final Birthday birthday;
    private final Gender gender;
    private final String name;
    private final Long registrationDate;
    private final Subscription subscription;

    public static /* synthetic */ User copy$default(User user, AuthData authData, String str, Gender gender, Birthday birthday, Subscription subscription, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            authData = user.auth;
        }
        if ((i & 2) != 0) {
            str = user.name;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            gender = user.gender;
        }
        Gender gender2 = gender;
        if ((i & 8) != 0) {
            birthday = user.birthday;
        }
        Birthday birthday2 = birthday;
        if ((i & 16) != 0) {
            subscription = user.subscription;
        }
        Subscription subscription2 = subscription;
        if ((i & 32) != 0) {
            l = user.registrationDate;
        }
        return user.copy(authData, str2, gender2, birthday2, subscription2, l);
    }

    public final AuthData component1() {
        return this.auth;
    }

    public final String component2() {
        return this.name;
    }

    public final Gender component3() {
        return this.gender;
    }

    public final Birthday component4() {
        return this.birthday;
    }

    public final Subscription component5() {
        return this.subscription;
    }

    public final Long component6() {
        return this.registrationDate;
    }

    public final User copy(AuthData auth, String str, Gender gender, Birthday birthday, Subscription subscription, Long l) {
        Intrinsics.checkNotNullParameter(auth, "auth");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        return new User(auth, str, gender, birthday, subscription, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof User) {
            User user = (User) obj;
            return Intrinsics.areEqual(this.auth, user.auth) && Intrinsics.areEqual(this.name, user.name) && this.gender == user.gender && Intrinsics.areEqual(this.birthday, user.birthday) && this.subscription == user.subscription && Intrinsics.areEqual(this.registrationDate, user.registrationDate);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.auth.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Gender gender = this.gender;
        int hashCode3 = (hashCode2 + (gender == null ? 0 : gender.hashCode())) * 31;
        Birthday birthday = this.birthday;
        int hashCode4 = (((hashCode3 + (birthday == null ? 0 : birthday.hashCode())) * 31) + this.subscription.hashCode()) * 31;
        Long l = this.registrationDate;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public String toString() {
        AuthData authData = this.auth;
        String str = this.name;
        Gender gender = this.gender;
        Birthday birthday = this.birthday;
        Subscription subscription = this.subscription;
        Long l = this.registrationDate;
        return "User(auth=" + authData + ", name=" + str + ", gender=" + gender + ", birthday=" + birthday + ", subscription=" + subscription + ", registrationDate=" + l + ")";
    }

    public User(AuthData auth, String str, Gender gender, Birthday birthday, Subscription subscription, Long l) {
        Intrinsics.checkNotNullParameter(auth, "auth");
        Intrinsics.checkNotNullParameter(subscription, "subscription");
        this.auth = auth;
        this.name = str;
        this.gender = gender;
        this.birthday = birthday;
        this.subscription = subscription;
        this.registrationDate = l;
    }

    public final AuthData getAuth() {
        return this.auth;
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

    public final Subscription getSubscription() {
        return this.subscription;
    }

    public final Long getRegistrationDate() {
        return this.registrationDate;
    }

    public final String getUserIdValue() {
        return this.auth.getUserId().getValue();
    }
}
