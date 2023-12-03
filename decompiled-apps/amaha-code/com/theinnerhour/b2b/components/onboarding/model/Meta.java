package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: MatchingResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003JH\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0019\u0010\u000b\"\u0004\b\u001a\u0010\r¨\u0006'"}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/Meta;", "", "page", "", "limit", "total", "sortby", "", "orderby", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getLimit", "()Ljava/lang/Integer;", "setLimit", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getOrderby", "()Ljava/lang/String;", "setOrderby", "(Ljava/lang/String;)V", "getPage", "()I", "setPage", "(I)V", "getSortby", "setSortby", "getTotal", "setTotal", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/theinnerhour/b2b/components/onboarding/model/Meta;", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Meta {
    @b("limit")
    private Integer limit;
    @b("orderby")
    private String orderby;
    @b("page")
    private int page;
    @b("sortby")
    private String sortby;
    @b("total")
    private Integer total;

    public Meta() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Meta copy$default(Meta meta, int i6, Integer num, Integer num2, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i6 = meta.page;
        }
        if ((i10 & 2) != 0) {
            num = meta.limit;
        }
        Integer num3 = num;
        if ((i10 & 4) != 0) {
            num2 = meta.total;
        }
        Integer num4 = num2;
        if ((i10 & 8) != 0) {
            str = meta.sortby;
        }
        String str3 = str;
        if ((i10 & 16) != 0) {
            str2 = meta.orderby;
        }
        return meta.copy(i6, num3, num4, str3, str2);
    }

    public final int component1() {
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

    public final Meta copy(int i6, Integer num, Integer num2, String str, String str2) {
        return new Meta(i6, num, num2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Meta)) {
            return false;
        }
        Meta meta = (Meta) obj;
        if (this.page == meta.page && i.b(this.limit, meta.limit) && i.b(this.total, meta.total) && i.b(this.sortby, meta.sortby) && i.b(this.orderby, meta.orderby)) {
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

    public final int getPage() {
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
        int i6 = this.page * 31;
        Integer num = this.limit;
        int i10 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (i6 + hashCode) * 31;
        Integer num2 = this.total;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str = this.sortby;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str2 = this.orderby;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i13 + i10;
    }

    public final void setLimit(Integer num) {
        this.limit = num;
    }

    public final void setOrderby(String str) {
        this.orderby = str;
    }

    public final void setPage(int i6) {
        this.page = i6;
    }

    public final void setSortby(String str) {
        this.sortby = str;
    }

    public final void setTotal(Integer num) {
        this.total = num;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Meta(page=");
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

    public Meta(int i6, Integer num, Integer num2, String str, String str2) {
        this.page = i6;
        this.limit = num;
        this.total = num2;
        this.sortby = str;
        this.orderby = str2;
    }

    public /* synthetic */ Meta(int i6, Integer num, Integer num2, String str, String str2, int i10, d dVar) {
        this((i10 & 1) != 0 ? 0 : i6, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : str, (i10 & 16) == 0 ? str2 : null);
    }
}
