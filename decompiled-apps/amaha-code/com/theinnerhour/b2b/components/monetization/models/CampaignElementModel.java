package com.theinnerhour.b2b.components.monetization.models;

import com.appsflyer.R;
import com.google.firebase.database.IgnoreExtraProperties;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
import fe.i;
import fe.p;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: CampaignElementModel.kt */
@IgnoreExtraProperties
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R¶\u0001\u0010\u000b\u001aJ\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\t0\u0006j$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\t`\n2N\u0010\u0005\u001aJ\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\t0\u0006j$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b`\t`\n8G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/theinnerhour/b2b/components/monetization/models/CampaignElementModel;", "Ljava/io/Serializable;", "()V", "TAG", "", "<set-?>", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "attributes", "getAttributes", "()Ljava/util/ArrayList;", "setAttributes", "(Ljava/util/ArrayList;)V", SessionManager.KEY_NAME, "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getParams", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CampaignElementModel implements Serializable {
    private final String TAG = LogHelper.INSTANCE.makeLogTag(CampaignElementModel.class);
    private String name = "";
    private ArrayList<HashMap<String, Object>> attributes = new ArrayList<>();

    @p("attr")
    public final ArrayList<HashMap<String, Object>> getAttributes() {
        return this.attributes;
    }

    public final String getName() {
        return this.name;
    }

    @i
    public final HashMap<String, Object> getParams() {
        HashMap<String, Object> hashMap = new HashMap<>();
        Iterator<HashMap<String, Object>> it = this.attributes.iterator();
        while (it.hasNext()) {
            HashMap<String, Object> next = it.next();
            try {
                Object obj = next.get("label");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                Object obj2 = next.get(next.get("label"));
                kotlin.jvm.internal.i.d(obj2);
                hashMap.put((String) obj, obj2);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.TAG, "exception in get params", e10);
            }
        }
        return hashMap;
    }

    @p("attr")
    public final void setAttributes(ArrayList<HashMap<String, Object>> arrayList) {
        kotlin.jvm.internal.i.g(arrayList, "<set-?>");
        this.attributes = arrayList;
    }

    public final void setName(String str) {
        kotlin.jvm.internal.i.g(str, "<set-?>");
        this.name = str;
    }
}
