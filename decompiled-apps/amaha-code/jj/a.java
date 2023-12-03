package jj;

import org.json.JSONObject;
/* compiled from: ActionButton.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f22063a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22064b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f22065c;

    public a(String str, String str2, JSONObject jSONObject) {
        this.f22063a = str;
        this.f22064b = str2;
        this.f22065c = jSONObject;
    }

    public final String toString() {
        return "{\n\"title\": \"" + this.f22063a + "\" ,\n \"actionId\": \"" + this.f22064b + "\" ,\n \"action\": " + this.f22065c + ",\n}";
    }
}
