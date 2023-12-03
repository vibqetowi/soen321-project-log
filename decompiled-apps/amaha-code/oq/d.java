package oq;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import fq.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionHopeGoalSelectionFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq/d;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class d extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<String> f27720u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f27722w;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f27725z = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<String> f27721v = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public String f27723x = "";

    /* renamed from: y  reason: collision with root package name */
    public final String f27724y = LogHelper.INSTANCE.makeLogTag(d.class);

    public final void J() {
        ArrayList<String> arrayList = this.f27720u;
        if (arrayList != null) {
            int size = arrayList.size();
            int i6 = 0;
            while (i6 < size) {
                View inflate = getLayoutInflater().inflate(R.layout.row_screen_a6, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)), false);
                StringBuilder sb2 = new StringBuilder();
                int i10 = i6 + 1;
                sb2.append(i10);
                sb2.append('.');
                ((RobertoTextView) inflate.findViewById(R.id.rowNumber)).setText(sb2.toString());
                RobertoTextView robertoTextView = (RobertoTextView) inflate.findViewById(R.id.rowTitle);
                ArrayList<String> arrayList2 = this.f27720u;
                if (arrayList2 != null) {
                    robertoTextView.setText(arrayList2.get(i6).toString());
                    inflate.setOnClickListener(new to.b(i6, this, inflate));
                    ((LinearLayout) _$_findCachedViewById(R.id.rowItemContainer)).addView(inflate);
                    i6 = i10;
                } else {
                    kotlin.jvm.internal.i.q("options");
                    throw null;
                }
            }
            return;
        }
        kotlin.jvm.internal.i.q("options");
        throw null;
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f27725z;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_a6, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f27725z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            this.f27720u = new ArrayList<>();
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            ScrollView a6ScrollView = (ScrollView) _$_findCachedViewById(R.id.a6ScrollView);
            kotlin.jvm.internal.i.f(a6ScrollView, "a6ScrollView");
            insetsUtils.addStatusBarHeight(a6ScrollView);
            ((RobertoTextView) _$_findCachedViewById(R.id.header)).setText(getString(R.string.depressionHopeGoalSelectionHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.subheader)).setText(getString(R.string.depressionHopeGoalSelectionSubHead));
            ArrayList<String> arrayList = this.f27720u;
            if (arrayList != null) {
                arrayList.add(getString(R.string.depressionHopeGoalSelectionOption1));
                ArrayList<String> arrayList2 = this.f27720u;
                if (arrayList2 != null) {
                    arrayList2.add(getString(R.string.depressionHopeGoalSelectionOption2));
                    ArrayList<String> arrayList3 = this.f27720u;
                    if (arrayList3 != null) {
                        arrayList3.add(getString(R.string.depressionHopeGoalSelectionOption3));
                        ArrayList<String> arrayList4 = this.f27720u;
                        if (arrayList4 != null) {
                            arrayList4.add(getString(R.string.depressionHopeGoalSelectionOption4));
                            ArrayList<String> arrayList5 = this.f27720u;
                            if (arrayList5 != null) {
                                arrayList5.add(getString(R.string.depressionHopeGoalSelectionOption5));
                                ArrayList<String> arrayList6 = this.f27720u;
                                if (arrayList6 != null) {
                                    arrayList6.add(getString(R.string.depressionHopeGoalSelectionOption6));
                                    ArrayList<String> arrayList7 = this.f27720u;
                                    if (arrayList7 != null) {
                                        arrayList7.add(getString(R.string.depressionHopeGoalSelectionOption7));
                                        ArrayList<String> arrayList8 = this.f27720u;
                                        if (arrayList8 != null) {
                                            arrayList8.add(getString(R.string.depressionHopeGoalSelectionOption8));
                                            ((RobertoEditText) _$_findCachedViewById(R.id.otherEdit)).setHint(getString(R.string.depressionHopeGoalSelectionEditTextHint));
                                            ((ScrollView) _$_findCachedViewById(R.id.a6ScrollView)).setOverScrollMode(2);
                                            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
                                            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setEnabled(true);
                                            J();
                                            ((RobertoEditText) _$_findCachedViewById(R.id.otherEdit)).addTextChangedListener(new a());
                                            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setText(getString(R.string.depressionHopeGoalSelectionCTA));
                                            ((RobertoButton) _$_findCachedViewById(R.id.continueCTA)).setOnClickListener(new x(15, this));
                                            return;
                                        }
                                        kotlin.jvm.internal.i.q("options");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.i.q("options");
                                    throw null;
                                }
                                kotlin.jvm.internal.i.q("options");
                                throw null;
                            }
                            kotlin.jvm.internal.i.q("options");
                            throw null;
                        }
                        kotlin.jvm.internal.i.q("options");
                        throw null;
                    }
                    kotlin.jvm.internal.i.q("options");
                    throw null;
                }
                kotlin.jvm.internal.i.q("options");
                throw null;
            }
            kotlin.jvm.internal.i.q("options");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f27724y, e10);
        }
    }

    /* compiled from: DepressionHopeGoalSelectionFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z10;
            d dVar = d.this;
            if (dVar.f27722w) {
                kotlin.jvm.internal.i.d(editable);
                if (gv.r.i1(editable).length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ((RobertoButton) dVar._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
                    return;
                }
                ((RobertoButton) dVar._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                dVar.f27723x = editable.toString();
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            d dVar = d.this;
            if (dVar.f27722w) {
                ((RobertoButton) dVar._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
