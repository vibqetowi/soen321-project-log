package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: MatchingResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006!"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/Educations;", "", "Id", "", "createdAt", "degree", "major", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getCreatedAt", "setCreatedAt", "getDegree", "setDegree", "getMajor", "setMajor", "getUpdatedAt", "setUpdatedAt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Educations {
    @b("_id")
    private String Id;
    @b("created_at")
    private String createdAt;
    @b("degree")
    private String degree;
    @b("major")
    private String major;
    @b("updated_at")
    private String updatedAt;

    public Educations() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Educations copy$default(Educations educations, String str, String str2, String str3, String str4, String str5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = educations.Id;
        }
        if ((i6 & 2) != 0) {
            str2 = educations.createdAt;
        }
        String str6 = str2;
        if ((i6 & 4) != 0) {
            str3 = educations.degree;
        }
        String str7 = str3;
        if ((i6 & 8) != 0) {
            str4 = educations.major;
        }
        String str8 = str4;
        if ((i6 & 16) != 0) {
            str5 = educations.updatedAt;
        }
        return educations.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.Id;
    }

    public final String component2() {
        return this.createdAt;
    }

    public final String component3() {
        return this.degree;
    }

    public final String component4() {
        return this.major;
    }

    public final String component5() {
        return this.updatedAt;
    }

    public final Educations copy(String str, String str2, String str3, String str4, String str5) {
        return new Educations(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Educations)) {
            return false;
        }
        Educations educations = (Educations) obj;
        if (i.b(this.Id, educations.Id) && i.b(this.createdAt, educations.createdAt) && i.b(this.degree, educations.degree) && i.b(this.major, educations.major) && i.b(this.updatedAt, educations.updatedAt)) {
            return true;
        }
        return false;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDegree() {
        return this.degree;
    }

    public final String getId() {
        return this.Id;
    }

    public final String getMajor() {
        return this.major;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.Id;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.createdAt;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str3 = this.degree;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str4 = this.major;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str5 = this.updatedAt;
        if (str5 != null) {
            i6 = str5.hashCode();
        }
        return i13 + i6;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final void setDegree(String str) {
        this.degree = str;
    }

    public final void setId(String str) {
        this.Id = str;
    }

    public final void setMajor(String str) {
        this.major = str;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Educations(Id=");
        sb2.append(this.Id);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", degree=");
        sb2.append(this.degree);
        sb2.append(", major=");
        sb2.append(this.major);
        sb2.append(", updatedAt=");
        return g.c(sb2, this.updatedAt, ')');
    }

    public Educations(String str, String str2, String str3, String str4, String str5) {
        this.Id = str;
        this.createdAt = str2;
        this.degree = str3;
        this.major = str4;
        this.updatedAt = str5;
    }

    public /* synthetic */ Educations(String str, String str2, String str3, String str4, String str5, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? null : str3, (i6 & 8) != 0 ? null : str4, (i6 & 16) != 0 ? null : str5);
    }
}
