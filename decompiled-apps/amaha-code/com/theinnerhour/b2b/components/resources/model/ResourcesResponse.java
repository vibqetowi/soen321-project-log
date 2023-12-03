package com.theinnerhour.b2b.components.resources.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: ResourcesResponse.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0019\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003Jd\u0010*\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\nHÖ\u0001J\t\u00100\u001a\u00020\u0007HÖ\u0001R.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 ¨\u00061"}, d2 = {"Lcom/theinnerhour/b2b/components/resources/model/ResourcesResponse;", "", "data", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/resources/model/ResourceData;", "Lkotlin/collections/ArrayList;", "limit", "", "page", "totalRecords", "", "totalPage", "status", "Lcom/theinnerhour/b2b/components/resources/model/Status;", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/theinnerhour/b2b/components/resources/model/Status;)V", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "getLimit", "()Ljava/lang/String;", "setLimit", "(Ljava/lang/String;)V", "getPage", "setPage", "getStatus", "()Lcom/theinnerhour/b2b/components/resources/model/Status;", "setStatus", "(Lcom/theinnerhour/b2b/components/resources/model/Status;)V", "getTotalPage", "()Ljava/lang/Integer;", "setTotalPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTotalRecords", "setTotalRecords", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/theinnerhour/b2b/components/resources/model/Status;)Lcom/theinnerhour/b2b/components/resources/model/ResourcesResponse;", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ResourcesResponse {
    @b("data")
    private ArrayList<ResourceData> data;
    @b("limit")
    private String limit;
    @b("page")
    private String page;
    @b("status")
    private Status status;
    @b("total_page")
    private Integer totalPage;
    @b("total_records")
    private Integer totalRecords;

    public ResourcesResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ResourcesResponse copy$default(ResourcesResponse resourcesResponse, ArrayList arrayList, String str, String str2, Integer num, Integer num2, Status status, int i6, Object obj) {
        ArrayList<ResourceData> arrayList2 = arrayList;
        if ((i6 & 1) != 0) {
            arrayList2 = resourcesResponse.data;
        }
        if ((i6 & 2) != 0) {
            str = resourcesResponse.limit;
        }
        String str3 = str;
        if ((i6 & 4) != 0) {
            str2 = resourcesResponse.page;
        }
        String str4 = str2;
        if ((i6 & 8) != 0) {
            num = resourcesResponse.totalRecords;
        }
        Integer num3 = num;
        if ((i6 & 16) != 0) {
            num2 = resourcesResponse.totalPage;
        }
        Integer num4 = num2;
        if ((i6 & 32) != 0) {
            status = resourcesResponse.status;
        }
        return resourcesResponse.copy(arrayList2, str3, str4, num3, num4, status);
    }

    public final ArrayList<ResourceData> component1() {
        return this.data;
    }

    public final String component2() {
        return this.limit;
    }

    public final String component3() {
        return this.page;
    }

    public final Integer component4() {
        return this.totalRecords;
    }

    public final Integer component5() {
        return this.totalPage;
    }

    public final Status component6() {
        return this.status;
    }

    public final ResourcesResponse copy(ArrayList<ResourceData> data, String str, String str2, Integer num, Integer num2, Status status) {
        i.g(data, "data");
        return new ResourcesResponse(data, str, str2, num, num2, status);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourcesResponse)) {
            return false;
        }
        ResourcesResponse resourcesResponse = (ResourcesResponse) obj;
        if (i.b(this.data, resourcesResponse.data) && i.b(this.limit, resourcesResponse.limit) && i.b(this.page, resourcesResponse.page) && i.b(this.totalRecords, resourcesResponse.totalRecords) && i.b(this.totalPage, resourcesResponse.totalPage) && i.b(this.status, resourcesResponse.status)) {
            return true;
        }
        return false;
    }

    public final ArrayList<ResourceData> getData() {
        return this.data;
    }

    public final String getLimit() {
        return this.limit;
    }

    public final String getPage() {
        return this.page;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Integer getTotalPage() {
        return this.totalPage;
    }

    public final Integer getTotalRecords() {
        return this.totalRecords;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.data.hashCode() * 31;
        String str = this.limit;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode5 + hashCode) * 31;
        String str2 = this.page;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Integer num = this.totalRecords;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Integer num2 = this.totalPage;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Status status = this.status;
        if (status != null) {
            i6 = status.hashCode();
        }
        return i13 + i6;
    }

    public final void setData(ArrayList<ResourceData> arrayList) {
        i.g(arrayList, "<set-?>");
        this.data = arrayList;
    }

    public final void setLimit(String str) {
        this.limit = str;
    }

    public final void setPage(String str) {
        this.page = str;
    }

    public final void setStatus(Status status) {
        this.status = status;
    }

    public final void setTotalPage(Integer num) {
        this.totalPage = num;
    }

    public final void setTotalRecords(Integer num) {
        this.totalRecords = num;
    }

    public String toString() {
        return "ResourcesResponse(data=" + this.data + ", limit=" + this.limit + ", page=" + this.page + ", totalRecords=" + this.totalRecords + ", totalPage=" + this.totalPage + ", status=" + this.status + ')';
    }

    public ResourcesResponse(ArrayList<ResourceData> data, String str, String str2, Integer num, Integer num2, Status status) {
        i.g(data, "data");
        this.data = data;
        this.limit = str;
        this.page = str2;
        this.totalRecords = num;
        this.totalPage = num2;
        this.status = status;
    }

    public /* synthetic */ ResourcesResponse(ArrayList arrayList, String str, String str2, Integer num, Integer num2, Status status, int i6, d dVar) {
        this((i6 & 1) != 0 ? new ArrayList() : arrayList, (i6 & 2) != 0 ? null : str, (i6 & 4) != 0 ? null : str2, (i6 & 8) != 0 ? null : num, (i6 & 16) != 0 ? null : num2, (i6 & 32) != 0 ? new Status(null, null, 3, null) : status);
    }
}
