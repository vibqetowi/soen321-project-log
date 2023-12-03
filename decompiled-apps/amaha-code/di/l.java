package di;

import org.json.JSONObject;
/* compiled from: JsonBuilder.kt */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12897a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f12898b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(l lVar) {
        this(1, lVar.f12898b);
        this.f12897a = 1;
    }

    public String toString() {
        switch (this.f12897a) {
            case 1:
                return "WidgetProperties('properties':" + this.f12898b + ')';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l() {
        this(0, null);
        this.f12897a = 0;
    }

    public l(int i6, JSONObject properties) {
        this.f12897a = i6;
        if (i6 != 1) {
            this.f12898b = properties == null ? new JSONObject() : properties;
            return;
        }
        kotlin.jvm.internal.i.g(properties, "properties");
        this.f12898b = properties;
    }
}
