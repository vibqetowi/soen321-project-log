package com.facebook.appevents.suggestedevents;

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
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SuggestedEventViewHierarchy.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u0018\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\nH\u0007R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/suggestedevents/SuggestedEventViewHierarchy;", "", "()V", "blacklistedViews", "", "Ljava/lang/Class;", "Landroid/view/View;", "getAllClickableViews", ViewHierarchyConstants.VIEW_KEY, "getDictionaryOfView", "Lorg/json/JSONObject;", "clickedView", "getTextOfChildren", "", "getTextOfViewRecursively", "hostView", "updateBasicInfo", "", "json", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SuggestedEventViewHierarchy {
    public static final SuggestedEventViewHierarchy INSTANCE = new SuggestedEventViewHierarchy();
    private static final List<Class<? extends View>> blacklistedViews = CollectionsKt.listOf((Object[]) new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});

    private SuggestedEventViewHierarchy() {
    }

    @JvmStatic
    public static final JSONObject getDictionaryOfView(View view, View clickedView) {
        if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put(ViewHierarchyConstants.IS_INTERACTED_KEY, true);
                } catch (JSONException unused) {
                }
            }
            updateBasicInfo(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
            for (View view2 : ViewHierarchy.getChildrenOfView(view)) {
                jSONArray.put(getDictionaryOfView(view2, clickedView));
            }
            jSONObject.put(ViewHierarchyConstants.CHILDREN_VIEW_KEY, jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SuggestedEventViewHierarchy.class);
            return null;
        }
    }

    @JvmStatic
    public static final void updateBasicInfo(View view, JSONObject json) {
        if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
                String textOfView = ViewHierarchy.getTextOfView(view);
                ViewHierarchy viewHierarchy2 = ViewHierarchy.INSTANCE;
                String hintOfView = ViewHierarchy.getHintOfView(view);
                json.put(ViewHierarchyConstants.CLASS_NAME_KEY, view.getClass().getSimpleName());
                ViewHierarchy viewHierarchy3 = ViewHierarchy.INSTANCE;
                json.put(ViewHierarchyConstants.CLASS_TYPE_BITMASK_KEY, ViewHierarchy.getClassTypeBitmask(view));
                boolean z = true;
                if (textOfView.length() > 0) {
                    json.put("text", textOfView);
                }
                if (hintOfView.length() <= 0) {
                    z = false;
                }
                if (z) {
                    json.put(ViewHierarchyConstants.HINT_KEY, hintOfView);
                }
                if (view instanceof EditText) {
                    json.put(ViewHierarchyConstants.INPUT_TYPE_KEY, ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SuggestedEventViewHierarchy.class);
        }
    }

    @JvmStatic
    public static final List<View> getAllClickableViews(View view) {
        if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            ArrayList arrayList = new ArrayList();
            for (Class<? extends View> cls : blacklistedViews) {
                if (cls.isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
            for (View view2 : ViewHierarchy.getChildrenOfView(view)) {
                arrayList.addAll(getAllClickableViews(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SuggestedEventViewHierarchy.class);
            return null;
        }
    }

    @JvmStatic
    public static final String getTextOfViewRecursively(View hostView) {
        if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
            String textOfView = ViewHierarchy.getTextOfView(hostView);
            if (textOfView.length() > 0) {
                return textOfView;
            }
            String join = TextUtils.join(" ", INSTANCE.getTextOfChildren(hostView));
            Intrinsics.checkNotNullExpressionValue(join, "join(\" \", childrenText)");
            return join;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SuggestedEventViewHierarchy.class);
            return null;
        }
    }

    private final List<String> getTextOfChildren(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewHierarchy viewHierarchy = ViewHierarchy.INSTANCE;
            for (View view2 : ViewHierarchy.getChildrenOfView(view)) {
                ViewHierarchy viewHierarchy2 = ViewHierarchy.INSTANCE;
                String textOfView = ViewHierarchy.getTextOfView(view2);
                if (textOfView.length() > 0) {
                    arrayList.add(textOfView);
                }
                arrayList.addAll(getTextOfChildren(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
