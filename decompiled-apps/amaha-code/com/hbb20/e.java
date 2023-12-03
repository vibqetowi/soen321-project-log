package com.hbb20;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import java.lang.reflect.Field;
/* compiled from: CountryCodeDialog.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Field f10153a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f10154b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f10155c;

    /* renamed from: d  reason: collision with root package name */
    public static Dialog f10156d;

    /* renamed from: e  reason: collision with root package name */
    public static Context f10157e;

    static {
        Field field;
        Field field2;
        Field field3;
        boolean z10 = true;
        try {
            field2 = TextView.class.getDeclaredField("mCursorDrawableRes");
            try {
                field2.setAccessible(true);
                field = TextView.class.getDeclaredField("mEditor");
                try {
                    field.setAccessible(true);
                    field3 = field.getType().getDeclaredField("mCursorDrawable");
                    try {
                        field3.setAccessible(true);
                        z10 = false;
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    field3 = null;
                }
            } catch (Exception unused3) {
                field = null;
                field3 = null;
            }
        } catch (Exception unused4) {
            field = null;
            field2 = null;
            field3 = null;
        }
        if (z10) {
            f10153a = null;
            f10154b = null;
            f10155c = null;
            return;
        }
        f10153a = field;
        f10154b = field3;
        f10155c = field2;
    }

    public static void a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(activity);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }
}
