package qj;

import org.json.JSONObject;
/* compiled from: Action.kt */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f29610a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f29611b;

    public a(JSONObject payload, String actionType) {
        kotlin.jvm.internal.i.g(actionType, "actionType");
        kotlin.jvm.internal.i.g(payload, "payload");
        this.f29610a = actionType;
        this.f29611b = payload;
    }

    public String toString() {
        return "Action(actionType='" + this.f29610a + "', payload=" + this.f29611b + ')';
    }
}
