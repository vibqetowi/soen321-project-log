package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: DeeplinkCodeResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/theinnerhour/b2b/network/model/DeeplinkCodeResponse;", "", "payload", "Lcom/theinnerhour/b2b/network/model/Payload;", "code", "", Constants.API_COURSE_LINK, "(Lcom/theinnerhour/b2b/network/model/Payload;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getLink", "setLink", "getPayload", "()Lcom/theinnerhour/b2b/network/model/Payload;", "setPayload", "(Lcom/theinnerhour/b2b/network/model/Payload;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class DeeplinkCodeResponse {
    @b("code")
    private String code;
    @b(Constants.API_COURSE_LINK)
    private String link;
    @b("payload")
    private Payload payload;

    public DeeplinkCodeResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DeeplinkCodeResponse copy$default(DeeplinkCodeResponse deeplinkCodeResponse, Payload payload, String str, String str2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            payload = deeplinkCodeResponse.payload;
        }
        if ((i6 & 2) != 0) {
            str = deeplinkCodeResponse.code;
        }
        if ((i6 & 4) != 0) {
            str2 = deeplinkCodeResponse.link;
        }
        return deeplinkCodeResponse.copy(payload, str, str2);
    }

    public final Payload component1() {
        return this.payload;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.link;
    }

    public final DeeplinkCodeResponse copy(Payload payload, String str, String str2) {
        return new DeeplinkCodeResponse(payload, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeeplinkCodeResponse)) {
            return false;
        }
        DeeplinkCodeResponse deeplinkCodeResponse = (DeeplinkCodeResponse) obj;
        if (i.b(this.payload, deeplinkCodeResponse.payload) && i.b(this.code, deeplinkCodeResponse.code) && i.b(this.link, deeplinkCodeResponse.link)) {
            return true;
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getLink() {
        return this.link;
    }

    public final Payload getPayload() {
        return this.payload;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Payload payload = this.payload;
        int i6 = 0;
        if (payload == null) {
            hashCode = 0;
        } else {
            hashCode = payload.hashCode();
        }
        int i10 = hashCode * 31;
        String str = this.code;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        String str2 = this.link;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i11 + i6;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setPayload(Payload payload) {
        this.payload = payload;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DeeplinkCodeResponse(payload=");
        sb2.append(this.payload);
        sb2.append(", code=");
        sb2.append(this.code);
        sb2.append(", link=");
        return g.c(sb2, this.link, ')');
    }

    public DeeplinkCodeResponse(Payload payload, String str, String str2) {
        this.payload = payload;
        this.code = str;
        this.link = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DeeplinkCodeResponse(Payload payload, String str, String str2, int i6, d dVar) {
        this(r0, r1, r2);
        Payload payload2 = (i6 & 1) != 0 ? new Payload(null, null, null, null, null, null, null, null, null, null, null, 2047, null) : payload;
        String str3 = null;
        String str4 = (i6 & 2) != 0 ? null : str;
        if ((i6 & 4) == 0) {
            str3 = str2;
        }
    }
}
