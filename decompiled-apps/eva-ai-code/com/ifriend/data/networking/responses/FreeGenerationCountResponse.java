package com.ifriend.data.networking.responses;

import kotlin.Metadata;
/* compiled from: FreeGenerationCountResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ifriend/data/networking/responses/FreeGenerationCountResponse;", "", "count", "", "(I)V", "getCount", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreeGenerationCountResponse {
    private final int count;

    public static /* synthetic */ FreeGenerationCountResponse copy$default(FreeGenerationCountResponse freeGenerationCountResponse, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = freeGenerationCountResponse.count;
        }
        return freeGenerationCountResponse.copy(i);
    }

    public final int component1() {
        return this.count;
    }

    public final FreeGenerationCountResponse copy(int i) {
        return new FreeGenerationCountResponse(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FreeGenerationCountResponse) && this.count == ((FreeGenerationCountResponse) obj).count;
    }

    public int hashCode() {
        return this.count;
    }

    public String toString() {
        int i = this.count;
        return "FreeGenerationCountResponse(count=" + i + ")";
    }

    public FreeGenerationCountResponse(int i) {
        this.count = i;
    }

    public final int getCount() {
        return this.count;
    }
}
