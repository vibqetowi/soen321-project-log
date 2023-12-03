package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import t0.d0;
/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements k.b {
    public static final o A0;
    public final SearchAutoComplete J;
    public final View K;
    public final View L;
    public final View M;
    public final ImageView N;
    public final ImageView O;
    public final ImageView P;
    public final ImageView Q;
    public final View R;
    public q S;
    public final Rect T;
    public final Rect U;
    public final int[] V;
    public final int[] W;

    /* renamed from: a0  reason: collision with root package name */
    public final ImageView f1232a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Drawable f1233b0;
    public final int c0;

    /* renamed from: d0  reason: collision with root package name */
    public final int f1234d0;
    public final Intent e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Intent f1235f0;

    /* renamed from: g0  reason: collision with root package name */
    public final CharSequence f1236g0;

    /* renamed from: h0  reason: collision with root package name */
    public View.OnFocusChangeListener f1237h0;

    /* renamed from: i0  reason: collision with root package name */
    public View.OnClickListener f1238i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f1239j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f1240k0;

    /* renamed from: l0  reason: collision with root package name */
    public x0.a f1241l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f1242m0;

    /* renamed from: n0  reason: collision with root package name */
    public CharSequence f1243n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f1244o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f1245p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f1246q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f1247r0;

    /* renamed from: s0  reason: collision with root package name */
    public CharSequence f1248s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f1249t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f1250u0;

    /* renamed from: v0  reason: collision with root package name */
    public SearchableInfo f1251v0;

    /* renamed from: w0  reason: collision with root package name */
    public Bundle f1252w0;

    /* renamed from: x0  reason: collision with root package name */
    public final b f1253x0;

    /* renamed from: y0  reason: collision with root package name */
    public final c f1254y0;

    /* renamed from: z0  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1255z0;

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            SearchView.this.s();
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x0.a aVar = SearchView.this.f1241l0;
            if (aVar instanceof f1) {
                aVar.c(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1237h0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            int i17;
            int i18;
            SearchView searchView = SearchView.this;
            View view2 = searchView.R;
            if (view2.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.L.getPaddingLeft();
                Rect rect = new Rect();
                boolean a10 = u1.a(searchView);
                if (searchView.f1239j0) {
                    i17 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                } else {
                    i17 = 0;
                }
                SearchAutoComplete searchAutoComplete = searchView.J;
                searchAutoComplete.getDropDownBackground().getPadding(rect);
                if (a10) {
                    i18 = -rect.left;
                } else {
                    i18 = paddingLeft - (rect.left + i17);
                }
                searchAutoComplete.setDropDownHorizontalOffset(i18);
                searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i17) - paddingLeft);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String flattenToShortString;
            SearchView searchView = SearchView.this;
            ImageView imageView = searchView.N;
            SearchAutoComplete searchAutoComplete = searchView.J;
            if (view == imageView) {
                searchView.w(false);
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.f1238i0;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            } else if (view == searchView.P) {
                searchView.m();
            } else if (view == searchView.O) {
                searchView.q();
            } else if (view == searchView.Q) {
                SearchableInfo searchableInfo = searchView.f1251v0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.e0);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                flattenToShortString = null;
                            } else {
                                flattenToShortString = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", flattenToShortString);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.k(searchView.f1235f0, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchAutoComplete) {
                searchView.l();
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnKeyListener {
        public g() {
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i6, KeyEvent keyEvent) {
            boolean z10;
            int length;
            SearchView searchView = SearchView.this;
            if (searchView.f1251v0 == null) {
                return false;
            }
            SearchAutoComplete searchAutoComplete = searchView.J;
            if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                if (searchView.f1251v0 == null || searchView.f1241l0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                    return false;
                }
                if (i6 != 66 && i6 != 84 && i6 != 61) {
                    if (i6 != 21 && i6 != 22) {
                        if (i6 != 19) {
                            return false;
                        }
                        searchAutoComplete.getListSelection();
                        return false;
                    }
                    if (i6 == 21) {
                        length = 0;
                    } else {
                        length = searchAutoComplete.length();
                    }
                    searchAutoComplete.setSelection(length);
                    searchAutoComplete.setListSelection(0);
                    searchAutoComplete.clearListSelection();
                    searchAutoComplete.a();
                } else {
                    searchView.n(searchAutoComplete.getListSelection());
                }
                return true;
            }
            if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i6 != 66) {
                return false;
            }
            view.cancelLongPress();
            searchView.getContext().startActivity(searchView.j("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
            SearchView.this.q();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i6, long j10) {
            SearchView.this.n(i6);
        }
    }

    /* loaded from: classes.dex */
    public static class k {
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        public static void b(SearchAutoComplete searchAutoComplete, int i6) {
            searchAutoComplete.setInputMethodMode(i6);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
    }

    /* loaded from: classes.dex */
    public interface m {
    }

    /* loaded from: classes.dex */
    public interface n {
    }

    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a  reason: collision with root package name */
        public final Method f1269a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f1270b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f1271c;

        public o() {
            this.f1269a = null;
            this.f1270b = null;
            this.f1271c = null;
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1269a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1270b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1271c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    /* loaded from: classes.dex */
    public static class p extends z0.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: w  reason: collision with root package name */
        public boolean f1272w;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<p> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i6) {
                return new p[i6];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }
        }

        public p(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1272w + "}";
        }

        @Override // z0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i6) {
            parcel.writeParcelable(this.f39113u, i6);
            parcel.writeValue(Boolean.valueOf(this.f1272w));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1272w = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public static class q extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f1273a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1274b;

        /* renamed from: c  reason: collision with root package name */
        public final Rect f1275c;

        /* renamed from: d  reason: collision with root package name */
        public final Rect f1276d;

        /* renamed from: e  reason: collision with root package name */
        public final int f1277e;
        public boolean f;

        public q(Rect rect, Rect rect2, SearchAutoComplete searchAutoComplete) {
            super(rect, searchAutoComplete);
            int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
            this.f1277e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.f1274b = rect3;
            Rect rect4 = new Rect();
            this.f1276d = rect4;
            Rect rect5 = new Rect();
            this.f1275c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i6 = -scaledTouchSlop;
            rect4.inset(i6, i6);
            rect5.set(rect2);
            this.f1273a = searchAutoComplete;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z11 = this.f;
                        this.f = false;
                    }
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f;
                    if (z11 && !this.f1276d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                }
                z12 = z11;
                z10 = true;
            } else {
                if (this.f1274b.contains(x10, y10)) {
                    this.f = true;
                    z10 = true;
                }
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            Rect rect = this.f1275c;
            View view = this.f1273a;
            if (z10 && !rect.contains(x10, y10)) {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            } else {
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        o oVar;
        if (Build.VERSION.SDK_INT < 29) {
            oVar = new o();
        } else {
            oVar = null;
        }
        A0 = oVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.J;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1245p0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.J;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1245p0 = false;
    }

    public int getImeOptions() {
        return this.J.getImeOptions();
    }

    public int getInputType() {
        return this.J.getInputType();
    }

    public int getMaxWidth() {
        return this.f1246q0;
    }

    public CharSequence getQuery() {
        return this.J.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1243n0;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f1251v0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f1251v0.getHintId());
            }
            return this.f1236g0;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.f1234d0;
    }

    public int getSuggestionRowLayout() {
        return this.c0;
    }

    public x0.a getSuggestionsAdapter() {
        return this.f1241l0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1248s0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1252w0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1251v0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i6;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1252w0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i6 = searchableInfo.getVoiceMaxResults();
        } else {
            i6 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i6);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i6 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.J;
        if (i6 >= 29) {
            k.a(searchAutoComplete);
            return;
        }
        o oVar = A0;
        oVar.getClass();
        o.a();
        Method method = oVar.f1269a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        oVar.getClass();
        o.a();
        Method method2 = oVar.f1270b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.J;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.f1239j0) {
                clearFocus();
                w(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    public final void n(int i6) {
        int i10;
        Uri parse;
        String i11;
        Cursor cursor = this.f1241l0.f37446w;
        if (cursor != null && cursor.moveToPosition(i6)) {
            Intent intent = null;
            try {
                int i12 = f1.R;
                String i13 = f1.i(cursor.getColumnIndex("suggest_intent_action"), cursor);
                if (i13 == null) {
                    i13 = this.f1251v0.getSuggestIntentAction();
                }
                if (i13 == null) {
                    i13 = "android.intent.action.SEARCH";
                }
                String i14 = f1.i(cursor.getColumnIndex("suggest_intent_data"), cursor);
                if (i14 == null) {
                    i14 = this.f1251v0.getSuggestIntentData();
                }
                if (i14 != null && (i11 = f1.i(cursor.getColumnIndex("suggest_intent_data_id"), cursor)) != null) {
                    i14 = i14 + "/" + Uri.encode(i11);
                }
                if (i14 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(i14);
                }
                intent = j(i13, parse, f1.i(cursor.getColumnIndex("suggest_intent_extra_data"), cursor), f1.i(cursor.getColumnIndex("suggest_intent_query"), cursor));
            } catch (RuntimeException e10) {
                try {
                    i10 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i10 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i10 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.J;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i6) {
        Editable text = this.J.getText();
        Cursor cursor = this.f1241l0.f37446w;
        if (cursor != null) {
            if (cursor.moveToPosition(i6)) {
                String d10 = this.f1241l0.d(cursor);
                if (d10 != null) {
                    setQuery(d10);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    @Override // k.b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.J;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f1248s0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.f1250u0);
        this.f1249t0 = false;
    }

    @Override // k.b
    public final void onActionViewExpanded() {
        if (this.f1249t0) {
            return;
        }
        this.f1249t0 = true;
        SearchAutoComplete searchAutoComplete = this.J;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f1250u0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1253x0);
        post(this.f1254y0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.J;
            int[] iArr = this.V;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.W;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            Rect rect = this.T;
            rect.set(i14, i13, searchAutoComplete.getWidth() + i14, searchAutoComplete.getHeight() + i13);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.U;
            rect2.set(i15, 0, i16, i17);
            q qVar = this.S;
            if (qVar == null) {
                q qVar2 = new q(rect2, rect, searchAutoComplete);
                this.S = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.f1274b.set(rect2);
            Rect rect3 = qVar.f1276d;
            rect3.set(rect2);
            int i18 = -qVar.f1277e;
            rect3.inset(i18, i18);
            qVar.f1275c.set(rect);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i6, int i10) {
        int i11;
        if (this.f1240k0) {
            super.onMeasure(i6, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i11 = this.f1246q0) > 0) {
                    size = Math.min(i11, size);
                }
            } else {
                size = this.f1246q0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i12 = this.f1246q0;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.f39113u);
        w(pVar.f1272w);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f1272w = this.f1240k0;
        return pVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f1253x0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.J;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1251v0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        int[] iArr;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.J.getText());
        int i6 = 0;
        if (!z11 && (!this.f1239j0 || this.f1249t0)) {
            z10 = false;
        }
        if (!z10) {
            i6 = 8;
        }
        ImageView imageView = this.P;
        imageView.setVisibility(i6);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z11) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i6, Rect rect) {
        if (this.f1245p0 || !isFocusable()) {
            return false;
        }
        if (!this.f1240k0) {
            boolean requestFocus = this.J.requestFocus(i6, rect);
            if (requestFocus) {
                w(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i6, rect);
    }

    public final void s() {
        int[] iArr;
        if (this.J.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.L.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.M.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1252w0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.J;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1238i0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f1239j0 == z10) {
            return;
        }
        this.f1239j0 = z10;
        w(z10);
        t();
    }

    public void setImeOptions(int i6) {
        this.J.setImeOptions(i6);
    }

    public void setInputType(int i6) {
        this.J.setInputType(i6);
    }

    public void setMaxWidth(int i6) {
        this.f1246q0 = i6;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1237h0 = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1238i0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1243n0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i6;
        this.f1244o0 = z10;
        x0.a aVar = this.f1241l0;
        if (aVar instanceof f1) {
            f1 f1Var = (f1) aVar;
            if (z10) {
                i6 = 2;
            } else {
                i6 = 1;
            }
            f1Var.J = i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i6;
        this.f1251v0 = searchableInfo;
        SearchAutoComplete searchAutoComplete = this.J;
        boolean z10 = true;
        Intent intent = null;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f1251v0.getImeOptions());
            int inputType = this.f1251v0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1251v0.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            searchAutoComplete.setInputType(inputType);
            x0.a aVar = this.f1241l0;
            if (aVar != null) {
                aVar.c(null);
            }
            if (this.f1251v0.getSuggestAuthority() != null) {
                f1 f1Var = new f1(getContext(), this, this.f1251v0, this.f1255z0);
                this.f1241l0 = f1Var;
                searchAutoComplete.setAdapter(f1Var);
                f1 f1Var2 = (f1) this.f1241l0;
                if (this.f1244o0) {
                    i6 = 2;
                } else {
                    i6 = 1;
                }
                f1Var2.J = i6;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.f1251v0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f1251v0.getVoiceSearchLaunchWebSearch()) {
                intent = this.e0;
            } else if (this.f1251v0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f1235f0;
            }
            if (intent != null) {
            }
        }
        z10 = false;
        this.f1247r0 = z10;
        if (z10) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        w(this.f1240k0);
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f1242m0 = z10;
        w(this.f1240k0);
    }

    public void setSuggestionsAdapter(x0.a aVar) {
        this.f1241l0 = aVar;
        this.J.setAdapter(aVar);
    }

    public final void t() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z10 = this.f1239j0;
        SearchAutoComplete searchAutoComplete = this.J;
        if (z10 && (drawable = this.f1233b0) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        boolean z10;
        int i6 = 0;
        if ((this.f1242m0 || this.f1247r0) && !this.f1240k0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || (this.O.getVisibility() != 0 && this.Q.getVisibility() != 0)) {
            i6 = 8;
        }
        this.M.setVisibility(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
        if (r2.f1247r0 == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(boolean z10) {
        int i6;
        boolean z11;
        boolean z12 = this.f1242m0;
        if (z12) {
            i6 = 0;
            if ((z12 || this.f1247r0) && !this.f1240k0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (hasFocus()) {
                    if (!z10) {
                    }
                    this.O.setVisibility(i6);
                }
            }
        }
        i6 = 8;
        this.O.setVisibility(i6);
    }

    public final void w(boolean z10) {
        int i6;
        int i10;
        int i11;
        this.f1240k0 = z10;
        int i12 = 8;
        if (z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        boolean z11 = !TextUtils.isEmpty(this.J.getText());
        this.N.setVisibility(i6);
        v(z11);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.K.setVisibility(i10);
        ImageView imageView = this.f1232a0;
        if (imageView.getDrawable() != null && !this.f1239j0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        r();
        boolean z12 = !z11;
        if (this.f1247r0 && !this.f1240k0 && z12) {
            this.O.setVisibility(8);
            i12 = 0;
        }
        this.Q.setVisibility(i12);
        u();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.T = new Rect();
        this.U = new Rect();
        this.V = new int[2];
        this.W = new int[2];
        this.f1253x0 = new b();
        this.f1254y0 = new c();
        this.f1255z0 = new WeakHashMap<>();
        f fVar = new f();
        g gVar = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        a aVar = new a();
        int[] iArr = kc.f.T;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        l1 l1Var = new l1(context, obtainStyledAttributes);
        t0.d0.p(this, context, iArr, attributeSet, obtainStyledAttributes, i6);
        LayoutInflater.from(context).inflate(l1Var.i(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.J = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.K = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.L = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.M = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.N = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.O = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.P = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.Q = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f1232a0 = imageView5;
        d0.d.q(findViewById, l1Var.e(18));
        d0.d.q(findViewById2, l1Var.e(23));
        imageView.setImageDrawable(l1Var.e(21));
        imageView2.setImageDrawable(l1Var.e(13));
        imageView3.setImageDrawable(l1Var.e(10));
        imageView4.setImageDrawable(l1Var.e(26));
        imageView5.setImageDrawable(l1Var.e(21));
        this.f1233b0 = l1Var.e(20);
        p1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.c0 = l1Var.i(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.f1234d0 = l1Var.i(11, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(aVar);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(gVar);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(l1Var.a(16, true));
        int d10 = l1Var.d(2, -1);
        if (d10 != -1) {
            setMaxWidth(d10);
        }
        this.f1236g0 = l1Var.k(12);
        this.f1243n0 = l1Var.k(19);
        int h10 = l1Var.h(6, -1);
        if (h10 != -1) {
            setImeOptions(h10);
        }
        int h11 = l1Var.h(5, -1);
        if (h11 != -1) {
            setInputType(h11);
        }
        setFocusable(l1Var.a(1, true));
        l1Var.n();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.e0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1235f0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.R = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        w(this.f1239j0);
        t();
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends androidx.appcompat.widget.d {
        public boolean A;
        public final a B;

        /* renamed from: y  reason: collision with root package name */
        public int f1256y;

        /* renamed from: z  reason: collision with root package name */
        public SearchView f1257z;

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.A) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.A = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.B = new a();
            this.f1256y = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i6 = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i6 >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i6 < 600) {
                if (i6 < 640 || i10 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            o oVar = SearchView.A0;
            oVar.getClass();
            o.a();
            Method method = oVar.f1271c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f1256y > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.A) {
                a aVar = this.B;
                removeCallbacks(aVar);
                post(aVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i6, Rect rect) {
            super.onFocusChanged(z10, i6, rect);
            SearchView searchView = this.f1257z;
            searchView.w(searchView.f1240k0);
            searchView.post(searchView.f1253x0);
            if (searchView.J.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i6, KeyEvent keyEvent) {
            if (i6 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1257z.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i6, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f1257z.hasFocus() && getVisibility() == 0) {
                boolean z11 = true;
                this.A = true;
                Context context = getContext();
                o oVar = SearchView.A0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z11 = false;
                }
                if (z11) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            a aVar = this.B;
            if (!z10) {
                this.A = false;
                removeCallbacks(aVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.A = false;
                removeCallbacks(aVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.A = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f1257z = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i6) {
            super.setThreshold(i6);
            this.f1256y = i6;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    /* loaded from: classes.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.J.getText();
            searchView.f1248s0 = text;
            boolean z10 = !TextUtils.isEmpty(text);
            searchView.v(z10);
            boolean z11 = !z10;
            int i12 = 8;
            if (searchView.f1247r0 && !searchView.f1240k0 && z11) {
                searchView.O.setVisibility(8);
                i12 = 0;
            }
            searchView.Q.setVisibility(i12);
            searchView.r();
            searchView.u();
            charSequence.toString();
            searchView.getClass();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i6, long j10) {
            SearchView.this.o(i6);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public void setOnCloseListener(l lVar) {
    }

    public void setOnQueryTextListener(m mVar) {
    }

    public void setOnSuggestionListener(n nVar) {
    }
}
