package com.theinnerhour.b2b.components.inAppFunneling.model;

import com.appsflyer.R;
import com.google.firebase.database.Exclude;
import com.theinnerhour.b2b.utils.Constants;
import is.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: InAppPromptModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003Jx\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rH\u0007J\n\u0010,\u001a\u0004\u0018\u00010\u0003H\u0007J\t\u0010-\u001a\u00020\tHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R%\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptData;", "", "status", "", "uuidList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "type", "ranking", "", "slug", "providerType", "source", "", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getProviderType", "()Ljava/lang/String;", "getRanking", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSlug", "getSource", "()Ljava/util/List;", "setSource", "(Ljava/util/List;)V", "getStatus", "setStatus", "(Ljava/lang/String;)V", "getType", "getUuidList", "()Ljava/util/ArrayList;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptData;", "equals", "", "other", "getDistinctSourceList", "getReason", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class InAppPromptData {
    private final String providerType;
    private final Integer ranking;
    private final String slug;
    private List<String> source;
    private String status;
    private final String type;
    private final ArrayList<String> uuidList;

    public InAppPromptData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ InAppPromptData copy$default(InAppPromptData inAppPromptData, String str, ArrayList arrayList, String str2, Integer num, String str3, String str4, List list, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = inAppPromptData.status;
        }
        ArrayList<String> arrayList2 = arrayList;
        if ((i6 & 2) != 0) {
            arrayList2 = inAppPromptData.uuidList;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i6 & 4) != 0) {
            str2 = inAppPromptData.type;
        }
        String str5 = str2;
        if ((i6 & 8) != 0) {
            num = inAppPromptData.ranking;
        }
        Integer num2 = num;
        if ((i6 & 16) != 0) {
            str3 = inAppPromptData.slug;
        }
        String str6 = str3;
        if ((i6 & 32) != 0) {
            str4 = inAppPromptData.providerType;
        }
        String str7 = str4;
        List<String> list2 = list;
        if ((i6 & 64) != 0) {
            list2 = inAppPromptData.source;
        }
        return inAppPromptData.copy(str, arrayList3, str5, num2, str6, str7, list2);
    }

    public final String component1() {
        return this.status;
    }

    public final ArrayList<String> component2() {
        return this.uuidList;
    }

    public final String component3() {
        return this.type;
    }

    public final Integer component4() {
        return this.ranking;
    }

    public final String component5() {
        return this.slug;
    }

    public final String component6() {
        return this.providerType;
    }

    public final List<String> component7() {
        return this.source;
    }

    public final InAppPromptData copy(String status, ArrayList<String> arrayList, String str, Integer num, String str2, String str3, List<String> list) {
        i.g(status, "status");
        return new InAppPromptData(status, arrayList, str, num, str2, str3, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppPromptData)) {
            return false;
        }
        InAppPromptData inAppPromptData = (InAppPromptData) obj;
        if (i.b(this.status, inAppPromptData.status) && i.b(this.uuidList, inAppPromptData.uuidList) && i.b(this.type, inAppPromptData.type) && i.b(this.ranking, inAppPromptData.ranking) && i.b(this.slug, inAppPromptData.slug) && i.b(this.providerType, inAppPromptData.providerType) && i.b(this.source, inAppPromptData.source)) {
            return true;
        }
        return false;
    }

    @Exclude
    public final List<String> getDistinctSourceList() {
        List<String> list = this.source;
        if (list != null) {
            return u.a2(list);
        }
        return null;
    }

    public final String getProviderType() {
        return this.providerType;
    }

    public final Integer getRanking() {
        return this.ranking;
    }

    @Exclude
    public final String getReason() {
        int i6;
        List<String> list = this.source;
        if (list != null) {
            i6 = u.a2(list).size();
        } else {
            i6 = 0;
        }
        if (i6 > 1) {
            return "both";
        }
        List<String> list2 = this.source;
        if (list2 != null) {
            return (String) u.i2(list2);
        }
        return null;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final List<String> getSource() {
        return this.source;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public final ArrayList<String> getUuidList() {
        return this.uuidList;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.status.hashCode() * 31;
        ArrayList<String> arrayList = this.uuidList;
        int i6 = 0;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        int i10 = (hashCode6 + hashCode) * 31;
        String str = this.type;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.ranking;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str2 = this.slug;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str3 = this.providerType;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        List<String> list = this.source;
        if (list != null) {
            i6 = list.hashCode();
        }
        return i14 + i6;
    }

    public final void setSource(List<String> list) {
        this.source = list;
    }

    public final void setStatus(String str) {
        i.g(str, "<set-?>");
        this.status = str;
    }

    public String toString() {
        return "InAppPromptData(status=" + this.status + ", uuidList=" + this.uuidList + ", type=" + this.type + ", ranking=" + this.ranking + ", slug=" + this.slug + ", providerType=" + this.providerType + ", source=" + this.source + ')';
    }

    public InAppPromptData(String status, ArrayList<String> arrayList, String str, Integer num, String str2, String str3, List<String> list) {
        i.g(status, "status");
        this.status = status;
        this.uuidList = arrayList;
        this.type = str;
        this.ranking = num;
        this.slug = str2;
        this.providerType = str3;
        this.source = list;
    }

    public /* synthetic */ InAppPromptData(String str, ArrayList arrayList, String str2, Integer num, String str3, String str4, List list, int i6, d dVar) {
        this((i6 & 1) != 0 ? Constants.SUBSCRIPTION_NONE : str, (i6 & 2) != 0 ? null : arrayList, (i6 & 4) != 0 ? null : str2, (i6 & 8) != 0 ? null : num, (i6 & 16) != 0 ? null : str3, (i6 & 32) != 0 ? null : str4, (i6 & 64) == 0 ? list : null);
    }
}
