package com.theinnerhour.b2b.components.telecommunications.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: MatchedCompletedProviderListModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003JJ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\r¨\u0006%"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/MatchedCompletedProviderMeta;", "", "page", "", "limit", "total", "sortby", "", "orderby", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getLimit", "()Ljava/lang/Integer;", "setLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOrderby", "()Ljava/lang/String;", "setOrderby", "(Ljava/lang/String;)V", "getPage", "setPage", "getSortby", "setSortby", "getTotal", "setTotal", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/theinnerhour/b2b/components/telecommunications/model/MatchedCompletedProviderMeta;", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class MatchedCompletedProviderMeta {
    @b("limit")
    private Integer limit;
    @b("orderby")
    private String orderby;
    @b("page")
    private Integer page;
    @b("sortby")
    private String sortby;
    @b("total")
    private Integer total;

    public MatchedCompletedProviderMeta() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MatchedCompletedProviderMeta copy$default(MatchedCompletedProviderMeta matchedCompletedProviderMeta, Integer num, Integer num2, Integer num3, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            num = matchedCompletedProviderMeta.page;
        }
        if ((i6 & 2) != 0) {
            num2 = matchedCompletedProviderMeta.limit;
        }
        Integer num4 = num2;
        if ((i6 & 4) != 0) {
            num3 = matchedCompletedProviderMeta.total;
        }
        Integer num5 = num3;
        if ((i6 & 8) != 0) {
            str = matchedCompletedProviderMeta.sortby;
        }
        String str3 = str;
        if ((i6 & 16) != 0) {
            str2 = matchedCompletedProviderMeta.orderby;
        }
        return matchedCompletedProviderMeta.copy(num, num4, num5, str3, str2);
    }

    public final Integer component1() {
        return this.page;
    }

    public final Integer component2() {
        return this.limit;
    }

    public final Integer component3() {
        return this.total;
    }

    public final String component4() {
        return this.sortby;
    }

    public final String component5() {
        return this.orderby;
    }

    public final MatchedCompletedProviderMeta copy(Integer num, Integer num2, Integer num3, String str, String str2) {
        return new MatchedCompletedProviderMeta(num, num2, num3, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchedCompletedProviderMeta)) {
            return false;
        }
        MatchedCompletedProviderMeta matchedCompletedProviderMeta = (MatchedCompletedProviderMeta) obj;
        if (i.b(this.page, matchedCompletedProviderMeta.page) && i.b(this.limit, matchedCompletedProviderMeta.limit) && i.b(this.total, matchedCompletedProviderMeta.total) && i.b(this.sortby, matchedCompletedProviderMeta.sortby) && i.b(this.orderby, matchedCompletedProviderMeta.orderby)) {
            return true;
        }
        return false;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final String getOrderby() {
        return this.orderby;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final String getSortby() {
        return this.sortby;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Integer num = this.page;
        int i6 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = hashCode * 31;
        Integer num2 = this.limit;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num3 = this.total;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        String str = this.sortby;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        String str2 = this.orderby;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i13 + i6;
    }

    public final void setLimit(Integer num) {
        this.limit = num;
    }

    public final void setOrderby(String str) {
        this.orderby = str;
    }

    public final void setPage(Integer num) {
        this.page = num;
    }

    public final void setSortby(String str) {
        this.sortby = str;
    }

    public final void setTotal(Integer num) {
        this.total = num;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MatchedCompletedProviderMeta(page=");
        sb2.append(this.page);
        sb2.append(", limit=");
        sb2.append(this.limit);
        sb2.append(", total=");
        sb2.append(this.total);
        sb2.append(", sortby=");
        sb2.append(this.sortby);
        sb2.append(", orderby=");
        return g.c(sb2, this.orderby, ')');
    }

    public MatchedCompletedProviderMeta(Integer num, Integer num2, Integer num3, String str, String str2) {
        this.page = num;
        this.limit = num2;
        this.total = num3;
        this.sortby = str;
        this.orderby = str2;
    }

    public /* synthetic */ MatchedCompletedProviderMeta(Integer num, Integer num2, Integer num3, String str, String str2, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : num, (i6 & 2) != 0 ? null : num2, (i6 & 4) != 0 ? null : num3, (i6 & 8) != 0 ? null : str, (i6 & 16) != 0 ? null : str2);
    }
}
