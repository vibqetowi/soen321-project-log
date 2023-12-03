package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: MatchingResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/Languages;", "", "id", "", SessionManager.KEY_NAME, "", "slug", "(ILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "setId", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSlug", "setSlug", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Languages {
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private int f11505id;
    @b(SessionManager.KEY_NAME)
    private String name;
    @b("slug")
    private String slug;

    public Languages(int i6, String str, String str2) {
        this.f11505id = i6;
        this.name = str;
        this.slug = str2;
    }

    public static /* synthetic */ Languages copy$default(Languages languages, int i6, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = languages.f11505id;
        }
        if ((i10 & 2) != 0) {
            str = languages.name;
        }
        if ((i10 & 4) != 0) {
            str2 = languages.slug;
        }
        return languages.copy(i6, str, str2);
    }

    public final int component1() {
        return this.f11505id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.slug;
    }

    public final Languages copy(int i6, String str, String str2) {
        return new Languages(i6, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Languages)) {
            return false;
        }
        Languages languages = (Languages) obj;
        if (this.f11505id == languages.f11505id && i.b(this.name, languages.name) && i.b(this.slug, languages.slug)) {
            return true;
        }
        return false;
    }

    public final int getId() {
        return this.f11505id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        int hashCode;
        int i6 = this.f11505id * 31;
        String str = this.name;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (i6 + hashCode) * 31;
        String str2 = this.slug;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    public final void setId(int i6) {
        this.f11505id = i6;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSlug(String str) {
        this.slug = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Languages(id=");
        sb2.append(this.f11505id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", slug=");
        return g.c(sb2, this.slug, ')');
    }

    public /* synthetic */ Languages(int i6, String str, String str2, int i10, d dVar) {
        this(i6, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}
