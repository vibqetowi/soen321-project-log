package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: MatchingResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/Experience;", "", "year", "", "(Ljava/lang/Integer;)V", "getYear", "()Ljava/lang/Integer;", "setYear", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/theinnerhour/b2b/components/onboarding/model/Experience;", "equals", "", "other", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Experience {
    @b("year")
    private Integer year;

    public Experience() {
        this(null, 1, null);
    }

    public static /* synthetic */ Experience copy$default(Experience experience, Integer num, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            num = experience.year;
        }
        return experience.copy(num);
    }

    public final Integer component1() {
        return this.year;
    }

    public final Experience copy(Integer num) {
        return new Experience(num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Experience) && i.b(this.year, ((Experience) obj).year)) {
            return true;
        }
        return false;
    }

    public final Integer getYear() {
        return this.year;
    }

    public int hashCode() {
        Integer num = this.year;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final void setYear(Integer num) {
        this.year = num;
    }

    public String toString() {
        return "Experience(year=" + this.year + ')';
    }

    public Experience(Integer num) {
        this.year = num;
    }

    public /* synthetic */ Experience(Integer num, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : num);
    }
}
