package androidx.constraintlayout.compose;

import com.facebook.internal.NativeProtocol;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ConstraintLayout.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001c"}, d2 = {"Landroidx/constraintlayout/compose/DesignElement;", "", "id", "", "type", NativeProtocol.WEB_DIALOG_PARAMS, "Ljava/util/HashMap;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getParams", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "getType", "setType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class DesignElement {
    private String id;
    private HashMap<String, String> params;
    private String type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DesignElement copy$default(DesignElement designElement, String str, String str2, HashMap hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = designElement.id;
        }
        if ((i & 2) != 0) {
            str2 = designElement.type;
        }
        if ((i & 4) != 0) {
            hashMap = designElement.params;
        }
        return designElement.copy(str, str2, hashMap);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.type;
    }

    public final HashMap<String, String> component3() {
        return this.params;
    }

    public final DesignElement copy(String id, String type, HashMap<String, String> params) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(params, "params");
        return new DesignElement(id, type, params);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DesignElement) {
            DesignElement designElement = (DesignElement) obj;
            return Intrinsics.areEqual(this.id, designElement.id) && Intrinsics.areEqual(this.type, designElement.type) && Intrinsics.areEqual(this.params, designElement.params);
        }
        return false;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.params.hashCode();
    }

    public String toString() {
        return "DesignElement(id=" + this.id + ", type=" + this.type + ", params=" + this.params + ')';
    }

    public DesignElement(String id, String type, HashMap<String, String> params) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(params, "params");
        this.id = id;
        this.type = type;
        this.params = params;
    }

    public final String getId() {
        return this.id;
    }

    public final HashMap<String, String> getParams() {
        return this.params;
    }

    public final String getType() {
        return this.type;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setParams(HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.params = hashMap;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }
}
