package u5;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SuggestedEventViewHierarchy.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f33817a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static final List<Class<? extends View>> f33818b = ca.a.P0(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    public static final ArrayList a(View view) {
        if (b6.a.b(c.class)) {
            return null;
        }
        try {
            i.g(view, "view");
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> cls : f33818b) {
                if (cls.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator it = m5.f.a(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(a((View) it.next()));
            }
            return arrayList;
        } catch (Throwable th2) {
            b6.a.a(c.class, th2);
            return null;
        }
    }

    public static final JSONObject b(View view, View view2) {
        if (b6.a.b(c.class)) {
            return null;
        }
        try {
            i.g(view, "view");
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = m5.f.a(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            b6.a.a(c.class, th2);
            return null;
        }
    }

    public static final String d(View hostView) {
        boolean z10;
        if (b6.a.b(c.class)) {
            return null;
        }
        try {
            i.g(hostView, "hostView");
            String i6 = m5.f.i(hostView);
            if (i6.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return i6;
            }
            String join = TextUtils.join(" ", f33817a.c(hostView));
            i.f(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th2) {
            b6.a.a(c.class, th2);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        boolean z10;
        if (b6.a.b(c.class)) {
            return;
        }
        try {
            i.g(view, "view");
            try {
                String i6 = m5.f.i(view);
                String g5 = m5.f.g(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", m5.f.b(view));
                boolean z11 = false;
                if (i6.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    jSONObject.put("text", i6);
                }
                if (g5.length() > 0) {
                    z11 = true;
                }
                if (z11) {
                    jSONObject.put("hint", g5);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            b6.a.a(c.class, th2);
        }
    }

    public final ArrayList c(View view) {
        boolean z10;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = m5.f.a(view).iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                String i6 = m5.f.i(view2);
                if (i6.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(i6);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }
}
