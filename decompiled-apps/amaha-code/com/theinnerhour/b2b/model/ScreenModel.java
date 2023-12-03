package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.google.firebase.database.IgnoreExtraProperties;
import com.theinnerhour.b2b.utils.LogHelper;
import fe.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: ScreenModel.kt */
@IgnoreExtraProperties
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\"\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bH\u0007Rb\u0010\u0003\u001aJ\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b0\u0004j$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\b`\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Lcom/theinnerhour/b2b/model/ScreenModel;", "Ljava/io/Serializable;", "()V", "attributes", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "getAttributes", "()Ljava/util/ArrayList;", "setAttributes", "(Ljava/util/ArrayList;)V", "result_screen", "", "getResult_screen", "()Z", "setResult_screen", "(Z)V", "show_first", "getShow_first", "setShow_first", "show_logs", "getShow_logs", "setShow_logs", "slug", "getSlug", "()Ljava/lang/String;", "setSlug", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "getParams", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScreenModel implements Serializable {
    private ArrayList<HashMap<String, Object>> attributes = new ArrayList<>();
    private boolean result_screen;
    private boolean show_first;
    private boolean show_logs;
    private String slug;
    private String title;

    public final ArrayList<HashMap<String, Object>> getAttributes() {
        return this.attributes;
    }

    @i
    public final HashMap<String, Object> getParams() {
        String str;
        String str2;
        Object obj;
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<HashMap<String, Object>> it = this.attributes.iterator();
        while (it.hasNext()) {
            HashMap<String, Object> next = it.next();
            try {
                Object obj2 = next.get("label");
                if (obj2 instanceof String) {
                    str2 = (String) obj2;
                } else {
                    str2 = null;
                }
                if (str2 != null && (obj = next.get(str2)) != null) {
                    hashMap.put(str2, obj);
                }
            } catch (Exception e10) {
                LogHelper logHelper = LogHelper.INSTANCE;
                str = ScreenModelKt.TAG;
                logHelper.e(str, "exception in get params", e10);
            }
        }
        return hashMap;
    }

    public final boolean getResult_screen() {
        return this.result_screen;
    }

    public final boolean getShow_first() {
        return this.show_first;
    }

    public final boolean getShow_logs() {
        return this.show_logs;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAttributes(ArrayList<HashMap<String, Object>> arrayList) {
        kotlin.jvm.internal.i.g(arrayList, "<set-?>");
        this.attributes = arrayList;
    }

    public final void setResult_screen(boolean z10) {
        this.result_screen = z10;
    }

    public final void setShow_first(boolean z10) {
        this.show_first = z10;
    }

    public final void setShow_logs(boolean z10) {
        this.show_logs = z10;
    }

    public final void setSlug(String str) {
        this.slug = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
