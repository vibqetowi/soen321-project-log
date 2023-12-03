package ng;

import android.location.Location;
import gv.n;
import hh.g;
import java.util.Date;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONObject;
import ug.m;
/* compiled from: Properties.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final m f26313a = new m();

    /* renamed from: b  reason: collision with root package name */
    public final String f26314b = "Core_Properties";

    public final void a(Object obj, String attributeName) {
        boolean z10;
        i.g(attributeName, "attributeName");
        if (!n.B0(attributeName) && obj != null) {
            if (!(obj instanceof String) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Boolean) && !(obj instanceof Date) && !(obj instanceof fi.c) && !(obj instanceof JSONArray) && !(obj instanceof JSONObject) && !(obj instanceof Location)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                try {
                    if (!n.B0(attributeName)) {
                        boolean z11 = obj instanceof fi.c;
                        m mVar = this.f26313a;
                        if (z11) {
                            mVar.e(attributeName, (fi.c) obj);
                        } else if (obj instanceof Date) {
                            mVar.b(attributeName, (Date) obj);
                        } else if (obj instanceof Location) {
                            mVar.d(attributeName, (Location) obj);
                        } else {
                            mVar.f(obj, attributeName);
                        }
                    }
                } catch (Exception e10) {
                    hh.a aVar = g.f17610d;
                    g.a.a(1, e10, new b(this));
                }
            }
        }
    }

    public final void b() {
        this.f26313a.f34145c = false;
    }
}
