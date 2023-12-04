package com.ifriend.domain.models.profile;

import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: Birthday.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/ifriend/domain/models/profile/Birthday;", "", "datetime", "", "age", "", "(Ljava/lang/String;I)V", "getAge", "()I", "getDatetime", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "getDate", "Ljava/util/Date;", "hashCode", "toString", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Birthday {
    public static final Companion Companion = new Companion(null);
    private static final String FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private final int age;
    private final String datetime;

    public static /* synthetic */ Birthday copy$default(Birthday birthday, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = birthday.datetime;
        }
        if ((i2 & 2) != 0) {
            i = birthday.age;
        }
        return birthday.copy(str, i);
    }

    public final String component1() {
        return this.datetime;
    }

    public final int component2() {
        return this.age;
    }

    public final Birthday copy(String datetime, int i) {
        Intrinsics.checkNotNullParameter(datetime, "datetime");
        return new Birthday(datetime, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Birthday) {
            Birthday birthday = (Birthday) obj;
            return Intrinsics.areEqual(this.datetime, birthday.datetime) && this.age == birthday.age;
        }
        return false;
    }

    public int hashCode() {
        return (this.datetime.hashCode() * 31) + this.age;
    }

    public String toString() {
        String str = this.datetime;
        int i = this.age;
        return "Birthday(datetime=" + str + ", age=" + i + ")";
    }

    public Birthday(String datetime, int i) {
        Intrinsics.checkNotNullParameter(datetime, "datetime");
        this.datetime = datetime;
        this.age = i;
    }

    public final String getDatetime() {
        return this.datetime;
    }

    public final int getAge() {
        return this.age;
    }

    public final Date getDate() {
        return Format.INSTANCE.stringToDate(this.datetime);
    }

    /* compiled from: Birthday.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ifriend/domain/models/profile/Birthday$Companion;", "", "()V", "FORMAT", "", "getFORMAT", "()Ljava/lang/String;", "fromAge", "Lcom/ifriend/domain/models/profile/Birthday;", "age", "", "fromDatetime", "datetime", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getFORMAT() {
            return Birthday.FORMAT;
        }

        public final Birthday fromDatetime(String str) {
            if (str == null) {
                return null;
            }
            Format format = Format.INSTANCE;
            Date parse = new SimpleDateFormat(getFORMAT()).parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            return new Birthday(str, format.dateToAge(parse));
        }

        public final Birthday fromAge(int i) {
            return new Birthday(Format.INSTANCE.dateToString(Format.INSTANCE.ageToDate(i)), i);
        }
    }
}
