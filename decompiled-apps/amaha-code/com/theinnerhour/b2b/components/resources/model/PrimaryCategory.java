package com.theinnerhour.b2b.components.resources.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: ResourcesResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/theinnerhour/b2b/components/resources/model/PrimaryCategory;", "", "id", "", SessionManager.KEY_NAME, "", "slug", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getSlug", "setSlug", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/theinnerhour/b2b/components/resources/model/PrimaryCategory;", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class PrimaryCategory {
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Integer f11622id;
    @b(SessionManager.KEY_NAME)
    private String name;
    @b("slug")
    private String slug;

    public PrimaryCategory() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PrimaryCategory copy$default(PrimaryCategory primaryCategory, Integer num, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            num = primaryCategory.f11622id;
        }
        if ((i6 & 2) != 0) {
            str = primaryCategory.name;
        }
        if ((i6 & 4) != 0) {
            str2 = primaryCategory.slug;
        }
        return primaryCategory.copy(num, str, str2);
    }

    public final Integer component1() {
        return this.f11622id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.slug;
    }

    public final PrimaryCategory copy(Integer num, String str, String str2) {
        return new PrimaryCategory(num, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrimaryCategory)) {
            return false;
        }
        PrimaryCategory primaryCategory = (PrimaryCategory) obj;
        if (i.b(this.f11622id, primaryCategory.f11622id) && i.b(this.name, primaryCategory.name) && i.b(this.slug, primaryCategory.slug)) {
            return true;
        }
        return false;
    }

    public final Integer getId() {
        return this.f11622id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.f11622id;
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
        String str2 = this.slug;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i11 + i6;
    }

    public final void setId(Integer num) {
        this.f11622id = num;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setSlug(String str) {
        this.slug = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PrimaryCategory(id=");
        sb2.append(this.f11622id);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", slug=");
        return g.c(sb2, this.slug, ')');
    }

    public PrimaryCategory(Integer num, String str, String str2) {
        this.f11622id = num;
        this.name = str;
        this.slug = str2;
    }

    public /* synthetic */ PrimaryCategory(Integer num, String str, String str2, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : num, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : str2);
    }
}
