package com.ifriend.data.networking.responses;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UserDataResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ifriend/data/networking/responses/UserDataResponse;", "", "name", "", HintConstants.AUTOFILL_HINT_GENDER, "birthday", "tags", "", "registrationDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getBirthday", "()Ljava/lang/String;", "getGender", "getName", "getRegistrationDate", "registrationMillis", "", "getRegistrationMillis", "()Ljava/lang/Long;", "getTags", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserDataResponse {
    private static final Companion Companion = new Companion(null);
    private static final SimpleDateFormat withMillis = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
    private static final SimpleDateFormat withoutMillis = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
    private final String birthday;
    private final String gender;
    private final String name;
    @SerializedName("registration-date")
    private final String registrationDate;
    private final List<String> tags;

    public static /* synthetic */ UserDataResponse copy$default(UserDataResponse userDataResponse, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userDataResponse.name;
        }
        if ((i & 2) != 0) {
            str2 = userDataResponse.gender;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = userDataResponse.birthday;
        }
        String str6 = str3;
        List<String> list2 = list;
        if ((i & 8) != 0) {
            list2 = userDataResponse.tags;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            str4 = userDataResponse.registrationDate;
        }
        return userDataResponse.copy(str, str5, str6, list3, str4);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.gender;
    }

    public final String component3() {
        return this.birthday;
    }

    public final List<String> component4() {
        return this.tags;
    }

    public final String component5() {
        return this.registrationDate;
    }

    public final UserDataResponse copy(String str, String str2, String str3, List<String> list, String registrationDate) {
        Intrinsics.checkNotNullParameter(registrationDate, "registrationDate");
        return new UserDataResponse(str, str2, str3, list, registrationDate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserDataResponse) {
            UserDataResponse userDataResponse = (UserDataResponse) obj;
            return Intrinsics.areEqual(this.name, userDataResponse.name) && Intrinsics.areEqual(this.gender, userDataResponse.gender) && Intrinsics.areEqual(this.birthday, userDataResponse.birthday) && Intrinsics.areEqual(this.tags, userDataResponse.tags) && Intrinsics.areEqual(this.registrationDate, userDataResponse.registrationDate);
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.gender;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birthday;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.tags;
        return ((hashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.registrationDate.hashCode();
    }

    public String toString() {
        String str = this.name;
        String str2 = this.gender;
        String str3 = this.birthday;
        List<String> list = this.tags;
        String str4 = this.registrationDate;
        return "UserDataResponse(name=" + str + ", gender=" + str2 + ", birthday=" + str3 + ", tags=" + list + ", registrationDate=" + str4 + ")";
    }

    public UserDataResponse(String str, String str2, String str3, List<String> list, String registrationDate) {
        Intrinsics.checkNotNullParameter(registrationDate, "registrationDate");
        this.name = str;
        this.gender = str2;
        this.birthday = str3;
        this.tags = list;
        this.registrationDate = registrationDate;
    }

    public final String getName() {
        return this.name;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getRegistrationDate() {
        return this.registrationDate;
    }

    /* compiled from: UserDataResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ifriend/data/networking/responses/UserDataResponse$Companion;", "", "()V", "withMillis", "Ljava/text/SimpleDateFormat;", "getWithMillis", "()Ljava/text/SimpleDateFormat;", "withoutMillis", "getWithoutMillis", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SimpleDateFormat getWithMillis() {
            return UserDataResponse.withMillis;
        }

        public final SimpleDateFormat getWithoutMillis() {
            return UserDataResponse.withoutMillis;
        }
    }

    public final Long getRegistrationMillis() {
        try {
            Date parse = withMillis.parse(this.registrationDate);
            if (parse != null) {
                return Long.valueOf(parse.getTime());
            }
            return null;
        } catch (ParseException unused) {
            Date parse2 = withoutMillis.parse(this.registrationDate);
            if (parse2 != null) {
                return Long.valueOf(parse2.getTime());
            }
            return null;
        }
    }
}
