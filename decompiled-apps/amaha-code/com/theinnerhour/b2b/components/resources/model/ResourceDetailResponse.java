package com.theinnerhour.b2b.components.resources.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: ResourceDetailResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/theinnerhour/b2b/components/resources/model/ResourceDetailResponse;", "", "resourceDetailResponseData", "Lcom/theinnerhour/b2b/components/resources/model/ResourceDetailResponseData;", "(Lcom/theinnerhour/b2b/components/resources/model/ResourceDetailResponseData;)V", "getResourceDetailResponseData", "()Lcom/theinnerhour/b2b/components/resources/model/ResourceDetailResponseData;", "setResourceDetailResponseData", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ResourceDetailResponse {
    @b("data")
    private ResourceDetailResponseData resourceDetailResponseData;

    public ResourceDetailResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ ResourceDetailResponse copy$default(ResourceDetailResponse resourceDetailResponse, ResourceDetailResponseData resourceDetailResponseData, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            resourceDetailResponseData = resourceDetailResponse.resourceDetailResponseData;
        }
        return resourceDetailResponse.copy(resourceDetailResponseData);
    }

    public final ResourceDetailResponseData component1() {
        return this.resourceDetailResponseData;
    }

    public final ResourceDetailResponse copy(ResourceDetailResponseData resourceDetailResponseData) {
        return new ResourceDetailResponse(resourceDetailResponseData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ResourceDetailResponse) && i.b(this.resourceDetailResponseData, ((ResourceDetailResponse) obj).resourceDetailResponseData)) {
            return true;
        }
        return false;
    }

    public final ResourceDetailResponseData getResourceDetailResponseData() {
        return this.resourceDetailResponseData;
    }

    public int hashCode() {
        ResourceDetailResponseData resourceDetailResponseData = this.resourceDetailResponseData;
        if (resourceDetailResponseData == null) {
            return 0;
        }
        return resourceDetailResponseData.hashCode();
    }

    public final void setResourceDetailResponseData(ResourceDetailResponseData resourceDetailResponseData) {
        this.resourceDetailResponseData = resourceDetailResponseData;
    }

    public String toString() {
        return "ResourceDetailResponse(resourceDetailResponseData=" + this.resourceDetailResponseData + ')';
    }

    public ResourceDetailResponse(ResourceDetailResponseData resourceDetailResponseData) {
        this.resourceDetailResponseData = resourceDetailResponseData;
    }

    public /* synthetic */ ResourceDetailResponse(ResourceDetailResponseData resourceDetailResponseData, int i6, d dVar) {
        ResourceDetailResponse resourceDetailResponse;
        ResourceDetailResponseData resourceDetailResponseData2;
        if ((i6 & 1) != 0) {
            resourceDetailResponseData2 = new ResourceDetailResponseData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
            resourceDetailResponse = this;
        } else {
            resourceDetailResponse = this;
            resourceDetailResponseData2 = resourceDetailResponseData;
        }
        new ResourceDetailResponse(resourceDetailResponseData2);
    }
}
