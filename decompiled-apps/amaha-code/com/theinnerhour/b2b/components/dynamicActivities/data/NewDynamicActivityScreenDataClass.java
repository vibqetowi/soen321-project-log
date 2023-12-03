package com.theinnerhour.b2b.components.dynamicActivities.data;

import com.appsflyer.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import pl.a;
/* compiled from: NewDynamicActivityScreenDataClass.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012&\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J)\u0010\u0013\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\bHÆ\u0003JQ\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032(\b\u0002\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR1\u0010\u0006\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/components/dynamicActivities/data/NewDynamicActivityScreenDataClass;", "", "screenId", "", "slug", "ctaSlug", "data", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "getCtaSlug", "()Ljava/lang/String;", "getData", "()Ljava/util/HashMap;", "getScreenId", "getSlug", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class NewDynamicActivityScreenDataClass {
    private final String ctaSlug;
    private final HashMap<String, Object> data;
    private final String screenId;
    private final String slug;

    public NewDynamicActivityScreenDataClass(String str, String str2, String str3, HashMap<String, Object> hashMap) {
        e.u(str, "screenId", str2, "slug", str3, "ctaSlug");
        this.screenId = str;
        this.slug = str2;
        this.ctaSlug = str3;
        this.data = hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewDynamicActivityScreenDataClass copy$default(NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass, String str, String str2, String str3, HashMap hashMap, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = newDynamicActivityScreenDataClass.screenId;
        }
        if ((i6 & 2) != 0) {
            str2 = newDynamicActivityScreenDataClass.slug;
        }
        if ((i6 & 4) != 0) {
            str3 = newDynamicActivityScreenDataClass.ctaSlug;
        }
        if ((i6 & 8) != 0) {
            hashMap = newDynamicActivityScreenDataClass.data;
        }
        return newDynamicActivityScreenDataClass.copy(str, str2, str3, hashMap);
    }

    public final String component1() {
        return this.screenId;
    }

    public final String component2() {
        return this.slug;
    }

    public final String component3() {
        return this.ctaSlug;
    }

    public final HashMap<String, Object> component4() {
        return this.data;
    }

    public final NewDynamicActivityScreenDataClass copy(String screenId, String slug, String ctaSlug, HashMap<String, Object> hashMap) {
        i.g(screenId, "screenId");
        i.g(slug, "slug");
        i.g(ctaSlug, "ctaSlug");
        return new NewDynamicActivityScreenDataClass(screenId, slug, ctaSlug, hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewDynamicActivityScreenDataClass)) {
            return false;
        }
        NewDynamicActivityScreenDataClass newDynamicActivityScreenDataClass = (NewDynamicActivityScreenDataClass) obj;
        if (i.b(this.screenId, newDynamicActivityScreenDataClass.screenId) && i.b(this.slug, newDynamicActivityScreenDataClass.slug) && i.b(this.ctaSlug, newDynamicActivityScreenDataClass.ctaSlug) && i.b(this.data, newDynamicActivityScreenDataClass.data)) {
            return true;
        }
        return false;
    }

    public final String getCtaSlug() {
        return this.ctaSlug;
    }

    public final HashMap<String, Object> getData() {
        return this.data;
    }

    public final String getScreenId() {
        return this.screenId;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        int hashCode;
        int c10 = a.c(this.ctaSlug, a.c(this.slug, this.screenId.hashCode() * 31, 31), 31);
        HashMap<String, Object> hashMap = this.data;
        if (hashMap == null) {
            hashCode = 0;
        } else {
            hashCode = hashMap.hashCode();
        }
        return c10 + hashCode;
    }

    public String toString() {
        return "NewDynamicActivityScreenDataClass(screenId=" + this.screenId + ", slug=" + this.slug + ", ctaSlug=" + this.ctaSlug + ", data=" + this.data + ')';
    }
}
