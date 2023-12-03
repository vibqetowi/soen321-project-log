package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: MatchingResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/Clinics;", "", "id", "", SessionManager.KEY_NAME, "", "wday", "Lcom/theinnerhour/b2b/components/onboarding/model/Wday;", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/theinnerhour/b2b/components/onboarding/model/Wday;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getWday", "()Lcom/theinnerhour/b2b/components/onboarding/model/Wday;", "setWday", "(Lcom/theinnerhour/b2b/components/onboarding/model/Wday;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Lcom/theinnerhour/b2b/components/onboarding/model/Wday;)Lcom/theinnerhour/b2b/components/onboarding/model/Clinics;", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Clinics {
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Integer f11503id;
    @b(SessionManager.KEY_NAME)
    private String name;
    @b("wday")
    private Wday wday;

    public Clinics() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Clinics copy$default(Clinics clinics, Integer num, String str, Wday wday, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            num = clinics.f11503id;
        }
        if ((i6 & 2) != 0) {
            str = clinics.name;
        }
        if ((i6 & 4) != 0) {
            wday = clinics.wday;
        }
        return clinics.copy(num, str, wday);
    }

    public final Integer component1() {
        return this.f11503id;
    }

    public final String component2() {
        return this.name;
    }

    public final Wday component3() {
        return this.wday;
    }

    public final Clinics copy(Integer num, String str, Wday wday) {
        return new Clinics(num, str, wday);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Clinics)) {
            return false;
        }
        Clinics clinics = (Clinics) obj;
        if (i.b(this.f11503id, clinics.f11503id) && i.b(this.name, clinics.name) && i.b(this.wday, clinics.wday)) {
            return true;
        }
        return false;
    }

    public final Integer getId() {
        return this.f11503id;
    }

    public final String getName() {
        return this.name;
    }

    public final Wday getWday() {
        return this.wday;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.f11503id;
        int i6 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.name;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Wday wday = this.wday;
        if (wday != null) {
            i6 = wday.hashCode();
        }
        return i11 + i6;
    }

    public final void setId(Integer num) {
        this.f11503id = num;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setWday(Wday wday) {
        this.wday = wday;
    }

    public String toString() {
        return "Clinics(id=" + this.f11503id + ", name=" + this.name + ", wday=" + this.wday + ')';
    }

    public Clinics(Integer num, String str, Wday wday) {
        this.f11503id = num;
        this.name = str;
        this.wday = wday;
    }

    public /* synthetic */ Clinics(Integer num, String str, Wday wday, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : num, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? new Wday(null, null, null, null, null, null, null, 127, null) : wday);
    }
}
