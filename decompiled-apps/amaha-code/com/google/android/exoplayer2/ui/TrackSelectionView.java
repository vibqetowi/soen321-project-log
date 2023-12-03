package com.google.android.exoplayer2.ui;

import a9.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.theinnerhour.b2b.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;
import o8.p;
import z8.c;
/* loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* renamed from: u  reason: collision with root package name */
    public final CheckedTextView f7070u;

    /* renamed from: v  reason: collision with root package name */
    public final CheckedTextView f7071v;

    /* renamed from: w  reason: collision with root package name */
    public final SparseArray<c.e> f7072w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f7073x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f7074y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7075z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TrackSelectionView trackSelectionView = TrackSelectionView.this;
            CheckedTextView checkedTextView = trackSelectionView.f7070u;
            SparseArray<c.e> sparseArray = trackSelectionView.f7072w;
            boolean z10 = true;
            CheckedTextView checkedTextView2 = trackSelectionView.f7071v;
            if (view == checkedTextView) {
                trackSelectionView.f7075z = true;
                sparseArray.clear();
            } else if (view == checkedTextView2) {
                trackSelectionView.f7075z = false;
                sparseArray.clear();
            } else {
                trackSelectionView.f7075z = false;
                Object tag = view.getTag();
                tag.getClass();
                b bVar = (b) tag;
                sparseArray.get(0);
                throw null;
            }
            trackSelectionView.f7070u.setChecked(trackSelectionView.f7075z);
            checkedTextView2.setChecked((trackSelectionView.f7075z || sparseArray.size() != 0) ? false : false);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
            throw null;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        this.f7072w = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        a aVar = new a();
        new h(getResources());
        p pVar = p.f27305x;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f7070u = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(aVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.f7071v = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(aVar);
        addView(checkedTextView2);
    }

    public final void a() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 3) {
                removeViewAt(childCount);
            } else {
                this.f7070u.setEnabled(false);
                this.f7071v.setEnabled(false);
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.f7075z;
    }

    public List<c.e> getOverrides() {
        SparseArray<c.e> sparseArray = this.f7072w;
        ArrayList arrayList = new ArrayList(sparseArray.size());
        for (int i6 = 0; i6 < sparseArray.size(); i6++) {
            arrayList.add(sparseArray.valueAt(i6));
        }
        return arrayList;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.f7073x != z10) {
            this.f7073x = z10;
            a();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.f7074y != z10) {
            this.f7074y = z10;
            if (!z10) {
                SparseArray<c.e> sparseArray = this.f7072w;
                if (sparseArray.size() > 1) {
                    for (int size = sparseArray.size() - 1; size > 0; size--) {
                        sparseArray.remove(size);
                    }
                }
            }
            a();
        }
    }

    public void setShowDisableOption(boolean z10) {
        int i6;
        if (z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        this.f7070u.setVisibility(i6);
    }

    public void setTrackNameProvider(j jVar) {
        jVar.getClass();
        a();
    }
}
