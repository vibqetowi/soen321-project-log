package m5;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import h5.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w5.e0;
/* compiled from: ViewHierarchy.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f24853a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final String f24854b = f.class.getCanonicalName();

    /* renamed from: c  reason: collision with root package name */
    public static WeakReference<View> f24855c = new WeakReference<>(null);

    /* renamed from: d  reason: collision with root package name */
    public static Method f24856d;

    public static final ArrayList a(View view) {
        int childCount;
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i6));
                    if (i10 >= childCount) {
                        break;
                    }
                    i6 = i10;
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:39:0x005e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static final int b(android.view.View r9) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.f.b(android.view.View):int");
    }

    public static final JSONObject c(View view) {
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            i.g(view, "view");
            if (i.b(view.getClass().getName(), "com.facebook.react.ReactRootView")) {
                f24855c = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                m(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                ArrayList a10 = a(view);
                int size = a10.size() - 1;
                if (size >= 0) {
                    int i6 = 0;
                    while (true) {
                        int i10 = i6 + 1;
                        jSONArray.put(c((View) a10.get(i6)));
                        if (i10 > size) {
                            break;
                        }
                        i6 = i10;
                    }
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e10) {
                Log.e(f24854b, "Failed to create JSONObject for view.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }

    public static final View.OnClickListener e(View view) {
        Field declaredField;
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }

    public static final View.OnTouchListener f(View view) {
        Field declaredField;
        try {
            if (b6.a.b(f.class)) {
                return null;
            }
            try {
                try {
                    try {
                        Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                        if (declaredField2 != null) {
                            declaredField2.setAccessible(true);
                        }
                        Object obj = declaredField2.get(view);
                        if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                            return null;
                        }
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(obj);
                        if (obj2 != null) {
                            return (View.OnTouchListener) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                    } catch (ClassNotFoundException unused) {
                        e0 e0Var = e0.f36453a;
                        p pVar = p.f17269a;
                        return null;
                    }
                } catch (NoSuchFieldException unused2) {
                    e0 e0Var2 = e0.f36453a;
                    p pVar2 = p.f17269a;
                    return null;
                }
            } catch (IllegalAccessException unused3) {
                e0 e0Var3 = e0.f36453a;
                p pVar3 = p.f17269a;
                return null;
            }
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }

    public static final String g(View view) {
        CharSequence charSequence;
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else if (view instanceof TextView) {
                charSequence = ((TextView) view).getHint();
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                return "";
            }
            String obj = charSequence.toString();
            if (obj == null) {
                return "";
            }
            return obj;
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }

    public static final ViewGroup h(View view) {
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            return (ViewGroup) parent;
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }

    public static final String i(View view) {
        CharSequence valueOf;
        Object selectedItem;
        String str;
        if (b6.a.b(f.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    if (((Switch) view).isChecked()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    valueOf = str;
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else {
                int i6 = 0;
                if (view instanceof DatePicker) {
                    valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(((DatePicker) view).getYear()), Integer.valueOf(((DatePicker) view).getMonth()), Integer.valueOf(((DatePicker) view).getDayOfMonth())}, 3));
                    i.f(valueOf, "java.lang.String.format(format, *args)");
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    i.f(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    i.f(currentMinute, "view.currentMinute");
                    valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(currentMinute.intValue())}, 2));
                    i.f(valueOf, "java.lang.String.format(format, *args)");
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    if (childCount > 0) {
                        while (true) {
                            int i10 = i6 + 1;
                            View childAt = ((RadioGroup) view).getChildAt(i6);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                valueOf = ((RadioButton) childAt).getText();
                                break;
                            } else if (i10 >= childCount) {
                                break;
                            } else {
                                i6 = i10;
                            }
                        }
                    }
                    valueOf = null;
                } else {
                    if (view instanceof RatingBar) {
                        valueOf = String.valueOf(((RatingBar) view).getRating());
                    }
                    valueOf = null;
                }
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            if (obj == null) {
                return "";
            }
            return obj;
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
            return null;
        }
    }

    public static final void m(View view, JSONObject jSONObject) {
        if (b6.a.b(f.class)) {
            return;
        }
        try {
            i.g(view, "view");
            try {
                String i6 = i(view);
                String g5 = g(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", b(view));
                jSONObject.put("id", view.getId());
                if (!d.b(view)) {
                    jSONObject.put("text", e0.f(e0.K(i6)));
                } else {
                    jSONObject.put("text", "");
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put("hint", e0.f(e0.K(g5)));
                if (tag != null) {
                    jSONObject.put("tag", e0.f(e0.K(tag.toString())));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", e0.f(e0.K(contentDescription.toString())));
                }
                jSONObject.put("dimension", f24853a.d(view));
            } catch (JSONException unused) {
                e0 e0Var = e0.f36453a;
                p pVar = p.f17269a;
            }
        } catch (Throwable th2) {
            b6.a.a(f.class, th2);
        }
    }

    public final JSONObject d(View view) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e10) {
                Log.e(f24854b, "Failed to create JSONObject for dimension.", e10);
            }
            return jSONObject;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final View j(float[] fArr, View view) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            k();
            Method method = f24856d;
            if (method != null && view != null) {
                try {
                    if (method != null) {
                        Object invoke = method.invoke(null, fArr, view);
                        if (invoke != null) {
                            View view2 = (View) invoke;
                            if (view2.getId() > 0) {
                                ViewParent parent = view2.getParent();
                                if (parent != null) {
                                    return (View) parent;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } catch (IllegalAccessException unused) {
                    e0 e0Var = e0.f36453a;
                    p pVar = p.f17269a;
                } catch (InvocationTargetException unused2) {
                    e0 e0Var2 = e0.f36453a;
                    p pVar2 = p.f17269a;
                }
            }
            return null;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final void k() {
        if (b6.a.b(this)) {
            return;
        }
        try {
            if (f24856d != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f24856d = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (ClassNotFoundException unused) {
                e0 e0Var = e0.f36453a;
                p pVar = p.f17269a;
            } catch (NoSuchMethodException unused2) {
                e0 e0Var2 = e0.f36453a;
                p pVar2 = p.f17269a;
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final boolean l(View view, View view2) {
        float[] fArr;
        if (b6.a.b(this)) {
            return false;
        }
        try {
            i.g(view, "view");
            if (!i.b(view.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
                return false;
            }
            if (!b6.a.b(this)) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                fArr = new float[]{iArr[0], iArr[1]};
            } else {
                fArr = null;
            }
            View j10 = j(fArr, view2);
            if (j10 == null) {
                return false;
            }
            if (j10.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return false;
        }
    }
}
