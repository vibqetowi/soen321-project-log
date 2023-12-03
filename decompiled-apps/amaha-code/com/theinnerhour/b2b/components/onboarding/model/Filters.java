package com.theinnerhour.b2b.components.onboarding.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: MatchingResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0019\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR.\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006\""}, d2 = {"Lcom/theinnerhour/b2b/components/onboarding/model/Filters;", "", "key", "", "text", "options", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/onboarding/model/Options;", "Lkotlin/collections/ArrayList;", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getOptions", "()Ljava/util/ArrayList;", "setOptions", "(Ljava/util/ArrayList;)V", "getText", "setText", "getType", "setType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Filters {
    @b("key")
    private String key;
    @b("options")
    private ArrayList<Options> options;
    @b("text")
    private String text;
    @b("type")
    private String type;

    public Filters() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Filters copy$default(Filters filters, String str, String str2, ArrayList arrayList, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = filters.key;
        }
        if ((i6 & 2) != 0) {
            str2 = filters.text;
        }
        if ((i6 & 4) != 0) {
            arrayList = filters.options;
        }
        if ((i6 & 8) != 0) {
            str3 = filters.type;
        }
        return filters.copy(str, str2, arrayList, str3);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.text;
    }

    public final ArrayList<Options> component3() {
        return this.options;
    }

    public final String component4() {
        return this.type;
    }

    public final Filters copy(String str, String str2, ArrayList<Options> options, String str3) {
        i.g(options, "options");
        return new Filters(str, str2, options, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Filters)) {
            return false;
        }
        Filters filters = (Filters) obj;
        if (i.b(this.key, filters.key) && i.b(this.text, filters.text) && i.b(this.options, filters.options) && i.b(this.type, filters.type)) {
            return true;
        }
        return false;
    }

    public final String getKey() {
        return this.key;
    }

    public final ArrayList<Options> getOptions() {
        return this.options;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.key;
        int i6 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.text;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int j10 = c.j(this.options, (i10 + hashCode2) * 31, 31);
        String str3 = this.type;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        return j10 + i6;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setOptions(ArrayList<Options> arrayList) {
        i.g(arrayList, "<set-?>");
        this.options = arrayList;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Filters(key=");
        sb2.append(this.key);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", type=");
        return g.c(sb2, this.type, ')');
    }

    public Filters(String str, String str2, ArrayList<Options> options, String str3) {
        i.g(options, "options");
        this.key = str;
        this.text = str2;
        this.options = options;
        this.type = str3;
    }

    public /* synthetic */ Filters(String str, String str2, ArrayList arrayList, String str3, int i6, d dVar) {
        this((i6 & 1) != 0 ? null : str, (i6 & 2) != 0 ? null : str2, (i6 & 4) != 0 ? new ArrayList() : arrayList, (i6 & 8) != 0 ? null : str3);
    }
}
