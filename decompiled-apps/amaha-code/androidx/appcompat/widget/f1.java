package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.theinnerhour.b2b.R;
import g0.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: SuggestionsAdapter.java */
/* loaded from: classes.dex */
public final class f1 extends x0.c implements View.OnClickListener {
    public static final /* synthetic */ int R = 0;
    public final SearchView E;
    public final SearchableInfo F;
    public final Context G;
    public final WeakHashMap<String, Drawable.ConstantState> H;
    public final int I;
    public int J;
    public ColorStateList K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;

    /* compiled from: SuggestionsAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1405a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1406b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1407c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1408d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1409e;

        public a(View view) {
            this.f1405a = (TextView) view.findViewById(16908308);
            this.f1406b = (TextView) view.findViewById(16908309);
            this.f1407c = (ImageView) view.findViewById(16908295);
            this.f1408d = (ImageView) view.findViewById(16908296);
            this.f1409e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public f1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.J = 1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.E = searchView;
        this.F = searchableInfo;
        this.I = searchView.getSuggestionCommitIconResId();
        this.G = context;
        this.H = weakHashMap;
    }

    public static String i(int i6, Cursor cursor) {
        if (i6 == -1) {
            return null;
        }
        try {
            return cursor.getString(i6);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b  */
    @Override // x0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, Cursor cursor) {
        int i6;
        int i10;
        int i11;
        ImageView imageView;
        Drawable g5;
        Drawable g10;
        Drawable drawable;
        Drawable.ConstantState constantState;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        a aVar = (a) view.getTag();
        int i12 = this.Q;
        if (i12 != -1) {
            i6 = cursor.getInt(i12);
        } else {
            i6 = 0;
        }
        TextView textView = aVar.f1405a;
        if (textView != null) {
            String i13 = i(this.L, cursor);
            textView.setText(i13);
            if (TextUtils.isEmpty(i13)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.G;
        TextView textView2 = aVar.f1406b;
        if (textView2 != null) {
            String i14 = i(this.N, cursor);
            if (i14 != null) {
                if (this.K == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.K = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(i14);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.K, null), 0, i14.length(), 33);
                str = spannableString;
            } else {
                str = i(this.M, cursor);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = aVar.f1407c;
        if (imageView2 != null) {
            int i15 = this.O;
            if (i15 == -1) {
                g10 = null;
            } else {
                g10 = g(cursor.getString(i15));
                if (g10 == null) {
                    ComponentName searchActivity = this.F.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.H;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState2 = weakHashMap.get(flattenToShortString);
                        if (constantState2 == null) {
                            g10 = null;
                        } else {
                            g10 = constantState2.newDrawable(context.getResources());
                        }
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e10) {
                            Log.w("SuggestionsAdapter", e10.toString());
                        }
                        if (iconResource != 0) {
                            drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder u10 = defpackage.c.u("Invalid icon resource ", iconResource, " for ");
                                u10.append(searchActivity.flattenToShortString());
                                Log.w("SuggestionsAdapter", u10.toString());
                            }
                            if (drawable != null) {
                                constantState = null;
                            } else {
                                constantState = drawable.getConstantState();
                            }
                            weakHashMap.put(flattenToShortString, constantState);
                            g10 = drawable;
                        }
                        drawable = null;
                        if (drawable != null) {
                        }
                        weakHashMap.put(flattenToShortString, constantState);
                        g10 = drawable;
                    }
                    if (g10 == null) {
                        g10 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(g10);
            if (g10 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                g10.setVisible(false, false);
                g10.setVisible(true, false);
            }
        }
        ImageView imageView3 = aVar.f1408d;
        if (imageView3 != null) {
            int i16 = this.P;
            if (i16 == -1) {
                g5 = null;
            } else {
                g5 = g(cursor.getString(i16));
            }
            imageView3.setImageDrawable(g5);
            if (g5 == null) {
                imageView3.setVisibility(8);
            } else {
                imageView3.setVisibility(0);
                g5.setVisible(false, false);
                i10 = 1;
                g5.setVisible(true, false);
                i11 = this.J;
                imageView = aVar.f1409e;
                if (i11 == 2 && (i11 != i10 || (i6 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
        }
        i10 = 1;
        i11 = this.J;
        imageView = aVar.f1409e;
        if (i11 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // x0.a
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.L = cursor.getColumnIndex("suggest_text_1");
                this.M = cursor.getColumnIndex("suggest_text_2");
                this.N = cursor.getColumnIndex("suggest_text_2_url");
                this.O = cursor.getColumnIndex("suggest_icon_1");
                this.P = cursor.getColumnIndex("suggest_icon_2");
                this.Q = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // x0.a
    public final String d(Cursor cursor) {
        String i6;
        String i10;
        if (cursor == null) {
            return null;
        }
        String i11 = i(cursor.getColumnIndex("suggest_intent_query"), cursor);
        if (i11 != null) {
            return i11;
        }
        SearchableInfo searchableInfo = this.F;
        if (searchableInfo.shouldRewriteQueryFromData() && (i10 = i(cursor.getColumnIndex("suggest_intent_data"), cursor)) != null) {
            return i10;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (i6 = i(cursor.getColumnIndex("suggest_text_1"), cursor)) == null) {
            return null;
        }
        return i6;
    }

    @Override // x0.a
    public final View e(ViewGroup viewGroup) {
        View inflate = this.D.inflate(this.B, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.I);
        return inflate;
    }

    public final Drawable f(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.G.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(String str) {
        Drawable newDrawable;
        Drawable newDrawable2;
        WeakHashMap<String, Drawable.ConstantState> weakHashMap = this.H;
        Context context = this.G;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = weakHashMap.get(str2);
                if (constantState == null) {
                    newDrawable2 = null;
                } else {
                    newDrawable2 = constantState.newDrawable();
                }
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Object obj = g0.a.f16164a;
                Drawable b10 = a.c.b(context, parseInt);
                if (b10 != null) {
                    weakHashMap.put(str2, b10.getConstantState());
                }
                return b10;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = weakHashMap.get(str);
                if (constantState2 == null) {
                    newDrawable = null;
                } else {
                    newDrawable = constantState2.newDrawable();
                }
                if (newDrawable != null) {
                    return newDrawable;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e10) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e10.getMessage());
                    if (drawable != null) {
                    }
                    return drawable;
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = f(parse);
                        if (drawable != null) {
                            weakHashMap.put(str, drawable.getConstantState());
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream != null) {
                        Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                        try {
                            openInputStream.close();
                        } catch (IOException e11) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e11);
                        }
                        drawable = createFromStream;
                        if (drawable != null) {
                        }
                    } else {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                }
                Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e10.getMessage());
                if (drawable != null) {
                }
            }
        }
        return drawable;
    }

    @Override // x0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i6, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i6, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.D.inflate(this.C, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f1405a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override // x0.a, android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i6, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View e11 = e(viewGroup);
            ((a) e11.getTag()).f1405a.setText(e10.toString());
            return e11;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.G.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f37446w;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f37446w;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.E.p((CharSequence) tag);
        }
    }
}
